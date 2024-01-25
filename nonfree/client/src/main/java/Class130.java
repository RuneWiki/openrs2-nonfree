import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class130 implements Runnable {

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!re;")
	private final Class286 aClass286_1 = new Class286();

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "Z")
	private boolean aBoolean292 = false;

	@OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
	public int anInt4103 = 0;

	@OriginalMember(owner = "client!hfa", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class130(@OriginalArg(0) Class112 arg0) {
		@Pc(20) Class328 local20 = arg0.method3237(this, 5);
		while (local20.anInt9389 == 0) {
			Static179.method3254(10L);
		}
		if (local20.anInt9389 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject21;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	public void method3580() {
		this.aBoolean292 = true;
		@Pc(14) Class286 local14 = this.aClass286_1;
		synchronized (this.aClass286_1) {
			this.aClass286_1.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZLclient!np;I)Lclient!bfa;")
	public Class6_Sub2_Sub3_Sub1 method3581(@OriginalArg(1) Class227 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub2_Sub3_Sub1 local9 = new Class6_Sub2_Sub3_Sub1();
		local9.anInt840 = 1;
		@Pc(15) Class286 local15 = this.aClass286_1;
		synchronized (this.aClass286_1) {
			@Pc(23) Class6_Sub2_Sub3_Sub1 local23 = (Class6_Sub2_Sub3_Sub1) this.aClass286_1.method7242();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong272 && arg0 == local23.aClass227_1 && local23.anInt840 == 2) {
					local9.aByteArray12 = local23.aByteArray12;
					local9.aBoolean158 = false;
					return local9;
				}
				local23 = (Class6_Sub2_Sub3_Sub1) this.aClass286_1.method7241();
			}
		}
		local9.aByteArray12 = arg0.method6176(arg1);
		local9.aBoolean159 = true;
		local9.aBoolean158 = false;
		return local9;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!np;II)Lclient!bfa;")
	public Class6_Sub2_Sub3_Sub1 method3584(@OriginalArg(0) Class227 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub3_Sub1 local13 = new Class6_Sub2_Sub3_Sub1();
		local13.aClass227_1 = arg0;
		local13.anInt840 = 3;
		local13.aBoolean159 = false;
		local13.aLong272 = (long) arg1;
		this.method3586(local13);
		return local13;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!np;[BII)Lclient!bfa;")
	public Class6_Sub2_Sub3_Sub1 method3585(@OriginalArg(0) Class227 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class6_Sub2_Sub3_Sub1 local15 = new Class6_Sub2_Sub3_Sub1();
		local15.aClass227_1 = arg0;
		local15.aLong272 = (long) arg2;
		local15.anInt840 = 2;
		local15.aBoolean159 = false;
		local15.aByteArray12 = arg1;
		this.method3586(local15);
		return local15;
	}

	@OriginalMember(owner = "client!hfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean292) {
			@Pc(6) Class286 local6 = this.aClass286_1;
			@Pc(14) Class6_Sub2_Sub3_Sub1 local14;
			synchronized (this.aClass286_1) {
				local14 = (Class6_Sub2_Sub3_Sub1) this.aClass286_1.method7244();
				if (local14 == null) {
					try {
						this.aClass286_1.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4103--;
			}
			try {
				if (local14.anInt840 == 2) {
					local14.aClass227_1.method6173(local14.aByteArray12.length, (int) local14.aLong272, local14.aByteArray12);
				} else if (local14.anInt840 == 3) {
					local14.aByteArray12 = local14.aClass227_1.method6176((int) local14.aLong272);
				}
			} catch (@Pc(76) Exception local76) {
				Static619.method8645(local76, (String) null);
			}
			local14.aBoolean158 = false;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!bfa;)V")
	private void method3586(@OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg0) {
		@Pc(6) Class286 local6 = this.aClass286_1;
		synchronized (this.aClass286_1) {
			this.aClass286_1.method7239(arg0);
			this.anInt4103++;
			this.aClass286_1.notifyAll();
		}
	}
}
