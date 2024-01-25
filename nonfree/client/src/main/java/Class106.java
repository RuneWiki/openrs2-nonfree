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

@OriginalClass("client!fb")
public final class Class106 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Z")
	private volatile boolean aBoolean213;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!iw;")
	private Class177[] aClass177Array1;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!uga;")
	private Class361 aClass361_2;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	public boolean method2626() {
		if (this.aBoolean213) {
			return true;
		}
		if (this.aClass361_2 == null) {
			try {
				@Pc(23) int local23 = Static387.aClass242_8 == Static670.aClass242_7 ? 80 : Static641.aClass258_7.anInt6748 + 7000;
				this.aClass361_2 = Static681.aClass349_6.method7741(new URL("http://" + Static641.aClass258_7.aString78 + ":" + local23 + "/news.ws?game=" + Static536.aClass290_6.anInt7535));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass361_2 == null || this.aClass361_2.anInt9720 == 2) {
			return true;
		} else if (this.aClass361_2.anInt9720 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean213;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass361_2.anObject20));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class83 local22 = Static113.method3805();
			while (local19 != null) {
				local22.method1530(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method1531();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass177Array1 = new Class177[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass177Array1[local57 / 3] = new Class177(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(92) IOException local92) {
		}
		this.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lclient!iw;")
	public Class177 method2627(@OriginalArg(1) int arg0) {
		return this.aClass177Array1 == null || arg0 < 0 || arg0 >= this.aClass177Array1.length ? null : this.aClass177Array1[arg0];
	}
}
