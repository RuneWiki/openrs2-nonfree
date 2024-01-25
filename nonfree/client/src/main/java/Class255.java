import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class255 implements Runnable {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!vr;")
	private final Class258 aClass258_47 = new Class258();

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class255() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!vg;I)V")
	private void method5498(@OriginalArg(0) Class4 arg0) {
		@Pc(7) Class258 local7 = this.aClass258_47;
		synchronized (this.aClass258_47) {
			this.aClass258_47.method5526(arg0);
			this.aClass258_47.notify();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!cb;")
	public Class4_Sub6 method5499(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub6 local23 = new Class4_Sub6(arg0);
			this.method5498(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method5501() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5498(new Class4());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!vn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class258 local8 = this.aClass258_47;
			@Pc(38) Class4_Sub6 local38;
			synchronized (this.aClass258_47) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass258_47.method5530(); local15 == null; local15 = this.aClass258_47.method5530()) {
					try {
						this.aClass258_47.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub6)) {
					return;
				}
				local38 = (Class4_Sub6) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString15).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1312 = local64;
		}
	}
}
