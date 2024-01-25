import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class196 implements Runnable {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!tg;")
	private final Class330 aClass330_24 = new Class330();

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class196() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class330 local8 = this.aClass330_24;
			@Pc(38) Class5_Sub19 local38;
			synchronized (this.aClass330_24) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass330_24.method7911(); local15 == null; local15 = this.aClass330_24.method7911()) {
					try {
						this.aClass330_24.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub19)) {
					return;
				}
				local38 = (Class5_Sub19) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString25).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2183 = local64;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ds;)V")
	private void method4499(@OriginalArg(1) Class5 arg0) {
		@Pc(6) Class330 local6 = this.aClass330_24;
		synchronized (this.aClass330_24) {
			this.aClass330_24.method7917(arg0);
			this.aClass330_24.notify();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ed;")
	public Class5_Sub19 method4500(@OriginalArg(0) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class5_Sub19 local28 = new Class5_Sub19(arg0);
			this.method4499(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public void method4502() {
		if (this.aThread6 == null) {
			return;
		}
		this.method4499(new Class5());
		try {
			this.aThread6.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread6 = null;
	}
}
