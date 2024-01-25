import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class380 implements Runnable {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!ada;")
	private final Class8 aClass8_75 = new Class8();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class380() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public void method8967() {
		if (this.aThread7 == null) {
			return;
		}
		this.method8968(new Class6());
		try {
			this.aThread7.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!efa;B)V")
	private void method8968(@OriginalArg(0) Class6 arg0) {
		@Pc(2) Class8 local2 = this.aClass8_75;
		synchronized (this.aClass8_75) {
			this.aClass8_75.method157(arg0);
			this.aClass8_75.notify();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fga;")
	public Class6_Sub17 method8969(@OriginalArg(0) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class6_Sub17 local23 = new Class6_Sub17(arg0);
			this.method8968(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!wp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class8 local8 = this.aClass8_75;
			@Pc(38) Class6_Sub17 local38;
			synchronized (this.aClass8_75) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass8_75.method152(); local15 == null; local15 = this.aClass8_75.method152()) {
					try {
						this.aClass8_75.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub17)) {
					return;
				}
				local38 = (Class6_Sub17) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString31).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2807 = local64;
		}
	}
}
