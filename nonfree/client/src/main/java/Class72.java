import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!gca;")
	private final Class111 aClass111_6 = new Class111();

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class72() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!rp;I)V")
	private void method1495(@OriginalArg(0) Class1 arg0) {
		@Pc(12) Class111 local12 = this.aClass111_6;
		synchronized (this.aClass111_6) {
			this.aClass111_6.method2552(arg0);
			this.aClass111_6.notify();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method1496() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1495(new Class1());
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class111 local8 = this.aClass111_6;
			@Pc(38) Class1_Sub46 local38;
			synchronized (this.aClass111_6) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass111_6.method2553(); local15 == null; local15 = this.aClass111_6.method2553()) {
					try {
						this.aClass111_6.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub46)) {
					return;
				}
				local38 = (Class1_Sub46) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString99).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8973 = local64;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!uh;")
	public Class1_Sub46 method1499(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class1_Sub46 local31 = new Class1_Sub46(arg0);
			this.method1495(local31);
			return local31;
		}
	}
}
