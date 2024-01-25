import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class317 implements Runnable {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!rh;")
	private final Class275 aClass275_183 = new Class275();

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6 = new Thread(this);

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class317() {
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public void method7310() {
		if (this.aThread6 == null) {
			return;
		}
		this.method7315(new Class6());
		try {
			this.aThread6.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!uj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class275 local8 = this.aClass275_183;
			@Pc(38) Class6_Sub15 local38;
			synchronized (this.aClass275_183) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass275_183.method6360(); local15 == null; local15 = this.aClass275_183.method6360()) {
					try {
						this.aClass275_183.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class6_Sub15)) {
					return;
				}
				local38 = (Class6_Sub15) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString24).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1528 = local64;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sf;Z)V")
	private void method7315(@OriginalArg(0) Class6 arg0) {
		@Pc(2) Class275 local2 = this.aClass275_183;
		synchronized (this.aClass275_183) {
			this.aClass275_183.method6370(arg0);
			this.aClass275_183.notify();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!di;")
	public Class6_Sub15 method7316(@OriginalArg(0) String arg0) {
		if (this.aThread6 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(30) Class6_Sub15 local30 = new Class6_Sub15(arg0);
			this.method7315(local30);
			return local30;
		}
	}
}
