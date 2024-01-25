import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class236 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_58 = new Class211();

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class236() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!mu;)V")
	private void method5842(@OriginalArg(1) Class6 arg0) {
		@Pc(2) Class211 local2 = this.aClass211_58;
		synchronized (this.aClass211_58) {
			this.aClass211_58.method5173(arg0);
			this.aClass211_58.notify();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!uba;")
	public Class6_Sub47 method5844(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class6_Sub47 local23 = new Class6_Sub47(arg0);
			this.method5842(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class211 local8 = this.aClass211_58;
			@Pc(38) Class6_Sub47 local38;
			synchronized (this.aClass211_58) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass211_58.method5180(); local15 == null; local15 = this.aClass211_58.method5180()) {
					try {
						this.aClass211_58.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub47)) {
					return;
				}
				local38 = (Class6_Sub47) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString107).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8980 = local64;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method5847() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5842(new Class6());
		try {
			this.aThread3.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread3 = null;
	}
}
