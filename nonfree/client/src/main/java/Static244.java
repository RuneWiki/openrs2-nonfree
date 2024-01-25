import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ji", name = "Ub", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3920(@OriginalArg(1) String arg0) {
		if (!Static418.aBoolean541 || (Static163.anInt3317 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static413.anInt8212;
		@Pc(18) int[] local18 = Static229.anIntArray201;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class1_Sub4_Sub2_Sub1_Sub2 local28 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local18[local20]];
			if (local28.aString78 != null && local28.aString78.equalsIgnoreCase(arg0) && (local28 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 && (Static163.anInt3317 & 0x10) != 0 || local28 != null && (Static163.anInt3317 & 0x8) != 0)) {
				@Pc(61) Class4_Sub14 local61 = Static196.method3380(Static17.aClass159_1, Static381.aClass173_98);
				local61.aClass4_Sub11_Sub1_3.method4944(0);
				local61.aClass4_Sub11_Sub1_3.method4932(local18[local20]);
				local61.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
				local61.aClass4_Sub11_Sub1_3.method4932(Static317.anInt10281);
				local61.aClass4_Sub11_Sub1_3.method4909(Static7.anInt173);
				Static353.method5712(local61);
				local14 = true;
				Static398.method6283(0, local28.anIntArray463[0], 0, -2, true, local28.method6925(), local28.anIntArray462[0], local28.method6925());
				break;
			}
		}
		if (!local14) {
			Static465.method7052(Static590.aClass364_25.method8334(Static154.anInt3181) + arg0);
		}
		if (Static418.aBoolean541) {
			Static419.method6558();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIFIFIII[F)V")
	public static void method3924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg4 - arg0;
		@Pc(13) int local13 = arg6 - arg2;
		@Pc(17) int local17 = arg7 - arg1;
		@Pc(38) float local38 = arg9[0] * (float) local5 + arg9[1] * (float) local13 + (float) local17 * arg9[2];
		@Pc(59) float local59 = arg9[5] * (float) local17 + arg9[3] * (float) local5 + (float) local13 * arg9[4];
		@Pc(80) float local80 = arg9[7] * (float) local13 + (float) local5 * arg9[6] + arg9[8] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local91 *= arg3;
		}
		@Pc(105) float local105 = local59 + arg5 + 0.5F;
		@Pc(117) float local117;
		if (arg8 == 1) {
			local117 = local91;
			local91 = -local105;
			local105 = local117;
		} else if (arg8 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg8 == 3) {
			local117 = local91;
			local91 = local105;
			local105 = -local117;
		}
		Static508.aFloat218 = local91;
		Static290.aFloat187 = local105;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)Z")
	public static boolean method3929(@OriginalArg(1) int arg0) {
		return arg0 == 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)I")
	public static int method3930(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
