import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Lclient!mf;")
	private final Class163 aClass163_4 = new Class163();

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class31() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!es;B)V")
	private void method649(@OriginalArg(0) Class10 arg0) {
		@Pc(10) Class163 local10 = this.aClass163_4;
		synchronized (this.aClass163_4) {
			this.aClass163_4.method3613(arg0);
			this.aClass163_4.notify();
		}
	}

	@OriginalMember(owner = "client!bu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class163 local8 = this.aClass163_4;
			@Pc(38) Class10_Sub28 local38;
			synchronized (this.aClass163_4) {
				@Pc(15) Class10 local15;
				for (local15 = this.aClass163_4.method3622(); local15 == null; local15 = this.aClass163_4.method3622()) {
					try {
						this.aClass163_4.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class10_Sub28)) {
					return;
				}
				local38 = (Class10_Sub28) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString48).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4505 = local64;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mg;")
	public Class10_Sub28 method652(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class10_Sub28 local23 = new Class10_Sub28(arg0);
			this.method649(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public void method654() {
		if (this.aThread1 == null) {
			return;
		}
		this.method649(new Class10());
		try {
			this.aThread1.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread1 = null;
	}
}
