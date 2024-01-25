import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class254 implements Runnable {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!ef;")
	private final Class102 aClass102_45 = new Class102();

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	public Class254() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class102 local8 = this.aClass102_45;
			@Pc(43) Class5_Sub7 local43;
			synchronized (this.aClass102_45) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass102_45.method1928(); local15 == null; local15 = this.aClass102_45.method1928()) {
					try {
						this.aClass102_45.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class5_Sub7)) {
					return;
				}
				local43 = (Class5_Sub7) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString17).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt969 = local69;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!me;)V")
	private void method5897(@OriginalArg(1) Class5 arg0) {
		@Pc(2) Class102 local2 = this.aClass102_45;
		synchronized (this.aClass102_45) {
			this.aClass102_45.method1921(arg0);
			this.aClass102_45.notify();
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public void method5899() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5897(new Class5());
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!ca;")
	public Class5_Sub7 method5900(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(33) Class5_Sub7 local33 = new Class5_Sub7(arg0);
			this.method5897(local33);
			return local33;
		}
	}
}
