import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public static int anInt3257;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
	public static int[] anIntArray269 = new int[14];

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
	public static boolean aBoolean209 = true;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Lclient!ul;")
	public static Class172 aClass172_28 = new Class172(260);

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "Z")
	public static volatile boolean aBoolean210 = true;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method2560() {
		for (@Pc(15) Class4_Sub2_Sub10 local15 = (Class4_Sub2_Sub10) Static180.aClass17_18.method613(); local15 != null; local15 = (Class4_Sub2_Sub10) Static180.aClass17_18.method607()) {
			@Pc(20) Class13_Sub3 local20 = local15.aClass13_Sub3_1;
			if (local20.anInt1612 != Static222.anInt4467 || local20.anInt1626 < Static50.anInt1118) {
				local15.method4690();
			} else if (local20.anInt1613 <= Static50.anInt1118) {
				if (local20.anInt1614 > 0) {
					@Pc(51) Class13_Sub5_Sub2 local51 = Static260.aClass13_Sub5_Sub2Array114[local20.anInt1614 - 1];
					if (local51 != null && local51.anInt5334 >= 0 && local51.anInt5334 < 13312 && local51.anInt5294 >= 0 && local51.anInt5294 < 13312) {
						local20.method1337(Static50.anInt1118, local51.anInt5334, Static58.method2504(local51.anInt5294, local51.anInt5334, local20.anInt1612) - local20.anInt1610, local51.anInt5294);
					}
				}
				if (local20.anInt1614 < 0) {
					@Pc(99) int local99 = -local20.anInt1614 - 1;
					@Pc(106) Class13_Sub5_Sub1 local106;
					if (Static169.anInt3387 == local99) {
						local106 = Static72.aClass13_Sub5_Sub1_1;
					} else {
						local106 = Static100.aClass13_Sub5_Sub1Array1[local99];
					}
					if (local106 != null && local106.anInt5334 >= 0 && local106.anInt5334 < 13312 && local106.anInt5294 >= 0 && local106.anInt5294 < 13312) {
						local20.method1337(Static50.anInt1118, local106.anInt5334, Static58.method2504(local106.anInt5294, local106.anInt5334, local20.anInt1612) - local20.anInt1610, local106.anInt5294);
					}
				}
				local20.method1336(Static309.anInt1336);
				Static234.method3640(Static222.anInt4467, (int) local20.aDouble5, (int) local20.aDouble1, (int) local20.aDouble8, 60, local20, local20.anInt1617, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
	public static void method2561() {
		Static176.aClass172_46.method4346();
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public static void method2565() {
		Static178.method2927(Static186.aClass97_17);
		Static139.anInt2751++;
		if (Static214.aBoolean380 && Static274.aBoolean366) {
			@Pc(29) int local29 = Static79.anInt1661;
			@Pc(31) int local31 = Static178.anInt3603;
			@Pc(34) int local34 = Static186.aClass97_17.anInt3118;
			local31 -= Static257.anInt5060;
			local29 -= Static85.anInt1726;
			if (Static264.anInt5206 > local31) {
				local31 = Static264.anInt5206;
			}
			if (Static186.aClass97_17.anInt3190 + local31 > Static48.aClass97_7.anInt3190 + Static264.anInt5206) {
				local31 = Static264.anInt5206 + Static48.aClass97_7.anInt3190 - Static186.aClass97_17.anInt3190;
			}
			@Pc(81) int local81 = local31 - Static63.anInt1377;
			@Pc(88) int local88 = local31 + Static48.aClass97_7.anInt3199 - Static264.anInt5206;
			if (Static190.anInt3864 > local29) {
				local29 = Static190.anInt3864;
			}
			if (Static186.aClass97_17.anInt3201 + local29 > Static48.aClass97_7.anInt3201 + Static190.anInt3864) {
				local29 = Static190.anInt3864 + Static48.aClass97_7.anInt3201 - Static186.aClass97_17.anInt3201;
			}
			@Pc(125) int local125 = local29 - Static201.anInt4014;
			if (Static186.aClass97_17.anInt3186 < Static139.anInt2751 && (local34 < local125 || -local34 > local125 || local81 > local34 || -local34 > local81)) {
				Static173.aBoolean229 = true;
			}
			@Pc(165) int local165 = Static48.aClass97_7.anInt3169 + local29 - Static190.anInt3864;
			@Pc(176) Class4_Sub23 local176;
			if (Static186.aClass97_17.anObjectArray26 != null && Static173.aBoolean229) {
				local176 = new Class4_Sub23();
				local176.aClass97_15 = Static186.aClass97_17;
				local176.anInt3602 = local165;
				local176.anInt3596 = local88;
				local176.anObjectArray32 = Static186.aClass97_17.anObjectArray26;
				Static145.method4497(local176);
			}
			if (Static186.anInt3687 == 0) {
				if (Static173.aBoolean229) {
					if (Static186.aClass97_17.anObjectArray29 != null) {
						local176 = new Class4_Sub23();
						local176.anInt3596 = local88;
						local176.anInt3602 = local165;
						local176.aClass97_15 = Static186.aClass97_17;
						local176.aClass97_16 = Static96.aClass97_10;
						local176.anObjectArray32 = Static186.aClass97_17.anObjectArray29;
						Static145.method4497(local176);
					}
					if (Static96.aClass97_10 != null && Static41.method792(Static186.aClass97_17) != null) {
						Static175.aClass4_Sub24_Sub1_1.method3123(36);
						Static175.aClass4_Sub24_Sub1_1.method3070(Static96.aClass97_10.anInt3162);
						Static175.aClass4_Sub24_Sub1_1.method3112(Static186.aClass97_17.anInt3146);
						Static175.aClass4_Sub24_Sub1_1.method3066(Static186.aClass97_17.anInt3162);
						Static175.aClass4_Sub24_Sub1_1.method3080(Static96.aClass97_10.anInt3146);
					}
				} else if ((Static115.anInt2331 == 1 || Static169.method2683(Static286.anInt5602 - 1)) && Static286.anInt5602 > 2) {
					Static253.method3904();
				} else if (Static286.anInt5602 > 0) {
					Static265.method4184();
				}
				Static186.aClass97_17 = null;
			}
		} else if (Static139.anInt2751 > 1) {
			Static186.aClass97_17 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIBII)V")
	public static void method2569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg0 - 32) * arg0 / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		Static226.aClass58Array3[0].method3972(arg2, arg1);
		@Pc(41) int local41 = (arg0 - local11 - 32) * arg3 / (arg4 - arg0);
		Static226.aClass58Array3[1].method3972(arg2, arg1 + arg0 - 16);
		if (!Static251.aBoolean330) {
			Static258.method4031(arg2, arg1 + 16, 16, arg0 - 32, Static293.anInt5693);
			Static258.method4031(arg2, local41 + arg1 + 16, 16, local11, Static131.anInt1446);
			Static258.method4018(arg2, arg1 + local41 + 16, local11, Static55.anInt1253);
			Static258.method4018(arg2 + 1, arg1 - -local41 + 16, local11, Static55.anInt1253);
			Static258.method4021(arg2, local41 + arg1 + 16, 16, Static55.anInt1253);
			Static258.method4021(arg2, arg1 + local41 + 17, 16, Static55.anInt1253);
			Static258.method4018(arg2 + 15, arg1 + 16 + local41, local11, Static219.anInt4208);
			Static258.method4018(arg2 + 14, arg1 + 17 + local41, local11 - 1, Static219.anInt4208);
			Static258.method4021(arg2, arg1 + local41 + local11 + 15, 16, Static219.anInt4208);
			Static258.method4021(arg2 + 1, local11 + local41 + 14 + arg1, 15, Static219.anInt4208);
			return;
		}
		Static87.method1464(arg2, arg1 + 16, 16, arg0 - 32, Static293.anInt5693);
		Static87.method1464(arg2, local41 + arg1 + 16, 16, local11, Static131.anInt1446);
		Static87.method1455(arg2, arg1 + local41 + 16, local11, Static55.anInt1253);
		Static87.method1455(arg2 + 1, arg1 + 16 + local41, local11, Static55.anInt1253);
		Static87.method1450(arg2, local41 + arg1 + 16, 16, Static55.anInt1253);
		Static87.method1450(arg2, arg1 + local41 + 17, 16, Static55.anInt1253);
		Static87.method1455(arg2 + 15, local41 + arg1 + 16, local11, Static219.anInt4208);
		Static87.method1455(arg2 + 14, arg1 + 17 + local41, local11 - 1, Static219.anInt4208);
		Static87.method1450(arg2, local11 + local41 + arg1 + 15, 16, Static219.anInt4208);
		Static87.method1450(arg2 + 1, local41 + arg1 + 14 + local11, 15, Static219.anInt4208);
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
	public static void method2570() {
		Static71.anIntArray138 = null;
		Static288.anIntArray455 = null;
		Static170.anIntArray283 = null;
		Static199.anIntArray243 = null;
		Static184.anIntArray306 = null;
		Static279.anIntArray435 = null;
		Static32.aByteArrayArrayArray3 = null;
		Static22.aByteArrayArrayArray1 = null;
		Static8.anIntArrayArrayArray1 = null;
		Static121.aByteArrayArrayArray8 = null;
		Static241.aByteArrayArrayArray13 = null;
		Static66.aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)I")
	public static int method2571(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
