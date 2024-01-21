import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1372 = Static146.method2172("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1373 = Static146.method2172("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1374 = Static146.method2172("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt4026 = 0;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1375 = Static146.method2172("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1376 = Static146.method2172("::rect_debug");

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1377 = aClass77_1373;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1378 = aClass77_1372;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1379 = Static146.method2172("::clientdrop");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZIIII)I")
	public static int method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg4;
			arg4 = local12;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return 7 + 1 - arg2 - arg0;
		} else if (local20 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method2759() {
		aClass77_1372 = null;
		aClass77_1375 = null;
		aClass77_1377 = null;
		aClass77_1378 = null;
		aClass77_1379 = null;
		aClass77_1374 = null;
		aClass77_1376 = null;
		aClass77_1373 = null;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public static void method2760() {
		if (!Static16.aBoolean25) {
			return;
		}
		@Pc(11) Class66 local11 = Static105.method1835(Static117.anInt2916, Static6.anInt174);
		if (local11 != null && local11.anObjectArray15 != null) {
			@Pc(25) Class2_Sub21 local25 = new Class2_Sub21();
			local25.anObjectArray29 = local11.anObjectArray15;
			local25.aClass66_14 = local11;
			Static150.method2565(local25);
		}
		Static16.aBoolean25 = false;
		Static57.method2994(local11);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIIII)V")
	public static void method2762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) int local1 = -1;
		if (Static124.anInt3041 == 0 && !Static16.aBoolean25) {
			Static147.method2486(Static41.aClass77_468, arg1 - arg0, -arg2 + arg3, Static100.aClass77_332, 40, 0);
		}
		for (@Pc(32) int local32 = 0; local32 < Static22.anInt858; local32++) {
			@Pc(37) int local37 = Static22.anIntArray111[local32];
			@Pc(41) int local41 = local37 & 0x7F;
			@Pc(47) int local47 = local37 >> 7 & 0x7F;
			@Pc(53) int local53 = local37 >> 29 & 0x3;
			@Pc(59) int local59 = local37 >> 14 & 0x7FFF;
			if (local37 != local1) {
				local1 = local37;
				@Pc(152) int local152;
				if (local53 == 2 && Static172.aClass60_1.method2059(Static54.anInt1472, local41, local47, local37) >= 0) {
					@Pc(87) Class2_Sub2_Sub5 local87 = Static121.method2129(local59);
					if (local87.anIntArray73 != null) {
						local87 = local87.method347();
					}
					if (local87 == null) {
						continue;
					}
					if (Static124.anInt3041 == 1) {
						Static147.method2486(Static146.method2168(new Class77[] { Static15.aClass77_233, Static157.aClass77_1331, local87.aClass77_246 }), local47, local41, Static64.aClass77_714, 35, local37);
					} else if (!Static16.aBoolean25) {
						@Pc(142) Class77[] local142 = local87.aClass77Array4;
						if (Static78.aBoolean91) {
							local142 = Static119.method2127(local142);
						}
						if (local142 != null) {
							for (local152 = 4; local152 >= 0; local152--) {
								if (local142[local152] != null) {
									@Pc(163) short local163 = 0;
									if (local152 == 0) {
										local163 = 14;
									}
									if (local152 == 1) {
										local163 = 15;
									}
									if (local152 == 2) {
										local163 = 32;
									}
									if (local152 == 3) {
										local163 = 25;
									}
									if (local152 == 4) {
										local163 = 1003;
									}
									Static147.method2486(Static146.method2168(new Class77[] { Static177.aClass77_1535, local87.aClass77_246 }), local47, local41, local142[local152], local163, local37);
								}
							}
						}
						Static147.method2486(Static146.method2168(new Class77[] { Static177.aClass77_1535, local87.aClass77_246 }), local47, local41, Static133.aClass77_1171, 1001, local87.anInt516 << 14);
					} else if ((Static11.anInt307 & 0x4) == 4) {
						Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static157.aClass77_1331, local87.aClass77_246 }), local47, local41, Static120.aClass77_405, 10, local37);
					}
				}
				@Pc(306) int local306;
				@Pc(313) Class2_Sub2_Sub1_Sub6_Sub2 local313;
				@Pc(361) Class2_Sub2_Sub1_Sub6_Sub1 local361;
				if (local53 == 1) {
					@Pc(285) Class2_Sub2_Sub1_Sub6_Sub2 local285 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local59];
					if (local285.aClass2_Sub2_Sub16_1.anInt3766 == 1 && (local285.anInt4400 & 0x7F) == 64 && (local285.anInt4385 & 0x7F) == 64) {
						for (local306 = 0; local306 < Static145.anInt3533; local306++) {
							local313 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local306]];
							if (local313 != null && local285 != local313 && local313.aClass2_Sub2_Sub16_1.anInt3766 == 1 && local313.anInt4400 == local285.anInt4400 && local313.anInt4385 == local285.anInt4385) {
								Static72.method1392(local41, local47, local313.aClass2_Sub2_Sub16_1, Static160.anIntArray643[local306]);
							}
						}
						for (local152 = 0; local152 < Static124.anInt3042; local152++) {
							local361 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local152]];
							if (local361 != null && local285.anInt4400 == local361.anInt4400 && local361.anInt4385 == local285.anInt4385) {
								Static136.method2287(local47, local361, local41, Static177.anIntArray632[local152]);
							}
						}
					}
					Static72.method1392(local41, local47, local285.aClass2_Sub2_Sub16_1, local59);
				}
				if (local53 == 0) {
					@Pc(410) Class2_Sub2_Sub1_Sub6_Sub1 local410 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local59];
					if ((local410.anInt4400 & 0x7F) == 64 && (local410.anInt4385 & 0x7F) == 64) {
						for (local306 = 0; local306 < Static145.anInt3533; local306++) {
							local313 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local306]];
							if (local313 != null && local313.aClass2_Sub2_Sub16_1.anInt3766 == 1 && local313.anInt4400 == local410.anInt4400 && local313.anInt4385 == local410.anInt4385) {
								Static72.method1392(local41, local47, local313.aClass2_Sub2_Sub16_1, Static160.anIntArray643[local306]);
							}
						}
						for (local152 = 0; local152 < Static124.anInt3042; local152++) {
							local361 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local152]];
							if (local361 != null && local361 != local410 && local361.anInt4400 == local410.anInt4400 && local410.anInt4385 == local361.anInt4385) {
								Static136.method2287(local47, local361, local41, Static177.anIntArray632[local152]);
							}
						}
					}
					Static136.method2287(local47, local410, local41, local59);
				}
				if (local53 == 3) {
					@Pc(534) Class10 local534 = Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local41][local47];
					if (local534 != null) {
						for (@Pc(541) Class2_Sub2_Sub1_Sub4 local541 = (Class2_Sub2_Sub1_Sub4) local534.method446(); local541 != null; local541 = (Class2_Sub2_Sub1_Sub4) local534.method452()) {
							@Pc(547) Class2_Sub2_Sub9 local547 = Static158.method2689(local541.anInt3104);
							if (Static124.anInt3041 == 1) {
								Static147.method2486(Static146.method2168(new Class77[] { Static15.aClass77_233, Static64.aClass77_713, local547.aClass77_717 }), local47, local41, Static64.aClass77_714, 51, local541.anInt3104);
							} else if (!Static16.aBoolean25) {
								@Pc(561) Class77[] local561 = local547.aClass77Array14;
								if (Static78.aBoolean91) {
									local561 = Static119.method2127(local561);
								}
								for (@Pc(569) int local569 = 4; local569 >= 0; local569--) {
									if (local561 != null && local561[local569] != null) {
										@Pc(582) byte local582 = 0;
										if (local569 == 0) {
											local582 = 6;
										}
										if (local569 == 1) {
											local582 = 21;
										}
										if (local569 == 2) {
											local582 = 16;
										}
										if (local569 == 3) {
											local582 = 47;
										}
										if (local569 == 4) {
											local582 = 3;
										}
										Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local547.aClass77_717 }), local47, local41, local561[local569], local582, local541.anInt3104);
									} else if (local569 == 2) {
										Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local547.aClass77_717 }), local47, local41, Static54.aClass77_579, 16, local541.anInt3104);
									}
								}
								Static147.method2486(Static146.method2168(new Class77[] { Static98.aClass77_960, local547.aClass77_717 }), local47, local41, Static133.aClass77_1171, 1005, local541.anInt3104);
							} else if ((Static11.anInt307 & 0x1) == 1) {
								Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static64.aClass77_713, local547.aClass77_717 }), local47, local41, Static120.aClass77_405, 1, local541.anInt3104);
							}
						}
					}
				}
			}
		}
	}
}
