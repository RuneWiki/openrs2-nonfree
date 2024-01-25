import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class329 implements Runnable {

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!fh;")
	private final Class114 aClass114_44 = new Class114();

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class329() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!vr;")
	public Class2_Sub47 method7528(@OriginalArg(0) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class2_Sub47 local23 = new Class2_Sub47(arg0);
			this.method7531(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public void method7530() {
		if (this.aThread6 == null) {
			return;
		}
		this.method7531(new Class2());
		try {
			this.aThread6.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!tf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class114 local8 = this.aClass114_44;
			@Pc(38) Class2_Sub47 local38;
			synchronized (this.aClass114_44) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass114_44.method2765(); local15 == null; local15 = this.aClass114_44.method2765()) {
					try {
						this.aClass114_44.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub47)) {
					return;
				}
				local38 = (Class2_Sub47) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString110).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt10143 = local64;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!dfa;Z)V")
	private void method7531(@OriginalArg(0) Class2 arg0) {
		@Pc(2) Class114 local2 = this.aClass114_44;
		synchronized (this.aClass114_44) {
			this.aClass114_44.method2771(arg0);
			this.aClass114_44.notify();
		}
	}
}
