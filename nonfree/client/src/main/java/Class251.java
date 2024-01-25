import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class251 implements Runnable {

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Lclient!eea;")
	private final Class71 aClass71_58 = new Class71();

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class251() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!uj;)V")
	private void method6160(@OriginalArg(1) Class3 arg0) {
		@Pc(6) Class71 local6 = this.aClass71_58;
		synchronized (this.aClass71_58) {
			this.aClass71_58.method2076(arg0);
			this.aClass71_58.notify();
		}
	}

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class71 local8 = this.aClass71_58;
			@Pc(38) Class3_Sub40 local38;
			synchronized (this.aClass71_58) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass71_58.method2084(); local15 == null; local15 = this.aClass71_58.method2084()) {
					try {
						this.aClass71_58.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub40)) {
					return;
				}
				local38 = (Class3_Sub40) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString60).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7397 = local64;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!qm;")
	public Class3_Sub40 method6163(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub40 local28 = new Class3_Sub40(arg0);
			this.method6160(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	public void method6164() {
		if (this.aThread4 == null) {
			return;
		}
		this.method6160(new Class3());
		try {
			this.aThread4.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread4 = null;
	}
}
