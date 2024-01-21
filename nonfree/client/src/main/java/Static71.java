import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static int anInt1634;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static int anInt1630 = 0;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt1631 = 0;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array10 = new Class5[100];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1227() {
		for (@Pc(17) Class1_Sub16 local17 = (Class1_Sub16) Static38.aClass53_7.method1442(); local17 != null; local17 = (Class1_Sub16) Static38.aClass53_7.method1450()) {
			if (local17.aClass1_Sub1_Sub2_3 != null) {
				Static122.aClass1_Sub1_Sub1_2.method37(local17.aClass1_Sub1_Sub2_3);
				local17.aClass1_Sub1_Sub2_3 = null;
			}
			if (local17.aClass1_Sub1_Sub2_2 != null) {
				Static122.aClass1_Sub1_Sub1_2.method37(local17.aClass1_Sub1_Sub2_2);
				local17.aClass1_Sub1_Sub2_2 = null;
			}
		}
		Static38.aClass53_7.method1446();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!fc;)V")
	public static void method1228(@OriginalArg(1) Class1_Sub6 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(20) Class1_Sub3_Sub3 local20 = Static105.method2083(local14);
		if (local20 == null) {
			return;
		}
		Static89.anInt3022 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(36) int[] local36 = local20.anIntArray41;
		@Pc(38) byte local38 = -1;
		@Pc(41) int[] local41 = local20.anIntArray42;
		@Pc(43) int local43 = -1;
		@Pc(57) int local57;
		@Pc(95) int local95;
		try {
			Static76.anIntArray295 = new int[local20.anInt308];
			Static37.aClass5Array7 = new Class5[local20.anInt314];
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			for (local57 = 1; local57 < local8.length; local57++) {
				if (local8[local57] instanceof Integer) {
					local95 = (Integer) local8[local57];
					if (local95 == -2147483647) {
						local95 = arg0.anInt978;
					}
					if (local95 == -2147483646) {
						local95 = arg0.anInt973;
					}
					if (local95 == -2147483645) {
						local95 = arg0.aClass1_Sub17_26 == null ? -1 : arg0.aClass1_Sub17_26.anInt2248;
					}
					if (local95 == -2147483644) {
						local95 = arg0.anInt984;
					}
					if (local95 == -2147483643) {
						local95 = arg0.aClass1_Sub17_26 == null ? -1 : arg0.aClass1_Sub17_26.anInt2249;
					}
					if (local95 == -2147483642) {
						local95 = arg0.aClass1_Sub17_25 == null ? -1 : arg0.aClass1_Sub17_25.anInt2248;
					}
					if (local95 == -2147483641) {
						local95 = arg0.aClass1_Sub17_25 == null ? -1 : arg0.aClass1_Sub17_25.anInt2249;
					}
					if (local95 == -2147483640) {
						local95 = arg0.anInt982;
					}
					if (local95 == -2147483639) {
						local95 = arg0.anInt985;
					}
					Static76.anIntArray295[local53++] = local95;
				} else if (local8[local57] instanceof Class5) {
					@Pc(74) Class5 local74 = (Class5) local8[local57];
					if (local74.method199(Static20.aClass5_329)) {
						local74 = arg0.aClass5_461;
					}
					Static37.aClass5Array7[local55++] = local74;
				}
			}
			local95 = 0;
			label1933: while (true) {
				local95++;
				if (local95 > 200000) {
					throw new RuntimeException("slow");
				}
				local43++;
				@Pc(207) int local207 = local41[local43];
				@Pc(758) int local758;
				@Pc(618) int local618;
				@Pc(639) int local639;
				@Pc(753) int local753;
				@Pc(572) Class5 local572;
				if (local207 < 100) {
					if (local207 == 0) {
						Static128.anIntArray465[local29++] = local36[local43];
						continue;
					}
					@Pc(235) int local235;
					if (local207 == 1) {
						local235 = local36[local43];
						Static128.anIntArray465[local29++] = Static40.anIntArray182[local235];
						continue;
					}
					if (local207 == 2) {
						local235 = local36[local43];
						local29--;
						Static40.anIntArray182[local235] = Static128.anIntArray465[local29];
						continue;
					}
					if (local207 == 3) {
						Static70.aClass5Array9[local27++] = local20.aClass5Array3[local43];
						continue;
					}
					if (local207 == 6) {
						local43 += local36[local43];
						continue;
					}
					if (local207 == 7) {
						local29 -= 2;
						if (Static128.anIntArray465[local29] != Static128.anIntArray465[local29 + 1]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 8) {
						local29 -= 2;
						if (Static128.anIntArray465[local29] == Static128.anIntArray465[local29 + 1]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 9) {
						local29 -= 2;
						if (Static128.anIntArray465[local29 + 1] > Static128.anIntArray465[local29]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 10) {
						local29 -= 2;
						if (Static128.anIntArray465[local29] > Static128.anIntArray465[local29 + 1]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 21) {
						if (Static89.anInt3022 == 0) {
							return;
						}
						@Pc(393) Class64 local393 = Static18.aClass64Array3[--Static89.anInt3022];
						Static37.aClass5Array7 = local393.aClass5Array20;
						local43 = local393.anInt2465;
						local20 = local393.aClass1_Sub3_Sub3_1;
						local41 = local20.anIntArray42;
						local36 = local20.anIntArray41;
						Static76.anIntArray295 = local393.anIntArray377;
						continue;
					}
					if (local207 == 25) {
						local235 = local36[local43];
						Static128.anIntArray465[local29++] = Static96.method1626(local235);
						continue;
					}
					if (local207 == 27) {
						local235 = local36[local43];
						local29--;
						Static112.method1930(local235, Static128.anIntArray465[local29]);
						continue;
					}
					if (local207 == 31) {
						local29 -= 2;
						if (Static128.anIntArray465[local29] <= Static128.anIntArray465[local29 + 1]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 32) {
						local29 -= 2;
						if (Static128.anIntArray465[local29 + 1] <= Static128.anIntArray465[local29]) {
							local43 += local36[local43];
						}
						continue;
					}
					if (local207 == 33) {
						Static128.anIntArray465[local29++] = Static76.anIntArray295[local36[local43]];
						continue;
					}
					@Pc(518) int local518;
					if (local207 == 34) {
						local518 = local36[local43];
						local29--;
						Static76.anIntArray295[local518] = Static128.anIntArray465[local29];
						continue;
					}
					if (local207 == 35) {
						Static70.aClass5Array9[local27++] = Static37.aClass5Array7[local36[local43]];
						continue;
					}
					if (local207 == 36) {
						local518 = local36[local43];
						local27--;
						Static37.aClass5Array7[local518] = Static70.aClass5Array9[local27];
						continue;
					}
					if (local207 == 37) {
						local235 = local36[local43];
						local27 -= local235;
						local572 = Static59.method1060(Static70.aClass5Array9, local235, local27);
						Static70.aClass5Array9[local27++] = local572;
						continue;
					}
					if (local207 == 38) {
						local29--;
						continue;
					}
					if (local207 == 39) {
						local27--;
						continue;
					}
					if (local207 == 40) {
						local235 = local36[local43];
						@Pc(608) Class1_Sub3_Sub3 local608 = Static105.method2083(local235);
						@Pc(612) int[] local612 = new int[local608.anInt308];
						@Pc(616) Class5[] local616 = new Class5[local608.anInt314];
						for (local618 = 0; local618 < local608.anInt312; local618++) {
							local612[local618] = Static128.anIntArray465[local618 + local29 - local608.anInt312];
						}
						for (local639 = 0; local639 < local608.anInt307; local639++) {
							local616[local639] = Static70.aClass5Array9[local639 + local27 - local608.anInt307];
						}
						local27 -= local608.anInt307;
						local29 -= local608.anInt312;
						@Pc(672) Class64 local672 = new Class64();
						local672.anIntArray377 = Static76.anIntArray295;
						local672.aClass1_Sub3_Sub3_1 = local20;
						local20 = local608;
						local672.anInt2465 = local43;
						local672.aClass5Array20 = Static37.aClass5Array7;
						Static18.aClass64Array3[Static89.anInt3022++] = local672;
						local41 = local608.anIntArray42;
						Static76.anIntArray295 = local612;
						local43 = -1;
						Static37.aClass5Array7 = local616;
						local36 = local608.anIntArray41;
						continue;
					}
					if (local207 == 42) {
						Static128.anIntArray465[local29++] = Static126.anIntArray460[local36[local43]];
						continue;
					}
					if (local207 == 43) {
						local518 = local36[local43];
						local29--;
						Static126.anIntArray460[local518] = Static128.anIntArray465[local29];
						continue;
					}
					if (local207 == 44) {
						local235 = local36[local43] >> 16;
						local753 = local36[local43] & 0xFFFF;
						local29--;
						local758 = Static128.anIntArray465[local29];
						if (local758 >= 0 && local758 <= 5000) {
							Static100.anIntArray378[local235] = local758;
							@Pc(775) byte local775 = -1;
							if (local753 == 105) {
								local775 = 0;
							}
							local618 = 0;
							while (true) {
								if (local618 >= local758) {
									continue label1933;
								}
								Static48.anIntArrayArray38[local235][local618] = local775;
								local618++;
							}
						}
						throw new RuntimeException();
					}
					if (local207 == 45) {
						local235 = local36[local43];
						local29--;
						local753 = Static128.anIntArray465[local29];
						if (local753 >= 0 && Static100.anIntArray378[local235] > local753) {
							Static128.anIntArray465[local29++] = Static48.anIntArrayArray38[local235][local753];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 46) {
						local29 -= 2;
						local235 = local36[local43];
						local753 = Static128.anIntArray465[local29];
						if (local753 >= 0 && Static100.anIntArray378[local235] > local753) {
							Static48.anIntArrayArray38[local235][local753] = Static128.anIntArray465[local29 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 47) {
						@Pc(889) Class5 local889 = Static127.aClass5Array25[local36[local43]];
						if (local889 == null) {
							local889 = Static23.aClass5_344;
						}
						Static70.aClass5Array9[local27++] = local889;
						continue;
					}
					if (local207 == 48) {
						local518 = local36[local43];
						local27--;
						Static127.aClass5Array25[local518] = Static70.aClass5Array9[local27];
						continue;
					}
				}
				@Pc(925) boolean local925;
				if (local36[local43] == 1) {
					local925 = true;
				} else {
					local925 = false;
				}
				@Pc(963) Class1_Sub17 local963;
				@Pc(1625) int local1625;
				@Pc(2601) Class1_Sub17 local2601;
				@Pc(3225) int local3225;
				@Pc(2619) Class1_Sub17 local2619;
				if (local207 < 1000) {
					if (local207 == 100) {
						local29 -= 3;
						local753 = Static128.anIntArray465[local29];
						local758 = Static128.anIntArray465[local29 + 1];
						local1625 = Static128.anIntArray465[local29 + 2];
						if (local758 == 0) {
							throw new RuntimeException();
						}
						local2601 = Static36.method680(local753);
						if (local2601.aClass1_Sub17Array1 == null) {
							local2601.aClass1_Sub17Array1 = new Class1_Sub17[local1625 + 1];
						}
						if (local2601.aClass1_Sub17Array1.length <= local1625) {
							@Pc(6827) Class1_Sub17[] local6827 = new Class1_Sub17[local1625 + 1];
							for (local3225 = 0; local3225 < local2601.aClass1_Sub17Array1.length; local3225++) {
								local6827[local3225] = local2601.aClass1_Sub17Array1[local3225];
							}
							local2601.aClass1_Sub17Array1 = local6827;
						}
						if (local1625 > 0 && local2601.aClass1_Sub17Array1[local1625 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1625 - 1));
						}
						@Pc(6876) Class1_Sub17 local6876 = new Class1_Sub17();
						local6876.aBoolean89 = true;
						local6876.anInt2249 = local1625;
						local6876.anInt2292 = local6876.anInt2248 = local2601.anInt2248;
						local6876.anInt2271 = local758;
						local2601.aClass1_Sub17Array1[local1625] = local6876;
						if (local925) {
							Static55.aClass1_Sub17_34 = local6876;
						} else {
							Static113.aClass1_Sub17_68 = local6876;
						}
						Static119.method2161(local2601);
						continue;
					}
					if (local207 == 101) {
						local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
						@Pc(6928) Class1_Sub17 local6928 = Static36.method680(local963.anInt2248);
						local6928.aClass1_Sub17Array1[local963.anInt2249] = null;
						Static119.method2161(local6928);
						continue;
					}
					if (local207 == 102) {
						local29--;
						local963 = Static36.method680(Static128.anIntArray465[local29]);
						local963.aClass1_Sub17Array1 = null;
						Static119.method2161(local963);
						continue;
					}
					if (local207 == 200) {
						local29 -= 2;
						local758 = Static128.anIntArray465[local29 + 1];
						local753 = Static128.anIntArray465[local29];
						local2619 = Static18.method2150(local753, local758);
						if (local2619 != null && local758 != -1) {
							Static128.anIntArray465[local29++] = 1;
							if (local925) {
								Static55.aClass1_Sub17_34 = local2619;
							} else {
								Static113.aClass1_Sub17_68 = local2619;
							}
							continue;
						}
						Static128.anIntArray465[local29++] = 0;
						continue;
					}
				} else if ((local207 < 1000 || local207 >= 1100) && (local207 < 2000 || local207 >= 2100)) {
					@Pc(1405) Class5 local1405;
					if (local207 >= 1100 && local207 < 1200 || local207 >= 2100 && local207 < 2200) {
						if (local207 < 2000) {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
						} else {
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
							local207 -= 1000;
						}
						if (local207 == 1100) {
							local29 -= 2;
							local963.anInt2245 = Static128.anIntArray465[local29];
							if (local963.anInt2298 - local963.anInt2305 < local963.anInt2245) {
								local963.anInt2245 = local963.anInt2298 - local963.anInt2305;
							}
							if (local963.anInt2245 < 0) {
								local963.anInt2245 = 0;
							}
							local963.anInt2273 = Static128.anIntArray465[local29 + 1];
							if (local963.anInt2270 - local963.anInt2293 < local963.anInt2273) {
								local963.anInt2273 = local963.anInt2270 - local963.anInt2293;
							}
							if (local963.anInt2273 < 0) {
								local963.anInt2273 = 0;
							}
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1101) {
							local29--;
							local963.anInt2247 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1102) {
							local29--;
							local963.aBoolean82 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1103) {
							local29--;
							local963.anInt2250 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1104) {
							local29--;
							local963.anInt2296 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1105) {
							local29--;
							local963.anInt2274 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1106) {
							local29--;
							local963.anInt2299 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1107) {
							local29--;
							local963.aBoolean79 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1108) {
							local963.anInt2300 = 1;
							local29--;
							local963.anInt2313 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1109) {
							local29 -= 6;
							local963.anInt2297 = Static128.anIntArray465[local29];
							local963.anInt2241 = Static128.anIntArray465[local29 + 1];
							local963.anInt2242 = Static128.anIntArray465[local29 + 2];
							local963.anInt2304 = Static128.anIntArray465[local29 + 3];
							local963.anInt2280 = Static128.anIntArray465[local29 + 4];
							local963.anInt2278 = Static128.anIntArray465[local29 + 5];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1110) {
							local29--;
							local758 = Static128.anIntArray465[local29];
							if (local963.anInt2314 != local758) {
								local963.anInt2258 = 0;
								local963.anInt2268 = 0;
								local963.anInt2314 = local758;
								Static119.method2161(local963);
							}
							continue;
						}
						if (local207 == 1111) {
							local29--;
							local963.aBoolean80 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1112) {
							local27--;
							local1405 = Static70.aClass5Array9[local27];
							if (!local1405.method199(local963.aClass5_1098)) {
								local963.aClass5_1098 = local1405;
								Static119.method2161(local963);
							}
							continue;
						}
						if (local207 == 1113) {
							local29--;
							local963.anInt2260 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1114) {
							local29 -= 3;
							local963.anInt2287 = Static128.anIntArray465[local29];
							local963.anInt2303 = Static128.anIntArray465[local29 + 1];
							local963.anInt2269 = Static128.anIntArray465[local29 + 2];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1115) {
							local29--;
							local963.aBoolean85 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1116) {
							local29--;
							local963.anInt2261 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1117) {
							local29--;
							local963.anInt2281 = Static128.anIntArray465[local29];
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1118) {
							local29--;
							local963.aBoolean84 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1119) {
							local29--;
							local963.aBoolean83 = Static128.anIntArray465[local29] == 1;
							Static119.method2161(local963);
							continue;
						}
						if (local207 == 1120) {
							local29 -= 2;
							local963.anInt2298 = Static128.anIntArray465[local29];
							local963.anInt2270 = Static128.anIntArray465[local29 + 1];
							Static119.method2161(local963);
							continue;
						}
					} else if (local207 >= 1200 && local207 < 1300 || local207 >= 2200 && local207 < 2300) {
						if (local207 >= 2000) {
							local207 -= 1000;
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
						} else {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
						}
						Static119.method2161(local963);
						if (local207 == 1200) {
							local29 -= 2;
							local1625 = Static128.anIntArray465[local29 + 1];
							local758 = Static128.anIntArray465[local29];
							local963.anInt2262 = local758;
							local963.anInt2259 = local1625;
							@Pc(1639) Class1_Sub3_Sub16 local1639 = Static56.method1022(local758);
							local963.anInt2297 = local1639.anInt2874;
							local963.anInt2304 = local1639.anInt2872;
							local963.anInt2280 = local1639.anInt2861;
							local963.anInt2278 = local1639.anInt2851;
							if (local963.anInt2305 > 0) {
								local963.anInt2278 = local963.anInt2278 * 32 / local963.anInt2305;
							}
							local963.anInt2242 = local1639.anInt2866;
							local963.anInt2241 = local1639.anInt2852;
							continue;
						}
						if (local207 == 1201) {
							local963.anInt2300 = 2;
							local29--;
							local963.anInt2313 = Static128.anIntArray465[local29];
							continue;
						}
						if (local207 == 1202) {
							local963.anInt2300 = 3;
							local963.anInt2313 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass74_1.method2035();
							continue;
						}
					} else if ((local207 < 1300 || local207 >= 1400) && (local207 < 2300 || local207 >= 2400)) {
						if (local207 >= 1400 && local207 < 1500 || local207 >= 2400 && local207 < 2500) {
							if (local207 < 2000) {
								local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
							} else {
								local29--;
								local963 = Static36.method680(Static128.anIntArray465[local29]);
								local207 -= 1000;
							}
							local27--;
							local1405 = Static70.aClass5Array9[local27];
							@Pc(6476) int[] local6476 = null;
							if (local1405.method215() > 0 && local1405.method202(local1405.method215() - 1) == 89) {
								local29--;
								local618 = Static128.anIntArray465[local29];
								if (local618 > 0) {
									local6476 = new int[local618];
									while (local618-- > 0) {
										local29--;
										local6476[local618] = Static128.anIntArray465[local29];
									}
								}
								local1405 = local1405.method200(0, local1405.method215() - 1);
							}
							@Pc(6533) Object[] local6533 = new Object[local1405.method215() + 1];
							for (local639 = local6533.length - 1; local639 >= 1; local639--) {
								if (local1405.method202(local639 - 1) == 115) {
									local27--;
									local6533[local639] = Static70.aClass5Array9[local27];
								} else {
									local29--;
									local6533[local639] = Integer.valueOf(Static128.anIntArray465[local29]);
								}
							}
							local29--;
							local3225 = Static128.anIntArray465[local29];
							if (local3225 == -1) {
								local6533 = null;
							} else {
								local6533[0] = Integer.valueOf(local3225);
							}
							if (local207 == 1409) {
								local963.anObjectArray18 = local6533;
							}
							if (local207 == 1423) {
								Static23.aBoolean23 = false;
								local963.anObjectArray26 = local6533;
							}
							if (local207 == 1412) {
								local963.anObjectArray13 = local6533;
							}
							if (local207 == 1402) {
								local963.anObjectArray20 = local6533;
							}
							if (local207 == 1407) {
								local963.anObjectArray8 = local6533;
								local963.anIntArray345 = local6476;
							}
							if (local207 == 1408) {
								local963.anObjectArray3 = local6533;
							}
							if (local207 == 1421) {
								local963.anObjectArray11 = local6533;
							}
							if (local207 == 1401) {
								local963.anObjectArray14 = local6533;
							}
							if (local207 == 1414) {
								local963.anIntArray343 = local6476;
								local963.anObjectArray15 = local6533;
							}
							if (local207 == 1418) {
								local963.anObjectArray21 = local6533;
							}
							if (local207 == 1415) {
								local963.anObjectArray5 = local6533;
								local963.anIntArray349 = local6476;
							}
							if (local207 == 1406) {
								local963.anObjectArray22 = local6533;
							}
							if (local207 == 1419) {
								local963.anObjectArray10 = local6533;
							}
							if (local207 == 1405) {
								local963.anObjectArray17 = local6533;
							}
							if (local207 == 1416) {
								local963.anObjectArray19 = local6533;
							}
							if (local207 == 1420) {
								local963.anObjectArray24 = local6533;
							}
							if (local207 == 1411) {
								local963.anObjectArray9 = local6533;
							}
							local963.aBoolean78 = true;
							if (local207 == 1403) {
								local963.anObjectArray16 = local6533;
							}
							if (local207 == 1400) {
								local963.anObjectArray23 = local6533;
							}
							if (local207 == 1422) {
								local963.anObjectArray25 = local6533;
							}
							if (local207 == 1417) {
								local963.anObjectArray7 = local6533;
							}
							if (local207 == 1410) {
								local963.anObjectArray4 = local6533;
							}
							if (local207 == 1404) {
								local963.anObjectArray6 = local6533;
							}
							continue;
						}
						if (local207 < 1600) {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
							if (local207 == 1500) {
								Static128.anIntArray465[local29++] = local963.anInt2279;
								continue;
							}
							if (local207 == 1501) {
								Static128.anIntArray465[local29++] = local963.anInt2267;
								continue;
							}
							if (local207 == 1502) {
								Static128.anIntArray465[local29++] = local963.anInt2305;
								continue;
							}
							if (local207 == 1503) {
								Static128.anIntArray465[local29++] = local963.anInt2293;
								continue;
							}
							if (local207 == 1504) {
								Static128.anIntArray465[local29++] = local963.aBoolean86 ? 1 : 0;
								continue;
							}
							if (local207 == 1505) {
								Static128.anIntArray465[local29++] = local963.anInt2292;
								continue;
							}
						} else if (local207 < 1700) {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
							if (local207 == 1600) {
								Static128.anIntArray465[local29++] = local963.anInt2245;
								continue;
							}
							if (local207 == 1601) {
								Static128.anIntArray465[local29++] = local963.anInt2273;
								continue;
							}
							if (local207 == 1602) {
								Static70.aClass5Array9[local27++] = local963.aClass5_1098;
								continue;
							}
							if (local207 == 1603) {
								Static128.anIntArray465[local29++] = local963.anInt2298;
								continue;
							}
							if (local207 == 1604) {
								Static128.anIntArray465[local29++] = local963.anInt2270;
								continue;
							}
							if (local207 == 1605) {
								Static128.anIntArray465[local29++] = local963.anInt2278;
								continue;
							}
							if (local207 == 1606) {
								Static128.anIntArray465[local29++] = local963.anInt2242;
								continue;
							}
							if (local207 == 1607) {
								Static128.anIntArray465[local29++] = local963.anInt2280;
								continue;
							}
							if (local207 == 1608) {
								Static128.anIntArray465[local29++] = local963.anInt2304;
								continue;
							}
						} else if (local207 < 1800) {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
							if (local207 == 1700) {
								Static128.anIntArray465[local29++] = local963.anInt2262;
								continue;
							}
							if (local207 == 1701) {
								if (local963.anInt2262 == -1) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = local963.anInt2259;
								}
								continue;
							}
							if (local207 == 1702) {
								Static128.anIntArray465[local29++] = local963.anInt2249;
								continue;
							}
						} else if (local207 < 1900) {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
							if (local207 == 1800) {
								Static128.anIntArray465[local29++] = Static92.method1586(Static6.method221(local963));
								continue;
							}
							if (local207 == 1801) {
								local29--;
								local758 = Static128.anIntArray465[local29];
								local758--;
								if (local963.aClass5Array17 != null && local963.aClass5Array17.length > local758 && local963.aClass5Array17[local758] != null) {
									Static70.aClass5Array9[local27++] = local963.aClass5Array17[local758];
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 1802) {
								if (local963.aClass5_1097 == null) {
									Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								} else {
									Static70.aClass5Array9[local27++] = local963.aClass5_1097;
								}
								continue;
							}
						} else if (local207 < 2600) {
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
							if (local207 == 2500) {
								Static128.anIntArray465[local29++] = local963.anInt2279;
								continue;
							}
							if (local207 == 2501) {
								Static128.anIntArray465[local29++] = local963.anInt2267;
								continue;
							}
							if (local207 == 2502) {
								Static128.anIntArray465[local29++] = local963.anInt2305;
								continue;
							}
							if (local207 == 2503) {
								Static128.anIntArray465[local29++] = local963.anInt2293;
								continue;
							}
							if (local207 == 2504) {
								Static128.anIntArray465[local29++] = local963.aBoolean86 ? 1 : 0;
								continue;
							}
							if (local207 == 2505) {
								Static128.anIntArray465[local29++] = local963.anInt2292;
								continue;
							}
						} else if (local207 < 2700) {
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
							if (local207 == 2600) {
								Static128.anIntArray465[local29++] = local963.anInt2245;
								continue;
							}
							if (local207 == 2601) {
								Static128.anIntArray465[local29++] = local963.anInt2273;
								continue;
							}
							if (local207 == 2602) {
								Static70.aClass5Array9[local27++] = local963.aClass5_1098;
								continue;
							}
							if (local207 == 2603) {
								Static128.anIntArray465[local29++] = local963.anInt2298;
								continue;
							}
							if (local207 == 2604) {
								Static128.anIntArray465[local29++] = local963.anInt2270;
								continue;
							}
							if (local207 == 2605) {
								Static128.anIntArray465[local29++] = local963.anInt2278;
								continue;
							}
							if (local207 == 2606) {
								Static128.anIntArray465[local29++] = local963.anInt2242;
								continue;
							}
							if (local207 == 2607) {
								Static128.anIntArray465[local29++] = local963.anInt2280;
								continue;
							}
							if (local207 == 2608) {
								Static128.anIntArray465[local29++] = local963.anInt2304;
								continue;
							}
						} else if (local207 < 2800) {
							if (local207 == 2700) {
								local29--;
								local963 = Static36.method680(Static128.anIntArray465[local29]);
								Static128.anIntArray465[local29++] = local963.anInt2262;
								continue;
							}
							if (local207 == 2701) {
								local29--;
								local963 = Static36.method680(Static128.anIntArray465[local29]);
								if (local963.anInt2262 == -1) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = local963.anInt2259;
								}
								continue;
							}
							if (local207 == 2702) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								@Pc(2389) Class1_Sub5 local2389 = (Class1_Sub5) Static66.aClass7_14.method287((long) local753);
								if (local2389 == null) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = 1;
								}
								continue;
							}
						} else if (local207 < 2900) {
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
							if (local207 == 2800) {
								Static128.anIntArray465[local29++] = Static92.method1586(Static6.method221(local963));
								continue;
							}
							if (local207 == 2801) {
								local29--;
								local758 = Static128.anIntArray465[local29];
								local758--;
								if (local963.aClass5Array17 != null && local758 < local963.aClass5Array17.length && local963.aClass5Array17[local758] != null) {
									Static70.aClass5Array9[local27++] = local963.aClass5Array17[local758];
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 2802) {
								if (local963.aClass5_1097 == null) {
									Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								} else {
									Static70.aClass5Array9[local27++] = local963.aClass5_1097;
								}
								continue;
							}
						} else if (local207 < 3200) {
							if (local207 == 3100) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static50.method893(local572, 0, Static9.aClass5_150);
								continue;
							}
							if (local207 == 3101) {
								local29 -= 2;
								Static85.method1502(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1, Static128.anIntArray465[local29 + 1], Static128.anIntArray465[local29]);
								continue;
							}
							if (local207 == 3102) {
								local29--;
								continue;
							}
							if (local207 == 3103) {
								Static3.method63();
								continue;
							}
							if (local207 == 3104) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local758 = 0;
								if (local572.method205()) {
									local758 = local572.method196();
								}
								Static44.aClass1_Sub20_Sub1_1.method2108(123);
								Static44.aClass1_Sub20_Sub1_1.method2092(local758);
								continue;
							}
							if (local207 == 3105) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static44.aClass1_Sub20_Sub1_1.method2108(113);
								Static44.aClass1_Sub20_Sub1_1.method2078(local572.method193());
								continue;
							}
							if (local207 == 3106) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static44.aClass1_Sub20_Sub1_1.method2108(247);
								Static44.aClass1_Sub20_Sub1_1.method2081(local572.method215() + 1);
								Static44.aClass1_Sub20_Sub1_1.method2054(local572);
								continue;
							}
							if (local207 == 3107) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local27--;
								local1405 = Static70.aClass5Array9[local27];
								Static120.method1345(local1405, local753);
								continue;
							}
							if (local207 == 3108) {
								local29 -= 3;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								local1625 = Static128.anIntArray465[local29 + 2];
								local2601 = Static36.method680(local1625);
								method1229(local2601, local753, local758);
								continue;
							}
							if (local207 == 3109) {
								local2619 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								method1229(local2619, local753, local758);
								continue;
							}
						} else if (local207 < 3300) {
							if (local207 == 3200) {
								local29 -= 3;
								Static73.method1253(Static128.anIntArray465[local29 + 2], Static128.anIntArray465[local29], Static128.anIntArray465[local29 + 1]);
								continue;
							}
							if (local207 == 3201) {
								local29--;
								Static45.method1938(Static128.anIntArray465[local29]);
								continue;
							}
							if (local207 == 3202) {
								local29 -= 2;
								Static48.method837(Static128.anIntArray465[local29 + 1], Static128.anIntArray465[local29]);
								continue;
							}
						} else if (local207 < 3400) {
							if (local207 == 3300) {
								Static128.anIntArray465[local29++] = Static131.anInt3270;
								continue;
							}
							if (local207 == 3301) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static118.method2120(local753, local758);
								continue;
							}
							if (local207 == 3302) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = Static27.method587(local753, local758);
								continue;
							}
							if (local207 == 3303) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = Static62.method1718(local758, local753);
								continue;
							}
							if (local207 == 3304) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static25.method545(local753).anInt1299;
								continue;
							}
							if (local207 == 3305) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static42.anIntArray185[local753];
								continue;
							}
							if (local207 == 3306) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static89.anIntArray442[local753];
								continue;
							}
							if (local207 == 3307) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static117.anIntArray459[local753];
								continue;
							}
							if (local207 == 3308) {
								local753 = Static7.anInt213;
								local1625 = (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7) + Static32.anInt927;
								local758 = (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7) + Static129.anInt3262;
								Static128.anIntArray465[local29++] = (local758 << 14) + ((local753 << 28) + local1625);
								continue;
							}
							if (local207 == 3309) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local753 >> 14 & 0x3FFF;
								continue;
							}
							if (local207 == 3310) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local753 >> 28;
								continue;
							}
							if (local207 == 3311) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local753 & 0x3FFF;
								continue;
							}
							if (local207 == 3312) {
								Static128.anIntArray465[local29++] = Static82.aBoolean70 ? 1 : 0;
								continue;
							}
							if (local207 == 3313) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29] + 32768;
								Static128.anIntArray465[local29++] = Static118.method2120(local753, local758);
								continue;
							}
							if (local207 == 3314) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29] + 32768;
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = Static27.method587(local753, local758);
								continue;
							}
							if (local207 == 3315) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29] + 32768;
								Static128.anIntArray465[local29++] = Static62.method1718(local758, local753);
								continue;
							}
							if (local207 == 3316) {
								if (Static40.anInt1047 < 2) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = Static40.anInt1047;
								}
								continue;
							}
							if (local207 == 3317) {
								Static128.anIntArray465[local29++] = Static116.anInt2902;
								continue;
							}
							if (local207 == 3318) {
								Static128.anIntArray465[local29++] = Static113.anInt2771;
								continue;
							}
							if (local207 == 3320) {
								Static128.anIntArray465[local29++] = 1;
								continue;
							}
							if (local207 == 3321) {
								Static128.anIntArray465[local29++] = Static84.anInt2138;
								continue;
							}
							if (local207 == 3322) {
								Static128.anIntArray465[local29++] = Static131.anInt3268;
								continue;
							}
							if (local207 == 3323) {
								if (Static40.anInt1047 == 1) {
									Static128.anIntArray465[local29++] = 1;
								} else {
									Static128.anIntArray465[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 3500) {
							if (local207 == 3400) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								@Pc(3120) Class1_Sub3_Sub6 local3120 = Static120.method1346(local753);
								for (local618 = 0; local618 < local3120.anInt807; local618++) {
									if (local758 == local3120.anIntArray93[local618]) {
										Static70.aClass5Array9[local27++] = local3120.aClass5Array6[local618];
										local3120 = null;
										break;
									}
								}
								if (local3120 != null) {
									Static70.aClass5Array9[local27++] = local3120.aClass5_370;
								}
								continue;
							}
							if (local207 == 3408) {
								local29 -= 4;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								local1625 = Static128.anIntArray465[local29 + 2];
								local618 = Static128.anIntArray465[local29 + 3];
								@Pc(3194) Class1_Sub3_Sub6 local3194 = Static120.method1346(local1625);
								if (local3194.anInt802 == local753 && local3194.anInt799 == local758) {
									for (local3225 = 0; local3225 < local3194.anInt807; local3225++) {
										if (local3194.anIntArray93[local3225] == local618) {
											if (local758 == 115) {
												Static70.aClass5Array9[local27++] = local3194.aClass5Array6[local3225];
											} else {
												Static128.anIntArray465[local29++] = local3194.anIntArray92[local3225];
											}
											local3194 = null;
											break;
										}
									}
									if (local3194 != null) {
										if (local758 == 115) {
											Static70.aClass5Array9[local27++] = local3194.aClass5_370;
										} else {
											Static128.anIntArray465[local29++] = local3194.anInt803;
										}
									}
									continue;
								}
								if (local758 == 115) {
									Static70.aClass5Array9[local27++] = Static23.aClass5_344;
								} else {
									Static128.anIntArray465[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 3700) {
							if (local207 == 3600) {
								if (Static92.anInt2326 == 0) {
									Static128.anIntArray465[local29++] = -2;
								} else if (Static92.anInt2326 == 1) {
									Static128.anIntArray465[local29++] = -1;
								} else {
									Static128.anIntArray465[local29++] = Static20.anInt658;
								}
								continue;
							}
							if (local207 == 3601) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static92.anInt2326 == 2 && local753 < Static20.anInt658) {
									Static70.aClass5Array9[local27++] = Static9.aClass5Array2[local753];
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 3602) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static92.anInt2326 == 2 && Static20.anInt658 > local753) {
									Static128.anIntArray465[local29++] = Static117.anIntArray458[local753];
									continue;
								}
								Static128.anIntArray465[local29++] = 0;
								continue;
							}
							if (local207 == 3603) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static92.anInt2326 == 2 && local753 < Static20.anInt658) {
									Static128.anIntArray465[local29++] = Static54.anIntArray214[local753];
									continue;
								}
								Static128.anIntArray465[local29++] = 0;
								continue;
							}
							if (local207 == 3604) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local29--;
								local758 = Static128.anIntArray465[local29];
								Static122.method2172(local572, local758);
								continue;
							}
							if (local207 == 3605) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static63.method1295(local572.method193());
								continue;
							}
							if (local207 == 3606) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static113.method1950(local572.method193());
								continue;
							}
							if (local207 == 3607) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static46.method828(local572.method193());
								continue;
							}
							if (local207 == 3608) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static8.method246(local572.method193());
								continue;
							}
							if (local207 == 3609) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								if (local572.method217(Static92.aClass5_1101) || local572.method217(Static27.aClass5_388)) {
									local572 = local572.method184(7);
								}
								Static128.anIntArray465[local29++] = Static38.method697(local572) ? 1 : 0;
								continue;
							}
							if (local207 == 3611) {
								if (Static8.aClass5_134 == null) {
									Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								} else {
									Static70.aClass5Array9[local27++] = Static8.aClass5_134;
								}
								continue;
							}
							if (local207 == 3612) {
								if (Static8.aClass5_134 == null) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = Static127.anInt3250;
								}
								continue;
							}
							if (local207 == 3613) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static8.aClass5_134 != null && local753 < Static127.anInt3250) {
									Static70.aClass5Array9[local27++] = Static101.aClass1_Sub14Array1[local753].aClass5_867;
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 3614) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static8.aClass5_134 != null && local753 < Static127.anInt3250) {
									Static128.anIntArray465[local29++] = Static101.aClass1_Sub14Array1[local753].anInt1749;
									continue;
								}
								Static128.anIntArray465[local29++] = 0;
								continue;
							}
							if (local207 == 3615) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static8.aClass5_134 != null && local753 < Static127.anInt3250) {
									Static128.anIntArray465[local29++] = Static101.aClass1_Sub14Array1[local753].aByte5;
									continue;
								}
								Static128.anIntArray465[local29++] = 0;
								continue;
							}
							if (local207 == 3616) {
								Static128.anIntArray465[local29++] = Static82.aByte6;
								continue;
							}
							if (local207 == 3617) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static109.method1893(local753);
								continue;
							}
							if (local207 == 3618) {
								Static128.anIntArray465[local29++] = Static36.aByte4;
								continue;
							}
							if (local207 == 3619) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static22.method514(local572.method193());
								continue;
							}
							if (local207 == 3620) {
								Static12.method2244();
								continue;
							}
							if (local207 == 3621) {
								if (Static92.anInt2326 == 0) {
									Static128.anIntArray465[local29++] = -1;
								} else {
									Static128.anIntArray465[local29++] = Static92.anInt2321;
								}
								continue;
							}
							if (local207 == 3622) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (Static92.anInt2326 != 0 && local753 < Static92.anInt2321) {
									Static70.aClass5Array9[local27++] = Static76.method1314(Static38.aLongArray1[local753]).method219();
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
						} else if (local207 < 4100) {
							if (local207 == 4000) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local753 + local758;
								continue;
							}
							if (local207 == 4001) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local753 - local758;
								continue;
							}
							if (local207 == 4002) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local758 * local753;
								continue;
							}
							if (local207 == 4003) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local753 / local758;
								continue;
							}
							if (local207 == 4004) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = (int) ((double) local753 * Math.random());
								continue;
							}
							if (local207 == 4005) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = (int) ((double) (local753 + 1) * Math.random());
								continue;
							}
							if (local207 == 4006) {
								local29 -= 5;
								local758 = Static128.anIntArray465[local29 + 1];
								local618 = Static128.anIntArray465[local29 + 3];
								local753 = Static128.anIntArray465[local29];
								local1625 = Static128.anIntArray465[local29 + 2];
								local639 = Static128.anIntArray465[local29 + 4];
								Static128.anIntArray465[local29++] = (local758 - local753) * (-local1625 + local639) / (local618 - local1625) + local753;
								continue;
							}
							if (local207 == 4007) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local758 * local753 / 100 + local753;
								continue;
							}
							if (local207 == 4008) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local753 | 0x1 << local758;
								continue;
							}
							if (local207 == 4009) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = -(0x1 << local758) - 1 & local753;
								continue;
							}
							if (local207 == 4010) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = (0x1 << local758 & local753) == 0 ? 0 : 1;
								continue;
							}
							if (local207 == 4011) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local753 % local758;
								continue;
							}
							if (local207 == 4012) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								if (local753 == 0) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = (int) Math.pow((double) local753, (double) local758);
								}
								continue;
							}
							if (local207 == 4013) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								if (local753 == 0) {
									Static128.anIntArray465[local29++] = 0;
								} else if (local758 == 0) {
									Static128.anIntArray465[local29++] = Integer.MAX_VALUE;
								} else {
									Static128.anIntArray465[local29++] = (int) Math.pow((double) local753, 1.0D / (double) local758);
								}
								continue;
							}
							if (local207 == 4014) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local758 & local753;
								continue;
							}
							if (local207 == 4015) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								Static128.anIntArray465[local29++] = local753 | local758;
								continue;
							}
						} else if (local207 < 4200) {
							if (local207 == 4100) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local29--;
								local758 = Static128.anIntArray465[local29];
								Static70.aClass5Array9[local27++] = Static100.method1696(new Class5[] { local572, Static48.method838(local758) });
								continue;
							}
							if (local207 == 4101) {
								local27 -= 2;
								local1405 = Static70.aClass5Array9[local27 + 1];
								local572 = Static70.aClass5Array9[local27];
								Static70.aClass5Array9[local27++] = Static100.method1696(new Class5[] { local572, local1405 });
								continue;
							}
							if (local207 == 4102) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local29--;
								local758 = Static128.anIntArray465[local29];
								Static70.aClass5Array9[local27++] = Static100.method1696(new Class5[] { local572, Static99.method1689(local758) });
								continue;
							}
							if (local207 == 4103) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static70.aClass5Array9[local27++] = local572.method208();
								continue;
							}
							if (local207 == 4104) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								@Pc(4673) long local4673 = ((long) local753 + 11745L) * 86400000L;
								Static68.aCalendar1.setTime(new Date(local4673));
								local618 = Static68.aCalendar1.get(5);
								local639 = Static68.aCalendar1.get(2);
								local3225 = Static68.aCalendar1.get(1);
								Static70.aClass5Array9[local27++] = Static100.method1696(new Class5[] { Static48.method838(local618), Static120.aClass5_919, Static120.aClass5Array15[local639], Static120.aClass5_919, Static48.method838(local3225) });
								continue;
							}
							if (local207 == 4105) {
								local27 -= 2;
								local572 = Static70.aClass5Array9[local27];
								local1405 = Static70.aClass5Array9[local27 + 1];
								if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass74_1 != null && Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass74_1.aBoolean115) {
									Static70.aClass5Array9[local27++] = local1405;
									continue;
								}
								Static70.aClass5Array9[local27++] = local572;
								continue;
							}
							if (local207 == 4106) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static70.aClass5Array9[local27++] = Static48.method838(local753);
								continue;
							}
							if (local207 == 4107) {
								local27 -= 2;
								Static128.anIntArray465[local29++] = Static70.aClass5Array9[local27].method187(Static70.aClass5Array9[local27 + 1]);
								continue;
							}
							@Pc(4833) Class1_Sub3_Sub1_Sub1 local4833;
							@Pc(4828) byte[] local4828;
							if (local207 == 4108) {
								local29 -= 2;
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local1625 = Static128.anIntArray465[local29 + 1];
								local758 = Static128.anIntArray465[local29];
								local4828 = Static74.aClass41_Sub1_12.method1710(local1625, 0);
								local4833 = new Class1_Sub3_Sub1_Sub1(local4828);
								Static128.anIntArray465[local29++] = local4833.method152(local572, local758);
								continue;
							}
							if (local207 == 4109) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29];
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local1625 = Static128.anIntArray465[local29 + 1];
								local4828 = Static74.aClass41_Sub1_12.method1710(local1625, 0);
								local4833 = new Class1_Sub3_Sub1_Sub1(local4828);
								Static128.anIntArray465[local29++] = local4833.method158(local572, local758);
								continue;
							}
							if (local207 == 4110) {
								local27 -= 2;
								local572 = Static70.aClass5Array9[local27];
								local1405 = Static70.aClass5Array9[local27 + 1];
								local29--;
								if (Static128.anIntArray465[local29] == 1) {
									Static70.aClass5Array9[local27++] = local572;
								} else {
									Static70.aClass5Array9[local27++] = local1405;
								}
								continue;
							}
							if (local207 == 4111) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								Static70.aClass5Array9[local27++] = Static4.method163(local572);
								continue;
							}
							if (local207 == 4112) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local29--;
								local758 = Static128.anIntArray465[local29];
								Static70.aClass5Array9[local27++] = local572.method212(local758);
								continue;
							}
							if (local207 == 4113) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static102.method1747(local753) ? 1 : 0;
								continue;
							}
							if (local207 == 4114) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static68.method1207(local753) ? 1 : 0;
								continue;
							}
							if (local207 == 4115) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static117.method2223(local753) ? 1 : 0;
								continue;
							}
							if (local207 == 4116) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static93.method1591(local753) ? 1 : 0;
								continue;
							}
							if (local207 == 4117) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								if (local572 == null) {
									Static128.anIntArray465[local29++] = 0;
								} else {
									Static128.anIntArray465[local29++] = local572.method215();
								}
								continue;
							}
							if (local207 == 4118) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29];
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local1625 = Static128.anIntArray465[local29 + 1];
								Static70.aClass5Array9[local27++] = local572.method200(local758, local1625);
								continue;
							}
							if (local207 == 4119) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local1405 = Static9.method257(local572.method215());
								@Pc(5120) boolean local5120 = false;
								for (local618 = 0; local572.method215() > local618; local618++) {
									local639 = local572.method202(local618);
									if (local639 == 60) {
										local5120 = true;
									} else if (local639 == 62) {
										local5120 = false;
									} else if (!local5120) {
										local1405.method182(local639);
									}
								}
								local1405.method181();
								Static70.aClass5Array9[local27++] = local1405;
								continue;
							}
							if (local207 == 4120) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local29--;
								local758 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = local572.method198(local758);
								continue;
							}
						} else if (local207 < 4300) {
							if (local207 == 4200) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static70.aClass5Array9[local27++] = Static56.method1022(local753).aClass5_1323;
								continue;
							}
							@Pc(4302) Class1_Sub3_Sub16 local4302;
							if (local207 == 4201) {
								local29 -= 2;
								local758 = Static128.anIntArray465[local29 + 1];
								local753 = Static128.anIntArray465[local29];
								local4302 = Static56.method1022(local753);
								if (local758 >= 1 && local758 <= 5 && local4302.aClass5Array22[local758 - 1] != null) {
									Static70.aClass5Array9[local27++] = local4302.aClass5Array22[local758 - 1];
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 4202) {
								local29 -= 2;
								local753 = Static128.anIntArray465[local29];
								local758 = Static128.anIntArray465[local29 + 1];
								local4302 = Static56.method1022(local753);
								if (local758 >= 1 && local758 <= 5 && local4302.aClass5Array23[local758 - 1] != null) {
									Static70.aClass5Array9[local27++] = local4302.aClass5Array23[local758 - 1];
									continue;
								}
								Static70.aClass5Array9[local27++] = Static9.aClass5_150;
								continue;
							}
							if (local207 == 4203) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static56.method1022(local753).anInt2865;
								continue;
							}
							if (local207 == 4204) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static56.method1022(local753).anInt2857 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4447) Class1_Sub3_Sub16 local4447;
							if (local207 == 4205) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local4447 = Static56.method1022(local753);
								if (local4447.anInt2876 == -1 && local4447.anInt2860 >= 0) {
									Static128.anIntArray465[local29++] = local4447.anInt2860;
									continue;
								}
								Static128.anIntArray465[local29++] = local753;
								continue;
							}
							if (local207 == 4206) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local4447 = Static56.method1022(local753);
								if (local4447.anInt2876 >= 0 && local4447.anInt2860 >= 0) {
									Static128.anIntArray465[local29++] = local4447.anInt2860;
									continue;
								}
								Static128.anIntArray465[local29++] = local753;
								continue;
							}
							if (local207 == 4207) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								Static128.anIntArray465[local29++] = Static56.method1022(local753).aBoolean114 ? 1 : 0;
								continue;
							}
						} else if (local207 < 5100) {
							if (local207 == 5000) {
								Static128.anIntArray465[local29++] = Static77.anInt1817;
								continue;
							}
							if (local207 == 5001) {
								local29 -= 3;
								Static77.anInt1817 = Static128.anIntArray465[local29];
								Static43.anInt1073 = Static128.anIntArray465[local29 + 1];
								anInt1630 = Static128.anIntArray465[local29 + 2];
								Static44.aClass1_Sub20_Sub1_1.method2108(33);
								Static44.aClass1_Sub20_Sub1_1.method2081(Static77.anInt1817);
								Static44.aClass1_Sub20_Sub1_1.method2081(Static43.anInt1073);
								Static44.aClass1_Sub20_Sub1_1.method2081(anInt1630);
								continue;
							}
							if (local207 == 5002) {
								local29 -= 2;
								local27--;
								local572 = Static70.aClass5Array9[local27];
								local758 = Static128.anIntArray465[local29];
								local1625 = Static128.anIntArray465[local29 + 1];
								Static44.aClass1_Sub20_Sub1_1.method2108(76);
								Static44.aClass1_Sub20_Sub1_1.method2078(local572.method193());
								Static44.aClass1_Sub20_Sub1_1.method2081(local758 - 1);
								Static44.aClass1_Sub20_Sub1_1.method2081(local1625);
								continue;
							}
							if (local207 == 5003) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local1405 = null;
								if (local753 < 100) {
									local1405 = Static103.aClass5Array21[local753];
								}
								if (local1405 == null) {
									local1405 = Static9.aClass5_150;
								}
								Static70.aClass5Array9[local27++] = local1405;
								continue;
							}
							if (local207 == 5004) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local758 = -1;
								if (local753 < 100 && Static103.aClass5Array21[local753] != null) {
									local758 = Static39.anIntArray175[local753];
								}
								Static128.anIntArray465[local29++] = local758;
								continue;
							}
							if (local207 == 5005) {
								Static128.anIntArray465[local29++] = Static43.anInt1073;
								continue;
							}
							if (local207 == 5008) {
								local27--;
								local572 = Static70.aClass5Array9[local27];
								if (local572.method217(Static93.aClass5_1113)) {
									Static7.method223(local572);
								} else {
									local1405 = local572.method208();
									@Pc(3499) byte local3499 = 0;
									if (local1405.method217(Static37.aClass5_449)) {
										local3499 = 0;
										local572 = local572.method184(Static37.aClass5_449.method215());
									} else if (local1405.method217(Static125.aClass5_1420)) {
										local572 = local572.method184(Static125.aClass5_1420.method215());
										local3499 = 1;
									} else if (local1405.method217(Static93.aClass5_1105)) {
										local3499 = 2;
										local572 = local572.method184(Static93.aClass5_1105.method215());
									} else if (local1405.method217(Static27.aClass5_389)) {
										local3499 = 3;
										local572 = local572.method184(Static27.aClass5_389.method215());
									} else if (local1405.method217(Static109.aClass5_1257)) {
										local572 = local572.method184(Static109.aClass5_1257.method215());
										local3499 = 4;
									} else if (local1405.method217(Static74.aClass5_855)) {
										local3499 = 5;
										local572 = local572.method184(Static74.aClass5_855.method215());
									} else if (local1405.method217(Static124.aClass5_1403)) {
										local572 = local572.method184(Static124.aClass5_1403.method215());
										local3499 = 6;
									} else if (local1405.method217(Static99.aClass5_1169)) {
										local572 = local572.method184(Static99.aClass5_1169.method215());
										local3499 = 7;
									} else if (local1405.method217(Static104.aClass5_1211)) {
										local3499 = 8;
										local572 = local572.method184(Static104.aClass5_1211.method215());
									} else if (local1405.method217(Static127.aClass5_1455)) {
										local572 = local572.method184(Static127.aClass5_1455.method215());
										local3499 = 9;
									} else if (local1405.method217(Static78.aClass5_947)) {
										local3499 = 10;
										local572 = local572.method184(Static78.aClass5_947.method215());
									} else if (local1405.method217(Static83.aClass5_1025)) {
										local3499 = 11;
										local572 = local572.method184(Static83.aClass5_1025.method215());
									} else if (Static131.anInt3269 != 0) {
										if (local1405.method217(Static37.aClass5_448)) {
											local3499 = 0;
											local572 = local572.method184(Static37.aClass5_448.method215());
										} else if (local1405.method217(Static125.aClass5_1416)) {
											local3499 = 1;
											local572 = local572.method184(Static125.aClass5_1416.method215());
										} else if (local1405.method217(Static93.aClass5_1107)) {
											local572 = local572.method184(Static93.aClass5_1107.method215());
											local3499 = 2;
										} else if (local1405.method217(Static27.aClass5_386)) {
											local3499 = 3;
											local572 = local572.method184(Static27.aClass5_386.method215());
										} else if (local1405.method217(Static109.aClass5_1256)) {
											local572 = local572.method184(Static109.aClass5_1256.method215());
											local3499 = 4;
										} else if (local1405.method217(Static74.aClass5_848)) {
											local3499 = 5;
											local572 = local572.method184(Static74.aClass5_848.method215());
										} else if (local1405.method217(Static124.aClass5_1400)) {
											local572 = local572.method184(Static124.aClass5_1400.method215());
											local3499 = 6;
										} else if (local1405.method217(Static99.aClass5_1171)) {
											local3499 = 7;
											local572 = local572.method184(Static99.aClass5_1171.method215());
										} else if (local1405.method217(Static104.aClass5_1210)) {
											local3499 = 8;
											local572 = local572.method184(Static104.aClass5_1210.method215());
										} else if (local1405.method217(Static127.aClass5_1461)) {
											local3499 = 9;
											local572 = local572.method184(Static127.aClass5_1461.method215());
										} else if (local1405.method217(Static78.aClass5_948)) {
											local572 = local572.method184(Static78.aClass5_948.method215());
											local3499 = 10;
										} else if (local1405.method217(Static83.aClass5_1029)) {
											local3499 = 11;
											local572 = local572.method184(Static83.aClass5_1029.method215());
										}
									}
									@Pc(3907) byte local3907 = 0;
									local1405 = local572.method208();
									if (local1405.method217(Static37.aClass5_444)) {
										local3907 = 1;
										local572 = local572.method184(Static37.aClass5_444.method215());
									} else if (local1405.method217(Static129.aClass5_1474)) {
										local572 = local572.method184(Static129.aClass5_1474.method215());
										local3907 = 2;
									} else if (local1405.method217(Static113.aClass5_1290)) {
										local572 = local572.method184(Static113.aClass5_1290.method215());
										local3907 = 3;
									} else if (local1405.method217(Static24.aClass5_350)) {
										local572 = local572.method184(Static24.aClass5_350.method215());
										local3907 = 4;
									} else if (local1405.method217(Static103.aClass5_1204)) {
										local572 = local572.method184(Static103.aClass5_1204.method215());
										local3907 = 5;
									} else if (Static131.anInt3269 != 0) {
										if (local1405.method217(Static37.aClass5_446)) {
											local3907 = 1;
											local572 = local572.method184(Static37.aClass5_446.method215());
										} else if (local1405.method217(Static129.aClass5_1470)) {
											local3907 = 2;
											local572 = local572.method184(Static129.aClass5_1470.method215());
										} else if (local1405.method217(Static113.aClass5_1291)) {
											local572 = local572.method184(Static113.aClass5_1291.method215());
											local3907 = 3;
										} else if (local1405.method217(Static24.aClass5_347)) {
											local3907 = 4;
											local572 = local572.method184(Static24.aClass5_347.method215());
										} else if (local1405.method217(Static103.aClass5_1206)) {
											local3907 = 5;
											local572 = local572.method184(Static103.aClass5_1206.method215());
										}
									}
									Static44.aClass1_Sub20_Sub1_1.method2108(196);
									Static44.aClass1_Sub20_Sub1_1.method2081(0);
									local639 = Static44.aClass1_Sub20_Sub1_1.anInt2951;
									Static44.aClass1_Sub20_Sub1_1.method2081(local3499);
									Static44.aClass1_Sub20_Sub1_1.method2081(local3907);
									Static9.method259(local572, Static44.aClass1_Sub20_Sub1_1);
									Static44.aClass1_Sub20_Sub1_1.method2098(Static44.aClass1_Sub20_Sub1_1.anInt2951 - local639);
								}
								continue;
							}
							if (local207 == 5009) {
								local27 -= 2;
								local572 = Static70.aClass5Array9[local27];
								local1405 = Static70.aClass5Array9[local27 + 1];
								Static44.aClass1_Sub20_Sub1_1.method2108(73);
								Static44.aClass1_Sub20_Sub1_1.method2081(0);
								local1625 = Static44.aClass1_Sub20_Sub1_1.anInt2951;
								Static44.aClass1_Sub20_Sub1_1.method2078(local572.method193());
								Static9.method259(local1405, Static44.aClass1_Sub20_Sub1_1);
								Static44.aClass1_Sub20_Sub1_1.method2098(Static44.aClass1_Sub20_Sub1_1.anInt2951 - local1625);
								continue;
							}
							if (local207 == 5010) {
								local1405 = null;
								local29--;
								local753 = Static128.anIntArray465[local29];
								if (local753 < 100) {
									local1405 = Static93.aClass5Array19[local753];
								}
								if (local1405 == null) {
									local1405 = Static9.aClass5_150;
								}
								Static70.aClass5Array9[local27++] = local1405;
								continue;
							}
							if (local207 == 5011) {
								local29--;
								local753 = Static128.anIntArray465[local29];
								local1405 = null;
								if (local753 < 100) {
									local1405 = aClass5Array10[local753];
								}
								if (local1405 == null) {
									local1405 = Static9.aClass5_150;
								}
								Static70.aClass5Array9[local27++] = local1405;
								continue;
							}
							if (local207 == 5015) {
								if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1 == null || Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass5_985 == null) {
									local572 = Static93.aClass5_1114;
								} else {
									local572 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass5_985;
								}
								Static70.aClass5Array9[local27++] = local572;
								continue;
							}
							if (local207 == 5016) {
								Static128.anIntArray465[local29++] = anInt1630;
								continue;
							}
						}
					} else {
						if (local207 >= 2000) {
							local207 -= 1000;
							local29--;
							local963 = Static36.method680(Static128.anIntArray465[local29]);
						} else {
							local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
						}
						if (local207 == 1300) {
							local29--;
							local758 = Static128.anIntArray465[local29] - 1;
							if (local758 >= 0 && local758 <= 9) {
								local27--;
								local963.method1580(local758, Static70.aClass5Array9[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local207 == 1301) {
							local29 -= 2;
							local1625 = Static128.anIntArray465[local29 + 1];
							local758 = Static128.anIntArray465[local29];
							local963.aClass1_Sub17_58 = Static18.method2150(local758, local1625);
							continue;
						}
						if (local207 == 1302) {
							local29--;
							local963.aBoolean87 = Static128.anIntArray465[local29] == 1;
							continue;
						}
						if (local207 == 1303) {
							local29--;
							local963.anInt2255 = Static128.anIntArray465[local29];
							continue;
						}
						if (local207 == 1304) {
							local29--;
							local963.anInt2307 = Static128.anIntArray465[local29];
							continue;
						}
						if (local207 == 1305) {
							local27--;
							local963.aClass5_1097 = Static70.aClass5Array9[local27];
							continue;
						}
						if (local207 == 1306) {
							local27--;
							local963.aClass5_1099 = Static70.aClass5Array9[local27];
							continue;
						}
						if (local207 == 1307) {
							local963.aClass5Array17 = null;
							continue;
						}
					}
				} else {
					if (local207 >= 2000) {
						local207 -= 1000;
						local29--;
						local963 = Static36.method680(Static128.anIntArray465[local29]);
					} else {
						local963 = local925 ? Static55.aClass1_Sub17_34 : Static113.aClass1_Sub17_68;
					}
					if (local207 == 1000) {
						local29 -= 2;
						local963.anInt2279 = Static128.anIntArray465[local29];
						local963.anInt2267 = Static128.anIntArray465[local29 + 1];
						Static119.method2161(local963);
						continue;
					}
					if (local207 == 1001) {
						local29 -= 2;
						local963.anInt2305 = Static128.anIntArray465[local29];
						local963.anInt2293 = Static128.anIntArray465[local29 + 1];
						Static119.method2161(local963);
						continue;
					}
					if (local207 == 1003) {
						local29--;
						@Pc(1032) boolean local1032 = Static128.anIntArray465[local29] == 1;
						if (local963.aBoolean86 != local1032) {
							local963.aBoolean86 = local1032;
							Static119.method2161(local963);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7010) Exception local7010) {
			if (local20.aClass5_163 == null) {
				if (Static22.anInt728 != 0) {
					Static50.method893(Static36.aClass5_442, 0, Static9.aClass5_150);
				}
				Static122.method2173(local7010, "CS2 - scr:" + local20.aLong95 + " op:" + local38);
			} else {
				@Pc(7017) Class5 local7017 = Static9.method257(30);
				local7017.method192(Static26.aClass5_372).method192(local20.aClass5_163);
				for (local57 = Static89.anInt3022 - 1; local57 >= 0; local57--) {
					local7017.method192(Static105.aClass5_1342).method192(Static18.aClass64Array3[local57].aClass1_Sub3_Sub3_1.aClass5_163);
				}
				if (local38 == 40) {
					local95 = local36[local43];
					local7017.method192(Static46.aClass5_572).method192(Static48.method838(local95));
				}
				if (Static22.anInt728 != 0) {
					Static50.method893(Static100.method1696(new Class5[] { Static64.aClass5_789, local20.aClass5_163 }), 0, Static9.aClass5_150);
				}
				Static122.method2173(local7010, "CS2 - scr:" + local20.aLong95 + " op:" + local38 + new String(local7017.method220()));
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!of;III)V")
	public static void method1229(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static72.aClass1_Sub17_45 != null || Static69.aBoolean48 || (arg0 == null || Static124.method2203(arg0) == null)) {
			return;
		}
		Static72.aClass1_Sub17_45 = arg0;
		Static64.aClass1_Sub17_42 = Static124.method2203(arg0);
		Static44.anInt1086 = arg2;
		Static111.aBoolean105 = false;
		Static70.anInt1623 = 0;
		Static40.anInt1046 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1230() {
		aClass5Array10 = null;
		anIntArray276 = null;
	}
}
