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

@OriginalClass("client!bga")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Lclient!eha;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "[Lclient!at;")
	private Class22[] aClass22Array1;

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "Z")
	private volatile boolean aBoolean52;

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)Z")
	public boolean method758() {
		if (this.aBoolean52) {
			return true;
		}
		if (this.aClass91_1 == null) {
			try {
				@Pc(28) int local28 = Static211.aClass15_2 == Static517.aClass15_8 ? 80 : Static481.aClass306_4.anInt8300 + 7000;
				this.aClass91_1 = Static470.aClass100_14.method2088(new URL("http://" + Static481.aClass306_4.aString95 + ":" + local28 + "/news.ws?game=" + Static156.aClass63_2.anInt1655));
			} catch (@Pc(55) MalformedURLException local55) {
				return true;
			}
		}
		if (this.aClass91_1 == null || this.aClass91_1.anInt2271 == 2) {
			return true;
		} else if (this.aClass91_1.anInt2271 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean52;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass91_1.anObject2));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class240 local22 = Static11.method209();
			while (local19 != null) {
				local22.method5337(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5336();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass22Array1 = new Class22[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass22Array1[local52 / 3] = new Class22(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(83) IOException local83) {
		}
		this.aBoolean52 = true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lclient!at;")
	public Class22 method759(@OriginalArg(1) int arg0) {
		return this.aClass22Array1 == null || arg0 < 0 || arg0 >= this.aClass22Array1.length ? null : this.aClass22Array1[arg0];
	}
}
