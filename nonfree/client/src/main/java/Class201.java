import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class201 implements Runnable {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!fea;")
	private final Class99 aClass99_52 = new Class99();

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class201() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!pj;")
	public Class5_Sub38 method5073(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class5_Sub38 local28 = new Class5_Sub38(arg0);
			this.method5074(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!mo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class99 local8 = this.aClass99_52;
			@Pc(38) Class5_Sub38 local38;
			synchronized (this.aClass99_52) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass99_52.method2516(); local15 == null; local15 = this.aClass99_52.method2516()) {
					try {
						this.aClass99_52.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub38)) {
					return;
				}
				local38 = (Class5_Sub38) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString67).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6970 = local64;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!um;I)V")
	private void method5074(@OriginalArg(0) Class5 arg0) {
		@Pc(6) Class99 local6 = this.aClass99_52;
		synchronized (this.aClass99_52) {
			this.aClass99_52.method2513(arg0);
			this.aClass99_52.notify();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method5075() {
		if (this.aThread4 == null) {
			return;
		}
		this.method5074(new Class5());
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread4 = null;
	}
}
