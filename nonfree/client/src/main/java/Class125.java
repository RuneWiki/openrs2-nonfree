import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class125 implements Runnable {

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "Lclient!cba;")
	private final Class38 aClass38_2 = new Class38();

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
	public int anInt3662 = 0;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class125(@OriginalArg(0) Class221 arg0) {
		@Pc(20) Class192 local20 = arg0.method5198(5, this);
		while (local20.anInt5186 == 0) {
			Static374.method5521(10L);
		}
		if (local20.anInt5186 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject30;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!fj;I)Lclient!nn;")
	public Class3_Sub3_Sub2_Sub2 method3227(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1) {
		@Pc(9) Class3_Sub3_Sub2_Sub2 local9 = new Class3_Sub3_Sub2_Sub2();
		local9.anInt6204 = 1;
		@Pc(15) Class38 local15 = this.aClass38_2;
		synchronized (this.aClass38_2) {
			@Pc(23) Class3_Sub3_Sub2_Sub2 local23 = (Class3_Sub3_Sub2_Sub2) this.aClass38_2.method1070();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong265 && arg1 == local23.aClass97_2 && local23.anInt6204 == 2) {
					local9.aByteArray80 = local23.aByteArray80;
					local9.aBoolean507 = false;
					return local9;
				}
				local23 = (Class3_Sub3_Sub2_Sub2) this.aClass38_2.method1072();
			}
		}
		local9.aByteArray80 = arg1.method2752(arg0);
		local9.aBoolean508 = true;
		local9.aBoolean507 = false;
		return local9;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!nn;Z)V")
	private void method3228(@OriginalArg(0) Class3_Sub3_Sub2_Sub2 arg0) {
		@Pc(2) Class38 local2 = this.aClass38_2;
		synchronized (this.aClass38_2) {
			this.aClass38_2.method1069(arg0);
			this.anInt3662++;
			this.aClass38_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BLclient!fj;)Lclient!nn;")
	public Class3_Sub3_Sub2_Sub2 method3229(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class97 arg2) {
		@Pc(13) Class3_Sub3_Sub2_Sub2 local13 = new Class3_Sub3_Sub2_Sub2();
		local13.anInt6204 = 2;
		local13.aByteArray80 = arg1;
		local13.aClass97_2 = arg2;
		local13.aLong265 = arg0;
		local13.aBoolean508 = false;
		this.method3228(local13);
		return local13;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public void method3231() {
		this.aBoolean284 = true;
		@Pc(9) Class38 local9 = this.aClass38_2;
		synchronized (this.aClass38_2) {
			this.aClass38_2.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!fj;)Lclient!nn;")
	public Class3_Sub3_Sub2_Sub2 method3232(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(7) Class3_Sub3_Sub2_Sub2 local7 = new Class3_Sub3_Sub2_Sub2();
		local7.anInt6204 = 3;
		local7.aClass97_2 = arg1;
		local7.aBoolean508 = false;
		local7.aLong265 = arg0;
		this.method3228(local7);
		return local7;
	}

	@OriginalMember(owner = "client!hca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean284) {
			@Pc(10) Class38 local10 = this.aClass38_2;
			@Pc(18) Class3_Sub3_Sub2_Sub2 local18;
			synchronized (this.aClass38_2) {
				local18 = (Class3_Sub3_Sub2_Sub2) this.aClass38_2.method1073();
				if (local18 == null) {
					try {
						this.aClass38_2.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt3662--;
			}
			try {
				if (local18.anInt6204 == 2) {
					local18.aClass97_2.method2754(local18.aByteArray80, local18.aByteArray80.length, (int) local18.aLong265);
				} else if (local18.anInt6204 == 3) {
					local18.aByteArray80 = local18.aClass97_2.method2752((int) local18.aLong265);
				}
			} catch (@Pc(78) Exception local78) {
				Static379.method5607(null, local78);
			}
			local18.aBoolean507 = false;
		}
	}
}
