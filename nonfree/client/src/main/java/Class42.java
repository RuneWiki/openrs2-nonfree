import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "Lclient!tm;")
	private final Class338 aClass338_25 = new Class338();

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLclient!dba;)V")
	private void method1152(@OriginalArg(1) Class3 arg0) {
		@Pc(17) Class338 local17 = this.aClass338_25;
		synchronized (this.aClass338_25) {
			this.aClass338_25.method8171(arg0);
			this.aClass338_25.notify();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!gb;")
	public Class3_Sub26 method1154(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class3_Sub26 local23 = new Class3_Sub26(arg0);
			this.method1152(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1155() {
		if (this.aThread2 == null) {
			return;
		}
		this.method1152(new Class3());
		try {
			this.aThread2.join();
		} catch (@Pc(18) InterruptedException local18) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!bp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class338 local8 = this.aClass338_25;
			@Pc(38) Class3_Sub26 local38;
			synchronized (this.aClass338_25) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass338_25.method8169(); local15 == null; local15 = this.aClass338_25.method8169()) {
					try {
						this.aClass338_25.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub26)) {
					return;
				}
				local38 = (Class3_Sub26) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString30).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt3727 = local64;
		}
	}
}
