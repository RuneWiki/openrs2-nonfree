import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!bb;")
	private final Class16 aClass16_20 = new Class16();

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class131() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method3602() {
		if (this.aThread1 == null) {
			return;
		}
		this.method3604(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!pn;Z)V")
	private void method3604(@OriginalArg(0) Class1 arg0) {
		@Pc(2) Class16 local2 = this.aClass16_20;
		synchronized (this.aClass16_20) {
			this.aClass16_20.method416(arg0);
			this.aClass16_20.notify();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!vh;")
	public Class1_Sub39 method3605(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub39 local23 = new Class1_Sub39(arg0);
			this.method3604(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!mb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class16 local8 = this.aClass16_20;
			@Pc(38) Class1_Sub39 local38;
			synchronized (this.aClass16_20) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass16_20.method408(); local15 == null; local15 = this.aClass16_20.method408()) {
					try {
						this.aClass16_20.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub39)) {
					return;
				}
				local38 = (Class1_Sub39) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString62).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6392 = local64;
		}
	}
}
