import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!br;")
	public static Class26 aClass26_28 = new Class26(128);

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt6103 = 0;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString246 = "Select";

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!jk;Lclient!uk;)V")
	public static void method5341(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class204 arg1) {
		if (!arg1.aBoolean536) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort89;
		@Pc(9) short local9 = arg1.aShort88;
		@Pc(12) byte local12 = arg1.aByte63;
		@Pc(15) byte local15 = arg1.aByte64;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class204[][] local31 = Static138.aClass204ArrayArrayArray1[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static236.aClass41Array4 == Static7.aClass41Array1) {
			local40 = Static23.anIntArrayArray1[local6][local9];
			Static271.aClass2_12.method3281(Static288.aClass41Array5[0].method5433(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static271.aClass2_12.method3320(3000.0F, local58 * 1.5F);
		@Pc(621) Class15_Sub3 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class204 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class15_Sub3 local382;
		@Pc(413) int local413;
		@Pc(416) Class5_Sub1 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean537) {
			if (Static186.aBoolean330) {
				if (local12 > 0) {
					local91 = Static138.aClass204ArrayArrayArray1[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean536) {
						return;
					}
				}
				if (local6 <= Static199.anInt4061 && local6 > Static285.anInt5515) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean536 && (local91.aBoolean537 || (arg1.aByte61 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static199.anInt4061 && local6 < Static132.anInt2570 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean536 && (local91.aBoolean537 || (arg1.aByte61 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static268.anInt5167 && local9 > Static129.anInt2513) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean536 && (local91.aBoolean537 || (arg1.aByte61 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static268.anInt5167 && local9 < Static70.anInt1449 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean536 && (local91.aBoolean537 || (arg1.aByte61 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static186.aBoolean330 = true;
			}
			arg1.aBoolean537 = false;
			if (arg1.aClass204_1 != null) {
				local91 = arg1.aClass204_1;
				Static271.aClass2_12.method3320(3000.0F, (201.5F - (float) (local91.aByte64 + 1) * 50.0F) * 1.5F);
				if (!Static210.method3848(local91.aByte64, local6, local9)) {
					Static7.aClass41Array1[local91.aByte64].method5425(local6, local9);
				}
				@Pc(254) Class5_Sub1 local254 = local91.aClass5_Sub1_1;
				if (local254 != null) {
					if (Static244.aBoolean397) {
						if ((local254.anInt5964 & arg1.aShort87) == 0) {
							Static334.method5570(arg0, local12, local6, local9);
						} else {
							Static270.method4726(arg0, local254.anInt5964, local15, local6, local9);
						}
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local254.method5680(Static271.aClass2_12);
				}
				for (@Pc(291) Class17 local291 = local91.aClass17_3; local291 != null; local291 = local291.aClass17_1) {
					@Pc(295) Class5_Sub3 local295 = local291.aClass5_Sub3_1;
					if (local295 != null) {
						if (Static244.aBoolean397) {
							Static334.method5570(arg0, local12, local6, local9);
							Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
						}
						local295.method5680(Static271.aClass2_12);
					}
				}
				Static271.aClass2_12.method3320(3000.0F, local58 * 1.5F);
			}
			local335 = !Static210.method3848(local15, local6, local9);
			if (local335) {
				Static7.aClass41Array1[local15].method5425(local6, local9);
				@Pc(346) Class5_Sub5 local346 = arg1.aClass5_Sub5_1;
				if (local346 != null && local346.aBoolean586) {
					if (local346.aBoolean587) {
						Static271.aClass2_12.method3320(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local382 = local346.method5680(Static271.aClass2_12);
					if (local382 != null) {
						local382.aClass5_1 = local346;
						local382.anInt1118 = local12;
						local382.anInt1115 = local6;
						local382.anInt1119 = local9;
						Static46.aClass175_1.method4672(local382);
					}
					if (local346.aBoolean587) {
						Static271.aClass2_12.method3320(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass5_Sub1_1;
			@Pc(419) Class5_Sub4 local419 = arg1.aClass5_Sub4_2;
			if (local416 != null || local419 != null) {
				if (Static199.anInt4061 == local6) {
					local411++;
				} else if (Static199.anInt4061 < local6) {
					local411 += 2;
				}
				if (Static268.anInt5167 == local9) {
					local411 += 3;
				} else if (Static268.anInt5167 > local9) {
					local411 += 6;
				}
				local413 = Static183.anIntArray447[local411];
				arg1.aShort87 = Static85.aShortArray26[local411];
			}
			if (local416 != null) {
				if ((local416.anInt5964 & Static1.anIntArray12[local411]) == 0) {
					arg1.aByte59 = 0;
				} else if (local416.anInt5964 == 16) {
					arg1.aByte59 = 3;
					arg1.aByte60 = Static254.aByteArray81[local411];
					arg1.aByte65 = (byte) (3 - arg1.aByte60);
				} else if (local416.anInt5964 == 32) {
					arg1.aByte59 = 6;
					arg1.aByte60 = Static276.aByteArray86[local411];
					arg1.aByte65 = (byte) (6 - arg1.aByte60);
				} else if (local416.anInt5964 == 64) {
					arg1.aByte59 = 12;
					arg1.aByte60 = Static240.aByteArray77[local411];
					arg1.aByte65 = (byte) (12 - arg1.aByte60);
				} else {
					arg1.aByte59 = 9;
					arg1.aByte60 = Static112.aByteArray64[local411];
					arg1.aByte65 = (byte) (9 - arg1.aByte60);
				}
				if ((local416.anInt5964 & local413) != 0 && !Static294.method5055(local15, local6, local9, local416.anInt5964)) {
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					@Pc(568) Class15_Sub3 local568 = local416.method5680(Static271.aClass2_12);
					if (local568 != null) {
						local568.aClass5_1 = local416;
						local568.anInt1118 = local12;
						local568.anInt1115 = local6;
						local568.anInt1119 = local9;
						Static46.aClass175_1.method4672(local568);
					}
				}
				@Pc(589) Class5_Sub1 local589 = arg1.aClass5_Sub1_2;
				if (local589 != null && (local589.anInt5964 & local413) != 0 && !Static294.method5055(local15, local6, local9, local589.anInt5964)) {
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local621 = local589.method5680(Static271.aClass2_12);
					if (local621 != null) {
						local621.aClass5_1 = local589;
						local621.anInt1118 = local12;
						local621.anInt1115 = local6;
						local621.anInt1119 = local9;
						Static46.aClass175_1.method4672(local621);
					}
				}
			}
			if (local419 != null && !Static224.method4105(local15, local6, local9, local419.method3009())) {
				@Pc(652) Class5_Sub4 local652 = arg1.aClass5_Sub4_1;
				Static271.aClass2_12.method3320(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt3175 & local413) != 0) {
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local621 = local419.method5680(Static271.aClass2_12);
					if (local621 != null) {
						local621.aClass5_1 = local419;
						local621.anInt1118 = local12;
						local621.anInt1115 = local6;
						local621.anInt1119 = local9;
						Static46.aClass175_1.method4672(local621);
					}
				} else if (local419.anInt3175 == 256) {
					local711 = local419.anInt3172 - Static175.anInt3627;
					local716 = local419.anInt3176 - Static341.anInt2253;
					local719 = local419.anInt3181;
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
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					@Pc(764) Class15_Sub3 local764;
					if (local740 < local728) {
						local764 = local419.method5680(Static271.aClass2_12);
						if (local764 != null) {
							local764.aClass5_1 = local419;
							local764.anInt1118 = local12;
							local764.anInt1115 = local6;
							local764.anInt1119 = local9;
							Static46.aClass175_1.method4672(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5680(Static271.aClass2_12);
						if (local764 != null) {
							local764.aClass5_1 = local652;
							local764.anInt1118 = local12;
							local764.anInt1115 = local6;
							local764.anInt1119 = local9;
							Static46.aClass175_1.method4672(local764);
						}
					}
				}
				Static271.aClass2_12.method3320(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class5_Sub5 local819 = arg1.aClass5_Sub5_1;
				if (local819 != null && !local819.aBoolean586) {
					if (local819.aBoolean587) {
						Static271.aClass2_12.method3320(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local621 = local819.method5680(Static271.aClass2_12);
					if (local621 != null) {
						local621.aClass5_1 = local819;
						local621.anInt1118 = local12;
						local621.anInt1115 = local6;
						local621.anInt1119 = local9;
						Static46.aClass175_1.method4672(local621);
					}
					if (local819.aBoolean587) {
						Static271.aClass2_12.method3320(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class5_Sub2 local885 = arg1.aClass5_Sub2_1;
				if (local885 != null && !local885.aBoolean78) {
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					@Pc(908) Class15_Sub3 local908 = local885.method5680(Static271.aClass2_12);
					if (local908 != null) {
						local908.aClass5_1 = local885;
						local908.anInt1118 = local12;
						local908.anInt1115 = local6;
						local908.anInt1119 = local9;
						Static46.aClass175_1.method4672(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte61;
			if (local929 != 0) {
				@Pc(946) Class204 local946;
				if (local6 < Static199.anInt4061 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean536) {
						Static202.aClass28_1.method3474(local946);
					}
				}
				if (local9 < Static268.anInt5167 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean536) {
						Static202.aClass28_1.method3474(local946);
					}
				}
				if (local6 > Static199.anInt4061 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean536) {
						Static202.aClass28_1.method3474(local946);
					}
				}
				if (local9 > Static268.anInt5167 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean536) {
						Static202.aClass28_1.method3474(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class5_Sub1 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class17 local1035;
		if (arg1.aByte59 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass17_3; local1035 != null; local1035 = local1035.aClass17_1) {
				if (local1035.aClass5_Sub3_1.anInt5043 != Static271.anInt4840 && (local1035.anInt399 & arg1.aByte59) == arg1.aByte60) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass5_Sub1_1;
				if (!Static294.method5055(local15, local6, local9, local1062.anInt5964)) {
					if (Static244.aBoolean397) {
						label687: {
							if (local1062.anInt5964 >= 16) {
								local1079 = local6 - Static199.anInt4061;
								local1083 = local9 - Static268.anInt5167;
								if (local1062.anInt5964 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static74.anInt3404) {
										Static334.method5570(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5964 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static222.anInt4391 && local9 < Static74.anInt3404) {
										Static334.method5570(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5964 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static222.anInt4391 && local9 > 0) {
										Static334.method5570(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt5964 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static334.method5570(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static334.method5570(arg0, local12, local6, local9);
						}
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					@Pc(1197) Class15_Sub3 local1197 = local1062.method5680(Static271.aClass2_12);
					if (local1197 != null) {
						local1197.aClass5_1 = local1062;
						local1197.anInt1118 = local12;
						local1197.anInt1115 = local6;
						local1197.anInt1119 = local9;
						Static46.aClass175_1.method4672(local1197);
					}
				}
				arg1.aByte59 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean538) {
			try {
				arg1.aBoolean538 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass17_3; local1035 != null; local1035 = local1035.aClass17_1) {
					@Pc(1233) Class5_Sub3 local1233 = local1035.aClass5_Sub3_1;
					if (local1233.anInt5043 != Static271.anInt4840) {
						for (local1079 = local1233.aShort75; local1079 <= local1233.aShort78; local1079++) {
							for (local1083 = local1233.aShort77; local1083 <= local1233.aShort76; local1083++) {
								@Pc(1251) Class204 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean537) {
									arg1.aBoolean538 = true;
									continue label630;
								}
								if (local1251.aByte59 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort75) {
										local711++;
									}
									if (local1079 < local1233.aShort78) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort77) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort76) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte59) == arg1.aByte65) {
										arg1.aBoolean538 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static199.anInt4061 - local1233.aShort75;
						local1314 = local1233.aShort78 - Static199.anInt4061;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static268.anInt5167 - local1233.aShort77;
						local716 = local1233.aShort76 - Static268.anInt5167;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass5_Sub3Array2[local40] = local1233;
						arg0.anIntArray294[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class5_Sub3 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass5_Sub3Array2[local1083];
						if (local1365.anInt5043 != Static271.anInt4840) {
							local711 = arg0.anIntArray294[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5050 - Static175.anInt3627;
								local719 = local1365.anInt5047 - Static341.anInt2253;
								local728 = arg0.aClass5_Sub3Array2[local1079].anInt5050 - Static175.anInt3627;
								local740 = arg0.aClass5_Sub3Array2[local1079].anInt5047 - Static341.anInt2253;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass5_Sub3Array2[local1079];
					local1365.anInt5043 = Static271.anInt4840;
					if (!Static322.method5390(local15, local1365.aShort75, local1365.aShort78, local1365.aShort77, local1365.aShort76, local1365.method4586())) {
						if (Static244.aBoolean397) {
							if (local1365.aByte52 == 0) {
								Static142.method2984(arg0, local12, local1365.aShort75, local1365.aShort77, local1365.aShort78, local1365.aShort76);
							} else {
								Static334.method5570(arg0, local12, local6, local9);
								local711 = local6 - Static199.anInt4061;
								local716 = local9 - Static268.anInt5167;
								if (local1365.aByte52 == 2) {
									if (local716 > -local711) {
										Static102.method1911(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static102.method1911(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static102.method1911(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static102.method1911(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
						}
						local621 = local1365.method5680(Static271.aClass2_12);
						if (local621 != null) {
							local621.aClass5_1 = local1365;
							local621.anInt1118 = local12;
							local621.anInt1115 = local1365.aShort75;
							local621.anInt1119 = local1365.aShort77;
							Static46.aClass175_1.method4672(local621);
						}
					}
					for (local711 = local1365.aShort75; local711 <= local1365.aShort78; local711++) {
						for (local716 = local1365.aShort77; local716 <= local1365.aShort76; local716++) {
							@Pc(1590) Class204 local1590 = local31[local711][local716];
							if (local1590.aByte59 != 0) {
								Static202.aClass28_1.method3474(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean536) {
								Static202.aClass28_1.method3474(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean538) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean538 = false;
			}
		}
		if (arg1.aClass162_2 != null) {
			if (arg1.aByte62 == (byte) (Static164.anInt3423 & 0xFF)) {
				@Pc(1645) Class162 local1645 = arg1.aClass162_2;
				local411 = Static7.aClass41Array1[local12].method5434(local6, local9);
				if (local12 < 3) {
					local413 = Static7.aClass41Array1[local12].method5434(local6, local9) - Static7.aClass41Array1[local12 + 1].method5434(local6, local9);
				} else {
					local413 = 1024;
				}
				Static245.aClass21_7.method2807(local21, local411, local27, arg0.anIntArray295);
				local1079 = arg0.anIntArray295[2];
				Static245.aClass21_7.method2807(local21, local411 - local413, local27, arg0.anIntArray295);
				local1083 = arg0.anIntArray295[2];
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
				local1645.anInt4828 = local1314;
				local1645.anInt4826 = local711;
				local1645.aBoolean407 = true;
				Static271.aClass2_12.method3252(local1645);
			} else {
				arg1.aClass162_2 = null;
			}
		}
		if (!arg1.aBoolean536) {
			return;
		}
		if (arg1.aByte59 != 0) {
			return;
		}
		if (local6 <= Static199.anInt4061 && local6 > Static285.anInt5515) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean536) {
				return;
			}
		}
		if (local6 >= Static199.anInt4061 && local6 < Static132.anInt2570 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean536) {
				return;
			}
		}
		if (local9 <= Static268.anInt5167 && local9 > Static129.anInt2513) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean536) {
				return;
			}
		}
		if (local9 >= Static268.anInt5167 && local9 < Static70.anInt1449 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean536) {
				return;
			}
		}
		arg1.aBoolean536 = false;
		Static200.anInt4070--;
		@Pc(1839) Class5_Sub2 local1839 = arg1.aClass5_Sub2_1;
		if (local1839 != null && local1839.aBoolean78) {
			if (Static244.aBoolean397) {
				Static334.method5570(arg0, local12, local6, local9);
				Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
			}
			@Pc(1862) Class15_Sub3 local1862 = local1839.method5680(Static271.aClass2_12);
			if (local1862 != null) {
				local1862.aClass5_1 = local1839;
				local1862.anInt1118 = local12;
				local1862.anInt1115 = local6;
				local1862.anInt1119 = local9;
				Static46.aClass175_1.method4672(local1862);
			}
		}
		if (arg1.aShort87 != 0) {
			@Pc(1886) Class5_Sub4 local1886 = arg1.aClass5_Sub4_2;
			if (local1886 != null && !Static224.method4105(local15, local6, local9, local1886.method3009())) {
				if ((local1886.anInt3175 & arg1.aShort87) != 0) {
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					local382 = local1886.method5680(Static271.aClass2_12);
					if (local382 != null) {
						local382.aClass5_1 = local1886;
						local382.anInt1118 = local12;
						local382.anInt1115 = local6;
						local382.anInt1119 = local9;
						Static46.aClass175_1.method4672(local382);
					}
				} else if (local1886.anInt3175 == 256) {
					local413 = local1886.anInt3172 - Static175.anInt3627;
					local1079 = local1886.anInt3176 - Static341.anInt2253;
					local1083 = local1886.anInt3181;
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
					if (Static244.aBoolean397) {
						Static334.method5570(arg0, local12, local6, local9);
						Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
					}
					@Pc(1996) Class5_Sub4 local1996 = arg1.aClass5_Sub4_1;
					@Pc(2004) Class15_Sub3 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5680(Static271.aClass2_12);
						if (local2004 != null) {
							local2004.aClass5_1 = local1886;
							local2004.anInt1118 = local12;
							local2004.anInt1115 = local6;
							local2004.anInt1119 = local9;
							Static46.aClass175_1.method4672(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5680(Static271.aClass2_12);
						if (local2004 != null) {
							local2004.aClass5_1 = local1996;
							local2004.anInt1118 = local12;
							local2004.anInt1115 = local6;
							local2004.anInt1119 = local9;
							Static46.aClass175_1.method4672(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass5_Sub1_1;
			local416 = arg1.aClass5_Sub1_2;
			@Pc(2089) Class15_Sub3 local2089;
			if (local416 != null && (local416.anInt5964 & arg1.aShort87) != 0 && !Static294.method5055(local15, local6, local9, local416.anInt5964)) {
				if (Static244.aBoolean397) {
					Static270.method4726(arg0, local416.anInt5964, local12, local6, local9);
					Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
				}
				local2089 = local416.method5680(Static271.aClass2_12);
				if (local2089 != null) {
					local2089.aClass5_1 = local416;
					local2089.anInt1118 = local12;
					local2089.anInt1115 = local6;
					local2089.anInt1119 = local9;
					Static46.aClass175_1.method4672(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt5964 & arg1.aShort87) != 0 && !Static294.method5055(local15, local6, local9, local1062.anInt5964)) {
				if (Static244.aBoolean397) {
					Static270.method4726(arg0, local1062.anInt5964, local12, local6, local9);
					Static271.aClass2_12.method3260(arg0.anInt2459, arg0.aClass1_Sub31_Sub1Array2);
				}
				local2089 = local1062.method5680(Static271.aClass2_12);
				if (local2089 != null) {
					local2089.aClass5_1 = local1062;
					local2089.anInt1118 = local12;
					local2089.anInt1115 = local6;
					local2089.anInt1119 = local9;
					Static46.aClass175_1.method4672(local2089);
				}
			}
		}
		@Pc(2175) Class204 local2175;
		if (local12 < Static56.anInt1240 - 1) {
			local2175 = Static138.aClass204ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean536) {
				Static202.aClass28_1.method3467(local2175);
			}
		}
		if (local6 < Static199.anInt4061) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean536) {
				Static202.aClass28_1.method3474(local2175);
			}
		}
		if (local9 < Static268.anInt5167) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean536) {
				Static202.aClass28_1.method3474(local2175);
			}
		}
		if (local6 > Static199.anInt4061) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean536) {
				Static202.aClass28_1.method3474(local2175);
			}
		}
		if (local9 > Static268.anInt5167) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean536) {
				Static202.aClass28_1.method3474(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
	public static void method5353() {
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static51.aClass195_44.method5029(); local15 != null; local15 = (Class1_Sub21) Static51.aClass195_44.method5021()) {
			if (local15.anInt3645 > 0) {
				local15.anInt3645--;
			}
			if (local15.anInt3645 != 0) {
				if (local15.anInt3638 > 0) {
					local15.anInt3638--;
				}
				if (local15.anInt3638 == 0 && local15.anInt3654 >= 1 && local15.anInt3653 >= 1 && local15.anInt3654 <= Static48.anInt1107 - 2 && local15.anInt3653 <= Static337.anInt6402 - 2 && (local15.anInt3648 < 0 || Static244.method4323(local15.anInt3648, local15.anInt3655))) {
					Static206.method3826(local15.anInt3654, local15.anInt3648, -1, local15.anInt3653, local15.anInt3640, local15.anInt3639, local15.anInt3655, local15.anInt3651);
					local15.anInt3638 = -1;
					if (local15.anInt3648 == local15.anInt3642 && local15.anInt3642 == -1) {
						local15.method5710();
					} else if (local15.anInt3642 == local15.anInt3648 && local15.anInt3640 == local15.anInt3650 && local15.anInt3655 == local15.anInt3641) {
						local15.method5710();
					}
				}
			} else if (local15.anInt3642 < 0 || Static244.method4323(local15.anInt3642, local15.anInt3641)) {
				Static206.method3826(local15.anInt3654, local15.anInt3642, -1, local15.anInt3653, local15.anInt3650, local15.anInt3639, local15.anInt3641, local15.anInt3651);
				local15.method5710();
			}
		}
	}
}
