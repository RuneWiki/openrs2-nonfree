import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Lclient!ub;")
	private final Class244 aClass244_6 = new Class244();

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!hn;")
	public Class4_Sub16 method684(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub16 local23 = new Class4_Sub16(arg0);
			this.method685(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!nd;)V")
	private void method685(@OriginalArg(1) Class4 arg0) {
		@Pc(12) Class244 local12 = this.aClass244_6;
		synchronized (this.aClass244_6) {
			this.aClass244_6.method5273(arg0);
			this.aClass244_6.notify();
		}
	}

	@OriginalMember(owner = "client!cj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class244 local8 = this.aClass244_6;
			@Pc(38) Class4_Sub16 local38;
			synchronized (this.aClass244_6) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass244_6.method5268(); local15 == null; local15 = this.aClass244_6.method5268()) {
					try {
						this.aClass244_6.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub16)) {
					return;
				}
				local38 = (Class4_Sub16) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString23).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2822 = local64;
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public void method686() {
		if (this.aThread1 == null) {
			return;
		}
		this.method685(new Class4());
		try {
			this.aThread1.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread1 = null;
	}
}
