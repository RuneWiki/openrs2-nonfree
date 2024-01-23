import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!nk;")
	public static Class121 aClass121_131;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Lclient!nk;")
	public static Class121 aClass121_132;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "S")
	public static short aShort54 = 205;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt5354 = 0;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method4557() {
		@Pc(5) int local5 = Static307.aClass1_Sub2_Sub6_4.method4023(Static244.aString255);
		@Pc(11) int local11;
		@Pc(24) int local24;
		for (local11 = 0; local11 < Static110.anInt2281; local11++) {
			local24 = Static307.aClass1_Sub2_Sub6_4.method4023(Static213.method3842(local11));
			if (local24 > local5) {
				local5 = local24;
			}
		}
		local11 = Static110.anInt2281 * 15 + 21;
		local5 += 8;
		@Pc(46) int local46 = Static49.anInt962;
		if (local46 + local11 > Static120.anInt2505) {
			local46 = Static120.anInt2505 - local11;
		}
		if (local46 < 0) {
			local46 = 0;
		}
		local24 = Static11.anInt163 - local5 / 2;
		if (local5 + local24 > Static292.anInt5236) {
			local24 = Static292.anInt5236 - local5;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		if (Static304.anInt5397 == 1) {
			if (Static33.anInt577 == Static11.anInt163 && Static152.anInt728 == Static49.anInt962) {
				Static249.aBoolean307 = true;
				Static36.anInt685 = local46;
				Static304.anInt5397 = 0;
				Static83.anInt1650 = (Static41.aBoolean46 ? 26 : 22) + Static110.anInt2281 * 15;
				Static207.anInt3960 = local24;
				Static93.anInt1898 = local5;
			}
		} else if (Static11.anInt163 == Static238.anInt4321 && Static282.anInt5092 == Static49.anInt962) {
			Static83.anInt1650 = (Static41.aBoolean46 ? 26 : 22) + Static110.anInt2281 * 15;
			Static249.aBoolean307 = true;
			Static36.anInt685 = local46;
			Static93.anInt1898 = local5;
			Static207.anInt3960 = local24;
			Static304.anInt5397 = 0;
		} else {
			Static33.anInt577 = Static238.anInt4321;
			Static152.anInt728 = Static282.anInt5092;
			Static304.anInt5397 = 1;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method4558() {
		if (!Static133.aBoolean168) {
			return;
		}
		@Pc(11) Class66 local11 = Static296.method4522(Static104.anInt2090, Static312.anInt5732);
		if (local11 != null && local11.anObjectArray8 != null) {
			@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
			local20.aClass66_10 = local11;
			local20.anObjectArray1 = local11.anObjectArray8;
			Static194.method3152(local20);
		}
		Static133.aBoolean168 = false;
		Static41.anInt850 = -1;
		Static103.method1865(local11);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static186.anInt3555++;
		Static214.anInt4009 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static237.anInt4319; local23 < Static312.anInt5729; local23++) {
			@Pc(30) Class1_Sub33[][] local30 = Static105.aClass1_Sub33ArrayArrayArray2[local23];
			for (local32 = Static47.anInt952; local32 < Static310.anInt5666; local32++) {
				for (local37 = Static236.anInt4291; local37 < Static124.anInt5504; local37++) {
					@Pc(46) Class1_Sub33 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static186.aBooleanArrayArray4[local32 + Static213.anInt4456 - Static13.anInt184][local37 + Static213.anInt4456 - Static84.anInt1660] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean390 = true;
							local46.aBoolean392 = true;
							if (local46.anInt5733 > 0) {
								local46.aBoolean391 = true;
							} else {
								local46.aBoolean391 = false;
							}
							Static214.anInt4009++;
						} else {
							local46.aBoolean390 = false;
							local46.aBoolean392 = false;
							local46.anInt5743 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass160_1 != null) {
									@Pc(103) Class160 local103 = local46.aClass160_1;
									local103.aClass15_7.method4679(0, local23, local103.anInt4626, local103.anInt4619, local103.anInt4624);
									if (local103.aClass15_8 != null) {
										local103.aClass15_8.method4679(0, local23, local103.anInt4626, local103.anInt4619, local103.anInt4624);
									}
								}
								if (local46.aClass52_1 != null) {
									@Pc(134) Class52 local134 = local46.aClass52_1;
									local134.aClass15_2.method4679(local134.anInt1645, local23, local134.anInt1643, local134.anInt1642, local134.anInt1641);
									if (local134.aClass15_3 != null) {
										local134.aClass15_3.method4679(local134.anInt1645, local23, local134.anInt1643, local134.anInt1642, local134.anInt1641);
									}
								}
								if (local46.aClass36_1 != null) {
									@Pc(167) Class36 local167 = local46.aClass36_1;
									local167.aClass15_1.method4679(0, local23, local167.anInt1015, local167.anInt1014, local167.anInt1012);
								}
								if (local46.aClass161Array3 != null) {
									for (local183 = 0; local183 < local46.anInt5733; local183++) {
										@Pc(192) Class161 local192 = local46.aClass161Array3[local183];
										local192.aClass15_9.method4679(local192.anInt4635, local23, local192.anInt4638, local192.anInt4640, local192.anInt4645);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static24.anIntArrayArrayArray2 == Static257.anIntArrayArrayArray15;
		if (Static156.aBoolean211) {
			@Pc(244) GL local244 = Static156.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static188.method3081();
				Static90.method1648(-1, 3);
				Static222.aBoolean284 = true;
				Static230.method3554();
				Static207.anInt3962 = -1;
				Static61.anInt1169 = -1;
				for (local32 = 0; local32 < Static15.aClass1_Sub31ArrayArray1[0].length; local32++) {
					@Pc(285) Class1_Sub31 local285 = Static15.aClass1_Sub31ArrayArray1[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean365 ? 1.0F : 0.5F);
					if (local285.anInt5410 != Static207.anInt3962) {
						Static207.anInt3962 = local285.anInt5410;
						Static179.method2977(local285.anInt5410);
						Static283.method4360(Static234.method3636());
					}
					local285.method4606(Static105.aClass1_Sub33ArrayArrayArray2, local294, false);
				}
				Static230.method3553();
			} else {
				local32 = Static237.anInt4319;
				while (true) {
					if (local32 >= Static312.anInt5729) {
						Static101.method1837(Static13.anInt184, Static84.anInt1660, Static105.aClass1_Sub33ArrayArrayArray2);
						break;
					}
					for (local37 = 0; local37 < Static15.aClass1_Sub31ArrayArray1[local32].length; local37++) {
						@Pc(336) Class1_Sub31 local336 = Static15.aClass1_Sub31ArrayArray1[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean365 ? 1.0F : 0.5F);
						if (local336.anInt5411 != -1 && Static245.method3877(Static215.anInterface5_1.method791(local336.anInt5411)) && Static187.aBoolean243) {
							Static179.method2977(local336.anInt5410);
						}
						local336.method4606(Static105.aClass1_Sub33ArrayArrayArray2, local350, false);
					}
					if (local32 == 0 && Static192.anInt3641 > 0) {
						Static156.method2658(101.5F);
						Static150.method2543(Static13.anInt184, Static84.anInt1660, Static213.anInt4456, arg1, Static186.aBooleanArrayArray4, Static24.anIntArrayArrayArray2[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub33 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub33[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static237.anInt4319; local400 < Static312.anInt5729; local400++) {
			local407 = Static105.aClass1_Sub33ArrayArrayArray2[local400];
			for (local37 = -Static213.anInt4456; local37 <= 0; local37++) {
				local416 = Static13.anInt184 + local37;
				local183 = Static13.anInt184 - local37;
				if (local416 >= Static47.anInt952 || local183 < Static310.anInt5666) {
					for (local429 = -Static213.anInt4456; local429 <= 0; local429++) {
						local435 = Static84.anInt1660 + local429;
						local439 = Static84.anInt1660 - local429;
						if (local416 >= Static47.anInt952) {
							if (local435 >= Static236.anInt4291) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, true);
								}
							}
							if (local439 < Static124.anInt5504) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, true);
								}
							}
						}
						if (local183 < Static310.anInt5666) {
							if (local435 >= Static236.anInt4291) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, true);
								}
							}
							if (local439 < Static124.anInt5504) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, true);
								}
							}
						}
						if (Static214.anInt4009 == 0) {
							if (!local240) {
								Static218.aBoolean71 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static237.anInt4319; local400 < Static312.anInt5729; local400++) {
			local407 = Static105.aClass1_Sub33ArrayArrayArray2[local400];
			for (local37 = -Static213.anInt4456; local37 <= 0; local37++) {
				local416 = Static13.anInt184 + local37;
				local183 = Static13.anInt184 - local37;
				if (local416 >= Static47.anInt952 || local183 < Static310.anInt5666) {
					for (local429 = -Static213.anInt4456; local429 <= 0; local429++) {
						local435 = Static84.anInt1660 + local429;
						local439 = Static84.anInt1660 - local429;
						if (local416 >= Static47.anInt952) {
							if (local435 >= Static236.anInt4291) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, false);
								}
							}
							if (local439 < Static124.anInt5504) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, false);
								}
							}
						}
						if (local183 < Static310.anInt5666) {
							if (local435 >= Static236.anInt4291) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, false);
								}
							}
							if (local439 < Static124.anInt5504) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean390) {
									Static259.method4092(local451, false);
								}
							}
						}
						if (Static214.anInt4009 == 0) {
							if (!local240) {
								Static218.aBoolean71 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static218.aBoolean71 = false;
	}
}
