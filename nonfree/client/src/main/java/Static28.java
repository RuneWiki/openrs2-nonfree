import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "[I")
	public static int[] anIntArray48 = new int[25];

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Lclient!qc;")
	private static Class60 aClass60_315 = Static121.method2047(":chalreq:");

	@OriginalMember(owner = "client!ec", name = "jb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_318 = Static121.method2047("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_316 = aClass60_318;

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lclient!qc;")
	public static Class60 aClass60_317 = Static121.method2047(": ");

	@OriginalMember(owner = "client!ec", name = "xb", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array6 = new Class60[100];

	@OriginalMember(owner = "client!ec", name = "Bb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_319 = Static121.method2047("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ec", name = "Ib", descriptor = "I")
	public static int anInt809 = 0;

	@OriginalMember(owner = "client!ec", name = "Lb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_320 = Static121.method2047("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
	public static boolean method536() {
		if (Static7.aClass78_6 == null) {
			return false;
		}
		@Pc(135) int local135;
		try {
			@Pc(13) int local13 = Static7.aClass78_6.method2076();
			if (local13 == 0) {
				return false;
			}
			if (Static115.anInt2762 == -1) {
				local13--;
				Static7.aClass78_6.method2077(1, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
				Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
				Static115.anInt2762 = Static105.aClass4_Sub13_Sub1_3.method1262();
				Static78.anInt1911 = Static73.anIntArray191[Static115.anInt2762];
			}
			if (Static78.anInt1911 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static7.aClass78_6.method2077(1, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
				Static78.anInt1911 = Static105.aClass4_Sub13_Sub1_3.aByteArray68[0] & 0xFF;
				local13--;
			}
			if (Static78.anInt1911 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static7.aClass78_6.method2077(2, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
				Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
				Static78.anInt1911 = Static105.aClass4_Sub13_Sub1_3.method1244();
			}
			if (local13 < Static78.anInt1911) {
				return false;
			}
			Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
			Static7.aClass78_6.method2077(Static78.anInt1911, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
			Static83.anInt1979 = 0;
			Static99.anInt2423 = Static7.anInt2988;
			Static7.anInt2988 = Static8.anInt130;
			Static8.anInt130 = Static115.anInt2762;
			if (Static115.anInt2762 == 211) {
				Static115.anInt2762 = -1;
				Static81.anInt1951 = 0;
				return true;
			}
			@Pc(139) int local139;
			@Pc(131) int local131;
			if (Static115.anInt2762 == 0) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1235();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1215();
				@Pc(146) Class4_Sub18 local146 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local139);
				if (local146 != null) {
					Static5.method38(local135 != local146.anInt2402, local146);
				}
				Static20.method366(local131, local139, local135);
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(189) Class4_Sub17 local189;
			if (Static115.anInt2762 == 21) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1232();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1234();
				local189 = Static16.method283(local135);
				if (local189.anInt2208 != 1 || local131 != local189.anInt2228) {
					local189.anInt2208 = 1;
					local189.anInt2228 = local131;
					Static130.method2133(local189);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 151) {
				Static89.anInt2077 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static74.anInt1854 = Static105.aClass4_Sub13_Sub1_3.method1229();
				for (local131 = Static89.anInt2077; local131 < Static89.anInt2077 + 8; local131++) {
					for (local135 = Static74.anInt1854; local135 < Static74.anInt1854 + 8; local135++) {
						if (Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local131][local135] != null) {
							Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local131][local135] = null;
							Static45.method813(local131, local135);
						}
					}
				}
				for (@Pc(272) Class4_Sub19 local272 = (Class4_Sub19) Static52.aClass70_12.method1939(); local272 != null; local272 = (Class4_Sub19) Static52.aClass70_12.method1936()) {
					if (local272.anInt2496 >= Static89.anInt2077 && local272.anInt2496 < Static89.anInt2077 + 8 && Static74.anInt1854 <= local272.anInt2499 && Static74.anInt1854 + 8 > local272.anInt2499 && local272.anInt2490 == Static129.anInt3003) {
						local272.anInt2486 = 0;
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 22) {
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(336) Class60 local336;
			if (Static115.anInt2762 == 221) {
				local336 = Static105.aClass4_Sub13_Sub1_3.method1249();
				@Pc(343) Object[] local343 = new Object[local336.method1644() + 1];
				for (local139 = local336.method1644() - 1; local139 >= 0; local139--) {
					if (local336.method1634(local139) == 115) {
						local343[local139 + 1] = Static105.aClass4_Sub13_Sub1_3.method1249();
					} else {
						local343[local139 + 1] = Integer.valueOf(Static105.aClass4_Sub13_Sub1_3.method1215());
					}
				}
				local343[0] = Integer.valueOf(Static105.aClass4_Sub13_Sub1_3.method1215());
				@Pc(399) Class4_Sub16 local399 = new Class4_Sub16();
				local399.anObjectArray3 = local343;
				Static18.method296(local399);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 209) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1210();
				if (local131 == 65535) {
					local131 = -1;
				}
				Static20.method359(local131);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 131) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1241();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1236();
				if (local135 == 65535) {
					local135 = -1;
				}
				Static62.method1267(local131, local135);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 136) {
				Static81.anInt1955 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static26.anInt744 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static46.anInt1201 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(505) int local505;
			@Pc(499) int local499;
			@Pc(494) Class4_Sub17 local494;
			if (Static115.anInt2762 == 74) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1243();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1234();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1248();
				local494 = Static16.method283(local135);
				local499 = local139 + local494.anInt2185;
				local505 = local494.anInt2202 + local131;
				if (local494.anInt2234 != local499 || local505 != local494.anInt2204) {
					local494.anInt2204 = local505;
					local494.anInt2234 = local499;
					Static130.method2133(local494);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 185) {
				Static105.aClass4_Sub13_Sub1_3.method1223();
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 60) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local131 == 65535) {
					local131 = -1;
				}
				local135 = Static105.aClass4_Sub13_Sub1_3.method1234();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local494 = Static16.method283(local135);
				@Pc(590) Class4_Sub4_Sub13 local590;
				if (local494.aBoolean103) {
					local494.anInt2181 = local139;
					local494.anInt2213 = local131;
					local590 = Static24.method475(local131);
					local494.anInt2226 = local590.anInt2101;
					local494.anInt2179 = local590.anInt2132;
					local494.anInt2232 = local590.anInt2136;
					local494.anInt2209 = local590.anInt2105;
					local494.anInt2245 = local590.anInt2117;
					local494.anInt2230 = local590.anInt2114;
					if (local494.anInt2184 > 0) {
						local494.anInt2245 = local494.anInt2245 * 32 / local494.anInt2184;
					}
					Static130.method2133(local494);
				} else if (local131 == -1) {
					local494.anInt2208 = 0;
					Static115.anInt2762 = -1;
					return true;
				} else {
					local590 = Static24.method475(local131);
					local494.anInt2208 = 4;
					local494.anInt2245 = local590.anInt2117 * 100 / local139;
					local494.anInt2228 = local131;
					local494.anInt2226 = local590.anInt2101;
					local494.anInt2232 = local590.anInt2136;
					Static130.method2133(local494);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(691) int local691;
			@Pc(695) Class4_Sub17 local695;
			if (Static115.anInt2762 == 106) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1234();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1210();
				local695 = Static16.method283(local139);
				if (local695.anInt2226 != local691 || local695.anInt2232 != local135 || local131 != local695.anInt2245) {
					local695.anInt2245 = local131;
					local695.anInt2226 = local691;
					local695.anInt2232 = local135;
					Static130.method2133(local695);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 235) {
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static105.aClass4_Sub13_Sub1_3.method1232();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 14) {
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 61) {
				Static105.aClass4_Sub13_Sub1_3.method1235();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 201) {
				Static121.method2048();
				local131 = Static105.aClass4_Sub13_Sub1_3.method1229();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1223();
				anIntArray48[local139] = local135;
				Static7.anIntArray334[local139] = local131;
				Static88.anIntArray208[local139] = 1;
				for (local691 = 0; local691 < 98; local691++) {
					if (local135 >= Class4_Sub10.anIntArray66[local691]) {
						Static88.anIntArray208[local139] = local691 + 2;
					}
				}
				Static45.anIntArray111[Static78.anInt1909++ & 0x1F] = local139;
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(861) long local861;
			@Pc(875) int local875;
			@Pc(902) int local902;
			@Pc(843) long local843;
			@Pc(865) int local865;
			@Pc(851) long local851;
			if (Static115.anInt2762 == 31) {
				local843 = Static105.aClass4_Sub13_Sub1_3.method1250();
				Static105.aClass4_Sub13_Sub1_3.method1224();
				local851 = Static105.aClass4_Sub13_Sub1_3.method1250();
				@Pc(856) long local856 = (long) Static105.aClass4_Sub13_Sub1_3.method1244();
				local861 = Static105.aClass4_Sub13_Sub1_3.method1241();
				local865 = Static105.aClass4_Sub13_Sub1_3.method1223();
				@Pc(871) long local871 = (local856 << 32) + local861;
				@Pc(873) boolean local873 = false;
				for (local875 = 0; local875 < 100; local875++) {
					if (Static67.aLongArray12[local875] == local871) {
						local873 = true;
						break;
					}
				}
				if (local865 <= 1) {
					for (local902 = 0; local902 < Static85.anInt2032; local902++) {
						if (Static39.aLongArray7[local902] == local843) {
							local873 = true;
							break;
						}
					}
				}
				if (!local873 && Static57.anInt528 == 0) {
					Static67.aLongArray12[Static112.anInt2730] = local871;
					Static112.anInt2730 = (Static112.anInt2730 + 1) % 100;
					@Pc(943) Class60 local943 = Static97.method1747(Static56.method1039(Static105.aClass4_Sub13_Sub1_3).method1663());
					if (local865 == 2 || local865 == 3) {
						Static18.method298(9, local943, Static125.method2072(new Class60[] { Static22.aClass60_237, Static87.method1501(local843).method1651() }), Static87.method1501(local851));
					} else if (local865 == 1) {
						Static18.method298(9, local943, Static125.method2072(new Class60[] { Static74.aClass60_725, Static87.method1501(local843).method1651() }), Static87.method1501(local851));
					} else {
						Static18.method298(9, local943, Static87.method1501(local843).method1651(), Static87.method1501(local851));
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 244) {
				for (local131 = 0; local131 < Static108.anInt2558; local131++) {
					@Pc(1035) Class4_Sub4_Sub17 local1035 = Static107.method1837(local131);
					if (local1035 != null && local1035.anInt2968 == 0) {
						Static105.anIntArray280[local131] = 0;
						Static62.anIntArray168[local131] = 0;
					}
				}
				Static121.method2048();
				Static115.anInt2762 = -1;
				Static121.anInt2898 += 32;
				return true;
			}
			if (Static115.anInt2762 == 128) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1236();
				Static19.method342(local131);
				Static8.anIntArray10[Static120.anInt1941++ & 0x1F] = local131 & 0x7FFF;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 103) {
				Static105.aClass4_Sub13_Sub1_3.method1255();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 243) {
				Static63.anInt1695 = Static105.aClass4_Sub13_Sub1_3.method1223();
				if (Static63.anInt1695 == 1) {
					Static81.anInt1953 = Static105.aClass4_Sub13_Sub1_3.method1244();
				}
				if (Static63.anInt1695 >= 2 && Static63.anInt1695 <= 6) {
					if (Static63.anInt1695 == 2) {
						Static41.anInt1039 = 64;
						Static43.anInt1110 = 64;
					}
					if (Static63.anInt1695 == 3) {
						Static41.anInt1039 = 0;
						Static43.anInt1110 = 64;
					}
					if (Static63.anInt1695 == 4) {
						Static41.anInt1039 = 128;
						Static43.anInt1110 = 64;
					}
					if (Static63.anInt1695 == 5) {
						Static41.anInt1039 = 64;
						Static43.anInt1110 = 0;
					}
					if (Static63.anInt1695 == 6) {
						Static43.anInt1110 = 128;
						Static41.anInt1039 = 64;
					}
					Static63.anInt1695 = 2;
					Static41.anInt1032 = Static105.aClass4_Sub13_Sub1_3.method1244();
					Static20.anInt578 = Static105.aClass4_Sub13_Sub1_3.method1244();
					Static46.anInt1198 = Static105.aClass4_Sub13_Sub1_3.method1223();
				}
				if (Static63.anInt1695 == 10) {
					Static126.anInt2949 = Static105.aClass4_Sub13_Sub1_3.method1244();
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 198) {
				Static105.aClass4_Sub13_Sub1_3.method1249();
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(1277) int local1277;
			if (Static115.anInt2762 == 88) {
				Static110.aBoolean115 = true;
				Static77.anInt1903 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static121.anInt2883 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static76.anInt1896 = Static105.aClass4_Sub13_Sub1_3.method1244();
				Static104.anInt2500 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static15.anInt2963 = Static105.aClass4_Sub13_Sub1_3.method1223();
				if (Static15.anInt2963 >= 100) {
					local131 = Static77.anInt1903 * 128 + 64;
					local135 = Static121.anInt2883 * 128 + 64;
					local139 = Static54.method1001(local131, local135, Static129.anInt3003) - Static76.anInt1896;
					local505 = local135 - Static74.anInt1856;
					local499 = local139 - Static23.anInt663;
					local691 = local131 - Static88.anInt2065;
					local1277 = (int) Math.sqrt((double) (local691 * local691 + local505 * local505));
					Static120.anInt1940 = (int) (Math.atan2((double) local499, (double) local1277) * 325.949D) & 0x7FF;
					Static75.anInt1872 = (int) (Math.atan2((double) local691, (double) local505) * -325.949D) & 0x7FF;
					if (Static120.anInt1940 < 128) {
						Static120.anInt1940 = 128;
					}
					if (Static120.anInt1940 > 383) {
						Static120.anInt1940 = 383;
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 228) {
				local336 = Static105.aClass4_Sub13_Sub1_3.method1249();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1253();
				local189 = Static16.method283(local135);
				if (!local336.method1660(local189.aClass60_896)) {
					local189.aClass60_896 = local336;
					Static130.method2133(local189);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 206) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1244();
				Static120.method1446(local131, local139, local135);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 34) {
				Static105.aClass4_Sub13_Sub1_3.method1246();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 180) {
				Static104.method1822(false);
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(1418) Class60 local1418;
			@Pc(1424) boolean local1424;
			if (Static115.anInt2762 == 120) {
				local336 = Static105.aClass4_Sub13_Sub1_3.method1249();
				if (local336.method1670(Static59.aClass60_553)) {
					local1418 = local336.method1657(local336.method1649(Static110.aClass60_1072), 0);
					local851 = local1418.method1665();
					local1424 = false;
					for (local505 = 0; local505 < Static85.anInt2032; local505++) {
						if (Static39.aLongArray7[local505] == local851) {
							local1424 = true;
							break;
						}
					}
					if (!local1424 && Static57.anInt528 == 0) {
						Static73.method1386(Static37.aClass60_394, 4, local1418);
					}
				} else if (local336.method1670(Static35.aClass60_380)) {
					local1418 = local336.method1657(local336.method1649(Static110.aClass60_1072), 0);
					local851 = local1418.method1665();
					local1424 = false;
					for (local505 = 0; local505 < Static85.anInt2032; local505++) {
						if (Static39.aLongArray7[local505] == local851) {
							local1424 = true;
							break;
						}
					}
					if (!local1424 && Static57.anInt528 == 0) {
						Static73.method1386(Static88.aClass60_850, 8, local1418);
					}
				} else if (local336.method1670(aClass60_315)) {
					local1418 = local336.method1657(local336.method1649(Static110.aClass60_1072), 0);
					local851 = local1418.method1665();
					local1424 = false;
					for (local505 = 0; local505 < Static85.anInt2032; local505++) {
						if (Static39.aLongArray7[local505] == local851) {
							local1424 = true;
							break;
						}
					}
					if (!local1424 && Static57.anInt528 == 0) {
						@Pc(1581) Class60 local1581 = local336.method1657(local336.method1644() - 9, local336.method1649(Static110.aClass60_1072) + 1);
						Static73.method1386(local1581, 8, local1418);
					}
				} else {
					Static73.method1386(local336, 0, Static22.aClass60_241);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 224) {
				Static105.aClass4_Sub13_Sub1_3.method1210();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 141) {
				for (local131 = 0; local131 < Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1.length; local131++) {
					if (Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local131] != null) {
						Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local131].anInt2633 = -1;
					}
				}
				for (local135 = 0; local135 < Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2.length; local135++) {
					if (Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local135] != null) {
						Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local135].anInt2633 = -1;
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 6) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				Static105.anIntArray280[local135] = local131;
				if (Static62.anIntArray168[local135] != local131) {
					Static62.anIntArray168[local135] = local131;
					Static108.method1851(local135);
				}
				Static51.anIntArray141[Static121.anInt2898++ & 0x1F] = local135;
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(1755) int local1755;
			if (Static115.anInt2762 == 157) {
				local843 = Static105.aClass4_Sub13_Sub1_3.method1250();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1244();
				@Pc(1709) byte local1709 = Static105.aClass4_Sub13_Sub1_3.method1224();
				local1424 = false;
				if ((local843 & Long.MIN_VALUE) != 0L) {
					local1424 = true;
				}
				if (local1424) {
					if (Static105.anInt2506 == 0) {
						Static115.anInt2762 = -1;
						return true;
					}
					local843 &= Long.MAX_VALUE;
					for (local505 = 0; Static105.anInt2506 > local505 && (Static58.aClass4_Sub22Array1[local505].aLong100 != local843 || local139 != Static58.aClass4_Sub22Array1[local505].anInt2909); local505++) {
					}
					if (local505 < Static105.anInt2506) {
						while (Static105.anInt2506 - 1 > local505) {
							Static58.aClass4_Sub22Array1[local505] = Static58.aClass4_Sub22Array1[local505 + 1];
							local505++;
						}
						Static58.aClass4_Sub22Array1[Static105.anInt2506] = null;
						Static105.anInt2506--;
					}
				} else {
					@Pc(1725) Class4_Sub22 local1725 = new Class4_Sub22();
					local1725.aLong100 = local843;
					local1725.aClass60_1162 = Static87.method1501(local1725.aLong100);
					local1725.aByte8 = local1709;
					local1725.anInt2909 = local139;
					for (local1277 = Static105.anInt2506 - 1; local1277 >= 0; local1277--) {
						local1755 = Static58.aClass4_Sub22Array1[local1277].aClass60_1162.method1643(local1725.aClass60_1162);
						if (local1755 == 0) {
							Static58.aClass4_Sub22Array1[local1277].anInt2909 = local139;
							Static58.aClass4_Sub22Array1[local1277].aByte8 = local1709;
							Static115.anInt2762 = -1;
							if (Static62.aLong61 == local843) {
								Static87.aByte2 = local1709;
							}
							return true;
						}
						if (local1755 < 0) {
							break;
						}
					}
					if (Static58.aClass4_Sub22Array1.length <= Static105.anInt2506) {
						Static115.anInt2762 = -1;
						return true;
					}
					for (local1755 = Static105.anInt2506 - 1; local1755 > local1277; local1755--) {
						Static58.aClass4_Sub22Array1[local1755 + 1] = Static58.aClass4_Sub22Array1[local1755];
					}
					if (Static105.anInt2506 == 0) {
						Static58.aClass4_Sub22Array1 = new Class4_Sub22[100];
					}
					Static58.aClass4_Sub22Array1[local1277 + 1] = local1725;
					Static105.anInt2506++;
					if (local843 == Static62.aLong61) {
						Static87.aByte2 = local1709;
					}
				}
				Static115.anInt2762 = -1;
				Static16.anInt440 = Static81.anInt1944;
				return true;
			}
			if (Static115.anInt2762 == 118) {
				Static121.method2048();
				Static62.anInt1693 = Static105.aClass4_Sub13_Sub1_3.method1246();
				Static61.anInt1544 = Static63.anInt1698;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 19) {
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 134) {
				Static110.aBoolean115 = true;
				Static115.anInt2776 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static65.anInt1731 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static7.anInt2984 = Static105.aClass4_Sub13_Sub1_3.method1244();
				Static62.anInt1691 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static112.anInt2725 = Static105.aClass4_Sub13_Sub1_3.method1223();
				if (Static112.anInt2725 >= 100) {
					Static88.anInt2065 = Static115.anInt2776 * 128 + 64;
					Static74.anInt1856 = Static65.anInt1731 * 128 + 64;
					Static23.anInt663 = Static54.method1001(Static88.anInt2065, Static74.anInt1856, Static129.anInt3003) - Static7.anInt2984;
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 126) {
				Static121.method2048();
				Static52.anInt1346 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static61.anInt1544 = Static63.anInt1698;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 39) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1210();
				local189 = Static16.method283(local131);
				if (local189.anInt2208 != 2 || local189.anInt2228 != local135) {
					local189.anInt2228 = local135;
					local189.anInt2208 = 2;
					Static130.method2133(local189);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 155) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1215();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local131 < -70000) {
					local135 += 32768;
				}
				if (local131 >= 0) {
					local189 = Static16.method283(local131);
				} else {
					local189 = null;
				}
				while (Static78.anInt1911 > Static105.aClass4_Sub13_Sub1_3.anInt1643) {
					local691 = Static105.aClass4_Sub13_Sub1_3.method1237();
					local499 = Static105.aClass4_Sub13_Sub1_3.method1244();
					local505 = 0;
					if (local499 != 0) {
						local505 = Static105.aClass4_Sub13_Sub1_3.method1223();
						if (local505 == 255) {
							local505 = Static105.aClass4_Sub13_Sub1_3.method1215();
						}
					}
					if (local189 != null && local691 >= 0 && local691 < local189.anIntArray224.length) {
						local189.anIntArray224[local691] = local499;
						local189.anIntArray225[local691] = local505;
					}
					Static55.method1028(local499 - 1, local691, local505, local135);
				}
				if (local189 != null) {
					Static130.method2133(local189);
				}
				Static121.method2048();
				Static8.anIntArray10[Static120.anInt1941++ & 0x1F] = local135 & 0x7FFF;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 25) {
				local843 = Static105.aClass4_Sub13_Sub1_3.method1250();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1244();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1223();
				@Pc(2214) Class60 local2214 = Static87.method1501(local843).method1651();
				for (local505 = 0; local505 < Static46.anInt1193; local505++) {
					if (local843 == Static122.aLongArray13[local505]) {
						if (Static1.anIntArray1[local505] != local139) {
							Static1.anIntArray1[local505] = local139;
							if (local139 > 0) {
								Static73.method1386(Static125.method2072(new Class60[] { local2214, Static103.aClass60_596 }), 5, Static22.aClass60_241);
							}
							if (local139 == 0) {
								Static73.method1386(Static125.method2072(new Class60[] { local2214, Static23.aClass60_257 }), 5, Static22.aClass60_241);
							}
						}
						Static72.anIntArray189[local505] = local691;
						local2214 = null;
						break;
					}
				}
				if (local2214 != null && Static46.anInt1193 < 200) {
					Static122.aLongArray13[Static46.anInt1193] = local843;
					Static61.aClass60Array12[Static46.anInt1193] = local2214;
					Static1.anIntArray1[Static46.anInt1193] = local139;
					Static72.anIntArray189[Static46.anInt1193] = local691;
					Static46.anInt1193++;
				}
				Static92.anInt2194 = Static63.anInt1698;
				local1755 = Static46.anInt1193;
				while (local1755 > 0) {
					local1755--;
					@Pc(2330) boolean local2330 = true;
					for (local865 = 0; local865 < local1755; local865++) {
						if (Static83.anInt1974 != Static1.anIntArray1[local865] && Static1.anIntArray1[local865 + 1] == Static83.anInt1974 || Static1.anIntArray1[local865] == 0 && Static1.anIntArray1[local865 + 1] != 0) {
							local2330 = false;
							@Pc(2373) int local2373 = Static1.anIntArray1[local865];
							Static1.anIntArray1[local865] = Static1.anIntArray1[local865 + 1];
							Static1.anIntArray1[local865 + 1] = local2373;
							@Pc(2391) Class60 local2391 = Static61.aClass60Array12[local865];
							Static61.aClass60Array12[local865] = Static61.aClass60Array12[local865 + 1];
							Static61.aClass60Array12[local865 + 1] = local2391;
							@Pc(2409) long local2409 = Static122.aLongArray13[local865];
							Static122.aLongArray13[local865] = Static122.aLongArray13[local865 + 1];
							Static122.aLongArray13[local865 + 1] = local2409;
							local902 = Static72.anIntArray189[local865];
							Static72.anIntArray189[local865] = Static72.anIntArray189[local865 + 1];
							Static72.anIntArray189[local865 + 1] = local902;
						}
					}
					if (local2330) {
						break;
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 26) {
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 232) {
				Static52.method975();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 165) {
				Static16.anInt440 = Static81.anInt1944;
				local843 = Static105.aClass4_Sub13_Sub1_3.method1250();
				if (local843 == 0L) {
					Static115.anInt2762 = -1;
					Static58.aClass4_Sub22Array1 = null;
					Static57.aClass60_186 = null;
					Static105.anInt2506 = 0;
					return true;
				}
				Static57.aClass60_186 = Static87.method1501(local843);
				Static105.aByte5 = Static105.aClass4_Sub13_Sub1_3.method1224();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1223();
				if (local139 == 255) {
					Static115.anInt2762 = -1;
					return true;
				}
				Static105.anInt2506 = local139;
				@Pc(2524) Class4_Sub22[] local2524 = new Class4_Sub22[100];
				for (local499 = 0; local499 < Static105.anInt2506; local499++) {
					local2524[local499] = new Class4_Sub22();
					local2524[local499].aLong100 = Static105.aClass4_Sub13_Sub1_3.method1250();
					local2524[local499].aClass60_1162 = Static87.method1501(local2524[local499].aLong100);
					local2524[local499].anInt2909 = Static105.aClass4_Sub13_Sub1_3.method1244();
					local2524[local499].aByte8 = Static105.aClass4_Sub13_Sub1_3.method1224();
					if (local2524[local499].aLong100 == Static62.aLong61) {
						Static87.aByte2 = local2524[local499].aByte8;
					}
				}
				local1755 = Static105.anInt2506;
				while (local1755 > 0) {
					@Pc(2593) boolean local2593 = true;
					local1755--;
					for (local865 = 0; local865 < local1755; local865++) {
						if (local2524[local865].aClass60_1162.method1643(local2524[local865 + 1].aClass60_1162) > 0) {
							local2593 = false;
							@Pc(2617) Class4_Sub22 local2617 = local2524[local865];
							local2524[local865] = local2524[local865 + 1];
							local2524[local865 + 1] = local2617;
						}
					}
					if (local2593) {
						break;
					}
				}
				Static58.aClass4_Sub22Array1 = local2524;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 90) {
				Static18.method300();
				Static115.anInt2762 = -1;
				return false;
			}
			if (Static115.anInt2762 == 127 || Static115.anInt2762 == 193 || Static115.anInt2762 == 33 || Static115.anInt2762 == 16 || Static115.anInt2762 == 222 || Static115.anInt2762 == 241 || Static115.anInt2762 == 67 || Static115.anInt2762 == 96 || Static115.anInt2762 == 72 || Static115.anInt2762 == 41 || Static115.anInt2762 == 122) {
				Static85.method1499();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 48) {
				Static74.anInt1854 = Static105.aClass4_Sub13_Sub1_3.method1255();
				Static89.anInt2077 = Static105.aClass4_Sub13_Sub1_3.method1223();
				while (Static105.aClass4_Sub13_Sub1_3.anInt1643 < Static78.anInt1911) {
					Static115.anInt2762 = Static105.aClass4_Sub13_Sub1_3.method1223();
					Static85.method1499();
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 9) {
				if (Static23.anInt664 != -1) {
					Static11.method207(Static23.anInt664, 0);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(2846) Class4_Sub18 local2846;
			if (Static115.anInt2762 == 176) {
				local131 = Static78.anInt1911 + Static105.aClass4_Sub13_Sub1_3.anInt1643;
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local135 != Static23.anInt664) {
					Static23.anInt664 = local135;
					Static8.method118(Static23.anInt664);
					Static26.method507(Static23.anInt664);
					for (local139 = 0; local139 < 100; local139++) {
						Static69.aBooleanArray8[local139] = true;
					}
				}
				while (Static105.aClass4_Sub13_Sub1_3.anInt1643 < local131) {
					local139 = Static105.aClass4_Sub13_Sub1_3.method1215();
					local691 = Static105.aClass4_Sub13_Sub1_3.method1244();
					local499 = Static105.aClass4_Sub13_Sub1_3.method1223();
					@Pc(2814) Class4_Sub18 local2814 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local139);
					if (local2814 != null && local2814.anInt2402 != local691) {
						Static5.method38(true, local2814);
						local2814 = null;
					}
					if (local2814 == null) {
						local2814 = Static20.method366(local499, local139, local691);
					}
					local2814.aBoolean109 = true;
				}
				for (local2846 = (Class4_Sub18) Static111.aClass66_12.method1838(); local2846 != null; local2846 = (Class4_Sub18) Static111.aClass66_12.method1831()) {
					if (local2846.aBoolean109) {
						local2846.aBoolean109 = false;
					} else {
						Static5.method38(true, local2846);
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 18) {
				local131 = Static105.aClass4_Sub13_Sub1_3.method1215();
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local131 < -70000) {
					local135 += 32768;
				}
				if (local131 >= 0) {
					local189 = Static16.method283(local131);
				} else {
					local189 = null;
				}
				if (local189 != null) {
					for (local691 = 0; local691 < local189.anIntArray224.length; local691++) {
						local189.anIntArray224[local691] = 0;
						local189.anIntArray225[local691] = 0;
					}
				}
				Static87.method1504(local135);
				local691 = Static105.aClass4_Sub13_Sub1_3.method1244();
				for (local499 = 0; local499 < local691; local499++) {
					local505 = Static105.aClass4_Sub13_Sub1_3.method1255();
					if (local505 == 255) {
						local505 = Static105.aClass4_Sub13_Sub1_3.method1234();
					}
					local1277 = Static105.aClass4_Sub13_Sub1_3.method1236();
					if (local189 != null && local499 < local189.anIntArray224.length) {
						local189.anIntArray224[local499] = local1277;
						local189.anIntArray225[local499] = local505;
					}
					Static55.method1028(local1277 - 1, local499, local505, local135);
				}
				if (local189 != null) {
					Static130.method2133(local189);
				}
				Static121.method2048();
				Static8.anIntArray10[Static120.anInt1941++ & 0x1F] = local135 & 0x7FFF;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 119) {
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 226) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1236();
				Static23.anInt664 = local135;
				Static8.method118(local135);
				Static26.method507(Static23.anInt664);
				for (local139 = 0; local139 < 100; local139++) {
					Static69.aBooleanArray8[local139] = true;
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 160) {
				Static105.aClass4_Sub13_Sub1_3.method1243();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 86) {
				Static131.method2143();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 183) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1253();
				local189 = Static16.method283(local135);
				for (local691 = 0; local691 < local189.anIntArray224.length; local691++) {
					local189.anIntArray224[local691] = -1;
					local189.anIntArray224[local691] = 0;
				}
				Static130.method2133(local189);
				Static115.anInt2762 = -1;
				return true;
			}
			@Pc(3135) long local3135;
			if (Static115.anInt2762 == 188) {
				local3135 = Static105.aClass4_Sub13_Sub1_3.method1250();
				@Pc(3142) Class60 local3142 = Static97.method1747(Static56.method1039(Static105.aClass4_Sub13_Sub1_3).method1663());
				Static73.method1386(local3142, 6, Static87.method1501(local3135).method1651());
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 202) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1215();
				local189 = Static16.method283(local135);
				local189.anInt2208 = 3;
				local189.anInt2228 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1.method1035();
				Static130.method2133(local189);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 113) {
				for (local135 = 0; local135 < Static62.anIntArray168.length; local135++) {
					if (Static62.anIntArray168[local135] != Static105.anIntArray280[local135]) {
						Static62.anIntArray168[local135] = Static105.anIntArray280[local135];
						Static108.method1851(local135);
						Static51.anIntArray141[Static121.anInt2898++ & 0x1F] = local135;
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 7) {
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 124) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1215();
				local2846 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local135);
				if (local2846 != null) {
					Static5.method38(true, local2846);
				}
				if (Static11.aClass4_Sub17_1 != null) {
					Static130.method2133(Static11.aClass4_Sub17_1);
					Static11.aClass4_Sub17_1 = null;
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 204) {
				local3135 = Static105.aClass4_Sub13_Sub1_3.method1250();
				@Pc(3288) long local3288 = (long) Static105.aClass4_Sub13_Sub1_3.method1244();
				@Pc(3293) long local3293 = (long) Static105.aClass4_Sub13_Sub1_3.method1241();
				@Pc(3299) long local3299 = local3293 + (local3288 << 32);
				local1755 = Static105.aClass4_Sub13_Sub1_3.method1223();
				@Pc(3305) boolean local3305 = false;
				for (@Pc(3307) int local3307 = 0; local3307 < 100; local3307++) {
					if (local3299 == Static67.aLongArray12[local3307]) {
						local3305 = true;
						break;
					}
				}
				if (local1755 <= 1) {
					for (local875 = 0; local875 < Static85.anInt2032; local875++) {
						if (Static39.aLongArray7[local875] == local3135) {
							local3305 = true;
							break;
						}
					}
				}
				if (!local3305 && Static57.anInt528 == 0) {
					Static67.aLongArray12[Static112.anInt2730] = local3299;
					Static112.anInt2730 = (Static112.anInt2730 + 1) % 100;
					@Pc(3367) Class60 local3367 = Static97.method1747(Static56.method1039(Static105.aClass4_Sub13_Sub1_3).method1663());
					if (local1755 == 2 || local1755 == 3) {
						Static73.method1386(local3367, 7, Static125.method2072(new Class60[] { Static22.aClass60_237, Static87.method1501(local3135).method1651() }));
					} else if (local1755 == 1) {
						Static73.method1386(local3367, 7, Static125.method2072(new Class60[] { Static74.aClass60_725, Static87.method1501(local3135).method1651() }));
					} else {
						Static73.method1386(local3367, 3, Static87.method1501(local3135).method1651());
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 173) {
				Static18.anInt469 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static115.anInt2762 = -1;
				Static92.anInt2194 = Static63.anInt1698;
				return true;
			}
			if (Static115.anInt2762 == 64) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1253();
				Static52.aClass30_3 = Static129.aClass35_3.method982(local135);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 80) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1255();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1235();
				Static129.anInt3003 = local691 >> 1;
				Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1880(local139, (local691 & 0x1) == 1, local135);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 63) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1210();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1215();
				local494 = Static16.method283(local139);
				if (local494 != null && local494.anInt2231 == 0) {
					if (local494.anInt2196 - local494.anInt2186 < local135) {
						local135 = local494.anInt2196 - local494.anInt2186;
					}
					if (local135 < 0) {
						local135 = 0;
					}
					if (local135 != local494.anInt2215) {
						local494.anInt2215 = local135;
						Static130.method2133(local494);
					}
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 191) {
				Static110.aBoolean115 = false;
				for (local135 = 0; local135 < 5; local135++) {
					Static101.aBooleanArray16[local135] = false;
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 159) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1253();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1213();
				local494 = Static16.method283(local135);
				if (local139 != local494.anInt2198 || local139 == -1) {
					local494.anInt2251 = 0;
					local494.anInt2198 = local139;
					local494.anInt2207 = 0;
					Static130.method2133(local494);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 75) {
				Static105.aClass4_Sub13_Sub1_3.method1223();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 192) {
				Static77.anInt1906 = Static105.aClass4_Sub13_Sub1_3.method1232() * 30;
				Static61.anInt1544 = Static63.anInt1698;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 115) {
				Static105.aClass4_Sub13_Sub1_3.method1236();
				Static105.aClass4_Sub13_Sub1_3.method1210();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 121) {
				Static26.anInt725 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 220) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1234();
				@Pc(3702) boolean local3702 = Static105.aClass4_Sub13_Sub1_3.method1229() == 1;
				local494 = Static16.method283(local135);
				if (local3702 != local494.aBoolean96) {
					local494.aBoolean96 = local3702;
					Static130.method2133(local494);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 28) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1232();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1253();
				local499 = local135 >> 5 & 0x1F;
				local691 = local135 >> 10 & 0x1F;
				local505 = local135 & 0x1F;
				local1277 = (local499 << 11) + (local691 << 19) + (local505 << 3);
				@Pc(3764) Class4_Sub17 local3764 = Static16.method283(local139);
				if (local3764.anInt2244 != local1277) {
					local3764.anInt2244 = local1277;
					Static130.method2133(local3764);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 239) {
				local1418 = Static105.aClass4_Sub13_Sub1_3.method1249();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1229();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1235();
				if (local691 >= 1 && local691 <= 5) {
					if (local1418.method1661(Static47.aClass60_484)) {
						local1418 = null;
					}
					Static10.aClass60Array3[local691 - 1] = local1418;
					Static93.aBooleanArray11[local691 - 1] = local139 == 0;
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 214) {
				Static85.anInt2032 = Static78.anInt1911 / 8;
				for (local135 = 0; local135 < Static85.anInt2032; local135++) {
					Static39.aLongArray7[local135] = Static105.aClass4_Sub13_Sub1_3.method1250();
				}
				Static115.anInt2762 = -1;
				Static92.anInt2194 = Static63.anInt1698;
				return true;
			}
			if (Static115.anInt2762 == 190) {
				Static89.anInt2077 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static74.anInt1854 = Static105.aClass4_Sub13_Sub1_3.method1255();
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 101) {
				Static104.method1822(true);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 40) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local499 = Static105.aClass4_Sub13_Sub1_3.method1223();
				Static101.aBooleanArray16[local135] = true;
				Static70.anIntArray184[local135] = local139;
				Static83.anIntArray198[local135] = local691;
				Static45.anIntArray110[local135] = local499;
				Static74.anIntArray192[local135] = 0;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 89) {
				@Pc(3942) byte local3942 = Static105.aClass4_Sub13_Sub1_3.method1227();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1210();
				Static105.anIntArray280[local139] = local3942;
				if (Static62.anIntArray168[local139] != local3942) {
					Static62.anIntArray168[local139] = local3942;
					Static108.method1851(local139);
				}
				Static51.anIntArray141[Static121.anInt2898++ & 0x1F] = local139;
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 93) {
				Static75.method1404(Static129.aClass35_3, Static78.anInt1911, Static105.aClass4_Sub13_Sub1_3);
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 102) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local135 == 65535) {
					local135 = -1;
				}
				local139 = Static105.aClass4_Sub13_Sub1_3.method1253();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local499 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local499 == 65535) {
					local499 = -1;
				}
				for (local505 = local135; local505 <= local499; local505++) {
					local861 = ((long) local691 << 32) + (long) local505;
					@Pc(4036) Class4 local4036 = Static109.aClass66_11.method1834(local861);
					if (local4036 != null) {
						local4036.method2124();
					}
					Static109.aClass66_11.method1830(new Class4_Sub5(local139), local861);
				}
				Static115.anInt2762 = -1;
				return true;
			}
			if (Static115.anInt2762 == 10) {
				local135 = Static105.aClass4_Sub13_Sub1_3.method1236();
				local139 = Static105.aClass4_Sub13_Sub1_3.method1210();
				local691 = Static105.aClass4_Sub13_Sub1_3.method1230();
				local695 = Static16.method283(local691);
				Static115.anInt2762 = -1;
				local695.anInt2183 = local139 + (local135 << 16);
				return true;
			}
			Static15.method2092(null, "T1 - " + Static115.anInt2762 + "," + Static7.anInt2988 + "," + Static99.anInt2423 + " - " + Static78.anInt1911);
			Static18.method300();
		} catch (@Pc(4117) IOException local4117) {
			Static58.method1050();
		} catch (@Pc(4121) Exception local4121) {
			@Pc(4162) String local4162 = "T2 - " + Static115.anInt2762 + "," + Static7.anInt2988 + "," + Static99.anInt2423 + " - " + Static78.anInt1911 + "," + (Static106.anInt2518 + Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0]) + "," + (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0] + Static99.anInt2424) + " - ";
			for (local135 = 0; Static78.anInt1911 > local135 && local135 < 50; local135++) {
				local4162 = local4162 + Static105.aClass4_Sub13_Sub1_3.aByteArray68[local135] + ",";
			}
			Static15.method2092(local4121, local4162);
			Static18.method300();
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!qc;Lclient!qc;Lclient!lc;)[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] method545(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(13) int local13 = arg2.method1107(arg1);
		@Pc(19) int local19 = arg2.method1100(local13, arg0);
		return Static82.method1459(local19, local13, arg2);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lclient!qc;I)[Lclient!qc;")
	public static Class60[] method558(@OriginalArg(0) Class60[] arg0) {
		@Pc(8) Class60[] local8 = new Class60[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = Static125.method2072(new Class60[] { Static120.method1450(local18), Static31.aClass60_341 });
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = Static125.method2072(new Class60[] { local8[local18], arg0[local18] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qd;")
	public static RuntimeException_Sub1 method561(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V")
	public static void method563() {
		while (true) {
			if (Static105.aClass4_Sub13_Sub1_3.method1261(Static78.anInt1911) >= 27) {
				@Pc(20) int local20 = Static105.aClass4_Sub13_Sub1_3.method1260(15);
				if (local20 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local20] == null) {
						local25 = true;
						Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local20] = new Class4_Sub4_Sub1_Sub2_Sub1();
					}
					@Pc(41) Class4_Sub4_Sub1_Sub2_Sub1 local41 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local20];
					Static38.anIntArray72[Static114.anInt2750++] = local20;
					local41.anInt2592 = Static81.anInt1944;
					@Pc(57) int local57 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
					@Pc(64) int local64 = Static10.anIntArray16[Static105.aClass4_Sub13_Sub1_3.method1260(3)];
					if (local25) {
						local41.anInt2634 = local41.anInt2591 = local64;
					}
					@Pc(77) int local77 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
					if (local77 == 1) {
						Static35.anIntArray68[Static85.anInt2030++] = local20;
					}
					local41.aClass4_Sub4_Sub11_1 = Static122.method2060(Static105.aClass4_Sub13_Sub1_3.method1260(14));
					@Pc(103) int local103 = Static105.aClass4_Sub13_Sub1_3.method1260(5);
					if (local103 > 15) {
						local103 -= 32;
					}
					@Pc(114) int local114 = Static105.aClass4_Sub13_Sub1_3.method1260(5);
					local41.anInt2647 = local41.aClass4_Sub4_Sub11_1.anInt2012;
					local41.anInt2628 = local41.aClass4_Sub4_Sub11_1.anInt2024;
					local41.anInt2613 = local41.aClass4_Sub4_Sub11_1.anInt2006;
					if (local114 > 15) {
						local114 -= 32;
					}
					if (local41.anInt2628 == 0) {
						local41.anInt2591 = 0;
					}
					local41.anInt2603 = local41.aClass4_Sub4_Sub11_1.anInt2011;
					local41.anInt2637 = local41.aClass4_Sub4_Sub11_1.anInt2014;
					local41.anInt2590 = local41.aClass4_Sub4_Sub11_1.anInt2007;
					local41.anInt2612 = local41.aClass4_Sub4_Sub11_1.anInt2008;
					local41.anInt2606 = local41.aClass4_Sub4_Sub11_1.anInt1998;
					local41.anInt2594 = local41.aClass4_Sub4_Sub11_1.anInt2009;
					local41.method1880(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0] + local114, local57 == 1, local103 + Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0]);
					continue;
				}
			}
			Static105.aClass4_Sub13_Sub1_3.method1258();
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method567() {
		aClass60Array6 = null;
		aClass60_315 = null;
		anIntArray48 = null;
		aClass60_317 = null;
		aClass60_319 = null;
		aClass60_318 = null;
		aClass60_316 = null;
		aClass60_320 = null;
	}
}
