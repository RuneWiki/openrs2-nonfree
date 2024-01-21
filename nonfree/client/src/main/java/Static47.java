import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "Lclient!wd;")
	public static Class3_Sub11 aClass3_Sub11_3;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_47;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!pc;")
	public static Class12 aClass12_35;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Lclient!ob;")
	public static Class3_Sub11_Sub1 aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!hb;")
	private static Class27 aClass27_619 = Static87.method1648("Loading fonts )2 ");

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_617 = aClass27_619;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!hb;")
	public static Class27 aClass27_618 = Static87.method1648("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
	public static int anInt1276 = 0;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_626 = Static87.method1648("Report abuse");

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!hb;")
	public static Class27 aClass27_620 = aClass27_626;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_621 = Static87.method1648("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Lclient!fc;")
	public static Class21 aClass21_17 = new Class21(64);

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!hb;")
	public static Class27 aClass27_622 = Static87.method1648("(X100(U(Y");

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_623 = Static87.method1648("Ein");

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_624 = Static87.method1648("null");

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_625 = Static87.method1648("@or2@");

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_627 = Static87.method1648("Handel)4Duell");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BZ)V")
	public static void method937(@OriginalArg(1) boolean arg0) {
		Static61.anInt1555++;
		if (Static61.anInt1555 < 50 && !arg0) {
			return;
		}
		Static61.anInt1555 = 0;
		if (Static41.aBoolean58 || Static91.aClass20_42 == null) {
			return;
		}
		Static78.aClass3_Sub11_Sub1_3.method1478(202);
		try {
			Static91.aClass20_42.method651(Static78.aClass3_Sub11_Sub1_3.anInt2060, Static78.aClass3_Sub11_Sub1_3.aByteArray17);
			Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
		} catch (@Pc(44) IOException local44) {
			Static41.aBoolean58 = true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public static void method938() {
		aClass3_Sub11_Sub1_1 = null;
		aClass3_Sub3_Sub2_Sub4_47 = null;
		aClass27_622 = null;
		aClass27_620 = null;
		aClass27_623 = null;
		aClass27_618 = null;
		aClass27_626 = null;
		aClass3_Sub11_3 = null;
		aClass27_621 = null;
		aClass27_625 = null;
		aClass21_17 = null;
		aClass27_624 = null;
		aClass12_35 = null;
		aClass27_617 = null;
		aClass27_619 = null;
		aClass27_627 = null;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
	public static void method939() {
		if (Static42.anInt1235 == 0 && Static39.anInt964 == 0) {
			Static46.method925(Static85.anInt2297, 26, Static93.anInt2546, 0, Static45.aClass27_182, Static42.aClass27_601);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static21.anInt550; local31++) {
			@Pc(37) int local37 = Static21.anIntArray112[local31];
			@Pc(43) int local43 = local37 >> 29 & 0x3;
			@Pc(47) int local47 = local37 & 0x7F;
			@Pc(53) int local53 = local37 >> 7 & 0x7F;
			@Pc(59) int local59 = local37 >> 14 & 0x7FFF;
			if (local37 != local29) {
				local29 = local37;
				@Pc(114) int local114;
				if (local43 == 2 && Static76.aClass18_1.method535(Static68.anInt1747, local47, local53, local37) >= 0) {
					@Pc(82) Class3_Sub3_Sub4 local82 = Static108.method1902(local59);
					if (local82.anIntArray215 != null) {
						local82 = local82.method974();
					}
					if (local82 == null) {
						continue;
					}
					if (Static42.anInt1235 == 1) {
						Static46.method925(local47, 39, local53, local37, Static98.method1779(new Class27[] { Static81.aClass27_1046, Static82.aClass27_1059, local82.aClass27_642 }), Static8.aClass27_115);
					} else if (Static39.anInt964 != 1) {
						@Pc(104) Class27[] local104 = local82.aClass27Array6;
						if (Static92.aBoolean122) {
							local104 = Static8.method179(local104);
						}
						if (local104 != null) {
							for (local114 = 4; local114 >= 0; local114--) {
								if (local104[local114] != null) {
									@Pc(126) short local126 = 0;
									if (local114 == 0) {
										local126 = 11;
									}
									if (local114 == 1) {
										local126 = 48;
									}
									if (local114 == 2) {
										local126 = 4;
									}
									if (local114 == 3) {
										local126 = 13;
									}
									if (local114 == 4) {
										local126 = 1001;
									}
									Static46.method925(local47, local126, local53, local37, Static98.method1779(new Class27[] { Static67.aClass27_850, local82.aClass27_642 }), local104[local114]);
								}
							}
						}
						Static46.method925(local47, 1003, local53, local82.anInt1332 << 14, Static98.method1779(new Class27[] { Static67.aClass27_850, local82.aClass27_642 }), Static36.aClass27_435);
					} else if ((Static68.anInt1748 & 0x4) == 4) {
						Static46.method925(local47, 40, local53, local37, Static98.method1779(new Class27[] { Static16.aClass27_189, Static82.aClass27_1059, local82.aClass27_642 }), Static10.aClass27_130);
					}
				}
				@Pc(310) int local310;
				@Pc(318) Class3_Sub3_Sub1_Sub4_Sub1 local318;
				@Pc(365) Class3_Sub3_Sub1_Sub4_Sub2 local365;
				if (local43 == 1) {
					@Pc(287) Class3_Sub3_Sub1_Sub4_Sub1 local287 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local59];
					if (local287.aClass3_Sub3_Sub3_1.anInt920 == 1 && (local287.anInt2408 & 0x7F) == 64 && (local287.anInt2399 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static104.anInt2724; local310++) {
							local318 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local310]];
							if (local318 != null && local318 != local287 && local318.aClass3_Sub3_Sub3_1.anInt920 == 1 && local318.anInt2408 == local287.anInt2408 && local318.anInt2399 == local287.anInt2399) {
								Static22.method447(Static85.anIntArray349[local310], local53, local47, local318.aClass3_Sub3_Sub3_1);
							}
						}
						for (local114 = 0; local114 < Static104.anInt2718; local114++) {
							local365 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local114]];
							if (local365 != null && local287.anInt2408 == local365.anInt2408 && local365.anInt2399 == local287.anInt2399) {
								Static88.method1684(Static99.anIntArray387[local114], local53, local365, local47);
							}
						}
					}
					Static22.method447(local59, local53, local47, local287.aClass3_Sub3_Sub3_1);
				}
				if (local43 == 0) {
					@Pc(414) Class3_Sub3_Sub1_Sub4_Sub2 local414 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local59];
					if ((local414.anInt2408 & 0x7F) == 64 && (local414.anInt2399 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static104.anInt2724; local310++) {
							local318 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local310]];
							if (local318 != null && local318.aClass3_Sub3_Sub3_1.anInt920 == 1 && local414.anInt2408 == local318.anInt2408 && local318.anInt2399 == local414.anInt2399) {
								Static22.method447(Static85.anIntArray349[local310], local53, local47, local318.aClass3_Sub3_Sub3_1);
							}
						}
						for (local114 = 0; local114 < Static104.anInt2718; local114++) {
							local365 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local114]];
							if (local365 != null && local414 != local365 && local414.anInt2408 == local365.anInt2408 && local414.anInt2399 == local365.anInt2399) {
								Static88.method1684(Static99.anIntArray387[local114], local53, local365, local47);
							}
						}
					}
					Static88.method1684(local59, local53, local414, local47);
				}
				if (local43 == 3) {
					@Pc(544) Class28 local544 = Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local47][local53];
					if (local544 != null) {
						for (@Pc(551) Class3_Sub3_Sub1_Sub5 local551 = (Class3_Sub3_Sub1_Sub5) local544.method886(); local551 != null; local551 = (Class3_Sub3_Sub1_Sub5) local544.method877()) {
							@Pc(558) Class3_Sub3_Sub9 local558 = Static37.method696(local551.anInt1496);
							if (Static42.anInt1235 == 1) {
								Static46.method925(local47, 1, local53, local551.anInt1496, Static98.method1779(new Class27[] { Static81.aClass27_1046, Static11.aClass27_1323, local558.aClass27_869 }), Static8.aClass27_115);
							} else if (Static39.anInt964 != 1) {
								@Pc(609) Class27[] local609 = local558.aClass27Array12;
								if (Static92.aBoolean122) {
									local609 = Static8.method179(local609);
								}
								for (@Pc(621) int local621 = 4; local621 >= 0; local621--) {
									if (local609 != null && local609[local621] != null) {
										@Pc(667) byte local667 = 0;
										if (local621 == 0) {
											local667 = 54;
										}
										if (local621 == 1) {
											local667 = 45;
										}
										if (local621 == 2) {
											local667 = 44;
										}
										if (local621 == 3) {
											local667 = 21;
										}
										if (local621 == 4) {
											local667 = 14;
										}
										Static46.method925(local47, local667, local53, local551.anInt1496, Static98.method1779(new Class27[] { Static101.aClass27_1272, local558.aClass27_869 }), local609[local621]);
									} else if (local621 == 2) {
										Static46.method925(local47, 44, local53, local551.anInt1496, Static98.method1779(new Class27[] { Static101.aClass27_1272, local558.aClass27_869 }), Static1.aClass27_3);
									}
								}
								Static46.method925(local47, 1006, local53, local551.anInt1496, Static98.method1779(new Class27[] { Static101.aClass27_1272, local558.aClass27_869 }), Static36.aClass27_435);
							} else if ((Static68.anInt1748 & 0x1) == 1) {
								Static46.method925(local47, 23, local53, local551.anInt1496, Static98.method1779(new Class27[] { Static16.aClass27_189, Static11.aClass27_1323, local558.aClass27_869 }), Static10.aClass27_130);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ja;Z)V")
	public static void method940(@OriginalArg(0) Class3_Sub3_Sub1_Sub4 arg0) {
		if (arg0.anInt2402 == Static2.anInt38 || arg0.anInt2430 == -1 || arg0.anInt2388 != 0 || arg0.anInt2425 + 1 > Static16.method298(arg0.anInt2430).anIntArray383[arg0.anInt2397]) {
			@Pc(39) int local39 = arg0.anInt2381 * 128 + arg0.anInt2435 * 64;
			@Pc(45) int local45 = Static2.anInt38 - arg0.anInt2424;
			@Pc(52) int local52 = arg0.anInt2402 - arg0.anInt2424;
			@Pc(63) int local63 = arg0.anInt2407 * 128 + arg0.anInt2435 * 64;
			@Pc(73) int local73 = arg0.anInt2435 * 64 + arg0.anInt2427 * 128;
			@Pc(83) int local83 = arg0.anInt2395 * 128 + arg0.anInt2435 * 64;
			arg0.anInt2408 = (local45 * local73 + local39 * (local52 - local45)) / local52;
			arg0.anInt2399 = (local63 * (local52 - local45) + local83 * local45) / local52;
		}
		arg0.anInt2387 = 0;
		if (arg0.anInt2415 == 0) {
			arg0.anInt2422 = 1024;
		}
		if (arg0.anInt2415 == 1) {
			arg0.anInt2422 = 1536;
		}
		if (arg0.anInt2415 == 2) {
			arg0.anInt2422 = 0;
		}
		if (arg0.anInt2415 == 3) {
			arg0.anInt2422 = 512;
		}
		arg0.anInt2432 = arg0.anInt2422;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) Class3_Sub13 local11 = null;
		for (@Pc(16) Class3_Sub13 local16 = (Class3_Sub13) Static82.aClass28_10.method884(); local16 != null; local16 = (Class3_Sub13) Static82.aClass28_10.method875()) {
			if (local16.anInt2710 == arg4 && local16.anInt2725 == arg1 && local16.anInt2716 == arg6 && local16.anInt2711 == arg8) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class3_Sub13();
			local11.anInt2710 = arg4;
			local11.anInt2725 = arg1;
			local11.anInt2716 = arg6;
			local11.anInt2711 = arg8;
			Static59.method1105(local11);
			Static82.aClass28_10.method889(local11);
		}
		local11.anInt2706 = arg0;
		local11.anInt2715 = arg2;
		local11.anInt2707 = arg7;
		local11.anInt2703 = arg3;
		local11.anInt2717 = arg5;
	}
}
