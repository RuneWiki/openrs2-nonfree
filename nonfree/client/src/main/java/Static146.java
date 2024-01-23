import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!kb;")
	public static Class83 aClass83_108;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_2;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!tl;")
	public static Class155 aClass155_29 = new Class155(100);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static int anInt3483 = 2;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!ol;")
	public static Class117 aClass117_11 = new Class117(16);

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt3487 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method2770() {
		Static247.aClass155_40.method4364(50);
		Static92.aClass155_15.method4364(50);
		Static114.aClass155_21.method4364(50);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	public static void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static5.anInt145 = -1;
		Static88.anInt2053 = arg3 * Static173.anInt3932 / arg1;
		Static206.anInt4587 = -1;
		Static87.anInt2033 = arg0 * Static178.anInt4022 / arg2;
		Static104.method850();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static219.anInt4904++;
		Static126.anInt2812 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static174.anInt3964; local23 < Static156.anInt3577; local23++) {
			@Pc(30) Class1_Sub14[][] local30 = Static132.aClass1_Sub14ArrayArrayArray2[local23];
			for (local32 = Static131.anInt2971; local32 < Static193.anInt4317; local32++) {
				for (local37 = Static78.anInt1884; local37 < Static15.anInt400; local37++) {
					@Pc(46) Class1_Sub14 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static42.aBooleanArrayArray2[local32 + Static34.anInt918 - Static97.anInt6060][local37 + Static34.anInt918 - Static16.anInt444] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean126 = true;
							local46.aBoolean127 = true;
							if (local46.anInt2332 > 0) {
								local46.aBoolean125 = true;
							} else {
								local46.aBoolean125 = false;
							}
							Static126.anInt2812++;
						} else {
							local46.aBoolean126 = false;
							local46.aBoolean127 = false;
							local46.anInt2335 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass133_1 != null) {
									@Pc(103) Class133 local103 = local46.aClass133_1;
									local103.aClass25_4.method4767(0, local23, local103.anInt4877, local103.anInt4873, local103.anInt4882);
									if (local103.aClass25_5 != null) {
										local103.aClass25_5.method4767(0, local23, local103.anInt4877, local103.anInt4873, local103.anInt4882);
									}
								}
								if (local46.aClass101_1 != null) {
									@Pc(134) Class101 local134 = local46.aClass101_1;
									local134.aClass25_3.method4767(local134.anInt3752, local23, local134.anInt3755, local134.anInt3754, local134.anInt3746);
									if (local134.aClass25_2 != null) {
										local134.aClass25_2.method4767(local134.anInt3752, local23, local134.anInt3755, local134.anInt3754, local134.anInt3746);
									}
								}
								if (local46.aClass162_1 != null) {
									@Pc(167) Class162 local167 = local46.aClass162_1;
									local167.aClass25_7.method4767(0, local23, local167.anInt5850, local167.anInt5858, local167.anInt5856);
								}
								if (local46.aClass152Array1 != null) {
									for (local183 = 0; local183 < local46.anInt2332; local183++) {
										@Pc(192) Class152 local192 = local46.aClass152Array1[local183];
										local192.aClass25_6.method4767(local192.anInt5511, local23, local192.anInt5516, local192.anInt5526, local192.anInt5522);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static287.anIntArrayArrayArray18 == Static298.anIntArrayArrayArray19;
		if (Static296.aBoolean335) {
			@Pc(244) GL local244 = Static296.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static99.method1660();
				Static141.method2524(-1, 3);
				Static197.aBoolean238 = true;
				Static198.method3563();
				Static129.anInt2875 = -1;
				Static269.anInt5835 = -1;
				for (local32 = 0; local32 < Static23.aClass1_Sub20ArrayArray2[0].length; local32++) {
					@Pc(285) Class1_Sub20 local285 = Static23.aClass1_Sub20ArrayArray2[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean160 ? 1.0F : 0.5F);
					if (local285.anInt3098 != Static129.anInt2875) {
						Static129.anInt2875 = local285.anInt3098;
						Static299.method4854(local285.anInt3098);
						Static201.method3577(Static128.method2181());
					}
					local285.method2364(Static132.aClass1_Sub14ArrayArrayArray2, local294, false);
				}
				Static198.method3561();
			} else {
				local32 = Static174.anInt3964;
				while (true) {
					if (local32 >= Static156.anInt3577) {
						Static67.method1295(Static97.anInt6060, Static16.anInt444, Static132.aClass1_Sub14ArrayArrayArray2);
						break;
					}
					for (local37 = 0; local37 < Static23.aClass1_Sub20ArrayArray2[local32].length; local37++) {
						@Pc(336) Class1_Sub20 local336 = Static23.aClass1_Sub20ArrayArray2[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean160 ? 1.0F : 0.5F);
						if (local336.anInt3101 != -1 && Static139.method4752(Static151.anInterface2_1.method4422(local336.anInt3101)) && Static119.aBoolean141) {
							Static299.method4854(local336.anInt3098);
						}
						local336.method2364(Static132.aClass1_Sub14ArrayArrayArray2, local350, false);
					}
					if (local32 == 0 && Static265.anInt5769 > 0) {
						Static296.method4806(101.5F);
						Static124.method2121(Static97.anInt6060, Static16.anInt444, Static34.anInt918, arg1, Static42.aBooleanArrayArray2, Static287.anIntArrayArrayArray18[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub14 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub14[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static174.anInt3964; local400 < Static156.anInt3577; local400++) {
			local407 = Static132.aClass1_Sub14ArrayArrayArray2[local400];
			for (local37 = -Static34.anInt918; local37 <= 0; local37++) {
				local416 = Static97.anInt6060 + local37;
				local183 = Static97.anInt6060 - local37;
				if (local416 >= Static131.anInt2971 || local183 < Static193.anInt4317) {
					for (local429 = -Static34.anInt918; local429 <= 0; local429++) {
						local435 = Static16.anInt444 + local429;
						local439 = Static16.anInt444 - local429;
						if (local416 >= Static131.anInt2971) {
							if (local435 >= Static78.anInt1884) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, true);
								}
							}
							if (local439 < Static15.anInt400) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, true);
								}
							}
						}
						if (local183 < Static193.anInt4317) {
							if (local435 >= Static78.anInt1884) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, true);
								}
							}
							if (local439 < Static15.anInt400) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, true);
								}
							}
						}
						if (Static126.anInt2812 == 0) {
							if (!local240) {
								Static292.aBoolean328 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static174.anInt3964; local400 < Static156.anInt3577; local400++) {
			local407 = Static132.aClass1_Sub14ArrayArrayArray2[local400];
			for (local37 = -Static34.anInt918; local37 <= 0; local37++) {
				local416 = Static97.anInt6060 + local37;
				local183 = Static97.anInt6060 - local37;
				if (local416 >= Static131.anInt2971 || local183 < Static193.anInt4317) {
					for (local429 = -Static34.anInt918; local429 <= 0; local429++) {
						local435 = Static16.anInt444 + local429;
						local439 = Static16.anInt444 - local429;
						if (local416 >= Static131.anInt2971) {
							if (local435 >= Static78.anInt1884) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, false);
								}
							}
							if (local439 < Static15.anInt400) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, false);
								}
							}
						}
						if (local183 < Static193.anInt4317) {
							if (local435 >= Static78.anInt1884) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, false);
								}
							}
							if (local439 < Static15.anInt400) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean126) {
									Static65.method328(local451, false);
								}
							}
						}
						if (Static126.anInt2812 == 0) {
							if (!local240) {
								Static292.aBoolean328 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static292.aBoolean328 = false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method2773(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static132.aClass1_Sub14ArrayArrayArray2 = Static59.aClass1_Sub14ArrayArrayArray1;
			Static287.anIntArrayArrayArray18 = Static298.anIntArrayArrayArray19;
			Static23.aClass1_Sub20ArrayArray2 = Static3.aClass1_Sub20ArrayArray1;
		} else {
			Static132.aClass1_Sub14ArrayArrayArray2 = Static147.aClass1_Sub14ArrayArrayArray3;
			Static287.anIntArrayArrayArray18 = Static113.anIntArrayArrayArray10;
			Static23.aClass1_Sub20ArrayArray2 = Static277.aClass1_Sub20ArrayArray3;
		}
		Static156.anInt3577 = Static132.aClass1_Sub14ArrayArrayArray2.length;
	}
}
