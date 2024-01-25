import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_42 = new Class109(30);

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!tg;")
	public static Class5_Sub40 aClass5_Sub40_3 = null;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	public static int anInt3750 = -1;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_89 = new Class85("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
	public static boolean method3390() throws IOException {
		if (Static155.aClass41_18 == null) {
			return false;
		}
		@Pc(13) int local13 = Static155.aClass41_18.method826();
		if (local13 == 0) {
			return false;
		}
		if (Static297.anInt5810 == -1) {
			Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, 1, 0);
			Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
			Static297.anInt5810 = Static187.aClass5_Sub12_Sub2_4.method5117();
			local13--;
			Static54.anInt1000 = Static347.anIntArray629[Static297.anInt5810];
		}
		if (Static54.anInt1000 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, 1, 0);
			Static54.anInt1000 = Static187.aClass5_Sub12_Sub2_4.aByteArray90[0] & 0xFF;
			local13--;
		}
		if (Static54.anInt1000 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, 2, 0);
			Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
			Static54.anInt1000 = Static187.aClass5_Sub12_Sub2_4.method5106();
			local13 -= 2;
		}
		if (Static54.anInt1000 > local13) {
			return false;
		}
		Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
		Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, Static54.anInt1000, 0);
		Static347.anInt6686 = 0;
		Static52.anInt972 = Static203.anInt5016;
		Static203.anInt5016 = Static64.anInt1670;
		Static64.anInt1670 = Static297.anInt5810;
		@Pc(142) String local142;
		@Pc(190) int local190;
		@Pc(150) int local150;
		@Pc(136) boolean local136;
		@Pc(171) Class157 local171;
		@Pc(309) int local309;
		@Pc(127) String local127;
		@Pc(200) int local200;
		if (Static297.anInt5810 == 247) {
			local127 = Static187.aClass5_Sub12_Sub2_4.method5064();
			local136 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
			if (local136) {
				local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
			} else {
				local142 = local127;
			}
			local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
			@Pc(154) byte local154 = Static187.aClass5_Sub12_Sub2_4.method5098();
			@Pc(156) boolean local156 = false;
			if (local154 == -128) {
				local156 = true;
			}
			if (local156) {
				if (Static247.anInt4953 == 0) {
					Static297.anInt5810 = -1;
					return true;
				}
				for (local309 = 0; Static247.anInt4953 > local309 && (!Static49.aClass157Array2[local309].aString44.equals(local142) || local150 != Static49.aClass157Array2[local309].anInt4825); local309++) {
				}
				if (Static247.anInt4953 > local309) {
					while (local309 < Static247.anInt4953 - 1) {
						Static49.aClass157Array2[local309] = Static49.aClass157Array2[local309 + 1];
						local309++;
					}
					Static247.anInt4953--;
					Static49.aClass157Array2[Static247.anInt4953] = null;
				}
			} else {
				@Pc(167) String local167 = Static187.aClass5_Sub12_Sub2_4.method5064();
				local171 = new Class157();
				local171.aString46 = local167;
				local171.aByte39 = local154;
				local171.anInt4825 = local150;
				local171.aString45 = local127;
				local171.aString44 = local142;
				for (local190 = Static247.anInt4953 - 1; local190 >= 0; local190--) {
					local200 = Static49.aClass157Array2[local190].aString44.compareTo(local171.aString44);
					if (local200 == 0) {
						Static49.aClass157Array2[local190].anInt4825 = local150;
						Static49.aClass157Array2[local190].aByte39 = local154;
						Static49.aClass157Array2[local190].aString46 = local167;
						if (local142.equals(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40)) {
							Static125.aByte3 = local154;
						}
						Static297.anInt5810 = -1;
						Static186.anInt3700 = Static190.anInt456;
						return true;
					}
					if (local200 < 0) {
						break;
					}
				}
				if (Static49.aClass157Array2.length <= Static247.anInt4953) {
					Static297.anInt5810 = -1;
					return true;
				}
				for (local200 = Static247.anInt4953 - 1; local200 > local190; local200--) {
					Static49.aClass157Array2[local200 + 1] = Static49.aClass157Array2[local200];
				}
				if (Static247.anInt4953 == 0) {
					Static49.aClass157Array2 = new Class157[100];
				}
				Static49.aClass157Array2[local190 + 1] = local171;
				Static247.anInt4953++;
				if (local142.equals(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40)) {
					Static125.aByte3 = local154;
				}
			}
			Static297.anInt5810 = -1;
			Static186.anInt3700 = Static190.anInt456;
			return true;
		}
		@Pc(392) int local392;
		@Pc(376) int local376;
		@Pc(380) int local380;
		@Pc(384) int local384;
		@Pc(396) int local396;
		if (Static297.anInt5810 == 226) {
			local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
			local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
			local384 = Static187.aClass5_Sub12_Sub2_4.method5115();
			local150 = Static187.aClass5_Sub12_Sub2_4.method5115();
			local392 = Static187.aClass5_Sub12_Sub2_4.method5115();
			local396 = Static187.aClass5_Sub12_Sub2_4.method5106();
			if (Static138.method2445(local376)) {
				Static349.aBooleanArray26[local380] = true;
				Static176.anIntArray357[local380] = local384;
				Static274.anIntArray524[local380] = local150;
				Static154.anIntArray301[local380] = local392;
				Static118.anIntArray208[local380] = local396;
			}
			Static297.anInt5810 = -1;
			return true;
		} else if (Static297.anInt5810 == 132) {
			local127 = Static187.aClass5_Sub12_Sub2_4.method5064();
			local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
			local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
			if (Static138.method2445(local380)) {
				Static314.method5477(local384, local127);
			}
			Static297.anInt5810 = -1;
			return true;
		} else if (Static297.anInt5810 == 210) {
			if (Static54.anInt1000 == 0) {
				Static255.aString50 = Static178.aClass85_81.method2020(Static41.anInt726);
			} else {
				Static255.aString50 = Static187.aClass5_Sub12_Sub2_4.method5064();
			}
			Static297.anInt5810 = -1;
			return true;
		} else if (Static297.anInt5810 == 79) {
			local376 = Static187.aClass5_Sub12_Sub2_4.method5073();
			local380 = Static187.aClass5_Sub12_Sub2_4.method5073();
			local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
			local150 = Static187.aClass5_Sub12_Sub2_4.method5067();
			if (Static138.method2445(local384)) {
				Static141.method2508(local380, local150, local376);
			}
			Static297.anInt5810 = -1;
			return true;
		} else {
			@Pc(529) String local529;
			if (Static297.anInt5810 == 224) {
				local127 = Static187.aClass5_Sub12_Sub2_4.method5064();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5106();
				local529 = Static234.method4160(local380).method5349(Static187.aClass5_Sub12_Sub2_4);
				Static7.method123(local127, local380, 0, null, 19, local529, local127);
				Static297.anInt5810 = -1;
				return true;
			}
			@Pc(595) long local595;
			@Pc(612) Class5_Sub44 local612;
			@Pc(601) Class5_Sub44 local601;
			if (Static297.anInt5810 == 160) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5067();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5113();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local384 == 65535) {
					local384 = -1;
				}
				local150 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local150 == 65535) {
					local150 = -1;
				}
				local392 = Static187.aClass5_Sub12_Sub2_4.method5106();
				if (Static138.method2445(local392)) {
					for (local396 = local150; local396 <= local384; local396++) {
						local595 = ((long) local376 << 32) + (long) local396;
						local601 = (Class5_Sub44) Static114.aClass190_10.method5466(local595);
						if (local601 != null) {
							local612 = new Class5_Sub44(local601.anInt6436, local380);
							local601.method6005();
						} else if (local396 == -1) {
							local612 = new Class5_Sub44(Static262.method4616(local376).aClass5_Sub44_2.anInt6436, local380);
						} else {
							local612 = new Class5_Sub44(0, local380);
						}
						Static114.aClass190_10.method5464(local612, local595);
					}
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 106) {
				local127 = Static187.aClass5_Sub12_Sub2_4.method5064();
				local142 = Static34.method568(Static230.method4147(Static166.method3024(Static187.aClass5_Sub12_Sub2_4)));
				Static63.method4635(local127, 6, local142, local127, 0);
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 163) {
				Static339.anInt6582 = Static187.aClass5_Sub12_Sub2_4.method5068();
				Static286.anInt5623 = Static187.aClass5_Sub12_Sub2_4.method5101();
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 120) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
				local136 = (local380 & 0x1) == 1;
				while (Static54.anInt1000 > Static187.aClass5_Sub12_Sub2_4.anInt5731) {
					local150 = Static187.aClass5_Sub12_Sub2_4.method5060();
					local392 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local396 = 0;
					if (local392 != 0) {
						local396 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local396 == 255) {
							local396 = Static187.aClass5_Sub12_Sub2_4.method5067();
						}
					}
					Static182.method3319(local396, local392 - 1, local376, local150, local136);
				}
				Static334.anIntArray602[Static320.anInt6194++ & 0x1F] = local376;
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 173) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5097();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local380 == 65535) {
					local380 = -1;
				}
				local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
				if (Static138.method2445(local384)) {
					Static330.method5727(local380, 2, local376, -1);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 32) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
				local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5090();
				if (Static138.method2445(local376)) {
					Static289.method5016(local384, local142);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 196) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5086();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5101();
				Static239.anInt4811 = local376 >> 1;
				Static192.aClass4_Sub5_Sub2_Sub1_2.method4118((local376 & 0x1) == 1, local380, Static239.anInt4811, local384);
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 3) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5113();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
				if (local380 == 65535) {
					local380 = -1;
				}
				local384 = Static187.aClass5_Sub12_Sub2_4.method5067();
				if (Static138.method2445(local376)) {
					Static330.method5727(local380, 1, local384, -1);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 156) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5106();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5067();
				if (Static138.method2445(local376)) {
					Static12.method3425(local384, local380);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 237) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5075();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5074();
				local150 = Static187.aClass5_Sub12_Sub2_4.method5075();
				if (Static138.method2445(local380)) {
					Static188.method3358(local384, (local376 << 16) + local150);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 98) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
				local380 = Static187.aClass5_Sub12_Sub2_4.method5067();
				local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
				if (Static138.method2445(local376)) {
					Static25.method4626(local384, local380);
				}
				Static297.anInt5810 = -1;
				return true;
			} else if (Static297.anInt5810 == 74) {
				local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
				if (Static138.method2445(local376)) {
					Static12.method3423();
				}
				Static297.anInt5810 = -1;
				return true;
			} else {
				@Pc(1063) Class5_Sub18 local1063;
				if (Static297.anInt5810 == 146) {
					local376 = Static187.aClass5_Sub12_Sub2_4.method5068();
					local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
					local384 = Static187.aClass5_Sub12_Sub2_4.method5075();
					local150 = Static187.aClass5_Sub12_Sub2_4.method5067();
					if (Static138.method2445(local380)) {
						local1063 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local150);
						if (local1063 != null) {
							Static78.method1417(local1063.anInt1871 != local384, false, local1063);
						}
						Static34.method567(local384, local376, local150, false);
					}
					Static297.anInt5810 = -1;
					return true;
				} else if (Static297.anInt5810 == 47) {
					local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local136 = (local380 & 0x1) == 1;
					Static78.method1415(local136, local376);
					local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
					for (local392 = 0; local392 < local150; local392++) {
						local396 = Static187.aClass5_Sub12_Sub2_4.method5086();
						if (local396 == 255) {
							local396 = Static187.aClass5_Sub12_Sub2_4.method5097();
						}
						local309 = Static187.aClass5_Sub12_Sub2_4.method5075();
						Static182.method3319(local396, local309 - 1, local376, local392, local136);
					}
					Static334.anIntArray602[Static320.anInt6194++ & 0x1F] = local376;
					Static297.anInt5810 = -1;
					return true;
				} else if (Static297.anInt5810 == 192) {
					local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local380 = Static187.aClass5_Sub12_Sub2_4.method5086();
					local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
					if (Static138.method2445(local384)) {
						if (local380 == 2) {
							Static32.method555();
						}
						Static32.anInt628 = local376;
						Static8.method170(local376);
						Static43.method6040(false);
						Static108.method1909(Static32.anInt628);
						for (local150 = 0; local150 < 100; local150++) {
							Static287.aBooleanArray23[local150] = true;
						}
					}
					Static297.anInt5810 = -1;
					return true;
				} else if (Static297.anInt5810 == 205) {
					local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local380 = Static187.aClass5_Sub12_Sub2_4.method5066();
					local384 = Static187.aClass5_Sub12_Sub2_4.method5067();
					if (Static138.method2445(local376)) {
						Static114.method1989(local380, local384);
					}
					Static297.anInt5810 = -1;
					return true;
				} else {
					@Pc(1276) String local1276;
					@Pc(1286) String local1286;
					@Pc(1290) String local1290;
					if (Static297.anInt5810 == 239) {
						local376 = Static187.aClass5_Sub12_Sub2_4.method5115();
						@Pc(1268) boolean local1268 = (local376 & 0x1) == 1;
						local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
						local1276 = Static187.aClass5_Sub12_Sub2_4.method5064();
						if (local1276.equals("")) {
							local1276 = local529;
						}
						local1286 = Static187.aClass5_Sub12_Sub2_4.method5064();
						local1290 = Static187.aClass5_Sub12_Sub2_4.method5064();
						if (local1290.equals("")) {
							local1290 = local1286;
						}
						if (local1268) {
							for (local309 = 0; local309 < Static346.anInt6667; local309++) {
								if (Static253.aStringArray51[local309].equals(local1290)) {
									Static25.aStringArray52[local309] = local529;
									Static253.aStringArray51[local309] = local1276;
									Static222.aStringArray48[local309] = local1286;
									Static178.aStringArray42[local309] = local1290;
									break;
								}
							}
						} else {
							Static25.aStringArray52[Static346.anInt6667] = local529;
							Static253.aStringArray51[Static346.anInt6667] = local1276;
							Static222.aStringArray48[Static346.anInt6667] = local1286;
							Static178.aStringArray42[Static346.anInt6667] = local1290;
							Static211.aBooleanArray17[Static346.anInt6667] = (local376 & 0x2) == 2;
							Static346.anInt6667++;
						}
						Static195.anInt3884 = Static190.anInt456;
						Static297.anInt5810 = -1;
						return true;
					} else if (Static297.anInt5810 == 123) {
						local376 = Static187.aClass5_Sub12_Sub2_4.method5075();
						local380 = Static187.aClass5_Sub12_Sub2_4.method5075();
						local384 = Static187.aClass5_Sub12_Sub2_4.method5100();
						local150 = Static187.aClass5_Sub12_Sub2_4.method5100();
						local392 = Static187.aClass5_Sub12_Sub2_4.method5097();
						if (Static138.method2445(local150)) {
							Static330.method5727(local384 << 16 | local376, 7, local392, local380);
						}
						Static297.anInt5810 = -1;
						return true;
					} else if (Static297.anInt5810 == 215) {
						local376 = Static187.aClass5_Sub12_Sub2_4.method5075();
						local380 = Static187.aClass5_Sub12_Sub2_4.method5097();
						local384 = Static187.aClass5_Sub12_Sub2_4.method5075();
						if (Static138.method2445(local376)) {
							Static330.method5724(local380, local384);
						}
						Static297.anInt5810 = -1;
						return true;
					} else if (Static297.anInt5810 == 231) {
						local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
						local380 = Static187.aClass5_Sub12_Sub2_4.method5067();
						local384 = Static187.aClass5_Sub12_Sub2_4.method5090();
						local150 = Static187.aClass5_Sub12_Sub2_4.method5100();
						if (Static138.method2445(local376)) {
							Static330.method5727(local150, 5, local384, local380);
						}
						Static297.anInt5810 = -1;
						return true;
					} else if (Static297.anInt5810 == 153) {
						Static187.aClass5_Sub12_Sub2_4.anInt5731 += 28;
						if (Static187.aClass5_Sub12_Sub2_4.method5112()) {
							Static352.method5980(Static187.aClass5_Sub12_Sub2_4, Static187.aClass5_Sub12_Sub2_4.anInt5731 - 28);
						}
						Static297.anInt5810 = -1;
						return true;
					} else if (Static297.anInt5810 == 103) {
						local376 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local380 = local376 >> 5;
						local384 = local376 & 0x1F;
						if (local384 == 0) {
							Static149.aClass131Array1[local380] = null;
							Static297.anInt5810 = -1;
							return true;
						}
						@Pc(1533) Class131 local1533 = new Class131();
						local1533.anInt3892 = local384;
						local1533.anInt3889 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local1533.anInt3889 >= 0 && Static50.aClass95Array5.length > local1533.anInt3889) {
							if (local1533.anInt3892 == 1 || local1533.anInt3892 == 10) {
								local1533.anInt3886 = Static187.aClass5_Sub12_Sub2_4.method5106();
								Static187.aClass5_Sub12_Sub2_4.anInt5731 += 5;
							} else if (local1533.anInt3892 >= 2 && local1533.anInt3892 <= 6) {
								if (local1533.anInt3892 == 2) {
									local1533.anInt3882 = 64;
									local1533.anInt3895 = 64;
								}
								if (local1533.anInt3892 == 3) {
									local1533.anInt3882 = 64;
									local1533.anInt3895 = 0;
								}
								if (local1533.anInt3892 == 4) {
									local1533.anInt3882 = 64;
									local1533.anInt3895 = 128;
								}
								if (local1533.anInt3892 == 5) {
									local1533.anInt3882 = 0;
									local1533.anInt3895 = 64;
								}
								if (local1533.anInt3892 == 6) {
									local1533.anInt3895 = 64;
									local1533.anInt3882 = 128;
								}
								local1533.anInt3892 = 2;
								local1533.anInt3879 = Static187.aClass5_Sub12_Sub2_4.method5106();
								local1533.anInt3885 = Static187.aClass5_Sub12_Sub2_4.method5106();
								local1533.anInt3891 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local1533.anInt3887 = Static187.aClass5_Sub12_Sub2_4.method5106();
							}
							local1533.anInt3893 = Static187.aClass5_Sub12_Sub2_4.method5106();
							if (local1533.anInt3893 == 65535) {
								local1533.anInt3893 = -1;
							}
							Static149.aClass131Array1[local380] = local1533;
						}
						Static297.anInt5810 = -1;
						return true;
					} else {
						@Pc(1745) boolean local1745;
						@Pc(1893) int local1893;
						if (Static297.anInt5810 == 177) {
							local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
							local380 = Static187.aClass5_Sub12_Sub2_4.method5106();
							local384 = Static187.aClass5_Sub12_Sub2_4.method5113();
							local150 = Static187.aClass5_Sub12_Sub2_4.method5067();
							if (local150 >> 30 == 0) {
								@Pc(1761) Class163 local1761;
								@Pc(1781) Class89 local1781;
								@Pc(1812) Class89 local1812;
								@Pc(1766) Class163 local1766;
								@Pc(1786) Class89 local1786;
								if (local150 >> 29 != 0) {
									local392 = local150 & 0xFFFF;
									@Pc(1929) Class4_Sub5_Sub2_Sub2 local1929 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local392];
									if (local1929 != null) {
										if (local376 == 65535) {
											local376 = -1;
										}
										local1745 = true;
										if (local376 != -1 && local1929.anInt5398 != -1) {
											if (local376 == local1929.anInt5398) {
												local1761 = Static325.method5628(local376);
												if (local1761.aBoolean418 && local1761.anInt5031 != -1) {
													local1812 = Static162.method2849(local1761.anInt5031);
													local200 = local1812.anInt2468;
													if (local200 == 0 || local200 == 2) {
														local1745 = false;
													} else if (local200 == 1) {
														local1745 = true;
													}
												}
											} else {
												local1761 = Static325.method5628(local376);
												local1766 = Static325.method5628(local1929.anInt5398);
												if (local1761.anInt5031 != -1 && local1766.anInt5031 != -1) {
													local1781 = Static162.method2849(local1761.anInt5031);
													local1786 = Static162.method2849(local1766.anInt5031);
													if (local1781.anInt2465 < local1786.anInt2465) {
														local1745 = false;
													}
												}
											}
										}
										if (local1745) {
											local1929.anInt5369 = 1;
											local1929.anInt5398 = local376;
											local1929.anInt5373 = local384;
											local1929.anInt5404 = 0;
											local1929.anInt5395 = local380 + Static283.anInt5563;
											local1929.anInt5358 = 0;
											if (local1929.anInt5395 > Static283.anInt5563) {
												local1929.anInt5404 = -1;
											}
											if (local1929.anInt5398 != -1 && local1929.anInt5395 == Static283.anInt5563) {
												local1893 = Static325.method5628(local1929.anInt5398).anInt5031;
												if (local1893 != -1) {
													local1812 = Static162.method2849(local1893);
													if (local1812 != null && local1812.anIntArray245 != null) {
														Static311.method3258(local1812, local1929.anInt6631, false, 0, local1929.anInt6632);
													}
												}
											}
										}
									}
								} else if (local150 >> 28 != 0) {
									local392 = local150 & 0xFFFF;
									@Pc(1732) Class4_Sub5_Sub2_Sub1 local1732;
									if (Static166.anInt3304 == local392) {
										local1732 = Static192.aClass4_Sub5_Sub2_Sub1_2;
									} else {
										local1732 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local392];
									}
									if (local1732 != null) {
										if (local376 == 65535) {
											local376 = -1;
										}
										local1745 = true;
										if (local376 != -1 && local1732.anInt5398 != -1) {
											if (local1732.anInt5398 == local376) {
												local1761 = Static325.method5628(local376);
												if (local1761.aBoolean418 && local1761.anInt5031 != -1) {
													local1812 = Static162.method2849(local1761.anInt5031);
													local200 = local1812.anInt2468;
													if (local200 == 0 || local200 == 2) {
														local1745 = false;
													} else if (local200 == 1) {
														local1745 = true;
													}
												}
											} else {
												local1761 = Static325.method5628(local376);
												local1766 = Static325.method5628(local1732.anInt5398);
												if (local1761.anInt5031 != -1 && local1766.anInt5031 != -1) {
													local1781 = Static162.method2849(local1761.anInt5031);
													local1786 = Static162.method2849(local1766.anInt5031);
													if (local1786.anInt2465 > local1781.anInt2465) {
														local1745 = false;
													}
												}
											}
										}
										if (local1745) {
											local1732.anInt5398 = local376;
											local1732.anInt5369 = 1;
											local1732.anInt5373 = local384;
											local1732.anInt5395 = local380 + Static283.anInt5563;
											local1732.anInt5404 = 0;
											local1732.anInt5358 = 0;
											if (Static283.anInt5563 < local1732.anInt5395) {
												local1732.anInt5404 = -1;
											}
											if (local1732.anInt5398 == 65535) {
												local1732.anInt5398 = -1;
											}
											if (local1732.anInt5398 != -1 && local1732.anInt5395 == Static283.anInt5563) {
												local1893 = Static325.method5628(local1732.anInt5398).anInt5031;
												if (local1893 != -1) {
													local1812 = Static162.method2849(local1893);
													if (local1812 != null && local1812.anIntArray245 != null) {
														Static311.method3258(local1812, local1732.anInt6631, local1732 == Static192.aClass4_Sub5_Sub2_Sub1_2, 0, local1732.anInt6632);
													}
												}
											}
										}
									}
								}
							} else {
								local392 = local150 >> 28 & 0x3;
								local396 = (local150 >> 14 & 0x3FFF) - Static172.anInt4394;
								local309 = (local150 & 0x3FFF) - Static12.anInt3797;
								if (local396 >= 0 && local309 >= 0 && local396 < Static22.anInt481 && local309 < Static269.anInt5281) {
									local1893 = local396 * 128 + 64;
									local190 = local309 * 128 + 64;
									@Pc(2177) Class4_Sub5_Sub1 local2177 = new Class4_Sub5_Sub1(local376, 0, Static283.anInt5563, local392, local1893, Static208.method3804(local392, local1893, local190) - local384, local190, local396, local396, local309, local309);
									Static85.aClass103_38.method2745(new Class5_Sub1_Sub20(local2177));
								}
							}
							Static297.anInt5810 = -1;
							return true;
						} else if (Static297.anInt5810 == 110) {
							local376 = Static187.aClass5_Sub12_Sub2_4.method5075();
							if (local376 == 65535) {
								local376 = -1;
							}
							local380 = Static187.aClass5_Sub12_Sub2_4.method5086();
							local384 = local380 >> 2;
							local150 = local380 & 0x3;
							local392 = Static34.anIntArray71[local384];
							local396 = Static187.aClass5_Sub12_Sub2_4.method5097();
							local309 = local396 >> 28 & 0x3;
							local1893 = local396 >> 14 & 0x3FFF;
							local1893 -= Static172.anInt4394;
							local190 = local396 & 0x3FFF;
							local190 -= Static12.anInt3797;
							Static194.method3446(local376, local150, local1893, local392, local309, local190, local384);
							Static297.anInt5810 = -1;
							return true;
						} else {
							@Pc(2274) byte local2274;
							if (Static297.anInt5810 == 126) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
								local2274 = Static187.aClass5_Sub12_Sub2_4.method5104();
								local384 = Static187.aClass5_Sub12_Sub2_4.method5075();
								if (Static138.method2445(local376)) {
									Static25.method4626(local384, local2274);
								}
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 65) {
								Static33.method564(false);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 115) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5113();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5090();
								Static143.method2569(local380, local376);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 113) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5075();
								local384 = Static187.aClass5_Sub12_Sub2_4.method5097();
								if (Static138.method2445(local380)) {
									Static146.method2666(local376, local384);
								}
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 187) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5101();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
								if (local380 == 65535) {
									local380 = -1;
								}
								Static264.method4685(local376, local380);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 111) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5075();
								if (local376 == 65535) {
									local376 = -1;
								}
								local380 = Static187.aClass5_Sub12_Sub2_4.method5068();
								local384 = Static187.aClass5_Sub12_Sub2_4.method5072();
								Static189.method3382(local380, local376, local384);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 17) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local384 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
								local392 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local396 = Static187.aClass5_Sub12_Sub2_4.method5115();
								if (Static138.method2445(local376)) {
									Static342.method5876(local150, local396, local384, local392, local380);
								}
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 46) {
								for (local376 = 0; local376 < Static134.anIntArray205.length; local376++) {
									if (Static134.anIntArray205[local376] != Static251.anIntArray486[local376]) {
										Static134.anIntArray205[local376] = Static251.anIntArray486[local376];
										Static197.method3479(local376);
										Static287.anIntArray548[Static70.anInt1369++ & 0x1F] = local376;
									}
								}
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 72) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5113();
								Static143.method2569(local376, local380);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 62) {
								Static245.method4390(Static182.aClass139_5, Static187.aClass5_Sub12_Sub2_4, Static54.anInt1000);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 9) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5115();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
								if (local376 == 255) {
									local380 = -1;
									local376 = -1;
								}
								Static90.method1619(local380, local376);
								Static297.anInt5810 = -1;
								return true;
							} else if (Static297.anInt5810 == 249) {
								local376 = Static187.aClass5_Sub12_Sub2_4.method5068();
								local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
								local384 = Static187.aClass5_Sub12_Sub2_4.method5075();
								@Pc(2583) Class4_Sub5_Sub2_Sub2 local2583 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local380];
								if (local2583 != null) {
									Static96.method1763(local376, local384, local2583);
								}
								Static297.anInt5810 = -1;
								return true;
							} else {
								@Pc(2608) boolean local2608;
								@Pc(2799) int local2799;
								@Pc(2838) int local2838;
								@Pc(2856) String local2856;
								@Pc(2874) String local2874;
								@Pc(2892) String local2892;
								if (Static297.anInt5810 == 8) {
									local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
									local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
									local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
									local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local392 = Static187.aClass5_Sub12_Sub2_4.method5115();
									local1290 = "";
									local1745 = false;
									if (local150 > 0) {
										local1290 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local1745 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
									}
									for (local1893 = 0; local1893 < Static44.anInt750; local1893++) {
										if (local2608) {
											if (local529.equals(Static85.aStringArray14[local1893])) {
												Static85.aStringArray14[local1893] = local142;
												local142 = null;
												Static20.aStringArray5[local1893] = local529;
												break;
											}
										} else if (local142.equals(Static85.aStringArray14[local1893])) {
											if (Static60.anIntArray185[local1893] != local150) {
												Static60.anIntArray185[local1893] = local150;
												if (local150 > 0) {
													Static63.method4635("", 5, local142 + Static103.aClass85_120.method2020(Static41.anInt726), "", 0);
												}
												if (local150 == 0) {
													Static63.method4635("", 5, local142 + Static143.aClass85_68.method2020(Static41.anInt726), "", 0);
												}
											}
											Static20.aStringArray5[local1893] = local529;
											Static156.aStringArray37[local1893] = local1290;
											Static349.anIntArray634[local1893] = local392;
											local142 = null;
											Static162.aBooleanArray14[local1893] = local1745;
											break;
										}
									}
									if (local142 != null && Static44.anInt750 < 200) {
										Static85.aStringArray14[Static44.anInt750] = local142;
										Static20.aStringArray5[Static44.anInt750] = local529;
										Static60.anIntArray185[Static44.anInt750] = local150;
										Static156.aStringArray37[Static44.anInt750] = local1290;
										Static349.anIntArray634[Static44.anInt750] = local392;
										Static162.aBooleanArray14[Static44.anInt750] = local1745;
										Static44.anInt750++;
									}
									Static195.anInt3884 = Static190.anInt456;
									local200 = Static44.anInt750;
									while (local200 > 0) {
										local200--;
										@Pc(2797) boolean local2797 = true;
										for (local2799 = 0; local2799 < local200; local2799++) {
											if (Static48.anInt918 != Static60.anIntArray185[local2799] && Static60.anIntArray185[local2799 + 1] == Static48.anInt918 || Static60.anIntArray185[local2799] == 0 && Static60.anIntArray185[local2799 + 1] != 0) {
												local2838 = Static60.anIntArray185[local2799];
												Static60.anIntArray185[local2799] = Static60.anIntArray185[local2799 + 1];
												Static60.anIntArray185[local2799 + 1] = local2838;
												local2856 = Static156.aStringArray37[local2799];
												Static156.aStringArray37[local2799] = Static156.aStringArray37[local2799 + 1];
												Static156.aStringArray37[local2799 + 1] = local2856;
												local2874 = Static85.aStringArray14[local2799];
												Static85.aStringArray14[local2799] = Static85.aStringArray14[local2799 + 1];
												Static85.aStringArray14[local2799 + 1] = local2874;
												local2892 = Static20.aStringArray5[local2799];
												Static20.aStringArray5[local2799] = Static20.aStringArray5[local2799 + 1];
												Static20.aStringArray5[local2799 + 1] = local2892;
												@Pc(2910) int local2910 = Static349.anIntArray634[local2799];
												Static349.anIntArray634[local2799] = Static349.anIntArray634[local2799 + 1];
												Static349.anIntArray634[local2799 + 1] = local2910;
												@Pc(2928) boolean local2928 = Static162.aBooleanArray14[local2799];
												Static162.aBooleanArray14[local2799] = Static162.aBooleanArray14[local2799 + 1];
												local2797 = false;
												Static162.aBooleanArray14[local2799 + 1] = local2928;
											}
										}
										if (local2797) {
											break;
										}
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 40) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5067();
									if (Static138.method2445(local376)) {
										@Pc(2983) Class5_Sub18 local2983 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local380);
										if (local2983 != null) {
											Static78.method1417(true, false, local2983);
										}
										if (Static208.aClass201_9 != null) {
											Static189.method3383(Static208.aClass201_9);
											Static208.aClass201_9 = null;
										}
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 178) {
									Static231.method4153(Static187.aClass5_Sub12_Sub2_4.method5064());
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 240 || Static297.anInt5810 == 37 || Static297.anInt5810 == 150 || Static297.anInt5810 == 59 || Static297.anInt5810 == 122 || Static297.anInt5810 == 190 || Static297.anInt5810 == 252 || Static297.anInt5810 == 199 || Static297.anInt5810 == 191 || Static297.anInt5810 == 234 || Static297.anInt5810 == 109 || Static297.anInt5810 == 19 || Static297.anInt5810 == 193 || Static297.anInt5810 == 127 || Static297.anInt5810 == 100) {
									Static227.method4123();
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 164) {
									Static151.anInt2973 = Static187.aClass5_Sub12_Sub2_4.method5100() * 30;
									Static297.anInt5810 = -1;
									Static245.anInt4912 = Static190.anInt456;
									return true;
								} else if (Static297.anInt5810 == 186) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5067();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5113();
									if (Static138.method2445(local380)) {
										Static330.method5727(-1, 3, local376, -1);
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 135) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
									@Pc(3141) Object[] local3141 = new Object[local142.length() + 1];
									for (local150 = local142.length() - 1; local150 >= 0; local150--) {
										if (local142.charAt(local150) == 's') {
											local3141[local150 + 1] = Static187.aClass5_Sub12_Sub2_4.method5064();
										} else {
											local3141[local150 + 1] = Integer.valueOf(Static187.aClass5_Sub12_Sub2_4.method5067());
										}
									}
									local3141[0] = Integer.valueOf(Static187.aClass5_Sub12_Sub2_4.method5067());
									if (Static138.method2445(local376)) {
										@Pc(3194) Class5_Sub17 local3194 = new Class5_Sub17();
										local3194.anObjectArray1 = local3141;
										Static108.method1907(local3194);
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 222) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5068();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5086();
									local384 = Static187.aClass5_Sub12_Sub2_4.method5113();
									if (local384 == 65535) {
										local384 = -1;
									}
									local1276 = Static187.aClass5_Sub12_Sub2_4.method5064();
									if (local376 >= 1 && local376 <= 8) {
										if (local1276.equalsIgnoreCase("null")) {
											local1276 = null;
										}
										Static31.aStringArray9[local376 - 1] = local1276;
										Static30.anIntArray68[local376 - 1] = local384;
										Static52.aBooleanArray6[local376 - 1] = local380 == 0;
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 206) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5074();
									Static157.method2789(local376, local380);
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 242) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
									if (local376 == 65535) {
										local376 = -1;
									}
									local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
									local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local150 = Static187.aClass5_Sub12_Sub2_4.method5115();
									Static115.method2017(local384, local380, local376, local150);
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 158) {
									Static33.method564(true);
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 168) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5060();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5067();
									local384 = Static187.aClass5_Sub12_Sub2_4.method5115();
									local1276 = "";
									local1286 = local1276;
									if ((local384 & 0x1) != 0) {
										local1276 = Static187.aClass5_Sub12_Sub2_4.method5064();
										if ((local384 & 0x2) == 0) {
											local1286 = local1276;
										} else {
											local1286 = Static187.aClass5_Sub12_Sub2_4.method5064();
										}
									}
									local1290 = Static187.aClass5_Sub12_Sub2_4.method5064();
									if (local376 == 99) {
										Static219.method4009(local1290);
									} else if (local1286.equals("") || !Static241.method4300(local1286)) {
										Static63.method4635(local1276, local376, local1290, local1286, local380);
									} else {
										Static297.anInt5810 = -1;
										return true;
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 143) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5068();
									if (Static138.method2445(local376)) {
										Static29.anInt590 = local380;
									}
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 34) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5086();
									local380 = Static187.aClass5_Sub12_Sub2_4.method5067();
									local384 = Static187.aClass5_Sub12_Sub2_4.method5115();
									Static57.anIntArray575[local376] = local380;
									Static12.anIntArray381[local376] = local384;
									Static344.anIntArray618[local376] = 1;
									local150 = Static69.anIntArray110[local376] - 1;
									for (local392 = 0; local392 < local150; local392++) {
										if (Class40_Sub1.anIntArray483[local392] <= local380) {
											Static344.anIntArray618[local376] = local392 + 2;
										}
									}
									Static166.anIntArray350[Static205.anInt4075++ & 0x1F] = local376;
									Static297.anInt5810 = -1;
									return true;
								} else if (Static297.anInt5810 == 166) {
									local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
									if (local376 == 65535) {
										local376 = -1;
									}
									local380 = Static187.aClass5_Sub12_Sub2_4.method5090();
									local384 = Static187.aClass5_Sub12_Sub2_4.method5090();
									local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
									local392 = Static187.aClass5_Sub12_Sub2_4.method5113();
									if (local392 == 65535) {
										local392 = -1;
									}
									if (Static138.method2445(local150)) {
										for (local396 = local392; local396 <= local376; local396++) {
											local595 = ((long) local384 << 32) + (long) local396;
											local601 = (Class5_Sub44) Static114.aClass190_10.method5466(local595);
											if (local601 != null) {
												local612 = new Class5_Sub44(local380, local601.anInt6432);
												local601.method6005();
											} else if (local396 == -1) {
												local612 = new Class5_Sub44(local380, Static262.method4616(local384).aClass5_Sub44_2.anInt6432);
											} else {
												local612 = new Class5_Sub44(local380, -1);
											}
											Static114.aClass190_10.method5464(local612, local595);
										}
									}
									Static297.anInt5810 = -1;
									return true;
								} else {
									@Pc(3644) long local3644;
									@Pc(3649) long local3649;
									@Pc(3654) long local3654;
									if (Static297.anInt5810 == 92) {
										local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
										local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local529 = local142;
										if (local2608) {
											local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
										}
										local3644 = Static187.aClass5_Sub12_Sub2_4.method5099();
										local3649 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local3654 = Static187.aClass5_Sub12_Sub2_4.method5072();
										local200 = Static187.aClass5_Sub12_Sub2_4.method5115();
										local2799 = Static187.aClass5_Sub12_Sub2_4.method5106();
										@Pc(3668) long local3668 = local3654 + (local3649 << 32);
										@Pc(3670) boolean local3670 = false;
										@Pc(3672) int local3672 = 0;
										while (true) {
											if (local3672 >= 100) {
												if (local200 <= 1 && Static241.method4300(local529)) {
													local3670 = true;
												}
												break;
											}
											if (Static144.aLongArray3[local3672] == local3668) {
												local3670 = true;
												break;
											}
											local3672++;
										}
										if (!local3670 && Static169.anInt6215 == 0) {
											Static144.aLongArray3[Static353.anInt6775] = local3668;
											Static353.anInt6775 = (Static353.anInt6775 + 1) % 100;
											local2892 = Static234.method4160(local2799).method5349(Static187.aClass5_Sub12_Sub2_4);
											if (local200 == 2) {
												Static7.method123("<img=1>" + local142, local2799, 0, Static275.method4840(local3644), 20, local2892, "<img=1>" + local529);
											} else if (local200 == 1) {
												Static7.method123("<img=0>" + local142, local2799, 0, Static275.method4840(local3644), 20, local2892, "<img=0>" + local529);
											} else {
												Static7.method123(local142, local2799, 0, Static275.method4840(local3644), 20, local2892, local529);
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 159) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5074();
										Static263.aClass16_8 = Static182.aClass139_5.method3877(local376);
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 118) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
										if (Static138.method2445(local376) && Static304.aClass201ArrayArray1[local380] != null) {
											for (local392 = local384; local392 < local150; local392++) {
												local396 = Static187.aClass5_Sub12_Sub2_4.method5072();
												if (Static304.aClass201ArrayArray1[local380].length > local392 && Static304.aClass201ArrayArray1[local380][local392] != null) {
													Static304.aClass201ArrayArray1[local380][local392].anInt6514 = local396;
												}
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 50) {
										Static350.anInt6713 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static195.anInt3884 = Static190.anInt456;
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 7) {
										Static153.method2737();
										Static297.anInt5810 = -1;
										Static70.anInt1369 += 32;
										return true;
									} else if (Static297.anInt5810 == 212) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5115();
										if (Static187.aClass5_Sub12_Sub2_4.method5115() == 0) {
											Static138.aClass141Array1[local376] = new Class141();
										} else {
											Static187.aClass5_Sub12_Sub2_4.anInt5731--;
											Static138.aClass141Array1[local376] = new Class141(Static187.aClass5_Sub12_Sub2_4);
										}
										Static214.anInt4234 = Static190.anInt456;
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 57) {
										local127 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5113();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5100();
										if (Static138.method2445(local384)) {
											Static314.method5477(local380, local127);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 2) {
										Static339.anInt6582 = Static187.aClass5_Sub12_Sub2_4.method5086();
										Static286.anInt5623 = Static187.aClass5_Sub12_Sub2_4.method5068();
										for (@Pc(3996) Class5_Sub29 local3996 = (Class5_Sub29) Static343.aClass190_33.method5471(); local3996 != null; local3996 = (Class5_Sub29) Static343.aClass190_33.method5465()) {
											local380 = (int) (local3996.aLong235 & 0x3FFFL);
											local384 = (int) (local3996.aLong235 >> 14 & 0x3FFFL);
											local150 = (int) (local3996.aLong235 >> 28 & 0x3L);
											if (Static239.anInt4811 == local150 && Static339.anInt6582 <= local380 && Static339.anInt6582 + 8 > local380 && Static286.anInt5623 <= local384 && local384 < Static286.anInt5623 + 8) {
												local3996.method6005();
												Static109.method1938(local384, Static239.anInt4811, local380);
											}
										}
										for (@Pc(4059) Class5_Sub22 local4059 = (Class5_Sub22) Static28.aClass103_21.method2756(); local4059 != null; local4059 = (Class5_Sub22) Static28.aClass103_21.method2748()) {
											if (Static339.anInt6582 <= local4059.anInt2675 && Static339.anInt6582 + 8 > local4059.anInt2675 && local4059.anInt2674 >= Static286.anInt5623 && Static286.anInt5623 + 8 > local4059.anInt2674 && Static239.anInt4811 == local4059.anInt2669) {
												local4059.anInt2663 = 0;
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 102) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5067();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5074();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local150 = Static187.aClass5_Sub12_Sub2_4.method5075();
										if (local150 == 65535) {
											local150 = -1;
										}
										if (Static138.method2445(local384)) {
											Static287.method5003(local376, local380, local150);
											@Pc(4140) Class130 local4140 = Static322.method544(local150);
											Static262.method4615(local4140.anInt3844, local376, local4140.anInt3870, local4140.anInt3829);
											Static17.method310(local4140.anInt3877, local376, local4140.anInt3857, local4140.anInt3871);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 195) {
										Static22.anInt479 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static297.anInt5810 = -1;
										Static245.anInt4912 = Static190.anInt456;
										return true;
									} else if (Static297.anInt5810 == 90) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5113();
										if (Static138.method2445(local380)) {
											Static21.method436(local384, local376);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 244) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
										if (Static138.method2445(local376)) {
											Static77.method1412();
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 39) {
										if (Static32.anInt628 != -1) {
											Static123.method2173(0, Static32.anInt628);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 28) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5115();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5115();
										local150 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local392 = Static187.aClass5_Sub12_Sub2_4.method5115();
										local396 = Static187.aClass5_Sub12_Sub2_4.method5115();
										if (Static138.method2445(local376)) {
											Static319.method5551(local384, local392, local150, local380, local396, true);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 107) {
										local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
										local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local529 = local142;
										if (local2608) {
											local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
										}
										local3644 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local3649 = Static187.aClass5_Sub12_Sub2_4.method5072();
										local1893 = Static187.aClass5_Sub12_Sub2_4.method5115();
										@Pc(4327) long local4327 = local3649 + (local3644 << 32);
										@Pc(4329) boolean local4329 = false;
										local2838 = 0;
										while (true) {
											if (local2838 >= 100) {
												if (local1893 <= 1) {
													if (Static230.aBoolean377 && !Static312.aBoolean510 || Static14.aBoolean26) {
														local4329 = true;
													} else if (Static241.method4300(local529)) {
														local4329 = true;
													}
												}
												break;
											}
											if (Static144.aLongArray3[local2838] == local4327) {
												local4329 = true;
												break;
											}
											local2838++;
										}
										if (!local4329 && Static169.anInt6215 == 0) {
											Static144.aLongArray3[Static353.anInt6775] = local4327;
											Static353.anInt6775 = (Static353.anInt6775 + 1) % 100;
											@Pc(4394) String local4394 = Static34.method568(Static230.method4147(Static166.method3024(Static187.aClass5_Sub12_Sub2_4)));
											if (local1893 == 2) {
												Static7.method123("<img=1>" + local142, -1, 0, null, 7, local4394, "<img=1>" + local529);
											} else if (local1893 == 1) {
												Static7.method123("<img=0>" + local142, -1, 0, null, 7, local4394, "<img=0>" + local529);
											} else {
												Static7.method123(local142, -1, 0, null, 3, local4394, local529);
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 236) {
										if (Static110.aFrame4 != null) {
											Static198.method3483(-1, false, -1, Static223.anInt4410);
										}
										@Pc(4475) byte[] local4475 = new byte[Static54.anInt1000];
										Static187.aClass5_Sub12_Sub2_4.method5122(local4475, Static54.anInt1000);
										local142 = Static315.method5537(local4475, Static54.anInt1000, 0);
										Static309.method5419(local142, Static182.aClass139_5, Static342.anInt6605 == 1, true);
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 204) {
										local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
										local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local529 = local142;
										if (local2608) {
											local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
										}
										local3644 = Static187.aClass5_Sub12_Sub2_4.method5099();
										local3649 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local3654 = Static187.aClass5_Sub12_Sub2_4.method5072();
										local200 = Static187.aClass5_Sub12_Sub2_4.method5115();
										@Pc(4553) long local4553 = (local3649 << 32) + local3654;
										@Pc(4555) boolean local4555 = false;
										@Pc(4557) int local4557 = 0;
										while (true) {
											if (local4557 >= 100) {
												if (local200 <= 1) {
													if (Static230.aBoolean377 && !Static312.aBoolean510 || Static14.aBoolean26) {
														local4555 = true;
													} else if (Static241.method4300(local529)) {
														local4555 = true;
													}
												}
												break;
											}
											if (local4553 == Static144.aLongArray3[local4557]) {
												local4555 = true;
												break;
											}
											local4557++;
										}
										if (!local4555 && Static169.anInt6215 == 0) {
											Static144.aLongArray3[Static353.anInt6775] = local4553;
											Static353.anInt6775 = (Static353.anInt6775 + 1) % 100;
											local2874 = Static34.method568(Static230.method4147(Static166.method3024(Static187.aClass5_Sub12_Sub2_4)));
											if (local200 == 2 || local200 == 3) {
												Static7.method123("<img=1>" + local142, -1, 0, Static275.method4840(local3644), 9, local2874, "<img=1>" + local529);
											} else if (local200 == 1) {
												Static7.method123("<img=0>" + local142, -1, 0, Static275.method4840(local3644), 9, local2874, "<img=0>" + local529);
											} else {
												Static7.method123(local142, -1, 0, Static275.method4840(local3644), 9, local2874, local529);
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 185) {
										Static247.anInt4950 = Static187.aClass5_Sub12_Sub2_4.method5115();
										anInt3754 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static261.anInt5133 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 49) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5074();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5090();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5106();
										if (Static138.method2445(local384)) {
											@Pc(4737) Class5_Sub18 local4737 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local380);
											local1063 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local376);
											if (local1063 != null) {
												Static78.method1417(local4737 == null || local4737.anInt1871 != local1063.anInt1871, false, local1063);
											}
											if (local4737 != null) {
												local4737.method6005();
												Static198.aClass190_21.method5464(local4737, (long) local376);
											}
											@Pc(4779) Class201 local4779 = Static262.method4616(local380);
											if (local4779 != null) {
												Static189.method3383(local4779);
											}
											local4779 = Static262.method4616(local376);
											if (local4779 != null) {
												Static189.method3383(local4779);
												Static172.method4060(true, local4779);
											}
											if (Static32.anInt628 != -1) {
												Static123.method2173(1, Static32.anInt628);
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 245) {
										Static49.method4428();
										Static297.anInt5810 = -1;
										return false;
									} else if (Static297.anInt5810 == 149) {
										Static198.method3488();
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 16) {
										Static186.anInt3700 = Static190.anInt456;
										if (Static54.anInt1000 == 0) {
											Static297.anInt5810 = -1;
											Static49.aClass157Array2 = null;
											Static247.anInt4953 = 0;
											Static348.aString64 = null;
											Static176.aString23 = null;
											return true;
										}
										Static348.aString64 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
										if (local2608) {
											Static187.aClass5_Sub12_Sub2_4.method5064();
										}
										@Pc(4876) long local4876 = Static187.aClass5_Sub12_Sub2_4.method5099();
										Static176.aString23 = Static289.method5017(local4876);
										Static104.aByte1 = Static187.aClass5_Sub12_Sub2_4.method5098();
										local150 = Static187.aClass5_Sub12_Sub2_4.method5115();
										if (local150 == 255) {
											Static297.anInt5810 = -1;
											return true;
										}
										Static247.anInt4953 = local150;
										@Pc(4902) Class157[] local4902 = new Class157[100];
										for (local396 = 0; local396 < Static247.anInt4953; local396++) {
											local4902[local396] = new Class157();
											local4902[local396].aString45 = Static187.aClass5_Sub12_Sub2_4.method5064();
											local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
											if (local2608) {
												local4902[local396].aString44 = Static187.aClass5_Sub12_Sub2_4.method5064();
											} else {
												local4902[local396].aString44 = local4902[local396].aString45;
											}
											local4902[local396].anInt4825 = Static187.aClass5_Sub12_Sub2_4.method5106();
											local4902[local396].aByte39 = Static187.aClass5_Sub12_Sub2_4.method5098();
											local4902[local396].aString46 = Static187.aClass5_Sub12_Sub2_4.method5064();
											if (local4902[local396].aString44.equals(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40)) {
												Static125.aByte3 = local4902[local396].aByte39;
											}
										}
										local190 = Static247.anInt4953;
										while (local190 > 0) {
											local1745 = true;
											local190--;
											for (local200 = 0; local200 < local190; local200++) {
												if (local4902[local200].aString45.compareTo(local4902[local200 + 1].aString45) > 0) {
													local171 = local4902[local200];
													local4902[local200] = local4902[local200 + 1];
													local1745 = false;
													local4902[local200 + 1] = local171;
												}
											}
											if (local1745) {
												break;
											}
										}
										Static49.aClass157Array2 = local4902;
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 136) {
										Static346.anInt6667 = Static187.aClass5_Sub12_Sub2_4.method5115();
										for (local376 = 0; local376 < Static346.anInt6667; local376++) {
											Static25.aStringArray52[local376] = Static187.aClass5_Sub12_Sub2_4.method5064();
											Static253.aStringArray51[local376] = Static187.aClass5_Sub12_Sub2_4.method5064();
											if (Static253.aStringArray51[local376].equals("")) {
												Static253.aStringArray51[local376] = Static25.aStringArray52[local376];
											}
											Static222.aStringArray48[local376] = Static187.aClass5_Sub12_Sub2_4.method5064();
											Static178.aStringArray42[local376] = Static187.aClass5_Sub12_Sub2_4.method5064();
											if (Static178.aStringArray42[local376].equals("")) {
												Static178.aStringArray42[local376] = Static222.aStringArray48[local376];
											}
											Static211.aBooleanArray17[local376] = false;
										}
										Static297.anInt5810 = -1;
										Static195.anInt3884 = Static190.anInt456;
										return true;
									} else if (Static297.anInt5810 == 5) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5101();
										local136 = (local380 & 0x1) == 1;
										Static318.method5547(local136, local376);
										Static334.anIntArray602[Static320.anInt6194++ & 0x1F] = local376;
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 89) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5100();
										local150 = Static187.aClass5_Sub12_Sub2_4.method5090();
										local392 = Static187.aClass5_Sub12_Sub2_4.method5075();
										if (Static138.method2445(local376)) {
											Static262.method4615(local392, local150, local380, local384);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 26) {
										for (local376 = 0; local376 < Static62.aClass4_Sub5_Sub2_Sub1Array1.length; local376++) {
											if (Static62.aClass4_Sub5_Sub2_Sub1Array1[local376] != null) {
												Static62.aClass4_Sub5_Sub2_Sub1Array1[local376].anInt5383 = -1;
											}
										}
										for (local380 = 0; local380 < Static280.aClass4_Sub5_Sub2_Sub2Array1.length; local380++) {
											if (Static280.aClass4_Sub5_Sub2_Sub2Array1[local380] != null) {
												Static280.aClass4_Sub5_Sub2_Sub2Array1[local380].anInt5383 = -1;
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 81) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5097();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5075();
										if (Static138.method2445(local380)) {
											Static330.method5727(2047, 5, local376, 0);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 119) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5113();
										local2274 = Static187.aClass5_Sub12_Sub2_4.method5098();
										Static157.method2789(local376, local2274);
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 202) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5106();
										if (local376 == 65535) {
											local376 = -1;
										}
										local380 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5090();
										if (Static138.method2445(local380)) {
											Static355.method6034(local384, local376);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 58) {
										Static29.anInt594 = Static187.aClass5_Sub12_Sub2_4.method5066();
										Static297.anInt5810 = -1;
										Static245.anInt4912 = Static190.anInt456;
										return true;
									} else if (Static297.anInt5810 == 140) {
										Static23.method446();
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 219) {
										Static271.anInt5299 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 82) {
										Static339.anInt6582 = Static187.aClass5_Sub12_Sub2_4.method5115();
										Static286.anInt5623 = Static187.aClass5_Sub12_Sub2_4.method5115();
										while (Static187.aClass5_Sub12_Sub2_4.anInt5731 < Static54.anInt1000) {
											Static297.anInt5810 = Static187.aClass5_Sub12_Sub2_4.method5115();
											Static227.method4123();
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 131) {
										local376 = Static187.aClass5_Sub12_Sub2_4.method5067();
										local380 = Static187.aClass5_Sub12_Sub2_4.method5086();
										local384 = Static187.aClass5_Sub12_Sub2_4.method5100();
										if (Static138.method2445(local384)) {
											Static80.method1435(local380, local376);
										}
										Static297.anInt5810 = -1;
										return true;
									} else if (Static297.anInt5810 == 188) {
										local2608 = Static187.aClass5_Sub12_Sub2_4.method5115() == 1;
										local142 = Static187.aClass5_Sub12_Sub2_4.method5064();
										local529 = local142;
										if (local2608) {
											local529 = Static187.aClass5_Sub12_Sub2_4.method5064();
										}
										local3644 = Static187.aClass5_Sub12_Sub2_4.method5106();
										local3649 = Static187.aClass5_Sub12_Sub2_4.method5072();
										local1893 = Static187.aClass5_Sub12_Sub2_4.method5115();
										local190 = Static187.aClass5_Sub12_Sub2_4.method5106();
										@Pc(5495) long local5495 = (local3644 << 32) + local3649;
										@Pc(5497) boolean local5497 = false;
										@Pc(5499) int local5499 = 0;
										while (true) {
											if (local5499 >= 100) {
												if (local1893 <= 1 && Static241.method4300(local529)) {
													local5497 = true;
												}
												break;
											}
											if (Static144.aLongArray3[local5499] == local5495) {
												local5497 = true;
												break;
											}
											local5499++;
										}
										if (!local5497 && Static169.anInt6215 == 0) {
											Static144.aLongArray3[Static353.anInt6775] = local5495;
											Static353.anInt6775 = (Static353.anInt6775 + 1) % 100;
											local2856 = Static234.method4160(local190).method5349(Static187.aClass5_Sub12_Sub2_4);
											if (local1893 == 2) {
												Static7.method123("<img=1>" + local142, local190, 0, null, 18, local2856, "<img=1>" + local529);
											} else if (local1893 == 1) {
												Static7.method123("<img=0>" + local142, local190, 0, null, 18, local2856, "<img=0>" + local529);
											} else {
												Static7.method123(local142, local190, 0, null, 18, local2856, local529);
											}
										}
										Static297.anInt5810 = -1;
										return true;
									} else {
										Static114.method1992(null, "T1 - " + Static297.anInt5810 + "," + Static203.anInt5016 + "," + Static52.anInt972 + " - " + Static54.anInt1000);
										Static49.method4428();
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	public static void method3393() {
		Static99.aClass109_22.method2859(5);
	}
}
