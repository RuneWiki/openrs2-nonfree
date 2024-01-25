import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public static int anInt1518;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	private static int anInt1530;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	private static int anInt1531;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	public static int anInt1514 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIB)V")
	public static void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg4 << 1) - 3);
		@Pc(76) int local76 = local54;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (arg0 >= Static75.anInt1858 && Static175.anInt3399 >= arg0) {
			local94 = Static440.method5950(arg1 + arg2, Static351.anInt6176, Static331.anInt5894);
			local103 = Static440.method5950(arg2 - arg1, Static351.anInt6176, Static331.anInt5894);
			Static49.method990(Static277.anIntArrayArray40[arg0], local94, local103, arg3);
		}
		@Pc(117) int local117 = (arg4 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local7++;
					local76 += local54;
					local62 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local76;
				local76 += local54;
				local62 += local54;
				local7++;
			}
			local46 += -local70;
			local38 += -local117;
			local117 -= local50;
			local70 -= local50;
			local9--;
			local94 = arg0 - local9;
			local103 = local9 + arg0;
			if (Static75.anInt1858 <= local103 && Static175.anInt3399 >= local94) {
				@Pc(211) int local211 = Static440.method5950(local7 + arg2, Static351.anInt6176, Static331.anInt5894);
				@Pc(220) int local220 = Static440.method5950(arg2 - local7, Static351.anInt6176, Static331.anInt5894);
				if (Static75.anInt1858 <= local94) {
					Static49.method990(Static277.anIntArrayArray40[local94], local211, local220, arg3);
				}
				if (Static175.anInt3399 >= local103) {
					Static49.method990(Static277.anIntArrayArray40[local103], local211, local220, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public static int method1095(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - Static49.method988(arg0.charAt(local12)));
		}
		return local10;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
	public static void method1100() {
		Static371.method5228(false);
		Static271.anInt4993 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static287.aByteArrayArray16.length; local14++) {
			if (Static57.anIntArray69[local14] != -1 && Static287.aByteArrayArray16[local14] == null) {
				Static287.aByteArrayArray16[local14] = Static438.aClass188_126.method4283(Static57.anIntArray69[local14], 0);
				if (Static287.aByteArrayArray16[local14] == null) {
					Static271.anInt4993++;
					local12 = false;
				}
			}
			if (Static83.anIntArray110[local14] != -1 && Static280.aByteArrayArray14[local14] == null) {
				Static280.aByteArrayArray14[local14] = Static438.aClass188_126.method4291(0, Static257.anIntArrayArray37[local14], Static83.anIntArray110[local14]);
				if (Static280.aByteArrayArray14[local14] == null) {
					local12 = false;
					Static271.anInt4993++;
				}
			}
			if (Static170.anIntArray218[local14] != -1 && Static340.aByteArrayArray19[local14] == null) {
				Static340.aByteArrayArray19[local14] = Static438.aClass188_126.method4283(Static170.anIntArray218[local14], 0);
				if (Static340.aByteArrayArray19[local14] == null) {
					local12 = false;
					Static271.anInt4993++;
				}
			}
			if (Static312.anIntArray200[local14] != -1 && Static342.aByteArrayArray20[local14] == null) {
				Static342.aByteArrayArray20[local14] = Static438.aClass188_126.method4283(Static312.anIntArray200[local14], 0);
				if (Static342.aByteArrayArray20[local14] == null) {
					Static271.anInt4993++;
					local12 = false;
				}
			}
			if (Static420.anIntArray494 != null && Static253.aByteArrayArray12[local14] == null && Static420.anIntArray494[local14] != -1) {
				Static253.aByteArrayArray12[local14] = Static438.aClass188_126.method4291(0, Static257.anIntArrayArray37[local14], Static420.anIntArray494[local14]);
				if (Static253.aByteArrayArray12[local14] == null) {
					Static271.anInt4993++;
					local12 = false;
				}
			}
		}
		if (Static269.aClass201_3 == null) {
			if (Static3.aClass2_Sub2_Sub11_1 == null || !Static309.aClass188_82.method4295(Static3.aClass2_Sub2_Sub11_1.aString35 + "_staticelements")) {
				Static269.aClass201_3 = new Class201(0);
			} else if (Static309.aClass188_82.method4277(Static3.aClass2_Sub2_Sub11_1.aString35 + "_staticelements")) {
				Static269.aClass201_3 = Static293.method4560(Static3.aClass2_Sub2_Sub11_1.aString35 + "_staticelements", Static309.aClass188_82, Static67.aBoolean153);
			} else {
				Static271.anInt4993++;
				local12 = false;
			}
		}
		if (!local12) {
			Static302.anInt4904 = 1;
			return;
		}
		local12 = true;
		Static88.anInt2012 = 0;
		@Pc(264) int local264;
		@Pc(275) int local275;
		for (@Pc(245) int local245 = 0; local245 < Static287.aByteArrayArray16.length; local245++) {
			@Pc(251) byte[] local251 = Static280.aByteArrayArray14[local245];
			if (local251 != null) {
				local264 = (Static96.anIntArray119[local245] >> 8) * 64 - Static173.anInt3340;
				local275 = (Static96.anIntArray119[local245] & 0xFF) * 64 - Static379.anInt6721;
				if (Static200.anInt7590 != 0) {
					local275 = 10;
					local264 = 10;
				}
				local12 &= Static379.method5284(local251, local264, Static171.anInt3288, Static81.anInt1950, local275);
			}
			local251 = Static342.aByteArrayArray20[local245];
			if (local251 != null) {
				local264 = (Static96.anIntArray119[local245] >> 8) * 64 - Static173.anInt3340;
				local275 = (Static96.anIntArray119[local245] & 0xFF) * 64 - Static379.anInt6721;
				if (Static200.anInt7590 != 0) {
					local264 = 10;
					local275 = 10;
				}
				local12 &= Static379.method5284(local251, local264, Static171.anInt3288, Static81.anInt1950, local275);
			}
		}
		if (!local12) {
			Static302.anInt4904 = 2;
			return;
		}
		if (Static302.anInt4904 != 0) {
			Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537) + "<br>(100%)", Static184.aClass56_2, true);
		}
		Static438.method5925();
		Static238.method3614();
		@Pc(371) boolean local371 = false;
		if (Static387.aClass26_9.method2224() && Static399.aClass167_Sub1_1.aBoolean497) {
			for (local264 = 0; local264 < Static287.aByteArrayArray16.length; local264++) {
				if (Static342.aByteArrayArray20[local264] != null || Static340.aByteArrayArray19[local264] != null) {
					local371 = true;
					break;
				}
			}
		}
		if (Static399.aClass167_Sub1_1.aBoolean494) {
			local264 = Static448.anIntArray512[Static306.anInt5401];
		} else {
			local264 = Static329.anIntArray382[Static306.anInt5401];
		}
		if (Static387.aClass26_9.method2272()) {
			local264++;
		}
		Static65.method6070(Static81.anInt1950, Static171.anInt3288, local264, local371, Static387.aClass26_9.method2281() > 0);
		for (local275 = 0; local275 < 4; local275++) {
			Static332.aClass37Array1[local275].method1060();
		}
		Static415.method5637();
		Static388.method5360(false);
		Static131.method1913();
		Static45.aClass243_4 = null;
		Static438.method5925();
		System.gc();
		Static371.method5228(true);
		Static276.method4101();
		Static190.anInt3752 = Static399.aClass167_Sub1_1.method4517(Static281.anInt5126);
		Static106.aBoolean190 = Static43.anInt1146 >= 96;
		Static312.aBoolean256 = Static399.aClass167_Sub1_1.aBoolean497;
		Static143.aBoolean652 = Static399.aClass167_Sub1_1.method4514(Static281.anInt5126);
		Static137.aBoolean236 = !Static399.aClass167_Sub1_1.aBoolean483;
		Static331.anInt5893 = Static399.aClass167_Sub1_1.method4528(Static281.anInt5126) ? -1 : Static179.anInt6503;
		Static22.aBoolean37 = Static399.aClass167_Sub1_1.aBoolean487;
		Static449.aBoolean229 = Static281.anInt5126 == 1 || Static399.aClass167_Sub1_1.aBoolean482;
		Static123.aClass33_Sub1_1 = new Class33_Sub1(4, Static81.anInt1950, Static171.anInt3288, false);
		if (Static200.anInt7590 == 0) {
			Static299.method4336(Static123.aClass33_Sub1_1, Static287.aByteArrayArray16);
		} else {
			Static378.method5274(Static287.aByteArrayArray16, Static123.aClass33_Sub1_1);
		}
		Static320.method6035(Static171.anInt3288 >> 4, Static81.anInt1950 >> 4);
		Static136.method1991();
		if (local371) {
			Static215.method3334(true);
			Static281.aClass33_Sub1_2 = new Class33_Sub1(1, Static81.anInt1950, Static171.anInt3288, true);
			if (Static200.anInt7590 == 0) {
				Static299.method4336(Static281.aClass33_Sub1_2, Static340.aByteArrayArray19);
				Static371.method5228(true);
			} else {
				Static378.method5274(Static340.aByteArrayArray19, Static281.aClass33_Sub1_2);
				Static371.method5228(true);
			}
			Static281.aClass33_Sub1_2.method908(Static123.aClass33_Sub1_1.anIntArrayArrayArray2[0]);
			Static281.aClass33_Sub1_2.method913(Static387.aClass26_9, null, null);
			Static215.method3334(false);
		}
		Static123.aClass33_Sub1_1.method913(Static387.aClass26_9, Static332.aClass37Array1, local371 ? Static281.aClass33_Sub1_2.anIntArrayArrayArray2 : null);
		if (Static200.anInt7590 == 0) {
			Static371.method5228(true);
			Static345.method3346(Static280.aByteArrayArray14, Static123.aClass33_Sub1_1);
			if (Static253.aByteArrayArray12 != null) {
				Static411.method5568();
			}
		} else {
			Static371.method5228(true);
			Static365.method5072(Static280.aByteArrayArray14, Static123.aClass33_Sub1_1);
		}
		Static238.method3614();
		Static371.method5228(true);
		Static123.aClass33_Sub1_1.method914(null, local371 ? Static77.aClass106Array12[0] : null, Static387.aClass26_9);
		Static123.aClass33_Sub1_1.method921(Static387.aClass26_9);
		Static371.method5228(true);
		if (local371) {
			Static215.method3334(true);
			Static371.method5228(true);
			if (Static200.anInt7590 == 0) {
				Static345.method3346(Static342.aByteArrayArray20, Static281.aClass33_Sub1_2);
			} else {
				Static365.method5072(Static342.aByteArrayArray20, Static281.aClass33_Sub1_2);
			}
			Static238.method3614();
			Static371.method5228(true);
			Static281.aClass33_Sub1_2.method914(Static72.aClass106Array4[0], null, Static387.aClass26_9);
			Static281.aClass33_Sub1_2.method921(Static387.aClass26_9);
			Static371.method5228(true);
			Static215.method3334(false);
		}
		Static434.method5863();
		@Pc(712) int local712 = Static123.aClass33_Sub1_1.anInt1253;
		if (Static301.anInt5383 < local712) {
			local712 = Static301.anInt5383;
		}
		if (local712 < Static301.anInt5383 - 1) {
			local712 = Static301.anInt5383 - 1;
		}
		if (Static399.aClass167_Sub1_1.method4528(Static281.anInt5126)) {
			Static338.method4780(0);
		} else {
			Static338.method4780(local712);
		}
		@Pc(743) int local743;
		@Pc(747) int local747;
		for (@Pc(739) int local739 = 0; local739 < 4; local739++) {
			for (local743 = 0; local743 < Static81.anInt1950; local743++) {
				for (local747 = 0; local747 < Static171.anInt3288; local747++) {
					Static61.method1209(local739, local743, local747);
				}
			}
		}
		Static276.method4099();
		Static438.method5925();
		Static412.method5579();
		Static238.method3614();
		Static401.aBoolean593 = false;
		Static346.method4860();
		if (Static373.aFrame2 != null && Static423.aClass199_11 != null && Static297.anInt5339 == 25) {
			Static448.method6059(Static417.aClass44_90);
			Static98.aClass2_Sub20_Sub1_1.method3713(1057001181);
		}
		if (Static200.anInt7590 == 0) {
			local743 = (Static447.anInt4685 - (Static81.anInt1950 >> 4)) / 8;
			local747 = (Static447.anInt4685 + (Static81.anInt1950 >> 4)) / 8;
			@Pc(833) int local833 = (Static190.anInt3756 - (Static171.anInt3288 >> 4)) / 8;
			@Pc(841) int local841 = ((Static171.anInt3288 >> 4) + Static190.anInt3756) / 8;
			for (@Pc(845) int local845 = local743 - 1; local845 <= local747 + 1; local845++) {
				for (@Pc(851) int local851 = local833 - 1; local851 <= local841 + 1; local851++) {
					if (local743 > local845 || local845 > local747 || local851 < local833 || local841 < local851) {
						Static438.aClass188_126.method4302("m" + local845 + "_" + local851);
						Static438.aClass188_126.method4302("l" + local845 + "_" + local851);
					}
				}
			}
		}
		if (Static297.anInt5339 == 28) {
			Static446.method6043(10);
		} else {
			Static446.method6043(30);
			if (Static423.aClass199_11 != null) {
				Static448.method6059(Static328.aClass44_79);
			}
		}
		Static142.method2019();
		Static438.method5925();
		Static236.method3588();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!us;I)V")
	public static void method1101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) Static48.aClass265_11.method6005(); local17 != null; local17 = (Class2_Sub23) Static48.aClass265_11.method6001()) {
			if (local17.anInt3782 == arg3 && local17.anInt3784 == arg0 << 7 && local17.anInt3779 == arg1 << 7 && local17.aClass250_1.anInt7160 == arg2.anInt7160) {
				if (local17.aClass2_Sub18_Sub1_3 != null) {
					Static360.aClass2_Sub18_Sub4_2.method4456(local17.aClass2_Sub18_Sub1_3);
					local17.aClass2_Sub18_Sub1_3 = null;
				}
				if (local17.aClass2_Sub18_Sub1_2 != null) {
					Static360.aClass2_Sub18_Sub4_2.method4456(local17.aClass2_Sub18_Sub1_2);
					local17.aClass2_Sub18_Sub1_2 = null;
				}
				local17.method6072();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!dc;ILclient!qa;IILclient!c;IIIIIZ)Lclient!c;")
	public static Class32 method1104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class32 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method1267(arg0, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) ((arg6 << 24) + (arg10 << 16) + arg7) + ((long) arg9 << 32) + ((long) arg4 << 48);
		@Pc(70) Class129 local70 = Static88.aClass129_14;
		@Pc(78) Class32 local78;
		synchronized (Static88.aClass129_14) {
			local78 = (Class32) Static88.aClass129_14.method3023(local48);
		}
		@Pc(173) int local173;
		@Pc(179) int local179;
		@Pc(185) int local185;
		@Pc(189) int local189;
		if (local78 == null || arg5.method2259(local78.n(), local11) != 0) {
			if (local78 != null) {
				local11 = arg5.method2285(local11, local78.n());
			}
			@Pc(108) byte local108;
			if (arg7 == 1) {
				local108 = 9;
			} else if (arg7 == 2) {
				local108 = 12;
			} else if (arg7 == 3) {
				local108 = 15;
			} else if (arg7 == 4) {
				local108 = 18;
			} else {
				local108 = 21;
			}
			@Pc(148) int[] local148 = new int[] { 64, 96, 128 };
			@Pc(166) Class266 local166 = new Class266(local108 * 3 + 1, local108 * 3 * 2 + -local108, 0);
			local173 = local166.method6050(0, 0, 0);
			@Pc(177) int[][] local177 = new int[3][local108];
			@Pc(191) int local191;
			@Pc(215) int local215;
			for (local179 = 0; local179 < 3; local179++) {
				local185 = local148[local179];
				local189 = local148[local179];
				for (local191 = 0; local191 < local108; local191++) {
					@Pc(199) int local199 = (local191 << 14) / local108;
					@Pc(207) int local207 = local185 * Class184.anIntArray349[local199] >> 15;
					local215 = local189 * Class184.anIntArray350[local199] >> 15;
					local177[local179][local191] = local166.method6050(local207, 0, local215);
				}
			}
			for (local185 = 0; local185 < 3; local185++) {
				local189 = (local185 * 256 + 128) / 3;
				local191 = 256 - local189;
				@Pc(270) byte local270 = (byte) (local189 * arg6 + local191 * arg10 >> 8);
				@Pc(315) short local315 = (short) (((arg9 & 0xFC00) * local191 + (arg4 & 0xFC00) * local189 & 0xFC0000) + ((arg9 & 0x380) * local191 + local189 * (arg4 & 0x380) & 0x38000) + ((arg9 & 0x7F) * local191 + (arg4 & 0x7F) * local189 & 0x7F00) >> 8);
				for (local215 = 0; local215 < local108; local215++) {
					if (local185 == 0) {
						local166.method6046(local315, (short) -1, local177[0][(local215 + 1) % local108], local173, (byte) -1, local177[0][local215], local270, (byte) 1);
					} else {
						local166.method6046(local315, (short) -1, local177[local185 - 1][(local215 + 1) % local108], local177[local185 - 1][local215], (byte) -1, local177[local185][(local215 + 1) % local108], local270, (byte) 1);
						local166.method6046(local315, (short) -1, local177[local185][(local215 + 1) % local108], local177[local185 - 1][local215], (byte) -1, local177[local185][local215], local270, (byte) 1);
					}
				}
			}
			local78 = arg5.method2227(local166, local11, Static94.anInt2152, 64, 768);
			@Pc(440) Class129 local440 = Static88.aClass129_14;
			synchronized (Static88.aClass129_14) {
				Static88.aClass129_14.method3029(local78, local48);
			}
		}
		@Pc(459) int local459 = (arg7 << 6) - 1;
		@Pc(462) int local462 = -local459;
		@Pc(465) int local465 = -local459;
		@Pc(467) int local467 = local459;
		local173 = local459;
		if (arg13) {
			if (arg11 > 13312 || arg11 < 3072) {
				local465 -= 128;
			}
			if (arg11 > 1024 && arg11 < 7168) {
				local462 -= 128;
			}
			if (arg11 > 5120 && arg11 < 11264) {
				local173 = local459 + 128;
			}
			if (arg11 > 9216 && arg11 < 15360) {
				local467 = local459 + 128;
			}
		}
		@Pc(514) int local514 = arg8.la();
		local179 = arg8.VA();
		local185 = arg8.X();
		if (local467 < local179) {
			local179 = local467;
		}
		if (local185 < local465) {
			local185 = local465;
		}
		if (local514 < local462) {
			local514 = local462;
		}
		local189 = arg8.C();
		if (local173 < local189) {
			local189 = local173;
		}
		@Pc(553) Class2_Sub2_Sub7 local553 = null;
		if (arg3 != null) {
			@Pc(560) int local560 = arg3.anIntArray90[arg0];
			local553 = Static9.aClass194_1.method4376(local560 >> 16);
			arg0 = local560 & 0xFFFF;
		}
		if (local553 == null) {
			local78 = local78.method5678((byte) 3, local11, true);
			local78.XA(local179 - local514 >> 1, 128, local189 - local185 >> 1);
			local78.ja(local514 + local179 >> 1, 0, local189 + local185 >> 1);
		} else {
			local78 = local78.method5678((byte) 3, local11, true);
			local78.XA(local179 - local514 >> 1, 128, local189 - local185 >> 1);
			local78.ja(local179 + local514 >> 1, 0, local185 + local189 >> 1);
			local78.method5669(arg0, local553);
		}
		if (arg2 != 0) {
			local78.WA(arg2);
		}
		if (arg12 != 0) {
			local78.o(arg12);
		}
		if (arg1 != 0) {
			local78.ja(0, arg1, 0);
		}
		return local78;
	}

	@OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lclient!js;)V")
	private static void method1107(@OriginalArg(0) Class131 arg0) {
		Static303.aClass131_4 = arg0;
		Static32.aClass131_1 = arg0;
	}
}
