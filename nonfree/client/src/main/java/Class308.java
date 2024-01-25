import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class308 implements Runnable {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!wo;")
	private final Class361 aClass361_92 = new Class361();

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class308() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public void method6988() {
		if (this.aThread7 == null) {
			return;
		}
		this.method6991(new Class1());
		try {
			this.aThread7.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class361 local8 = this.aClass361_92;
			@Pc(38) Class1_Sub45 local38;
			synchronized (this.aClass361_92) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass361_92.method7850(); local15 == null; local15 = this.aClass361_92.method7850()) {
					try {
						this.aClass361_92.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub45)) {
					return;
				}
				local38 = (Class1_Sub45) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString87).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt8349 = local64;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!taa;")
	public Class1_Sub45 method6990(@OriginalArg(0) String arg0) {
		if (this.aThread7 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class1_Sub45 local31 = new Class1_Sub45(arg0);
			this.method6991(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!jca;)V")
	private void method6991(@OriginalArg(1) Class1 arg0) {
		@Pc(8) Class361 local8 = this.aClass361_92;
		synchronized (this.aClass361_92) {
			this.aClass361_92.method7855(arg0);
			this.aClass361_92.notify();
		}
	}
}
