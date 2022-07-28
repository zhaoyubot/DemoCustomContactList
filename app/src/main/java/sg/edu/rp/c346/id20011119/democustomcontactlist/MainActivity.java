package sg.edu.rp.c346.id20011119.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 1234567,'F');
        alContactList.add(item1);
        Contact item2 = new Contact("Ken", 65, 7654321,'M');
        alContactList.add(item2);

        caContact = new CustomAdapter(this,R.layout.row, alContactList);
        lvContact.setAdapter(caContact);

        iv = findViewById(R.id.iv);

        String imageUrl = "https://www.cnet.com/a/img/resize/b4284becc24ed326d590810e7e93ac0d00f71179/2021/10/10/8334fdfa-979b-45df-ab19-cb0b7efd40b6/fbwhitevqamyzn3.jpg?auto=webp&fit=crop&height=675&width=1200";
        Picasso.with(this).load(imageUrl).into(iv);
    }
}