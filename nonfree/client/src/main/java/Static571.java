import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[S")
	private static final short[] aShortArray144 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[S")
	private static final short[] aShortArray145 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "[S")
	private static final short[] aShortArray146 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray18 = new short[][] { aShortArray144, aShortArray145, aShortArray146 };

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray18 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method8266() {
		if (!Static253.aBoolean362) {
			Static515.aBoolean645 = Static297.anInt8681 != -1 && Static297.anInt8681 <= Static285.anInt7798 || Static190.anInt3576 < Static285.anInt7798 * 16 + (Static53.aBoolean52 ? 26 : 22);
		}
		Static150.aClass216_28.method5454();
		Static139.aClass216_21.method5454();
		@Pc(53) int local53;
		for (@Pc(48) Class3_Sub7_Sub19 local48 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local48 != null; local48 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
			local53 = local48.anInt8564;
			if (local53 < 1000) {
				local48.method8682();
				if (local53 == 58 || local53 == 20 || local53 == 22 || local53 == 46 || local53 == 15 || local53 == 60 || local53 == 5) {
					Static139.aClass216_21.method5449(local48);
				} else {
					Static150.aClass216_28.method5449(local48);
				}
			}
		}
		Static150.aClass216_28.method5451(Static544.aClass216_66);
		Static139.aClass216_21.method5451(Static544.aClass216_66);
		if (Static285.anInt7798 > 1) {
			if (Static327.aBoolean456 && Static476.aClass62_2.method1421(81) && Static285.anInt7798 > 2) {
				Static165.aClass3_Sub7_Sub19_14 = (Class3_Sub7_Sub19) Static544.aClass216_66.aClass3_185.aClass3_299.aClass3_299;
			} else {
				Static165.aClass3_Sub7_Sub19_14 = (Class3_Sub7_Sub19) Static544.aClass216_66.aClass3_185.aClass3_299;
			}
			Static349.aClass3_Sub7_Sub19_36 = (Class3_Sub7_Sub19) Static544.aClass216_66.aClass3_185.aClass3_299;
		} else {
			Static349.aClass3_Sub7_Sub19_36 = null;
			Static165.aClass3_Sub7_Sub19_14 = null;
		}
		local53 = -1;
		@Pc(157) Class3_Sub21 local157 = (Class3_Sub21) Static172.aClass216_29.method5457();
		if (local157 != null) {
			local53 = local157.method5059();
		}
		if (!Static253.aBoolean362) {
			if (local53 == 0 && (Static646.anInt4678 == 1 && Static285.anInt7798 > 2 || Static40.method735())) {
				local53 = 2;
			}
			if (local53 == 2 && Static285.anInt7798 > 0 && local157 != null) {
				if (Static429.aClass344_9 == null && Static348.anInt6494 == 0) {
					Static445.method6663(local157.method5064(), local157.method5060());
				} else {
					Static543.anInt9105 = 2;
				}
			}
			if (local53 == 0) {
				if (Static165.aClass3_Sub7_Sub19_14 != null) {
					Static424.method6723();
				} else if (Static425.aBoolean536) {
					Static409.method6364();
				}
			}
			if (Static429.aClass344_9 != null || Static348.anInt6494 != 0) {
				return;
			}
			Static543.anInt9105 = 0;
			Static445.aClass3_Sub7_Sub19_30 = null;
			return;
		}
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(264) int local264;
		@Pc(266) int local266;
		if (local53 == -1) {
			local172 = Static281.aClass49_1.method2426();
			local176 = Static281.aClass49_1.method2429();
			@Pc(178) boolean local178 = false;
			if (Static254.aClass3_Sub7_Sub13_2 != null) {
				if (local172 >= Static641.anInt10142 - 10 && Static386.anInt8229 + Static641.anInt10142 + 10 >= local172 && local176 >= Static97.anInt1966 - 10 && Static231.anInt4645 + Static97.anInt1966 + 10 >= local176) {
					local178 = true;
				} else {
					Static525.method7636();
				}
			}
			if (!local178) {
				if (local172 < Static491.anInt8355 - 10 || local172 > Static491.anInt8355 + Static415.anInt7312 + 10 || Static388.anInt6963 - 10 > local176 || Static355.anInt10008 + Static388.anInt6963 + 10 < local176) {
					Static303.method7247();
				} else if (Static515.aBoolean645) {
					local264 = -1;
					local266 = -1;
					@Pc(280) int local280;
					for (@Pc(268) int local268 = 0; local268 < Static334.anInt6266; local268++) {
						if (Static53.aBoolean52) {
							local280 = Static388.anInt6963 + local268 * 16 + 33;
							if (local280 - 13 < local176 && local280 + 4 > local176) {
								local266 = local280 - 13;
								local264 = local268;
								break;
							}
						} else {
							local280 = Static388.anInt6963 + local268 * 16 + 31;
							if (local280 - 13 < local176 && local280 + 3 > local176) {
								local266 = local280 - 13;
								local264 = local268;
								break;
							}
						}
					}
					if (local264 != -1) {
						local280 = 0;
						@Pc(347) Class271 local347 = new Class271(Static561.aClass363_53);
						for (@Pc(352) Class3_Sub7_Sub13 local352 = (Class3_Sub7_Sub13) local347.method6640(); local352 != null; local352 = (Class3_Sub7_Sub13) local347.method6644()) {
							if (local280 == local264) {
								if (local352.anInt4660 > 1) {
									Static224.method3862(local176, local266, local352);
								}
								break;
							}
							local280++;
						}
					}
				}
			}
		}
		if (local53 != 0) {
			return;
		}
		local172 = local157.method5064();
		local176 = local157.method5060();
		@Pc(448) int local448;
		@Pc(646) Class271 local646;
		@Pc(541) Class3_Sub7_Sub19 local541;
		if (Static254.aClass3_Sub7_Sub13_2 != null && local172 >= Static641.anInt10142 && Static386.anInt8229 + Static641.anInt10142 >= local172 && Static97.anInt1966 <= local176 && local176 <= Static231.anInt4645 + Static97.anInt1966) {
			local448 = -1;
			for (local264 = 0; local264 < Static254.aClass3_Sub7_Sub13_2.anInt4660; local264++) {
				if (Static53.aBoolean52) {
					local266 = Static97.anInt1966 + local264 * 16 + 33;
					if (local176 > local266 - 13 && local176 < local266 + 4) {
						local448 = local264;
					}
				} else {
					local266 = local264 * 16 + Static97.anInt1966 + 31;
					if (local176 > local266 - 13 && local176 < local266 + 3) {
						local448 = local264;
					}
				}
			}
			if (local448 != -1) {
				local266 = 0;
				local646 = new Class271(Static254.aClass3_Sub7_Sub13_2.aClass363_21);
				for (local541 = (Class3_Sub7_Sub19) local646.method6640(); local541 != null; local541 = (Class3_Sub7_Sub19) local646.method6644()) {
					if (local448 == local266) {
						Static353.method5666(local541, local172, local176);
						break;
					}
					local266++;
				}
			}
			Static303.method7247();
			return;
		}
		if (local172 < Static491.anInt8355 || Static491.anInt8355 + Static415.anInt7312 < local172 || Static388.anInt6963 > local176 || Static388.anInt6963 + Static355.anInt10008 < local176) {
			return;
		}
		if (!Static515.aBoolean645) {
			local448 = -1;
			for (local264 = 0; local264 < Static285.anInt7798; local264++) {
				if (Static53.aBoolean52) {
					local266 = Static388.anInt6963 + (Static285.anInt7798 - local264 - 1) * 16 + 33;
					if (local176 > local266 - 13 && local176 < local266 + 4) {
						local448 = local264;
					}
				} else {
					local266 = (Static285.anInt7798 - local264 - 1) * 16 + Static388.anInt6963 + 31;
					if (local266 - 13 < local176 && local176 < local266 + 3) {
						local448 = local264;
					}
				}
			}
			if (local448 != -1) {
				local266 = 0;
				@Pc(536) Class383 local536 = new Class383(Static544.aClass216_66);
				for (local541 = (Class3_Sub7_Sub19) local536.method8654(); local541 != null; local541 = (Class3_Sub7_Sub19) local536.method8657()) {
					if (local448 == local266) {
						Static353.method5666(local541, local172, local176);
						break;
					}
					local266++;
				}
			}
			Static303.method7247();
			return;
		}
		local448 = -1;
		for (local264 = 0; local264 < Static334.anInt6266; local264++) {
			if (Static53.aBoolean52) {
				local266 = Static388.anInt6963 + local264 * 16 + 33;
				if (local266 - 13 < local176 && local266 + 4 > local176) {
					local448 = local264;
					break;
				}
			} else {
				local266 = local264 * 16 + Static388.anInt6963 + 31;
				if (local266 - 13 < local176 && local266 + 3 > local176) {
					local448 = local264;
					break;
				}
			}
		}
		if (local448 == -1) {
			return;
		}
		local266 = 0;
		local646 = new Class271(Static561.aClass363_53);
		for (@Pc(651) Class3_Sub7_Sub13 local651 = (Class3_Sub7_Sub13) local646.method6640(); local651 != null; local651 = (Class3_Sub7_Sub13) local646.method6644()) {
			if (local266 == local448) {
				Static353.method5666((Class3_Sub7_Sub19) local651.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63, local172, local176);
				Static303.method7247();
				return;
			}
			local266++;
		}
		return;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[[[Lclient!ve;IZ)Z")
	public static boolean method8267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class351[][][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static609.anInt9804 & 0xFF);
		if (Static171.aByteArrayArrayArray10[Static65.anInt1298][arg0][arg2] == local14) {
			return false;
		} else if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static290.anIntArray303[0] = arg0;
			@Pc(57) int local57 = local48 + 1;
			Static427.anIntArray445[0] = arg2;
			Static171.aByteArrayArrayArray10[Static65.anInt1298][arg0][arg2] = local14;
			while (local57 != local50) {
				@Pc(75) int local75 = Static290.anIntArray303[local50] & 0xFFFF;
				@Pc(83) int local83 = Static290.anIntArray303[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static290.anIntArray303[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static427.anIntArray445[local50] & 0xFFFF;
				@Pc(105) int local105 = Static427.anIntArray445[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(136) int local136;
				@Pc(175) int local175;
				@Pc(217) int local217;
				if (arg3 != null) {
					label237: for (local136 = Static65.anInt1298 + 1; local136 <= 3; local136++) {
						if (arg3[local136] != null && (Static546.aByteArrayArrayArray18[local136][local75][local97] & 0x8) == 0) {
							@Pc(312) Class9_Sub2_Sub1 local312;
							@Pc(322) int local322;
							@Pc(301) Class351 local301;
							@Pc(307) Class105 local307;
							if (local113 && arg3[local136][local75][local97] != null) {
								if (arg3[local136][local75][local97].aClass9_Sub2_Sub3_2 != null) {
									local175 = Static487.method7158(local83);
									if (local175 == arg3[local136][local75][local97].aClass9_Sub2_Sub3_2.aShort83 || arg3[local136][local75][local97].aClass9_Sub2_Sub3_1 != null && arg3[local136][local75][local97].aClass9_Sub2_Sub3_1.aShort83 == local175) {
										continue;
									}
									if (local91 != 0) {
										local217 = Static487.method7158(local91);
										if (arg3[local136][local75][local97].aClass9_Sub2_Sub3_2.aShort83 == local217 || arg3[local136][local75][local97].aClass9_Sub2_Sub3_1 != null && arg3[local136][local75][local97].aClass9_Sub2_Sub3_1.aShort83 == local217) {
											continue;
										}
									}
									if (local105 != 0) {
										local217 = Static487.method7158(local105);
										if (local217 == arg3[local136][local75][local97].aClass9_Sub2_Sub3_2.aShort83 || arg3[local136][local75][local97].aClass9_Sub2_Sub3_1 != null && arg3[local136][local75][local97].aClass9_Sub2_Sub3_1.aShort83 == local217) {
											continue;
										}
									}
								}
								local301 = arg3[local136][local75][local97];
								if (local301.aClass105_3 != null) {
									for (local307 = local301.aClass105_3; local307 != null; local307 = local307.aClass105_1) {
										local312 = local307.aClass9_Sub2_Sub1_1;
										if (local312 instanceof Interface2) {
											@Pc(318) Interface2 local318 = (Interface2) local312;
											local322 = local318.method7495();
											if (local322 == 21) {
												local322 = 19;
											}
											@Pc(335) int local335 = local318.method7496();
											@Pc(341) int local341 = local322 | local335 << 6;
											if (local341 == local83 || local91 != 0 && local91 == local341 || local105 != 0 && local105 == local341) {
												continue label237;
											}
										}
									}
								}
							}
							local301 = arg3[local136][local75][local97];
							if (local301 != null && local301.aClass105_3 != null) {
								for (local307 = local301.aClass105_3; local307 != null; local307 = local307.aClass105_1) {
									local312 = local307.aClass9_Sub2_Sub1_1;
									if (local312.aShort127 != local312.aShort126 || local312.aShort125 != local312.aShort124) {
										for (@Pc(406) int local406 = local312.aShort126; local406 <= local312.aShort127; local406++) {
											for (local322 = local312.aShort124; local322 <= local312.aShort125; local322++) {
												Static171.aByteArrayArrayArray10[local136][local406][local322] = local14;
											}
										}
									}
								}
							}
							Static171.aByteArrayArrayArray10[local136][local75][local97] = local14;
							local130 = true;
						}
					}
				}
				if (local130) {
					local136 = Static637.aClass91Array4[Static65.anInt1298 + 1].method7724(local97, local75);
					if (local136 > Static134.anIntArray177[arg1]) {
						Static134.anIntArray177[arg1] = local136;
					}
					local175 = local75 << 9;
					local217 = local97 << 9;
					if (local175 < Static76.anIntArray107[arg1]) {
						Static76.anIntArray107[arg1] = local175;
					} else if (Static91.anIntArray118[arg1] < local175) {
						Static91.anIntArray118[arg1] = local175;
					}
					if (local217 < Static313.anIntArray333[arg1]) {
						Static313.anIntArray333[arg1] = local217;
					} else if (local217 > Static217.anIntArray244[arg1]) {
						Static217.anIntArray244[arg1] = local217;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97]) {
						Static290.anIntArray303[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static427.anIntArray445[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97] = local14;
					}
					@Pc(582) int local582 = ~Static24.anInt345;
					local97++;
					if (local582 < ~local97) {
						if (local75 - 1 >= 0 && local14 != Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97] && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75][local97] & 0x4) == 0 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static290.anIntArray303[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static427.anIntArray445[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97] = local14;
						}
						if (Static171.aByteArrayArrayArray10[Static65.anInt1298][local75][local97] != local14) {
							Static290.anIntArray303[local57] = local75 | 0x520000 | 0x13000000;
							Static427.anIntArray445[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75][local97] = local14;
						}
						if (Static399.anInt7121 > local75 + 1 && Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] != local14 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75][local97] & 0x4) == 0 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static290.anIntArray303[local57] = local75 + 1 | 0x92000000 | 0x520000;
							Static427.anIntArray445[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] = local14;
						}
					}
					local97--;
					if (Static399.anInt7121 > local75 + 1 && Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] != local14) {
						Static290.anIntArray303[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static427.anIntArray445[local57] = local97 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] = local14;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local14 != Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97] && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75][local97] & 0x4) == 0 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static290.anIntArray303[local57] = 0x12000000 | 0xD20000 | local75 - 1;
							Static427.anIntArray445[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 - 1][local97] = local14;
						}
						if (Static171.aByteArrayArrayArray10[Static65.anInt1298][local75][local97] != local14) {
							Static290.anIntArray303[local57] = local75 | 0x93000000 | 0xD20000;
							Static427.anIntArray445[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75][local97] = local14;
						}
						if (local75 + 1 < Static399.anInt7121 && local14 != Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75][local97] & 0x4) == 0 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static290.anIntArray303[local57] = local75 + 1 | 0xD2000000 | 0x920000;
							Static427.anIntArray445[local57] = local97 | 0x930000;
							Static171.aByteArrayArrayArray10[Static65.anInt1298][local75 + 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static134.anIntArray177[arg1] != -1000000) {
				Static134.anIntArray177[arg1] += 40;
				Static76.anIntArray107[arg1] -= 512;
				Static91.anIntArray118[arg1] += 512;
				Static217.anIntArray244[arg1] += 512;
				Static313.anIntArray333[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Z")
	public static boolean method8268() {
		if (Static543.aBoolean676) {
			try {
				if ((Boolean) Static652.method1818("showingVideoAd", Static303.anApplet3)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	public static void method8271() {
		@Pc(7) int local7 = 0;
		if (Static32.aClass3_Sub41_3 != null) {
			local7 = Static32.aClass3_Sub41_3.aClass7_Sub20_1.method6317();
		}
		@Pc(28) int local28;
		@Pc(42) int local42;
		if (local7 == 2) {
			local28 = Static136.anInt2830 <= 800 ? Static136.anInt2830 : 800;
			Static294.anInt5875 = (Static136.anInt2830 - local28) / 2;
			local42 = Static155.anInt3159 <= 600 ? Static155.anInt3159 : 600;
			Static330.anInt6254 = local28;
			Static303.anInt8406 = 0;
			Static190.anInt3576 = local42;
		} else if (local7 == 1) {
			local28 = Static136.anInt2830 > 1024 ? 1024 : Static136.anInt2830;
			Static294.anInt5875 = (Static136.anInt2830 - local28) / 2;
			Static330.anInt6254 = local28;
			local42 = Static155.anInt3159 <= 768 ? Static155.anInt3159 : 768;
			Static303.anInt8406 = 0;
			Static190.anInt3576 = local42;
		} else {
			Static294.anInt5875 = 0;
			Static303.anInt8406 = 0;
			Static330.anInt6254 = Static136.anInt2830;
			Static190.anInt3576 = Static155.anInt3159;
		}
	}
}
