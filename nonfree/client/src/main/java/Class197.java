import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class197 implements Runnable {

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!gw;")
	private final Class91 aClass91_33 = new Class91();

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class197() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!pk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class91 local8 = this.aClass91_33;
			@Pc(38) Class4_Sub23 local38;
			synchronized (this.aClass91_33) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass91_33.method2583(); local15 == null; local15 = this.aClass91_33.method2583()) {
					try {
						this.aClass91_33.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub23)) {
					return;
				}
				local38 = (Class4_Sub23) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString34).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4495 = local64;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!lk;")
	public Class4_Sub23 method4735(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(27) Class4_Sub23 local27 = new Class4_Sub23(arg0);
			this.method4737(local27);
			return local27;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	public void method4736() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4737(new Class4());
		try {
			this.aThread3.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ha;B)V")
	private void method4737(@OriginalArg(0) Class4 arg0) {
		@Pc(11) Class91 local11 = this.aClass91_33;
		synchronized (this.aClass91_33) {
			this.aClass91_33.method2587(arg0);
			this.aClass91_33.notify();
		}
	}
}
