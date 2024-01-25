import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Lclient!wa;")
	public static final Class258 aClass258_1 = new Class258("LIVE", 0);

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_41 = new Class209("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)I")
	public static int method1389(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return local43 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(III)V")
	public static void method1390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static16.method318(arg0)) {
			Static138.method2343(Static60.aClass68ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public static void method1391() {
		if (Static46.anInt860 > 0) {
			Static220.method3461();
		} else {
			Static378.aClass34_3 = Static34.aClass34_2;
			Static34.aClass34_2 = null;
			Static365.method4986(40);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!ya;ZI)Z")
	public static boolean method1392(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static229.anInt4427 - 104) / 2;
		@Pc(17) int local17 = (Static379.anInt6422 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static161.method5537(arg1, local29, local25, local21)) {
						local40 = local29;
						if (Static40.method645(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static30.method536(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static354.aClass17_46 = arg0.method4422(local88, 512, 512, 512);
		Static350.method4780();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 228 | 0xFF000000;
		@Pc(152) int local152 = ((int) (Math.random() * 20.0D) + 228 | 0x114CFF00) << 16;
		@Pc(171) int local171 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(175) boolean[][] local175 = new boolean[Static98.anInt2365][Static98.anInt2365];
		@Pc(181) int local181;
		@Pc(198) int local198;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(257) int local257;
		@Pc(263) int local263;
		@Pc(267) int local267;
		@Pc(282) int local282;
		for (@Pc(177) int local177 = local11; local177 < local11 + 104; local177 += Static98.anInt2365) {
			for (local181 = local17; local181 < local17 + 104; local181 += Static98.anInt2365) {
				arg0.OA(0, 0, Static98.anInt2365 * 4, Static98.anInt2365 * 4);
				arg0.p(-16777216);
				for (local198 = arg1; local198 <= 3; local198++) {
					for (local202 = 0; local202 < Static98.anInt2365; local202++) {
						for (local206 = 0; local206 < Static98.anInt2365; local206++) {
							local175[local202][local206] = Static161.method5537(arg1, local198, local181 + local206, local202 + local177);
						}
					}
					Static263.aClass64Array2[local198].method2356(local177, local181, Static98.anInt2365 + local177, local181 - -Static98.anInt2365, local175);
					if (!Static160.aBoolean312) {
						for (local206 = -4; local206 < Static98.anInt2365; local206++) {
							for (local257 = -4; local257 < Static98.anInt2365; local257++) {
								local263 = local177 + local206;
								local267 = local257 + local181;
								if (local11 <= local263 && local17 <= local267 && Static161.method5537(arg1, local198, local267, local263)) {
									local282 = local198;
									if (Static40.method645(local267, local263)) {
										local282 = local198 - 1;
									}
									if (local282 >= 0) {
										Static74.method1384(local267, local206 * 4, local152, local263, local282, local40, (Static98.anInt2365 - local257) * 4 - 4, arg0);
									}
								}
							}
						}
					}
				}
				if (Static160.aBoolean312) {
					@Pc(336) Class70 local336 = Static194.aClass70Array1[arg1];
					for (local206 = 0; local206 < Static98.anInt2365; local206++) {
						for (local257 = 0; local257 < Static98.anInt2365; local257++) {
							local263 = local177 + local206;
							local267 = local181 + local257;
							local282 = local336.anIntArrayArray17[local263 - local336.anInt2303][local267 - local336.anInt2305];
							if ((local282 & 0x40240000) != 0) {
								arg0.method4480(local206 * 4, 4, -1713569622, (Static98.anInt2365 - local257) * 4 - 4, 4);
							} else if ((local282 & 0x800000) != 0) {
								arg0.method4413(-1713569622, 4, (Static98.anInt2365 - local257) * 4 - 4, local206 * 4);
							} else if ((local282 & 0x2000000) != 0) {
								arg0.method4464((Static98.anInt2365 - local257) * 4 - 4, 4, local206 * 4 + 3, -1713569622);
							} else if ((local282 & 0x8000000) != 0) {
								arg0.method4413(-1713569622, 4, (Static98.anInt2365 - local257) * 4 + 3 - 4, local206 * 4);
							} else if ((local282 & 0x20000000) != 0) {
								arg0.method4464((Static98.anInt2365 - local257) * 4 - 4, 4, local206 * 4, -1713569622);
							}
						}
					}
				}
				arg0.O(0, 0, Static98.anInt2365 * 4, Static98.anInt2365 * 4, local171, 2);
				Static354.aClass17_46.t((local177 - local11) * 4 + 48, -(Static98.anInt2365 * 4) + -((local181 + -local17) * 4) + 464, Static98.anInt2365 * 4, Static98.anInt2365 * 4, 0, 0);
			}
		}
		arg0.e();
		arg0.p(-16777215);
		Static260.method3927();
		Static356.anInt6043 = 0;
		Static376.aClass14_43.method305();
		if (!Static160.aBoolean312) {
			for (local181 = local11; local181 < local11 + 104; local181++) {
				for (local198 = local17; local198 < local17 + 104; local198++) {
					for (local202 = arg1; local202 <= arg1 + 1 && local202 <= 3; local202++) {
						if (Static161.method5537(arg1, local202, local198, local181)) {
							@Pc(604) Interface6 local604 = (Interface6) Static139.method2376(local202, local181, local198);
							if (local604 == null) {
								local604 = (Interface6) Static455.method4456(local202, local181, local198, jn.class);
							}
							if (local604 == null) {
								local604 = (Interface6) Static215.method3376(local202, local181, local198);
							}
							if (local604 == null) {
								local604 = (Interface6) Static414.method5443(local202, local181, local198);
							}
							if (local604 != null) {
								@Pc(645) Class134 local645 = Static118.aClass165_2.method3799(local604.method5153());
								if (!local645.aBoolean274 || Static333.aBoolean406) {
									local263 = local645.anInt3660;
									if (local645.anIntArray322 != null) {
										for (local267 = 0; local267 < local645.anIntArray322.length; local267++) {
											if (local645.anIntArray322[local267] != -1) {
												@Pc(674) Class134 local674 = Static118.aClass165_2.method3799(local645.anIntArray322[local267]);
												if (local674.anInt3660 >= 0) {
													local263 = local674.anInt3660;
												}
											}
										}
									}
									if (local263 >= 0) {
										@Pc(693) boolean local693 = false;
										if (local263 >= 0) {
											@Pc(703) Class48 local703 = Static357.aClass215_4.method4741(local263);
											if (local703 != null && local703.aBoolean69) {
												local693 = true;
											}
										}
										local282 = local181;
										@Pc(714) int local714 = local198;
										if (local693) {
											@Pc(721) int[][] local721 = Static194.aClass70Array1[local202].anIntArrayArray17;
											@Pc(726) int local726 = Static194.aClass70Array1[local202].anInt2303;
											@Pc(731) int local731 = Static194.aClass70Array1[local202].anInt2305;
											for (@Pc(733) int local733 = 0; local733 < 10; local733++) {
												@Pc(740) int local740 = (int) (Math.random() * 4.0D);
												if (local740 == 0 && local282 > local11 && local181 - 3 < local282 && (local721[local282 - local726 - 1][local714 - local731] & 0x2C0108) == 0) {
													local282--;
												}
												if (local740 == 1 && local11 + 104 - 1 > local282 && local181 + 3 > local282 && (local721[local282 + 1 - local726][local714 - local731] & 0x2C0180) == 0) {
													local282++;
												}
												if (local740 == 2 && local714 > local17 && local714 > local198 - 3 && (local721[local282 - local726][local714 - local731 - 1] & 0x2C0102) == 0) {
													local714--;
												}
												if (local740 == 3 && local714 < local17 + 104 - 1 && local714 < local198 + 3 && (local721[local282 - local726][local714 + 1 - local731] & 0x2C0120) == 0) {
													local714++;
												}
											}
										}
										Static445.anIntArray621[Static356.anInt6043] = local645.anInt3648;
										Static454.anIntArray636[Static356.anInt6043] = local282;
										Static325.anIntArray465[Static356.anInt6043] = local714;
										Static356.anInt6043++;
									}
								}
							}
						}
					}
				}
			}
			if (Static322.aClass153_3 != null) {
				Static49.aClass160_6.anInt4623 = 1;
				Static357.aClass215_4.method4746(64, 1024);
				for (local198 = 0; local198 < Static322.aClass153_3.anInt4339; local198++) {
					local202 = Static322.aClass153_3.anIntArray367[local198];
					if (local202 >> 28 == Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89) {
						local206 = (local202 >> 14 & 0x3FFF) - Static48.anInt962;
						local257 = (local202 & 0x3FFF) - Static324.anInt5624;
						if (local206 >= 0 && Static229.anInt4427 > local206 && local257 >= 0 && local257 < Static379.anInt6422) {
							Static376.aClass14_43.method300(new Class2_Sub26(local198));
						} else {
							@Pc(1006) Class48 local1006 = Static357.aClass215_4.method4741(Static322.aClass153_3.anIntArray366[local198]);
							if (local1006.anIntArray86 != null && local206 + local1006.anInt1222 >= 0 && Static229.anInt4427 > local1006.anInt1218 + local206 && local257 + local1006.anInt1217 >= 0 && Static379.anInt6422 > local257 + local1006.anInt1216) {
								Static376.aClass14_43.method300(new Class2_Sub26(local198));
							}
						}
					}
				}
				Static357.aClass215_4.method4746(64, 128);
				Static49.aClass160_6.anInt4623 = 2;
				Static49.aClass160_6.method3717();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static327.method4554(arg1, Static181.anInt3543, Static430.anInt7123);
		@Pc(17) int local17 = Static327.method4554(arg3, Static181.anInt3543, Static430.anInt7123);
		@Pc(23) int local23 = Static327.method4554(arg4, Static184.anInt3600, Static8.anInt223);
		@Pc(29) int local29 = Static327.method4554(arg6, Static184.anInt3600, Static8.anInt223);
		@Pc(37) int local37 = Static327.method4554(arg2 + arg1, Static181.anInt3543, Static430.anInt7123);
		@Pc(45) int local45 = Static327.method4554(arg3 - arg2, Static181.anInt3543, Static430.anInt7123);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static64.method1247(local23, Static280.anIntArrayArray51[local47], local29, arg0);
		}
		for (@Pc(63) int local63 = local17; local63 > local45; local63--) {
			Static64.method1247(local23, Static280.anIntArrayArray51[local63], local29, arg0);
		}
		@Pc(85) int local85 = Static327.method4554(arg2 + arg4, Static184.anInt3600, Static8.anInt223);
		@Pc(94) int local94 = Static327.method4554(arg6 - arg2, Static184.anInt3600, Static8.anInt223);
		for (@Pc(96) int local96 = local37; local96 <= local45; local96++) {
			@Pc(109) int[] local109 = Static280.anIntArrayArray51[local96];
			Static64.method1247(local23, local109, local85, arg0);
			Static64.method1247(local85, local109, local94, arg5);
			Static64.method1247(local94, local109, local29, arg0);
		}
	}
}
