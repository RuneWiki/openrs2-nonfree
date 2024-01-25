import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!in;")
	public static Class112 aClass112_2;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIZIII)V")
	public static void method3240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static151.aClass217ArrayArrayArray3 == null) {
			Static266.aClass75_7.method2600(arg0, arg3, arg1, arg4, -16777216);
		} else if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >= 0 && Static399.anInt6923 * 128 > Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 && Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >= 0 && Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 < Static127.anInt2696 * 128) {
			Static164.anInt3507++;
			if (Static113.aClass1_Sub3_Sub3_Sub1_4 != null && Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() * 64 >> 7 == Static388.anInt6735 && Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() * 64 >> 7 == Static116.anInt6680) {
				Static116.anInt6680 = -1;
				Static388.anInt6735 = -1;
				Static279.method5819();
			}
			Static429.method5682();
			if (!arg2) {
				Static113.method5341();
			}
			Static234.method3684();
			Static306.method4510(arg0, true, arg1, arg3, arg4);
			@Pc(106) int local106 = Static375.anInt6613;
			@Pc(108) int local108 = Static450.anInt7598;
			@Pc(110) int local110 = Static444.anInt7527;
			@Pc(112) int local112 = Static390.anInt6741;
			@Pc(120) int local120;
			@Pc(162) int local162;
			if (Static107.anInt2382 == 1) {
				local120 = (int) Static265.aFloat64;
				if (local120 < Static338.anInt1371 >> 8) {
					local120 = Static338.anInt1371 >> 8;
				}
				if (Static310.aBooleanArray23[4] && local120 < Static35.anIntArray427[4] + 128) {
					local120 = Static35.anIntArray427[4] + 128;
				}
				local162 = (int) Static235.aFloat60 + Static407.anInt7062 & 0x3FFF;
				Static292.method4286(Static334.anInt6158, local110, local162, (local120 >> 3) * 3 + 600 << 0, Static124.method2209(Static124.anInt2688, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055) - 50, Static288.anInt5279, local120);
			} else if (Static107.anInt2382 == 4) {
				local120 = (int) Static265.aFloat64;
				if (local120 < Static338.anInt1371 >> 8) {
					local120 = Static338.anInt1371 >> 8;
				}
				if (Static310.aBooleanArray23[4] && Static35.anIntArray427[4] + 128 > local120) {
					local120 = Static35.anIntArray427[4] + 128;
				}
				local162 = (int) Static235.aFloat60 & 0x3FFF;
				Static292.method4286(Static334.anInt6158, local110, local162, (local120 >> 3) * 3 + 600 << 0, Static124.method2209(Static124.anInt2688, Static222.anInt4311, Static358.anInt5918) - 50, Static288.anInt5279, local120);
			} else if (Static107.anInt2382 == 5) {
				Static336.method4870(local110);
			}
			local120 = Static398.anInt6901;
			local162 = Static422.anInt7281;
			@Pc(271) int local271 = Static80.anInt1722;
			@Pc(273) int local273 = Static141.anInt3177;
			@Pc(280) int local280 = Static430.anInt7326;
			@Pc(324) int local324;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static310.aBooleanArray23[local282]) {
					local324 = (int) ((double) -Static21.anIntArray47[local282] + Math.random() * (double) (Static21.anIntArray47[local282] * 2 + 1) + Math.sin((double) Static40.anIntArray586[local282] / 100.0D * (double) Static355.anIntArray460[local282]) * (double) Static35.anIntArray427[local282]);
					if (local282 == 1) {
						Static422.anInt7281 += local324;
					}
					if (local282 == 4) {
						Static141.anInt3177 += local324;
						if (Static141.anInt3177 < 1024) {
							Static141.anInt3177 = 1024;
						} else if (Static141.anInt3177 > 3072) {
							Static141.anInt3177 = 3072;
						}
					}
					if (local282 == 2) {
						Static80.anInt1722 += local324;
					}
					if (local282 == 0) {
						Static398.anInt6901 += local324;
					}
					if (local282 == 3) {
						Static430.anInt7326 = Static430.anInt7326 + local324 & 0x3FFF;
					}
				}
			}
			if (Static398.anInt6901 < 0) {
				Static398.anInt6901 = 0;
			}
			if (Static80.anInt1722 < 0) {
				Static80.anInt1722 = 0;
			}
			if ((Static177.anInt3621 << 7) - 1 < Static398.anInt6901) {
				Static398.anInt6901 = (Static177.anInt3621 << 7) - 1;
			}
			if (Static80.anInt1722 > (Static57.anInt1411 << 7) - 1) {
				Static80.anInt1722 = (Static57.anInt1411 << 7) - 1;
			}
			Static281.method4137();
			Static265.method3998();
			Static266.aClass75_7.pa(local108, local106, local112 + local108, local106 + local110);
			Static266.aClass75_7.method2570();
			local324 = Static177.anInt3620;
			if (Static5.aClass29_1 == null) {
				Static266.aClass75_7.M(local324);
			} else {
				Static5.aClass29_1.method933(local106, local108, local112, local110, Static141.anInt3177, Static430.anInt7326, local324, Static374.anInt6606 << 3, Static266.aClass75_7);
			}
			Static143.method2556();
			Static203.aClass106_2.Q(Static398.anInt6901, Static422.anInt7281, Static80.anInt1722, -Static141.anInt3177 & 0x3FFF, -Static430.anInt7326 & 0x3FFF, -Static285.anInt5234 & 0x3FFF);
			Static266.aClass75_7.m(Static203.aClass106_2);
			Static266.aClass75_7.GA(local108 + local112 / 2, local106 + local110 / 2, Static15.anInt485 << 1, Static15.anInt485 << 1);
			Static377.method5207(Static15.anInt485 << 1, local106 + local110 / 2, Static15.anInt485 << 1, local112 / 2 + local108);
			Static238.method3734(Static80.anInt1722, -Static430.anInt7326 & 0x3FFF, Static422.anInt7281, -Static141.anInt3177 & 0x3FFF, Static398.anInt6901, -Static285.anInt5234 & 0x3FFF);
			@Pc(552) byte local552 = Static123.aClass21_Sub1_1.method790(Static347.anInt6318) == 2 ? (byte) Static164.anInt3507 : 1;
			Static91.method1571(Static266.aClass75_7, Static290.anInt5325, Static180.anInt3696, Static203.aClass106_2, Static398.anInt6901, Static422.anInt7281, Static80.anInt1722, Static344.aByteArrayArrayArray16, Static116.anIntArray477, Static158.anIntArray257, Static348.anIntArray563, Static430.anIntArray518, Static83.anIntArray161, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 + 1, local552, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7, !Static123.aClass21_Sub1_1.aBoolean79);
			Static143.method2556();
			if (Static142.anInt3209 == 30) {
				Static73.method1339(local110, local106, local108, local112);
				Static203.method3336(local108, local106, local112, local110);
				Static180.method3063(local106, local108, local112, local110);
				Static382.method5242(local108, local110, local112, local106);
			}
			Static146.method2659();
			Static422.anInt7281 = local162;
			Static398.anInt6901 = local120;
			Static141.anInt3177 = local273;
			Static430.anInt7326 = local280;
			Static80.anInt1722 = local271;
			if (Static240.aBoolean348 && Static215.aClass183_2.method4498() == 0) {
				Static240.aBoolean348 = false;
			}
			if (Static240.aBoolean348) {
				Static266.aClass75_7.method2600(local110, local108, local112, local106, -16777216);
				Static373.method5170(Static277.aClass65_5, false, Static427.aClass175_237.method4201(Static216.anInt4257));
			}
		} else {
			Static266.aClass75_7.method2600(arg0, arg3, arg1, arg4, -16777216);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!oh;Z)Z")
	public static boolean method3242(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static120.aClass64Array1 == Static401.aClass64Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method4826();
		if (arg0.aShort181 < 0 || arg0.aShort179 < 0 || arg0.aShort180 >= Static177.anInt3621 || arg0.aShort178 >= Static57.anInt1411) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort181; local34 <= arg0.aShort180; local34++) {
			for (local38 = arg0.aShort179; local38 <= arg0.aShort178; local38++) {
				@Pc(45) Class217 local45 = Static344.method4926(arg0.aByte77, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort181) {
						local49++;
					}
					if (local34 < arg0.aShort180) {
						local49 += 4;
					}
					if (local38 > arg0.aShort179) {
						local49 += 8;
					}
					if (local38 < arg0.aShort178) {
						local49 += 2;
					}
					@Pc(74) Class182 local74 = Static307.method4517(arg0, local49);
					@Pc(77) Class182 local77 = local45.aClass182_3;
					if (local77 == null) {
						local45.aClass182_3 = local74;
					} else {
						while (local77.aClass182_2 != null) {
							local77 = local77.aClass182_2;
						}
						local77.aClass182_2 = local74;
					}
					local45.aByte90 = (byte) (local45.aByte90 | local49);
					if (local6 && (Static336.anIntArrayArray50[local34][local38] & 0xFF000000) != 0) {
						local8 = Static336.anIntArrayArray50[local34][local38];
						local10 = Static215.aByteArrayArray13[local34][local38];
						local12 = Static44.aByteArrayArray21[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort181; local38 <= arg0.aShort180; local38++) {
				for (@Pc(150) int local150 = arg0.aShort179; local150 <= arg0.aShort178; local150++) {
					if ((Static336.anIntArrayArray50[local38][local150] & 0xFF000000) == 0) {
						Static336.anIntArrayArray50[local38][local150] = local8;
						Static215.aByteArrayArray13[local38][local150] = local10;
						Static44.aByteArrayArray21[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static36.aClass1_Sub3Array1[Static389.anInt6739++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Z")
	public static boolean method3243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static152.method2705(arg1, arg0) & Static129.method2234(arg0, arg1);
	}
}
