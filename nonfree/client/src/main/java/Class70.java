import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!ot;")
	private final Class174 aClass174_9 = new Class174();

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt1719 = 0;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!dq;)V")
	public Class70(@OriginalArg(0) Class53 arg0) {
		@Pc(20) Class1 local20 = arg0.method1169(this, 5);
		while (local20.anInt2 == 0) {
			Static185.method3004(10L);
		}
		if (local20.anInt2 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method1544() {
		this.aBoolean147 = true;
		@Pc(9) Class174 local9 = this.aClass174_9;
		synchronized (this.aClass174_9) {
			this.aClass174_9.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!rn;)V")
	private void method1545(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		@Pc(6) Class174 local6 = this.aClass174_9;
		synchronized (this.aClass174_9) {
			this.aClass174_9.method4099(arg0);
			this.anInt1719++;
			this.aClass174_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!nk;II)Lclient!rn;")
	public Class2_Sub1_Sub3_Sub2 method1546(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub1_Sub3_Sub2 local7 = new Class2_Sub1_Sub3_Sub2();
		local7.aLong209 = arg1;
		local7.aClass161_4 = arg0;
		local7.aBoolean432 = false;
		local7.anInt5541 = 3;
		this.method1545(local7);
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILclient!nk;)Lclient!rn;")
	public Class2_Sub1_Sub3_Sub2 method1547(@OriginalArg(1) int arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(9) Class2_Sub1_Sub3_Sub2 local9 = new Class2_Sub1_Sub3_Sub2();
		local9.anInt5541 = 1;
		@Pc(15) Class174 local15 = this.aClass174_9;
		synchronized (this.aClass174_9) {
			@Pc(23) Class2_Sub1_Sub3_Sub2 local23 = (Class2_Sub1_Sub3_Sub2) this.aClass174_9.method4102();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong209 == (long) arg0 && arg1 == local23.aClass161_4 && local23.anInt5541 == 2) {
					local9.aByteArray89 = local23.aByteArray89;
					local9.aBoolean434 = false;
					return local9;
				}
				local23 = (Class2_Sub1_Sub3_Sub2) this.aClass174_9.method4098();
			}
		}
		local9.aByteArray89 = arg1.method3866(arg0);
		local9.aBoolean434 = false;
		local9.aBoolean432 = true;
		return local9;
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean147) {
			@Pc(6) Class174 local6 = this.aClass174_9;
			@Pc(14) Class2_Sub1_Sub3_Sub2 local14;
			synchronized (this.aClass174_9) {
				local14 = (Class2_Sub1_Sub3_Sub2) this.aClass174_9.method4104();
				if (local14 == null) {
					try {
						this.aClass174_9.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt1719--;
			}
			try {
				if (local14.anInt5541 == 2) {
					local14.aClass161_4.method3872((int) local14.aLong209, local14.aByteArray89, local14.aByteArray89.length);
				} else if (local14.anInt5541 == 3) {
					local14.aByteArray89 = local14.aClass161_4.method3866((int) local14.aLong209);
				}
			} catch (@Pc(72) Exception local72) {
				Static235.method3843(null, local72);
			}
			local14.aBoolean434 = false;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B[BILclient!nk;)Lclient!rn;")
	public Class2_Sub1_Sub3_Sub2 method1548(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class161 arg2) {
		@Pc(7) Class2_Sub1_Sub3_Sub2 local7 = new Class2_Sub1_Sub3_Sub2();
		local7.aByteArray89 = arg0;
		local7.anInt5541 = 2;
		local7.aClass161_4 = arg2;
		local7.aBoolean432 = false;
		local7.aLong209 = arg1;
		this.method1545(local7);
		return local7;
	}
}
