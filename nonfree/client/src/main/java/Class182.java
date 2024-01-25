import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class182 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!bq;")
	private final Class43 aClass43_31 = new Class43();

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class182() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method4824() {
		if (this.aThread5 == null) {
			return;
		}
		this.method4825(new Class8());
		try {
			this.aThread5.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLclient!mc;)V")
	private void method4825(@OriginalArg(1) Class8 arg0) {
		@Pc(6) Class43 local6 = this.aClass43_31;
		synchronized (this.aClass43_31) {
			this.aClass43_31.method1424(arg0);
			this.aClass43_31.notify();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)Lclient!va;")
	public Class8_Sub48 method4826(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class8_Sub48 local28 = new Class8_Sub48(arg0);
			this.method4825(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class43 local8 = this.aClass43_31;
			@Pc(38) Class8_Sub48 local38;
			synchronized (this.aClass43_31) {
				@Pc(15) Class8 local15;
				for (local15 = this.aClass43_31.method1432(); local15 == null; local15 = this.aClass43_31.method1432()) {
					try {
						this.aClass43_31.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class8_Sub48)) {
					return;
				}
				local38 = (Class8_Sub48) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString105).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt10047 = local64;
		}
	}
}
