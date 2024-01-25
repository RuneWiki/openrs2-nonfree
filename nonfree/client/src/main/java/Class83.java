import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!wq;")
	private final Class216 aClass216_24 = new Class216();

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class83() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!qf;)V")
	private void method2505(@OriginalArg(1) Class2 arg0) {
		@Pc(6) Class216 local6 = this.aClass216_24;
		synchronized (this.aClass216_24) {
			this.aClass216_24.method5995(arg0);
			this.aClass216_24.notify();
		}
	}

	@OriginalMember(owner = "client!hi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class216 local8 = this.aClass216_24;
			@Pc(38) Class2_Sub32 local38;
			synchronized (this.aClass216_24) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass216_24.method5999(); local15 == null; local15 = this.aClass216_24.method5999()) {
					try {
						this.aClass216_24.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub32)) {
					return;
				}
				local38 = (Class2_Sub32) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString36).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4261 = local64;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public void method2507() {
		if (this.aThread1 == null) {
			return;
		}
		this.method2505(new Class2());
		try {
			this.aThread1.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!o;")
	public Class2_Sub32 method2508(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class2_Sub32 local29 = new Class2_Sub32(arg0);
			this.method2505(local29);
			return local29;
		}
	}
}
