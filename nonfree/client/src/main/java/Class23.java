import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "Lclient!ws;")
	private final Class361 aClass361_5 = new Class361();

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	public Class23() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V")
	public void method886() {
		if (this.aThread1 == null) {
			return;
		}
		this.method888(new Class6());
		try {
			this.aThread1.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!sk;")
	public Class6_Sub40 method887(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class6_Sub40 local23 = new Class6_Sub40(arg0);
			this.method888(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!kd;)V")
	private void method888(@OriginalArg(1) Class6 arg0) {
		@Pc(6) Class361 local6 = this.aClass361_5;
		synchronized (this.aClass361_5) {
			this.aClass361_5.method7833(arg0);
			this.aClass361_5.notify();
		}
	}

	@OriginalMember(owner = "client!bba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class361 local8 = this.aClass361_5;
			@Pc(38) Class6_Sub40 local38;
			synchronized (this.aClass361_5) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass361_5.method7835(); local15 == null; local15 = this.aClass361_5.method7835()) {
					try {
						this.aClass361_5.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub40)) {
					return;
				}
				local38 = (Class6_Sub40) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString86).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8165 = local64;
		}
	}
}
