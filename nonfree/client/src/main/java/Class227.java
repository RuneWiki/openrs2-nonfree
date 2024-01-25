import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class227 implements Runnable {

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!mba;")
	private final Class216 aClass216_47 = new Class216();

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class227() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!qg;")
	public Class3_Sub42 method5782(@OriginalArg(0) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class3_Sub42 local23 = new Class3_Sub42(arg0);
			this.method5783(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!no;B)V")
	private void method5783(@OriginalArg(0) Class3 arg0) {
		@Pc(2) Class216 local2 = this.aClass216_47;
		synchronized (this.aClass216_47) {
			this.aClass216_47.method5449(arg0);
			this.aClass216_47.notify();
		}
	}

	@OriginalMember(owner = "client!ms", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class216 local8 = this.aClass216_47;
			@Pc(38) Class3_Sub42 local38;
			synchronized (this.aClass216_47) {
				@Pc(15) Class3 local15;
				for (local15 = this.aClass216_47.method5462(); local15 == null; local15 = this.aClass216_47.method5462()) {
					try {
						this.aClass216_47.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class3_Sub42)) {
					return;
				}
				local38 = (Class3_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString67).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7888 = local64;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public void method5786() {
		if (this.aThread5 == null) {
			return;
		}
		this.method5783(new Class3());
		try {
			this.aThread5.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread5 = null;
	}
}
