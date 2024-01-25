import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class133 implements Runnable {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Lclient!aq;")
	private final Class16 aClass16_31 = new Class16();

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class133() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public void method3561() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3565(new Class11());
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)Lclient!rn;")
	public Class11_Sub34 method3562(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class11_Sub34 local23 = new Class11_Sub34(arg0);
			this.method3565(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!pl;)V")
	private void method3565(@OriginalArg(1) Class11 arg0) {
		@Pc(8) Class16 local8 = this.aClass16_31;
		synchronized (this.aClass16_31) {
			this.aClass16_31.method190(arg0);
			this.aClass16_31.notify();
		}
	}

	@OriginalMember(owner = "client!mn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class16 local8 = this.aClass16_31;
			@Pc(38) Class11_Sub34 local38;
			synchronized (this.aClass16_31) {
				@Pc(15) Class11 local15;
				for (local15 = this.aClass16_31.method180(); local15 == null; local15 = this.aClass16_31.method180()) {
					try {
						this.aClass16_31.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class11_Sub34)) {
					return;
				}
				local38 = (Class11_Sub34) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString54).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5507 = local64;
		}
	}
}
