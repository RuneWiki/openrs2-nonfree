import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class25_Sub1_Sub3 extends Class25_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
	private final boolean aBoolean605;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Z")
	private final boolean aBoolean606;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "Z")
	private final boolean aBoolean607;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "Lclient!i;")
	private Class1_Sub5_Sub10 aClass1_Sub5_Sub10_4;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "Lclient!e;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIZIIIII)V")
	public Class25_Sub1_Sub3(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static231.method3309(arg11, arg10));
		super.anInt5355 = arg5;
		this.aByte90 = (byte) arg10;
		this.aByte88 = (byte) arg11;
		super.anInt5351 = arg3;
		this.aByte89 = (byte) arg2;
		this.aBoolean605 = arg1.anInt1821 != 0 && !arg6;
		this.aShort93 = (short) arg1.anInt1787;
		this.aBoolean606 = arg6;
		this.aBoolean607 = arg0.method5758() && arg1.aBoolean205 && !this.aBoolean606 && Static453.aClass136_Sub1_1.method3516(Static14.anInt293) != 0;
		@Pc(77) Class247 local77 = this.method4218(this.aBoolean607, arg0, 2048);
		if (local77 != null) {
			this.aClass1_Sub5_Sub10_4 = local77.aClass1_Sub5_Sub10_6;
			this.aClass57_5 = local77.aClass57_7;
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		@Pc(21) Class1_Sub5_Sub10 local21;
		if (this.aClass1_Sub5_Sub10_4 == null && this.aBoolean607) {
			@Pc(34) Class247 local34 = this.method4218(true, arg0, 262144);
			local21 = local34 == null ? null : local34.aClass1_Sub5_Sub10_6;
		} else {
			local21 = this.aClass1_Sub5_Sub10_4;
			this.aClass1_Sub5_Sub10_4 = null;
		}
		if (local21 != null) {
			Static343.method4626(local21, this.aByte89, super.anInt5351, super.anInt5355, null);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aBoolean607;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!za;II)Lclient!uu;")
	private Class247 method4218(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class68 local22 = Static341.aClass75_4.method1616(this.aShort93 & 0xFFFF);
		@Pc(34) Class157 local34;
		@Pc(29) Class157 local29;
		if (this.aBoolean606) {
			local29 = Static330.aClass157Array2[0];
			local34 = Static343.aClass157Array3[this.aByte89];
		} else {
			local34 = Static330.aClass157Array2[this.aByte89];
			if (this.aByte89 < 3) {
				local29 = Static330.aClass157Array2[this.aByte89 + 1];
			} else {
				local29 = null;
			}
		}
		return local22.method1548(local34, arg2, arg0, this.aByte90, super.anInt5355, local29, super.anInt5356, arg1, super.anInt5351, this.aByte88);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
		if (this.aClass57_5 != null) {
			this.aClass57_5.method5963();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class57 local14 = this.method4220(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class32 local19 = arg1.method5747();
			local19.U(super.anInt5351, super.anInt5356, super.anInt5355);
			return local14.method5957(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		@Pc(18) Class1_Sub5_Sub10 local18;
		if (this.aClass1_Sub5_Sub10_4 == null && this.aBoolean607) {
			@Pc(29) Class247 local29 = this.method4218(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub5_Sub10_6;
		} else {
			local18 = this.aClass1_Sub5_Sub10_4;
			this.aClass1_Sub5_Sub10_4 = null;
		}
		if (local18 != null) {
			Static195.method2810(local18, this.aByte89, super.anInt5351, super.anInt5355, null);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass57_5 == null) {
			return null;
		}
		@Pc(11) Class32 local11 = arg0.method5747();
		local11.U(super.anInt5351 + super.anInt5359, super.anInt5356, super.anInt5353 + super.anInt5355);
		@Pc(28) Class4_Sub7 local28 = null;
		if (this.aBoolean605) {
			local28 = Static142.method2157(1);
		}
		this.aClass57_5.method5953(local11, local28 == null ? null : local28.aClass4_Sub8Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)I")
	@Override
	public int method4207() {
		return this.aClass57_5 == null ? 0 : this.aClass57_5.B();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	private Class57 method4220(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1) {
		if (this.aClass57_5 != null && arg1.method5783(this.aClass57_5.RA(), arg0) == 0) {
			return this.aClass57_5;
		} else {
			@Pc(34) Class247 local34 = this.method4218(false, arg1, arg0);
			return local34 == null ? null : local34.aClass57_7;
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.method4220(arg0, arg1);
	}
}
