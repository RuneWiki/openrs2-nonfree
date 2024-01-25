import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class290 implements Runnable {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!gk;")
	private final Class112 aClass112_56 = new Class112();

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class290() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!ol;")
	public Class3_Sub38 method6414(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub38 local28 = new Class3_Sub38(arg0);
			this.method6418(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method6416() {
		if (this.aThread5 == null) {
			return;
		}
		this.method6418(new Class3());
		try {
			this.aThread5.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!gga;B)V")
	private void method6418(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class112 local6 = this.aClass112_56;
		synchronized (this.aClass112_56) {
			this.aClass112_56.method3079(arg0);
			this.aClass112_56.notify();
		}
	}

	@OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class112 local8 = this.aClass112_56;
			@Pc(38) Class3_Sub38 local38;
			synchronized (this.aClass112_56) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass112_56.method3094(); local15 == null; local15 = this.aClass112_56.method3094()) {
					try {
						this.aClass112_56.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub38)) {
					return;
				}
				local38 = (Class3_Sub38) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString50).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6787 = local64;
		}
	}
}
