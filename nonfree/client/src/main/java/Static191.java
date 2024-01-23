import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!cg;")
	public static Class22 aClass22_66;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!cg;")
	public static Class22 aClass22_67;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public static int anInt3883 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static151.anInt2970++;
		Static14.anInt316 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static257.anInt5052; local23 < Static139.anInt2755; local23++) {
			@Pc(30) Class4_Sub21[][] local30 = Static261.aClass4_Sub21ArrayArrayArray4[local23];
			for (local32 = Static65.anInt5706; local32 < Static67.anInt1406; local32++) {
				for (local37 = Static274.anInt5441; local37 < Static158.anInt3235; local37++) {
					@Pc(46) Class4_Sub21 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static202.aBooleanArrayArray4[local32 + Static133.anInt2661 - Static279.anInt5465][local37 + Static133.anInt2661 - Static91.anInt1810] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean172 = true;
							local46.aBoolean175 = true;
							if (local46.anInt2694 > 0) {
								local46.aBoolean174 = true;
							} else {
								local46.aBoolean174 = false;
							}
							Static14.anInt316++;
						} else {
							local46.aBoolean172 = false;
							local46.aBoolean175 = false;
							local46.anInt2697 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass181_1 != null) {
									@Pc(103) Class181 local103 = local46.aClass181_1;
									local103.aClass13_9.method4267(0, local23, local103.anInt5720, local103.anInt5714, local103.anInt5721);
									if (local103.aClass13_10 != null) {
										local103.aClass13_10.method4267(0, local23, local103.anInt5720, local103.anInt5714, local103.anInt5721);
									}
								}
								if (local46.aClass35_1 != null) {
									@Pc(134) Class35 local134 = local46.aClass35_1;
									local134.aClass13_2.method4267(local134.anInt1247, local23, local134.anInt1246, local134.anInt1244, local134.anInt1249);
									if (local134.aClass13_1 != null) {
										local134.aClass13_1.method4267(local134.anInt1247, local23, local134.anInt1246, local134.anInt1244, local134.anInt1249);
									}
								}
								if (local46.aClass67_1 != null) {
									@Pc(167) Class67 local167 = local46.aClass67_1;
									local167.aClass13_3.method4267(0, local23, local167.anInt2116, local167.anInt2118, local167.anInt2120);
								}
								if (local46.aClass99Array19 != null) {
									for (local183 = 0; local183 < local46.anInt2694; local183++) {
										@Pc(192) Class99 local192 = local46.aClass99Array19[local183];
										local192.aClass13_4.method4267(local192.anInt3229, local23, local192.anInt3227, local192.anInt3224, local192.anInt3219);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static154.anIntArrayArrayArray5 == Static127.anIntArrayArrayArray3;
		if (Static251.aBoolean330) {
			@Pc(244) GL local244 = Static251.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static288.method4502();
				Static126.method2046(-1, 3);
				Static43.aBoolean58 = true;
				Static227.method3580();
				Static48.anInt1081 = -1;
				Static292.anInt5678 = -1;
				for (local32 = 0; local32 < Static158.aClass4_Sub8ArrayArray1[0].length; local32++) {
					@Pc(285) Class4_Sub8 local285 = Static158.aClass4_Sub8ArrayArray1[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean45 ? 1.0F : 0.5F);
					if (local285.anInt583 != Static48.anInt1081) {
						Static48.anInt1081 = local285.anInt583;
						Static278.method4265(local285.anInt583);
						Static290.method4525(Static39.method722());
					}
					local285.method575(Static261.aClass4_Sub21ArrayArrayArray4, local294, false);
				}
				Static227.method3579();
			} else {
				local32 = Static257.anInt5052;
				while (true) {
					if (local32 >= Static139.anInt2755) {
						Static142.method2284(Static279.anInt5465, Static91.anInt1810, Static261.aClass4_Sub21ArrayArrayArray4);
						break;
					}
					for (local37 = 0; local37 < Static158.aClass4_Sub8ArrayArray1[local32].length; local37++) {
						@Pc(336) Class4_Sub8 local336 = Static158.aClass4_Sub8ArrayArray1[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean45 ? 1.0F : 0.5F);
						if (local336.anInt586 != -1 && Static16.method285(Static283.anInterface1_1.method2427(local336.anInt586)) && Static304.aBoolean404) {
							Static278.method4265(local336.anInt583);
						}
						local336.method575(Static261.aClass4_Sub21ArrayArrayArray4, local350, false);
					}
					if (local32 == 0 && Static154.anInt3207 > 0) {
						Static251.method3861(101.5F);
						Static249.method3816(Static279.anInt5465, Static91.anInt1810, Static133.anInt2661, arg1, Static202.aBooleanArrayArray4, Static154.anIntArrayArrayArray5[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class4_Sub21 local451;
		@Pc(400) int local400;
		@Pc(407) Class4_Sub21[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static257.anInt5052; local400 < Static139.anInt2755; local400++) {
			local407 = Static261.aClass4_Sub21ArrayArrayArray4[local400];
			for (local37 = -Static133.anInt2661; local37 <= 0; local37++) {
				local416 = Static279.anInt5465 + local37;
				local183 = Static279.anInt5465 - local37;
				if (local416 >= Static65.anInt5706 || local183 < Static67.anInt1406) {
					for (local429 = -Static133.anInt2661; local429 <= 0; local429++) {
						local435 = Static91.anInt1810 + local429;
						local439 = Static91.anInt1810 - local429;
						if (local416 >= Static65.anInt5706) {
							if (local435 >= Static274.anInt5441) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, true);
								}
							}
							if (local439 < Static158.anInt3235) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, true);
								}
							}
						}
						if (local183 < Static67.anInt1406) {
							if (local435 >= Static274.anInt5441) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, true);
								}
							}
							if (local439 < Static158.anInt3235) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, true);
								}
							}
						}
						if (Static14.anInt316 == 0) {
							if (!local240) {
								Static201.aBoolean247 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static257.anInt5052; local400 < Static139.anInt2755; local400++) {
			local407 = Static261.aClass4_Sub21ArrayArrayArray4[local400];
			for (local37 = -Static133.anInt2661; local37 <= 0; local37++) {
				local416 = Static279.anInt5465 + local37;
				local183 = Static279.anInt5465 - local37;
				if (local416 >= Static65.anInt5706 || local183 < Static67.anInt1406) {
					for (local429 = -Static133.anInt2661; local429 <= 0; local429++) {
						local435 = Static91.anInt1810 + local429;
						local439 = Static91.anInt1810 - local429;
						if (local416 >= Static65.anInt5706) {
							if (local435 >= Static274.anInt5441) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, false);
								}
							}
							if (local439 < Static158.anInt3235) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, false);
								}
							}
						}
						if (local183 < Static67.anInt1406) {
							if (local435 >= Static274.anInt5441) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, false);
								}
							}
							if (local439 < Static158.anInt3235) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean172) {
									Static235.method3643(local451, false);
								}
							}
						}
						if (Static14.anInt316 == 0) {
							if (!local240) {
								Static201.aBoolean247 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static201.aBoolean247 = false;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	public static boolean method3154() {
		return Static55.anInt1252 == 0 ? Static228.aClass4_Sub6_Sub2_2.method843() : true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!ag;")
	public static Class7 method3159(@OriginalArg(1) int arg0) {
		@Pc(10) Class7 local10 = (Class7) Static158.aClass172_27.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static256.aClass22_87.method665(30, arg0);
		local10 = new Class7();
		if (local21 != null) {
			local10.method114(new Class4_Sub24(local21), arg0);
		}
		Static158.aClass172_27.method4345(local10, (long) arg0);
		return local10;
	}
}
