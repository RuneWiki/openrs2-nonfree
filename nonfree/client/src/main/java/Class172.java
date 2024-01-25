import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class172 implements Runnable {

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "Lclient!ft;")
	private final Class88 aClass88_36 = new Class88();

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
	public Class172() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class88 local8 = this.aClass88_36;
			@Pc(38) Class6_Sub22 local38;
			synchronized (this.aClass88_36) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass88_36.method1881(); local15 == null; local15 = this.aClass88_36.method1881()) {
					try {
						this.aClass88_36.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub22)) {
					return;
				}
				local38 = (Class6_Sub22) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString37).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4140 = local64;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ol;I)V")
	private void method3951(@OriginalArg(0) Class6 arg0) {
		@Pc(2) Class88 local2 = this.aClass88_36;
		synchronized (this.aClass88_36) {
			this.aClass88_36.method1878(arg0);
			this.aClass88_36.notify();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public void method3953() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3951(new Class6());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjava/lang/String;)Lclient!mh;")
	public Class6_Sub22 method3956(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class6_Sub22 local31 = new Class6_Sub22(arg0);
			this.method3951(local31);
			return local31;
		}
	}
}
