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

@OriginalClass("client!sr")
public final class Class334 implements Runnable {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread8;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Z")
	private volatile boolean aBoolean689;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "[Lclient!ln;")
	private Class227[] aClass227Array1;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!vn;")
	private Class380 aClass380_7;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)Lclient!ln;")
	public Class227 method7981(@OriginalArg(1) int arg0) {
		return this.aClass227Array1 == null || arg0 < 0 || arg0 >= this.aClass227Array1.length ? null : this.aClass227Array1[arg0];
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Z")
	public boolean method7982() {
		if (this.aBoolean689) {
			return true;
		}
		if (this.aClass380_7 == null) {
			try {
				@Pc(23) int local23 = Static520.aClass352_8 == Static41.aClass352_2 ? 80 : Static601.aClass165_5.anInt4607 + 7000;
				this.aClass380_7 = Static651.aClass122_38.method3355(new URL("http://" + Static601.aClass165_5.aString47 + ":" + local23 + "/news.ws?game=" + Static129.aClass121_1.anInt3555));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass380_7 == null || this.aClass380_7.anInt10067 == 2) {
			return true;
		} else if (this.aClass380_7.anInt10067 == 1) {
			if (this.aThread8 == null) {
				this.aThread8 = new Thread(this);
				this.aThread8.start();
			}
			return this.aBoolean689;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass380_7.anObject25));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class210 local22 = Static470.method7088();
			while (local19 != null) {
				local22.method5006(local19);
				local19 = local16.readLine();
			}
			@Pc(39) String[] local39 = local22.method5004();
			if (local39.length % 3 != 0) {
				return;
			}
			this.aClass227Array1 = new Class227[local39.length / 3];
			for (@Pc(57) int local57 = 0; local57 < local39.length; local57 += 3) {
				this.aClass227Array1[local57 / 3] = new Class227(local39[local57], local39[local57 + 1], local39[local57 + 2]);
			}
		} catch (@Pc(92) IOException local92) {
		}
		this.aBoolean689 = true;
	}
}
