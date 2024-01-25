import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class188 implements Runnable {

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "Lclient!ow;")
	private final Class271 aClass271_29 = new Class271();

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	public Class188() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public void method4911() {
		if (this.aThread5 == null) {
			return;
		}
		this.method4914(new Class2());
		try {
			this.aThread5.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!eaa;")
	public Class2_Sub22 method4912(@OriginalArg(0) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class2_Sub22 local28 = new Class2_Sub22(arg0);
			this.method4914(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!jv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class271 local8 = this.aClass271_29;
			@Pc(38) Class2_Sub22 local38;
			synchronized (this.aClass271_29) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass271_29.method7172(); local15 == null; local15 = this.aClass271_29.method7172()) {
					try {
						this.aClass271_29.wait();
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
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString31).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2415 = local64;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!it;)V")
	private void method4914(@OriginalArg(1) Class2 arg0) {
		@Pc(6) Class271 local6 = this.aClass271_29;
		synchronized (this.aClass271_29) {
			this.aClass271_29.method7174(arg0);
			this.aClass271_29.notify();
		}
	}
}
