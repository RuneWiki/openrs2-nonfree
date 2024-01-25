import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Lclient!mj;")
	public final Class133 aClass133_1;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "Z")
	private final boolean aBoolean172;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIIIZIIII)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static34.method570(arg2, arg3));
		this.aClass133_1 = new Class133(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean172 = arg1.anInt4756 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(20) Class112 local20 = this.aClass133_1.method3491(super.anInt3787, arg0, false, super.anInt3789, 131072, true);
		if (local20 != null) {
			this.aClass133_1.method3493(arg0, false, super.anInt3789 >> 7, super.anInt3789 >> 7, super.anInt3787 >> 7, super.anInt3787 >> 7, local20);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_1.method3491(0, arg0, false, 0, arg1, false);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
	@Override
	public int method3426() {
		return this.aClass133_1.method3485();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class112 local16 = this.aClass133_1.method3491(super.anInt3787, arg1, false, super.anInt3789, 65536, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class66 local28 = arg1.method5195();
			local28.method5822(super.anInt3791 + super.anInt3787, super.anInt3795, super.anInt3789 + super.anInt3794);
			return local16.method4340(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aClass133_1.anInt3926;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		this.aClass133_1.method3484(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		this.aClass133_1.method3494(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aClass133_1.anInt3925;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aClass133_1.method3490();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aClass133_1.anInt3933;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(18) Class112 local18 = this.aClass133_1.method3491(super.anInt3787, arg0, false, super.anInt3789, 1024, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class66 local25 = arg0.method5195();
		local25.method5822(super.anInt3787 + super.anInt3791, super.anInt3795, super.anInt3789 + super.anInt3794);
		@Pc(47) Class32_Sub4 local47 = null;
		if (this.aBoolean172) {
			local47 = Static232.method4183(1);
		}
		if (this.aClass133_1.aClass32_Sub7_4 == null) {
			local18.method4338(local25, local47 == null ? null : local47.aClass32_Sub8Array1[0], 0);
		} else {
			@Pc(77) Class146 local77 = this.aClass133_1.aClass32_Sub7_4.method4955();
			arg0.method5241(local18, local77, local25, local47 == null ? null : local47.aClass32_Sub8Array1[0]);
		}
		this.aClass133_1.method3493(arg0, true, super.anInt3789 >> 7, super.anInt3789 >> 7, super.anInt3787 >> 7, super.anInt3787 >> 7, local18);
		return local47;
	}
}
