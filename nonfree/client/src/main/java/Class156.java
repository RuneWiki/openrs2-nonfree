import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class156 implements Runnable {

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!cf;")
	private final Class30 aClass30_30 = new Class30();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class156() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!hf;")
	public Class2_Sub21 method3507(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class2_Sub21 local23 = new Class2_Sub21(arg0);
			this.method3512(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method3509() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3512(new Class2());
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class30 local8 = this.aClass30_30;
			@Pc(38) Class2_Sub21 local38;
			synchronized (this.aClass30_30) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass30_30.method695(); local15 == null; local15 = this.aClass30_30.method695()) {
					try {
						this.aClass30_30.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub21)) {
					return;
				}
				local38 = (Class2_Sub21) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString26).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2612 = local64;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!rs;)V")
	private void method3512(@OriginalArg(1) Class2 arg0) {
		@Pc(6) Class30 local6 = this.aClass30_30;
		synchronized (this.aClass30_30) {
			this.aClass30_30.method685(arg0);
			this.aClass30_30.notify();
		}
	}
}
