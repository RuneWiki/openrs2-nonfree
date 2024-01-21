import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 aClass4_Sub3_Sub6_Sub3_3;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_15;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_827 = Static41.method597("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_829 = Static41.method597("Location");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_828 = aClass60_829;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public static int anInt2001 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt2004 = 0;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	public static int anInt2006 = 0;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_830 = Static41.method597("::rect_debug");

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!od;")
	private static Class60 aClass60_831 = Static41.method597("slide:");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_832 = aClass60_831;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_833 = Static41.method597("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_834 = aClass60_831;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method1353(@OriginalArg(1) Class4_Sub21 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray28;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(20) Class4_Sub3_Sub11 local20 = Static75.method688(local14);
		if (local20 == null) {
			return;
		}
		Static91.anInt2135 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) byte local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = -1;
		@Pc(36) int[] local36 = local20.anIntArray224;
		@Pc(39) int[] local39 = local20.anIntArray225;
		@Pc(58) int local58;
		@Pc(96) int local96;
		try {
			Static128.aClass60Array19 = new Class60[local20.anInt1940];
			Static48.anIntArray120 = new int[local20.anInt1944];
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			for (local58 = 1; local58 < local8.length; local58++) {
				if (local8[local58] instanceof Integer) {
					local96 = (Integer) local8[local58];
					if (local96 == -2147483647) {
						local96 = arg0.anInt2709;
					}
					if (local96 == -2147483646) {
						local96 = arg0.anInt2710;
					}
					if (local96 == -2147483645) {
						local96 = arg0.aClass4_Sub14_14 == null ? -1 : arg0.aClass4_Sub14_14.anInt2388;
					}
					if (local96 == -2147483644) {
						local96 = arg0.anInt2706;
					}
					if (local96 == -2147483643) {
						local96 = arg0.aClass4_Sub14_14 == null ? -1 : arg0.aClass4_Sub14_14.anInt2403;
					}
					if (local96 == -2147483642) {
						local96 = arg0.aClass4_Sub14_15 == null ? -1 : arg0.aClass4_Sub14_15.anInt2388;
					}
					if (local96 == -2147483641) {
						local96 = arg0.aClass4_Sub14_15 == null ? -1 : arg0.aClass4_Sub14_15.anInt2403;
					}
					if (local96 == -2147483640) {
						local96 = arg0.anInt2707;
					}
					if (local96 == -2147483639) {
						local96 = arg0.anInt2714;
					}
					Static48.anIntArray120[local54++] = local96;
				} else if (local8[local58] instanceof Class60) {
					@Pc(75) Class60 local75 = (Class60) local8[local58];
					if (local75.method1311(Static111.aClass60_1021)) {
						local75 = arg0.aClass60_1054;
					}
					Static128.aClass60Array19[local56++] = local75;
				}
			}
			local96 = 0;
			label1927: while (true) {
				local96++;
				if (local96 > 200000) {
					throw new RuntimeException("slow");
				}
				local33++;
				@Pc(216) int local216 = local39[local33];
				@Pc(648) int local648;
				@Pc(772) int local772;
				@Pc(627) int local627;
				@Pc(767) int local767;
				@Pc(581) Class60 local581;
				if (local216 < 100) {
					if (local216 == 0) {
						Static103.anIntArray317[local27++] = local36[local33];
						continue;
					}
					@Pc(239) int local239;
					if (local216 == 1) {
						local239 = local36[local33];
						Static103.anIntArray317[local27++] = Static53.anIntArray141[local239];
						continue;
					}
					if (local216 == 2) {
						local239 = local36[local33];
						local27--;
						Static53.anIntArray141[local239] = Static103.anIntArray317[local27];
						continue;
					}
					if (local216 == 3) {
						Static55.aClass60Array7[local31++] = local20.aClass60Array15[local33];
						continue;
					}
					if (local216 == 6) {
						local33 += local36[local33];
						continue;
					}
					if (local216 == 7) {
						local27 -= 2;
						if (Static103.anIntArray317[local27 + 1] != Static103.anIntArray317[local27]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 8) {
						local27 -= 2;
						if (Static103.anIntArray317[local27] == Static103.anIntArray317[local27 + 1]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 9) {
						local27 -= 2;
						if (Static103.anIntArray317[local27 + 1] > Static103.anIntArray317[local27]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 10) {
						local27 -= 2;
						if (Static103.anIntArray317[local27 + 1] < Static103.anIntArray317[local27]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 21) {
						if (Static91.anInt2135 == 0) {
							return;
						}
						@Pc(396) Class2 local396 = Static81.aClass2Array1[--Static91.anInt2135];
						local20 = local396.aClass4_Sub3_Sub11_1;
						local39 = local20.anIntArray225;
						Static128.aClass60Array19 = local396.aClass60Array1;
						local33 = local396.anInt16;
						Static48.anIntArray120 = local396.anIntArray2;
						local36 = local20.anIntArray224;
						continue;
					}
					if (local216 == 25) {
						local239 = local36[local33];
						Static103.anIntArray317[local27++] = Static59.method973(local239);
						continue;
					}
					if (local216 == 27) {
						local239 = local36[local33];
						local27--;
						Static105.method1732(local239, Static103.anIntArray317[local27]);
						continue;
					}
					if (local216 == 31) {
						local27 -= 2;
						if (Static103.anIntArray317[local27 + 1] >= Static103.anIntArray317[local27]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 32) {
						local27 -= 2;
						if (Static103.anIntArray317[local27 + 1] <= Static103.anIntArray317[local27]) {
							local33 += local36[local33];
						}
						continue;
					}
					if (local216 == 33) {
						Static103.anIntArray317[local27++] = Static48.anIntArray120[local36[local33]];
						continue;
					}
					@Pc(525) int local525;
					if (local216 == 34) {
						local525 = local36[local33];
						local27--;
						Static48.anIntArray120[local525] = Static103.anIntArray317[local27];
						continue;
					}
					if (local216 == 35) {
						Static55.aClass60Array7[local31++] = Static128.aClass60Array19[local36[local33]];
						continue;
					}
					if (local216 == 36) {
						local525 = local36[local33];
						local31--;
						Static128.aClass60Array19[local525] = Static55.aClass60Array7[local31];
						continue;
					}
					if (local216 == 37) {
						local239 = local36[local33];
						local31 -= local239;
						local581 = Static117.method1886(local239, Static55.aClass60Array7, local31);
						Static55.aClass60Array7[local31++] = local581;
						continue;
					}
					if (local216 == 38) {
						local27--;
						continue;
					}
					if (local216 == 39) {
						local31--;
						continue;
					}
					if (local216 == 40) {
						local239 = local36[local33];
						@Pc(617) Class4_Sub3_Sub11 local617 = Static75.method688(local239);
						@Pc(621) Class60[] local621 = new Class60[local617.anInt1940];
						@Pc(625) int[] local625 = new int[local617.anInt1944];
						for (local627 = 0; local627 < local617.anInt1938; local627++) {
							local625[local627] = Static103.anIntArray317[local627 + local27 - local617.anInt1938];
						}
						for (local648 = 0; local648 < local617.anInt1937; local648++) {
							local621[local648] = Static55.aClass60Array7[local31 + local648 - local617.anInt1937];
						}
						local27 -= local617.anInt1938;
						local31 -= local617.anInt1937;
						@Pc(686) Class2 local686 = new Class2();
						local686.anIntArray2 = Static48.anIntArray120;
						local686.aClass4_Sub3_Sub11_1 = local20;
						local686.aClass60Array1 = Static128.aClass60Array19;
						local20 = local617;
						local686.anInt16 = local33;
						local33 = -1;
						Static81.aClass2Array1[Static91.anInt2135++] = local686;
						Static48.anIntArray120 = local625;
						local36 = local617.anIntArray224;
						Static128.aClass60Array19 = local621;
						local39 = local617.anIntArray225;
						continue;
					}
					if (local216 == 42) {
						Static103.anIntArray317[local27++] = Static70.anIntArray194[local36[local33]];
						continue;
					}
					if (local216 == 43) {
						local525 = local36[local33];
						local27--;
						Static70.anIntArray194[local525] = Static103.anIntArray317[local27];
						continue;
					}
					if (local216 == 44) {
						local239 = local36[local33] >> 16;
						local767 = local36[local33] & 0xFFFF;
						local27--;
						local772 = Static103.anIntArray317[local27];
						if (local772 >= 0 && local772 <= 5000) {
							Static7.anIntArray8[local239] = local772;
							@Pc(790) byte local790 = -1;
							if (local767 == 105) {
								local790 = 0;
							}
							local627 = 0;
							while (true) {
								if (local772 <= local627) {
									continue label1927;
								}
								Static16.anIntArrayArray13[local239][local627] = local790;
								local627++;
							}
						}
						throw new RuntimeException();
					}
					if (local216 == 45) {
						local27--;
						local767 = Static103.anIntArray317[local27];
						local239 = local36[local33];
						if (local767 >= 0 && local767 < Static7.anIntArray8[local239]) {
							Static103.anIntArray317[local27++] = Static16.anIntArrayArray13[local239][local767];
							continue;
						}
						throw new RuntimeException();
					}
					if (local216 == 46) {
						local27 -= 2;
						local239 = local36[local33];
						local767 = Static103.anIntArray317[local27];
						if (local767 >= 0 && local767 < Static7.anIntArray8[local239]) {
							Static16.anIntArrayArray13[local239][local767] = Static103.anIntArray317[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local216 == 47) {
						@Pc(901) Class60 local901 = Static131.aClass60Array23[local36[local33]];
						if (local901 == null) {
							local901 = Static101.aClass60_1145;
						}
						Static55.aClass60Array7[local31++] = local901;
						continue;
					}
					if (local216 == 48) {
						local525 = local36[local33];
						local31--;
						Static131.aClass60Array23[local525] = Static55.aClass60Array7[local31];
						continue;
					}
				}
				@Pc(937) boolean local937;
				if (local36[local33] == 1) {
					local937 = true;
				} else {
					local937 = false;
				}
				@Pc(1097) Class4_Sub14 local1097;
				@Pc(966) int local966;
				@Pc(978) Class4_Sub14 local978;
				@Pc(1003) int local1003;
				@Pc(1150) Class4_Sub14 local1150;
				if (local216 < 1000) {
					if (local216 == 100) {
						local27 -= 3;
						local767 = Static103.anIntArray317[local27];
						local772 = Static103.anIntArray317[local27 + 1];
						local966 = Static103.anIntArray317[local27 + 2];
						if (local772 == 0) {
							throw new RuntimeException();
						}
						local978 = Static61.method991(local767);
						if (local978.aClass4_Sub14Array3 == null) {
							local978.aClass4_Sub14Array3 = new Class4_Sub14[local966 + 1];
						}
						if (local966 >= local978.aClass4_Sub14Array3.length) {
							@Pc(1001) Class4_Sub14[] local1001 = new Class4_Sub14[local966 + 1];
							for (local1003 = 0; local1003 < local978.aClass4_Sub14Array3.length; local1003++) {
								local1001[local1003] = local978.aClass4_Sub14Array3[local1003];
							}
							local978.aClass4_Sub14Array3 = local1001;
						}
						if (local966 > 0 && local978.aClass4_Sub14Array3[local966 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local966 - 1));
						}
						@Pc(1054) Class4_Sub14 local1054 = new Class4_Sub14();
						local1054.anInt2389 = local772;
						local1054.aBoolean95 = true;
						local1054.anInt2397 = local1054.anInt2388 = local978.anInt2388;
						local1054.anInt2403 = local966;
						local978.aClass4_Sub14Array3[local966] = local1054;
						if (local937) {
							Static36.aClass4_Sub14_8 = local1054;
						} else {
							Static1.aClass4_Sub14_1 = local1054;
						}
						Static36.method558(local978);
						continue;
					}
					if (local216 == 101) {
						local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
						@Pc(1102) Class4_Sub14 local1102 = Static61.method991(local1097.anInt2388);
						local1102.aClass4_Sub14Array3[local1097.anInt2403] = null;
						Static36.method558(local1102);
						continue;
					}
					if (local216 == 102) {
						local27--;
						local1097 = Static61.method991(Static103.anIntArray317[local27]);
						local1097.aClass4_Sub14Array3 = null;
						Static36.method558(local1097);
						continue;
					}
					if (local216 == 200) {
						local27 -= 2;
						local767 = Static103.anIntArray317[local27];
						local772 = Static103.anIntArray317[local27 + 1];
						local1150 = Static53.method867(local767, local772);
						if (local1150 != null && local772 != -1) {
							Static103.anIntArray317[local27++] = 1;
							if (local937) {
								Static36.aClass4_Sub14_8 = local1150;
							} else {
								Static1.aClass4_Sub14_1 = local1150;
							}
							continue;
						}
						Static103.anIntArray317[local27++] = 0;
						continue;
					}
				} else if ((local216 < 1000 || local216 >= 1100) && (local216 < 2000 || local216 >= 2100)) {
					@Pc(1546) Class60 local1546;
					if (local216 >= 1100 && local216 < 1200 || !(local216 < 2100 || local216 >= 2200)) {
						if (local216 < 2000) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
						} else {
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
							local216 -= 1000;
						}
						if (local216 == 1100) {
							local27 -= 2;
							local1097.anInt2416 = Static103.anIntArray317[local27];
							if (local1097.anInt2416 > local1097.anInt2394 - local1097.anInt2392) {
								local1097.anInt2416 = local1097.anInt2394 - local1097.anInt2392;
							}
							if (local1097.anInt2416 < 0) {
								local1097.anInt2416 = 0;
							}
							local1097.anInt2437 = Static103.anIntArray317[local27 + 1];
							if (local1097.anInt2437 > local1097.anInt2395 - local1097.anInt2440) {
								local1097.anInt2437 = local1097.anInt2395 - local1097.anInt2440;
							}
							if (local1097.anInt2437 < 0) {
								local1097.anInt2437 = 0;
							}
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1101) {
							local27--;
							local1097.anInt2387 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1102) {
							local27--;
							local1097.aBoolean101 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1103) {
							local27--;
							local1097.anInt2418 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1104) {
							local27--;
							local1097.anInt2366 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1105) {
							local27--;
							local1097.anInt2401 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1106) {
							local27--;
							local1097.anInt2393 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1107) {
							local27--;
							local1097.aBoolean90 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1108) {
							local1097.anInt2367 = 1;
							local27--;
							local1097.anInt2364 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1109) {
							local27 -= 6;
							local1097.anInt2409 = Static103.anIntArray317[local27];
							local1097.anInt2425 = Static103.anIntArray317[local27 + 1];
							local1097.anInt2386 = Static103.anIntArray317[local27 + 2];
							local1097.anInt2373 = Static103.anIntArray317[local27 + 3];
							local1097.anInt2404 = Static103.anIntArray317[local27 + 4];
							local1097.anInt2410 = Static103.anIntArray317[local27 + 5];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1110) {
							local27--;
							local772 = Static103.anIntArray317[local27];
							if (local772 != local1097.anInt2385) {
								local1097.anInt2434 = 0;
								local1097.anInt2385 = local772;
								local1097.anInt2424 = 0;
								Static36.method558(local1097);
							}
							continue;
						}
						if (local216 == 1111) {
							local27--;
							local1097.aBoolean92 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1112) {
							local31--;
							local1546 = Static55.aClass60Array7[local31];
							if (!local1546.method1311(local1097.aClass60_958)) {
								local1097.aClass60_958 = local1546;
								Static36.method558(local1097);
							}
							continue;
						}
						if (local216 == 1113) {
							local27--;
							local1097.anInt2405 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1114) {
							local27 -= 3;
							local1097.anInt2391 = Static103.anIntArray317[local27];
							local1097.anInt2407 = Static103.anIntArray317[local27 + 1];
							local1097.anInt2372 = Static103.anIntArray317[local27 + 2];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1115) {
							local27--;
							local1097.aBoolean96 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1116) {
							local27--;
							local1097.anInt2378 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1117) {
							local27--;
							local1097.anInt2408 = Static103.anIntArray317[local27];
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1118) {
							local27--;
							local1097.aBoolean99 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1119) {
							local27--;
							local1097.aBoolean97 = Static103.anIntArray317[local27] == 1;
							Static36.method558(local1097);
							continue;
						}
						if (local216 == 1120) {
							local27 -= 2;
							local1097.anInt2394 = Static103.anIntArray317[local27];
							local1097.anInt2395 = Static103.anIntArray317[local27 + 1];
							Static36.method558(local1097);
							continue;
						}
					} else if (local216 >= 1200 && local216 < 1300 || local216 >= 2200 && local216 < 2300) {
						if (local216 >= 2000) {
							local216 -= 1000;
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
						} else {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
						}
						Static36.method558(local1097);
						if (local216 == 1200) {
							local27 -= 2;
							local966 = Static103.anIntArray317[local27 + 1];
							local772 = Static103.anIntArray317[local27];
							local1097.anInt2370 = local966;
							local1097.anInt2399 = local772;
							@Pc(6858) Class4_Sub3_Sub16 local6858 = Static112.method1854(local772);
							local1097.anInt2410 = local6858.anInt2875;
							local1097.anInt2409 = local6858.anInt2888;
							if (local1097.anInt2392 > 0) {
								local1097.anInt2410 = local1097.anInt2410 * 32 / local1097.anInt2392;
							}
							local1097.anInt2425 = local6858.anInt2891;
							local1097.anInt2373 = local6858.anInt2883;
							local1097.anInt2404 = local6858.anInt2877;
							local1097.anInt2386 = local6858.anInt2907;
							continue;
						}
						if (local216 == 1201) {
							local1097.anInt2367 = 2;
							local27--;
							local1097.anInt2364 = Static103.anIntArray317[local27];
							continue;
						}
						if (local216 == 1202) {
							local1097.anInt2367 = 3;
							local1097.anInt2364 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1.method1054();
							continue;
						}
					} else if ((local216 < 1300 || local216 >= 1400) && (local216 < 2300 || local216 >= 2400)) {
						if (local216 >= 1400 && local216 < 1500 || local216 >= 2400 && local216 < 2500) {
							if (local216 < 2000) {
								local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
							} else {
								local27--;
								local1097 = Static61.method991(Static103.anIntArray317[local27]);
								local216 -= 1000;
							}
							local31--;
							local1546 = Static55.aClass60Array7[local31];
							@Pc(1796) int[] local1796 = null;
							if (local1546.method1345() > 0 && local1546.method1338(local1546.method1345() - 1) == 89) {
								local27--;
								local627 = Static103.anIntArray317[local27];
								if (local627 > 0) {
									local1796 = new int[local627];
									while (local627-- > 0) {
										local27--;
										local1796[local627] = Static103.anIntArray317[local27];
									}
								}
								local1546 = local1546.method1333(0, local1546.method1345() - 1);
							}
							@Pc(1856) Object[] local1856 = new Object[local1546.method1345() + 1];
							for (local648 = local1856.length - 1; local648 >= 1; local648--) {
								if (local1546.method1338(local648 - 1) == 115) {
									local31--;
									local1856[local648] = Static55.aClass60Array7[local31];
								} else {
									local27--;
									local1856[local648] = Integer.valueOf(Static103.anIntArray317[local27]);
								}
							}
							local27--;
							local1003 = Static103.anIntArray317[local27];
							if (local1003 == -1) {
								local1856 = null;
							} else {
								local1856[0] = Integer.valueOf(local1003);
							}
							if (local216 == 1408) {
								local1097.anObjectArray11 = local1856;
							}
							local1097.aBoolean100 = true;
							if (local216 == 1404) {
								local1097.anObjectArray13 = local1856;
							}
							if (local216 == 1411) {
								local1097.anObjectArray17 = local1856;
							}
							if (local216 == 1423) {
								local1097.anObjectArray18 = local1856;
							}
							if (local216 == 1416) {
								local1097.anObjectArray19 = local1856;
							}
							if (local216 == 1417) {
								local1097.anObjectArray14 = local1856;
							}
							if (local216 == 1403) {
								local1097.anObjectArray20 = local1856;
							}
							if (local216 == 1420) {
								local1097.anObjectArray21 = local1856;
							}
							if (local216 == 1424) {
								local1097.anObjectArray26 = local1856;
							}
							if (local216 == 1418) {
								local1097.anObjectArray15 = local1856;
							}
							if (local216 == 1421) {
								local1097.anObjectArray3 = local1856;
							}
							if (local216 == 1407) {
								local1097.anObjectArray12 = local1856;
								local1097.anIntArray315 = local1796;
							}
							if (local216 == 1419) {
								local1097.anObjectArray7 = local1856;
							}
							if (local216 == 1402) {
								local1097.anObjectArray8 = local1856;
							}
							if (local216 == 1412) {
								local1097.anObjectArray2 = local1856;
							}
							if (local216 == 1414) {
								local1097.anObjectArray23 = local1856;
								local1097.anIntArray305 = local1796;
							}
							if (local216 == 1415) {
								local1097.anObjectArray9 = local1856;
								local1097.anIntArray313 = local1796;
							}
							if (local216 == 1400) {
								local1097.anObjectArray22 = local1856;
							}
							if (local216 == 1410) {
								local1097.anObjectArray16 = local1856;
							}
							if (local216 == 1401) {
								local1097.anObjectArray10 = local1856;
							}
							if (local216 == 1409) {
								local1097.anObjectArray4 = local1856;
							}
							if (local216 == 1406) {
								local1097.anObjectArray6 = local1856;
							}
							if (local216 == 1405) {
								local1097.anObjectArray24 = local1856;
							}
							if (local216 == 1422) {
								local1097.anObjectArray5 = local1856;
							}
							continue;
						}
						if (local216 < 1600) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
							if (local216 == 1500) {
								Static103.anIntArray317[local27++] = local1097.anInt2406;
								continue;
							}
							if (local216 == 1501) {
								Static103.anIntArray317[local27++] = local1097.anInt2375;
								continue;
							}
							if (local216 == 1502) {
								Static103.anIntArray317[local27++] = local1097.anInt2392;
								continue;
							}
							if (local216 == 1503) {
								Static103.anIntArray317[local27++] = local1097.anInt2440;
								continue;
							}
							if (local216 == 1504) {
								Static103.anIntArray317[local27++] = local1097.aBoolean91 ? 1 : 0;
								continue;
							}
							if (local216 == 1505) {
								Static103.anIntArray317[local27++] = local1097.anInt2397;
								continue;
							}
						} else if (local216 < 1700) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
							if (local216 == 1600) {
								Static103.anIntArray317[local27++] = local1097.anInt2416;
								continue;
							}
							if (local216 == 1601) {
								Static103.anIntArray317[local27++] = local1097.anInt2437;
								continue;
							}
							if (local216 == 1602) {
								Static55.aClass60Array7[local31++] = local1097.aClass60_958;
								continue;
							}
							if (local216 == 1603) {
								Static103.anIntArray317[local27++] = local1097.anInt2394;
								continue;
							}
							if (local216 == 1604) {
								Static103.anIntArray317[local27++] = local1097.anInt2395;
								continue;
							}
							if (local216 == 1605) {
								Static103.anIntArray317[local27++] = local1097.anInt2410;
								continue;
							}
							if (local216 == 1606) {
								Static103.anIntArray317[local27++] = local1097.anInt2386;
								continue;
							}
							if (local216 == 1607) {
								Static103.anIntArray317[local27++] = local1097.anInt2404;
								continue;
							}
							if (local216 == 1608) {
								Static103.anIntArray317[local27++] = local1097.anInt2373;
								continue;
							}
						} else if (local216 < 1800) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
							if (local216 == 1700) {
								Static103.anIntArray317[local27++] = local1097.anInt2399;
								continue;
							}
							if (local216 == 1701) {
								if (local1097.anInt2399 == -1) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = local1097.anInt2370;
								}
								continue;
							}
							if (local216 == 1702) {
								Static103.anIntArray317[local27++] = local1097.anInt2403;
								continue;
							}
						} else if (local216 < 1900) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
							if (local216 == 1800) {
								Static103.anIntArray317[local27++] = Static43.method616(Static38.method575(local1097));
								continue;
							}
							if (local216 == 1801) {
								local27--;
								local772 = Static103.anIntArray317[local27];
								local772--;
								if (local1097.aClass60Array18 != null && local772 < local1097.aClass60Array18.length && local1097.aClass60Array18[local772] != null) {
									Static55.aClass60Array7[local31++] = local1097.aClass60Array18[local772];
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 1802) {
								if (local1097.aClass60_953 == null) {
									Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								} else {
									Static55.aClass60Array7[local31++] = local1097.aClass60_953;
								}
								continue;
							}
						} else if (local216 < 2600) {
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
							if (local216 == 2500) {
								Static103.anIntArray317[local27++] = local1097.anInt2406;
								continue;
							}
							if (local216 == 2501) {
								Static103.anIntArray317[local27++] = local1097.anInt2375;
								continue;
							}
							if (local216 == 2502) {
								Static103.anIntArray317[local27++] = local1097.anInt2392;
								continue;
							}
							if (local216 == 2503) {
								Static103.anIntArray317[local27++] = local1097.anInt2440;
								continue;
							}
							if (local216 == 2504) {
								Static103.anIntArray317[local27++] = local1097.aBoolean91 ? 1 : 0;
								continue;
							}
							if (local216 == 2505) {
								Static103.anIntArray317[local27++] = local1097.anInt2397;
								continue;
							}
						} else if (local216 < 2700) {
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
							if (local216 == 2600) {
								Static103.anIntArray317[local27++] = local1097.anInt2416;
								continue;
							}
							if (local216 == 2601) {
								Static103.anIntArray317[local27++] = local1097.anInt2437;
								continue;
							}
							if (local216 == 2602) {
								Static55.aClass60Array7[local31++] = local1097.aClass60_958;
								continue;
							}
							if (local216 == 2603) {
								Static103.anIntArray317[local27++] = local1097.anInt2394;
								continue;
							}
							if (local216 == 2604) {
								Static103.anIntArray317[local27++] = local1097.anInt2395;
								continue;
							}
							if (local216 == 2605) {
								Static103.anIntArray317[local27++] = local1097.anInt2410;
								continue;
							}
							if (local216 == 2606) {
								Static103.anIntArray317[local27++] = local1097.anInt2386;
								continue;
							}
							if (local216 == 2607) {
								Static103.anIntArray317[local27++] = local1097.anInt2404;
								continue;
							}
							if (local216 == 2608) {
								Static103.anIntArray317[local27++] = local1097.anInt2373;
								continue;
							}
						} else if (local216 < 2800) {
							if (local216 == 2700) {
								local27--;
								local1097 = Static61.method991(Static103.anIntArray317[local27]);
								Static103.anIntArray317[local27++] = local1097.anInt2399;
								continue;
							}
							if (local216 == 2701) {
								local27--;
								local1097 = Static61.method991(Static103.anIntArray317[local27]);
								if (local1097.anInt2399 == -1) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = local1097.anInt2370;
								}
								continue;
							}
							if (local216 == 2702) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								@Pc(6372) Class4_Sub18 local6372 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local767);
								if (local6372 == null) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = 1;
								}
								continue;
							}
						} else if (local216 < 2900) {
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
							if (local216 == 2800) {
								Static103.anIntArray317[local27++] = Static43.method616(Static38.method575(local1097));
								continue;
							}
							if (local216 == 2801) {
								local27--;
								local772 = Static103.anIntArray317[local27];
								local772--;
								if (local1097.aClass60Array18 != null && local1097.aClass60Array18.length > local772 && local1097.aClass60Array18[local772] != null) {
									Static55.aClass60Array7[local31++] = local1097.aClass60Array18[local772];
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 2802) {
								if (local1097.aClass60_953 == null) {
									Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								} else {
									Static55.aClass60Array7[local31++] = local1097.aClass60_953;
								}
								continue;
							}
						} else if (local216 < 3200) {
							if (local216 == 3100) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static90.method1469(0, Static24.aClass60_272, local581);
								continue;
							}
							if (local216 == 3101) {
								local27 -= 2;
								Static83.method1336(Static103.anIntArray317[local27], Static103.anIntArray317[local27 + 1], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1);
								continue;
							}
							if (local216 == 3103) {
								Static51.method830();
								continue;
							}
							if (local216 == 3104) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local772 = 0;
								if (local581.method1330()) {
									local772 = local581.method1324();
								}
								Static14.aClass4_Sub9_Sub1_1.method826(230);
								Static14.aClass4_Sub9_Sub1_1.method808(local772);
								continue;
							}
							if (local216 == 3105) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static14.aClass4_Sub9_Sub1_1.method826(97);
								Static14.aClass4_Sub9_Sub1_1.method805(local581.method1325());
								continue;
							}
							if (local216 == 3106) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static14.aClass4_Sub9_Sub1_1.method826(202);
								Static14.aClass4_Sub9_Sub1_1.method819(local581.method1345() + 1);
								Static14.aClass4_Sub9_Sub1_1.method788(local581);
								continue;
							}
							if (local216 == 3107) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local31--;
								local1546 = Static55.aClass60Array7[local31];
								Static35.method543(local767, local1546);
								continue;
							}
							if (local216 == 3108) {
								local27 -= 3;
								local767 = Static103.anIntArray317[local27];
								local966 = Static103.anIntArray317[local27 + 2];
								local772 = Static103.anIntArray317[local27 + 1];
								local978 = Static61.method991(local966);
								Static33.method498(local767, local978, local772);
								continue;
							}
							if (local216 == 3109) {
								local27 -= 2;
								local1150 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								Static33.method498(local767, local1150, local772);
								continue;
							}
						} else if (local216 < 3300) {
							if (local216 == 3200) {
								local27 -= 3;
								Static111.method1834(Static103.anIntArray317[local27 + 2], Static103.anIntArray317[local27 + 1], Static103.anIntArray317[local27]);
								continue;
							}
							if (local216 == 3201) {
								local27--;
								Static108.method1788(Static103.anIntArray317[local27]);
								continue;
							}
							if (local216 == 3202) {
								local27 -= 2;
								Static106.method1740(Static103.anIntArray317[local27 + 1], Static103.anIntArray317[local27]);
								continue;
							}
						} else if (local216 < 3400) {
							if (local216 == 3300) {
								Static103.anIntArray317[local27++] = Static118.anInt2741;
								continue;
							}
							if (local216 == 3301) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static69.method1100(local767, local772);
								continue;
							}
							if (local216 == 3302) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = Static39.method580(local767, local772);
								continue;
							}
							if (local216 == 3303) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = Static106.method1742(local772, local767);
								continue;
							}
							if (local216 == 3304) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static116.method1881(local767).anInt2048;
								continue;
							}
							if (local216 == 3305) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static99.anIntArray76[local767];
								continue;
							}
							if (local216 == 3306) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static41.anIntArray114[local767];
								continue;
							}
							if (local216 == 3307) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static7.anIntArray9[local767];
								continue;
							}
							if (local216 == 3308) {
								local767 = Static77.anInt1866;
								local772 = Static49.anInt1207 + (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7);
								local966 = (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7) + Static60.anInt2956;
								Static103.anIntArray317[local27++] = (local772 << 14) + (local767 << 28) + local966;
								continue;
							}
							if (local216 == 3309) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = local767 >> 14 & 0x3FFF;
								continue;
							}
							if (local216 == 3310) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = local767 >> 28;
								continue;
							}
							if (local216 == 3311) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = local767 & 0x3FFF;
								continue;
							}
							if (local216 == 3312) {
								Static103.anIntArray317[local27++] = Static29.aBoolean36 ? 1 : 0;
								continue;
							}
							if (local216 == 3313) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27] + 32768;
								Static103.anIntArray317[local27++] = Static69.method1100(local767, local772);
								continue;
							}
							if (local216 == 3314) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27] + 32768;
								Static103.anIntArray317[local27++] = Static39.method580(local767, local772);
								continue;
							}
							if (local216 == 3315) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27] + 32768;
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = Static106.method1742(local772, local767);
								continue;
							}
							if (local216 == 3316) {
								if (Static117.anInt2726 >= 2) {
									Static103.anIntArray317[local27++] = Static117.anInt2726;
								} else {
									Static103.anIntArray317[local27++] = 0;
								}
								continue;
							}
							if (local216 == 3317) {
								Static103.anIntArray317[local27++] = Static16.anInt552;
								continue;
							}
							if (local216 == 3318) {
								Static103.anIntArray317[local27++] = Static42.anInt1103;
								continue;
							}
							if (local216 == 3321) {
								Static103.anIntArray317[local27++] = Static25.anInt847;
								continue;
							}
							if (local216 == 3322) {
								Static103.anIntArray317[local27++] = Static109.anInt2593;
								continue;
							}
							if (local216 == 3323) {
								if (Static117.anInt2726 == 1) {
									Static103.anIntArray317[local27++] = 1;
								} else {
									Static103.anIntArray317[local27++] = 0;
								}
								continue;
							}
						} else if (local216 < 3500) {
							if (local216 == 3400) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								@Pc(6061) Class4_Sub3_Sub2 local6061 = Static128.method1946(local767);
								for (local627 = 0; local627 < local6061.anInt707; local627++) {
									if (local772 == local6061.anIntArray80[local627]) {
										Static55.aClass60Array7[local31++] = local6061.aClass60Array2[local627];
										local6061 = null;
										break;
									}
								}
								if (local6061 != null) {
									Static55.aClass60Array7[local31++] = local6061.aClass60_211;
								}
								continue;
							}
							if (local216 == 3408) {
								local27 -= 4;
								local767 = Static103.anIntArray317[local27];
								local627 = Static103.anIntArray317[local27 + 3];
								local772 = Static103.anIntArray317[local27 + 1];
								local966 = Static103.anIntArray317[local27 + 2];
								@Pc(6129) Class4_Sub3_Sub2 local6129 = Static128.method1946(local966);
								if (local767 == local6129.anInt708 && local772 == local6129.anInt700) {
									for (local1003 = 0; local1003 < local6129.anInt707; local1003++) {
										if (local6129.anIntArray80[local1003] == local627) {
											if (local772 == 115) {
												Static55.aClass60Array7[local31++] = local6129.aClass60Array2[local1003];
											} else {
												Static103.anIntArray317[local27++] = local6129.anIntArray79[local1003];
											}
											local6129 = null;
											break;
										}
									}
									if (local6129 != null) {
										if (local772 == 115) {
											Static55.aClass60Array7[local31++] = local6129.aClass60_211;
										} else {
											Static103.anIntArray317[local27++] = local6129.anInt706;
										}
									}
									continue;
								}
								if (local772 == 115) {
									Static55.aClass60Array7[local31++] = Static101.aClass60_1145;
								} else {
									Static103.anIntArray317[local27++] = 0;
								}
								continue;
							}
						} else if (local216 < 3700) {
							if (local216 == 3600) {
								if (Static56.anInt1507 == 0) {
									Static103.anIntArray317[local27++] = -2;
								} else if (Static56.anInt1507 == 1) {
									Static103.anIntArray317[local27++] = -1;
								} else {
									Static103.anIntArray317[local27++] = Static83.anInt1972;
								}
								continue;
							}
							if (local216 == 3601) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static56.anInt1507 == 2 && Static83.anInt1972 > local767) {
									Static55.aClass60Array7[local31++] = Static32.aClass60Array4[local767];
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 3602) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static56.anInt1507 == 2 && Static83.anInt1972 > local767) {
									Static103.anIntArray317[local27++] = Static61.anIntArray177[local767];
									continue;
								}
								Static103.anIntArray317[local27++] = 0;
								continue;
							}
							if (local216 == 3603) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static56.anInt1507 == 2 && Static83.anInt1972 > local767) {
									Static103.anIntArray317[local27++] = Static46.anIntArray116[local767];
									continue;
								}
								Static103.anIntArray317[local27++] = 0;
								continue;
							}
							if (local216 == 3604) {
								local27--;
								local772 = Static103.anIntArray317[local27];
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static82.method1303(local772, local581);
								continue;
							}
							if (local216 == 3605) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static20.method383(local581.method1325());
								continue;
							}
							if (local216 == 3606) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static43.method615(local581.method1325());
								continue;
							}
							if (local216 == 3607) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static102.method1700(local581.method1325());
								continue;
							}
							if (local216 == 3608) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static45.method626(local581.method1325());
								continue;
							}
							if (local216 == 3609) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								if (local581.method1321(Static117.aClass60_1057) || local581.method1321(Static10.aClass60_99)) {
									local581 = local581.method1315(7);
								}
								Static103.anIntArray317[local27++] = Static129.method680(local581) ? 1 : 0;
								continue;
							}
							if (local216 == 3611) {
								if (Static131.aClass60_1132 == null) {
									Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								} else {
									Static55.aClass60Array7[local31++] = Static131.aClass60_1132;
								}
								continue;
							}
							if (local216 == 3612) {
								if (Static131.aClass60_1132 == null) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = Static117.anInt2727;
								}
								continue;
							}
							if (local216 == 3613) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static131.aClass60_1132 != null && local767 < Static117.anInt2727) {
									Static55.aClass60Array7[local31++] = Static97.aClass4_Sub4Array1[local767].aClass60_263;
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 3614) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static131.aClass60_1132 != null && local767 < Static117.anInt2727) {
									Static103.anIntArray317[local27++] = Static97.aClass4_Sub4Array1[local767].anInt829;
									continue;
								}
								Static103.anIntArray317[local27++] = 0;
								continue;
							}
							if (local216 == 3615) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static131.aClass60_1132 != null && local767 < Static117.anInt2727) {
									Static103.anIntArray317[local27++] = Static97.aClass4_Sub4Array1[local767].aByte2;
									continue;
								}
								Static103.anIntArray317[local27++] = 0;
								continue;
							}
							if (local216 == 3616) {
								Static103.anIntArray317[local27++] = Static48.aByte3;
								continue;
							}
							if (local216 == 3617) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static6.method59(local767);
								continue;
							}
							if (local216 == 3618) {
								Static103.anIntArray317[local27++] = Static69.aByte5;
								continue;
							}
							if (local216 == 3619) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static38.method578(local581.method1325());
								continue;
							}
							if (local216 == 3620) {
								Static116.method1882();
								continue;
							}
							if (local216 == 3621) {
								if (Static56.anInt1507 == 0) {
									Static103.anIntArray317[local27++] = -1;
								} else {
									Static103.anIntArray317[local27++] = Static59.anInt1560;
								}
								continue;
							}
							if (local216 == 3622) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								if (Static56.anInt1507 != 0 && Static59.anInt1560 > local767) {
									Static55.aClass60Array7[local31++] = Static56.method885(Static26.aLongArray3[local767]).method1322();
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
						} else if (local216 < 4100) {
							if (local216 == 4000) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 + local772;
								continue;
							}
							if (local216 == 4001) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 - local772;
								continue;
							}
							if (local216 == 4002) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = local767 * local772;
								continue;
							}
							if (local216 == 4003) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 / local772;
								continue;
							}
							if (local216 == 4004) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = (int) ((double) local767 * Math.random());
								continue;
							}
							if (local216 == 4005) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = (int) ((double) (local767 + 1) * Math.random());
								continue;
							}
							if (local216 == 4006) {
								local27 -= 5;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								local627 = Static103.anIntArray317[local27 + 3];
								local966 = Static103.anIntArray317[local27 + 2];
								local648 = Static103.anIntArray317[local27 + 4];
								Static103.anIntArray317[local27++] = local767 + (local772 - local767) * (local648 - local966) / (local627 - local966);
								continue;
							}
							if (local216 == 4007) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 * local772 / 100 + local767;
								continue;
							}
							if (local216 == 4008) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = 0x1 << local772 | local767;
								continue;
							}
							if (local216 == 4009) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 & -(0x1 << local772) - 1;
								continue;
							}
							if (local216 == 4010) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = (local767 & 0x1 << local772) == 0 ? 0 : 1;
								continue;
							}
							if (local216 == 4011) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 % local772;
								continue;
							}
							if (local216 == 4012) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								if (local767 == 0) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = (int) Math.pow((double) local767, (double) local772);
								}
								continue;
							}
							if (local216 == 4013) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								if (local767 == 0) {
									Static103.anIntArray317[local27++] = 0;
								} else if (local772 == 0) {
									Static103.anIntArray317[local27++] = Integer.MAX_VALUE;
								} else {
									Static103.anIntArray317[local27++] = (int) Math.pow((double) local767, 1.0D / (double) local772);
								}
								continue;
							}
							if (local216 == 4014) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local772 & local767;
								continue;
							}
							if (local216 == 4015) {
								local27 -= 2;
								local767 = Static103.anIntArray317[local27];
								local772 = Static103.anIntArray317[local27 + 1];
								Static103.anIntArray317[local27++] = local767 | local772;
								continue;
							}
						} else if (local216 < 4200) {
							if (local216 == 4100) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local27--;
								local772 = Static103.anIntArray317[local27];
								Static55.aClass60Array7[local31++] = Static12.method1761(new Class60[] { local581, Static65.method1051(local772) });
								continue;
							}
							if (local216 == 4101) {
								local31 -= 2;
								local581 = Static55.aClass60Array7[local31];
								local1546 = Static55.aClass60Array7[local31 + 1];
								Static55.aClass60Array7[local31++] = Static12.method1761(new Class60[] { local581, local1546 });
								continue;
							}
							if (local216 == 4102) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local27--;
								local772 = Static103.anIntArray317[local27];
								Static55.aClass60Array7[local31++] = Static12.method1761(new Class60[] { local581, Static81.method1288(local772) });
								continue;
							}
							if (local216 == 4103) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static55.aClass60Array7[local31++] = local581.method1339();
								continue;
							}
							if (local216 == 4104) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								@Pc(4255) long local4255 = (long) local767 * 86400000L + 1014768000000L;
								Static84.aCalendar1.setTime(new Date(local4255));
								local627 = Static84.aCalendar1.get(5);
								local648 = Static84.aCalendar1.get(2);
								local1003 = Static84.aCalendar1.get(1);
								Static55.aClass60Array7[local31++] = Static12.method1761(new Class60[] { Static65.method1051(local627), Static94.aClass60_910, Static68.aClass60Array9[local648], Static94.aClass60_910, Static65.method1051(local1003) });
								continue;
							}
							if (local216 == 4105) {
								local31 -= 2;
								local581 = Static55.aClass60Array7[local31];
								local1546 = Static55.aClass60Array7[local31 + 1];
								if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1 != null && Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1.aBoolean57) {
									Static55.aClass60Array7[local31++] = local1546;
									continue;
								}
								Static55.aClass60Array7[local31++] = local581;
								continue;
							}
							if (local216 == 4106) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static55.aClass60Array7[local31++] = Static65.method1051(local767);
								continue;
							}
							if (local216 == 4107) {
								local31 -= 2;
								Static103.anIntArray317[local27++] = Static55.aClass60Array7[local31].method1340(Static55.aClass60Array7[local31 + 1]);
								continue;
							}
							@Pc(4408) byte[] local4408;
							@Pc(4413) Class4_Sub3_Sub6_Sub1_Sub1 local4413;
							if (local216 == 4108) {
								local27 -= 2;
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local772 = Static103.anIntArray317[local27];
								local966 = Static103.anIntArray317[local27 + 1];
								local4408 = Static128.aClass10_Sub1_21.method1774(local966, 0);
								local4413 = new Class4_Sub3_Sub6_Sub1_Sub1(local4408);
								Static103.anIntArray317[local27++] = local4413.method1215(local581, local772);
								continue;
							}
							if (local216 == 4109) {
								local27 -= 2;
								local966 = Static103.anIntArray317[local27 + 1];
								local772 = Static103.anIntArray317[local27];
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local4408 = Static128.aClass10_Sub1_21.method1774(local966, 0);
								local4413 = new Class4_Sub3_Sub6_Sub1_Sub1(local4408);
								Static103.anIntArray317[local27++] = local4413.method1220(local581, local772);
								continue;
							}
							if (local216 == 4110) {
								local31 -= 2;
								local1546 = Static55.aClass60Array7[local31 + 1];
								local581 = Static55.aClass60Array7[local31];
								local27--;
								if (Static103.anIntArray317[local27] == 1) {
									Static55.aClass60Array7[local31++] = local581;
								} else {
									Static55.aClass60Array7[local31++] = local1546;
								}
								continue;
							}
							if (local216 == 4111) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static55.aClass60Array7[local31++] = Static93.method1199(local581);
								continue;
							}
							if (local216 == 4112) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local27--;
								local772 = Static103.anIntArray317[local27];
								Static55.aClass60Array7[local31++] = local581.method1323(local772);
								continue;
							}
							if (local216 == 4113) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static43.method624(local767) ? 1 : 0;
								continue;
							}
							if (local216 == 4114) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static4.method52(local767) ? 1 : 0;
								continue;
							}
							if (local216 == 4115) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static121.method1914(local767) ? 1 : 0;
								continue;
							}
							if (local216 == 4116) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static82.method1300(local767) ? 1 : 0;
								continue;
							}
							if (local216 == 4117) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								if (local581 == null) {
									Static103.anIntArray317[local27++] = 0;
								} else {
									Static103.anIntArray317[local27++] = local581.method1345();
								}
								continue;
							}
							if (local216 == 4118) {
								local27 -= 2;
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local772 = Static103.anIntArray317[local27];
								local966 = Static103.anIntArray317[local27 + 1];
								Static55.aClass60Array7[local31++] = local581.method1333(local772, local966);
								continue;
							}
							if (local216 == 4119) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local1546 = Static108.method1796(local581.method1345());
								@Pc(4712) boolean local4712 = false;
								for (local627 = 0; local627 < local581.method1345(); local627++) {
									local648 = local581.method1338(local627);
									if (local648 == 60) {
										local4712 = true;
									} else if (local648 == 62) {
										local4712 = false;
									} else if (!local4712) {
										local1546.method1308(local648);
									}
								}
								local1546.method1335();
								Static55.aClass60Array7[local31++] = local1546;
								continue;
							}
							if (local216 == 4120) {
								local27--;
								local772 = Static103.anIntArray317[local27];
								local31--;
								local581 = Static55.aClass60Array7[local31];
								Static103.anIntArray317[local27++] = local581.method1310(local772);
								continue;
							}
						} else if (local216 < 4300) {
							if (local216 == 4200) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static55.aClass60Array7[local31++] = Static112.method1854(local767).aClass60_1128;
								continue;
							}
							@Pc(4823) Class4_Sub3_Sub16 local4823;
							if (local216 == 4201) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								local4823 = Static112.method1854(local767);
								if (local772 >= 1 && local772 <= 5 && local4823.aClass60Array21[local772 - 1] != null) {
									Static55.aClass60Array7[local31++] = local4823.aClass60Array21[local772 - 1];
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 4202) {
								local27 -= 2;
								local772 = Static103.anIntArray317[local27 + 1];
								local767 = Static103.anIntArray317[local27];
								local4823 = Static112.method1854(local767);
								if (local772 >= 1 && local772 <= 5 && local4823.aClass60Array22[local772 - 1] != null) {
									Static55.aClass60Array7[local31++] = local4823.aClass60Array22[local772 - 1];
									continue;
								}
								Static55.aClass60Array7[local31++] = Static24.aClass60_272;
								continue;
							}
							if (local216 == 4203) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static112.method1854(local767).anInt2868;
								continue;
							}
							if (local216 == 4204) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static112.method1854(local767).anInt2866 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4966) Class4_Sub3_Sub16 local4966;
							if (local216 == 4205) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local4966 = Static112.method1854(local767);
								if (local4966.anInt2863 == -1 && local4966.anInt2902 >= 0) {
									Static103.anIntArray317[local27++] = local4966.anInt2902;
									continue;
								}
								Static103.anIntArray317[local27++] = local767;
								continue;
							}
							if (local216 == 4206) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local4966 = Static112.method1854(local767);
								if (local4966.anInt2863 >= 0 && local4966.anInt2902 >= 0) {
									Static103.anIntArray317[local27++] = local4966.anInt2902;
									continue;
								}
								Static103.anIntArray317[local27++] = local767;
								continue;
							}
							if (local216 == 4207) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								Static103.anIntArray317[local27++] = Static112.method1854(local767).aBoolean125 ? 1 : 0;
								continue;
							}
						} else if (local216 < 5100) {
							if (local216 == 5000) {
								Static103.anIntArray317[local27++] = Static62.anInt1588;
								continue;
							}
							if (local216 == 5001) {
								local27 -= 3;
								Static62.anInt1588 = Static103.anIntArray317[local27];
								Static43.anInt1110 = Static103.anIntArray317[local27 + 1];
								Static6.anInt73 = Static103.anIntArray317[local27 + 2];
								Static14.aClass4_Sub9_Sub1_1.method826(153);
								Static14.aClass4_Sub9_Sub1_1.method819(Static62.anInt1588);
								Static14.aClass4_Sub9_Sub1_1.method819(Static43.anInt1110);
								Static14.aClass4_Sub9_Sub1_1.method819(Static6.anInt73);
								continue;
							}
							if (local216 == 5002) {
								local27 -= 2;
								local31--;
								local581 = Static55.aClass60Array7[local31];
								local772 = Static103.anIntArray317[local27];
								local966 = Static103.anIntArray317[local27 + 1];
								Static14.aClass4_Sub9_Sub1_1.method826(136);
								Static14.aClass4_Sub9_Sub1_1.method805(local581.method1325());
								Static14.aClass4_Sub9_Sub1_1.method819(local772 - 1);
								Static14.aClass4_Sub9_Sub1_1.method819(local966);
								continue;
							}
							if (local216 == 5003) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local1546 = null;
								if (local767 < 100) {
									local1546 = Static62.aClass60Array8[local767];
								}
								if (local1546 == null) {
									local1546 = Static24.aClass60_272;
								}
								Static55.aClass60Array7[local31++] = local1546;
								continue;
							}
							if (local216 == 5004) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local772 = -1;
								if (local767 < 100 && Static62.aClass60Array8[local767] != null) {
									local772 = Static133.anIntArray347[local767];
								}
								Static103.anIntArray317[local27++] = local772;
								continue;
							}
							if (local216 == 5005) {
								Static103.anIntArray317[local27++] = Static43.anInt1110;
								continue;
							}
							if (local216 == 5008) {
								local31--;
								local581 = Static55.aClass60Array7[local31];
								if (local581.method1321(Static81.aClass60_800)) {
									Static52.method864(local581);
								} else {
									local1546 = local581.method1339();
									@Pc(5260) byte local5260 = 0;
									if (local1546.method1321(Static124.aClass60_1104)) {
										local5260 = 0;
										local581 = local581.method1315(Static124.aClass60_1104.method1345());
									} else if (local1546.method1321(Static72.aClass60_760)) {
										local5260 = 1;
										local581 = local581.method1315(Static72.aClass60_760.method1345());
									} else if (local1546.method1321(Static42.aClass60_407)) {
										local581 = local581.method1315(Static42.aClass60_407.method1345());
										local5260 = 2;
									} else if (local1546.method1321(Static61.aClass60_570)) {
										local581 = local581.method1315(Static61.aClass60_570.method1345());
										local5260 = 3;
									} else if (local1546.method1321(Static98.aClass60_930)) {
										local5260 = 4;
										local581 = local581.method1315(Static98.aClass60_930.method1345());
									} else if (local1546.method1321(Static16.aClass60_177)) {
										local5260 = 5;
										local581 = local581.method1315(Static16.aClass60_177.method1345());
									} else if (local1546.method1321(Static90.aClass60_872)) {
										local5260 = 6;
										local581 = local581.method1315(Static90.aClass60_872.method1345());
									} else if (local1546.method1321(Static54.aClass60_527)) {
										local581 = local581.method1315(Static54.aClass60_527.method1345());
										local5260 = 7;
									} else if (local1546.method1321(Static6.aClass60_46)) {
										local581 = local581.method1315(Static6.aClass60_46.method1345());
										local5260 = 8;
									} else if (local1546.method1321(Static48.aClass60_450)) {
										local581 = local581.method1315(Static48.aClass60_450.method1345());
										local5260 = 9;
									} else if (local1546.method1321(Static26.aClass60_284)) {
										local5260 = 10;
										local581 = local581.method1315(Static26.aClass60_284.method1345());
									} else if (local1546.method1321(Static6.aClass60_43)) {
										local581 = local581.method1315(Static6.aClass60_43.method1345());
										local5260 = 11;
									} else if (Static11.anInt428 != 0) {
										if (local1546.method1321(Static124.aClass60_1106)) {
											local5260 = 0;
											local581 = local581.method1315(Static124.aClass60_1106.method1345());
										} else if (local1546.method1321(Static72.aClass60_758)) {
											local5260 = 1;
											local581 = local581.method1315(Static72.aClass60_758.method1345());
										} else if (local1546.method1321(Static42.aClass60_410)) {
											local581 = local581.method1315(Static42.aClass60_410.method1345());
											local5260 = 2;
										} else if (local1546.method1321(Static61.aClass60_572)) {
											local5260 = 3;
											local581 = local581.method1315(Static61.aClass60_572.method1345());
										} else if (local1546.method1321(Static98.aClass60_926)) {
											local581 = local581.method1315(Static98.aClass60_926.method1345());
											local5260 = 4;
										} else if (local1546.method1321(Static16.aClass60_183)) {
											local581 = local581.method1315(Static16.aClass60_183.method1345());
											local5260 = 5;
										} else if (local1546.method1321(Static90.aClass60_875)) {
											local581 = local581.method1315(Static90.aClass60_875.method1345());
											local5260 = 6;
										} else if (local1546.method1321(Static54.aClass60_531)) {
											local581 = local581.method1315(Static54.aClass60_531.method1345());
											local5260 = 7;
										} else if (local1546.method1321(Static6.aClass60_48)) {
											local5260 = 8;
											local581 = local581.method1315(Static6.aClass60_48.method1345());
										} else if (local1546.method1321(Static48.aClass60_453)) {
											local581 = local581.method1315(Static48.aClass60_453.method1345());
											local5260 = 9;
										} else if (local1546.method1321(Static26.aClass60_286)) {
											local581 = local581.method1315(Static26.aClass60_286.method1345());
											local5260 = 10;
										} else if (local1546.method1321(Static6.aClass60_42)) {
											local5260 = 11;
											local581 = local581.method1315(Static6.aClass60_42.method1345());
										}
									}
									local1546 = local581.method1339();
									@Pc(5674) byte local5674 = 0;
									if (local1546.method1321(Static24.aClass60_274)) {
										local581 = local581.method1315(Static24.aClass60_274.method1345());
										local5674 = 1;
									} else if (local1546.method1321(Static67.aClass60_650)) {
										local5674 = 2;
										local581 = local581.method1315(Static67.aClass60_650.method1345());
									} else if (local1546.method1321(Static62.aClass60_584)) {
										local5674 = 3;
										local581 = local581.method1315(Static62.aClass60_584.method1345());
									} else if (local1546.method1321(Static9.aClass60_69)) {
										local581 = local581.method1315(Static9.aClass60_69.method1345());
										local5674 = 4;
									} else if (local1546.method1321(aClass60_834)) {
										local5674 = 5;
										local581 = local581.method1315(aClass60_834.method1345());
									} else if (Static11.anInt428 != 0) {
										if (local1546.method1321(Static24.aClass60_265)) {
											local581 = local581.method1315(Static24.aClass60_265.method1345());
											local5674 = 1;
										} else if (local1546.method1321(Static67.aClass60_652)) {
											local581 = local581.method1315(Static67.aClass60_652.method1345());
											local5674 = 2;
										} else if (local1546.method1321(Static62.aClass60_585)) {
											local581 = local581.method1315(Static62.aClass60_585.method1345());
											local5674 = 3;
										} else if (local1546.method1321(Static9.aClass60_67)) {
											local5674 = 4;
											local581 = local581.method1315(Static9.aClass60_67.method1345());
										} else if (local1546.method1321(aClass60_832)) {
											local5674 = 5;
											local581 = local581.method1315(aClass60_832.method1345());
										}
									}
									Static14.aClass4_Sub9_Sub1_1.method826(179);
									Static14.aClass4_Sub9_Sub1_1.method819(0);
									local648 = Static14.aClass4_Sub9_Sub1_1.anInt1312;
									Static14.aClass4_Sub9_Sub1_1.method819(local5260);
									Static14.aClass4_Sub9_Sub1_1.method819(local5674);
									Static128.method1948(Static14.aClass4_Sub9_Sub1_1, local581);
									Static14.aClass4_Sub9_Sub1_1.method817(Static14.aClass4_Sub9_Sub1_1.anInt1312 - local648);
								}
								continue;
							}
							if (local216 == 5009) {
								local31 -= 2;
								local1546 = Static55.aClass60Array7[local31 + 1];
								local581 = Static55.aClass60Array7[local31];
								Static14.aClass4_Sub9_Sub1_1.method826(197);
								Static14.aClass4_Sub9_Sub1_1.method819(0);
								local966 = Static14.aClass4_Sub9_Sub1_1.anInt1312;
								Static14.aClass4_Sub9_Sub1_1.method805(local581.method1325());
								Static128.method1948(Static14.aClass4_Sub9_Sub1_1, local1546);
								Static14.aClass4_Sub9_Sub1_1.method817(Static14.aClass4_Sub9_Sub1_1.anInt1312 - local966);
								continue;
							}
							if (local216 == 5010) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local1546 = null;
								if (local767 < 100) {
									local1546 = Static35.aClass60Array5[local767];
								}
								if (local1546 == null) {
									local1546 = Static24.aClass60_272;
								}
								Static55.aClass60Array7[local31++] = local1546;
								continue;
							}
							if (local216 == 5011) {
								local27--;
								local767 = Static103.anIntArray317[local27];
								local1546 = null;
								if (local767 < 100) {
									local1546 = Static77.aClass60Array12[local767];
								}
								if (local1546 == null) {
									local1546 = Static24.aClass60_272;
								}
								Static55.aClass60Array7[local31++] = local1546;
								continue;
							}
							if (local216 == 5015) {
								if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1 == null || Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass60_139 == null) {
									local581 = Static68.aClass60_670;
								} else {
									local581 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass60_139;
								}
								Static55.aClass60Array7[local31++] = local581;
								continue;
							}
							if (local216 == 5016) {
								Static103.anIntArray317[local27++] = Static6.anInt73;
								continue;
							}
							if (local216 == 5017) {
								Static103.anIntArray317[local27++] = Static116.anInt2704;
								continue;
							}
						}
					} else {
						if (local216 < 2000) {
							local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
						} else {
							local27--;
							local1097 = Static61.method991(Static103.anIntArray317[local27]);
							local216 -= 1000;
						}
						if (local216 == 1300) {
							local27--;
							local772 = Static103.anIntArray317[local27] - 1;
							if (local772 >= 0 && local772 <= 9) {
								local31--;
								local1097.method1695(local772, Static55.aClass60Array7[local31]);
								continue;
							}
							local31--;
							continue;
						}
						if (local216 == 1301) {
							local27 -= 2;
							local772 = Static103.anIntArray317[local27];
							local966 = Static103.anIntArray317[local27 + 1];
							local1097.aClass4_Sub14_13 = Static53.method867(local772, local966);
							continue;
						}
						if (local216 == 1302) {
							local27--;
							local1097.aBoolean98 = Static103.anIntArray317[local27] == 1;
							continue;
						}
						if (local216 == 1303) {
							local27--;
							local1097.anInt2417 = Static103.anIntArray317[local27];
							continue;
						}
						if (local216 == 1304) {
							local27--;
							local1097.anInt2415 = Static103.anIntArray317[local27];
							continue;
						}
						if (local216 == 1305) {
							local31--;
							local1097.aClass60_953 = Static55.aClass60Array7[local31];
							continue;
						}
						if (local216 == 1306) {
							local31--;
							local1097.aClass60_959 = Static55.aClass60Array7[local31];
							continue;
						}
						if (local216 == 1307) {
							local1097.aClass60Array18 = null;
							continue;
						}
					}
				} else {
					if (local216 < 2000) {
						local1097 = local937 ? Static36.aClass4_Sub14_8 : Static1.aClass4_Sub14_1;
					} else {
						local27--;
						local1097 = Static61.method991(Static103.anIntArray317[local27]);
						local216 -= 1000;
					}
					if (local216 == 1000) {
						local27 -= 2;
						local1097.anInt2406 = Static103.anIntArray317[local27];
						local1097.anInt2375 = Static103.anIntArray317[local27 + 1];
						Static36.method558(local1097);
						continue;
					}
					if (local216 == 1001) {
						local27 -= 2;
						local1097.anInt2392 = Static103.anIntArray317[local27];
						local1097.anInt2440 = Static103.anIntArray317[local27 + 1];
						Static36.method558(local1097);
						continue;
					}
					if (local216 == 1003) {
						local27--;
						@Pc(7013) boolean local7013 = Static103.anIntArray317[local27] == 1;
						if (local7013 != local1097.aBoolean91) {
							local1097.aBoolean91 = local7013;
							Static36.method558(local1097);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7030) Exception local7030) {
			if (local20.aClass60_810 == null) {
				if (Static116.anInt2705 != 0) {
					Static90.method1469(0, Static24.aClass60_272, Static54.aClass60_521);
				}
				Static117.method1885("CS2 - scr:" + local20.aLong100 + " op:" + local29, local7030);
			} else {
				@Pc(7063) Class60 local7063 = Static108.method1796(30);
				local7063.method1332(Static21.aClass60_232).method1332(local20.aClass60_810);
				for (local58 = Static91.anInt2135 - 1; local58 >= 0; local58--) {
					local7063.method1332(Static71.aClass60_749).method1332(Static81.aClass2Array1[local58].aClass4_Sub3_Sub11_1.aClass60_810);
				}
				if (local29 == 40) {
					local96 = local36[local33];
					local7063.method1332(Static11.aClass60_138).method1332(Static65.method1051(local96));
				}
				if (Static116.anInt2705 != 0) {
					Static90.method1469(0, Static24.aClass60_272, Static12.method1761(new Class60[] { Static9.aClass60_68, local20.aClass60_810 }));
				}
				Static117.method1885("CS2 - scr:" + local20.aLong100 + " op:" + local29 + new String(local7063.method1320()), local7030);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
	public static int method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 - arg2;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method1355() {
		if (!Static12.aBoolean107) {
			Static82.anIntArray226[0] = 1005;
			Static48.anInt1184 = 1;
			Static80.aClass60Array14[0] = Static119.aClass60_1072;
			Static128.aClass60Array20[0] = Static23.aClass60_253;
		}
		if (Static52.anInt1452 != -1) {
			Static96.method1566(Static52.anInt1452);
		}
		for (@Pc(38) int local38 = 0; local38 < Static132.anInt2950; local38++) {
			if (Static105.aBooleanArray15[local38]) {
				Static108.aBooleanArray17[local38] = true;
			}
			Static61.aBooleanArray10[local38] = Static105.aBooleanArray15[local38];
			Static105.aBooleanArray15[local38] = false;
		}
		Static21.anInt767 = -1;
		Static85.anInt2011 = -1;
		Static72.aClass4_Sub14_11 = null;
		Static133.anInt2971 = Static118.anInt2741;
		if (Static52.anInt1452 != -1) {
			Static132.anInt2950 = 0;
			Static117.method1889(0, Static52.anInt1452, 0, 503, -1, 0, 765, 0);
		}
		Static34.method1662();
		Static46.method641();
		if (Static12.aBoolean107) {
			Static4.method46();
		} else if (Static21.anInt767 != -1) {
			Static7.method66(Static85.anInt2011, Static21.anInt767);
		}
		if (Static111.anInt2633 == 3) {
			for (@Pc(107) int local107 = 0; local107 < Static132.anInt2950; local107++) {
				if (Static61.aBooleanArray10[local107]) {
					Static34.method1658(Static102.anIntArray309[local107], Static78.anIntArray219[local107], Static107.anIntArray324[local107], Static68.anIntArray193[local107], 16711935, 128);
				} else if (Static108.aBooleanArray17[local107]) {
					Static34.method1658(Static102.anIntArray309[local107], Static78.anIntArray219[local107], Static107.anIntArray324[local107], Static68.anIntArray193[local107], 16711680, 128);
				}
			}
		}
		Static127.method638(Static77.anInt1866, Static116.anInt2713, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440);
		Static116.anInt2713 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!sa;IB)V")
	public static void method1358(@OriginalArg(0) Class4_Sub14[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class4_Sub14 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt2389 == 0) {
					if (local13.aClass4_Sub14Array3 != null) {
						method1358(local13.aClass4_Sub14Array3, arg1);
					}
					@Pc(34) Class4_Sub18 local34 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local13.anInt2388);
					if (local34 != null) {
						Static113.method818(arg1, local34.anInt2589);
					}
				}
				@Pc(53) Class4_Sub21 local53;
				if (arg1 == 0 && local13.anObjectArray18 != null) {
					local53 = new Class4_Sub21();
					local53.anObjectArray28 = local13.anObjectArray18;
					local53.aClass4_Sub14_14 = local13;
					method1353(local53);
				}
				if (arg1 == 1 && local13.anObjectArray26 != null) {
					if (local13.anInt2403 >= 0) {
						@Pc(82) Class4_Sub14 local82 = Static61.method991(local13.anInt2388);
						if (local82 == null || local82.aClass4_Sub14Array3 == null || local82.aClass4_Sub14Array3.length <= local13.anInt2403 || local13 != local82.aClass4_Sub14Array3[local13.anInt2403]) {
							continue;
						}
					}
					local53 = new Class4_Sub21();
					local53.aClass4_Sub14_14 = local13;
					local53.anObjectArray28 = local13.anObjectArray26;
					method1353(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method1359() {
		aClass60_828 = null;
		aClass60_833 = null;
		aClass60_831 = null;
		aClass60_834 = null;
		aClass60_830 = null;
		aBigInteger3 = null;
		aClass60_832 = null;
		aClass60_827 = null;
		aClass60_829 = null;
		aClass10_Sub1_15 = null;
		aClass4_Sub3_Sub6_Sub3_3 = null;
	}
}
