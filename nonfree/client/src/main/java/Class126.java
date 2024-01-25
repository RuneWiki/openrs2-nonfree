import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class126 implements Runnable {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!ps;")
	private final Class193 aClass193_31 = new Class193();

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class126() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ke", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class193 local8 = this.aClass193_31;
			@Pc(38) Class3_Sub23 local38;
			synchronized (this.aClass193_31) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass193_31.method4521(); local15 == null; local15 = this.aClass193_31.method4521()) {
					try {
						this.aClass193_31.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub23)) {
					return;
				}
				local38 = (Class3_Sub23) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString39).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt3004 = local64;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ie;I)V")
	private void method3158(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class193 local2 = this.aClass193_31;
		synchronized (this.aClass193_31) {
			this.aClass193_31.method4527(arg0);
			this.aClass193_31.notify();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public void method3159() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3158(new Class3());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/lang/String;)Lclient!hv;")
	public Class3_Sub23 method3160(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class3_Sub23 local29 = new Class3_Sub23(arg0);
			this.method3158(local29);
			return local29;
		}
	}
}
