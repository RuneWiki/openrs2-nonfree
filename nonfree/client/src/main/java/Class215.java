import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class215 implements Runnable {

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class215() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!d;)V")
	private void method4965(@OriginalArg(1) Class2 arg0) {
		@Pc(10) Class8 local10 = this.aClass8_37;
		synchronized (this.aClass8_37) {
			this.aClass8_37.method212(arg0);
			this.aClass8_37.notify();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V")
	public void method4966() {
		if (this.aThread4 == null) {
			return;
		}
		this.method4965(new Class2());
		try {
			this.aThread4.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!maa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class8 local8 = this.aClass8_37;
			@Pc(38) Class2_Sub47 local38;
			synchronized (this.aClass8_37) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass8_37.method217(); local15 == null; local15 = this.aClass8_37.method217()) {
					try {
						this.aClass8_37.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub47)) {
					return;
				}
				local38 = (Class2_Sub47) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString98).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt9226 = local64;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vm;")
	public Class2_Sub47 method4968(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub47 local28 = new Class2_Sub47(arg0);
			this.method4965(local28);
			return local28;
		}
	}
}
