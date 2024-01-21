import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!od;")
	private static Class60 aClass60_526 = Static41.method597(" from your ignore list first");

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_519 = aClass60_526;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!od;")
	private static Class60 aClass60_520 = Static41.method597("Loaded update list");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_521 = Static41.method597("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_523 = Static41.method597("This world is full)3");

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_522 = aClass60_523;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!od;")
	private static Class60 aClass60_524 = Static41.method597("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!od;")
	private static Class60 aClass60_525 = Static41.method597(" has logged in)3");

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!od;")
	private static Class60 aClass60_529 = Static41.method597("flash2:");

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_527 = aClass60_529;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!od;")
	public static Class60 aClass60_528 = aClass60_524;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!od;")
	public static Class60 aClass60_530 = aClass60_525;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Lclient!od;")
	public static Class60 aClass60_531 = aClass60_529;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!od;")
	public static Class60 aClass60_532 = aClass60_520;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public static volatile int anInt1490 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Z")
	public static boolean method869() {
		if (Static72.aClass37_6 == null) {
			return false;
		}
		@Pc(143) int local143;
		try {
			@Pc(18) int local18 = Static72.aClass37_6.method876();
			if (local18 == 0) {
				return false;
			}
			if (Static40.anInt1058 == -1) {
				Static72.aClass37_6.method873(1, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
				local18--;
				Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
				Static40.anInt1058 = Static96.aClass4_Sub9_Sub1_2.method831();
				Static7.anInt79 = Static75.anIntArray126[Static40.anInt1058];
			}
			if (Static7.anInt79 == -1) {
				if (local18 <= 0) {
					return false;
				}
				local18--;
				Static72.aClass37_6.method873(1, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
				Static7.anInt79 = Static96.aClass4_Sub9_Sub1_2.aByteArray6[0] & 0xFF;
			}
			if (Static7.anInt79 == -2) {
				if (local18 <= 1) {
					return false;
				}
				local18 -= 2;
				Static72.aClass37_6.method873(2, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
				Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
				Static7.anInt79 = Static96.aClass4_Sub9_Sub1_2.method816();
			}
			if (Static7.anInt79 > local18) {
				return false;
			}
			Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
			Static72.aClass37_6.method873(Static7.anInt79, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
			Static26.anInt855 = Static79.anInt1904;
			Static79.anInt1904 = Static28.anInt2004;
			Static98.anInt2287 = 0;
			Static28.anInt2004 = Static40.anInt1058;
			if (Static40.anInt1058 == 187) {
				Static29.anInt897 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(164) int local164;
			@Pc(274) int local274;
			@Pc(280) int local280;
			@Pc(139) int local139;
			@Pc(147) int local147;
			@Pc(188) int local188;
			@Pc(192) int local192;
			@Pc(278) int local278;
			@Pc(230) Class4_Sub18 local230;
			@Pc(290) long local290;
			if (Static40.anInt1058 == 252) {
				local139 = Static96.aClass4_Sub9_Sub1_2.anInt1312 + Static7.anInt79;
				local143 = Static96.aClass4_Sub9_Sub1_2.method816();
				local147 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (Static52.anInt1452 != local143) {
					Static52.anInt1452 = local143;
					Static97.method1574(Static52.anInt1452);
					Static81.method1287(Static52.anInt1452);
					for (local164 = 0; local164 < 100; local164++) {
						Static105.aBooleanArray15[local164] = true;
					}
				}
				while (local147-- > 0) {
					local164 = Static96.aClass4_Sub9_Sub1_2.method780();
					local188 = Static96.aClass4_Sub9_Sub1_2.method816();
					local192 = Static96.aClass4_Sub9_Sub1_2.method773();
					@Pc(199) Class4_Sub18 local199 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local164);
					if (local199 != null && local199.anInt2589 != local188) {
						Static48.method661(true, local199);
						local199 = null;
					}
					if (local199 == null) {
						local199 = Static25.method449(local164, local188, local192);
					}
					local199.aBoolean113 = true;
				}
				for (local230 = (Class4_Sub18) Static78.aClass75_10.method1897(); local230 != null; local230 = (Class4_Sub18) Static78.aClass75_10.method1891()) {
					if (local230.aBoolean113) {
						local230.aBoolean113 = false;
					} else {
						Static48.method661(true, local230);
					}
				}
				Static128.aClass75_14 = new Class75(512);
				while (Static96.aClass4_Sub9_Sub1_2.anInt1312 < local139) {
					local188 = Static96.aClass4_Sub9_Sub1_2.method780();
					local192 = Static96.aClass4_Sub9_Sub1_2.method816();
					local274 = Static96.aClass4_Sub9_Sub1_2.method816();
					local278 = Static96.aClass4_Sub9_Sub1_2.method780();
					for (local280 = local192; local280 <= local274; local280++) {
						local290 = (long) local280 + ((long) local188 << 32);
						Static128.aClass75_14.method1892(local290, new Class4_Sub8(local278));
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 150) {
				if (Static52.anInt1452 != -1) {
					Static113.method818(0, Static52.anInt1452);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 86) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method780();
				@Pc(341) Class4_Sub18 local341 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local139);
				if (local341 != null) {
					Static48.method661(true, local341);
				}
				if (Static27.aClass4_Sub14_6 != null) {
					Static36.method558(Static27.aClass4_Sub14_6);
					Static27.aClass4_Sub14_6 = null;
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 13) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static108.method1788(local139);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 119) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method771();
				local143 = Static96.aClass4_Sub9_Sub1_2.method806();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static106.method1740(local143, local139);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 107) {
				Static123.method1923();
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 3) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method782();
				local143 = Static96.aClass4_Sub9_Sub1_2.method802();
				local147 = Static96.aClass4_Sub9_Sub1_2.method787();
				if (local143 == 65535) {
					local143 = -1;
				}
				local164 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (local164 == 65535) {
					local164 = -1;
				}
				for (local188 = local143; local188 <= local164; local188++) {
					@Pc(465) long local465 = (long) local188 + ((long) local147 << 32);
					@Pc(470) Class4 local470 = Static128.aClass75_14.method1896(local465);
					if (local470 != null) {
						local470.method1989();
					}
					Static128.aClass75_14.method1892(local465, new Class4_Sub8(local139));
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 110) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method813();
				local143 = Static96.aClass4_Sub9_Sub1_2.method769();
				Static84.anIntArray228[local143] = local139;
				if (local139 != Static53.anIntArray141[local143]) {
					Static53.anIntArray141[local143] = local139;
					Static1.method5(local143);
				}
				Static56.anIntArray150[Static91.anInt2130++ & 0x1F] = local143;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 15) {
				Static16.anInt552 = Static96.aClass4_Sub9_Sub1_2.method802() * 30;
				Static20.anInt705 = Static87.anInt2052;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 66) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method782();
				local143 = Static96.aClass4_Sub9_Sub1_2.method778();
				local147 = Static96.aClass4_Sub9_Sub1_2.method771();
				local230 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local139);
				if (local230 != null) {
					Static48.method661(local147 != local230.anInt2589, local230);
				}
				Static25.method449(local139, local147, local143);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 68) {
				Static43.method620(false);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 221) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method816();
				Static52.anInt1452 = local139;
				Static97.method1574(local139);
				Static81.method1287(Static52.anInt1452);
				for (local143 = 0; local143 < 100; local143++) {
					Static105.aBooleanArray15[local143] = true;
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 156) {
				Static131.method1978();
				Static109.anInt2593 = Static96.aClass4_Sub9_Sub1_2.method774();
				Static40.anInt1058 = -1;
				Static20.anInt705 = Static87.anInt2052;
				return true;
			}
			if (Static40.anInt1058 == 56) {
				Static37.anInt1028 = Static96.aClass4_Sub9_Sub1_2.method778();
				Static5.anInt66 = Static96.aClass4_Sub9_Sub1_2.method795();
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(705) Class4_Sub14 local705;
			if (Static40.anInt1058 == 10) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method780();
				local143 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (local139 < -70000) {
					local143 += 32768;
				}
				if (local139 >= 0) {
					local705 = Static61.method991(local139);
				} else {
					local705 = null;
				}
				while (Static7.anInt79 > Static96.aClass4_Sub9_Sub1_2.anInt1312) {
					local164 = Static96.aClass4_Sub9_Sub1_2.method770();
					local188 = Static96.aClass4_Sub9_Sub1_2.method816();
					local192 = 0;
					if (local188 != 0) {
						local192 = Static96.aClass4_Sub9_Sub1_2.method773();
						if (local192 == 255) {
							local192 = Static96.aClass4_Sub9_Sub1_2.method780();
						}
					}
					if (local705 != null && local164 >= 0 && local164 < local705.anIntArray312.length) {
						local705.anIntArray312[local164] = local188;
						local705.anIntArray311[local164] = local192;
					}
					Static33.method502(local192, local164, local143, local188 - 1);
				}
				if (local705 != null) {
					Static36.method558(local705);
				}
				Static131.method1978();
				Static110.anIntArray332[Static102.anInt2428++ & 0x1F] = local143 & 0x7FFF;
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(811) Class4_Sub14 local811;
			if (Static40.anInt1058 == 244) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method813();
				local811 = Static61.method991(local139);
				for (local147 = 0; local147 < local811.anIntArray312.length; local147++) {
					local811.anIntArray312[local147] = -1;
					local811.anIntArray312[local147] = 0;
				}
				Static36.method558(local811);
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(847) Class60 local847;
			if (Static40.anInt1058 == 85) {
				local847 = Static96.aClass4_Sub9_Sub1_2.method776();
				local143 = Static96.aClass4_Sub9_Sub1_2.method798();
				local147 = Static96.aClass4_Sub9_Sub1_2.method795();
				if (local147 >= 1 && local147 <= 8) {
					if (local847.method1318(Static31.aClass60_319)) {
						local847 = null;
					}
					Static79.aClass60Array13[local147 - 1] = local847;
					Static23.aBooleanArray3[local147 - 1] = local143 == 0;
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 71) {
				Static28.anInt2006 = Static96.aClass4_Sub9_Sub1_2.method773();
				if (Static28.anInt2006 == 1) {
					Static6.anInt72 = Static96.aClass4_Sub9_Sub1_2.method816();
				}
				if (Static28.anInt2006 >= 2 && Static28.anInt2006 <= 6) {
					if (Static28.anInt2006 == 2) {
						Static102.anInt2439 = 64;
						Static48.anInt1185 = 64;
					}
					if (Static28.anInt2006 == 3) {
						Static102.anInt2439 = 64;
						Static48.anInt1185 = 0;
					}
					if (Static28.anInt2006 == 4) {
						Static48.anInt1185 = 128;
						Static102.anInt2439 = 64;
					}
					if (Static28.anInt2006 == 5) {
						Static48.anInt1185 = 64;
						Static102.anInt2439 = 0;
					}
					if (Static28.anInt2006 == 6) {
						Static48.anInt1185 = 64;
						Static102.anInt2439 = 128;
					}
					Static28.anInt2006 = 2;
					Static36.anInt1012 = Static96.aClass4_Sub9_Sub1_2.method816();
					Static79.anInt1897 = Static96.aClass4_Sub9_Sub1_2.method816();
					Static106.anInt2491 = Static96.aClass4_Sub9_Sub1_2.method773();
				}
				if (Static28.anInt2006 == 10) {
					Static117.anInt2723 = Static96.aClass4_Sub9_Sub1_2.method816();
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 79) {
				Static67.aBoolean60 = true;
				Static111.anInt2638 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static65.anInt1642 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static18.anInt620 = Static96.aClass4_Sub9_Sub1_2.method816();
				Static68.anInt1707 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static3.anInt44 = Static96.aClass4_Sub9_Sub1_2.method773();
				if (Static3.anInt44 >= 100) {
					local143 = Static65.anInt1642 * 128 + 64;
					local139 = Static111.anInt2638 * 128 + 64;
					local147 = Static55.method882(local143, local139, Static77.anInt1866) - Static18.anInt620;
					local164 = local139 - Static98.anInt2286;
					local188 = local147 - Static23.anInt816;
					local192 = local143 - Static109.anInt2592;
					local274 = (int) Math.sqrt((double) (local192 * local192 + local164 * local164));
					Static23.anInt806 = (int) (Math.atan2((double) local188, (double) local274) * 325.949D) & 0x7FF;
					Static108.anInt2581 = (int) (-325.949D * Math.atan2((double) local164, (double) local192)) & 0x7FF;
					if (Static23.anInt806 < 128) {
						Static23.anInt806 = 128;
					}
					if (Static23.anInt806 > 383) {
						Static23.anInt806 = 383;
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 76) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method798();
				local143 = Static96.aClass4_Sub9_Sub1_2.method798();
				local147 = Static96.aClass4_Sub9_Sub1_2.method778();
				Static77.anInt1866 = local143 >> 1;
				Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method856((local143 & 0x1) == 1, local147, local139);
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(1155) long local1155;
			@Pc(1199) int local1199;
			@Pc(1142) long local1142;
			@Pc(1150) long local1150;
			if (Static40.anInt1058 == 192) {
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				Static96.aClass4_Sub9_Sub1_2.method797();
				local1150 = Static96.aClass4_Sub9_Sub1_2.method783();
				local1155 = Static96.aClass4_Sub9_Sub1_2.method816();
				@Pc(1157) boolean local1157 = false;
				@Pc(1162) long local1162 = (long) Static96.aClass4_Sub9_Sub1_2.method806();
				local280 = Static96.aClass4_Sub9_Sub1_2.method773();
				local290 = local1162 + (local1155 << 32);
				for (@Pc(1174) int local1174 = 0; local1174 < 100; local1174++) {
					if (local290 == Static86.aLongArray5[local1174]) {
						local1157 = true;
						break;
					}
				}
				if (local280 <= 1) {
					for (local1199 = 0; local1199 < Static59.anInt1560; local1199++) {
						if (local1142 == Static26.aLongArray3[local1199]) {
							local1157 = true;
							break;
						}
					}
				}
				if (!local1157 && Static109.anInt2594 == 0) {
					Static86.aLongArray5[Static125.anInt2829] = local290;
					Static125.anInt2829 = (Static125.anInt2829 + 1) % 100;
					@Pc(1240) Class60 local1240 = Static93.method1199(Static9.method123(Static96.aClass4_Sub9_Sub1_2).method1337());
					if (local280 == 2 || local280 == 3) {
						Static2.method8(Static56.method885(local1150), Static12.method1761(new Class60[] { Static103.aClass60_963, Static56.method885(local1142).method1322() }), 9, local1240);
					} else if (local280 == 1) {
						Static2.method8(Static56.method885(local1150), Static12.method1761(new Class60[] { Static7.aClass60_51, Static56.method885(local1142).method1322() }), 9, local1240);
					} else {
						Static2.method8(Static56.method885(local1150), Static56.method885(local1142).method1322(), 9, local1240);
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 102) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method813();
				local811 = Static61.method991(local139);
				local811.anInt2367 = 3;
				local811.anInt2364 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1.method1054();
				Static36.method558(local811);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 247) {
				for (local139 = 0; local139 < Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1.length; local139++) {
					if (Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local139] != null) {
						Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local139].anInt1408 = -1;
					}
				}
				for (local143 = 0; local143 < Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3.length; local143++) {
					if (Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local143] != null) {
						Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local143].anInt1408 = -1;
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 158) {
				Static67.aBoolean60 = false;
				for (local139 = 0; local139 < 5; local139++) {
					Static55.aBooleanArray8[local139] = false;
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 129 || Static40.anInt1058 == 41 || Static40.anInt1058 == 220 || Static40.anInt1058 == 180 || Static40.anInt1058 == 246 || Static40.anInt1058 == 237 || Static40.anInt1058 == 135 || Static40.anInt1058 == 232 || Static40.anInt1058 == 9 || Static40.anInt1058 == 118 || Static40.anInt1058 == 155) {
				Static33.method505();
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 255) {
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				local147 = Static96.aClass4_Sub9_Sub1_2.method816();
				local164 = Static96.aClass4_Sub9_Sub1_2.method773();
				@Pc(1486) Class60 local1486 = Static56.method885(local1142).method1322();
				for (local192 = 0; local192 < Static83.anInt1972; local192++) {
					if (Static35.aLongArray4[local192] == local1142) {
						if (Static61.anIntArray177[local192] != local147) {
							Static61.anIntArray177[local192] = local147;
							if (local147 > 0) {
								Static90.method1469(5, Static23.aClass60_253, Static12.method1761(new Class60[] { local1486, aClass60_530 }));
							}
							if (local147 == 0) {
								Static90.method1469(5, Static23.aClass60_253, Static12.method1761(new Class60[] { local1486, Static36.aClass60_373 }));
							}
						}
						local1486 = null;
						Static46.anIntArray116[local192] = local164;
						break;
					}
				}
				if (local1486 != null && Static83.anInt1972 < 200) {
					Static35.aLongArray4[Static83.anInt1972] = local1142;
					Static32.aClass60Array4[Static83.anInt1972] = local1486;
					Static61.anIntArray177[Static83.anInt1972] = local147;
					Static46.anIntArray116[Static83.anInt1972] = local164;
					Static83.anInt1972++;
				}
				Static8.anInt94 = Static87.anInt2052;
				local278 = Static83.anInt1972;
				while (local278 > 0) {
					@Pc(1603) boolean local1603 = true;
					local278--;
					for (local280 = 0; local280 < local278; local280++) {
						if (Static61.anIntArray177[local280] != Static42.anInt1103 && Static42.anInt1103 == Static61.anIntArray177[local280 + 1] || Static61.anIntArray177[local280] == 0 && Static61.anIntArray177[local280 + 1] != 0) {
							@Pc(1641) int local1641 = Static61.anIntArray177[local280];
							local1603 = false;
							Static61.anIntArray177[local280] = Static61.anIntArray177[local280 + 1];
							Static61.anIntArray177[local280 + 1] = local1641;
							@Pc(1661) Class60 local1661 = Static32.aClass60Array4[local280];
							Static32.aClass60Array4[local280] = Static32.aClass60Array4[local280 + 1];
							Static32.aClass60Array4[local280 + 1] = local1661;
							@Pc(1679) long local1679 = Static35.aLongArray4[local280];
							Static35.aLongArray4[local280] = Static35.aLongArray4[local280 + 1];
							Static35.aLongArray4[local280 + 1] = local1679;
							local1199 = Static46.anIntArray116[local280];
							Static46.anIntArray116[local280] = Static46.anIntArray116[local280 + 1];
							Static46.anIntArray116[local280 + 1] = local1199;
						}
					}
					if (local1603) {
						break;
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(1748) Class4_Sub14 local1748;
			if (Static40.anInt1058 == 52) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method816();
				local143 = Static96.aClass4_Sub9_Sub1_2.method787();
				local147 = Static96.aClass4_Sub9_Sub1_2.method769();
				local1748 = Static61.method991(local143);
				local1748.anInt2429 = (local139 << 16) + local147;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 227) {
				Static59.anInt1560 = Static7.anInt79 / 8;
				for (local139 = 0; local139 < Static59.anInt1560; local139++) {
					Static26.aLongArray3[local139] = Static96.aClass4_Sub9_Sub1_2.method783();
				}
				Static40.anInt1058 = -1;
				Static8.anInt94 = Static87.anInt2052;
				return true;
			}
			if (Static40.anInt1058 == 228) {
				Static43.method620(true);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 230) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method771();
				local143 = Static96.aClass4_Sub9_Sub1_2.method782();
				if (local139 == 65535) {
					local139 = -1;
				}
				local147 = Static96.aClass4_Sub9_Sub1_2.method780();
				local1748 = Static61.method991(local143);
				@Pc(1839) Class4_Sub3_Sub16 local1839;
				if (local1748.aBoolean95) {
					local1748.anInt2370 = local147;
					local1748.anInt2399 = local139;
					local1839 = Static112.method1854(local139);
					local1748.anInt2410 = local1839.anInt2875;
					local1748.anInt2409 = local1839.anInt2888;
					local1748.anInt2373 = local1839.anInt2883;
					if (local1748.anInt2392 > 0) {
						local1748.anInt2410 = local1748.anInt2410 * 32 / local1748.anInt2392;
					}
					local1748.anInt2425 = local1839.anInt2891;
					local1748.anInt2404 = local1839.anInt2877;
					local1748.anInt2386 = local1839.anInt2907;
					Static36.method558(local1748);
				} else if (local139 == -1) {
					local1748.anInt2367 = 0;
					Static40.anInt1058 = -1;
					return true;
				} else {
					local1839 = Static112.method1854(local139);
					local1748.anInt2367 = 4;
					local1748.anInt2410 = local1839.anInt2875 * 100 / local147;
					local1748.anInt2386 = local1839.anInt2907;
					local1748.anInt2364 = local139;
					local1748.anInt2373 = local1839.anInt2883;
					Static36.method558(local1748);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 92) {
				Static4.anInt61 = Static118.anInt2741;
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				if (local1142 == 0L) {
					Static131.aClass60_1132 = null;
					Static40.anInt1058 = -1;
					Static117.anInt2727 = 0;
					Static97.aClass4_Sub4Array1 = null;
					return true;
				}
				Static131.aClass60_1132 = Static56.method885(local1142);
				Static48.aByte3 = Static96.aClass4_Sub9_Sub1_2.method797();
				local147 = Static96.aClass4_Sub9_Sub1_2.method773();
				if (local147 == 255) {
					Static40.anInt1058 = -1;
					return true;
				}
				Static117.anInt2727 = local147;
				@Pc(1973) Class4_Sub4[] local1973 = new Class4_Sub4[100];
				for (local188 = 0; local188 < Static117.anInt2727; local188++) {
					local1973[local188] = new Class4_Sub4();
					local1973[local188].aLong100 = Static96.aClass4_Sub9_Sub1_2.method783();
					local1973[local188].aClass60_263 = Static56.method885(local1973[local188].aLong100);
					local1973[local188].anInt829 = Static96.aClass4_Sub9_Sub1_2.method816();
					local1973[local188].aByte2 = Static96.aClass4_Sub9_Sub1_2.method797();
					if (local1973[local188].aLong100 == Static21.aLong24) {
						Static69.aByte5 = local1973[local188].aByte2;
					}
				}
				local278 = Static117.anInt2727;
				while (local278 > 0) {
					local278--;
					@Pc(2043) boolean local2043 = true;
					for (local280 = 0; local280 < local278; local280++) {
						if (local1973[local280].aClass60_263.method1309(local1973[local280 + 1].aClass60_263) > 0) {
							@Pc(2064) Class4_Sub4 local2064 = local1973[local280];
							local1973[local280] = local1973[local280 + 1];
							local2043 = false;
							local1973[local280 + 1] = local2064;
						}
					}
					if (local2043) {
						break;
					}
				}
				Static40.anInt1058 = -1;
				Static97.aClass4_Sub4Array1 = local1973;
				return true;
			}
			if (Static40.anInt1058 == 205) {
				Static56.anInt1507 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static40.anInt1058 = -1;
				Static8.anInt94 = Static87.anInt2052;
				return true;
			}
			if (Static40.anInt1058 == 209) {
				Static40.anInt1058 = -1;
				Static106.anInt2495 = 0;
				return true;
			}
			if (Static40.anInt1058 == 93) {
				Static52.method862(Static96.aClass4_Sub9_Sub1_2, Static105.aClass81_4, Static7.anInt79);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 126) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method782();
				local143 = Static96.aClass4_Sub9_Sub1_2.method802();
				local705 = Static61.method991(local139);
				if (local705.anInt2367 != 1 || local143 != local705.anInt2364) {
					local705.anInt2367 = 1;
					local705.anInt2364 = local143;
					Static36.method558(local705);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 183) {
				for (local139 = 0; local139 < Static129.anInt1200; local139++) {
					@Pc(2193) Class4_Sub3_Sub5 local2193 = Static105.method1733(local139);
					if (local2193 != null && local2193.anInt936 == 0) {
						Static84.anIntArray228[local139] = 0;
						Static53.anIntArray141[local139] = 0;
					}
				}
				Static131.method1978();
				Static40.anInt1058 = -1;
				Static91.anInt2130 += 32;
				return true;
			}
			if (Static40.anInt1058 == 27) {
				Static62.anInt1588 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static43.anInt1110 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static6.anInt73 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 171) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method769();
				Static79.method1274(local139);
				Static110.anIntArray332[Static102.anInt2428++ & 0x1F] = local139 & 0x7FFF;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 60) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method816();
				@Pc(2282) byte local2282 = Static96.aClass4_Sub9_Sub1_2.method797();
				Static84.anIntArray228[local139] = local2282;
				if (Static53.anIntArray141[local139] != local2282) {
					Static53.anIntArray141[local139] = local2282;
					Static1.method5(local139);
				}
				Static56.anIntArray150[Static91.anInt2130++ & 0x1F] = local139;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 139) {
				Static5.anInt66 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static37.anInt1028 = Static96.aClass4_Sub9_Sub1_2.method798();
				for (local139 = Static5.anInt66; local139 < Static5.anInt66 + 8; local139++) {
					for (local143 = Static37.anInt1028; local143 < Static37.anInt1028 + 8; local143++) {
						if (Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local139][local143] != null) {
							Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local139][local143] = null;
							Static50.method858(local143, local139);
						}
					}
				}
				for (@Pc(2380) Class4_Sub23 local2380 = (Class4_Sub23) Static14.aClass45_1.method982(); local2380 != null; local2380 = (Class4_Sub23) Static14.aClass45_1.method986()) {
					if (Static5.anInt66 <= local2380.anInt2916 && local2380.anInt2916 < Static5.anInt66 + 8 && Static37.anInt1028 <= local2380.anInt2925 && Static37.anInt1028 + 8 > local2380.anInt2925 && Static77.anInt1866 == local2380.anInt2922) {
						local2380.anInt2927 = 0;
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 253) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method813();
				Static105.aClass43_7 = Static105.aClass81_4.method1938(local139);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 36) {
				Static5.anInt66 = Static96.aClass4_Sub9_Sub1_2.method798();
				Static37.anInt1028 = Static96.aClass4_Sub9_Sub1_2.method798();
				while (Static7.anInt79 > Static96.aClass4_Sub9_Sub1_2.anInt1312) {
					Static40.anInt1058 = Static96.aClass4_Sub9_Sub1_2.method773();
					Static33.method505();
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 14) {
				Static67.method1079();
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 206) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method780();
				local143 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (local139 >= 0) {
					local705 = Static61.method991(local139);
				} else {
					local705 = null;
				}
				if (local139 < -70000) {
					local143 += 32768;
				}
				if (local705 != null) {
					for (local164 = 0; local164 < local705.anIntArray312.length; local164++) {
						local705.anIntArray312[local164] = 0;
						local705.anIntArray311[local164] = 0;
					}
				}
				Static109.method1804(local143);
				local164 = Static96.aClass4_Sub9_Sub1_2.method816();
				for (local188 = 0; local188 < local164; local188++) {
					local192 = Static96.aClass4_Sub9_Sub1_2.method773();
					if (local192 == 255) {
						local192 = Static96.aClass4_Sub9_Sub1_2.method782();
					}
					local274 = Static96.aClass4_Sub9_Sub1_2.method816();
					if (local705 != null && local188 < local705.anIntArray312.length) {
						local705.anIntArray312[local188] = local274;
						local705.anIntArray311[local188] = local192;
					}
					Static33.method502(local192, local188, local143, local274 - 1);
				}
				if (local705 != null) {
					Static36.method558(local705);
				}
				Static131.method1978();
				Static110.anIntArray332[Static102.anInt2428++ & 0x1F] = local143 & 0x7FFF;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 125) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method773();
				local143 = Static96.aClass4_Sub9_Sub1_2.method773();
				local147 = Static96.aClass4_Sub9_Sub1_2.method773();
				local164 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static55.aBooleanArray8[local139] = true;
				Static49.anIntArray122[local139] = local143;
				Static24.anIntArray86[local139] = local147;
				Static84.anIntArray227[local139] = local164;
				Static118.anIntArray337[local139] = 0;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 17) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method769();
				local143 = Static96.aClass4_Sub9_Sub1_2.method780();
				local147 = Static96.aClass4_Sub9_Sub1_2.method816();
				local164 = Static96.aClass4_Sub9_Sub1_2.method771();
				@Pc(2687) Class4_Sub14 local2687 = Static61.method991(local143);
				if (local2687.anInt2386 != local139 || local164 != local2687.anInt2373 || local147 != local2687.anInt2410) {
					local2687.anInt2373 = local164;
					local2687.anInt2410 = local147;
					local2687.anInt2386 = local139;
					Static36.method558(local2687);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 131) {
				for (local139 = 0; local139 < Static53.anIntArray141.length; local139++) {
					if (Static53.anIntArray141[local139] != Static84.anIntArray228[local139]) {
						Static53.anIntArray141[local139] = Static84.anIntArray228[local139];
						Static1.method5(local139);
						Static56.anIntArray150[Static91.anInt2130++ & 0x1F] = local139;
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 44) {
				Static131.method1978();
				Static25.anInt847 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static40.anInt1058 = -1;
				Static20.anInt705 = Static87.anInt2052;
				return true;
			}
			if (Static40.anInt1058 == 182) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method782();
				local143 = Static96.aClass4_Sub9_Sub1_2.method816();
				local164 = local143 >> 5 & 0x1F;
				local188 = local143 & 0x1F;
				local147 = local143 >> 10 & 0x1F;
				@Pc(2815) Class4_Sub14 local2815 = Static61.method991(local139);
				local192 = (local188 << 3) + (local147 << 19) + (local164 << 11);
				if (local192 != local2815.anInt2387) {
					local2815.anInt2387 = local192;
					Static36.method558(local2815);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 149) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method780();
				@Pc(2861) boolean local2861 = Static96.aClass4_Sub9_Sub1_2.method773() == 1;
				local705 = Static61.method991(local139);
				if (local2861 != local705.aBoolean91) {
					local705.aBoolean91 = local2861;
					Static36.method558(local705);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			@Pc(2910) boolean local2910;
			if (Static40.anInt1058 == 239) {
				local847 = Static96.aClass4_Sub9_Sub1_2.method776();
				@Pc(2904) Class60 local2904;
				if (local847.method1343(Static21.aClass60_234)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					local1150 = local2904.method1325();
					local2910 = false;
					for (local192 = 0; local192 < Static59.anInt1560; local192++) {
						if (local1150 == Static26.aLongArray3[local192]) {
							local2910 = true;
							break;
						}
					}
					if (!local2910 && Static109.anInt2594 == 0) {
						Static90.method1469(4, local2904, Static71.aClass60_750);
					}
				} else if (local847.method1343(Static83.aClass60_823)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					local1150 = local2904.method1325();
					local2910 = false;
					for (local192 = 0; local192 < Static59.anInt1560; local192++) {
						if (Static26.aLongArray3[local192] == local1150) {
							local2910 = true;
							break;
						}
					}
					if (!local2910 && Static109.anInt2594 == 0) {
						Static90.method1469(8, local2904, Static24.aClass60_264);
					}
				} else if (local847.method1343(Static65.aClass60_628)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					local1150 = local2904.method1325();
					local2910 = false;
					for (local192 = 0; local192 < Static59.anInt1560; local192++) {
						if (local1150 == Static26.aLongArray3[local192]) {
							local2910 = true;
							break;
						}
					}
					if (!local2910 && Static109.anInt2594 == 0) {
						@Pc(3193) Class60 local3193 = local847.method1333(local847.method1316(Static120.aClass60_1075) + 1, local847.method1345() - 9);
						Static90.method1469(8, local2904, local3193);
					}
				} else if (local847.method1343(Static61.aClass60_575)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					local1150 = local2904.method1325();
					local2910 = false;
					for (local192 = 0; local192 < Static59.anInt1560; local192++) {
						if (local1150 == Static26.aLongArray3[local192]) {
							local2910 = true;
							break;
						}
					}
					if (!local2910 && Static109.anInt2594 == 0) {
						Static90.method1469(10, local2904, Static23.aClass60_253);
					}
				} else if (local847.method1343(Static132.aClass60_1136)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					Static90.method1469(11, Static23.aClass60_253, local2904);
				} else if (local847.method1343(Static43.aClass60_417)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					if (Static109.anInt2594 == 0) {
						Static90.method1469(12, Static23.aClass60_253, local2904);
					}
				} else if (local847.method1343(Static81.aClass60_802)) {
					local2904 = local847.method1333(0, local847.method1316(Static120.aClass60_1075));
					if (Static109.anInt2594 == 0) {
						Static90.method1469(13, Static23.aClass60_253, local2904);
					}
				} else {
					Static90.method1469(0, Static23.aClass60_253, local847);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 160) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method823();
				local143 = Static96.aClass4_Sub9_Sub1_2.method780();
				local147 = Static96.aClass4_Sub9_Sub1_2.method785();
				local1748 = Static61.method991(local143);
				local192 = local1748.anInt2383 + local147;
				local188 = local139 + local1748.anInt2414;
				if (local1748.anInt2406 != local188 || local192 != local1748.anInt2375) {
					local1748.anInt2375 = local192;
					local1748.anInt2406 = local188;
					Static36.method558(local1748);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 72) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method813();
				local143 = Static96.aClass4_Sub9_Sub1_2.method816();
				local705 = Static61.method991(local139);
				if (local705 != null && local705.anInt2389 == 0) {
					if (local143 > local705.anInt2395 - local705.anInt2440) {
						local143 = local705.anInt2395 - local705.anInt2440;
					}
					if (local143 < 0) {
						local143 = 0;
					}
					if (local705.anInt2437 != local143) {
						local705.anInt2437 = local143;
						Static36.method558(local705);
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 200) {
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				@Pc(3333) Class60 local3333 = Static93.method1199(Static9.method123(Static96.aClass4_Sub9_Sub1_2).method1337());
				Static90.method1469(6, Static56.method885(local1142).method1322(), local3333);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 50) {
				local847 = Static96.aClass4_Sub9_Sub1_2.method776();
				@Pc(3362) Object[] local3362 = new Object[local847.method1345() + 1];
				for (local147 = local847.method1345() - 1; local147 >= 0; local147--) {
					if (local847.method1338(local147) == 115) {
						local3362[local147 + 1] = Static96.aClass4_Sub9_Sub1_2.method776();
					} else {
						local3362[local147 + 1] = Integer.valueOf(Static96.aClass4_Sub9_Sub1_2.method780());
					}
				}
				local3362[0] = Integer.valueOf(Static96.aClass4_Sub9_Sub1_2.method780());
				@Pc(3418) Class4_Sub21 local3418 = new Class4_Sub21();
				local3418.anObjectArray28 = local3362;
				Static28.method1353(local3418);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 109) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method816();
				local143 = Static96.aClass4_Sub9_Sub1_2.method773();
				local147 = Static96.aClass4_Sub9_Sub1_2.method816();
				Static111.method1834(local147, local143, local139);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 225) {
				Static67.aBoolean60 = true;
				Static48.anInt1187 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static63.anInt1596 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static7.anInt84 = Static96.aClass4_Sub9_Sub1_2.method816();
				Static118.anInt2736 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static110.anInt2613 = Static96.aClass4_Sub9_Sub1_2.method773();
				if (Static110.anInt2613 >= 100) {
					Static98.anInt2286 = Static48.anInt1187 * 128 + 64;
					Static109.anInt2592 = Static63.anInt1596 * 128 + 64;
					Static23.anInt816 = Static55.method882(Static109.anInt2592, Static98.anInt2286, Static77.anInt1866) - Static7.anInt84;
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 213) {
				Static56.method886(Static96.aClass4_Sub9_Sub1_2);
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 0) {
				Static124.method1932();
				Static40.anInt1058 = -1;
				return false;
			}
			if (Static40.anInt1058 == 74) {
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				local2910 = false;
				local147 = Static96.aClass4_Sub9_Sub1_2.method816();
				if ((local1142 & Long.MIN_VALUE) != 0L) {
					local2910 = true;
				}
				@Pc(3557) byte local3557 = Static96.aClass4_Sub9_Sub1_2.method797();
				if (local2910) {
					if (Static117.anInt2727 == 0) {
						Static40.anInt1058 = -1;
						return true;
					}
					local1142 &= Long.MAX_VALUE;
					for (local192 = 0; local192 < Static117.anInt2727 && (Static97.aClass4_Sub4Array1[local192].aLong100 != local1142 || local147 != Static97.aClass4_Sub4Array1[local192].anInt829); local192++) {
					}
					if (Static117.anInt2727 > local192) {
						while (Static117.anInt2727 - 1 > local192) {
							Static97.aClass4_Sub4Array1[local192] = Static97.aClass4_Sub4Array1[local192 + 1];
							local192++;
						}
						Static97.aClass4_Sub4Array1[Static117.anInt2727] = null;
						Static117.anInt2727--;
					}
				} else {
					@Pc(3639) Class4_Sub4 local3639 = new Class4_Sub4();
					local3639.aLong100 = local1142;
					local3639.aClass60_263 = Static56.method885(local3639.aLong100);
					local3639.anInt829 = local147;
					local3639.aByte2 = local3557;
					for (local274 = Static117.anInt2727 - 1; local274 >= 0; local274--) {
						local278 = Static97.aClass4_Sub4Array1[local274].aClass60_263.method1309(local3639.aClass60_263);
						if (local278 == 0) {
							Static97.aClass4_Sub4Array1[local274].anInt829 = local147;
							Static97.aClass4_Sub4Array1[local274].aByte2 = local3557;
							if (local1142 == Static21.aLong24) {
								Static69.aByte5 = local3557;
							}
							Static4.anInt61 = Static118.anInt2741;
							Static40.anInt1058 = -1;
							return true;
						}
						if (local278 < 0) {
							break;
						}
					}
					if (Static117.anInt2727 >= Static97.aClass4_Sub4Array1.length) {
						Static40.anInt1058 = -1;
						return true;
					}
					for (local278 = Static117.anInt2727 - 1; local278 > local274; local278--) {
						Static97.aClass4_Sub4Array1[local278 + 1] = Static97.aClass4_Sub4Array1[local278];
					}
					if (Static117.anInt2727 == 0) {
						Static97.aClass4_Sub4Array1 = new Class4_Sub4[100];
					}
					Static97.aClass4_Sub4Array1[local274 + 1] = local3639;
					Static117.anInt2727++;
					if (Static21.aLong24 == local1142) {
						Static69.aByte5 = local3557;
					}
				}
				Static40.anInt1058 = -1;
				Static4.anInt61 = Static118.anInt2741;
				return true;
			}
			if (Static40.anInt1058 == 181) {
				local847 = Static96.aClass4_Sub9_Sub1_2.method776();
				local143 = Static96.aClass4_Sub9_Sub1_2.method813();
				local705 = Static61.method991(local143);
				if (!local847.method1311(local705.aClass60_958)) {
					local705.aClass60_958 = local847;
					Static36.method558(local705);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 142) {
				Static131.method1978();
				local139 = Static96.aClass4_Sub9_Sub1_2.method787();
				local143 = Static96.aClass4_Sub9_Sub1_2.method795();
				local147 = Static96.aClass4_Sub9_Sub1_2.method773();
				Static7.anIntArray9[local143] = local139;
				Static99.anIntArray76[local143] = local147;
				Static41.anIntArray114[local143] = 1;
				for (local164 = 0; local164 < 98; local164++) {
					if (Class63.anIntArray230[local164] <= local139) {
						Static41.anIntArray114[local143] = local164 + 2;
					}
				}
				Static8.anIntArray11[Static7.anInt85++ & 0x1F] = local143;
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 95) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method771();
				local143 = Static96.aClass4_Sub9_Sub1_2.method782();
				local705 = Static61.method991(local143);
				if (local705.anInt2367 != 2 || local139 != local705.anInt2364) {
					local705.anInt2367 = 2;
					local705.anInt2364 = local139;
					Static36.method558(local705);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 136) {
				local1142 = Static96.aClass4_Sub9_Sub1_2.method783();
				local1150 = Static96.aClass4_Sub9_Sub1_2.method816();
				local1155 = Static96.aClass4_Sub9_Sub1_2.method806();
				local274 = Static96.aClass4_Sub9_Sub1_2.method773();
				@Pc(3927) long local3927 = local1155 + (local1150 << 32);
				@Pc(3929) boolean local3929 = false;
				for (@Pc(3931) int local3931 = 0; local3931 < 100; local3931++) {
					if (Static86.aLongArray5[local3931] == local3927) {
						local3929 = true;
						break;
					}
				}
				if (local274 <= 1) {
					for (@Pc(3958) int local3958 = 0; local3958 < Static59.anInt1560; local3958++) {
						if (Static26.aLongArray3[local3958] == local1142) {
							local3929 = true;
							break;
						}
					}
				}
				if (!local3929 && Static109.anInt2594 == 0) {
					Static86.aLongArray5[Static125.anInt2829] = local3927;
					Static125.anInt2829 = (Static125.anInt2829 + 1) % 100;
					@Pc(4002) Class60 local4002 = Static93.method1199(Static9.method123(Static96.aClass4_Sub9_Sub1_2).method1337());
					if (local274 == 2 || local274 == 3) {
						Static90.method1469(7, Static12.method1761(new Class60[] { Static103.aClass60_963, Static56.method885(local1142).method1322() }), local4002);
					} else if (local274 == 1) {
						Static90.method1469(7, Static12.method1761(new Class60[] { Static7.aClass60_51, Static56.method885(local1142).method1322() }), local4002);
					} else {
						Static90.method1469(3, Static56.method885(local1142).method1322(), local4002);
					}
				}
				Static40.anInt1058 = -1;
				return true;
			}
			if (Static40.anInt1058 == 5) {
				local139 = Static96.aClass4_Sub9_Sub1_2.method785();
				local143 = Static96.aClass4_Sub9_Sub1_2.method787();
				local705 = Static61.method991(local143);
				if (local139 != local705.anInt2385 || local139 == -1) {
					local705.anInt2424 = 0;
					local705.anInt2385 = local139;
					local705.anInt2434 = 0;
					Static36.method558(local705);
				}
				Static40.anInt1058 = -1;
				return true;
			}
			Static117.method1885("T1 - " + Static40.anInt1058 + "," + Static79.anInt1904 + "," + Static26.anInt855 + " - " + Static7.anInt79, null);
			Static124.method1932();
		} catch (@Pc(4141) IOException local4141) {
			Static116.method1880();
		} catch (@Pc(4145) Exception local4145) {
			@Pc(4186) String local4186 = "T2 - " + Static40.anInt1058 + "," + Static79.anInt1904 + "," + Static26.anInt855 + " - " + Static7.anInt79 + "," + (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0] + Static49.anInt1207) + "," + (Static60.anInt2956 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0]) + " - ";
			for (local143 = 0; local143 < Static7.anInt79 && local143 < 50; local143++) {
				local4186 = local4186 + Static96.aClass4_Sub9_Sub1_2.aByteArray6[local143] + ",";
			}
			Static117.method1885(local4186, local4145);
			Static124.method1932();
		}
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method871() {
		aClass60_531 = null;
		aClass60_530 = null;
		aClass60_527 = null;
		aClass60_521 = null;
		aClass60_523 = null;
		aClass60_532 = null;
		aClass60_526 = null;
		aClass60_520 = null;
		aClass60_519 = null;
		aClass60_528 = null;
		aClass60_524 = null;
		aClass60_525 = null;
		aClass60_522 = null;
		aClass60_529 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method872() {
		if (Static7.aClass82_1 != null) {
			@Pc(3) Class82 local3 = Static7.aClass82_1;
			synchronized (Static7.aClass82_1) {
				Static7.aClass82_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIIIII)V")
	public static void method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 1 || arg1 < 1 || arg6 > 102 || arg1 > 102) {
			return;
		}
		if (Static8.aBoolean3 && Static77.anInt1866 != arg4) {
			return;
		}
		@Pc(35) int local35 = 0;
		if (arg0 == 0) {
			local35 = Static30.aClass48_1.method1015(arg4, arg6, arg1);
		}
		if (arg0 == 1) {
			local35 = Static30.aClass48_1.method1001(arg4, arg6, arg1);
		}
		if (arg0 == 2) {
			local35 = Static30.aClass48_1.method1024(arg4, arg6, arg1);
		}
		if (arg0 == 3) {
			local35 = Static30.aClass48_1.method1031(arg4, arg6, arg1);
		}
		@Pc(97) int local97;
		if (local35 != 0) {
			@Pc(90) int local90 = local35 >> 14 & 0x7FFF;
			local97 = Static30.aClass48_1.method1013(arg4, arg6, arg1, local35);
			@Pc(103) int local103 = local97 >> 6 & 0x3;
			@Pc(107) int local107 = local97 & 0x1F;
			@Pc(121) Class4_Sub3_Sub3 local121;
			if (arg0 == 0) {
				Static30.aClass48_1.method1037(arg4, arg6, arg1);
				local121 = Static76.method1244(local90);
				if (local121.anInt732 != 0) {
					Static50.aClass28Array3[arg4].method603(arg1, local103, local107, arg6, local121.aBoolean28);
				}
			}
			if (arg0 == 1) {
				Static30.aClass48_1.method1000(arg4, arg6, arg1);
			}
			if (arg0 == 2) {
				Static30.aClass48_1.method1042(arg4, arg6, arg1);
				local121 = Static76.method1244(local90);
				if (arg6 + local121.anInt760 > 103 || local121.anInt760 + arg1 > 103 || local121.anInt750 + arg6 > 103 || local121.anInt750 + arg1 > 103) {
					return;
				}
				if (local121.anInt732 != 0) {
					Static50.aClass28Array3[arg4].method606(arg1, local121.anInt750, local121.anInt760, arg6, local121.aBoolean28, local103);
				}
			}
			if (arg0 == 3) {
				Static30.aClass48_1.method1047(arg4, arg6, arg1);
				local121 = Static76.method1244(local90);
				if (local121.anInt732 == 1) {
					Static50.aClass28Array3[arg4].method601(arg1, arg6);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local97 = arg4;
		if (arg4 < 3 && (Static69.aByteArrayArrayArray5[1][arg6][arg1] & 0x2) == 2) {
			local97 = arg4 + 1;
		}
		Static30.method477(Static50.aClass28Array3[arg4], local97, arg1, arg6, arg2, Static30.aClass48_1, arg5, arg3, arg4);
	}
}
