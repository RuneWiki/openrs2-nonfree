import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!ig;")
	private final Class89 aClass89_4 = new Class89();

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
	private boolean aBoolean306 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt4092 = 0;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class143(@OriginalArg(0) Class75 arg0) {
		@Pc(20) Class121 local20 = arg0.method2366(5, this);
		while (local20.anInt3693 == 0) {
			Static135.method2737(10L);
		}
		if (local20.anInt3693 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cq;II)Lclient!pg;")
	public Class1_Sub4_Sub2_Sub2 method3805(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub4_Sub2_Sub2 local15 = new Class1_Sub4_Sub2_Sub2();
		local15.anInt4895 = 1;
		@Pc(21) Class89 local21 = this.aClass89_4;
		synchronized (this.aClass89_4) {
			@Pc(29) Class1_Sub4_Sub2_Sub2 local29 = (Class1_Sub4_Sub2_Sub2) this.aClass89_4.method2718();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg1 == local29.aLong211 && arg0 == local29.aClass28_4 && local29.anInt4895 == 2) {
					local15.aByteArray78 = local29.aByteArray78;
					local15.aBoolean367 = false;
					return local15;
				}
				local29 = (Class1_Sub4_Sub2_Sub2) this.aClass89_4.method2726();
			}
		}
		local15.aByteArray78 = arg0.method1131(arg1);
		local15.aBoolean367 = false;
		local15.aBoolean368 = true;
		return local15;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!cq;)Lclient!pg;")
	public Class1_Sub4_Sub2_Sub2 method3806(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(12) Class1_Sub4_Sub2_Sub2 local12 = new Class1_Sub4_Sub2_Sub2();
		local12.aLong211 = arg0;
		local12.aClass28_4 = arg1;
		local12.anInt4895 = 3;
		local12.aBoolean368 = false;
		this.method3808(local12);
		return local12;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!cq;Z[BI)Lclient!pg;")
	public Class1_Sub4_Sub2_Sub2 method3807(@OriginalArg(0) Class28 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub4_Sub2_Sub2 local7 = new Class1_Sub4_Sub2_Sub2();
		local7.aClass28_4 = arg0;
		local7.aLong211 = arg2;
		local7.aBoolean368 = false;
		local7.aByteArray78 = arg1;
		local7.anInt4895 = 2;
		this.method3808(local7);
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!pg;)V")
	private void method3808(@OriginalArg(1) Class1_Sub4_Sub2_Sub2 arg0) {
		@Pc(2) Class89 local2 = this.aClass89_4;
		synchronized (this.aClass89_4) {
			this.aClass89_4.method2720(arg0);
			this.anInt4092++;
			this.aClass89_4.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean306) {
			@Pc(10) Class89 local10 = this.aClass89_4;
			@Pc(18) Class1_Sub4_Sub2_Sub2 local18;
			synchronized (this.aClass89_4) {
				local18 = (Class1_Sub4_Sub2_Sub2) this.aClass89_4.method2722();
				if (local18 == null) {
					try {
						this.aClass89_4.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt4092--;
			}
			try {
				if (local18.anInt4895 == 2) {
					local18.aClass28_4.method1128((int) local18.aLong211, local18.aByteArray78.length, local18.aByteArray78);
				} else if (local18.anInt4895 == 3) {
					local18.aByteArray78 = local18.aClass28_4.method1131((int) local18.aLong211);
				}
			} catch (@Pc(80) Exception local80) {
				Static119.method2541(null, local80);
			}
			local18.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public void method3810() {
		this.aBoolean306 = true;
		@Pc(9) Class89 local9 = this.aClass89_4;
		synchronized (this.aClass89_4) {
			this.aClass89_4.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread3 = null;
	}
}
