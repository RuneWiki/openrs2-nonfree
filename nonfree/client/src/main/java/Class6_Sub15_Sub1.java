import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class6_Sub15_Sub1 extends Class6_Sub15 {

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!su;")
	private final Class298 aClass298_62 = new Class298();

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!su;")
	private final Class298 aClass298_63 = new Class298();

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	private int anInt2836 = 0;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	private int anInt2837 = -1;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "()I")
	public synchronized int method2418() {
		return this.aClass298_62.method6815();
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "([III)V")
	private void method2419(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub15 local5 = (Class6_Sub15) this.aClass298_62.method6809(); local5 != null; local5 = (Class6_Sub15) this.aClass298_62.method6821()) {
			local5.method7936(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2837 < 0) {
				this.method2419(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2836 + arg2 < this.anInt2837) {
				this.anInt2836 += arg2;
				this.method2419(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2837 - this.anInt2836;
			this.method2419(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2836 += local33;
			this.method2420();
			@Pc(60) Class6_Sub20 local60 = (Class6_Sub20) this.aClass298_63.method6809();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3485(this);
				if (local68 < 0) {
					local60.anInt4058 = 0;
					this.method2425(local60);
				} else {
					local60.anInt4058 = local68;
					this.method2423(local60.aClass6_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7939(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2837 < 0) {
				this.method2424(arg0);
				return;
			}
			if (this.anInt2836 + arg0 < this.anInt2837) {
				this.anInt2836 += arg0;
				this.method2424(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2837 - this.anInt2836;
			this.method2424(local29);
			arg0 -= local29;
			this.anInt2836 += local29;
			this.method2420();
			@Pc(50) Class6_Sub20 local50 = (Class6_Sub20) this.aClass298_63.method6809();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3485(this);
				if (local58 < 0) {
					local50.anInt4058 = 0;
					this.method2425(local50);
				} else {
					local50.anInt4058 = local58;
					this.method2423(local50.aClass6_284, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7934() {
		return (Class6_Sub15) this.aClass298_62.method6809();
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "()V")
	private void method2420() {
		if (this.anInt2836 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub20 local8 = (Class6_Sub20) this.aClass298_63.method6809(); local8 != null; local8 = (Class6_Sub20) this.aClass298_63.method6821()) {
			local8.anInt4058 -= this.anInt2836;
		}
		this.anInt2837 -= this.anInt2836;
		this.anInt2836 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!vw;)V")
	public synchronized void method2421(@OriginalArg(0) Class6_Sub15 arg0) {
		arg0.method7948();
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!vw;)V")
	public synchronized void method2422(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aClass298_62.method6819(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()I")
	@Override
	public int method7935() {
		return 0;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7937() {
		return (Class6_Sub15) this.aClass298_62.method6821();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ia;Lclient!ida;)V")
	private void method2423(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub20 arg1) {
		while (arg0 != this.aClass298_63.aClass6_246 && ((Class6_Sub20) arg0).anInt4058 <= arg1.anInt4058) {
			arg0 = arg0.aClass6_284;
		}
		Static182.method3030(arg1, arg0);
		this.anInt2837 = ((Class6_Sub20) this.aClass298_63.aClass6_246.aClass6_284).anInt4058;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	private void method2424(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub15 local5 = (Class6_Sub15) this.aClass298_62.method6809(); local5 != null; local5 = (Class6_Sub15) this.aClass298_62.method6821()) {
			local5.method7939(arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ida;)V")
	private void method2425(@OriginalArg(0) Class6_Sub20 arg0) {
		arg0.method7948();
		arg0.method3484();
		@Pc(9) Class6 local9 = this.aClass298_63.aClass6_246.aClass6_284;
		if (local9 == this.aClass298_63.aClass6_246) {
			this.anInt2837 = -1;
		} else {
			this.anInt2837 = ((Class6_Sub20) local9).anInt4058;
		}
	}
}
