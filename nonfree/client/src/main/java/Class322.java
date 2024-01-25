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

@OriginalClass("client!ut")
public final class Class322 implements Runnable {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "[Lclient!wfa;")
	private Class345[] aClass345Array1;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
	private volatile boolean aBoolean688;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Lclient!sba;")
	private Class280 aClass280_9;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!ut", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass280_9.anObject16));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class21 local22 = Static493.method7402();
			while (local19 != null) {
				local22.method866(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method873();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass345Array1 = new Class345[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass345Array1[local55 / 3] = new Class345(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lclient!wfa;")
	public Class345 method7661(@OriginalArg(1) int arg0) {
		return this.aClass345Array1 == null || arg0 < 0 || arg0 >= this.aClass345Array1.length ? null : this.aClass345Array1[arg0];
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)Z")
	public boolean method7663() {
		if (this.aBoolean688) {
			return true;
		}
		if (this.aClass280_9 == null) {
			try {
				@Pc(27) int local27 = Static186.aClass123_6 == Static230.aClass123_8 ? 80 : Static580.aClass275_6.anInt7968 + 7000;
				this.aClass280_9 = Static414.aClass246_5.method6144(new URL("http://" + Static580.aClass275_6.aString100 + ":" + local27 + "/news.ws?game=" + Static38.aClass162_1.anInt4926));
			} catch (@Pc(54) MalformedURLException local54) {
				return true;
			}
		}
		if (this.aClass280_9 == null || this.aClass280_9.anInt8467 == 2) {
			return true;
		} else if (this.aClass280_9.anInt8467 == 1) {
			if (this.aThread6 == null) {
				this.aThread6 = new Thread(this);
				this.aThread6.start();
			}
			return this.aBoolean688;
		} else {
			return false;
		}
	}
}
