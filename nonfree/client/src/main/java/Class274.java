import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_9 = new Class117();

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
	public int anInt7717 = 0;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!gba;)V")
	public Class274(@OriginalArg(0) Class114 arg0) {
		@Pc(20) Class23 local20 = arg0.method2498(this, 5);
		while (local20.anInt875 == 0) {
			Static423.method5918(10L);
		}
		if (local20.anInt875 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!qt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean561) {
			@Pc(6) Class117 local6 = this.aClass117_9;
			@Pc(14) Class1_Sub3_Sub11_Sub1 local14;
			synchronized (this.aClass117_9) {
				local14 = (Class1_Sub3_Sub11_Sub1) this.aClass117_9.method2556();
				if (local14 == null) {
					try {
						this.aClass117_9.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt7717--;
			}
			try {
				if (local14.anInt5943 == 2) {
					local14.aClass57_3.method1622(local14.aByteArray65.length, (int) local14.aLong420, local14.aByteArray65);
				} else if (local14.anInt5943 == 3) {
					local14.aByteArray65 = local14.aClass57_3.method1626((int) local14.aLong420);
				}
			} catch (@Pc(74) Exception local74) {
				Static259.method4059(null, local74);
			}
			local14.aBoolean684 = false;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public void method6340() {
		this.aBoolean561 = true;
		@Pc(9) Class117 local9 = this.aClass117_9;
		synchronized (this.aClass117_9) {
			this.aClass117_9.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!cr;)Lclient!mq;")
	public Class1_Sub3_Sub11_Sub1 method6343(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(14) Class1_Sub3_Sub11_Sub1 local14 = new Class1_Sub3_Sub11_Sub1();
		local14.anInt5943 = 1;
		@Pc(20) Class117 local20 = this.aClass117_9;
		synchronized (this.aClass117_9) {
			@Pc(28) Class1_Sub3_Sub11_Sub1 local28 = (Class1_Sub3_Sub11_Sub1) this.aClass117_9.method2549();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong420 == (long) arg0 && arg1 == local28.aClass57_3 && local28.anInt5943 == 2) {
					local14.aBoolean684 = false;
					local14.aByteArray65 = local28.aByteArray65;
					return local14;
				}
				local28 = (Class1_Sub3_Sub11_Sub1) this.aClass117_9.method2551();
			}
		}
		local14.aByteArray65 = arg1.method1626(arg0);
		local14.aBoolean686 = true;
		local14.aBoolean684 = false;
		return local14;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILclient!cr;)Lclient!mq;")
	public Class1_Sub3_Sub11_Sub1 method6344(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(7) Class1_Sub3_Sub11_Sub1 local7 = new Class1_Sub3_Sub11_Sub1();
		local7.aClass57_3 = arg1;
		local7.aBoolean686 = false;
		local7.anInt5943 = 3;
		local7.aLong420 = arg0;
		this.method6345(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!mq;B)V")
	private void method6345(@OriginalArg(0) Class1_Sub3_Sub11_Sub1 arg0) {
		@Pc(6) Class117 local6 = this.aClass117_9;
		synchronized (this.aClass117_9) {
			this.aClass117_9.method2550(arg0);
			this.anInt7717++;
			this.aClass117_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBLclient!cr;[B)Lclient!mq;")
	public Class1_Sub3_Sub11_Sub1 method6346(@OriginalArg(0) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub3_Sub11_Sub1 local7 = new Class1_Sub3_Sub11_Sub1();
		local7.aClass57_3 = arg1;
		local7.anInt5943 = 2;
		local7.aByteArray65 = arg2;
		local7.aLong420 = arg0;
		local7.aBoolean686 = false;
		this.method6345(local7);
		return local7;
	}
}
