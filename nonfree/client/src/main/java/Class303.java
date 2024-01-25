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

@OriginalClass("client!qia")
public final class Class303 implements Runnable {

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "Z")
	private volatile boolean aBoolean602;

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Lclient!pga;")
	private Class281 aClass281_7;

	@OriginalMember(owner = "client!qia", name = "h", descriptor = "[Lclient!st;")
	private Class338[] aClass338Array1;

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!qia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass281_7.anObject17));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class227 local22 = Static648.method8646();
			while (local19 != null) {
				local22.method4848(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method4844();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass338Array1 = new Class338[local37.length / 3];
			for (@Pc(52) int local52 = 0; local52 < local37.length; local52 += 3) {
				this.aClass338Array1[local52 / 3] = new Class338(local37[local52], local37[local52 + 1], local37[local52 + 2]);
			}
		} catch (@Pc(87) IOException local87) {
		}
		this.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
	public boolean method6683() {
		if (this.aBoolean602) {
			return true;
		}
		if (this.aClass281_7 == null) {
			try {
				@Pc(21) int local21 = Static181.aClass60_3 == Static215.aClass60_4 ? 80 : Static375.aClass382_3.anInt10282 + 7000;
				this.aClass281_7 = Static239.aClass207_2.method4568(new URL("http://" + Static375.aClass382_3.aString122 + ":" + local21 + "/news.ws?game=" + Static333.aClass234_5.anInt5621));
			} catch (@Pc(48) MalformedURLException local48) {
				return true;
			}
		}
		if (this.aClass281_7 == null || this.aClass281_7.anInt7338 == 2) {
			return true;
		} else if (this.aClass281_7.anInt7338 == 1) {
			if (this.aThread4 == null) {
				this.aThread4 = new Thread(this);
				this.aThread4.start();
			}
			return this.aBoolean602;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)Lclient!st;")
	public Class338 method6684(@OriginalArg(1) int arg0) {
		return this.aClass338Array1 == null || arg0 < 0 || this.aClass338Array1.length <= arg0 ? null : this.aClass338Array1[arg0];
	}
}
