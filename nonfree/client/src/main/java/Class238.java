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

@OriginalClass("client!mt")
public final class Class238 implements Runnable {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
	private volatile boolean aBoolean544;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lclient!hka;")
	private Class147[] aClass147Array1;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!ot;")
	private Class268 aClass268_7;

	@OriginalMember(owner = "client!mt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass268_7.anObject19));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class82 local22 = Static477.method7615();
			while (local19 != null) {
				local22.method2083(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method2082();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass147Array1 = new Class147[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass147Array1[local52 / 3] = new Class147(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z")
	public boolean method6464() {
		if (this.aBoolean544) {
			return true;
		}
		if (this.aClass268_7 == null) {
			try {
				@Pc(22) int local22 = Static235.aClass37_5 == Static314.aClass37_6 ? 80 : Static609.aClass66_5.anInt1756 + 7000;
				this.aClass268_7 = Static96.aClass48_5.method1321(new URL("http://" + Static609.aClass66_5.aString22 + ":" + local22 + "/news.ws?game=" + Static551.aClass229_15.anInt6908));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass268_7 == null || this.aClass268_7.anInt8008 == 2) {
			return true;
		} else if (this.aClass268_7.anInt8008 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean544;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Lclient!hka;")
	public Class147 method6465(@OriginalArg(1) int arg0) {
		return this.aClass147Array1 == null || arg0 < 0 || arg0 >= this.aClass147Array1.length ? null : this.aClass147Array1[arg0];
	}
}
