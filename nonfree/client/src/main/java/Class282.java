import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class282 implements Runnable {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!qia;")
	private final Class276 aClass276_53 = new Class276();

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class282() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Lclient!cha;")
	public Class3_Sub14 method6996(@OriginalArg(1) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub14 local28 = new Class3_Sub14(arg0);
			this.method6998(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
	public void method6997() {
		if (this.aThread6 == null) {
			return;
		}
		this.method6998(new Class3());
		try {
			this.aThread6.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ns;I)V")
	private void method6998(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class276 local2 = this.aClass276_53;
		synchronized (this.aClass276_53) {
			this.aClass276_53.method6906(arg0);
			this.aClass276_53.notify();
		}
	}

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class276 local8 = this.aClass276_53;
			@Pc(38) Class3_Sub14 local38;
			synchronized (this.aClass276_53) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass276_53.method6911(); local15 == null; local15 = this.aClass276_53.method6911()) {
					try {
						this.aClass276_53.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub14)) {
					return;
				}
				local38 = (Class3_Sub14) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString11).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1404 = local64;
		}
	}
}
