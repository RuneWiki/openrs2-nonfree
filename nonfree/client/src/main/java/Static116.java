import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static int anInt2306;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method2095() {
		Static7.aClass140_6.method3813();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method2096() {
		Static133.method2517(Static317.aClass177_22);
		Static40.anInt4331++;
		if (Static20.aBoolean43 && Static313.aBoolean531) {
			@Pc(24) int local24 = Static179.anInt3693;
			local24 -= Static318.anInt6103;
			@Pc(30) int local30 = Static295.anInt5742;
			local30 -= Static313.anInt6037;
			if (local24 < Static194.anInt3964) {
				local24 = Static194.anInt3964;
			}
			if (Static317.aClass177_22.anInt5179 + local24 > Static66.aClass177_3.anInt5179 + Static194.anInt3964) {
				local24 = Static194.anInt3964 + Static66.aClass177_3.anInt5179 - Static317.aClass177_22.anInt5179;
			}
			if (Static111.anInt2273 > local30) {
				local30 = Static111.anInt2273;
			}
			if (Static317.aClass177_22.anInt5209 + local30 > Static66.aClass177_3.anInt5209 + Static111.anInt2273) {
				local30 = Static66.aClass177_3.anInt5209 + Static111.anInt2273 - Static317.aClass177_22.anInt5209;
			}
			@Pc(89) int local89 = local24 - Static125.anInt2466;
			@Pc(93) int local93 = local30 - Static334.anInt6366;
			@Pc(96) int local96 = Static317.aClass177_22.anInt5255;
			if (Static317.aClass177_22.anInt5188 < Static40.anInt4331 && (local89 > local96 || local89 < -local96 || local93 > local96 || local93 < -local96)) {
				Static119.aBoolean174 = true;
			}
			@Pc(132) int local132 = Static66.aClass177_3.anInt5221 + local24 - Static194.anInt3964;
			@Pc(140) int local140 = Static66.aClass177_3.anInt5182 + local30 - Static111.anInt2273;
			@Pc(149) Class1_Sub19 local149;
			if (Static317.aClass177_22.anObjectArray13 != null && Static119.aBoolean174) {
				local149 = new Class1_Sub19();
				local149.aClass177_9 = Static317.aClass177_22;
				local149.anInt3144 = local132;
				local149.anObjectArray3 = Static317.aClass177_22.anObjectArray13;
				local149.anInt3150 = local140;
				Static98.method1797(local149);
			}
			if (Static151.anInt3836 == 0) {
				if (Static119.aBoolean174) {
					if (Static317.aClass177_22.anObjectArray19 != null) {
						local149 = new Class1_Sub19();
						local149.anObjectArray3 = Static317.aClass177_22.anObjectArray19;
						local149.anInt3150 = local140;
						local149.aClass177_10 = Static184.aClass177_11;
						local149.anInt3144 = local132;
						local149.aClass177_9 = Static317.aClass177_22;
						Static98.method1797(local149);
					}
					if (Static184.aClass177_11 != null && Static47.method1092(Static317.aClass177_22) != null) {
						Static344.method5510(Static184.aClass177_11.anInt5219, Static317.aClass177_22.anInt5239, Static317.aClass177_22.anInt5219, Static184.aClass177_11.anInt5239);
					}
				} else if ((Static77.anInt1554 == 1 || Static154.method2926()) && Static277.anInt6207 > 2) {
					Static278.method4805(2);
				} else if (Static285.method4901()) {
					Static278.method4805(1);
				}
				Static317.aClass177_22 = null;
			}
		} else if (Static40.anInt4331 > 1) {
			Static317.aClass177_22 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZILclient!cj;IIZIILclient!aa;ILclient!rj;Lclient!aa;)Lclient!lf;")
	public static Class90 method2097(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class2 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class13 arg9, @OriginalArg(11) Class2 arg10) {
		@Pc(15) Class90 local15 = Static37.method945(arg4, arg7, arg8, arg3, arg2, arg1, arg6);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class61 local23 = Static241.method4285(arg3);
		@Pc(33) int local33;
		if (arg4 > 1 && local23.anIntArray227 != null) {
			@Pc(31) int local31 = -1;
			for (local33 = 0; local33 < 10; local33++) {
				if (arg4 >= local23.anIntArray225[local33] && local23.anIntArray225[local33] != 0) {
					local31 = local23.anIntArray227[local33];
				}
			}
			if (local31 != -1) {
				local23 = Static241.method4285(local31);
			}
		}
		@Pc(76) Class12 local76 = Static328.method5503(Static299.aClass165_89, local23.anInt1823);
		if (local76 == null) {
			return null;
		}
		if (local23.aShortArray27 != null) {
			for (local33 = 0; local33 < local23.aShortArray27.length; local33++) {
				if (local23.aByteArray24 == null || local33 >= local23.aByteArray24.length) {
					local76.method372(local23.aShortArray27[local33], local23.aShortArray28[local33]);
				} else {
					local76.method372(local23.aShortArray27[local33], Static297.aShortArray93[local23.aByteArray24[local33] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray29 != null) {
			for (local33 = 0; local33 < local23.aShortArray29.length; local33++) {
				local76.method374(local23.aShortArray29[local33], local23.aShortArray30[local33]);
			}
		}
		if (arg2 != null) {
			for (local33 = 0; local33 < 5; local33++) {
				if (Static172.aShortArrayArray8[local33].length > arg2.anIntArray118[local33]) {
					local76.method372(Static204.aShortArray56[local33], Static172.aShortArrayArray8[local33][arg2.anIntArray118[local33]]);
				}
				if (arg2.anIntArray118[local33] < Static86.aShortArrayArray3[local33].length) {
					local76.method372(Static314.aShortArray95[local33], Static86.aShortArrayArray3[local33][arg2.anIntArray118[local33]]);
				}
			}
		}
		@Pc(223) short local223 = 1024;
		@Pc(225) boolean local225 = false;
		if (local23.anInt1839 != 128 || local23.anInt1818 != 128 || local23.anInt1815 != 128) {
			local223 = 1031;
			local225 = true;
		}
		@Pc(262) Class78 local262 = arg10.method3251(local76, local223, 0, local23.anInt1791 + 64, 768 - -local23.anInt1805);
		if (!local262.method4370()) {
			return null;
		}
		if (local225) {
			local262.method4393(local23.anInt1839, local23.anInt1818, local23.anInt1815);
		}
		@Pc(279) Class90 local279 = null;
		if (local23.anInt1827 != -1) {
			local279 = method2097(true, 0, arg2, local23.anInt1831, 10, true, 0, arg7, 1, arg9, arg10);
			if (local279 == null) {
				return null;
			}
		} else if (local23.anInt1782 != -1) {
			local279 = method2097(true, arg1, arg2, local23.anInt1794, arg4, false, 0, arg7, arg8, arg9, arg10);
			if (local279 == null) {
				return null;
			}
		}
		@Pc(329) int local329 = local23.anInt1829;
		if (arg5) {
			local329 = (int) ((double) local329 * 1.5D);
		} else if (arg8 == 2) {
			local329 = (int) ((double) local329 * 1.04D);
		}
		arg10.method3278(16, 16, 512, 512);
		@Pc(359) Class21 local359 = arg10.method3298();
		local359.method2800();
		arg10.method3239(local359);
		arg10.method3341(1.0F);
		arg10.method3329(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(378) Class21 local378 = arg10.method3284();
		local378.method2798(-local23.anInt1781 << 3);
		local378.method2802(local23.anInt1836 << 3);
		local378.method2810(local23.anInt1787, (local329 * Class1_Sub1_Sub16.anIntArray587[local23.anInt1784 << 3] >> 15) + local23.anInt1804 - (local262.method4388() / 2), local23.anInt1804 + (local329 * Class1_Sub1_Sub16.anIntArray586[local23.anInt1784 << 3] >> 15));
		local378.method2815(local23.anInt1784 << 3);
		@Pc(437) int local437 = arg10.method3340();
		@Pc(440) int local440 = arg10.method3307();
		arg10.method3280(50, Integer.MAX_VALUE);
		arg10.method3294();
		arg10.method3327();
		arg10.method3300(0, 0, 36, 32, 0, 0);
		local262.method4379(local378, null, 1);
		arg10.method3280(local437, local440);
		@Pc(472) int[] local472 = arg10.method3259();
		if (arg8 >= 1) {
			local472 = Static268.method4680(local472, -16777215);
			if (arg8 >= 2) {
				local472 = Static268.method4680(local472, -1);
			}
		}
		if (arg1 != 0) {
			Static38.method3476(arg1, local472);
		}
		arg10.method3288(local472, 36, 36, 32).method5454(0, 0);
		if (local23.anInt1827 != -1) {
			local279.method5454(0, 0);
		} else if (local23.anInt1782 != -1) {
			local279.method5454(0, 0);
		}
		if (arg6 == 1 || arg6 == 2 && (local23.anInt1803 == 1 || arg4 != 1) && arg4 != -1) {
			arg9.method4456(-256, 9, -16777215, Static259.method4570(arg4), 0);
		}
		local472 = arg10.method3259();
		for (@Pc(564) int local564 = 0; local564 < local472.length; local564++) {
			if ((local472[local564] & 0xFFFFFF) == 0) {
				local472[local564] = 0;
			} else {
				local472[local564] |= 0xFF000000;
			}
		}
		@Pc(608) Class90 local608;
		if (arg0) {
			local608 = arg10.method3288(local472, 36, 36, 32);
		} else {
			local608 = arg7.method3288(local472, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(624) Class100 local624 = new Class100();
			local624.anInt2841 = arg1;
			local624.anInt2847 = arg3;
			local624.anInt2840 = arg4;
			local624.aBoolean252 = arg2 != null;
			local624.anInt2846 = arg6;
			local624.anInt2843 = arg8;
			local624.anInt2848 = arg7.anInt3495;
			Static234.aClass33_1.method1154(local624, local608);
		}
		return local608;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V")
	public static void method2098() {
		Static7.aClass140_6.method3824(5);
	}
}
