import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "Lclient!wf;")
	public static Class189 aClass189_13;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
	public static int anInt4678 = -1;

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
	public static int anInt4680 = -1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static81.anInt1871++;
		Static183.anInt3486 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static311.anInt6035; local23 < Static224.anInt4310; local23++) {
			@Pc(30) Class4_Sub19[][] local30 = Static6.aClass4_Sub19ArrayArrayArray1[local23];
			for (local32 = Static261.anInt4979; local32 < Static87.anInt5782; local32++) {
				for (local37 = Static47.anInt890; local37 < Static70.anInt1344; local37++) {
					@Pc(46) Class4_Sub19 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static160.aBooleanArrayArray5[local32 + Static164.anInt3253 - Static239.anInt4514][local37 + Static164.anInt3253 - Static172.anInt3329] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean257 = true;
							local46.aBoolean255 = true;
							if (local46.anInt3554 > 0) {
								local46.aBoolean256 = true;
							} else {
								local46.aBoolean256 = false;
							}
							Static183.anInt3486++;
						} else {
							local46.aBoolean257 = false;
							local46.aBoolean255 = false;
							local46.anInt3549 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass182_1 != null) {
									@Pc(103) Class182 local103 = local46.aClass182_1;
									local103.aClass53_5.method3843(0, local23, local103.anInt5495, local103.anInt5493, local103.anInt5492);
									if (local103.aClass53_4 != null) {
										local103.aClass53_4.method3843(0, local23, local103.anInt5495, local103.anInt5493, local103.anInt5492);
									}
								}
								if (local46.aClass186_1 != null) {
									@Pc(134) Class186 local134 = local46.aClass186_1;
									local134.aClass53_10.method3843(local134.anInt5635, local23, local134.anInt5631, local134.anInt5630, local134.anInt5628);
									if (local134.aClass53_9 != null) {
										local134.aClass53_9.method3843(local134.anInt5635, local23, local134.anInt5631, local134.anInt5630, local134.anInt5628);
									}
								}
								if (local46.aClass42_1 != null) {
									@Pc(167) Class42 local167 = local46.aClass42_1;
									local167.aClass53_2.method3843(0, local23, local167.anInt1130, local167.anInt1129, local167.anInt1128);
								}
								if (local46.aClass33Array3 != null) {
									for (local183 = 0; local183 < local46.anInt3554; local183++) {
										@Pc(192) Class33 local192 = local46.aClass33Array3[local183];
										local192.aClass53_1.method3843(local192.anInt814, local23, local192.anInt823, local192.anInt821, local192.anInt827);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static243.anIntArrayArrayArray13 == Static36.anIntArrayArrayArray2;
		if (Static94.aBoolean138) {
			@Pc(244) GL local244 = Static94.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static227.method3633();
				Static164.method2665(3, -1);
				Static131.aBoolean175 = true;
				Static23.method316();
				Static192.anInt3636 = -1;
				Static266.anInt5121 = -1;
				for (local32 = 0; local32 < Static189.aClass4_Sub12ArrayArray2[0].length; local32++) {
					@Pc(285) Class4_Sub12 local285 = Static189.aClass4_Sub12ArrayArray2[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean162 ? 1.0F : 0.5F);
					if (local285.anInt2351 != Static192.anInt3636) {
						Static192.anInt3636 = local285.anInt2351;
						Static107.method4409(local285.anInt2351);
						Static178.method2785(Static45.method723());
					}
					local285.method1868(Static6.aClass4_Sub19ArrayArrayArray1, local294, false);
				}
				Static23.method314();
			} else {
				local32 = Static311.anInt6035;
				while (true) {
					if (local32 >= Static224.anInt4310) {
						Static196.method3129(Static239.anInt4514, Static172.anInt3329, Static6.aClass4_Sub19ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static189.aClass4_Sub12ArrayArray2[local32].length; local37++) {
						@Pc(336) Class4_Sub12 local336 = Static189.aClass4_Sub12ArrayArray2[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean162 ? 1.0F : 0.5F);
						if (local336.anInt2356 != -1 && Static249.method3957(Static158.anInterface5_1.method444(local336.anInt2356)) && Static303.aBoolean394) {
							Static107.method4409(local336.anInt2351);
						}
						local336.method1868(Static6.aClass4_Sub19ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static114.anInt2298 > 0) {
						Static94.method1613(101.5F);
						Static74.method1215(Static239.anInt4514, Static172.anInt3329, Static164.anInt3253, arg1, Static160.aBooleanArrayArray5, Static243.anIntArrayArrayArray13[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class4_Sub19 local451;
		@Pc(400) int local400;
		@Pc(407) Class4_Sub19[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static311.anInt6035; local400 < Static224.anInt4310; local400++) {
			local407 = Static6.aClass4_Sub19ArrayArrayArray1[local400];
			for (local37 = -Static164.anInt3253; local37 <= 0; local37++) {
				local416 = Static239.anInt4514 + local37;
				local183 = Static239.anInt4514 - local37;
				if (local416 >= Static261.anInt4979 || local183 < Static87.anInt5782) {
					for (local429 = -Static164.anInt3253; local429 <= 0; local429++) {
						local435 = Static172.anInt3329 + local429;
						local439 = Static172.anInt3329 - local429;
						if (local416 >= Static261.anInt4979) {
							if (local435 >= Static47.anInt890) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, true);
								}
							}
							if (local439 < Static70.anInt1344) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, true);
								}
							}
						}
						if (local183 < Static87.anInt5782) {
							if (local435 >= Static47.anInt890) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, true);
								}
							}
							if (local439 < Static70.anInt1344) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, true);
								}
							}
						}
						if (Static183.anInt3486 == 0) {
							if (!local240) {
								Static73.aBoolean101 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static311.anInt6035; local400 < Static224.anInt4310; local400++) {
			local407 = Static6.aClass4_Sub19ArrayArrayArray1[local400];
			for (local37 = -Static164.anInt3253; local37 <= 0; local37++) {
				local416 = Static239.anInt4514 + local37;
				local183 = Static239.anInt4514 - local37;
				if (local416 >= Static261.anInt4979 || local183 < Static87.anInt5782) {
					for (local429 = -Static164.anInt3253; local429 <= 0; local429++) {
						local435 = Static172.anInt3329 + local429;
						local439 = Static172.anInt3329 - local429;
						if (local416 >= Static261.anInt4979) {
							if (local435 >= Static47.anInt890) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, false);
								}
							}
							if (local439 < Static70.anInt1344) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, false);
								}
							}
						}
						if (local183 < Static87.anInt5782) {
							if (local435 >= Static47.anInt890) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, false);
								}
							}
							if (local439 < Static70.anInt1344) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean257) {
									Static218.method3530(local451, false);
								}
							}
						}
						if (Static183.anInt3486 == 0) {
							if (!local240) {
								Static73.aBoolean101 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static73.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V")
	public static void method3835() {
		Static103.method2330();
		Static50.method775();
		Static140.method2083();
		Static205.method3291();
		Static193.method3074();
		Static124.method1924();
		Static254.method4023();
		Static11.method191();
		Static105.method1717();
		Static202.method3249();
		Static205.method3281();
		Static38.method586();
		Static307.method4754();
		Static227.method3631();
		Static271.method4272();
		Static68.method1067();
		Static308.method4764();
		Static251.method3988();
		Static126.method1943();
		Static258.method4067();
		Static199.method3232();
		Static25.aClass26_5.method517(5);
		Static18.aClass26_3.method517(5);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIB)I")
	public static int method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZB)V")
	public static void method3840(@OriginalArg(0) boolean arg0) {
		Static264.anIntArray549 = new int[104];
		Static202.anInt3896 = 99;
		@Pc(13) byte local13;
		if (arg0) {
			local13 = 1;
		} else {
			local13 = 4;
		}
		Static76.anIntArray649 = new int[104];
		Static151.aByteArrayArrayArray15 = new byte[local13][104][104];
		Static8.aByteArrayArrayArray1 = new byte[local13][104][104];
		Static242.anIntArray491 = new int[104];
		Static206.aByteArrayArrayArray18 = new byte[local13][105][105];
		Static253.anIntArray523 = new int[104];
		Static57.aByteArrayArrayArray3 = new byte[local13][104][104];
		Static170.anIntArrayArrayArray9 = new int[local13][105][105];
		Static78.aByteArrayArrayArray4 = new byte[local13][104][104];
		Static303.anIntArray650 = new int[104];
		Static229.anIntArray465 = new int[5];
	}
}
