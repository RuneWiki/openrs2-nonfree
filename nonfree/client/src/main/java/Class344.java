import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class344 implements Runnable {

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lclient!su;")
	private final Class298 aClass298_203 = new Class298();

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	public Class344() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!wfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class298 local8 = this.aClass298_203;
			@Pc(38) Class6_Sub16 local38;
			synchronized (this.aClass298_203) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass298_203.method6811(); local15 == null; local15 = this.aClass298_203.method6811()) {
					try {
						this.aClass298_203.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub16)) {
					return;
				}
				local38 = (Class6_Sub16) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString31).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2906 = local64;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public void method7834() {
		if (this.aThread6 == null) {
			return;
		}
		this.method7836(new Class6());
		try {
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZLclient!ia;)V")
	private void method7836(@OriginalArg(1) Class6 arg0) {
		@Pc(6) Class298 local6 = this.aClass298_203;
		synchronized (this.aClass298_203) {
			this.aClass298_203.method6812(arg0);
			this.aClass298_203.notify();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!fu;")
	public Class6_Sub16 method7837(@OriginalArg(0) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class6_Sub16 local31 = new Class6_Sub16(arg0);
			this.method7836(local31);
			return local31;
		}
	}
}
