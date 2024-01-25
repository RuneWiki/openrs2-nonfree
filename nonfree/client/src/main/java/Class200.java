import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class200 implements Runnable {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!so;")
	private final Class225 aClass225_5 = new Class225();

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	public int anInt5622 = 0;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
	private boolean aBoolean638 = false;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!fq;)V")
	public Class200(@OriginalArg(0) Class83 arg0) {
		@Pc(20) Class232 local20 = arg0.method1865(this, 5);
		while (local20.anInt6402 == 0) {
			Static223.method4582(10L);
		}
		if (local20.anInt6402 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public void method4420() {
		this.aBoolean638 = true;
		@Pc(15) Class225 local15 = this.aClass225_5;
		synchronized (this.aClass225_5) {
			this.aClass225_5.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!vs;IZ)Lclient!nu;")
	public Class1_Sub5_Sub9_Sub1 method4422(@OriginalArg(0) Class257 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub5_Sub9_Sub1 local7 = new Class1_Sub5_Sub9_Sub1();
		local7.anInt4931 = 3;
		local7.aLong211 = arg1;
		local7.aClass257_3 = arg0;
		local7.aBoolean741 = false;
		this.method4427(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB[BLclient!vs;)Lclient!nu;")
	public Class1_Sub5_Sub9_Sub1 method4423(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class257 arg2) {
		@Pc(7) Class1_Sub5_Sub9_Sub1 local7 = new Class1_Sub5_Sub9_Sub1();
		local7.aByteArray58 = arg1;
		local7.aLong211 = arg0;
		local7.aBoolean741 = false;
		local7.anInt4931 = 2;
		local7.aClass257_3 = arg2;
		this.method4427(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!vs;)Lclient!nu;")
	public Class1_Sub5_Sub9_Sub1 method4425(@OriginalArg(0) int arg0, @OriginalArg(2) Class257 arg1) {
		@Pc(9) Class1_Sub5_Sub9_Sub1 local9 = new Class1_Sub5_Sub9_Sub1();
		local9.anInt4931 = 1;
		@Pc(15) Class225 local15 = this.aClass225_5;
		synchronized (this.aClass225_5) {
			@Pc(23) Class1_Sub5_Sub9_Sub1 local23 = (Class1_Sub5_Sub9_Sub1) this.aClass225_5.method4942();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong211 && local23.aClass257_3 == arg1 && local23.anInt4931 == 2) {
					local9.aByteArray58 = local23.aByteArray58;
					local9.aBoolean740 = false;
					return local9;
				}
				local23 = (Class1_Sub5_Sub9_Sub1) this.aClass225_5.method4937();
			}
		}
		local9.aByteArray58 = arg1.method5721(arg0);
		local9.aBoolean740 = false;
		local9.aBoolean741 = true;
		return local9;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!nu;B)V")
	private void method4427(@OriginalArg(0) Class1_Sub5_Sub9_Sub1 arg0) {
		@Pc(2) Class225 local2 = this.aClass225_5;
		synchronized (this.aClass225_5) {
			this.aClass225_5.method4943(arg0);
			this.anInt5622++;
			this.aClass225_5.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean638) {
			@Pc(10) Class225 local10 = this.aClass225_5;
			@Pc(18) Class1_Sub5_Sub9_Sub1 local18;
			synchronized (this.aClass225_5) {
				local18 = (Class1_Sub5_Sub9_Sub1) this.aClass225_5.method4939();
				if (local18 == null) {
					try {
						this.aClass225_5.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt5622--;
			}
			try {
				if (local18.anInt4931 == 2) {
					local18.aClass257_3.method5718((int) local18.aLong211, local18.aByteArray58, local18.aByteArray58.length);
				} else if (local18.anInt4931 == 3) {
					local18.aByteArray58 = local18.aClass257_3.method5721((int) local18.aLong211);
				}
			} catch (@Pc(76) Exception local76) {
				Static55.method972(local76, null);
			}
			local18.aBoolean740 = false;
		}
	}
}
