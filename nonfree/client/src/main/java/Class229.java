import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class229 implements Runnable {

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!gm;")
	private final Class125 aClass125_9 = new Class125();

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public int anInt5697 = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class229(@OriginalArg(0) Class109 arg0) {
		@Pc(20) Class260 local20 = arg0.method2177(this, 5);
		while (local20.anInt7041 == 0) {
			Static391.method5400(10L);
		}
		if (local20.anInt7041 == 2) {
			throw new RuntimeException();
		}
		this.aThread6 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!jj;Z)V")
	private void method4672(@OriginalArg(0) Class1_Sub6_Sub2_Sub1 arg0) {
		@Pc(6) Class125 local6 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method2426(arg0);
			this.anInt5697++;
			this.aClass125_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public void method4673() {
		this.aBoolean450 = true;
		@Pc(13) Class125 local13 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BILclient!wo;)Lclient!jj;")
	public Class1_Sub6_Sub2_Sub1 method4674(@OriginalArg(1) int arg0, @OriginalArg(2) Class360 arg1) {
		@Pc(9) Class1_Sub6_Sub2_Sub1 local9 = new Class1_Sub6_Sub2_Sub1();
		local9.anInt4512 = 1;
		@Pc(20) Class125 local20 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			@Pc(28) Class1_Sub6_Sub2_Sub1 local28 = (Class1_Sub6_Sub2_Sub1) this.aClass125_9.method2423();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong293 == (long) arg0 && arg1 == local28.aClass360_1 && local28.anInt4512 == 2) {
					local9.aBoolean688 = false;
					local9.aByteArray50 = local28.aByteArray50;
					return local9;
				}
				local28 = (Class1_Sub6_Sub2_Sub1) this.aClass125_9.method2428();
			}
		}
		local9.aByteArray50 = arg1.method7820(arg0);
		local9.aBoolean688 = false;
		local9.aBoolean689 = true;
		return local9;
	}

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean450) {
			@Pc(6) Class125 local6 = this.aClass125_9;
			@Pc(14) Class1_Sub6_Sub2_Sub1 local14;
			synchronized (this.aClass125_9) {
				local14 = (Class1_Sub6_Sub2_Sub1) this.aClass125_9.method2421();
				if (local14 == null) {
					try {
						this.aClass125_9.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt5697--;
			}
			try {
				if (local14.anInt4512 == 2) {
					local14.aClass360_1.method7819((int) local14.aLong293, local14.aByteArray50.length, local14.aByteArray50);
				} else if (local14.anInt4512 == 3) {
					local14.aByteArray50 = local14.aClass360_1.method7820((int) local14.aLong293);
				}
			} catch (@Pc(72) Exception local72) {
				Static345.method4708(local72, null);
			}
			local14.aBoolean688 = false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!wo;)Lclient!jj;")
	public Class1_Sub6_Sub2_Sub1 method4675(@OriginalArg(0) int arg0, @OriginalArg(2) Class360 arg1) {
		@Pc(16) Class1_Sub6_Sub2_Sub1 local16 = new Class1_Sub6_Sub2_Sub1();
		local16.aClass360_1 = arg1;
		local16.anInt4512 = 3;
		local16.aBoolean689 = false;
		local16.aLong293 = arg0;
		this.method4672(local16);
		return local16;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BLclient!wo;)Lclient!jj;")
	public Class1_Sub6_Sub2_Sub1 method4677(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class360 arg2) {
		@Pc(7) Class1_Sub6_Sub2_Sub1 local7 = new Class1_Sub6_Sub2_Sub1();
		local7.aBoolean689 = false;
		local7.aLong293 = arg0;
		local7.aClass360_1 = arg2;
		local7.anInt4512 = 2;
		local7.aByteArray50 = arg1;
		this.method4672(local7);
		return local7;
	}
}
