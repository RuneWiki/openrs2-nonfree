import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class162 implements Runnable {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!tf;")
	private final Class279 aClass279_7 = new Class279();

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public int anInt5092 = 0;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class162(@OriginalArg(0) Class285 arg0) {
		@Pc(20) Class212 local20 = arg0.method7050(5, this);
		while (local20.anInt6547 == 0) {
			Static327.method5231(10L);
		}
		if (local20.anInt6547 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean348) {
			@Pc(10) Class279 local10 = this.aClass279_7;
			@Pc(18) Class3_Sub10_Sub1_Sub2 local18;
			synchronized (this.aClass279_7) {
				local18 = (Class3_Sub10_Sub1_Sub2) this.aClass279_7.method6909();
				if (local18 == null) {
					try {
						this.aClass279_7.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt5092--;
			}
			try {
				if (local18.anInt5913 == 2) {
					local18.aClass182_2.method4850((int) local18.aLong277, local18.aByteArray57, local18.aByteArray57.length);
				} else if (local18.anInt5913 == 3) {
					local18.aByteArray57 = local18.aClass182_2.method4847((int) local18.aLong277);
				}
			} catch (@Pc(78) Exception local78) {
				Static2.method220(local78, null);
			}
			local18.aBoolean382 = false;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!ls;)Lclient!md;")
	public Class3_Sub10_Sub1_Sub2 method4271(@OriginalArg(0) int arg0, @OriginalArg(2) Class182 arg1) {
		@Pc(9) Class3_Sub10_Sub1_Sub2 local9 = new Class3_Sub10_Sub1_Sub2();
		local9.anInt5913 = 1;
		@Pc(15) Class279 local15 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			@Pc(29) Class3_Sub10_Sub1_Sub2 local29 = (Class3_Sub10_Sub1_Sub2) this.aClass279_7.method6908();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong277 && arg1 == local29.aClass182_2 && local29.anInt5913 == 2) {
					local9.aBoolean382 = false;
					local9.aByteArray57 = local29.aByteArray57;
					return local9;
				}
				local29 = (Class3_Sub10_Sub1_Sub2) this.aClass279_7.method6906();
			}
		}
		local9.aByteArray57 = arg1.method4847(arg0);
		local9.aBoolean381 = true;
		local9.aBoolean382 = false;
		return local9;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public void method4273() {
		this.aBoolean348 = true;
		@Pc(13) Class279 local13 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			this.aClass279_7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLclient!ls;)Lclient!md;")
	public Class3_Sub10_Sub1_Sub2 method4275(@OriginalArg(0) int arg0, @OriginalArg(2) Class182 arg1) {
		@Pc(7) Class3_Sub10_Sub1_Sub2 local7 = new Class3_Sub10_Sub1_Sub2();
		local7.aClass182_2 = arg1;
		local7.anInt5913 = 3;
		local7.aLong277 = arg0;
		local7.aBoolean381 = false;
		this.method4278(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BILclient!ls;I)Lclient!md;")
	public Class3_Sub10_Sub1_Sub2 method4276(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		@Pc(7) Class3_Sub10_Sub1_Sub2 local7 = new Class3_Sub10_Sub1_Sub2();
		local7.aBoolean381 = false;
		local7.aByteArray57 = arg0;
		local7.anInt5913 = 2;
		local7.aClass182_2 = arg2;
		local7.aLong277 = arg1;
		this.method4278(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!md;)V")
	private void method4278(@OriginalArg(1) Class3_Sub10_Sub1_Sub2 arg0) {
		@Pc(2) Class279 local2 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			this.aClass279_7.method6910(arg0);
			this.anInt5092++;
			this.aClass279_7.notifyAll();
		}
	}
}
