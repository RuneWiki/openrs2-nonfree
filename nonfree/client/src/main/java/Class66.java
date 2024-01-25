import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!tu;")
	private final Class229 aClass229_10 = new Class229();

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!uq;")
	public Class3_Sub43 method1634(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub43 local28 = new Class3_Sub43(arg0);
			this.method1638(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ek", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class229 local8 = this.aClass229_10;
			@Pc(38) Class3_Sub43 local38;
			synchronized (this.aClass229_10) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass229_10.method5331(); local15 == null; local15 = this.aClass229_10.method5331()) {
					try {
						this.aClass229_10.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub43)) {
					return;
				}
				local38 = (Class3_Sub43) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString65).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7106 = local64;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public void method1637() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1638(new Class3());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!lf;)V")
	private void method1638(@OriginalArg(1) Class3 arg0) {
		@Pc(6) Class229 local6 = this.aClass229_10;
		synchronized (this.aClass229_10) {
			this.aClass229_10.method5321(arg0);
			this.aClass229_10.notify();
		}
	}
}
