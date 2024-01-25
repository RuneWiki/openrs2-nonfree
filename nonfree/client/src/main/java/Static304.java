import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public static int anInt5823;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "[Lclient!uh;")
	public static Class60[] aClass60Array3;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray162 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!vq;IB)V")
	public static void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static340.anInt6523 == 0 || Static149.anInt3927 == 0) {
			return;
		}
		arg1.method2660(Static229.anInt4618, Static77.anInt2063, Static340.anInt6523, Static149.anInt3927);
		arg1.method2709(Static312.anInt6062, Static156.anInt5229, Static340.anInt6523, Static149.anInt3927);
		@Pc(32) Class57 local32 = arg1.method2705();
		local32.method4198(Static52.anInt1392, Static114.anInt2731, Static70.anInt1835, Static217.anInt4439, Static188.anInt3932, Static250.anInt5089);
		arg1.method2656(local32);
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (aClass60Array3 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			@Pc(52) int local52 = arg1.method2683();
			local61 = (arg2 - Static229.anInt4618) * local52 / Static340.anInt6523;
			local69 = local52 * (arg0 - Static77.anInt2063) / Static149.anInt3927;
			local72 = arg1.method2700();
			local81 = (arg2 - Static229.anInt4618) * local72 / Static340.anInt6523;
			local90 = local72 * (arg0 - Static77.anInt2063) / Static149.anInt3927;
			@Pc(105) int[] local105 = new int[] { local61, local69, local52 };
			local32.method4201(local105);
			@Pc(123) int[] local123 = new int[] { local81, local90, local72 };
			local32.method4201(local123);
			@Pc(128) float local128 = 0.0F;
			@Pc(137) int local137 = local123[0] - local105[0];
			@Pc(145) int local145 = local123[1] - local105[1];
			@Pc(154) int local154 = local123[2] - local105[2];
			while (local128 < 1.0F) {
				@Pc(167) int local167 = (int) ((float) local137 * local128 + (float) local105[0]);
				@Pc(171) int local171 = local167 >> 7;
				@Pc(182) int local182 = (int) (local128 * (float) local154 + (float) local105[2]);
				@Pc(186) int local186 = local182 >> 7;
				if (local171 > 0 && local186 > 0 && Static350.anInt6637 > local171 && Static105.anInt2647 > local186) {
					@Pc(209) int local209 = Static12.anInt267;
					if (local209 < 3 && (Static2.aByteArrayArrayArray1[1][local171][local186] & 0x2) != 0) {
						local209++;
					}
					if ((float) aClass60Array3[local209].method2270(local167, local182) < (float) local145 * local128 + (float) local105[1]) {
						local47 = (Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() - 1) * 64 + local167 >> 7;
						local49 = Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() * 64 + local182 - 64 >> 7;
						break;
					}
				}
				local128 = (float) ((double) local128 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static344.aBoolean219 && (Static48.anInt1288 & 0x40) != 0) {
					@Pc(297) Class21 local297 = Static156.method4515(Static255.anInt5164, Static82.anInt2376);
					if (local297 == null) {
						Static75.method1745();
					} else {
						Static138.method2617(0L, " ->", 48, Static169.anInt3596, Static171.aString34, local47, local49);
					}
				} else {
					if (Static330.anInt6312 == 1) {
						Static138.method2617(0L, "", 45, -1, Static278.aClass159_363.method4311(Static180.anInt3835), local47, local49);
					}
					Static138.method2617(0L, "", 57, -1, Static333.aString63, local47, local49);
				}
			}
		}
		@Pc(348) Class32 local348 = Static151.aClass32_5;
		for (@Pc(355) Class2_Sub2 local355 = (Class2_Sub2) local348.method850(); local355 != null; local355 = (Class2_Sub2) local348.method846()) {
			if (local355.method382(arg0, arg2, arg1) && local355.anInt462 == Static12.anInt267) {
				@Pc(483) int local483;
				@Pc(494) int local494;
				if (local355.aClass8_1 instanceof Class8_Sub1_Sub2_Sub1) {
					@Pc(381) Class8_Sub1_Sub2_Sub1 local381 = (Class8_Sub1_Sub2_Sub1) local355.aClass8_1;
					local61 = local381.method4349();
					if ((local61 & 0x1) == 0 && (local381.anInt6701 & 0x7F) == 0 && (local381.anInt6702 & 0x7F) == 0 || (local61 & 0x1) == 1 && (local381.anInt6701 & 0x7F) == 64 && (local381.anInt6702 & 0x7F) == 64) {
						local69 = local381.anInt6701 - (local381.method4349() - 1) * 64;
						local72 = local381.anInt6702 - (local381.method4349() - 1) * 64;
						for (local81 = 0; local81 < Static145.anInt3273; local81++) {
							@Pc(460) Class8_Sub1_Sub2_Sub2 local460 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local81]];
							if (local460 != null && Static199.anInt4137 != local460.anInt4957 && local460.aBoolean373) {
								local483 = local460.anInt6701 + 64 - local460.aClass141_1.anInt4382 * 64;
								local494 = local460.anInt6702 + 64 - local460.aClass141_1.anInt4382 * 64;
								if (local483 >= local69 && local460.aClass141_1.anInt4382 <= local381.method4349() - (local483 - local69 >> 7) && local72 <= local494 && local460.aClass141_1.anInt4382 <= local381.method4349() - (local494 - local72 >> 7)) {
									Static93.method2210(local460);
									local460.anInt4957 = Static199.anInt4137;
								}
							}
						}
						for (local90 = 0; local90 < Static289.anInt5643; local90++) {
							@Pc(562) Class8_Sub1_Sub2_Sub1 local562 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local90]];
							if (local562 != null && Static199.anInt4137 != local562.anInt4957 && local562 != local381 && local562.aBoolean373) {
								local494 = local562.anInt6701 + 64 - local562.method4349() * 64;
								@Pc(599) int local599 = local562.anInt6702 - (local562.method4349() - 1) * 64;
								if (local69 <= local494 && local562.method4349() <= local381.method4349() - (local494 - local69 >> 7) && local72 <= local599 && local562.method4349() <= local381.method4349() - (local599 - local72 >> 7)) {
									Static201.method3773(local562);
									local562.anInt4957 = Static199.anInt4137;
								}
							}
						}
					}
					if (local381.anInt4957 == Static199.anInt4137) {
						continue;
					}
					Static201.method3773(local381);
					local381.anInt4957 = Static199.anInt4137;
				}
				if (local355.aClass8_1 instanceof Class8_Sub1_Sub2_Sub2) {
					@Pc(675) Class8_Sub1_Sub2_Sub2 local675 = (Class8_Sub1_Sub2_Sub2) local355.aClass8_1;
					if (local675.aClass141_1 != null) {
						if ((local675.aClass141_1.anInt4382 & 0x1) == 0 && (local675.anInt6701 & 0x7F) == 0 && (local675.anInt6702 & 0x7F) == 0 || (local675.aClass141_1.anInt4382 & 0x1) == 1 && (local675.anInt6701 & 0x7F) == 64 && (local675.anInt6702 & 0x7F) == 64) {
							local61 = local675.anInt6701 + 64 - local675.aClass141_1.anInt4382 * 64;
							local69 = local675.anInt6702 + 64 - local675.aClass141_1.anInt4382 * 64;
							for (local72 = 0; local72 < Static145.anInt3273; local72++) {
								@Pc(760) Class8_Sub1_Sub2_Sub2 local760 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local72]];
								if (local760 != null && local760.anInt4957 != Static199.anInt4137 && local760 != local675 && local760.aBoolean373) {
									local90 = local760.anInt6701 + 64 - local760.aClass141_1.anInt4382 * 64;
									local483 = local760.anInt6702 + 64 - local760.aClass141_1.anInt4382 * 64;
									if (local61 <= local90 && local675.aClass141_1.anInt4382 - (local90 - local61 >> 7) >= local760.aClass141_1.anInt4382 && local483 >= local69 && local760.aClass141_1.anInt4382 <= local675.aClass141_1.anInt4382 - (local483 - local69 >> 7)) {
										Static93.method2210(local760);
										local760.anInt4957 = Static199.anInt4137;
									}
								}
							}
							for (local81 = 0; local81 < Static289.anInt5643; local81++) {
								@Pc(861) Class8_Sub1_Sub2_Sub1 local861 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local81]];
								if (local861 != null && local861.anInt4957 != Static199.anInt4137 && local861.aBoolean373) {
									local483 = local861.anInt6701 - (local861.method4349() - 1) * 64;
									local494 = local861.anInt6702 + 64 - local861.method4349() * 64;
									if (local61 <= local483 && local861.method4349() <= local675.aClass141_1.anInt4382 - (local483 - local61 >> 7) && local494 >= local69 && local861.method4349() <= local675.aClass141_1.anInt4382 - (local494 - local69 >> 7)) {
										Static201.method3773(local861);
										local861.anInt4957 = Static199.anInt4137;
									}
								}
							}
						}
						if (local675.anInt4957 == Static199.anInt4137) {
							continue;
						}
						Static93.method2210(local675);
						local675.anInt4957 = Static199.anInt4137;
					}
				}
				if (local355.aClass8_1 instanceof Class8_Sub3_Sub1) {
					@Pc(986) Class4_Sub19 local986 = (Class4_Sub19) Static165.aClass43_20.method1273((long) (local355.anInt453 | local355.anInt462 << 28 | local355.anInt454 << 14));
					if (local986 != null) {
						for (@Pc(996) Class4_Sub36 local996 = (Class4_Sub36) local986.aClass116_15.method3278(); local996 != null; local996 = (Class4_Sub36) local986.aClass116_15.method3271()) {
							@Pc(1003) Class210 local1003 = Static177.method3465(local996.anInt5156);
							if (Static344.aBoolean219) {
								@Pc(1143) Class4_Sub4_Sub21 local1143 = Static199.anInt4136 == -1 ? null : Static157.method3056(Static199.anInt4136);
								if ((Static48.anInt1288 & 0x1) != 0 && (local1143 == null || local1003.method5460(Static199.anInt4136, local1143.anInt6440) != local1143.anInt6440)) {
									Static138.method2617((long) local996.anInt5156, Static194.aString36 + " -> <col=ff9040>" + local1003.aString65, 30, Static169.anInt3596, Static171.aString34, local355.anInt453, local355.anInt454);
								}
							} else {
								@Pc(1008) String[] local1008 = local1003.aStringArray82;
								for (local81 = 4; local81 >= 0; local81--) {
									if (local1008 != null && local1008[local81] != null) {
										@Pc(1020) byte local1020 = 0;
										local483 = Static207.anInt4330;
										if (local81 == 0) {
											local1020 = 15;
										}
										if (local81 == 1) {
											local1020 = 12;
										}
										if (local81 == 2) {
											local1020 = 60;
										}
										if (local81 == 3) {
											local1020 = 2;
										}
										if (local81 == local1003.anInt6461) {
											local483 = local1003.anInt6485;
										}
										if (local81 == 4) {
											local1020 = 46;
										}
										if (local81 == local1003.anInt6491) {
											local483 = local1003.anInt6474;
										}
										Static138.method2617((long) local996.anInt5156, "<col=ff9040>" + local1003.aString65, local1020, local483, local1008[local81], local355.anInt453, local355.anInt454);
									}
								}
								Static138.method2617((long) local996.anInt5156, "<col=ff9040>" + local1003.aString65, 1007, Static214.anInt2074, Static183.aClass159_201.method4311(Static180.anInt3835), local355.anInt453, local355.anInt454);
							}
						}
					}
				}
				if (local355.aClass8_1 instanceof Interface7) {
					@Pc(1204) Interface7 local1204 = (Interface7) local355.aClass8_1;
					@Pc(1210) Class18 local1210 = Static113.method2380(local1204.method5594());
					if (local1210.anIntArray23 != null) {
						local1210 = local1210.method416();
					}
					if (local1210 != null) {
						if (Static344.aBoolean219) {
							@Pc(1230) Class4_Sub4_Sub21 local1230 = Static199.anInt4136 == -1 ? null : Static157.method3056(Static199.anInt4136);
							if ((Static48.anInt1288 & 0x4) != 0 && (local1230 == null || local1210.method418(Static199.anInt4136, local1230.anInt6440) != local1230.anInt6440)) {
								Static138.method2617(Static167.method3260(local1204, local355.anInt453, local355.anInt454), Static194.aString36 + " -> <col=00ffff>" + local1210.aString5, 59, Static169.anInt3596, Static171.aString34, local355.anInt453, local355.anInt454);
							}
						} else {
							@Pc(1288) String[] local1288 = local1210.aStringArray3;
							if (local1288 != null) {
								for (local72 = 4; local72 >= 0; local72--) {
									if (local1288[local72] != null) {
										@Pc(1300) short local1300 = 0;
										if (local72 == 0) {
											local1300 = 51;
										}
										local90 = Static207.anInt4330;
										if (local72 == 1) {
											local1300 = 50;
										}
										if (local72 == 2) {
											local1300 = 17;
										}
										if (local72 == 3) {
											local1300 = 13;
										}
										if (local1210.anInt515 == local72) {
											local90 = local1210.anInt499;
										}
										if (local72 == 4) {
											local1300 = 1002;
										}
										if (local72 == local1210.anInt511) {
											local90 = local1210.anInt498;
										}
										Static138.method2617(Static167.method3260(local1204, local355.anInt453, local355.anInt454), "<col=00ffff>" + local1210.aString5, local1300, local90, local1288[local72], local355.anInt453, local355.anInt454);
									}
								}
							}
							Static138.method2617((long) local1210.anInt534, "<col=00ffff>" + local1210.aString5, 1004, Static214.anInt2074, Static183.aClass159_201.method4311(Static180.anInt3835), local355.anInt453, local355.anInt454);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)Z")
	public static boolean method4987(@OriginalArg(0) int arg0) {
		if (arg0 == 10 || arg0 == 49 || arg0 == 25 || arg0 == 6 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!tj;ZILclient!tj;)V")
	public static void method4988(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(4) Class193 arg2) {
		Static259.aBoolean383 = true;
		Static315.aClass193_98 = arg1;
		Static151.aClass193_52 = arg2;
		Static69.anInt1823 = arg0;
		@Pc(17) int local17 = Static315.aClass193_98.method5037() - 1;
		Static2.anInt58 = local17 * 256 + Static315.aClass193_98.method5055(local17);
		Static309.aStringArray72 = new String[] { null, null, Static354.aClass159_364.method4311(Static69.anInt1823), null, null };
		Static73.aStringArray22 = new String[] { null, null, null, null, Static76.aClass159_107.method4311(Static69.anInt1823) };
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	public static void method4990() {
		@Pc(13) Class198 local13 = Static203.aClass198_153;
		synchronized (Static203.aClass198_153) {
			Static203.aClass198_153.method5213();
		}
	}
}
