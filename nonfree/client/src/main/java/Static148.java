import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "Lclient!ud;")
	public static Class199 aClass199_4;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public static int anInt4857 = -1;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Loaded wordpack";

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_75 = new Class154(64);

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public static int anInt4861 = 0;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString177 = "Hidden";

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!or;Lclient!e;)V")
	public static void method3991(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class57 arg1) {
		if (!arg1.aBoolean118) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort33;
		@Pc(9) short local9 = arg1.aShort34;
		@Pc(12) byte local12 = arg1.aByte32;
		@Pc(15) byte local15 = arg1.aByte31;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class57[][] local31 = Static18.aClass57ArrayArrayArray1[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static5.aClass26Array1 == Static307.aClass26Array3) {
			local40 = Static170.anIntArrayArray37[local6][local9];
			Static84.aClass92_1.method4493(Static310.aClass26Array4[0].method4990(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static84.aClass92_1.method4539(3000.0F, local58 * 1.5F);
		@Pc(621) Class17_Sub2 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class57 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class17_Sub2 local382;
		@Pc(413) int local413;
		@Pc(416) Class2_Sub4 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean117) {
			if (Static282.aBoolean503) {
				if (local12 > 0) {
					local91 = Static18.aClass57ArrayArrayArray1[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean118) {
						return;
					}
				}
				if (local6 <= Static307.anInt3770 && local6 > Static151.anInt3337) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean118 && (local91.aBoolean117 || (arg1.aByte30 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static307.anInt3770 && local6 < Static118.anInt2543 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean118 && (local91.aBoolean117 || (arg1.aByte30 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static178.anInt6542 && local9 > Static349.anInt6795) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean118 && (local91.aBoolean117 || (arg1.aByte30 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static178.anInt6542 && local9 < Static259.anInt5346 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean118 && (local91.aBoolean117 || (arg1.aByte30 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static282.aBoolean503 = true;
			}
			arg1.aBoolean117 = false;
			if (arg1.aClass57_1 != null) {
				local91 = arg1.aClass57_1;
				Static84.aClass92_1.method4539(3000.0F, (201.5F - (float) (local91.aByte31 + 1) * 50.0F) * 1.5F);
				if (!Static284.method4849(local91.aByte31, local6, local9)) {
					Static307.aClass26Array3[local91.aByte31].method5001(local6, local9);
				}
				@Pc(254) Class2_Sub4 local254 = local91.aClass2_Sub4_1;
				if (local254 != null) {
					if (Static147.aBoolean277) {
						if ((local254.anInt3996 & arg1.aShort32) == 0) {
							Static144.method2828(arg0, local12, local6, local9);
						} else {
							Static355.method5719(arg0, local254.anInt3996, local15, local6, local9);
						}
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local254.method5413(Static84.aClass92_1);
				}
				for (@Pc(291) Class95 local291 = local91.aClass95_2; local291 != null; local291 = local291.aClass95_3) {
					@Pc(295) Class2_Sub2 local295 = local291.aClass2_Sub2_1;
					if (local295 != null) {
						if (Static147.aBoolean277) {
							Static144.method2828(arg0, local12, local6, local9);
							Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
						}
						local295.method5413(Static84.aClass92_1);
					}
				}
				Static84.aClass92_1.method4539(3000.0F, local58 * 1.5F);
			}
			local335 = !Static284.method4849(local15, local6, local9);
			if (local335) {
				Static307.aClass26Array3[local15].method5001(local6, local9);
				@Pc(346) Class2_Sub5 local346 = arg1.aClass2_Sub5_1;
				if (local346 != null && local346.aBoolean490) {
					if (local346.aBoolean491) {
						Static84.aClass92_1.method4539(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local382 = local346.method5413(Static84.aClass92_1);
					if (local382 != null) {
						local382.aClass2_1 = local346;
						local382.anInt1285 = local12;
						local382.anInt1287 = local6;
						local382.anInt1284 = local9;
						Static315.aClass204_4.method5365(local382);
					}
					if (local346.aBoolean491) {
						Static84.aClass92_1.method4539(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass2_Sub4_1;
			@Pc(419) Class2_Sub1 local419 = arg1.aClass2_Sub1_1;
			if (local416 != null || local419 != null) {
				if (Static307.anInt3770 == local6) {
					local411++;
				} else if (Static307.anInt3770 < local6) {
					local411 += 2;
				}
				if (Static178.anInt6542 == local9) {
					local411 += 3;
				} else if (Static178.anInt6542 > local9) {
					local411 += 6;
				}
				local413 = Static287.anIntArray484[local411];
				arg1.aShort32 = Static123.aShortArray52[local411];
			}
			if (local416 != null) {
				if ((local416.anInt3996 & Static287.anIntArray485[local411]) == 0) {
					arg1.aByte27 = 0;
				} else if (local416.anInt3996 == 16) {
					arg1.aByte27 = 3;
					arg1.aByte26 = Static249.aByteArray77[local411];
					arg1.aByte28 = (byte) (3 - arg1.aByte26);
				} else if (local416.anInt3996 == 32) {
					arg1.aByte27 = 6;
					arg1.aByte26 = Static110.aByteArray33[local411];
					arg1.aByte28 = (byte) (6 - arg1.aByte26);
				} else if (local416.anInt3996 == 64) {
					arg1.aByte27 = 12;
					arg1.aByte26 = Static215.aByteArray55[local411];
					arg1.aByte28 = (byte) (12 - arg1.aByte26);
				} else {
					arg1.aByte27 = 9;
					arg1.aByte26 = Static65.aByteArray23[local411];
					arg1.aByte28 = (byte) (9 - arg1.aByte26);
				}
				if ((local416.anInt3996 & local413) != 0 && !Static289.method4936(local15, local6, local9, local416.anInt3996)) {
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					@Pc(568) Class17_Sub2 local568 = local416.method5413(Static84.aClass92_1);
					if (local568 != null) {
						local568.aClass2_1 = local416;
						local568.anInt1285 = local12;
						local568.anInt1287 = local6;
						local568.anInt1284 = local9;
						Static315.aClass204_4.method5365(local568);
					}
				}
				@Pc(589) Class2_Sub4 local589 = arg1.aClass2_Sub4_2;
				if (local589 != null && (local589.anInt3996 & local413) != 0 && !Static289.method4936(local15, local6, local9, local589.anInt3996)) {
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local621 = local589.method5413(Static84.aClass92_1);
					if (local621 != null) {
						local621.aClass2_1 = local589;
						local621.anInt1285 = local12;
						local621.anInt1287 = local6;
						local621.anInt1284 = local9;
						Static315.aClass204_4.method5365(local621);
					}
				}
			}
			if (local419 != null && !Static270.method5479(local15, local6, local9, local419.method4194())) {
				@Pc(652) Class2_Sub1 local652 = arg1.aClass2_Sub1_2;
				Static84.aClass92_1.method4539(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5078 & local413) != 0) {
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local621 = local419.method5413(Static84.aClass92_1);
					if (local621 != null) {
						local621.aClass2_1 = local419;
						local621.anInt1285 = local12;
						local621.anInt1287 = local6;
						local621.anInt1284 = local9;
						Static315.aClass204_4.method5365(local621);
					}
				} else if (local419.anInt5078 == 256) {
					local711 = local419.anInt5064 - Static269.anInt5510;
					local716 = local419.anInt5077 - Static241.anInt5032;
					local719 = local419.anInt5074;
					if (local719 == 1 || local719 == 2) {
						local728 = -local711;
					} else {
						local728 = local711;
					}
					if (local719 == 2 || local719 == 3) {
						local740 = -local716;
					} else {
						local740 = local716;
					}
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					@Pc(764) Class17_Sub2 local764;
					if (local740 < local728) {
						local764 = local419.method5413(Static84.aClass92_1);
						if (local764 != null) {
							local764.aClass2_1 = local419;
							local764.anInt1285 = local12;
							local764.anInt1287 = local6;
							local764.anInt1284 = local9;
							Static315.aClass204_4.method5365(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5413(Static84.aClass92_1);
						if (local764 != null) {
							local764.aClass2_1 = local652;
							local764.anInt1285 = local12;
							local764.anInt1287 = local6;
							local764.anInt1284 = local9;
							Static315.aClass204_4.method5365(local764);
						}
					}
				}
				Static84.aClass92_1.method4539(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class2_Sub5 local819 = arg1.aClass2_Sub5_1;
				if (local819 != null && !local819.aBoolean490) {
					if (local819.aBoolean491) {
						Static84.aClass92_1.method4539(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local621 = local819.method5413(Static84.aClass92_1);
					if (local621 != null) {
						local621.aClass2_1 = local819;
						local621.anInt1285 = local12;
						local621.anInt1287 = local6;
						local621.anInt1284 = local9;
						Static315.aClass204_4.method5365(local621);
					}
					if (local819.aBoolean491) {
						Static84.aClass92_1.method4539(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class2_Sub3 local885 = arg1.aClass2_Sub3_1;
				if (local885 != null && !local885.aBoolean295) {
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					@Pc(908) Class17_Sub2 local908 = local885.method5413(Static84.aClass92_1);
					if (local908 != null) {
						local908.aClass2_1 = local885;
						local908.anInt1285 = local12;
						local908.anInt1287 = local6;
						local908.anInt1284 = local9;
						Static315.aClass204_4.method5365(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte30;
			if (local929 != 0) {
				@Pc(946) Class57 local946;
				if (local6 < Static307.anInt3770 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean118) {
						Static54.aClass80_1.method5709(local946);
					}
				}
				if (local9 < Static178.anInt6542 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean118) {
						Static54.aClass80_1.method5709(local946);
					}
				}
				if (local6 > Static307.anInt3770 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean118) {
						Static54.aClass80_1.method5709(local946);
					}
				}
				if (local9 > Static178.anInt6542 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean118) {
						Static54.aClass80_1.method5709(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class2_Sub4 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class95 local1035;
		if (arg1.aByte27 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass95_2; local1035 != null; local1035 = local1035.aClass95_3) {
				if (local1035.aClass2_Sub2_1.anInt6469 != Static189.anInt4086 && (local1035.anInt2764 & arg1.aByte27) == arg1.aByte26) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass2_Sub4_1;
				if (!Static289.method4936(local15, local6, local9, local1062.anInt3996)) {
					if (Static147.aBoolean277) {
						label687: {
							if (local1062.anInt3996 >= 16) {
								local1079 = local6 - Static307.anInt3770;
								local1083 = local9 - Static178.anInt6542;
								if (local1062.anInt3996 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static220.anInt4569) {
										Static144.method2828(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt3996 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static151.anInt3338 && local9 < Static220.anInt4569) {
										Static144.method2828(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt3996 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static151.anInt3338 && local9 > 0) {
										Static144.method2828(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt3996 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static144.method2828(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static144.method2828(arg0, local12, local6, local9);
						}
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					@Pc(1197) Class17_Sub2 local1197 = local1062.method5413(Static84.aClass92_1);
					if (local1197 != null) {
						local1197.aClass2_1 = local1062;
						local1197.anInt1285 = local12;
						local1197.anInt1287 = local6;
						local1197.anInt1284 = local9;
						Static315.aClass204_4.method5365(local1197);
					}
				}
				arg1.aByte27 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean116) {
			try {
				arg1.aBoolean116 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass95_2; local1035 != null; local1035 = local1035.aClass95_3) {
					@Pc(1233) Class2_Sub2 local1233 = local1035.aClass2_Sub2_1;
					if (local1233.anInt6469 != Static189.anInt4086) {
						for (local1079 = local1233.aShort85; local1079 <= local1233.aShort83; local1079++) {
							for (local1083 = local1233.aShort84; local1083 <= local1233.aShort82; local1083++) {
								@Pc(1251) Class57 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean117) {
									arg1.aBoolean116 = true;
									continue label630;
								}
								if (local1251.aByte27 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort85) {
										local711++;
									}
									if (local1079 < local1233.aShort83) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort84) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort82) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte27) == arg1.aByte28) {
										arg1.aBoolean116 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static307.anInt3770 - local1233.aShort85;
						local1314 = local1233.aShort83 - Static307.anInt3770;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static178.anInt6542 - local1233.aShort84;
						local716 = local1233.aShort82 - Static178.anInt6542;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass2_Sub2Array4[local40] = local1233;
						arg0.anIntArray536[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class2_Sub2 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass2_Sub2Array4[local1083];
						if (local1365.anInt6469 != Static189.anInt4086) {
							local711 = arg0.anIntArray536[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6465 - Static269.anInt5510;
								local719 = local1365.anInt6466 - Static241.anInt5032;
								local728 = arg0.aClass2_Sub2Array4[local1079].anInt6465 - Static269.anInt5510;
								local740 = arg0.aClass2_Sub2Array4[local1079].anInt6466 - Static241.anInt5032;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass2_Sub2Array4[local1079];
					local1365.anInt6469 = Static189.anInt4086;
					if (!Static215.method3726(local15, local1365.aShort85, local1365.aShort83, local1365.aShort84, local1365.aShort82, local1365.method5416())) {
						if (Static147.aBoolean277) {
							if (local1365.aByte72 == 0) {
								Static298.method5066(arg0, local12, local1365.aShort85, local1365.aShort84, local1365.aShort83, local1365.aShort82);
							} else {
								Static144.method2828(arg0, local12, local6, local9);
								local711 = local6 - Static307.anInt3770;
								local716 = local9 - Static178.anInt6542;
								if (local1365.aByte72 == 2) {
									if (local716 > -local711) {
										Static121.method2449(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static121.method2449(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static121.method2449(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static121.method2449(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
						}
						local621 = local1365.method5413(Static84.aClass92_1);
						if (local621 != null) {
							local621.aClass2_1 = local1365;
							local621.anInt1285 = local12;
							local621.anInt1287 = local1365.aShort85;
							local621.anInt1284 = local1365.aShort84;
							Static315.aClass204_4.method5365(local621);
						}
					}
					for (local711 = local1365.aShort85; local711 <= local1365.aShort83; local711++) {
						for (local716 = local1365.aShort84; local716 <= local1365.aShort82; local716++) {
							@Pc(1590) Class57 local1590 = local31[local711][local716];
							if (local1590.aByte27 != 0) {
								Static54.aClass80_1.method5709(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean118) {
								Static54.aClass80_1.method5709(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean116) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean116 = false;
			}
		}
		if (arg1.aClass88_2 != null) {
			if (arg1.aByte29 == (byte) (Static207.anInt4343 & 0xFF)) {
				@Pc(1645) Class88 local1645 = arg1.aClass88_2;
				local411 = Static307.aClass26Array3[local12].method4996(local6, local9);
				if (local12 < 3) {
					local413 = Static307.aClass26Array3[local12].method4996(local6, local9) - Static307.aClass26Array3[local12 + 1].method4996(local6, local9);
				} else {
					local413 = 1024;
				}
				Static241.aClass23_3.method5093(local21, local411, local27, arg0.anIntArray534);
				local1079 = arg0.anIntArray534[2];
				Static241.aClass23_3.method5093(local21, local411 - local413, local27, arg0.anIntArray534);
				local1083 = arg0.anIntArray534[2];
				local1314 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1314 = local1083;
					local711 = local1079;
				}
				local1314 -= 91;
				local711 += 91;
				if (local1314 < local711 - 1597) {
					local1314 = local711 - 1597;
				}
				local1645.anInt2458 = local1314;
				local1645.anInt2457 = local711;
				local1645.aBoolean208 = true;
				Static84.aClass92_1.method4437(local1645);
			} else {
				arg1.aClass88_2 = null;
			}
		}
		if (!arg1.aBoolean118) {
			return;
		}
		if (arg1.aByte27 != 0) {
			return;
		}
		if (local6 <= Static307.anInt3770 && local6 > Static151.anInt3337) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean118) {
				return;
			}
		}
		if (local6 >= Static307.anInt3770 && local6 < Static118.anInt2543 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean118) {
				return;
			}
		}
		if (local9 <= Static178.anInt6542 && local9 > Static349.anInt6795) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean118) {
				return;
			}
		}
		if (local9 >= Static178.anInt6542 && local9 < Static259.anInt5346 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean118) {
				return;
			}
		}
		arg1.aBoolean118 = false;
		Static40.anInt915--;
		@Pc(1839) Class2_Sub3 local1839 = arg1.aClass2_Sub3_1;
		if (local1839 != null && local1839.aBoolean295) {
			if (Static147.aBoolean277) {
				Static144.method2828(arg0, local12, local6, local9);
				Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
			}
			@Pc(1862) Class17_Sub2 local1862 = local1839.method5413(Static84.aClass92_1);
			if (local1862 != null) {
				local1862.aClass2_1 = local1839;
				local1862.anInt1285 = local12;
				local1862.anInt1287 = local6;
				local1862.anInt1284 = local9;
				Static315.aClass204_4.method5365(local1862);
			}
		}
		if (arg1.aShort32 != 0) {
			@Pc(1886) Class2_Sub1 local1886 = arg1.aClass2_Sub1_1;
			if (local1886 != null && !Static270.method5479(local15, local6, local9, local1886.method4194())) {
				if ((local1886.anInt5078 & arg1.aShort32) != 0) {
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					local382 = local1886.method5413(Static84.aClass92_1);
					if (local382 != null) {
						local382.aClass2_1 = local1886;
						local382.anInt1285 = local12;
						local382.anInt1287 = local6;
						local382.anInt1284 = local9;
						Static315.aClass204_4.method5365(local382);
					}
				} else if (local1886.anInt5078 == 256) {
					local413 = local1886.anInt5064 - Static269.anInt5510;
					local1079 = local1886.anInt5077 - Static241.anInt5032;
					local1083 = local1886.anInt5074;
					if (local1083 == 1 || local1083 == 2) {
						local1314 = -local413;
					} else {
						local1314 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static147.aBoolean277) {
						Static144.method2828(arg0, local12, local6, local9);
						Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
					}
					@Pc(1996) Class2_Sub1 local1996 = arg1.aClass2_Sub1_2;
					@Pc(2004) Class17_Sub2 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5413(Static84.aClass92_1);
						if (local2004 != null) {
							local2004.aClass2_1 = local1886;
							local2004.anInt1285 = local12;
							local2004.anInt1287 = local6;
							local2004.anInt1284 = local9;
							Static315.aClass204_4.method5365(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5413(Static84.aClass92_1);
						if (local2004 != null) {
							local2004.aClass2_1 = local1996;
							local2004.anInt1285 = local12;
							local2004.anInt1287 = local6;
							local2004.anInt1284 = local9;
							Static315.aClass204_4.method5365(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass2_Sub4_1;
			local416 = arg1.aClass2_Sub4_2;
			@Pc(2089) Class17_Sub2 local2089;
			if (local416 != null && (local416.anInt3996 & arg1.aShort32) != 0 && !Static289.method4936(local15, local6, local9, local416.anInt3996)) {
				if (Static147.aBoolean277) {
					Static355.method5719(arg0, local416.anInt3996, local12, local6, local9);
					Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
				}
				local2089 = local416.method5413(Static84.aClass92_1);
				if (local2089 != null) {
					local2089.aClass2_1 = local416;
					local2089.anInt1285 = local12;
					local2089.anInt1287 = local6;
					local2089.anInt1284 = local9;
					Static315.aClass204_4.method5365(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt3996 & arg1.aShort32) != 0 && !Static289.method4936(local15, local6, local9, local1062.anInt3996)) {
				if (Static147.aBoolean277) {
					Static355.method5719(arg0, local1062.anInt3996, local12, local6, local9);
					Static84.aClass92_1.method4445(arg0.anInt6714, arg0.aClass4_Sub12_Sub1Array3);
				}
				local2089 = local1062.method5413(Static84.aClass92_1);
				if (local2089 != null) {
					local2089.aClass2_1 = local1062;
					local2089.anInt1285 = local12;
					local2089.anInt1287 = local6;
					local2089.anInt1284 = local9;
					Static315.aClass204_4.method5365(local2089);
				}
			}
		}
		@Pc(2175) Class57 local2175;
		if (local12 < Static112.anInt2455 - 1) {
			local2175 = Static18.aClass57ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean118) {
				Static54.aClass80_1.method5700(local2175);
			}
		}
		if (local6 < Static307.anInt3770) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean118) {
				Static54.aClass80_1.method5709(local2175);
			}
		}
		if (local9 < Static178.anInt6542) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean118) {
				Static54.aClass80_1.method5709(local2175);
			}
		}
		if (local6 > Static307.anInt3770) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean118) {
				Static54.aClass80_1.method5709(local2175);
			}
		}
		if (local9 > Static178.anInt6542) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean118) {
				Static54.aClass80_1.method5709(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public static void method4001() {
		@Pc(1) Class154 local1 = Static310.aClass154_95;
		synchronized (Static310.aClass154_95) {
			Static310.aClass154_95.method4219();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public static void method4011(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 1);
		local8.method2034();
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
	public static int method4012(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
