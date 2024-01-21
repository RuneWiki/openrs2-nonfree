import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!qd;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_600 = Static65.method1172("Mem:");

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_601 = Static65.method1172("mapedge");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	public static void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static21.anInt3036; local3++) {
			if (Static42.anIntArray104[local3] + Static119.anIntArray326[local3] > arg0 && arg0 + arg3 > Static119.anIntArray326[local3] && Static54.anIntArray133[local3] + Static33.anIntArray68[local3] > arg1 && arg1 + arg2 > Static33.anIntArray68[local3]) {
				Static178.aBooleanArray20[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ef;ILclient!ef;)V")
	public static void method1175(@OriginalArg(0) Class3_Sub2_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub2_Sub3_Sub1_Sub1 arg1) {
		if (Static139.aBoolean134) {
			Static91.method1510(arg1, arg0);
			return;
		}
		if (Static26.anInt597 == 0 || Static26.anInt597 == 5) {
			arg0.method805(Static53.aClass46_462, 382, 225, 16777215, -1);
			Static103.method2228(230, 233, 304, 34, 9179409);
			Static103.method2228(231, 234, 302, 32, 0);
			Static103.method2210(232, 235, Static52.anInt1390 * 3, 30, 9179409);
			Static103.method2210(Static52.anInt1390 * 3 + 232, 235, 300 - Static52.anInt1390 * 3, 30, 0);
			arg0.method805(Static130.aClass46_1059, 382, 256, 16777215, -1);
		}
		@Pc(110) short local110;
		@Pc(118) int local118;
		if (Static26.anInt597 == 20) {
			Static124.aClass3_Sub2_Sub3_Sub2_4.method1713(382 - Static124.aClass3_Sub2_Sub3_Sub2_4.anInt2494 / 2, 271 - Static124.aClass3_Sub2_Sub3_Sub2_4.anInt2495 / 2);
			local110 = 211;
			arg0.method805(Static130.aClass46_1062, 382, 211, 16776960, 0);
			local118 = local110 + 15;
			arg0.method805(Static130.aClass46_1060, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg0.method805(Static130.aClass46_1064, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg0.method821(Static178.method2860(new Class46[] { Static154.aClass46_1207, Static138.method815(Static130.aClass46_1066) }), 272, 266, 16777215, 0);
			@Pc(157) int local157 = local135 + 15;
			arg0.method821(Static178.method2860(new Class46[] { Static108.aClass46_852, Static130.aClass46_1063.method1375() }), 274, 281, 16777215, 0);
			@Pc(178) int local178 = local157 + 15;
		}
		if (Static26.anInt597 == 10) {
			Static124.aClass3_Sub2_Sub3_Sub2_4.method1713(202, 171);
			if (Static122.anInt2903 == 0) {
				local110 = 251;
				arg0.method805(Static78.aClass46_791, 382, 251, 16776960, 0);
				local118 = local110 + 30;
				Static9.aClass3_Sub2_Sub3_Sub2_1.method1713(229, 271);
				arg0.method819(Static99.aClass46_796, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static9.aClass3_Sub2_Sub3_Sub2_1.method1713(389, 271);
				arg0.method819(Static63.aClass46_562, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static122.anInt2903 == 2) {
				local110 = 211;
				arg0.method805(Static130.aClass46_1062, 382, 211, 16776960, 0);
				local118 = local110 + 15;
				arg0.method805(Static130.aClass46_1060, 382, 226, 16776960, 0);
				local118 += 15;
				arg0.method805(Static130.aClass46_1064, 382, 241, 16776960, 0);
				@Pc(312) boolean local312;
				if (Static28.anInt691 == 0 && Static20.anInt512 % 40 < 20 && Static89.aBoolean92) {
					local312 = true;
				} else {
					local312 = false;
				}
				local118 += 15;
				local118 += 10;
				arg0.method821(Static178.method2860(new Class46[] { Static154.aClass46_1207, Static138.method815(Static130.aClass46_1066), local312 ? Static146.aClass46_1167 : Static130.aClass46_1067 }), 272, 266, 16777215, 0);
				if (Static28.anInt691 == 1 && Static20.anInt512 % 40 < 20 && Static89.aBoolean92) {
					local312 = true;
				} else {
					local312 = false;
				}
				local118 += 15;
				arg0.method821(Static178.method2860(new Class46[] { Static108.aClass46_852, Static130.aClass46_1063.method1375(), local312 ? Static146.aClass46_1167 : Static130.aClass46_1067 }), 274, 281, 16777215, 0);
				local118 += 15;
				Static9.aClass3_Sub2_Sub3_Sub2_1.method1713(229, 301);
				arg0.method805(Static128.aClass46_1045, 302, 326, 16777215, 0);
				Static9.aClass3_Sub2_Sub3_Sub2_1.method1713(389, 301);
				arg0.method805(Static30.aClass46_185, 462, 326, 16777215, 0);
			} else if (Static122.anInt2903 == 3) {
				arg0.method805(Static180.aClass46_1429, 382, 211, 16776960, 0);
				local110 = 236;
				arg0.method805(Static59.aClass46_538, 382, 236, 16777215, 0);
				local118 = local110 + 15;
				arg0.method805(Static139.aClass46_1115, 382, 251, 16777215, 0);
				local118 += 15;
				arg0.method805(Static72.aClass46_637, 382, 266, 16777215, 0);
				local118 += 15;
				arg0.method805(Static36.aClass46_283, 382, 281, 16777215, 0);
				Static9.aClass3_Sub2_Sub3_Sub2_1.method1713(309, 301);
				local118 += 15;
				arg0.method805(Static30.aClass46_185, 382, 326, 16777215, 0);
			}
		}
		if (Static124.anInt2956 != 1) {
			if (Static36.anInt1029 > 0) {
				Static46.method912(Static36.anInt1029);
				Static36.anInt1029 = 0;
			}
			Static99.method1643();
		}
		Static146.aClass3_Sub2_Sub3_Sub2Array7[Static148.aBoolean151 ? 1 : 0].method1713(725, 463);
		if (Static26.anInt597 <= 5 || Static48.anInt1331 == 2 || Static122.anInt2902 != 0) {
			return;
		}
		if (Static99.aClass3_Sub2_Sub3_Sub2_3 == null) {
			Static99.aClass3_Sub2_Sub3_Sub2_3 = Static106.method1736(Static175.aClass46_1381, Static181.aClass44_Sub1_18, Static130.aClass46_1067);
			return;
		}
		Static99.aClass3_Sub2_Sub3_Sub2_3.method1713(5, 463);
		arg0.method805(Static178.method2860(new Class46[] { Static58.aClass46_526, Static94.aClass46_774, Static57.method1068(Static179.anInt3950) }), 55, 478, 16777215, 0);
		if (Static51.aClass73_1 == null) {
			arg1.method805(Static36.aClass46_282, 55, 492, 16777215, 0);
		} else {
			arg1.method805(Static34.aClass46_261, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public static void method1176() {
		aClass46_600 = null;
		aClass68_4 = null;
		aClass46_601 = null;
		anIntArray166 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZI)I")
	public static int method1177() {
		return Static23.anInt531 + Static137.anInt3204;
	}
}
