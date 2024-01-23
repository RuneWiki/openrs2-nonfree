import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class178 implements Runnable {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!wg;")
	private Class189 aClass189_12 = new Class189();

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	public int anInt5305 = 0;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class178() {
		@Pc(20) Class153 local20 = Static222.aClass176_3.method4373(5, this);
		while (local20.anInt4614 == 0) {
			Static16.method242(10L);
		}
		if (local20.anInt4614 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!sl;)V")
	private void method4409(@OriginalArg(1) Class1_Sub5_Sub3_Sub2 arg0) {
		@Pc(7) Class189 local7 = this.aClass189_12;
		synchronized (this.aClass189_12) {
			this.aClass189_12.method4603(arg0);
			this.anInt5305++;
			this.aClass189_12.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qe;IB)Lclient!sl;")
	public Class1_Sub5_Sub3_Sub2 method4411(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class1_Sub5_Sub3_Sub2 local5 = new Class1_Sub5_Sub3_Sub2();
		local5.anInt4805 = 1;
		@Pc(16) Class189 local16 = this.aClass189_12;
		synchronized (this.aClass189_12) {
			@Pc(23) Class1_Sub5_Sub3_Sub2 local23 = (Class1_Sub5_Sub3_Sub2) this.aClass189_12.method4600();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong211 && arg0 == local23.aClass141_4 && local23.anInt4805 == 2) {
					local5.aByteArray166 = local23.aByteArray166;
					local5.aBoolean460 = false;
					return local5;
				}
				local23 = (Class1_Sub5_Sub3_Sub2) this.aClass189_12.method4601();
			}
		}
		local5.aByteArray166 = arg0.method3626(arg1);
		local5.aBoolean460 = false;
		local5.aBoolean462 = true;
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean501) {
			@Pc(8) Class189 local8 = this.aClass189_12;
			@Pc(15) Class1_Sub5_Sub3_Sub2 local15;
			synchronized (this.aClass189_12) {
				local15 = (Class1_Sub5_Sub3_Sub2) this.aClass189_12.method4602();
				if (local15 == null) {
					try {
						this.aClass189_12.wait();
					} catch (@Pc(30) InterruptedException local30) {
					}
					continue;
				}
				this.anInt5305--;
			}
			try {
				if (local15.anInt4805 == 2) {
					local15.aClass141_4.method3625(local15.aByteArray166, (int) local15.aLong211, local15.aByteArray166.length);
				} else if (local15.anInt4805 == 3) {
					local15.aByteArray166 = local15.aClass141_4.method3626((int) local15.aLong211);
				}
			} catch (@Pc(79) Exception local79) {
				Static6.method4140(local79, null);
			}
			local15.aBoolean460 = false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qe;I[BZ)Lclient!sl;")
	public Class1_Sub5_Sub3_Sub2 method4413(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(13) Class1_Sub5_Sub3_Sub2 local13 = new Class1_Sub5_Sub3_Sub2();
		local13.aBoolean462 = false;
		local13.aLong211 = arg1;
		local13.anInt4805 = 2;
		local13.aByteArray166 = arg2;
		local13.aClass141_4 = arg0;
		this.method4409(local13);
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!qe;IB)Lclient!sl;")
	public Class1_Sub5_Sub3_Sub2 method4416(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub5_Sub3_Sub2 local13 = new Class1_Sub5_Sub3_Sub2();
		local13.aLong211 = arg1;
		local13.anInt4805 = 3;
		local13.aClass141_4 = arg0;
		local13.aBoolean462 = false;
		this.method4409(local13);
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method4418() {
		this.aBoolean501 = true;
		@Pc(10) Class189 local10 = this.aClass189_12;
		synchronized (this.aClass189_12) {
			this.aClass189_12.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread3 = null;
	}
}
