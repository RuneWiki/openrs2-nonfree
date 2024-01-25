import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class15_Sub3_Sub1_Sub1 extends Class15_Sub3_Sub1 implements Interface23 {

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "Lclient!mg;")
	private Class232 aClass232_1;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Z")
	private final boolean aBoolean50;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "Z")
	private final boolean aBoolean49;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "Lclient!ka;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "Lclient!r;")
	private Class2_Sub1_Sub11 aClass2_Sub1_Sub11_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIIII)V")
	public Class15_Sub3_Sub1_Sub1(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort18 = (short) arg1.anInt9434;
		this.aBoolean50 = arg7;
		this.aByte11 = (byte) arg11;
		super.anInt11022 = arg4;
		super.anInt11024 = arg6;
		this.aByte10 = (byte) arg10;
		this.aBoolean51 = arg1.lb != 0 && !arg7;
		this.aBoolean49 = arg0.method8134() && arg1.aBoolean698 && !this.aBoolean50 && Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() != 0;
		@Pc(67) Class173 local67 = this.method914(2048, arg0, this.aBoolean49);
		if (local67 != null) {
			this.aClass14_1 = local67.aClass14_2;
			this.aClass2_Sub1_Sub11_1 = local67.aClass2_Sub1_Sub11_2;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		if (this.aClass232_1 == null) {
			this.aClass232_1 = Static264.method4550(super.anInt11024, super.anInt11029, this.method915(arg0, 0), super.anInt11022);
		}
		return this.aClass232_1;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass14_1 == null ? 0 : this.aClass14_1.fa();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
		if (this.aClass14_1 != null) {
			this.aClass14_1.method8620();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ha;BZ)Lclient!iu;")
	private Class173 method914(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class331 local18 = Static251.aClass328_1.method8261(this.aShort18 & 0xFFFF);
		@Pc(26) Class18 local26;
		@Pc(30) Class18 local30;
		if (this.aBoolean50) {
			local26 = Static93.aClass18Array33[super.aByte141];
			local30 = Static549.aClass18Array30[0];
		} else {
			local26 = Static549.aClass18Array30[super.aByte141];
			if (super.aByte141 >= 3) {
				local30 = null;
			} else {
				local30 = Static549.aClass18Array30[super.aByte141 + 1];
			}
		}
		return local18.method8293(this.aByte11, this.aByte10, super.anInt11024, arg0, arg2, super.anInt11029, local30, (Class278) null, super.anInt11022, arg1, local26);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		@Pc(25) Class2_Sub1_Sub11 local25;
		if (this.aClass2_Sub1_Sub11_1 == null && this.aBoolean49) {
			@Pc(18) Class173 local18 = this.method914(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub11_2;
		} else {
			local25 = this.aClass2_Sub1_Sub11_1;
			this.aClass2_Sub1_Sub11_1 = null;
		}
		if (local25 != null) {
			Static662.method8957(local25, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aByte11;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aClass14_1 == null ? false : this.aClass14_1.F();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		@Pc(18) Class2_Sub1_Sub11 local18;
		if (this.aClass2_Sub1_Sub11_1 == null && this.aBoolean49) {
			@Pc(29) Class173 local29 = this.method914(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass2_Sub1_Sub11_2;
		} else {
			local18 = this.aClass2_Sub1_Sub11_1;
			this.aClass2_Sub1_Sub11_1 = null;
		}
		if (local18 != null) {
			Static13.method7472(local18, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass14_1 == null ? 0 : this.aClass14_1.ma();
		} else {
			return 19;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass14_1 == null) {
			return null;
		}
		@Pc(18) Class76 local18 = arg0.method8085();
		local18.method9639(super.aShort103 + super.anInt11022, super.anInt11029, super.anInt11024 + super.aShort104);
		@Pc(38) Class15_Sub9 local38 = Static401.method6614(1, this.aBoolean51);
		if (Static110.aBoolean800) {
			this.aClass14_1.method8623(local18, local38.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			this.aClass14_1.method8641(local18, local38.aClass15_Sub6Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		if (this.aClass14_1 == null) {
			return true;
		} else {
			return !this.aClass14_1.r();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(9) Class14 local9 = this.method915(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class76 local14 = arg2.method8085();
			local14.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local9.method8625(arg0, arg1, local14, false, 0, Static165.anInt3552) : local9.method8624(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aBoolean49;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class14 method915(@OriginalArg(1) Class101 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass14_1 != null && arg0.method8083(this.aClass14_1.ua(), arg1) == 0) {
			return this.aClass14_1;
		} else {
			@Pc(35) Class173 local35 = this.method914(arg1, arg0, false);
			return local35 == null ? null : local35.aClass14_2;
		}
	}
}
