import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class198 implements Runnable {

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Lclient!fr;")
	private final Class85 aClass85_32 = new Class85();

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class198() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!kk;")
	public Class7_Sub29 method4089(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class7_Sub29 local28 = new Class7_Sub29(arg0);
			this.method4091(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public void method4090() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4091(new Class7());
		try {
			this.aThread3.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ea;I)V")
	private void method4091(@OriginalArg(0) Class7 arg0) {
		@Pc(2) Class85 local2 = this.aClass85_32;
		synchronized (this.aClass85_32) {
			this.aClass85_32.method2011(arg0);
			this.aClass85_32.notify();
		}
	}

	@OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class85 local8 = this.aClass85_32;
			@Pc(38) Class7_Sub29 local38;
			synchronized (this.aClass85_32) {
				@Pc(15) Class7 local15;
				for (local15 = this.aClass85_32.method2004(); local15 == null; local15 = this.aClass85_32.method2004()) {
					try {
						this.aClass85_32.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class7_Sub29)) {
					return;
				}
				local38 = (Class7_Sub29) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString44).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt3815 = local64;
		}
	}
}
