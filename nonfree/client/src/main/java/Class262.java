import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class262 implements Runnable {

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "Lclient!uh;")
	private final Class341 aClass341_47 = new Class341();

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class262() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class341 local8 = this.aClass341_47;
			@Pc(38) Class2_Sub36 local38;
			synchronized (this.aClass341_47) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass341_47.method8526(); local15 == null; local15 = this.aClass341_47.method8526()) {
					try {
						this.aClass341_47.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub36)) {
					return;
				}
				local38 = (Class2_Sub36) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString76).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6974 = local64;
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILjava/lang/String;)Lclient!mj;")
	public Class2_Sub36 method6849(@OriginalArg(1) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class2_Sub36 local29 = new Class2_Sub36(arg0);
			this.method6851(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)V")
	public void method6850() {
		if (this.aThread4 == null) {
			return;
		}
		this.method6851(new Class2());
		try {
			this.aThread4.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!eh;)V")
	private void method6851(@OriginalArg(1) Class2 arg0) {
		@Pc(8) Class341 local8 = this.aClass341_47;
		synchronized (this.aClass341_47) {
			this.aClass341_47.method8528(arg0);
			this.aClass341_47.notify();
		}
	}
}
