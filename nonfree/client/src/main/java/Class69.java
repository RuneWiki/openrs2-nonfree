import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "Lclient!oe;")
	private final Class181 aClass181_18 = new Class181();

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class69() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!cf;I)V")
	private void method1874(@OriginalArg(0) Class1 arg0) {
		@Pc(2) Class181 local2 = this.aClass181_18;
		synchronized (this.aClass181_18) {
			this.aClass181_18.method4102(arg0);
			this.aClass181_18.notify();
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sk;")
	public Class1_Sub39 method1878(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class1_Sub39 local28 = new Class1_Sub39(arg0);
			this.method1874(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	public void method1880() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1874(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ev", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class181 local8 = this.aClass181_18;
			@Pc(38) Class1_Sub39 local38;
			synchronized (this.aClass181_18) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass181_18.method4109(); local15 == null; local15 = this.aClass181_18.method4109()) {
					try {
						this.aClass181_18.wait();
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
			local38.anInt6016 = local64;
		}
	}
}
