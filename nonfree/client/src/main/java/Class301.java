import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!v;")
	private final Class362 aClass362_58 = new Class362();

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class301() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)Lclient!jw;")
	public Class6_Sub32 method7181(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class6_Sub32 local23 = new Class6_Sub32(arg0);
			this.method7184(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!sja;B)V")
	private void method7184(@OriginalArg(0) Class6 arg0) {
		@Pc(2) Class362 local2 = this.aClass362_58;
		synchronized (this.aClass362_58) {
			this.aClass362_58.method8536(arg0);
			this.aClass362_58.notify();
		}
	}

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class362 local8 = this.aClass362_58;
			@Pc(38) Class6_Sub32 local38;
			synchronized (this.aClass362_58) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass362_58.method8531(); local15 == null; local15 = this.aClass362_58.method8531()) {
					try {
						this.aClass362_58.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub32)) {
					return;
				}
				local38 = (Class6_Sub32) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString60).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4924 = local64;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public void method7185() {
		if (this.aThread5 == null) {
			return;
		}
		this.method7184(new Class6());
		try {
			this.aThread5.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread5 = null;
	}
}
