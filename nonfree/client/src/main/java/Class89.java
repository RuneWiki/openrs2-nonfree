import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class89 implements Runnable {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!cga;")
	private final Class60 aClass60_39 = new Class60();

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class89() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!hh;Z)V")
	private void method1852(@OriginalArg(0) Class2 arg0) {
		@Pc(6) Class60 local6 = this.aClass60_39;
		synchronized (this.aClass60_39) {
			this.aClass60_39.method1233(arg0);
			this.aClass60_39.notify();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fea;")
	public Class2_Sub25 method1854(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class2_Sub25 local31 = new Class2_Sub25(arg0);
			this.method1852(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!dr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class60 local8 = this.aClass60_39;
			@Pc(43) Class2_Sub25 local43;
			synchronized (this.aClass60_39) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass60_39.method1225(); local15 == null; local15 = this.aClass60_39.method1225()) {
					try {
						this.aClass60_39.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class2_Sub25)) {
					return;
				}
				local43 = (Class2_Sub25) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString27).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt2903 = local69;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	public void method1856() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1852(new Class2());
		try {
			this.aThread2.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		this.aThread2 = null;
	}
}
