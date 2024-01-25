import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class173 implements Runnable {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!at;")
	private final Class17 aClass17_48 = new Class17();

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class173() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!jq;")
	public Class1_Sub21 method3890(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class1_Sub21 local29 = new Class1_Sub21(arg0);
			this.method3894(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class17 local8 = this.aClass17_48;
			@Pc(38) Class1_Sub21 local38;
			synchronized (this.aClass17_48) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass17_48.method203(); local15 == null; local15 = this.aClass17_48.method203()) {
					try {
						this.aClass17_48.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub21)) {
					return;
				}
				local38 = (Class1_Sub21) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString33).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt3209 = local64;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!fi;)V")
	private void method3894(@OriginalArg(1) Class1 arg0) {
		@Pc(10) Class17 local10 = this.aClass17_48;
		synchronized (this.aClass17_48) {
			this.aClass17_48.method199(arg0);
			this.aClass17_48.notify();
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public void method3895() {
		if (this.aThread2 == null) {
			return;
		}
		this.method3894(new Class1());
		try {
			this.aThread2.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread2 = null;
	}
}
