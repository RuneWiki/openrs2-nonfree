import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!mg;")
	private final Class156 aClass156_47 = new Class156();

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class202() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!uj;I)V")
	private void method4385(@OriginalArg(0) Class2 arg0) {
		@Pc(2) Class156 local2 = this.aClass156_47;
		synchronized (this.aClass156_47) {
			this.aClass156_47.method3157(arg0);
			this.aClass156_47.notify();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public void method4386() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4385(new Class2());
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!dp;")
	public Class2_Sub11 method4387(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub11 local28 = new Class2_Sub11(arg0);
			this.method4385(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class156 local8 = this.aClass156_47;
			@Pc(38) Class2_Sub11 local38;
			synchronized (this.aClass156_47) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass156_47.method3152(); local15 == null; local15 = this.aClass156_47.method3152()) {
					try {
						this.aClass156_47.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub11)) {
					return;
				}
				local38 = (Class2_Sub11) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString49).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1499 = local64;
		}
	}
}
