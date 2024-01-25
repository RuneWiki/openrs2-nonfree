import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class101 implements Runnable {

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!vq;")
	private final Class211 aClass211_22 = new Class211();

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class101() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!on;)V")
	private void method2596(@OriginalArg(1) Class6 arg0) {
		@Pc(2) Class211 local2 = this.aClass211_22;
		synchronized (this.aClass211_22) {
			this.aClass211_22.method5585(arg0);
			this.aClass211_22.notify();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fk;")
	public Class6_Sub13 method2598(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class6_Sub13 local23 = new Class6_Sub13(arg0);
			this.method2596(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public void method2599() {
		if (this.aThread2 == null) {
			return;
		}
		this.method2596(new Class6());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!il", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class211 local8 = this.aClass211_22;
			@Pc(38) Class6_Sub13 local38;
			synchronized (this.aClass211_22) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass211_22.method5587(); local15 == null; local15 = this.aClass211_22.method5587()) {
					try {
						this.aClass211_22.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub13)) {
					return;
				}
				local38 = (Class6_Sub13) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString58).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1618 = local64;
		}
	}
}
