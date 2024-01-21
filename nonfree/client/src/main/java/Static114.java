import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	public static int anInt2962 = -1;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "Lclient!le;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1347 = Static56.method972("Loaded update list");

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1346 = aClass5_1347;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1348 = Static56.method972("Name eingeben:");

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1349 = Static56.method972("Drop");

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1350 = aClass5_1349;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I")
	public static int method1951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg1 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method1952() {
		aClass5_1348 = null;
		aClass5_1350 = null;
		aClass45_1 = null;
		aClass5_1346 = null;
		aClass5_1349 = null;
		aClass5_1347 = null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method1953() {
		@Pc(7) int local7 = -1;
		if (Static14.anInt2886 == 0 && !Static100.aBoolean124) {
			Static4.method129(Static100.anInt2512, Static45.aClass5_603, Static49.anInt1325, Static110.aClass5_1307, 0, 33);
		}
		for (@Pc(28) int local28 = 0; local28 < Static107.anInt2781; local28++) {
			@Pc(39) int local39 = Static107.anIntArray352[local28];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local7 != local39) {
				local7 = local39;
				@Pc(143) int local143;
				if (local55 == 2 && Static73.aClass42_1.method1015(Static12.anInt480, local43, local49, local39) >= 0) {
					@Pc(80) Class3_Sub1_Sub15 local80 = Static72.method1211(local61);
					if (local80.anIntArray263 != null) {
						local80 = local80.method1522();
					}
					if (local80 == null) {
						continue;
					}
					if (Static14.anInt2886 == 1) {
						Static4.method129(local43, Static68.aClass5_762, local49, Static75.method1261(new Class5[] { Static85.aClass5_967, Static38.aClass5_480, local80.aClass5_1058 }), local39, 45);
					} else if (!Static100.aBoolean124) {
						@Pc(133) Class5[] local133 = local80.aClass5Array16;
						if (Static74.aBoolean90) {
							local133 = Static22.method439(local133);
						}
						if (local133 != null) {
							for (local143 = 4; local143 >= 0; local143--) {
								if (local133[local143] != null) {
									@Pc(155) short local155 = 0;
									if (local143 == 0) {
										local155 = 55;
									}
									if (local143 == 1) {
										local155 = 57;
									}
									if (local143 == 2) {
										local155 = 43;
									}
									if (local143 == 3) {
										local155 = 6;
									}
									if (local143 == 4) {
										local155 = 1005;
									}
									Static4.method129(local43, local133[local143], local49, Static75.method1261(new Class5[] { Static4.aClass5_103, local80.aClass5_1058 }), local39, local155);
								}
							}
						}
						Static4.method129(local43, Static21.aClass5_310, local49, Static75.method1261(new Class5[] { Static4.aClass5_103, local80.aClass5_1058 }), local80.anInt2318 << 14, 1006);
					} else if ((Static62.anInt1672 & 0x4) == 4) {
						Static4.method129(local43, Static16.aClass5_274, local49, Static75.method1261(new Class5[] { Static15.aClass5_210, Static38.aClass5_480, local80.aClass5_1058 }), local39, 12);
					}
				}
				@Pc(308) int local308;
				@Pc(316) Class3_Sub1_Sub1_Sub1_Sub1 local316;
				@Pc(365) Class3_Sub1_Sub1_Sub1_Sub2 local365;
				if (local55 == 1) {
					@Pc(283) Class3_Sub1_Sub1_Sub1_Sub1 local283 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local61];
					if (local283.aClass3_Sub1_Sub13_1.anInt2203 == 1 && (local283.anInt1567 & 0x7F) == 64 && (local283.anInt1543 & 0x7F) == 64) {
						for (local308 = 0; local308 < Static115.anInt2977; local308++) {
							local316 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local308]];
							if (local316 != null && local316 != local283 && local316.aClass3_Sub1_Sub13_1.anInt2203 == 1 && local283.anInt1567 == local316.anInt1567 && local283.anInt1543 == local316.anInt1543) {
								Static94.method386(local43, Static36.anIntArray320[local308], local49, local316.aClass3_Sub1_Sub13_1);
							}
						}
						for (local143 = 0; local143 < Static38.anInt1056; local143++) {
							local365 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local143]];
							if (local365 != null && local365.anInt1567 == local283.anInt1567 && local365.anInt1543 == local283.anInt1543) {
								Static27.method547(local43, Static1.anIntArray6[local143], local49, local365);
							}
						}
					}
					Static94.method386(local43, local61, local49, local283.aClass3_Sub1_Sub13_1);
				}
				if (local55 == 0) {
					@Pc(409) Class3_Sub1_Sub1_Sub1_Sub2 local409 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local61];
					if ((local409.anInt1567 & 0x7F) == 64 && (local409.anInt1543 & 0x7F) == 64) {
						for (local308 = 0; local308 < Static115.anInt2977; local308++) {
							local316 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local308]];
							if (local316 != null && local316.aClass3_Sub1_Sub13_1.anInt2203 == 1 && local316.anInt1567 == local409.anInt1567 && local316.anInt1543 == local409.anInt1543) {
								Static94.method386(local43, Static36.anIntArray320[local308], local49, local316.aClass3_Sub1_Sub13_1);
							}
						}
						for (local143 = 0; local143 < Static38.anInt1056; local143++) {
							local365 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local143]];
							if (local365 != null && local365 != local409 && local365.anInt1567 == local409.anInt1567 && local365.anInt1543 == local409.anInt1543) {
								Static27.method547(local43, Static1.anIntArray6[local143], local49, local365);
							}
						}
					}
					Static27.method547(local43, local61, local49, local409);
				}
				if (local55 == 3) {
					@Pc(537) Class51 local537 = Static24.aClass51ArrayArrayArray1[Static12.anInt480][local43][local49];
					if (local537 != null) {
						for (@Pc(546) Class3_Sub1_Sub1_Sub4 local546 = (Class3_Sub1_Sub1_Sub4) local537.method1309(); local546 != null; local546 = (Class3_Sub1_Sub1_Sub4) local537.method1304()) {
							@Pc(555) Class3_Sub1_Sub3 local555 = Static37.method694(local546.anInt1194);
							if (Static14.anInt2886 == 1) {
								Static4.method129(local43, Static68.aClass5_762, local49, Static75.method1261(new Class5[] { Static85.aClass5_967, Static23.aClass5_318, local555.aClass5_300 }), local546.anInt1194, 4);
							} else if (!Static100.aBoolean124) {
								@Pc(605) Class5[] local605 = local555.aClass5Array5;
								if (Static74.aBoolean90) {
									local605 = Static22.method439(local605);
								}
								for (@Pc(613) int local613 = 4; local613 >= 0; local613--) {
									if (local605 != null && local605[local613] != null) {
										@Pc(659) byte local659 = 0;
										if (local613 == 0) {
											local659 = 40;
										}
										if (local613 == 1) {
											local659 = 38;
										}
										if (local613 == 2) {
											local659 = 34;
										}
										if (local613 == 3) {
											local659 = 11;
										}
										if (local613 == 4) {
											local659 = 3;
										}
										Static4.method129(local43, local605[local613], local49, Static75.method1261(new Class5[] { Static95.aClass5_1120, local555.aClass5_300 }), local546.anInt1194, local659);
									} else if (local613 == 2) {
										Static4.method129(local43, Static34.aClass5_454, local49, Static75.method1261(new Class5[] { Static95.aClass5_1120, local555.aClass5_300 }), local546.anInt1194, 34);
									}
								}
								Static4.method129(local43, Static21.aClass5_310, local49, Static75.method1261(new Class5[] { Static95.aClass5_1120, local555.aClass5_300 }), local546.anInt1194, 1003);
							} else if ((Static62.anInt1672 & 0x1) == 1) {
								Static4.method129(local43, Static16.aClass5_274, local49, Static75.method1261(new Class5[] { Static15.aClass5_210, Static23.aClass5_318, local555.aClass5_300 }), local546.anInt1194, 27);
							}
						}
					}
				}
			}
		}
	}
}
