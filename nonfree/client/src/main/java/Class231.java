import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class231 implements Runnable {

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "Lclient!ga;")
	private final Class124 aClass124_64 = new Class124();

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	public Class231() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
	public void method5371() {
		if (this.aThread5 == null) {
			return;
		}
		this.method5372(new Class5());
		try {
			this.aThread5.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!mga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class124 local8 = this.aClass124_64;
			@Pc(38) Class5_Sub33 local38;
			synchronized (this.aClass124_64) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass124_64.method2571(); local15 == null; local15 = this.aClass124_64.method2571()) {
					try {
						this.aClass124_64.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub33)) {
					return;
				}
				local38 = (Class5_Sub33) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString58).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5994 = local64;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!dn;I)V")
	private void method5372(@OriginalArg(0) Class5 arg0) {
		@Pc(10) Class124 local10 = this.aClass124_64;
		synchronized (this.aClass124_64) {
			this.aClass124_64.method2574(arg0);
			this.aClass124_64.notify();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!le;")
	public Class5_Sub33 method5373(@OriginalArg(0) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class5_Sub33 local31 = new Class5_Sub33(arg0);
			this.method5372(local31);
			return local31;
		}
	}
}
