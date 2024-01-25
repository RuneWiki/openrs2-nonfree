import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lv", name = "tb", descriptor = "I")
	public static int anInt3886;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!lv", name = "H", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_60 = new Class134("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!lv", name = "ob", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[200];

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!sn;)V")
	public static void method3071(@OriginalArg(1) Class225 arg0) {
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(50) int local50;
		if (Static99.aClass225_5 == arg0) {
			local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
			local19 = Static330.anInt5585 + (local12 & 0x7);
			local24 = local19 + Static209.anInt3497;
			local32 = (local12 >> 4 & 0x7) + Static298.anInt167;
			local36 = local32 + Static275.anInt4506;
			local40 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local46 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local50 = Static26.aClass2_Sub13_Sub2_1.method3555();
			if (Static201.aClass72_21 != null) {
				@Pc(67) Class2_Sub12 local67 = (Class2_Sub12) Static201.aClass72_21.method1659((long) (local36 | local24 << 14 | Static182.anInt3110 << 28));
				if (local67 != null) {
					for (@Pc(75) Class2_Sub37 local75 = (Class2_Sub37) local67.aClass156_9.method3155(); local75 != null; local75 = (Class2_Sub37) local67.aClass156_9.method3150()) {
						if (local75.anInt4632 == (local40 & 0x7FFF) && local46 == local75.anInt4634) {
							local75.method5703();
							local75.anInt4634 = local50;
							Static331.method4432(Static182.anInt3110, local24, local75, local36);
							break;
						}
					}
					if (local32 >= 0 && local19 >= 0 && local32 < Static166.anInt2852 && local19 < Static426.anInt6923) {
						Static104.method1551(local19, local32, Static182.anInt3110);
					}
				}
			}
		} else if (Static7.aClass225_1 == arg0) {
			local12 = Static26.aClass2_Sub13_Sub2_1.method3587();
			local19 = (local12 & 0x7) + Static330.anInt5585;
			local24 = Static209.anInt3497 + local19;
			local32 = (local12 >> 4 & 0x7) + Static298.anInt167;
			local36 = local32 + Static275.anInt4506;
			local40 = Static26.aClass2_Sub13_Sub2_1.method3593();
			local46 = Static26.aClass2_Sub13_Sub2_1.method3593();
			@Pc(195) boolean local195 = local32 >= 0 && local19 >= 0 && local32 < Static166.anInt2852 && Static426.anInt6923 > local19;
			if (local195 || Static268.method3635(Static276.anInt4560)) {
				Static331.method4432(Static182.anInt3110, local24, new Class2_Sub37(local40, local46), local36);
				if (local195) {
					Static104.method1551(local19, local32, Static182.anInt3110);
				}
			}
		} else if (Static251.aClass225_12 == arg0) {
			Static26.aClass2_Sub13_Sub2_1.method3580();
			local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
			local19 = (local12 >> 4 & 0x7) + Static298.anInt167;
			local24 = Static330.anInt5585 + (local12 & 0x7);
			local32 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local36 = Static26.aClass2_Sub13_Sub2_1.method3580();
			local40 = Static26.aClass2_Sub13_Sub2_1.method3563();
			@Pc(266) String local266 = Static26.aClass2_Sub13_Sub2_1.method3582();
			Static394.method5033(Static182.anInt3110, local40, local36, local32, local266, local19, local24);
		} else {
			@Pc(353) int local353;
			@Pc(328) int local328;
			if (Static115.aClass225_8 == arg0) {
				local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local19 = Static298.anInt167 + (local12 >> 4 & 0x7);
				local24 = Static330.anInt5585 + (local12 & 0x7);
				local32 = Static26.aClass2_Sub13_Sub2_1.method3555();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local40 = local36 >> 4 & 0xF;
				local46 = local36 & 0x7;
				local50 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local328 = Static26.aClass2_Sub13_Sub2_1.method3580();
				if (local19 >= 0 && local24 >= 0 && local19 < Static166.anInt2852 && Static426.anInt6923 > local24) {
					local353 = local40 + 1;
					if (Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] >= local19 - local353 && local353 + local19 >= Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] && local24 - local353 <= Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] && local24 + local353 >= Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0]) {
						Static355.method5055(local328, local46, (local24 << 8) + ((Static182.anInt3110 << 24) - (-(local19 << 16) - local40)), local50, local32);
					}
				}
			} else if (Static200.aClass225_11 == arg0) {
				local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local19 = Static298.anInt167 + (local12 >> 4 & 0x7);
				local24 = Static330.anInt5585 + (local12 & 0x7);
				local32 = Static26.aClass2_Sub13_Sub2_1.method3556();
				local36 = local32 >> 2;
				local40 = local32 & 0x3;
				local46 = Static235.anIntArray329[local36];
				if (Static268.method3635(Static276.anInt4560) || local19 >= 0 && local24 >= 0 && local19 < Static166.anInt2852 && Static426.anInt6923 > local24) {
					Static50.method694(Static182.anInt3110, local46, local24, -1, local40, local36, local19);
				}
			} else if (Static351.aClass225_15 == arg0) {
				local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local19 = (local12 >> 4 & 0x7) + Static298.anInt167;
				local24 = Static330.anInt5585 + (local12 & 0x7);
				local32 = Static26.aClass2_Sub13_Sub2_1.method3555();
				local36 = Static26.aClass2_Sub13_Sub2_1.method3580();
				local40 = Static26.aClass2_Sub13_Sub2_1.method3555();
				local46 = Static26.aClass2_Sub13_Sub2_1.method3580();
				if (local19 >= 0 && local24 >= 0 && Static166.anInt2852 > local19 && Static426.anInt6923 > local24) {
					local50 = local19 * 128 + 64;
					local328 = local24 * 128 + 64;
					local353 = Static182.anInt3110;
					if (local353 < 3 && Static372.method4855(local19, local24)) {
						local353++;
					}
					@Pc(590) Class3_Sub4_Sub3 local590 = new Class3_Sub4_Sub3(local32, local40, Static266.anInt4392, Static182.anInt3110, local353, local50, Static302.method3973(local328, local50, Static182.anInt3110) - local36, local328, local19, local19, local24, local24, local46);
					Static186.aClass156_56.method3157(new Class2_Sub5_Sub8(local590));
				}
			} else {
				@Pc(651) int local651;
				@Pc(655) int local655;
				@Pc(663) int local663;
				@Pc(669) int local669;
				if (Static128.aClass225_9 == arg0) {
					@Pc(607) byte local607 = Static26.aClass2_Sub13_Sub2_1.method3545();
					local19 = Static26.aClass2_Sub13_Sub2_1.method3593();
					local24 = Static26.aClass2_Sub13_Sub2_1.method3548();
					@Pc(619) byte local619 = Static26.aClass2_Sub13_Sub2_1.method3573();
					local36 = Static26.aClass2_Sub13_Sub2_1.method3576();
					@Pc(629) byte local629 = Static26.aClass2_Sub13_Sub2_1.method3601();
					local46 = Static26.aClass2_Sub13_Sub2_1.method3553();
					@Pc(639) byte local639 = Static26.aClass2_Sub13_Sub2_1.method3573();
					local328 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local353 = local328 >> 2;
					local651 = local328 & 0x3;
					local655 = Static26.aClass2_Sub13_Sub2_1.method3587();
					local663 = Static298.anInt167 + (local655 >> 4 & 0x7);
					local669 = (local655 & 0x7) + Static330.anInt5585;
					if (!Static82.aClass163_1.method5538()) {
						Static423.method5347(local36, local24, local46, local651, local619, local353, local669, local19, local639, local629, local663, local607, Static182.anInt3110);
					}
				} else if (arg0 == Static83.aClass225_4) {
					local12 = Static26.aClass2_Sub13_Sub2_1.method3587();
					local19 = (local12 >> 4 & 0x7) + Static298.anInt167;
					local24 = Static330.anInt5585 + (local12 & 0x7);
					local32 = Static26.aClass2_Sub13_Sub2_1.method3587();
					local36 = local32 >> 2;
					local40 = local32 & 0x3;
					local46 = Static235.anIntArray329[local36];
					local50 = Static26.aClass2_Sub13_Sub2_1.method3593();
					if (local50 == 65535) {
						local50 = -1;
					}
					Static77.method1144(Static182.anInt3110, local40, local36, local46, local19, local50, local24);
				} else if (Static21.aClass225_3 == arg0) {
					local12 = Static26.aClass2_Sub13_Sub2_1.method3555();
					local19 = Static26.aClass2_Sub13_Sub2_1.method3580();
					Static50.aClass190_1.method4218(local12).method4233(local19);
				} else {
					@Pc(802) boolean local802;
					if (arg0 == Static350.aClass225_14) {
						local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
						local19 = (local12 >> 4 & 0xF) + Static298.anInt167 * 2;
						local24 = Static330.anInt5585 * 2 + (local12 & 0xF);
						local802 = Static26.aClass2_Sub13_Sub2_1.method3580() != 0;
						local36 = local19 + Static26.aClass2_Sub13_Sub2_1.method3605();
						local40 = Static26.aClass2_Sub13_Sub2_1.method3605() + local24;
						local46 = Static26.aClass2_Sub13_Sub2_1.method3558();
						local50 = Static26.aClass2_Sub13_Sub2_1.method3558();
						local328 = Static26.aClass2_Sub13_Sub2_1.method3555();
						@Pc(836) byte local836 = Static26.aClass2_Sub13_Sub2_1.method3605();
						local651 = Static26.aClass2_Sub13_Sub2_1.method3580() * 4;
						local655 = Static26.aClass2_Sub13_Sub2_1.method3555();
						local663 = Static26.aClass2_Sub13_Sub2_1.method3555();
						local669 = Static26.aClass2_Sub13_Sub2_1.method3580();
						if (local669 == 255) {
							local669 = -1;
						}
						@Pc(869) int local869 = Static26.aClass2_Sub13_Sub2_1.method3555();
						if (local19 >= 0 && local24 >= 0 && Static166.anInt2852 * 2 > local19 && Static166.anInt2852 * 2 > local24 && local36 >= 0 && local40 >= 0 && Static426.anInt6923 * 2 > local36 && local40 < Static426.anInt6923 * 2 && local328 != 65535) {
							local36 = local36 * 64;
							local40 = local40 * 64;
							local651 <<= 0x0;
							local353 = local836 << 0;
							local19 *= 64;
							local869 <<= 0x0;
							local24 = local24 * 64;
							if (local46 != 0) {
								@Pc(953) Class3_Sub4_Sub1 local953 = null;
								@Pc(969) int local969;
								@Pc(963) int local963;
								@Pc(973) int local973;
								if (local46 < 0) {
									local963 = -local46 - 1;
									local969 = local963 >> 11 & 0xF;
									local973 = local963 & 0x7FF;
									if (local973 == Static201.anInt3383) {
										local953 = Static60.aClass3_Sub4_Sub1_Sub2_1;
									} else {
										local953 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local973];
									}
								} else {
									local963 = local46 - 1;
									local973 = local963 & 0x7FF;
									local969 = local963 >> 11 & 0xF;
									@Pc(1005) Class2_Sub28 local1005 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local973);
									if (local1005 != null) {
										local953 = local1005.aClass3_Sub4_Sub1_Sub1_1;
									}
								}
								if (local953 != null) {
									@Pc(1016) Class173 local1016 = local953.method4001();
									if (local1016.anIntArrayArray32 != null && local1016.anIntArrayArray32[local969] != null) {
										local973 = local1016.anIntArrayArray32[local969][0];
										@Pc(1038) int local1038 = local1016.anIntArrayArray32[local969][2];
										@Pc(1043) int local1043 = local953.aClass12_7.method177();
										@Pc(1047) int local1047 = Class155.anIntArray342[local1043];
										@Pc(1051) int local1051 = Class155.anIntArray341[local1043];
										@Pc(1062) int local1062 = local1047 * local1038 + local1051 * local973 >> 15;
										@Pc(1073) int local1073 = local1038 * local1051 - local973 * local1047 >> 15;
										local19 += local1062;
										local353 -= local1016.anIntArrayArray32[local969][1];
										local24 += local1073;
									}
								}
							}
							@Pc(1112) Class3_Sub4_Sub4 local1112 = new Class3_Sub4_Sub4(local328, Static182.anInt3110, local19, local24, local353, local655 + Static266.anInt4392, local663 + Static266.anInt4392, local669, local869, local50, local651, local802);
							local1112.method4607(local40, local36, Static302.method3973(local40, local36, Static182.anInt3110) - local651, Static266.anInt4392 + local655);
							Static330.aClass156_48.method3157(new Class2_Sub5_Sub10(local1112));
						}
					} else {
						@Pc(1319) Class3_Sub4_Sub4 local1319;
						if (arg0 == Static323.aClass225_7) {
							local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local19 = (local12 >> 4 & 0xF) + Static298.anInt167 * 2;
							local24 = Static330.anInt5585 * 2 + (local12 & 0xF);
							local802 = Static26.aClass2_Sub13_Sub2_1.method3580() != 0;
							local36 = Static26.aClass2_Sub13_Sub2_1.method3605() + local19;
							local40 = local24 + Static26.aClass2_Sub13_Sub2_1.method3605();
							local46 = Static26.aClass2_Sub13_Sub2_1.method3558();
							local50 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local328 = Static26.aClass2_Sub13_Sub2_1.method3580() * 4;
							local353 = Static26.aClass2_Sub13_Sub2_1.method3580() * 4;
							local651 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local655 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local663 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local669 = Static26.aClass2_Sub13_Sub2_1.method3555();
							if (local663 == 255) {
								local663 = -1;
							}
							if (local19 >= 0 && local24 >= 0 && Static166.anInt2852 * 2 > local19 && local24 < Static166.anInt2852 * 2 && local36 >= 0 && local40 >= 0 && Static426.anInt6923 * 2 > local36 && local40 < Static426.anInt6923 * 2 && local50 != 65535) {
								local36 *= 64;
								local40 *= 64;
								local669 <<= 0x0;
								local353 <<= 0x0;
								local24 *= 64;
								local19 *= 64;
								local328 <<= 0x0;
								local1319 = new Class3_Sub4_Sub4(local50, Static182.anInt3110, local19, local24, local328, Static266.anInt4392 + local651, Static266.anInt4392 + local655, local663, local669, local46, local353, local802);
								local1319.method4607(local40, local36, Static302.method3973(local40, local36, Static182.anInt3110) - local353, Static266.anInt4392 + local651);
								Static330.aClass156_48.method3157(new Class2_Sub5_Sub10(local1319));
							}
						} else if (Static364.aClass225_16 == arg0) {
							local12 = Static26.aClass2_Sub13_Sub2_1.method3587();
							local19 = (local12 & 0x7) + Static330.anInt5585;
							local24 = local19 + Static209.anInt3497;
							local32 = Static298.anInt167 + (local12 >> 4 & 0x7);
							local36 = Static275.anInt4506 + local32;
							local40 = Static26.aClass2_Sub13_Sub2_1.method3548();
							@Pc(1391) Class2_Sub12 local1391 = (Class2_Sub12) Static201.aClass72_21.method1659((long) (local36 | local24 << 14 | Static182.anInt3110 << 28));
							if (local1391 != null) {
								for (@Pc(1399) Class2_Sub37 local1399 = (Class2_Sub37) local1391.aClass156_9.method3155(); local1399 != null; local1399 = (Class2_Sub37) local1391.aClass156_9.method3150()) {
									if ((local40 & 0x7FFF) == local1399.anInt4632) {
										local1399.method5703();
										break;
									}
								}
								if (local1391.aClass156_9.method3153()) {
									local1391.method5703();
								}
								if (local32 >= 0 && local19 >= 0 && Static166.anInt2852 > local32 && Static426.anInt6923 > local19) {
									Static104.method1551(local19, local32, Static182.anInt3110);
								}
							}
						} else if (Static194.aClass225_10 == arg0) {
							local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local19 = (local12 >> 4 & 0x7) + Static298.anInt167;
							local24 = Static330.anInt5585 + (local12 & 0x7);
							local32 = Static26.aClass2_Sub13_Sub2_1.method3600();
							local36 = local32 >> 2;
							local40 = local32 & 0x3;
							local46 = Static235.anIntArray329[local36];
							local50 = Static26.aClass2_Sub13_Sub2_1.method3548();
							if (Static268.method3635(Static276.anInt4560) || local19 >= 0 && local24 >= 0 && local19 < Static166.anInt2852 && local24 < Static426.anInt6923) {
								Static50.method694(Static182.anInt3110, local46, local24, local50, local40, local36, local19);
							}
						} else if (Static289.aClass225_13 == arg0) {
							local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
							@Pc(1551) boolean local1551 = (local12 & 0x80) != 0;
							local24 = Static298.anInt167 + (local12 >> 3 & 0x7);
							local32 = (local12 & 0x7) + Static330.anInt5585;
							local36 = Static26.aClass2_Sub13_Sub2_1.method3605() + local24;
							local40 = local32 + Static26.aClass2_Sub13_Sub2_1.method3605();
							local46 = Static26.aClass2_Sub13_Sub2_1.method3558();
							local50 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local328 = Static26.aClass2_Sub13_Sub2_1.method3580() * 4;
							local353 = Static26.aClass2_Sub13_Sub2_1.method3580() * 4;
							local651 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local655 = Static26.aClass2_Sub13_Sub2_1.method3555();
							local663 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local669 = Static26.aClass2_Sub13_Sub2_1.method3555();
							if (local663 == 255) {
								local663 = -1;
							}
							if (local24 >= 0 && local32 >= 0 && local24 < Static166.anInt2852 && Static426.anInt6923 > local32 && local36 >= 0 && local40 >= 0 && local36 < Static166.anInt2852 && local40 < Static426.anInt6923 && local50 != 65535) {
								local32 = local32 * 128 + 64;
								local36 = local36 * 128 + 64;
								local40 = local40 * 128 + 64;
								local353 <<= 0x0;
								local24 = local24 * 128 + 64;
								local328 <<= 0x0;
								local669 <<= 0x0;
								local1319 = new Class3_Sub4_Sub4(local50, Static182.anInt3110, local24, local32, local328, Static266.anInt4392 + local651, local655 - -Static266.anInt4392, local663, local669, local46, local353, local1551);
								local1319.method4607(local40, local36, Static302.method3973(local40, local36, Static182.anInt3110) - local353, Static266.anInt4392 + local651);
								Static330.aClass156_48.method3157(new Class2_Sub5_Sub10(local1319));
							}
						} else if (Static378.aClass225_17 == arg0) {
							local12 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local19 = Static330.anInt5585 + (local12 & 0x7);
							local24 = local19 + Static209.anInt3497;
							local32 = Static298.anInt167 + (local12 >> 4 & 0x7);
							local36 = Static275.anInt4506 + local32;
							local40 = Static26.aClass2_Sub13_Sub2_1.method3548();
							local46 = Static26.aClass2_Sub13_Sub2_1.method3548();
							local50 = Static26.aClass2_Sub13_Sub2_1.method3555();
							if (local46 != Static201.anInt3383) {
								@Pc(1824) boolean local1824 = local32 >= 0 && local19 >= 0 && Static166.anInt2852 > local32 && Static426.anInt6923 > local19;
								if (local1824 || Static268.method3635(Static276.anInt4560)) {
									Static331.method4432(Static182.anInt3110, local24, new Class2_Sub37(local40, local50), local36);
									if (local1824) {
										Static104.method1551(local19, local32, Static182.anInt3110);
									}
								}
							}
						} else {
							Static434.method5460(null, "T3 - " + arg0);
							Static312.method4252(false);
						}
					}
				}
			}
		}
	}
}
