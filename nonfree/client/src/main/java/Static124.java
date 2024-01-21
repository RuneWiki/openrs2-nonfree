import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!ga;")
	public static Class30 aClass30_48;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1201 = Static169.method2903("Loading interfaces )2 ");

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1200 = aClass23_1201;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1202 = Static169.method2903("AUS");

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	public static void method2201() {
		if (Static26.aClass44_3 != null) {
			Static26.aClass44_3.method1417();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!mf;I)V")
	public static void method2202(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray3;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub1_Sub17 local18 = Static114.method2032(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		Static139.anInt3552 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray596;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray595;
		@Pc(58) int local58;
		@Pc(96) int local96;
		try {
			Static96.aClass23Array10 = new Class23[local18.anInt4265];
			Static36.anIntArray123 = new int[local18.anInt4271];
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			for (local58 = 1; local58 < local8.length; local58++) {
				if (local8[local58] instanceof Integer) {
					local96 = (Integer) local8[local58];
					if (local96 == -2147483647) {
						local96 = arg1.anInt2666;
					}
					if (local96 == -2147483646) {
						local96 = arg1.anInt2663;
					}
					if (local96 == -2147483645) {
						local96 = arg1.aClass60_6 == null ? -1 : arg1.aClass60_6.anInt3019;
					}
					if (local96 == -2147483644) {
						local96 = arg1.anInt2664;
					}
					if (local96 == -2147483643) {
						local96 = arg1.aClass60_6 == null ? -1 : arg1.aClass60_6.anInt3016;
					}
					if (local96 == -2147483642) {
						local96 = arg1.aClass60_7 == null ? -1 : arg1.aClass60_7.anInt3019;
					}
					if (local96 == -2147483641) {
						local96 = arg1.aClass60_7 == null ? -1 : arg1.aClass60_7.anInt3016;
					}
					if (local96 == -2147483640) {
						local96 = arg1.anInt2665;
					}
					if (local96 == -2147483639) {
						local96 = arg1.anInt2659;
					}
					Static36.anIntArray123[local54++] = local96;
				} else if (local8[local58] instanceof Class23) {
					@Pc(75) Class23 local75 = (Class23) local8[local58];
					if (local75.method651(Static138.aClass23_1320)) {
						local75 = arg1.aClass23_1021;
					}
					Static96.aClass23Array10[local56++] = local75;
				}
			}
			local96 = 0;
			label2183: while (true) {
				local96++;
				if (local96 > arg0) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(218) int local218 = local32[local29];
				@Pc(653) int local653;
				@Pc(777) int local777;
				@Pc(632) int local632;
				@Pc(783) int local783;
				@Pc(586) Class23 local586;
				if (local218 < 100) {
					if (local218 == 0) {
						Static116.anIntArray399[local23++] = local37[local29];
						continue;
					}
					@Pc(241) int local241;
					if (local218 == 1) {
						local241 = local37[local29];
						Static116.anIntArray399[local23++] = Static27.anIntArray108[local241];
						continue;
					}
					if (local218 == 2) {
						local241 = local37[local29];
						local23--;
						Static27.anIntArray108[local241] = Static116.anIntArray399[local23];
						continue;
					}
					if (local218 == 3) {
						Static39.aClass23Array2[local27++] = local18.aClass23Array24[local29];
						continue;
					}
					if (local218 == 6) {
						local29 += local37[local29];
						continue;
					}
					if (local218 == 7) {
						local23 -= 2;
						if (Static116.anIntArray399[local23 + 1] != Static116.anIntArray399[local23]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 8) {
						local23 -= 2;
						if (Static116.anIntArray399[local23 + 1] == Static116.anIntArray399[local23]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 9) {
						local23 -= 2;
						if (Static116.anIntArray399[local23] < Static116.anIntArray399[local23 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 10) {
						local23 -= 2;
						if (Static116.anIntArray399[local23] > Static116.anIntArray399[local23 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static139.anInt3552 == 0) {
							return;
						}
						@Pc(403) Class32 local403 = Static39.aClass32Array1[--Static139.anInt3552];
						local18 = local403.aClass1_Sub1_Sub17_1;
						local29 = local403.anInt1553;
						Static36.anIntArray123 = local403.anIntArray176;
						Static96.aClass23Array10 = local403.aClass23Array7;
						local37 = local18.anIntArray595;
						local32 = local18.anIntArray596;
						continue;
					}
					if (local218 == 25) {
						local241 = local37[local29];
						Static116.anIntArray399[local23++] = Static108.method1225(local241);
						continue;
					}
					if (local218 == 27) {
						local241 = local37[local29];
						local23--;
						Static164.method2828(Static116.anIntArray399[local23], local241);
						continue;
					}
					if (local218 == 31) {
						local23 -= 2;
						if (Static116.anIntArray399[local23 + 1] >= Static116.anIntArray399[local23]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 32) {
						local23 -= 2;
						if (Static116.anIntArray399[local23 + 1] <= Static116.anIntArray399[local23]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 33) {
						Static116.anIntArray399[local23++] = Static36.anIntArray123[local37[local29]];
						continue;
					}
					@Pc(530) int local530;
					if (local218 == 34) {
						local530 = local37[local29];
						local23--;
						Static36.anIntArray123[local530] = Static116.anIntArray399[local23];
						continue;
					}
					if (local218 == 35) {
						Static39.aClass23Array2[local27++] = Static96.aClass23Array10[local37[local29]];
						continue;
					}
					if (local218 == 36) {
						local530 = local37[local29];
						local27--;
						Static96.aClass23Array10[local530] = Static39.aClass23Array2[local27];
						continue;
					}
					if (local218 == 37) {
						local241 = local37[local29];
						local27 -= local241;
						local586 = Static72.method1310(Static39.aClass23Array2, local27, local241);
						Static39.aClass23Array2[local27++] = local586;
						continue;
					}
					if (local218 == 38) {
						local23--;
						continue;
					}
					if (local218 == 39) {
						local27--;
						continue;
					}
					if (local218 == 40) {
						local241 = local37[local29];
						@Pc(622) Class1_Sub1_Sub17 local622 = Static114.method2032(local241);
						@Pc(626) int[] local626 = new int[local622.anInt4271];
						@Pc(630) Class23[] local630 = new Class23[local622.anInt4265];
						for (local632 = 0; local632 < local622.anInt4267; local632++) {
							local626[local632] = Static116.anIntArray399[local23 + local632 - local622.anInt4267];
						}
						for (local653 = 0; local653 < local622.anInt4269; local653++) {
							local630[local653] = Static39.aClass23Array2[local27 + local653 - local622.anInt4269];
						}
						local23 -= local622.anInt4267;
						local27 -= local622.anInt4269;
						@Pc(691) Class32 local691 = new Class32();
						local691.aClass1_Sub1_Sub17_1 = local18;
						local691.anIntArray176 = Static36.anIntArray123;
						local691.anInt1553 = local29;
						local691.aClass23Array7 = Static96.aClass23Array10;
						if (Static39.aClass32Array1.length <= Static139.anInt3552) {
							throw new RuntimeException();
						}
						Static39.aClass32Array1[Static139.anInt3552++] = local691;
						Static36.anIntArray123 = local626;
						local18 = local622;
						Static96.aClass23Array10 = local630;
						local29 = -1;
						local32 = local622.anIntArray596;
						local37 = local622.anIntArray595;
						continue;
					}
					if (local218 == 42) {
						Static116.anIntArray399[local23++] = Static46.anIntArray606[local37[local29]];
						continue;
					}
					if (local218 == 43) {
						local530 = local37[local29];
						local23--;
						Static46.anIntArray606[local530] = Static116.anIntArray399[local23];
						continue;
					}
					if (local218 == 44) {
						local241 = local37[local29] >> 16;
						local23--;
						local777 = Static116.anIntArray399[local23];
						local783 = local37[local29] & 0xFFFF;
						if (local777 >= 0 && local777 <= 5000) {
							Static24.anIntArray100[local241] = local777;
							@Pc(803) byte local803 = -1;
							if (local783 == 105) {
								local803 = 0;
							}
							local632 = 0;
							while (true) {
								if (local777 <= local632) {
									continue label2183;
								}
								Static14.anIntArrayArray5[local241][local632] = local803;
								local632++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local241 = local37[local29];
						local23--;
						local783 = Static116.anIntArray399[local23];
						if (local783 >= 0 && Static24.anIntArray100[local241] > local783) {
							Static116.anIntArray399[local23++] = Static14.anIntArrayArray5[local241][local783];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local23 -= 2;
						local241 = local37[local29];
						local783 = Static116.anIntArray399[local23];
						if (local783 >= 0 && local783 < Static24.anIntArray100[local241]) {
							Static14.anIntArrayArray5[local241][local783] = Static116.anIntArray399[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						@Pc(917) Class23 local917 = Static73.aClass23Array8[local37[local29]];
						if (local917 == null) {
							local917 = Static10.aClass23_135;
						}
						Static39.aClass23Array2[local27++] = local917;
						continue;
					}
					if (local218 == 48) {
						local530 = local37[local29];
						local27--;
						Static73.aClass23Array8[local530] = Static39.aClass23Array2[local27];
						continue;
					}
				}
				@Pc(951) boolean local951;
				if (local37[local29] == 1) {
					local951 = true;
				} else {
					local951 = false;
				}
				@Pc(984) Class60 local984;
				@Pc(2315) Class60 local2315;
				@Pc(2288) Class60 local2288;
				@Pc(4642) int local4642;
				@Pc(1657) int local1657;
				if (local218 < 1000) {
					if (local218 == 100) {
						local23 -= 3;
						local783 = Static116.anIntArray399[local23];
						local1657 = Static116.anIntArray399[local23 + 2];
						local777 = Static116.anIntArray399[local23 + 1];
						if (local777 == 0) {
							throw new RuntimeException();
						}
						local2288 = Static111.method1964(local783);
						if (local2288.aClass60Array1 == null) {
							local2288.aClass60Array1 = new Class60[local1657 + 1];
						}
						if (local2288.aClass60Array1.length <= local1657) {
							@Pc(7684) Class60[] local7684 = new Class60[local1657 + 1];
							for (local4642 = 0; local4642 < local2288.aClass60Array1.length; local4642++) {
								local7684[local4642] = local2288.aClass60Array1[local4642];
							}
							local2288.aClass60Array1 = local7684;
						}
						if (local1657 > 0 && local2288.aClass60Array1[local1657 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1657 - 1));
						}
						@Pc(7734) Class60 local7734 = new Class60();
						local7734.anInt2971 = local7734.anInt3019 = local2288.anInt3019;
						local7734.aBoolean155 = true;
						local7734.anInt3016 = local1657;
						local7734.anInt3032 = local777;
						local2288.aClass60Array1[local1657] = local7734;
						if (local951) {
							Static33.aClass60_1 = local7734;
						} else {
							Static109.aClass60_9 = local7734;
						}
						Static39.method659(local2288);
						continue;
					}
					@Pc(7801) Class60 local7801;
					if (local218 == 101) {
						local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
						if (local984.anInt3016 == -1) {
							if (!local951) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7801 = Static111.method1964(local984.anInt3019);
						local7801.aClass60Array1[local984.anInt3016] = null;
						Static39.method659(local7801);
						continue;
					}
					if (local218 == 102) {
						local23--;
						local984 = Static111.method1964(Static116.anIntArray399[local23]);
						local984.aClass60Array1 = null;
						Static39.method659(local984);
						continue;
					}
					if (local218 == 200) {
						local23 -= 2;
						local783 = Static116.anIntArray399[local23];
						local777 = Static116.anIntArray399[local23 + 1];
						local2315 = Static120.method2104(local783, local777);
						if (local2315 != null && local777 != -1) {
							Static116.anIntArray399[local23++] = 1;
							if (local951) {
								Static33.aClass60_1 = local2315;
							} else {
								Static109.aClass60_9 = local2315;
							}
							continue;
						}
						Static116.anIntArray399[local23++] = 0;
						continue;
					}
					if (local218 == 201) {
						local23--;
						local783 = Static116.anIntArray399[local23];
						local7801 = Static111.method1964(local783);
						if (local7801 == null) {
							Static116.anIntArray399[local23++] = 0;
						} else {
							Static116.anIntArray399[local23++] = 1;
							if (local951) {
								Static33.aClass60_1 = local7801;
							} else {
								Static109.aClass60_9 = local7801;
							}
						}
						continue;
					}
				} else if (local218 >= 1000 && local218 < 1100 || local218 >= 2000 && local218 < 2100) {
					if (local218 >= 2000) {
						local23--;
						local984 = Static111.method1964(Static116.anIntArray399[local23]);
						local218 -= 1000;
					} else {
						local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
					}
					if (local218 == 1000) {
						local23 -= 2;
						local984.anInt2999 = Static116.anIntArray399[local23];
						local984.anInt2985 = Static116.anIntArray399[local23 + 1];
						Static39.method659(local984);
						continue;
					}
					if (local218 == 1001) {
						local23 -= 2;
						local984.anInt3014 = Static116.anIntArray399[local23];
						local984.anInt3017 = Static116.anIntArray399[local23 + 1];
						Static39.method659(local984);
						continue;
					}
					if (local218 == 1003) {
						local23--;
						@Pc(1054) boolean local1054 = Static116.anIntArray399[local23] == 1;
						if (local984.aBoolean153 != local1054) {
							local984.aBoolean153 = local1054;
							Static39.method659(local984);
						}
						continue;
					}
				} else {
					@Pc(1431) Class23 local1431;
					if (local218 >= 1100 && local218 < 1200 || !(local218 < 2100 || local218 >= 2200)) {
						if (local218 < 2000) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
						} else {
							local218 -= 1000;
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
						}
						if (local218 == 1100) {
							local23 -= 2;
							local984.anInt2968 = Static116.anIntArray399[local23];
							if (local984.anInt3018 - local984.anInt3014 < local984.anInt2968) {
								local984.anInt2968 = local984.anInt3018 - local984.anInt3014;
							}
							if (local984.anInt2968 < 0) {
								local984.anInt2968 = 0;
							}
							local984.anInt3029 = Static116.anIntArray399[local23 + 1];
							if (local984.anInt3029 > local984.anInt2977 - local984.anInt3017) {
								local984.anInt3029 = local984.anInt2977 - local984.anInt3017;
							}
							if (local984.anInt3029 < 0) {
								local984.anInt3029 = 0;
							}
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1101) {
							local23--;
							local984.anInt3013 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1102) {
							local23--;
							local984.aBoolean149 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1103) {
							local23--;
							local984.anInt2998 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1104) {
							local23--;
							local984.anInt3027 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1105) {
							local23--;
							local984.anInt2992 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1106) {
							local23--;
							local984.anInt3031 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1107) {
							local23--;
							local984.aBoolean145 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1108) {
							local984.anInt3000 = 1;
							local23--;
							local984.anInt2982 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1109) {
							local23 -= 6;
							local984.anInt2988 = Static116.anIntArray399[local23];
							local984.anInt3035 = Static116.anIntArray399[local23 + 1];
							local984.anInt2979 = Static116.anIntArray399[local23 + 2];
							local984.anInt2978 = Static116.anIntArray399[local23 + 3];
							local984.anInt2983 = Static116.anIntArray399[local23 + 4];
							local984.anInt3030 = Static116.anIntArray399[local23 + 5];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1110) {
							local23--;
							local777 = Static116.anIntArray399[local23];
							if (local777 != local984.anInt2975) {
								local984.anInt2976 = 0;
								local984.anInt2975 = local777;
								local984.anInt3026 = 0;
								Static39.method659(local984);
							}
							continue;
						}
						if (local218 == 1111) {
							local23--;
							local984.aBoolean146 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1112) {
							local27--;
							local1431 = Static39.aClass23Array2[local27];
							if (!local1431.method651(local984.aClass23_1142)) {
								local984.aClass23_1142 = local1431;
								Static39.method659(local984);
							}
							continue;
						}
						if (local218 == 1113) {
							local23--;
							local984.anInt3028 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1114) {
							local23 -= 3;
							local984.anInt2993 = Static116.anIntArray399[local23];
							local984.anInt2984 = Static116.anIntArray399[local23 + 1];
							local984.anInt3024 = Static116.anIntArray399[local23 + 2];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1115) {
							local23--;
							local984.aBoolean148 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1116) {
							local23--;
							local984.anInt3004 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1117) {
							local23--;
							local984.anInt3038 = Static116.anIntArray399[local23];
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1118) {
							local23--;
							local984.aBoolean154 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1119) {
							local23--;
							local984.aBoolean147 = Static116.anIntArray399[local23] == 1;
							Static39.method659(local984);
							continue;
						}
						if (local218 == 1120) {
							local23 -= 2;
							local984.anInt3018 = Static116.anIntArray399[local23];
							local984.anInt2977 = Static116.anIntArray399[local23 + 1];
							Static39.method659(local984);
							continue;
						}
					} else if (local218 >= 1200 && local218 < 1300 || local218 >= 2200 && local218 < 2300) {
						if (local218 < 2000) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
						} else {
							local218 -= 1000;
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
						}
						Static39.method659(local984);
						if (local218 == 1200) {
							local23 -= 2;
							local777 = Static116.anIntArray399[local23];
							local1657 = Static116.anIntArray399[local23 + 1];
							local984.anInt3021 = local777;
							local984.anInt2972 = local1657;
							@Pc(1669) Class1_Sub1_Sub7 local1669 = Static2.method118(local777);
							local984.anInt2978 = local1669.anInt1163;
							local984.anInt3030 = local1669.anInt1154;
							local984.anInt2983 = local1669.anInt1158;
							local984.anInt2988 = local1669.anInt1141;
							local984.anInt3035 = local1669.anInt1131;
							local984.anInt2979 = local1669.anInt1169;
							if (local984.anInt3014 > 0) {
								local984.anInt3030 = local984.anInt3030 * 32 / local984.anInt3014;
							}
							continue;
						}
						if (local218 == 1201) {
							local984.anInt3000 = 2;
							local23--;
							local984.anInt2982 = Static116.anIntArray399[local23];
							continue;
						}
						if (local218 == 1202) {
							local984.anInt3000 = 3;
							local984.anInt2982 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5.method1184();
							continue;
						}
						if (local218 == 1203) {
							local984.anInt3000 = 6;
							local23--;
							local984.anInt2982 = Static116.anIntArray399[local23];
							continue;
						}
						if (local218 == 1204) {
							local984.anInt3000 = 5;
							local23--;
							local984.anInt2982 = Static116.anIntArray399[local23];
							continue;
						}
					} else if (local218 >= 1300 && local218 < 1400 || local218 >= 2300 && local218 < 2400) {
						if (local218 >= 2000) {
							local218 -= 1000;
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
						} else {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
						}
						if (local218 == 1300) {
							local23--;
							local777 = Static116.anIntArray399[local23] - 1;
							if (local777 >= 0 && local777 <= 9) {
								local27--;
								local984.method2055(Static39.aClass23Array2[local27], local777);
								continue;
							}
							local27--;
							continue;
						}
						if (local218 == 1301) {
							local23 -= 2;
							local777 = Static116.anIntArray399[local23];
							local1657 = Static116.anIntArray399[local23 + 1];
							local984.aClass60_11 = Static120.method2104(local777, local1657);
							continue;
						}
						if (local218 == 1302) {
							local23--;
							local984.aBoolean156 = Static116.anIntArray399[local23] == 1;
							continue;
						}
						if (local218 == 1303) {
							local23--;
							local984.anInt2989 = Static116.anIntArray399[local23];
							continue;
						}
						if (local218 == 1304) {
							local23--;
							local984.anInt3037 = Static116.anIntArray399[local23];
							continue;
						}
						if (local218 == 1305) {
							local27--;
							local984.aClass23_1140 = Static39.aClass23Array2[local27];
							continue;
						}
						if (local218 == 1306) {
							local27--;
							local984.aClass23_1141 = Static39.aClass23Array2[local27];
							continue;
						}
						if (local218 == 1307) {
							local984.aClass23Array17 = null;
							continue;
						}
					} else {
						if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
							if (local218 >= 2000) {
								local218 -= 1000;
								local23--;
								local984 = Static111.method1964(Static116.anIntArray399[local23]);
							} else {
								local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
							}
							@Pc(7167) int[] local7167 = null;
							local27--;
							local1431 = Static39.aClass23Array2[local27];
							if (local1431.method642() > 0 && local1431.method650(local1431.method642() - 1) == 89) {
								local23--;
								local632 = Static116.anIntArray399[local23];
								if (local632 > 0) {
									local7167 = new int[local632];
									while (local632-- > 0) {
										local23--;
										local7167[local632] = Static116.anIntArray399[local23];
									}
								}
								local1431 = local1431.method635(0, local1431.method642() - 1);
							}
							@Pc(7233) Object[] local7233 = new Object[local1431.method642() + 1];
							for (local653 = local7233.length - 1; local653 >= 1; local653--) {
								if (local1431.method650(local653 - 1) == 115) {
									local27--;
									local7233[local653] = Static39.aClass23Array2[local27];
								} else {
									local23--;
									local7233[local653] = Integer.valueOf(Static116.anIntArray399[local23]);
								}
							}
							local23--;
							local4642 = Static116.anIntArray399[local23];
							if (local4642 == -1) {
								local7233 = null;
							} else {
								local7233[0] = Integer.valueOf(local4642);
							}
							if (local218 == 1402) {
								local984.anObjectArray19 = local7233;
							}
							if (local218 == 1411) {
								local984.anObjectArray14 = local7233;
							}
							if (local218 == 1408) {
								local984.anObjectArray29 = local7233;
							}
							if (local218 == 1410) {
								local984.anObjectArray13 = local7233;
							}
							if (local218 == 1407) {
								local984.anIntArray395 = local7167;
								local984.anObjectArray4 = local7233;
							}
							if (local218 == 1404) {
								local984.anObjectArray11 = local7233;
							}
							if (local218 == 1421) {
								local984.anObjectArray18 = local7233;
							}
							if (local218 == 1416) {
								local984.anObjectArray12 = local7233;
							}
							if (local218 == 1412) {
								local984.anObjectArray26 = local7233;
							}
							if (local218 == 1424) {
								local984.anObjectArray15 = local7233;
							}
							if (local218 == 1415) {
								local984.anObjectArray16 = local7233;
								local984.anIntArray400 = local7167;
							}
							if (local218 == 1423) {
								local984.anObjectArray7 = local7233;
							}
							if (local218 == 1422) {
								local984.anObjectArray10 = local7233;
							}
							if (local218 == 1418) {
								local984.anObjectArray20 = local7233;
							}
							if (local218 == 1406) {
								local984.anObjectArray9 = local7233;
							}
							if (local218 == 1417) {
								local984.anObjectArray23 = local7233;
							}
							if (local218 == 1425) {
								local984.anObjectArray28 = local7233;
							}
							if (local218 == 1403) {
								local984.anObjectArray8 = local7233;
							}
							if (local218 == 1414) {
								local984.anObjectArray17 = local7233;
								local984.anIntArray401 = local7167;
							}
							if (local218 == 1420) {
								local984.anObjectArray6 = local7233;
							}
							if (local218 == 1401) {
								local984.anObjectArray5 = local7233;
							}
							local984.aBoolean151 = true;
							if (local218 == 1405) {
								local984.anObjectArray22 = local7233;
							}
							if (local218 == 1419) {
								local984.anObjectArray25 = local7233;
							}
							if (local218 == 1409) {
								local984.anObjectArray27 = local7233;
							}
							if (local218 == 1400) {
								local984.anObjectArray24 = local7233;
							}
							continue;
						}
						if (local218 < 1600) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
							if (local218 == 1500) {
								Static116.anIntArray399[local23++] = local984.anInt2999;
								continue;
							}
							if (local218 == 1501) {
								Static116.anIntArray399[local23++] = local984.anInt2985;
								continue;
							}
							if (local218 == 1502) {
								Static116.anIntArray399[local23++] = local984.anInt3014;
								continue;
							}
							if (local218 == 1503) {
								Static116.anIntArray399[local23++] = local984.anInt3017;
								continue;
							}
							if (local218 == 1504) {
								Static116.anIntArray399[local23++] = local984.aBoolean153 ? 1 : 0;
								continue;
							}
							if (local218 == 1505) {
								Static116.anIntArray399[local23++] = local984.anInt2971;
								continue;
							}
						} else if (local218 < 1700) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
							if (local218 == 1600) {
								Static116.anIntArray399[local23++] = local984.anInt2968;
								continue;
							}
							if (local218 == 1601) {
								Static116.anIntArray399[local23++] = local984.anInt3029;
								continue;
							}
							if (local218 == 1602) {
								Static39.aClass23Array2[local27++] = local984.aClass23_1142;
								continue;
							}
							if (local218 == 1603) {
								Static116.anIntArray399[local23++] = local984.anInt3018;
								continue;
							}
							if (local218 == 1604) {
								Static116.anIntArray399[local23++] = local984.anInt2977;
								continue;
							}
							if (local218 == 1605) {
								Static116.anIntArray399[local23++] = local984.anInt3030;
								continue;
							}
							if (local218 == 1606) {
								Static116.anIntArray399[local23++] = local984.anInt2979;
								continue;
							}
							if (local218 == 1607) {
								Static116.anIntArray399[local23++] = local984.anInt2983;
								continue;
							}
							if (local218 == 1608) {
								Static116.anIntArray399[local23++] = local984.anInt2978;
								continue;
							}
							if (local218 == 1609) {
								Static116.anIntArray399[local23++] = local984.anInt2998;
								continue;
							}
						} else if (local218 < 1800) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
							if (local218 == 1700) {
								Static116.anIntArray399[local23++] = local984.anInt3021;
								continue;
							}
							if (local218 == 1701) {
								if (local984.anInt3021 == -1) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = local984.anInt2972;
								}
								continue;
							}
							if (local218 == 1702) {
								Static116.anIntArray399[local23++] = local984.anInt3016;
								continue;
							}
						} else if (local218 < 1900) {
							local984 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
							if (local218 == 1800) {
								Static116.anIntArray399[local23++] = Static34.method580(Static170.method475(local984));
								continue;
							}
							if (local218 == 1801) {
								local23--;
								local777 = Static116.anIntArray399[local23];
								local777--;
								if (local984.aClass23Array17 != null && local777 < local984.aClass23Array17.length && local984.aClass23Array17[local777] != null) {
									Static39.aClass23Array2[local27++] = local984.aClass23Array17[local777];
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 1802) {
								if (local984.aClass23_1140 == null) {
									Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								} else {
									Static39.aClass23Array2[local27++] = local984.aClass23_1140;
								}
								continue;
							}
						} else if (local218 < 2600) {
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
							if (local218 == 2500) {
								Static116.anIntArray399[local23++] = local984.anInt2999;
								continue;
							}
							if (local218 == 2501) {
								Static116.anIntArray399[local23++] = local984.anInt2985;
								continue;
							}
							if (local218 == 2502) {
								Static116.anIntArray399[local23++] = local984.anInt3014;
								continue;
							}
							if (local218 == 2503) {
								Static116.anIntArray399[local23++] = local984.anInt3017;
								continue;
							}
							if (local218 == 2504) {
								Static116.anIntArray399[local23++] = local984.aBoolean153 ? 1 : 0;
								continue;
							}
							if (local218 == 2505) {
								Static116.anIntArray399[local23++] = local984.anInt2971;
								continue;
							}
						} else if (local218 < 2700) {
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
							if (local218 == 2600) {
								Static116.anIntArray399[local23++] = local984.anInt2968;
								continue;
							}
							if (local218 == 2601) {
								Static116.anIntArray399[local23++] = local984.anInt3029;
								continue;
							}
							if (local218 == 2602) {
								Static39.aClass23Array2[local27++] = local984.aClass23_1142;
								continue;
							}
							if (local218 == 2603) {
								Static116.anIntArray399[local23++] = local984.anInt3018;
								continue;
							}
							if (local218 == 2604) {
								Static116.anIntArray399[local23++] = local984.anInt2977;
								continue;
							}
							if (local218 == 2605) {
								Static116.anIntArray399[local23++] = local984.anInt3030;
								continue;
							}
							if (local218 == 2606) {
								Static116.anIntArray399[local23++] = local984.anInt2979;
								continue;
							}
							if (local218 == 2607) {
								Static116.anIntArray399[local23++] = local984.anInt2983;
								continue;
							}
							if (local218 == 2608) {
								Static116.anIntArray399[local23++] = local984.anInt2978;
								continue;
							}
							if (local218 == 2609) {
								Static116.anIntArray399[local23++] = local984.anInt2998;
								continue;
							}
						} else if (local218 < 2800) {
							if (local218 == 2700) {
								local23--;
								local984 = Static111.method1964(Static116.anIntArray399[local23]);
								Static116.anIntArray399[local23++] = local984.anInt3021;
								continue;
							}
							if (local218 == 2701) {
								local23--;
								local984 = Static111.method1964(Static116.anIntArray399[local23]);
								if (local984.anInt3021 == -1) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = local984.anInt2972;
								}
								continue;
							}
							if (local218 == 2702) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								@Pc(1974) Class1_Sub16 local1974 = (Class1_Sub16) Static12.aClass10_1.method256((long) local783);
								if (local1974 == null) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = 1;
								}
								continue;
							}
							if (local218 == 2703) {
								local23--;
								local984 = Static111.method1964(Static116.anIntArray399[local23]);
								if (local984.aClass60Array1 == null) {
									Static116.anIntArray399[local23++] = 0;
									continue;
								}
								local777 = local984.aClass60Array1.length;
								for (local1657 = 0; local1657 < local984.aClass60Array1.length; local1657++) {
									if (local984.aClass60Array1[local1657] == null) {
										local777 = local1657;
										break;
									}
								}
								Static116.anIntArray399[local23++] = local777;
								continue;
							}
							if (local218 == 2704 || local218 == 2705) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								@Pc(2072) Class1_Sub16 local2072 = (Class1_Sub16) Static12.aClass10_1.method256((long) local783);
								if (local2072 != null && local777 == local2072.anInt3207) {
									Static116.anIntArray399[local23++] = 1;
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
						} else if (local218 < 2900) {
							local23--;
							local984 = Static111.method1964(Static116.anIntArray399[local23]);
							if (local218 == 2800) {
								Static116.anIntArray399[local23++] = Static34.method580(Static170.method475(local984));
								continue;
							}
							if (local218 == 2801) {
								local23--;
								local777 = Static116.anIntArray399[local23];
								local777--;
								if (local984.aClass23Array17 != null && local777 < local984.aClass23Array17.length && local984.aClass23Array17[local777] != null) {
									Static39.aClass23Array2[local27++] = local984.aClass23Array17[local777];
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 2802) {
								if (local984.aClass23_1140 == null) {
									Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								} else {
									Static39.aClass23Array2[local27++] = local984.aClass23_1140;
								}
								continue;
							}
						} else if (local218 < 3200) {
							if (local218 == 3100) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static73.method1339(local586, Static140.aClass23_1358, 0);
								continue;
							}
							if (local218 == 3101) {
								local23 -= 2;
								Static69.method1228(Static116.anIntArray399[local23], Static116.anIntArray399[local23 + 1], Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103);
								continue;
							}
							if (local218 == 3103) {
								Static73.method1335();
								continue;
							}
							if (local218 == 3104) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local777 = 0;
								if (local586.method631()) {
									local777 = local586.method658();
								}
								Static25.aClass1_Sub8_Sub1_1.method919(161);
								Static25.aClass1_Sub8_Sub1_1.method904(local777);
								continue;
							}
							if (local218 == 3105) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static25.aClass1_Sub8_Sub1_1.method919(79);
								Static25.aClass1_Sub8_Sub1_1.method873(local586.method643());
								continue;
							}
							if (local218 == 3106) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static25.aClass1_Sub8_Sub1_1.method919(69);
								Static25.aClass1_Sub8_Sub1_1.method862(local586.method642() + 1);
								Static25.aClass1_Sub8_Sub1_1.method858(local586);
								continue;
							}
							if (local218 == 3107) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local27--;
								local1431 = Static39.aClass23Array2[local27];
								Static95.method1633(local1431, local783);
								continue;
							}
							if (local218 == 3108) {
								local23 -= 3;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								local1657 = Static116.anIntArray399[local23 + 2];
								local2288 = Static111.method1964(local1657);
								Static177.method3000(local777, local2288, local783);
								continue;
							}
							if (local218 == 3109) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								local2315 = local951 ? Static33.aClass60_1 : Static109.aClass60_9;
								Static177.method3000(local777, local2315, local783);
								continue;
							}
							if (local218 == 3110) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static25.aClass1_Sub8_Sub1_1.method919(54);
								Static25.aClass1_Sub8_Sub1_1.method869(local783);
								continue;
							}
						} else if (local218 < 3300) {
							if (local218 == 3200) {
								local23 -= 3;
								Static167.method2885(Static116.anIntArray399[local23 + 2], Static116.anIntArray399[local23 + 1], Static116.anIntArray399[local23]);
								continue;
							}
							if (local218 == 3201) {
								local23--;
								Static20.method378(Static116.anIntArray399[local23]);
								continue;
							}
							if (local218 == 3202) {
								local23 -= 2;
								Static99.method1683(Static116.anIntArray399[local23], Static116.anIntArray399[local23 + 1]);
								continue;
							}
						} else if (local218 < 3400) {
							if (local218 == 3300) {
								Static116.anIntArray399[local23++] = Static26.anInt845;
								continue;
							}
							if (local218 == 3301) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static59.method1106(local777, local783);
								continue;
							}
							if (local218 == 3302) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static114.method2033(local777, local783);
								continue;
							}
							if (local218 == 3303) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static149.method2567(local783, local777);
								continue;
							}
							if (local218 == 3304) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static17.method305(local783).anInt379;
								continue;
							}
							if (local218 == 3305) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static99.anIntArray314[local783];
								continue;
							}
							if (local218 == 3306) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static29.anIntArray116[local783];
								continue;
							}
							if (local218 == 3307) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static87.anIntArray122[local783];
								continue;
							}
							if (local218 == 3308) {
								local783 = Static85.anInt2267;
								local777 = Static152.anInt3545 + (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7);
								local1657 = Static75.anInt2039 + (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 >> 7);
								Static116.anIntArray399[local23++] = (local783 << 28) + (local777 << 14) + local1657;
								continue;
							}
							if (local218 == 3309) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 >> 14 & 0x3FFF;
								continue;
							}
							if (local218 == 3310) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 >> 28;
								continue;
							}
							if (local218 == 3311) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 & 0x3FFF;
								continue;
							}
							if (local218 == 3312) {
								Static116.anIntArray399[local23++] = Static176.aBoolean209 ? 1 : 0;
								continue;
							}
							if (local218 == 3313) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23] + 32768;
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static59.method1106(local777, local783);
								continue;
							}
							if (local218 == 3314) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23] + 32768;
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static114.method2033(local777, local783);
								continue;
							}
							if (local218 == 3315) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23] + 32768;
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = Static149.method2567(local783, local777);
								continue;
							}
							if (local218 == 3316) {
								if (Static129.anInt3382 < 2) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = Static129.anInt3382;
								}
								continue;
							}
							if (local218 == 3317) {
								Static116.anIntArray399[local23++] = Static179.anInt4266;
								continue;
							}
							if (local218 == 3318) {
								Static116.anIntArray399[local23++] = Static86.anInt2304;
								continue;
							}
							if (local218 == 3321) {
								Static116.anIntArray399[local23++] = Static113.anInt2905;
								continue;
							}
							if (local218 == 3322) {
								Static116.anIntArray399[local23++] = Static128.anInt3380;
								continue;
							}
							if (local218 == 3323) {
								if (Static129.anInt3382 == 1) {
									Static116.anIntArray399[local23++] = 1;
								} else {
									Static116.anIntArray399[local23++] = 0;
								}
								continue;
							}
							if (local218 == 3324) {
								if (Static153.anInt3776 >= 5 && Static153.anInt3776 <= 9) {
									Static116.anIntArray399[local23++] = Static153.anInt3776;
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3325) {
								if (Static61.anInt1648 <= 0) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = 1;
								}
								continue;
							}
							if (local218 == 3326) {
								Static116.anIntArray399[local23++] = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt215;
								continue;
							}
						} else if (local218 < 3500) {
							if (local218 == 3400) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								@Pc(6423) Class1_Sub1_Sub13 local6423 = Static89.method1569(local783);
								for (local632 = 0; local632 < local6423.anInt2896; local632++) {
									if (local6423.anIntArray385[local632] == local777) {
										Static39.aClass23Array2[local27++] = local6423.aClass23Array14[local632];
										local6423 = null;
										break;
									}
								}
								if (local6423 != null) {
									Static39.aClass23Array2[local27++] = local6423.aClass23_1116;
								}
								continue;
							}
							if (local218 == 3408) {
								local23 -= 4;
								local783 = Static116.anIntArray399[local23];
								local1657 = Static116.anIntArray399[local23 + 2];
								local777 = Static116.anIntArray399[local23 + 1];
								local632 = Static116.anIntArray399[local23 + 3];
								@Pc(6495) Class1_Sub1_Sub13 local6495 = Static89.method1569(local1657);
								if (local783 == local6495.anInt2894 && local6495.anInt2901 == local777) {
									for (local4642 = 0; local4642 < local6495.anInt2896; local4642++) {
										if (local6495.anIntArray385[local4642] == local632) {
											if (local777 == 115) {
												Static39.aClass23Array2[local27++] = local6495.aClass23Array14[local4642];
											} else {
												Static116.anIntArray399[local23++] = local6495.anIntArray386[local4642];
											}
											local6495 = null;
											break;
										}
									}
									if (local6495 != null) {
										if (local777 == 115) {
											Static39.aClass23Array2[local27++] = local6495.aClass23_1116;
										} else {
											Static116.anIntArray399[local23++] = local6495.anInt2902;
										}
									}
									continue;
								}
								if (local777 == 115) {
									Static39.aClass23Array2[local27++] = Static10.aClass23_135;
								} else {
									Static116.anIntArray399[local23++] = 0;
								}
								continue;
							}
						} else if (local218 < 3700) {
							if (local218 == 3600) {
								if (Static45.anInt1254 == 0) {
									Static116.anIntArray399[local23++] = -2;
								} else if (Static45.anInt1254 == 1) {
									Static116.anIntArray399[local23++] = -1;
								} else {
									Static116.anIntArray399[local23++] = Static37.anInt996;
								}
								continue;
							}
							if (local218 == 3601) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static45.anInt1254 == 2 && local783 < Static37.anInt996) {
									Static39.aClass23Array2[local27++] = Static133.aClass23Array19[local783];
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 3602) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static45.anInt1254 == 2 && local783 < Static37.anInt996) {
									Static116.anIntArray399[local23++] = Static72.anIntArray264[local783];
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3603) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static45.anInt1254 == 2 && local783 < Static37.anInt996) {
									Static116.anIntArray399[local23++] = Static70.anIntArray255[local783];
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3604) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23--;
								local777 = Static116.anIntArray399[local23];
								Static152.method2440(local777, local586);
								continue;
							}
							if (local218 == 3605) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static46.method3124(local586.method643());
								continue;
							}
							if (local218 == 3606) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static54.method994(local586.method643());
								continue;
							}
							if (local218 == 3607) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static154.method2628(local586.method643());
								continue;
							}
							if (local218 == 3608) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static113.method2005(local586.method643());
								continue;
							}
							if (local218 == 3609) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								if (local586.method634(Static54.aClass23_546) || local586.method634(Static93.aClass23_919)) {
									local586 = local586.method632(7);
								}
								Static116.anIntArray399[local23++] = Static118.method2077(local586) ? 1 : 0;
								continue;
							}
							if (local218 == 3611) {
								if (Static156.aClass23_1468 == null) {
									Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								} else {
									Static39.aClass23Array2[local27++] = Static156.aClass23_1468.method667();
								}
								continue;
							}
							if (local218 == 3612) {
								if (Static156.aClass23_1468 == null) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = Static109.anInt2811;
								}
								continue;
							}
							if (local218 == 3613) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static156.aClass23_1468 != null && local783 < Static109.anInt2811) {
									Static39.aClass23Array2[local27++] = Static30.aClass1_Sub24Array2[local783].aClass23_1565.method667();
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 3614) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static156.aClass23_1468 != null && Static109.anInt2811 > local783) {
									Static116.anIntArray399[local23++] = Static30.aClass1_Sub24Array2[local783].anInt4108;
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3615) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static156.aClass23_1468 != null && Static109.anInt2811 > local783) {
									Static116.anIntArray399[local23++] = Static30.aClass1_Sub24Array2[local783].aByte10;
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3616) {
								Static116.anIntArray399[local23++] = Static171.aByte11;
								continue;
							}
							if (local218 == 3617) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static51.method944(local586);
								continue;
							}
							if (local218 == 3618) {
								Static116.anIntArray399[local23++] = Static81.aByte2;
								continue;
							}
							if (local218 == 3619) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static27.method496(local586.method643());
								continue;
							}
							if (local218 == 3620) {
								Static59.method1104();
								continue;
							}
							if (local218 == 3621) {
								if (Static45.anInt1254 == 0) {
									Static116.anIntArray399[local23++] = -1;
								} else {
									Static116.anIntArray399[local23++] = Static65.anInt3673;
								}
								continue;
							}
							if (local218 == 3622) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static45.anInt1254 != 0 && local783 < Static65.anInt3673) {
									Static39.aClass23Array2[local27++] = Static8.method183(Static70.aLongArray4[local783]).method667();
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 3623) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								if (local586.method634(Static54.aClass23_546) || local586.method634(Static93.aClass23_919)) {
									local586 = local586.method632(7);
								}
								Static116.anIntArray399[local23++] = Static32.method571(local586) ? 1 : 0;
								continue;
							}
							if (local218 == 3624) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								if (Static30.aClass1_Sub24Array2 != null && local783 < Static109.anInt2811 && Static30.aClass1_Sub24Array2[local783].aClass23_1565.method644(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68)) {
									Static116.anIntArray399[local23++] = 1;
									continue;
								}
								Static116.anIntArray399[local23++] = 0;
								continue;
							}
							if (local218 == 3625) {
								if (Static77.aClass23_772 == null) {
									Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								} else {
									Static39.aClass23Array2[local27++] = Static77.aClass23_772.method667();
								}
								continue;
							}
						} else if (local218 < 4000) {
							if (local218 == 3903) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].method2293();
								continue;
							}
							if (local218 == 3904) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].anInt3386;
								continue;
							}
							if (local218 == 3905) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].anInt3388;
								continue;
							}
							if (local218 == 3906) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].anInt3384;
								continue;
							}
							if (local218 == 3907) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].anInt3390;
								continue;
							}
							if (local218 == 3908) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static130.aClass64Array1[local783].anInt3383;
								continue;
							}
							if (local218 == 3910) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local777 = Static130.aClass64Array1[local783].method2294();
								Static116.anIntArray399[local23++] = local777 == 0 ? 1 : 0;
								continue;
							}
							if (local218 == 3911) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local777 = Static130.aClass64Array1[local783].method2294();
								Static116.anIntArray399[local23++] = local777 == 2 ? 1 : 0;
								continue;
							}
							if (local218 == 3912) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local777 = Static130.aClass64Array1[local783].method2294();
								Static116.anIntArray399[local23++] = local777 == 5 ? 1 : 0;
								continue;
							}
							if (local218 == 3913) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local777 = Static130.aClass64Array1[local783].method2294();
								Static116.anIntArray399[local23++] = local777 == 1 ? 1 : 0;
								continue;
							}
						} else if (local218 < 4100) {
							if (local218 == 4000) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local783 + local777;
								continue;
							}
							if (local218 == 4001) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 - local777;
								continue;
							}
							if (local218 == 4002) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 * local777;
								continue;
							}
							if (local218 == 4003) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local783 / local777;
								continue;
							}
							if (local218 == 4004) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = (int) (Math.random() * (double) local783);
								continue;
							}
							if (local218 == 4005) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = (int) (Math.random() * (double) (local783 + 1));
								continue;
							}
							if (local218 == 4006) {
								local23 -= 5;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								local1657 = Static116.anIntArray399[local23 + 2];
								local632 = Static116.anIntArray399[local23 + 3];
								local653 = Static116.anIntArray399[local23 + 4];
								Static116.anIntArray399[local23++] = local783 + (local653 - local1657) * (local777 - local783) / (local632 - local1657);
								continue;
							}
							if (local218 == 4007) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local783 * local777 / 100 + local783;
								continue;
							}
							if (local218 == 4008) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = 0x1 << local777 | local783;
								continue;
							}
							if (local218 == 4009) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local783 & -(0x1 << local777) - 1;
								continue;
							}
							if (local218 == 4010) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = (local783 & 0x1 << local777) == 0 ? 0 : 1;
								continue;
							}
							if (local218 == 4011) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local783 % local777;
								continue;
							}
							if (local218 == 4012) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								if (local783 == 0) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = (int) Math.pow((double) local783, (double) local777);
								}
								continue;
							}
							if (local218 == 4013) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								if (local783 == 0) {
									Static116.anIntArray399[local23++] = 0;
								} else if (local777 == 0) {
									Static116.anIntArray399[local23++] = Integer.MAX_VALUE;
								} else {
									Static116.anIntArray399[local23++] = (int) Math.pow((double) local783, 1.0D / (double) local777);
								}
								continue;
							}
							if (local218 == 4014) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local777 & local783;
								continue;
							}
							if (local218 == 4015) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23 + 1];
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local777 | local783;
								continue;
							}
							if (local218 == 4016) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local777 <= local783 ? local777 : local783;
								continue;
							}
							if (local218 == 4017) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local783 > local777 ? local783 : local777;
								continue;
							}
							if (local218 == 4018) {
								local23 -= 3;
								@Pc(5750) long local5750 = (long) Static116.anIntArray399[local23];
								@Pc(5757) long local5757 = (long) Static116.anIntArray399[local23 + 1];
								@Pc(5764) long local5764 = (long) Static116.anIntArray399[local23 + 2];
								Static116.anIntArray399[local23++] = (int) (local5764 * local5750 / local5757);
								continue;
							}
						} else if (local218 < 4200) {
							if (local218 == 4100) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23--;
								local777 = Static116.anIntArray399[local23];
								Static39.aClass23Array2[local27++] = Static149.method2571(new Class23[] { local586, Static27.method498(local777) });
								continue;
							}
							if (local218 == 4101) {
								local27 -= 2;
								local586 = Static39.aClass23Array2[local27];
								local1431 = Static39.aClass23Array2[local27 + 1];
								Static39.aClass23Array2[local27++] = Static149.method2571(new Class23[] { local586, local1431 });
								continue;
							}
							if (local218 == 4102) {
								local23--;
								local777 = Static116.anIntArray399[local23];
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static39.aClass23Array2[local27++] = Static149.method2571(new Class23[] { local586, Static19.method350(local777) });
								continue;
							}
							if (local218 == 4103) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static39.aClass23Array2[local27++] = local586.method638();
								continue;
							}
							if (local218 == 4104) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								@Pc(4624) long local4624 = ((long) local783 + 11745L) * 86400000L;
								Static51.aCalendar1.setTime(new Date(local4624));
								local632 = Static51.aCalendar1.get(5);
								local653 = Static51.aCalendar1.get(2);
								local4642 = Static51.aCalendar1.get(1);
								Static39.aClass23Array2[local27++] = Static149.method2571(new Class23[] { Static27.method498(local632), Static100.aClass23_990, Static95.aClass23Array9[local653], Static100.aClass23_990, Static27.method498(local4642) });
								continue;
							}
							if (local218 == 4105) {
								local27 -= 2;
								local586 = Static39.aClass23Array2[local27];
								local1431 = Static39.aClass23Array2[local27 + 1];
								if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5 != null && Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5.aBoolean87) {
									Static39.aClass23Array2[local27++] = local1431;
									continue;
								}
								Static39.aClass23Array2[local27++] = local586;
								continue;
							}
							if (local218 == 4106) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static39.aClass23Array2[local27++] = Static27.method498(local783);
								continue;
							}
							if (local218 == 4107) {
								local27 -= 2;
								Static116.anIntArray399[local23++] = Static39.aClass23Array2[local27].method662(Static39.aClass23Array2[local27 + 1]);
								continue;
							}
							@Pc(4784) Class1_Sub1_Sub12_Sub3_Sub1 local4784;
							@Pc(4779) byte[] local4779;
							if (local218 == 4108) {
								local23 -= 2;
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local1657 = Static116.anIntArray399[local23 + 1];
								local777 = Static116.anIntArray399[local23];
								local4779 = Static162.aClass30_Sub1_17.method1301(local1657, 0);
								local4784 = new Class1_Sub1_Sub12_Sub3_Sub1(local4779);
								Static116.anIntArray399[local23++] = local4784.method3041(local586, local777);
								continue;
							}
							if (local218 == 4109) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23 -= 2;
								local777 = Static116.anIntArray399[local23];
								local1657 = Static116.anIntArray399[local23 + 1];
								local4779 = Static162.aClass30_Sub1_17.method1301(local1657, 0);
								local4784 = new Class1_Sub1_Sub12_Sub3_Sub1(local4779);
								Static116.anIntArray399[local23++] = local4784.method3062(local586, local777);
								continue;
							}
							if (local218 == 4110) {
								local27 -= 2;
								local1431 = Static39.aClass23Array2[local27 + 1];
								local586 = Static39.aClass23Array2[local27];
								local23--;
								if (Static116.anIntArray399[local23] == 1) {
									Static39.aClass23Array2[local27++] = local586;
								} else {
									Static39.aClass23Array2[local27++] = local1431;
								}
								continue;
							}
							if (local218 == 4111) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								Static39.aClass23Array2[local27++] = Static136.method3049(local586);
								continue;
							}
							if (local218 == 4112) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23--;
								local777 = Static116.anIntArray399[local23];
								Static39.aClass23Array2[local27++] = local586.method666(local777);
								continue;
							}
							if (local218 == 4113) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static99.method1676(local783) ? 1 : 0;
								continue;
							}
							if (local218 == 4114) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static58.method1101(local783) ? 1 : 0;
								continue;
							}
							if (local218 == 4115) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static127.method2273(local783) ? 1 : 0;
								continue;
							}
							if (local218 == 4116) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static9.method209(local783) ? 1 : 0;
								continue;
							}
							if (local218 == 4117) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								if (local586 == null) {
									Static116.anIntArray399[local23++] = 0;
								} else {
									Static116.anIntArray399[local23++] = local586.method642();
								}
								continue;
							}
							if (local218 == 4118) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23 -= 2;
								local1657 = Static116.anIntArray399[local23 + 1];
								local777 = Static116.anIntArray399[local23];
								Static39.aClass23Array2[local27++] = local586.method635(local777, local1657);
								continue;
							}
							if (local218 == 4119) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local1431 = Static38.method621(local586.method642());
								@Pc(5087) boolean local5087 = false;
								for (local632 = 0; local632 < local586.method642(); local632++) {
									local653 = local586.method650(local632);
									if (local653 == 60) {
										local5087 = true;
									} else if (local653 == 62) {
										local5087 = false;
									} else if (!local5087) {
										local1431.method661(local653);
									}
								}
								local1431.method664();
								Static39.aClass23Array2[local27++] = local1431;
								continue;
							}
							if (local218 == 4120) {
								local23 -= 2;
								local777 = Static116.anIntArray399[local23];
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local1657 = Static116.anIntArray399[local23 + 1];
								Static116.anIntArray399[local23++] = local586.method660(local1657, local777);
								continue;
							}
							if (local218 == 4121) {
								local27 -= 2;
								local586 = Static39.aClass23Array2[local27];
								local1431 = Static39.aClass23Array2[local27 + 1];
								local23--;
								local1657 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = local586.method654(local1431, local1657);
								continue;
							}
						} else if (local218 < 4300) {
							if (local218 == 4200) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static39.aClass23Array2[local27++] = Static2.method118(local783).aClass23_431;
								continue;
							}
							@Pc(3182) Class1_Sub1_Sub7 local3182;
							if (local218 == 4201) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								local3182 = Static2.method118(local783);
								if (local777 >= 1 && local777 <= 5 && local3182.aClass23Array4[local777 - 1] != null) {
									Static39.aClass23Array2[local27++] = local3182.aClass23Array4[local777 - 1];
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 4202) {
								local23 -= 2;
								local783 = Static116.anIntArray399[local23];
								local777 = Static116.anIntArray399[local23 + 1];
								local3182 = Static2.method118(local783);
								if (local777 >= 1 && local777 <= 5 && local3182.aClass23Array3[local777 - 1] != null) {
									Static39.aClass23Array2[local27++] = local3182.aClass23Array3[local777 - 1];
									continue;
								}
								Static39.aClass23Array2[local27++] = Static140.aClass23_1358;
								continue;
							}
							if (local218 == 4203) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static2.method118(local783).anInt1142;
								continue;
							}
							if (local218 == 4204) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static2.method118(local783).anInt1155 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3333) Class1_Sub1_Sub7 local3333;
							if (local218 == 4205) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local3333 = Static2.method118(local783);
								if (local3333.anInt1143 == -1 && local3333.anInt1147 >= 0) {
									Static116.anIntArray399[local23++] = local3333.anInt1147;
									continue;
								}
								Static116.anIntArray399[local23++] = local783;
								continue;
							}
							if (local218 == 4206) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local3333 = Static2.method118(local783);
								if (local3333.anInt1143 >= 0 && local3333.anInt1147 >= 0) {
									Static116.anIntArray399[local23++] = local3333.anInt1147;
									continue;
								}
								Static116.anIntArray399[local23++] = local783;
								continue;
							}
							if (local218 == 4207) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								Static116.anIntArray399[local23++] = Static2.method118(local783).aBoolean54 ? 1 : 0;
								continue;
							}
							if (local218 == 4210) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local23--;
								local777 = Static116.anIntArray399[local23];
								Static103.method1773(local586, local777 == 1);
								Static116.anIntArray399[local23++] = Static161.anInt3972;
								continue;
							}
							if (local218 == 4211) {
								if (Static84.aShortArray47 != null && Static161.anInt3972 > Static100.anInt2566) {
									Static116.anIntArray399[local23++] = Static84.aShortArray47[Static100.anInt2566++] & 0xFFFF;
									continue;
								}
								Static116.anIntArray399[local23++] = -1;
								continue;
							}
							if (local218 == 4212) {
								Static100.anInt2566 = 0;
								continue;
							}
						} else if (local218 < 5100) {
							if (local218 == 5000) {
								Static116.anIntArray399[local23++] = Static1.anInt220;
								continue;
							}
							if (local218 == 5001) {
								local23 -= 3;
								Static1.anInt220 = Static116.anIntArray399[local23];
								Static89.anInt2374 = Static116.anIntArray399[local23 + 1];
								Static108.anInt1866 = Static116.anIntArray399[local23 + 2];
								Static25.aClass1_Sub8_Sub1_1.method919(112);
								Static25.aClass1_Sub8_Sub1_1.method862(Static1.anInt220);
								Static25.aClass1_Sub8_Sub1_1.method862(Static89.anInt2374);
								Static25.aClass1_Sub8_Sub1_1.method862(Static108.anInt1866);
								continue;
							}
							if (local218 == 5002) {
								local23 -= 2;
								local27--;
								local586 = Static39.aClass23Array2[local27];
								local777 = Static116.anIntArray399[local23];
								local1657 = Static116.anIntArray399[local23 + 1];
								Static25.aClass1_Sub8_Sub1_1.method919(177);
								Static25.aClass1_Sub8_Sub1_1.method873(local586.method643());
								Static25.aClass1_Sub8_Sub1_1.method862(local777 - 1);
								Static25.aClass1_Sub8_Sub1_1.method862(local1657);
								continue;
							}
							if (local218 == 5003) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local1431 = null;
								if (local783 < 100) {
									local1431 = Static119.aClass23Array18[local783];
								}
								if (local1431 == null) {
									local1431 = Static140.aClass23_1358;
								}
								Static39.aClass23Array2[local27++] = local1431;
								continue;
							}
							if (local218 == 5004) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local777 = -1;
								if (local783 < 100 && Static119.aClass23Array18[local783] != null) {
									local777 = Static64.anIntArray231[local783];
								}
								Static116.anIntArray399[local23++] = local777;
								continue;
							}
							if (local218 == 5005) {
								Static116.anIntArray399[local23++] = Static89.anInt2374;
								continue;
							}
							if (local218 == 5008) {
								local27--;
								local586 = Static39.aClass23Array2[local27];
								if (local586.method634(Static160.aClass23_1508)) {
									Static162.method2824(local586);
								} else {
									local1431 = local586.method638();
									@Pc(3710) byte local3710 = 0;
									if (local1431.method634(Static24.aClass23_260)) {
										local3710 = 0;
										local586 = local586.method632(Static24.aClass23_260.method642());
									} else if (local1431.method634(Static153.aClass23_1443)) {
										local586 = local586.method632(Static153.aClass23_1443.method642());
										local3710 = 1;
									} else if (local1431.method634(Static46.aClass23_1649)) {
										local3710 = 2;
										local586 = local586.method632(Static46.aClass23_1649.method642());
									} else if (local1431.method634(Static13.aClass23_171)) {
										local586 = local586.method632(Static13.aClass23_171.method642());
										local3710 = 3;
									} else if (local1431.method634(Static11.aClass23_140)) {
										local586 = local586.method632(Static11.aClass23_140.method642());
										local3710 = 4;
									} else if (local1431.method634(Static125.aClass23_1216)) {
										local586 = local586.method632(Static125.aClass23_1216.method642());
										local3710 = 5;
									} else if (local1431.method634(Static88.aClass23_876)) {
										local586 = local586.method632(Static88.aClass23_876.method642());
										local3710 = 6;
									} else if (local1431.method634(Static144.aClass23_1382)) {
										local3710 = 7;
										local586 = local586.method632(Static144.aClass23_1382.method642());
									} else if (local1431.method634(Static45.aClass23_480)) {
										local3710 = 8;
										local586 = local586.method632(Static45.aClass23_480.method642());
									} else if (local1431.method634(Static65.aClass23_1390)) {
										local3710 = 9;
										local586 = local586.method632(Static65.aClass23_1390.method642());
									} else if (local1431.method634(Static91.aClass23_906)) {
										local586 = local586.method632(Static91.aClass23_906.method642());
										local3710 = 10;
									} else if (local1431.method634(Static76.aClass23_751)) {
										local3710 = 11;
										local586 = local586.method632(Static76.aClass23_751.method642());
									} else if (Static37.anInt994 != 0) {
										if (local1431.method634(Static24.aClass23_261)) {
											local586 = local586.method632(Static24.aClass23_261.method642());
											local3710 = 0;
										} else if (local1431.method634(Static153.aClass23_1444)) {
											local586 = local586.method632(Static153.aClass23_1444.method642());
											local3710 = 1;
										} else if (local1431.method634(Static46.aClass23_1655)) {
											local586 = local586.method632(Static46.aClass23_1655.method642());
											local3710 = 2;
										} else if (local1431.method634(Static13.aClass23_173)) {
											local3710 = 3;
											local586 = local586.method632(Static13.aClass23_173.method642());
										} else if (local1431.method634(Static11.aClass23_139)) {
											local586 = local586.method632(Static11.aClass23_139.method642());
											local3710 = 4;
										} else if (local1431.method634(Static125.aClass23_1218)) {
											local586 = local586.method632(Static125.aClass23_1218.method642());
											local3710 = 5;
										} else if (local1431.method634(Static88.aClass23_875)) {
											local3710 = 6;
											local586 = local586.method632(Static88.aClass23_875.method642());
										} else if (local1431.method634(Static144.aClass23_1381)) {
											local586 = local586.method632(Static144.aClass23_1381.method642());
											local3710 = 7;
										} else if (local1431.method634(Static45.aClass23_479)) {
											local3710 = 8;
											local586 = local586.method632(Static45.aClass23_479.method642());
										} else if (local1431.method634(Static65.aClass23_1393)) {
											local586 = local586.method632(Static65.aClass23_1393.method642());
											local3710 = 9;
										} else if (local1431.method634(Static91.aClass23_907)) {
											local586 = local586.method632(Static91.aClass23_907.method642());
											local3710 = 10;
										} else if (local1431.method634(Static76.aClass23_756)) {
											local3710 = 11;
											local586 = local586.method632(Static76.aClass23_756.method642());
										}
									}
									local1431 = local586.method638();
									@Pc(4123) byte local4123 = 0;
									if (local1431.method634(Static96.aClass23_953)) {
										local4123 = 1;
										local586 = local586.method632(Static96.aClass23_953.method642());
									} else if (local1431.method634(Static51.aClass23_535)) {
										local4123 = 2;
										local586 = local586.method632(Static51.aClass23_535.method642());
									} else if (local1431.method634(Static34.aClass23_372)) {
										local586 = local586.method632(Static34.aClass23_372.method642());
										local4123 = 3;
									} else if (local1431.method634(Static38.aClass23_407)) {
										local4123 = 4;
										local586 = local586.method632(Static38.aClass23_407.method642());
									} else if (local1431.method634(Static126.aClass23_1235)) {
										local586 = local586.method632(Static126.aClass23_1235.method642());
										local4123 = 5;
									} else if (Static37.anInt994 != 0) {
										if (local1431.method634(Static96.aClass23_959)) {
											local586 = local586.method632(Static96.aClass23_959.method642());
											local4123 = 1;
										} else if (local1431.method634(Static51.aClass23_534)) {
											local4123 = 2;
											local586 = local586.method632(Static51.aClass23_534.method642());
										} else if (local1431.method634(Static34.aClass23_373)) {
											local4123 = 3;
											local586 = local586.method632(Static34.aClass23_373.method642());
										} else if (local1431.method634(Static38.aClass23_405)) {
											local586 = local586.method632(Static38.aClass23_405.method642());
											local4123 = 4;
										} else if (local1431.method634(Static126.aClass23_1232)) {
											local4123 = 5;
											local586 = local586.method632(Static126.aClass23_1232.method642());
										}
									}
									Static25.aClass1_Sub8_Sub1_1.method919(239);
									Static25.aClass1_Sub8_Sub1_1.method862(0);
									local653 = Static25.aClass1_Sub8_Sub1_1.anInt1357;
									Static25.aClass1_Sub8_Sub1_1.method862(local3710);
									Static25.aClass1_Sub8_Sub1_1.method862(local4123);
									Static43.method716(Static25.aClass1_Sub8_Sub1_1, local586);
									Static25.aClass1_Sub8_Sub1_1.method877(Static25.aClass1_Sub8_Sub1_1.anInt1357 - local653);
								}
								continue;
							}
							if (local218 == 5009) {
								local27 -= 2;
								local1431 = Static39.aClass23Array2[local27 + 1];
								local586 = Static39.aClass23Array2[local27];
								Static25.aClass1_Sub8_Sub1_1.method919(140);
								Static25.aClass1_Sub8_Sub1_1.method862(0);
								local1657 = Static25.aClass1_Sub8_Sub1_1.anInt1357;
								Static25.aClass1_Sub8_Sub1_1.method873(local586.method643());
								Static43.method716(Static25.aClass1_Sub8_Sub1_1, local1431);
								Static25.aClass1_Sub8_Sub1_1.method877(Static25.aClass1_Sub8_Sub1_1.anInt1357 - local1657);
								continue;
							}
							if (local218 == 5010) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local1431 = null;
								if (local783 < 100) {
									local1431 = Static114.aClass23Array15[local783];
								}
								if (local1431 == null) {
									local1431 = Static140.aClass23_1358;
								}
								Static39.aClass23Array2[local27++] = local1431;
								continue;
							}
							if (local218 == 5011) {
								local23--;
								local783 = Static116.anIntArray399[local23];
								local1431 = null;
								if (local783 < 100) {
									local1431 = Static55.aClass23Array6[local783];
								}
								if (local1431 == null) {
									local1431 = Static140.aClass23_1358;
								}
								Static39.aClass23Array2[local27++] = local1431;
								continue;
							}
							if (local218 == 5015) {
								if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 == null || Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68 == null) {
									local586 = Static61.aClass23_612;
								} else {
									local586 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68;
								}
								Static39.aClass23Array2[local27++] = local586;
								continue;
							}
							if (local218 == 5016) {
								Static116.anIntArray399[local23++] = Static108.anInt1866;
								continue;
							}
							if (local218 == 5017) {
								Static116.anIntArray399[local23++] = Static20.anInt645;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7920) Exception local7920) {
			if (local18.aClass23_1635 == null) {
				if (Static73.anInt2024 != 0) {
					Static73.method1339(Static160.aClass23_1509, Static140.aClass23_1358, 0);
				}
				Static153.method2616("CS2 - scr:" + local18.aLong140 + " op:" + local34, local7920);
			} else {
				@Pc(7953) Class23 local7953 = Static38.method621(30);
				local7953.method663(Static37.aClass23_386).method663(local18.aClass23_1635);
				for (local58 = Static139.anInt3552 - 1; local58 >= 0; local58--) {
					local7953.method663(Static70.aClass23_699).method663(Static39.aClass32Array1[local58].aClass1_Sub1_Sub17_1.aClass23_1635);
				}
				if (local34 == 40) {
					local96 = local37[local29];
					local7953.method663(Static33.aClass23_350).method663(Static27.method498(local96));
				}
				if (Static73.anInt2024 != 0) {
					Static73.method1339(Static149.method2571(new Class23[] { Static13.aClass23_174, local18.aClass23_1635 }), Static140.aClass23_1358, 0);
				}
				Static153.method2616("CS2 - scr:" + local18.aLong140 + " op:" + local34 + new String(local7953.method653()), local7920);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method2203() {
		aClass30_48 = null;
		aClass23_1200 = null;
		aClass23_1202 = null;
		aClass23_1201 = null;
	}
}
