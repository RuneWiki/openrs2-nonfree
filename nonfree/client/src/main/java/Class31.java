import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Lclient!um;")
	private final Class244 aClass244_6 = new Class244();

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class31() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method911() {
		if (this.aThread1 == null) {
			return;
		}
		this.method913(new Class6());
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)Lclient!qj;")
	public Class6_Sub30 method912(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class6_Sub30 local28 = new Class6_Sub30(arg0);
			this.method913(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!bt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class244 local8 = this.aClass244_6;
			@Pc(38) Class6_Sub30 local38;
			synchronized (this.aClass244_6) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass244_6.method5973(); local15 == null; local15 = this.aClass244_6.method5973()) {
					try {
						this.aClass244_6.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub30)) {
					return;
				}
				local38 = (Class6_Sub30) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString37).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5547 = local64;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!cg;B)V")
	private void method913(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class244 local6 = this.aClass244_6;
		synchronized (this.aClass244_6) {
			this.aClass244_6.method5966(arg0);
			this.aClass244_6.notify();
		}
	}
}
