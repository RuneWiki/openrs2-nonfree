import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class188 implements Runnable {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!dp;")
	private Class82 aClass82_6 = new Class82();

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public int anInt5101 = 0;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class188(@OriginalArg(0) Class122 arg0) {
		@Pc(20) Class380 local20 = arg0.method3352(this, 5);
		while (local20.anInt10067 == 0) {
			Static255.method4444(10L);
		}
		if (local20.anInt10067 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject25;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BIILclient!nha;)Lclient!ffa;")
	public Class6_Sub2_Sub1_Sub2 method4665(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class251 arg2) {
		@Pc(7) Class6_Sub2_Sub1_Sub2 local7 = new Class6_Sub2_Sub1_Sub2();
		local7.aBoolean257 = false;
		local7.aClass251_1 = arg2;
		local7.aByteArray21 = arg0;
		local7.anInt3301 = 2;
		local7.aLong317 = (long) arg1;
		this.method4668(local7);
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!nha;I)Lclient!ffa;")
	public Class6_Sub2_Sub1_Sub2 method4666(@OriginalArg(1) Class251 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class6_Sub2_Sub1_Sub2 local7 = new Class6_Sub2_Sub1_Sub2();
		local7.aLong317 = (long) arg1;
		local7.anInt3301 = 3;
		local7.aBoolean257 = false;
		local7.aClass251_1 = arg0;
		this.method4668(local7);
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!nha;)Lclient!ffa;")
	public Class6_Sub2_Sub1_Sub2 method4667(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(9) Class6_Sub2_Sub1_Sub2 local9 = new Class6_Sub2_Sub1_Sub2();
		local9.anInt3301 = 1;
		@Pc(15) Class82 local15 = this.aClass82_6;
		synchronized (this.aClass82_6) {
			@Pc(23) Class6_Sub2_Sub1_Sub2 local23 = (Class6_Sub2_Sub1_Sub2) this.aClass82_6.method2071();
			while (true) {
				if (local23 == null) {
					if (27616 != 27616) {
						this.aClass82_6 = null;
					}
					break;
				}
				if ((long) arg0 == local23.aLong317 && local23.aClass251_1 == arg1 && local23.anInt3301 == 2) {
					local9.aBoolean259 = false;
					local9.aByteArray21 = local23.aByteArray21;
					return local9;
				}
				local23 = (Class6_Sub2_Sub1_Sub2) this.aClass82_6.method2078();
			}
		}
		local9.aByteArray21 = arg1.method6104(arg0);
		local9.aBoolean259 = false;
		local9.aBoolean257 = true;
		return local9;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ffa;I)V")
	private void method4668(@OriginalArg(0) Class6_Sub2_Sub1_Sub2 arg0) {
		@Pc(7) Class82 local7 = this.aClass82_6;
		synchronized (this.aClass82_6) {
			this.aClass82_6.method2076(arg0);
			this.anInt5101++;
			this.aClass82_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public void method4669() {
		this.aBoolean388 = true;
		@Pc(9) Class82 local9 = this.aClass82_6;
		synchronized (this.aClass82_6) {
			this.aClass82_6.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean388) {
			@Pc(10) Class82 local10 = this.aClass82_6;
			@Pc(18) Class6_Sub2_Sub1_Sub2 local18;
			synchronized (this.aClass82_6) {
				local18 = (Class6_Sub2_Sub1_Sub2) this.aClass82_6.method2077();
				if (local18 == null) {
					try {
						this.aClass82_6.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt5101--;
			}
			try {
				if (local18.anInt3301 == 2) {
					local18.aClass251_1.method6102(local18.aByteArray21, local18.aByteArray21.length, (int) local18.aLong317);
				} else if (local18.anInt3301 == 3) {
					local18.aByteArray21 = local18.aClass251_1.method6104((int) local18.aLong317);
				}
			} catch (@Pc(83) Exception local83) {
				Static550.method7785(local83, (String) null);
			}
			local18.aBoolean259 = false;
		}
	}
}
