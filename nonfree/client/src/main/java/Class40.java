import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!fk;")
	private final Class74 aClass74_2 = new Class74();

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt749 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class40(@OriginalArg(0) Class118 arg0) {
		@Pc(20) Class2 local20 = arg0.method2712(5, this);
		while (local20.anInt6 == 0) {
			Static244.method4311(10L);
		}
		if (local20.anInt6 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!cl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean45) {
			@Pc(6) Class74 local6 = this.aClass74_2;
			@Pc(14) Class11_Sub4_Sub1_Sub2 local14;
			synchronized (this.aClass74_2) {
				local14 = (Class11_Sub4_Sub1_Sub2) this.aClass74_2.method1293();
				if (local14 == null) {
					try {
						this.aClass74_2.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt749--;
			}
			try {
				if (local14.anInt5581 == 2) {
					local14.aClass171_3.method4545((int) local14.aLong208, local14.aByteArray89.length, local14.aByteArray89);
				} else if (local14.anInt5581 == 3) {
					local14.aByteArray89 = local14.aClass171_3.method4544((int) local14.aLong208);
				}
			} catch (@Pc(72) Exception local72) {
				Static38.method554(local72, null);
			}
			local14.aBoolean359 = false;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!r;II)Lclient!rs;")
	public Class11_Sub4_Sub1_Sub2 method587(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class11_Sub4_Sub1_Sub2 local7 = new Class11_Sub4_Sub1_Sub2();
		local7.aBoolean360 = false;
		local7.aLong208 = arg1;
		local7.anInt5581 = 3;
		local7.aClass171_3 = arg0;
		this.method589(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!r;B)Lclient!rs;")
	public Class11_Sub4_Sub1_Sub2 method588(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(9) Class11_Sub4_Sub1_Sub2 local9 = new Class11_Sub4_Sub1_Sub2();
		local9.anInt5581 = 1;
		@Pc(15) Class74 local15 = this.aClass74_2;
		synchronized (this.aClass74_2) {
			@Pc(23) Class11_Sub4_Sub1_Sub2 local23 = (Class11_Sub4_Sub1_Sub2) this.aClass74_2.method1294();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong208 && local23.aClass171_3 == arg1 && local23.anInt5581 == 2) {
					local9.aByteArray89 = local23.aByteArray89;
					local9.aBoolean359 = false;
					return local9;
				}
				local23 = (Class11_Sub4_Sub1_Sub2) this.aClass74_2.method1288();
			}
		}
		local9.aByteArray89 = arg1.method4544(arg0);
		local9.aBoolean360 = true;
		local9.aBoolean359 = false;
		return local9;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!rs;I)V")
	private void method589(@OriginalArg(0) Class11_Sub4_Sub1_Sub2 arg0) {
		@Pc(2) Class74 local2 = this.aClass74_2;
		synchronized (this.aClass74_2) {
			this.aClass74_2.method1290(arg0);
			this.anInt749++;
			this.aClass74_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public void method591() {
		this.aBoolean45 = true;
		@Pc(9) Class74 local9 = this.aClass74_2;
		synchronized (this.aClass74_2) {
			this.aClass74_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[BLclient!r;I)Lclient!rs;")
	public Class11_Sub4_Sub1_Sub2 method592(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class11_Sub4_Sub1_Sub2 local7 = new Class11_Sub4_Sub1_Sub2();
		local7.aBoolean360 = false;
		local7.aByteArray89 = arg0;
		local7.anInt5581 = 2;
		local7.aLong208 = arg2;
		local7.aClass171_3 = arg1;
		this.method589(local7);
		return local7;
	}
}
