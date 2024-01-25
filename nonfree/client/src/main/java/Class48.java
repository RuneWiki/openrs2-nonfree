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

@OriginalClass("client!cga")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "Z")
	private volatile boolean aBoolean127;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "Lclient!ba;")
	private Class23 aClass23_4;

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "[Lclient!ab;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)Lclient!ab;")
	public Class4 method1431(@OriginalArg(1) int arg0) {
		return this.aClass4Array1 == null || arg0 < 0 || this.aClass4Array1.length <= arg0 ? null : this.aClass4Array1[arg0];
	}

	@OriginalMember(owner = "client!cga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass23_4.anObject1));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class109 local22 = Static556.method5641();
			while (local19 != null) {
				local22.method2426(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method2428();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass4Array1 = new Class4[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass4Array1[local55 / 3] = new Class4(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)Z")
	public boolean method1435() {
		if (this.aBoolean127) {
			return true;
		}
		if (this.aClass23_4 == null) {
			try {
				@Pc(29) int local29 = Static122.aClass218_4 == Static253.aClass218_6 ? 80 : Static534.aClass174_5.anInt4666 + 7000;
				this.aClass23_4 = Static246.aClass114_10.method2508(new URL("http://" + Static534.aClass174_5.aString46 + ":" + local29 + "/news.ws?game=" + Static275.aClass230_2.anInt6313));
			} catch (@Pc(56) MalformedURLException local56) {
				return true;
			}
		}
		if (this.aClass23_4 == null || this.aClass23_4.anInt875 == 2) {
			return true;
		} else if (this.aClass23_4.anInt875 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean127;
		} else {
			return false;
		}
	}
}
