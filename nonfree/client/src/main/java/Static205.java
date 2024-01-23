import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "Lclient!kb;")
	public static Class55 aClass55_4;

	@OriginalMember(owner = "client!uj", name = "db", descriptor = "Lclient!cb;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array30 = new Class60[100];

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
	public static int anInt4356 = 0;

	@OriginalMember(owner = "client!uj", name = "ab", descriptor = "Lclient!db;")
	public static Class19 aClass19_17 = new Class19();

	@OriginalMember(owner = "client!uj", name = "eb", descriptor = "[B")
	public static byte[] aByteArray61 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILclient!ef;)V")
	public static void method3192(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray29;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub1_Sub26 local18 = Static132.method2212(local14);
		if (local18 == null) {
			return;
		}
		Static45.anInt1027 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray555;
		@Pc(35) int[] local35 = local18.anIntArray556;
		@Pc(41) byte local41 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static48.aClass60Array7 = new Class60[local18.anInt4265];
			Static150.anIntArray434 = new int[local18.anInt4264];
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg1.anInt1069;
					}
					if (local93 == -2147483646) {
						local93 = arg1.anInt1072;
					}
					if (local93 == -2147483645) {
						local93 = arg1.aClass6_5 == null ? -1 : arg1.aClass6_5.anInt229;
					}
					if (local93 == -2147483644) {
						local93 = arg1.anInt1070;
					}
					if (local93 == -2147483643) {
						local93 = arg1.aClass6_5 == null ? -1 : arg1.aClass6_5.anInt242;
					}
					if (local93 == -2147483642) {
						local93 = arg1.aClass6_6 == null ? -1 : arg1.aClass6_6.anInt229;
					}
					if (local93 == -2147483641) {
						local93 = arg1.aClass6_6 == null ? -1 : arg1.aClass6_6.anInt242;
					}
					if (local93 == -2147483640) {
						local93 = arg1.anInt1071;
					}
					if (local93 == -2147483639) {
						local93 = arg1.anInt1068;
					}
					Static150.anIntArray434[local53++] = local93;
				} else if (local8[local55] instanceof Class60) {
					@Pc(72) Class60 local72 = (Class60) local8[local55];
					if (local72.method1826(Static1.aClass60_24)) {
						local72 = arg1.aClass60_357;
					}
					Static48.aClass60Array7[local51++] = local72;
				}
			}
			local93 = 0;
			label2551: while (true) {
				local93++;
				if (local93 > arg0) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(203) int local203 = local35[local29];
				@Pc(773) int local773;
				@Pc(624) int local624;
				@Pc(644) int local644;
				@Pc(768) int local768;
				@Pc(582) Class60 local582;
				if (local203 < 100) {
					if (local203 == 0) {
						Static132.anIntArray372[local25++] = local32[local29];
						continue;
					}
					@Pc(229) int local229;
					if (local203 == 1) {
						local229 = local32[local29];
						Static132.anIntArray372[local25++] = Static126.anIntArray358[local229];
						continue;
					}
					if (local203 == 2) {
						local229 = local32[local29];
						local25--;
						Static126.anIntArray358[local229] = Static132.anIntArray372[local25];
						continue;
					}
					if (local203 == 3) {
						Static126.aClass60Array19[local27++] = local18.aClass60Array29[local29];
						continue;
					}
					if (local203 == 6) {
						local29 += local32[local29];
						continue;
					}
					if (local203 == 7) {
						local25 -= 2;
						if (Static132.anIntArray372[local25 + 1] != Static132.anIntArray372[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 8) {
						local25 -= 2;
						if (Static132.anIntArray372[local25 + 1] == Static132.anIntArray372[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 9) {
						local25 -= 2;
						if (Static132.anIntArray372[local25 + 1] > Static132.anIntArray372[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 10) {
						local25 -= 2;
						if (Static132.anIntArray372[local25] > Static132.anIntArray372[local25 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 21) {
						if (Static45.anInt1027 == 0) {
							return;
						}
						@Pc(397) Class79 local397 = Static170.aClass79Array1[--Static45.anInt1027];
						Static150.anIntArray434 = local397.anIntArray460;
						Static48.aClass60Array7 = local397.aClass60Array24;
						local29 = local397.anInt3559;
						local18 = local397.aClass1_Sub1_Sub26_1;
						local32 = local18.anIntArray555;
						local35 = local18.anIntArray556;
						continue;
					}
					if (local203 == 25) {
						local229 = local32[local29];
						Static132.anIntArray372[local25++] = Static7.method142(local229);
						continue;
					}
					if (local203 == 27) {
						local229 = local32[local29];
						local25--;
						Static19.method332(Static132.anIntArray372[local25], local229);
						continue;
					}
					if (local203 == 31) {
						local25 -= 2;
						if (Static132.anIntArray372[local25 + 1] >= Static132.anIntArray372[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 32) {
						local25 -= 2;
						if (Static132.anIntArray372[local25 + 1] <= Static132.anIntArray372[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local203 == 33) {
						Static132.anIntArray372[local25++] = Static150.anIntArray434[local32[local29]];
						continue;
					}
					@Pc(526) int local526;
					if (local203 == 34) {
						local526 = local32[local29];
						local25--;
						Static150.anIntArray434[local526] = Static132.anIntArray372[local25];
						continue;
					}
					if (local203 == 35) {
						Static126.aClass60Array19[local27++] = Static48.aClass60Array7[local32[local29]];
						continue;
					}
					if (local203 == 36) {
						local526 = local32[local29];
						local27--;
						Static48.aClass60Array7[local526] = Static126.aClass60Array19[local27];
						continue;
					}
					if (local203 == 37) {
						local229 = local32[local29];
						local27 -= local229;
						local582 = Static82.method1453(local229, local27, Static126.aClass60Array19);
						Static126.aClass60Array19[local27++] = local582;
						continue;
					}
					if (local203 == 38) {
						local25--;
						continue;
					}
					if (local203 == 39) {
						local27--;
						continue;
					}
					if (local203 == 40) {
						local229 = local32[local29];
						@Pc(614) Class1_Sub1_Sub26 local614 = Static132.method2212(local229);
						@Pc(618) int[] local618 = new int[local614.anInt4264];
						@Pc(622) Class60[] local622 = new Class60[local614.anInt4265];
						for (local624 = 0; local624 < local614.anInt4268; local624++) {
							local618[local624] = Static132.anIntArray372[local624 + local25 - local614.anInt4268];
						}
						for (local644 = 0; local644 < local614.anInt4267; local644++) {
							local622[local644] = Static126.aClass60Array19[local27 + local644 - local614.anInt4267];
						}
						local25 -= local614.anInt4268;
						local27 -= local614.anInt4267;
						@Pc(677) Class79 local677 = new Class79();
						local677.anInt3559 = local29;
						local677.anIntArray460 = Static150.anIntArray434;
						local677.aClass60Array24 = Static48.aClass60Array7;
						local677.aClass1_Sub1_Sub26_1 = local18;
						if (Static170.aClass79Array1.length <= Static45.anInt1027) {
							throw new RuntimeException();
						}
						Static170.aClass79Array1[Static45.anInt1027++] = local677;
						Static150.anIntArray434 = local618;
						Static48.aClass60Array7 = local622;
						local18 = local614;
						local32 = local614.anIntArray555;
						local29 = -1;
						local35 = local614.anIntArray556;
						continue;
					}
					if (local203 == 42) {
						Static132.anIntArray372[local25++] = Static208.anIntArray580[local32[local29]];
						continue;
					}
					if (local203 == 43) {
						local526 = local32[local29];
						local25--;
						Static208.anIntArray580[local526] = Static132.anIntArray372[local25];
						continue;
					}
					if (local203 == 44) {
						local229 = local32[local29] >> 16;
						local768 = local32[local29] & 0xFFFF;
						local25--;
						local773 = Static132.anIntArray372[local25];
						if (local773 >= 0 && local773 <= 5000) {
							@Pc(789) byte local789 = -1;
							Static38.anIntArray131[local229] = local773;
							if (local768 == 105) {
								local789 = 0;
							}
							local624 = 0;
							while (true) {
								if (local624 >= local773) {
									continue label2551;
								}
								Static188.anIntArrayArray63[local229][local624] = local789;
								local624++;
							}
						}
						throw new RuntimeException();
					}
					if (local203 == 45) {
						local25--;
						local768 = Static132.anIntArray372[local25];
						local229 = local32[local29];
						if (local768 >= 0 && Static38.anIntArray131[local229] > local768) {
							Static132.anIntArray372[local25++] = Static188.anIntArrayArray63[local229][local768];
							continue;
						}
						throw new RuntimeException();
					}
					if (local203 == 46) {
						local229 = local32[local29];
						local25 -= 2;
						local768 = Static132.anIntArray372[local25];
						if (local768 >= 0 && local768 < Static38.anIntArray131[local229]) {
							Static188.anIntArrayArray63[local229][local768] = Static132.anIntArray372[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local203 == 47) {
						@Pc(897) Class60 local897 = Static161.aClass60Array25[local32[local29]];
						if (local897 == null) {
							local897 = Static29.aClass60_243;
						}
						Static126.aClass60Array19[local27++] = local897;
						continue;
					}
					if (local203 == 48) {
						local526 = local32[local29];
						local27--;
						Static161.aClass60Array25[local526] = Static126.aClass60Array19[local27];
						continue;
					}
					if (local203 == 51) {
						@Pc(934) Class33 local934 = local18.aClass33Array1[local32[local29]];
						local25--;
						@Pc(944) Class1_Sub16 local944 = (Class1_Sub16) local934.method1071((long) Static132.anIntArray372[local25]);
						if (local944 != null) {
							local29 += local944.anInt2543;
						}
						continue;
					}
				}
				@Pc(960) boolean local960;
				if (local32[local29] == 1) {
					local960 = true;
				} else {
					local960 = false;
				}
				@Pc(1110) Class6 local1110;
				@Pc(981) int local981;
				@Pc(997) Class6 local997;
				@Pc(1018) int local1018;
				@Pc(1180) Class6 local1180;
				if (local203 < 300) {
					if (local203 == 100) {
						local25 -= 3;
						local768 = Static132.anIntArray372[local25];
						local981 = Static132.anIntArray372[local25 + 2];
						local773 = Static132.anIntArray372[local25 + 1];
						if (local773 == 0) {
							throw new RuntimeException();
						}
						local997 = Static107.method1857(local768);
						if (local997.aClass6Array1 == null) {
							local997.aClass6Array1 = new Class6[local981 + 1];
						}
						if (local997.aClass6Array1.length <= local981) {
							@Pc(1016) Class6[] local1016 = new Class6[local981 + 1];
							for (local1018 = 0; local1018 < local997.aClass6Array1.length; local1018++) {
								local1016[local1018] = local997.aClass6Array1[local1018];
							}
							local997.aClass6Array1 = local1016;
						}
						if (local981 > 0 && local997.aClass6Array1[local981 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local981 - 1));
						}
						@Pc(1065) Class6 local1065 = new Class6();
						local1065.anInt242 = local981;
						local1065.aBoolean13 = true;
						local1065.anInt233 = local773;
						local1065.anInt204 = local1065.anInt229 = local997.anInt229;
						local997.aClass6Array1[local981] = local1065;
						if (local960) {
							Static133.aClass6_12 = local1065;
						} else {
							Static82.aClass6_10 = local1065;
						}
						Static57.method1068(local997);
						continue;
					}
					@Pc(1132) Class6 local1132;
					if (local203 == 101) {
						local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
						if (local1110.anInt242 == -1) {
							if (local960) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1132 = Static107.method1857(local1110.anInt229);
						local1132.aClass6Array1[local1110.anInt242] = null;
						Static57.method1068(local1132);
						continue;
					}
					if (local203 == 102) {
						local25--;
						local1110 = Static107.method1857(Static132.anIntArray372[local25]);
						local1110.aClass6Array1 = null;
						Static57.method1068(local1110);
						continue;
					}
					if (local203 == 200) {
						local25 -= 2;
						local768 = Static132.anIntArray372[local25];
						local773 = Static132.anIntArray372[local25 + 1];
						local1180 = Static92.method1619(local768, local773);
						if (local1180 != null && local773 != -1) {
							Static132.anIntArray372[local25++] = 1;
							if (local960) {
								Static133.aClass6_12 = local1180;
							} else {
								Static82.aClass6_10 = local1180;
							}
							continue;
						}
						Static132.anIntArray372[local25++] = 0;
						continue;
					}
					if (local203 == 201) {
						local25--;
						local768 = Static132.anIntArray372[local25];
						local1132 = Static107.method1857(local768);
						if (local1132 == null) {
							Static132.anIntArray372[local25++] = 0;
						} else {
							Static132.anIntArray372[local25++] = 1;
							if (local960) {
								Static133.aClass6_12 = local1132;
							} else {
								Static82.aClass6_10 = local1132;
							}
						}
						continue;
					}
				} else if (local203 < 500) {
					if (local203 == 403) {
						local25 -= 2;
						local768 = Static132.anIntArray372[local25];
						if (local768 >= 7) {
							local768 -= 7;
						}
						local773 = Static132.anIntArray372[local25 + 1];
						Static84.aClass9_Sub4_Sub1_2.aClass50_2.method1524(local773, local768);
						continue;
					}
					if (local203 == 404) {
						local25 -= 2;
						local768 = Static132.anIntArray372[local25];
						local773 = Static132.anIntArray372[local25 + 1];
						Static84.aClass9_Sub4_Sub1_2.aClass50_2.method1523(local768, local773);
						continue;
					}
					if (local203 == 410) {
						local25--;
						@Pc(1315) boolean local1315 = Static132.anIntArray372[local25] != 0;
						Static84.aClass9_Sub4_Sub1_2.aClass50_2.method1522(local1315);
						continue;
					}
				} else if ((local203 < 1000 || local203 >= 1100) && (local203 < 2000 || local203 >= 2100)) {
					@Pc(2308) Class60 local2308;
					if (local203 >= 1100 && local203 < 1200 || !(local203 < 2100 || local203 >= 2200)) {
						if (local203 >= 2000) {
							local203 -= 1000;
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
						} else {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
						}
						if (local203 == 1100) {
							local25 -= 2;
							local1110.anInt250 = Static132.anIntArray372[local25];
							if (local1110.anInt250 > local1110.anInt201 - local1110.anInt251) {
								local1110.anInt250 = local1110.anInt201 - local1110.anInt251;
							}
							if (local1110.anInt250 < 0) {
								local1110.anInt250 = 0;
							}
							local1110.anInt247 = Static132.anIntArray372[local25 + 1];
							if (local1110.anInt247 > local1110.anInt266 - local1110.anInt221) {
								local1110.anInt247 = local1110.anInt266 - local1110.anInt221;
							}
							if (local1110.anInt247 < 0) {
								local1110.anInt247 = 0;
							}
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1101) {
							local25--;
							local1110.anInt191 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1102) {
							local25--;
							local1110.aBoolean11 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1103) {
							local25--;
							local1110.anInt217 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1104) {
							local25--;
							local1110.anInt270 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1105) {
							local25--;
							local1110.anInt257 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1106) {
							local25--;
							local1110.anInt230 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1107) {
							local25--;
							local1110.aBoolean8 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1108) {
							local1110.anInt246 = 1;
							local25--;
							local1110.anInt239 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1109) {
							local25 -= 6;
							local1110.anInt216 = Static132.anIntArray372[local25];
							local1110.anInt192 = Static132.anIntArray372[local25 + 1];
							local1110.anInt237 = Static132.anIntArray372[local25 + 2];
							local1110.anInt223 = Static132.anIntArray372[local25 + 3];
							local1110.anInt265 = Static132.anIntArray372[local25 + 4];
							local1110.anInt212 = Static132.anIntArray372[local25 + 5];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1110) {
							local25--;
							local773 = Static132.anIntArray372[local25];
							if (local773 != local1110.anInt264) {
								local1110.anInt258 = 0;
								local1110.anInt264 = local773;
								local1110.anInt269 = 0;
								Static57.method1068(local1110);
							}
							continue;
						}
						if (local203 == 1111) {
							local25--;
							local1110.aBoolean10 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1112) {
							local27--;
							local2308 = Static126.aClass60Array19[local27];
							if (!local2308.method1826(local1110.aClass60_73)) {
								local1110.aClass60_73 = local2308;
								Static57.method1068(local1110);
							}
							continue;
						}
						if (local203 == 1113) {
							local25--;
							local1110.anInt243 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1114) {
							local25 -= 3;
							local1110.anInt254 = Static132.anIntArray372[local25];
							local1110.anInt227 = Static132.anIntArray372[local25 + 1];
							local1110.anInt225 = Static132.anIntArray372[local25 + 2];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1115) {
							local25--;
							local1110.aBoolean20 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1116) {
							local25--;
							local1110.anInt211 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1117) {
							local25--;
							local1110.anInt259 = Static132.anIntArray372[local25];
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1118) {
							local25--;
							local1110.aBoolean7 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1119) {
							local25--;
							local1110.aBoolean15 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1120) {
							local25 -= 2;
							local1110.anInt201 = Static132.anIntArray372[local25];
							local1110.anInt266 = Static132.anIntArray372[local25 + 1];
							Static57.method1068(local1110);
							if (local1110.anInt233 == 0) {
								Static178.method2848(false, local1110);
							}
							continue;
						}
						if (local203 == 1121) {
							local25--;
							Static57.method1068(local1110);
							continue;
						}
						if (local203 == 1122) {
							local25--;
							local1110.aBoolean22 = Static132.anIntArray372[local25] == 1;
							Static57.method1068(local1110);
							continue;
						}
					} else if (local203 >= 1200 && local203 < 1300 || local203 >= 2200 && local203 < 2300) {
						if (local203 < 2000) {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
						} else {
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
							local203 -= 1000;
						}
						Static57.method1068(local1110);
						if (local203 == 1200 || local203 == 1205) {
							local25 -= 2;
							local773 = Static132.anIntArray372[local25];
							local981 = Static132.anIntArray372[local25 + 1];
							if (local773 == -1) {
								local1110.anInt239 = -1;
								local1110.anInt195 = -1;
								local1110.anInt246 = 1;
							} else {
								local1110.anInt195 = local773;
								local1110.anInt193 = local981;
								@Pc(1695) Class1_Sub1_Sub18 local1695 = Static191.method2990(local773);
								local1110.anInt237 = local1695.anInt3018;
								if (local203 == 1205) {
									local1110.aBoolean19 = false;
								} else {
									local1110.aBoolean19 = true;
								}
								local1110.anInt192 = local1695.anInt2995;
								local1110.anInt216 = local1695.anInt2988;
								local1110.anInt265 = local1695.anInt2999;
								local1110.anInt212 = local1695.anInt3013;
								local1110.anInt223 = local1695.anInt2994;
								if (local1110.anInt205 > 0) {
									local1110.anInt212 = local1110.anInt212 * 32 / local1110.anInt205;
								} else if (local1110.anInt232 > 0) {
									local1110.anInt212 = local1110.anInt212 * 32 / local1110.anInt232;
								}
							}
							continue;
						}
						if (local203 == 1201) {
							local1110.anInt246 = 2;
							local25--;
							local1110.anInt239 = Static132.anIntArray372[local25];
							continue;
						}
						if (local203 == 1202) {
							local1110.anInt246 = 3;
							local1110.anInt239 = Static84.aClass9_Sub4_Sub1_2.aClass50_2.method1517();
							continue;
						}
						if (local203 == 1203) {
							local1110.anInt246 = 6;
							local25--;
							local1110.anInt239 = Static132.anIntArray372[local25];
							continue;
						}
						if (local203 == 1204) {
							local1110.anInt246 = 5;
							local25--;
							local1110.anInt239 = Static132.anIntArray372[local25];
							continue;
						}
					} else if ((local203 < 1300 || local203 >= 1400) && (local203 < 2300 || local203 >= 2400)) {
						if (local203 >= 1400 && local203 < 1500 || local203 >= 2400 && local203 < 2500) {
							if (local203 >= 2000) {
								local203 -= 1000;
								local25--;
								local1110 = Static107.method1857(Static132.anIntArray372[local25]);
							} else {
								local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
							}
							local27--;
							local2308 = Static126.aClass60Array19[local27];
							@Pc(8535) int[] local8535 = null;
							if (local2308.method1835() > 0 && local2308.method1793(local2308.method1835() - 1) == 89) {
								local25--;
								local624 = Static132.anIntArray372[local25];
								if (local624 > 0) {
									local8535 = new int[local624];
									while (local624-- > 0) {
										local25--;
										local8535[local624] = Static132.anIntArray372[local25];
									}
								}
								local2308 = local2308.method1797(0, local2308.method1835() - 1);
							}
							@Pc(8595) Object[] local8595 = new Object[local2308.method1835() + 1];
							for (local644 = local8595.length - 1; local644 >= 1; local644--) {
								if (local2308.method1793(local644 - 1) == 115) {
									local27--;
									local8595[local644] = Static126.aClass60Array19[local27];
								} else {
									local25--;
									local8595[local644] = Integer.valueOf(Static132.anIntArray372[local25]);
								}
							}
							local25--;
							local1018 = Static132.anIntArray372[local25];
							if (local1018 == -1) {
								local8595 = null;
							} else {
								local8595[0] = Integer.valueOf(local1018);
							}
							if (local203 == 1420) {
								local1110.anObjectArray12 = local8595;
							}
							if (local203 == 1427) {
								local1110.anObjectArray17 = local8595;
							}
							if (local203 == 1403) {
								local1110.anObjectArray1 = local8595;
							}
							if (local203 == 1417) {
								local1110.anObjectArray13 = local8595;
							}
							if (local203 == 1401) {
								local1110.anObjectArray3 = local8595;
							}
							if (local203 == 1405) {
								local1110.anObjectArray2 = local8595;
							}
							if (local203 == 1406) {
								local1110.anObjectArray8 = local8595;
							}
							if (local203 == 1425) {
								local1110.anObjectArray24 = local8595;
							}
							if (local203 == 1422) {
								local1110.anObjectArray26 = local8595;
							}
							if (local203 == 1404) {
								local1110.anObjectArray18 = local8595;
							}
							if (local203 == 1410) {
								local1110.anObjectArray7 = local8595;
							}
							if (local203 == 1414) {
								local1110.anObjectArray4 = local8595;
								local1110.anIntArray32 = local8535;
							}
							if (local203 == 1412) {
								local1110.anObjectArray22 = local8595;
							}
							if (local203 == 1402) {
								local1110.anObjectArray23 = local8595;
							}
							if (local203 == 1421) {
								local1110.anObjectArray16 = local8595;
							}
							if (local203 == 1423) {
								local1110.anObjectArray15 = local8595;
							}
							if (local203 == 1418) {
								local1110.anObjectArray10 = local8595;
							}
							if (local203 == 1416) {
								local1110.anObjectArray9 = local8595;
							}
							if (local203 == 1415) {
								local1110.anIntArray30 = local8535;
								local1110.anObjectArray19 = local8595;
							}
							if (local203 == 1424) {
								local1110.anObjectArray21 = local8595;
							}
							if (local203 == 1407) {
								local1110.anObjectArray11 = local8595;
								local1110.anIntArray27 = local8535;
							}
							if (local203 == 1408) {
								local1110.anObjectArray20 = local8595;
							}
							if (local203 == 1411) {
								local1110.anObjectArray14 = local8595;
							}
							local1110.aBoolean17 = true;
							if (local203 == 1419) {
								local1110.anObjectArray5 = local8595;
							}
							if (local203 == 1409) {
								local1110.anObjectArray6 = local8595;
							}
							if (local203 == 1400) {
								local1110.anObjectArray25 = local8595;
							}
							continue;
						}
						if (local203 < 1600) {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
							if (local203 == 1500) {
								Static132.anIntArray372[local25++] = local1110.anInt262;
								continue;
							}
							if (local203 == 1501) {
								Static132.anIntArray372[local25++] = local1110.anInt235;
								continue;
							}
							if (local203 == 1502) {
								Static132.anIntArray372[local25++] = local1110.anInt251;
								continue;
							}
							if (local203 == 1503) {
								Static132.anIntArray372[local25++] = local1110.anInt221;
								continue;
							}
							if (local203 == 1504) {
								Static132.anIntArray372[local25++] = local1110.aBoolean21 ? 1 : 0;
								continue;
							}
							if (local203 == 1505) {
								Static132.anIntArray372[local25++] = local1110.anInt204;
								continue;
							}
						} else if (local203 < 1700) {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
							if (local203 == 1600) {
								Static132.anIntArray372[local25++] = local1110.anInt250;
								continue;
							}
							if (local203 == 1601) {
								Static132.anIntArray372[local25++] = local1110.anInt247;
								continue;
							}
							if (local203 == 1602) {
								Static126.aClass60Array19[local27++] = local1110.aClass60_73;
								continue;
							}
							if (local203 == 1603) {
								Static132.anIntArray372[local25++] = local1110.anInt201;
								continue;
							}
							if (local203 == 1604) {
								Static132.anIntArray372[local25++] = local1110.anInt266;
								continue;
							}
							if (local203 == 1605) {
								Static132.anIntArray372[local25++] = local1110.anInt212;
								continue;
							}
							if (local203 == 1606) {
								Static132.anIntArray372[local25++] = local1110.anInt237;
								continue;
							}
							if (local203 == 1607) {
								Static132.anIntArray372[local25++] = local1110.anInt265;
								continue;
							}
							if (local203 == 1608) {
								Static132.anIntArray372[local25++] = local1110.anInt223;
								continue;
							}
							if (local203 == 1609) {
								Static132.anIntArray372[local25++] = local1110.anInt217;
								continue;
							}
						} else if (local203 < 1800) {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
							if (local203 == 1700) {
								Static132.anIntArray372[local25++] = local1110.anInt195;
								continue;
							}
							if (local203 == 1701) {
								if (local1110.anInt195 == -1) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = local1110.anInt193;
								}
								continue;
							}
							if (local203 == 1702) {
								Static132.anIntArray372[local25++] = local1110.anInt242;
								continue;
							}
						} else if (local203 < 1900) {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
							if (local203 == 1800) {
								Static132.anIntArray372[local25++] = Static161.method2696(Static166.method2717(local1110));
								continue;
							}
							if (local203 == 1801) {
								local25--;
								local773 = Static132.anIntArray372[local25];
								local773--;
								if (local1110.aClass60Array3 != null && local1110.aClass60Array3.length > local773 && local1110.aClass60Array3[local773] != null) {
									Static126.aClass60Array19[local27++] = local1110.aClass60Array3[local773];
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 1802) {
								if (local1110.aClass60_79 == null) {
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								} else {
									Static126.aClass60Array19[local27++] = local1110.aClass60_79;
								}
								continue;
							}
						} else if (local203 < 2600) {
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
							if (local203 == 2500) {
								Static132.anIntArray372[local25++] = local1110.anInt262;
								continue;
							}
							if (local203 == 2501) {
								Static132.anIntArray372[local25++] = local1110.anInt235;
								continue;
							}
							if (local203 == 2502) {
								Static132.anIntArray372[local25++] = local1110.anInt251;
								continue;
							}
							if (local203 == 2503) {
								Static132.anIntArray372[local25++] = local1110.anInt221;
								continue;
							}
							if (local203 == 2504) {
								Static132.anIntArray372[local25++] = local1110.aBoolean21 ? 1 : 0;
								continue;
							}
							if (local203 == 2505) {
								Static132.anIntArray372[local25++] = local1110.anInt204;
								continue;
							}
						} else if (local203 < 2700) {
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
							if (local203 == 2600) {
								Static132.anIntArray372[local25++] = local1110.anInt250;
								continue;
							}
							if (local203 == 2601) {
								Static132.anIntArray372[local25++] = local1110.anInt247;
								continue;
							}
							if (local203 == 2602) {
								Static126.aClass60Array19[local27++] = local1110.aClass60_73;
								continue;
							}
							if (local203 == 2603) {
								Static132.anIntArray372[local25++] = local1110.anInt201;
								continue;
							}
							if (local203 == 2604) {
								Static132.anIntArray372[local25++] = local1110.anInt266;
								continue;
							}
							if (local203 == 2605) {
								Static132.anIntArray372[local25++] = local1110.anInt212;
								continue;
							}
							if (local203 == 2606) {
								Static132.anIntArray372[local25++] = local1110.anInt237;
								continue;
							}
							if (local203 == 2607) {
								Static132.anIntArray372[local25++] = local1110.anInt265;
								continue;
							}
							if (local203 == 2608) {
								Static132.anIntArray372[local25++] = local1110.anInt223;
								continue;
							}
							if (local203 == 2609) {
								Static132.anIntArray372[local25++] = local1110.anInt217;
								continue;
							}
						} else if (local203 < 2800) {
							if (local203 == 2700) {
								local25--;
								local1110 = Static107.method1857(Static132.anIntArray372[local25]);
								Static132.anIntArray372[local25++] = local1110.anInt195;
								continue;
							}
							if (local203 == 2701) {
								local25--;
								local1110 = Static107.method1857(Static132.anIntArray372[local25]);
								if (local1110.anInt195 == -1) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = local1110.anInt193;
								}
								continue;
							}
							if (local203 == 2702) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								@Pc(8095) Class1_Sub11 local8095 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local768);
								if (local8095 == null) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = 1;
								}
								continue;
							}
							if (local203 == 2703) {
								local25--;
								local1110 = Static107.method1857(Static132.anIntArray372[local25]);
								if (local1110.aClass6Array1 == null) {
									Static132.anIntArray372[local25++] = 0;
									continue;
								}
								local773 = local1110.aClass6Array1.length;
								for (local981 = 0; local981 < local1110.aClass6Array1.length; local981++) {
									if (local1110.aClass6Array1[local981] == null) {
										local773 = local981;
										break;
									}
								}
								Static132.anIntArray372[local25++] = local773;
								continue;
							}
							if (local203 == 2704 || local203 == 2705) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								@Pc(8189) Class1_Sub11 local8189 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local768);
								if (local8189 != null && local8189.anInt1626 == local773) {
									Static132.anIntArray372[local25++] = 1;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
						} else if (local203 < 2900) {
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
							if (local203 == 2800) {
								Static132.anIntArray372[local25++] = Static161.method2696(Static166.method2717(local1110));
								continue;
							}
							if (local203 == 2801) {
								local25--;
								local773 = Static132.anIntArray372[local25];
								local773--;
								if (local1110.aClass60Array3 != null && local1110.aClass60Array3.length > local773 && local1110.aClass60Array3[local773] != null) {
									Static126.aClass60Array19[local27++] = local1110.aClass60Array3[local773];
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 2802) {
								if (local1110.aClass60_79 == null) {
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								} else {
									Static126.aClass60Array19[local27++] = local1110.aClass60_79;
								}
								continue;
							}
						} else if (local203 < 3200) {
							if (local203 == 3100) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static13.method239(Static49.aClass60_395, local582, 0);
								continue;
							}
							if (local203 == 3101) {
								local25 -= 2;
								Static218.method3518(Static132.anIntArray372[local25 + 1], Static132.anIntArray372[local25], Static84.aClass9_Sub4_Sub1_2);
								continue;
							}
							if (local203 == 3103) {
								Static82.method1454();
								continue;
							}
							if (local203 == 3104) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local773 = 0;
								if (local582.method1811()) {
									local773 = local582.method1841();
								}
								Static96.aClass1_Sub9_Sub1_3.method953(152);
								Static96.aClass1_Sub9_Sub1_3.method921(local773);
								continue;
							}
							if (local203 == 3105) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static96.aClass1_Sub9_Sub1_3.method953(54);
								Static96.aClass1_Sub9_Sub1_3.method897(local582.method1829());
								continue;
							}
							if (local203 == 3106) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static96.aClass1_Sub9_Sub1_3.method953(60);
								Static96.aClass1_Sub9_Sub1_3.method899(local582.method1835() + 1);
								Static96.aClass1_Sub9_Sub1_3.method924(local582);
								continue;
							}
							if (local203 == 3107) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								local27--;
								local2308 = Static126.aClass60Array19[local27];
								Static36.method2894(local2308, local768);
								continue;
							}
							if (local203 == 3108) {
								local25 -= 3;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								local981 = Static132.anIntArray372[local25 + 2];
								local997 = Static107.method1857(local981);
								Static175.method2827(local997, local773, local768);
								continue;
							}
							if (local203 == 3109) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								local1180 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
								Static175.method2827(local1180, local773, local768);
								continue;
							}
							if (local203 == 3110) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static96.aClass1_Sub9_Sub1_3.method953(194);
								Static96.aClass1_Sub9_Sub1_3.method890(local768);
								continue;
							}
						} else if (local203 < 3300) {
							if (local203 == 3200) {
								local25 -= 3;
								Static66.method1182(Static132.anIntArray372[local25], Static132.anIntArray372[local25 + 1], Static132.anIntArray372[local25 + 2]);
								continue;
							}
							if (local203 == 3201) {
								local25--;
								Static37.method656(Static132.anIntArray372[local25]);
								continue;
							}
							if (local203 == 3202) {
								local25 -= 2;
								Static53.method1019(Static132.anIntArray372[local25], Static132.anIntArray372[local25 + 1]);
								continue;
							}
						} else if (local203 < 3400) {
							if (local203 == 3300) {
								Static132.anIntArray372[local25++] = Static42.anInt910;
								continue;
							}
							if (local203 == 3301) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static125.method2125(local768, local773);
								continue;
							}
							if (local203 == 3302) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = Static85.method1482(local773, local768);
								continue;
							}
							if (local203 == 3303) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = Static187.method2925(local773, local768);
								continue;
							}
							if (local203 == 3304) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static51.method967(local768).anInt2881;
								continue;
							}
							if (local203 == 3305) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static173.anIntArray493[local768];
								continue;
							}
							if (local203 == 3306) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static105.anIntArray305[local768];
								continue;
							}
							if (local203 == 3307) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static157.anIntArray452[local768];
								continue;
							}
							if (local203 == 3308) {
								local768 = Static180.anInt3841;
								local773 = Static128.anInt2813 + (Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7);
								local981 = (Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7) + Static163.anInt3587;
								Static132.anIntArray372[local25++] = (local768 << 28) + (local773 << 14) + local981;
								continue;
							}
							if (local203 == 3309) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 >> 14 & 0x3FFF;
								continue;
							}
							if (local203 == 3310) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 >> 28;
								continue;
							}
							if (local203 == 3311) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 & 0x3FFF;
								continue;
							}
							if (local203 == 3312) {
								Static132.anIntArray372[local25++] = Static202.aBoolean238 ? 1 : 0;
								continue;
							}
							if (local203 == 3313) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25] + 32768;
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = Static125.method2125(local768, local773);
								continue;
							}
							if (local203 == 3314) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25] + 32768;
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = Static85.method1482(local773, local768);
								continue;
							}
							if (local203 == 3315) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25] + 32768;
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = Static187.method2925(local773, local768);
								continue;
							}
							if (local203 == 3316) {
								if (Static152.anInt3414 >= 2) {
									Static132.anIntArray372[local25++] = Static152.anInt3414;
								} else {
									Static132.anIntArray372[local25++] = 0;
								}
								continue;
							}
							if (local203 == 3317) {
								Static132.anIntArray372[local25++] = Static9.anInt4431;
								continue;
							}
							if (local203 == 3318) {
								Static132.anIntArray372[local25++] = Static9.anInt4432;
								continue;
							}
							if (local203 == 3321) {
								Static132.anIntArray372[local25++] = Static206.anInt4384;
								continue;
							}
							if (local203 == 3322) {
								Static132.anIntArray372[local25++] = Static56.anInt1486;
								continue;
							}
							if (local203 == 3323) {
								if (Static139.anInt3109 >= 5 && Static139.anInt3109 <= 9) {
									Static132.anIntArray372[local25++] = 1;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3324) {
								if (Static139.anInt3109 >= 5 && Static139.anInt3109 <= 9) {
									Static132.anIntArray372[local25++] = Static139.anInt3109;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3325) {
								if (Static173.anInt3728 > 0) {
									Static132.anIntArray372[local25++] = 1;
								} else {
									Static132.anIntArray372[local25++] = 0;
								}
								continue;
							}
							if (local203 == 3326) {
								Static132.anIntArray372[local25++] = Static84.aClass9_Sub4_Sub1_2.anInt1412;
								continue;
							}
							if (local203 == 3327) {
								Static132.anIntArray372[local25++] = Static84.aClass9_Sub4_Sub1_2.aClass50_2.aBoolean110 ? 1 : 0;
								continue;
							}
							if (local203 == 3328) {
								Static132.anIntArray372[local25++] = Static175.anInt3770;
								continue;
							}
							if (local203 == 3329) {
								Static132.anIntArray372[local25++] = Static60.anInt1524;
								continue;
							}
						} else if (local203 < 3500) {
							if (local203 == 3400) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								@Pc(2429) Class1_Sub1_Sub15 local2429 = Static54.method1051(local768);
								Static126.aClass60Array19[local27++] = local2429.method2118(local773);
								continue;
							}
							if (local203 == 3408) {
								local25 -= 4;
								local768 = Static132.anIntArray372[local25];
								local981 = Static132.anIntArray372[local25 + 2];
								local773 = Static132.anIntArray372[local25 + 1];
								local624 = Static132.anIntArray372[local25 + 3];
								@Pc(2471) Class1_Sub1_Sub15 local2471 = Static54.method1051(local981);
								if (local768 == local2471.anInt2787 && local2471.anInt2783 == local773) {
									if (local773 == 115) {
										Static126.aClass60Array19[local27++] = local2471.method2118(local624);
									} else {
										Static132.anIntArray372[local25++] = local2471.method2121(local624);
									}
									continue;
								}
								if (local773 == 115) {
									Static126.aClass60Array19[local27++] = Static29.aClass60_243;
								} else {
									Static132.anIntArray372[local25++] = 0;
								}
								continue;
							}
						} else if (local203 < 3700) {
							if (local203 == 3600) {
								if (Static149.anInt3339 == 0) {
									Static132.anIntArray372[local25++] = -2;
								} else if (Static149.anInt3339 == 1) {
									Static132.anIntArray372[local25++] = -1;
								} else {
									Static132.anIntArray372[local25++] = Static135.anInt2930;
								}
								continue;
							}
							if (local203 == 3601) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 == 2 && Static135.anInt2930 > local768) {
									Static126.aClass60Array19[local27++] = Static61.aClass60Array9[local768];
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 3602) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 == 2 && Static135.anInt2930 > local768) {
									Static132.anIntArray372[local25++] = Static90.anIntArray247[local768];
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3603) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 == 2 && Static135.anInt2930 > local768) {
									Static132.anIntArray372[local25++] = Static213.anIntArray610[local768];
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3604) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25--;
								local773 = Static132.anIntArray372[local25];
								Static128.method2141(local773, local582);
								continue;
							}
							if (local203 == 3605) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static104.method1769(local582.method1829());
								continue;
							}
							if (local203 == 3606) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static34.method614(local582.method1829());
								continue;
							}
							if (local203 == 3607) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static160.method2686(local582.method1829());
								continue;
							}
							if (local203 == 3608) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static197.method3074(local582.method1829());
								continue;
							}
							if (local203 == 3609) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								if (local582.method1838(Static208.aClass60_1515) || local582.method1838(Static197.aClass60_1438)) {
									local582 = local582.method1818(7);
								}
								Static132.anIntArray372[local25++] = Static23.method1991(local582) ? 1 : 0;
								continue;
							}
							if (local203 == 3610) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 == 2 && local768 < Static135.anInt2930) {
									Static126.aClass60Array19[local27++] = Static167.aClass60Array27[local768];
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 3611) {
								if (Static207.aClass60_1509 == null) {
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								} else {
									Static126.aClass60Array19[local27++] = Static207.aClass60_1509.method1812();
								}
								continue;
							}
							if (local203 == 3612) {
								if (Static207.aClass60_1509 == null) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = Static188.anInt4037;
								}
								continue;
							}
							if (local203 == 3613) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static207.aClass60_1509 != null && local768 < Static188.anInt4037) {
									Static126.aClass60Array19[local27++] = Static37.aClass1_Sub26Array1[local768].aClass60_1412.method1812();
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 3614) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static207.aClass60_1509 != null && local768 < Static188.anInt4037) {
									Static132.anIntArray372[local25++] = Static37.aClass1_Sub26Array1[local768].anInt4154;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3615) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static207.aClass60_1509 != null && local768 < Static188.anInt4037) {
									Static132.anIntArray372[local25++] = Static37.aClass1_Sub26Array1[local768].aByte16;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3616) {
								Static132.anIntArray372[local25++] = Static187.aByte14;
								continue;
							}
							if (local203 == 3617) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static62.method1120(local582);
								continue;
							}
							if (local203 == 3618) {
								Static132.anIntArray372[local25++] = Static116.aByte9;
								continue;
							}
							if (local203 == 3619) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static37.method652(local582.method1829());
								continue;
							}
							if (local203 == 3620) {
								Static99.method1728();
								continue;
							}
							if (local203 == 3621) {
								if (Static149.anInt3339 == 0) {
									Static132.anIntArray372[local25++] = -1;
								} else {
									Static132.anIntArray372[local25++] = Static78.anInt1884;
								}
								continue;
							}
							if (local203 == 3622) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 != 0 && local768 < Static78.anInt1884) {
									Static126.aClass60Array19[local27++] = Static144.method2484(Static140.aLongArray7[local768]).method1812();
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 3623) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								if (local582.method1838(Static208.aClass60_1515) || local582.method1838(Static197.aClass60_1438)) {
									local582 = local582.method1818(7);
								}
								Static132.anIntArray372[local25++] = Static112.method1928(local582) ? 1 : 0;
								continue;
							}
							if (local203 == 3624) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static37.aClass1_Sub26Array1 != null && Static188.anInt4037 > local768 && Static37.aClass1_Sub26Array1[local768].aClass60_1412.method1805(Static84.aClass9_Sub4_Sub1_2.aClass60_414)) {
									Static132.anIntArray372[local25++] = 1;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3625) {
								if (Static35.aClass60_275 == null) {
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								} else {
									Static126.aClass60Array19[local27++] = Static35.aClass60_275.method1812();
								}
								continue;
							}
							if (local203 == 3626) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static207.aClass60_1509 != null && local768 < Static188.anInt4037) {
									Static126.aClass60Array19[local27++] = Static37.aClass1_Sub26Array1[local768].aClass60_1411;
									continue;
								}
								Static126.aClass60Array19[local27++] = Static49.aClass60_395;
								continue;
							}
							if (local203 == 3627) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								if (Static149.anInt3339 == 2 && local768 >= 0 && Static135.anInt2930 > local768) {
									Static132.anIntArray372[local25++] = Static132.aBooleanArray18[local768] ? 1 : 0;
									continue;
								}
								Static132.anIntArray372[local25++] = 0;
								continue;
							}
							if (local203 == 3628) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								if (local582.method1838(Static208.aClass60_1515) || local582.method1838(Static197.aClass60_1438)) {
									local582 = local582.method1818(7);
								}
								Static132.anIntArray372[local25++] = Static49.method966(local582);
								continue;
							}
						} else if (local203 < 4000) {
							if (local203 == 3903) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].method2788();
								continue;
							}
							if (local203 == 3904) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].anInt3714;
								continue;
							}
							if (local203 == 3905) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].anInt3712;
								continue;
							}
							if (local203 == 3906) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].anInt3709;
								continue;
							}
							if (local203 == 3907) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].anInt3713;
								continue;
							}
							if (local203 == 3908) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static155.aClass86Array1[local768].anInt3716;
								continue;
							}
							if (local203 == 3910) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								local773 = Static155.aClass86Array1[local768].method2787();
								Static132.anIntArray372[local25++] = local773 == 0 ? 1 : 0;
								continue;
							}
							if (local203 == 3911) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								local773 = Static155.aClass86Array1[local768].method2787();
								Static132.anIntArray372[local25++] = local773 == 2 ? 1 : 0;
								continue;
							}
							if (local203 == 3912) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								local773 = Static155.aClass86Array1[local768].method2787();
								Static132.anIntArray372[local25++] = local773 == 5 ? 1 : 0;
								continue;
							}
							if (local203 == 3913) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								local773 = Static155.aClass86Array1[local768].method2787();
								Static132.anIntArray372[local25++] = local773 == 1 ? 1 : 0;
								continue;
							}
						} else if (local203 < 4100) {
							if (local203 == 4000) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 + local773;
								continue;
							}
							if (local203 == 4001) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local768 - local773;
								continue;
							}
							if (local203 == 4002) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local773 * local768;
								continue;
							}
							if (local203 == 4003) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 / local773;
								continue;
							}
							if (local203 == 4004) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = (int) ((double) local768 * Math.random());
								continue;
							}
							if (local203 == 4005) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = (int) (Math.random() * (double) (local768 + 1));
								continue;
							}
							if (local203 == 4006) {
								local25 -= 5;
								local773 = Static132.anIntArray372[local25 + 1];
								local644 = Static132.anIntArray372[local25 + 4];
								local624 = Static132.anIntArray372[local25 + 3];
								local981 = Static132.anIntArray372[local25 + 2];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local768 + (local644 - local981) * (local773 - local768) / (local624 - local981);
								continue;
							}
							@Pc(6019) long local6019;
							@Pc(6012) long local6012;
							if (local203 == 4007) {
								local25 -= 2;
								local6012 = Static132.anIntArray372[local25];
								local6019 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = (int) (local6012 + local6012 * local6019 / 100L);
								continue;
							}
							if (local203 == 4008) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = 0x1 << local773 | local768;
								continue;
							}
							if (local203 == 4009) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = -(0x1 << local773) - 1 & local768;
								continue;
							}
							if (local203 == 4010) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = (local768 & 0x1 << local773) == 0 ? 0 : 1;
								continue;
							}
							if (local203 == 4011) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local768 % local773;
								continue;
							}
							if (local203 == 4012) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								if (local768 == 0) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = (int) Math.pow((double) local768, (double) local773);
								}
								continue;
							}
							if (local203 == 4013) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								if (local768 == 0) {
									Static132.anIntArray372[local25++] = 0;
								} else if (local773 == 0) {
									Static132.anIntArray372[local25++] = Integer.MAX_VALUE;
								} else {
									Static132.anIntArray372[local25++] = (int) Math.pow((double) local768, 1.0D / (double) local773);
								}
								continue;
							}
							if (local203 == 4014) {
								local25 -= 2;
								local773 = Static132.anIntArray372[local25 + 1];
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local773 & local768;
								continue;
							}
							if (local203 == 4015) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local768 | local773;
								continue;
							}
							if (local203 == 4016) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local773 <= local768 ? local773 : local768;
								continue;
							}
							if (local203 == 4017) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								Static132.anIntArray372[local25++] = local773 < local768 ? local768 : local773;
								continue;
							}
							if (local203 == 4018) {
								local25 -= 3;
								local6012 = Static132.anIntArray372[local25];
								local6019 = Static132.anIntArray372[local25 + 1];
								@Pc(6365) long local6365 = (long) Static132.anIntArray372[local25 + 2];
								Static132.anIntArray372[local25++] = (int) (local6012 * local6365 / local6019);
								continue;
							}
						} else if (local203 >= 4200) {
							@Pc(2828) Class1_Sub1_Sub27 local2828;
							if (local203 < 4300) {
								if (local203 == 4200) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									Static126.aClass60Array19[local27++] = Static191.method2990(local768).aClass60_1043;
									continue;
								}
								@Pc(2578) Class1_Sub1_Sub18 local2578;
								if (local203 == 4201) {
									local25 -= 2;
									local773 = Static132.anIntArray372[local25 + 1];
									local768 = Static132.anIntArray372[local25];
									local2578 = Static191.method2990(local768);
									if (local773 >= 1 && local773 <= 5 && local2578.aClass60Array20[local773 - 1] != null) {
										Static126.aClass60Array19[local27++] = local2578.aClass60Array20[local773 - 1];
										continue;
									}
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
									continue;
								}
								if (local203 == 4202) {
									local25 -= 2;
									local773 = Static132.anIntArray372[local25 + 1];
									local768 = Static132.anIntArray372[local25];
									local2578 = Static191.method2990(local768);
									if (local773 >= 1 && local773 <= 5 && local2578.aClass60Array21[local773 - 1] != null) {
										Static126.aClass60Array19[local27++] = local2578.aClass60Array21[local773 - 1];
										continue;
									}
									Static126.aClass60Array19[local27++] = Static49.aClass60_395;
									continue;
								}
								if (local203 == 4203) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									Static132.anIntArray372[local25++] = Static191.method2990(local768).anInt2996;
									continue;
								}
								if (local203 == 4204) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									Static132.anIntArray372[local25++] = Static191.method2990(local768).anInt3014 == 1 ? 1 : 0;
									continue;
								}
								@Pc(2721) Class1_Sub1_Sub18 local2721;
								if (local203 == 4205) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									local2721 = Static191.method2990(local768);
									if (local2721.anInt3027 == -1 && local2721.anInt3024 >= 0) {
										Static132.anIntArray372[local25++] = local2721.anInt3024;
										continue;
									}
									Static132.anIntArray372[local25++] = local768;
									continue;
								}
								if (local203 == 4206) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									local2721 = Static191.method2990(local768);
									if (local2721.anInt3027 >= 0 && local2721.anInt3024 >= 0) {
										Static132.anIntArray372[local25++] = local2721.anInt3024;
										continue;
									}
									Static132.anIntArray372[local25++] = local768;
									continue;
								}
								if (local203 == 4207) {
									local25--;
									local768 = Static132.anIntArray372[local25];
									Static132.anIntArray372[local25++] = Static191.method2990(local768).aBoolean164 ? 1 : 0;
									continue;
								}
								if (local203 == 4208) {
									local25 -= 2;
									local768 = Static132.anIntArray372[local25];
									local773 = Static132.anIntArray372[local25 + 1];
									local2828 = Static168.method2742(local773);
									if (local2828.method3206()) {
										Static126.aClass60Array19[local27++] = Static191.method2990(local768).method2299(local2828.aClass60_1506, local773);
									} else {
										Static132.anIntArray372[local25++] = Static191.method2990(local768).method2290(local2828.anInt4379, local773);
									}
									continue;
								}
								if (local203 == 4210) {
									local27--;
									local582 = Static126.aClass60Array19[local27];
									local25--;
									local773 = Static132.anIntArray372[local25];
									Static5.method87(local582, local773 == 1);
									Static132.anIntArray372[local25++] = Static132.anInt2879;
									continue;
								}
								if (local203 == 4211) {
									if (Static180.aShortArray51 != null && Static38.anInt871 < Static132.anInt2879) {
										Static132.anIntArray372[local25++] = Static180.aShortArray51[Static38.anInt871++] & 0xFFFF;
										continue;
									}
									Static132.anIntArray372[local25++] = -1;
									continue;
								}
								if (local203 == 4212) {
									Static38.anInt871 = 0;
									continue;
								}
							} else if (local203 < 4400) {
								if (local203 == 4300) {
									local25 -= 2;
									local773 = Static132.anIntArray372[local25 + 1];
									local768 = Static132.anIntArray372[local25];
									local2828 = Static168.method2742(local773);
									if (local2828.method3206()) {
										Static126.aClass60Array19[local27++] = Static52.method1014(local768).method1748(local2828.aClass60_1506, local773);
									} else {
										Static132.anIntArray372[local25++] = Static52.method1014(local768).method1746(local2828.anInt4379, local773);
									}
									continue;
								}
							} else if (local203 >= 4500) {
								if (local203 < 4600) {
									if (local203 == 4500) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										local2828 = Static168.method2742(local773);
										if (local2828.method3206()) {
											Static126.aClass60Array19[local27++] = Static193.method3011(local768).method2852(local773, local2828.aClass60_1506);
										} else {
											Static132.anIntArray372[local25++] = Static193.method3011(local768).method2851(local773, local2828.anInt4379);
										}
										continue;
									}
								} else if (local203 < 5100) {
									if (local203 == 5000) {
										Static132.anIntArray372[local25++] = Static118.anInt2663;
										continue;
									}
									if (local203 == 5001) {
										local25 -= 3;
										Static118.anInt2663 = Static132.anIntArray372[local25];
										Static15.anInt412 = Static132.anIntArray372[local25 + 1];
										Static42.anInt907 = Static132.anIntArray372[local25 + 2];
										Static96.aClass1_Sub9_Sub1_3.method953(115);
										Static96.aClass1_Sub9_Sub1_3.method899(Static118.anInt2663);
										Static96.aClass1_Sub9_Sub1_3.method899(Static15.anInt412);
										Static96.aClass1_Sub9_Sub1_3.method899(Static42.anInt907);
										continue;
									}
									if (local203 == 5002) {
										local25 -= 2;
										local981 = Static132.anIntArray372[local25 + 1];
										local773 = Static132.anIntArray372[local25];
										local27--;
										local582 = Static126.aClass60Array19[local27];
										Static96.aClass1_Sub9_Sub1_3.method953(99);
										Static96.aClass1_Sub9_Sub1_3.method897(local582.method1829());
										Static96.aClass1_Sub9_Sub1_3.method899(local773 - 1);
										Static96.aClass1_Sub9_Sub1_3.method899(local981);
										continue;
									}
									if (local203 == 5003) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local2308 = null;
										if (local768 < 100) {
											local2308 = Static5.aClass60Array1[local768];
										}
										if (local2308 == null) {
											local2308 = Static49.aClass60_395;
										}
										Static126.aClass60Array19[local27++] = local2308;
										continue;
									}
									if (local203 == 5004) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local773 = -1;
										if (local768 < 100 && Static5.aClass60Array1[local768] != null) {
											local773 = Static87.anIntArray238[local768];
										}
										Static132.anIntArray372[local25++] = local773;
										continue;
									}
									if (local203 == 5005) {
										Static132.anIntArray372[local25++] = Static15.anInt412;
										continue;
									}
									if (local203 == 5008) {
										local27--;
										local582 = Static126.aClass60Array19[local27];
										if (local582.method1838(Static125.aClass60_950)) {
											Static79.method1401(local582);
											continue;
										}
										if (Static152.anInt3414 == 0 && (Static175.anInt3770 == 1 || Static60.anInt1524 == 1)) {
											continue;
										}
										@Pc(3262) byte local3262 = 0;
										local2308 = local582.method1836();
										@Pc(3268) byte local3268 = 0;
										if (local2308.method1838(Static77.aClass60_596)) {
											local3262 = 0;
											local582 = local582.method1818(Static77.aClass60_596.method1835());
										} else if (local2308.method1838(Static204.aClass60_1484)) {
											local582 = local582.method1818(Static204.aClass60_1484.method1835());
											local3262 = 1;
										} else if (local2308.method1838(Static128.aClass60_965)) {
											local582 = local582.method1818(Static128.aClass60_965.method1835());
											local3262 = 2;
										} else if (local2308.method1838(Static48.aClass60_385)) {
											local3262 = 3;
											local582 = local582.method1818(Static48.aClass60_385.method1835());
										} else if (local2308.method1838(Static183.aClass60_1318)) {
											local582 = local582.method1818(Static183.aClass60_1318.method1835());
											local3262 = 4;
										} else if (local2308.method1838(Static159.aClass60_1223)) {
											local3262 = 5;
											local582 = local582.method1818(Static159.aClass60_1223.method1835());
										} else if (local2308.method1838(Static26.aClass60_196)) {
											local582 = local582.method1818(Static26.aClass60_196.method1835());
											local3262 = 6;
										} else if (local2308.method1838(Static74.aClass60_580)) {
											local3262 = 7;
											local582 = local582.method1818(Static74.aClass60_580.method1835());
										} else if (local2308.method1838(Static40.aClass60_306)) {
											local582 = local582.method1818(Static40.aClass60_306.method1835());
											local3262 = 8;
										} else if (local2308.method1838(Static95.aClass60_1152)) {
											local3262 = 9;
											local582 = local582.method1818(Static95.aClass60_1152.method1835());
										} else if (local2308.method1838(Static135.aClass60_1015)) {
											local3262 = 10;
											local582 = local582.method1818(Static135.aClass60_1015.method1835());
										} else if (local2308.method1838(Static11.aClass60_1652)) {
											local582 = local582.method1818(Static11.aClass60_1652.method1835());
											local3262 = 11;
										} else if (Static209.anInt4478 != 0) {
											if (local2308.method1838(Static77.aClass60_599)) {
												local582 = local582.method1818(Static77.aClass60_599.method1835());
												local3262 = 0;
											} else if (local2308.method1838(Static204.aClass60_1483)) {
												local582 = local582.method1818(Static204.aClass60_1483.method1835());
												local3262 = 1;
											} else if (local2308.method1838(Static128.aClass60_966)) {
												local582 = local582.method1818(Static128.aClass60_966.method1835());
												local3262 = 2;
											} else if (local2308.method1838(Static48.aClass60_383)) {
												local582 = local582.method1818(Static48.aClass60_383.method1835());
												local3262 = 3;
											} else if (local2308.method1838(Static183.aClass60_1319)) {
												local582 = local582.method1818(Static183.aClass60_1319.method1835());
												local3262 = 4;
											} else if (local2308.method1838(Static159.aClass60_1218)) {
												local3262 = 5;
												local582 = local582.method1818(Static159.aClass60_1218.method1835());
											} else if (local2308.method1838(Static26.aClass60_199)) {
												local3262 = 6;
												local582 = local582.method1818(Static26.aClass60_199.method1835());
											} else if (local2308.method1838(Static74.aClass60_574)) {
												local3262 = 7;
												local582 = local582.method1818(Static74.aClass60_574.method1835());
											} else if (local2308.method1838(Static40.aClass60_308)) {
												local3262 = 8;
												local582 = local582.method1818(Static40.aClass60_308.method1835());
											} else if (local2308.method1838(Static95.aClass60_1150)) {
												local582 = local582.method1818(Static95.aClass60_1150.method1835());
												local3262 = 9;
											} else if (local2308.method1838(Static135.aClass60_1010)) {
												local582 = local582.method1818(Static135.aClass60_1010.method1835());
												local3262 = 10;
											} else if (local2308.method1838(Static11.aClass60_1651)) {
												local3262 = 11;
												local582 = local582.method1818(Static11.aClass60_1651.method1835());
											}
										}
										local2308 = local582.method1836();
										if (local2308.method1838(Static60.aClass60_470)) {
											local3268 = 1;
											local582 = local582.method1818(Static60.aClass60_470.method1835());
										} else if (local2308.method1838(Static209.aClass60_1525)) {
											local582 = local582.method1818(Static209.aClass60_1525.method1835());
											local3268 = 2;
										} else if (local2308.method1838(Static167.aClass60_1251)) {
											local582 = local582.method1818(Static167.aClass60_1251.method1835());
											local3268 = 3;
										} else if (local2308.method1838(Static157.aClass60_1208)) {
											local582 = local582.method1818(Static157.aClass60_1208.method1835());
											local3268 = 4;
										} else if (local2308.method1838(Static105.aClass60_778)) {
											local582 = local582.method1818(Static105.aClass60_778.method1835());
											local3268 = 5;
										} else if (Static209.anInt4478 != 0) {
											if (local2308.method1838(Static60.aClass60_475)) {
												local582 = local582.method1818(Static60.aClass60_475.method1835());
												local3268 = 1;
											} else if (local2308.method1838(Static209.aClass60_1526)) {
												local3268 = 2;
												local582 = local582.method1818(Static209.aClass60_1526.method1835());
											} else if (local2308.method1838(Static167.aClass60_1252)) {
												local3268 = 3;
												local582 = local582.method1818(Static167.aClass60_1252.method1835());
											} else if (local2308.method1838(Static157.aClass60_1209)) {
												local3268 = 4;
												local582 = local582.method1818(Static157.aClass60_1209.method1835());
											} else if (local2308.method1838(Static105.aClass60_777)) {
												local3268 = 5;
												local582 = local582.method1818(Static105.aClass60_777.method1835());
											}
										}
										Static96.aClass1_Sub9_Sub1_3.method953(189);
										Static96.aClass1_Sub9_Sub1_3.method899(0);
										local644 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
										Static96.aClass1_Sub9_Sub1_3.method899(local3262);
										Static96.aClass1_Sub9_Sub1_3.method899(local3268);
										Static193.method3010(local582, Static96.aClass1_Sub9_Sub1_3);
										Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local644);
										continue;
									}
									if (local203 == 5009) {
										local27 -= 2;
										local582 = Static126.aClass60Array19[local27];
										local2308 = Static126.aClass60Array19[local27 + 1];
										if (Static152.anInt3414 != 0 || Static175.anInt3770 != 1 && Static60.anInt1524 != 1) {
											Static96.aClass1_Sub9_Sub1_3.method953(80);
											Static96.aClass1_Sub9_Sub1_3.method899(0);
											local981 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
											Static96.aClass1_Sub9_Sub1_3.method897(local582.method1829());
											Static193.method3010(local2308, Static96.aClass1_Sub9_Sub1_3);
											Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local981);
										}
										continue;
									}
									if (local203 == 5010) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local2308 = null;
										if (local768 < 100) {
											local2308 = aClass60Array30[local768];
										}
										if (local2308 == null) {
											local2308 = Static49.aClass60_395;
										}
										Static126.aClass60Array19[local27++] = local2308;
										continue;
									}
									if (local203 == 5011) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local2308 = null;
										if (local768 < 100) {
											local2308 = Static97.aClass60Array14[local768];
										}
										if (local2308 == null) {
											local2308 = Static49.aClass60_395;
										}
										Static126.aClass60Array19[local27++] = local2308;
										continue;
									}
									if (local203 == 5012) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local773 = -1;
										if (local768 < 100) {
											local773 = Static82.anIntArray229[local768];
										}
										Static132.anIntArray372[local25++] = local773;
										continue;
									}
									if (local203 == 5015) {
										if (Static84.aClass9_Sub4_Sub1_2 == null || Static84.aClass9_Sub4_Sub1_2.aClass60_414 == null) {
											local582 = Static12.aClass60_95;
										} else {
											local582 = Static84.aClass9_Sub4_Sub1_2.aClass60_414;
										}
										Static126.aClass60Array19[local27++] = local582;
										continue;
									}
									if (local203 == 5016) {
										Static132.anIntArray372[local25++] = Static42.anInt907;
										continue;
									}
									if (local203 == 5017) {
										Static132.anIntArray372[local25++] = Static128.anInt2811;
										continue;
									}
									if (local203 == 5050) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										Static126.aClass60Array19[local27++] = Static156.method2633(local768).aClass60_166;
										continue;
									}
									@Pc(4090) Class1_Sub1_Sub5 local4090;
									if (local203 == 5051) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local4090 = Static156.method2633(local768);
										if (local4090.anIntArray82 == null) {
											Static132.anIntArray372[local25++] = 0;
										} else {
											Static132.anIntArray372[local25++] = local4090.anIntArray82.length;
										}
										continue;
									}
									if (local203 == 5052) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										@Pc(4127) Class1_Sub1_Sub5 local4127 = Static156.method2633(local768);
										local624 = local4127.anIntArray82[local773];
										Static132.anIntArray372[local25++] = local624;
										continue;
									}
									if (local203 == 5053) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										local4090 = Static156.method2633(local768);
										if (local4090.anIntArray83 == null) {
											Static132.anIntArray372[local25++] = 0;
										} else {
											Static132.anIntArray372[local25++] = local4090.anIntArray83.length;
										}
										continue;
									}
									if (local203 == 5054) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										Static132.anIntArray372[local25++] = Static156.method2633(local768).anIntArray83[local773];
										continue;
									}
									if (local203 == 5055) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										Static126.aClass60Array19[local27++] = Static152.method2598(local768).method2401();
										continue;
									}
									if (local203 == 5056) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										@Pc(4233) Class1_Sub1_Sub19 local4233 = Static152.method2598(local768);
										if (local4233.anIntArray409 == null) {
											Static132.anIntArray372[local25++] = 0;
										} else {
											Static132.anIntArray372[local25++] = local4233.anIntArray409.length;
										}
										continue;
									}
									if (local203 == 5057) {
										local25 -= 2;
										local773 = Static132.anIntArray372[local25 + 1];
										local768 = Static132.anIntArray372[local25];
										Static132.anIntArray372[local25++] = Static152.method2598(local768).anIntArray409[local773];
										continue;
									}
									if (local203 == 5058) {
										Static80.aClass49_1 = new Class49();
										local25--;
										Static80.aClass49_1.anInt1999 = Static132.anIntArray372[local25];
										Static80.aClass49_1.aClass1_Sub1_Sub19_1 = Static152.method2598(Static80.aClass49_1.anInt1999);
										Static80.aClass49_1.anIntArray234 = new int[Static80.aClass49_1.aClass1_Sub1_Sub19_1.method2399()];
										continue;
									}
									if (local203 == 5059) {
										Static96.aClass1_Sub9_Sub1_3.method953(197);
										Static96.aClass1_Sub9_Sub1_3.method899(0);
										local768 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
										Static96.aClass1_Sub9_Sub1_3.method899(0);
										Static96.aClass1_Sub9_Sub1_3.method890(Static80.aClass49_1.anInt1999);
										Static80.aClass49_1.aClass1_Sub1_Sub19_1.method2404(Static80.aClass49_1.anIntArray234, Static96.aClass1_Sub9_Sub1_3);
										Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local768);
										continue;
									}
									if (local203 == 5060) {
										local27--;
										local582 = Static126.aClass60Array19[local27];
										Static96.aClass1_Sub9_Sub1_3.method953(242);
										Static96.aClass1_Sub9_Sub1_3.method899(0);
										local773 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
										Static96.aClass1_Sub9_Sub1_3.method897(local582.method1829());
										Static96.aClass1_Sub9_Sub1_3.method890(Static80.aClass49_1.anInt1999);
										Static80.aClass49_1.aClass1_Sub1_Sub19_1.method2404(Static80.aClass49_1.anIntArray234, Static96.aClass1_Sub9_Sub1_3);
										Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local773);
										continue;
									}
									if (local203 == 5061) {
										Static96.aClass1_Sub9_Sub1_3.method953(197);
										Static96.aClass1_Sub9_Sub1_3.method899(0);
										local768 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
										Static96.aClass1_Sub9_Sub1_3.method899(1);
										Static96.aClass1_Sub9_Sub1_3.method890(Static80.aClass49_1.anInt1999);
										Static80.aClass49_1.aClass1_Sub1_Sub19_1.method2404(Static80.aClass49_1.anIntArray234, Static96.aClass1_Sub9_Sub1_3);
										Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local768);
										continue;
									}
									if (local203 == 5062) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										Static132.anIntArray372[local25++] = Static156.method2633(local768).anIntArray81[local773];
										continue;
									}
									if (local203 == 5063) {
										local25 -= 2;
										local773 = Static132.anIntArray372[local25 + 1];
										local768 = Static132.anIntArray372[local25];
										Static132.anIntArray372[local25++] = Static156.method2633(local768).anIntArray84[local773];
										continue;
									}
									if (local203 == 5064) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										if (local773 == -1) {
											Static132.anIntArray372[local25++] = -1;
										} else {
											Static132.anIntArray372[local25++] = Static156.method2633(local768).method366(local773);
										}
										continue;
									}
									if (local203 == 5065) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										if (local773 == -1) {
											Static132.anIntArray372[local25++] = -1;
										} else {
											Static132.anIntArray372[local25++] = Static156.method2633(local768).method361(local773);
										}
										continue;
									}
									if (local203 == 5066) {
										local25--;
										local768 = Static132.anIntArray372[local25];
										Static132.anIntArray372[local25++] = Static152.method2598(local768).method2399();
										continue;
									}
									if (local203 == 5067) {
										local25 -= 2;
										local773 = Static132.anIntArray372[local25 + 1];
										local768 = Static132.anIntArray372[local25];
										local981 = Static152.method2598(local768).method2403(local773);
										Static132.anIntArray372[local25++] = local981;
										continue;
									}
									if (local203 == 5068) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										Static80.aClass49_1.anIntArray234[local768] = local773;
										continue;
									}
									if (local203 == 5069) {
										local25 -= 2;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										Static80.aClass49_1.anIntArray234[local768] = local773;
										continue;
									}
									if (local203 == 5070) {
										local25 -= 3;
										local768 = Static132.anIntArray372[local25];
										local773 = Static132.anIntArray372[local25 + 1];
										local981 = Static132.anIntArray372[local25 + 2];
										@Pc(4704) Class1_Sub1_Sub19 local4704 = Static152.method2598(local768);
										if (local4704.method2403(local773) != 0) {
											throw new RuntimeException("bad command");
										}
										Static132.anIntArray372[local25++] = local4704.method2407(local981, local773);
										continue;
									}
								} else if (local203 < 5200) {
									if (local203 == 5100) {
										if (Static49.aBooleanArray5[86]) {
											Static132.anIntArray372[local25++] = 1;
										} else {
											Static132.anIntArray372[local25++] = 0;
										}
										continue;
									}
									if (local203 == 5101) {
										if (Static49.aBooleanArray5[82]) {
											Static132.anIntArray372[local25++] = 1;
										} else {
											Static132.anIntArray372[local25++] = 0;
										}
										continue;
									}
									if (local203 == 5102) {
										if (Static49.aBooleanArray5[81]) {
											Static132.anIntArray372[local25++] = 1;
										} else {
											Static132.anIntArray372[local25++] = 0;
										}
										continue;
									}
								} else if (local203 < 5300) {
									if (local203 == 5200) {
										local25--;
										Static191.method2987(Static132.anIntArray372[local25]);
										continue;
									}
									if (local203 == 5201) {
										Static132.anIntArray372[local25++] = Static186.method2921();
										continue;
									}
									if (local203 == 5202) {
										local25--;
										Static133.method2218(Static132.anIntArray372[local25]);
										continue;
									}
									if (local203 == 5203) {
										local27--;
										Static182.method2890(Static126.aClass60Array19[local27]);
										continue;
									}
									if (local203 == 5204) {
										Static126.aClass60Array19[local27 - 1] = Static85.method1485(Static126.aClass60Array19[local27 - 1]);
										continue;
									}
									if (local203 == 5205) {
										local27--;
										Static31.method589(Static126.aClass60Array19[local27]);
										continue;
									}
								} else if (local203 < 5400) {
									if (local203 == 5304) {
										Static132.anIntArray372[local25++] = 0;
										continue;
									}
								} else if (local203 < 5500) {
									if (local203 == 5400) {
										local27 -= 2;
										local582 = Static126.aClass60Array19[local27];
										local2308 = Static126.aClass60Array19[local27 + 1];
										local25--;
										local981 = Static132.anIntArray372[local25];
										Static96.aClass1_Sub9_Sub1_3.method953(85);
										Static96.aClass1_Sub9_Sub1_3.method899(Static177.method2834(local582) + Static177.method2834(local2308) + 1);
										Static96.aClass1_Sub9_Sub1_3.method924(local582);
										Static96.aClass1_Sub9_Sub1_3.method924(local2308);
										Static96.aClass1_Sub9_Sub1_3.method899(local981);
										continue;
									}
									if (local203 == 5401) {
										local25 -= 2;
										Static103.aShortArray32[Static132.anIntArray372[local25]] = (short) Static54.method1053(Static132.anIntArray372[local25 + 1]);
										Static36.method2893();
										Static106.method1828();
										Static107.method1861();
										Static48.method952();
										Static207.method3210();
										continue;
									}
								}
							} else if (local203 == 4400) {
								local25 -= 2;
								local768 = Static132.anIntArray372[local25];
								local773 = Static132.anIntArray372[local25 + 1];
								local2828 = Static168.method2742(local773);
								if (local2828.method3206()) {
									Static126.aClass60Array19[local27++] = Static44.method760(local768).method2944(local773, local2828.aClass60_1506);
								} else {
									Static132.anIntArray372[local25++] = Static44.method760(local768).method2939(local773, local2828.anInt4379);
								}
								continue;
							}
						} else {
							if (local203 == 4100) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25--;
								local773 = Static132.anIntArray372[local25];
								Static126.aClass60Array19[local27++] = Static34.method611(new Class60[] { local582, Static40.method681(local773) });
								continue;
							}
							if (local203 == 4101) {
								local27 -= 2;
								local582 = Static126.aClass60Array19[local27];
								local2308 = Static126.aClass60Array19[local27 + 1];
								Static126.aClass60Array19[local27++] = Static34.method611(new Class60[] { local582, local2308 });
								continue;
							}
							if (local203 == 4102) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25--;
								local773 = Static132.anIntArray372[local25];
								Static126.aClass60Array19[local27++] = Static34.method611(new Class60[] { local582, Static64.method1154(local773) });
								continue;
							}
							if (local203 == 4103) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static126.aClass60Array19[local27++] = local582.method1836();
								continue;
							}
							if (local203 == 4104) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								@Pc(5184) long local5184 = (long) local768 * 86400000L + 1014768000000L;
								Static139.aCalendar1.setTime(new Date(local5184));
								local624 = Static139.aCalendar1.get(5);
								local644 = Static139.aCalendar1.get(2);
								local1018 = Static139.aCalendar1.get(1);
								Static126.aClass60Array19[local27++] = Static34.method611(new Class60[] { Static40.method681(local624), Static9.aClass60_1513, Static106.aClass60Array16[local644], Static9.aClass60_1513, Static40.method681(local1018) });
								continue;
							}
							if (local203 == 4105) {
								local27 -= 2;
								local582 = Static126.aClass60Array19[local27];
								local2308 = Static126.aClass60Array19[local27 + 1];
								if (Static84.aClass9_Sub4_Sub1_2.aClass50_2 != null && Static84.aClass9_Sub4_Sub1_2.aClass50_2.aBoolean110) {
									Static126.aClass60Array19[local27++] = local2308;
									continue;
								}
								Static126.aClass60Array19[local27++] = local582;
								continue;
							}
							if (local203 == 4106) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static126.aClass60Array19[local27++] = Static40.method681(local768);
								continue;
							}
							if (local203 == 4107) {
								local27 -= 2;
								Static132.anIntArray372[local25++] = Static126.aClass60Array19[local27].method1810(Static126.aClass60Array19[local27 + 1]);
								continue;
							}
							@Pc(5342) Class1_Sub1_Sub14_Sub1_Sub1 local5342;
							@Pc(5337) byte[] local5337;
							if (local203 == 4108) {
								local25 -= 2;
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local773 = Static132.anIntArray372[local25];
								local981 = Static132.anIntArray372[local25 + 1];
								local5337 = Static125.aClass7_Sub1_20.method3242(local981, 0);
								local5342 = new Class1_Sub1_Sub14_Sub1_Sub1(local5337);
								local5342.method3310(Static108.aClass73Array4, null);
								Static132.anIntArray372[local25++] = local5342.method3300(local582, local773);
								continue;
							}
							if (local203 == 4109) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25 -= 2;
								local773 = Static132.anIntArray372[local25];
								local981 = Static132.anIntArray372[local25 + 1];
								local5337 = Static125.aClass7_Sub1_20.method3242(local981, 0);
								local5342 = new Class1_Sub1_Sub14_Sub1_Sub1(local5337);
								local5342.method3310(Static108.aClass73Array4, null);
								Static132.anIntArray372[local25++] = local5342.method3322(local582, local773);
								continue;
							}
							if (local203 == 4110) {
								local27 -= 2;
								local582 = Static126.aClass60Array19[local27];
								local2308 = Static126.aClass60Array19[local27 + 1];
								local25--;
								if (Static132.anIntArray372[local25] == 1) {
									Static126.aClass60Array19[local27++] = local582;
								} else {
									Static126.aClass60Array19[local27++] = local2308;
								}
								continue;
							}
							if (local203 == 4111) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								Static126.aClass60Array19[local27++] = Static123.method3304(local582);
								continue;
							}
							if (local203 == 4112) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25--;
								local773 = Static132.anIntArray372[local25];
								if (local773 == -1) {
									throw new RuntimeException("null char");
								}
								Static126.aClass60Array19[local27++] = local582.method1799(local773);
								continue;
							}
							if (local203 == 4113) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static8.method151(local768) ? 1 : 0;
								continue;
							}
							if (local203 == 4114) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static4.method81(local768) ? 1 : 0;
								continue;
							}
							if (local203 == 4115) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static84.method1045(local768) ? 1 : 0;
								continue;
							}
							if (local203 == 4116) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static9.method3231(local768) ? 1 : 0;
								continue;
							}
							if (local203 == 4117) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								if (local582 == null) {
									Static132.anIntArray372[local25++] = 0;
								} else {
									Static132.anIntArray372[local25++] = local582.method1835();
								}
								continue;
							}
							if (local203 == 4118) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25 -= 2;
								local773 = Static132.anIntArray372[local25];
								local981 = Static132.anIntArray372[local25 + 1];
								Static126.aClass60Array19[local27++] = local582.method1797(local773, local981);
								continue;
							}
							if (local203 == 4119) {
								@Pc(5647) boolean local5647 = false;
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local2308 = Static32.method599(local582.method1835());
								for (local624 = 0; local582.method1835() > local624; local624++) {
									local644 = local582.method1793(local624);
									if (local644 == 60) {
										local5647 = true;
									} else if (local644 == 62) {
										local5647 = false;
									} else if (!local5647) {
										local2308.method1816(local644);
									}
								}
								local2308.method1795();
								Static126.aClass60Array19[local27++] = local2308;
								continue;
							}
							if (local203 == 4120) {
								local27--;
								local582 = Static126.aClass60Array19[local27];
								local25 -= 2;
								local981 = Static132.anIntArray372[local25 + 1];
								local773 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = local582.method1832(local773, local981);
								continue;
							}
							if (local203 == 4121) {
								local27 -= 2;
								local2308 = Static126.aClass60Array19[local27 + 1];
								local25--;
								local981 = Static132.anIntArray372[local25];
								local582 = Static126.aClass60Array19[local27];
								Static132.anIntArray372[local25++] = local582.method1837(local2308, local981);
								continue;
							}
							if (local203 == 4122) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static207.method3211(local768);
								continue;
							}
							if (local203 == 4123) {
								local25--;
								local768 = Static132.anIntArray372[local25];
								Static132.anIntArray372[local25++] = Static162.method3435(local768);
								continue;
							}
						}
					} else {
						if (local203 >= 2000) {
							local203 -= 1000;
							local25--;
							local1110 = Static107.method1857(Static132.anIntArray372[local25]);
						} else {
							local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
						}
						if (local203 == 1300) {
							local25--;
							local773 = Static132.anIntArray372[local25] - 1;
							if (local773 >= 0 && local773 <= 9) {
								local27--;
								local1110.method152(Static126.aClass60Array19[local27], local773);
								continue;
							}
							local27--;
							continue;
						}
						if (local203 == 1301) {
							local25 -= 2;
							local981 = Static132.anIntArray372[local25 + 1];
							local773 = Static132.anIntArray372[local25];
							local1110.aClass6_1 = Static92.method1619(local773, local981);
							continue;
						}
						if (local203 == 1302) {
							local25--;
							local1110.aBoolean12 = Static132.anIntArray372[local25] == 1;
							continue;
						}
						if (local203 == 1303) {
							local25--;
							local1110.anInt253 = Static132.anIntArray372[local25];
							continue;
						}
						if (local203 == 1304) {
							local25--;
							local1110.anInt248 = Static132.anIntArray372[local25];
							continue;
						}
						if (local203 == 1305) {
							local27--;
							local1110.aClass60_79 = Static126.aClass60Array19[local27];
							continue;
						}
						if (local203 == 1306) {
							local27--;
							local1110.aClass60_76 = Static126.aClass60Array19[local27];
							continue;
						}
						if (local203 == 1307) {
							local1110.aClass60Array3 = null;
							continue;
						}
					}
				} else {
					if (local203 < 2000) {
						local1110 = local960 ? Static133.aClass6_12 : Static82.aClass6_10;
					} else {
						local203 -= 1000;
						local25--;
						local1110 = Static107.method1857(Static132.anIntArray372[local25]);
					}
					if (local203 == 1000) {
						local1110.aByte6 = 0;
						local25 -= 2;
						local1110.anInt262 = local1110.anInt252 = Static132.anIntArray372[local25];
						local1110.aByte5 = 0;
						local1110.anInt235 = local1110.anInt197 = Static132.anIntArray372[local25 + 1];
						Static57.method1068(local1110);
						continue;
					}
					if (local203 == 1001) {
						local25 -= 2;
						local1110.aByte4 = 0;
						local1110.anInt251 = local1110.anInt232 = Static132.anIntArray372[local25];
						local1110.anInt205 = 0;
						local1110.aByte3 = 0;
						local1110.anInt221 = local1110.anInt271 = Static132.anIntArray372[local25 + 1];
						local1110.anInt234 = 0;
						Static57.method1068(local1110);
						if (local1110.anInt233 == 0) {
							Static178.method2848(false, local1110);
						}
						Static178.method2855(local1110);
						continue;
					}
					if (local203 == 1003) {
						local25--;
						@Pc(1456) boolean local1456 = Static132.anIntArray372[local25] == 1;
						if (local1456 != local1110.aBoolean21) {
							local1110.aBoolean21 = local1456;
							Static57.method1068(local1110);
						}
						continue;
					}
					if (local203 == 1004) {
						local25 -= 4;
						local1110.anInt252 = Static132.anIntArray372[local25];
						local1110.anInt197 = Static132.anIntArray372[local25 + 1];
						local773 = Static132.anIntArray372[local25 + 2];
						if (local773 < 0) {
							local773 = 0;
						} else if (local773 > 2) {
							local773 = 2;
						}
						local981 = Static132.anIntArray372[local25 + 3];
						if (local981 < 0) {
							local981 = 0;
						} else if (local981 > 2) {
							local981 = 2;
						}
						local1110.aByte6 = (byte) (local773 + 3);
						local1110.aByte5 = (byte) (local981 + 3);
						Static57.method1068(local1110);
						Static178.method2855(local1110);
						continue;
					}
					if (local203 == 1005) {
						local25 -= 2;
						local1110.aByte6 = 2;
						local1110.anInt252 = Static132.anIntArray372[local25];
						local1110.aByte5 = 2;
						local1110.anInt197 = Static132.anIntArray372[local25 + 1];
						Static57.method1068(local1110);
						if (local1110.anInt233 == 0) {
							Static178.method2848(false, local1110);
						}
						Static178.method2855(local1110);
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(9550) Exception local9550) {
			if (local18.aClass60_1457 == null) {
				if (Static27.anInt645 != 0) {
					Static13.method239(Static49.aClass60_395, Static207.aClass60_1508, 0);
				}
				Static131.method2194("CS2 - scr:" + local18.aLong150 + " op:" + local41, local9550);
			} else {
				@Pc(9580) Class60 local9580 = Static32.method599(30);
				local9580.method1823(Static17.aClass60_147).method1823(local18.aClass60_1457);
				for (local55 = Static45.anInt1027 - 1; local55 >= 0; local55--) {
					local9580.method1823(Static74.aClass60_578).method1823(Static170.aClass79Array1[local55].aClass1_Sub1_Sub26_1.aClass60_1457);
				}
				if (local41 == 40) {
					local93 = local32[local29];
					local9580.method1823(Static189.aClass60_1372).method1823(Static40.method681(local93));
				}
				if (Static27.anInt645 != 0) {
					Static13.method239(Static49.aClass60_395, Static34.method611(new Class60[] { Static137.aClass60_1558, local18.aClass60_1457 }), 0);
				}
				Static131.method2194("CS2 - scr:" + local18.aLong150 + " op:" + local41 + new String(local9580.method1831()), local9550);
			}
		}
	}
}
