import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static int anInt848;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!th;")
	public static Class169 aClass169_32 = new Class169(64);

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[I")
	public static int[] anIntArray74 = new int[500];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method777() {
		if (Static25.anIntArray41 != null && Static36.anIntArray54 != null) {
			return;
		}
		Static25.anIntArray41 = new int[256];
		Static36.anIntArray54 = new int[256];
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) double local31 = (double) local19 / 255.0D * 6.283185307179586D;
			Static25.anIntArray41[local19] = (int) (Math.sin(local31) * 4096.0D);
			Static36.anIntArray54[local19] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILclient!h;IJIIII)Z")
	public static boolean method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static300.method4500(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void method779(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static159.anIntArray270[arg0];
		@Pc(18) int local18 = (int) Static168.aLongArray123[arg0];
		@Pc(22) int local22 = Static241.aShortArray76[arg0];
		@Pc(26) long local26 = Static168.aLongArray123[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(35) int local35 = anIntArray74[arg0];
		if (local22 == 1003) {
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static137.aClass1_Sub14_Sub1_6.method2661(197);
			Static137.aClass1_Sub14_Sub1_6.method2606((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
			Static34.method580(local26, local13, local35);
		}
		@Pc(100) Class22_Sub3_Sub2 local100;
		if (local22 == 33) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static225.anInt4442 = Static84.anInt1530;
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(169);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 14) {
			if (local18 == 0) {
				Static134.method2182(Static295.anInt5586, local13, local35);
			} else if (local18 == 1) {
				if (Static95.anInt5251 > 0 && Static88.aBooleanArray16[82] && Static88.aBooleanArray16[81]) {
					Static267.method3978(local35 + Static118.anInt2409, Static295.anInt5586, local13 + Static290.anInt5497);
				} else {
					Static134.method2184(local13, 1, local35);
					Static137.aClass1_Sub14_Sub1_6.method2631(Static144.anInt2836);
					Static137.aClass1_Sub14_Sub1_6.method2631(Static269.anInt415);
					Static137.aClass1_Sub14_Sub1_6.method2637((int) Static2.aFloat1);
					Static137.aClass1_Sub14_Sub1_6.method2631(57);
					if (Static101.anInt1895 == 4) {
						Static137.aClass1_Sub14_Sub1_6.method2631(0);
						Static137.aClass1_Sub14_Sub1_6.method2631(0);
					} else {
						Static137.aClass1_Sub14_Sub1_6.method2631(Static39.anInt794);
						Static137.aClass1_Sub14_Sub1_6.method2631(Static54.anInt1055);
					}
					Static137.aClass1_Sub14_Sub1_6.method2631(89);
					Static137.aClass1_Sub14_Sub1_6.method2637(Static229.aClass22_Sub3_Sub2_2.anInt4601);
					Static137.aClass1_Sub14_Sub1_6.method2637(Static229.aClass22_Sub3_Sub2_2.anInt4623);
					Static137.aClass1_Sub14_Sub1_6.method2631(Static281.anInt5365);
					Static137.aClass1_Sub14_Sub1_6.method2631(63);
					Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
				}
			}
		}
		if (local22 == 46) {
			Static29.method526();
		}
		if (local22 == 15) {
			Static270.anInt5141 = Static46.anInt894;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static195.anInt3969 = 2;
			Static137.aClass1_Sub14_Sub1_6.method2661(189);
			Static137.aClass1_Sub14_Sub1_6.method2637((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static118.anInt2409 + local35);
			Static34.method580(local26, local13, local35);
		}
		@Pc(353) Class22_Sub3_Sub1 local353;
		if (local22 == 28) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static195.anInt3969 = 2;
				Static171.anInt3597 = 0;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(219);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 1010 || local22 == 1011 || local22 == 1005 || local22 == 1009 || local22 == 1012) {
			Static98.method1448(local22, local13, local18);
		}
		if (local22 == 18) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static225.anInt4442 = Static84.anInt1530;
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(192);
				Static137.aClass1_Sub14_Sub1_6.method2637(local18);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		@Pc(507) Class146 local507;
		if (local22 == 37) {
			local507 = Static300.method4492(local13, local35);
			if (local507 != null) {
				Static87.method1300();
				@Pc(515) Class1_Sub22 local515 = Static36.method643(local507);
				Static313.method4649(local13, local35, local507.anInt4384, local507.anInt4394, local515.method3233(), local515.anInt4034);
				Static197.anInt3990 = 0;
				Static232.aString115 = Static218.method3437(local507);
				if (local507.aBoolean299) {
					Static86.aString53 = local507.aString144 + "<col=ffffff>";
				} else {
					Static86.aString53 = "<col=00ff00>" + local507.aString141 + "<col=ffffff>";
				}
				if (Static232.aString115 == null) {
					Static232.aString115 = "Null";
				}
			}
			return;
		}
		if (local22 == 10) {
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static171.anInt3597 = 0;
			Static225.anInt4442 = Static84.anInt1530;
			Static137.aClass1_Sub14_Sub1_6.method2661(162);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2642(local13 + Static290.anInt5497);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 45) {
			Static137.aClass1_Sub14_Sub1_6.method2661(220);
			Static137.aClass1_Sub14_Sub1_6.method2612(local35);
			Static137.aClass1_Sub14_Sub1_6.method2642(local13);
			Static137.aClass1_Sub14_Sub1_6.method2606(local18);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 22) {
			Static137.aClass1_Sub14_Sub1_6.method2661(137);
			Static137.aClass1_Sub14_Sub1_6.method2642(local13);
			Static137.aClass1_Sub14_Sub1_6.method2606(local18);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 23) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static171.anInt3597 = 0;
				Static270.anInt5141 = Static46.anInt894;
				Static225.anInt4442 = Static84.anInt1530;
				Static195.anInt3969 = 2;
				Static137.aClass1_Sub14_Sub1_6.method2661(163);
				Static137.aClass1_Sub14_Sub1_6.method2606(Static224.anInt4398);
				Static137.aClass1_Sub14_Sub1_6.method2618(Static77.anInt5411);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2630(Static122.anInt2468);
				Static137.aClass1_Sub14_Sub1_6.method2637(local18);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		@Pc(826) int local826;
		if (local22 == 60) {
			Static137.aClass1_Sub14_Sub1_6.method2661(94);
			Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			local507 = Static259.method3908(local35);
			if (local507.anIntArrayArray30 != null && local507.anIntArrayArray30[0][0] == 5) {
				local826 = local507.anIntArrayArray30[0][1];
				Static46.anIntArray78[local826] = 1 - Static46.anIntArray78[local826];
				Static255.method3876(local826);
			}
		}
		if (local22 == 6) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static195.anInt3969 = 2;
				Static270.anInt5141 = Static46.anInt894;
				Static171.anInt3597 = 0;
				Static225.anInt4442 = Static84.anInt1530;
				Static137.aClass1_Sub14_Sub1_6.method2661(208);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 1006) {
			Static225.anInt4442 = Static84.anInt1530;
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(200);
			Static137.aClass1_Sub14_Sub1_6.method2642(local18);
		}
		if (local22 == 20) {
			Static137.aClass1_Sub14_Sub1_6.method2661(61);
			Static137.aClass1_Sub14_Sub1_6.method2597(local35);
			Static137.aClass1_Sub14_Sub1_6.method2606(local18);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 25) {
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(210);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2637(local18);
			Static137.aClass1_Sub14_Sub1_6.method2618(local35 + Static118.anInt2409);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 40) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static171.anInt3597 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2661(177);
				Static137.aClass1_Sub14_Sub1_6.method2606(local18);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 32) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static270.anInt5141 = Static46.anInt894;
				Static225.anInt4442 = Static84.anInt1530;
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static137.aClass1_Sub14_Sub1_6.method2661(193);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 1001) {
			Static225.anInt4442 = Static84.anInt1530;
			Static270.anInt5141 = Static46.anInt894;
			Static195.anInt3969 = 2;
			Static171.anInt3597 = 0;
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				@Pc(1181) Class112 local1181 = local353.aClass112_1;
				if (local1181.anIntArray283 != null) {
					local1181 = local1181.method2817();
				}
				if (local1181 != null) {
					Static137.aClass1_Sub14_Sub1_6.method2661(216);
					Static137.aClass1_Sub14_Sub1_6.method2637(local1181.anInt3514);
				}
			}
		}
		if (local22 == 43) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static171.anInt3597 = 0;
				Static270.anInt5141 = Static46.anInt894;
				Static225.anInt4442 = Static84.anInt1530;
				Static195.anInt3969 = 2;
				Static137.aClass1_Sub14_Sub1_6.method2661(186);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 7) {
			Static137.aClass1_Sub14_Sub1_6.method2661(242);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static81.anInt1490);
			Static137.aClass1_Sub14_Sub1_6.method2597(Static10.anInt180);
			Static137.aClass1_Sub14_Sub1_6.method2637(local13);
			Static137.aClass1_Sub14_Sub1_6.method2642(local18);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 8) {
			Static137.aClass1_Sub14_Sub1_6.method2661(128);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static224.anInt4398);
			Static137.aClass1_Sub14_Sub1_6.method2642(local18);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static77.anInt5411);
			Static137.aClass1_Sub14_Sub1_6.method2612(Static122.anInt2468);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 24) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(157);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 5) {
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static171.anInt3597 = 0;
			Static225.anInt4442 = Static84.anInt1530;
			Static137.aClass1_Sub14_Sub1_6.method2661(206);
			Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static224.anInt4398);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static137.aClass1_Sub14_Sub1_6.method2642(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2597(Static122.anInt2468);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static77.anInt5411);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 38) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static195.anInt3969 = 2;
				Static171.anInt3597 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2661(146);
				Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 49) {
			Static137.aClass1_Sub14_Sub1_6.method2661(7);
			Static137.aClass1_Sub14_Sub1_6.method2612(Static10.anInt180);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static137.aClass1_Sub14_Sub1_6.method2606(local13);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static81.anInt1490);
		}
		if (local22 == 13) {
			if (local18 == 0) {
				Static73.anInt1412 = 1;
				Static134.method2182(Static295.anInt5586, local13, local35);
			} else if (Static95.anInt5251 > 0 && Static88.aBooleanArray16[82] && Static88.aBooleanArray16[81]) {
				Static267.method3978(local35 + Static118.anInt2409, Static295.anInt5586, local13 + Static290.anInt5497);
			} else {
				Static137.aClass1_Sub14_Sub1_6.method2661(53);
				Static137.aClass1_Sub14_Sub1_6.method2606(local35 + Static118.anInt2409);
				Static137.aClass1_Sub14_Sub1_6.method2606(Static290.anInt5497 + local13);
			}
		}
		if (local22 == 11) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static171.anInt3597 = 0;
				Static270.anInt5141 = Static46.anInt894;
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static137.aClass1_Sub14_Sub1_6.method2661(65);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 21) {
			Static137.aClass1_Sub14_Sub1_6.method2661(129);
			Static137.aClass1_Sub14_Sub1_6.method2606(local13);
			Static137.aClass1_Sub14_Sub1_6.method2637(local18);
			Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 31) {
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(180);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2606(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static34.method580(local26, local13, local35);
		}
		if (local22 == 17) {
			Static137.aClass1_Sub14_Sub1_6.method2661(241);
			Static137.aClass1_Sub14_Sub1_6.method2612(local35);
			Static137.aClass1_Sub14_Sub1_6.method2637(local13);
			Static137.aClass1_Sub14_Sub1_6.method2642(local18);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 3) {
			Static171.anInt3597 = 0;
			Static195.anInt3969 = 2;
			Static225.anInt4442 = Static84.anInt1530;
			Static270.anInt5141 = Static46.anInt894;
			Static137.aClass1_Sub14_Sub1_6.method2661(135);
			Static137.aClass1_Sub14_Sub1_6.method2642((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static137.aClass1_Sub14_Sub1_6.method2606(local35 + Static118.anInt2409);
			Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static290.anInt5497 + local13);
			Static34.method580(local26, local13, local35);
		}
		if (local22 == 1007) {
			Static270.anInt5141 = Static46.anInt894;
			Static195.anInt3969 = 2;
			Static171.anInt3597 = 0;
			Static225.anInt4442 = Static84.anInt1530;
			Static137.aClass1_Sub14_Sub1_6.method2661(179);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
		}
		if (local22 == 39) {
			Static270.anInt5141 = Static46.anInt894;
			Static195.anInt3969 = 2;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(9);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2637(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static137.aClass1_Sub14_Sub1_6.method2618(local35 + Static118.anInt2409);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 48) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static270.anInt5141 = Static46.anInt894;
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static137.aClass1_Sub14_Sub1_6.method2661(120);
				Static137.aClass1_Sub14_Sub1_6.method2637(local18);
				Static137.aClass1_Sub14_Sub1_6.method2642(Static81.anInt1490);
				Static137.aClass1_Sub14_Sub1_6.method2644(Static10.anInt180);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 9) {
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static137.aClass1_Sub14_Sub1_6.method2661(8);
			Static137.aClass1_Sub14_Sub1_6.method2630(Static10.anInt180);
			Static137.aClass1_Sub14_Sub1_6.method2610(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static81.anInt1490);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 4) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static195.anInt3969 = 2;
				Static171.anInt3597 = 0;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(12);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static137.aClass1_Sub14_Sub1_6.method2610(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 12) {
			if (local18 == 0) {
				Static183.anInt3702 = 1;
				Static134.method2182(Static295.anInt5586, local13, local35);
			} else if (local18 == 1) {
				Static137.aClass1_Sub14_Sub1_6.method2661(149);
				Static137.aClass1_Sub14_Sub1_6.method2637(Static81.anInt1490);
				Static137.aClass1_Sub14_Sub1_6.method2597(Static10.anInt180);
				Static137.aClass1_Sub14_Sub1_6.method2618(Static118.anInt2409 + local35);
				Static137.aClass1_Sub14_Sub1_6.method2637(Static290.anInt5497 + local13);
			}
		}
		if (local22 == 59) {
			Static171.anInt3597 = 0;
			Static225.anInt4442 = Static84.anInt1530;
			Static195.anInt3969 = 2;
			Static270.anInt5141 = Static46.anInt894;
			Static137.aClass1_Sub14_Sub1_6.method2661(165);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static137.aClass1_Sub14_Sub1_6.method2618(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2610(Static88.aBooleanArray16[82] ? 1 : 0);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 34) {
			Static137.aClass1_Sub14_Sub1_6.method2661(28);
			Static137.aClass1_Sub14_Sub1_6.method2637(local18);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13);
			Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 1) {
			local507 = Static259.method3908(local35);
			@Pc(2372) boolean local2372 = true;
			if (local507.anInt4350 > 0) {
				local2372 = Static78.method1214(local507);
			}
			if (local2372) {
				Static137.aClass1_Sub14_Sub1_6.method2661(94);
				Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			}
		}
		if (local22 == 29) {
			Static270.anInt5141 = Static46.anInt894;
			Static195.anInt3969 = 2;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(49);
			Static137.aClass1_Sub14_Sub1_6.method2630(Static10.anInt180);
			Static137.aClass1_Sub14_Sub1_6.method2637(local35 + Static118.anInt2409);
			Static137.aClass1_Sub14_Sub1_6.method2637((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static137.aClass1_Sub14_Sub1_6.method2642(Static81.anInt1490);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
			Static34.method580(local26, local13, local35);
		}
		if (local22 == 16) {
			Static195.anInt3969 = 2;
			Static225.anInt4442 = Static84.anInt1530;
			Static270.anInt5141 = Static46.anInt894;
			Static171.anInt3597 = 0;
			Static137.aClass1_Sub14_Sub1_6.method2661(10);
			Static137.aClass1_Sub14_Sub1_6.method2606(local35 + Static118.anInt2409);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static290.anInt5497 + local13);
			Static137.aClass1_Sub14_Sub1_6.method2637(local18);
			Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
		}
		if (local22 == 58) {
			Static137.aClass1_Sub14_Sub1_6.method2661(109);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13);
			Static137.aClass1_Sub14_Sub1_6.method2637(local18);
			Static137.aClass1_Sub14_Sub1_6.method2597(local35);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 50) {
			Static87.method1300();
			local507 = Static259.method3908(local35);
			Static77.anInt5411 = local13;
			Static122.anInt2468 = local35;
			Static197.anInt3990 = 1;
			Static224.anInt4398 = local18;
			Static237.method2927(local507);
			Static90.aString151 = "<col=ff9040>" + Static271.method4006(local18).aString159 + "<col=ffffff>";
			if (Static90.aString151 == null) {
				Static90.aString151 = "null";
			}
			return;
		}
		if (local22 == 30) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static171.anInt3597 = 0;
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(11);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2642(local18);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 47 && Static92.aClass146_7 == null) {
			Static305.method4550(local35, local13);
			Static92.aClass146_7 = Static300.method4492(local13, local35);
			Static237.method2927(Static92.aClass146_7);
		}
		if (local22 == 26) {
			Static137.aClass1_Sub14_Sub1_6.method2661(70);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static137.aClass1_Sub14_Sub1_6.method2642(local18);
			Static137.aClass1_Sub14_Sub1_6.method2606(local13);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 44) {
			local353 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local353 != null) {
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static270.anInt5141 = Static46.anInt894;
				Static171.anInt3597 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2661(148);
				Static137.aClass1_Sub14_Sub1_6.method2637(Static81.anInt1490);
				Static137.aClass1_Sub14_Sub1_6.method2644(Static10.anInt180);
				Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
				Static137.aClass1_Sub14_Sub1_6.method2637(local18);
				Static234.method3703(local353.method3660(), local353.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 36) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static195.anInt3969 = 2;
				Static225.anInt4442 = Static84.anInt1530;
				Static171.anInt3597 = 0;
				Static270.anInt5141 = Static46.anInt894;
				Static137.aClass1_Sub14_Sub1_6.method2661(117);
				Static137.aClass1_Sub14_Sub1_6.method2612(Static122.anInt2468);
				Static137.aClass1_Sub14_Sub1_6.method2606(local18);
				Static137.aClass1_Sub14_Sub1_6.method2618(Static224.anInt4398);
				Static137.aClass1_Sub14_Sub1_6.method2606(Static77.anInt5411);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 51) {
			Static195.anInt3969 = 2;
			Static225.anInt4442 = Static84.anInt1530;
			Static171.anInt3597 = 0;
			Static270.anInt5141 = Static46.anInt894;
			Static137.aClass1_Sub14_Sub1_6.method2661(51);
			Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2612(Static122.anInt2468);
			Static137.aClass1_Sub14_Sub1_6.method2637(Static77.anInt5411);
			Static137.aClass1_Sub14_Sub1_6.method2642(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static137.aClass1_Sub14_Sub1_6.method2618(local35 + Static118.anInt2409);
			Static137.aClass1_Sub14_Sub1_6.method2618(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static224.anInt4398);
			Static34.method580(local26, local13, local35);
		}
		if (local22 == 57) {
			Static195.anInt3969 = 2;
			Static171.anInt3597 = 0;
			Static270.anInt5141 = Static46.anInt894;
			Static225.anInt4442 = Static84.anInt1530;
			Static137.aClass1_Sub14_Sub1_6.method2661(195);
			Static137.aClass1_Sub14_Sub1_6.method2637(local13 + Static290.anInt5497);
			Static137.aClass1_Sub14_Sub1_6.method2606(Static118.anInt2409 + local35);
			Static137.aClass1_Sub14_Sub1_6.method2624(Static88.aBooleanArray16[82] ? 1 : 0);
			Static137.aClass1_Sub14_Sub1_6.method2606((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static34.method580(local26, local13, local35);
		}
		if (local22 == 19 || local22 == 1004) {
			Static230.method3626(Static54.aStringArray7[arg0], local35, local18, local13);
		}
		if (local22 == 41) {
			local100 = Static195.aClass22_Sub3_Sub2Array1[local18];
			if (local100 != null) {
				Static225.anInt4442 = Static84.anInt1530;
				Static195.anInt3969 = 2;
				Static270.anInt5141 = Static46.anInt894;
				Static171.anInt3597 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2661(59);
				Static137.aClass1_Sub14_Sub1_6.method2637(local18);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static88.aBooleanArray16[82] ? 1 : 0);
				Static234.method3703(local100.method3660(), local100.method3660(), Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local13, local35);
			}
		}
		if (local22 == 1008) {
			local507 = Static259.method3908(local35);
			if (local507 == null || local507.anIntArray353[local13] < 100000) {
				Static137.aClass1_Sub14_Sub1_6.method2661(179);
				Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			} else {
				Static199.method3219(local507.anIntArray353[local13] + " x " + Static271.method4006(local18).aString159);
			}
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 42) {
			Static137.aClass1_Sub14_Sub1_6.method2661(94);
			Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			local507 = Static259.method3908(local35);
			if (local507.anIntArrayArray30 != null && local507.anIntArrayArray30[0][0] == 5) {
				local826 = local507.anIntArrayArray30[0][1];
				if (local507.anIntArray360[0] != Static46.anIntArray78[local826]) {
					Static46.anIntArray78[local826] = local507.anIntArray360[0];
					Static255.method3876(local826);
				}
			}
		}
		if (local22 == 35) {
			Static137.aClass1_Sub14_Sub1_6.method2661(138);
			Static137.aClass1_Sub14_Sub1_6.method2644(local35);
			Static137.aClass1_Sub14_Sub1_6.method2642(local13);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (local22 == 2) {
			Static137.aClass1_Sub14_Sub1_6.method2661(248);
			Static137.aClass1_Sub14_Sub1_6.method2637(local13);
			Static137.aClass1_Sub14_Sub1_6.method2630(local35);
			Static137.aClass1_Sub14_Sub1_6.method2618(local18);
			Static105.anInt2010 = 0;
			Static97.aClass146_8 = Static259.method3908(local35);
			Static138.anInt2720 = local13;
		}
		if (Static197.anInt3990 != 0) {
			Static197.anInt3990 = 0;
			Static237.method2927(Static259.method3908(Static122.anInt2468));
		}
		if (Static91.aBoolean136) {
			Static87.method1300();
		}
		if (Static97.aClass146_8 != null && Static105.anInt2010 == 0) {
			Static237.method2927(Static97.aClass146_8);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
	public static boolean method780() {
		return Static78.anInt1449 == 0 ? Static183.aClass1_Sub4_Sub3_3.method1471() : true;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method781() {
		Static199.aClass169_111.method4018();
		Static215.aClass169_118.method4018();
		Static62.aClass169_45.method4018();
		Static146.aClass169_83.method4018();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZII)I")
	public static int method782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub8 local10 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray57.length) {
			return local10.anIntArray57[arg0];
		} else {
			return -1;
		}
	}
}
