import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class153 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!wl;")
	private final Class265 aClass265_34 = new Class265();

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class153() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLjava/lang/String;)Lclient!nc;")
	public Class2_Sub29 method3557(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub29 local28 = new Class2_Sub29(arg0);
			this.method3562(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public void method3558() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3562(new Class2());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class265 local8 = this.aClass265_34;
			@Pc(38) Class2_Sub29 local38;
			synchronized (this.aClass265_34) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass265_34.method5995(); local15 == null; local15 = this.aClass265_34.method5995()) {
					try {
						this.aClass265_34.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub29)) {
					return;
				}
				local38 = (Class2_Sub29) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString42).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4816 = local64;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!da;I)V")
	private void method3562(@OriginalArg(0) Class2 arg0) {
		@Pc(10) Class265 local10 = this.aClass265_34;
		synchronized (this.aClass265_34) {
			this.aClass265_34.method5999(arg0);
			this.aClass265_34.notify();
		}
	}
}
