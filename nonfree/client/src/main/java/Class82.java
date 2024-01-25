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

@OriginalClass("client!eea")
public final class Class82 implements Runnable {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "Z")
	private volatile boolean aBoolean190;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "[Lclient!eq;")
	private Class91[] aClass91Array1;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "Lclient!nga;")
	private Class234 aClass234_2;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
	public boolean method2421() {
		if (this.aBoolean190) {
			return true;
		}
		if (this.aClass234_2 == null) {
			try {
				@Pc(21) int local21 = Static296.aClass145_5 == Static565.aClass145_11 ? 80 : Static387.aClass342_4.anInt9881 + 7000;
				this.aClass234_2 = Static406.aClass354_5.method8218(new URL("http://" + Static387.aClass342_4.aString96 + ":" + local21 + "/news.ws?game=" + Static438.aClass92_4.anInt2751));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass234_2 == null || this.aClass234_2.anInt6717 == 2) {
			return true;
		} else if (this.aClass234_2.anInt6717 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean190;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass234_2.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class7 local22 = Static34.method452();
			while (local19 != null) {
				local22.method143(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method142();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass91Array1 = new Class91[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass91Array1[local55 / 3] = new Class91(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Lclient!eq;")
	public Class91 method2423(@OriginalArg(0) int arg0) {
		return this.aClass91Array1 == null || arg0 < 0 || arg0 >= this.aClass91Array1.length ? null : this.aClass91Array1[arg0];
	}
}
