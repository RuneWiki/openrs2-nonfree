import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!vf;")
	private final Class238 aClass238_17 = new Class238();

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	static {
		new Class62("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class145() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!pt;I)V")
	private void method3763(@OriginalArg(0) Class2 arg0) {
		@Pc(6) Class238 local6 = this.aClass238_17;
		synchronized (this.aClass238_17) {
			this.aClass238_17.method5796(arg0);
			this.aClass238_17.notify();
		}
	}

	@OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class238 local8 = this.aClass238_17;
			@Pc(38) Class2_Sub22 local38;
			synchronized (this.aClass238_17) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass238_17.method5803(); local15 == null; local15 = this.aClass238_17.method5803()) {
					try {
						this.aClass238_17.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub22)) {
					return;
				}
				local38 = (Class2_Sub22) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString25).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt3502 = local64;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public void method3769() {
		if (this.aThread2 == null) {
			return;
		}
		this.method3763(new Class2());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!jt;")
	public Class2_Sub22 method3770(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(30) Class2_Sub22 local30 = new Class2_Sub22(arg0);
			this.method3763(local30);
			return local30;
		}
	}
}
