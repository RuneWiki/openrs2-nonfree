import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	public static int anInt5394;

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
	public static int anInt5391 = -1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBILclient!ak;)Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 method4137(@OriginalArg(2) int arg0, @OriginalArg(3) Class7 arg1) {
		return Static139.method2193(arg1, arg0, 0) ? Static196.method2975() : null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static123.anInt2372++;
		Static73.anInt1432 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static92.anInt1756; local23 < Static158.anInt2965; local23++) {
			@Pc(30) Class1_Sub19[][] local30 = Static130.aClass1_Sub19ArrayArrayArray1[local23];
			for (local32 = Static104.anInt3085; local32 < Static171.anInt3162; local32++) {
				for (local37 = Static97.anInt1857; local37 < Static276.anInt5533; local37++) {
					@Pc(46) Class1_Sub19 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static217.aBooleanArrayArray10[local32 + Static167.anInt3094 - Static120.anInt2321][local37 + Static167.anInt3094 - Static20.anInt458] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean180 = true;
							local46.aBoolean181 = true;
							if (local46.anInt2570 > 0) {
								local46.aBoolean179 = true;
							} else {
								local46.aBoolean179 = false;
							}
							Static73.anInt1432++;
						} else {
							local46.aBoolean180 = false;
							local46.aBoolean181 = false;
							local46.anInt2561 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass125_1 != null) {
									@Pc(103) Class125 local103 = local46.aClass125_1;
									local103.aClass6_8.method3839(0, local23, local103.anInt3537, local103.anInt3529, local103.anInt3530);
									if (local103.aClass6_7 != null) {
										local103.aClass6_7.method3839(0, local23, local103.anInt3537, local103.anInt3529, local103.anInt3530);
									}
								}
								if (local46.aClass63_1 != null) {
									@Pc(134) Class63 local134 = local46.aClass63_1;
									local134.aClass6_4.method3839(local134.anInt1652, local23, local134.anInt1650, local134.anInt1653, local134.anInt1648);
									if (local134.aClass6_5 != null) {
										local134.aClass6_5.method3839(local134.anInt1652, local23, local134.anInt1650, local134.anInt1653, local134.anInt1648);
									}
								}
								if (local46.aClass167_1 != null) {
									@Pc(167) Class167 local167 = local46.aClass167_1;
									local167.aClass6_9.method3839(0, local23, local167.anInt5537, local167.anInt5539, local167.anInt5542);
								}
								if (local46.aClass124Array2 != null) {
									for (local183 = 0; local183 < local46.anInt2570; local183++) {
										@Pc(192) Class124 local192 = local46.aClass124Array2[local183];
										local192.aClass6_6.method3839(local192.anInt3414, local23, local192.anInt3417, local192.anInt3413, local192.anInt3404);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static163.anIntArrayArrayArray16 == Static165.anIntArrayArrayArray13;
		if (Static240.aBoolean369) {
			@Pc(244) GL local244 = Static240.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static61.method1033();
				Static122.method1910(3, -1);
				Static292.aBoolean438 = true;
				Static161.method2489();
				Static115.anInt2124 = -1;
				Static238.anInt4937 = -1;
				for (local32 = 0; local32 < Static151.aClass1_Sub25ArrayArray2[0].length; local32++) {
					@Pc(285) Class1_Sub25 local285 = Static151.aClass1_Sub25ArrayArray2[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean352 ? 1.0F : 0.5F);
					if (local285.anInt4715 != Static115.anInt2124) {
						Static115.anInt2124 = local285.anInt4715;
						Static64.method1060(local285.anInt4715);
						Static34.method630(Static173.method2619());
					}
					local285.method3603(Static130.aClass1_Sub19ArrayArrayArray1, local294, false);
				}
				Static161.method2491();
			} else {
				local32 = Static92.anInt1756;
				while (true) {
					if (local32 >= Static158.anInt2965) {
						Static194.method2944(Static120.anInt2321, Static20.anInt458, Static130.aClass1_Sub19ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static151.aClass1_Sub25ArrayArray2[local32].length; local37++) {
						@Pc(336) Class1_Sub25 local336 = Static151.aClass1_Sub25ArrayArray2[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean352 ? 1.0F : 0.5F);
						if (local336.anInt4710 != -1 && Static165.method2524(Static208.anInterface4_1.method995(local336.anInt4710)) && Static160.aBoolean223) {
							Static64.method1060(local336.anInt4715);
						}
						local336.method3603(Static130.aClass1_Sub19ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static235.anInt4896 > 0) {
						Static240.method3809(101.5F);
						Static78.method1345(Static120.anInt2321, Static20.anInt458, Static167.anInt3094, arg1, Static217.aBooleanArrayArray10, Static163.anIntArrayArrayArray16[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub19 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub19[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static92.anInt1756; local400 < Static158.anInt2965; local400++) {
			local407 = Static130.aClass1_Sub19ArrayArrayArray1[local400];
			for (local37 = -Static167.anInt3094; local37 <= 0; local37++) {
				local416 = Static120.anInt2321 + local37;
				local183 = Static120.anInt2321 - local37;
				if (local416 >= Static104.anInt3085 || local183 < Static171.anInt3162) {
					for (local429 = -Static167.anInt3094; local429 <= 0; local429++) {
						local435 = Static20.anInt458 + local429;
						local439 = Static20.anInt458 - local429;
						if (local416 >= Static104.anInt3085) {
							if (local435 >= Static97.anInt1857) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, true);
								}
							}
							if (local439 < Static276.anInt5533) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, true);
								}
							}
						}
						if (local183 < Static171.anInt3162) {
							if (local435 >= Static97.anInt1857) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, true);
								}
							}
							if (local439 < Static276.anInt5533) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, true);
								}
							}
						}
						if (Static73.anInt1432 == 0) {
							if (!local240) {
								Static167.aBoolean234 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static92.anInt1756; local400 < Static158.anInt2965; local400++) {
			local407 = Static130.aClass1_Sub19ArrayArrayArray1[local400];
			for (local37 = -Static167.anInt3094; local37 <= 0; local37++) {
				local416 = Static120.anInt2321 + local37;
				local183 = Static120.anInt2321 - local37;
				if (local416 >= Static104.anInt3085 || local183 < Static171.anInt3162) {
					for (local429 = -Static167.anInt3094; local429 <= 0; local429++) {
						local435 = Static20.anInt458 + local429;
						local439 = Static20.anInt458 - local429;
						if (local416 >= Static104.anInt3085) {
							if (local435 >= Static97.anInt1857) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, false);
								}
							}
							if (local439 < Static276.anInt5533) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, false);
								}
							}
						}
						if (local183 < Static171.anInt3162) {
							if (local435 >= Static97.anInt1857) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, false);
								}
							}
							if (local439 < Static276.anInt5533) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean180) {
									Static274.method4197(local451, false);
								}
							}
						}
						if (Static73.anInt1432 == 0) {
							if (!local240) {
								Static167.aBoolean234 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static167.aBoolean234 = false;
	}
}
