import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class225 implements Runnable {

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!gd;")
	private final Class120 aClass120_8 = new Class120();

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "Z")
	private boolean aBoolean441 = false;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	public int anInt6471 = 0;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!wv;)V")
	public Class225(@OriginalArg(0) Class366 arg0) {
		@Pc(20) Class316 local20 = arg0.method8285(this, 5);
		while (local20.anInt9478 == 0) {
			Static214.method3478(10L);
		}
		if (local20.anInt9478 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject136;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public void method5099() {
		this.aBoolean441 = true;
		@Pc(9) Class120 local9 = this.aClass120_8;
		synchronized (this.aClass120_8) {
			this.aClass120_8.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!ms", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean441) {
			@Pc(10) Class120 local10 = this.aClass120_8;
			@Pc(18) Class4_Sub6_Sub6_Sub2 local18;
			synchronized (this.aClass120_8) {
				local18 = (Class4_Sub6_Sub6_Sub2) this.aClass120_8.method2667();
				if (local18 == null) {
					try {
						this.aClass120_8.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt6471--;
			}
			try {
				if (local18.anInt8820 == 2) {
					local18.aClass346_5.method7941((int) local18.aLong286, local18.aByteArray85, local18.aByteArray85.length);
				} else if (local18.anInt8820 == 3) {
					local18.aByteArray85 = local18.aClass346_5.method7944((int) local18.aLong286);
				}
			} catch (@Pc(78) Exception local78) {
				Static109.method2014(null, local78);
			}
			local18.aBoolean619 = false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!rn;I)V")
	private void method5101(@OriginalArg(0) Class4_Sub6_Sub6_Sub2 arg0) {
		@Pc(14) Class120 local14 = this.aClass120_8;
		synchronized (this.aClass120_8) {
			this.aClass120_8.method2669(arg0);
			this.anInt6471++;
			this.aClass120_8.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([BILclient!vm;I)Lclient!rn;")
	public Class4_Sub6_Sub6_Sub2 method5102(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class346 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub6_Sub6_Sub2 local7 = new Class4_Sub6_Sub6_Sub2();
		local7.aBoolean617 = false;
		local7.anInt8820 = 2;
		local7.aClass346_5 = arg1;
		local7.aByteArray85 = arg0;
		local7.aLong286 = arg2;
		this.method5101(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!vm;)Lclient!rn;")
	public Class4_Sub6_Sub6_Sub2 method5103(@OriginalArg(1) int arg0, @OriginalArg(2) Class346 arg1) {
		@Pc(9) Class4_Sub6_Sub6_Sub2 local9 = new Class4_Sub6_Sub6_Sub2();
		local9.anInt8820 = 1;
		@Pc(15) Class120 local15 = this.aClass120_8;
		synchronized (this.aClass120_8) {
			@Pc(23) Class4_Sub6_Sub6_Sub2 local23 = (Class4_Sub6_Sub6_Sub2) this.aClass120_8.method2674();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong286 && local23.aClass346_5 == arg1 && local23.anInt8820 == 2) {
					local9.aBoolean619 = false;
					local9.aByteArray85 = local23.aByteArray85;
					return local9;
				}
				local23 = (Class4_Sub6_Sub6_Sub2) this.aClass120_8.method2671();
			}
		}
		local9.aByteArray85 = arg1.method7944(arg0);
		local9.aBoolean617 = true;
		local9.aBoolean619 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!vm;BI)Lclient!rn;")
	public Class4_Sub6_Sub6_Sub2 method5104(@OriginalArg(0) Class346 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub6_Sub6_Sub2 local7 = new Class4_Sub6_Sub6_Sub2();
		local7.aBoolean617 = false;
		local7.anInt8820 = 3;
		local7.aLong286 = arg1;
		local7.aClass346_5 = arg0;
		this.method5101(local7);
		return local7;
	}
}
