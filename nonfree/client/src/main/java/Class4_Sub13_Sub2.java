import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class4_Sub13_Sub2 extends Class4_Sub13 {

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!mk;")
	private final Class130 aClass130_54 = new Class130();

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!mk;")
	private final Class130 aClass130_55 = new Class130();

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	private int anInt2794 = -1;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	private int anInt2795 = 0;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	private void method2494(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub13 local5 = (Class4_Sub13) this.aClass130_54.method3499(); local5 != null; local5 = (Class4_Sub13) this.aClass130_54.method3512()) {
			local5.method5300(arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!gl;Lclient!ka;)V")
	private void method2495(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		while (arg0 != this.aClass130_55.aClass4_144 && ((Class4_Sub24) arg0).anInt3400 <= arg1.anInt3400) {
			arg0 = arg0.aClass4_247;
		}
		Static143.method2799(arg0, arg1);
		this.anInt2794 = ((Class4_Sub24) this.aClass130_55.aClass4_144.aClass4_247).anInt3400;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!le;)V")
	public synchronized void method2496(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aClass130_54.method3505(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "([III)V")
	private void method2497(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub13 local5 = (Class4_Sub13) this.aClass130_54.method3499(); local5 != null; local5 = (Class4_Sub13) this.aClass130_54.method3512()) {
			local5.method5304(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5303() {
		return (Class4_Sub13) this.aClass130_54.method3499();
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
	private void method2498() {
		if (this.anInt2795 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub24 local8 = (Class4_Sub24) this.aClass130_55.method3499(); local8 != null; local8 = (Class4_Sub24) this.aClass130_55.method3512()) {
			local8.anInt3400 -= this.anInt2795;
		}
		this.anInt2794 -= this.anInt2795;
		this.anInt2795 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5300(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2794 < 0) {
				this.method2494(arg0);
				return;
			}
			if (this.anInt2795 + arg0 < this.anInt2794) {
				this.anInt2795 += arg0;
				this.method2494(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2794 - this.anInt2795;
			this.method2494(local29);
			arg0 -= local29;
			this.anInt2795 += local29;
			this.method2498();
			@Pc(50) Class4_Sub24 local50 = (Class4_Sub24) this.aClass130_55.method3499();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2942(this);
				if (local58 < 0) {
					local50.anInt3400 = 0;
					this.method2500(local50);
				} else {
					local50.anInt3400 = local58;
					this.method2495(local50.aClass4_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!le;)V")
	public synchronized void method2499(@OriginalArg(0) Class4_Sub13 arg0) {
		arg0.method5667();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5301() {
		return (Class4_Sub13) this.aClass130_54.method3512();
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
	@Override
	public int method5305() {
		return 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2794 < 0) {
				this.method2497(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2795 + arg2 < this.anInt2794) {
				this.anInt2795 += arg2;
				this.method2497(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2794 - this.anInt2795;
			this.method2497(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2795 += local33;
			this.method2498();
			@Pc(60) Class4_Sub24 local60 = (Class4_Sub24) this.aClass130_55.method3499();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2942(this);
				if (local68 < 0) {
					local60.anInt3400 = 0;
					this.method2500(local60);
				} else {
					local60.anInt3400 = local68;
					this.method2495(local60.aClass4_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ka;)V")
	private void method2500(@OriginalArg(0) Class4_Sub24 arg0) {
		arg0.method5667();
		arg0.method2943();
		@Pc(9) Class4 local9 = this.aClass130_55.aClass4_144.aClass4_247;
		if (local9 == this.aClass130_55.aClass4_144) {
			this.anInt2794 = -1;
		} else {
			this.anInt2794 = ((Class4_Sub24) local9).anInt3400;
		}
	}
}
