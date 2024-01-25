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

@OriginalClass("client!up")
public final class Class355 implements Runnable {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!eba;")
	private Class81 aClass81_11;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "Z")
	private volatile boolean aBoolean756;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread8;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "[Lclient!bq;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass81_11.anObject4));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class361 local22 = Static196.method3563();
			while (local19 != null) {
				local22.method8778(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method8776();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass43Array1 = new Class43[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass43Array1[local52 / 3] = new Class43(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean756 = true;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)Lclient!bq;")
	public Class43 method8696(@OriginalArg(1) int arg0) {
		return this.aClass43Array1 == null || arg0 < 0 || arg0 >= this.aClass43Array1.length ? null : this.aClass43Array1[arg0];
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
	public boolean method8697() {
		if (this.aBoolean756) {
			return true;
		}
		if (this.aClass81_11 == null) {
			try {
				@Pc(21) int local21 = Static202.aClass147_5 == Static487.aClass147_8 ? 80 : Static589.aClass342_4.anInt9498 + 7000;
				this.aClass81_11 = Static247.aClass291_1.method7127(new URL("http://" + Static589.aClass342_4.aString113 + ":" + local21 + "/news.ws?game=" + Static55.aClass118_2.anInt3893));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass81_11 == null || this.aClass81_11.anInt2532 == 2) {
			return true;
		} else if (this.aClass81_11.anInt2532 == 1) {
			if (this.aThread8 == null) {
				this.aThread8 = new Thread(this);
				this.aThread8.start();
			}
			return this.aBoolean756;
		} else {
			return false;
		}
	}
}
