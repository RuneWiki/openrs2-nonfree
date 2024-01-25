import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class268 implements Runnable {

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!ko;")
	private final Class142 aClass142_51 = new Class142();

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class268() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!wv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class142 local8 = this.aClass142_51;
			@Pc(38) Class1_Sub4 local38;
			synchronized (this.aClass142_51) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass142_51.method3196(); local15 == null; local15 = this.aClass142_51.method3196()) {
					try {
						this.aClass142_51.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub4)) {
					return;
				}
				local38 = (Class1_Sub4) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString5).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt464 = local64;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	public void method5994() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5996(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!oo;Z)V")
	private void method5996(@OriginalArg(0) Class1 arg0) {
		@Pc(6) Class142 local6 = this.aClass142_51;
		synchronized (this.aClass142_51) {
			this.aClass142_51.method3212(arg0);
			this.aClass142_51.notify();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!bg;")
	public Class1_Sub4 method5997(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class1_Sub4 local28 = new Class1_Sub4(arg0);
			this.method5996(local28);
			return local28;
		}
	}
}
