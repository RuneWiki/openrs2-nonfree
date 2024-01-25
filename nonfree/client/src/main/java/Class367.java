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

@OriginalClass("client!vv")
public final class Class367 implements Runnable {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "[Lclient!we;")
	private Class372[] aClass372Array1;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Lclient!jt;")
	private Class159 aClass159_11;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "Z")
	private volatile boolean aBoolean826;

	@OriginalMember(owner = "client!vv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(16) BufferedReader local16 = new BufferedReader(new InputStreamReader((DataInputStream) this.aClass159_11.anObject13));
			@Pc(19) String local19 = local16.readLine();
			@Pc(22) Class281 local22 = Static14.method546();
			while (local19 != null) {
				local22.method7002(local19);
				local19 = local16.readLine();
			}
			@Pc(37) String[] local37 = local22.method7001();
			if (local37.length % 3 != 0) {
				return;
			}
			this.aClass372Array1 = new Class372[local37.length / 3];
			for (@Pc(55) int local55 = 0; local55 < local37.length; local55 += 3) {
				this.aClass372Array1[local55 / 3] = new Class372(local37[local55], local37[local55 + 1], local37[local55 + 2]);
			}
		} catch (@Pc(90) IOException local90) {
		}
		this.aBoolean826 = true;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z")
	public boolean method8470() {
		if (this.aBoolean826) {
			return true;
		}
		if (this.aClass159_11 == null) {
			try {
				@Pc(26) int local26 = Static630.aClass212_18 == Static86.aClass212_19 ? 80 : Static307.aClass358_2.anInt10266 + 7000;
				this.aClass159_11 = Static496.aClass104_4.method3135(new URL("http://" + Static307.aClass358_2.aString107 + ":" + local26 + "/news.ws?game=" + Static8.aClass290_1.anInt8594));
			} catch (@Pc(53) MalformedURLException local53) {
				return true;
			}
		}
		if (this.aClass159_11 == null || this.aClass159_11.anInt5910 == 2) {
			return true;
		} else if (this.aClass159_11.anInt5910 == 1) {
			if (this.aThread7 == null) {
				this.aThread7 = new Thread(this);
				this.aThread7.start();
			}
			return this.aBoolean826;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Lclient!we;")
	public Class372 method8471(@OriginalArg(1) int arg0) {
		return this.aClass372Array1 == null || arg0 < 0 || arg0 >= this.aClass372Array1.length ? null : this.aClass372Array1[arg0];
	}
}
