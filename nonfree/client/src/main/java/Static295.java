import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "Lclient!pk;")
	public static Class132 aClass132_66;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
	public static int[] anIntArray277 = new int[100];

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	public static int anInt3736 = 0;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	public static int anInt3737 = 0;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Please remove ";

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	public static int anInt3742 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)Lclient!c;")
	public static Class20 method2905(@OriginalArg(0) int arg0) {
		@Pc(14) Class20 local14 = (Class20) Static299.aClass61_54.method1384((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(26) byte[] local26 = Static28.aClass132_10.method3194(33, arg0);
		local14 = new Class20();
		if (local26 != null) {
			local14.method504(new Class8_Sub2(local26), arg0);
		}
		Static299.aClass61_54.method1377((long) arg0, local14);
		return local14;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static258.anInt5165++;
		Static175.anInt3465 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static157.anInt5705; local23 < Static54.anInt1199; local23++) {
			@Pc(30) Class8_Sub27[][] local30 = Static178.aClass8_Sub27ArrayArrayArray1[local23];
			for (local32 = Static21.anInt579; local32 < Static257.anInt5096; local32++) {
				for (local37 = Static270.anInt5342; local37 < Static93.anInt1950; local37++) {
					@Pc(46) Class8_Sub27 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static41.aBooleanArrayArray2[local32 + Static260.anInt5236 - Static212.anInt4369][local37 + Static260.anInt5236 - Static136.anInt2745] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean387 = true;
							local46.aBoolean386 = true;
							if (local46.anInt4857 > 0) {
								local46.aBoolean388 = true;
							} else {
								local46.aBoolean388 = false;
							}
							Static175.anInt3465++;
						} else {
							local46.aBoolean387 = false;
							local46.aBoolean386 = false;
							local46.anInt4853 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass134_1 != null) {
									@Pc(103) Class134 local103 = local46.aClass134_1;
									local103.aClass36_6.method4172(0, local23, local103.anInt4310, local103.anInt4311, local103.anInt4309);
									if (local103.aClass36_7 != null) {
										local103.aClass36_7.method4172(0, local23, local103.anInt4310, local103.anInt4311, local103.anInt4309);
									}
								}
								if (local46.aClass141_1 != null) {
									@Pc(134) Class141 local134 = local46.aClass141_1;
									local134.aClass36_8.method4172(local134.anInt4615, local23, local134.anInt4618, local134.anInt4610, local134.anInt4612);
									if (local134.aClass36_9 != null) {
										local134.aClass36_9.method4172(local134.anInt4615, local23, local134.anInt4618, local134.anInt4610, local134.anInt4612);
									}
								}
								if (local46.aClass120_1 != null) {
									@Pc(167) Class120 local167 = local46.aClass120_1;
									local167.aClass36_5.method4172(0, local23, local167.anInt3475, local167.anInt3473, local167.anInt3476);
								}
								if (local46.aClass170Array3 != null) {
									for (local183 = 0; local183 < local46.anInt4857; local183++) {
										@Pc(192) Class170 local192 = local46.aClass170Array3[local183];
										local192.aClass36_10.method4172(local192.anInt5459, local23, local192.anInt5446, local192.anInt5449, local192.anInt5456);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static195.anIntArrayArrayArray7 == Static222.anIntArrayArrayArray10;
		if (Static116.aBoolean188) {
			@Pc(244) GL local244 = Static116.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static182.method2783();
				Static108.method1772(3, -1);
				Static248.aBoolean395 = true;
				Static117.method1915();
				Static109.anInt2271 = -1;
				Static211.anInt4342 = -1;
				for (local32 = 0; local32 < Static106.aClass8_Sub29ArrayArray4[0].length; local32++) {
					@Pc(285) Class8_Sub29 local285 = Static106.aClass8_Sub29ArrayArray4[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean403 ? 1.0F : 0.5F);
					if (local285.anInt4981 != Static109.anInt2271) {
						Static109.anInt2271 = local285.anInt4981;
						Static257.method3873(local285.anInt4981);
						Static233.method3554(Static91.method1479());
					}
					local285.method3781(Static178.aClass8_Sub27ArrayArrayArray1, local294, false);
				}
				Static117.method1916();
			} else {
				local32 = Static157.anInt5705;
				while (true) {
					if (local32 >= Static54.anInt1199) {
						Static186.method2923(Static212.anInt4369, Static136.anInt2745, Static178.aClass8_Sub27ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static106.aClass8_Sub29ArrayArray4[local32].length; local37++) {
						@Pc(336) Class8_Sub29 local336 = Static106.aClass8_Sub29ArrayArray4[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean403 ? 1.0F : 0.5F);
						if (local336.anInt4984 != -1 && Static69.method1133(Static96.anInterface4_1.method1265(local336.anInt4984)) && Static273.aBoolean455) {
							Static257.method3873(local336.anInt4981);
						}
						local336.method3781(Static178.aClass8_Sub27ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static270.anInt5337 > 0) {
						Static116.method1868(101.5F);
						Static6.method42(Static212.anInt4369, Static136.anInt2745, Static260.anInt5236, arg1, Static41.aBooleanArrayArray2, Static195.anIntArrayArrayArray7[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class8_Sub27 local451;
		@Pc(400) int local400;
		@Pc(407) Class8_Sub27[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static157.anInt5705; local400 < Static54.anInt1199; local400++) {
			local407 = Static178.aClass8_Sub27ArrayArrayArray1[local400];
			for (local37 = -Static260.anInt5236; local37 <= 0; local37++) {
				local416 = Static212.anInt4369 + local37;
				local183 = Static212.anInt4369 - local37;
				if (local416 >= Static21.anInt579 || local183 < Static257.anInt5096) {
					for (local429 = -Static260.anInt5236; local429 <= 0; local429++) {
						local435 = Static136.anInt2745 + local429;
						local439 = Static136.anInt2745 - local429;
						if (local416 >= Static21.anInt579) {
							if (local435 >= Static270.anInt5342) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, true);
								}
							}
							if (local439 < Static93.anInt1950) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, true);
								}
							}
						}
						if (local183 < Static257.anInt5096) {
							if (local435 >= Static270.anInt5342) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, true);
								}
							}
							if (local439 < Static93.anInt1950) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, true);
								}
							}
						}
						if (Static175.anInt3465 == 0) {
							if (!local240) {
								Static299.aBoolean481 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static157.anInt5705; local400 < Static54.anInt1199; local400++) {
			local407 = Static178.aClass8_Sub27ArrayArrayArray1[local400];
			for (local37 = -Static260.anInt5236; local37 <= 0; local37++) {
				local416 = Static212.anInt4369 + local37;
				local183 = Static212.anInt4369 - local37;
				if (local416 >= Static21.anInt579 || local183 < Static257.anInt5096) {
					for (local429 = -Static260.anInt5236; local429 <= 0; local429++) {
						local435 = Static136.anInt2745 + local429;
						local439 = Static136.anInt2745 - local429;
						if (local416 >= Static21.anInt579) {
							if (local435 >= Static270.anInt5342) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, false);
								}
							}
							if (local439 < Static93.anInt1950) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, false);
								}
							}
						}
						if (local183 < Static257.anInt5096) {
							if (local435 >= Static270.anInt5342) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, false);
								}
							}
							if (local439 < Static93.anInt1950) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean387) {
									Static34.method536(local451, false);
								}
							}
						}
						if (Static175.anInt3465 == 0) {
							if (!local240) {
								Static299.aBoolean481 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static299.aBoolean481 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)I")
	public static int method2909(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static71.method1143();
		for (@Pc(26) Class8_Sub18 local26 = arg0 ? (Class8_Sub18) Static138.aClass129_14.method3035() : (Class8_Sub18) Static138.aClass129_14.method3048(); local26 != null; local26 = (Class8_Sub18) Static138.aClass129_14.method3048()) {
			if (local8 > (local26.aLong104 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local26.aLong104 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local26.aLong203;
					Static8.anIntArray495[local50] = Static255.anIntArray392[local50];
					local26.method4273();
					return local50;
				}
				local26.method4273();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method2910() {
		Static59.aClass61_9.method1381(5);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([I[JI)V")
	public static void method2911(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static179.method2740(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public static void method2912() {
		Static298.anInt354 = 0;
		Static291.anInt3609 = 0;
		Static288.method968();
		Static54.method872();
		Static66.method3395();
		Static118.method1919();
		@Pc(21) int local21;
		for (local21 = 0; local21 < Static298.anInt354; local21++) {
			@Pc(32) int local32 = Static171.anIntArray257[local21];
			if (Static183.anInt3590 != Static230.aClass36_Sub3_Sub1Array1[local32].anInt4119) {
				if (Static230.aClass36_Sub3_Sub1Array1[local32].anInt4045 > 0) {
					Static27.method462(Static230.aClass36_Sub3_Sub1Array1[local32]);
				}
				Static230.aClass36_Sub3_Sub1Array1[local32] = null;
			}
		}
		if (Static275.aClass8_Sub2_Sub1_6.anInt2955 != Static68.anInt1687) {
			throw new RuntimeException("gpp1 pos:" + Static275.aClass8_Sub2_Sub1_6.anInt2955 + " psize:" + Static68.anInt1687);
		}
		for (local21 = 0; local21 < Static61.anInt1336; local21++) {
			if (Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local21]] == null) {
				throw new RuntimeException("gpp2 pos:" + local21 + " size:" + Static61.anInt1336);
			}
		}
	}
}
