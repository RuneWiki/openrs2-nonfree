import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class62 implements Runnable {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!sf;")
	private final Class180 aClass180_12 = new Class180();

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class62() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!nr;)V")
	private void method1681(@OriginalArg(1) Class2 arg0) {
		@Pc(6) Class180 local6 = this.aClass180_12;
		synchronized (this.aClass180_12) {
			this.aClass180_12.method4909(arg0);
			this.aClass180_12.notify();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method1683() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1681(new Class2());
		try {
			this.aThread1.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ep", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class180 local8 = this.aClass180_12;
			@Pc(38) Class2_Sub2 local38;
			synchronized (this.aClass180_12) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass180_12.method4914(); local15 == null; local15 = this.aClass180_12.method4914()) {
					try {
						this.aClass180_12.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub2)) {
					return;
				}
				local38 = (Class2_Sub2) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString1).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt98 = local64;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ae;")
	public Class2_Sub2 method1685(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub2 local28 = new Class2_Sub2(arg0);
			this.method1681(local28);
			return local28;
		}
	}
}
