import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "Lclient!c;")
	private Class17 aClass17_26 = new Class17();

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "Lclient!c;")
	private Class17 aClass17_27 = new Class17();

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
	private int anInt4784 = -1;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	private int anInt4783 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3727() {
		return (Class4_Sub6) this.aClass17_26.method613();
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "()V")
	private void method3729() {
		if (this.anInt4783 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub10 local8 = (Class4_Sub10) this.aClass17_27.method613(); local8 != null; local8 = (Class4_Sub10) this.aClass17_27.method607()) {
			local8.anInt1167 -= this.anInt4783;
		}
		this.anInt4784 -= this.anInt4783;
		this.anInt4783 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!mj;)V")
	public synchronized void method3730(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.method4690();
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!mj;)V")
	public synchronized void method3731(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aClass17_26.method611(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V")
	private void method3732(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass17_26.method613(); local5 != null; local5 = (Class4_Sub6) this.aClass17_26.method607()) {
			local5.method3728(arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4784 < 0) {
				this.method3732(arg0);
				return;
			}
			if (this.anInt4783 + arg0 < this.anInt4784) {
				this.anInt4783 += arg0;
				this.method3732(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4784 - this.anInt4783;
			this.method3732(local29);
			arg0 -= local29;
			this.anInt4783 += local29;
			this.method3729();
			@Pc(50) Class4_Sub10 local50 = (Class4_Sub10) this.aClass17_27.method613();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1001(this);
				if (local58 < 0) {
					local50.anInt1167 = 0;
					this.method3733(local50);
				} else {
					local50.anInt1167 = local58;
					this.method3735(local50.aClass4_233, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4784 < 0) {
				this.method3734(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4783 + arg2 < this.anInt4784) {
				this.anInt4783 += arg2;
				this.method3734(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4784 - this.anInt4783;
			this.method3734(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4783 += local33;
			this.method3729();
			@Pc(60) Class4_Sub10 local60 = (Class4_Sub10) this.aClass17_27.method613();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1001(this);
				if (local68 < 0) {
					local60.anInt1167 = 0;
					this.method3733(local60);
				} else {
					local60.anInt1167 = local68;
					this.method3735(local60.aClass4_233, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!dh;)V")
	private void method3733(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.method4690();
		arg0.method1002();
		@Pc(9) Class4 local9 = this.aClass17_27.aClass4_33.aClass4_233;
		if (local9 == this.aClass17_27.aClass4_33) {
			this.anInt4784 = -1;
		} else {
			this.anInt4784 = ((Class4_Sub10) local9).anInt1167;
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "()Lclient!mj;")
	@Override
	public Class4_Sub6 method3725() {
		return (Class4_Sub6) this.aClass17_26.method607();
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "([III)V")
	private void method3734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass17_26.method613(); local5 != null; local5 = (Class4_Sub6) this.aClass17_26.method607()) {
			local5.method3726(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "()I")
	@Override
	public int method3724() {
		return 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!te;Lclient!dh;)V")
	private void method3735(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		while (arg0 != this.aClass17_27.aClass4_33 && ((Class4_Sub10) arg0).anInt1167 <= arg1.anInt1167) {
			arg0 = arg0.aClass4_233;
		}
		Static284.method4442(arg0, arg1);
		this.anInt4784 = ((Class4_Sub10) this.aClass17_27.aClass4_33.aClass4_233).anInt1167;
	}
}
