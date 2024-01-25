import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class126 implements Runnable {

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!bj;")
	private final Class30 aClass30_6 = new Class30();

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public int anInt4722 = 0;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!nga;)V")
	public Class126(@OriginalArg(0) Class228 arg0) {
		@Pc(20) Class376 local20 = arg0.method5938(5, this);
		while (local20.anInt10510 == 0) {
			Static500.method7308(10L);
		}
		if (local20.anInt10510 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject19;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!wea;)Lclient!ve;")
	public Class3_Sub1_Sub3_Sub2 method3953(@OriginalArg(0) int arg0, @OriginalArg(2) Class370 arg1) {
		@Pc(7) Class3_Sub1_Sub3_Sub2 local7 = new Class3_Sub1_Sub3_Sub2();
		local7.aClass370_4 = arg1;
		local7.anInt9954 = 3;
		local7.aLong275 = arg0;
		local7.aBoolean829 = false;
		this.method3955(local7);
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!ve;)V")
	private void method3955(@OriginalArg(1) Class3_Sub1_Sub3_Sub2 arg0) {
		@Pc(2) Class30 local2 = this.aClass30_6;
		synchronized (this.aClass30_6) {
			this.aClass30_6.method779(arg0);
			this.anInt4722++;
			this.aClass30_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BBLclient!wea;)Lclient!ve;")
	public Class3_Sub1_Sub3_Sub2 method3957(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class370 arg2) {
		@Pc(7) Class3_Sub1_Sub3_Sub2 local7 = new Class3_Sub1_Sub3_Sub2();
		local7.aBoolean829 = false;
		local7.aByteArray103 = arg1;
		local7.anInt9954 = 2;
		local7.aClass370_4 = arg2;
		local7.aLong275 = arg0;
		this.method3955(local7);
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IBLclient!wea;)Lclient!ve;")
	public Class3_Sub1_Sub3_Sub2 method3959(@OriginalArg(0) int arg0, @OriginalArg(2) Class370 arg1) {
		@Pc(9) Class3_Sub1_Sub3_Sub2 local9 = new Class3_Sub1_Sub3_Sub2();
		local9.anInt9954 = 1;
		@Pc(15) Class30 local15 = this.aClass30_6;
		synchronized (this.aClass30_6) {
			@Pc(23) Class3_Sub1_Sub3_Sub2 local23 = (Class3_Sub1_Sub3_Sub2) this.aClass30_6.method780();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong275 == (long) arg0 && local23.aClass370_4 == arg1 && local23.anInt9954 == 2) {
					local9.aByteArray103 = local23.aByteArray103;
					local9.aBoolean830 = false;
					return local9;
				}
				local23 = (Class3_Sub1_Sub3_Sub2) this.aClass30_6.method783();
			}
		}
		local9.aByteArray103 = arg1.method8497(arg0);
		local9.aBoolean829 = true;
		local9.aBoolean830 = false;
		return local9;
	}

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean413) {
			@Pc(6) Class30 local6 = this.aClass30_6;
			@Pc(14) Class3_Sub1_Sub3_Sub2 local14;
			synchronized (this.aClass30_6) {
				local14 = (Class3_Sub1_Sub3_Sub2) this.aClass30_6.method781();
				if (local14 == null) {
					try {
						this.aClass30_6.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4722--;
			}
			try {
				if (local14.anInt9954 == 2) {
					local14.aClass370_4.method8495(local14.aByteArray103, local14.aByteArray103.length, (int) local14.aLong275);
				} else if (local14.anInt9954 == 3) {
					local14.aByteArray103 = local14.aClass370_4.method8497((int) local14.aLong275);
				}
			} catch (@Pc(76) Exception local76) {
				Static544.method7724(null, local76);
			}
			local14.aBoolean830 = false;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
	public void method3960() {
		this.aBoolean413 = true;
		@Pc(9) Class30 local9 = this.aClass30_6;
		synchronized (this.aClass30_6) {
			this.aClass30_6.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}
}
