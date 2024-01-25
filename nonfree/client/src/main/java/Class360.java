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

@OriginalClass("client!vf")
public final class Class360 implements Runnable {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!fg;")
	private Class108 aClass108_9;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Z")
	private volatile boolean aBoolean708;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[Lclient!f;")
	private Class100[] aClass100Array1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lclient!f;")
	public Class100 method8093(@OriginalArg(0) int arg0) {
		return this.aClass100Array1 == null || arg0 < 0 || this.aClass100Array1.length <= arg0 ? null : this.aClass100Array1[arg0];
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z")
	public boolean method8096() {
		if (this.aBoolean708) {
			return true;
		}
		if (this.aClass108_9 == null) {
			try {
				@Pc(21) int local21 = Static162.aClass80_2 == Static252.aClass80_3 ? 80 : Static616.aClass326_11.anInt8758 + 7000;
				this.aClass108_9 = Static452.aClass226_6.method4846(new URL("http://" + Static616.aClass326_11.aString102 + ":" + local21 + "/news.ws?game=" + Static189.aClass375_5.anInt10144));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass108_9 == null || this.aClass108_9.anInt2766 == 2) {
			return true;
		} else if (this.aClass108_9.anInt2766 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean708;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass108_9.anObject6));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class27 local22 = Static435.method2763();
			while (local19 != null) {
				local22.method610(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method609();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass100Array1 = new Class100[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass100Array1[local55 / 3] = new Class100(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(86) IOException local86) {
		}
		this.aBoolean708 = true;
	}
}
