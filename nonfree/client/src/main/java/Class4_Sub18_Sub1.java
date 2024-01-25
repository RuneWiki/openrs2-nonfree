import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class4_Sub18_Sub1 extends Class4_Sub18 {

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!vr;")
	private final Class258 aClass258_28 = new Class258();

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Lclient!vr;")
	private final Class258 aClass258_29 = new Class258();

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
	private int anInt3626 = 0;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	private int anInt3627 = -1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!es;)V")
	private void method2786(@OriginalArg(0) Class4_Sub9 arg0) {
		arg0.method5854();
		arg0.method1608();
		@Pc(9) Class4 local9 = this.aClass258_29.aClass4_240.aClass4_261;
		if (local9 == this.aClass258_29.aClass4_240) {
			this.anInt3627 = -1;
		} else {
			this.anInt3627 = ((Class4_Sub9) local9).anInt2146;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ho;)V")
	public synchronized void method2787(@OriginalArg(0) Class4_Sub18 arg0) {
		this.aClass258_28.method5529(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "([III)V")
	private void method2788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub18 local5 = (Class4_Sub18) this.aClass258_28.method5538(); local5 != null; local5 = (Class4_Sub18) this.aClass258_28.method5528()) {
			local5.method5750(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lclient!ho;)V")
	public synchronized void method2789(@OriginalArg(0) Class4_Sub18 arg0) {
		arg0.method5854();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5749(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3627 < 0) {
				this.method2790(arg0);
				return;
			}
			if (this.anInt3626 + arg0 < this.anInt3627) {
				this.anInt3626 += arg0;
				this.method2790(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3627 - this.anInt3626;
			this.method2790(local29);
			arg0 -= local29;
			this.anInt3626 += local29;
			this.method2792();
			@Pc(50) Class4_Sub9 local50 = (Class4_Sub9) this.aClass258_29.method5538();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1609(this);
				if (local58 < 0) {
					local50.anInt2146 = 0;
					this.method2786(local50);
				} else {
					local50.anInt2146 = local58;
					this.method2791(local50.aClass4_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	private void method2790(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub18 local5 = (Class4_Sub18) this.aClass258_28.method5538(); local5 != null; local5 = (Class4_Sub18) this.aClass258_28.method5528()) {
			local5.method5749(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!vg;Lclient!es;)V")
	private void method2791(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		while (arg0 != this.aClass258_29.aClass4_240 && ((Class4_Sub9) arg0).anInt2146 <= arg1.anInt2146) {
			arg0 = arg0.aClass4_261;
		}
		Static48.method1021(arg0, arg1);
		this.anInt3627 = ((Class4_Sub9) this.aClass258_29.aClass4_240.aClass4_261).anInt2146;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "()V")
	private void method2792() {
		if (this.anInt3626 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub9 local8 = (Class4_Sub9) this.aClass258_29.method5538(); local8 != null; local8 = (Class4_Sub9) this.aClass258_29.method5528()) {
			local8.anInt2146 -= this.anInt3626;
		}
		this.anInt3627 -= this.anInt3626;
		this.anInt3626 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5751() {
		return (Class4_Sub18) this.aClass258_28.method5538();
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()I")
	@Override
	public int method5754() {
		return 0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()Lclient!ho;")
	@Override
	public Class4_Sub18 method5752() {
		return (Class4_Sub18) this.aClass258_28.method5528();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3627 < 0) {
				this.method2788(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3626 + arg2 < this.anInt3627) {
				this.anInt3626 += arg2;
				this.method2788(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3627 - this.anInt3626;
			this.method2788(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3626 += local33;
			this.method2792();
			@Pc(60) Class4_Sub9 local60 = (Class4_Sub9) this.aClass258_29.method5538();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1609(this);
				if (local68 < 0) {
					local60.anInt2146 = 0;
					this.method2786(local60);
				} else {
					local60.anInt2146 = local68;
					this.method2791(local60.aClass4_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "()I")
	public synchronized int method2793() {
		return this.aClass258_28.method5535();
	}
}
