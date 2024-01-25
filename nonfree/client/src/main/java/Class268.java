import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class268 implements Runnable {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!ar;")
	private final Class14 aClass14_50 = new Class14();

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	public Class268() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public void method5853() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5857(new Class2());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!wu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class14 local8 = this.aClass14_50;
			@Pc(38) Class2_Sub36 local38;
			synchronized (this.aClass14_50) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass14_50.method307(); local15 == null; local15 = this.aClass14_50.method307()) {
					try {
						this.aClass14_50.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub36)) {
					return;
				}
				local38 = (Class2_Sub36) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString53).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5667 = local64;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!qq;")
	public Class2_Sub36 method5855(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class2_Sub36 local23 = new Class2_Sub36(arg0);
			this.method5857(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!uj;I)V")
	private void method5857(@OriginalArg(0) Class2 arg0) {
		@Pc(6) Class14 local6 = this.aClass14_50;
		synchronized (this.aClass14_50) {
			this.aClass14_50.method300(arg0);
			this.aClass14_50.notify();
		}
	}
}
