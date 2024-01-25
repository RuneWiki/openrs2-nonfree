import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_7 = new Class163();

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class19() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ap", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class163 local8 = this.aClass163_7;
			@Pc(38) Class4_Sub14 local38;
			synchronized (this.aClass163_7) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass163_7.method3644(); local15 == null; local15 = this.aClass163_7.method3644()) {
					try {
						this.aClass163_7.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub14)) {
					return;
				}
				local38 = (Class4_Sub14) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString16).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2029 = local64;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!oq;)V")
	private void method472(@OriginalArg(1) Class4 arg0) {
		@Pc(2) Class163 local2 = this.aClass163_7;
		synchronized (this.aClass163_7) {
			this.aClass163_7.method3646(arg0);
			this.aClass163_7.notify();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	public void method474() {
		if (this.aThread1 == null) {
			return;
		}
		this.method472(new Class4());
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!dia;")
	public Class4_Sub14 method475(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class4_Sub14 local28 = new Class4_Sub14(arg0);
			this.method472(local28);
			return local28;
		}
	}
}
