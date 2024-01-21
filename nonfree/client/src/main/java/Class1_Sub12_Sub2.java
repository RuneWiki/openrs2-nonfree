import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!cf;")
	private final Class20 aClass20_11 = new Class20();

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!cf;")
	private final Class20 aClass20_12 = new Class20();

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	private int anInt2315 = -1;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
	private int anInt2316 = 0;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "([III)V")
	private void method1607(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass20_11.method467(); local5 != null; local5 = (Class1_Sub12) this.aClass20_11.method468()) {
			local5.method2752(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2315 < 0) {
				this.method1607(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2316 + arg2 < this.anInt2315) {
				this.anInt2316 += arg2;
				this.method1607(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2315 - this.anInt2316;
			this.method1607(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2316 += local33;
			this.method1610();
			@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) this.aClass20_12.method467();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1180(this);
				if (local68 < 0) {
					local60.anInt1723 = 0;
					this.method1608(local60);
				} else {
					local60.anInt1723 = local68;
					this.method1613(local60.aClass1_213, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2754() {
		return (Class1_Sub12) this.aClass20_11.method467();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!hi;)V")
	private void method1608(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method3414();
		arg0.method1179();
		@Pc(9) Class1 local9 = this.aClass20_12.aClass1_27.aClass1_213;
		if (local9 == this.aClass20_12.aClass1_27) {
			this.anInt2315 = -1;
		} else {
			this.anInt2315 = ((Class1_Sub11) local9).anInt1723;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!jc;)V")
	public synchronized void method1609(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass20_11.method471(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2757(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2315 < 0) {
				this.method1611(arg0);
				return;
			}
			if (this.anInt2316 + arg0 < this.anInt2315) {
				this.anInt2316 += arg0;
				this.method1611(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2315 - this.anInt2316;
			this.method1611(local29);
			arg0 -= local29;
			this.anInt2316 += local29;
			this.method1610();
			@Pc(50) Class1_Sub11 local50 = (Class1_Sub11) this.aClass20_12.method467();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1180(this);
				if (local58 < 0) {
					local50.anInt1723 = 0;
					this.method1608(local50);
				} else {
					local50.anInt1723 = local58;
					this.method1613(local50.aClass1_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "()V")
	private void method1610() {
		if (this.anInt2316 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass20_12.method467(); local8 != null; local8 = (Class1_Sub11) this.aClass20_12.method468()) {
			local8.anInt1723 -= this.anInt2316;
		}
		this.anInt2315 -= this.anInt2316;
		this.anInt2316 = 0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2755() {
		return (Class1_Sub12) this.aClass20_11.method468();
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
	private void method1611(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass20_11.method467(); local5 != null; local5 = (Class1_Sub12) this.aClass20_11.method468()) {
			local5.method2757(arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
	@Override
	public int method2756() {
		return 0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lclient!jc;)V")
	public synchronized void method1612(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method3414();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!md;Lclient!hi;)V")
	private void method1613(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		while (arg0 != this.aClass20_12.aClass1_27 && ((Class1_Sub11) arg0).anInt1723 <= arg1.anInt1723) {
			arg0 = arg0.aClass1_213;
		}
		this.aClass20_12.method478(arg0, arg1);
		this.anInt2315 = ((Class1_Sub11) this.aClass20_12.aClass1_27.aClass1_213).anInt1723;
	}
}
