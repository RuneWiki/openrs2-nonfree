import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!nb;")
	public static Class57 aClass57_13 = new Class57(64);

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!kb;")
	private static Class46 aClass46_551 = Static65.method1172("::fpsoff");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	public static int anInt1647 = 0;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_552 = Static65.method1172(" weitere Optionen");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1128() {
		aClass57_13 = null;
		aClass46_552 = null;
		aClass46_551 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII[I)I")
	public static int method1129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		return arg0 * arg2[1] + arg1 * arg2[0];
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method1130() {
		@Pc(7) boolean local7 = true;
		Static123.method2110(false);
		Static92.anInt2257 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static140.aByteArrayArray3.length; local14++) {
			if (Static52.anIntArray129[local14] != -1 && Static140.aByteArrayArray3[local14] == null) {
				Static140.aByteArrayArray3[local14] = Static51.aClass44_Sub1_3.method1624(Static52.anIntArray129[local14], 0);
				if (Static140.aByteArrayArray3[local14] == null) {
					Static92.anInt2257++;
					local7 = false;
				}
			}
			if (Static66.anIntArray166[local14] != -1 && Static116.aByteArrayArray11[local14] == null) {
				Static116.aByteArrayArray11[local14] = Static51.aClass44_Sub1_3.method1614(Static66.anIntArray166[local14], Static149.anIntArrayArray37[local14], 0);
				if (Static116.aByteArrayArray11[local14] == null) {
					Static92.anInt2257++;
					local7 = false;
				}
			}
		}
		if (!local7) {
			Static125.anInt3006 = 1;
			return;
		}
		local7 = true;
		Static74.anInt1886 = 0;
		@Pc(112) int local112;
		@Pc(123) int local123;
		for (@Pc(94) int local94 = 0; local94 < Static140.aByteArrayArray3.length; local94++) {
			@Pc(100) byte[] local100 = Static116.aByteArrayArray11[local94];
			if (local100 != null) {
				local112 = (Static181.anIntArray444[local94] >> 8) * 64 - Static42.anInt1173;
				local123 = (Static181.anIntArray444[local94] & 0xFF) * 64 - Static58.anInt1578;
				if (Static174.aBoolean166) {
					local112 = 10;
					local123 = 10;
				}
				local7 &= Static105.method1723(local123, local112, local100);
			}
		}
		if (!local7) {
			Static125.anInt3006 = 2;
			return;
		}
		if (Static125.anInt3006 != 0) {
			Static139.method2339(Static178.method2860(new Class46[] { Static31.aClass46_232, Static111.aClass46_888 }), true);
		}
		Static177.method2831();
		Static165.method2648();
		Static177.method2831();
		Static154.aClass62_1.method1972();
		Static177.method2831();
		System.gc();
		for (@Pc(177) int local177 = 0; local177 < 4; local177++) {
			Static128.aClass69Array1[local177].method2258();
		}
		@Pc(198) int local198;
		for (local112 = 0; local112 < 4; local112++) {
			for (local123 = 0; local123 < 104; local123++) {
				for (local198 = 0; local198 < 104; local198++) {
					Static119.aByteArrayArrayArray5[local112][local123][local198] = 0;
				}
			}
		}
		Static177.method2831();
		Static160.method2576();
		local123 = Static140.aByteArrayArray3.length;
		Static53.method1008();
		Static123.method2110(true);
		@Pc(253) int local253;
		@Pc(264) int local264;
		@Pc(380) int local380;
		@Pc(307) int local307;
		@Pc(369) int local369;
		if (!Static174.aBoolean166) {
			@Pc(268) byte[] local268;
			for (local198 = 0; local198 < local123; local198++) {
				local253 = (Static181.anIntArray444[local198] >> 8) * 64 - Static42.anInt1173;
				local264 = (Static181.anIntArray444[local198] & 0xFF) * 64 - Static58.anInt1578;
				local268 = Static140.aByteArrayArray3[local198];
				if (local268 != null) {
					Static177.method2831();
					Static74.method1242(Static86.anInt2117 * 8 - 48, local264, Static128.aClass69Array1, local253, Static116.anInt2752 * 8 - 48, local268);
				}
			}
			for (local253 = 0; local253 < local123; local253++) {
				local307 = (Static181.anIntArray444[local253] & 0xFF) * 64 - Static58.anInt1578;
				local264 = (Static181.anIntArray444[local253] >> 8) * 64 - Static42.anInt1173;
				@Pc(322) byte[] local322 = Static140.aByteArrayArray3[local253];
				if (local322 == null && Static86.anInt2117 < 800) {
					Static177.method2831();
					Static112.method1846(local307, 64, 64, local264);
				}
			}
			Static123.method2110(true);
			for (local264 = 0; local264 < local123; local264++) {
				local268 = Static116.aByteArrayArray11[local264];
				if (local268 != null) {
					local369 = (Static181.anIntArray444[local264] >> 8) * 64 - Static42.anInt1173;
					local380 = (Static181.anIntArray444[local264] & 0xFF) * 64 - Static58.anInt1578;
					Static177.method2831();
					Static150.method2478(Static128.aClass69Array1, local369, local380, Static154.aClass62_1, local268);
				}
			}
		}
		@Pc(433) int local433;
		@Pc(439) int local439;
		if (Static174.aBoolean166) {
			@Pc(451) int local451;
			@Pc(462) int local462;
			@Pc(464) int local464;
			for (local198 = 0; local198 < 4; local198++) {
				Static177.method2831();
				for (local253 = 0; local253 < 13; local253++) {
					for (local264 = 0; local264 < 13; local264++) {
						local369 = Static49.anIntArrayArrayArray1[local198][local253][local264];
						@Pc(423) boolean local423 = false;
						if (local369 != -1) {
							local433 = local369 >> 1 & 0x3;
							local439 = local369 >> 14 & 0x3FF;
							local380 = local369 >> 24 & 0x3;
							local451 = local369 >> 3 & 0x7FF;
							local462 = (local439 / 8 << 8) + (local451 / 8);
							for (local464 = 0; local464 < Static181.anIntArray444.length; local464++) {
								if (Static181.anIntArray444[local464] == local462 && Static140.aByteArrayArray3[local464] != null) {
									local423 = true;
									Static142.method2374((local439 & 0x7) * 8, local198, local433, local253 * 8, (local451 & 0x7) * 8, Static140.aByteArrayArray3[local464], Static128.aClass69Array1, local380, local264 * 8);
									break;
								}
							}
						}
						if (!local423) {
							Static70.method1204(local253 * 8, local198, local264 * 8);
						}
					}
				}
			}
			for (local253 = 0; local253 < 13; local253++) {
				for (local264 = 0; local264 < 13; local264++) {
					local307 = Static49.anIntArrayArrayArray1[0][local253][local264];
					if (local307 == -1) {
						Static112.method1846(local264 * 8, 8, 8, local253 * 8);
					}
				}
			}
			Static123.method2110(true);
			for (local264 = 0; local264 < 4; local264++) {
				Static177.method2831();
				for (local307 = 0; local307 < 13; local307++) {
					for (local369 = 0; local369 < 13; local369++) {
						local380 = Static49.anIntArrayArrayArray1[local264][local307][local369];
						if (local380 != -1) {
							local439 = local380 >> 1 & 0x3;
							local433 = local380 >> 24 & 0x3;
							local462 = local380 >> 3 & 0x7FF;
							local451 = local380 >> 14 & 0x3FF;
							local464 = local462 / 8 + (local451 / 8 << 8);
							for (@Pc(639) int local639 = 0; local639 < Static181.anIntArray444.length; local639++) {
								if (local464 == Static181.anIntArray444[local639] && Static116.aByteArrayArray11[local639] != null) {
									Static98.method1601(local307 * 8, local369 * 8, Static154.aClass62_1, local433, local439, local264, Static128.aClass69Array1, (local451 & 0x7) * 8, Static116.aByteArrayArray11[local639], (local462 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static123.method2110(true);
		Static165.method2648();
		Static177.method2831();
		Static87.method1452(Static128.aClass69Array1, Static154.aClass62_1);
		Static123.method2110(true);
		local198 = Static148.anInt3558;
		if (Static99.anInt2422 < local198) {
			local198 = Static99.anInt2422;
		}
		if (local198 < Static99.anInt2422 - 1) {
		}
		if (Static71.aBoolean76) {
			Static154.aClass62_1.method1982(Static148.anInt3558);
		} else {
			Static154.aClass62_1.method1982(0);
		}
		for (local253 = 0; local253 < 104; local253++) {
			for (local264 = 0; local264 < 104; local264++) {
				Static129.method2168(local264, local253);
			}
		}
		Static177.method2831();
		method1132();
		Static165.method2648();
		if (Static58.aFrame1 != null) {
			Static133.aClass3_Sub4_Sub1_3.method233(53);
			Static133.aClass3_Sub4_Sub1_3.method188(1057001181);
		}
		if (!Static174.aBoolean166) {
			local307 = (Static116.anInt2752 + 6) / 8;
			local380 = (Static86.anInt2117 + 6) / 8;
			local264 = (Static116.anInt2752 - 6) / 8;
			local369 = (Static86.anInt2117 - 6) / 8;
			for (local433 = local264 - 1; local433 <= local307 + 1; local433++) {
				for (local439 = local369 - 1; local439 <= local380 + 1; local439++) {
					if (local433 < local264 || local307 < local433 || local439 < local369 || local380 < local439) {
						Static51.aClass44_Sub1_3.method1632(Static178.method2860(new Class46[] { Static33.aClass46_251, Static57.method1068(local433), Static96.aClass46_787, Static57.method1068(local439) }));
						Static51.aClass44_Sub1_3.method1632(Static178.method2860(new Class46[] { Static2.aClass46_3, Static57.method1068(local433), Static96.aClass46_787, Static57.method1068(local439) }));
					}
				}
			}
		}
		Static180.method2893(30);
		Static177.method2831();
		Static116.method1957();
		Static133.aClass3_Sub4_Sub1_3.method233(137);
		Static135.method2311();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1131(@OriginalArg(1) Class46 arg0) {
		if (Static38.anInt1076 >= 2) {
			if (arg0.method1389(Static140.aClass46_64)) {
				System.gc();
			}
			if (arg0.method1389(Static1.aClass46_1)) {
				Static119.method2035();
			}
			if (arg0.method1389(Static100.aClass46_804)) {
				Static165.aBoolean157 = true;
			}
			if (arg0.method1389(aClass46_551)) {
				Static165.aBoolean157 = false;
			}
			if (arg0.method1389(Static161.aClass46_1296)) {
				for (@Pc(50) int local50 = 0; local50 < 4; local50++) {
					for (@Pc(54) int local54 = 1; local54 < 103; local54++) {
						for (@Pc(58) int local58 = 1; local58 < 103; local58++) {
							Static128.aClass69Array1[local50].anIntArrayArray35[local54][local58] = 0;
						}
					}
				}
			}
			if (arg0.method1367(Static88.aClass46_737) && Static114.anInt2715 != 0) {
				Static86.method1432(arg0.method1380(6).method1386());
			}
			if (arg0.method1389(Static39.aClass46_1449) && Static114.anInt2715 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1367(Static78.aClass46_794)) {
				Static127.anInt3012 = arg0.method1380(12).method1379().method1386();
				Static168.method2686(0, null, Static178.method2860(new Class46[] { Static43.aClass46_379, Static57.method1068(Static127.anInt3012) }));
			}
			if (arg0.method1389(Static62.aClass46_558)) {
				Static118.aBoolean118 = true;
			}
		}
		Static133.aClass3_Sub4_Sub1_3.method233(130);
		Static133.aClass3_Sub4_Sub1_3.method206(arg0.method1376() - 1);
		Static133.aClass3_Sub4_Sub1_3.method189(arg0.method1380(2));
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	private static void method1132() {
		for (@Pc(14) Class3_Sub24 local14 = (Class3_Sub24) Static1.aClass59_1.method1731(); local14 != null; local14 = (Class3_Sub24) Static1.aClass59_1.method1734()) {
			if (local14.anInt3524 == -1) {
				local14.anInt3521 = 0;
				Static12.method2888(local14);
			} else {
				local14.method2900();
			}
		}
	}
}
