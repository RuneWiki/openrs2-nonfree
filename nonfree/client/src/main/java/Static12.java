import java.awt.event.ActionEvent;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!df;")
	public static Class16 aClass16_12;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Z")
	public static boolean aBoolean14;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array1 = new Class60[5];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static final int anInt372 = 2301979;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_158 = Static59.method1195("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!qf;")
	private static Class60 aClass60_165 = Static59.method1195("Moderator option: Mute player for 48 hours: <lt>OFF<gt>");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_159 = aClass60_165;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!qf;")
	private static Class60 aClass60_167 = Static59.method1195("Unable to find ");

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_160 = aClass60_167;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_164 = Static59.method1195("Bad session id)3");

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_161 = aClass60_164;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt374 = 0;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_162 = Static59.method1195("(U2");

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_163 = Static59.method1195("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public static final int anInt376 = 3353893;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public static int anInt377 = -1;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Lclient!qf;")
	public static Class60 aClass60_166 = Static59.method1195("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Ljava/lang/Object;Lclient!mf;IILclient!mf;II)V")
	public static void method335(@OriginalArg(0) Object[] arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub15 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = (Integer) arg0[0];
		@Pc(15) Class3_Sub1_Sub10 local15 = Static102.method1993(local11);
		if (local15 == null) {
			return;
		}
		Static69.anInt2143 = 0;
		@Pc(22) int local22 = 0;
		@Pc(25) int[] local25 = local15.anIntArray195;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(36) int[] local36 = local15.anIntArray194;
		@Pc(38) byte local38 = -1;
		@Pc(52) int local52;
		try {
			Static80.anIntArray252 = new int[local15.anInt1723];
			Static21.aClass60Array2 = new Class60[local15.anInt1722];
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			@Pc(80) int local80;
			for (local52 = 1; local52 < arg0.length; local52++) {
				if (arg0[local52] instanceof Integer) {
					local80 = (Integer) arg0[local52];
					if (local80 == -2147483647) {
						local80 = arg3;
					}
					if (local80 == -2147483646) {
						local80 = arg2;
					}
					if (local80 == -2147483645) {
						local80 = arg1 == null ? -1 : arg1.anInt2286;
					}
					if (local80 == -2147483644) {
						local80 = arg5;
					}
					if (local80 == -2147483643) {
						local80 = arg1 == null ? -1 : arg1.anInt2283;
					}
					if (local80 == -2147483642) {
						local80 = arg4 == null ? -1 : arg4.anInt2286;
					}
					if (local80 == -2147483641) {
						local80 = arg4 == null ? -1 : arg4.anInt2283;
					}
					Static80.anIntArray252[local48++] = local80;
				} else if (arg0[local52] instanceof Class60) {
					Static21.aClass60Array2[local50++] = (Class60) arg0[local52];
				}
			}
			local80 = 0;
			label1471: while (true) {
				local80++;
				if (local80 > 200000) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(173) int local173 = local25[local29];
				@Pc(727) int local727;
				@Pc(549) Class60 local549;
				@Pc(593) int local593;
				@Pc(733) int local733;
				@Pc(614) int local614;
				if (local173 < 100) {
					if (local173 == 0) {
						Static117.anIntArray341[local27++] = local36[local29];
						continue;
					}
					@Pc(196) int local196;
					if (local173 == 1) {
						local196 = local36[local29];
						Static117.anIntArray341[local27++] = Static18.anIntArray80[local196];
						continue;
					}
					if (local173 == 2) {
						local196 = local36[local29];
						local27--;
						Static18.anIntArray80[local196] = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 3) {
						Static124.aClass60Array21[local22++] = local15.aClass60Array5[local29];
						continue;
					}
					if (local173 == 6) {
						local29 += local36[local29];
						continue;
					}
					if (local173 == 7) {
						local27 -= 2;
						if (Static117.anIntArray341[local27] != Static117.anIntArray341[local27 + 1]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 8) {
						local27 -= 2;
						if (Static117.anIntArray341[local27] == Static117.anIntArray341[local27 + 1]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 9) {
						local27 -= 2;
						if (Static117.anIntArray341[local27 + 1] > Static117.anIntArray341[local27]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 10) {
						local27 -= 2;
						if (Static117.anIntArray341[local27] > Static117.anIntArray341[local27 + 1]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 21) {
						if (Static69.anInt2143 == 0) {
							return;
						}
						@Pc(360) Class76 local360 = Static45.aClass76Array1[--Static69.anInt2143];
						Static80.anIntArray252 = local360.anIntArray342;
						Static21.aClass60Array2 = local360.aClass60Array20;
						local15 = local360.aClass3_Sub1_Sub10_1;
						local36 = local15.anIntArray194;
						local29 = local360.anInt3219;
						local25 = local15.anIntArray195;
						continue;
					}
					if (local173 == 25) {
						local196 = local36[local29];
						Static117.anIntArray341[local27++] = Static35.method780(local196);
						continue;
					}
					if (local173 == 27) {
						local196 = local36[local29];
						local27--;
						Static122.method462(Static117.anIntArray341[local27], local196);
						continue;
					}
					if (local173 == 31) {
						local27 -= 2;
						if (Static117.anIntArray341[local27] <= Static117.anIntArray341[local27 + 1]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 32) {
						local27 -= 2;
						if (Static117.anIntArray341[local27] >= Static117.anIntArray341[local27 + 1]) {
							local29 += local36[local29];
						}
						continue;
					}
					if (local173 == 33) {
						Static117.anIntArray341[local27++] = Static80.anIntArray252[local36[local29]];
						continue;
					}
					@Pc(491) int local491;
					if (local173 == 34) {
						local491 = local36[local29];
						local27--;
						Static80.anIntArray252[local491] = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 35) {
						Static124.aClass60Array21[local22++] = Static21.aClass60Array2[local36[local29]];
						continue;
					}
					if (local173 == 36) {
						local491 = local36[local29];
						local22--;
						Static21.aClass60Array2[local491] = Static124.aClass60Array21[local22];
						continue;
					}
					if (local173 == 37) {
						local196 = local36[local29];
						local22 -= local196;
						local549 = Static95.method1787(Static124.aClass60Array21, local22, local196);
						Static124.aClass60Array21[local22++] = local549;
						continue;
					}
					if (local173 == 38) {
						local27--;
						continue;
					}
					if (local173 == 39) {
						local22--;
						continue;
					}
					if (local173 == 40) {
						local196 = local36[local29];
						@Pc(583) Class3_Sub1_Sub10 local583 = Static102.method1993(local196);
						@Pc(587) int[] local587 = new int[local583.anInt1723];
						@Pc(591) Class60[] local591 = new Class60[local583.anInt1722];
						for (local593 = 0; local593 < local583.anInt1718; local593++) {
							local587[local593] = Static117.anIntArray341[local593 + local27 - local583.anInt1718];
						}
						for (local614 = 0; local614 < local583.anInt1714; local614++) {
							local591[local614] = Static124.aClass60Array21[local22 + local614 - local583.anInt1714];
						}
						local27 -= local583.anInt1718;
						local22 -= local583.anInt1714;
						@Pc(651) Class76 local651 = new Class76();
						local651.aClass3_Sub1_Sub10_1 = local15;
						local651.aClass60Array20 = Static21.aClass60Array2;
						local15 = local583;
						local651.anInt3219 = local29;
						local29 = -1;
						local651.anIntArray342 = Static80.anIntArray252;
						Static45.aClass76Array1[Static69.anInt2143++] = local651;
						local36 = local583.anIntArray194;
						Static80.anIntArray252 = local587;
						Static21.aClass60Array2 = local591;
						local25 = local583.anIntArray195;
						continue;
					}
					if (local173 == 42) {
						Static117.anIntArray341[local27++] = Static118.anIntArray343[local36[local29]];
						continue;
					}
					if (local173 == 43) {
						local491 = local36[local29];
						local27--;
						Static118.anIntArray343[local491] = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 44) {
						local27--;
						local727 = Static117.anIntArray341[local27];
						local733 = local36[local29] & 0xFFFF;
						local196 = local36[local29] >> 16;
						if (local727 >= 0 && local727 <= 5000) {
							@Pc(755) byte local755 = -1;
							if (local733 == 105) {
								local755 = 0;
							}
							Static81.anIntArray263[local196] = local727;
							local593 = 0;
							while (true) {
								if (local727 <= local593) {
									continue label1471;
								}
								Static57.anIntArrayArray86[local196][local593] = local755;
								local593++;
							}
						}
						throw new RuntimeException();
					}
					if (local173 == 45) {
						local196 = local36[local29];
						local27--;
						local733 = Static117.anIntArray341[local27];
						if (local733 >= 0 && Static81.anIntArray263[local196] > local733) {
							Static117.anIntArray341[local27++] = Static57.anIntArrayArray86[local196][local733];
							continue;
						}
						throw new RuntimeException();
					}
					if (local173 == 46) {
						local196 = local36[local29];
						local27 -= 2;
						local733 = Static117.anIntArray341[local27];
						if (local733 >= 0 && Static81.anIntArray263[local196] > local733) {
							Static57.anIntArrayArray86[local196][local733] = Static117.anIntArray341[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(878) boolean local878;
				if (local36[local29] == 1) {
					local878 = true;
				} else {
					local878 = false;
				}
				@Pc(927) Class3_Sub15 local927;
				@Pc(1419) int local1419;
				@Pc(1820) int local1820;
				if (local173 < 1000) {
					if (local173 == 100) {
						local27 -= 3;
						local727 = Static117.anIntArray341[local27 + 1];
						local733 = Static117.anIntArray341[local27];
						local1419 = Static117.anIntArray341[local27 + 2];
						if (local727 == 0) {
							throw new RuntimeException();
						}
						@Pc(4924) Class3_Sub15 local4924 = Static86.method1067(local733);
						if (local4924.aClass3_Sub15Array2 == null) {
							local4924.aClass3_Sub15Array2 = new Class3_Sub15[local1419 + 1];
						}
						if (local4924.aClass3_Sub15Array2.length <= local1419) {
							@Pc(4943) Class3_Sub15[] local4943 = new Class3_Sub15[local1419 + 1];
							for (local1820 = 0; local1820 < local4924.aClass3_Sub15Array2.length; local1820++) {
								local4943[local1820] = local4924.aClass3_Sub15Array2[local1820];
							}
							local4924.aClass3_Sub15Array2 = local4943;
						}
						if (local1419 > 0 && local4924.aClass3_Sub15Array2[local1419 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1419 - 1));
						}
						@Pc(4996) Class3_Sub15 local4996 = new Class3_Sub15();
						local4996.aBoolean81 = true;
						local4996.anInt2306 = local4996.anInt2286 = local4924.anInt2286;
						local4996.anInt2283 = local1419;
						local4996.anInt2296 = local727;
						local4924.aClass3_Sub15Array2[local1419] = local4996;
						if (local878) {
							Static78.aClass3_Sub15_2 = local4996;
						} else {
							Static101.aClass3_Sub15_4 = local4996;
						}
						Static41.method941(local4924);
						continue;
					}
					if (local173 == 101) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						@Pc(5046) Class3_Sub15 local5046 = Static86.method1067(local927.anInt2286);
						local5046.aClass3_Sub15Array2[local927.anInt2283] = null;
						Static41.method941(local5046);
						continue;
					}
					if (local173 == 102) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						local927.aClass3_Sub15Array2 = null;
						Static41.method941(local927);
						continue;
					}
					if (local173 == 200) {
						local27 -= 2;
						local727 = Static117.anIntArray341[local27 + 1];
						local733 = Static117.anIntArray341[local27];
						@Pc(5098) Class3_Sub15 local5098 = Static68.method1390(local733, local727);
						if (local5098 != null && local727 != -1) {
							Static117.anIntArray341[local27++] = 1;
							if (local878) {
								Static78.aClass3_Sub15_2 = local5098;
							} else {
								Static101.aClass3_Sub15_4 = local5098;
							}
							continue;
						}
						Static117.anIntArray341[local27++] = 0;
						continue;
					}
				} else if (local173 >= 1000 && local173 < 1100 || !(local173 < 2000 || local173 >= 2100)) {
					if (local173 >= 2000) {
						local173 -= 1000;
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
					} else {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
					}
					Static41.method941(local927);
					if (local173 == 1000) {
						local27 -= 2;
						local927.anInt2291 = Static117.anIntArray341[local27];
						local927.anInt2243 = Static117.anIntArray341[local27 + 1];
						continue;
					}
					if (local173 == 1001) {
						local27 -= 2;
						local927.anInt2304 = Static117.anIntArray341[local27];
						local927.anInt2270 = Static117.anIntArray341[local27 + 1];
						continue;
					}
					if (local173 == 1003) {
						local27--;
						local927.aBoolean84 = Static117.anIntArray341[local27] == 1;
						continue;
					}
				} else if (local173 >= 1100 && local173 < 1200 || !(local173 < 2100 || local173 >= 2200)) {
					if (local173 >= 2000) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						local173 -= 1000;
					} else {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
					}
					Static41.method941(local927);
					if (local173 == 1100) {
						local27 -= 2;
						local927.anInt2273 = Static117.anIntArray341[local27];
						if (local927.anInt2273 > local927.anInt2298 - local927.anInt2304) {
							local927.anInt2273 = local927.anInt2298 - local927.anInt2304;
						}
						if (local927.anInt2273 < 0) {
							local927.anInt2273 = 0;
						}
						local927.anInt2241 = Static117.anIntArray341[local27 + 1];
						if (local927.anInt2284 - local927.anInt2270 < local927.anInt2241) {
							local927.anInt2241 = local927.anInt2284 - local927.anInt2270;
						}
						if (local927.anInt2241 < 0) {
							local927.anInt2241 = 0;
						}
						continue;
					}
					if (local173 == 1101) {
						local27--;
						local927.anInt2272 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1102) {
						local27--;
						local927.aBoolean72 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1103) {
						local27--;
						local927.anInt2288 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1104) {
						local27--;
						local927.anInt2264 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1105) {
						local27--;
						local927.anInt2299 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1106) {
						local27--;
						local927.anInt2242 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1107) {
						local27--;
						local927.aBoolean83 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1108) {
						local927.anInt2267 = 1;
						local27--;
						local927.anInt2279 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1109) {
						local27 -= 6;
						local927.anInt2255 = Static117.anIntArray341[local27];
						local927.anInt2301 = Static117.anIntArray341[local27 + 1];
						local927.anInt2259 = Static117.anIntArray341[local27 + 2];
						local927.anInt2302 = Static117.anIntArray341[local27 + 3];
						local927.anInt2295 = Static117.anIntArray341[local27 + 4];
						local927.anInt2300 = Static117.anIntArray341[local27 + 5];
						continue;
					}
					if (local173 == 1110) {
						local27--;
						local727 = Static117.anIntArray341[local27];
						if (local727 != local927.anInt2252) {
							local927.anInt2277 = 0;
							local927.anInt2252 = local727;
							local927.anInt2263 = 0;
						}
						continue;
					}
					if (local173 == 1111) {
						local27--;
						local927.aBoolean75 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1112) {
						local22--;
						local927.aClass60_969 = Static124.aClass60Array21[local22];
						continue;
					}
					if (local173 == 1113) {
						local27--;
						local927.anInt2297 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1114) {
						local27 -= 3;
						local927.anInt2246 = Static117.anIntArray341[local27];
						local927.anInt2250 = Static117.anIntArray341[local27 + 1];
						local927.anInt2238 = Static117.anIntArray341[local27 + 2];
						continue;
					}
					if (local173 == 1115) {
						local27--;
						local927.aBoolean82 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1116) {
						local27--;
						local927.anInt2280 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1117) {
						local27--;
						local927.anInt2289 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1118) {
						local27--;
						local927.aBoolean80 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1119) {
						local27--;
						local927.aBoolean76 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1120) {
						local27 -= 2;
						local927.anInt2298 = Static117.anIntArray341[local27];
						local927.anInt2284 = Static117.anIntArray341[local27 + 1];
						continue;
					}
				} else if (local173 >= 1200 && local173 < 1300 || !(local173 < 2200 || local173 >= 2300)) {
					if (local173 < 2000) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
					} else {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						local173 -= 1000;
					}
					Static41.method941(local927);
					if (local173 == 1200) {
						local27 -= 2;
						local1419 = Static117.anIntArray341[local27 + 1];
						local727 = Static117.anIntArray341[local27];
						local927.anInt2253 = local1419;
						local927.anInt2254 = local727;
						@Pc(1433) Class3_Sub1_Sub11 local1433 = Static22.method568(local727);
						local927.anInt2259 = local1433.anInt1862;
						local927.anInt2301 = local1433.anInt1877;
						local927.anInt2302 = local1433.anInt1868;
						local927.anInt2300 = local1433.anInt1851;
						local927.anInt2255 = local1433.anInt1869;
						local927.anInt2295 = local1433.anInt1841;
						if (local927.anInt2304 > 0) {
							local927.anInt2300 = local927.anInt2300 * 32 / local927.anInt2304;
						}
						continue;
					}
					if (local173 == 1201) {
						local927.anInt2267 = 2;
						local27--;
						local927.anInt2279 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1202) {
						local927.anInt2267 = 3;
						local927.anInt2279 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1.method1642();
						continue;
					}
				} else if (local173 >= 1300 && local173 < 1400 || local173 >= 2300 && local173 < 2400) {
					if (local173 >= 2000) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						local173 -= 1000;
					} else {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
					}
					if (local173 == 1300) {
						local27--;
						local727 = Static117.anIntArray341[local27] - 1;
						if (local727 >= 0 && local727 <= 9) {
							local22--;
							local927.method1498(local727, Static124.aClass60Array21[local22]);
							continue;
						}
						local22--;
						continue;
					}
					if (local173 == 1301) {
						local27 -= 2;
						local727 = Static117.anIntArray341[local27];
						local1419 = Static117.anIntArray341[local27 + 1];
						local927.aClass3_Sub15_1 = Static68.method1390(local727, local1419);
						continue;
					}
					if (local173 == 1302) {
						local27--;
						local927.aBoolean73 = Static117.anIntArray341[local27] == 1;
						continue;
					}
					if (local173 == 1303) {
						local27--;
						local927.anInt2262 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1304) {
						local27--;
						local927.anInt2294 = Static117.anIntArray341[local27];
						continue;
					}
					if (local173 == 1305) {
						local22--;
						local927.aClass60_968 = Static124.aClass60Array21[local22];
						continue;
					}
					if (local173 == 1306) {
						local22--;
						local927.aClass60_967 = Static124.aClass60Array21[local22];
						continue;
					}
				} else {
					@Pc(1707) Class60 local1707;
					if (local173 >= 1400 && local173 < 1500 || local173 >= 2400 && local173 < 2500) {
						@Pc(1681) int[] local1681 = null;
						if (local173 >= 2000) {
							local27--;
							local927 = Static86.method1067(Static117.anIntArray341[local27]);
							local173 -= 1000;
						} else {
							local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						}
						local22--;
						local1707 = Static124.aClass60Array21[local22];
						if (local1707.method1836() > 0 && local1707.method1832(local1707.method1836() - 1) == 89) {
							local27--;
							local593 = Static117.anIntArray341[local27];
							if (local593 > 0) {
								local1681 = new int[local593];
								while (local593-- > 0) {
									local27--;
									local1681[local593] = Static117.anIntArray341[local27];
								}
							}
							local1707 = local1707.method1864(0, local1707.method1836() - 1);
						}
						@Pc(1773) Object[] local1773 = new Object[local1707.method1836() + 1];
						for (local614 = local1773.length - 1; local614 >= 1; local614--) {
							if (local1707.method1832(local614 - 1) == 115) {
								local22--;
								local1773[local614] = Static124.aClass60Array21[local22];
							} else {
								local27--;
								local1773[local614] = Integer.valueOf(Static117.anIntArray341[local27]);
							}
						}
						local27--;
						local1820 = Static117.anIntArray341[local27];
						if (local1820 == -1) {
							local1773 = null;
						} else {
							local1773[0] = Integer.valueOf(local1820);
						}
						if (local173 == 1401) {
							local927.anObjectArray13 = local1773;
						}
						if (local173 == 1405) {
							local927.anObjectArray6 = local1773;
						}
						if (local173 == 1406) {
							local927.anObjectArray4 = local1773;
						}
						if (local173 == 1412) {
							local927.anObjectArray5 = local1773;
						}
						if (local173 == 1402) {
							local927.anObjectArray3 = local1773;
						}
						if (local173 == 1409) {
							local927.anObjectArray14 = local1773;
						}
						if (local173 == 1408) {
							local927.anObjectArray19 = local1773;
						}
						if (local173 == 1403) {
							local927.anObjectArray7 = local1773;
						}
						local927.aBoolean77 = true;
						if (local173 == 1414) {
							local927.anIntArray226 = local1681;
							local927.anObjectArray21 = local1773;
						}
						if (local173 == 1400) {
							local927.anObjectArray20 = local1773;
						}
						if (local173 == 1410) {
							local927.anObjectArray10 = local1773;
						}
						if (local173 == 1404) {
							local927.anObjectArray8 = local1773;
						}
						if (local173 == 1415) {
							local927.anObjectArray16 = local1773;
							local927.anIntArray234 = local1681;
						}
						if (local173 == 1422) {
							local927.anObjectArray12 = local1773;
						}
						if (local173 == 1407) {
							local927.anObjectArray9 = local1773;
							local927.anIntArray232 = local1681;
						}
						if (local173 == 1416) {
							local927.anObjectArray18 = local1773;
						}
						if (local173 == 1417) {
							local927.anObjectArray15 = local1773;
						}
						if (local173 == 1411) {
							local927.anObjectArray11 = local1773;
						}
						continue;
					}
					if (local173 < 1600) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						if (local173 == 1500) {
							Static117.anIntArray341[local27++] = local927.anInt2291;
							continue;
						}
						if (local173 == 1501) {
							Static117.anIntArray341[local27++] = local927.anInt2243;
							continue;
						}
						if (local173 == 1502) {
							Static117.anIntArray341[local27++] = local927.anInt2304;
							continue;
						}
						if (local173 == 1503) {
							Static117.anIntArray341[local27++] = local927.anInt2270;
							continue;
						}
						if (local173 == 1504) {
							Static117.anIntArray341[local27++] = local927.aBoolean84 ? 1 : 0;
							continue;
						}
						if (local173 == 1505) {
							Static117.anIntArray341[local27++] = local927.anInt2306;
							continue;
						}
					} else if (local173 < 1700) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						if (local173 == 1600) {
							Static117.anIntArray341[local27++] = local927.anInt2273;
							continue;
						}
						if (local173 == 1601) {
							Static117.anIntArray341[local27++] = local927.anInt2241;
							continue;
						}
						if (local173 == 1602) {
							Static124.aClass60Array21[local22++] = local927.aClass60_969;
							continue;
						}
						if (local173 == 1603) {
							Static117.anIntArray341[local27++] = local927.anInt2298;
							continue;
						}
						if (local173 == 1604) {
							Static117.anIntArray341[local27++] = local927.anInt2284;
							continue;
						}
						if (local173 == 1605) {
							Static117.anIntArray341[local27++] = local927.anInt2300;
							continue;
						}
						if (local173 == 1606) {
							Static117.anIntArray341[local27++] = local927.anInt2259;
							continue;
						}
						if (local173 == 1607) {
							Static117.anIntArray341[local27++] = local927.anInt2295;
							continue;
						}
						if (local173 == 1608) {
							Static117.anIntArray341[local27++] = local927.anInt2302;
							continue;
						}
					} else if (local173 < 1800) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						if (local173 == 1700) {
							Static117.anIntArray341[local27++] = local927.anInt2254;
							continue;
						}
						if (local173 == 1701) {
							if (local927.anInt2254 == -1) {
								Static117.anIntArray341[local27++] = 0;
							} else {
								Static117.anIntArray341[local27++] = local927.anInt2253;
							}
							continue;
						}
						if (local173 == 1702) {
							Static117.anIntArray341[local27++] = local927.anInt2283;
							continue;
						}
					} else if (local173 < 1900) {
						local927 = local878 ? Static78.aClass3_Sub15_2 : Static101.aClass3_Sub15_4;
						if (local173 == 1800) {
							Static117.anIntArray341[local27++] = Static57.method2266(Static33.method751(local927));
							continue;
						}
						if (local173 == 1801) {
							local27--;
							local727 = Static117.anIntArray341[local27];
							if (local927.aClass60Array14 != null && local727 < local927.aClass60Array14.length && local927.aClass60Array14[local727] != null) {
								Static124.aClass60Array21[local22++] = local927.aClass60Array14[local727];
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 1802) {
							if (local927.aClass60_968 == null) {
								Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							} else {
								Static124.aClass60Array21[local22++] = local927.aClass60_968;
							}
							continue;
						}
					} else if (local173 < 2600) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						if (local173 == 2500) {
							Static117.anIntArray341[local27++] = local927.anInt2291;
							continue;
						}
						if (local173 == 2501) {
							Static117.anIntArray341[local27++] = local927.anInt2243;
							continue;
						}
						if (local173 == 2502) {
							Static117.anIntArray341[local27++] = local927.anInt2304;
							continue;
						}
						if (local173 == 2503) {
							Static117.anIntArray341[local27++] = local927.anInt2270;
							continue;
						}
						if (local173 == 2504) {
							Static117.anIntArray341[local27++] = local927.aBoolean84 ? 1 : 0;
							continue;
						}
						if (local173 == 2505) {
							Static117.anIntArray341[local27++] = local927.anInt2306;
							continue;
						}
					} else if (local173 < 2700) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						if (local173 == 2600) {
							Static117.anIntArray341[local27++] = local927.anInt2273;
							continue;
						}
						if (local173 == 2601) {
							Static117.anIntArray341[local27++] = local927.anInt2241;
							continue;
						}
						if (local173 == 2602) {
							Static124.aClass60Array21[local22++] = local927.aClass60_969;
							continue;
						}
						if (local173 == 2603) {
							Static117.anIntArray341[local27++] = local927.anInt2298;
							continue;
						}
						if (local173 == 2604) {
							Static117.anIntArray341[local27++] = local927.anInt2284;
							continue;
						}
						if (local173 == 2605) {
							Static117.anIntArray341[local27++] = local927.anInt2300;
							continue;
						}
						if (local173 == 2606) {
							Static117.anIntArray341[local27++] = local927.anInt2259;
							continue;
						}
						if (local173 == 2607) {
							Static117.anIntArray341[local27++] = local927.anInt2295;
							continue;
						}
						if (local173 == 2608) {
							Static117.anIntArray341[local27++] = local927.anInt2302;
							continue;
						}
					} else if (local173 < 2800) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						if (local173 == 2700) {
							Static117.anIntArray341[local27++] = local927.anInt2254;
							continue;
						}
						if (local173 == 2701) {
							if (local927.anInt2254 == -1) {
								Static117.anIntArray341[local27++] = 0;
							} else {
								Static117.anIntArray341[local27++] = local927.anInt2253;
							}
							continue;
						}
					} else if (local173 < 2900) {
						local27--;
						local927 = Static86.method1067(Static117.anIntArray341[local27]);
						if (local173 == 2800) {
							Static117.anIntArray341[local27++] = Static57.method2266(Static33.method751(local927));
							continue;
						}
						if (local173 == 2801) {
							local27--;
							local727 = Static117.anIntArray341[local27];
							if (local927.aClass60Array14 != null && local927.aClass60Array14.length > local727 && local927.aClass60Array14[local727] != null) {
								Static124.aClass60Array21[local22++] = local927.aClass60Array14[local727];
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 2802) {
							if (local927.aClass60_968 == null) {
								Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							} else {
								Static124.aClass60Array21[local22++] = local927.aClass60_968;
							}
							continue;
						}
					} else if (local173 < 3200) {
						if (local173 == 3100) {
							local22--;
							local549 = Static124.aClass60Array21[local22];
							Static76.method1565(0, local549, Static76.aClass60_1024);
							continue;
						}
						if (local173 == 3101) {
							local27 -= 2;
							Static55.method1143(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1, Static117.anIntArray341[local27 + 1], Static117.anIntArray341[local27]);
							continue;
						}
						if (local173 == 3102) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (local733 >= 0 && Static22.anIntArray87.length > local733 && Static22.anIntArray87[local733] != -1) {
								Static118.aBoolean115 = true;
								Static45.aBoolean46 = true;
								Static51.anInt1340 = local733;
							}
							continue;
						}
						if (local173 == 3103) {
							Static76.method1561();
							continue;
						}
					} else if (local173 < 3300) {
						if (local173 == 3200) {
							local27 -= 3;
							Static85.method1674(Static117.anIntArray341[local27], Static117.anIntArray341[local27 + 1], Static117.anIntArray341[local27 + 2]);
							continue;
						}
						if (local173 == 3201) {
							local27--;
							Static29.method663(Static117.anIntArray341[local27]);
							continue;
						}
						if (local173 == 3202) {
							local27 -= 2;
							Static125.method2257(Static117.anIntArray341[local27 + 1], Static117.anIntArray341[local27]);
							continue;
						}
					} else if (local173 < 3400) {
						if (local173 == 3300) {
							Static117.anIntArray341[local27++] = Static34.anInt1183;
							continue;
						}
						if (local173 == 3301) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static50.method1074(local733, local727);
							continue;
						}
						if (local173 == 3302) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static32.method734(local733, local727);
							continue;
						}
						if (local173 == 3303) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static95.method1783(local733, local727);
							continue;
						}
						if (local173 == 3304) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static63.method1939(local733).anInt1411;
							continue;
						}
						if (local173 == 3305) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static68.anIntArray218[local733];
							continue;
						}
						if (local173 == 3306) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static33.anIntArray137[local733];
							continue;
						}
						if (local173 == 3307) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static3.anIntArray23[local733];
							continue;
						}
						if (local173 == 3308) {
							local733 = Static119.anInt3243;
							local727 = (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7) + Static112.anInt3118;
							local1419 = Static13.anInt410 + (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7);
							Static117.anIntArray341[local27++] = (local733 << 28) + (local727 << 14) + local1419;
							continue;
						}
						if (local173 == 3309) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 >> 14 & 0x3FFF;
							continue;
						}
						if (local173 == 3310) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 >> 28;
							continue;
						}
						if (local173 == 3311) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 & 0x3FFF;
							continue;
						}
						if (local173 == 3312) {
							Static117.anIntArray341[local27++] = Static124.aBoolean117 ? 1 : 0;
							continue;
						}
						if (local173 == 3313) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27] + 32768;
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = Static50.method1074(local733, local727);
							continue;
						}
						if (local173 == 3314) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27] + 32768;
							Static117.anIntArray341[local27++] = Static32.method734(local733, local727);
							continue;
						}
						if (local173 == 3315) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27] + 32768;
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = Static95.method1783(local733, local727);
							continue;
						}
						if (local173 == 3320) {
							Static117.anIntArray341[local27++] = 0;
							continue;
						}
						if (local173 == 3321) {
							Static117.anIntArray341[local27++] = Static17.anInt764;
							continue;
						}
						if (local173 == 3322) {
							Static117.anIntArray341[local27++] = Static130.anInt3476;
							continue;
						}
					} else if (local173 < 3500) {
						if (local173 == 3400) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							@Pc(3604) Class3_Sub1_Sub15 local3604 = Static23.method1666(local733);
							for (local593 = 0; local593 < local3604.anInt2519; local593++) {
								if (local3604.anIntArray249[local593] == local727) {
									Static124.aClass60Array21[local22++] = local3604.aClass60Array16[local593];
									local3604 = null;
									break;
								}
							}
							if (local3604 != null) {
								Static124.aClass60Array21[local22++] = local3604.aClass60_1063;
							}
							continue;
						}
						if (local173 == 3408) {
							local27 -= 4;
							local733 = Static117.anIntArray341[local27];
							local1419 = Static117.anIntArray341[local27 + 2];
							local727 = Static117.anIntArray341[local27 + 1];
							local593 = Static117.anIntArray341[local27 + 3];
							@Pc(3676) Class3_Sub1_Sub15 local3676 = Static23.method1666(local1419);
							if (local733 == local3676.anInt2510 && local727 == local3676.anInt2514) {
								for (local1820 = 0; local1820 < local3676.anInt2519; local1820++) {
									if (local593 == local3676.anIntArray249[local1820]) {
										if (local727 == 115) {
											Static124.aClass60Array21[local22++] = local3676.aClass60Array16[local1820];
										} else {
											Static117.anIntArray341[local27++] = local3676.anIntArray250[local1820];
										}
										local3676 = null;
										break;
									}
								}
								if (local3676 != null) {
									if (local727 == 115) {
										Static124.aClass60Array21[local22++] = local3676.aClass60_1063;
									} else {
										Static117.anIntArray341[local27++] = local3676.anInt2511;
									}
								}
								continue;
							}
							if (local727 == 115) {
								Static124.aClass60Array21[local22++] = Static48.aClass60_666;
							} else {
								Static117.anIntArray341[local27++] = 0;
							}
							continue;
						}
					} else if (local173 < 3700) {
						if (local173 == 3600) {
							if (Static51.anInt1366 == 0) {
								Static117.anIntArray341[local27++] = -2;
							} else if (Static51.anInt1366 == 1) {
								Static117.anIntArray341[local27++] = -1;
							} else {
								Static117.anIntArray341[local27++] = Static61.anInt1946;
							}
							continue;
						}
						if (local173 == 3601) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static51.anInt1366 == 2 && Static61.anInt1946 > local733) {
								Static124.aClass60Array21[local22++] = Static54.aClass60Array6[local733];
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 3602) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static51.anInt1366 == 2 && Static61.anInt1946 > local733) {
								Static117.anIntArray341[local27++] = Static41.anIntArray159[local733];
								continue;
							}
							Static117.anIntArray341[local27++] = 0;
							continue;
						}
						if (local173 == 3603) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static51.anInt1366 == 2 && Static61.anInt1946 > local733) {
								Static117.anIntArray341[local27++] = Static26.anIntArray123[local733];
								continue;
							}
							Static117.anIntArray341[local27++] = 0;
							continue;
						}
						if (local173 == 3604) {
							local22--;
							local549 = Static124.aClass60Array21[local22];
							local27--;
							local727 = Static117.anIntArray341[local27];
							Static60.method1207(local727, local549);
							continue;
						}
						if (local173 == 3611) {
							if (Static80.aClass60_1065 == null) {
								Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							} else {
								Static124.aClass60Array21[local22++] = Static80.aClass60_1065;
							}
							continue;
						}
						if (local173 == 3612) {
							if (Static80.aClass60_1065 == null) {
								Static117.anIntArray341[local27++] = 0;
							} else {
								Static117.anIntArray341[local27++] = Static50.anInt1624;
							}
							continue;
						}
						if (local173 == 3613) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static80.aClass60_1065 != null && local733 < Static50.anInt1624) {
								Static124.aClass60Array21[local22++] = Static78.aClass3_Sub10Array1[local733].aClass60_475;
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 3614) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static80.aClass60_1065 != null && Static50.anInt1624 > local733) {
								Static117.anIntArray341[local27++] = Static78.aClass3_Sub10Array1[local733].anInt1214;
								continue;
							}
							Static117.anIntArray341[local27++] = 0;
							continue;
						}
						if (local173 == 3615) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							if (Static80.aClass60_1065 != null && local733 < Static50.anInt1624) {
								Static117.anIntArray341[local27++] = Static78.aClass3_Sub10Array1[local733].aByte9;
								continue;
							}
							Static117.anIntArray341[local27++] = 0;
							continue;
						}
					} else if (local173 < 4100) {
						if (local173 == 4000) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local727 + local733;
							continue;
						}
						if (local173 == 4001) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 - local727;
							continue;
						}
						if (local173 == 4002) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local727 * local733;
							continue;
						}
						if (local173 == 4003) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 / local727;
							continue;
						}
						if (local173 == 4004) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = (int) ((double) local733 * Math.random());
							continue;
						}
						if (local173 == 4005) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = (int) ((double) (local733 + 1) * Math.random());
							continue;
						}
						if (local173 == 4006) {
							local27 -= 5;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							local1419 = Static117.anIntArray341[local27 + 2];
							local593 = Static117.anIntArray341[local27 + 3];
							local614 = Static117.anIntArray341[local27 + 4];
							Static117.anIntArray341[local27++] = local733 + (local727 - local733) * (-local1419 + local614) / (local593 - local1419);
							continue;
						}
						if (local173 == 4007) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local733 + local727 * local733 / 100;
							continue;
						}
						if (local173 == 4008) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 | 0x1 << local727;
							continue;
						}
						if (local173 == 4009) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local733 & -(0x1 << local727) - 1;
							continue;
						}
						if (local173 == 4010) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = (0x1 << local727 & local733) == 0 ? 0 : 1;
							continue;
						}
						if (local173 == 4011) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = local733 % local727;
							continue;
						}
						if (local173 == 4012) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							if (local733 == 0) {
								Static117.anIntArray341[local27++] = 0;
							} else {
								Static117.anIntArray341[local27++] = (int) Math.pow((double) local733, (double) local727);
							}
							continue;
						}
						if (local173 == 4013) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							if (local733 == 0) {
								Static117.anIntArray341[local27++] = 0;
							} else if (local727 == 0) {
								Static117.anIntArray341[local27++] = Integer.MAX_VALUE;
							} else {
								Static117.anIntArray341[local27++] = (int) Math.pow((double) local733, 1.0D / (double) local727);
							}
							continue;
						}
						if (local173 == 4014) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local733 & local727;
							continue;
						}
						if (local173 == 4015) {
							local27 -= 2;
							local733 = Static117.anIntArray341[local27];
							local727 = Static117.anIntArray341[local27 + 1];
							Static117.anIntArray341[local27++] = local733 | local727;
							continue;
						}
					} else if (local173 < 4200) {
						if (local173 == 4100) {
							local22--;
							local549 = Static124.aClass60Array21[local22];
							local27--;
							local727 = Static117.anIntArray341[local27];
							Static124.aClass60Array21[local22++] = Static60.method1211(new Class60[] { local549, Static65.method1341(local727) });
							continue;
						}
						if (local173 == 4101) {
							local22 -= 2;
							local1707 = Static124.aClass60Array21[local22 + 1];
							local549 = Static124.aClass60Array21[local22];
							Static124.aClass60Array21[local22++] = Static60.method1211(new Class60[] { local549, local1707 });
							continue;
						}
						if (local173 == 4102) {
							local22--;
							local549 = Static124.aClass60Array21[local22];
							local27--;
							local727 = Static117.anIntArray341[local27];
							Static124.aClass60Array21[local22++] = Static60.method1211(new Class60[] { local549, Static71.method1020(local727) });
							continue;
						}
						if (local173 == 4103) {
							local22--;
							local549 = Static124.aClass60Array21[local22];
							Static124.aClass60Array21[local22++] = local549.method1846();
							continue;
						}
						if (local173 == 4104) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							@Pc(2307) long local2307 = (long) local733 * 86400000L + 1014768000000L;
							Static63.aCalendar2.setTime(new Date(local2307));
							local593 = Static63.aCalendar2.get(5);
							local614 = Static63.aCalendar2.get(2);
							local1820 = Static63.aCalendar2.get(1);
							Static124.aClass60Array21[local22++] = Static60.method1211(new Class60[] { Static65.method1341(local593), Static108.aClass60_1292, Static49.aClass60Array4[local614], Static108.aClass60_1292, Static65.method1341(local1820) });
							continue;
						}
						if (local173 == 4105) {
							local22 -= 2;
							local1707 = Static124.aClass60Array21[local22 + 1];
							local549 = Static124.aClass60Array21[local22];
							if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1 != null && Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1.aBoolean90) {
								Static124.aClass60Array21[local22++] = local1707;
								continue;
							}
							Static124.aClass60Array21[local22++] = local549;
							continue;
						}
						if (local173 == 4106) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static124.aClass60Array21[local22++] = Static65.method1341(local733);
							continue;
						}
						if (local173 == 4107) {
							local22 -= 2;
							Static117.anIntArray341[local27++] = Static124.aClass60Array21[local22].method1842(Static124.aClass60Array21[local22 + 1]);
							continue;
						}
						@Pc(2473) Class3_Sub1_Sub2_Sub2 local2473;
						@Pc(2468) byte[] local2468;
						if (local173 == 4108) {
							local27 -= 2;
							local22--;
							local549 = Static124.aClass60Array21[local22];
							local727 = Static117.anIntArray341[local27];
							local1419 = Static117.anIntArray341[local27 + 1];
							local2468 = Static100.aClass25_Sub1_15.method931(0, local1419);
							local2473 = new Class3_Sub1_Sub2_Sub2(local2468);
							Static117.anIntArray341[local27++] = local2473.method833(local549, local727);
							continue;
						}
						if (local173 == 4109) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27];
							local22--;
							local549 = Static124.aClass60Array21[local22];
							local1419 = Static117.anIntArray341[local27 + 1];
							local2468 = Static100.aClass25_Sub1_15.method931(0, local1419);
							local2473 = new Class3_Sub1_Sub2_Sub2(local2468);
							Static117.anIntArray341[local27++] = local2473.method845(local549, local727);
							continue;
						}
						if (local173 == 4110) {
							local22 -= 2;
							local1707 = Static124.aClass60Array21[local22 + 1];
							local549 = Static124.aClass60Array21[local22];
							local27--;
							if (Static117.anIntArray341[local27] == 1) {
								Static124.aClass60Array21[local22++] = local549;
							} else {
								Static124.aClass60Array21[local22++] = local1707;
							}
							continue;
						}
					} else if (local173 < 4300) {
						if (local173 == 4200) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static124.aClass60Array21[local22++] = Static22.method568(local733).aClass60_816;
							continue;
						}
						@Pc(2598) Class3_Sub1_Sub11 local2598;
						if (local173 == 4201) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							local2598 = Static22.method568(local733);
							if (local727 >= 1 && local727 <= 5 && local2598.aClass60Array8[local727 - 1] != null) {
								Static124.aClass60Array21[local22++] = local2598.aClass60Array8[local727 - 1];
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 4202) {
							local27 -= 2;
							local727 = Static117.anIntArray341[local27 + 1];
							local733 = Static117.anIntArray341[local27];
							local2598 = Static22.method568(local733);
							if (local727 >= 1 && local727 <= 5 && local2598.aClass60Array9[local727 - 1] != null) {
								Static124.aClass60Array21[local22++] = local2598.aClass60Array9[local727 - 1];
								continue;
							}
							Static124.aClass60Array21[local22++] = Static76.aClass60_1024;
							continue;
						}
						if (local173 == 4203) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static22.method568(local733).anInt1860;
							continue;
						}
						if (local173 == 4204) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static22.method568(local733).anInt1878 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2743) Class3_Sub1_Sub11 local2743;
						if (local173 == 4205) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							local2743 = Static22.method568(local733);
							if (local2743.anInt1848 == -1 && local2743.anInt1845 >= 0) {
								Static117.anIntArray341[local27++] = local2743.anInt1845;
								continue;
							}
							Static117.anIntArray341[local27++] = local733;
							continue;
						}
						if (local173 == 4206) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							local2743 = Static22.method568(local733);
							if (local2743.anInt1848 >= 0 && local2743.anInt1845 >= 0) {
								Static117.anIntArray341[local27++] = local2743.anInt1845;
								continue;
							}
							Static117.anIntArray341[local27++] = local733;
							continue;
						}
						if (local173 == 4207) {
							local27--;
							local733 = Static117.anIntArray341[local27];
							Static117.anIntArray341[local27++] = Static22.method568(local733).aBoolean57 ? 1 : 0;
							continue;
						}
					}
				}
				local549 = Static82.method1656(30);
				if (local15.aClass60_762 != null) {
					local549.method1830(Static27.aClass60_382).method1830(local15.aClass60_762);
					for (local727 = Static69.anInt2143 - 1; local727 >= 0; local727--) {
						local549.method1830(Static36.aClass60_472).method1830(Static45.aClass76Array1[local727].aClass3_Sub1_Sub10_1.aClass60_762);
					}
					if (Static72.anInt2292 != 0) {
						Static76.method1565(0, Static60.method1211(new Class60[] { Static100.aClass60_1240, local15.aClass60_762 }), Static76.aClass60_1024);
					}
				}
				Static87.method1031(null, "CS2 - nosuchop:" + local173 + new String(local549.method1861()));
				return;
			}
		} catch (@Pc(5205) Exception local5205) {
			@Pc(5209) Class60 local5209 = Static82.method1656(30);
			if (local15.aClass60_762 != null) {
				local5209.method1830(Static27.aClass60_382).method1830(local15.aClass60_762);
				for (local52 = Static69.anInt2143 - 1; local52 >= 0; local52--) {
					local5209.method1830(Static36.aClass60_472).method1830(Static45.aClass76Array1[local52].aClass3_Sub1_Sub10_1.aClass60_762);
				}
				if (Static72.anInt2292 != 0) {
					Static76.method1565(0, Static60.method1211(new Class60[] { Static100.aClass60_1240, local15.aClass60_762 }), Static76.aClass60_1024);
				}
			}
			Static87.method1031(local5205, "CS2 - scr:" + local15.aLong107 + " op:" + local38 + new String(local5209.method1861()));
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
	public static boolean method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub1_Sub17 local3 = Static18.method517(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local3.method2287(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Object;ILclient!u;)V")
	public static void method337(@OriginalArg(0) Object arg0, @OriginalArg(2) Class74 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static126.method2277(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!md;)V")
	public static void method338(@OriginalArg(1) Class3_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt1503 == 0) {
			return;
		}
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg0.anInt1523 != -1 && arg0.anInt1523 < 32768) {
			@Pc(26) Class3_Sub1_Sub1_Sub3_Sub2 local26 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[arg0.anInt1523];
			if (local26 != null) {
				local35 = arg0.anInt1524 - local26.anInt1524;
				local41 = arg0.anInt1494 - local26.anInt1494;
				if (local35 != 0 || local41 != 0) {
					arg0.anInt1501 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt1523 >= 32768) {
			local72 = arg0.anInt1523 - 32768;
			if (local72 == Static34.anInt1184) {
				local72 = 2047;
			}
			@Pc(85) Class3_Sub1_Sub1_Sub3_Sub1 local85 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local72];
			if (local85 != null) {
				local41 = arg0.anInt1524 - local85.anInt1524;
				@Pc(101) int local101 = arg0.anInt1494 - local85.anInt1494;
				if (local41 != 0 || local101 != 0) {
					arg0.anInt1501 = (int) (Math.atan2((double) local41, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1542 != 0 || arg0.anInt1514 != 0) && (arg0.anInt1497 == 0 || arg0.anInt1498 > 0)) {
			local35 = arg0.anInt1494 - (arg0.anInt1514 - Static13.anInt410 - Static13.anInt410) * 64;
			local72 = arg0.anInt1524 - (arg0.anInt1542 - Static112.anInt3118 - Static112.anInt3118) * 64;
			if (local72 != 0 || local35 != 0) {
				arg0.anInt1501 = (int) (Math.atan2((double) local72, (double) local35) * 325.949D) & 0x7FF;
			}
			arg0.anInt1514 = 0;
			arg0.anInt1542 = 0;
		}
		local72 = arg0.anInt1501 - arg0.anInt1525 & 0x7FF;
		if (local72 == 0) {
			arg0.anInt1487 = 0;
			return;
		}
		arg0.anInt1487++;
		@Pc(231) boolean local231;
		if (local72 > 1024) {
			arg0.anInt1525 -= arg0.anInt1503;
			local231 = true;
			if (arg0.anInt1503 > local72 || local72 > 2048 - arg0.anInt1503) {
				arg0.anInt1525 = arg0.anInt1501;
				local231 = false;
			}
			if (arg0.anInt1486 == arg0.anInt1539 && (arg0.anInt1487 > 25 || local231)) {
				if (arg0.anInt1505 == -1) {
					arg0.anInt1486 = arg0.anInt1511;
				} else {
					arg0.anInt1486 = arg0.anInt1505;
				}
			}
		} else {
			arg0.anInt1525 += arg0.anInt1503;
			local231 = true;
			if (arg0.anInt1503 > local72 || local72 > 2048 - arg0.anInt1503) {
				local231 = false;
				arg0.anInt1525 = arg0.anInt1501;
			}
			if (arg0.anInt1486 == arg0.anInt1539 && (arg0.anInt1487 > 25 || local231)) {
				if (arg0.anInt1484 == -1) {
					arg0.anInt1486 = arg0.anInt1511;
				} else {
					arg0.anInt1486 = arg0.anInt1484;
				}
			}
		}
		arg0.anInt1525 &= 0x7FF;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ma;III)V")
	public static void method339(@OriginalArg(0) Class3_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 * arg1 + arg2 * arg2;
		if (local16 <= 4225 || local16 >= 90000) {
			Static119.method2150(arg1, arg0, arg2);
			return;
		}
		@Pc(28) int local28 = Static39.anInt1294 + Static107.anInt3040 & 0x7FF;
		@Pc(32) int local32 = Class3_Sub1_Sub2_Sub1.anIntArray41[local28];
		@Pc(40) int local40 = local32 * 256 / (Static43.anInt1424 + 256);
		@Pc(44) int local44 = Class3_Sub1_Sub2_Sub1.anIntArray39[local28];
		@Pc(52) int local52 = local44 * 256 / (Static43.anInt1424 + 256);
		@Pc(63) int local63 = arg1 * local52 - arg2 * local40 >> 16;
		@Pc(74) int local74 = arg1 * local40 + arg2 * local52 >> 16;
		@Pc(80) double local80 = Math.atan2((double) local74, (double) local63);
		@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
		@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
		Static129.aClass3_Sub1_Sub2_Sub3_6.method1434(local86 + 84 + 4, 83 - (local92 + 20), local80);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method340() {
		aClass60_166 = null;
		aClass60_162 = null;
		anIntArray52 = null;
		aClass60_167 = null;
		aClass60_158 = null;
		aClass60Array1 = null;
		aClass60_159 = null;
		aClass60_164 = null;
		aClass60_165 = null;
		aClass3_Sub1_Sub2_Sub3_1 = null;
		aClass16_12 = null;
		aClass60_161 = null;
		aClass60_163 = null;
		aClass60_160 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method341() {
		Static100.method1983();
		Static113.aBoolean112 = true;
		Static103.method2012();
		@Pc(29) boolean local29;
		if (Static119.anInt3242 != -1) {
			local29 = Static13.method354(1, Static119.anInt3242, 190, 261);
			if (!local29) {
				Static118.aBoolean115 = true;
			}
		} else if (Static22.anIntArray87[Static51.anInt1340] != -1) {
			local29 = Static13.method354(1, Static22.anIntArray87[Static51.anInt1340], 190, 261);
			if (!local29) {
				Static118.aBoolean115 = true;
			}
		}
		if (Static67.aBoolean69 && Static19.anInt3405 == 1) {
			if (Static123.anInt3361 == 1) {
				Static43.method973();
			} else {
				Static48.method1026();
			}
		}
		Static53.method1134();
	}
}
