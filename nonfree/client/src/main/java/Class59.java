import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!jg;")
	private Class174 aClass174_2;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
	private volatile boolean aBoolean116;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "[Lclient!hp;")
	private Class148[] aClass148Array1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass174_2.anObject12));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class69 local22 = Static452.method6691();
			while (local19 != null) {
				local22.method1651(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method1655();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass148Array1 = new Class148[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass148Array1[local52 / 3] = new Class148(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean116 = true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!hp;")
	public Class148 method1342(@OriginalArg(1) int arg0) {
		return this.aClass148Array1 == null || arg0 < 0 || this.aClass148Array1.length <= arg0 ? null : this.aClass148Array1[arg0];
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	public boolean method1343() {
		if (this.aBoolean116) {
			return true;
		}
		if (this.aClass174_2 == null) {
			try {
				@Pc(22) int local22 = Static508.aClass220_11 == Static38.aClass220_2 ? 80 : Static319.aClass157_4.anInt4641 + 7000;
				this.aClass174_2 = Static48.aClass298_12.method7276(new URL("http://" + Static319.aClass157_4.aString34 + ":" + local22 + "/news.ws?game=" + Static431.aClass133_11.anInt3574));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass174_2 == null || this.aClass174_2.anInt5121 == 2) {
			return true;
		} else if (this.aClass174_2.anInt5121 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean116;
		} else {
			return false;
		}
	}
}
