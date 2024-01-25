import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class358 implements Runnable {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!jia;")
	private final Class193 aClass193_64 = new Class193();

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class358() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!wk;Z)V")
	private void method8040(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class193 local6 = this.aClass193_64;
		synchronized (this.aClass193_64) {
			this.aClass193_64.method4462(arg0);
			this.aClass193_64.notify();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!wu;")
	public Class3_Sub55 method8042(@OriginalArg(0) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub55 local28 = new Class3_Sub55(arg0);
			this.method8040(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public void method8043() {
		if (this.aThread7 == null) {
			return;
		}
		this.method8040(new Class3());
		try {
			this.aThread7.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class193 local8 = this.aClass193_64;
			@Pc(38) Class3_Sub55 local38;
			synchronized (this.aClass193_64) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass193_64.method4452(); local15 == null; local15 = this.aClass193_64.method4452()) {
					try {
						this.aClass193_64.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub55)) {
					return;
				}
				local38 = (Class3_Sub55) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString133).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt10339 = local64;
		}
	}
}
