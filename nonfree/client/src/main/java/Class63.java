import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class63 implements Runnable {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!ar;")
	private final Class14 aClass14_5 = new Class14();

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class63() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!fb;)V")
	private void method1308(@OriginalArg(1) Class1 arg0) {
		@Pc(2) Class14 local2 = this.aClass14_5;
		synchronized (this.aClass14_5) {
			this.aClass14_5.method300(arg0);
			this.aClass14_5.notify();
		}
	}

	@OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class14 local8 = this.aClass14_5;
			@Pc(38) Class1_Sub34 local38;
			synchronized (this.aClass14_5) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass14_5.method310(); local15 == null; local15 = this.aClass14_5.method310()) {
					try {
						this.aClass14_5.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub34)) {
					return;
				}
				local38 = (Class1_Sub34) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString176).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4693 = local64;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public void method1310() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1308(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!oq;")
	public Class1_Sub34 method1311(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub34 local23 = new Class1_Sub34(arg0);
			this.method1308(local23);
			return local23;
		}
	}
}
