import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!or;")
	private final Class244 aClass244_65 = new Class244();

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class325() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!u;B)V")
	private void method7257(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class244 local6 = this.aClass244_65;
		synchronized (this.aClass244_65) {
			this.aClass244_65.method5570(arg0);
			this.aClass244_65.notify();
		}
	}

	@OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class244 local8 = this.aClass244_65;
			@Pc(38) Class3_Sub28 local38;
			synchronized (this.aClass244_65) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass244_65.method5578(); local15 == null; local15 = this.aClass244_65.method5578()) {
					try {
						this.aClass244_65.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub28)) {
					return;
				}
				local38 = (Class3_Sub28) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString122).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4967 = local64;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ji;")
	public Class3_Sub28 method7259(@OriginalArg(1) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class3_Sub28 local31 = new Class3_Sub28(arg0);
			this.method7257(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
	public void method7261() {
		if (this.aThread7 == null) {
			return;
		}
		this.method7257(new Class3());
		try {
			this.aThread7.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread7 = null;
	}
}
