import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class254 implements Runnable {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!tn;")
	private final Class229 aClass229_6 = new Class229();

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	public int anInt7015 = 0;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class254(@OriginalArg(0) Class66 arg0) {
		@Pc(20) Class199 local20 = arg0.method1741(5, this);
		while (local20.anInt5760 == 0) {
			Static435.method5503(10L);
		}
		if (local20.anInt5760 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject29;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!st;I)Lclient!lf;")
	public Class4_Sub1_Sub6_Sub2 method5431(@OriginalArg(1) Class222 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub1_Sub6_Sub2 local7 = new Class4_Sub1_Sub6_Sub2();
		local7.aBoolean384 = false;
		local7.aClass222_1 = arg0;
		local7.anInt4117 = 3;
		local7.aLong198 = arg1;
		this.method5434(local7);
		return local7;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!st;II)Lclient!lf;")
	public Class4_Sub1_Sub6_Sub2 method5432(@OriginalArg(0) Class222 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub1_Sub6_Sub2 local9 = new Class4_Sub1_Sub6_Sub2();
		local9.anInt4117 = 1;
		@Pc(15) Class229 local15 = this.aClass229_6;
		synchronized (this.aClass229_6) {
			@Pc(23) Class4_Sub1_Sub6_Sub2 local23 = (Class4_Sub1_Sub6_Sub2) this.aClass229_6.method5089();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong198 && local23.aClass222_1 == arg0 && local23.anInt4117 == 2) {
					local9.aBoolean381 = false;
					local9.aByteArray50 = local23.aByteArray50;
					return local9;
				}
				local23 = (Class4_Sub1_Sub6_Sub2) this.aClass229_6.method5092();
			}
		}
		local9.aByteArray50 = arg0.method4981(arg1);
		local9.aBoolean384 = true;
		local9.aBoolean381 = false;
		return local9;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public void method5433() {
		this.aBoolean659 = true;
		@Pc(9) Class229 local9 = this.aClass229_6;
		synchronized (this.aClass229_6) {
			this.aClass229_6.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!vl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean659) {
			@Pc(10) Class229 local10 = this.aClass229_6;
			@Pc(18) Class4_Sub1_Sub6_Sub2 local18;
			synchronized (this.aClass229_6) {
				local18 = (Class4_Sub1_Sub6_Sub2) this.aClass229_6.method5091();
				if (local18 == null) {
					try {
						this.aClass229_6.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt7015--;
			}
			try {
				if (local18.anInt4117 == 2) {
					local18.aClass222_1.method4982(local18.aByteArray50, (int) local18.aLong198, local18.aByteArray50.length);
				} else if (local18.anInt4117 == 3) {
					local18.aByteArray50 = local18.aClass222_1.method4981((int) local18.aLong198);
				}
			} catch (@Pc(74) Exception local74) {
				Static94.method1654(local74, null);
			}
			local18.aBoolean381 = false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!lf;)V")
	private void method5434(@OriginalArg(1) Class4_Sub1_Sub6_Sub2 arg0) {
		@Pc(2) Class229 local2 = this.aClass229_6;
		synchronized (this.aClass229_6) {
			this.aClass229_6.method5088(arg0);
			this.anInt7015++;
			this.aClass229_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[BLclient!st;)Lclient!lf;")
	public Class4_Sub1_Sub6_Sub2 method5435(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class222 arg2) {
		@Pc(13) Class4_Sub1_Sub6_Sub2 local13 = new Class4_Sub1_Sub6_Sub2();
		local13.aLong198 = arg0;
		local13.anInt4117 = 2;
		local13.aByteArray50 = arg1;
		local13.aClass222_1 = arg2;
		local13.aBoolean384 = false;
		this.method5434(local13);
		return local13;
	}
}
