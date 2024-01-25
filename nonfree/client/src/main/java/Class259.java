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

@OriginalClass("client!nw")
public final class Class259 implements Runnable {

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
	private volatile boolean aBoolean474;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "[Lclient!kh;")
	private Class195[] aClass195Array1;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "Lclient!th;")
	private Class338 aClass338_9;

	@OriginalMember(owner = "client!nw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass338_9.anObject18));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class52 local22 = Static260.method3889();
			while (local19 != null) {
				local22.method1281(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method1276();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass195Array1 = new Class195[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass195Array1[local55 / 3] = new Class195(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean474 = true;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z")
	public boolean method5661() {
		if (this.aBoolean474) {
			return true;
		}
		if (this.aClass338_9 == null) {
			try {
				@Pc(29) int local29 = Static256.aClass135_4 == Static228.aClass135_3 ? 80 : Static649.aClass275_7.anInt7235 + 7000;
				this.aClass338_9 = Static566.aClass92_6.method1879(new URL("http://" + Static649.aClass275_7.aString91 + ":" + local29 + "/news.ws?game=" + Static227.aClass203_4.anInt5389));
			} catch (@Pc(56) MalformedURLException local56) {
				return true;
			}
		}
		if (this.aClass338_9 == null || this.aClass338_9.anInt9321 == 2) {
			return true;
		} else if (this.aClass338_9.anInt9321 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean474;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)Lclient!kh;")
	public Class195 method5662(@OriginalArg(1) int arg0) {
		return this.aClass195Array1 == null || arg0 < 0 || arg0 >= this.aClass195Array1.length ? null : this.aClass195Array1[arg0];
	}
}
