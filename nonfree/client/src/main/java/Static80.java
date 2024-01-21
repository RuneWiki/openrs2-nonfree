import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
	public static boolean aBoolean72;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_5;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_1217 = Static72.method1077("glow1:");

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1214 = aClass74_1217;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!u;")
	private static Class74 aClass74_1216 = Static72.method1077("Loaded title screen");

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1215 = aClass74_1216;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_1218 = aClass74_1217;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "[Lclient!q;")
	public static Class2_Sub2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub2_Sub1_Sub1Array1 = new Class2_Sub2_Sub2_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method1252() {
		aClass74_1215 = null;
		aClass74_1216 = null;
		aClass74_1214 = null;
		aClass74_1218 = null;
		aClass74_1217 = null;
		aClass2_Sub2_Sub2_Sub1_Sub1Array1 = null;
		aClass2_Sub2_Sub1_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!re;")
	public static Class9 method1253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class9_Sub1");
			@Pc(15) Class9 local15 = (Class9) local11.getDeclaredConstructor().newInstance();
			local15.method1590(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class9_Sub2 local28 = new Class9_Sub2();
			local28.method1590(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static77.method1209(arg0)) {
			method1258(arg6, 0, arg3, -1, arg2, arg4, arg5, arg1, Static89.aClass2_Sub2_Sub17ArrayArray1[arg0], 0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method1255() {
		Static128.aClass2_Sub10_Sub1_3.method1533(175);
		if (Static66.anInt1458 != -1) {
			Static126.method1922(Static66.anInt1458);
			Static116.aBoolean107 = true;
			Static88.anInt1857 = -1;
			Static66.anInt1458 = -1;
			Static8.aBoolean11 = true;
		}
		if (Static42.anInt982 != -1) {
			Static126.method1922(Static42.anInt982);
			Static88.anInt1857 = -1;
			Static55.aBoolean16 = true;
			Static42.anInt982 = -1;
		}
		if (Static14.anInt401 != -1) {
			Static126.method1922(Static14.anInt401);
			Static14.anInt401 = -1;
			Static106.method1597(30);
		}
		if (Static98.anInt2115 != -1) {
			Static126.method1922(Static98.anInt2115);
			Static98.anInt2115 = -1;
		}
		if (Static90.anInt1905 != -1) {
			Static126.method1922(Static90.anInt1905);
			Static90.anInt1905 = -1;
			Static88.anInt1857 = -1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public static void method1256() {
		Static54.method918(false);
		Static30.anInt728 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static56.aByteArrayArray4.length; local14++) {
			if (Static93.anIntArray274[local14] != -1 && Static56.aByteArrayArray4[local14] == null) {
				Static56.aByteArrayArray4[local14] = Static121.aClass26_Sub1_71.method1358(0, Static93.anIntArray274[local14]);
				if (Static56.aByteArrayArray4[local14] == null) {
					Static30.anInt728++;
					local12 = false;
				}
			}
			if (Static57.anIntArray158[local14] != -1 && Static57.aByteArrayArray5[local14] == null) {
				Static57.aByteArrayArray5[local14] = Static121.aClass26_Sub1_71.method1364(Static57.anIntArray158[local14], 0, Static3.anIntArrayArray1[local14]);
				if (Static57.aByteArrayArray5[local14] == null) {
					local12 = false;
					Static30.anInt728++;
				}
			}
		}
		if (!local12) {
			Static77.anInt1674 = 1;
			return;
		}
		Static61.anInt1576 = 0;
		local12 = true;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static56.aByteArrayArray4.length; local98++) {
			@Pc(104) byte[] local104 = Static57.aByteArrayArray5[local98];
			if (local104 != null) {
				local117 = (Static120.anIntArray370[local98] >> 8) * 64 - Static107.anInt2343;
				local128 = (Static120.anIntArray370[local98] & 0xFF) * 64 - Static62.anInt1413;
				if (Static38.aBoolean33) {
					local128 = 10;
					local117 = 10;
				}
				local12 &= Static109.method1667(local117, local128, local104);
			}
		}
		if (!local12) {
			Static77.anInt1674 = 2;
			return;
		}
		if (Static77.anInt1674 != 0) {
			Static9.method226(Static92.aClass74_1314, Static8.aClass74_194, true);
		}
		Static31.method574();
		Static71.method1076();
		Static31.method574();
		Static84.aClass69_1.method1636();
		Static31.method574();
		System.gc();
		for (@Pc(179) int local179 = 0; local179 < 4; local179++) {
			Static50.aClass55Array1[local179].method1282();
		}
		@Pc(202) int local202;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local202 = 0; local202 < 104; local202++) {
					Static17.aByteArrayArrayArray1[local117][local128][local202] = 0;
				}
			}
		}
		Static31.method574();
		Static43.method685();
		local128 = Static56.aByteArrayArray4.length;
		Static65.method1009();
		Static54.method918(true);
		@Pc(254) int local254;
		@Pc(265) int local265;
		@Pc(380) int local380;
		@Pc(319) int local319;
		@Pc(369) int local369;
		if (!Static38.aBoolean33) {
			@Pc(269) byte[] local269;
			for (local202 = 0; local202 < local128; local202++) {
				local254 = (Static120.anIntArray370[local202] >> 8) * 64 - Static107.anInt2343;
				local265 = (Static120.anIntArray370[local202] & 0xFF) * 64 - Static62.anInt1413;
				local269 = Static56.aByteArrayArray4[local202];
				if (local269 != null) {
					Static31.method574();
					Static67.method1028(local265, local269, local254, Static50.aClass55Array1, Static113.anInt2442 * 8 - 48, Static48.anInt1147 * 8 + -48);
				}
			}
			for (local254 = 0; local254 < local128; local254++) {
				local265 = (Static120.anIntArray370[local254] >> 8) * 64 - Static107.anInt2343;
				local319 = (Static120.anIntArray370[local254] & 0xFF) * 64 - Static62.anInt1413;
				@Pc(323) byte[] local323 = Static56.aByteArrayArray4[local254];
				if (local323 == null && Static48.anInt1147 < 800) {
					Static31.method574();
					Static51.method1529(local319, 64, 64, local265);
				}
			}
			Static54.method918(true);
			for (local265 = 0; local265 < local128; local265++) {
				local269 = Static57.aByteArrayArray5[local265];
				if (local269 != null) {
					local369 = (Static120.anIntArray370[local265] >> 8) * 64 - Static107.anInt2343;
					local380 = (Static120.anIntArray370[local265] & 0xFF) * 64 - Static62.anInt1413;
					Static31.method574();
					Static123.method1853(local269, local369, Static84.aClass69_1, Static50.aClass55Array1, local380);
				}
			}
		}
		@Pc(434) int local434;
		@Pc(440) int local440;
		if (Static38.aBoolean33) {
			@Pc(446) int local446;
			@Pc(456) int local456;
			@Pc(458) int local458;
			for (local202 = 0; local202 < 4; local202++) {
				Static31.method574();
				for (local254 = 0; local254 < 13; local254++) {
					for (local265 = 0; local265 < 13; local265++) {
						local369 = Static46.anIntArrayArrayArray1[local202][local254][local265];
						@Pc(419) boolean local419 = false;
						if (local369 != -1) {
							local380 = local369 >> 24 & 0x3;
							local434 = local369 >> 1 & 0x3;
							local440 = local369 >> 14 & 0x3FF;
							local446 = local369 >> 3 & 0x7FF;
							local456 = (local440 / 8 << 8) + local446 / 8;
							for (local458 = 0; local458 < Static120.anIntArray370.length; local458++) {
								if (local456 == Static120.anIntArray370[local458] && Static56.aByteArrayArray4[local458] != null) {
									Static105.method1593(local380, Static56.aByteArrayArray4[local458], local265 * 8, (local446 & 0x7) * 8, local434, local202, (local440 & 0x7) * 8, Static50.aClass55Array1, local254 * 8);
									local419 = true;
									break;
								}
							}
						}
						if (!local419) {
							Static126.method1920(local265 * 8, local202, local254 * 8);
						}
					}
				}
			}
			for (local254 = 0; local254 < 13; local254++) {
				for (local265 = 0; local265 < 13; local265++) {
					local319 = Static46.anIntArrayArrayArray1[0][local254][local265];
					if (local319 == -1) {
						Static51.method1529(local265 * 8, 8, 8, local254 * 8);
					}
				}
			}
			Static54.method918(true);
			for (local265 = 0; local265 < 4; local265++) {
				Static31.method574();
				for (local319 = 0; local319 < 13; local319++) {
					for (local369 = 0; local369 < 13; local369++) {
						local380 = Static46.anIntArrayArrayArray1[local265][local319][local369];
						if (local380 != -1) {
							local440 = local380 >> 1 & 0x3;
							local434 = local380 >> 24 & 0x3;
							local446 = local380 >> 14 & 0x3FF;
							local456 = local380 >> 3 & 0x7FF;
							local458 = (local446 / 8 << 8) + (local456 / 8);
							for (@Pc(638) int local638 = 0; local638 < Static120.anIntArray370.length; local638++) {
								if (Static120.anIntArray370[local638] == local458 && Static57.aByteArrayArray5[local638] != null) {
									Static48.method789(local440, local319 * 8, local265, local369 * 8, Static57.aByteArrayArray5[local638], (local456 & 0x7) * 8, Static50.aClass55Array1, Static84.aClass69_1, local434, (local446 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static54.method918(true);
		Static71.method1076();
		Static31.method574();
		Static107.method1603(Static50.aClass55Array1, Static84.aClass69_1);
		Static54.method918(true);
		local202 = Static109.anInt2400;
		if (Static117.anInt2529 < local202) {
			local202 = Static117.anInt2529;
		}
		if (Static117.anInt2529 - 1 > local202) {
		}
		if (Static84.aBoolean73) {
			Static84.aClass69_1.method1622(Static109.anInt2400);
		} else {
			Static84.aClass69_1.method1622(0);
		}
		for (local254 = 0; local254 < 104; local254++) {
			for (local265 = 0; local265 < 104; local265++) {
				Static121.method1782(local265, local254);
			}
		}
		Static31.method574();
		Static24.method487();
		Static35.aClass16_93.method485();
		if (Static47.aFrame1 != null) {
			Static128.aClass2_Sub10_Sub1_3.method1533(42);
			Static128.aClass2_Sub10_Sub1_3.method1497(1057001181);
		}
		if (!Static38.aBoolean33) {
			local265 = (Static113.anInt2442 - 6) / 8;
			local319 = (Static113.anInt2442 + 6) / 8;
			local369 = (Static48.anInt1147 - 6) / 8;
			local380 = (Static48.anInt1147 + 6) / 8;
			for (local434 = local265 - 1; local434 <= local319 + 1; local434++) {
				for (local440 = local369 - 1; local440 <= local380 + 1; local440++) {
					if (local434 < local265 || local434 > local319 || local369 > local440 || local440 > local380) {
						Static121.aClass26_Sub1_71.method1363(Static91.method1340(new Class74[] { Static29.aClass74_533, Static56.method940(local434), Static112.aClass74_1542, Static56.method940(local440) }));
						Static121.aClass26_Sub1_71.method1363(Static91.method1340(new Class74[] { Static23.aClass74_503, Static56.method940(local434), Static112.aClass74_1542, Static56.method940(local440) }));
					}
				}
			}
		}
		if (Static14.anInt401 == -1) {
			Static106.method1597(30);
		} else {
			Static106.method1597(35);
		}
		Static31.method574();
		Static64.method1007();
		Static128.aClass2_Sub10_Sub1_3.method1533(52);
		Static16.method361();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
	public static boolean method1257(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIBIIII[Lclient!ve;I)V")
	private static void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub2_Sub17[] arg8, @OriginalArg(10) int arg9) {
		for (@Pc(3) int local3 = 0; local3 < arg8.length; local3++) {
			@Pc(11) Class2_Sub2_Sub17 local11 = arg8[local3];
			if (local11 != null && (local11.anInt2777 == 0 || local11.aBoolean124) && local11 != null && local11.anInt2803 == arg3 && !Static63.method1002(local11)) {
				@Pc(42) int local42 = arg4 + local11.anInt2780 - arg1;
				@Pc(49) int local49 = local11.anInt2834 + arg5 - arg9;
				@Pc(55) int local55 = local42 + local11.anInt2810;
				@Pc(62) int local62 = local42 <= arg4 ? arg4 : local42;
				@Pc(69) int local69 = local49 > arg5 ? local49 : arg5;
				@Pc(74) int local74 = local11.anInt2829 + local49;
				@Pc(85) int local85 = arg0 <= local55 ? arg0 : local55;
				@Pc(96) int local96 = local74 >= arg7 ? arg7 : local74;
				if (local11.anInt2777 == 0) {
					method1258(local85, local62 + local11.anInt2832 - local42, arg2, local11.anInt2794, local62, local69, arg6, local96, arg8, local69 + local11.anInt2836 - local49);
					if (local11.aClass2_Sub2_Sub17Array2 != null) {
						method1258(local85, local11.anInt2832 + local62 - local42, arg2, local11.anInt2794, local62, local69, arg6, local96, local11.aClass2_Sub2_Sub17Array2, local69 + local11.anInt2836 - local49);
					}
				}
				if (local11.aBoolean124) {
					@Pc(162) boolean local162 = false;
					@Pc(180) boolean local180;
					if (local62 <= Static46.anInt1062 && Static62.anInt1414 >= local69 && local85 > Static46.anInt1062 && local96 > Static62.anInt1414) {
						local180 = true;
					} else {
						local180 = false;
					}
					@Pc(186) boolean local186 = false;
					if (Static41.anInt973 == 1 && local62 <= Static120.anInt2565 && local69 <= Static15.anInt442 && local85 > Static120.anInt2565 && Static15.anInt442 < local96) {
						local186 = true;
					}
					if (Static52.anInt1256 == 1 && local180) {
						local162 = true;
					}
					if (local186 && Static101.aClass2_Sub2_Sub17_3 == null && (arg2 & 0x200) != 0 && !Static109.aBoolean103 && Static15.method354(local11) != null) {
						Static81.anInt1791 = Static120.anInt2565 - local62;
						Static4.anInt56 = Static15.anInt442 - local69;
						Static109.anInt2399 = 0;
						Static101.aClass2_Sub2_Sub17_3 = local11;
						Static67.anInt1478 = arg6;
						Static38.aBoolean34 = false;
					}
					if (Static101.aClass2_Sub2_Sub17_3 != null || Static109.aBoolean103) {
						local180 = false;
						local186 = false;
						local162 = false;
					}
					if (!local11.aBoolean128 && local186 && (arg2 & 0x1) != 0) {
						local11.aBoolean128 = true;
						if (local11.anObjectArray4 != null) {
							Static45.method732(local11, local11.anObjectArray4, Static15.anInt442 - local49, 0, null, Static120.anInt2565 - local42);
						}
					}
					if (local11.aBoolean128 && local162 && (arg2 & 0x4) != 0 && local11.anObjectArray16 != null) {
						Static45.method732(local11, local11.anObjectArray16, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
					}
					if (local11.aBoolean128 && !local162 && (arg2 & 0x2) != 0) {
						local11.aBoolean128 = false;
						if (local11.anObjectArray6 != null) {
							Static45.method732(local11, local11.anObjectArray6, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
						}
					}
					if (local162 && (arg2 & 0x8) != 0 && local11.anObjectArray12 != null) {
						Static45.method732(local11, local11.anObjectArray12, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
					}
					if (!local11.aBoolean121 && local180 && (arg2 & 0x10) != 0) {
						local11.aBoolean121 = true;
						if (local11.anObjectArray11 != null) {
							Static45.method732(local11, local11.anObjectArray11, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
						}
					}
					if (local11.aBoolean121 && local180 && (arg2 & 0x40) != 0 && local11.anObjectArray13 != null) {
						Static45.method732(local11, local11.anObjectArray13, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
					}
					if (local11.aBoolean121 && !local180 && (arg2 & 0x20) != 0) {
						local11.aBoolean121 = false;
						if (local11.anObjectArray20 != null) {
							Static45.method732(local11, local11.anObjectArray20, Static62.anInt1414 - local49, 0, null, Static46.anInt1062 - local42);
						}
					}
					if (local11.anObjectArray15 != null && (arg2 & 0x80) != 0) {
						Static45.method732(local11, local11.anObjectArray15, 0, 0, null, 0);
					}
					if (local180 && Static97.anInt2889 != 0 && local11.anObjectArray14 != null && (arg2 & 0x400) != 0) {
						Static45.method732(local11, local11.anObjectArray14, Static97.anInt2889, 0, null, 0);
					}
					if ((arg2 & 0x100) != 0) {
						if (local11.anInt2797 < Static46.anInt1053 && local11.anObjectArray18 != null) {
							Static45.method732(local11, local11.anObjectArray18, 0, 0, null, 0);
						}
						if (Static46.anInt1051 > local11.anInt2797 && local11.anObjectArray8 != null) {
							Static45.method732(local11, local11.anObjectArray8, 0, 0, null, 0);
						}
						if (Static99.anInt2127 > local11.anInt2797 && local11.anObjectArray17 != null) {
							Static45.method732(local11, local11.anObjectArray17, 0, 0, null, 0);
						}
						local11.anInt2797 = Static107.anInt2338;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ud;BI[B)V")
	public static void method1259(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt2409 = 0;
		local7.aClass77_4 = arg0;
		local7.aByteArray29 = arg2;
		local7.aLong96 = arg1;
		@Pc(22) Class13 local22 = Static19.aClass13_17;
		synchronized (Static19.aClass13_17) {
			Static19.aClass13_17.method418(local7);
		}
		Static110.method1674();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(JI)V")
	public static void method1260(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static53.method894(arg0 - 1L);
			Static53.method894(1L);
		} else {
			Static53.method894(arg0);
		}
	}
}
