import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!dm;")
	private final Class73 aClass73_16 = new Class73();

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	public void method1596() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1599(new Class12());
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class73 local8 = this.aClass73_16;
			@Pc(38) Class12_Sub37 local38;
			synchronized (this.aClass73_16) {
				@Pc(15) Class12 local15;
				for (local15 = this.aClass73_16.method2008(); local15 == null; local15 = this.aClass73_16.method2008()) {
					try {
						this.aClass73_16.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class12_Sub37)) {
					return;
				}
				local38 = (Class12_Sub37) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString70).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6059 = local64;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!nba;")
	public Class12_Sub37 method1598(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class12_Sub37 local28 = new Class12_Sub37(arg0);
			this.method1599(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ik;)V")
	private void method1599(@OriginalArg(1) Class12 arg0) {
		@Pc(14) Class73 local14 = this.aClass73_16;
		synchronized (this.aClass73_16) {
			this.aClass73_16.method2012(arg0);
			this.aClass73_16.notify();
		}
	}
}
