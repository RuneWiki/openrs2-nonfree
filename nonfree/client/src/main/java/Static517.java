import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!bb;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_57 = new Class183();

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZI)V")
	public static void method7680() {
		@Pc(12) Class3_Sub9 local12 = Static587.method8316(Static187.aClass40_2, Static181.aClass230_40);
		Static230.method3933(local12);
		for (@Pc(24) Class3_Sub18 local24 = (Class3_Sub18) Static283.aClass25_23.method949(); local24 != null; local24 = (Class3_Sub18) Static283.aClass25_23.method947()) {
			if (!local24.method8414()) {
				local24 = (Class3_Sub18) Static283.aClass25_23.method949();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt3964 == 0) {
				Static146.method8079(true, true, local24);
			}
		}
		if (Static321.aClass305_8 != null) {
			Static282.method4860(Static321.aClass305_8);
			Static321.aClass305_8 = null;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
	public static void method7681() {
		if (Static101.anInt2408 > 1) {
			Static101.anInt2408--;
			Static596.anInt10437 = Static509.anInt9418;
		}
		if (Static420.aBoolean673) {
			Static420.aBoolean673 = false;
			Static51.method1281();
			return;
		}
		if (!Static256.aBoolean474) {
			Static271.method4718();
		}
		for (@Pc(25) int local25 = 0; local25 < 100 && Static171.method3110(); local25++) {
		}
		if (Static75.anInt1880 != 10) {
			return;
		}
		@Pc(43) Class3_Sub9 local43;
		@Pc(52) int local52;
		while (Static5.method272()) {
			local43 = Static587.method8316(Static187.aClass40_2, Static297.aClass230_62);
			local43.aClass3_Sub7_Sub1_1.method6494(0);
			local52 = local43.aClass3_Sub7_Sub1_1.anInt7869;
			Static189.method3292(local43.aClass3_Sub7_Sub1_1);
			local43.aClass3_Sub7_Sub1_1.method6499(local43.aClass3_Sub7_Sub1_1.anInt7869 - local52);
			Static230.method3933(local43);
		}
		if (Static90.aClass3_Sub26_10 == null) {
			if (Static376.method6088() >= Static252.aLong155) {
				Static90.aClass3_Sub26_10 = Static477.aClass285_1.method7065(Static461.aClass329_6.aString124);
			}
		} else if (Static90.aClass3_Sub26_10.anInt4727 != -1) {
			local43 = Static587.method8316(Static187.aClass40_2, Static435.aClass230_85);
			local43.aClass3_Sub7_Sub1_1.method6528(Static90.aClass3_Sub26_10.anInt4727);
			Static230.method3933(local43);
			Static90.aClass3_Sub26_10 = null;
			Static252.aLong155 = Static376.method6088() + 30000L;
		}
		@Pc(116) Class3_Sub21 local116 = (Class3_Sub21) Static283.aClass183_38.method4795();
		@Pc(133) int local133;
		@Pc(158) int local158;
		@Pc(174) int local174;
		@Pc(221) int local221;
		@Pc(227) int local227;
		@Pc(239) int local239;
		@Pc(131) Class3_Sub9 local131;
		if (local116 != null || Static459.aLong213 < Static376.method6088() - 2000L) {
			local131 = null;
			local133 = 0;
			for (@Pc(138) Class3_Sub21 local138 = (Class3_Sub21) Static44.aClass183_4.method4795(); local138 != null && (local131 == null || local131.aClass3_Sub7_Sub1_1.anInt7869 - local133 < 240); local138 = (Class3_Sub21) Static44.aClass183_4.method4793()) {
				local138.method8412();
				local158 = local138.method3916();
				if (local158 < -1) {
					local158 = -1;
				} else if (local158 > 65534) {
					local158 = 65534;
				}
				local174 = local138.method3917();
				if (local174 < -1) {
					local174 = -1;
				} else if (local174 > 65534) {
					local174 = 65534;
				}
				if (Static112.anInt2623 != local174 || Static184.anInt3724 != local158) {
					if (local131 == null) {
						local131 = Static587.method8316(Static187.aClass40_2, Static154.aClass230_35);
						local131.aClass3_Sub7_Sub1_1.method6494(0);
						local133 = local131.aClass3_Sub7_Sub1_1.anInt7869;
					}
					local221 = local174 - Static112.anInt2623;
					Static112.anInt2623 = local174;
					local227 = local158 - Static184.anInt3724;
					Static184.anInt3724 = local158;
					local239 = (int) ((local138.method3915() - Static459.aLong213) / 20L);
					if (local239 < 8 && local221 >= -32 && local221 <= 31 && local227 >= -32 && local227 <= 31) {
						local227 += 32;
						local221 += 32;
						local131.aClass3_Sub7_Sub1_1.method6528((local239 << 12) - (-(local221 << 6) - local227));
					} else if (local239 < 32 && local221 >= -128 && local221 <= 127 && local227 >= -128 && local227 <= 127) {
						local131.aClass3_Sub7_Sub1_1.method6494(local239 + 128);
						local227 += 128;
						local221 += 128;
						local131.aClass3_Sub7_Sub1_1.method6528((local221 << 8) + local227);
					} else if (local239 >= 32) {
						local131.aClass3_Sub7_Sub1_1.method6528(local239 + 57344);
						if (local174 == 1 || local158 == -1) {
							local131.aClass3_Sub7_Sub1_1.method6495(Integer.MIN_VALUE);
						} else {
							local131.aClass3_Sub7_Sub1_1.method6495(local158 << 16 | local174);
						}
					} else {
						local131.aClass3_Sub7_Sub1_1.method6494(local239 + 192);
						if (local174 == 1 || local158 == -1) {
							local131.aClass3_Sub7_Sub1_1.method6495(Integer.MIN_VALUE);
						} else {
							local131.aClass3_Sub7_Sub1_1.method6495(local158 << 16 | local174);
						}
					}
					Static459.aLong213 = local138.method3915();
				}
			}
			if (local131 != null) {
				local131.aClass3_Sub7_Sub1_1.method6499(local131.aClass3_Sub7_Sub1_1.anInt7869 - local133);
				Static230.method3933(local131);
			}
		}
		@Pc(437) int local437;
		if (local116 != null) {
			@Pc(421) long local421 = (local116.method3915() - Static192.aLong219) / 50L;
			if (local421 > 32767L) {
				local421 = 32767L;
			}
			Static192.aLong219 = local116.method3915();
			local437 = local116.method3916();
			if (local437 < 0) {
				local437 = 0;
			} else if (local437 > 65535) {
				local437 = 65535;
			}
			local158 = local116.method3917();
			if (local158 < 0) {
				local158 = 0;
			} else if (local158 > 65535) {
				local158 = 65535;
			}
			@Pc(468) byte local468 = 0;
			if (local116.method3914() == 2) {
				local468 = 1;
			}
			local221 = (int) local421;
			@Pc(487) Class3_Sub9 local487 = Static587.method8316(Static187.aClass40_2, Static5.aClass230_1);
			local487.aClass3_Sub7_Sub1_1.method6527(local221 | local468 << 15);
			local487.aClass3_Sub7_Sub1_1.method6495(local158 | local437 << 16);
			Static230.method3933(local487);
		}
		if (Static280.anInt9834 > 0) {
			local131 = Static587.method8316(Static187.aClass40_2, Static472.aClass230_91);
			local131.aClass3_Sub7_Sub1_1.method6494(Static280.anInt9834 * 3);
			for (local133 = 0; local133 < Static280.anInt9834; local133++) {
				@Pc(536) Interface23 local536 = Static281.anInterface23Array4[local133];
				@Pc(544) long local544 = (local536.method5039() - Static598.aLong264) / 50L;
				if (local544 > 65535L) {
					local544 = 65535L;
				}
				Static598.aLong264 = local536.method5039();
				local131.aClass3_Sub7_Sub1_1.method6494(local536.method5041());
				local131.aClass3_Sub7_Sub1_1.method6528((int) local544);
			}
			Static230.method3933(local131);
		}
		if (Static114.anInt2639 > 0) {
			Static114.anInt2639--;
		}
		if (Static151.aBoolean260 && Static114.anInt2639 <= 0) {
			Static151.aBoolean260 = false;
			Static114.anInt2639 = 20;
			local131 = Static587.method8316(Static187.aClass40_2, Static188.aClass230_43);
			local131.aClass3_Sub7_Sub1_1.method6527((int) Static533.aFloat188 >> 3);
			local131.aClass3_Sub7_Sub1_1.method6527((int) Static170.aFloat181 >> 3);
			Static230.method3933(local131);
		}
		if (Static62.aBoolean115 != Static250.aBoolean465) {
			Static250.aBoolean465 = Static62.aBoolean115;
			local131 = Static587.method8316(Static187.aClass40_2, Static187.aClass230_42);
			local131.aClass3_Sub7_Sub1_1.method6494(Static62.aBoolean115 ? 1 : 0);
			Static230.method3933(local131);
		}
		if (!Static11.aBoolean30) {
			local131 = Static587.method8316(Static187.aClass40_2, Static407.aClass230_78);
			local131.aClass3_Sub7_Sub1_1.method6494(0);
			local133 = local131.aClass3_Sub7_Sub1_1.anInt7869;
			@Pc(684) Class3_Sub7 local684 = new Class3_Sub7(Static90.method2064());
			Static455.aClass3_Sub27_Sub1_1.method4038(local684);
			local131.aClass3_Sub7_Sub1_1.method6500(local684.anInt7869, local684.aByteArray86);
			local131.aClass3_Sub7_Sub1_1.method6499(local131.aClass3_Sub7_Sub1_1.anInt7869 - local133);
			Static230.method3933(local131);
			Static11.aBoolean30 = true;
		}
		if (Static580.aClass125ArrayArrayArray3 != null) {
			if (Static267.anInt5668 == 2) {
				Static430.method6821();
			} else if (Static267.anInt5668 == 3) {
				Static286.method8370();
			}
		}
		if (Static422.aBoolean674) {
			Static422.aBoolean674 = false;
		} else {
			Static149.aFloat31 /= 2.0F;
		}
		if (Static435.aBoolean685) {
			Static435.aBoolean685 = false;
		} else {
			Static297.aFloat119 /= 2.0F;
		}
		Static327.method5676();
		if (Static75.anInt1880 != 10) {
			return;
		}
		Static78.method1787();
		Static497.method7513();
		Static385.method6162();
		Static536.method7895();
		Static434.anInt8349++;
		if (Static434.anInt8349 > 750) {
			Static51.method1281();
			return;
		}
		Static375.method6087();
		Static122.method2429();
		Static206.method7209();
		for (local52 = Static588.aClass322_1.method7763(true); local52 != -1; local52 = Static588.aClass322_1.method7763(false)) {
			Static443.method6917(local52);
			Static207.anIntArray275[Static141.anInt3259++ & 0x1F] = local52;
		}
		@Pc(876) Class305 local876;
		for (@Pc(812) Class3_Sub4_Sub6 local812 = Static410.method6642(); local812 != null; local812 = Static410.method6642()) {
			local437 = local812.method1891();
			local158 = local812.method1897();
			if (local437 == 1) {
				Static183.anIntArray237[local158] = local812.anInt1945;
				Static463.aBoolean709 |= Static57.aBooleanArray5[local158];
				Static393.anIntArray482[Static273.anInt5811++ & 0x1F] = local158;
			} else if (local437 == 2) {
				Static251.aStringArray21[local158] = local812.aString18;
				Static194.anIntArray266[Static5.anInt273++ & 0x1F] = local158;
			} else if (local437 == 3) {
				local876 = Static220.method3786(local158);
				if (!local812.aString18.equals(local876.aString109)) {
					local876.aString109 = local812.aString18;
					Static282.method4860(local876);
				}
			} else if (local437 == 4) {
				local876 = Static220.method3786(local158);
				local221 = local812.anInt1945;
				local227 = local812.anInt1946;
				local239 = local812.anInt1951;
				if (local876.anInt9217 != local221 || local227 != local876.anInt9219 || local876.anInt9192 != local239) {
					local876.anInt9219 = local227;
					local876.anInt9217 = local221;
					local876.anInt9192 = local239;
					Static282.method4860(local876);
				}
			} else if (local437 == 5) {
				local876 = Static220.method3786(local158);
				if (local812.anInt1945 != local876.anInt9189 || local812.anInt1945 == -1) {
					local876.anInt9183 = 0;
					local876.anInt9186 = 1;
					local876.anInt9189 = local812.anInt1945;
					local876.anInt9204 = 0;
					@Pc(941) Class174 local941 = local876.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(local876.anInt9189);
					if (local941 != null) {
						Static499.method7540(local941, local876.anInt9204);
					}
					Static282.method4860(local876);
				}
			} else if (local437 == 6) {
				local174 = local812.anInt1945;
				local221 = local174 >> 10 & 0x1F;
				local227 = local174 >> 5 & 0x1F;
				local239 = local174 & 0x1F;
				@Pc(989) int local989 = (local239 << 3) + (local221 << 19) + (local227 << 11);
				@Pc(993) Class305 local993 = Static220.method3786(local158);
				if (local993.anInt9205 != local989) {
					local993.anInt9205 = local989;
					Static282.method4860(local993);
				}
			} else if (local437 == 7) {
				local876 = Static220.method3786(local158);
				@Pc(1286) boolean local1286 = local812.anInt1945 == 1;
				if (local1286 != local876.aBoolean773) {
					local876.aBoolean773 = local1286;
					Static282.method4860(local876);
				}
			} else if (local437 == 8) {
				local876 = Static220.method3786(local158);
				if (local812.anInt1945 != local876.anInt9194 || local812.anInt1946 != local876.anInt9227 || local812.anInt1951 != local876.anInt9156) {
					local876.anInt9194 = local812.anInt1945;
					local876.anInt9156 = local812.anInt1951;
					local876.anInt9227 = local812.anInt1946;
					if (local876.anInt9216 != -1) {
						if (local876.anInt9198 > 0) {
							local876.anInt9156 = local876.anInt9156 * 32 / local876.anInt9198;
						} else if (local876.anInt9202 > 0) {
							local876.anInt9156 = local876.anInt9156 * 32 / local876.anInt9202;
						}
					}
					Static282.method4860(local876);
				}
			} else if (local437 == 9) {
				local876 = Static220.method3786(local158);
				if (local812.anInt1945 != local876.anInt9216 || local876.anInt9170 != local812.anInt1946) {
					local876.anInt9170 = local812.anInt1946;
					local876.anInt9216 = local812.anInt1945;
					Static282.method4860(local876);
				}
			} else if (local437 == 10) {
				local876 = Static220.method3786(local158);
				if (local812.anInt1945 != local876.anInt9179 || local812.anInt1946 != local876.anInt9188 || local876.anInt9191 != local812.anInt1951) {
					local876.anInt9188 = local812.anInt1946;
					local876.anInt9191 = local812.anInt1951;
					local876.anInt9179 = local812.anInt1945;
					Static282.method4860(local876);
				}
			} else if (local437 == 11) {
				local876 = Static220.method3786(local158);
				local876.aByte100 = 0;
				local876.aByte98 = 0;
				local876.anInt9197 = local876.anInt9171 = local812.anInt1945;
				local876.anInt9206 = local876.anInt9228 = local812.anInt1946;
				Static282.method4860(local876);
			} else if (local437 == 12) {
				local876 = Static220.method3786(local158);
				local221 = local812.anInt1945;
				if (local876 != null && local876.anInt9211 == 0) {
					if (local876.anInt9178 - local876.anInt9160 < local221) {
						local221 = local876.anInt9178 - local876.anInt9160;
					}
					if (local221 < 0) {
						local221 = 0;
					}
					if (local221 != local876.anInt9233) {
						local876.anInt9233 = local221;
						Static282.method4860(local876);
					}
				}
			} else if (local437 == 14) {
				local876 = Static220.method3786(local158);
				local876.anInt9185 = local812.anInt1945;
			} else if (local437 == 15) {
				Static567.anInt10049 = local812.anInt1945;
				Static394.aBoolean643 = true;
				Static387.anInt7430 = local812.anInt1946;
			} else if (local437 == 16) {
				local876 = Static220.method3786(local158);
				local876.anInt9231 = local812.anInt1945;
			}
		}
		Static377.anInt7320++;
		if (Static257.anInt5516 != 0) {
			Static142.anInt3265 += 20;
			if (Static142.anInt3265 >= 400) {
				Static257.anInt5516 = 0;
			}
		}
		if (Static6.aClass305_1 != null) {
			Static305.anInt6092++;
			if (Static305.anInt6092 >= 15) {
				Static282.method4860(Static6.aClass305_1);
				Static6.aClass305_1 = null;
			}
		}
		Static112.aClass305_5 = null;
		Static86.aClass305_4 = null;
		Static522.aBoolean797 = false;
		Static484.aBoolean752 = false;
		Static149.method2486(-1, -1, null);
		Static255.method4559(-1, -1, null);
		if (!Static594.aBoolean851) {
			Static68.anInt1810 = -1;
		}
		Static313.method5254();
		Static509.anInt9418++;
		if (Static204.aBoolean305) {
			@Pc(1423) Class3_Sub9 local1423 = Static587.method8316(Static187.aClass40_2, Static537.aClass230_105);
			local1423.aClass3_Sub7_Sub1_1.method6531(Static258.anInt5536 << 28 | Static289.anInt6779 << 14 | Static199.anInt3895);
			Static230.method3933(local1423);
			Static204.aBoolean305 = false;
		}
		while (true) {
			@Pc(1446) Class3_Sub38 local1446;
			@Pc(1451) Class305 local1451;
			do {
				local1446 = (Class3_Sub38) aClass183_57.method4797();
				if (local1446 == null) {
					while (true) {
						do {
							local1446 = (Class3_Sub38) Static171.aClass183_17.method4797();
							if (local1446 == null) {
								while (true) {
									do {
										local1446 = (Class3_Sub38) Static319.aClass183_40.method4797();
										if (local1446 == null) {
											if (Static112.aClass305_5 == null) {
												Static510.anInt9429 = 0;
											}
											if (Static360.aClass305_3 != null) {
												Static240.method4172();
											}
											if (Static158.anInt3421 > 0 && Static212.aClass193_1.method6323(82) && Static212.aClass193_1.method6323(81) && Static554.anInt9953 != 0) {
												local437 = Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 - Static554.anInt9953;
												if (local437 < 0) {
													local437 = 0;
												} else if (local437 > 3) {
													local437 = 3;
												}
												Static432.method4774(Static230.anInt4667 + Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0], local437, Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] + Static563.anInt10006);
											}
											Static216.method3755();
											for (local437 = 0; local437 < 5; local437++) {
												@Pc(1631) int local1631 = Static477.anIntArray582[local437]++;
											}
											if (Static463.aBoolean709 && Static376.method6088() - 60000L > Static52.aLong52) {
												Static38.method1123();
											}
											for (@Pc(1660) Class55_Sub2_Sub2 local1660 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3233(); local1660 != null; local1660 = (Class55_Sub2_Sub2) Static472.aClass134_11.method3230()) {
												if (Static376.method6088() / 1000L - 5L > (long) local1660.anInt5535) {
													if (local1660.aShort53 > 0) {
														Static348.method2212(0, "", 5, "", local1660.aString58 + Static139.aClass101_18.method2841(Static126.anInt2904), "");
													}
													if (local1660.aShort53 == 0) {
														Static348.method2212(0, "", 5, "", local1660.aString58 + Static139.aClass101_19.method2841(Static126.anInt2904), "");
													}
													local1660.method7112();
												}
											}
											Static400.anInt7815++;
											if (Static400.anInt7815 > 500) {
												Static400.anInt7815 = 0;
												local174 = (int) (Math.random() * 8.0D);
												if ((local174 & 0x1) == 1) {
													Static519.anInt9512 += Static45.anInt1118;
												}
												if ((local174 & 0x2) == 2) {
													Static519.anInt9508 += Static444.anInt8446;
												}
												if ((local174 & 0x4) == 4) {
													Static460.anInt8639 += Static434.anInt8346;
												}
											}
											if (Static519.anInt9512 < -50) {
												Static45.anInt1118 = 2;
											}
											if (Static519.anInt9512 > 50) {
												Static45.anInt1118 = -2;
											}
											if (Static519.anInt9508 < -55) {
												Static444.anInt8446 = 2;
											}
											if (Static519.anInt9508 > 55) {
												Static444.anInt8446 = -2;
											}
											if (Static460.anInt8639 < -40) {
												Static434.anInt8346 = 1;
											}
											Static354.anInt7087++;
											if (Static460.anInt8639 > 40) {
												Static434.anInt8346 = -1;
											}
											if (Static354.anInt7087 > 500) {
												Static354.anInt7087 = 0;
												local174 = (int) (Math.random() * 8.0D);
												if ((local174 & 0x1) == 1) {
													Static288.anInt5964 += Static45.anInt1119;
												}
												if ((local174 & 0x2) == 2) {
													Static66.anInt1706 += Static334.anInt6938;
												}
											}
											if (Static288.anInt5964 < -60) {
												Static45.anInt1119 = 2;
											}
											if (Static288.anInt5964 > 60) {
												Static45.anInt1119 = -2;
											}
											if (Static66.anInt1706 < -20) {
												Static334.anInt6938 = 1;
											}
											Static484.anInt9039++;
											if (Static66.anInt1706 > 10) {
												Static334.anInt6938 = -1;
											}
											if (Static484.anInt9039 > 50) {
												@Pc(1883) Class3_Sub9 local1883 = Static587.method8316(Static187.aClass40_2, Static280.aClass230_103);
												Static230.method3933(local1883);
											}
											if (Static104.aBoolean189) {
												Static247.method4470();
												Static104.aBoolean189 = false;
											}
											try {
												Static326.method5661();
												return;
											} catch (@Pc(1896) IOException local1896) {
												Static51.method1281();
												return;
											}
										}
										local1451 = local1446.aClass305_11;
										if (local1451.anInt9159 < 0) {
											break;
										}
										local876 = Static220.method3786(local1451.anInt9199);
									} while (local876 == null || local876.aClass305Array2 == null || local876.aClass305Array2.length <= local1451.anInt9159 || local876.aClass305Array2[local1451.anInt9159] != local1451);
									Static597.method8423(local1446);
								}
							}
							local1451 = local1446.aClass305_11;
							if (local1451.anInt9159 < 0) {
								break;
							}
							local876 = Static220.method3786(local1451.anInt9199);
						} while (local876 == null || local876.aClass305Array2 == null || local1451.anInt9159 >= local876.aClass305Array2.length || local1451 != local876.aClass305Array2[local1451.anInt9159]);
						Static597.method8423(local1446);
					}
				}
				local1451 = local1446.aClass305_11;
				if (local1451.anInt9159 < 0) {
					break;
				}
				local876 = Static220.method3786(local1451.anInt9199);
			} while (local876 == null || local876.aClass305Array2 == null || local1451.anInt9159 >= local876.aClass305Array2.length || local1451 != local876.aClass305Array2[local1451.anInt9159]);
			Static597.method8423(local1446);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z[ILclient!pca;I)V")
	public static void method7683(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(4) boolean local4;
		@Pc(6) int local6;
		if (arg1.anIntArray484 != null) {
			local4 = true;
			for (local6 = 0; local6 < arg1.anIntArray484.length; local6++) {
				if (arg0[local6] != arg1.anIntArray484[local6]) {
					local4 = false;
					break;
				}
			}
			if (local4 && arg1.anInt7651 != -1) {
				@Pc(45) Class174 local45 = Static532.aClass157_2.method3734(arg1.anInt7651);
				@Pc(48) int local48 = local45.anInt5488;
				if (local48 == 1) {
					arg1.anInt7588 = 0;
					arg1.anInt7584 = arg2;
					arg1.anInt7589 = 0;
					arg1.anInt7615 = 1;
					arg1.anInt7646 = 0;
					Static28.method957(local45, arg1.aByte103, arg1.anInt9396, arg1.anInt9398, false, arg1.anInt7646);
				}
				if (local48 == 2) {
					arg1.anInt7589 = 0;
				}
			}
		}
		local4 = true;
		for (local6 = 0; local6 < arg0.length; local6++) {
			if (arg0[local6] != -1) {
				local4 = false;
			}
			if (arg1.anIntArray484 == null || arg1.anIntArray484[local6] == -1 || Static532.aClass157_2.method3734(arg0[local6]).anInt5497 >= Static532.aClass157_2.method3734(arg1.anIntArray484[local6]).anInt5497) {
				arg1.anIntArray484 = arg0;
				arg1.anInt7584 = arg2;
				arg1.anInt7659 = arg1.anInt7660;
			}
		}
		if (local4) {
			arg1.anInt7659 = arg1.anInt7660;
			arg1.anInt7584 = arg2;
			arg1.anIntArray484 = arg0;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)Z")
	public static boolean method7684(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
