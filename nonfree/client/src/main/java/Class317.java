import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class317 implements Runnable {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!oe;")
	private final Class244 aClass244_58 = new Class244();

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class317() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sk;")
	public Class4_Sub42 method7507(@OriginalArg(1) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class4_Sub42 local23 = new Class4_Sub42(arg0);
			this.method7509(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!to", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class244 local8 = this.aClass244_58;
			@Pc(38) Class4_Sub42 local38;
			synchronized (this.aClass244_58) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass244_58.method5968(); local15 == null; local15 = this.aClass244_58.method5968()) {
					try {
						this.aClass244_58.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub42)) {
					return;
				}
				local38 = (Class4_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString86).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8816 = local64;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!ii;)V")
	private void method7509(@OriginalArg(1) Class4 arg0) {
		@Pc(6) Class244 local6 = this.aClass244_58;
		synchronized (this.aClass244_58) {
			this.aClass244_58.method5960(arg0);
			this.aClass244_58.notify();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public void method7511() {
		if (this.aThread6 == null) {
			return;
		}
		this.method7509(new Class4());
		try {
			this.aThread6.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread6 = null;
	}
}
