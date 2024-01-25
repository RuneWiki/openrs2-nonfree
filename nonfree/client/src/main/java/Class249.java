import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!fca;")
	private final Class114 aClass114_46 = new Class114();

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class249() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public void method5823() {
		if (this.aThread7 == null) {
			return;
		}
		this.method5824(new Class5());
		try {
			this.aThread7.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class114 local8 = this.aClass114_46;
			@Pc(38) Class5_Sub29 local38;
			synchronized (this.aClass114_46) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass114_46.method2813(); local15 == null; local15 = this.aClass114_46.method2813()) {
					try {
						this.aClass114_46.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub29)) {
					return;
				}
				local38 = (Class5_Sub29) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString33).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4567 = local64;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ko;Z)V")
	private void method5824(@OriginalArg(0) Class5 arg0) {
		@Pc(2) Class114 local2 = this.aClass114_46;
		synchronized (this.aClass114_46) {
			this.aClass114_46.method2807(arg0);
			this.aClass114_46.notify();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ie;")
	public Class5_Sub29 method5825(@OriginalArg(1) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class5_Sub29 local23 = new Class5_Sub29(arg0);
			this.method5824(local23);
			return local23;
		}
	}
}
