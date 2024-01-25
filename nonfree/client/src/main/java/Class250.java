import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class250 implements Runnable {

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Lclient!oa;")
	private final Class170 aClass170_10 = new Class170();

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	public int anInt6372 = 0;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
	private boolean aBoolean587 = false;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class250(@OriginalArg(0) Class162 arg0) {
		@Pc(20) Class112 local20 = arg0.method3278(5, this);
		while (local20.anInt2969 == 0) {
			Static57.method5056(10L);
		}
		if (local20.anInt2969 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public void method5527() {
		this.aBoolean587 = true;
		@Pc(9) Class170 local9 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			this.aClass170_10.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!wo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean587) {
			@Pc(6) Class170 local6 = this.aClass170_10;
			@Pc(14) Class1_Sub6_Sub10_Sub2 local14;
			synchronized (this.aClass170_10) {
				local14 = (Class1_Sub6_Sub10_Sub2) this.aClass170_10.method3684();
				if (local14 == null) {
					try {
						this.aClass170_10.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt6372--;
			}
			try {
				if (local14.anInt6426 == 2) {
					local14.aClass38_4.method654((int) local14.aLong208, local14.aByteArray98, local14.aByteArray98.length);
				} else if (local14.anInt6426 == 3) {
					local14.aByteArray98 = local14.aClass38_4.method651((int) local14.aLong208);
				}
			} catch (@Pc(72) Exception local72) {
				Static62.method1006(local72, null);
			}
			local14.aBoolean595 = false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!wt;)V")
	private void method5530(@OriginalArg(1) Class1_Sub6_Sub10_Sub2 arg0) {
		@Pc(6) Class170 local6 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			this.aClass170_10.method3690(arg0);
			this.anInt6372++;
			this.aClass170_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BLclient!ce;I)Lclient!wt;")
	public Class1_Sub6_Sub10_Sub2 method5531(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class38 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub6_Sub10_Sub2 local7 = new Class1_Sub6_Sub10_Sub2();
		local7.aBoolean596 = false;
		local7.anInt6426 = 2;
		local7.aClass38_4 = arg1;
		local7.aByteArray98 = arg0;
		local7.aLong208 = arg2;
		this.method5530(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ce;II)Lclient!wt;")
	public Class1_Sub6_Sub10_Sub2 method5532(@OriginalArg(0) Class38 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub6_Sub10_Sub2 local7 = new Class1_Sub6_Sub10_Sub2();
		local7.aBoolean596 = false;
		local7.aClass38_4 = arg0;
		local7.anInt6426 = 3;
		local7.aLong208 = arg1;
		this.method5530(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ce;I)Lclient!wt;")
	public Class1_Sub6_Sub10_Sub2 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1) {
		@Pc(9) Class1_Sub6_Sub10_Sub2 local9 = new Class1_Sub6_Sub10_Sub2();
		local9.anInt6426 = 1;
		@Pc(15) Class170 local15 = this.aClass170_10;
		synchronized (this.aClass170_10) {
			@Pc(29) Class1_Sub6_Sub10_Sub2 local29 = (Class1_Sub6_Sub10_Sub2) this.aClass170_10.method3685();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong208 == (long) arg0 && arg1 == local29.aClass38_4 && local29.anInt6426 == 2) {
					local9.aByteArray98 = local29.aByteArray98;
					local9.aBoolean595 = false;
					return local9;
				}
				local29 = (Class1_Sub6_Sub10_Sub2) this.aClass170_10.method3688();
			}
		}
		local9.aByteArray98 = arg1.method651(arg0);
		local9.aBoolean596 = true;
		local9.aBoolean595 = false;
		return local9;
	}
}
