import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!nk;")
	private final Class143 aClass143_7 = new Class143();

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt2382 = 0;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class99(@OriginalArg(0) Class206 arg0) {
		@Pc(20) Class196 local20 = arg0.method5526(this, 5);
		while (local20.anInt5851 == 0) {
			Static278.method5283(10L);
		}
		if (local20.anInt5851 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BILclient!uf;)Lclient!rl;")
	public Class6_Sub2_Sub11_Sub2 method2525(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class197 arg2) {
		@Pc(7) Class6_Sub2_Sub11_Sub2 local7 = new Class6_Sub2_Sub11_Sub2();
		local7.aByteArray87 = arg1;
		local7.aLong219 = arg0;
		local7.aClass197_4 = arg2;
		local7.aBoolean365 = false;
		local7.anInt5294 = 2;
		this.method2529(local7);
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean200) {
			@Pc(6) Class143 local6 = this.aClass143_7;
			@Pc(14) Class6_Sub2_Sub11_Sub2 local14;
			synchronized (this.aClass143_7) {
				local14 = (Class6_Sub2_Sub11_Sub2) this.aClass143_7.method3759();
				if (local14 == null) {
					try {
						this.aClass143_7.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt2382--;
			}
			try {
				if (local14.anInt5294 == 2) {
					local14.aClass197_4.method5301(local14.aByteArray87, (int) local14.aLong219, local14.aByteArray87.length);
				} else if (local14.anInt5294 == 3) {
					local14.aByteArray87 = local14.aClass197_4.method5307((int) local14.aLong219);
				}
			} catch (@Pc(74) Exception local74) {
				Static346.method5707(null, local74);
			}
			local14.aBoolean366 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!uf;)Lclient!rl;")
	public Class6_Sub2_Sub11_Sub2 method2528(@OriginalArg(1) int arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(7) Class6_Sub2_Sub11_Sub2 local7 = new Class6_Sub2_Sub11_Sub2();
		local7.aBoolean365 = false;
		local7.aLong219 = arg0;
		local7.aClass197_4 = arg1;
		local7.anInt5294 = 3;
		this.method2529(local7);
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rl;I)V")
	private void method2529(@OriginalArg(0) Class6_Sub2_Sub11_Sub2 arg0) {
		@Pc(6) Class143 local6 = this.aClass143_7;
		synchronized (this.aClass143_7) {
			this.aClass143_7.method3765(arg0);
			this.anInt2382++;
			this.aClass143_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public void method2530() {
		this.aBoolean200 = true;
		@Pc(17) Class143 local17 = this.aClass143_7;
		synchronized (this.aClass143_7) {
			this.aClass143_7.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IILclient!uf;)Lclient!rl;")
	public Class6_Sub2_Sub11_Sub2 method2531(@OriginalArg(1) int arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(9) Class6_Sub2_Sub11_Sub2 local9 = new Class6_Sub2_Sub11_Sub2();
		local9.anInt5294 = 1;
		@Pc(15) Class143 local15 = this.aClass143_7;
		synchronized (this.aClass143_7) {
			@Pc(34) Class6_Sub2_Sub11_Sub2 local34 = (Class6_Sub2_Sub11_Sub2) this.aClass143_7.method3766();
			while (true) {
				if (local34 == null) {
					break;
				}
				if (local34.aLong219 == (long) arg0 && arg1 == local34.aClass197_4 && local34.anInt5294 == 2) {
					local9.aBoolean366 = false;
					local9.aByteArray87 = local34.aByteArray87;
					return local9;
				}
				local34 = (Class6_Sub2_Sub11_Sub2) this.aClass143_7.method3763();
			}
		}
		local9.aByteArray87 = arg1.method5307(arg0);
		local9.aBoolean366 = false;
		local9.aBoolean365 = true;
		return local9;
	}
}
