import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!je;")
	private final Class170 aClass170_10 = new Class170();

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
	public int anInt6065 = 0;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread8;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!laa;)V")
	public Class228(@OriginalArg(0) Class198 arg0) {
		@Pc(20) Class191 local20 = arg0.method4285(5, this);
		while (local20.anInt5014 == 0) {
			Static408.method5841(10L);
		}
		if (local20.anInt5014 == 2) {
			throw new RuntimeException();
		}
		this.aThread8 = (Thread) local20.anObject11;
	}

	@OriginalMember(owner = "client!mu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean468) {
			@Pc(6) Class170 local6 = this.aClass170_10;
			@Pc(14) Class1_Sub8_Sub1_Sub1 local14;
			synchronized (this.aClass170_10) {
				local14 = (Class1_Sub8_Sub1_Sub1) this.aClass170_10.method3543();
				if (local14 == null) {
					try {
						this.aClass170_10.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt6065--;
			}
			try {
				if (local14.anInt619 == 2) {
					local14.aClass313_1.method6693(local14.aByteArray3, (int) local14.aLong263, local14.aByteArray3.length);
				} else if (local14.anInt619 == 3) {
					local14.aByteArray3 = local14.aClass313_1.method6694((int) local14.aLong263);
				}
			} catch (@Pc(72) Exception local72) {
				Static419.method5957(null, local72);
			}
			local14.aBoolean563 = false;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!sp;I)Lclient!aw;")
	public Class1_Sub8_Sub1_Sub1 method4907(@OriginalArg(1) Class313 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub8_Sub1_Sub1 local7 = new Class1_Sub8_Sub1_Sub1();
		local7.aLong263 = arg1;
		local7.aClass313_1 = arg0;
		local7.anInt619 = 3;
		local7.aBoolean564 = false;
		this.method4912(local7);
		return local7;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!sp;[BI)Lclient!aw;")
	public Class1_Sub8_Sub1_Sub1 method4908(@OriginalArg(1) Class313 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub8_Sub1_Sub1 local12 = new Class1_Sub8_Sub1_Sub1();
		local12.anInt619 = 2;
		local12.aLong263 = arg2;
		local12.aByteArray3 = arg1;
		local12.aClass313_1 = arg0;
		local12.aBoolean564 = false;
		this.method4912(local12);
		return local12;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	public void method4909() {
		this.aBoolean468 = true;
		@Pc(9) Class170 local9 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			this.aClass170_10.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILclient!sp;)Lclient!aw;")
	public Class1_Sub8_Sub1_Sub1 method4910(@OriginalArg(1) int arg0, @OriginalArg(2) Class313 arg1) {
		@Pc(9) Class1_Sub8_Sub1_Sub1 local9 = new Class1_Sub8_Sub1_Sub1();
		local9.anInt619 = 1;
		@Pc(21) Class170 local21 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			@Pc(29) Class1_Sub8_Sub1_Sub1 local29 = (Class1_Sub8_Sub1_Sub1) this.aClass170_10.method3553();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong263 && local29.aClass313_1 == arg1 && local29.anInt619 == 2) {
					local9.aBoolean563 = false;
					local9.aByteArray3 = local29.aByteArray3;
					return local9;
				}
				local29 = (Class1_Sub8_Sub1_Sub1) this.aClass170_10.method3544();
			}
		}
		local9.aByteArray3 = arg1.method6694(arg0);
		local9.aBoolean563 = false;
		local9.aBoolean564 = true;
		return local9;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLclient!aw;)V")
	private void method4912(@OriginalArg(1) Class1_Sub8_Sub1_Sub1 arg0) {
		@Pc(6) Class170 local6 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			this.aClass170_10.method3550(arg0);
			this.anInt6065++;
			this.aClass170_10.notifyAll();
		}
	}
}
