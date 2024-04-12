import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!ud;")
	public static Class5 aClass5_23;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 142)
	public static void method1205() {
		Static62.method1098(false);
		@Pc(10) boolean local10 = true;
		Class2_Sub2_Sub11.anInt1080 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static97.aByteArrayArray12.length; local14++) {
			if (Static50.anIntArray299[local14] != -1 && Static97.aByteArrayArray12[local14] == null) {
				Static97.aByteArrayArray12[local14] = Static34.aClass5_Sub1_8.method68(0, Static50.anIntArray299[local14]);
				if (Static97.aByteArrayArray12[local14] == null) {
					local10 = false;
					Class2_Sub2_Sub11.anInt1080++;
				}
			}
			if (Static46.anIntArray256[local14] != -1 && Static23.aByteArrayArray6[local14] == null) {
				Static23.aByteArrayArray6[local14] = Static34.aClass5_Sub1_8.method82(0, Static46.anIntArray256[local14], Static78.anIntArrayArray20[local14]);
				if (Static23.aByteArrayArray6[local14] == null) {
					Class2_Sub2_Sub11.anInt1080++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Applet_Sub1.anInt375 = 1;
			return;
		}
		local10 = true;
		Class38.anInt1667 = 0;
		@Pc(127) int local127;
		@Pc(117) int local117;
		for (@Pc(98) int local98 = 0; local98 < Static97.aByteArrayArray12.length; local98++) {
			@Pc(104) byte[] local104 = Static23.aByteArrayArray6[local98];
			if (local104 != null) {
				local117 = (Static53.anIntArray311[local98] & 0xFF) * 64 - Static28.anInt725;
				local127 = (Static53.anIntArray311[local98] >> 8) * 64 - Static79.anInt2058;
				if (Class27.aBoolean87) {
					local117 = 10;
					local127 = 10;
				}
				local10 &= Static45.method1532(local104, local127, local117);
			}
		}
		if (!local10) {
			Applet_Sub1.anInt375 = 2;
			return;
		}
		if (Applet_Sub1.anInt375 != 0) {
			Static61.method1095(true, Class2_Sub2_Sub12.aClass40_655, Class60.aClass40_674);
		}
		Static44.method820();
		Static85.aClass55_1.method1414();
		System.gc();
		for (@Pc(176) int local176 = 0; local176 < 4; local176++) {
			Class18.aClass20Array3[local176].method534();
		}
		@Pc(199) int local199;
		for (local127 = 0; local127 < 4; local127++) {
			for (local117 = 0; local117 < 104; local117++) {
				for (local199 = 0; local199 < 104; local199++) {
					Class34.aByteArrayArrayArray7[local127][local117][local199] = 0;
				}
			}
		}
		Static33.method633();
		local117 = Static97.aByteArrayArray12.length;
		Static62.method1098(true);
		@Pc(250) int local250;
		@Pc(261) int local261;
		@Pc(375) int local375;
		@Pc(321) int local321;
		@Pc(364) int local364;
		if (!Class27.aBoolean87) {
			@Pc(265) byte[] local265;
			for (local199 = 0; local199 < local117; local199++) {
				local250 = (Static53.anIntArray311[local199] >> 8) * 64 - Static79.anInt2058;
				local261 = (Static53.anIntArray311[local199] & 0xFF) * 64 - Static28.anInt725;
				local265 = Static97.aByteArrayArray12[local199];
				if (local265 != null) {
					Static82.method1460(local261, (Static51.anInt2327 - 6) * 8, Class18.aClass20Array3, local265, local250, (Static45.anInt2262 - 6) * 8);
				}
			}
			for (local250 = 0; local250 < local117; local250++) {
				local261 = (Static53.anIntArray311[local250] >> 8) * 64 - Static79.anInt2058;
				@Pc(310) byte[] local310 = Static97.aByteArrayArray12[local250];
				local321 = (Static53.anIntArray311[local250] & 0xFF) * 64 - Static28.anInt725;
				if (local310 == null && Static45.anInt2262 < 800) {
					Static7.method196(64, 64, local321, local261);
				}
			}
			Static62.method1098(true);
			for (local261 = 0; local261 < local117; local261++) {
				local265 = Static23.aByteArrayArray6[local261];
				if (local265 != null) {
					local364 = (Static53.anIntArray311[local261] >> 8) * 64 - Static79.anInt2058;
					local375 = (Static53.anIntArray311[local261] & 0xFF) * 64 - Static28.anInt725;
					Static89.method1565(local375, local364, Static85.aClass55_1, local265, Class18.aClass20Array3);
				}
			}
		}
		@Pc(451) int local451;
		@Pc(429) int local429;
		if (Class27.aBoolean87) {
			@Pc(435) int local435;
			@Pc(445) int local445;
			@Pc(453) int local453;
			for (local199 = 0; local199 < 4; local199++) {
				for (local250 = 0; local250 < 13; local250++) {
					for (local261 = 0; local261 < 13; local261++) {
						local364 = Class5.anIntArrayArrayArray2[local199][local250][local261];
						@Pc(414) boolean local414 = false;
						if (local364 != -1) {
							local375 = local364 >> 24 & 0x3;
							local429 = local364 >> 14 & 0x3FF;
							local435 = local364 >> 3 & 0x7FF;
							local445 = (local429 / 8 << 8) + local435 / 8;
							local451 = local364 >> 1 & 0x3;
							for (local453 = 0; local453 < Static53.anIntArray311.length; local453++) {
								if (Static53.anIntArray311[local453] == local445 && Static97.aByteArrayArray12[local453] != null) {
									Static49.method921(Static97.aByteArrayArray12[local453], local261 * 8, (local429 & 0x7) * 8, local451, local250 * 8, local375, (local435 & 0x7) * 8, Class18.aClass20Array3, local199);
									local414 = true;
									break;
								}
							}
						}
						if (!local414) {
							Static31.method609(local250 * 8, local199, local261 * 8);
						}
					}
				}
			}
			for (local250 = 0; local250 < 13; local250++) {
				for (local261 = 0; local261 < 13; local261++) {
					local321 = Class5.anIntArrayArrayArray2[0][local250][local261];
					if (local321 == -1) {
						Static7.method196(8, 8, local261 * 8, local250 * 8);
					}
				}
			}
			Static62.method1098(true);
			for (local261 = 0; local261 < 4; local261++) {
				for (local321 = 0; local321 < 13; local321++) {
					for (local364 = 0; local364 < 13; local364++) {
						local375 = Class5.anIntArrayArrayArray2[local261][local321][local364];
						if (local375 != -1) {
							local451 = local375 >> 24 & 0x3;
							local429 = local375 >> 1 & 0x3;
							local435 = local375 >> 14 & 0x3FF;
							local445 = local375 >> 3 & 0x7FF;
							local453 = local445 / 8 + (local435 / 8 << 8);
							for (@Pc(635) int local635 = 0; local635 < Static53.anIntArray311.length; local635++) {
								if (Static53.anIntArray311[local635] == local453 && Static23.aByteArrayArray6[local635] != null) {
									Static20.method400(local429, local451, (local435 & 0x7) * 8, local321 * 8, Class18.aClass20Array3, local364 * 8, (local445 & 0x7) * 8, Static85.aClass55_1, local261, Static23.aByteArrayArray6[local635]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static62.method1098(true);
		Static44.method820();
		Static23.method503(Class18.aClass20Array3, Static85.aClass55_1);
		Static62.method1098(true);
		local199 = Class2_Sub6.anInt807;
		if (local199 > Static1.anInt8) {
			local199 = Static1.anInt8;
		}
		if (Static1.anInt8 - 1 > local199) {
		}
		if (Class1.aBoolean2) {
			Static85.aClass55_1.method1421(Class2_Sub6.anInt807);
		} else {
			Static85.aClass55_1.method1421(0);
		}
		for (local250 = 0; local250 < 104; local250++) {
			for (local261 = 0; local261 < 104; local261++) {
				Static75.method1356(local261, local250);
			}
		}
		Static12.method255();
		Class45_Sub1.aClass47_21.method1330();
		if (Static97.aCanvas_Sub1_1 != null) {
			Class47.aClass2_Sub3_Sub1_4.method1736(153);
			Class47.aClass2_Sub3_Sub1_4.method1725(1057001181);
		}
		if (!Class27.aBoolean87) {
			local261 = (Static51.anInt2327 - 6) / 8;
			local321 = (Static51.anInt2327 + 6) / 8;
			local364 = (Static45.anInt2262 - 6) / 8;
			local375 = (Static45.anInt2262 + 6) / 8;
			for (local451 = local261 - 1; local451 <= local321 + 1; local451++) {
				for (local429 = local364 - 1; local429 <= local375 + 1; local429++) {
					if (local261 > local451 || local451 > local321 || local429 < local364 || local375 < local429) {
						Static34.aClass5_Sub1_8.method63(Static72.method1334(new Class40[] { Class63.aClass40_723, Static48.method859(local451), Class57.aClass40_612, Static48.method859(local429) }));
						Static34.aClass5_Sub1_8.method63(Static72.method1334(new Class40[] { Canvas_Sub1.aClass40_356, Static48.method859(local451), Class57.aClass40_612, Static48.method859(local429) }));
					}
				}
			}
		}
		if (Class52.anInt1971 == -1) {
			Static7.method187(30);
		} else {
			Static7.method187(35);
		}
		Static29.method1678();
		Class47.aClass2_Sub3_Sub1_4.method1736(91);
		Static99.method1659();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 601)
	public static void method1206() {
		Class41.aClass40_519 = null;
		Class41.aClass40_516 = null;
		Class41.aClass40_513 = null;
		Class41.aClass40_515 = null;
		Class41.aClass40_512 = null;
		Class41.aClass40_517 = null;
		Class41.aBooleanArray27 = null;
		Class41.anIntArray408 = null;
		Class41.aClass40_521 = null;
		Class41.aClass30_1 = null;
		Class41.aClass40_511 = null;
		aClass5_23 = null;
		Class41.aClass40_518 = null;
		Class41.aClass40_520 = null;
		anIntArray407 = null;
		Class41.aClass40_514 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 630)
	public static void method1207(@OriginalArg(1) Graphics arg0) {
		Static7.aClass45_5.method1474(arg0, 553, 205);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII[B)V", line = 655)
	public static void method1208(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Class34.anInt1548 >= 0) {
			Static98.aClass12_1.method1241();
			Class15.anInt432 = 20;
			Class2_Sub2_Sub16.anInt2474 = 0;
			Static23.aByteArray9 = null;
			Class34.anInt1548 = -1;
		}
		if (arg2 == null) {
			return;
		}
		if (Class15.anInt432 > 0) {
			Static98.aClass12_1.method1251();
			Class15.anInt432 = 0;
		}
		Class34.anInt1548 = arg1;
		Static98.aClass12_1.method1250(arg0, arg2, arg1);
	}
}
