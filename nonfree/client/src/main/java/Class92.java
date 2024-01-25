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

@OriginalClass("client!eo")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "Lclient!pga;")
	private Class260 aClass260_3;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "[Lclient!nl;")
	private Class239[] aClass239Array1;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Z")
	private volatile boolean aBoolean168;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass260_3.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class364 local22 = Static443.method6123();
			while (local19 != null) {
				local22.method7855(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method7853();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass239Array1 = new Class239[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass239Array1[local52 / 3] = new Class239(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(83) IOException local83) {
		}
		this.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	public boolean method1846() {
		if (this.aBoolean168) {
			return true;
		}
		if (this.aClass260_3 == null) {
			try {
				@Pc(27) int local27 = Static357.aClass308_6 == Static199.aClass308_3 ? 80 : Static330.aClass227_1.anInt5547 + 7000;
				this.aClass260_3 = Static362.aClass109_5.method2173(new URL("http://" + Static330.aClass227_1.aString53 + ":" + local27 + "/news.ws?game=" + Static246.aClass195_2.anInt4912));
			} catch (@Pc(56) MalformedURLException local56) {
				return true;
			}
		}
		if (this.aClass260_3 == null || this.aClass260_3.anInt7041 == 2) {
			return true;
		} else if (this.aClass260_3.anInt7041 == 1) {
			if (this.aThread2 == null) {
				this.aThread2 = new Thread(this);
				this.aThread2.start();
			}
			return this.aBoolean168;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Lclient!nl;")
	public Class239 method1849(@OriginalArg(1) int arg0) {
		return this.aClass239Array1 == null || arg0 < 0 || this.aClass239Array1.length <= arg0 ? null : this.aClass239Array1[arg0];
	}
}
