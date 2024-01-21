import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Lclient!he;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public static int anInt3022 = 0;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array25 = new Class20[8];

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
	public static int anInt3035 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!eg;Z)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray3;
		@Pc(10) int local10 = (Integer) local4[0];
		@Pc(22) Class5_Sub2_Sub23 local22 = Static113.method1824(local10);
		if (local22 == null) {
			return;
		}
		Static186.anInt3741 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(34) int[] local34 = local22.anIntArray400;
		@Pc(37) int[] local37 = local22.anIntArray401;
		@Pc(39) byte local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(55) int local55;
		@Pc(68) int local68;
		try {
			Static153.anIntArray338 = new int[local22.anInt3774];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			Static92.aClass20Array13 = new Class20[local22.anInt3771];
			for (local55 = 1; local55 < local4.length; local55++) {
				if (local4[local55] instanceof Integer) {
					local68 = (Integer) local4[local55];
					if (local68 == -2147483647) {
						local68 = arg1.anInt1028;
					}
					if (local68 == -2147483646) {
						local68 = arg1.anInt1026;
					}
					if (local68 == -2147483645) {
						local68 = arg1.aClass69_3 == null ? -1 : arg1.aClass69_3.anInt2523;
					}
					if (local68 == -2147483644) {
						local68 = arg1.anInt1031;
					}
					if (local68 == -2147483643) {
						local68 = arg1.aClass69_3 == null ? -1 : arg1.aClass69_3.anInt2475;
					}
					if (local68 == -2147483642) {
						local68 = arg1.aClass69_2 == null ? -1 : arg1.aClass69_2.anInt2523;
					}
					if (local68 == -2147483641) {
						local68 = arg1.aClass69_2 == null ? -1 : arg1.aClass69_2.anInt2475;
					}
					if (local68 == -2147483640) {
						local68 = arg1.anInt1027;
					}
					if (local68 == -2147483639) {
						local68 = arg1.anInt1029;
					}
					Static153.anIntArray338[local47++] = local68;
				} else if (local4[local55] instanceof Class20) {
					@Pc(175) Class20 local175 = (Class20) local4[local55];
					if (local175.method594(Static184.aClass20_1360)) {
						local175 = arg1.aClass20_346;
					}
					Static92.aClass20Array13[local49++] = local175;
				}
			}
			local68 = 0;
			label2448: while (true) {
				local68++;
				if (local68 > arg0) {
					throw new RuntimeException("slow");
				}
				local41++;
				@Pc(213) int local213 = local34[local41];
				@Pc(650) int local650;
				@Pc(782) int local782;
				@Pc(777) int local777;
				@Pc(579) Class20 local579;
				@Pc(625) int local625;
				if (local213 < 100) {
					if (local213 == 0) {
						Static51.anIntArray101[local29++] = local37[local41];
						continue;
					}
					@Pc(241) int local241;
					if (local213 == 1) {
						local241 = local37[local41];
						Static51.anIntArray101[local29++] = Static139.anIntArray309[local241];
						continue;
					}
					if (local213 == 2) {
						local241 = local37[local41];
						local29--;
						Static139.anIntArray309[local241] = Static51.anIntArray101[local29];
						continue;
					}
					if (local213 == 3) {
						Static153.aClass20Array26[local31++] = local22.aClass20Array29[local41];
						continue;
					}
					if (local213 == 6) {
						local41 += local37[local41];
						continue;
					}
					if (local213 == 7) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] != Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 8) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] == Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 9) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] > Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 10) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] < Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 21) {
						if (Static186.anInt3741 == 0) {
							return;
						}
						@Pc(404) Class55 local404 = Static202.aClass55Array1[--Static186.anInt3741];
						Static92.aClass20Array13 = local404.aClass20Array14;
						Static153.anIntArray338 = local404.anIntArray212;
						local41 = local404.anInt2147;
						local22 = local404.aClass5_Sub2_Sub23_1;
						local34 = local22.anIntArray400;
						local37 = local22.anIntArray401;
						continue;
					}
					if (local213 == 25) {
						local241 = local37[local41];
						Static51.anIntArray101[local29++] = Static208.method3105(local241);
						continue;
					}
					if (local213 == 27) {
						local241 = local37[local41];
						local29--;
						Static152.method2293(local241, Static51.anIntArray101[local29]);
						continue;
					}
					if (local213 == 31) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] >= Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 32) {
						local29 -= 2;
						if (Static51.anIntArray101[local29 + 1] <= Static51.anIntArray101[local29]) {
							local41 += local37[local41];
						}
						continue;
					}
					if (local213 == 33) {
						Static51.anIntArray101[local29++] = Static153.anIntArray338[local37[local41]];
						continue;
					}
					@Pc(525) int local525;
					if (local213 == 34) {
						local525 = local37[local41];
						local29--;
						Static153.anIntArray338[local525] = Static51.anIntArray101[local29];
						continue;
					}
					if (local213 == 35) {
						Static153.aClass20Array26[local31++] = Static92.aClass20Array13[local37[local41]];
						continue;
					}
					if (local213 == 36) {
						local525 = local37[local41];
						local31--;
						Static92.aClass20Array13[local525] = Static153.aClass20Array26[local31];
						continue;
					}
					if (local213 == 37) {
						local241 = local37[local41];
						local31 -= local241;
						local579 = Static167.method2536(Static153.aClass20Array26, local31, local241);
						Static153.aClass20Array26[local31++] = local579;
						continue;
					}
					if (local213 == 38) {
						local29--;
						continue;
					}
					if (local213 == 39) {
						local31--;
						continue;
					}
					if (local213 == 40) {
						local241 = local37[local41];
						@Pc(615) Class5_Sub2_Sub23 local615 = Static113.method1824(local241);
						@Pc(619) Class20[] local619 = new Class20[local615.anInt3771];
						@Pc(623) int[] local623 = new int[local615.anInt3774];
						for (local625 = 0; local625 < local615.anInt3772; local625++) {
							local623[local625] = Static51.anIntArray101[local29 + local625 - local615.anInt3772];
						}
						for (local650 = 0; local650 < local615.anInt3773; local650++) {
							local619[local650] = Static153.aClass20Array26[local650 + local31 - local615.anInt3773];
						}
						local29 -= local615.anInt3772;
						local31 -= local615.anInt3773;
						@Pc(686) Class55 local686 = new Class55();
						local686.anIntArray212 = Static153.anIntArray338;
						local686.aClass5_Sub2_Sub23_1 = local22;
						local686.anInt2147 = local41;
						local686.aClass20Array14 = Static92.aClass20Array13;
						if (Static186.anInt3741 >= Static202.aClass55Array1.length) {
							throw new RuntimeException();
						}
						Static202.aClass55Array1[Static186.anInt3741++] = local686;
						Static153.anIntArray338 = local623;
						local41 = -1;
						Static92.aClass20Array13 = local619;
						local22 = local615;
						local37 = local615.anIntArray401;
						local34 = local615.anIntArray400;
						continue;
					}
					if (local213 == 42) {
						Static51.anIntArray101[local29++] = Static196.anIntArray405[local37[local41]];
						continue;
					}
					if (local213 == 43) {
						local525 = local37[local41];
						local29--;
						Static196.anIntArray405[local525] = Static51.anIntArray101[local29];
						continue;
					}
					if (local213 == 44) {
						local241 = local37[local41] >> 16;
						local777 = local37[local41] & 0xFFFF;
						local29--;
						local782 = Static51.anIntArray101[local29];
						if (local782 >= 0 && local782 <= 5000) {
							Static73.anIntArray144[local241] = local782;
							@Pc(800) byte local800 = -1;
							if (local777 == 105) {
								local800 = 0;
							}
							local625 = 0;
							while (true) {
								if (local625 >= local782) {
									continue label2448;
								}
								Static124.anIntArrayArray29[local241][local625] = local800;
								local625++;
							}
						}
						throw new RuntimeException();
					}
					if (local213 == 45) {
						local241 = local37[local41];
						local29--;
						local777 = Static51.anIntArray101[local29];
						if (local777 >= 0 && Static73.anIntArray144[local241] > local777) {
							Static51.anIntArray101[local29++] = Static124.anIntArrayArray29[local241][local777];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 46) {
						local29 -= 2;
						local241 = local37[local41];
						local777 = Static51.anIntArray101[local29];
						if (local777 >= 0 && Static73.anIntArray144[local241] > local777) {
							Static124.anIntArrayArray29[local241][local777] = Static51.anIntArray101[local29 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 47) {
						@Pc(910) Class20 local910 = Static8.aClass20Array1[local37[local41]];
						if (local910 == null) {
							local910 = Static84.aClass20_675;
						}
						Static153.aClass20Array26[local31++] = local910;
						continue;
					}
					if (local213 == 48) {
						local525 = local37[local41];
						local31--;
						Static8.aClass20Array1[local525] = Static153.aClass20Array26[local31];
						continue;
					}
					if (local213 == 51) {
						@Pc(949) Class75 local949 = local22.aClass75Array1[local37[local41]];
						local29--;
						@Pc(959) Class5_Sub20 local959 = (Class5_Sub20) local949.method2072((long) Static51.anIntArray101[local29]);
						if (local959 != null) {
							local41 += local959.anInt2605;
						}
						continue;
					}
				}
				@Pc(975) boolean local975;
				if (local37[local41] == 1) {
					local975 = true;
				} else {
					local975 = false;
				}
				@Pc(1138) Class69 local1138;
				@Pc(1209) Class69 local1209;
				@Pc(1019) Class69 local1019;
				@Pc(1044) int local1044;
				@Pc(1002) int local1002;
				if (local213 < 300) {
					if (local213 == 100) {
						local29 -= 3;
						local782 = Static51.anIntArray101[local29 + 1];
						local1002 = Static51.anIntArray101[local29 + 2];
						local777 = Static51.anIntArray101[local29];
						if (local782 == 0) {
							throw new RuntimeException();
						}
						local1019 = Static157.method2392(local777);
						if (local1019.aClass69Array2 == null) {
							local1019.aClass69Array2 = new Class69[local1002 + 1];
						}
						if (local1019.aClass69Array2.length <= local1002) {
							@Pc(1042) Class69[] local1042 = new Class69[local1002 + 1];
							for (local1044 = 0; local1044 < local1019.aClass69Array2.length; local1044++) {
								local1042[local1044] = local1019.aClass69Array2[local1044];
							}
							local1019.aClass69Array2 = local1042;
						}
						if (local1002 > 0 && local1019.aClass69Array2[local1002 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1002 - 1));
						}
						@Pc(1095) Class69 local1095 = new Class69();
						local1095.aBoolean103 = true;
						local1095.anInt2475 = local1002;
						local1095.anInt2498 = local1095.anInt2523 = local1019.anInt2523;
						local1095.anInt2474 = local782;
						local1019.aClass69Array2[local1002] = local1095;
						if (local975) {
							Static29.aClass69_1 = local1095;
						} else {
							Static117.aClass69_8 = local1095;
						}
						Static184.method2779(local1019);
						continue;
					}
					@Pc(1159) Class69 local1159;
					if (local213 == 101) {
						local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
						if (local1138.anInt2475 == -1) {
							if (!local975) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1159 = Static157.method2392(local1138.anInt2523);
						local1159.aClass69Array2[local1138.anInt2475] = null;
						Static184.method2779(local1159);
						continue;
					}
					if (local213 == 102) {
						local29--;
						local1138 = Static157.method2392(Static51.anIntArray101[local29]);
						local1138.aClass69Array2 = null;
						Static184.method2779(local1138);
						continue;
					}
					if (local213 == 200) {
						local29 -= 2;
						local777 = Static51.anIntArray101[local29];
						local782 = Static51.anIntArray101[local29 + 1];
						local1209 = Static201.method1363(local777, local782);
						if (local1209 != null && local782 != -1) {
							Static51.anIntArray101[local29++] = 1;
							if (local975) {
								Static29.aClass69_1 = local1209;
							} else {
								Static117.aClass69_8 = local1209;
							}
							continue;
						}
						Static51.anIntArray101[local29++] = 0;
						continue;
					}
					if (local213 == 201) {
						local29--;
						local777 = Static51.anIntArray101[local29];
						local1159 = Static157.method2392(local777);
						if (local1159 == null) {
							Static51.anIntArray101[local29++] = 0;
						} else {
							Static51.anIntArray101[local29++] = 1;
							if (local975) {
								Static29.aClass69_1 = local1159;
							} else {
								Static117.aClass69_8 = local1159;
							}
						}
						continue;
					}
				} else if (local213 < 500) {
					if (local213 == 403) {
						local29 -= 2;
						local782 = Static51.anIntArray101[local29 + 1];
						local777 = Static51.anIntArray101[local29];
						if (local777 >= 7) {
							local777 -= 7;
						}
						Static210.aClass1_Sub2_Sub2_2.aClass56_1.method1698(local782, local777);
						continue;
					}
					if (local213 == 404) {
						local29 -= 2;
						local777 = Static51.anIntArray101[local29];
						local782 = Static51.anIntArray101[local29 + 1];
						Static210.aClass1_Sub2_Sub2_2.aClass56_1.method1701(local777, local782);
						continue;
					}
					if (local213 == 410) {
						local29--;
						@Pc(1348) boolean local1348 = Static51.anIntArray101[local29] != 0;
						Static210.aClass1_Sub2_Sub2_2.aClass56_1.method1702(local1348);
						continue;
					}
				} else if ((local213 < 1000 || local213 >= 1100) && (local213 < 2000 || local213 >= 2100)) {
					@Pc(1463) Class20 local1463;
					if (local213 >= 1100 && local213 < 1200 || local213 >= 2100 && local213 < 2200) {
						if (local213 >= 2000) {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							local213 -= 1000;
						} else {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
						}
						if (local213 == 1100) {
							local29 -= 2;
							local1138.anInt2478 = Static51.anIntArray101[local29];
							if (local1138.anInt2542 - local1138.anInt2541 < local1138.anInt2478) {
								local1138.anInt2478 = local1138.anInt2542 - local1138.anInt2541;
							}
							if (local1138.anInt2478 < 0) {
								local1138.anInt2478 = 0;
							}
							local1138.anInt2514 = Static51.anIntArray101[local29 + 1];
							if (local1138.anInt2514 > local1138.anInt2517 - local1138.anInt2471) {
								local1138.anInt2514 = local1138.anInt2517 - local1138.anInt2471;
							}
							if (local1138.anInt2514 < 0) {
								local1138.anInt2514 = 0;
							}
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1101) {
							local29--;
							local1138.anInt2487 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1102) {
							local29--;
							local1138.aBoolean110 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1103) {
							local29--;
							local1138.anInt2540 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1104) {
							local29--;
							local1138.anInt2502 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1105) {
							local29--;
							local1138.anInt2505 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1106) {
							local29--;
							local1138.anInt2473 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1107) {
							local29--;
							local1138.aBoolean109 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1108) {
							local1138.anInt2532 = 1;
							local29--;
							local1138.anInt2520 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1109) {
							local29 -= 6;
							local1138.anInt2480 = Static51.anIntArray101[local29];
							local1138.anInt2506 = Static51.anIntArray101[local29 + 1];
							local1138.anInt2529 = Static51.anIntArray101[local29 + 2];
							local1138.anInt2531 = Static51.anIntArray101[local29 + 3];
							local1138.anInt2472 = Static51.anIntArray101[local29 + 4];
							local1138.anInt2496 = Static51.anIntArray101[local29 + 5];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1110) {
							local29--;
							local782 = Static51.anIntArray101[local29];
							if (local782 != local1138.anInt2476) {
								local1138.anInt2476 = local782;
								local1138.anInt2482 = 0;
								local1138.anInt2525 = 0;
								Static184.method2779(local1138);
							}
							continue;
						}
						if (local213 == 1111) {
							local29--;
							local1138.aBoolean102 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1112) {
							local31--;
							local1463 = Static153.aClass20Array26[local31];
							if (!local1463.method594(local1138.aClass20_920)) {
								local1138.aClass20_920 = local1463;
								Static184.method2779(local1138);
							}
							continue;
						}
						if (local213 == 1113) {
							local29--;
							local1138.anInt2504 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1114) {
							local29 -= 3;
							local1138.anInt2544 = Static51.anIntArray101[local29];
							local1138.anInt2493 = Static51.anIntArray101[local29 + 1];
							local1138.anInt2501 = Static51.anIntArray101[local29 + 2];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1115) {
							local29--;
							local1138.aBoolean108 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1116) {
							local29--;
							local1138.anInt2543 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1117) {
							local29--;
							local1138.anInt2516 = Static51.anIntArray101[local29];
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1118) {
							local29--;
							local1138.aBoolean104 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1119) {
							local29--;
							local1138.aBoolean115 = Static51.anIntArray101[local29] == 1;
							Static184.method2779(local1138);
							continue;
						}
						if (local213 == 1120) {
							local29 -= 2;
							local1138.anInt2542 = Static51.anIntArray101[local29];
							local1138.anInt2517 = Static51.anIntArray101[local29 + 1];
							Static184.method2779(local1138);
							if (local1138.anInt2474 == 0) {
								Static115.method1845(local1138);
							}
							continue;
						}
					} else if (local213 >= 1200 && local213 < 1300 || local213 >= 2200 && local213 < 2300) {
						if (local213 >= 2000) {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							local213 -= 1000;
						} else {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
						}
						Static184.method2779(local1138);
						if (local213 == 1200 || local213 == 1205) {
							local29 -= 2;
							local782 = Static51.anIntArray101[local29];
							local1002 = Static51.anIntArray101[local29 + 1];
							if (local782 == -1) {
								local1138.anInt2520 = -1;
								local1138.anInt2532 = 1;
								local1138.anInt2537 = -1;
							} else {
								local1138.anInt2537 = local782;
								local1138.anInt2545 = local1002;
								@Pc(8385) Class5_Sub2_Sub11 local8385 = Static196.method2908(local782);
								if (local213 == 1205) {
									local1138.aBoolean106 = false;
								} else {
									local1138.aBoolean106 = true;
								}
								local1138.anInt2531 = local8385.anInt2349;
								local1138.anInt2480 = local8385.anInt2332;
								local1138.anInt2529 = local8385.anInt2310;
								local1138.anInt2472 = local8385.anInt2316;
								local1138.anInt2506 = local8385.anInt2317;
								local1138.anInt2496 = local8385.anInt2315;
								if (local1138.anInt2481 > 0) {
									local1138.anInt2496 = local1138.anInt2496 * 32 / local1138.anInt2481;
								} else if (local1138.anInt2533 > 0) {
									local1138.anInt2496 = local1138.anInt2496 * 32 / local1138.anInt2533;
								}
							}
							continue;
						}
						if (local213 == 1201) {
							local1138.anInt2532 = 2;
							local29--;
							local1138.anInt2520 = Static51.anIntArray101[local29];
							continue;
						}
						if (local213 == 1202) {
							local1138.anInt2532 = 3;
							local1138.anInt2520 = Static210.aClass1_Sub2_Sub2_2.aClass56_1.method1700();
							continue;
						}
						if (local213 == 1203) {
							local1138.anInt2532 = 6;
							local29--;
							local1138.anInt2520 = Static51.anIntArray101[local29];
							continue;
						}
						if (local213 == 1204) {
							local1138.anInt2532 = 5;
							local29--;
							local1138.anInt2520 = Static51.anIntArray101[local29];
							continue;
						}
					} else if (local213 >= 1300 && local213 < 1400 || local213 >= 2300 && local213 < 2400) {
						if (local213 < 2000) {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
						} else {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							local213 -= 1000;
						}
						if (local213 == 1300) {
							local29--;
							local782 = Static51.anIntArray101[local29] - 1;
							if (local782 >= 0 && local782 <= 9) {
								local31--;
								local1138.method1890(local782, Static153.aClass20Array26[local31]);
								continue;
							}
							local31--;
							continue;
						}
						if (local213 == 1301) {
							local29 -= 2;
							local782 = Static51.anIntArray101[local29];
							local1002 = Static51.anIntArray101[local29 + 1];
							local1138.aClass69_10 = Static201.method1363(local782, local1002);
							continue;
						}
						if (local213 == 1302) {
							local29--;
							local1138.aBoolean107 = Static51.anIntArray101[local29] == 1;
							continue;
						}
						if (local213 == 1303) {
							local29--;
							local1138.anInt2490 = Static51.anIntArray101[local29];
							continue;
						}
						if (local213 == 1304) {
							local29--;
							local1138.anInt2483 = Static51.anIntArray101[local29];
							continue;
						}
						if (local213 == 1305) {
							local31--;
							local1138.aClass20_922 = Static153.aClass20Array26[local31];
							continue;
						}
						if (local213 == 1306) {
							local31--;
							local1138.aClass20_915 = Static153.aClass20Array26[local31];
							continue;
						}
						if (local213 == 1307) {
							local1138.aClass20Array19 = null;
							continue;
						}
					} else {
						if (local213 >= 1400 && local213 < 1500 || local213 >= 2400 && local213 < 2500) {
							if (local213 >= 2000) {
								local29--;
								local1138 = Static157.method2392(Static51.anIntArray101[local29]);
								local213 -= 1000;
							} else {
								local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
							}
							@Pc(1458) int[] local1458 = null;
							local31--;
							local1463 = Static153.aClass20Array26[local31];
							if (local1463.method582() > 0 && local1463.method577(local1463.method582() - 1) == 89) {
								local29--;
								local625 = Static51.anIntArray101[local29];
								if (local625 > 0) {
									local1458 = new int[local625];
									while (local625-- > 0) {
										local29--;
										local1458[local625] = Static51.anIntArray101[local29];
									}
								}
								local1463 = local1463.method559(local1463.method582() - 1, 0);
							}
							@Pc(1524) Object[] local1524 = new Object[local1463.method582() + 1];
							for (local650 = local1524.length - 1; local650 >= 1; local650--) {
								if (local1463.method577(local650 - 1) == 115) {
									local31--;
									local1524[local650] = Static153.aClass20Array26[local31];
								} else {
									local29--;
									local1524[local650] = Integer.valueOf(Static51.anIntArray101[local29]);
								}
							}
							local29--;
							local1044 = Static51.anIntArray101[local29];
							if (local1044 == -1) {
								local1524 = null;
							} else {
								local1524[0] = Integer.valueOf(local1044);
							}
							if (local213 == 1423) {
								local1138.anObjectArray28 = local1524;
							}
							if (local213 == 1400) {
								local1138.anObjectArray6 = local1524;
							}
							if (local213 == 1402) {
								local1138.anObjectArray10 = local1524;
							}
							if (local213 == 1418) {
								local1138.anObjectArray19 = local1524;
							}
							if (local213 == 1416) {
								local1138.anObjectArray11 = local1524;
							}
							if (local213 == 1407) {
								local1138.anObjectArray16 = local1524;
								local1138.anIntArray285 = local1458;
							}
							if (local213 == 1419) {
								local1138.anObjectArray17 = local1524;
							}
							if (local213 == 1420) {
								local1138.anObjectArray25 = local1524;
							}
							if (local213 == 1404) {
								local1138.anObjectArray21 = local1524;
							}
							if (local213 == 1403) {
								local1138.anObjectArray14 = local1524;
							}
							if (local213 == 1408) {
								local1138.anObjectArray4 = local1524;
							}
							if (local213 == 1424) {
								local1138.anObjectArray8 = local1524;
							}
							if (local213 == 1406) {
								local1138.anObjectArray7 = local1524;
							}
							if (local213 == 1425) {
								local1138.anObjectArray22 = local1524;
							}
							if (local213 == 1410) {
								local1138.anObjectArray20 = local1524;
							}
							if (local213 == 1405) {
								local1138.anObjectArray18 = local1524;
							}
							if (local213 == 1409) {
								local1138.anObjectArray27 = local1524;
							}
							if (local213 == 1411) {
								local1138.anObjectArray23 = local1524;
							}
							if (local213 == 1401) {
								local1138.anObjectArray9 = local1524;
							}
							local1138.aBoolean111 = true;
							if (local213 == 1421) {
								local1138.anObjectArray29 = local1524;
							}
							if (local213 == 1422) {
								local1138.anObjectArray24 = local1524;
							}
							if (local213 == 1412) {
								local1138.anObjectArray5 = local1524;
							}
							if (local213 == 1414) {
								local1138.anObjectArray13 = local1524;
								local1138.anIntArray281 = local1458;
							}
							if (local213 == 1415) {
								local1138.anObjectArray12 = local1524;
								local1138.anIntArray284 = local1458;
							}
							if (local213 == 1417) {
								local1138.anObjectArray15 = local1524;
							}
							continue;
						}
						if (local213 < 1600) {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
							if (local213 == 1500) {
								Static51.anIntArray101[local29++] = local1138.anInt2536;
								continue;
							}
							if (local213 == 1501) {
								Static51.anIntArray101[local29++] = local1138.anInt2539;
								continue;
							}
							if (local213 == 1502) {
								Static51.anIntArray101[local29++] = local1138.anInt2541;
								continue;
							}
							if (local213 == 1503) {
								Static51.anIntArray101[local29++] = local1138.anInt2471;
								continue;
							}
							if (local213 == 1504) {
								Static51.anIntArray101[local29++] = local1138.aBoolean114 ? 1 : 0;
								continue;
							}
							if (local213 == 1505) {
								Static51.anIntArray101[local29++] = local1138.anInt2498;
								continue;
							}
						} else if (local213 < 1700) {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
							if (local213 == 1600) {
								Static51.anIntArray101[local29++] = local1138.anInt2478;
								continue;
							}
							if (local213 == 1601) {
								Static51.anIntArray101[local29++] = local1138.anInt2514;
								continue;
							}
							if (local213 == 1602) {
								Static153.aClass20Array26[local31++] = local1138.aClass20_920;
								continue;
							}
							if (local213 == 1603) {
								Static51.anIntArray101[local29++] = local1138.anInt2542;
								continue;
							}
							if (local213 == 1604) {
								Static51.anIntArray101[local29++] = local1138.anInt2517;
								continue;
							}
							if (local213 == 1605) {
								Static51.anIntArray101[local29++] = local1138.anInt2496;
								continue;
							}
							if (local213 == 1606) {
								Static51.anIntArray101[local29++] = local1138.anInt2529;
								continue;
							}
							if (local213 == 1607) {
								Static51.anIntArray101[local29++] = local1138.anInt2472;
								continue;
							}
							if (local213 == 1608) {
								Static51.anIntArray101[local29++] = local1138.anInt2531;
								continue;
							}
							if (local213 == 1609) {
								Static51.anIntArray101[local29++] = local1138.anInt2540;
								continue;
							}
						} else if (local213 < 1800) {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
							if (local213 == 1700) {
								Static51.anIntArray101[local29++] = local1138.anInt2537;
								continue;
							}
							if (local213 == 1701) {
								if (local1138.anInt2537 == -1) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local1138.anInt2545;
								}
								continue;
							}
							if (local213 == 1702) {
								Static51.anIntArray101[local29++] = local1138.anInt2475;
								continue;
							}
						} else if (local213 < 1900) {
							local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
							if (local213 == 1800) {
								Static51.anIntArray101[local29++] = Static145.method2238(Static94.method1538(local1138));
								continue;
							}
							if (local213 == 1801) {
								local29--;
								local782 = Static51.anIntArray101[local29];
								local782--;
								if (local1138.aClass20Array19 != null && local1138.aClass20Array19.length > local782 && local1138.aClass20Array19[local782] != null) {
									Static153.aClass20Array26[local31++] = local1138.aClass20Array19[local782];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 1802) {
								if (local1138.aClass20_922 == null) {
									Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								} else {
									Static153.aClass20Array26[local31++] = local1138.aClass20_922;
								}
								continue;
							}
						} else if (local213 < 2600) {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							if (local213 == 2500) {
								Static51.anIntArray101[local29++] = local1138.anInt2536;
								continue;
							}
							if (local213 == 2501) {
								Static51.anIntArray101[local29++] = local1138.anInt2539;
								continue;
							}
							if (local213 == 2502) {
								Static51.anIntArray101[local29++] = local1138.anInt2541;
								continue;
							}
							if (local213 == 2503) {
								Static51.anIntArray101[local29++] = local1138.anInt2471;
								continue;
							}
							if (local213 == 2504) {
								Static51.anIntArray101[local29++] = local1138.aBoolean114 ? 1 : 0;
								continue;
							}
							if (local213 == 2505) {
								Static51.anIntArray101[local29++] = local1138.anInt2498;
								continue;
							}
						} else if (local213 < 2700) {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							if (local213 == 2600) {
								Static51.anIntArray101[local29++] = local1138.anInt2478;
								continue;
							}
							if (local213 == 2601) {
								Static51.anIntArray101[local29++] = local1138.anInt2514;
								continue;
							}
							if (local213 == 2602) {
								Static153.aClass20Array26[local31++] = local1138.aClass20_920;
								continue;
							}
							if (local213 == 2603) {
								Static51.anIntArray101[local29++] = local1138.anInt2542;
								continue;
							}
							if (local213 == 2604) {
								Static51.anIntArray101[local29++] = local1138.anInt2517;
								continue;
							}
							if (local213 == 2605) {
								Static51.anIntArray101[local29++] = local1138.anInt2496;
								continue;
							}
							if (local213 == 2606) {
								Static51.anIntArray101[local29++] = local1138.anInt2529;
								continue;
							}
							if (local213 == 2607) {
								Static51.anIntArray101[local29++] = local1138.anInt2472;
								continue;
							}
							if (local213 == 2608) {
								Static51.anIntArray101[local29++] = local1138.anInt2531;
								continue;
							}
							if (local213 == 2609) {
								Static51.anIntArray101[local29++] = local1138.anInt2540;
								continue;
							}
						} else if (local213 < 2800) {
							if (local213 == 2700) {
								local29--;
								local1138 = Static157.method2392(Static51.anIntArray101[local29]);
								Static51.anIntArray101[local29++] = local1138.anInt2537;
								continue;
							}
							if (local213 == 2701) {
								local29--;
								local1138 = Static157.method2392(Static51.anIntArray101[local29]);
								if (local1138.anInt2537 == -1) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local1138.anInt2545;
								}
								continue;
							}
							if (local213 == 2702) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								@Pc(7573) Class5_Sub25 local7573 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local777);
								if (local7573 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = 1;
								}
								continue;
							}
							if (local213 == 2703) {
								local29--;
								local1138 = Static157.method2392(Static51.anIntArray101[local29]);
								if (local1138.aClass69Array2 == null) {
									Static51.anIntArray101[local29++] = 0;
									continue;
								}
								local782 = local1138.aClass69Array2.length;
								for (local1002 = 0; local1002 < local1138.aClass69Array2.length; local1002++) {
									if (local1138.aClass69Array2[local1002] == null) {
										local782 = local1002;
										break;
									}
								}
								Static51.anIntArray101[local29++] = local782;
								continue;
							}
							if (local213 == 2704 || local213 == 2705) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								@Pc(7669) Class5_Sub25 local7669 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local777);
								if (local7669 != null && local782 == local7669.anInt3526) {
									Static51.anIntArray101[local29++] = 1;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
						} else if (local213 < 2900) {
							local29--;
							local1138 = Static157.method2392(Static51.anIntArray101[local29]);
							if (local213 == 2800) {
								Static51.anIntArray101[local29++] = Static145.method2238(Static94.method1538(local1138));
								continue;
							}
							if (local213 == 2801) {
								local29--;
								local782 = Static51.anIntArray101[local29];
								@Pc(1923) int local1923 = local782 - 1;
								if (local1138.aClass20Array19 != null && local1138.aClass20Array19.length > local1923 && local1138.aClass20Array19[local1923] != null) {
									Static153.aClass20Array26[local31++] = local1138.aClass20Array19[local1923];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 2802) {
								if (local1138.aClass20_922 == null) {
									Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								} else {
									Static153.aClass20Array26[local31++] = local1138.aClass20_922;
								}
								continue;
							}
						} else if (local213 < 3200) {
							if (local213 == 3100) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static189.method2824(0, local579, Static188.aClass20_1375);
								continue;
							}
							if (local213 == 3101) {
								local29 -= 2;
								Static128.method1996(Static51.anIntArray101[local29 + 1], Static51.anIntArray101[local29], Static210.aClass1_Sub2_Sub2_2);
								continue;
							}
							if (local213 == 3103) {
								Static26.method3045();
								continue;
							}
							if (local213 == 3104) {
								local782 = 0;
								local31--;
								local579 = Static153.aClass20Array26[local31];
								if (local579.method581()) {
									local782 = local579.method553();
								}
								Static43.aClass5_Sub6_Sub1_2.method3087(200);
								Static43.aClass5_Sub6_Sub1_2.method3030(local782);
								continue;
							}
							if (local213 == 3105) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static43.aClass5_Sub6_Sub1_2.method3087(179);
								Static43.aClass5_Sub6_Sub1_2.method3037(local579.method595());
								continue;
							}
							if (local213 == 3106) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static43.aClass5_Sub6_Sub1_2.method3087(106);
								Static43.aClass5_Sub6_Sub1_2.method3061(local579.method582() + 1);
								Static43.aClass5_Sub6_Sub1_2.method3047(local579);
								continue;
							}
							if (local213 == 3107) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local31--;
								local1463 = Static153.aClass20Array26[local31];
								Static186.method2813(local777, local1463);
								continue;
							}
							if (local213 == 3108) {
								local29 -= 3;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								local1002 = Static51.anIntArray101[local29 + 2];
								local1019 = Static157.method2392(local1002);
								Static3.method99(local1019, local782, local777);
								continue;
							}
							if (local213 == 3109) {
								local1209 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static3.method99(local1209, local782, local777);
								continue;
							}
							if (local213 == 3110) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static43.aClass5_Sub6_Sub1_2.method3087(112);
								Static43.aClass5_Sub6_Sub1_2.method3044(local777);
								continue;
							}
						} else if (local213 < 3300) {
							if (local213 == 3200) {
								local29 -= 3;
								Static49.method882(Static51.anIntArray101[local29 + 1], Static51.anIntArray101[local29 + 2], Static51.anIntArray101[local29]);
								continue;
							}
							if (local213 == 3201) {
								local29--;
								Static5.method132(Static51.anIntArray101[local29]);
								continue;
							}
							if (local213 == 3202) {
								local29 -= 2;
								Static75.method1222(Static51.anIntArray101[local29 + 1], Static51.anIntArray101[local29]);
								continue;
							}
						} else if (local213 < 3400) {
							if (local213 == 3300) {
								Static51.anIntArray101[local29++] = Static177.anInt3533;
								continue;
							}
							if (local213 == 3301) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static129.method2012(local782, local777);
								continue;
							}
							if (local213 == 3302) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static212.method3127(local782, local777);
								continue;
							}
							if (local213 == 3303) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static166.method2507(local777, local782);
								continue;
							}
							if (local213 == 3304) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static100.method1690(local777).anInt3628;
								continue;
							}
							if (local213 == 3305) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static41.anIntArray89[local777];
								continue;
							}
							if (local213 == 3306) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static218.anIntArray431[local777];
								continue;
							}
							if (local213 == 3307) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static101.anIntArray213[local777];
								continue;
							}
							if (local213 == 3308) {
								local777 = Static111.anInt2327;
								local782 = (Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7) + Static86.anInt1895;
								local1002 = (Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7) + Static110.anInt2295;
								Static51.anIntArray101[local29++] = (local782 << 14) + (local777 << 28) + local1002;
								continue;
							}
							if (local213 == 3309) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local777 >> 14 & 0x3FFF;
								continue;
							}
							if (local213 == 3310) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local777 >> 28;
								continue;
							}
							if (local213 == 3311) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local777 & 0x3FFF;
								continue;
							}
							if (local213 == 3312) {
								Static51.anIntArray101[local29++] = Static148.aBoolean131 ? 1 : 0;
								continue;
							}
							if (local213 == 3313) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29] + 32768;
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static129.method2012(local782, local777);
								continue;
							}
							if (local213 == 3314) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29] + 32768;
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static212.method3127(local782, local777);
								continue;
							}
							if (local213 == 3315) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29] + 32768;
								Static51.anIntArray101[local29++] = Static166.method2507(local777, local782);
								continue;
							}
							if (local213 == 3316) {
								if (Static80.anInt1803 < 2) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = Static80.anInt1803;
								}
								continue;
							}
							if (local213 == 3317) {
								Static51.anIntArray101[local29++] = Static67.anInt3979;
								continue;
							}
							if (local213 == 3318) {
								Static51.anIntArray101[local29++] = Static40.anInt844;
								continue;
							}
							if (local213 == 3321) {
								Static51.anIntArray101[local29++] = Static166.anInt3315;
								continue;
							}
							if (local213 == 3322) {
								Static51.anIntArray101[local29++] = Static75.anInt1622;
								continue;
							}
							if (local213 == 3323) {
								if (Static202.anInt3970 >= 5 && Static202.anInt3970 <= 9) {
									Static51.anIntArray101[local29++] = 1;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3324) {
								if (Static202.anInt3970 >= 5 && Static202.anInt3970 <= 9) {
									Static51.anIntArray101[local29++] = Static202.anInt3970;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3325) {
								if (Static60.anInt1348 > 0) {
									Static51.anIntArray101[local29++] = 1;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
							if (local213 == 3326) {
								Static51.anIntArray101[local29++] = Static210.aClass1_Sub2_Sub2_2.anInt2275;
								continue;
							}
							if (local213 == 3327) {
								Static51.anIntArray101[local29++] = Static210.aClass1_Sub2_Sub2_2.aClass56_1.aBoolean93 ? 1 : 0;
								continue;
							}
							if (local213 == 3328) {
								Static51.anIntArray101[local29++] = Static127.anInt2649;
								continue;
							}
							if (local213 == 3329) {
								Static51.anIntArray101[local29++] = Static68.anInt1469;
								continue;
							}
						} else if (local213 < 3500) {
							if (local213 == 3400) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								@Pc(6827) Class5_Sub2_Sub13 local6827 = Static7.method166(local777);
								Static153.aClass20Array26[local31++] = local6827.method1969(local782);
								continue;
							}
							if (local213 == 3408) {
								local29 -= 4;
								local777 = Static51.anIntArray101[local29];
								local1002 = Static51.anIntArray101[local29 + 2];
								local782 = Static51.anIntArray101[local29 + 1];
								local625 = Static51.anIntArray101[local29 + 3];
								@Pc(6867) Class5_Sub2_Sub13 local6867 = Static7.method166(local1002);
								if (local777 == local6867.anInt2644 && local6867.anInt2635 == local782) {
									if (local782 == 115) {
										Static153.aClass20Array26[local31++] = local6867.method1969(local625);
									} else {
										Static51.anIntArray101[local29++] = local6867.method1965(local625);
									}
									continue;
								}
								if (local782 == 115) {
									Static153.aClass20Array26[local31++] = Static84.aClass20_675;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
						} else if (local213 < 3700) {
							if (local213 == 3600) {
								if (Static69.anInt1507 == 0) {
									Static51.anIntArray101[local29++] = -2;
								} else if (Static69.anInt1507 == 1) {
									Static51.anIntArray101[local29++] = -1;
								} else {
									Static51.anIntArray101[local29++] = Static91.anInt1957;
								}
								continue;
							}
							if (local213 == 3601) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 == 2 && local777 < Static91.anInt1957) {
									Static153.aClass20Array26[local31++] = Static70.aClass20Array7[local777];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 3602) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 == 2 && local777 < Static91.anInt1957) {
									Static51.anIntArray101[local29++] = Static142.anIntArray315[local777];
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3603) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 == 2 && local777 < Static91.anInt1957) {
									Static51.anIntArray101[local29++] = Static24.anIntArray31[local777];
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3604) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29--;
								local782 = Static51.anIntArray101[local29];
								Static117.method1869(local782, local579);
								continue;
							}
							if (local213 == 3605) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static91.method1506(local579.method595());
								continue;
							}
							if (local213 == 3606) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static6.method155(local579.method595());
								continue;
							}
							if (local213 == 3607) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static2.method47(local579.method595());
								continue;
							}
							if (local213 == 3608) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static116.method1865(local579.method595());
								continue;
							}
							if (local213 == 3609) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								if (local579.method587(Static179.aClass20_1314) || local579.method587(Static29.aClass20_218)) {
									local579 = local579.method549(7);
								}
								Static51.anIntArray101[local29++] = Static86.method1467(local579) ? 1 : 0;
								continue;
							}
							if (local213 == 3610) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 == 2 && Static91.anInt1957 > local777) {
									Static153.aClass20Array26[local31++] = Static178.aClass20Array27[local777];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 3611) {
								if (Static38.aClass20_281 == null) {
									Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								} else {
									Static153.aClass20Array26[local31++] = Static38.aClass20_281.method565();
								}
								continue;
							}
							if (local213 == 3612) {
								if (Static38.aClass20_281 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = Static118.anInt3271;
								}
								continue;
							}
							if (local213 == 3613) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static38.aClass20_281 != null && Static118.anInt3271 > local777) {
									Static153.aClass20Array26[local31++] = Static129.aClass5_Sub19Array1[local777].aClass20_903.method565();
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 3614) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static38.aClass20_281 != null && local777 < Static118.anInt3271) {
									Static51.anIntArray101[local29++] = Static129.aClass5_Sub19Array1[local777].anInt2436;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3615) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static38.aClass20_281 != null && local777 < Static118.anInt3271) {
									Static51.anIntArray101[local29++] = Static129.aClass5_Sub19Array1[local777].aByte5;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3616) {
								Static51.anIntArray101[local29++] = Static196.aByte13;
								continue;
							}
							if (local213 == 3617) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static171.method2626(local579);
								continue;
							}
							if (local213 == 3618) {
								Static51.anIntArray101[local29++] = Static74.aByte3;
								continue;
							}
							if (local213 == 3619) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static181.method2740(local579.method595());
								continue;
							}
							if (local213 == 3620) {
								Static78.method1241();
								continue;
							}
							if (local213 == 3621) {
								if (Static69.anInt1507 == 0) {
									Static51.anIntArray101[local29++] = -1;
								} else {
									Static51.anIntArray101[local29++] = Static50.anInt1082;
								}
								continue;
							}
							if (local213 == 3622) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 != 0 && Static50.anInt1082 > local777) {
									Static153.aClass20Array26[local31++] = Static160.method2438(Static168.aLongArray39[local777]).method565();
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 3623) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								if (local579.method587(Static179.aClass20_1314) || local579.method587(Static29.aClass20_218)) {
									local579 = local579.method549(7);
								}
								Static51.anIntArray101[local29++] = Static30.method460(local579) ? 1 : 0;
								continue;
							}
							if (local213 == 3624) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static129.aClass5_Sub19Array1 != null && local777 < Static118.anInt3271 && Static129.aClass5_Sub19Array1[local777].aClass20_903.method551(Static210.aClass1_Sub2_Sub2_2.aClass20_848)) {
									Static51.anIntArray101[local29++] = 1;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
							if (local213 == 3625) {
								if (Static29.aClass20_219 == null) {
									Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								} else {
									Static153.aClass20Array26[local31++] = Static29.aClass20_219.method565();
								}
								continue;
							}
							if (local213 == 3626) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static38.aClass20_281 != null && local777 < Static118.anInt3271) {
									Static153.aClass20Array26[local31++] = Static129.aClass5_Sub19Array1[local777].aClass20_901;
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 3627) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								if (Static69.anInt1507 == 2 && local777 < Static91.anInt1957) {
									Static51.anIntArray101[local29++] = Static209.aBooleanArray50[local777] ? 1 : 0;
									continue;
								}
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
						} else if (local213 < 4000) {
							if (local213 == 3903) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].method2703();
								continue;
							}
							if (local213 == 3904) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].anInt3565;
								continue;
							}
							if (local213 == 3905) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].anInt3571;
								continue;
							}
							if (local213 == 3906) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].anInt3576;
								continue;
							}
							if (local213 == 3907) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].anInt3567;
								continue;
							}
							if (local213 == 3908) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static175.aClass92Array1[local777].anInt3569;
								continue;
							}
							if (local213 == 3910) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = Static175.aClass92Array1[local777].method2705();
								Static51.anIntArray101[local29++] = local782 == 0 ? 1 : 0;
								continue;
							}
							if (local213 == 3911) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = Static175.aClass92Array1[local777].method2705();
								Static51.anIntArray101[local29++] = local782 == 2 ? 1 : 0;
								continue;
							}
							if (local213 == 3912) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = Static175.aClass92Array1[local777].method2705();
								Static51.anIntArray101[local29++] = local782 == 5 ? 1 : 0;
								continue;
							}
							if (local213 == 3913) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = Static175.aClass92Array1[local777].method2705();
								Static51.anIntArray101[local29++] = local782 == 1 ? 1 : 0;
								continue;
							}
						} else if (local213 < 4100) {
							if (local213 == 4000) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local777 + local782;
								continue;
							}
							if (local213 == 4001) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local777 - local782;
								continue;
							}
							if (local213 == 4002) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local782 * local777;
								continue;
							}
							if (local213 == 4003) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local777 / local782;
								continue;
							}
							if (local213 == 4004) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = (int) (Math.random() * (double) local777);
								continue;
							}
							if (local213 == 4005) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = (int) ((double) (local777 + 1) * Math.random());
								continue;
							}
							if (local213 == 4006) {
								local29 -= 5;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								local650 = Static51.anIntArray101[local29 + 4];
								local625 = Static51.anIntArray101[local29 + 3];
								local1002 = Static51.anIntArray101[local29 + 2];
								Static51.anIntArray101[local29++] = local777 + (local650 - local1002) * (local782 - local777) / (local625 - local1002);
								continue;
							}
							@Pc(5715) long local5715;
							@Pc(5720) long local5720;
							if (local213 == 4007) {
								local29 -= 2;
								local5715 = Static51.anIntArray101[local29 + 1];
								local5720 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = (int) (local5715 * local5720 / 100L + local5720);
								continue;
							}
							if (local213 == 4008) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local777 | 0x1 << local782;
								continue;
							}
							if (local213 == 4009) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = -(0x1 << local782) - 1 & local777;
								continue;
							}
							if (local213 == 4010) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = (local777 & 0x1 << local782) == 0 ? 0 : 1;
								continue;
							}
							if (local213 == 4011) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local777 % local782;
								continue;
							}
							if (local213 == 4012) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								if (local777 == 0) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = (int) Math.pow((double) local777, (double) local782);
								}
								continue;
							}
							if (local213 == 4013) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								if (local777 == 0) {
									Static51.anIntArray101[local29++] = 0;
								} else if (local782 == 0) {
									Static51.anIntArray101[local29++] = Integer.MAX_VALUE;
								} else {
									Static51.anIntArray101[local29++] = (int) Math.pow((double) local777, 1.0D / (double) local782);
								}
								continue;
							}
							if (local213 == 4014) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local782 & local777;
								continue;
							}
							if (local213 == 4015) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local782 | local777;
								continue;
							}
							if (local213 == 4016) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local782 > local777 ? local777 : local782;
								continue;
							}
							if (local213 == 4017) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = local782 >= local777 ? local782 : local777;
								continue;
							}
							if (local213 == 4018) {
								local29 -= 3;
								local5720 = Static51.anIntArray101[local29];
								local5715 = Static51.anIntArray101[local29 + 1];
								@Pc(6067) long local6067 = (long) Static51.anIntArray101[local29 + 2];
								Static51.anIntArray101[local29++] = (int) (local5720 * local6067 / local5715);
								continue;
							}
						} else if (local213 < 4200) {
							if (local213 == 4100) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29--;
								local782 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static70.method1166(new Class20[] { local579, Static132.method2805(local782) });
								continue;
							}
							if (local213 == 4101) {
								local31 -= 2;
								local579 = Static153.aClass20Array26[local31];
								local1463 = Static153.aClass20Array26[local31 + 1];
								Static153.aClass20Array26[local31++] = Static70.method1166(new Class20[] { local579, local1463 });
								continue;
							}
							if (local213 == 4102) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29--;
								local782 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static70.method1166(new Class20[] { local579, Static38.method643(local782) });
								continue;
							}
							if (local213 == 4103) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static153.aClass20Array26[local31++] = local579.method563();
								continue;
							}
							if (local213 == 4104) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								@Pc(4877) long local4877 = ((long) local777 + 11745L) * 86400000L;
								Static61.aCalendar1.setTime(new Date(local4877));
								local625 = Static61.aCalendar1.get(5);
								local650 = Static61.aCalendar1.get(2);
								local1044 = Static61.aCalendar1.get(1);
								Static153.aClass20Array26[local31++] = Static70.method1166(new Class20[] { Static132.method2805(local625), Static93.aClass20_1198, Static165.aClass20Array16[local650], Static93.aClass20_1198, Static132.method2805(local1044) });
								continue;
							}
							if (local213 == 4105) {
								local31 -= 2;
								local1463 = Static153.aClass20Array26[local31 + 1];
								local579 = Static153.aClass20Array26[local31];
								if (Static210.aClass1_Sub2_Sub2_2.aClass56_1 != null && Static210.aClass1_Sub2_Sub2_2.aClass56_1.aBoolean93) {
									Static153.aClass20Array26[local31++] = local1463;
									continue;
								}
								Static153.aClass20Array26[local31++] = local579;
								continue;
							}
							if (local213 == 4106) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static132.method2805(local777);
								continue;
							}
							if (local213 == 4107) {
								local31 -= 2;
								Static51.anIntArray101[local29++] = Static153.aClass20Array26[local31].method578(Static153.aClass20Array26[local31 + 1]);
								continue;
							}
							@Pc(5037) Class5_Sub2_Sub8_Sub1_Sub1 local5037;
							@Pc(5032) byte[] local5032;
							if (local213 == 4108) {
								local29 -= 2;
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local782 = Static51.anIntArray101[local29];
								local1002 = Static51.anIntArray101[local29 + 1];
								local5032 = Static185.aClass23_Sub1_25.method738(0, local1002);
								local5037 = new Class5_Sub2_Sub8_Sub1_Sub1(local5032);
								local5037.method1345(Static3.aClass47Array1, null);
								Static51.anIntArray101[local29++] = local5037.method1353(local579, local782);
								continue;
							}
							if (local213 == 4109) {
								local29 -= 2;
								local1002 = Static51.anIntArray101[local29 + 1];
								local782 = Static51.anIntArray101[local29];
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local5032 = Static185.aClass23_Sub1_25.method738(0, local1002);
								local5037 = new Class5_Sub2_Sub8_Sub1_Sub1(local5032);
								local5037.method1345(Static3.aClass47Array1, null);
								Static51.anIntArray101[local29++] = local5037.method1351(local579, local782);
								continue;
							}
							if (local213 == 4110) {
								local31 -= 2;
								local1463 = Static153.aClass20Array26[local31 + 1];
								local579 = Static153.aClass20Array26[local31];
								local29--;
								if (Static51.anIntArray101[local29] == 1) {
									Static153.aClass20Array26[local31++] = local579;
								} else {
									Static153.aClass20Array26[local31++] = local1463;
								}
								continue;
							}
							if (local213 == 4111) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static153.aClass20Array26[local31++] = Static81.method1358(local579);
								continue;
							}
							if (local213 == 4112) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29--;
								local782 = Static51.anIntArray101[local29];
								if (local782 == -1) {
									throw new RuntimeException("null char");
								}
								Static153.aClass20Array26[local31++] = local579.method576(local782);
								continue;
							}
							if (local213 == 4113) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static28.method423(local777) ? 1 : 0;
								continue;
							}
							if (local213 == 4114) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static62.method1033(local777) ? 1 : 0;
								continue;
							}
							if (local213 == 4115) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static209.method3112(local777) ? 1 : 0;
								continue;
							}
							if (local213 == 4116) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static16.method275(local777) ? 1 : 0;
								continue;
							}
							if (local213 == 4117) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								if (local579 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local579.method582();
								}
								continue;
							}
							if (local213 == 4118) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29 -= 2;
								local782 = Static51.anIntArray101[local29];
								local1002 = Static51.anIntArray101[local29 + 1];
								Static153.aClass20Array26[local31++] = local579.method559(local1002, local782);
								continue;
							}
							if (local213 == 4119) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local1463 = Static161.method2451(local579.method582());
								@Pc(5350) boolean local5350 = false;
								for (local625 = 0; local579.method582() > local625; local625++) {
									local650 = local579.method577(local625);
									if (local650 == 60) {
										local5350 = true;
									} else if (local650 == 62) {
										local5350 = false;
									} else if (!local5350) {
										local1463.method567(local650);
									}
								}
								local1463.method589();
								Static153.aClass20Array26[local31++] = local1463;
								continue;
							}
							if (local213 == 4120) {
								local29 -= 2;
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local1002 = Static51.anIntArray101[local29 + 1];
								local782 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local579.method590(local1002, local782);
								continue;
							}
							if (local213 == 4121) {
								local31 -= 2;
								local579 = Static153.aClass20Array26[local31];
								local1463 = Static153.aClass20Array26[local31 + 1];
								local29--;
								local1002 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = local579.method572(local1002, local1463);
								continue;
							}
							if (local213 == 4122) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static191.method2854(local777);
								continue;
							}
							if (local213 == 4123) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static179.method2707(local777);
								continue;
							}
						} else if (local213 < 4300) {
							if (local213 == 4200) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static196.method2908(local777).aClass20_861;
								continue;
							}
							@Pc(4443) Class5_Sub2_Sub11 local4443;
							if (local213 == 4201) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								local4443 = Static196.method2908(local777);
								if (local782 >= 1 && local782 <= 5 && local4443.aClass20Array18[local782 - 1] != null) {
									Static153.aClass20Array26[local31++] = local4443.aClass20Array18[local782 - 1];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 4202) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								local4443 = Static196.method2908(local777);
								if (local782 >= 1 && local782 <= 5 && local4443.aClass20Array17[local782 - 1] != null) {
									Static153.aClass20Array26[local31++] = local4443.aClass20Array17[local782 - 1];
									continue;
								}
								Static153.aClass20Array26[local31++] = Static188.aClass20_1375;
								continue;
							}
							if (local213 == 4203) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static196.method2908(local777).anInt2354;
								continue;
							}
							if (local213 == 4204) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static196.method2908(local777).anInt2314 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4586) Class5_Sub2_Sub11 local4586;
							if (local213 == 4205) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local4586 = Static196.method2908(local777);
								if (local4586.anInt2356 == -1 && local4586.anInt2361 >= 0) {
									Static51.anIntArray101[local29++] = local4586.anInt2361;
									continue;
								}
								Static51.anIntArray101[local29++] = local777;
								continue;
							}
							if (local213 == 4206) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local4586 = Static196.method2908(local777);
								if (local4586.anInt2356 >= 0 && local4586.anInt2361 >= 0) {
									Static51.anIntArray101[local29++] = local4586.anInt2361;
									continue;
								}
								Static51.anIntArray101[local29++] = local777;
								continue;
							}
							if (local213 == 4207) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static196.method2908(local777).aBoolean99 ? 1 : 0;
								continue;
							}
							if (local213 == 4210) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local29--;
								local782 = Static51.anIntArray101[local29];
								Static93.method2413(local782 == 1, local579);
								Static51.anIntArray101[local29++] = Static1.anInt15;
								continue;
							}
							if (local213 == 4211) {
								if (Static16.aShortArray3 != null && Static1.anInt15 > Static129.anInt2696) {
									Static51.anIntArray101[local29++] = Static16.aShortArray3[Static129.anInt2696++] & 0xFFFF;
									continue;
								}
								Static51.anIntArray101[local29++] = -1;
								continue;
							}
							if (local213 == 4212) {
								Static129.anInt2696 = 0;
								continue;
							}
						} else if (local213 < 5100) {
							if (local213 == 5000) {
								Static51.anIntArray101[local29++] = Static15.anInt314;
								continue;
							}
							if (local213 == 5001) {
								local29 -= 3;
								Static15.anInt314 = Static51.anIntArray101[local29];
								Static178.anInt3563 = Static51.anIntArray101[local29 + 1];
								Static57.anInt1304 = Static51.anIntArray101[local29 + 2];
								Static43.aClass5_Sub6_Sub1_2.method3087(54);
								Static43.aClass5_Sub6_Sub1_2.method3061(Static15.anInt314);
								Static43.aClass5_Sub6_Sub1_2.method3061(Static178.anInt3563);
								Static43.aClass5_Sub6_Sub1_2.method3061(Static57.anInt1304);
								continue;
							}
							if (local213 == 5002) {
								local29 -= 2;
								local31--;
								local579 = Static153.aClass20Array26[local31];
								local782 = Static51.anIntArray101[local29];
								local1002 = Static51.anIntArray101[local29 + 1];
								Static43.aClass5_Sub6_Sub1_2.method3087(206);
								Static43.aClass5_Sub6_Sub1_2.method3037(local579.method595());
								Static43.aClass5_Sub6_Sub1_2.method3061(local782 - 1);
								Static43.aClass5_Sub6_Sub1_2.method3061(local1002);
								continue;
							}
							if (local213 == 5003) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local1463 = null;
								if (local777 < 100) {
									local1463 = Static143.aClass20Array24[local777];
								}
								if (local1463 == null) {
									local1463 = Static188.aClass20_1375;
								}
								Static153.aClass20Array26[local31++] = local1463;
								continue;
							}
							if (local213 == 5004) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = -1;
								if (local777 < 100 && Static143.aClass20Array24[local777] != null) {
									local782 = Static53.anIntArray105[local777];
								}
								Static51.anIntArray101[local29++] = local782;
								continue;
							}
							if (local213 == 5005) {
								Static51.anIntArray101[local29++] = Static178.anInt3563;
								continue;
							}
							if (local213 == 5008) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								if (local579.method587(Static92.aClass20_727)) {
									Static104.method1712(local579);
									continue;
								}
								if (Static80.anInt1803 == 0 && (Static127.anInt2649 == 1 || Static68.anInt1469 == 1)) {
									continue;
								}
								local1463 = local579.method563();
								@Pc(2952) byte local2952 = 0;
								@Pc(2954) byte local2954 = 0;
								if (local1463.method587(Static36.aClass20_275)) {
									local2954 = 0;
									local579 = local579.method549(Static36.aClass20_275.method582());
								} else if (local1463.method587(Static61.aClass20_466)) {
									local2954 = 1;
									local579 = local579.method549(Static61.aClass20_466.method582());
								} else if (local1463.method587(Static9.aClass20_101)) {
									local2954 = 2;
									local579 = local579.method549(Static9.aClass20_101.method582());
								} else if (local1463.method587(Static210.aClass20_298)) {
									local2954 = 3;
									local579 = local579.method549(Static210.aClass20_298.method582());
								} else if (local1463.method587(Static154.aClass20_1168)) {
									local2954 = 4;
									local579 = local579.method549(Static154.aClass20_1168.method582());
								} else if (local1463.method587(Static65.aClass20_488)) {
									local579 = local579.method549(Static65.aClass20_488.method582());
									local2954 = 5;
								} else if (local1463.method587(Static171.aClass20_1269)) {
									local2954 = 6;
									local579 = local579.method549(Static171.aClass20_1269.method582());
								} else if (local1463.method587(Static115.aClass20_890)) {
									local579 = local579.method549(Static115.aClass20_890.method582());
									local2954 = 7;
								} else if (local1463.method587(Static152.aClass20_1157)) {
									local2954 = 8;
									local579 = local579.method549(Static152.aClass20_1157.method582());
								} else if (local1463.method587(Static164.aClass20_1209)) {
									local2954 = 9;
									local579 = local579.method549(Static164.aClass20_1209.method582());
								} else if (local1463.method587(Static185.aClass20_1370)) {
									local2954 = 10;
									local579 = local579.method549(Static185.aClass20_1370.method582());
								} else if (local1463.method587(Static17.aClass20_156)) {
									local2954 = 11;
									local579 = local579.method549(Static17.aClass20_156.method582());
								} else if (Static140.anInt2923 != 0) {
									if (local1463.method587(Static36.aClass20_271)) {
										local579 = local579.method549(Static36.aClass20_271.method582());
										local2954 = 0;
									} else if (local1463.method587(Static61.aClass20_467)) {
										local579 = local579.method549(Static61.aClass20_467.method582());
										local2954 = 1;
									} else if (local1463.method587(Static9.aClass20_105)) {
										local579 = local579.method549(Static9.aClass20_105.method582());
										local2954 = 2;
									} else if (local1463.method587(Static210.aClass20_300)) {
										local579 = local579.method549(Static210.aClass20_300.method582());
										local2954 = 3;
									} else if (local1463.method587(Static154.aClass20_1170)) {
										local579 = local579.method549(Static154.aClass20_1170.method582());
										local2954 = 4;
									} else if (local1463.method587(Static65.aClass20_491)) {
										local2954 = 5;
										local579 = local579.method549(Static65.aClass20_491.method582());
									} else if (local1463.method587(Static171.aClass20_1271)) {
										local2954 = 6;
										local579 = local579.method549(Static171.aClass20_1271.method582());
									} else if (local1463.method587(Static115.aClass20_887)) {
										local2954 = 7;
										local579 = local579.method549(Static115.aClass20_887.method582());
									} else if (local1463.method587(Static152.aClass20_1158)) {
										local2954 = 8;
										local579 = local579.method549(Static152.aClass20_1158.method582());
									} else if (local1463.method587(Static164.aClass20_1211)) {
										local2954 = 9;
										local579 = local579.method549(Static164.aClass20_1211.method582());
									} else if (local1463.method587(Static185.aClass20_1372)) {
										local2954 = 10;
										local579 = local579.method549(Static185.aClass20_1372.method582());
									} else if (local1463.method587(Static17.aClass20_153)) {
										local2954 = 11;
										local579 = local579.method549(Static17.aClass20_153.method582());
									}
								}
								local1463 = local579.method563();
								if (local1463.method587(Static199.aClass20_1467)) {
									local2952 = 1;
									local579 = local579.method549(Static199.aClass20_1467.method582());
								} else if (local1463.method587(Static216.aClass20_1547)) {
									local2952 = 2;
									local579 = local579.method549(Static216.aClass20_1547.method582());
								} else if (local1463.method587(Static95.aClass20_746)) {
									local579 = local579.method549(Static95.aClass20_746.method582());
									local2952 = 3;
								} else if (local1463.method587(Static30.aClass20_231)) {
									local2952 = 4;
									local579 = local579.method549(Static30.aClass20_231.method582());
								} else if (local1463.method587(Static86.aClass20_693)) {
									local579 = local579.method549(Static86.aClass20_693.method582());
									local2952 = 5;
								} else if (Static140.anInt2923 != 0) {
									if (local1463.method587(Static199.aClass20_1469)) {
										local2952 = 1;
										local579 = local579.method549(Static199.aClass20_1469.method582());
									} else if (local1463.method587(Static216.aClass20_1550)) {
										local579 = local579.method549(Static216.aClass20_1550.method582());
										local2952 = 2;
									} else if (local1463.method587(Static95.aClass20_747)) {
										local579 = local579.method549(Static95.aClass20_747.method582());
										local2952 = 3;
									} else if (local1463.method587(Static30.aClass20_229)) {
										local579 = local579.method549(Static30.aClass20_229.method582());
										local2952 = 4;
									} else if (local1463.method587(Static86.aClass20_689)) {
										local2952 = 5;
										local579 = local579.method549(Static86.aClass20_689.method582());
									}
								}
								Static43.aClass5_Sub6_Sub1_2.method3087(104);
								Static43.aClass5_Sub6_Sub1_2.method3061(0);
								local650 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
								Static43.aClass5_Sub6_Sub1_2.method3061(local2954);
								Static43.aClass5_Sub6_Sub1_2.method3061(local2952);
								Static70.method1165(Static43.aClass5_Sub6_Sub1_2, local579);
								Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local650);
								continue;
							}
							if (local213 == 5009) {
								local31 -= 2;
								local579 = Static153.aClass20Array26[local31];
								local1463 = Static153.aClass20Array26[local31 + 1];
								if (Static80.anInt1803 != 0 || Static127.anInt2649 != 1 && Static68.anInt1469 != 1) {
									Static43.aClass5_Sub6_Sub1_2.method3087(69);
									Static43.aClass5_Sub6_Sub1_2.method3061(0);
									local1002 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
									Static43.aClass5_Sub6_Sub1_2.method3037(local579.method595());
									Static70.method1165(Static43.aClass5_Sub6_Sub1_2, local1463);
									Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local1002);
								}
								continue;
							}
							if (local213 == 5010) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local1463 = null;
								if (local777 < 100) {
									local1463 = Static73.aClass20Array8[local777];
								}
								if (local1463 == null) {
									local1463 = Static188.aClass20_1375;
								}
								Static153.aClass20Array26[local31++] = local1463;
								continue;
							}
							if (local213 == 5011) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local1463 = null;
								if (local777 < 100) {
									local1463 = Static89.aClass20Array12[local777];
								}
								if (local1463 == null) {
									local1463 = Static188.aClass20_1375;
								}
								Static153.aClass20Array26[local31++] = local1463;
								continue;
							}
							if (local213 == 5012) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local782 = -1;
								if (local777 < 100) {
									local782 = Static196.anIntArray406[local777];
								}
								Static51.anIntArray101[local29++] = local782;
								continue;
							}
							if (local213 == 5015) {
								if (Static210.aClass1_Sub2_Sub2_2 == null || Static210.aClass1_Sub2_Sub2_2.aClass20_848 == null) {
									local579 = Static17.aClass20_161;
								} else {
									local579 = Static210.aClass1_Sub2_Sub2_2.aClass20_848;
								}
								Static153.aClass20Array26[local31++] = local579;
								continue;
							}
							if (local213 == 5016) {
								Static51.anIntArray101[local29++] = Static57.anInt1304;
								continue;
							}
							if (local213 == 5017) {
								Static51.anIntArray101[local29++] = Static107.anInt2194;
								continue;
							}
							if (local213 == 5050) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static169.method2575(local777).aClass20_1101;
								continue;
							}
							@Pc(3769) Class5_Sub2_Sub15 local3769;
							if (local213 == 5051) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local3769 = Static169.method2575(local777);
								if (local3769.anIntArray311 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local3769.anIntArray311.length;
								}
								continue;
							}
							if (local213 == 5052) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								@Pc(3808) Class5_Sub2_Sub15 local3808 = Static169.method2575(local777);
								local625 = local3808.anIntArray311[local782];
								Static51.anIntArray101[local29++] = local625;
								continue;
							}
							if (local213 == 5053) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								local3769 = Static169.method2575(local777);
								if (local3769.anIntArray313 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local3769.anIntArray313.length;
								}
								continue;
							}
							if (local213 == 5054) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static169.method2575(local777).anIntArray313[local782];
								continue;
							}
							if (local213 == 5055) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static153.aClass20Array26[local31++] = Static57.method995(local777).method1930();
								continue;
							}
							if (local213 == 5056) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								@Pc(3910) Class5_Sub2_Sub12 local3910 = Static57.method995(local777);
								if (local3910.anIntArray287 == null) {
									Static51.anIntArray101[local29++] = 0;
								} else {
									Static51.anIntArray101[local29++] = local3910.anIntArray287.length;
								}
								continue;
							}
							if (local213 == 5057) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static57.method995(local777).anIntArray287[local782];
								continue;
							}
							if (local213 == 5058) {
								Static92.aClass46_1 = new Class46();
								local29--;
								Static92.aClass46_1.anInt1892 = Static51.anIntArray101[local29];
								Static92.aClass46_1.aClass5_Sub2_Sub12_1 = Static57.method995(Static92.aClass46_1.anInt1892);
								Static92.aClass46_1.anIntArray186 = new int[Static92.aClass46_1.aClass5_Sub2_Sub12_1.method1934()];
								continue;
							}
							if (local213 == 5059) {
								Static43.aClass5_Sub6_Sub1_2.method3087(246);
								Static43.aClass5_Sub6_Sub1_2.method3061(0);
								local777 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
								Static43.aClass5_Sub6_Sub1_2.method3061(0);
								Static43.aClass5_Sub6_Sub1_2.method3044(Static92.aClass46_1.anInt1892);
								Static92.aClass46_1.aClass5_Sub2_Sub12_1.method1931(Static43.aClass5_Sub6_Sub1_2, Static92.aClass46_1.anIntArray186);
								Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local777);
								continue;
							}
							if (local213 == 5060) {
								local31--;
								local579 = Static153.aClass20Array26[local31];
								Static43.aClass5_Sub6_Sub1_2.method3087(227);
								Static43.aClass5_Sub6_Sub1_2.method3061(0);
								local782 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
								Static43.aClass5_Sub6_Sub1_2.method3037(local579.method595());
								Static43.aClass5_Sub6_Sub1_2.method3044(Static92.aClass46_1.anInt1892);
								Static92.aClass46_1.aClass5_Sub2_Sub12_1.method1931(Static43.aClass5_Sub6_Sub1_2, Static92.aClass46_1.anIntArray186);
								Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local782);
								continue;
							}
							if (local213 == 5061) {
								Static43.aClass5_Sub6_Sub1_2.method3087(246);
								Static43.aClass5_Sub6_Sub1_2.method3061(0);
								local777 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
								Static43.aClass5_Sub6_Sub1_2.method3061(1);
								Static43.aClass5_Sub6_Sub1_2.method3044(Static92.aClass46_1.anInt1892);
								Static92.aClass46_1.aClass5_Sub2_Sub12_1.method1931(Static43.aClass5_Sub6_Sub1_2, Static92.aClass46_1.anIntArray186);
								Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local777);
								continue;
							}
							if (local213 == 5062) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static169.method2575(local777).anIntArray312[local782];
								continue;
							}
							if (local213 == 5063) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static51.anIntArray101[local29++] = Static169.method2575(local777).anIntArray310[local782];
								continue;
							}
							if (local213 == 5064) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								if (local782 == -1) {
									Static51.anIntArray101[local29++] = -1;
								} else {
									Static51.anIntArray101[local29++] = Static169.method2575(local777).method2174(local782);
								}
								continue;
							}
							if (local213 == 5065) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								if (local782 == -1) {
									Static51.anIntArray101[local29++] = -1;
								} else {
									Static51.anIntArray101[local29++] = Static169.method2575(local777).method2170(local782);
								}
								continue;
							}
							if (local213 == 5066) {
								local29--;
								local777 = Static51.anIntArray101[local29];
								Static51.anIntArray101[local29++] = Static57.method995(local777).method1934();
								continue;
							}
							if (local213 == 5067) {
								local29 -= 2;
								local782 = Static51.anIntArray101[local29 + 1];
								local777 = Static51.anIntArray101[local29];
								local1002 = Static57.method995(local777).method1932(local782);
								System.out.println("chatphrase_getdynamiccommand=" + local1002);
								Static51.anIntArray101[local29++] = local1002;
								continue;
							}
							if (local213 == 5068) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static92.aClass46_1.anIntArray186[local777] = local782;
								continue;
							}
							if (local213 == 5069) {
								local29 -= 2;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								Static92.aClass46_1.anIntArray186[local777] = local782;
								continue;
							}
							if (local213 == 5070) {
								local29 -= 3;
								local777 = Static51.anIntArray101[local29];
								local782 = Static51.anIntArray101[local29 + 1];
								local1002 = Static51.anIntArray101[local29 + 2];
								@Pc(4382) Class5_Sub2_Sub12 local4382 = Static57.method995(local777);
								if (local4382.method1932(local782) != 0) {
									throw new RuntimeException("bad command");
								}
								Static51.anIntArray101[local29++] = local4382.method1926(local782, local1002);
								continue;
							}
						} else if (local213 < 5200) {
							if (local213 == 5100) {
								if (Static201.aBooleanArray22[86]) {
									Static51.anIntArray101[local29++] = 1;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
							if (local213 == 5101) {
								if (Static201.aBooleanArray22[82]) {
									Static51.anIntArray101[local29++] = 1;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
							if (local213 == 5102) {
								if (Static201.aBooleanArray22[81]) {
									Static51.anIntArray101[local29++] = 1;
								} else {
									Static51.anIntArray101[local29++] = 0;
								}
								continue;
							}
						} else if (local213 < 5300) {
							if (local213 == 5200) {
								local29--;
								Static171.method2628(Static51.anIntArray101[local29]);
								continue;
							}
							if (local213 == 5201) {
								Static51.anIntArray101[local29++] = Static99.method1687();
								continue;
							}
							if (local213 == 5202) {
								local29--;
								Static98.method1662(Static51.anIntArray101[local29]);
								continue;
							}
							if (local213 == 5203) {
								local31--;
								Static151.method2313(Static153.aClass20Array26[local31]);
								continue;
							}
							if (local213 == 5204) {
								Static153.aClass20Array26[local31 - 1] = Static120.method1907(Static153.aClass20Array26[local31 - 1]);
								continue;
							}
							if (local213 == 5205) {
								local31--;
								Static115.method1844(Static153.aClass20Array26[local31]);
								continue;
							}
						} else if (local213 < 5400) {
							if (local213 == 5304) {
								Static51.anIntArray101[local29++] = 0;
								continue;
							}
						} else if (local213 < 5500) {
							if (local213 == 5400) {
								local31 -= 2;
								local1463 = Static153.aClass20Array26[local31 + 1];
								local29--;
								local1002 = Static51.anIntArray101[local29];
								local579 = Static153.aClass20Array26[local31];
								Static43.aClass5_Sub6_Sub1_2.method3087(240);
								Static43.aClass5_Sub6_Sub1_2.method3061(Static159.method2434(local579) + Static159.method2434(local1463) + 1);
								Static43.aClass5_Sub6_Sub1_2.method3047(local579);
								Static43.aClass5_Sub6_Sub1_2.method3047(local1463);
								Static43.aClass5_Sub6_Sub1_2.method3061(local1002);
								continue;
							}
							if (local213 == 5401) {
								local29 -= 2;
								Static145.aShortArray39[Static51.anIntArray101[local29]] = (short) Static137.method2138(Static51.anIntArray101[local29 + 1]);
								Static115.method1847();
								Static124.method1951();
								Static195.method2893();
								Static14.method257();
								Static9.method197();
								continue;
							}
						}
					}
				} else {
					if (local213 >= 2000) {
						local213 -= 1000;
						local29--;
						local1138 = Static157.method2392(Static51.anIntArray101[local29]);
					} else {
						local1138 = local975 ? Static29.aClass69_1 : Static117.aClass69_8;
					}
					if (local213 == 1000) {
						local29 -= 2;
						local1138.aByte9 = 0;
						local1138.anInt2536 = local1138.anInt2538 = Static51.anIntArray101[local29];
						local1138.aByte8 = 0;
						local1138.anInt2539 = local1138.anInt2522 = Static51.anIntArray101[local29 + 1];
						Static184.method2779(local1138);
						continue;
					}
					if (local213 == 1001) {
						local1138.aByte6 = 0;
						local29 -= 2;
						local1138.anInt2541 = local1138.anInt2533 = Static51.anIntArray101[local29];
						local1138.aByte7 = 0;
						local1138.anInt2481 = 0;
						local1138.anInt2471 = local1138.anInt2527 = Static51.anIntArray101[local29 + 1];
						local1138.anInt2508 = 0;
						Static184.method2779(local1138);
						if (local1138.anInt2474 == 0) {
							Static115.method1845(local1138);
						}
						continue;
					}
					if (local213 == 1003) {
						local29--;
						@Pc(9146) boolean local9146 = Static51.anIntArray101[local29] == 1;
						if (local9146 != local1138.aBoolean114) {
							local1138.aBoolean114 = local9146;
							Static184.method2779(local1138);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(9163) Exception local9163) {
			if (local22.aClass20_1399 == null) {
				if (Static44.anInt1016 != 0) {
					Static189.method2824(0, Static169.aClass20_1250, Static188.aClass20_1375);
				}
				Static51.method890(local9163, "CS2 - scr:" + local22.aLong253 + " op:" + local39);
			} else {
				@Pc(9196) Class20 local9196 = Static161.method2451(30);
				local9196.method568(Static134.aClass20_1015).method568(local22.aClass20_1399);
				for (local55 = Static186.anInt3741 - 1; local55 >= 0; local55--) {
					local9196.method568(Static46.aClass20_350).method568(Static202.aClass55Array1[local55].aClass5_Sub2_Sub23_1.aClass20_1399);
				}
				if (local39 == 40) {
					local68 = local37[local41];
					local9196.method568(Static31.aClass20_246).method568(Static132.method2805(local68));
				}
				if (Static44.anInt1016 != 0) {
					Static189.method2824(0, Static70.method1166(new Class20[] { Static70.aClass20_520, local22.aClass20_1399 }), Static188.aClass20_1375);
				}
				Static51.method890(local9163, "CS2 - scr:" + local22.aLong253 + " op:" + local39 + new String(local9196.method558()));
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method2247() {
		for (@Pc(11) int local11 = 0; local11 < Static17.anInt347; local11++) {
			@Pc(17) int local17 = Static188.anIntArray395[local11];
			@Pc(21) Class1_Sub2_Sub1 local21 = Static61.aClass1_Sub2_Sub1Array1[local17];
			@Pc(25) int local25 = Static10.aClass5_Sub6_Sub1_1.method3062();
			@Pc(33) int local33;
			@Pc(37) int local37;
			if ((local25 & 0x1) != 0) {
				local33 = Static10.aClass5_Sub6_Sub1_1.method3036();
				local37 = Static10.aClass5_Sub6_Sub1_1.method3074();
				local21.method1745(local33, local37, Static177.anInt3533);
				local21.anInt2218 = Static177.anInt3533 + 300;
				local21.anInt2264 = Static10.aClass5_Sub6_Sub1_1.method3074();
			}
			if ((local25 & 0x10) != 0) {
				local21.aClass20_835 = Static10.aClass5_Sub6_Sub1_1.method3027();
				local21.anInt2219 = 100;
			}
			if ((local25 & 0x20) != 0) {
				local21.anInt2226 = Static10.aClass5_Sub6_Sub1_1.method3081();
				local21.anInt2253 = Static10.aClass5_Sub6_Sub1_1.method3043();
			}
			if ((local25 & 0x4) != 0) {
				local21.aClass5_Sub2_Sub20_1 = Static50.method887(Static10.aClass5_Sub6_Sub1_1.method3043());
				local21.anInt2230 = local21.aClass5_Sub2_Sub20_1.anInt3594;
				local21.anInt2211 = local21.aClass5_Sub2_Sub20_1.anInt3597;
				local21.anInt2221 = local21.aClass5_Sub2_Sub20_1.anInt3590;
				local21.anInt2243 = local21.aClass5_Sub2_Sub20_1.anInt3591;
				local21.anInt2259 = local21.aClass5_Sub2_Sub20_1.anInt3607;
				local21.anInt2252 = local21.aClass5_Sub2_Sub20_1.anInt3616;
				local21.anInt2216 = local21.aClass5_Sub2_Sub20_1.anInt3592;
				local21.anInt2238 = local21.aClass5_Sub2_Sub20_1.anInt3610;
				local21.anInt2229 = local21.aClass5_Sub2_Sub20_1.anInt3603;
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt2249 = Static10.aClass5_Sub6_Sub1_1.method3043();
				if (local21.anInt2249 == 65535) {
					local21.anInt2249 = -1;
				}
			}
			if ((local25 & 0x80) != 0) {
				local21.anInt2266 = Static10.aClass5_Sub6_Sub1_1.method3081();
				local33 = Static10.aClass5_Sub6_Sub1_1.method3042();
				local21.anInt2239 = (local33 & 0xFFFF) + Static177.anInt3533;
				local21.anInt2236 = 0;
				if (local21.anInt2266 == 65535) {
					local21.anInt2266 = -1;
				}
				local21.anInt2225 = local33 >> 16;
				local21.anInt2255 = 0;
				if (local21.anInt2239 > Static177.anInt3533) {
					local21.anInt2255 = -1;
				}
			}
			if ((local25 & 0x8) != 0) {
				local33 = Static10.aClass5_Sub6_Sub1_1.method3043();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static10.aClass5_Sub6_Sub1_1.method3062();
				Static108.method1730(local33, local21, local37);
			}
			if ((local25 & 0x2) != 0) {
				local33 = Static10.aClass5_Sub6_Sub1_1.method3059();
				local37 = Static10.aClass5_Sub6_Sub1_1.method3036();
				local21.method1745(local33, local37, Static177.anInt3533);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public static void method2248() {
		Static157.aBoolean140 = true;
		Static14.aBoolean14 = true;
	}
}
