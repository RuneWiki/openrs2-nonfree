import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class209 implements Runnable {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!dc;")
	private final Class70 aClass70_38 = new Class70();

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class209() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!cc;")
	public Class2_Sub8 method4381(@OriginalArg(0) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class2_Sub8 local23 = new Class2_Sub8(arg0);
			this.method4383(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!du;)V")
	private void method4383(@OriginalArg(1) Class2 arg0) {
		@Pc(6) Class70 local6 = this.aClass70_38;
		synchronized (this.aClass70_38) {
			this.aClass70_38.method1269(arg0);
			this.aClass70_38.notify();
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public void method4385() {
		if (this.aThread6 == null) {
			return;
		}
		this.method4383(new Class2());
		try {
			this.aThread6.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class70 local8 = this.aClass70_38;
			@Pc(38) Class2_Sub8 local38;
			synchronized (this.aClass70_38) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass70_38.method1262(); local15 == null; local15 = this.aClass70_38.method1262()) {
					try {
						this.aClass70_38.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub8)) {
					return;
				}
				local38 = (Class2_Sub8) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString9).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt991 = local64;
		}
	}
}
