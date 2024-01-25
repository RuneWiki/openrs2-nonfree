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

@OriginalClass("client!wda")
public final class Class377 implements Runnable {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
	private volatile boolean aBoolean743;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "[Lclient!oi;")
	private Class257[] aClass257Array1;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!sq;")
	private Class319 aClass319_9;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!wda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass319_9.anObject19));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class226 local22 = Static96.method1920();
			while (local19 != null) {
				local22.method5327(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method5333();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass257Array1 = new Class257[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass257Array1[local52 / 3] = new Class257(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(83) IOException local83) {
		}
		this.aBoolean743 = true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Lclient!oi;")
	public Class257 method8719(@OriginalArg(1) int arg0) {
		return this.aClass257Array1 == null || arg0 < 0 || this.aClass257Array1.length <= arg0 ? null : this.aClass257Array1[arg0];
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Z")
	public boolean method8720() {
		if (this.aBoolean743) {
			return true;
		}
		if (this.aClass319_9 == null) {
			try {
				@Pc(26) int local26 = Static242.aClass373_4 == Static392.aClass373_6 ? 80 : Static412.aClass155_10.anInt4152 + 7000;
				this.aClass319_9 = Static265.aClass286_3.method6582(new URL("http://" + Static412.aClass155_10.aString38 + ":" + local26 + "/news.ws?game=" + Static51.aClass17_2.anInt420));
			} catch (@Pc(53) MalformedURLException local53) {
				return true;
			}
		}
		if (this.aClass319_9 == null || this.aClass319_9.anInt8562 == 2) {
			return true;
		} else if (this.aClass319_9.anInt8562 == 1) {
			if (this.aThread7 == null) {
				this.aThread7 = new Thread(this);
				this.aThread7.start();
			}
			return this.aBoolean743;
		} else {
			return false;
		}
	}
}
