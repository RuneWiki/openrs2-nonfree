import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class166 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!kn;")
	private final Class116 aClass116_42 = new Class116();

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	static {
		new Class159("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class166() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ge;B)V")
	private void method4490(@OriginalArg(0) Class4 arg0) {
		@Pc(8) Class116 local8 = this.aClass116_42;
		synchronized (this.aClass116_42) {
			this.aClass116_42.method3274(arg0);
			this.aClass116_42.notify();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!pp;")
	public Class4_Sub35 method4495(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(28) Class4_Sub35 local28 = new Class4_Sub35(arg0);
			this.method4490(local28);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method4497() {
		if (this.aThread3 == null) {
			return;
		}
		this.method4490(new Class4());
		try {
			this.aThread3.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class116 local8 = this.aClass116_42;
			@Pc(38) Class4_Sub35 local38;
			synchronized (this.aClass116_42) {
				@Pc(15) Class4 local15;
				for (local15 = this.aClass116_42.method3266(); local15 == null; local15 = this.aClass116_42.method3266()) {
					try {
						this.aClass116_42.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class4_Sub35)) {
					return;
				}
				local38 = (Class4_Sub35) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString56).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5053 = local64;
		}
	}
}
