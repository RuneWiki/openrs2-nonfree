import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!us", name = "r", descriptor = "Lclient!za;")
	public static Class163 aClass163_10;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method5251() {
		Static92.aClass132_12.method2698();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZBI)V")
	public static void method5253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static309.aClass270ArrayArrayArray3 == null) {
			Static82.aClass163_1.method5545(arg4, -16777216, arg0, arg2, arg1);
		} else if (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >= 0 && Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 < Static166.anInt2852 * 128 && Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >= 0 && Static426.anInt6923 * 128 > Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835) {
			Static197.anInt3347++;
			if (Static60.aClass3_Sub4_Sub1_Sub2_1 != null && Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 + 64 - Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() * 64 >> 7 == Static233.anInt6980 && Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 - (Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() - 1) * 64 >> 7 == Static333.anInt5631) {
				Static233.anInt6980 = -1;
				Static333.anInt5631 = -1;
				Static291.method3892();
			}
			Static178.method4310();
			if (!arg3) {
				Static410.method5197();
			}
			Static119.method1791();
			Static139.method2047(arg2, arg4, arg1, arg0, true);
			@Pc(106) int local106 = Static197.anInt3346;
			@Pc(108) int local108 = Static22.anInt349;
			@Pc(110) int local110 = Static298.anInt166;
			@Pc(112) int local112 = Static72.anInt1387;
			@Pc(118) int local118;
			@Pc(152) int local152;
			if (Static414.anInt6776 == 1) {
				local118 = (int) Static332.aFloat80;
				if (Static430.anInt6949 >> 8 > local118) {
					local118 = Static430.anInt6949 >> 8;
				}
				if (Static138.aBooleanArray11[4] && local118 < Static296.anIntArray416[4] + 128) {
					local118 = Static296.anIntArray416[4] + 128;
				}
				local152 = (int) Static113.aFloat19 + Static121.anInt2227 & 0x3FFF;
				Static391.method5007(Static153.anInt2665, local108, local152, Static133.anInt2393, (local118 >> 3) * 3 + 600 << 0, Static302.method3973(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833, Static61.anInt1129) - 50, local118);
			} else if (Static414.anInt6776 == 4) {
				local118 = (int) Static332.aFloat80;
				if (local118 < Static430.anInt6949 >> 8) {
					local118 = Static430.anInt6949 >> 8;
				}
				if (Static138.aBooleanArray11[4] && Static296.anIntArray416[4] + 128 > local118) {
					local118 = Static296.anIntArray416[4] + 128;
				}
				local152 = (int) Static113.aFloat19 & 0x3FFF;
				Static391.method5007(Static153.anInt2665, local108, local152, Static133.anInt2393, (local118 >> 3) * 3 + 600 << 0, Static302.method3973(Static136.anInt2424, Static294.anInt1008, Static61.anInt1129) - 50, local118);
			} else if (Static414.anInt6776 == 5) {
				Static372.method4851(local108);
			}
			local118 = Static174.anInt3028;
			local152 = Static40.anInt771;
			@Pc(258) int local258 = Static143.anInt2544;
			@Pc(260) int local260 = Static235.anInt3805;
			@Pc(262) int local262 = Static310.anInt5375;
			@Pc(306) int local306;
			for (@Pc(264) int local264 = 0; local264 < 5; local264++) {
				if (Static138.aBooleanArray11[local264]) {
					local306 = (int) ((double) -Static267.anIntArray373[local264] + Math.random() * (double) (Static267.anIntArray373[local264] * 2 + 1) + Math.sin((double) Static260.anIntArray363[local264] / 100.0D * (double) Static244.anIntArray338[local264]) * (double) Static296.anIntArray416[local264]);
					if (local264 == 1) {
						Static40.anInt771 += local306;
					}
					if (local264 == 4) {
						Static235.anInt3805 += local306;
						if (Static235.anInt3805 < 1024) {
							Static235.anInt3805 = 1024;
						} else if (Static235.anInt3805 > 3072) {
							Static235.anInt3805 = 3072;
						}
					}
					if (local264 == 2) {
						Static143.anInt2544 += local306;
					}
					if (local264 == 0) {
						Static174.anInt3028 += local306;
					}
					if (local264 == 3) {
						Static310.anInt5375 = local306 + Static310.anInt5375 & 0x3FFF;
					}
				}
			}
			if (Static174.anInt3028 < 0) {
				Static174.anInt3028 = 0;
			}
			if ((Static169.anInt2876 << 7) - 1 < Static174.anInt3028) {
				Static174.anInt3028 = (Static169.anInt2876 << 7) - 1;
			}
			if (Static143.anInt2544 < 0) {
				Static143.anInt2544 = 0;
			}
			if ((Static316.anInt5459 << 7) - 1 < Static143.anInt2544) {
				Static143.anInt2544 = (Static316.anInt5459 << 7) - 1;
			}
			Static146.method2137();
			Static63.method955();
			Static82.aClass163_1.ba(local112, local110, local112 + local106, local108 + local110);
			Static82.aClass163_1.method5559();
			local306 = Static229.anInt3736;
			if (Static405.aClass157_1 == null) {
				Static82.aClass163_1.t(local306);
			} else {
				Static405.aClass157_1.method3165(local112, local110, Static235.anInt3805, Static82.aClass163_1, Static310.anInt5375, Static431.anInt6971 << 3, local106, local306, local108);
			}
			Static123.method5625();
			Static57.aClass31_2.YA(Static174.anInt3028, Static40.anInt771, Static143.anInt2544, -Static235.anInt3805 & 0x3FFF, -Static310.anInt5375 & 0x3FFF, -Static381.anInt6280 & 0x3FFF);
			Static82.aClass163_1.SA(Static57.aClass31_2);
			Static82.aClass163_1.GA(local106 / 2 + local112, local108 / 2 + local110, Static245.anInt3934 << 1, Static245.anInt3934 << 1);
			Static137.method5157(Static245.anInt3934 << 1, local112 + local106 / 2, Static245.anInt3934 << 1, local110 + local108 / 2);
			Static313.method4282(-Static381.anInt6280 & 0x3FFF, Static40.anInt771, -Static310.anInt5375 & 0x3FFF, Static143.anInt2544, -Static235.anInt3805 & 0x3FFF, Static174.anInt3028);
			@Pc(538) byte local538 = Static2.aClass148_Sub1_1.method3051(Static288.anInt4743) == 2 ? (byte) Static197.anInt3347 : 1;
			Static201.method2691(Static82.aClass163_1, Static266.anInt4392, Static115.anInt2125, Static57.aClass31_2, Static174.anInt3028, Static40.anInt771, Static143.anInt2544, Static111.aByteArrayArrayArray1, Static90.anIntArray136, Static81.anIntArray127, Static120.anIntArray171, Static449.anIntArray635, Static319.anIntArray480, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 + 1, local538, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7, !Static2.aClass148_Sub1_1.aBoolean250);
			Static123.method5625();
			if (Static290.anInt4777 == 9) {
				Static181.method2517(local110, local112, local106, local108);
				Static318.method4340(local106, local108, local110, local112);
				Static255.method3253(local106, local110, local112, local108);
				Static452.method5681(local108, local112, local110, local106);
			}
			Static249.method3166();
			Static235.anInt3805 = local260;
			Static143.anInt2544 = local258;
			Static40.anInt771 = local152;
			Static310.anInt5375 = local262;
			Static174.anInt3028 = local118;
			if (Static49.aBoolean74 && Static24.aClass84_1.method1907() == 0) {
				Static49.aBoolean74 = false;
			}
			if (Static49.aBoolean74) {
				Static82.aClass163_1.method5545(local108, -16777216, local106, local110, local112);
				Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597), Static43.aClass92_1, false);
			}
		} else {
			Static82.aClass163_1.method5545(arg4, -16777216, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!us;)V")
	public static void method5255(@OriginalArg(0) Class250 arg0) {
		if (Static312.anInt5377 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub29 local6 = arg0.aClass2_Sub29_2;
		Static210.aClass250Array1[Static312.anInt5377] = arg0;
		Static40.aBooleanArray3[Static312.anInt5377] = false;
		Static312.anInt5377++;
		@Pc(21) int local21 = arg0.anInt6796;
		if (arg0.aBoolean487) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6796;
		if (arg0.aBoolean486) {
			local29 = Static289.anInt4757 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5693() + Static179.anInt3078 - local6.method5691() >> Static460.anInt7074;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5693() + local6.method5691() - Static179.anInt3078 >> Static460.anInt7074;
			if (local73 >= Static316.anInt5459) {
				local73 = Static316.anInt5459 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray98[local41++];
				@Pc(105) int local105 = (local6.method5687() + Static179.anInt3078 - local6.method5691() >> Static460.anInt7074) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static169.anInt2876) {
					local113 = Static169.anInt2876 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static174.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static174.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5377;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static174.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5377 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static174.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5377 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static174.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5377 << 48;
					}
				}
			}
		}
	}
}
