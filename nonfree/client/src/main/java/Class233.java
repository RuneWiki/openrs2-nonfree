import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class233 implements Runnable {

	@OriginalMember(owner = "client!su", name = "i", descriptor = "Lclient!nj;")
	private final Class181 aClass181_41 = new Class181();

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class233() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!su", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class181 local8 = this.aClass181_41;
			@Pc(38) Class2_Sub44 local38;
			synchronized (this.aClass181_41) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass181_41.method3976(); local15 == null; local15 = this.aClass181_41.method3976()) {
					try {
						this.aClass181_41.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub44)) {
					return;
				}
				local38 = (Class2_Sub44) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString69).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7320 = local64;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!wh;)V")
	private void method5268(@OriginalArg(1) Class2 arg0) {
		@Pc(2) Class181 local2 = this.aClass181_41;
		synchronized (this.aClass181_41) {
			this.aClass181_41.method3973(arg0);
			this.aClass181_41.notify();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLjava/lang/String;)Lclient!vn;")
	public Class2_Sub44 method5271(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(30) Class2_Sub44 local30 = new Class2_Sub44(arg0);
			this.method5268(local30);
			return local30;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public void method5272() {
		if (this.aThread5 == null) {
			return;
		}
		this.method5268(new Class2());
		try {
			this.aThread5.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread5 = null;
	}
}
