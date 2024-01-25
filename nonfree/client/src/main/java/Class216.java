import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class216 implements Runnable {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!tc;")
	private final Class195 aClass195_48 = new Class195();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class216() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;)Lclient!h;")
	public Class1_Sub15 method5613(@OriginalArg(1) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class1_Sub15 local28 = new Class1_Sub15(arg0);
			this.method5615(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!mh;)V")
	private void method5615(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class195 local6 = this.aClass195_48;
		synchronized (this.aClass195_48) {
			this.aClass195_48.method5018(arg0);
			this.aClass195_48.notify();
		}
	}

	@OriginalMember(owner = "client!wf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class195 local8 = this.aClass195_48;
			@Pc(38) Class1_Sub15 local38;
			synchronized (this.aClass195_48) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass195_48.method5031(); local15 == null; local15 = this.aClass195_48.method5031()) {
					try {
						this.aClass195_48.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub15)) {
					return;
				}
				local38 = (Class1_Sub15) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString94).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2305 = local64;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method5617() {
		if (this.aThread3 == null) {
			return;
		}
		this.method5615(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}
}
