import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class24 implements Runnable {

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!sja;")
	private final Class342 aClass342_12 = new Class342();

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class24() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!tfa;Z)V")
	private void method975(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class342 local2 = this.aClass342_12;
		synchronized (this.aClass342_12) {
			this.aClass342_12.method7654(arg0);
			this.aClass342_12.notify();
		}
	}

	@OriginalMember(owner = "client!as", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class342 local8 = this.aClass342_12;
			@Pc(43) Class3_Sub3 local43;
			synchronized (this.aClass342_12) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass342_12.method7653(); local15 == null; local15 = this.aClass342_12.method7653()) {
					try {
						this.aClass342_12.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class3_Sub3)) {
					return;
				}
				local43 = (Class3_Sub3) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString1).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt228 = local69;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public void method977() {
		if (this.aThread1 == null) {
			return;
		}
		this.method975(new Class3());
		try {
			this.aThread1.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ada;")
	public Class3_Sub3 method979(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(25) Class3_Sub3 local25 = new Class3_Sub3(arg0);
			this.method975(local25);
			return local25;
		}
	}
}
