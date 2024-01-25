import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class123 implements Runnable {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!fi;")
	private final Class74 aClass74_26 = new Class74();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class123() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public void method3243() {
		if (this.aThread2 == null) {
			return;
		}
		this.method3246(new Class7());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)Lclient!uq;")
	public Class7_Sub39 method3245(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class7_Sub39 local28 = new Class7_Sub39(arg0);
			this.method3246(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!km", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class74 local8 = this.aClass74_26;
			@Pc(38) Class7_Sub39 local38;
			synchronized (this.aClass74_26) {
				@Pc(15) Class7 local15;
				for (local15 = this.aClass74_26.method1792(); local15 == null; local15 = this.aClass74_26.method1792()) {
					try {
						this.aClass74_26.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class7_Sub39)) {
					return;
				}
				local38 = (Class7_Sub39) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString406).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6210 = local64;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!s;)V")
	private void method3246(@OriginalArg(1) Class7 arg0) {
		@Pc(2) Class74 local2 = this.aClass74_26;
		synchronized (this.aClass74_26) {
			this.aClass74_26.method1802(arg0);
			this.aClass74_26.notify();
		}
	}
}
