import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class102 implements Runnable {

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "Lclient!hga;")
	private final Class130 aClass130_13 = new Class130();

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class102() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!iga;B)V")
	private void method2795(@OriginalArg(0) Class3 arg0) {
		@Pc(11) Class130 local11 = this.aClass130_13;
		synchronized (this.aClass130_13) {
			this.aClass130_13.method3548(arg0);
			this.aClass130_13.notify();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!aea;")
	public Class3_Sub5 method2797(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub5 local28 = new Class3_Sub5(arg0);
			this.method2795(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!fp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class130 local8 = this.aClass130_13;
			@Pc(38) Class3_Sub5 local38;
			synchronized (this.aClass130_13) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass130_13.method3545(); local15 == null; local15 = this.aClass130_13.method3545()) {
					try {
						this.aClass130_13.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub5)) {
					return;
				}
				local38 = (Class3_Sub5) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString3).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt124 = local64;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public void method2800() {
		if (this.aThread3 == null) {
			return;
		}
		this.method2795(new Class3());
		try {
			this.aThread3.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread3 = null;
	}
}
