import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!fs;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public static int anInt2887;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Z")
	public static boolean aBoolean207 = true;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public static int anInt2882 = 0;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[I")
	public static final int[] anIntArray250 = new int[100];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2529(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static250.anInt5093 > 0) {
			local21 = Static72.aByteArrayArray7[--Static250.anInt5093];
			Static72.aByteArrayArray7[Static250.anInt5093] = null;
			return local21;
		} else if (arg0 == 5000 && Static145.anInt3275 > 0) {
			local21 = Static290.aByteArrayArray22[--Static145.anInt3275];
			Static290.aByteArrayArray22[Static145.anInt3275] = null;
			return local21;
		} else if (arg0 == 30000 && Static202.anInt4202 > 0) {
			local21 = Static68.aByteArrayArray5[--Static202.anInt4202];
			Static68.aByteArrayArray5[Static202.anInt4202] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method2531() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(71) int local71;
		@Pc(77) int local77;
		if (Static229.anInt4619 == 188) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local23 = Static15.anInt1161 + (local14 >> 4 & 0x7);
			local29 = anInt2887 + (local14 & 0x7);
			local33 = Static127.aClass4_Sub11_Sub1_3.method3401();
			local37 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local41 = Static127.aClass4_Sub11_Sub1_3.method3401();
			if (local23 >= 0 && local29 >= 0 && Static350.anInt6637 > local23 && local29 < Static105.anInt2647) {
				local71 = local23 * 128 + 64;
				local77 = local29 * 128 + 64;
				@Pc(98) Class8_Sub1_Sub1 local98 = new Class8_Sub1_Sub1(local33, local41, Static199.anInt4137, Static12.anInt267, local71, Static81.method2010(Static12.anInt267, local77, local71) - local37, local77, local23, local23, local29, local29);
				Static337.aClass116_46.method3274(new Class4_Sub4_Sub6(local98));
			}
		} else if (Static229.anInt4619 == 165) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3453();
			local23 = Static15.anInt1161 + (local14 >> 4 & 0x7);
			local29 = anInt2887 + (local14 & 0x7);
			local33 = Static127.aClass4_Sub11_Sub1_3.method3413();
			local37 = local33 >> 2;
			local41 = local33 & 0x3;
			local71 = Static217.anIntArray382[local37];
			local77 = Static127.aClass4_Sub11_Sub1_3.method3460();
			if (local23 >= 0 && local29 >= 0 && local23 < Static350.anInt6637 && Static105.anInt2647 > local29) {
				Static315.method5198(local41, local71, -1, local23, local77, 0, local37, local29, Static12.anInt267);
			}
		} else if (Static229.anInt4619 == 13) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3415();
			if (local14 == 65535) {
				local14 = -1;
			}
			local23 = Static127.aClass4_Sub11_Sub1_3.method3451();
			local29 = Static15.anInt1161 + (local23 >> 4 & 0x7);
			local33 = (local23 & 0x7) + anInt2887;
			local37 = Static127.aClass4_Sub11_Sub1_3.method3453();
			local41 = local37 >> 2;
			local71 = local37 & 0x3;
			local77 = Static217.anIntArray382[local41];
			Static291.method4883(local33, local41, local71, Static12.anInt267, local14, local77, local29);
		} else if (Static229.anInt4619 == 139) {
			Static127.aClass4_Sub11_Sub1_3.method3440();
			local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local23 = (local14 >> 4 & 0x7) + Static15.anInt1161;
			local29 = anInt2887 + (local14 & 0x7);
			local33 = Static127.aClass4_Sub11_Sub1_3.method3401();
			local37 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local41 = Static127.aClass4_Sub11_Sub1_3.method3442();
			@Pc(291) String local291 = Static127.aClass4_Sub11_Sub1_3.method3446();
			Static72.method1714(local291, local37, local23, local33, local29, local41);
		} else if (Static229.anInt4619 == 62) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3413();
			local23 = Static15.anInt1161 + (local14 >> 4 & 0x7);
			local29 = (local14 & 0x7) + anInt2887;
			local33 = Static127.aClass4_Sub11_Sub1_3.method3412();
			if (local23 >= 0 && local29 >= 0 && Static350.anInt6637 > local23 && Static105.anInt2647 > local29) {
				@Pc(360) Class4_Sub19 local360 = (Class4_Sub19) Static165.aClass43_20.method1273((long) (local23 | local29 << 14 | Static12.anInt267 << 28));
				if (local360 != null) {
					for (@Pc(370) Class4_Sub36 local370 = (Class4_Sub36) local360.aClass116_15.method3270(); local370 != null; local370 = (Class4_Sub36) local360.aClass116_15.method3272()) {
						if (local370.anInt5156 == (local33 & 0x7FFF)) {
							local370.method5687();
							break;
						}
					}
					if (local360.aClass116_15.method3277()) {
						local360.method5687();
					}
					Static253.method4460(Static12.anInt267, local23, local29);
				}
			}
		} else if (Static229.anInt4619 == 160) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3451();
			local23 = (local14 >> 4 & 0x7) + Static15.anInt1161;
			local29 = (local14 & 0x7) + anInt2887;
			local33 = Static127.aClass4_Sub11_Sub1_3.method3415();
			local37 = Static127.aClass4_Sub11_Sub1_3.method3401();
			if (local23 >= 0 && local29 >= 0 && Static350.anInt6637 > local23 && Static105.anInt2647 > local29) {
				Static337.method5433(local23, local29, new Class4_Sub36(local37, local33), Static12.anInt267);
				Static253.method4460(Static12.anInt267, local23, local29);
			}
		} else if (Static229.anInt4619 == 111) {
			local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local23 = local14 >> 2;
			local29 = local14 & 0x3;
			local33 = Static217.anIntArray382[local23];
			local37 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local41 = (local37 >> 4 & 0x7) + Static15.anInt1161;
			local71 = anInt2887 + (local37 & 0x7);
			if (local41 >= 0 && local71 >= 0 && Static350.anInt6637 > local41 && Static105.anInt2647 > local71) {
				Static315.method5198(local29, local33, -1, local41, -1, 0, local23, local71, Static12.anInt267);
			}
		} else {
			@Pc(595) int local595;
			@Pc(599) int local599;
			@Pc(603) int local603;
			@Pc(618) int local618;
			@Pc(589) int local589;
			@Pc(607) int local607;
			if (Static229.anInt4619 == 177) {
				local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
				local23 = (local14 >> 4 & 0xF) + Static15.anInt1161 * 2;
				local29 = (local14 & 0xF) + anInt2887 * 2;
				local33 = Static127.aClass4_Sub11_Sub1_3.method3426() + local23;
				local37 = local29 + Static127.aClass4_Sub11_Sub1_3.method3426();
				local41 = Static127.aClass4_Sub11_Sub1_3.method3447();
				local71 = Static127.aClass4_Sub11_Sub1_3.method3447();
				local77 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local589 = Static127.aClass4_Sub11_Sub1_3.method3426();
				local595 = Static127.aClass4_Sub11_Sub1_3.method3440() * 4;
				local599 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local603 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local607 = Static127.aClass4_Sub11_Sub1_3.method3440();
				if (local607 == 255) {
					local607 = -1;
				}
				local618 = Static127.aClass4_Sub11_Sub1_3.method3440();
				if (local23 >= 0 && local29 >= 0 && local23 < Static350.anInt6637 * 2 && local29 < Static350.anInt6637 * 2 && local33 >= 0 && local37 >= 0 && Static105.anInt2647 * 2 > local33 && local37 < Static105.anInt2647 * 2 && local77 != 65535) {
					local29 = local29 * 64;
					local37 *= 64;
					local33 *= 64;
					local23 = local23 * 64;
					if (local41 != 0) {
						@Pc(703) int local703;
						@Pc(710) Class8_Sub1_Sub2 local710;
						@Pc(693) int local693;
						@Pc(697) int local697;
						if (local41 < 0) {
							local693 = -local41 - 1;
							local697 = local693 & 0x7FF;
							local703 = local693 >> 11 & 0xF;
							if (Static64.anInt1674 == local697) {
								local710 = Static158.aClass8_Sub1_Sub2_Sub1_1;
							} else {
								local710 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local697];
							}
						} else {
							local693 = local41 - 1;
							local703 = local693 >> 11 & 0xF;
							local697 = local693 & 0x7FF;
							local710 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local697];
						}
						if (local710 != null) {
							@Pc(740) Class40 local740 = local710.method4347();
							if (local740.anIntArrayArray33 != null && local740.anIntArrayArray33[local703] != null) {
								local697 = local740.anIntArrayArray33[local703][0];
								@Pc(762) int local762 = local740.anIntArrayArray33[local703][2];
								@Pc(767) int local767 = local710.aClass106_7.method3018();
								@Pc(771) int local771 = Class118_Sub1.anIntArray314[local767];
								@Pc(775) int local775 = Class118_Sub1.anIntArray317[local767];
								@Pc(785) int local785 = local697 * local775 + local771 * local762 >> 15;
								@Pc(796) int local796 = local775 * local762 - local697 * local771 >> 15;
								local23 += local785;
								local29 += local796;
								local589 -= local740.anIntArrayArray33[local703][1];
							}
						}
					}
					@Pc(842) Class8_Sub1_Sub5 local842 = new Class8_Sub1_Sub5(local77, Static12.anInt267, local23, local29, Static81.method2010(Static12.anInt267, local29, local23) - local589, Static199.anInt4137 + local599, local603 + Static199.anInt4137, local607, local618, local71, local595);
					local842.method5636(local37, local33, Static81.method2010(Static12.anInt267, local37, local33) - local595, local599 + Static199.anInt4137);
					Static321.aClass116_41.method3274(new Class4_Sub4_Sub14(local842));
				}
			} else if (Static229.anInt4619 == 106) {
				local14 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local23 = Static127.aClass4_Sub11_Sub1_3.method3440();
				Static113.method2380(local14).method420(local23);
			} else if (Static229.anInt4619 == 155) {
				local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
				local23 = (local14 >> 4 & 0x7) + Static15.anInt1161;
				local29 = (local14 & 0x7) + anInt2887;
				local33 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local37 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local41 = Static127.aClass4_Sub11_Sub1_3.method3401();
				if (Static165.aClass43_20 != null && local23 >= 0 && local29 >= 0 && Static350.anInt6637 > local23 && Static105.anInt2647 > local29) {
					@Pc(954) Class4_Sub19 local954 = (Class4_Sub19) Static165.aClass43_20.method1273((long) (local23 | local29 << 14 | Static12.anInt267 << 28));
					if (local954 != null) {
						for (@Pc(962) Class4_Sub36 local962 = (Class4_Sub36) local954.aClass116_15.method3270(); local962 != null; local962 = (Class4_Sub36) local954.aClass116_15.method3272()) {
							if ((local33 & 0x7FFF) == local962.anInt5156 && local962.anInt5159 == local37) {
								local962.method5687();
								local962.anInt5159 = local41;
								Static337.method5433(local23, local29, local962, Static12.anInt267);
								break;
							}
						}
						Static253.method4460(Static12.anInt267, local23, local29);
					}
				}
			} else {
				@Pc(1185) Class8_Sub1_Sub5 local1185;
				if (Static229.anInt4619 == 214) {
					local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
					local23 = Static15.anInt1161 * 2 + (local14 >> 4 & 0xF);
					local29 = anInt2887 * 2 + (local14 & 0xF);
					local33 = local23 + Static127.aClass4_Sub11_Sub1_3.method3426();
					local37 = local29 + Static127.aClass4_Sub11_Sub1_3.method3426();
					local41 = Static127.aClass4_Sub11_Sub1_3.method3447();
					local71 = Static127.aClass4_Sub11_Sub1_3.method3401();
					local77 = Static127.aClass4_Sub11_Sub1_3.method3440() * 4;
					local589 = Static127.aClass4_Sub11_Sub1_3.method3440() * 4;
					local595 = Static127.aClass4_Sub11_Sub1_3.method3401();
					local599 = Static127.aClass4_Sub11_Sub1_3.method3401();
					local603 = Static127.aClass4_Sub11_Sub1_3.method3440();
					if (local603 == 255) {
						local603 = -1;
					}
					local607 = Static127.aClass4_Sub11_Sub1_3.method3440();
					if (local23 >= 0 && local29 >= 0 && local23 < Static350.anInt6637 * 2 && Static350.anInt6637 * 2 > local29 && local33 >= 0 && local37 >= 0 && Static105.anInt2647 * 2 > local33 && local37 < Static105.anInt2647 * 2 && local71 != 65535) {
						local23 *= 64;
						local37 *= 64;
						local29 = local29 * 64;
						local33 *= 64;
						local1185 = new Class8_Sub1_Sub5(local71, Static12.anInt267, local23, local29, Static81.method2010(Static12.anInt267, local29, local23) - local77, local595 - -Static199.anInt4137, local599 + Static199.anInt4137, local603, local607, local41, local589);
						local1185.method5636(local37, local33, Static81.method2010(Static12.anInt267, local37, local33) - local589, local595 - -Static199.anInt4137);
						Static321.aClass116_41.method3274(new Class4_Sub4_Sub14(local1185));
					}
				} else {
					if (Static229.anInt4619 == 67) {
						local14 = Static127.aClass4_Sub11_Sub1_3.method3451();
						local23 = local14 >> 2;
						local29 = local14 & 0x3;
						local33 = Static127.aClass4_Sub11_Sub1_3.method3460();
						@Pc(1232) byte local1232 = Static127.aClass4_Sub11_Sub1_3.method3428();
						@Pc(1236) byte local1236 = Static127.aClass4_Sub11_Sub1_3.method3409();
						local71 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local77 = Static127.aClass4_Sub11_Sub1_3.method3403();
						@Pc(1250) byte local1250 = Static127.aClass4_Sub11_Sub1_3.method3428();
						local595 = Static127.aClass4_Sub11_Sub1_3.method3453();
						local599 = (local595 >> 4 & 0x7) + Static15.anInt1161;
						local603 = (local595 & 0x7) + anInt2887;
						@Pc(1272) byte local1272 = Static127.aClass4_Sub11_Sub1_3.method3405();
						local618 = Static127.aClass4_Sub11_Sub1_3.method3415();
						if (!Static274.aClass47_9.method2712()) {
							Static226.method4050(local1250, local77, local599, local603, local33, local1236, local618, local29, local1272, local71, local1232, local23);
						}
					}
					if (Static229.anInt4619 == 55) {
						local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local23 = Static15.anInt1161 + (local14 >> 4 & 0x7);
						local29 = anInt2887 + (local14 & 0x7);
						local33 = Static127.aClass4_Sub11_Sub1_3.method3401();
						if (local33 == 65535) {
							local33 = -1;
						}
						local37 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local41 = local37 >> 4 & 0xF;
						local71 = local37 & 0x7;
						local77 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local589 = Static127.aClass4_Sub11_Sub1_3.method3440();
						if (local23 >= 0 && local29 >= 0 && Static350.anInt6637 > local23 && local29 < Static105.anInt2647) {
							local595 = local41 + 1;
							if (local23 - local595 <= Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] && Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] <= local23 + local595 && Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] >= local29 - local595 && local595 + local29 >= Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] && Static8.anInt192 != 0 && local71 > 0 && Static187.anInt3921 < 50 && local33 != -1) {
								Static318.anIntArray482[Static187.anInt3921] = local33;
								Static357.anIntArray514[Static187.anInt3921] = local71;
								Static63.anIntArray95[Static187.anInt3921] = local77;
								Static249.aClass152Array1[Static187.anInt3921] = null;
								Static276.anIntArray448[Static187.anInt3921] = (local23 << 16) - (-(local29 << 8) - local41);
								Static37.anIntArray45[Static187.anInt3921] = local589;
								Static187.anInt3921++;
							}
						}
					} else if (Static229.anInt4619 == 225) {
						local14 = Static127.aClass4_Sub11_Sub1_3.method3440();
						local23 = (local14 >> 4 & 0x7) + Static15.anInt1161;
						local29 = (local14 & 0x7) + anInt2887;
						local33 = local23 + Static127.aClass4_Sub11_Sub1_3.method3426();
						local37 = Static127.aClass4_Sub11_Sub1_3.method3426() + local29;
						local41 = Static127.aClass4_Sub11_Sub1_3.method3447();
						local71 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local77 = Static127.aClass4_Sub11_Sub1_3.method3440() * 4;
						local589 = Static127.aClass4_Sub11_Sub1_3.method3440() * 4;
						local595 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local599 = Static127.aClass4_Sub11_Sub1_3.method3401();
						local603 = Static127.aClass4_Sub11_Sub1_3.method3440();
						if (local603 == 255) {
							local603 = -1;
						}
						local607 = Static127.aClass4_Sub11_Sub1_3.method3440();
						if (local23 >= 0 && local29 >= 0 && local23 < Static350.anInt6637 && local29 < Static105.anInt2647 && local33 >= 0 && local37 >= 0 && Static350.anInt6637 > local33 && local37 < Static105.anInt2647 && local71 != 65535) {
							local29 = local29 * 128 + 64;
							local23 = local23 * 128 + 64;
							local37 = local37 * 128 + 64;
							local33 = local33 * 128 + 64;
							local1185 = new Class8_Sub1_Sub5(local71, Static12.anInt267, local23, local29, Static81.method2010(Static12.anInt267, local29, local23) - local77, local595 - -Static199.anInt4137, Static199.anInt4137 + local599, local603, local607, local41, local589);
							local1185.method5636(local37, local33, Static81.method2010(Static12.anInt267, local37, local33) - local589, local595 + Static199.anInt4137);
							Static321.aClass116_41.method3274(new Class4_Sub4_Sub14(local1185));
						}
					} else if (Static229.anInt4619 == 130) {
						local14 = Static127.aClass4_Sub11_Sub1_3.method3412();
						local23 = Static127.aClass4_Sub11_Sub1_3.method3412();
						local29 = Static127.aClass4_Sub11_Sub1_3.method3451();
						local33 = (local29 >> 4 & 0x7) + Static15.anInt1161;
						local37 = anInt2887 + (local29 & 0x7);
						local41 = Static127.aClass4_Sub11_Sub1_3.method3415();
						if (local33 >= 0 && local37 >= 0 && local33 < Static350.anInt6637 && Static105.anInt2647 > local37 && local23 != Static64.anInt1674) {
							Static337.method5433(local33, local37, new Class4_Sub36(local14, local41), Static12.anInt267);
							Static253.method4460(Static12.anInt267, local33, local37);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method2532() {
		if (Static73.aBoolean139 && Static264.aClass92_3.method2620(81) && Static105.anInt2645 > 2) {
			Static350.method5564((Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251.aClass4_251);
		} else {
			Static350.method5564((Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251);
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public static void method2533() {
		Static244.aClass198_176.method5209();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZII)V")
	public static void method2534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 7);
		local12.method4908();
		local12.anInt5705 = arg1;
	}
}
