import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class162 implements Runnable {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	public static final int[] anIntArray283 = new int[50];

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!ld;")
	private final Class135 aClass135_28 = new Class135();

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 324)
	public Class162() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ha;", line = 6)
	public Class2_Sub16 method4115(@OriginalArg(0) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class2_Sub16 local31 = new Class2_Sub16(arg0);
			this.method4118(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 35)
	public void method4116() {
		if (this.aThread2 == null) {
			return;
		}
		this.method4118(new Class2());
		try {
			this.aThread2.join();
		} catch (@Pc(20) InterruptedException local20) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!nl", name = "run", descriptor = "()V", line = 60)
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class135 local8 = this.aClass135_28;
			@Pc(38) Class2_Sub16 local38;
			synchronized (this.aClass135_28) {
				@Pc(15) Class2 local15;
				for (local15 = this.aClass135_28.method3550(); local15 == null; local15 = this.aClass135_28.method3550()) {
					try {
						this.aClass135_28.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class2_Sub16)) {
					return;
				}
				local38 = (Class2_Sub16) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString22).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2416 = local64;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!ag;)V", line = 115)
	private void method4118(@OriginalArg(1) Class2 arg0) {
		@Pc(18) Class135 local18 = this.aClass135_28;
		synchronized (this.aClass135_28) {
			this.aClass135_28.method3541(arg0);
			this.aClass135_28.notify();
		}
	}
}
