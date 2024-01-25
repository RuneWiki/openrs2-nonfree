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

@OriginalClass("client!bea")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "Z")
	private volatile boolean aBoolean58;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "[Lclient!in;")
	private Class176[] aClass176Array1;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "Lclient!ke;")
	private Class201 aClass201_2;

	@OriginalMember(owner = "client!bea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass201_2.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class92 local22 = Static666.method8869();
			while (local19 != null) {
				local22.method2398(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method2395();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass176Array1 = new Class176[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass176Array1[local57 / 3] = new Class176(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(92) IOException local92) {
		}
		this.aBoolean58 = true;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)Z")
	public boolean method601() {
		if (this.aBoolean58) {
			return true;
		}
		if (this.aClass201_2 == null) {
			try {
				@Pc(24) int local24 = Static364.aClass371_4 == Static487.aClass371_7 ? 80 : Static87.aClass314_2.anInt9072 + 7000;
				this.aClass201_2 = Static310.aClass47_4.method940(new URL("http://" + Static87.aClass314_2.aString117 + ":" + local24 + "/news.ws?game=" + Static667.aClass169_8.anInt4889));
			} catch (@Pc(55) MalformedURLException local55) {
				return true;
			}
		}
		if (this.aClass201_2 == null || this.aClass201_2.anInt5729 == 2) {
			return true;
		} else if (this.aClass201_2.anInt5729 == 1) {
			if (this.aThread1 == null) {
				this.aThread1 = new Thread(this);
				this.aThread1.start();
			}
			return this.aBoolean58;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lclient!in;")
	public Class176 method603(@OriginalArg(1) int arg0) {
		return this.aClass176Array1 == null || arg0 < 0 || this.aClass176Array1.length <= arg0 ? null : this.aClass176Array1[arg0];
	}
}
