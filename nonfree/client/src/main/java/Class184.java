import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class184 implements Runnable {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!pu;")
	private final Class203 aClass203_42 = new Class203();

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class184() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!eo;")
	public Class1_Sub15 method4167(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub15 local23 = new Class1_Sub15(arg0);
			this.method4169(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!jp;)V")
	private void method4169(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class203 local6 = this.aClass203_42;
		synchronized (this.aClass203_42) {
			this.aClass203_42.method4551(arg0);
			this.aClass203_42.notify();
		}
	}

	@OriginalMember(owner = "client!ob", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class203 local8 = this.aClass203_42;
			@Pc(38) Class1_Sub15 local38;
			synchronized (this.aClass203_42) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass203_42.method4549(); local15 == null; local15 = this.aClass203_42.method4549()) {
					try {
						this.aClass203_42.wait();
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
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString24).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2380 = local64;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public void method4172() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4169(new Class1());
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread3 = null;
	}
}
