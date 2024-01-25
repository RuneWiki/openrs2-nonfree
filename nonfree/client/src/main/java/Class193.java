import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class193 implements Runnable {

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Lclient!sm;")
	private final Class210 aClass210_42 = new Class210();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class193() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ag;)V")
	private void method4674(@OriginalArg(1) Class2 arg0) {
		@Pc(12) Class210 local12 = this.aClass210_42;
		synchronized (this.aClass210_42) {
			this.aClass210_42.method5044(arg0);
			this.aClass210_42.notify();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!id;")
	public Class2_Sub18 method4677(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class2_Sub18 local29 = new Class2_Sub18(arg0);
			this.method4674(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!qq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class210 local8 = this.aClass210_42;
			@Pc(38) Class2_Sub18 local38;
			synchronized (this.aClass210_42) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass210_42.method5039(); local15 == null; local15 = this.aClass210_42.method5039()) {
					try {
						this.aClass210_42.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub18)) {
					return;
				}
				local38 = (Class2_Sub18) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString26).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2669 = local64;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	public void method4678() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4674(new Class2());
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread3 = null;
	}
}
