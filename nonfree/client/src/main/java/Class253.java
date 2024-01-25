import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class253 implements Runnable {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!fha;")
	private final Class109 aClass109_41 = new Class109();

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class253() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method5493() {
		if (this.aThread5 == null) {
			return;
		}
		this.method5494(new Class2());
		try {
			this.aThread5.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!om", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class109 local8 = this.aClass109_41;
			@Pc(38) Class2_Sub32 local38;
			synchronized (this.aClass109_41) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass109_41.method2322(); local15 == null; local15 = this.aClass109_41.method2322()) {
					try {
						this.aClass109_41.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub32)) {
					return;
				}
				local38 = (Class2_Sub32) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString77).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5896 = local64;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!tq;B)V")
	private void method5494(@OriginalArg(0) Class2 arg0) {
		@Pc(6) Class109 local6 = this.aClass109_41;
		synchronized (this.aClass109_41) {
			this.aClass109_41.method2323(arg0);
			this.aClass109_41.notify();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/lang/String;)Lclient!nga;")
	public Class2_Sub32 method5495(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(27) Class2_Sub32 local27 = new Class2_Sub32(arg0);
			this.method5494(local27);
			return local27;
		}
	}
}
