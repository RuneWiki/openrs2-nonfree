import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class101 implements Runnable {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!bd;")
	private final Class32 aClass32_12 = new Class32();

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class101() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wj;Z)V")
	private void method2155(@OriginalArg(0) Class14 arg0) {
		@Pc(11) Class32 local11 = this.aClass32_12;
		synchronized (this.aClass32_12) {
			this.aClass32_12.method582(arg0);
			this.aClass32_12.notify();
		}
	}

	@OriginalMember(owner = "client!eq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class32 local8 = this.aClass32_12;
			@Pc(43) Class14_Sub47 local43;
			synchronized (this.aClass32_12) {
				@Pc(15) Class14 local15;
				for (local15 = this.aClass32_12.method579(); local15 == null; local15 = this.aClass32_12.method579()) {
					try {
						this.aClass32_12.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class14_Sub47)) {
					return;
				}
				local43 = (Class14_Sub47) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString116).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt10186 = local69;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!uk;")
	public Class14_Sub47 method2156(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(25) Class14_Sub47 local25 = new Class14_Sub47(arg0);
			this.method2155(local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method2157() {
		if (this.aThread3 == null) {
			return;
		}
		this.method2155(new Class14());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}
}
