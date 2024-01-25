import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class213 implements Runnable {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!wo;")
	private final Class266 aClass266_44 = new Class266();

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class213() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!sg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class266 local8 = this.aClass266_44;
			@Pc(38) Class1_Sub25 local38;
			synchronized (this.aClass266_44) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass266_44.method5999(); local15 == null; local15 = this.aClass266_44.method5999()) {
					try {
						this.aClass266_44.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub25)) {
					return;
				}
				local38 = (Class1_Sub25) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString34).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt4176 = local64;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ki;)V")
	private void method5017(@OriginalArg(1) Class1 arg0) {
		@Pc(2) Class266 local2 = this.aClass266_44;
		synchronized (this.aClass266_44) {
			this.aClass266_44.method5998(arg0);
			this.aClass266_44.notify();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5019() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5017(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)Lclient!lm;")
	public Class1_Sub25 method5021(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub25 local23 = new Class1_Sub25(arg0);
			this.method5017(local23);
			return local23;
		}
	}
}
