import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class165 implements Runnable {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!po;")
	private final Class202 aClass202_4 = new Class202();

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public int anInt4105 = 0;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class165(@OriginalArg(0) Class103 arg0) {
		@Pc(20) Class249 local20 = arg0.method2374(5, this);
		while (local20.anInt6929 == 0) {
			Static170.method1617(10L);
		}
		if (local20.anInt6929 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject10;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!vn;)V")
	private void method3734(@OriginalArg(1) Class6_Sub1_Sub1_Sub2 arg0) {
		@Pc(2) Class202 local2 = this.aClass202_4;
		synchronized (this.aClass202_4) {
			this.aClass202_4.method4472(arg0);
			this.anInt4105++;
			this.aClass202_4.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ap;[BI)Lclient!vn;")
	public Class6_Sub1_Sub1_Sub2 method3736(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class6_Sub1_Sub1_Sub2 local7 = new Class6_Sub1_Sub1_Sub2();
		local7.aBoolean482 = false;
		local7.aClass14_4 = arg1;
		local7.aLong218 = arg0;
		local7.aByteArray88 = arg2;
		local7.anInt7075 = 2;
		this.method3734(local7);
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public void method3737() {
		this.aBoolean269 = true;
		@Pc(9) Class202 local9 = this.aClass202_4;
		synchronized (this.aClass202_4) {
			this.aClass202_4.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean269) {
			@Pc(10) Class202 local10 = this.aClass202_4;
			@Pc(18) Class6_Sub1_Sub1_Sub2 local18;
			synchronized (this.aClass202_4) {
				local18 = (Class6_Sub1_Sub1_Sub2) this.aClass202_4.method4470();
				if (local18 == null) {
					try {
						this.aClass202_4.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt4105--;
			}
			try {
				if (local18.anInt7075 == 2) {
					local18.aClass14_4.method252((int) local18.aLong218, local18.aByteArray88, local18.aByteArray88.length);
				} else if (local18.anInt7075 == 3) {
					local18.aByteArray88 = local18.aClass14_4.method250((int) local18.aLong218);
				}
			} catch (@Pc(76) Exception local76) {
				Static40.method799(local76, null);
			}
			local18.aBoolean481 = false;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!ap;I)Lclient!vn;")
	public Class6_Sub1_Sub1_Sub2 method3739(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub1_Sub1_Sub2 local15 = new Class6_Sub1_Sub1_Sub2();
		local15.anInt7075 = 3;
		local15.aClass14_4 = arg0;
		local15.aBoolean482 = false;
		local15.aLong218 = arg1;
		this.method3734(local15);
		return local15;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ap;II)Lclient!vn;")
	public Class6_Sub1_Sub1_Sub2 method3740(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub1_Sub1_Sub2 local9 = new Class6_Sub1_Sub1_Sub2();
		local9.anInt7075 = 1;
		@Pc(23) Class202 local23 = this.aClass202_4;
		synchronized (this.aClass202_4) {
			@Pc(31) Class6_Sub1_Sub1_Sub2 local31 = (Class6_Sub1_Sub1_Sub2) this.aClass202_4.method4476();
			while (true) {
				if (local31 == null) {
					break;
				}
				if ((long) arg1 == local31.aLong218 && local31.aClass14_4 == arg0 && local31.anInt7075 == 2) {
					local9.aBoolean481 = false;
					local9.aByteArray88 = local31.aByteArray88;
					return local9;
				}
				local31 = (Class6_Sub1_Sub1_Sub2) this.aClass202_4.method4474();
			}
		}
		local9.aByteArray88 = arg0.method250(arg1);
		local9.aBoolean481 = false;
		local9.aBoolean482 = true;
		return local9;
	}
}
