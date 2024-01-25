import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class171 implements Runnable {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!vn;")
	private final Class211 aClass211_33 = new Class211();

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class171() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!qs;)V")
	private void method4586(@OriginalArg(1) Class5 arg0) {
		@Pc(2) Class211 local2 = this.aClass211_33;
		synchronized (this.aClass211_33) {
			this.aClass211_33.method5609(arg0);
			this.aClass211_33.notify();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method4587() {
		if (this.aThread2 == null) {
			return;
		}
		this.method4586(new Class5());
		try {
			this.aThread2.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ce;")
	public Class5_Sub6 method4589(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class5_Sub6 local28 = new Class5_Sub6(arg0);
			this.method4586(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!rb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class211 local8 = this.aClass211_33;
			@Pc(38) Class5_Sub6 local38;
			synchronized (this.aClass211_33) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass211_33.method5596(); local15 == null; local15 = this.aClass211_33.method5596()) {
					try {
						this.aClass211_33.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub6)) {
					return;
				}
				local38 = (Class5_Sub6) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString58).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt925 = local64;
		}
	}
}
