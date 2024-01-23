import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "J")
	public static volatile long aLong244 = 0L;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "[I")
	public static int[] anIntArray631 = new int[] { 0, -2, 0, 0, 0, 0, 6, 0, -1, -1, 0, 0, 0, 3, 28, 8, 0, 4, 0, 0, -1, 5, 0, 0, 0, -1, 0, 0, 8, 0, 11, 8, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, -1, 0, 0, 10, 0, 2, 0, 3, 6, 7, 14, 0, 0, 0, 1, 2, 0, 0, 0, 3, 0, 0, 6, 7, 0, 17, 0, -1, 8, 0, 12, 0, 0, 6, 1, 0, 8, 3, 8, 4, 0, 0, -2, 0, 6, 0, 6, 0, 2, 10, 0, 0, 6, 0, 0, -1, 0, 4, 0, 0, 0, -1, 0, 0, 5, 8, -2, 0, -1, 0, -1, 15, -1, 0, -1, 0, 0, 1, 0, 4, 8, 0, 0, 0, 12, -2, 0, 0, 3, 0, 10, 0, 7, 0, -2, 2, 0, 0, 0, 3, 0, 0, 0, 2, 15, 12, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 9, 0, 6, 0, 0, 14, 0, 8, 0, 0, 0, 6, 6, 0, 2, 0, 0, 0, 0, 0, 8, 0, 0, 0, 5, 2, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 20, 0, -2, 0, 0, 1, -2, -2, 0, 0, 0, 3, 0, -2, 12, 0, 6, 0, 3, 0, -1, 3, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 6, -2 };

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "[C")
	public static char[] aCharArray41 = new char[128];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!f;Lclient!nc;ILclient!sd;III)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) Class10_Sub5_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10_Sub5_Sub2 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class3_Sub20 local9 = new Class3_Sub20();
		local9.anInt2985 = arg1;
		local9.anInt2993 = arg7 * 128;
		local9.anInt2998 = arg4 * 128;
		if (arg2 != null) {
			local9.anInt3000 = arg2.anInt1338;
			local9.anInt2990 = arg2.anInt1333;
			local9.anInt2988 = arg2.anInt1358;
			local9.anInt2995 = arg2.anInt1366 * 128;
			@Pc(154) int local154 = arg2.anInt1360;
			local9.aClass49_1 = arg2;
			@Pc(160) int local160 = arg2.anInt1329;
			if (arg6 == 1 || arg6 == 3) {
				local154 = arg2.anInt1329;
				local160 = arg2.anInt1360;
			}
			local9.anInt2997 = arg2.anInt1341;
			local9.anIntArray348 = arg2.anIntArray135;
			local9.anInt2992 = (arg7 + local154) * 128;
			local9.anInt2996 = (local160 + arg4) * 128;
			if (arg2.anIntArray131 != null) {
				local9.aBoolean214 = true;
				local9.method2657();
			}
			if (local9.anIntArray348 != null) {
				local9.anInt2987 = local9.anInt3000 + (int) ((double) (local9.anInt2997 - local9.anInt3000) * Math.random());
			}
			Static150.aClass56_9.method1282(local9);
		} else if (arg5 != null) {
			local9.aClass10_Sub5_Sub2_1 = arg5;
			@Pc(81) Class124 local81 = arg5.aClass124_1;
			if (local81.anIntArray432 != null) {
				local9.aBoolean214 = true;
				local81 = local81.method3191();
			}
			if (local81 != null) {
				local9.anInt2996 = (local81.anInt3781 + arg4) * 128;
				local9.anInt2992 = (arg7 + local81.anInt3781) * 128;
				local9.anInt2988 = Static221.method3631(arg5);
				local9.anInt2990 = local81.anInt3795;
				local9.anInt2995 = local81.anInt3771 * 128;
			}
			Static39.aClass56_4.method1282(local9);
		} else if (arg3 != null) {
			local9.aClass10_Sub5_Sub1_2 = arg3;
			local9.anInt2992 = (arg3.method4186() + arg7) * 128;
			local9.anInt2996 = (arg4 + arg3.method4186()) * 128;
			local9.anInt2988 = Static130.method2209(arg3);
			local9.anInt2990 = arg3.anInt3585;
			local9.anInt2995 = arg3.anInt3587 * 128;
			Static245.aClass30_32.method668(local9, (long) arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Lclient!rg;")
	public static Class151 method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class151 local3 = Static243.method4115(arg1);
		if (arg0 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass151Array2 == null || local3.aClass151Array2.length <= arg0) {
			return null;
		} else {
			return local3.aClass151Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static23.anInt428++;
		Static122.anInt2305 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static92.anInt1674; local23 < Static158.anInt2948; local23++) {
			@Pc(30) Class3_Sub25[][] local30 = Static146.aClass3_Sub25ArrayArrayArray7[local23];
			for (local32 = Static183.anInt3631; local32 < Static11.anInt5176; local32++) {
				for (local37 = Static198.anInt3862; local37 < Static17.anInt338; local37++) {
					@Pc(46) Class3_Sub25 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static252.aBooleanArrayArray10[local32 + Static285.anInt5736 - Static19.anInt361][local37 + Static285.anInt5736 - Static289.anInt5787] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean317 = true;
							local46.aBoolean318 = true;
							if (local46.anInt4483 > 0) {
								local46.aBoolean316 = true;
							} else {
								local46.aBoolean316 = false;
							}
							Static122.anInt2305++;
						} else {
							local46.aBoolean317 = false;
							local46.aBoolean318 = false;
							local46.anInt4478 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass19_1 != null) {
									@Pc(103) Class19 local103 = local46.aClass19_1;
									local103.aClass10_3.method4980(0, local23, local103.anInt481, local103.anInt476, local103.anInt483);
									if (local103.aClass10_2 != null) {
										local103.aClass10_2.method4980(0, local23, local103.anInt481, local103.anInt476, local103.anInt483);
									}
								}
								if (local46.aClass95_1 != null) {
									@Pc(134) Class95 local134 = local46.aClass95_1;
									local134.aClass10_9.method4980(local134.anInt2811, local23, local134.anInt2812, local134.anInt2807, local134.anInt2814);
									if (local134.aClass10_8 != null) {
										local134.aClass10_8.method4980(local134.anInt2811, local23, local134.anInt2812, local134.anInt2807, local134.anInt2814);
									}
								}
								if (local46.aClass13_1 != null) {
									@Pc(167) Class13 local167 = local46.aClass13_1;
									local167.aClass10_1.method4980(0, local23, local167.anInt342, local167.anInt346, local167.anInt345);
								}
								if (local46.aClass85Array3 != null) {
									for (local183 = 0; local183 < local46.anInt4483; local183++) {
										@Pc(192) Class85 local192 = local46.aClass85Array3[local183];
										local192.aClass10_7.method4980(local192.anInt2470, local23, local192.anInt2481, local192.anInt2476, local192.anInt2473);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static256.anIntArrayArrayArray14 == Static22.anIntArrayArrayArray1;
		if (Static283.aBoolean393) {
			@Pc(244) GL local244 = Static283.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static274.method4503();
				Static53.method5036(-1, 3);
				Static91.aBoolean138 = true;
				Static74.method1133();
				Static15.anInt4205 = -1;
				Static20.anInt374 = -1;
				for (local32 = 0; local32 < Static44.aClass3_Sub21ArrayArray1[0].length; local32++) {
					@Pc(285) Class3_Sub21 local285 = Static44.aClass3_Sub21ArrayArray1[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean233 ? 1.0F : 0.5F);
					if (local285.anInt3238 != Static15.anInt4205) {
						Static15.anInt4205 = local285.anInt3238;
						Static120.method2008(local285.anInt3238);
						Static226.method3653(Static48.method759());
					}
					local285.method2859(Static146.aClass3_Sub25ArrayArrayArray7, local294, false);
				}
				Static74.method1134();
			} else {
				local32 = Static92.anInt1674;
				while (true) {
					if (local32 >= Static158.anInt2948) {
						Static142.method2410(Static19.anInt361, Static289.anInt5787, Static146.aClass3_Sub25ArrayArrayArray7);
						break;
					}
					for (local37 = 0; local37 < Static44.aClass3_Sub21ArrayArray1[local32].length; local37++) {
						@Pc(336) Class3_Sub21 local336 = Static44.aClass3_Sub21ArrayArray1[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean233 ? 1.0F : 0.5F);
						if (local336.anInt3242 != -1 && Static308.method4938(Static16.anInterface4_1.method2901(local336.anInt3242)) && Static66.aBoolean94) {
							Static120.method2008(local336.anInt3238);
						}
						local336.method2859(Static146.aClass3_Sub25ArrayArrayArray7, local350, false);
					}
					if (local32 == 0 && Static86.anInt1599 > 0) {
						Static283.method4634(101.5F);
						Static193.method3209(Static19.anInt361, Static289.anInt5787, Static285.anInt5736, arg1, Static252.aBooleanArrayArray10, Static256.anIntArrayArrayArray14[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class3_Sub25 local451;
		@Pc(400) int local400;
		@Pc(407) Class3_Sub25[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static92.anInt1674; local400 < Static158.anInt2948; local400++) {
			local407 = Static146.aClass3_Sub25ArrayArrayArray7[local400];
			for (local37 = -Static285.anInt5736; local37 <= 0; local37++) {
				local416 = Static19.anInt361 + local37;
				local183 = Static19.anInt361 - local37;
				if (local416 >= Static183.anInt3631 || local183 < Static11.anInt5176) {
					for (local429 = -Static285.anInt5736; local429 <= 0; local429++) {
						local435 = Static289.anInt5787 + local429;
						local439 = Static289.anInt5787 - local429;
						if (local416 >= Static183.anInt3631) {
							if (local435 >= Static198.anInt3862) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, true);
								}
							}
							if (local439 < Static17.anInt338) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, true);
								}
							}
						}
						if (local183 < Static11.anInt5176) {
							if (local435 >= Static198.anInt3862) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, true);
								}
							}
							if (local439 < Static17.anInt338) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, true);
								}
							}
						}
						if (Static122.anInt2305 == 0) {
							if (!local240) {
								Static5.aBoolean8 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static92.anInt1674; local400 < Static158.anInt2948; local400++) {
			local407 = Static146.aClass3_Sub25ArrayArrayArray7[local400];
			for (local37 = -Static285.anInt5736; local37 <= 0; local37++) {
				local416 = Static19.anInt361 + local37;
				local183 = Static19.anInt361 - local37;
				if (local416 >= Static183.anInt3631 || local183 < Static11.anInt5176) {
					for (local429 = -Static285.anInt5736; local429 <= 0; local429++) {
						local435 = Static289.anInt5787 + local429;
						local439 = Static289.anInt5787 - local429;
						if (local416 >= Static183.anInt3631) {
							if (local435 >= Static198.anInt3862) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, false);
								}
							}
							if (local439 < Static17.anInt338) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, false);
								}
							}
						}
						if (local183 < Static11.anInt5176) {
							if (local435 >= Static198.anInt3862) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, false);
								}
							}
							if (local439 < Static17.anInt338) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean317) {
									Static259.method4346(local451, false);
								}
							}
						}
						if (Static122.anInt2305 == 0) {
							if (!local240) {
								Static5.aBoolean8 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static5.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public static void method5023() {
		Static110.aClient1.method606();
		Static224.aBoolean432 = true;
		Static125.aLong99 = 0L;
		Static23.aClass136_1.anInt4153 = 0;
		Static6.aBoolean10 = true;
		Static12.anInt233 = 0;
		Static107.method1712();
		Static144.anInt4823 = 0;
		Static108.anInt2014 = -1;
		Static137.anInt2643 = 0;
		Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
		Static255.anInt5252 = -1;
		Static252.anInt5210 = -1;
		Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
		Static179.anInt3342 = -1;
		Static222.anInt4338 = 0;
		@Pc(3661) int local3661;
		for (local3661 = 0; local3661 < Static51.aClass121Array1.length; local3661++) {
			Static51.aClass121Array1[local3661] = null;
		}
		Static152.anInt2876 = 0;
		Static118.aBoolean169 = false;
		Static190.method3181(0);
		for (local3661 = 0; local3661 < 100; local3661++) {
			Static231.aStringArray31[local3661] = null;
		}
		Static39.aBoolean56 = false;
		Static62.anInt1162 = 0;
		Static125.anInt2421 = (int) (Math.random() * 30.0D) - 20;
		Static221.anInt4331 = (int) (Math.random() * 80.0D) - 40;
		Static84.aFloat21 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static153.anInt2895 = 0;
		Static241.anInt4889 = (int) (Math.random() * 120.0D) - 60;
		Static50.anInt961 = (int) (Math.random() * 100.0D) - 50;
		Static26.anInt482 = (int) (Math.random() * 110.0D) - 55;
		Static108.anInt2013 = 0;
		Static50.method791();
		Static152.anInt2869 = 0;
		Static118.anInt2202 = 0;
		for (local3661 = 0; local3661 < 2048; local3661++) {
			Static52.aClass10_Sub5_Sub1Array1[local3661] = null;
			Static302.aClass3_Sub26Array1[local3661] = null;
		}
		for (local3661 = 0; local3661 < 32768; local3661++) {
			Static110.aClass10_Sub5_Sub2Array1[local3661] = null;
		}
		Static136.aClass10_Sub5_Sub1_1 = Static52.aClass10_Sub5_Sub1Array1[2047] = new Class10_Sub5_Sub1();
		Static291.aClass56_27.method1270();
		Static259.aClass56_25.method1270();
		if (Static223.aClass56ArrayArrayArray1 != null) {
			for (local3661 = 0; local3661 < 4; local3661++) {
				for (@Pc(3812) int local3812 = 0; local3812 < 104; local3812++) {
					for (@Pc(3817) int local3817 = 0; local3817 < 104; local3817++) {
						Static223.aClass56ArrayArrayArray1[local3661][local3812][local3817] = null;
					}
				}
			}
		}
		Static219.aClass56_21 = new Class56();
		Static65.anInt1222 = 0;
		Static285.anInt5735 = 0;
		Static64.method1015();
		Static188.method3142();
		Static6.anInt138 = 0;
		Static305.anInt6003 = 0;
		Static210.anInt4127 = 0;
		Static107.anInt1966 = 0;
		Static20.anInt370 = 0;
		Static31.anInt571 = 0;
		Static135.anInt2608 = 0;
		Static125.anInt2417 = 0;
		Static179.anInt3343 = 0;
		Static190.anInt3752 = 0;
		for (local3661 = 0; local3661 < Static173.anIntArray396.length; local3661++) {
			Static173.anIntArray396[local3661] = -1;
		}
		if (Static66.anInt1232 != -1) {
			Static133.method2306(Static66.anInt1232);
		}
		for (@Pc(3898) Class3_Sub3 local3898 = (Class3_Sub3) Static205.aClass30_23.method664(); local3898 != null; local3898 = (Class3_Sub3) Static205.aClass30_23.method671()) {
			Static49.method779(true, local3898);
		}
		Static66.anInt1232 = -1;
		Static205.aClass30_23 = new Class30(8);
		Static140.method2392();
		Static152.anInt2876 = 0;
		Static259.aClass151_18 = null;
		Static118.aBoolean169 = false;
		Static44.aClass131_1.method3358(-1, new int[] { 0, 0, 0, 0, 0 }, null, false, -1);
		for (local3661 = 0; local3661 < 8; local3661++) {
			Static276.aStringArray38[local3661] = null;
			Static281.aBooleanArray112[local3661] = false;
			Static109.anIntArray339[local3661] = -1;
		}
		Static52.method821();
		Static47.aBoolean424 = true;
		for (local3661 = 0; local3661 < 100; local3661++) {
			Static292.aBooleanArray129[local3661] = true;
		}
		Static279.aClass187Array1 = null;
		Static200.anInt3909 = 0;
		Static51.aString38 = null;
		for (local3661 = 0; local3661 < 6; local3661++) {
			Static290.aClass54Array1[local3661] = new Class54();
		}
		for (local3661 = 0; local3661 < 25; local3661++) {
			Static170.anIntArray386[local3661] = 0;
			Static210.anIntArray457[local3661] = 0;
			Static262.anIntArray559[local3661] = 0;
		}
		if (Static283.aBoolean393) {
			Static13.method193();
		}
		Static54.aString40 = Static75.aString58;
		Static263.anInt5410 = 0;
		Static153.aBoolean205 = true;
		Static14.aShortArray3 = Static219.aShortArray77 = Static134.aShortArray80 = Static133.aShortArray62 = new short[256];
		Static132.aBoolean188 = false;
		Static83.method1276();
		Static34.aBoolean53 = false;
		Static191.method3186();
	}
}
