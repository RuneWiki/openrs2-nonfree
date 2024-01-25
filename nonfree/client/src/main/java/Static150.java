import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString121 = "Choose Option";

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "[I")
	public static final int[] anIntArray346 = new int[5];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method2936() {
		Static131.aClass6_Sub10_Sub1_2.method2886(174);
		Static131.aClass6_Sub10_Sub1_2.method3968(0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
	public static int method2938(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!br;Lclient!sk;)V")
	public static void method2942(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class187 arg1) {
		if (!arg1.aBoolean374) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort80;
		@Pc(9) short local9 = arg1.aShort81;
		@Pc(12) byte local12 = arg1.aByte78;
		@Pc(15) byte local15 = arg1.aByte83;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class187[][] local31 = Static39.aClass187ArrayArrayArray1[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static84.aClass106Array1 == Static203.aClass106Array3) {
			local40 = Static291.anIntArrayArray183[local6][local9];
			Static289.aClass81_6.method2998(Static99.aClass106Array4[0].method5717(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static289.aClass81_6.method2974(3000.0F, local58 * 1.5F);
		@Pc(621) Class20_Sub6 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class187 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class20_Sub6 local382;
		@Pc(413) int local413;
		@Pc(416) Class44_Sub5 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean376) {
			if (Static116.aBoolean187) {
				if (local12 > 0) {
					local91 = Static39.aClass187ArrayArrayArray1[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean374) {
						return;
					}
				}
				if (local6 <= Static339.anInt6187 && local6 > Static107.anInt1991) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean374 && (local91.aBoolean376 || (arg1.aByte80 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static339.anInt6187 && local6 < Static236.anInt2368 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean374 && (local91.aBoolean376 || (arg1.aByte80 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static8.anInt3154 && local9 > Static23.anInt378) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean374 && (local91.aBoolean376 || (arg1.aByte80 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static8.anInt3154 && local9 < Static305.anInt5784 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean374 && (local91.aBoolean376 || (arg1.aByte80 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static116.aBoolean187 = true;
			}
			arg1.aBoolean376 = false;
			if (arg1.aClass187_1 != null) {
				local91 = arg1.aClass187_1;
				Static289.aClass81_6.method2974(3000.0F, (201.5F - (float) (local91.aByte83 + 1) * 50.0F) * 1.5F);
				if (!Static198.method3634(local91.aByte83, local6, local9)) {
					Static203.aClass106Array3[local91.aByte83].method5715(local6, local9);
				}
				@Pc(254) Class44_Sub5 local254 = local91.aClass44_Sub5_1;
				if (local254 != null) {
					if (Static2.aBoolean8) {
						if ((local254.anInt5411 & arg1.aShort82) == 0) {
							Static121.method5165(arg0, local12, local6, local9);
						} else {
							Static66.method1127(arg0, local254.anInt5411, local15, local6, local9);
						}
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local254.method5779(Static289.aClass81_6);
				}
				for (@Pc(291) Class214 local291 = local91.aClass214_19; local291 != null; local291 = local291.aClass214_21) {
					@Pc(295) Class44_Sub4 local295 = local291.aClass44_Sub4_1;
					if (local295 != null) {
						if (Static2.aBoolean8) {
							Static121.method5165(arg0, local12, local6, local9);
							Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
						}
						local295.method5779(Static289.aClass81_6);
					}
				}
				Static289.aClass81_6.method2974(3000.0F, local58 * 1.5F);
			}
			local335 = !Static198.method3634(local15, local6, local9);
			if (local335) {
				Static203.aClass106Array3[local15].method5715(local6, local9);
				@Pc(346) Class44_Sub3 local346 = arg1.aClass44_Sub3_1;
				if (local346 != null && local346.aBoolean318) {
					if (local346.aBoolean319) {
						Static289.aClass81_6.method2974(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local382 = local346.method5779(Static289.aClass81_6);
					if (local382 != null) {
						local382.aClass44_1 = local346;
						local382.anInt3049 = local12;
						local382.anInt3052 = local6;
						local382.anInt3048 = local9;
						Static66.aClass109_2.method2935(local382);
					}
					if (local346.aBoolean319) {
						Static289.aClass81_6.method2974(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass44_Sub5_1;
			@Pc(419) Class44_Sub1 local419 = arg1.aClass44_Sub1_1;
			if (local416 != null || local419 != null) {
				if (Static339.anInt6187 == local6) {
					local411++;
				} else if (Static339.anInt6187 < local6) {
					local411 += 2;
				}
				if (Static8.anInt3154 == local9) {
					local411 += 3;
				} else if (Static8.anInt3154 > local9) {
					local411 += 6;
				}
				local413 = Static296.anIntArray683[local411];
				arg1.aShort82 = Static68.aShortArray75[local411];
			}
			if (local416 != null) {
				if ((local416.anInt5411 & Static114.anIntArray285[local411]) == 0) {
					arg1.aByte84 = 0;
				} else if (local416.anInt5411 == 16) {
					arg1.aByte84 = 3;
					arg1.aByte82 = Static249.aByteArray73[local411];
					arg1.aByte81 = (byte) (3 - arg1.aByte82);
				} else if (local416.anInt5411 == 32) {
					arg1.aByte84 = 6;
					arg1.aByte82 = Static191.aByteArray59[local411];
					arg1.aByte81 = (byte) (6 - arg1.aByte82);
				} else if (local416.anInt5411 == 64) {
					arg1.aByte84 = 12;
					arg1.aByte82 = Static344.aByteArray96[local411];
					arg1.aByte81 = (byte) (12 - arg1.aByte82);
				} else {
					arg1.aByte84 = 9;
					arg1.aByte82 = Static287.aByteArray88[local411];
					arg1.aByte81 = (byte) (9 - arg1.aByte82);
				}
				if ((local416.anInt5411 & local413) != 0 && !Static37.method640(local15, local6, local9, local416.anInt5411)) {
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					@Pc(568) Class20_Sub6 local568 = local416.method5779(Static289.aClass81_6);
					if (local568 != null) {
						local568.aClass44_1 = local416;
						local568.anInt3049 = local12;
						local568.anInt3052 = local6;
						local568.anInt3048 = local9;
						Static66.aClass109_2.method2935(local568);
					}
				}
				@Pc(589) Class44_Sub5 local589 = arg1.aClass44_Sub5_2;
				if (local589 != null && (local589.anInt5411 & local413) != 0 && !Static37.method640(local15, local6, local9, local589.anInt5411)) {
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local621 = local589.method5779(Static289.aClass81_6);
					if (local621 != null) {
						local621.aClass44_1 = local589;
						local621.anInt3049 = local12;
						local621.anInt3052 = local6;
						local621.anInt3048 = local9;
						Static66.aClass109_2.method2935(local621);
					}
				}
			}
			if (local419 != null && !Static154.method3115(local15, local6, local9, local419.method5230())) {
				@Pc(652) Class44_Sub1 local652 = arg1.aClass44_Sub1_2;
				Static289.aClass81_6.method2974(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5758 & local413) != 0) {
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local621 = local419.method5779(Static289.aClass81_6);
					if (local621 != null) {
						local621.aClass44_1 = local419;
						local621.anInt3049 = local12;
						local621.anInt3052 = local6;
						local621.anInt3048 = local9;
						Static66.aClass109_2.method2935(local621);
					}
				} else if (local419.anInt5758 == 256) {
					local711 = local419.anInt5763 - Static209.anInt3813;
					local716 = local419.anInt5759 - Static256.anInt4741;
					local719 = local419.anInt5757;
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
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					@Pc(764) Class20_Sub6 local764;
					if (local740 < local728) {
						local764 = local419.method5779(Static289.aClass81_6);
						if (local764 != null) {
							local764.aClass44_1 = local419;
							local764.anInt3049 = local12;
							local764.anInt3052 = local6;
							local764.anInt3048 = local9;
							Static66.aClass109_2.method2935(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5779(Static289.aClass81_6);
						if (local764 != null) {
							local764.aClass44_1 = local652;
							local764.anInt3049 = local12;
							local764.anInt3052 = local6;
							local764.anInt3048 = local9;
							Static66.aClass109_2.method2935(local764);
						}
					}
				}
				Static289.aClass81_6.method2974(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class44_Sub3 local819 = arg1.aClass44_Sub3_1;
				if (local819 != null && !local819.aBoolean318) {
					if (local819.aBoolean319) {
						Static289.aClass81_6.method2974(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local621 = local819.method5779(Static289.aClass81_6);
					if (local621 != null) {
						local621.aClass44_1 = local819;
						local621.anInt3049 = local12;
						local621.anInt3052 = local6;
						local621.anInt3048 = local9;
						Static66.aClass109_2.method2935(local621);
					}
					if (local819.aBoolean319) {
						Static289.aClass81_6.method2974(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class44_Sub2 local885 = arg1.aClass44_Sub2_1;
				if (local885 != null && !local885.aBoolean225) {
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					@Pc(908) Class20_Sub6 local908 = local885.method5779(Static289.aClass81_6);
					if (local908 != null) {
						local908.aClass44_1 = local885;
						local908.anInt3049 = local12;
						local908.anInt3052 = local6;
						local908.anInt3048 = local9;
						Static66.aClass109_2.method2935(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte80;
			if (local929 != 0) {
				@Pc(946) Class187 local946;
				if (local6 < Static339.anInt6187 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean374) {
						Static59.aClass155_1.method5565(local946);
					}
				}
				if (local9 < Static8.anInt3154 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean374) {
						Static59.aClass155_1.method5565(local946);
					}
				}
				if (local6 > Static339.anInt6187 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean374) {
						Static59.aClass155_1.method5565(local946);
					}
				}
				if (local9 > Static8.anInt3154 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean374) {
						Static59.aClass155_1.method5565(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class44_Sub5 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class214 local1035;
		if (arg1.aByte84 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass214_19; local1035 != null; local1035 = local1035.aClass214_21) {
				if (local1035.aClass44_Sub4_1.anInt6334 != Static318.anInt5896 && (local1035.anInt6237 & arg1.aByte84) == arg1.aByte82) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass44_Sub5_1;
				if (!Static37.method640(local15, local6, local9, local1062.anInt5411)) {
					if (Static2.aBoolean8) {
						label687: {
							if (local1062.anInt5411 >= 16) {
								local1079 = local6 - Static339.anInt6187;
								local1083 = local9 - Static8.anInt3154;
								if (local1062.anInt5411 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static163.anInt3084) {
										Static121.method5165(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5411 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static310.anInt5828 && local9 < Static163.anInt3084) {
										Static121.method5165(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5411 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static310.anInt5828 && local9 > 0) {
										Static121.method5165(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt5411 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static121.method5165(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static121.method5165(arg0, local12, local6, local9);
						}
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					@Pc(1197) Class20_Sub6 local1197 = local1062.method5779(Static289.aClass81_6);
					if (local1197 != null) {
						local1197.aClass44_1 = local1062;
						local1197.anInt3049 = local12;
						local1197.anInt3052 = local6;
						local1197.anInt3048 = local9;
						Static66.aClass109_2.method2935(local1197);
					}
				}
				arg1.aByte84 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean375) {
			try {
				arg1.aBoolean375 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass214_19; local1035 != null; local1035 = local1035.aClass214_21) {
					@Pc(1233) Class44_Sub4 local1233 = local1035.aClass44_Sub4_1;
					if (local1233.anInt6334 != Static318.anInt5896) {
						for (local1079 = local1233.aShort90; local1079 <= local1233.aShort87; local1079++) {
							for (local1083 = local1233.aShort89; local1083 <= local1233.aShort88; local1083++) {
								@Pc(1251) Class187 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean376) {
									arg1.aBoolean375 = true;
									continue label630;
								}
								if (local1251.aByte84 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort90) {
										local711++;
									}
									if (local1079 < local1233.aShort87) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort89) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort88) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte84) == arg1.aByte81) {
										arg1.aBoolean375 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static339.anInt6187 - local1233.aShort90;
						local1314 = local1233.aShort87 - Static339.anInt6187;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static8.anInt3154 - local1233.aShort89;
						local716 = local1233.aShort88 - Static8.anInt3154;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass44_Sub4Array3[local40] = local1233;
						arg0.anIntArray513[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class44_Sub4 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass44_Sub4Array3[local1083];
						if (local1365.anInt6334 != Static318.anInt5896) {
							local711 = arg0.anIntArray513[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6340 - Static209.anInt3813;
								local719 = local1365.anInt6339 - Static256.anInt4741;
								local728 = arg0.aClass44_Sub4Array3[local1079].anInt6340 - Static209.anInt3813;
								local740 = arg0.aClass44_Sub4Array3[local1079].anInt6339 - Static256.anInt4741;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass44_Sub4Array3[local1079];
					local1365.anInt6334 = Static318.anInt5896;
					if (!Static303.method5207(local15, local1365.aShort90, local1365.aShort87, local1365.aShort89, local1365.aShort88, local1365.method5784())) {
						if (Static2.aBoolean8) {
							if (local1365.aByte91 == 0) {
								Static66.method1123(arg0, local12, local1365.aShort90, local1365.aShort89, local1365.aShort87, local1365.aShort88);
							} else {
								Static121.method5165(arg0, local12, local6, local9);
								local711 = local6 - Static339.anInt6187;
								local716 = local9 - Static8.anInt3154;
								if (local1365.aByte91 == 2) {
									if (local716 > -local711) {
										Static104.method2110(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static104.method2110(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static104.method2110(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static104.method2110(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
						}
						local621 = local1365.method5779(Static289.aClass81_6);
						if (local621 != null) {
							local621.aClass44_1 = local1365;
							local621.anInt3049 = local12;
							local621.anInt3052 = local1365.aShort90;
							local621.anInt3048 = local1365.aShort89;
							Static66.aClass109_2.method2935(local621);
						}
					}
					for (local711 = local1365.aShort90; local711 <= local1365.aShort87; local711++) {
						for (local716 = local1365.aShort89; local716 <= local1365.aShort88; local716++) {
							@Pc(1590) Class187 local1590 = local31[local711][local716];
							if (local1590.aByte84 != 0) {
								Static59.aClass155_1.method5565(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean374) {
								Static59.aClass155_1.method5565(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean375) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean375 = false;
			}
		}
		if (arg1.aClass90_2 != null) {
			if (arg1.aByte79 == (byte) (Static23.anInt367 & 0xFF)) {
				@Pc(1645) Class90 local1645 = arg1.aClass90_2;
				local411 = Static203.aClass106Array3[local12].method5720(local6, local9);
				if (local12 < 3) {
					local413 = Static203.aClass106Array3[local12].method5720(local6, local9) - Static203.aClass106Array3[local12 + 1].method5720(local6, local9);
				} else {
					local413 = 1024;
				}
				Static213.aClass72_4.method4075(local21, local411, local27, arg0.anIntArray512);
				local1079 = arg0.anIntArray512[2];
				Static213.aClass72_4.method4075(local21, local411 - local413, local27, arg0.anIntArray512);
				local1083 = arg0.anIntArray512[2];
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
				local1645.anInt2096 = local1314;
				local1645.anInt2095 = local711;
				local1645.aBoolean176 = true;
				Static289.aClass81_6.method3034(local1645);
			} else {
				arg1.aClass90_2 = null;
			}
		}
		if (!arg1.aBoolean374) {
			return;
		}
		if (arg1.aByte84 != 0) {
			return;
		}
		if (local6 <= Static339.anInt6187 && local6 > Static107.anInt1991) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean374) {
				return;
			}
		}
		if (local6 >= Static339.anInt6187 && local6 < Static236.anInt2368 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean374) {
				return;
			}
		}
		if (local9 <= Static8.anInt3154 && local9 > Static23.anInt378) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean374) {
				return;
			}
		}
		if (local9 >= Static8.anInt3154 && local9 < Static305.anInt5784 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean374) {
				return;
			}
		}
		arg1.aBoolean374 = false;
		Static317.anInt5887--;
		@Pc(1839) Class44_Sub2 local1839 = arg1.aClass44_Sub2_1;
		if (local1839 != null && local1839.aBoolean225) {
			if (Static2.aBoolean8) {
				Static121.method5165(arg0, local12, local6, local9);
				Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
			}
			@Pc(1862) Class20_Sub6 local1862 = local1839.method5779(Static289.aClass81_6);
			if (local1862 != null) {
				local1862.aClass44_1 = local1839;
				local1862.anInt3049 = local12;
				local1862.anInt3052 = local6;
				local1862.anInt3048 = local9;
				Static66.aClass109_2.method2935(local1862);
			}
		}
		if (arg1.aShort82 != 0) {
			@Pc(1886) Class44_Sub1 local1886 = arg1.aClass44_Sub1_1;
			if (local1886 != null && !Static154.method3115(local15, local6, local9, local1886.method5230())) {
				if ((local1886.anInt5758 & arg1.aShort82) != 0) {
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					local382 = local1886.method5779(Static289.aClass81_6);
					if (local382 != null) {
						local382.aClass44_1 = local1886;
						local382.anInt3049 = local12;
						local382.anInt3052 = local6;
						local382.anInt3048 = local9;
						Static66.aClass109_2.method2935(local382);
					}
				} else if (local1886.anInt5758 == 256) {
					local413 = local1886.anInt5763 - Static209.anInt3813;
					local1079 = local1886.anInt5759 - Static256.anInt4741;
					local1083 = local1886.anInt5757;
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
					if (Static2.aBoolean8) {
						Static121.method5165(arg0, local12, local6, local9);
						Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
					}
					@Pc(1996) Class44_Sub1 local1996 = arg1.aClass44_Sub1_2;
					@Pc(2004) Class20_Sub6 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5779(Static289.aClass81_6);
						if (local2004 != null) {
							local2004.aClass44_1 = local1886;
							local2004.anInt3049 = local12;
							local2004.anInt3052 = local6;
							local2004.anInt3048 = local9;
							Static66.aClass109_2.method2935(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5779(Static289.aClass81_6);
						if (local2004 != null) {
							local2004.aClass44_1 = local1996;
							local2004.anInt3049 = local12;
							local2004.anInt3052 = local6;
							local2004.anInt3048 = local9;
							Static66.aClass109_2.method2935(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass44_Sub5_1;
			local416 = arg1.aClass44_Sub5_2;
			@Pc(2089) Class20_Sub6 local2089;
			if (local416 != null && (local416.anInt5411 & arg1.aShort82) != 0 && !Static37.method640(local15, local6, local9, local416.anInt5411)) {
				if (Static2.aBoolean8) {
					Static66.method1127(arg0, local416.anInt5411, local12, local6, local9);
					Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
				}
				local2089 = local416.method5779(Static289.aClass81_6);
				if (local2089 != null) {
					local2089.aClass44_1 = local416;
					local2089.anInt3049 = local12;
					local2089.anInt3052 = local6;
					local2089.anInt3048 = local9;
					Static66.aClass109_2.method2935(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt5411 & arg1.aShort82) != 0 && !Static37.method640(local15, local6, local9, local1062.anInt5411)) {
				if (Static2.aBoolean8) {
					Static66.method1127(arg0, local1062.anInt5411, local12, local6, local9);
					Static289.aClass81_6.method3036(arg0.anInt4728, arg0.aClass6_Sub17_Sub1Array5);
				}
				local2089 = local1062.method5779(Static289.aClass81_6);
				if (local2089 != null) {
					local2089.aClass44_1 = local1062;
					local2089.anInt3049 = local12;
					local2089.anInt3052 = local6;
					local2089.anInt3048 = local9;
					Static66.aClass109_2.method2935(local2089);
				}
			}
		}
		@Pc(2175) Class187 local2175;
		if (local12 < Static131.anInt2392 - 1) {
			local2175 = Static39.aClass187ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean374) {
				Static59.aClass155_1.method5567(local2175);
			}
		}
		if (local6 < Static339.anInt6187) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean374) {
				Static59.aClass155_1.method5565(local2175);
			}
		}
		if (local9 < Static8.anInt3154) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean374) {
				Static59.aClass155_1.method5565(local2175);
			}
		}
		if (local6 > Static339.anInt6187) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean374) {
				Static59.aClass155_1.method5565(local2175);
			}
		}
		if (local9 > Static8.anInt3154) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean374) {
				Static59.aClass155_1.method5565(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ja;Z)V")
	public static void method2943(@OriginalArg(0) Class81 arg0) {
		if (Static238.anInt5126 != Static343.anInt6225 && (Static39.aClass187ArrayArrayArray1 != null && Static306.method5251(Static343.anInt6225, arg0))) {
			Static238.anInt5126 = Static343.anInt6225;
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V")
	public static void method2944() {
		@Pc(7) Class198 local7 = Static337.aClass198_1;
		synchronized (Static337.aClass198_1) {
			Static292.anInt5505 = Static329.anInt6095;
			Static225.anInt4135++;
			@Pc(22) int local22;
			if (Static69.anInt484 < 0) {
				for (local22 = 0; local22 < 112; local22++) {
					Static354.aBooleanArray30[local22] = false;
				}
				Static69.anInt484 = Static43.anInt865;
			} else {
				while (Static69.anInt484 != Static43.anInt865) {
					local22 = Static298.anIntArray636[Static43.anInt865];
					Static43.anInt865 = Static43.anInt865 + 1 & 0x7F;
					if (local22 >= 0) {
						Static354.aBooleanArray30[local22] = true;
					} else {
						Static354.aBooleanArray30[~local22] = false;
					}
				}
			}
			Static329.anInt6095 = Static47.anInt924;
		}
	}
}
