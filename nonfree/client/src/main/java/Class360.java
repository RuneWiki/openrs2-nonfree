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

@OriginalClass("client!wk")
public final class Class360 implements Runnable {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lclient!os;")
	private Class245[] aClass245Array1;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
	private volatile boolean aBoolean731;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Lclient!bp;")
	private Class39 aClass39_9;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	public boolean method7821() {
		if (this.aBoolean731) {
			return true;
		}
		if (this.aClass39_9 == null) {
			try {
				@Pc(22) int local22 = Static516.aClass272_11 == Static478.aClass272_10 ? 80 : Static318.aClass51_3.anInt1589 + 7000;
				this.aClass39_9 = Static237.aClass258_3.method5894(new URL("http://" + Static318.aClass51_3.aString8 + ":" + local22 + "/news.ws?game=" + Static121.aClass274_1.anInt7264));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass39_9 == null || this.aClass39_9.anInt894 == 2) {
			return true;
		} else if (this.aClass39_9.anInt894 == 1) {
			if (this.aThread7 == null) {
				this.aThread7 = new Thread(this);
				this.aThread7.start();
			}
			return this.aBoolean731;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass39_9.anObject2));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class173 local22 = Static129.method2610();
			while (local19 != null) {
				local22.method4099(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method4097();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass245Array1 = new Class245[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass245Array1[local55 / 3] = new Class245(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean731 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Lclient!os;")
	public Class245 method7823(@OriginalArg(0) int arg0) {
		return this.aClass245Array1 == null || arg0 < 0 || arg0 >= this.aClass245Array1.length ? null : this.aClass245Array1[arg0];
	}
}
