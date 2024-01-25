import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class167 implements Runnable {

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!bo;")
	private final Class30 aClass30_9 = new Class30();

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	public int anInt4914 = 0;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray2[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class167(@OriginalArg(0) Class21 arg0) {
		@Pc(20) Class99 local20 = arg0.method375(5, this);
		while (local20.anInt2836 == 0) {
			Static129.method2634(10L);
		}
		if (local20.anInt2836 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!an;BI)Lclient!ej;")
	public Class7_Sub1_Sub8_Sub1 method4276(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class7_Sub1_Sub8_Sub1 local12 = new Class7_Sub1_Sub8_Sub1();
		local12.aBoolean445 = false;
		local12.aLong222 = arg1;
		local12.anInt1817 = 3;
		local12.aClass13_1 = arg0;
		this.method4281(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method4277() {
		this.aBoolean360 = true;
		@Pc(9) Class30 local9 = this.aClass30_9;
		synchronized (this.aClass30_9) {
			this.aClass30_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!an;[B)Lclient!ej;")
	public Class7_Sub1_Sub8_Sub1 method4279(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) Class7_Sub1_Sub8_Sub1 local12 = new Class7_Sub1_Sub8_Sub1();
		local12.aByteArray23 = arg2;
		local12.aClass13_1 = arg1;
		local12.anInt1817 = 2;
		local12.aBoolean445 = false;
		local12.aLong222 = arg0;
		this.method4281(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ej;)V")
	private void method4281(@OriginalArg(1) Class7_Sub1_Sub8_Sub1 arg0) {
		@Pc(2) Class30 local2 = this.aClass30_9;
		synchronized (this.aClass30_9) {
			this.aClass30_9.method515(arg0);
			this.anInt4914++;
			this.aClass30_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ps", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean360) {
			@Pc(6) Class30 local6 = this.aClass30_9;
			@Pc(14) Class7_Sub1_Sub8_Sub1 local14;
			synchronized (this.aClass30_9) {
				local14 = (Class7_Sub1_Sub8_Sub1) this.aClass30_9.method514();
				if (local14 == null) {
					try {
						this.aClass30_9.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4914--;
			}
			try {
				if (local14.anInt1817 == 2) {
					local14.aClass13_1.method209(local14.aByteArray23, (int) local14.aLong222, local14.aByteArray23.length);
				} else if (local14.anInt1817 == 3) {
					local14.aByteArray23 = local14.aClass13_1.method207((int) local14.aLong222);
				}
			} catch (@Pc(72) Exception local72) {
				Static46.method1056(null, local72);
			}
			local14.aBoolean447 = false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!an;II)Lclient!ej;")
	public Class7_Sub1_Sub8_Sub1 method4283(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class7_Sub1_Sub8_Sub1 local7 = new Class7_Sub1_Sub8_Sub1();
		local7.anInt1817 = 1;
		@Pc(13) Class30 local13 = this.aClass30_9;
		synchronized (this.aClass30_9) {
			@Pc(26) Class7_Sub1_Sub8_Sub1 local26 = (Class7_Sub1_Sub8_Sub1) this.aClass30_9.method505();
			while (true) {
				if (local26 == null) {
					break;
				}
				if ((long) arg1 == local26.aLong222 && arg0 == local26.aClass13_1 && local26.anInt1817 == 2) {
					local7.aByteArray23 = local26.aByteArray23;
					local7.aBoolean447 = false;
					return local7;
				}
				local26 = (Class7_Sub1_Sub8_Sub1) this.aClass30_9.method508();
			}
		}
		local7.aByteArray23 = arg0.method207(arg1);
		local7.aBoolean445 = true;
		local7.aBoolean447 = false;
		return local7;
	}
}
