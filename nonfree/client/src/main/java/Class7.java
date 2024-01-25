import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!bv;")
	private final Class37 aClass37_7 = new Class37();

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	public Class7() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!aea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class37 local8 = this.aClass37_7;
			@Pc(38) Class1_Sub44 local38;
			synchronized (this.aClass37_7) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass37_7.method973(); local15 == null; local15 = this.aClass37_7.method973()) {
					try {
						this.aClass37_7.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub44)) {
					return;
				}
				local38 = (Class1_Sub44) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString73).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7961 = local64;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!tt;")
	public Class1_Sub44 method371(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class1_Sub44 local28 = new Class1_Sub44(arg0);
			this.method373(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!um;)V")
	private void method373(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class37 local6 = this.aClass37_7;
		synchronized (this.aClass37_7) {
			this.aClass37_7.method970(arg0);
			this.aClass37_7.notify();
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	public void method374() {
		if (this.aThread1 == null) {
			return;
		}
		this.method373(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread1 = null;
	}
}
