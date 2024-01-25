import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class255 implements Runnable {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!vp;")
	private final Class254 aClass254_47 = new Class254();

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class255() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class254 local8 = this.aClass254_47;
			@Pc(38) Class1_Sub10 local38;
			synchronized (this.aClass254_47) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass254_47.method5436(); local15 == null; local15 = this.aClass254_47.method5436()) {
					try {
						this.aClass254_47.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub10)) {
					return;
				}
				local38 = (Class1_Sub10) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString9).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1094 = local64;
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
	public void method5465() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5468(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cw;")
	public Class1_Sub10 method5466(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class1_Sub10 local29 = new Class1_Sub10(arg0);
			this.method5468(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!kp;B)V")
	private void method5468(@OriginalArg(0) Class1 arg0) {
		@Pc(13) Class254 local13 = this.aClass254_47;
		synchronized (this.aClass254_47) {
			this.aClass254_47.method5430(arg0);
			this.aClass254_47.notify();
		}
	}
}
