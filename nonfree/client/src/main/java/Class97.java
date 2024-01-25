import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class97 implements Runnable {

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Lclient!bd;")
	private final Class18 aClass18_12 = new Class18();

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class97() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method2756() {
		if (this.aThread3 == null) {
			return;
		}
		this.method2757(new Class14());
		try {
			this.aThread3.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!tf;I)V")
	private void method2757(@OriginalArg(0) Class14 arg0) {
		@Pc(2) Class18 local2 = this.aClass18_12;
		synchronized (this.aClass18_12) {
			this.aClass18_12.method451(arg0);
			this.aClass18_12.notify();
		}
	}

	@OriginalMember(owner = "client!io", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class18 local8 = this.aClass18_12;
			@Pc(38) Class14_Sub30 local38;
			synchronized (this.aClass18_12) {
				@Pc(15) Class14 local15;
				for (local15 = this.aClass18_12.method454(); local15 == null; local15 = this.aClass18_12.method454()) {
					try {
						this.aClass18_12.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class14_Sub30)) {
					return;
				}
				local38 = (Class14_Sub30) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString204).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5459 = local64;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sa;")
	public Class14_Sub30 method2760(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class14_Sub30 local31 = new Class14_Sub30(arg0);
			this.method2757(local31);
			return local31;
		}
	}
}
