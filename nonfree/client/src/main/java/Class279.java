import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "Lclient!kba;")
	private final Class163 aClass163_50 = new Class163();

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	public Class279() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!gda;)V")
	private void method6966(@OriginalArg(1) Class6 arg0) {
		@Pc(6) Class163 local6 = this.aClass163_50;
		synchronized (this.aClass163_50) {
			this.aClass163_50.method4967(arg0);
			this.aClass163_50.notify();
		}
	}

	@OriginalMember(owner = "client!qia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class163 local8 = this.aClass163_50;
			@Pc(38) Class6_Sub7 local38;
			synchronized (this.aClass163_50) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass163_50.method4969(); local15 == null; local15 = this.aClass163_50.method4969()) {
					try {
						this.aClass163_50.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub7)) {
					return;
				}
				local38 = (Class6_Sub7) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString5).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1412 = local64;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILjava/lang/String;)Lclient!bfa;")
	public Class6_Sub7 method6967(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class6_Sub7 local28 = new Class6_Sub7(arg0);
			this.method6966(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
	public void method6970() {
		if (this.aThread5 == null) {
			return;
		}
		this.method6966(new Class6());
		try {
			this.aThread5.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread5 = null;
	}
}
