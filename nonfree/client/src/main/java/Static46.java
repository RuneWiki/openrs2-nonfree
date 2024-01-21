import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!ke;")
	public static Class43 aClass43_12;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
	public static int anInt1219;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "Z")
	public static boolean aBoolean62;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Lclient!sg;")
	public static Class77 aClass77_481 = Static146.method2172(" )2> ");

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "[Lclient!sd;")
	public static Class76[] aClass76Array1 = new Class76[50];

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!ua;")
	public static Class82 aClass82_17 = new Class82(30);

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public static int anInt1207 = 0;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "Lclient!ua;")
	public static Class82 aClass82_18 = new Class82(30);

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_486 = Static146.method2172("Close");

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_482 = aClass77_486;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_483 = Static146.method2172("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_484 = Static146.method2172("hitmarks");

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_485 = Static146.method2172("(Y<)4col>");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method842() {
		for (@Pc(13) int local13 = 0; local13 < Static174.anInt4449; local13++) {
			@Pc(19) int local19 = Static6.anIntArray25[local13];
			@Pc(23) Class2_Sub2_Sub1_Sub6_Sub2 local23 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local19];
			@Pc(27) int local27 = Static74.aClass2_Sub18_Sub1_1.method2387();
			if ((local27 & 0x40) != 0) {
				local23.aClass2_Sub2_Sub16_1 = Static131.method2901(Static74.aClass2_Sub18_Sub1_1.method2363());
				local23.anInt4412 = local23.aClass2_Sub2_Sub16_1.anInt3785;
				local23.anInt4407 = local23.aClass2_Sub2_Sub16_1.anInt3764;
				local23.anInt4388 = local23.aClass2_Sub2_Sub16_1.anInt3767;
				local23.anInt4413 = local23.aClass2_Sub2_Sub16_1.anInt3778;
				local23.anInt4409 = local23.aClass2_Sub2_Sub16_1.anInt3766;
				local23.anInt4418 = local23.aClass2_Sub2_Sub16_1.anInt3769;
				local23.anInt4425 = local23.aClass2_Sub2_Sub16_1.anInt3783;
				local23.anInt4380 = local23.aClass2_Sub2_Sub16_1.anInt3768;
				local23.anInt4397 = local23.aClass2_Sub2_Sub16_1.anInt3781;
			}
			@Pc(94) int local94;
			@Pc(98) int local98;
			if ((local27 & 0x10) != 0) {
				local94 = Static74.aClass2_Sub18_Sub1_1.method2377();
				local98 = Static74.aClass2_Sub18_Sub1_1.method2374();
				local23.method2915(local94, local98, Static143.anInt3513);
				local23.anInt4420 = Static143.anInt3513 + 300;
				local23.anInt4427 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local23.anInt4384 = Static74.aClass2_Sub18_Sub1_1.method2374();
			}
			if ((local27 & 0x80) != 0) {
				local94 = Static74.aClass2_Sub18_Sub1_1.method2363();
				local98 = Static74.aClass2_Sub18_Sub1_1.method2374();
				if (local94 == 65535) {
					local94 = -1;
				}
				if (local94 == local23.anInt4399 && local94 != -1) {
					@Pc(151) int local151 = Static140.method2333(local94).anInt3724;
					if (local151 == 1) {
						local23.anInt4406 = 0;
						local23.anInt4394 = 0;
						local23.anInt4376 = local98;
						local23.anInt4408 = 0;
					}
					if (local151 == 2) {
						local23.anInt4408 = 0;
					}
				} else if (local94 == -1 || local23.anInt4399 == -1 || Static140.method2333(local94).anInt3730 >= Static140.method2333(local23.anInt4399).anInt3730) {
					local23.anInt4399 = local94;
					local23.anInt4408 = 0;
					local23.anInt4406 = 0;
					local23.anInt4421 = local23.anInt4403;
					local23.anInt4376 = local98;
					local23.anInt4394 = 0;
				}
			}
			if ((local27 & 0x4) != 0) {
				local23.anInt4417 = Static74.aClass2_Sub18_Sub1_1.method2379();
				local23.anInt4371 = Static74.aClass2_Sub18_Sub1_1.method2363();
			}
			if ((local27 & 0x1) != 0) {
				local23.anInt4402 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local23.anInt4402 == 65535) {
					local23.anInt4402 = -1;
				}
			}
			if ((local27 & 0x20) != 0) {
				local23.anInt4404 = Static74.aClass2_Sub18_Sub1_1.method2395();
				local94 = Static74.aClass2_Sub18_Sub1_1.method2373();
				if (local23.anInt4404 == 65535) {
					local23.anInt4404 = -1;
				}
				local23.anInt4382 = (local94 & 0xFFFF) + Static143.anInt3513;
				local23.anInt4379 = local94 >> 16;
				local23.anInt4411 = 0;
				local23.anInt4390 = 0;
				if (local23.anInt4382 > Static143.anInt3513) {
					local23.anInt4390 = -1;
				}
			}
			if ((local27 & 0x2) != 0) {
				local23.aClass77_1508 = Static74.aClass2_Sub18_Sub1_1.method2361();
				local23.anInt4419 = 100;
			}
			if ((local27 & 0x8) != 0) {
				local94 = Static74.aClass2_Sub18_Sub1_1.method2352();
				local98 = Static74.aClass2_Sub18_Sub1_1.method2352();
				local23.method2915(local94, local98, Static143.anInt3513);
				local23.anInt4420 = Static143.anInt3513 + 300;
				local23.anInt4427 = Static74.aClass2_Sub18_Sub1_1.method2352();
				local23.anInt4384 = Static74.aClass2_Sub18_Sub1_1.method2387();
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!mg;)V")
	public static void method843(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static48.aBoolean67) {
			Static39.method772(arg0);
			return;
		}
		if (Static50.anInt1384 == 1 && Static156.anInt3884 >= 715 && Static38.anInt1113 >= 453) {
			Static92.aBoolean102 = !Static92.aBoolean102;
			if (Static92.aBoolean102) {
				Static54.method1030();
			} else {
				Static57.method2985(Static91.aClass77_916, Static39.aClass77_451, Static176.aClass43_Sub1_20);
			}
		}
		if (Static97.anInt2440 == 5) {
			return;
		}
		Static25.anInt734++;
		if (Static97.anInt2440 != 10) {
			return;
		}
		if (Static164.anInt4022 != 2 && Static136.anInt3303 == 0) {
			if (Static50.anInt1384 == 1 && Static156.anInt3884 >= 5 && Static156.anInt3884 <= 105 && Static38.anInt1113 >= 463 && Static38.anInt1113 <= 498) {
				Static11.method176();
				return;
			}
			if (Static23.aClass58_1 != null) {
				Static11.method176();
			}
		}
		@Pc(119) int local119 = Static156.anInt3884;
		@Pc(121) int local121 = Static50.anInt1384;
		@Pc(123) int local123 = Static38.anInt1113;
		if (Static24.anInt729 == 0) {
			if (local121 == 1 && local119 >= 227 && local119 <= 377 && local123 >= 271 && local123 <= 311) {
				Static9.anInt261 = 0;
				Static24.anInt729 = 3;
			}
			@Pc(533) boolean local533 = false;
			if (Static18.anInt619 != 0) {
				while (Static173.method2918()) {
					if (Static53.anInt1463 == 84) {
						local533 = true;
						break;
					}
				}
			}
			if (local533 || local121 == 1 && local119 >= 387 && local119 <= 537 && local123 >= 271 && local123 <= 311) {
				Static24.anInt729 = 2;
				Static39.aClass77_443 = Static7.aClass77_109;
				Static9.anInt261 = 0;
				Static39.aClass77_448 = Static7.aClass77_121;
				Static39.aClass77_439 = Static122.aClass77_223;
			}
			return;
		}
		if (Static24.anInt729 == 2) {
			@Pc(133) short local133 = 231;
			@Pc(136) int local136 = local133 + 30;
			if (local121 == 1 && local123 >= 246 && local123 < 261) {
				Static9.anInt261 = 0;
			}
			local136 += 15;
			if (local121 == 1 && local123 >= 261 && local123 < 276) {
				Static9.anInt261 = 1;
			}
			local136 += 15;
			if (local121 == 1 && local119 >= 227 && local119 <= 377 && local123 >= 301 && local123 <= 341) {
				Static39.aClass77_446 = Static39.aClass77_446.method2516().method2525();
				if (Static39.aClass77_446.method2532() == 0) {
					Static128.method2194(Static7.aClass77_103, Static7.aClass77_94, Static106.aClass77_1011);
					return;
				}
				if (Static39.aClass77_445.method2532() == 0) {
					Static128.method2194(Static7.aClass77_120, Static7.aClass77_86, Static138.aClass77_1199);
					return;
				}
				Static128.method2194(Static7.aClass77_85, Static7.aClass77_115, Static54.aClass77_581);
				Static123.method2155(20);
				return;
			}
			if (local121 == 1 && local119 >= 387 && local119 <= 537 && local123 >= 301 && local123 <= 341) {
				Static24.anInt729 = 0;
				Static39.aClass77_446 = Static39.aClass77_451;
				Static39.aClass77_445 = Static39.aClass77_451;
			}
			while (true) {
				@Pc(291) boolean local291;
				label203: do {
					while (Static173.method2918()) {
						local291 = false;
						for (@Pc(293) int local293 = 0; Static31.aClass77_369.method2532() > local293; local293++) {
							if (Static33.anInt968 == Static31.aClass77_369.method2526(local293)) {
								local291 = true;
								break;
							}
						}
						if (Static9.anInt261 != 0) {
							continue label203;
						}
						if (Static53.anInt1463 == 85 && Static39.aClass77_446.method2532() > 0) {
							Static39.aClass77_446 = Static39.aClass77_446.method2530(0, Static39.aClass77_446.method2532() - 1);
						}
						if (Static53.anInt1463 == 84 || Static53.anInt1463 == 80) {
							Static9.anInt261 = 1;
						}
						if (local291 && Static39.aClass77_446.method2532() < 12) {
							Static39.aClass77_446 = Static39.aClass77_446.method2535(Static33.anInt968);
						}
					}
					return;
				} while (Static9.anInt261 != 1);
				if (Static53.anInt1463 == 85 && Static39.aClass77_445.method2532() > 0) {
					Static39.aClass77_445 = Static39.aClass77_445.method2530(0, Static39.aClass77_445.method2532() - 1);
				}
				if (Static53.anInt1463 == 84 || Static53.anInt1463 == 80) {
					Static9.anInt261 = 0;
				}
				if (Static18.anInt619 != 0 && Static53.anInt1463 == 84) {
					Static39.aClass77_446 = Static39.aClass77_446.method2516().method2525();
					if (Static39.aClass77_446.method2532() == 0) {
						Static128.method2194(Static7.aClass77_103, Static7.aClass77_94, Static106.aClass77_1011);
						return;
					}
					if (Static39.aClass77_445.method2532() == 0) {
						Static128.method2194(Static7.aClass77_120, Static7.aClass77_86, Static138.aClass77_1199);
						return;
					}
					Static128.method2194(Static7.aClass77_85, Static7.aClass77_115, Static54.aClass77_581);
					Static123.method2155(20);
					return;
				}
				if (local291 && Static39.aClass77_445.method2532() < 20) {
					Static39.aClass77_445 = Static39.aClass77_445.method2535(Static33.anInt968);
				}
			}
		}
		if (Static24.anInt729 == 3 && local121 == 1 && local119 >= 307 && local119 <= 457 && local123 >= 301 && local123 <= 341) {
			Static24.anInt729 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method844() {
		aClass77_484 = null;
		aClass82_18 = null;
		aClass82_17 = null;
		aClass77_482 = null;
		aClass76Array1 = null;
		aClass77_485 = null;
		anIntArrayArray11 = null;
		aClass77_483 = null;
		aClass77_481 = null;
		aClass77_486 = null;
		aClass43_12 = null;
	}
}
