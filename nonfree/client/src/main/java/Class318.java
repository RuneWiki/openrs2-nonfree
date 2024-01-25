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

@OriginalClass("client!sp")
public final class Class318 implements Runnable {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
	private volatile boolean aBoolean720;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!tj;")
	private Class330 aClass330_8;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "[Lclient!sv;")
	private Class320[] aClass320Array1;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lclient!sv;")
	public Class320 method7563(@OriginalArg(1) int arg0) {
		return this.aClass320Array1 == null || arg0 < 0 || arg0 >= this.aClass320Array1.length ? null : this.aClass320Array1[arg0];
	}

	@OriginalMember(owner = "client!sp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass330_8.anObject19));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class227 local22 = Static143.method4224();
			while (local19 != null) {
				local22.method5302(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5304();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass320Array1 = new Class320[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass320Array1[local52 / 3] = new Class320(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean720 = true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Z")
	public boolean method7566() {
		if (this.aBoolean720) {
			return true;
		}
		if (this.aClass330_8 == null) {
			try {
				@Pc(21) int local21 = Static363.aClass346_4 == Static34.aClass346_2 ? 80 : Static518.aClass109_4.anInt2756 + 7000;
				this.aClass330_8 = Static214.aClass192_1.method4337(new URL("http://" + Static518.aClass109_4.aString44 + ":" + local21 + "/news.ws?game=" + Static24.aClass235_1.anInt6378));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass330_8 == null || this.aClass330_8.anInt9132 == 2) {
			return true;
		} else if (this.aClass330_8.anInt9132 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean720;
		} else {
			return false;
		}
	}
}
