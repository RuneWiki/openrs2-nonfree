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

@OriginalClass("client!ct")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "[Lclient!oda;")
	private Class224[] aClass224Array1;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
	private volatile boolean aBoolean76;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "Lclient!rp;")
	private Class278 aClass278_3;

	@OriginalMember(owner = "client!ct", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass278_3.anObject24));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class64 local22 = Static106.method1733();
			while (local19 != null) {
				local22.method1319(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method1313();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass224Array1 = new Class224[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass224Array1[local52 / 3] = new Class224(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z")
	public boolean method949() {
		if (this.aBoolean76) {
			return true;
		}
		if (this.aClass278_3 == null) {
			try {
				@Pc(22) int local22 = Static192.aClass287_3 == Static376.aClass287_6 ? 80 : Static95.aClass147_1.anInt3691 + 7000;
				this.aClass278_3 = Static152.aClass57_4.method917(new URL("http://" + Static95.aClass147_1.aString55 + ":" + local22 + "/news.ws?game=" + Static57.aClass314_1.anInt8647));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass278_3 == null || this.aClass278_3.anInt7757 == 2) {
			return true;
		} else if (this.aClass278_3.anInt7757 == 1) {
			if (this.aThread3 == null) {
				this.aThread3 = new Thread(this);
				this.aThread3.start();
			}
			return this.aBoolean76;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Lclient!oda;")
	public Class224 method951(@OriginalArg(0) int arg0) {
		return this.aClass224Array1 == null || arg0 < 0 || this.aClass224Array1.length <= arg0 ? null : this.aClass224Array1[arg0];
	}
}
