import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!tg;")
	private Class170 aClass170_5 = new Class170();

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt913 = 0;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class31() {
		@Pc(20) Class185 local20 = Static26.aClass154_1.method3881(5, this);
		while (local20.anInt5276 == 0) {
			Static282.method4345(10L);
		}
		if (local20.anInt5276 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!j;I)V")
	private void method801(@OriginalArg(0) Class1_Sub2_Sub4_Sub1 arg0) {
		@Pc(7) Class170 local7 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			this.aClass170_5.method4210(arg0);
			this.anInt913++;
			this.aClass170_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!pj;[BI)Lclient!j;")
	public Class1_Sub2_Sub4_Sub1 method802(@OriginalArg(1) Class138 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub2_Sub4_Sub1 local13 = new Class1_Sub2_Sub4_Sub1();
		local13.aLong196 = arg2;
		local13.anInt2550 = 2;
		local13.aByteArray29 = arg1;
		local13.aClass138_1 = arg0;
		local13.aBoolean297 = false;
		this.method801(local13);
		return local13;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!pj;II)Lclient!j;")
	public Class1_Sub2_Sub4_Sub1 method803(@OriginalArg(0) Class138 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub4_Sub1 local9 = new Class1_Sub2_Sub4_Sub1();
		local9.anInt2550 = 1;
		@Pc(16) Class170 local16 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			@Pc(31) Class1_Sub2_Sub4_Sub1 local31 = (Class1_Sub2_Sub4_Sub1) this.aClass170_5.method4212();
			while (true) {
				if (local31 == null) {
					break;
				}
				if (local31.aLong196 == (long) arg1 && local31.aClass138_1 == arg0 && local31.anInt2550 == 2) {
					local9.aByteArray29 = local31.aByteArray29;
					local9.aBoolean296 = false;
					return local9;
				}
				local31 = (Class1_Sub2_Sub4_Sub1) this.aClass170_5.method4207();
			}
		}
		local9.aByteArray29 = arg0.method3445(arg1);
		local9.aBoolean297 = true;
		local9.aBoolean296 = false;
		return local9;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!pj;II)Lclient!j;")
	public Class1_Sub2_Sub4_Sub1 method804(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub4_Sub1 local7 = new Class1_Sub2_Sub4_Sub1();
		local7.aBoolean297 = false;
		local7.aLong196 = arg1;
		local7.aClass138_1 = arg0;
		local7.anInt2550 = 3;
		this.method801(local7);
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean48) {
			@Pc(8) Class170 local8 = this.aClass170_5;
			@Pc(15) Class1_Sub2_Sub4_Sub1 local15;
			synchronized (this.aClass170_5) {
				local15 = (Class1_Sub2_Sub4_Sub1) this.aClass170_5.method4211();
				if (local15 == null) {
					try {
						this.aClass170_5.wait();
					} catch (@Pc(30) InterruptedException local30) {
					}
					continue;
				}
				this.anInt913--;
			}
			try {
				if (local15.anInt2550 == 2) {
					local15.aClass138_1.method3446(local15.aByteArray29.length, (int) local15.aLong196, local15.aByteArray29);
				} else if (local15.anInt2550 == 3) {
					local15.aByteArray29 = local15.aClass138_1.method3445((int) local15.aLong196);
				}
			} catch (@Pc(80) Exception local80) {
				Static159.method2733(local80, null);
			}
			local15.aBoolean296 = false;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public void method810() {
		this.aBoolean48 = true;
		@Pc(10) Class170 local10 = this.aClass170_5;
		synchronized (this.aClass170_5) {
			this.aClass170_5.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}
}
