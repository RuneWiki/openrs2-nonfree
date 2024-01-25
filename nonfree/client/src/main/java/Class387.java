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

@OriginalClass("client!vka")
public final class Class387 implements Runnable {

	@OriginalMember(owner = "client!vka", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!vka", name = "f", descriptor = "Lclient!hma;")
	private Class163 aClass163_7;

	@OriginalMember(owner = "client!vka", name = "h", descriptor = "Z")
	private volatile boolean aBoolean908;

	@OriginalMember(owner = "client!vka", name = "d", descriptor = "[Lclient!fo;")
	private Class125[] aClass125Array1;

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(I)Z")
	public boolean method9205() {
		if (this.aBoolean908) {
			return true;
		}
		if (this.aClass163_7 == null) {
			try {
				@Pc(33) int local33 = Static229.aClass386_6 == Static661.aClass386_10 ? 80 : Static550.aClass176_4.anInt4157 + 7000;
				this.aClass163_7 = Static135.aClass389_2.method9268(new URL("http://" + Static550.aClass176_4.aString48 + ":" + local33 + "/news.ws?game=" + Static249.aClass150_6.anInt3649));
			} catch (@Pc(64) MalformedURLException local64) {
				return true;
			}
		}
		if (this.aClass163_7 == null || this.aClass163_7.anInt3843 == 2) {
			return true;
		} else if (this.aClass163_7.anInt3843 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean908;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vka", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass163_7.anObject5));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class50 local22 = Static315.method4399();
			while (local19 != null) {
				local22.method1002(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method1000();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass125Array1 = new Class125[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass125Array1[local57 / 3] = new Class125(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(96) IOException local96) {
		}
		this.aBoolean908 = true;
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(II)Lclient!fo;")
	public Class125 method9208(@OriginalArg(0) int arg0) {
		return this.aClass125Array1 == null || arg0 < 0 || this.aClass125Array1.length <= arg0 ? null : this.aClass125Array1[arg0];
	}
}
