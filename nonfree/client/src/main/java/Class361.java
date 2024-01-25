import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class361 implements Runnable {

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lclient!ok;")
	private final Class262 aClass262_70 = new Class262();

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
	public Class361() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!au;")
	public Class14_Sub4 method8677(@OriginalArg(0) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class14_Sub4 local31 = new Class14_Sub4(arg0);
			this.method8678(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class262 local8 = this.aClass262_70;
			@Pc(38) Class14_Sub4 local38;
			synchronized (this.aClass262_70) {
				@Pc(15) Class14 local15;
				for (local15 = this.aClass262_70.method6323(); local15 == null; local15 = this.aClass262_70.method6323()) {
					try {
						this.aClass262_70.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class14_Sub4)) {
					return;
				}
				local38 = (Class14_Sub4) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString5).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt458 = local64;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!lq;)V")
	private void method8678(@OriginalArg(1) Class14 arg0) {
		@Pc(2) Class262 local2 = this.aClass262_70;
		synchronized (this.aClass262_70) {
			this.aClass262_70.method6314(arg0);
			this.aClass262_70.notify();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public void method8680() {
		if (this.aThread7 == null) {
			return;
		}
		this.method8678(new Class14());
		try {
			this.aThread7.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread7 = null;
	}
}
