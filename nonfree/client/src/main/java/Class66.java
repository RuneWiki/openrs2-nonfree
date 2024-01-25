import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!en", name = "h", descriptor = "Lclient!mk;")
	private final Class130 aClass130_27 = new Class130();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/String;)Lclient!mn;")
	public Class4_Sub29 method1403(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub29 local23 = new Class4_Sub29(arg0);
			this.method1406(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!gl;)V")
	private void method1406(@OriginalArg(1) Class4 arg0) {
		@Pc(6) Class130 local6 = this.aClass130_27;
		synchronized (this.aClass130_27) {
			this.aClass130_27.method3510(arg0);
			this.aClass130_27.notify();
		}
	}

	@OriginalMember(owner = "client!en", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class130 local8 = this.aClass130_27;
			@Pc(38) Class4_Sub29 local38;
			synchronized (this.aClass130_27) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass130_27.method3500(); local15 == null; local15 = this.aClass130_27.method3500()) {
					try {
						this.aClass130_27.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub29)) {
					return;
				}
				local38 = (Class4_Sub29) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString144).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4207 = local64;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	public void method1408() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1406(new Class4());
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread1 = null;
	}
}
