import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class285 implements Runnable {

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Lclient!ki;")
	private final Class183 aClass183_51 = new Class183();

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class285() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public void method7063() {
		if (this.aThread4 == null) {
			return;
		}
		this.method7066(new Class3());
		try {
			this.aThread4.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!rn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(6) Class183 local6 = this.aClass183_51;
			@Pc(35) Class3_Sub26 local35;
			synchronized (this.aClass183_51) {
				@Pc(13) Class3 local13;
				for (local13 = this.aClass183_51.method4797(); local13 == null; local13 = this.aClass183_51.method4797()) {
					try {
						this.aClass183_51.wait();
					} catch (@Pc(19) InterruptedException local19) {
					}
				}
				if (!(local13 instanceof Class3_Sub26)) {
					return;
				}
				local35 = (Class3_Sub26) local13;
			}
			@Pc(61) int local61;
			try {
				@Pc(46) byte[] local46 = InetAddress.getByName(local35.aString48).getAddress();
				local61 = jagmisc.ping(local46[0], local46[1], local46[2], local46[3], 1000L);
			} catch (@Pc(63) Throwable local63) {
				local61 = 1000;
			}
			local35.anInt4727 = local61;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!iw;")
	public Class3_Sub26 method7065(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class3_Sub26 local28 = new Class3_Sub26(arg0);
			this.method7066(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!faa;I)V")
	private void method7066(@OriginalArg(0) Class3 arg0) {
		@Pc(6) Class183 local6 = this.aClass183_51;
		synchronized (this.aClass183_51) {
			this.aClass183_51.method4792(arg0);
			this.aClass183_51.notify();
		}
	}
}
