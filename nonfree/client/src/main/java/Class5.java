import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!tf;")
	private final Class340 aClass340_1 = new Class340();

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ac", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class340 local8 = this.aClass340_1;
			@Pc(43) Class6_Sub46 local43;
			synchronized (this.aClass340_1) {
				@Pc(15) Class6 local15;
				for (local15 = this.aClass340_1.method8127(); local15 == null; local15 = this.aClass340_1.method8127()) {
					try {
						this.aClass340_1.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class6_Sub46)) {
					return;
				}
				local43 = (Class6_Sub46) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString94).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt8354 = local69;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public void method26() {
		if (this.aThread1 == null) {
			return;
		}
		this.method28(new Class6());
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!wb;)V")
	private void method28(@OriginalArg(1) Class6 arg0) {
		@Pc(10) Class340 local10 = this.aClass340_1;
		synchronized (this.aClass340_1) {
			this.aClass340_1.method8131(arg0);
			this.aClass340_1.notify();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;)Lclient!qia;")
	public Class6_Sub46 method30(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class6_Sub46 local31 = new Class6_Sub46(arg0);
			this.method28(local31);
			return local31;
		}
	}
}
