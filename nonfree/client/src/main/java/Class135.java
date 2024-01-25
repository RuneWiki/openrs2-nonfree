import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class135 implements Runnable {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!ad;")
	private final Class4 aClass4_5 = new Class4();

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public int anInt4051 = 0;

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!kq;)V")
	public Class135(@OriginalArg(0) Class110 arg0) {
		@Pc(20) Class134 local20 = arg0.method3379(5, this);
		while (local20.anInt4033 == 0) {
			Static134.method2598(10L);
		}
		if (local20.anInt4033 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!a;I)V")
	private void method3727(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		@Pc(6) Class4 local6 = this.aClass4_5;
		synchronized (this.aClass4_5) {
			this.aClass4_5.method180(arg0);
			this.anInt4051++;
			this.aClass4_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean341) {
			@Pc(6) Class4 local6 = this.aClass4_5;
			@Pc(14) Class1_Sub1_Sub1_Sub1 local14;
			synchronized (this.aClass4_5) {
				local14 = (Class1_Sub1_Sub1_Sub1) this.aClass4_5.method183();
				if (local14 == null) {
					try {
						this.aClass4_5.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt4051--;
			}
			try {
				if (local14.anInt44 == 2) {
					local14.aClass173_1.method4614(local14.aByteArray1, (int) local14.aLong208, local14.aByteArray1.length);
				} else if (local14.anInt44 == 3) {
					local14.aByteArray1 = local14.aClass173_1.method4615((int) local14.aLong208);
				}
			} catch (@Pc(72) Exception local72) {
				Static152.method2899(null, local72);
			}
			local14.aBoolean154 = false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!rb;I)Lclient!a;")
	public Class1_Sub1_Sub1_Sub1 method3733(@OriginalArg(1) Class173 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub1_Sub1 local12 = new Class1_Sub1_Sub1_Sub1();
		local12.aLong208 = arg1;
		local12.aBoolean155 = false;
		local12.aClass173_1 = arg0;
		local12.anInt44 = 3;
		this.method3727(local12);
		return local12;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIILclient!rb;)Lclient!a;")
	public Class1_Sub1_Sub1_Sub1 method3735(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class173 arg2) {
		@Pc(12) Class1_Sub1_Sub1_Sub1 local12 = new Class1_Sub1_Sub1_Sub1();
		local12.aClass173_1 = arg2;
		local12.aLong208 = arg1;
		local12.anInt44 = 2;
		local12.aByteArray1 = arg0;
		local12.aBoolean155 = false;
		this.method3727(local12);
		return local12;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(ILclient!rb;I)Lclient!a;")
	public Class1_Sub1_Sub1_Sub1 method3738(@OriginalArg(1) Class173 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub1_Sub1_Sub1 local9 = new Class1_Sub1_Sub1_Sub1();
		local9.anInt44 = 1;
		@Pc(20) Class4 local20 = this.aClass4_5;
		synchronized (this.aClass4_5) {
			@Pc(28) Class1_Sub1_Sub1_Sub1 local28 = (Class1_Sub1_Sub1_Sub1) this.aClass4_5.method177();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong208 == (long) arg1 && local28.aClass173_1 == arg0 && local28.anInt44 == 2) {
					local9.aByteArray1 = local28.aByteArray1;
					local9.aBoolean154 = false;
					return local9;
				}
				local28 = (Class1_Sub1_Sub1_Sub1) this.aClass4_5.method182();
			}
		}
		local9.aByteArray1 = arg0.method4615(arg1);
		local9.aBoolean155 = true;
		local9.aBoolean154 = false;
		return local9;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	public void method3739() {
		this.aBoolean341 = true;
		@Pc(9) Class4 local9 = this.aClass4_5;
		synchronized (this.aClass4_5) {
			this.aClass4_5.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}
}
