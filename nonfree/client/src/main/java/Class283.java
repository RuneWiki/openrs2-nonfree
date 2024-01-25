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

@OriginalClass("client!rea")
public final class Class283 implements Runnable {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "[Lclient!vc;")
	private Class344[] aClass344Array1;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "Lclient!kp;")
	private Class192 aClass192_9;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "Z")
	private volatile boolean aBoolean582;

	@OriginalMember(owner = "client!rea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass192_9.anObject30));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class103 local22 = Static81.method1777();
			while (local19 != null) {
				local22.method2806(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method2801();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass344Array1 = new Class344[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass344Array1[local55 / 3] = new Class344(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lclient!vc;")
	public Class344 method6274(@OriginalArg(0) int arg0) {
		return this.aClass344Array1 == null || arg0 < 0 || arg0 >= this.aClass344Array1.length ? null : this.aClass344Array1[arg0];
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)Z")
	public boolean method6275() {
		if (this.aBoolean582) {
			return true;
		}
		if (this.aClass192_9 == null) {
			try {
				@Pc(21) int local21 = Static555.aClass173_8 == Static559.aClass173_9 ? 80 : Static56.aClass65_1.anInt2279 + 7000;
				this.aClass192_9 = Static409.aClass221_6.method5195(new URL("http://" + Static56.aClass65_1.aString31 + ":" + local21 + "/news.ws?game=" + Static227.aClass211_1.anInt5793));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass192_9 == null || this.aClass192_9.anInt5186 == 2) {
			return true;
		} else if (this.aClass192_9.anInt5186 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean582;
		} else {
			return false;
		}
	}
}
