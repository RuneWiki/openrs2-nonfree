import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class79 implements Runnable {

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "Lclient!qw;")
	private final Class302 aClass302_9 = new Class302();

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "()V")
	public Class79() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!rda;")
	public Class3_Sub42 method1710(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class3_Sub42 local29 = new Class3_Sub42(arg0);
			this.method1711(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!mg;)V")
	private void method1711(@OriginalArg(1) Class3 arg0) {
		@Pc(6) Class302 local6 = this.aClass302_9;
		synchronized (this.aClass302_9) {
			this.aClass302_9.method6613(arg0);
			this.aClass302_9.notify();
		}
	}

	@OriginalMember(owner = "client!dia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class302 local8 = this.aClass302_9;
			@Pc(38) Class3_Sub42 local38;
			synchronized (this.aClass302_9) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass302_9.method6611(); local15 == null; local15 = this.aClass302_9.method6611()) {
					try {
						this.aClass302_9.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub42)) {
					return;
				}
				local38 = (Class3_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString98).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8103 = local64;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V")
	public void method1712() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1711(new Class3());
		try {
			this.aThread2.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread2 = null;
	}
}
