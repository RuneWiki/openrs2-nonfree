import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class273 implements Runnable {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!at;")
	private final Class20 aClass20_36 = new Class20();

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class273() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!eea;")
	public Class5_Sub16 method6216(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(25) Class5_Sub16 local25 = new Class5_Sub16(arg0);
			this.method6219(local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public void method6217() {
		if (this.aThread4 == null) {
			return;
		}
		this.method6219(new Class5());
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!oo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class20 local8 = this.aClass20_36;
			@Pc(43) Class5_Sub16 local43;
			synchronized (this.aClass20_36) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass20_36.method369(); local15 == null; local15 = this.aClass20_36.method369()) {
					try {
						this.aClass20_36.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class5_Sub16)) {
					return;
				}
				local43 = (Class5_Sub16) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString15).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt1946 = local69;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!ac;)V")
	private void method6219(@OriginalArg(1) Class5 arg0) {
		@Pc(6) Class20 local6 = this.aClass20_36;
		synchronized (this.aClass20_36) {
			this.aClass20_36.method370(arg0);
			this.aClass20_36.notify();
		}
	}
}
