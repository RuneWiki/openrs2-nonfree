import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "Lclient!tg;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_71;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	public static int anInt3549 = 0;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!sc;")
	private static Class107 aClass107_951 = Static231.method3737("M");

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
	public static int anInt3550 = 0;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Z")
	public static boolean aBoolean316 = true;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "Lclient!sc;")
	public static Class107 aClass107_952 = Static231.method3737(":clanreq:");

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!sc;")
	public static Class107 aClass107_953 = aClass107_951;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!sc;")
	public static Class107 aClass107_954 = Static231.method3737("<col=40ff00>");

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Lclient!sc;")
	public static Class107 aClass107_955 = aClass107_951;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "Lclient!sc;")
	public static Class107 aClass107_956 = Static231.method3737("slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	public static int anInt3554 = 0;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
	public static boolean aBoolean317 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
	public static int method2613() {
		return ((Static90.anInt1961 == 0 ? 0 : 1) << 22) + ((Static224.aBoolean434 ? 1 : 0) << 16) + ((Static182.aBoolean362 ? 1 : 0) << 15) + ((Static169.aBoolean326 ? 1 : 0) << 13) + ((Static85.anInt1851 & 0x3) << 11) + ((aBoolean316 ? 1 : 0) << 10) + ((Static179.aBoolean357 ? 1 : 0) << 8) + ((Static14.aBoolean30 ? 1 : 0) << 7) + ((Static142.aBoolean266 ? 1 : 0) << 6) + ((Static100.aBoolean195 ? 1 : 0) << 4) + (Static27.anInt523 & 0x7) + ((Static89.aBoolean176 ? 1 : 0) << 3) + ((aBoolean317 ? 1 : 0) << 5) + ((Static153.aBoolean296 ? 1 : 0) << 9) + ((Static83.anInt1786 & 0x3) << 17) + ((Static73.aBoolean151 ? 1 : 0) << 19) + ((Static91.anInt1982 == 0 ? 0 : 1) << 20) + ((Static157.anInt3449 == 0 ? 0 : 1) << 21);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg2;
		@Pc(14) int local14 = arg0 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg2 - arg3;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = local14 * local14;
		@Pc(41) int local41 = arg0 * arg0;
		@Pc(45) int local45 = local21 * local21;
		@Pc(49) int local49 = local25 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local29 << 1;
		@Pc(61) int local61 = local45 << 1;
		@Pc(65) int local65 = arg2 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local25 - local53 * (local65 - 1);
		@Pc(87) int local87 = local29 * (1 - local69) + local61;
		@Pc(96) int local96 = local45 - (local69 - 1) * local57;
		@Pc(105) int local105 = local41 * (1 - local65) + local49;
		@Pc(109) int local109 = local41 << 2;
		@Pc(113) int local113 = local29 << 2;
		@Pc(117) int local117 = local25 << 2;
		@Pc(121) int local121 = local45 << 2;
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = local53 * (local65 - 3);
		@Pc(135) int local135 = local61 * 3;
		@Pc(137) int local137 = local117;
		@Pc(143) int local143 = (local69 - 3) * local57;
		@Pc(149) int local149 = (arg2 - 1) * local109;
		@Pc(151) int local151 = local121;
		@Pc(157) int local157 = (local21 - 1) * local113;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(202) int local202;
		if (arg1 >= Static223.anInt4869 && arg1 <= Static47.anInt1057) {
			@Pc(167) int[] local167 = Static231.anIntArrayArray44[arg1];
			local176 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 - arg0);
			local184 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + arg5);
			local193 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 - local14);
			local202 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 + local14);
			Static162.method2605(local167, local176, arg4, local193);
			Static162.method2605(local167, local193, arg6, local202);
			Static162.method2605(local167, local202, arg4, local184);
		}
		while (local5 > 0) {
			@Pc(229) boolean local229 = local5 <= local21;
			if (local105 < 0) {
				while (local105 < 0) {
					local105 += local125;
					local78 += local137;
					local3++;
					local125 += local117;
					local137 += local117;
				}
			}
			local5--;
			if (local229) {
				if (local87 < 0) {
					while (local87 < 0) {
						local16++;
						local96 += local151;
						local87 += local135;
						local135 += local121;
						local151 += local121;
					}
				}
				if (local96 < 0) {
					local87 += local135;
					local96 += local151;
					local135 += local121;
					local16++;
					local151 += local121;
				}
				local96 += -local143;
				local143 -= local113;
				local87 += -local157;
				local157 -= local113;
			}
			local176 = arg1 - local5;
			local184 = arg1 + local5;
			if (local78 < 0) {
				local105 += local125;
				local125 += local117;
				local3++;
				local78 += local137;
				local137 += local117;
			}
			local78 += -local131;
			local131 -= local109;
			if (Static223.anInt4869 <= local184 && local176 <= Static47.anInt1057) {
				local193 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 + local3);
				local202 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 - local3);
				if (local229) {
					@Pc(418) int local418 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 + local16);
					@Pc(426) int local426 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg5 - local16);
					@Pc(437) int[] local437;
					if (local176 >= Static223.anInt4869) {
						local437 = Static231.anIntArrayArray44[local176];
						Static162.method2605(local437, local202, arg4, local426);
						Static162.method2605(local437, local426, arg6, local418);
						Static162.method2605(local437, local418, arg4, local193);
					}
					if (Static47.anInt1057 >= local184) {
						local437 = Static231.anIntArrayArray44[local184];
						Static162.method2605(local437, local202, arg4, local426);
						Static162.method2605(local437, local426, arg6, local418);
						Static162.method2605(local437, local418, arg4, local193);
					}
				} else {
					if (local176 >= Static223.anInt4869) {
						Static162.method2605(Static231.anIntArrayArray44[local176], local202, arg4, local193);
					}
					if (Static47.anInt1057 >= local184) {
						Static162.method2605(Static231.anIntArrayArray44[local184], local202, arg4, local193);
					}
				}
			}
			local105 += -local149;
			local149 -= local109;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	public static void method2615() {
		Static216.aClass1_Sub9ArrayArrayArray3 = new Class1_Sub9[4][104][104];
		Static55.anIntArrayArrayArray5 = new int[4][105][105];
		Static15.method338();
		Static159.anInt3497 = 104;
		Static213.anInt4593 = 104;
		Static29.anIntArrayArrayArray2 = new int[4][105][105];
		Static201.method3227();
		Static111.anInt2473 = 25;
		Static85.aBooleanArrayArray2 = new boolean[Static111.anInt2473 + Static111.anInt2473 + 1][Static111.anInt2473 + Static111.anInt2473 + 1];
		Static8.aBooleanArrayArray1 = new boolean[Static111.anInt2473 + Static111.anInt2473 + 2][Static111.anInt2473 + Static111.anInt2473 + 2];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method2617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg2 >= Static99.anInt915 && arg2 + arg3 <= Static38.anInt784 && arg0 - arg2 >= Static223.anInt4869 && Static47.anInt1057 >= arg0 + arg2) {
			Static98.method1663(arg1, arg2, arg0, arg3);
		} else {
			Static194.method3156(arg1, arg2, arg3, arg0);
		}
	}
}
