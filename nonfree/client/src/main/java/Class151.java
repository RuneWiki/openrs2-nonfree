import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class151 implements Runnable {

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!ug;")
	private final Class243 aClass243_30 = new Class243();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class151() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!mj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class243 local8 = this.aClass243_30;
			@Pc(38) Class3_Sub1 local38;
			synchronized (this.aClass243_30) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass243_30.method5204(); local15 == null; local15 = this.aClass243_30.method5204()) {
					try {
						this.aClass243_30.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub1)) {
					return;
				}
				local38 = (Class3_Sub1) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString2).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt64 = local64;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
	public void method3710() {
		if (this.aThread3 == null) {
			return;
		}
		this.method3713(new Class3());
		try {
			this.aThread3.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ab;")
	public Class3_Sub1 method3711(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class3_Sub1 local23 = new Class3_Sub1(arg0);
			this.method3713(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!qg;)V")
	private void method3713(@OriginalArg(1) Class3 arg0) {
		@Pc(2) Class243 local2 = this.aClass243_30;
		synchronized (this.aClass243_30) {
			this.aClass243_30.method5198(arg0);
			this.aClass243_30.notify();
		}
	}
}
