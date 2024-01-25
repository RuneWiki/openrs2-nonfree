import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!nt;")
	private final Class238 aClass238_23 = new Class238();

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class99() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!tq;I)V")
	private void method2600(@OriginalArg(0) Class2 arg0) {
		@Pc(11) Class238 local11 = this.aClass238_23;
		synchronized (this.aClass238_23) {
			this.aClass238_23.method5837(arg0);
			this.aClass238_23.notify();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!naa;")
	public Class2_Sub35 method2602(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class2_Sub35 local31 = new Class2_Sub35(arg0);
			this.method2600(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	public void method2604() {
		if (this.aThread2 == null) {
			return;
		}
		this.method2600(new Class2());
		try {
			this.aThread2.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!et", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class238 local8 = this.aClass238_23;
			@Pc(38) Class2_Sub35 local38;
			synchronized (this.aClass238_23) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass238_23.method5832(); local15 == null; local15 = this.aClass238_23.method5832()) {
					try {
						this.aClass238_23.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub35)) {
					return;
				}
				local38 = (Class2_Sub35) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString63).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6568 = local64;
		}
	}
}
