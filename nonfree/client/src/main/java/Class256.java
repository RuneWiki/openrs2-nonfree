import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class256 implements Runnable {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Lclient!pk;")
	private final Class183 aClass183_49 = new Class183();

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class256() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method5475() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5477(new Class4());
		try {
			this.aThread3.join();
		} catch (@Pc(20) InterruptedException local20) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!vu;)V")
	private void method5477(@OriginalArg(1) Class4 arg0) {
		@Pc(10) Class183 local10 = this.aClass183_49;
		synchronized (this.aClass183_49) {
			this.aClass183_49.method4137(arg0);
			this.aClass183_49.notify();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)Lclient!va;")
	public Class4_Sub42 method5479(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub42 local23 = new Class4_Sub42(arg0);
			this.method5477(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class183 local8 = this.aClass183_49;
			@Pc(38) Class4_Sub42 local38;
			synchronized (this.aClass183_49) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass183_49.method4136(); local15 == null; local15 = this.aClass183_49.method4136()) {
					try {
						this.aClass183_49.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub42)) {
					return;
				}
				local38 = (Class4_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString69).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6883 = local64;
		}
	}
}
