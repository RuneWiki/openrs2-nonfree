import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class216 implements Runnable {

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "Lclient!jh;")
	private final Class123 aClass123_10 = new Class123();

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	public int anInt5918 = 0;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class216(@OriginalArg(0) Class93 arg0) {
		@Pc(20) Class268 local20 = arg0.method2076(5, this);
		while (local20.anInt7420 == 0) {
			Static140.method2004(10L);
		}
		if (local20.anInt7420 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject10;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
	public void method4707() {
		this.aBoolean398 = true;
		@Pc(9) Class123 local9 = this.aClass123_10;
		synchronized (this.aClass123_10) {
			this.aClass123_10.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!bh;)V")
	private void method4708(@OriginalArg(1) Class5_Sub2_Sub3_Sub1 arg0) {
		@Pc(2) Class123 local2 = this.aClass123_10;
		synchronized (this.aClass123_10) {
			this.aClass123_10.method2620(arg0);
			this.anInt5918++;
			this.aClass123_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I[BILclient!cn;)Lclient!bh;")
	public Class5_Sub2_Sub3_Sub1 method4709(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class35 arg2) {
		@Pc(7) Class5_Sub2_Sub3_Sub1 local7 = new Class5_Sub2_Sub3_Sub1();
		local7.aByteArray7 = arg1;
		local7.aLong235 = arg0;
		local7.aClass35_1 = arg2;
		local7.aBoolean404 = false;
		local7.anInt616 = 2;
		this.method4708(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!cn;B)Lclient!bh;")
	public Class5_Sub2_Sub3_Sub1 method4710(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1) {
		@Pc(7) Class5_Sub2_Sub3_Sub1 local7 = new Class5_Sub2_Sub3_Sub1();
		local7.aBoolean404 = false;
		local7.anInt616 = 3;
		local7.aLong235 = arg0;
		local7.aClass35_1 = arg1;
		this.method4708(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ru", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean398) {
			@Pc(10) Class123 local10 = this.aClass123_10;
			@Pc(18) Class5_Sub2_Sub3_Sub1 local18;
			synchronized (this.aClass123_10) {
				local18 = (Class5_Sub2_Sub3_Sub1) this.aClass123_10.method2619();
				if (local18 == null) {
					try {
						this.aClass123_10.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt5918--;
			}
			try {
				if (local18.anInt616 == 2) {
					local18.aClass35_1.method935((int) local18.aLong235, local18.aByteArray7, local18.aByteArray7.length);
				} else if (local18.anInt616 == 3) {
					local18.aByteArray7 = local18.aClass35_1.method937((int) local18.aLong235);
				}
			} catch (@Pc(78) Exception local78) {
				Static206.method2769(null, local78);
			}
			local18.aBoolean403 = false;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!cn;II)Lclient!bh;")
	public Class5_Sub2_Sub3_Sub1 method4711(@OriginalArg(0) Class35 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub2_Sub3_Sub1 local9 = new Class5_Sub2_Sub3_Sub1();
		local9.anInt616 = 1;
		@Pc(15) Class123 local15 = this.aClass123_10;
		synchronized (this.aClass123_10) {
			@Pc(32) Class5_Sub2_Sub3_Sub1 local32 = (Class5_Sub2_Sub3_Sub1) this.aClass123_10.method2616();
			while (true) {
				if (local32 == null) {
					break;
				}
				if ((long) arg1 == local32.aLong235 && arg0 == local32.aClass35_1 && local32.anInt616 == 2) {
					local9.aByteArray7 = local32.aByteArray7;
					local9.aBoolean403 = false;
					return local9;
				}
				local32 = (Class5_Sub2_Sub3_Sub1) this.aClass123_10.method2618();
			}
		}
		local9.aByteArray7 = arg0.method937(arg1);
		local9.aBoolean404 = true;
		local9.aBoolean403 = false;
		return local9;
	}
}
