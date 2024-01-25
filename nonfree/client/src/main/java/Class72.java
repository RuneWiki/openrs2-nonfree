import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!es", name = "j", descriptor = "[I")
	public static final int[] anIntArray187 = new int[32];

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!kr;")
	private final Class138 aClass138_9 = new Class138();

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray187[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class72() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ah;I)V")
	private void method1540(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class138 local2 = this.aClass138_9;
		synchronized (this.aClass138_9) {
			this.aClass138_9.method3053(arg0);
			this.aClass138_9.notify();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public void method1541() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1540(new Class3());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLjava/lang/String;)Lclient!bg;")
	public Class3_Sub2 method1542(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class3_Sub2 local31 = new Class3_Sub2(arg0);
			this.method1540(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!es", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class138 local8 = this.aClass138_9;
			@Pc(38) Class3_Sub2 local38;
			synchronized (this.aClass138_9) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass138_9.method3047(); local15 == null; local15 = this.aClass138_9.method3047()) {
					try {
						this.aClass138_9.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub2)) {
					return;
				}
				local38 = (Class3_Sub2) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString5).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt353 = local64;
		}
	}
}
