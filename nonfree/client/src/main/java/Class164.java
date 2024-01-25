import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class164 implements Runnable {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!au;")
	private final Class22 aClass22_24 = new Class22();

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class164() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!tv;I)V")
	private void method3932(@OriginalArg(0) Class4 arg0) {
		@Pc(6) Class22 local6 = this.aClass22_24;
		synchronized (this.aClass22_24) {
			this.aClass22_24.method894(arg0);
			this.aClass22_24.notify();
		}
	}

	@OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class22 local8 = this.aClass22_24;
			@Pc(38) Class4_Sub46 local38;
			synchronized (this.aClass22_24) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass22_24.method896(); local15 == null; local15 = this.aClass22_24.method896()) {
					try {
						this.aClass22_24.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub46)) {
					return;
				}
				local38 = (Class4_Sub46) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString195).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt9249 = local64;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!so;")
	public Class4_Sub46 method3934(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub46 local23 = new Class4_Sub46(arg0);
			this.method3932(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method3935() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3932(new Class4());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}
}
