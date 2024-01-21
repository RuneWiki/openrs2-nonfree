import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[[Lclient!ke;")
	public static Class5_Sub11[][] aClass5_Sub11ArrayArray1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_442 = Static129.method2060("<)4col>");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
	public static int[] anIntArray209 = new int[100];

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt1405 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1003() {
		aClass5_Sub11ArrayArray1 = null;
		aClass61_442 = null;
		anIntArray209 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
	public static void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static44.anInt1129 = 0;
		@Pc(162) int local162;
		for (@Pc(5) int local5 = -1; local5 < Static92.anInt2219 + Static100.anInt2607; local5++) {
			@Pc(19) Class5_Sub2_Sub2_Sub3 local19;
			if (local5 == -1) {
				local19 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10;
			} else if (local5 < Static92.anInt2219) {
				local19 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local5]];
			} else {
				local19 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local5 - Static92.anInt2219]];
			}
			if (local19 != null && local19.method1855()) {
				@Pc(49) Class5_Sub2_Sub12 local49;
				if (local19 instanceof Class5_Sub2_Sub2_Sub3_Sub1) {
					local49 = ((Class5_Sub2_Sub2_Sub3_Sub1) local19).aClass5_Sub2_Sub12_1;
					if (local49.anIntArray318 != null) {
						local49 = local49.method1632();
					}
					if (local49 == null) {
						continue;
					}
				}
				if (local5 >= Static92.anInt2219) {
					local49 = ((Class5_Sub2_Sub2_Sub3_Sub1) local19).aClass5_Sub2_Sub12_1;
					if (local49.anIntArray318 != null) {
						local49 = local49.method1632();
					}
					if (local49.anInt2500 >= 0 && Static60.aClass5_Sub2_Sub1_Sub4Array4.length > local49.anInt2500) {
						Static97.method1657(local19, local19.anInt2910 + 15);
						if (Static124.anInt3091 > -1) {
							Static60.aClass5_Sub2_Sub1_Sub4Array4[local49.anInt2500].method2021(arg1 + Static124.anInt3091 - 12, Static42.anInt1103 + -30 + arg0);
						}
					}
					if (Static97.anInt2547 == 1 && Static12.anInt302 == Static61.anIntArray225[local5 - Static92.anInt2219] && Static58.anInt1422 % 20 < 10) {
						Static97.method1657(local19, local19.anInt2910 + 15);
						if (Static124.anInt3091 > -1) {
							Static100.aClass5_Sub2_Sub1_Sub4Array7[0].method2021(Static124.anInt3091 + arg1 - 12, arg0 - -Static42.anInt1103 - 28);
						}
					}
				} else {
					@Pc(160) Class5_Sub2_Sub2_Sub3_Sub2 local160 = (Class5_Sub2_Sub2_Sub3_Sub2) local19;
					local162 = 30;
					if (local160.anInt2947 != -1 || local160.anInt2949 != -1) {
						Static97.method1657(local19, local19.anInt2910 + 15);
						if (Static124.anInt3091 > -1) {
							if (local160.anInt2947 != -1) {
								Static9.aClass5_Sub2_Sub1_Sub4Array1[local160.anInt2947].method2021(Static124.anInt3091 + arg1 - 12, arg0 - (-Static42.anInt1103 - -30));
								local162 += 25;
							}
							if (local160.anInt2949 != -1) {
								Static60.aClass5_Sub2_Sub1_Sub4Array4[local160.anInt2949].method2021(arg1 + Static124.anInt3091 - 12, -local162 + arg0 + Static42.anInt1103);
								local162 += 25;
							}
						}
					}
					if (local5 >= 0 && Static97.anInt2547 == 10 && Static22.anInt697 == Static66.anIntArray236[local5]) {
						Static97.method1657(local19, local19.anInt2910 + 15);
						if (Static124.anInt3091 > -1) {
							Static100.aClass5_Sub2_Sub1_Sub4Array7[1].method2021(arg1 + Static124.anInt3091 - 12, -local162 + arg0 - -Static42.anInt1103);
						}
					}
				}
				if (local19.aClass61_869 != null && (Static92.anInt2219 <= local5 || Static124.anInt3090 == 0 || Static124.anInt3090 == 3 || Static124.anInt3090 == 1 && Static67.method1118(((Class5_Sub2_Sub2_Sub3_Sub2) local19).aClass61_877))) {
					Static97.method1657(local19, local19.anInt2910);
					if (Static124.anInt3091 > -1 && Static44.anInt1129 < Static117.anInt3012) {
						Static117.anIntArray359[Static44.anInt1129] = Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method544(local19.aClass61_869) / 2;
						Static117.anIntArray360[Static44.anInt1129] = Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.anInt773;
						Static117.anIntArray354[Static44.anInt1129] = Static124.anInt3091;
						Static117.anIntArray358[Static44.anInt1129] = Static42.anInt1103;
						Static117.anIntArray356[Static44.anInt1129] = local19.anInt2898;
						Static117.anIntArray355[Static44.anInt1129] = local19.anInt2922;
						Static117.anIntArray357[Static44.anInt1129] = local19.anInt2924;
						Static117.aClass61Array21[Static44.anInt1129] = local19.aClass61_869;
						Static44.anInt1129++;
					}
				}
				if (Static58.anInt1422 < local19.anInt2927) {
					Static97.method1657(local19, local19.anInt2910 + 15);
					if (Static124.anInt3091 > -1) {
						local162 = local19.anInt2901 * 30 / local19.anInt2886;
						if (local162 > 30) {
							local162 = 30;
						}
						Static46.method2001(arg1 + Static124.anInt3091 - 15, arg0 - (-Static42.anInt1103 + 3), local162, 5, 65280);
						Static46.method2001(arg1 + Static124.anInt3091 + local162 - 15, arg0 - -Static42.anInt1103 + -3, 30 - local162, 5, 16711680);
					}
				}
				for (local162 = 0; local162 < 4; local162++) {
					if (Static58.anInt1422 < local19.anIntArray347[local162]) {
						Static97.method1657(local19, local19.anInt2910 / 2);
						if (Static124.anInt3091 > -1) {
							if (local162 == 1) {
								Static42.anInt1103 -= 20;
							}
							if (local162 == 2) {
								Static124.anInt3091 -= 15;
								Static42.anInt1103 -= 10;
							}
							if (local162 == 3) {
								Static124.anInt3091 += 15;
								Static42.anInt1103 -= 10;
							}
							Static113.aClass5_Sub2_Sub1_Sub4Array8[local19.anIntArray348[local162]].method2021(arg1 + Static124.anInt3091 - 12, Static42.anInt1103 + -12 + arg0);
							Static63.aClass5_Sub2_Sub1_Sub1_Sub1_3.method555(Static39.method730(local19.anIntArray349[local162]), arg1 + Static124.anInt3091 - 1, arg0 - (-Static42.anInt1103 - 3), 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(538) int local538 = 0; local538 < Static44.anInt1129; local538++) {
			@Pc(544) int local544 = Static117.anIntArray359[local538];
			@Pc(548) int local548 = Static117.anIntArray360[local538];
			@Pc(552) int local552 = Static117.anIntArray358[local538];
			@Pc(554) boolean local554 = true;
			local162 = Static117.anIntArray354[local538];
			while (local554) {
				local554 = false;
				for (@Pc(564) int local564 = 0; local564 < local538; local564++) {
					if (Static117.anIntArray358[local564] - Static117.anIntArray360[local564] < local552 - -2 && Static117.anIntArray358[local564] + 2 > local552 - local548 && Static117.anIntArray359[local564] + Static117.anIntArray354[local564] > -local544 + local162 && Static117.anIntArray354[local564] - Static117.anIntArray359[local564] < local544 + local162 && local552 > Static117.anIntArray358[local564] - Static117.anIntArray360[local564]) {
						local552 = Static117.anIntArray358[local564] - Static117.anIntArray360[local564];
						local554 = true;
					}
				}
			}
			Static124.anInt3091 = Static117.anIntArray354[local538];
			Static42.anInt1103 = Static117.anIntArray358[local538] = local552;
			@Pc(667) Class61 local667 = Static117.aClass61Array21[local538];
			if (Static31.anInt942 == 0) {
				@Pc(674) int local674 = 16776960;
				if (Static117.anIntArray356[local538] < 6) {
					local674 = Static29.anIntArray149[Static117.anIntArray356[local538]];
				}
				if (Static117.anIntArray356[local538] == 6) {
					local674 = Static134.anInt3404 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static117.anIntArray356[local538] == 7) {
					local674 = Static134.anInt3404 % 20 >= 10 ? 65535 : 255;
				}
				if (Static117.anIntArray356[local538] == 8) {
					local674 = Static134.anInt3404 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(749) int local749;
				if (Static117.anIntArray356[local538] == 9) {
					local749 = 150 - Static117.anIntArray357[local538];
					if (local749 < 50) {
						local674 = local749 * 1280 + 16711680;
					} else if (local749 < 100) {
						local674 = 16776960 - (local749 - 50) * 327680;
					} else if (local749 < 150) {
						local674 = (local749 - 100) * 5 + 65280;
					}
				}
				if (Static117.anIntArray356[local538] == 10) {
					local749 = 150 - Static117.anIntArray357[local538];
					if (local749 < 50) {
						local674 = local749 * 5 + 16711680;
					} else if (local749 < 100) {
						local674 = 16711935 - (local749 - 50) * 327680;
					} else if (local749 < 150) {
						local674 = (local749 - 100) * 327680 + 255 - (local749 + -100) * 5;
					}
				}
				if (Static117.anIntArray356[local538] == 11) {
					local749 = 150 - Static117.anIntArray357[local538];
					if (local749 < 50) {
						local674 = 16777215 - local749 * 327685;
					} else if (local749 < 100) {
						local674 = (local749 - 50) * 327685 + 65280;
					} else if (local749 < 150) {
						local674 = 16777215 - (local749 - 100) * 327680;
					}
				}
				if (Static117.anIntArray355[local538] == 0) {
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method555(local667, arg1 + Static124.anInt3091, Static42.anInt1103 + arg0, local674, 0);
				}
				if (Static117.anIntArray355[local538] == 1) {
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method560(local667, arg1 + Static124.anInt3091, Static42.anInt1103 + arg0, local674, Static134.anInt3404);
				}
				if (Static117.anIntArray355[local538] == 2) {
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method566(local667, Static124.anInt3091 + arg1, Static42.anInt1103 + arg0, local674, Static134.anInt3404);
				}
				if (Static117.anIntArray355[local538] == 3) {
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method551(local667, arg1 + Static124.anInt3091, arg0 - -Static42.anInt1103, local674, Static134.anInt3404, 150 - Static117.anIntArray357[local538]);
				}
				if (Static117.anIntArray355[local538] == 4) {
					local749 = (150 - Static117.anIntArray357[local538]) * (Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method544(local667) + 100) / 150;
					Static46.method2002(Static124.anInt3091 + arg1 - 50, arg0, arg1 + Static124.anInt3091 + 50, arg0 + arg3);
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method558(local667, arg1 + Static124.anInt3091 + 50 - local749, Static42.anInt1103 + arg0, local674, 0);
					Static46.method1989(arg1, arg0, arg2 + arg1, arg0 - -arg3);
				}
				if (Static117.anIntArray355[local538] == 5) {
					@Pc(1048) int local1048 = 0;
					local749 = 150 - Static117.anIntArray357[local538];
					Static46.method2002(arg1, Static42.anInt1103 + arg0 - Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.anInt773 - 1, arg2 + arg1, arg0 + Static42.anInt1103 + 5);
					if (local749 < 25) {
						local1048 = local749 - 25;
					} else if (local749 > 125) {
						local1048 = local749 - 125;
					}
					Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method555(local667, arg1 + Static124.anInt3091, Static42.anInt1103 + arg0 + local1048, local674, 0);
					Static46.method1989(arg1, arg0, arg2 + arg1, arg3 + arg0);
				}
			} else {
				Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method555(local667, arg1 + Static124.anInt3091, Static42.anInt1103 + arg0, 16776960, 0);
			}
		}
	}
}
