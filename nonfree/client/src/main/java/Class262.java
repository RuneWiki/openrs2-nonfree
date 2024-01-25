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

@OriginalClass("client!pia")
public final class Class262 implements Runnable {

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "Z")
	private volatile boolean aBoolean673;

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "Lclient!wp;")
	private Class376 aClass376_30;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "[Lclient!ph;")
	private Class261[] aClass261Array1;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)Lclient!ph;")
	public Class261 method6624(@OriginalArg(0) int arg0) {
		return this.aClass261Array1 == null || arg0 < 0 || arg0 >= this.aClass261Array1.length ? null : this.aClass261Array1[arg0];
	}

	@OriginalMember(owner = "client!pia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass376_30.anObject19));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class100 local22 = Static315.method5366();
			while (local19 != null) {
				local22.method3331(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method3334();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass261Array1 = new Class261[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass261Array1[local55 / 3] = new Class261(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean673 = true;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Z")
	public boolean method6625() {
		if (this.aBoolean673) {
			return true;
		}
		if (this.aClass376_30 == null) {
			try {
				@Pc(22) int local22 = Static85.aClass107_2 == Static624.aClass107_7 ? 80 : Static300.aClass278_2.anInt8394 + 7000;
				this.aClass376_30 = Static379.aClass228_6.method5945(new URL("http://" + Static300.aClass278_2.aString94 + ":" + local22 + "/news.ws?game=" + Static648.aClass62_16.anInt2526));
			} catch (@Pc(49) MalformedURLException local49) {
				return true;
			}
		}
		if (this.aClass376_30 == null || this.aClass376_30.anInt10510 == 2) {
			return true;
		} else if (this.aClass376_30.anInt10510 == 1) {
			if (this.aThread5 == null) {
				this.aThread5 = new Thread(this);
				this.aThread5.start();
			}
			return this.aBoolean673;
		} else {
			return false;
		}
	}
}
