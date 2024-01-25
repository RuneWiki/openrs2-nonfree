import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt4455;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public static int anInt4459;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Z")
	public static boolean aBoolean421;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "Lclient!c;")
	public static Class5 aClass5_23;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt4460 = 0;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!aq;")
	public static Class12 aClass12_12 = null;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!il;Lclient!sq;)V")
	public static void method4004(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class194 arg1) {
		if (!arg1.aBoolean561) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort88;
		@Pc(9) short local9 = arg1.aShort87;
		@Pc(12) byte local12 = arg1.aByte68;
		@Pc(15) byte local15 = arg1.aByte64;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class194[][] local31 = Static77.aClass194ArrayArrayArray1[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static269.aClass53Array2 == Static298.aClass53Array3) {
			local40 = Static85.anIntArrayArray56[local6][local9];
			Static20.aClass32_4.method2164(Static190.aClass53Array1[0].method2792(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static20.aClass32_4.method2225(3000.0F, local58 * 1.5F);
		@Pc(621) Class8_Sub5 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class194 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class8_Sub5 local382;
		@Pc(413) int local413;
		@Pc(416) Class17_Sub4 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean563) {
			if (Static81.aBoolean498) {
				if (local12 > 0) {
					local91 = Static77.aClass194ArrayArrayArray1[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean561) {
						return;
					}
				}
				if (local6 <= Static318.anInt6137 && local6 > Static326.anInt2473) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean561 && (local91.aBoolean563 || (arg1.aByte67 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static318.anInt6137 && local6 < Static92.anInt3571 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean561 && (local91.aBoolean563 || (arg1.aByte67 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static204.anInt4305 && local9 > Static327.anInt6282) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean561 && (local91.aBoolean563 || (arg1.aByte67 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static204.anInt4305 && local9 < Static70.anInt1848 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean561 && (local91.aBoolean563 || (arg1.aByte67 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static81.aBoolean498 = true;
			}
			arg1.aBoolean563 = false;
			if (arg1.aClass194_1 != null) {
				local91 = arg1.aClass194_1;
				Static20.aClass32_4.method2225(3000.0F, (201.5F - (float) (local91.aByte64 + 1) * 50.0F) * 1.5F);
				if (!Static23.method662(local91.aByte64, local6, local9)) {
					Static298.aClass53Array3[local91.aByte64].method2781(local6, local9);
				}
				@Pc(254) Class17_Sub4 local254 = local91.aClass17_Sub4_1;
				if (local254 != null) {
					if (Static328.aBoolean612) {
						if ((local254.anInt4680 & arg1.aShort86) == 0) {
							Static144.method2875(arg0, local12, local6, local9);
						} else {
							Static316.method5553(arg0, local254.anInt4680, local15, local6, local9);
						}
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local254.method4779(Static20.aClass32_4);
				}
				for (@Pc(291) Class126 local291 = local91.aClass126_2; local291 != null; local291 = local291.aClass126_1) {
					@Pc(295) Class17_Sub1 local295 = local291.aClass17_Sub1_1;
					if (local295 != null) {
						if (Static328.aBoolean612) {
							Static144.method2875(arg0, local12, local6, local9);
							Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
						}
						local295.method4779(Static20.aClass32_4);
					}
				}
				Static20.aClass32_4.method2225(3000.0F, local58 * 1.5F);
			}
			local335 = !Static23.method662(local15, local6, local9);
			if (local335) {
				Static298.aClass53Array3[local15].method2781(local6, local9);
				@Pc(346) Class17_Sub5 local346 = arg1.aClass17_Sub5_1;
				if (local346 != null && local346.aBoolean448) {
					if (local346.aBoolean447) {
						Static20.aClass32_4.method2225(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local382 = local346.method4779(Static20.aClass32_4);
					if (local382 != null) {
						local382.aClass17_1 = local346;
						local382.anInt3438 = local12;
						local382.anInt3442 = local6;
						local382.anInt3436 = local9;
						Static92.aClass217_8.method5678(local382);
					}
					if (local346.aBoolean447) {
						Static20.aClass32_4.method2225(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass17_Sub4_1;
			@Pc(419) Class17_Sub3 local419 = arg1.aClass17_Sub3_1;
			if (local416 != null || local419 != null) {
				if (Static318.anInt6137 == local6) {
					local411++;
				} else if (Static318.anInt6137 < local6) {
					local411 += 2;
				}
				if (Static204.anInt4305 == local9) {
					local411 += 3;
				} else if (Static204.anInt4305 > local9) {
					local411 += 6;
				}
				local413 = Static96.anIntArray505[local411];
				arg1.aShort86 = Static291.aShortArray113[local411];
			}
			if (local416 != null) {
				if ((local416.anInt4680 & Static104.anIntArray231[local411]) == 0) {
					arg1.aByte65 = 0;
				} else if (local416.anInt4680 == 16) {
					arg1.aByte65 = 3;
					arg1.aByte66 = Static185.aByteArray62[local411];
					arg1.aByte69 = (byte) (3 - arg1.aByte66);
				} else if (local416.anInt4680 == 32) {
					arg1.aByte65 = 6;
					arg1.aByte66 = Static247.aByteArray80[local411];
					arg1.aByte69 = (byte) (6 - arg1.aByte66);
				} else if (local416.anInt4680 == 64) {
					arg1.aByte65 = 12;
					arg1.aByte66 = Static19.aByteArray7[local411];
					arg1.aByte69 = (byte) (12 - arg1.aByte66);
				} else {
					arg1.aByte65 = 9;
					arg1.aByte66 = Static34.aByteArray19[local411];
					arg1.aByte69 = (byte) (9 - arg1.aByte66);
				}
				if ((local416.anInt4680 & local413) != 0 && !Static111.method2412(local15, local6, local9, local416.anInt4680)) {
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					@Pc(568) Class8_Sub5 local568 = local416.method4779(Static20.aClass32_4);
					if (local568 != null) {
						local568.aClass17_1 = local416;
						local568.anInt3438 = local12;
						local568.anInt3442 = local6;
						local568.anInt3436 = local9;
						Static92.aClass217_8.method5678(local568);
					}
				}
				@Pc(589) Class17_Sub4 local589 = arg1.aClass17_Sub4_2;
				if (local589 != null && (local589.anInt4680 & local413) != 0 && !Static111.method2412(local15, local6, local9, local589.anInt4680)) {
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local621 = local589.method4779(Static20.aClass32_4);
					if (local621 != null) {
						local621.aClass17_1 = local589;
						local621.anInt3438 = local12;
						local621.anInt3442 = local6;
						local621.anInt3436 = local9;
						Static92.aClass217_8.method5678(local621);
					}
				}
			}
			if (local419 != null && !Static187.method3661(local15, local6, local9, local419.method4792())) {
				@Pc(652) Class17_Sub3 local652 = arg1.aClass17_Sub3_2;
				Static20.aClass32_4.method2225(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5579 & local413) != 0) {
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local621 = local419.method4779(Static20.aClass32_4);
					if (local621 != null) {
						local621.aClass17_1 = local419;
						local621.anInt3438 = local12;
						local621.anInt3442 = local6;
						local621.anInt3436 = local9;
						Static92.aClass217_8.method5678(local621);
					}
				} else if (local419.anInt5579 == 256) {
					local711 = local419.anInt5586 - Static171.anInt3695;
					local716 = local419.anInt5588 - Static234.anInt4778;
					local719 = local419.anInt5577;
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
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					@Pc(764) Class8_Sub5 local764;
					if (local740 < local728) {
						local764 = local419.method4779(Static20.aClass32_4);
						if (local764 != null) {
							local764.aClass17_1 = local419;
							local764.anInt3438 = local12;
							local764.anInt3442 = local6;
							local764.anInt3436 = local9;
							Static92.aClass217_8.method5678(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method4779(Static20.aClass32_4);
						if (local764 != null) {
							local764.aClass17_1 = local652;
							local764.anInt3438 = local12;
							local764.anInt3442 = local6;
							local764.anInt3436 = local9;
							Static92.aClass217_8.method5678(local764);
						}
					}
				}
				Static20.aClass32_4.method2225(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class17_Sub5 local819 = arg1.aClass17_Sub5_1;
				if (local819 != null && !local819.aBoolean448) {
					if (local819.aBoolean447) {
						Static20.aClass32_4.method2225(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local621 = local819.method4779(Static20.aClass32_4);
					if (local621 != null) {
						local621.aClass17_1 = local819;
						local621.anInt3438 = local12;
						local621.anInt3442 = local6;
						local621.anInt3436 = local9;
						Static92.aClass217_8.method5678(local621);
					}
					if (local819.aBoolean447) {
						Static20.aClass32_4.method2225(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class17_Sub2 local885 = arg1.aClass17_Sub2_1;
				if (local885 != null && !local885.aBoolean96) {
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					@Pc(908) Class8_Sub5 local908 = local885.method4779(Static20.aClass32_4);
					if (local908 != null) {
						local908.aClass17_1 = local885;
						local908.anInt3438 = local12;
						local908.anInt3442 = local6;
						local908.anInt3436 = local9;
						Static92.aClass217_8.method5678(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte67;
			if (local929 != 0) {
				@Pc(946) Class194 local946;
				if (local6 < Static318.anInt6137 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean561) {
						Static231.aClass42_1.method2030(local946);
					}
				}
				if (local9 < Static204.anInt4305 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean561) {
						Static231.aClass42_1.method2030(local946);
					}
				}
				if (local6 > Static318.anInt6137 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean561) {
						Static231.aClass42_1.method2030(local946);
					}
				}
				if (local9 > Static204.anInt4305 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean561) {
						Static231.aClass42_1.method2030(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class17_Sub4 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class126 local1035;
		if (arg1.aByte65 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass126_2; local1035 != null; local1035 = local1035.aClass126_1) {
				if (local1035.aClass17_Sub1_1.anInt5110 != Static146.anInt3198 && (local1035.anInt3791 & arg1.aByte65) == arg1.aByte66) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass17_Sub4_1;
				if (!Static111.method2412(local15, local6, local9, local1062.anInt4680)) {
					if (Static328.aBoolean612) {
						label687: {
							if (local1062.anInt4680 >= 16) {
								local1079 = local6 - Static318.anInt6137;
								local1083 = local9 - Static204.anInt4305;
								if (local1062.anInt4680 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static315.anInt6124) {
										Static144.method2875(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4680 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static242.anInt6744 && local9 < Static315.anInt6124) {
										Static144.method2875(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4680 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static242.anInt6744 && local9 > 0) {
										Static144.method2875(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt4680 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static144.method2875(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static144.method2875(arg0, local12, local6, local9);
						}
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					@Pc(1197) Class8_Sub5 local1197 = local1062.method4779(Static20.aClass32_4);
					if (local1197 != null) {
						local1197.aClass17_1 = local1062;
						local1197.anInt3438 = local12;
						local1197.anInt3442 = local6;
						local1197.anInt3436 = local9;
						Static92.aClass217_8.method5678(local1197);
					}
				}
				arg1.aByte65 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean562) {
			try {
				arg1.aBoolean562 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass126_2; local1035 != null; local1035 = local1035.aClass126_1) {
					@Pc(1233) Class17_Sub1 local1233 = local1035.aClass17_Sub1_1;
					if (local1233.anInt5110 != Static146.anInt3198) {
						for (local1079 = local1233.aShort75; local1079 <= local1233.aShort74; local1079++) {
							for (local1083 = local1233.aShort77; local1083 <= local1233.aShort76; local1083++) {
								@Pc(1251) Class194 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean563) {
									arg1.aBoolean562 = true;
									continue label630;
								}
								if (local1251.aByte65 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort75) {
										local711++;
									}
									if (local1079 < local1233.aShort74) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort77) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort76) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte65) == arg1.aByte69) {
										arg1.aBoolean562 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static318.anInt6137 - local1233.aShort75;
						local1314 = local1233.aShort74 - Static318.anInt6137;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static204.anInt4305 - local1233.aShort77;
						local716 = local1233.aShort76 - Static204.anInt4305;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass17_Sub1Array3[local40] = local1233;
						arg0.anIntArray529[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class17_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass17_Sub1Array3[local1083];
						if (local1365.anInt5110 != Static146.anInt3198) {
							local711 = arg0.anIntArray529[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5109 - Static171.anInt3695;
								local719 = local1365.anInt5108 - Static234.anInt4778;
								local728 = arg0.aClass17_Sub1Array3[local1079].anInt5109 - Static171.anInt3695;
								local740 = arg0.aClass17_Sub1Array3[local1079].anInt5108 - Static234.anInt4778;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass17_Sub1Array3[local1079];
					local1365.anInt5110 = Static146.anInt3198;
					if (!Static175.method3466(local15, local1365.aShort75, local1365.aShort74, local1365.aShort77, local1365.aShort76, local1365.method4490())) {
						if (Static328.aBoolean612) {
							if (local1365.aByte50 == 0) {
								Static41.method965(arg0, local12, local1365.aShort75, local1365.aShort77, local1365.aShort74, local1365.aShort76);
							} else {
								Static144.method2875(arg0, local12, local6, local9);
								local711 = local6 - Static318.anInt6137;
								local716 = local9 - Static204.anInt4305;
								if (local1365.aByte50 == 2) {
									if (local716 > -local711) {
										Static219.method4148(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static219.method4148(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static219.method4148(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static219.method4148(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
						}
						local621 = local1365.method4779(Static20.aClass32_4);
						if (local621 != null) {
							local621.aClass17_1 = local1365;
							local621.anInt3438 = local12;
							local621.anInt3442 = local1365.aShort75;
							local621.anInt3436 = local1365.aShort77;
							Static92.aClass217_8.method5678(local621);
						}
					}
					for (local711 = local1365.aShort75; local711 <= local1365.aShort74; local711++) {
						for (local716 = local1365.aShort77; local716 <= local1365.aShort76; local716++) {
							@Pc(1590) Class194 local1590 = local31[local711][local716];
							if (local1590.aByte65 != 0) {
								Static231.aClass42_1.method2030(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean561) {
								Static231.aClass42_1.method2030(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean562) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean562 = false;
			}
		}
		if (arg1.aClass191_2 != null) {
			if (arg1.aByte70 == (byte) (Static40.anInt1288 & 0xFF)) {
				@Pc(1645) Class191 local1645 = arg1.aClass191_2;
				local411 = Static298.aClass53Array3[local12].method2785(local6, local9);
				if (local12 < 3) {
					local413 = Static298.aClass53Array3[local12].method2785(local6, local9) - Static298.aClass53Array3[local12 + 1].method2785(local6, local9);
				} else {
					local413 = 1024;
				}
				Static75.aClass109_13.method3876(local21, local411, local27, arg0.anIntArray528);
				local1079 = arg0.anIntArray528[2];
				Static75.aClass109_13.method3876(local21, local411 - local413, local27, arg0.anIntArray528);
				local1083 = arg0.anIntArray528[2];
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
				local1645.anInt5767 = local1314;
				local1645.anInt5766 = local711;
				local1645.aBoolean554 = true;
				Static20.aClass32_4.method2190(local1645);
			} else {
				arg1.aClass191_2 = null;
			}
		}
		if (!arg1.aBoolean561) {
			return;
		}
		if (arg1.aByte65 != 0) {
			return;
		}
		if (local6 <= Static318.anInt6137 && local6 > Static326.anInt2473) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean561) {
				return;
			}
		}
		if (local6 >= Static318.anInt6137 && local6 < Static92.anInt3571 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean561) {
				return;
			}
		}
		if (local9 <= Static204.anInt4305 && local9 > Static327.anInt6282) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean561) {
				return;
			}
		}
		if (local9 >= Static204.anInt4305 && local9 < Static70.anInt1848 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean561) {
				return;
			}
		}
		arg1.aBoolean561 = false;
		Static134.anInt2972--;
		@Pc(1839) Class17_Sub2 local1839 = arg1.aClass17_Sub2_1;
		if (local1839 != null && local1839.aBoolean96) {
			if (Static328.aBoolean612) {
				Static144.method2875(arg0, local12, local6, local9);
				Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
			}
			@Pc(1862) Class8_Sub5 local1862 = local1839.method4779(Static20.aClass32_4);
			if (local1862 != null) {
				local1862.aClass17_1 = local1839;
				local1862.anInt3438 = local12;
				local1862.anInt3442 = local6;
				local1862.anInt3436 = local9;
				Static92.aClass217_8.method5678(local1862);
			}
		}
		if (arg1.aShort86 != 0) {
			@Pc(1886) Class17_Sub3 local1886 = arg1.aClass17_Sub3_1;
			if (local1886 != null && !Static187.method3661(local15, local6, local9, local1886.method4792())) {
				if ((local1886.anInt5579 & arg1.aShort86) != 0) {
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					local382 = local1886.method4779(Static20.aClass32_4);
					if (local382 != null) {
						local382.aClass17_1 = local1886;
						local382.anInt3438 = local12;
						local382.anInt3442 = local6;
						local382.anInt3436 = local9;
						Static92.aClass217_8.method5678(local382);
					}
				} else if (local1886.anInt5579 == 256) {
					local413 = local1886.anInt5586 - Static171.anInt3695;
					local1079 = local1886.anInt5588 - Static234.anInt4778;
					local1083 = local1886.anInt5577;
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
					if (Static328.aBoolean612) {
						Static144.method2875(arg0, local12, local6, local9);
						Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
					}
					@Pc(1996) Class17_Sub3 local1996 = arg1.aClass17_Sub3_2;
					@Pc(2004) Class8_Sub5 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method4779(Static20.aClass32_4);
						if (local2004 != null) {
							local2004.aClass17_1 = local1886;
							local2004.anInt3438 = local12;
							local2004.anInt3442 = local6;
							local2004.anInt3436 = local9;
							Static92.aClass217_8.method5678(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method4779(Static20.aClass32_4);
						if (local2004 != null) {
							local2004.aClass17_1 = local1996;
							local2004.anInt3438 = local12;
							local2004.anInt3442 = local6;
							local2004.anInt3436 = local9;
							Static92.aClass217_8.method5678(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass17_Sub4_1;
			local416 = arg1.aClass17_Sub4_2;
			@Pc(2089) Class8_Sub5 local2089;
			if (local416 != null && (local416.anInt4680 & arg1.aShort86) != 0 && !Static111.method2412(local15, local6, local9, local416.anInt4680)) {
				if (Static328.aBoolean612) {
					Static316.method5553(arg0, local416.anInt4680, local12, local6, local9);
					Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
				}
				local2089 = local416.method4779(Static20.aClass32_4);
				if (local2089 != null) {
					local2089.aClass17_1 = local416;
					local2089.anInt3438 = local12;
					local2089.anInt3442 = local6;
					local2089.anInt3436 = local9;
					Static92.aClass217_8.method5678(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt4680 & arg1.aShort86) != 0 && !Static111.method2412(local15, local6, local9, local1062.anInt4680)) {
				if (Static328.aBoolean612) {
					Static316.method5553(arg0, local1062.anInt4680, local12, local6, local9);
					Static20.aClass32_4.method2236(arg0.anInt6684, arg0.aClass1_Sub30_Sub1Array3);
				}
				local2089 = local1062.method4779(Static20.aClass32_4);
				if (local2089 != null) {
					local2089.aClass17_1 = local1062;
					local2089.anInt3438 = local12;
					local2089.anInt3442 = local6;
					local2089.anInt3436 = local9;
					Static92.aClass217_8.method5678(local2089);
				}
			}
		}
		@Pc(2175) Class194 local2175;
		if (local12 < Static113.anInt2651 - 1) {
			local2175 = Static77.aClass194ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean561) {
				Static231.aClass42_1.method2036(local2175);
			}
		}
		if (local6 < Static318.anInt6137) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean561) {
				Static231.aClass42_1.method2030(local2175);
			}
		}
		if (local9 < Static204.anInt4305) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean561) {
				Static231.aClass42_1.method2030(local2175);
			}
		}
		if (local6 > Static318.anInt6137) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean561) {
				Static231.aClass42_1.method2030(local2175);
			}
		}
		if (local9 > Static204.anInt4305) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean561) {
				Static231.aClass42_1.method2030(local2175);
			}
		}
	}
}
