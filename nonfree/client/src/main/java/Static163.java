import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
	public static int anInt3822;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_1022 = Static184.method2923("New User");

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_1021 = aClass41_1022;

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	public static int anInt3819 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)I")
	public static int method2657(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
	public static void method2658() {
		Static119.method2005(false);
		@Pc(6) boolean local6 = true;
		Static173.anInt4078 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static150.aByteArrayArray9.length; local14++) {
			if (Static25.anIntArray493[local14] != -1 && Static150.aByteArrayArray9[local14] == null) {
				Static150.aByteArrayArray9[local14] = Static25.aClass15_Sub1_137.method387(0, Static25.anIntArray493[local14]);
				if (Static150.aByteArrayArray9[local14] == null) {
					local6 = false;
					Static173.anInt4078++;
				}
			}
			if (Static113.anIntArray299[local14] != -1 && Static41.aByteArrayArray5[local14] == null) {
				Static41.aByteArrayArray5[local14] = Static25.aClass15_Sub1_137.method397(Static16.anIntArrayArray4[local14], Static113.anIntArray299[local14], 0);
				if (Static41.aByteArrayArray5[local14] == null) {
					local6 = false;
					Static173.anInt4078++;
				}
			}
		}
		if (!local6) {
			Static179.anInt4149 = 1;
			return;
		}
		Static99.anInt2417 = 0;
		local6 = true;
		@Pc(111) int local111;
		@Pc(122) int local122;
		for (@Pc(93) int local93 = 0; local93 < Static150.aByteArrayArray9.length; local93++) {
			@Pc(99) byte[] local99 = Static41.aByteArrayArray5[local93];
			if (local99 != null) {
				local111 = (Static131.anIntArray320[local93] >> 8) * 64 - Static198.anInt4451;
				local122 = (Static131.anIntArray320[local93] & 0xFF) * 64 - Static168.anInt3899;
				if (Static122.aBoolean160) {
					local111 = 10;
					local122 = 10;
				}
				local6 &= Static166.method2400(local99, local122, local111);
			}
		}
		if (!local6) {
			Static179.anInt4149 = 2;
			return;
		}
		if (Static179.anInt4149 != 0) {
			Static31.method606(Static149.method2324(new Class41[] { Static215.aClass41_1270, Static197.aClass41_1172 }), true);
		}
		Static194.method3305();
		Static25.method3300();
		Static74.method1382();
		for (@Pc(177) int local177 = 0; local177 < 4; local177++) {
			Static149.aClass42Array1[local177].method1432();
		}
		@Pc(200) int local200;
		for (local111 = 0; local111 < 4; local111++) {
			for (local122 = 0; local122 < 104; local122++) {
				for (local200 = 0; local200 < 104; local200++) {
					Static102.aByteArrayArrayArray7[local111][local122][local200] = 0;
				}
			}
		}
		Static40.method861();
		Static194.method3305();
		System.gc();
		Static194.method3305();
		Static119.method2005(true);
		Static184.method2925();
		if (!Static122.aBoolean160) {
			Static128.method2079();
			Static119.method2005(true);
			Static168.method2711();
		}
		if (Static122.aBoolean160) {
			Static34.method676();
			Static119.method2005(true);
			Static74.method1379();
		}
		Static25.method3300();
		Static119.method2005(true);
		Static194.method3305();
		Static68.method1242(Static149.aClass42Array1);
		Static119.method2005(true);
		Static194.method3305();
		local122 = Static26.anInt660;
		if (Static134.anInt3147 < local122) {
			local122 = Static134.anInt3147;
		}
		if (local122 < Static134.anInt3147 - 1) {
		}
		if (Static217.aBoolean290) {
			Static40.method855(Static26.anInt660);
		} else {
			Static40.method855(0);
		}
		Static6.method240();
		@Pc(317) int local317;
		for (local200 = 0; local200 < 104; local200++) {
			for (local317 = 0; local317 < 104; local317++) {
				Static27.method1632(local200, local317);
			}
		}
		Static194.method3305();
		Static186.method2947();
		Static25.method3300();
		if (Static177.aFrame1 != null) {
			Static131.aClass2_Sub3_Sub1_2.method221(198);
			Static131.aClass2_Sub3_Sub1_2.method200(1057001181);
		}
		if (!Static122.aBoolean160) {
			local317 = (Static125.anInt1525 - 6) / 8;
			@Pc(369) int local369 = (Static96.anInt2367 - 6) / 8;
			@Pc(375) int local375 = (Static125.anInt1525 + 6) / 8;
			@Pc(381) int local381 = (Static96.anInt2367 + 6) / 8;
			for (@Pc(385) int local385 = local317 - 1; local385 <= local375 + 1; local385++) {
				for (@Pc(391) int local391 = local369 - 1; local391 <= local381 + 1; local391++) {
					if (local317 > local385 || local375 < local385 || local391 < local369 || local391 > local381) {
						Static25.aClass15_Sub1_137.method419(Static149.method2324(new Class41[] { Static188.aClass41_1144, Static152.method2471(local385), Static46.aClass41_1094, Static152.method2471(local391) }));
						Static25.aClass15_Sub1_137.method419(Static149.method2324(new Class41[] { Static93.aClass41_674, Static152.method2471(local385), Static46.aClass41_1094, Static152.method2471(local391) }));
					}
				}
			}
		}
		Static116.method1955(30);
		Static194.method3305();
		Static131.aClass2_Sub3_Sub1_2.method221(213);
		Static94.method1639();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!nb;Ljava/awt/Component;ZLclient!nb;)V")
	public static void method2659(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class15 arg2) {
		if (Static79.aBoolean107) {
			return;
		}
		Static64.method1167();
		@Pc(15) byte[] local15 = arg0.method387(0, Static96.anInt2364);
		Static77.aClass2_Sub2_Sub16_Sub1_2 = new Class2_Sub2_Sub16_Sub1(local15, arg1);
		Static92.aClass2_Sub2_Sub16_Sub1_4 = Static77.aClass2_Sub2_Sub16_Sub1_2.method2409();
		Static184.aClass60_3 = Static108.method1829(Static136.anInt3160, arg2);
		Static215.aClass60_4 = Static108.method1829(Static91.anInt2268, arg2);
		Static114.aClass60_2 = Static108.method1829(Static142.anInt3255, arg2);
		Static204.aClass60_Sub1Array1 = Static108.method1833(arg2, Static217.anInt4760);
		Static102.aClass60Array27 = Static88.method1555(arg2, Static135.anInt3150);
		Static3.anIntArray4 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static3.anIntArray4[local54] = local54 * 262144;
		}
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static3.anIntArray4[local68 + 64] = local68 * 1024 + 16711680;
		}
		for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
			Static3.anIntArray4[local88 + 128] = local88 * 4 + 16776960;
		}
		for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
			Static3.anIntArray4[local106 + 192] = 16777215;
		}
		Static14.anIntArray24 = new int[256];
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			Static14.anIntArray24[local125] = local125 * 1024;
		}
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static14.anIntArray24[local141 + 64] = local141 * 4 + 65280;
		}
		for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
			Static14.anIntArray24[local161 + 128] = local161 * 262144 + 65535;
		}
		for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
			Static14.anIntArray24[local180 + 192] = 16777215;
		}
		Static141.anIntArray338 = new int[256];
		for (@Pc(197) int local197 = 0; local197 < 64; local197++) {
			Static141.anIntArray338[local197] = local197 * 4;
		}
		for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
			Static141.anIntArray338[local211 + 64] = local211 * 262144 + 255;
		}
		for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
			Static141.anIntArray338[local231 + 128] = local231 * 1024 + 16711935;
		}
		for (@Pc(249) int local249 = 0; local249 < 64; local249++) {
			Static141.anIntArray338[local249 + 192] = 16777215;
		}
		Static142.anIntArray339 = new int[256];
		Static196.anIntArray461 = new int[32768];
		Static99.anIntArray242 = new int[32768];
		Static45.method931(null);
		Static126.anIntArray315 = new int[32768];
		Static185.aClass41_1118 = Static185.aClass41_1119;
		Static58.anInt1632 = 0;
		Static185.aBoolean264 = false;
		if (Static58.anInt1633 == 0) {
			Static116.aBoolean150 = true;
		} else {
			Static116.aBoolean150 = false;
		}
		Static185.aClass41_1117 = Static185.aClass41_1119;
		Static168.anIntArray407 = new int[32768];
		if (Static116.aBoolean150) {
			Static103.method1771();
		} else {
			Static93.method1624(255, Static75.anInt3787, Static86.aClass15_Sub1_57);
		}
		Static132.method2100(false);
		Static79.aBoolean107 = true;
		Static196.method3069();
		Static32.aClass2_Sub2_Sub16_Sub1_1 = new Class2_Sub2_Sub16_Sub1(128, 254);
		Static78.aClass2_Sub2_Sub16_Sub1_3 = new Class2_Sub2_Sub16_Sub1(128, 254);
	}
}
