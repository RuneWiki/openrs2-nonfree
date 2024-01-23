import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
	public static int[] anIntArray603 = new int[50];

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString216 = "glow2:";

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString217 = "flash2:";

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36 = null;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg6;
		@Pc(21) int local21 = arg0 - arg6;
		@Pc(33) int local33 = arg0 * arg0;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = arg1 * arg1;
		@Pc(45) int local45 = local21 * local21;
		@Pc(49) int local49 = local41 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = local45 << 1;
		@Pc(65) int local65 = arg0 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local33 - (local65 - 1) * local49;
		@Pc(86) int local86 = local53 + local41 * (1 - local65);
		@Pc(95) int local95 = local45 - (local69 - 1) * local57;
		@Pc(99) int local99 = local41 << 2;
		@Pc(109) int local109 = (1 - local69) * local37 + local61;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local53 * 3;
		@Pc(121) int local121 = local33 << 2;
		@Pc(127) int local127 = (local65 - 3) * local49;
		@Pc(131) int local131 = local45 << 2;
		@Pc(135) int local135 = local61 * 3;
		@Pc(141) int local141 = local99 * (arg0 - 1);
		@Pc(143) int local143 = local131;
		@Pc(145) int local145 = local121;
		@Pc(151) int local151 = local113 * (local21 - 1);
		@Pc(157) int local157 = local57 * (local69 - 3);
		@Pc(161) int[] local161 = Static40.anIntArrayArray6[arg3];
		Static103.method1978(arg5, arg4 - local16, -arg1 + arg4, local161);
		Static103.method1978(arg2, arg4 + local16, arg4 - local16, local161);
		Static103.method1978(arg5, arg4 + arg1, local16 + arg4, local161);
		while (local9 > 0) {
			if (local86 < 0) {
				while (local86 < 0) {
					local86 += local117;
					local7++;
					local117 += local121;
					local78 += local145;
					local145 += local121;
				}
			}
			if (local78 < 0) {
				local78 += local145;
				local7++;
				local145 += local121;
				local86 += local117;
				local117 += local121;
			}
			local78 += -local127;
			@Pc(257) boolean local257 = local21 >= local9;
			local9--;
			local86 += -local141;
			if (local257) {
				if (local109 < 0) {
					while (local109 < 0) {
						local95 += local143;
						local11++;
						local109 += local135;
						local135 += local131;
						local143 += local131;
					}
				}
				if (local95 < 0) {
					local109 += local135;
					local11++;
					local135 += local131;
					local95 += local143;
					local143 += local131;
				}
				local109 += -local151;
				local151 -= local113;
				local95 += -local157;
				local157 -= local113;
			}
			local127 -= local99;
			@Pc(342) int local342 = arg3 - local9;
			local141 -= local99;
			@Pc(350) int local350 = local9 + arg3;
			@Pc(354) int local354 = local7 + arg4;
			@Pc(358) int local358 = arg4 - local7;
			if (local257) {
				@Pc(383) int local383 = arg4 + local11;
				@Pc(388) int local388 = arg4 - local11;
				Static103.method1978(arg5, local388, local358, Static40.anIntArrayArray6[local342]);
				Static103.method1978(arg2, local383, local388, Static40.anIntArrayArray6[local342]);
				Static103.method1978(arg5, local354, local383, Static40.anIntArrayArray6[local342]);
				Static103.method1978(arg5, local388, local358, Static40.anIntArrayArray6[local350]);
				Static103.method1978(arg2, local383, local388, Static40.anIntArrayArray6[local350]);
				Static103.method1978(arg5, local354, local383, Static40.anIntArrayArray6[local350]);
			} else {
				Static103.method1978(arg5, local354, local358, Static40.anIntArrayArray6[local342]);
				Static103.method1978(arg5, local354, local358, Static40.anIntArrayArray6[local350]);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I")
	public static int method4566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 <= arg0 ? (arg2 >= arg0 ? arg0 : arg2) : arg1;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
	public static void method4568() {
		@Pc(7) int local7 = Static92.anInt1933;
		@Pc(9) int local9 = Static48.anInt1073;
		@Pc(11) int local11 = Static229.anInt4962;
		@Pc(13) int local13 = Static282.anInt5139;
		if (Static71.aBoolean165) {
			Static93.method1777(local7, local9, local11, local13, 6116423);
			Static93.method1777(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static93.method1773(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		} else {
			Static77.method1596(local7, local9, local11, local13, 6116423);
			Static77.method1596(local7 + 1, local9 - -1, local11 - 2, 16, 0);
			Static77.method1580(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		}
		Static19.aClass1_Sub5_Sub9_1.method2878(Static252.aString165, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(108) int local108 = Static14.anInt309;
		@Pc(110) int local110 = Static89.anInt1899;
		for (@Pc(112) int local112 = 0; local112 < Static241.anInt4470; local112++) {
			@Pc(121) int local121 = 16777215;
			@Pc(135) int local135 = local9 + (Static241.anInt4470 - (1 - -local112)) * 15 + 31;
			if (local7 < local110 && local7 + local11 > local110 && local108 > local135 - 13 && local135 + 3 > local108) {
				local121 = 16776960;
			}
			Static19.aClass1_Sub5_Sub9_1.method2878(Static42.method774(local112), local7 + 3, local135, local121, 0);
		}
		Static255.method4002(Static229.anInt4962, Static282.anInt5139, Static48.anInt1073, Static92.anInt1933);
	}
}
