import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ae;")
	public static Class4 aClass4_11 = null;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt2133 = 1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!em;")
	public static Class1_Sub3 method2138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub3_2 == null ? null : local7.aClass1_Sub3_2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) Class1_Sub5_Sub1 local26;
		@Pc(15) int local15;
		if (arg9 < 0) {
			local15 = -arg9 - 1;
			if (local15 == Static176.anInt3381) {
				local26 = Static206.aClass1_Sub5_Sub1_Sub1_1;
			} else {
				local26 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local15];
			}
		} else {
			local15 = arg9 - 1;
			local26 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local15];
		}
		if (local26 == null) {
			return;
		}
		@Pc(48) Class172 local48 = Static221.aClass118_6.method2858(arg5);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg7 == 1 || arg7 == 3) {
			local57 = local48.anInt4106;
			local60 = local48.anInt4113;
		} else {
			local57 = local48.anInt4113;
			local60 = local48.anInt4106;
		}
		@Pc(74) int local74 = arg2 + (local60 >> 1);
		@Pc(82) int local82 = (local60 + 1 >> 1) + arg2;
		@Pc(89) int local89 = arg4 + (local57 >> 1);
		@Pc(97) int local97 = (local57 + 1 >> 1) + arg4;
		@Pc(101) Class107 local101 = Static350.aClass107Array4[arg6];
		@Pc(123) int local123 = local101.method4685(local74, local89) + local101.method4685(local82, local89) + local101.method4685(local74, local97) + local101.method4685(local82, local97) >> 2;
		@Pc(127) Class2_Sub42 local127 = new Class2_Sub42();
		local127.anInt6016 = Static253.anInt4469 + arg10;
		local127.anInt6017 = arg11;
		local127.anInt6008 = arg7;
		local127.anInt6019 = arg2;
		@Pc(151) int local151;
		if (arg1 < arg12) {
			local151 = arg12;
			arg12 = arg1;
			arg1 = local151;
		}
		local127.anInt6018 = local26.aByte69;
		local127.anInt6014 = arg8 + Static253.anInt4469;
		local127.anInt6005 = arg4;
		local127.anInt6006 = arg5;
		if (arg3 > arg0) {
			local151 = arg3;
			arg3 = arg0;
			arg0 = local151;
		}
		local127.anInt6025 = arg1 + arg2;
		local127.anInt6024 = arg12 + arg2;
		local127.anInt6023 = local123;
		local127.anInt6021 = local57 * 64 + local127.anInt6005 * 128;
		local127.anInt6011 = arg3 + arg4;
		local127.anInt6007 = local60 * 64 + local127.anInt6019 * 128;
		local127.anInt6015 = arg0 + arg4;
		Static184.aClass30_26.method685(local127);
		local26.aClass2_Sub42_3 = local127;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)Z")
	public static boolean method2140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class172 local13 = Static221.aClass118_6.method2858(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method3790(arg0);
	}
}
