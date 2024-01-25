import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_4 = new Class95(4, 16);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
	public static void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static253.anInt4790 == 1) {
			Static163.aClass8Array176[Static231.anInt4305 / 100].method6001(Static343.anInt5807 - 8, Static48.anInt1175 + -8);
		}
		if (Static253.anInt4790 == 2) {
			Static163.aClass8Array176[Static231.anInt4305 / 100 + 4].method6001(Static343.anInt5807 - 8, Static48.anInt1175 - 8);
		}
		Static361.method4772();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIIIIBII)V")
	public static void method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static444.aClass159Array3 == null) {
			return;
		}
		@Pc(21) Class7_Sub2_Sub3 local21;
		@Pc(16) int local16;
		if (arg10 < 0) {
			local16 = -arg10 - 1;
			if (local16 == Static319.anInt1936) {
				local21 = Static379.aClass7_Sub2_Sub3_Sub2_2;
			} else {
				local21 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local16];
			}
		} else {
			local16 = arg10 - 1;
			local21 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local16];
		}
		if (local21 == null) {
			return;
		}
		@Pc(43) Class93 local43 = Static435.aClass30_4.method769(arg11);
		@Pc(57) int local57;
		@Pc(54) int local54;
		if (arg3 == 1 || arg3 == 3) {
			local54 = local43.anInt2762;
			local57 = local43.anInt2782;
		} else {
			local57 = local43.anInt2762;
			local54 = local43.anInt2782;
		}
		@Pc(70) int local70 = (local57 >> 1) + arg5;
		@Pc(78) int local78 = arg5 + (local57 + 1 >> 1);
		@Pc(85) int local85 = arg4 + (local54 >> 1);
		@Pc(94) int local94 = arg4 + (local54 + 1 >> 1);
		@Pc(98) Class159 local98 = Static444.aClass159Array3[arg9];
		@Pc(121) int local121 = local98.I(local70, local85) + local98.I(local78, local85) + local98.I(local70, local94) + local98.I(local78, local94) >> 2;
		@Pc(125) Class3_Sub15 local125 = new Class3_Sub15();
		local125.anInt2331 = arg7;
		local125.anInt2325 = arg3;
		local125.anInt2328 = local21.aByte77;
		@Pc(149) int local149;
		if (arg1 > arg0) {
			local149 = arg1;
			arg1 = arg0;
			arg0 = local149;
		}
		local125.anInt2337 = arg11;
		local125.anInt2332 = arg4;
		local125.anInt2333 = arg8 + Static253.anInt4787;
		local125.anInt2340 = arg6 + Static253.anInt4787;
		local125.anInt2322 = arg5;
		if (arg12 < arg2) {
			local149 = arg2;
			arg2 = arg12;
			arg12 = local149;
		}
		local125.anInt2324 = arg5 + arg0;
		local125.anInt2326 = arg5 + arg1;
		local125.anInt2334 = arg4 + arg2;
		local125.anInt2336 = (local125.anInt2322 << 7) + (local57 << 6);
		local125.anInt2329 = arg4 + arg12;
		local125.anInt2323 = (local125.anInt2332 << 7) + (local54 << 6);
		local125.anInt2339 = local121;
		Static199.aClass243_23.method5198(local125);
		local21.aClass3_Sub15_3 = local125;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIII)Lclient!dk;")
	public static Class3_Sub9 method1328(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.anInt1804 = arg1;
		local7.anInt1803 = arg3;
		Static318.aClass11_42.method319(local7, (long) arg2);
		Static136.method2171(arg1);
		@Pc(26) Class156 local26 = Static435.method5705(arg2);
		if (local26 != null) {
			Static386.method5010(local26);
		}
		if (Static318.aClass156_17 != null) {
			Static386.method5010(Static318.aClass156_17);
			Static318.aClass156_17 = null;
		}
		Static164.method2714();
		if (local26 != null) {
			Static317.method4367(!arg0, local26);
		}
		if (!arg0) {
			Static285.method4057(arg1);
		}
		if (!arg0 && Static226.anInt4225 != -1) {
			Static88.method1668(1, Static226.anInt4225);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLclient!en;I)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || Static184.aClass243_21.aClass3_231 == arg1) {
			return;
		}
		@Pc(17) int local17 = arg1.anInt2181;
		@Pc(20) int local20 = arg1.anInt2180;
		@Pc(23) int local23 = arg1.anInt2182;
		@Pc(27) int local27 = (int) arg1.aLong76;
		@Pc(30) long local30 = arg1.aLong76;
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		if (local23 == 57) {
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static30.method641(Static45.aClass217_20);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static213.anInt4082);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static338.anInt5764);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4391);
			Static302.aClass3_Sub7_Sub1_2.method2636(Static129.anInt2687);
			Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
		}
		if (local23 == 44) {
			Static253.anInt4790 = 2;
			Static231.anInt4305 = 0;
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static336.aClass217_93);
			Static302.aClass3_Sub7_Sub1_2.method2614(local27);
			Static302.aClass3_Sub7_Sub1_2.method2614(local20 + Static57.anInt5085);
			Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2613(local17 + Static223.anInt7618);
			Static24.method585(local20, local17);
		}
		@Pc(140) Class7_Sub2_Sub3_Sub2 local140;
		if (local23 == 17) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static30.method641(Static392.aClass217_100);
				Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 2) {
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static231.anInt4305 = 0;
			Static30.method641(Static175.aClass217_109);
			Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2613(local20 + Static57.anInt5085);
			Static302.aClass3_Sub7_Sub1_2.method2614(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2614(local27);
			Static24.method585(local20, local17);
		}
		@Pc(252) Class7_Sub2_Sub3_Sub1 local252;
		if (local23 == 25) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static30.method641(Static24.aClass217_8);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 15 && Static318.aClass156_17 == null) {
			Static438.method5740(local17, local20);
			Static318.aClass156_17 = Static109.method1853(local20, local17);
			Static386.method5010(Static318.aClass156_17);
		}
		if (local23 == 58) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static30.method641(Static256.aClass217_73);
				Static302.aClass3_Sub7_Sub1_2.method2614(local27);
				Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 30) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static30.method641(Static157.aClass217_56);
				Static302.aClass3_Sub7_Sub1_2.method2587(local27);
				Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 3) {
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static30.method641(Static414.aClass217_105);
			Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2599(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2599(local27);
			Static302.aClass3_Sub7_Sub1_2.method2613(Static57.anInt5085 + local20);
			Static24.method585(local20, local17);
		}
		if (local23 == 48) {
			Static231.anInt4305 = 0;
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static124.aClass217_115);
			Static302.aClass3_Sub7_Sub1_2.method2587(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2599(local27);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static57.anInt5085 + local20);
			Static24.method585(local20, local17);
		}
		if (local23 == 1004) {
			Static343.anInt5807 = arg0;
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				@Pc(574) Class47 local574 = local252.aClass47_1;
				if (local574.anIntArray94 != null) {
					local574 = local574.method1251(Static85.aClass49_1);
				}
				if (local574 != null) {
					Static30.method641(Static402.aClass217_101);
					Static302.aClass3_Sub7_Sub1_2.method2613(local574.anInt1584);
				}
			}
		}
		if (local23 == 59) {
			if (Static190.anInt3803 > 0 && Static263.aClass10_1.method301(82) && Static263.aClass10_1.method301(81)) {
				Static399.method5127(Static223.anInt7618 + local17, Static57.anInt5085 - -local20, Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77);
			} else {
				Static231.anInt4305 = 0;
				Static343.anInt5807 = arg0;
				Static253.anInt4790 = 1;
				Static48.anInt1175 = arg2;
				Static30.method641(Static277.aClass217_78);
				Static302.aClass3_Sub7_Sub1_2.method2613(local20 + Static57.anInt5085);
				Static302.aClass3_Sub7_Sub1_2.method2613(local17 + Static223.anInt7618);
			}
		}
		if (local23 == 18) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static30.method641(Static450.aClass217_113);
				Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2613(local27);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 1006) {
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static231.anInt4305 = 0;
			Static30.method641(Static284.aClass217_80);
			Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2613((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static302.aClass3_Sub7_Sub1_2.method2587(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2599(Static57.anInt5085 + local20);
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 13) {
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static343.anInt5807 = arg0;
			Static30.method641(Static286.aClass217_22);
			Static302.aClass3_Sub7_Sub1_2.method2607(Static129.anInt2687);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static213.anInt4082);
			Static302.aClass3_Sub7_Sub1_2.method2613(local27);
			Static302.aClass3_Sub7_Sub1_2.method2613(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2587(local20 + Static57.anInt5085);
			Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static338.anInt5764);
			Static24.method585(local20, local17);
		}
		if (local23 == 47) {
			Static253.anInt4790 = 2;
			Static231.anInt4305 = 0;
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static411.aClass217_104);
			Static302.aClass3_Sub7_Sub1_2.method2613((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2614(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2614(local20 + Static57.anInt5085);
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 60) {
			Static343.anInt5807 = arg0;
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static30.method641(Static405.aClass217_102);
			Static302.aClass3_Sub7_Sub1_2.method2599((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static57.anInt5085 + local20);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static223.anInt7618 + local17);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static213.anInt4082);
			Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static338.anInt5764);
			Static302.aClass3_Sub7_Sub1_2.method2583(Static129.anInt2687);
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 45) {
			Static343.anInt5807 = arg0;
			Static253.anInt4790 = 2;
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static6.aClass217_1);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static57.anInt5085 + local20);
			Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2587(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2587(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 12) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static343.anInt5807 = arg0;
				Static48.anInt1175 = arg2;
				Static30.method641(Static113.aClass217_89);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 46) {
			Static253.anInt4790 = 1;
			Static343.anInt5807 = arg0;
			Static231.anInt4305 = 0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static381.aClass217_114);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static213.anInt4082);
			Static302.aClass3_Sub7_Sub1_2.method2607(Static129.anInt2687);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static338.anInt5764);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static223.anInt7618 + local17);
			Static302.aClass3_Sub7_Sub1_2.method2613(Static57.anInt5085 + local20);
			Static439.method5750(true, local20, 0, 1, 1, -4, local17, 0);
		}
		if (local23 == 51) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static253.anInt4790 = 2;
				Static343.anInt5807 = arg0;
				Static48.anInt1175 = arg2;
				Static231.anInt4305 = 0;
				Static30.method641(Static455.aClass217_116);
				Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2614(local27);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 5) {
			Static253.anInt4790 = 2;
			Static231.anInt4305 = 0;
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static30.method641(Static373.aClass217_97);
			Static302.aClass3_Sub7_Sub1_2.method2599(Static223.anInt7618 + local17);
			Static302.aClass3_Sub7_Sub1_2.method2587(Static57.anInt5085 + local20);
			Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2613(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 21) {
			Static253.anInt4790 = 2;
			Static48.anInt1175 = arg2;
			Static231.anInt4305 = 0;
			Static343.anInt5807 = arg0;
			Static30.method641(Static361.aClass217_95);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2599(Static223.anInt7618 + local17);
			Static302.aClass3_Sub7_Sub1_2.method2613(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static302.aClass3_Sub7_Sub1_2.method2587(local20 + Static57.anInt5085);
			Static257.method3785(local30, local20, local17);
		}
		if (local23 == 16) {
			if (Static190.anInt3803 > 0 && Static263.aClass10_1.method301(82) && Static263.aClass10_1.method301(81)) {
				Static399.method5127(local17 + Static223.anInt7618, local20 + Static57.anInt5085, Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77);
			} else {
				Static333.method4467(local20, local27, local17);
				if (local27 == 1) {
					Static302.aClass3_Sub7_Sub1_2.method2628(-1);
					Static302.aClass3_Sub7_Sub1_2.method2628(-1);
					Static302.aClass3_Sub7_Sub1_2.method2613((int) Static252.aFloat47);
					Static302.aClass3_Sub7_Sub1_2.method2628(57);
					Static302.aClass3_Sub7_Sub1_2.method2628(Static20.anInt696);
					Static302.aClass3_Sub7_Sub1_2.method2628(Static341.anInt5790);
					Static302.aClass3_Sub7_Sub1_2.method2628(89);
					Static302.aClass3_Sub7_Sub1_2.method2613(Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318);
					Static302.aClass3_Sub7_Sub1_2.method2613(Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321);
					Static302.aClass3_Sub7_Sub1_2.method2628(63);
				} else {
					Static48.anInt1175 = arg2;
					Static253.anInt4790 = 1;
					Static343.anInt5807 = arg0;
					Static231.anInt4305 = 0;
				}
				Static439.method5750(true, local20, 0, 1, 1, -4, local17, 0);
			}
		}
		if (local23 == 49) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static231.anInt4305 = 0;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static253.anInt4790 = 2;
				Static30.method641(Static96.aClass217_40);
				Static302.aClass3_Sub7_Sub1_2.method2636(Static129.anInt2687);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2599(Static338.anInt5764);
				Static302.aClass3_Sub7_Sub1_2.method2613(Static213.anInt4082);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 1010) {
			Static231.anInt4305 = 0;
			Static253.anInt4790 = 2;
			Static48.anInt1175 = arg2;
			Static343.anInt5807 = arg0;
			Static30.method641(Static199.aClass217_63);
			Static302.aClass3_Sub7_Sub1_2.method2613(local27);
		}
		if (local23 == 22) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static30.method641(Static307.aClass217_86);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		@Pc(1592) Class156 local1592;
		if (local23 == 8) {
			local1592 = Static109.method1853(local20, local17);
			if (local1592 != null) {
				Static70.method1396();
				@Pc(1599) Class3_Sub45 local1599 = Static53.method1118(local1592);
				Static104.method1812(local1599.method5980(), local1599.anInt7653, local1592);
				Static189.aString34 = Static337.method4505(local1592);
				Static415.aString62 = local1592.aString42 + "<col=ffffff>";
				if (Static189.aString34 == null) {
					Static189.aString34 = "Null";
				}
			}
			return;
		}
		if (local23 == 50) {
			local1592 = Static109.method1853(local20, local17);
			if (local1592 != null) {
				Static277.method3926(local1592);
			}
		}
		if (local23 == 4) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static231.anInt4305 = 0;
				Static253.anInt4790 = 2;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static30.method641(Static261.aClass217_16);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2587(local27);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 23) {
			Static253.anInt4790 = 2;
			Static48.anInt1175 = arg2;
			Static231.anInt4305 = 0;
			Static343.anInt5807 = arg0;
			Static30.method641(Static10.aClass217_4);
			Static302.aClass3_Sub7_Sub1_2.method2614(Static57.anInt5085 + local20);
			Static302.aClass3_Sub7_Sub1_2.method2587(local17 + Static223.anInt7618);
			Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
			Static302.aClass3_Sub7_Sub1_2.method2614(local27);
			Static24.method585(local20, local17);
		}
		if (local23 == 19) {
			local252 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local27];
			if (local252 != null) {
				Static343.anInt5807 = arg0;
				Static48.anInt1175 = arg2;
				Static253.anInt4790 = 2;
				Static231.anInt4305 = 0;
				Static30.method641(Static54.aClass217_24);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local252.anIntArray288[0], 0, local252.method3499(), local252.method3499(), -2, local252.anIntArray287[0], 0);
			}
		}
		if (local23 == 1011) {
			Static343.anInt5807 = arg0;
			Static48.anInt1175 = arg2;
			Static253.anInt4790 = 2;
			Static231.anInt4305 = 0;
			Static30.method641(Static61.aClass217_28);
			Static302.aClass3_Sub7_Sub1_2.method2613(local27);
		}
		if (local23 == 10 || local23 == 1002) {
			Static132.method2052(local27, local17, local20, arg1.aString12);
		}
		if (local23 == 9) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static253.anInt4790 = 2;
				Static48.anInt1175 = arg2;
				Static343.anInt5807 = arg0;
				Static231.anInt4305 = 0;
				Static30.method641(Static290.aClass217_81);
				Static302.aClass3_Sub7_Sub1_2.method2614(local27);
				Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 20) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static253.anInt4790 = 2;
				Static343.anInt5807 = arg0;
				Static231.anInt4305 = 0;
				Static48.anInt1175 = arg2;
				Static30.method641(Static301.aClass217_45);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2599(local27);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 1007 || local23 == 1008 || local23 == 1012 || local23 == 1003 || local23 == 1009) {
			Static12.method290(local17, local27, local23);
		}
		if (local23 == 11) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static48.anInt1175 = arg2;
				Static253.anInt4790 = 2;
				Static343.anInt5807 = arg0;
				Static231.anInt4305 = 0;
				Static30.method641(Static141.aClass217_52);
				Static302.aClass3_Sub7_Sub1_2.method2601(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2614(local27);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (local23 == 6) {
			local140 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local27];
			if (local140 != null) {
				Static343.anInt5807 = arg0;
				Static48.anInt1175 = arg2;
				Static231.anInt4305 = 0;
				Static253.anInt4790 = 2;
				Static30.method641(Static45.aClass217_20);
				Static302.aClass3_Sub7_Sub1_2.method2614(Static213.anInt4082);
				Static302.aClass3_Sub7_Sub1_2.method2587(Static338.anInt5764);
				Static302.aClass3_Sub7_Sub1_2.method2587(local27);
				Static302.aClass3_Sub7_Sub1_2.method2636(Static129.anInt2687);
				Static302.aClass3_Sub7_Sub1_2.method2624(Static263.aClass10_1.method301(82) ? 1 : 0);
				Static439.method5750(true, local140.anIntArray288[0], 0, local140.method3499(), local140.method3499(), -2, local140.anIntArray287[0], 0);
			}
		}
		if (Static446.aBoolean648) {
			Static70.method1396();
		}
		if (Static440.aClass156_18 != null && Static267.anInt5035 == 0) {
			Static386.method5010(Static440.aClass156_18);
		}
	}
}
