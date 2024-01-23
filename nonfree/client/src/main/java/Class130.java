import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class130 implements Runnable {

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Lclient!qk;")
	private Class140 aClass140_4 = new Class140();

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	public int anInt4143 = 0;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class130() {
		@Pc(20) Class116 local20 = Static253.aClass175_4.method4320(this, 5);
		while (local20.anInt3812 == 0) {
			Static48.method934(10L);
		}
		if (local20.anInt3812 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public void method3286() {
		this.aBoolean320 = true;
		@Pc(10) Class140 local10 = this.aClass140_4;
		synchronized (this.aClass140_4) {
			this.aClass140_4.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLclient!ng;)Lclient!ck;")
	public Class1_Sub2_Sub6_Sub1 method3288(@OriginalArg(0) int arg0, @OriginalArg(2) Class111 arg1) {
		@Pc(7) Class1_Sub2_Sub6_Sub1 local7 = new Class1_Sub2_Sub6_Sub1();
		local7.aLong201 = arg0;
		local7.anInt798 = 3;
		local7.aBoolean327 = false;
		local7.aClass111_1 = arg1;
		this.method3289(local7);
		return local7;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!ck;)V")
	private void method3289(@OriginalArg(1) Class1_Sub2_Sub6_Sub1 arg0) {
		@Pc(11) Class140 local11 = this.aClass140_4;
		synchronized (this.aClass140_4) {
			this.aClass140_4.method3414(arg0);
			this.anInt4143++;
			this.aClass140_4.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ng;IB[B)Lclient!ck;")
	public Class1_Sub2_Sub6_Sub1 method3290(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class1_Sub2_Sub6_Sub1 local7 = new Class1_Sub2_Sub6_Sub1();
		local7.aClass111_1 = arg0;
		local7.aByteArray12 = arg2;
		local7.aLong201 = arg1;
		local7.anInt798 = 2;
		local7.aBoolean327 = false;
		this.method3289(local7);
		return local7;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ng;II)Lclient!ck;")
	public Class1_Sub2_Sub6_Sub1 method3291(@OriginalArg(0) Class111 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub6_Sub1 local9 = new Class1_Sub2_Sub6_Sub1();
		local9.anInt798 = 1;
		@Pc(22) Class140 local22 = this.aClass140_4;
		synchronized (this.aClass140_4) {
			@Pc(29) Class1_Sub2_Sub6_Sub1 local29 = (Class1_Sub2_Sub6_Sub1) this.aClass140_4.method3413();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg1 == local29.aLong201 && arg0 == local29.aClass111_1 && local29.anInt798 == 2) {
					local9.aBoolean325 = false;
					local9.aByteArray12 = local29.aByteArray12;
					return local9;
				}
				local29 = (Class1_Sub2_Sub6_Sub1) this.aClass140_4.method3415();
			}
		}
		local9.aByteArray12 = arg0.method2990(arg1);
		local9.aBoolean327 = true;
		local9.aBoolean325 = false;
		return local9;
	}

	@OriginalMember(owner = "client!pk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean320) {
			@Pc(12) Class140 local12 = this.aClass140_4;
			@Pc(19) Class1_Sub2_Sub6_Sub1 local19;
			synchronized (this.aClass140_4) {
				local19 = (Class1_Sub2_Sub6_Sub1) this.aClass140_4.method3416();
				if (local19 == null) {
					try {
						this.aClass140_4.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt4143--;
			}
			try {
				if (local19.anInt798 == 2) {
					local19.aClass111_1.method2991(local19.aByteArray12, (int) local19.aLong201, local19.aByteArray12.length);
				} else if (local19.anInt798 == 3) {
					local19.aByteArray12 = local19.aClass111_1.method2990((int) local19.aLong201);
				}
			} catch (@Pc(81) Exception local81) {
				Static3.method136(null, local81);
			}
			local19.aBoolean325 = false;
		}
	}
}
