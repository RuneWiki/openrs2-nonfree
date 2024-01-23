import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
	public static int anInt2791;

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString97 = "slide:";

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[I")
	public static int[] anIntArray232 = new int[2];

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "J")
	public static long aLong102 = 0L;

	@OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
	public static int anInt2796 = -1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)I")
	public static int method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static232.aBoolean256) {
			arg3 = 1000000;
			Static232.aBoolean256 = false;
		}
		@Pc(18) Class135 local18 = Static20.aClass135ArrayArray1[arg1][arg0];
		@Pc(21) int local21 = local18.anInt4076;
		@Pc(31) float local31 = local18.aFloat45 * ((float) arg2 * 0.1F + 0.7F);
		@Pc(34) int local34 = local18.anInt4068;
		if (!Static269.aBoolean27) {
			local34 = 0;
		}
		@Pc(41) float local41 = local18.aFloat44;
		@Pc(44) float local44 = local18.aFloat47;
		@Pc(47) int local47 = local18.anInt4073;
		@Pc(56) Class1_Sub1_Sub16 local56 = local18.aClass1_Sub1_Sub16_6;
		@Pc(59) float local59 = local18.aFloat42;
		@Pc(62) float local62 = local18.aFloat43;
		@Pc(65) float local65 = local18.aFloat46;
		if (local21 != Static67.anInt1331 || local31 != Static148.aFloat33 || local44 != Static173.aFloat39 || local41 != Static214.aFloat48 || local47 != Static257.anInt5009 || Static124.anInt2531 != local34 || Static242.aClass1_Sub1_Sub16_7 != local56 || local65 != Static145.aFloat32 || Static279.aFloat52 != local62 || local59 != Static262.aFloat27) {
			Static302.aFloat61 = Static30.aFloat6;
			Static310.anInt1321 = Static127.anInt2542;
			Static128.aFloat29 = Static97.aFloat15;
			Static167.anInt3501 = Static66.anInt1299;
			Static159.aFloat35 = Static101.aFloat16;
			Static302.aFloat60 = Static44.aFloat7;
			Static202.aFloat41 = Static23.aFloat4;
			Static215.aFloat49 = Static314.aFloat62;
			Static16.aClass1_Sub1_Sub16_1 = Static245.aClass1_Sub1_Sub16_3;
			Static40.anInt816 = Static119.anInt5886;
			if (Static146.aClass1_Sub1_Sub16_4 == null || Static16.aClass1_Sub1_Sub16_1 == Static146.aClass1_Sub1_Sub16_4) {
				Static146.aClass1_Sub1_Sub16_4 = new Class1_Sub1_Sub16();
			}
			Static257.anInt5009 = local47;
			Static145.aFloat32 = local65;
			Static214.aFloat48 = local41;
			Static67.anInt1331 = local21;
			Static262.aFloat27 = local59;
			Static173.aFloat39 = local44;
			Static148.aFloat33 = local31;
			Static279.aFloat52 = local62;
			Static124.anInt2531 = local34;
			Static302.anInt5717 = 0;
			Static242.aClass1_Sub1_Sub16_7 = local56;
		}
		if (Static302.anInt5717 < 65536) {
			Static302.anInt5717 += arg3 * 250;
			if (Static302.anInt5717 >= 65536) {
				Static101.aFloat16 = Static262.aFloat27;
				Static44.aFloat7 = Static214.aFloat48;
				Static16.aClass1_Sub1_Sub16_1 = null;
				Static66.anInt1299 = Static67.anInt1331;
				Static23.aFloat4 = Static173.aFloat39;
				Static97.aFloat15 = Static145.aFloat32;
				Static302.anInt5717 = 65536;
				Static245.aClass1_Sub1_Sub16_3 = Static242.aClass1_Sub1_Sub16_7;
				Static30.aFloat6 = Static279.aFloat52;
				Static314.aFloat62 = Static148.aFloat33;
				Static119.anInt5886 = Static124.anInt2531;
				Static127.anInt2542 = Static257.anInt5009;
			} else {
				@Pc(200) int local200 = Static302.anInt5717 >> 8;
				@Pc(207) int local207 = 65536 - Static302.anInt5717 >> 8;
				Static119.anInt5886 = local207 * Static40.anInt816 + Static124.anInt2531 * local200 >> 8;
				@Pc(226) float local226 = (float) (65536 - Static302.anInt5717) / 65536.0F;
				Static127.anInt2542 = ((Static310.anInt1321 & 0xFF00FF) * local207 + (Static257.anInt5009 & 0xFF00FF) * local200 & 0xFF00FF00) + (local200 * (Static257.anInt5009 & 0xFF00) + local207 * (Static310.anInt1321 & 0xFF00) & 0xFF0000) >> 8;
				Static66.anInt1299 = (local200 * (Static67.anInt1331 & 0xFF00FF) + (Static167.anInt3501 & 0xFF00FF) * local207 & 0xFF00FF00) + ((Static67.anInt1331 & 0xFF00) * local200 + local207 * (Static167.anInt3501 & 0xFF00) & 0xFF0000) >> 8;
				@Pc(293) float local293 = (float) Static302.anInt5717 / 65536.0F;
				Static23.aFloat4 = Static202.aFloat41 * local226 + Static173.aFloat39 * local293;
				Static30.aFloat6 = Static302.aFloat61 * local226 + local293 * Static279.aFloat52;
				Static44.aFloat7 = Static302.aFloat60 * local226 + local293 * Static214.aFloat48;
				Static101.aFloat16 = Static262.aFloat27 * local293 + local226 * Static159.aFloat35;
				Static314.aFloat62 = Static148.aFloat33 * local293 + local226 * Static215.aFloat49;
				Static97.aFloat15 = local226 * Static128.aFloat29 + Static145.aFloat32 * local293;
				if (Static242.aClass1_Sub1_Sub16_7 != Static16.aClass1_Sub1_Sub16_1) {
					if (Static16.aClass1_Sub1_Sub16_1 == null || Static242.aClass1_Sub1_Sub16_7 == null) {
						Static245.aClass1_Sub1_Sub16_3 = null;
					} else {
						Static245.aClass1_Sub1_Sub16_3 = Static146.aClass1_Sub1_Sub16_4.method3200(Static16.aClass1_Sub1_Sub16_1, Static242.aClass1_Sub1_Sub16_7, (float) Static302.anInt5717 / 65536.0F);
					}
				}
			}
		}
		return Static127.anInt2542;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	public static int method2262() {
		return Static49.aBoolean74 && Static88.aBooleanArray16[81] && Static316.anInt5941 > 2 ? Static244.anIntArray441[Static316.anInt5941 - 2] : Static244.anIntArray441[Static316.anInt5941 - 1];
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
			Static178.anInt3586 = -1;
			Static225.anInt4443 = -1;
			return;
		}
		@Pc(42) int local42 = Static104.method1648(Static295.anInt5586, arg3, arg1) - arg6;
		@Pc(46) int local46 = arg3 - Static243.anInt5653;
		@Pc(50) int local50 = local42 - Static141.anInt2760;
		@Pc(54) int local54 = arg1 - Static105.anInt2016;
		@Pc(58) int local58 = Class17.anIntArray22[Static140.anInt2757];
		@Pc(62) int local62 = Class17.anIntArray24[Static140.anInt2757];
		@Pc(66) int local66 = Class17.anIntArray22[Static262.anInt2349];
		@Pc(70) int local70 = Class17.anIntArray24[Static262.anInt2349];
		@Pc(80) int local80 = local66 * local54 + local46 * local70 >> 16;
		@Pc(91) int local91 = local70 * local54 - local66 * local46 >> 16;
		@Pc(93) int local93 = local80;
		@Pc(104) int local104 = local50 * local62 - local91 * local58 >> 16;
		@Pc(108) int local108 = local93 + arg0;
		@Pc(119) int local119 = local50 * local58 + local91 * local62 >> 16;
		if (local119 < 50) {
			Static225.anInt4443 = -1;
			Static178.anInt3586 = -1;
		} else if (Static291.aBoolean404) {
			@Pc(140) int local140 = arg2 * 512 >> 8;
			Static225.anInt4443 = arg5 + local108 * local140 / local119;
			@Pc(155) int local155 = arg7 * 512 >> 8;
			Static178.anInt3586 = arg4 + local104 * local155 / local119;
		} else {
			Static225.anInt4443 = arg5 + (local108 << 9) / local119;
			Static178.anInt3586 = arg4 + (local104 << 9) / local119;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static68.anInt1344++;
		Static296.anInt5597 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static313.anInt5907; local23 < Static68.anInt1350; local23++) {
			@Pc(30) Class1_Sub17[][] local30 = Static122.aClass1_Sub17ArrayArrayArray3[local23];
			for (local32 = Static233.anInt4690; local32 < Static10.anInt187; local32++) {
				for (local37 = Static137.anInt2713; local37 < Static315.anInt5923; local37++) {
					@Pc(46) Class1_Sub17 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static48.aBooleanArrayArray1[local32 + Static59.anInt1196 - Static257.anInt5014][local37 + Static59.anInt1196 - Static198.anInt3993] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean239 = true;
							local46.aBoolean238 = true;
							if (local46.anInt3452 > 0) {
								local46.aBoolean240 = true;
							} else {
								local46.aBoolean240 = false;
							}
							Static296.anInt5597++;
						} else {
							local46.aBoolean239 = false;
							local46.aBoolean238 = false;
							local46.anInt3444 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass61_1 != null) {
									@Pc(103) Class61 local103 = local46.aClass61_1;
									local103.aClass22_2.method4075(0, local23, local103.anInt1544, local103.anInt1545, local103.anInt1539);
									if (local103.aClass22_3 != null) {
										local103.aClass22_3.method4075(0, local23, local103.anInt1544, local103.anInt1545, local103.anInt1539);
									}
								}
								if (local46.aClass102_1 != null) {
									@Pc(134) Class102 local134 = local46.aClass102_1;
									local134.aClass22_4.method4075(local134.anInt2950, local23, local134.anInt2943, local134.anInt2949, local134.anInt2953);
									if (local134.aClass22_5 != null) {
										local134.aClass22_5.method4075(local134.anInt2950, local23, local134.anInt2943, local134.anInt2949, local134.anInt2953);
									}
								}
								if (local46.aClass171_1 != null) {
									@Pc(167) Class171 local167 = local46.aClass171_1;
									local167.aClass22_10.method4075(0, local23, local167.anInt5282, local167.anInt5287, local167.anInt5284);
								}
								if (local46.aClass60Array3 != null) {
									for (local183 = 0; local183 < local46.anInt3452; local183++) {
										@Pc(192) Class60 local192 = local46.aClass60Array3[local183];
										local192.aClass22_1.method4075(local192.anInt1534, local23, local192.anInt1535, local192.anInt1536, local192.anInt1528);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static208.anIntArrayArrayArray11 == Static61.anIntArrayArrayArray5;
		if (Static291.aBoolean404) {
			@Pc(244) GL local244 = Static291.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static217.method3427();
				Static207.method3280(3, -1);
				Static12.aBoolean10 = true;
				Static126.method2012();
				Static252.anInt4937 = -1;
				Static178.anInt3588 = -1;
				for (local32 = 0; local32 < Static141.aClass1_Sub20ArrayArray3[0].length; local32++) {
					@Pc(285) Class1_Sub20 local285 = Static141.aClass1_Sub20ArrayArray3[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean259 ? 1.0F : 0.5F);
					if (local285.anInt3741 != Static252.anInt4937) {
						Static252.anInt4937 = local285.anInt3741;
						Static292.method4349(local285.anInt3741);
						Static96.method1395(Static285.method4250());
					}
					local285.method3044(Static122.aClass1_Sub17ArrayArrayArray3, local294, false);
				}
				Static126.method2011();
			} else {
				local32 = Static313.anInt5907;
				while (true) {
					if (local32 >= Static68.anInt1350) {
						Static294.method4357(Static257.anInt5014, Static198.anInt3993, Static122.aClass1_Sub17ArrayArrayArray3);
						break;
					}
					for (local37 = 0; local37 < Static141.aClass1_Sub20ArrayArray3[local32].length; local37++) {
						@Pc(336) Class1_Sub20 local336 = Static141.aClass1_Sub20ArrayArray3[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean259 ? 1.0F : 0.5F);
						if (local336.anInt3735 != -1 && Static143.method2283(Static18.anInterface1_1.method1626(local336.anInt3735)) && Static311.aBoolean427) {
							Static292.method4349(local336.anInt3741);
						}
						local336.method3044(Static122.aClass1_Sub17ArrayArrayArray3, local350, false);
					}
					if (local32 == 0 && Static143.anInt2823 > 0) {
						Static291.method4299(101.5F);
						Static174.method2893(Static257.anInt5014, Static198.anInt3993, Static59.anInt1196, arg1, Static48.aBooleanArrayArray1, Static208.anIntArrayArrayArray11[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub17 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub17[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static313.anInt5907; local400 < Static68.anInt1350; local400++) {
			local407 = Static122.aClass1_Sub17ArrayArrayArray3[local400];
			for (local37 = -Static59.anInt1196; local37 <= 0; local37++) {
				local416 = Static257.anInt5014 + local37;
				local183 = Static257.anInt5014 - local37;
				if (local416 >= Static233.anInt4690 || local183 < Static10.anInt187) {
					for (local429 = -Static59.anInt1196; local429 <= 0; local429++) {
						local435 = Static198.anInt3993 + local429;
						local439 = Static198.anInt3993 - local429;
						if (local416 >= Static233.anInt4690) {
							if (local435 >= Static137.anInt2713) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, true);
								}
							}
							if (local439 < Static315.anInt5923) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, true);
								}
							}
						}
						if (local183 < Static10.anInt187) {
							if (local435 >= Static137.anInt2713) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, true);
								}
							}
							if (local439 < Static315.anInt5923) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, true);
								}
							}
						}
						if (Static296.anInt5597 == 0) {
							if (!local240) {
								Static303.aBoolean421 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static313.anInt5907; local400 < Static68.anInt1350; local400++) {
			local407 = Static122.aClass1_Sub17ArrayArrayArray3[local400];
			for (local37 = -Static59.anInt1196; local37 <= 0; local37++) {
				local416 = Static257.anInt5014 + local37;
				local183 = Static257.anInt5014 - local37;
				if (local416 >= Static233.anInt4690 || local183 < Static10.anInt187) {
					for (local429 = -Static59.anInt1196; local429 <= 0; local429++) {
						local435 = Static198.anInt3993 + local429;
						local439 = Static198.anInt3993 - local429;
						if (local416 >= Static233.anInt4690) {
							if (local435 >= Static137.anInt2713) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, false);
								}
							}
							if (local439 < Static315.anInt5923) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, false);
								}
							}
						}
						if (local183 < Static10.anInt187) {
							if (local435 >= Static137.anInt2713) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, false);
								}
							}
							if (local439 < Static315.anInt5923) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean239) {
									Static128.method2021(local451, false);
								}
							}
						}
						if (Static296.anInt5597 == 0) {
							if (!local240) {
								Static303.aBoolean421 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static303.aBoolean421 = false;
	}
}
