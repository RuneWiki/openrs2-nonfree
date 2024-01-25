import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class348 implements Runnable {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Lclient!gj;")
	private final Class124 aClass124_66 = new Class124();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class348() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ql;")
	public Class4_Sub39 method7772(@OriginalArg(1) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub39 local23 = new Class4_Sub39(arg0);
			this.method7774(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class124 local8 = this.aClass124_66;
			@Pc(38) Class4_Sub39 local38;
			synchronized (this.aClass124_66) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass124_66.method3272(); local15 == null; local15 = this.aClass124_66.method3272()) {
					try {
						this.aClass124_66.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub39)) {
					return;
				}
				local38 = (Class4_Sub39) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString86).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7503 = local64;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!rc;)V")
	private void method7774(@OriginalArg(1) Class4 arg0) {
		@Pc(2) Class124 local2 = this.aClass124_66;
		synchronized (this.aClass124_66) {
			this.aClass124_66.method3275(arg0);
			this.aClass124_66.notify();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	public void method7775() {
		if (this.aThread6 == null) {
			return;
		}
		this.method7774(new Class4());
		try {
			this.aThread6.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread6 = null;
	}
}
