import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_19;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_20;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "J")
	public static long aLong129;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!ua;")
	public static Class82 aClass82_63 = new Class82(30);

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "J")
	public static long aLong128 = 0L;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1530 = Static146.method2172("M");

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1526 = aClass77_1530;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1527 = Static146.method2172("sl_stars");

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
	public static int anInt4481 = 0;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1528 = aClass77_1530;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1529 = Static146.method2172("(U2");

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!vg;)V")
	public static void method2955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub1_Sub6_Sub1 arg2) {
		@Pc(11) int local11;
		@Pc(20) int local20;
		if ((arg1 & 0x10) != 0) {
			local11 = Static74.aClass2_Sub18_Sub1_1.method2379();
			if (local11 == 65535) {
				local11 = -1;
			}
			local20 = Static74.aClass2_Sub18_Sub1_1.method2352();
			Static59.method1094(local11, arg2, local20);
		}
		if ((arg1 & 0x4) != 0) {
			arg2.aClass77_1508 = Static74.aClass2_Sub18_Sub1_1.method2361();
			if (arg2.aClass77_1508.method2526(0) == 126) {
				arg2.aClass77_1508 = arg2.aClass77_1508.method2504(1);
				Static174.method2943(arg2.aClass77_1482, arg2.aClass77_1508, 2);
			} else if (arg2 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11) {
				Static174.method2943(arg2.aClass77_1482, arg2.aClass77_1508, 2);
			}
			arg2.anInt4410 = 0;
			arg2.anInt4419 = 150;
			arg2.anInt4405 = 0;
		}
		if ((arg1 & 0x2) != 0) {
			local11 = Static74.aClass2_Sub18_Sub1_1.method2374();
			@Pc(89) byte[] local89 = new byte[local11];
			@Pc(94) Class2_Sub18 local94 = new Class2_Sub18(local89);
			Static74.aClass2_Sub18_Sub1_1.method2366(local11, local89);
			Static158.aClass2_Sub18Array1[arg0] = local94;
			arg2.method2894(local94);
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt4402 = Static74.aClass2_Sub18_Sub1_1.method2379();
			if (arg2.anInt4402 == 65535) {
				arg2.anInt4402 = -1;
			}
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt4404 = Static74.aClass2_Sub18_Sub1_1.method2395();
			local11 = Static74.aClass2_Sub18_Sub1_1.method2382();
			arg2.anInt4382 = (local11 & 0xFFFF) + Static143.anInt3513;
			if (arg2.anInt4404 == 65535) {
				arg2.anInt4404 = -1;
			}
			arg2.anInt4411 = 0;
			arg2.anInt4390 = 0;
			if (Static143.anInt3513 < arg2.anInt4382) {
				arg2.anInt4390 = -1;
			}
			arg2.anInt4379 = local11 >> 16;
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt4417 = Static74.aClass2_Sub18_Sub1_1.method2353();
			arg2.anInt4371 = Static74.aClass2_Sub18_Sub1_1.method2395();
		}
		if ((arg1 & 0x1) != 0) {
			local11 = Static74.aClass2_Sub18_Sub1_1.method2379();
			local20 = Static74.aClass2_Sub18_Sub1_1.method2352();
			@Pc(205) int local205 = Static74.aClass2_Sub18_Sub1_1.method2377();
			@Pc(208) int local208 = Static74.aClass2_Sub18_Sub1_1.anInt3423;
			if (arg2.aClass77_1482 != null && arg2.aClass1_2 != null) {
				@Pc(216) boolean local216 = false;
				@Pc(221) long local221 = arg2.aClass77_1482.method2531();
				if (local20 <= 1) {
					for (@Pc(228) int local228 = 0; local228 < Static181.anInt4605; local228++) {
						if (Static72.aLongArray4[local228] == local221) {
							local216 = true;
							break;
						}
					}
				}
				if (!local216 && Static21.anInt678 == 0) {
					Static179.aClass2_Sub18_108.anInt3423 = 0;
					Static74.aClass2_Sub18_Sub1_1.method2390(Static179.aClass2_Sub18_108.aByteArray39, local205);
					Static179.aClass2_Sub18_108.anInt3423 = 0;
					@Pc(270) Class77 local270 = Static102.method1279(Static71.method1387(Static179.aClass2_Sub18_108).method2507());
					arg2.aClass77_1508 = local270.method2505();
					arg2.anInt4405 = local11 >> 8;
					arg2.anInt4419 = 150;
					arg2.anInt4410 = local11 & 0xFF;
					if (local20 == 2 || local20 == 3) {
						Static174.method2943(Static146.method2168(new Class77[] { Static139.aClass77_1207, arg2.aClass77_1482 }), local270, 1);
					} else if (local20 == 1) {
						Static174.method2943(Static146.method2168(new Class77[] { Static174.aClass77_1517, arg2.aClass77_1482 }), local270, 1);
					} else {
						Static174.method2943(arg2.aClass77_1482, local270, 2);
					}
				}
			}
			Static74.aClass2_Sub18_Sub1_1.anInt3423 = local205 + local208;
		}
		if ((arg1 & 0x80) != 0) {
			local11 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local20 = Static74.aClass2_Sub18_Sub1_1.method2374();
			arg2.method2915(local11, local20, Static143.anInt3513);
			arg2.anInt4420 = Static143.anInt3513 + 300;
			arg2.anInt4427 = Static74.aClass2_Sub18_Sub1_1.method2352();
			arg2.anInt4384 = Static74.aClass2_Sub18_Sub1_1.method2374();
		}
		if ((arg1 & 0x200) != 0) {
			local11 = Static74.aClass2_Sub18_Sub1_1.method2352();
			local20 = Static74.aClass2_Sub18_Sub1_1.method2352();
			arg2.method2915(local11, local20, Static143.anInt3513);
			arg2.anInt4420 = Static143.anInt3513 + 300;
			arg2.anInt4427 = Static74.aClass2_Sub18_Sub1_1.method2377();
			arg2.anInt4384 = Static74.aClass2_Sub18_Sub1_1.method2374();
		}
		if ((arg1 & 0x100) == 0) {
			return;
		}
		arg2.anInt4392 = Static74.aClass2_Sub18_Sub1_1.method2352();
		arg2.anInt4377 = Static74.aClass2_Sub18_Sub1_1.method2352();
		arg2.anInt4381 = Static74.aClass2_Sub18_Sub1_1.method2374();
		arg2.anInt4374 = Static74.aClass2_Sub18_Sub1_1.method2374();
		arg2.anInt4396 = Static74.aClass2_Sub18_Sub1_1.method2379() + Static143.anInt3513;
		arg2.anInt4414 = Static74.aClass2_Sub18_Sub1_1.method2379() + Static143.anInt3513;
		arg2.anInt4423 = Static74.aClass2_Sub18_Sub1_1.method2352();
		arg2.anInt4403 = 1;
		arg2.anInt4421 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
	public static void method2956(@OriginalArg(0) boolean arg0) {
		if (Static101.aClass29_3 == null) {
			return;
		}
		try {
			@Pc(19) Class2_Sub18 local19 = new Class2_Sub18(4);
			local19.method2389(arg0 ? 2 : 3);
			local19.method2360(0);
			Static101.aClass29_3.method969(4, local19.aByteArray39);
		} catch (@Pc(40) IOException local40) {
			try {
				Static101.aClass29_3.method967();
			} catch (@Pc(45) Exception local45) {
			}
			Static170.anInt4200++;
			Static101.aClass29_3 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ke;Lclient!ke;Ljava/awt/Component;)V")
	public static void method2957(@OriginalArg(1) Class43 arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) Component arg2) {
		if (Static108.aBoolean112) {
			return;
		}
		Static113.method1239();
		@Pc(17) byte[] local17 = arg1.method2212(Static39.aClass77_451, Static125.aClass77_1119);
		Static141.aClass2_Sub2_Sub3_Sub2_6 = new Class2_Sub2_Sub3_Sub2(local17, arg2);
		Static163.aClass2_Sub2_Sub3_Sub2_7 = Static141.aClass2_Sub2_Sub3_Sub2_6.method400();
		Static132.aClass2_Sub2_Sub3_Sub3_6 = Static179.method2997(Static51.aClass77_544, arg0, Static39.aClass77_451);
		Static112.aClass2_Sub2_Sub3_Sub3_3 = Static179.method2997(Static56.aClass77_598, arg0, Static39.aClass77_451);
		Static119.aClass2_Sub2_Sub3_Sub3_4 = Static179.method2997(Static96.aClass77_943, arg0, Static39.aClass77_451);
		Static4.aClass2_Sub2_Sub3_Sub3Array19 = Static15.method327(Static130.aClass77_1157, Static39.aClass77_451, arg0);
		Static181.aClass2_Sub2_Sub3_Sub3Array20 = Static15.method327(Static76.aClass77_800, Static39.aClass77_451, arg0);
		Static159.anIntArray569 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static159.anIntArray569[local61] = local61 * 262144;
		}
		for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
			Static159.anIntArray569[local74 + 64] = local74 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static159.anIntArray569[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
			Static159.anIntArray569[local110 + 192] = 16777215;
		}
		Static134.anIntArray480 = new int[256];
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			Static134.anIntArray480[local126] = local126 * 1024;
		}
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static134.anIntArray480[local141 + 64] = local141 * 4 + 65280;
		}
		for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
			Static134.anIntArray480[local158 + 128] = local158 * 262144 + 65535;
		}
		for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
			Static134.anIntArray480[local175 + 192] = 16777215;
		}
		Static1.anIntArray1 = new int[256];
		for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
			Static1.anIntArray1[local191] = local191 * 4;
		}
		for (@Pc(204) int local204 = 0; local204 < 64; local204++) {
			Static1.anIntArray1[local204 + 64] = local204 * 262144 + 255;
		}
		for (@Pc(223) int local223 = 0; local223 < 64; local223++) {
			Static1.anIntArray1[local223 + 128] = local223 * 1024 + 16711935;
		}
		for (@Pc(242) int local242 = 0; local242 < 64; local242++) {
			Static1.anIntArray1[local242 + 192] = 16777215;
		}
		Static94.anIntArray386 = new int[32768];
		Static27.anIntArray104 = new int[256];
		Static133.anIntArray476 = new int[32768];
		Static128.method2198(null);
		Static48.aBoolean67 = false;
		Static24.anInt729 = 0;
		Static39.aClass77_445 = Static39.aClass77_451;
		if (Static120.anInt1042 == 0) {
			Static92.aBoolean102 = true;
		} else {
			Static92.aBoolean102 = false;
		}
		Static39.aClass77_446 = Static39.aClass77_451;
		Static16.anIntArray72 = new int[32768];
		Static1.anIntArray3 = new int[32768];
		if (Static92.aBoolean102) {
			Static86.method1586();
		} else {
			Static163.method2749(aClass43_Sub1_20, Static91.aClass77_916, Static39.aClass77_451);
		}
		method2956(false);
		Static108.aBoolean112 = true;
		Static141.aClass2_Sub2_Sub3_Sub2_6.method389(0, 0);
		Static163.aClass2_Sub2_Sub3_Sub2_7.method389(382, 0);
		Static132.aClass2_Sub2_Sub3_Sub3_6.method1019(382 - Static132.aClass2_Sub2_Sub3_Sub3_6.anInt1451 / 2, 18);
		Static48.aClass2_Sub2_Sub3_Sub2_1 = new Class2_Sub2_Sub3_Sub2(128, 254);
		Static124.aClass2_Sub2_Sub3_Sub2_5 = new Class2_Sub2_Sub3_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method2958() {
		while (true) {
			if (Static74.aClass2_Sub18_Sub1_1.method2401(Static25.anInt731) >= 11) {
				@Pc(22) int local22 = Static74.aClass2_Sub18_Sub1_1.method2405(11);
				if (local22 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local22] == null) {
						local27 = true;
						Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local22] = new Class2_Sub2_Sub1_Sub6_Sub1();
						if (Static158.aClass2_Sub18Array1[local22] != null) {
							Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local22].method2894(Static158.aClass2_Sub18Array1[local22]);
						}
					}
					Static177.anIntArray632[Static124.anInt3042++] = local22;
					@Pc(65) Class2_Sub2_Sub1_Sub6_Sub1 local65 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local22];
					local65.anInt4401 = Static143.anInt3513;
					@Pc(73) int local73 = Static74.aClass2_Sub18_Sub1_1.method2405(5);
					@Pc(78) int local78 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
					if (local73 > 15) {
						local73 -= 32;
					}
					if (local78 == 1) {
						Static6.anIntArray25[Static174.anInt4449++] = local22;
					}
					@Pc(102) int local102 = Static106.anIntArray411[Static74.aClass2_Sub18_Sub1_1.method2405(3)];
					if (local27) {
						local65.anInt4387 = local65.anInt4415 = local102;
					}
					@Pc(115) int local115 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
					@Pc(120) int local120 = Static74.aClass2_Sub18_Sub1_1.method2405(5);
					if (local120 > 15) {
						local120 -= 32;
					}
					local65.method2913(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0] + local120, local115 == 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0] + local73);
					continue;
				}
			}
			Static74.aClass2_Sub18_Sub1_1.method2403();
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method2959() {
		aClass43_Sub1_20 = null;
		aClass82_63 = null;
		aClass77_1528 = null;
		aClass77_1526 = null;
		aClass43_Sub1_19 = null;
		aClass77_1527 = null;
		aClass77_1529 = null;
		aClass77_1530 = null;
	}
}
