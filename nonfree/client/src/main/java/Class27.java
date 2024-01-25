import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "Lclient!mr;")
	private final Class223 aClass223_5 = new Class223();

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	public Class27() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class223 local8 = this.aClass223_5;
			@Pc(38) Class3_Sub42 local38;
			synchronized (this.aClass223_5) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass223_5.method5872(); local15 == null; local15 = this.aClass223_5.method5872()) {
					try {
						this.aClass223_5.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub42)) {
					return;
				}
				local38 = (Class3_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString82).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7574 = local64;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public void method1256() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1258(new Class3());
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ov;")
	public Class3_Sub42 method1257(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub42 local28 = new Class3_Sub42(arg0);
			this.method1258(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!qm;)V")
	private void method1258(@OriginalArg(1) Class3 arg0) {
		@Pc(6) Class223 local6 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5868(arg0);
			this.aClass223_5.notify();
		}
	}
}
