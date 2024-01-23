import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub10_Sub2 extends Class1_Sub10 {

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Lclient!ci;")
	private Class26 aClass26_23 = new Class26();

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!ci;")
	private Class26 aClass26_24 = new Class26();

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt2496 = -1;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	private int anInt2497 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!jk;)V")
	public synchronized void method1863(@OriginalArg(0) Class1_Sub10 arg0) {
		this.aClass26_23.method665(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4339() {
		return (Class1_Sub10) this.aClass26_23.method672();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!jk;)V")
	public synchronized void method1864(@OriginalArg(0) Class1_Sub10 arg0) {
		arg0.method4767();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()Lclient!jk;")
	@Override
	public Class1_Sub10 method4342() {
		return (Class1_Sub10) this.aClass26_23.method666();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ec;Lclient!ni;)V")
	private void method1865(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		while (arg0 != this.aClass26_24.aClass1_23 && ((Class1_Sub19) arg0).anInt4104 <= arg1.anInt4104) {
			arg0 = arg0.aClass1_233;
		}
		Static80.method1351(arg0, arg1);
		this.anInt2496 = ((Class1_Sub19) this.aClass26_24.aClass1_23.aClass1_233).anInt4104;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	private void method1866(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub10 local5 = (Class1_Sub10) this.aClass26_23.method666(); local5 != null; local5 = (Class1_Sub10) this.aClass26_23.method672()) {
			local5.method4341(arg0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()V")
	private void method1867() {
		if (this.anInt2497 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) this.aClass26_24.method666(); local8 != null; local8 = (Class1_Sub19) this.aClass26_24.method672()) {
			local8.anInt4104 -= this.anInt2497;
		}
		this.anInt2496 -= this.anInt2497;
		this.anInt2497 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()I")
	@Override
	public int method4343() {
		return 0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4341(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2496 < 0) {
				this.method1866(arg0);
				return;
			}
			if (this.anInt2497 + arg0 < this.anInt2496) {
				this.anInt2497 += arg0;
				this.method1866(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2496 - this.anInt2497;
			this.method1866(local29);
			arg0 -= local29;
			this.anInt2497 += local29;
			this.method1867();
			@Pc(50) Class1_Sub19 local50 = (Class1_Sub19) this.aClass26_24.method666();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3016(this);
				if (local58 < 0) {
					local50.anInt4104 = 0;
					this.method1869(local50);
				} else {
					local50.anInt4104 = local58;
					this.method1865(local50.aClass1_233, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2496 < 0) {
				this.method1868(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2497 + arg2 < this.anInt2496) {
				this.anInt2497 += arg2;
				this.method1868(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2496 - this.anInt2497;
			this.method1868(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2497 += local33;
			this.method1867();
			@Pc(60) Class1_Sub19 local60 = (Class1_Sub19) this.aClass26_24.method666();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3016(this);
				if (local68 < 0) {
					local60.anInt4104 = 0;
					this.method1869(local60);
				} else {
					local60.anInt4104 = local68;
					this.method1865(local60.aClass1_233, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "([III)V")
	private void method1868(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub10 local5 = (Class1_Sub10) this.aClass26_23.method666(); local5 != null; local5 = (Class1_Sub10) this.aClass26_23.method672()) {
			local5.method4340(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ni;)V")
	private void method1869(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method4767();
		arg0.method3017();
		@Pc(9) Class1 local9 = this.aClass26_24.aClass1_23.aClass1_233;
		if (local9 == this.aClass26_24.aClass1_23) {
			this.anInt2496 = -1;
		} else {
			this.anInt2496 = ((Class1_Sub19) local9).anInt4104;
		}
	}
}
