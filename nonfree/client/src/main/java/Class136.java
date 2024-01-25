import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class136 implements Runnable {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!jm;")
	private final Class103 aClass103_100 = new Class103();

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class136() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public void method3753() {
		if (this.aThread2 == null) {
			return;
		}
		this.method3758(new Class5());
		try {
			this.aThread2.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;)Lclient!tg;")
	public Class5_Sub40 method3755(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class5_Sub40 local29 = new Class5_Sub40(arg0);
			this.method3758(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!mq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(6) Class103 local6 = this.aClass103_100;
			@Pc(35) Class5_Sub40 local35;
			synchronized (this.aClass103_100) {
				@Pc(13) Class5 local13;
				for (local13 = this.aClass103_100.method2743(); local13 == null; local13 = this.aClass103_100.method2743()) {
					try {
						this.aClass103_100.wait();
					} catch (@Pc(19) InterruptedException local19) {
					}
				}
				if (!(local13 instanceof Class5_Sub40)) {
					return;
				}
				local35 = (Class5_Sub40) local13;
			}
			@Pc(61) int local61;
			try {
				@Pc(46) byte[] local46 = InetAddress.getByName(local35.aString57).getAddress();
				local61 = jagmisc.ping(local46[0], local46[1], local46[2], local46[3], 1000L);
			} catch (@Pc(63) Throwable local63) {
				local61 = 1000;
			}
			local35.anInt6005 = local61;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!vi;B)V")
	private void method3758(@OriginalArg(0) Class5 arg0) {
		@Pc(6) Class103 local6 = this.aClass103_100;
		synchronized (this.aClass103_100) {
			this.aClass103_100.method2745(arg0);
			this.aClass103_100.notify();
		}
	}
}
