import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class152 implements Runnable {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!lq;")
	private final Class129 aClass129_10 = new Class129();

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
	private boolean aBoolean452 = false;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public int anInt5184 = 0;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class152(@OriginalArg(0) Class179 arg0) {
		@Pc(20) Class26 local20 = arg0.method4875(5, this);
		while (local20.anInt484 == 0) {
			Static248.method4401(10L);
		}
		if (local20.anInt484 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!uj;I)Lclient!u;")
	public Class2_Sub9_Sub14_Sub2 method4372(@OriginalArg(1) Class204 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub9_Sub14_Sub2 local7 = new Class2_Sub9_Sub14_Sub2();
		local7.anInt6305 = 3;
		local7.aBoolean559 = false;
		local7.aClass204_4 = arg0;
		local7.aLong211 = arg1;
		this.method4375(local7);
		return local7;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!uj;)Lclient!u;")
	public Class2_Sub9_Sub14_Sub2 method4373(@OriginalArg(0) int arg0, @OriginalArg(2) Class204 arg1) {
		@Pc(9) Class2_Sub9_Sub14_Sub2 local9 = new Class2_Sub9_Sub14_Sub2();
		local9.anInt6305 = 1;
		@Pc(15) Class129 local15 = this.aClass129_10;
		synchronized (this.aClass129_10) {
			@Pc(28) Class2_Sub9_Sub14_Sub2 local28 = (Class2_Sub9_Sub14_Sub2) this.aClass129_10.method3577();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong211 == (long) arg0 && arg1 == local28.aClass204_4 && local28.anInt6305 == 2) {
					local9.aBoolean557 = false;
					local9.aByteArray87 = local28.aByteArray87;
					return local9;
				}
				local28 = (Class2_Sub9_Sub14_Sub2) this.aClass129_10.method3578();
			}
		}
		local9.aByteArray87 = arg1.method5355(arg0);
		local9.aBoolean557 = false;
		local9.aBoolean559 = true;
		return local9;
	}

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean452) {
			@Pc(6) Class129 local6 = this.aClass129_10;
			@Pc(14) Class2_Sub9_Sub14_Sub2 local14;
			synchronized (this.aClass129_10) {
				local14 = (Class2_Sub9_Sub14_Sub2) this.aClass129_10.method3582();
				if (local14 == null) {
					try {
						this.aClass129_10.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt5184--;
			}
			try {
				if (local14.anInt6305 == 2) {
					local14.aClass204_4.method5356((int) local14.aLong211, local14.aByteArray87, local14.aByteArray87.length);
				} else if (local14.anInt6305 == 3) {
					local14.aByteArray87 = local14.aClass204_4.method5355((int) local14.aLong211);
				}
			} catch (@Pc(72) Exception local72) {
				Static40.method506(null, local72);
			}
			local14.aBoolean557 = false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!u;)V")
	private void method4375(@OriginalArg(1) Class2_Sub9_Sub14_Sub2 arg0) {
		@Pc(6) Class129 local6 = this.aClass129_10;
		synchronized (this.aClass129_10) {
			this.aClass129_10.method3575(arg0);
			this.anInt5184++;
			this.aClass129_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!uj;[BII)Lclient!u;")
	public Class2_Sub9_Sub14_Sub2 method4376(@OriginalArg(0) Class204 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub9_Sub14_Sub2 local7 = new Class2_Sub9_Sub14_Sub2();
		local7.aBoolean559 = false;
		local7.anInt6305 = 2;
		local7.aClass204_4 = arg0;
		local7.aLong211 = arg2;
		local7.aByteArray87 = arg1;
		this.method4375(local7);
		return local7;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public void method4377() {
		this.aBoolean452 = true;
		@Pc(9) Class129 local9 = this.aClass129_10;
		synchronized (this.aClass129_10) {
			this.aClass129_10.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread2 = null;
	}
}
