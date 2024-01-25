import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class340 implements Runnable {

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!ro;")
	private final Class306 aClass306_58 = new Class306();

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
	public Class340() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public void method8131() {
		if (this.aThread7 == null) {
			return;
		}
		this.method8135(new Class5());
		try {
			this.aThread7.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!u;")
	public Class5_Sub44 method8132(@OriginalArg(0) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class5_Sub44 local28 = new Class5_Sub44(arg0);
			this.method8135(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!pb;)V")
	private void method8135(@OriginalArg(1) Class5 arg0) {
		@Pc(6) Class306 local6 = this.aClass306_58;
		synchronized (this.aClass306_58) {
			this.aClass306_58.method7303(arg0);
			this.aClass306_58.notify();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class306 local8 = this.aClass306_58;
			@Pc(38) Class5_Sub44 local38;
			synchronized (this.aClass306_58) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass306_58.method7302(); local15 == null; local15 = this.aClass306_58.method7302()) {
					try {
						this.aClass306_58.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub44)) {
					return;
				}
				local38 = (Class5_Sub44) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString130).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt9280 = local64;
		}
	}
}
