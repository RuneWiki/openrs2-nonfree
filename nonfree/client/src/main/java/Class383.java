import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class383 implements Runnable {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!tj;")
	private final Class357 aClass357_62 = new Class357();

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class383() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class357 local8 = this.aClass357_62;
			@Pc(43) Class3_Sub46 local43;
			synchronized (this.aClass357_62) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass357_62.method8398(); local15 == null; local15 = this.aClass357_62.method8398()) {
					try {
						this.aClass357_62.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class3_Sub46)) {
					return;
				}
				local43 = (Class3_Sub46) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString122).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt9328 = local69;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!an;Z)V")
	private void method8938(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class357 local2 = this.aClass357_62;
		synchronized (this.aClass357_62) {
			this.aClass357_62.method8401(arg0);
			this.aClass357_62.notify();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public void method8939() {
		if (this.aThread6 == null) {
			return;
		}
		this.method8938(new Class3());
		try {
			this.aThread6.join();
		} catch (@Pc(19) InterruptedException local19) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;)Lclient!rs;")
	public Class3_Sub46 method8940(@OriginalArg(1) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class3_Sub46 local31 = new Class3_Sub46(arg0);
			this.method8938(local31);
			return local31;
		}
	}
}
