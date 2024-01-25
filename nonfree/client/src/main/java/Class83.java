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

@OriginalClass("client!eaa")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lclient!of;")
	private Class240 aClass240_6;

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "[Lclient!wc;")
	private Class368[] aClass368Array1;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Z")
	private volatile boolean aBoolean239;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!eaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass240_6.anObject13));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class40 local22 = Static242.method4501();
			while (local19 != null) {
				local22.method1766(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method1763();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass368Array1 = new Class368[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass368Array1[local55 / 3] = new Class368(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)Lclient!wc;")
	public Class368 method2846(@OriginalArg(1) int arg0) {
		return this.aClass368Array1 == null || arg0 < 0 || this.aClass368Array1.length <= arg0 ? null : this.aClass368Array1[arg0];
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)Z")
	public boolean method2847() {
		if (this.aBoolean239) {
			return true;
		}
		if (this.aClass240_6 == null) {
			try {
				@Pc(22) int local22 = Static193.aClass107_2 == Static448.aClass107_7 ? 80 : Static280.aClass255_3.anInt7912 + 7000;
				this.aClass240_6 = Static268.aClass370_3.method9072(new URL("http://" + Static280.aClass255_3.aString89 + ":" + local22 + "/news.ws?game=" + Static423.aClass316_4.anInt9447));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass240_6 == null || this.aClass240_6.anInt7566 == 2) {
			return true;
		} else if (this.aClass240_6.anInt7566 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean239;
		} else {
			return false;
		}
	}
}
