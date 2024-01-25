import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	public static int anInt2956;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_104 = new Class106("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_84 = new Class21(64);

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	public static final int anInt2957 = 12;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_98 = new Class18(29, 0);

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_105 = new Class106("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!fp;ZILclient!ui;Z[Lclient!th;)V")
	public static void method2774(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class196[] arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(27) int local27;
		if (!arg3) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static311.anInt5653; local9++) {
					for (local13 = 0; local13 < Static189.anInt3820; local13++) {
						if ((Static264.aByteArrayArrayArray7[local5][local9][local13] & 0x1) != 0) {
							local27 = local5;
							if ((Static264.aByteArrayArrayArray7[1][local9][local13] & 0x2) != 0) {
								local27 = local5 - 1;
							}
							if (local27 >= 0) {
								arg4[local27].method5325(local13, local9);
							}
						}
					}
				}
			}
		}
		@Pc(74) int[][] local74 = new int[Static311.anInt5653][Static189.anInt3820];
		for (local9 = 0; local9 < arg1; local9++) {
			for (local13 = 0; local13 < Static189.anInt3820; local13++) {
				Static103.anIntArray171[local13] = 0;
				Static129.anIntArray212[local13] = 0;
				Static259.anIntArray399[local13] = 0;
				Static275.anIntArray416[local13] = 0;
				Static100.anIntArray170[local13] = 0;
			}
			for (local27 = -5; local27 < Static311.anInt5653; local27++) {
				@Pc(118) int local118;
				@Pc(131) int local131;
				@Pc(197) int local197;
				for (@Pc(112) int local112 = 0; local112 < Static189.anInt3820; local112++) {
					local118 = local27 + 5;
					@Pc(178) int local178;
					if (Static311.anInt5653 > local118) {
						local131 = Static310.aByteArrayArrayArray8[local9][local118][local112] & 0xFF;
						if (local131 > 0) {
							@Pc(142) Class189 local142 = Static49.method1146(local131 - 1);
							Static103.anIntArray171[local112] += local142.anInt5577;
							Static129.anIntArray212[local112] += local142.anInt5580;
							Static259.anIntArray399[local112] += local142.anInt5571;
							Static275.anIntArray416[local112] += local142.anInt5574;
							local178 = Static100.anIntArray170[local112]++;
						}
					}
					local131 = local27 - 5;
					if (local131 >= 0) {
						local197 = Static310.aByteArrayArrayArray8[local9][local131][local112] & 0xFF;
						if (local197 > 0) {
							@Pc(208) Class189 local208 = Static49.method1146(local197 - 1);
							Static103.anIntArray171[local112] -= local208.anInt5577;
							Static129.anIntArray212[local112] -= local208.anInt5580;
							Static259.anIntArray399[local112] -= local208.anInt5571;
							Static275.anIntArray416[local112] -= local208.anInt5574;
							local178 = Static100.anIntArray170[local112]--;
						}
					}
				}
				if (local27 >= 0) {
					local118 = 0;
					local131 = 0;
					local197 = 0;
					@Pc(268) int local268 = 0;
					@Pc(270) int local270 = 0;
					for (@Pc(272) int local272 = -5; local272 < Static189.anInt3820; local272++) {
						@Pc(278) int local278 = local272 + 5;
						if (local278 < Static189.anInt3820) {
							local270 += Static100.anIntArray170[local278];
							local268 += Static275.anIntArray416[local278];
							local131 += Static129.anIntArray212[local278];
							local197 += Static259.anIntArray399[local278];
							local118 += Static103.anIntArray171[local278];
						}
						@Pc(319) int local319 = local272 - 5;
						if (local319 >= 0) {
							local270 -= Static100.anIntArray170[local319];
							local131 -= Static129.anIntArray212[local319];
							local118 -= Static103.anIntArray171[local319];
							local197 -= Static259.anIntArray399[local319];
							local268 -= Static275.anIntArray416[local319];
						}
						if (local272 >= 0 && local268 > 0 && local270 > 0) {
							local74[local27][local272] = Static290.method5228(local118 * 256 / local268, local131 / local270, local197 / local270);
						}
					}
				}
			}
			Static315.method5398(local9, Static192.aByteArrayArrayArray5[local9], local74, Static310.aByteArrayArrayArray8[local9], arg2, Static189.anInt3820, arg3, Static341.aByteArrayArrayArray11[local9], arg0, Static35.aByteArrayArrayArray1[local9], Static311.anInt5653, Static258.aClass36Array2[local9]);
			Static310.aByteArrayArrayArray8[local9] = null;
			Static341.aByteArrayArrayArray11[local9] = null;
			Static35.aByteArrayArrayArray1[local9] = null;
			Static192.aByteArrayArrayArray5[local9] = null;
		}
		if (!arg3) {
			if (Static69.aBoolean112) {
				Static66.method1519();
			}
			if (Static218.anInt4352 != 0) {
				Static31.method822();
			}
		}
		for (local13 = 0; local13 < arg1; local13++) {
			Static258.aClass36Array2[local13].method4434();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static339.anInt6001++;
		Static91.anInt7043 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static112.anInt2495; local7 < Static263.anInt5201; local7++) {
			@Pc(12) Class155[][] local12 = Static105.aClass155ArrayArrayArray3[local7];
			for (local14 = Static144.anInt3085; local14 < Static330.anInt6234; local14++) {
				for (@Pc(17) int local17 = Static192.anInt3871; local17 < Static21.anInt519; local17++) {
					@Pc(24) Class155 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static28.aBooleanArrayArray1[local14 + Static87.anInt1923 - Static79.anInt1760][local17 + Static87.anInt1923 - Static42.anInt1018] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean339 = true;
							local24.aBoolean338 = true;
							if (local24.aClass187_2 == null) {
								local24.aBoolean340 = false;
							} else {
								local24.aBoolean340 = true;
							}
							Static91.anInt7043++;
						} else {
							local24.aBoolean339 = false;
							local24.aBoolean338 = false;
							local24.aByte38 = 0;
							if (local14 >= Static79.anInt1760 - 16 && local14 <= Static79.anInt1760 + 16 && local17 >= Static42.anInt1018 - 16 && local17 <= Static42.anInt1018 + 16 && (local24.aClass11_Sub5_2 != null || local24.aClass11_Sub5_1 != null || local24.aClass11_Sub4_1 != null || local24.aClass11_Sub4_2 != null || local24.aClass11_Sub1_2 != null || local24.aClass187_2 != null)) {
								Static286.aClass118_4.method5660(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static200.aClass36Array4 == Static258.aClass36Array2;
		for (local14 = Static112.anInt2495; local14 < Static263.anInt5201; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static368.aClass63_9.method4598() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static28.aBooleanArrayArray1.length;
				if (Static144.anInt3085 + Static28.aBooleanArrayArray1.length > Static300.anInt5778) {
					local172 -= Static144.anInt3085 + Static28.aBooleanArrayArray1.length - Static300.anInt5778;
				}
				@Pc(192) int local192 = Static28.aBooleanArrayArray1[0].length;
				if (Static192.anInt3871 + Static28.aBooleanArrayArray1[0].length > Static354.anInt6714) {
					local192 -= Static192.anInt3871 + Static28.aBooleanArrayArray1[0].length - Static354.anInt6714;
				}
				@Pc(213) int local213 = Static46.anInt1179;
				while (true) {
					if (local213 >= local172) {
						Static286.aClass118_4.method5667(local161, true, local14, Static258.aClass36Array2[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static144.anInt3085 - Static46.anInt1179;
					for (@Pc(222) int local222 = Static310.anInt5976; local222 < local192; local222++) {
						Static75.aBooleanArrayArray5[local213][local222] = false;
						if (Static28.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static192.anInt3871 - Static310.anInt5976;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static105.aClass155ArrayArrayArray3[local243][local220][local241] != null && Static105.aClass155ArrayArrayArray3[local243][local220][local241].aByte41 == local14) {
									Static75.aBooleanArrayArray5[local213][local222] = Static105.aClass155ArrayArrayArray3[local243][local220][local241].aBoolean339;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static286.aClass118_4.method5667(local161, false, local14, Static258.aClass36Array2[local14]);
			}
			Static286.aClass118_4.method5665();
		}
		if (!Static342.method5732(true)) {
			Static342.method5732(false);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public static void method2779() {
		Static353.aClass21_174.method844(5);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	public static void method2780() {
		if (Static260.anInt5193 <= 0) {
			Static268.aString50 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static282.aStringArray33.length; local14++) {
			if (Static282.aStringArray33[local14].startsWith("--> ")) {
				@Pc(25) int local25 = ~Static260.anInt5193;
				local12++;
				if (local25 == ~local12) {
					Static268.aString50 = Static282.aStringArray33[local14].substring(4);
					break;
				}
			}
		}
	}
}
