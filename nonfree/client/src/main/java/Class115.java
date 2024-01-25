import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class115 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!m;")
	private final Class127 aClass127_19 = new Class127();

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class115() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ob;)V")
	private void method2838(@OriginalArg(1) Class3 arg0) {
		@Pc(2) Class127 local2 = this.aClass127_19;
		synchronized (this.aClass127_19) {
			this.aClass127_19.method3387(arg0);
			this.aClass127_19.notify();
		}
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class127 local8 = this.aClass127_19;
			@Pc(38) Class3_Sub33 local38;
			synchronized (this.aClass127_19) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass127_19.method3396(); local15 == null; local15 = this.aClass127_19.method3396()) {
					try {
						this.aClass127_19.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub33)) {
					return;
				}
				local38 = (Class3_Sub33) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString171).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4563 = local64;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oh;")
	public Class3_Sub33 method2840(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class3_Sub33 local23 = new Class3_Sub33(arg0);
			this.method2838(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method2842() {
		if (this.aThread3 == null) {
			return;
		}
		this.method2838(new Class3());
		try {
			this.aThread3.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread3 = null;
	}
}
