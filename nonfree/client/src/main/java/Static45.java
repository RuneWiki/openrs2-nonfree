import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt1433;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_626 = Static59.method1195("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_627 = Static59.method1195("Regelversto-8 melden");

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_628 = Static59.method1195("sl_stars");

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_629 = aClass60_626;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_630 = Static59.method1195(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "[Lclient!ub;")
	public static Class76[] aClass76Array1 = new Class76[50];

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!qf;")
	public static Class60 aClass60_631 = Static59.method1195("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method985() {
		aClass60_631 = null;
		aClass60_626 = null;
		aClass60_628 = null;
		aClass76Array1 = null;
		aClass60_630 = null;
		aClass60_629 = null;
		aClass60_627 = null;
		anImage2 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method987() {
		if (Static112.anInt3110 != 1) {
			return;
		}
		if (Static130.anInt3486 >= 6 && Static130.anInt3486 <= 106 && Static84.anInt2576 >= 467 && Static84.anInt2576 <= 499) {
			Static27.anInt997 = (Static27.anInt997 + 1) % 4;
			Static71.aBoolean49 = true;
			Static85.aBoolean91 = true;
			Static81.aClass3_Sub12_Sub1_2.method1980(120);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static27.anInt997);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static57.anInt3392);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static61.anInt1942);
		}
		if (Static130.anInt3486 >= 135 && Static130.anInt3486 <= 235 && Static84.anInt2576 >= 467 && Static84.anInt2576 <= 499) {
			Static71.aBoolean49 = true;
			Static85.aBoolean91 = true;
			Static57.anInt3392 = (Static57.anInt3392 + 1) % 3;
			Static81.aClass3_Sub12_Sub1_2.method1980(120);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static27.anInt997);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static57.anInt3392);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static61.anInt1942);
		}
		if (Static130.anInt3486 >= 273 && Static130.anInt3486 <= 373 && Static84.anInt2576 >= 467 && Static84.anInt2576 <= 499) {
			Static85.aBoolean91 = true;
			Static61.anInt1942 = (Static61.anInt1942 + 1) % 3;
			Static71.aBoolean49 = true;
			Static81.aClass3_Sub12_Sub1_2.method1980(120);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static27.anInt997);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static57.anInt3392);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static61.anInt1942);
		}
		if (Static130.anInt3486 < 412 || Static130.anInt3486 > 512 || Static84.anInt2576 < 467 || Static84.anInt2576 > 499) {
			return;
		}
		if (Static79.anInt2467 != -1) {
			Static76.method1565(0, Static111.aClass60_1310, Static120.aClass60_1369);
			if (Static71.aClass60_661 != null) {
				Static76.method1565(0, Static71.aClass60_661, Static120.aClass60_1369);
				return;
			}
			return;
		}
		Static76.method1561();
		if (Static68.anInt2142 != -1) {
			Static3.aBoolean4 = false;
			Static120.aClass60_1373 = Static120.aClass60_1369;
			Static11.anInt346 = Static79.anInt2467 = Static68.anInt2142;
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lclient!p;")
	public static Class32 method989() {
		try {
			return (Class32) Class.forName("Class32_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method991() {
		Static109.anInt3083 = 0;
		@Pc(163) int local163;
		for (@Pc(15) int local15 = -1; local15 < Static20.anInt829 + Static53.anInt1744; local15++) {
			@Pc(22) Class3_Sub1_Sub1_Sub3 local22;
			if (local15 == -1) {
				local22 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1;
			} else if (local15 < Static53.anInt1744) {
				local22 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local15]];
			} else {
				local22 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local15 - Static53.anInt1744]];
			}
			if (local22 != null && local22.method1023()) {
				@Pc(59) Class3_Sub1_Sub16 local59;
				if (local22 instanceof Class3_Sub1_Sub1_Sub3_Sub2) {
					local59 = ((Class3_Sub1_Sub1_Sub3_Sub2) local22).aClass3_Sub1_Sub16_1;
					if (local59.anIntArray334 != null) {
						local59 = local59.method2093();
					}
					if (local59 == null) {
						continue;
					}
				}
				if (Static53.anInt1744 <= local15) {
					local59 = ((Class3_Sub1_Sub1_Sub3_Sub2) local22).aClass3_Sub1_Sub16_1;
					if (local59.anIntArray334 != null) {
						local59 = local59.method2093();
					}
					if (local59.anInt3147 >= 0 && Static24.aClass3_Sub1_Sub2_Sub3Array3.length > local59.anInt3147) {
						Static114.method2111(local22, local22.anInt1496 + 15);
						if (Static65.anInt2053 > -1) {
							Static24.aClass3_Sub1_Sub2_Sub3Array3[local59.anInt3147].method1439(Static65.anInt2053 - 12, Static30.anInt1041 + -30);
						}
					}
					if (Static111.anInt3098 == 1 && Static100.anInt2954 == Static128.anIntArray390[local15 - Static53.anInt1744] && Static34.anInt1183 % 20 < 10) {
						Static114.method2111(local22, local22.anInt1496 + 15);
						if (Static65.anInt2053 > -1) {
							Static98.aClass3_Sub1_Sub2_Sub3Array6[0].method1439(Static65.anInt2053 - 12, Static30.anInt1041 - 28);
						}
					}
				} else {
					@Pc(161) Class3_Sub1_Sub1_Sub3_Sub1 local161 = (Class3_Sub1_Sub1_Sub3_Sub1) local22;
					local163 = 30;
					if (local161.anInt628 != -1 || local161.anInt639 != -1) {
						Static114.method2111(local22, local22.anInt1496 + 15);
						if (Static65.anInt2053 > -1) {
							if (local161.anInt628 != -1) {
								Static54.aClass3_Sub1_Sub2_Sub3Array4[local161.anInt628].method1439(Static65.anInt2053 - 12, Static30.anInt1041 + -30);
								local163 += 25;
							}
							if (local161.anInt639 != -1) {
								Static24.aClass3_Sub1_Sub2_Sub3Array3[local161.anInt639].method1439(Static65.anInt2053 - 12, -local163 + Static30.anInt1041);
								local163 += 25;
							}
						}
					}
					if (local15 >= 0 && Static111.anInt3098 == 10 && Static14.anIntArray56[local15] == Static124.anInt3223) {
						Static114.method2111(local22, local22.anInt1496 + 15);
						if (Static65.anInt2053 > -1) {
							Static98.aClass3_Sub1_Sub2_Sub3Array6[1].method1439(Static65.anInt2053 - 12, Static30.anInt1041 - local163);
						}
					}
				}
				if (local22.aClass60_656 != null && (local15 >= Static53.anInt1744 || Static27.anInt997 == 0 || Static27.anInt997 == 3 || Static27.anInt997 == 1 && Static67.method1384(((Class3_Sub1_Sub1_Sub3_Sub1) local22).aClass60_245))) {
					Static114.method2111(local22, local22.anInt1496);
					if (Static65.anInt2053 > -1 && Static109.anInt3083 < Static81.anInt2536) {
						Static81.anIntArray260[Static109.anInt3083] = Static123.aClass3_Sub1_Sub2_Sub2_4.method848(local22.aClass60_656) / 2;
						Static81.anIntArray261[Static109.anInt3083] = Static123.aClass3_Sub1_Sub2_Sub2_4.anInt1258;
						Static81.anIntArray254[Static109.anInt3083] = Static65.anInt2053;
						Static81.anIntArray258[Static109.anInt3083] = Static30.anInt1041;
						Static81.anIntArray259[Static109.anInt3083] = local22.anInt1534;
						Static81.anIntArray256[Static109.anInt3083] = local22.anInt1499;
						Static81.anIntArray255[Static109.anInt3083] = local22.anInt1527;
						Static81.aClass60Array17[Static109.anInt3083] = local22.aClass60_656;
						Static109.anInt3083++;
					}
				}
				if (local22.anInt1519 > Static34.anInt1183) {
					Static114.method2111(local22, local22.anInt1496 + 15);
					if (Static65.anInt2053 > -1) {
						local163 = local22.anInt1513 * 30 / local22.anInt1483;
						if (local163 > 30) {
							local163 = 30;
						}
						Static40.method1893(Static65.anInt2053 - 15, Static30.anInt1041 + -3, local163, 5, 65280);
						Static40.method1893(Static65.anInt2053 + local163 - 15, Static30.anInt1041 + -3, 30 - local163, 5, 16711680);
					}
				}
				for (local163 = 0; local163 < 4; local163++) {
					if (Static34.anInt1183 < local22.anIntArray183[local163]) {
						Static114.method2111(local22, local22.anInt1496 / 2);
						if (Static65.anInt2053 > -1) {
							if (local163 == 1) {
								Static30.anInt1041 -= 20;
							}
							if (local163 == 2) {
								Static30.anInt1041 -= 10;
								Static65.anInt2053 -= 15;
							}
							if (local163 == 3) {
								Static30.anInt1041 -= 10;
								Static65.anInt2053 += 15;
							}
							Static14.aClass3_Sub1_Sub2_Sub3Array1[local22.anIntArray182[local163]].method1439(Static65.anInt2053 - 12, Static30.anInt1041 - 12);
							Static20.aClass3_Sub1_Sub2_Sub2_1.method842(Static65.method1341(local22.anIntArray180[local163]), Static65.anInt2053 - 1, Static30.anInt1041 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(490) int local490 = 0; local490 < Static109.anInt3083; local490++) {
			local163 = Static81.anIntArray254[local490];
			@Pc(500) int local500 = Static81.anIntArray261[local490];
			@Pc(504) int local504 = Static81.anIntArray258[local490];
			@Pc(508) int local508 = Static81.anIntArray260[local490];
			@Pc(510) boolean local510 = true;
			while (local510) {
				local510 = false;
				for (@Pc(516) int local516 = 0; local516 < local490; local516++) {
					if (local504 + 2 > Static81.anIntArray258[local516] + -Static81.anIntArray261[local516] && Static81.anIntArray258[local516] + 2 > local504 + -local500 && local163 - local508 < Static81.anIntArray260[local516] + Static81.anIntArray254[local516] && local508 + local163 > Static81.anIntArray254[local516] - Static81.anIntArray260[local516] && Static81.anIntArray258[local516] - Static81.anIntArray261[local516] < local504) {
						local510 = true;
						local504 = Static81.anIntArray258[local516] - Static81.anIntArray261[local516];
					}
				}
			}
			Static65.anInt2053 = Static81.anIntArray254[local490];
			Static30.anInt1041 = Static81.anIntArray258[local490] = local504;
			@Pc(615) Class60 local615 = Static81.aClass60Array17[local490];
			if (Static58.anInt1808 == 0) {
				@Pc(619) int local619 = 16776960;
				if (Static81.anIntArray259[local490] < 6) {
					local619 = Static11.anIntArray50[Static81.anIntArray259[local490]];
				}
				if (Static81.anIntArray259[local490] == 6) {
					local619 = Static130.anInt3484 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static81.anIntArray259[local490] == 7) {
					local619 = Static130.anInt3484 % 20 < 10 ? 255 : 65535;
				}
				if (Static81.anIntArray259[local490] == 8) {
					local619 = Static130.anInt3484 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(692) int local692;
				if (Static81.anIntArray259[local490] == 9) {
					local692 = 150 - Static81.anIntArray255[local490];
					if (local692 < 50) {
						local619 = local692 * 1280 + 16711680;
					} else if (local692 < 100) {
						local619 = 16776960 + 16384000 - local692 * 327680;
					} else if (local692 < 150) {
						local619 = (local692 - 100) * 5 + 65280;
					}
				}
				if (Static81.anIntArray259[local490] == 10) {
					local692 = 150 - Static81.anIntArray255[local490];
					if (local692 < 50) {
						local619 = local692 * 5 + 16711680;
					} else if (local692 < 100) {
						local619 = 33095935 - local692 * 327680;
					} else if (local692 < 150) {
						local619 = local692 * 327680 - (local692 - 100) * 5 - 32767745;
					}
				}
				if (Static81.anIntArray259[local490] == 11) {
					local692 = 150 - Static81.anIntArray255[local490];
					if (local692 < 50) {
						local619 = 16777215 - local692 * 327685;
					} else if (local692 < 100) {
						local619 = local692 * 327685 + 65280 - 16384250;
					} else if (local692 < 150) {
						local619 = 16777215 - (local692 - 100) * 327680;
					}
				}
				if (Static81.anIntArray256[local490] == 0) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method842(local615, Static65.anInt2053, Static30.anInt1041, local619, 0);
				}
				if (Static81.anIntArray256[local490] == 1) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method841(local615, Static65.anInt2053, Static30.anInt1041, local619, Static130.anInt3484);
				}
				if (Static81.anIntArray256[local490] == 2) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method831(local615, Static65.anInt2053, Static30.anInt1041, local619, Static130.anInt3484);
				}
				if (Static81.anIntArray256[local490] == 3) {
					Static123.aClass3_Sub1_Sub2_Sub2_4.method849(local615, Static65.anInt2053, Static30.anInt1041, local619, Static130.anInt3484, 150 - Static81.anIntArray255[local490]);
				}
				@Pc(925) int local925;
				if (Static81.anIntArray256[local490] == 4) {
					local692 = Static123.aClass3_Sub1_Sub2_Sub2_4.method848(local615);
					local925 = (150 - Static81.anIntArray255[local490]) * (local692 + 100) / 150;
					Static40.method1891(Static65.anInt2053 - 50, 0, Static65.anInt2053 + 50, 334);
					Static123.aClass3_Sub1_Sub2_Sub2_4.method847(local615, Static65.anInt2053 + 50 - local925, Static30.anInt1041, local619, 0);
					Static40.method1896();
				}
				if (Static81.anIntArray256[local490] == 5) {
					local692 = 150 - Static81.anIntArray255[local490];
					local925 = 0;
					if (local692 < 25) {
						local925 = local692 - 25;
					} else if (local692 > 125) {
						local925 = local692 - 125;
					}
					Static40.method1891(0, Static30.anInt1041 - Static123.aClass3_Sub1_Sub2_Sub2_4.anInt1258 - 1, 512, Static30.anInt1041 + 5);
					Static123.aClass3_Sub1_Sub2_Sub2_4.method842(local615, Static65.anInt2053, local925 + Static30.anInt1041, local619, 0);
					Static40.method1896();
				}
			} else {
				Static123.aClass3_Sub1_Sub2_Sub2_4.method842(local615, Static65.anInt2053, Static30.anInt1041, 16776960, 0);
			}
		}
	}
}
