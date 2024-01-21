import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class6_Sub6_Sub2 extends Class6_Sub6 {

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "Lclient!a;")
	private final Class1 aClass1_6 = new Class1();

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "Lclient!a;")
	private final Class1 aClass1_7 = new Class1();

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
	private int anInt2495 = -1;

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
	private int anInt2494 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1913() {
		return (Class6_Sub6) this.aClass1_6.method3();
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	private void method1624(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub6 local5 = (Class6_Sub6) this.aClass1_6.method3(); local5 != null; local5 = (Class6_Sub6) this.aClass1_6.method14()) {
			local5.method1917(arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!kf;)V")
	public synchronized void method1625(@OriginalArg(0) Class6_Sub6 arg0) {
		this.aClass1_6.method4(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "([III)V")
	private void method1626(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub6 local5 = (Class6_Sub6) this.aClass1_6.method3(); local5 != null; local5 = (Class6_Sub6) this.aClass1_6.method14()) {
			local5.method1914(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1918() {
		return (Class6_Sub6) this.aClass1_6.method14();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!kd;Lclient!vb;)V")
	private void method1627(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub19 arg1) {
		while (arg0 != this.aClass1_7.aClass6_1 && ((Class6_Sub19) arg0).anInt3154 <= arg1.anInt3154) {
			arg0 = arg0.aClass6_116;
		}
		this.aClass1_7.method2(arg1, arg0);
		this.anInt2495 = ((Class6_Sub19) this.aClass1_7.aClass6_1.aClass6_116).anInt3154;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
	@Override
	public int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!vb;)V")
	private void method1628(@OriginalArg(0) Class6_Sub19 arg0) {
		arg0.method2123();
		arg0.method2107();
		@Pc(9) Class6 local9 = this.aClass1_7.aClass6_1.aClass6_116;
		if (local9 == this.aClass1_7.aClass6_1) {
			this.anInt2495 = -1;
		} else {
			this.anInt2495 = ((Class6_Sub19) local9).anInt3154;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!kf;)V")
	public synchronized void method1629(@OriginalArg(0) Class6_Sub6 arg0) {
		arg0.method2123();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2495 < 0) {
				this.method1626(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2494 + arg2 < this.anInt2495) {
				this.anInt2494 += arg2;
				this.method1626(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2495 - this.anInt2494;
			this.method1626(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2494 += local33;
			this.method1630();
			@Pc(60) Class6_Sub19 local60 = (Class6_Sub19) this.aClass1_7.method3();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2106(this);
				if (local68 < 0) {
					local60.anInt3154 = 0;
					this.method1628(local60);
				} else {
					local60.anInt3154 = local68;
					this.method1627(local60.aClass6_116, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2495 < 0) {
				this.method1624(arg0);
				return;
			}
			if (this.anInt2494 + arg0 < this.anInt2495) {
				this.anInt2494 += arg0;
				this.method1624(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2495 - this.anInt2494;
			this.method1624(local29);
			arg0 -= local29;
			this.anInt2494 += local29;
			this.method1630();
			@Pc(50) Class6_Sub19 local50 = (Class6_Sub19) this.aClass1_7.method3();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2106(this);
				if (local58 < 0) {
					local50.anInt3154 = 0;
					this.method1628(local50);
				} else {
					local50.anInt3154 = local58;
					this.method1627(local50.aClass6_116, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
	private void method1630() {
		if (this.anInt2494 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub19 local8 = (Class6_Sub19) this.aClass1_7.method3(); local8 != null; local8 = (Class6_Sub19) this.aClass1_7.method14()) {
			local8.anInt3154 -= this.anInt2494;
		}
		this.anInt2495 -= this.anInt2494;
		this.anInt2494 = 0;
	}
}
