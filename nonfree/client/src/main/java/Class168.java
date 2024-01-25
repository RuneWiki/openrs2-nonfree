import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class168 implements Runnable {

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!ui;")
	private final Class295 aClass295_20 = new Class295();

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class168() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!wda;)V")
	private void method4634(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class295 local6 = this.aClass295_20;
		synchronized (this.aClass295_20) {
			this.aClass295_20.method7533(arg0);
			this.aClass295_20.notify();
		}
	}

	@OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class295 local8 = this.aClass295_20;
			@Pc(38) Class1_Sub16 local38;
			synchronized (this.aClass295_20) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass295_20.method7547(); local15 == null; local15 = this.aClass295_20.method7547()) {
					try {
						this.aClass295_20.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub16)) {
					return;
				}
				local38 = (Class1_Sub16) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString65).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2994 = local64;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!gd;")
	public Class1_Sub16 method4636(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub16 local23 = new Class1_Sub16(arg0);
			this.method4634(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method4637() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4634(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}
}
