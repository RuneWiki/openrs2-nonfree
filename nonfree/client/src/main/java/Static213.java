import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
	public static int anInt4561 = 0;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(II)V")
	public static void method3543() {
		Static217.aClass53_30.method1496(5);
		Static55.aClass53_10.method1496(5);
		Static217.aClass53_29.method1496(5);
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(II)V")
	public static void method3546() {
		Static24.aClass53_5.method1496(50);
		Static37.aClass53_8.method1496(50);
		Static58.aClass53_11.method1496(50);
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)V")
	public static void method3548() {
		if (Static222.aClass51_1586 == null) {
			return;
		}
		if (Static129.anInt2903 < 10) {
			if (!Static211.aClass70_Sub1_65.method3520(Static222.aClass51_1586)) {
				Static129.anInt2903 = Static211.aClass70_Sub1_65.method3510(Static222.aClass51_1586) / 10;
				return;
			}
			Static58.method1032();
			Static129.anInt2903 = 10;
		}
		if (Static129.anInt2903 == 10) {
			@Pc(44) Class1_Sub16 local44 = new Class1_Sub16(Static211.aClass70_Sub1_65.method3525(Static41.aClass51_280, Static222.aClass51_1586));
			@Pc(48) int local48 = local44.method3805();
			@Pc(54) int local54 = local44.method3805();
			@Pc(58) int local58 = local44.method3805();
			@Pc(62) int local62 = local44.method3805();
			@Pc(66) int local66 = local44.method3805();
			@Pc(70) int local70 = local44.method3805();
			Static108.anInt2405 = local54 * 64;
			Static87.anInt2017 = (local62 - local54) * 64 + 64;
			Static10.aDouble1 = 8.0D;
			Static227.aDouble11 = 8.0D;
			Static3.anInt75 = (local58 - local48) * 64 + 64;
			Static200.anInt4248 = local48 * 64;
			@Pc(109) int local109 = (Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7) + Static198.anInt4217 - Static200.anInt4248;
			@Pc(120) int local120 = Static118.anInt2541 + (Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7) - Static108.anInt2405;
			@Pc(129) int local129 = local120 + (int) (Math.random() * 10.0D) - 5;
			@Pc(138) int local138 = local109 + (int) (Math.random() * 10.0D) - 5;
			if (local138 >= 0 && local138 < Static3.anInt75 && local129 >= 0 && local129 < Static87.anInt2017) {
				Static87.anInt2015 = local138;
				Static150.anInt3286 = Static87.anInt2017 - local129;
			} else {
				Static150.anInt3286 = Static87.anInt2017 + Static108.anInt2405 - local70 * 64;
				Static87.anInt2015 = local66 * 64 - Static200.anInt4248;
			}
			Static220.method3635();
			@Pc(182) int local182 = Static104.anInt2296 >> 2 << 10;
			@Pc(186) int local186 = Static150.anInt3259 >> 1;
			@Pc(190) int local190 = Static87.anInt2017 >> 6;
			@Pc(194) int local194 = Static3.anInt75 >> 6;
			Static198.anIntArrayArrayArray10 = new int[local194][local190][];
			Static82.anIntArray115 = new int[Static161.anInt3483 + 1];
			Static201.aByteArrayArrayArray12 = new byte[local194][local190][];
			Static71.aByteArrayArrayArray6 = new byte[local194][local190][];
			Static82.anIntArrayArrayArray3 = new int[local194][local190][];
			Static72.aByteArrayArrayArray7 = new byte[local194][local190][];
			Static7.aByteArrayArrayArray1 = new byte[local194][local190][];
			Static50.aByteArrayArrayArray5 = new byte[local194][local190][];
			Static203.aByteArrayArrayArray11 = new byte[local194][local190][];
			for (@Pc(233) int local233 = 0; local233 < Static161.anInt3483; local233++) {
				@Pc(241) Class25 local241 = Static78.method1354(local233);
				if (local241 != null) {
					@Pc(246) int local246 = local241.anInt698;
					if (local246 >= 0 && !Static171.anInterface3_2.method123(local246)) {
						local246 = -1;
					}
					@Pc(304) int local304;
					@Pc(266) int local266;
					@Pc(272) int local272;
					@Pc(297) int local297;
					if (local241.anInt695 >= 0) {
						local266 = local241.anInt695;
						local272 = local186 + (local266 & 0x7F);
						if (local272 < 0) {
							local272 = 0;
						} else if (local272 > 127) {
							local272 = 127;
						}
						local297 = (local266 & 0x380) + ((local266 + local182 & 0xFC00) + local272);
						local304 = Static171.anIntArray279[Static30.method1681(local297, 96)];
					} else if (local246 >= 0) {
						local304 = Static171.anIntArray279[Static30.method1681(Static171.anInterface3_2.method128(local246), 96)];
					} else if (local241.anInt701 == -1) {
						local304 = -1;
					} else {
						local266 = local241.anInt701;
						local272 = local186 + (local266 & 0x7F);
						if (local272 < 0) {
							local272 = 0;
						} else if (local272 > 127) {
							local272 = 127;
						}
						local297 = local272 + (local182 + local266 & 0xFC00) + (local266 & 0x380);
						local304 = Static171.anIntArray279[Static30.method1681(local297, 96)];
					}
					Static82.anIntArray115[local233 + 1] = local304;
				}
			}
			Static129.anInt2903 = 20;
		} else if (Static129.anInt2903 == 20) {
			Static169.method2901(Static211.aClass70_Sub1_65.method3525(Static144.aClass51_1112, Static222.aClass51_1586));
			Static129.anInt2903 = 30;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 30) {
			Static145.method2493(Static211.aClass70_Sub1_65.method3525(Static59.aClass51_420, Static222.aClass51_1586));
			Static129.anInt2903 = 40;
			Static160.method2700();
		} else if (Static129.anInt2903 == 40) {
			Static107.method1835(Static211.aClass70_Sub1_65.method3525(Static192.aClass51_1430, Static222.aClass51_1586));
			Static129.anInt2903 = 50;
			Static160.method2700();
		} else if (Static129.anInt2903 == 50) {
			Static120.method2106(Static211.aClass70_Sub1_65.method3525(Static69.aClass51_519, Static222.aClass51_1586));
			Static129.anInt2903 = 60;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 60) {
			Static76.method1312(Static211.aClass70_Sub1_65.method3525(Static58.aClass51_414, Static222.aClass51_1586));
			Static129.anInt2903 = 70;
			Static160.method2700();
		} else if (Static129.anInt2903 == 70) {
			Static201.aClass67_9 = new Class67(11, true, Static36.aCanvas1);
			Static129.anInt2903 = 73;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 73) {
			Static5.aClass67_6 = new Class67(12, true, Static36.aCanvas1);
			Static129.anInt2903 = 76;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 76) {
			Static200.aClass67_8 = new Class67(14, true, Static36.aCanvas1);
			Static129.anInt2903 = 79;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 79) {
			Static50.aClass67_2 = new Class67(17, true, Static36.aCanvas1);
			Static129.anInt2903 = 82;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 82) {
			Static206.aClass67_10 = new Class67(19, true, Static36.aCanvas1);
			Static129.anInt2903 = 85;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 85) {
			Static164.aClass67_7 = new Class67(22, true, Static36.aCanvas1);
			Static129.anInt2903 = 88;
			Static228.method3749(true);
			Static160.method2700();
		} else if (Static129.anInt2903 == 88) {
			Static142.aClass67_5 = new Class67(26, true, Static36.aCanvas1);
			Static129.anInt2903 = 91;
			Static228.method3749(true);
			Static160.method2700();
		} else {
			Static62.aClass67_3 = new Class67(30, true, Static36.aCanvas1);
			Static129.anInt2903 = 100;
			Static228.method3749(true);
			Static160.method2700();
			Static41.anInt977 = -1;
			Static155.anInt3422 = -1;
			System.gc();
		}
	}
}
