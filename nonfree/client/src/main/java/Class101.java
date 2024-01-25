import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class101 implements Runnable {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!rk;")
	private final Class249 aClass249_19 = new Class249();

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class101() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method2726() {
		if (this.aThread2 == null) {
			return;
		}
		this.method2727(new Class2());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!jd;)V")
	private void method2727(@OriginalArg(1) Class2 arg0) {
		@Pc(2) Class249 local2 = this.aClass249_19;
		synchronized (this.aClass249_19) {
			this.aClass249_19.method6523(arg0);
			this.aClass249_19.notify();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)Lclient!wv;")
	public Class2_Sub51 method2730(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub51 local28 = new Class2_Sub51(arg0);
			this.method2727(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class249 local8 = this.aClass249_19;
			@Pc(38) Class2_Sub51 local38;
			synchronized (this.aClass249_19) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass249_19.method6529(); local15 == null; local15 = this.aClass249_19.method6529()) {
					try {
						this.aClass249_19.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub51)) {
					return;
				}
				local38 = (Class2_Sub51) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString215).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt9385 = local64;
		}
	}
}
