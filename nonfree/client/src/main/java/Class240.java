import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class240 implements Runnable {

	@OriginalMember(owner = "client!nja", name = "f", descriptor = "Lclient!dha;")
	private final Class74 aClass74_8 = new Class74();

	@OriginalMember(owner = "client!nja", name = "j", descriptor = "I")
	public int anInt6452 = 0;

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!nja", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!qn;)V")
	public Class240(@OriginalArg(0) Class291 arg0) {
		@Pc(20) Class81 local20 = arg0.method7136(this, 5);
		while (local20.anInt2532 == 0) {
			Static373.method5403(10L);
		}
		if (local20.anInt2532 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILclient!tk;[BI)Lclient!ci;")
	public Class3_Sub11_Sub2_Sub1 method5737(@OriginalArg(0) int arg0, @OriginalArg(1) Class337 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class3_Sub11_Sub2_Sub1 local7 = new Class3_Sub11_Sub2_Sub1();
		local7.aClass337_3 = arg1;
		local7.anInt1388 = 2;
		local7.aBoolean238 = false;
		local7.aLong310 = (long) arg0;
		local7.aByteArray10 = arg2;
		this.method5740(local7);
		return local7;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ILclient!tk;I)Lclient!ci;")
	public Class3_Sub11_Sub2_Sub1 method5738(@OriginalArg(1) Class337 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub11_Sub2_Sub1 local7 = new Class3_Sub11_Sub2_Sub1();
		local7.aClass337_3 = arg0;
		local7.anInt1388 = 3;
		local7.aLong310 = (long) arg1;
		local7.aBoolean238 = false;
		this.method5740(local7);
		return local7;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILclient!tk;)Lclient!ci;")
	public Class3_Sub11_Sub2_Sub1 method5739(@OriginalArg(1) int arg0, @OriginalArg(2) Class337 arg1) {
		@Pc(9) Class3_Sub11_Sub2_Sub1 local9 = new Class3_Sub11_Sub2_Sub1();
		local9.anInt1388 = 1;
		@Pc(15) Class74 local15 = this.aClass74_8;
		synchronized (this.aClass74_8) {
			@Pc(32) Class3_Sub11_Sub2_Sub1 local32 = (Class3_Sub11_Sub2_Sub1) this.aClass74_8.method1842();
			while (true) {
				if (local32 == null) {
					break;
				}
				if (local32.aLong310 == (long) arg0 && local32.aClass337_3 == arg1 && local32.anInt1388 == 2) {
					local9.aBoolean237 = false;
					local9.aByteArray10 = local32.aByteArray10;
					return local9;
				}
				local32 = (Class3_Sub11_Sub2_Sub1) this.aClass74_8.method1844();
			}
		}
		local9.aByteArray10 = arg1.method8159(arg0);
		local9.aBoolean238 = true;
		local9.aBoolean237 = false;
		return local9;
	}

	@OriginalMember(owner = "client!nja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean454) {
			@Pc(10) Class74 local10 = this.aClass74_8;
			@Pc(18) Class3_Sub11_Sub2_Sub1 local18;
			synchronized (this.aClass74_8) {
				local18 = (Class3_Sub11_Sub2_Sub1) this.aClass74_8.method1843();
				if (local18 == null) {
					try {
						this.aClass74_8.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6452--;
			}
			try {
				if (local18.anInt1388 == 2) {
					local18.aClass337_3.method8160((int) local18.aLong310, local18.aByteArray10, local18.aByteArray10.length);
				} else if (local18.anInt1388 == 3) {
					local18.aByteArray10 = local18.aClass337_3.method8159((int) local18.aLong310);
				}
			} catch (@Pc(78) Exception local78) {
				Static503.method7153((String) null, local78);
			}
			local18.aBoolean237 = false;
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZLclient!ci;)V")
	private void method5740(@OriginalArg(1) Class3_Sub11_Sub2_Sub1 arg0) {
		@Pc(6) Class74 local6 = this.aClass74_8;
		synchronized (this.aClass74_8) {
			this.aClass74_8.method1840(arg0);
			this.anInt6452++;
			this.aClass74_8.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V")
	public void method5741() {
		this.aBoolean454 = true;
		@Pc(9) Class74 local9 = this.aClass74_8;
		synchronized (this.aClass74_8) {
			this.aClass74_8.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
		this.aThread5 = null;
	}
}
