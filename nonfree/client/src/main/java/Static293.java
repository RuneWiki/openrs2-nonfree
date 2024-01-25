import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!m;")
	public static Class127 aClass127_40;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!ir;")
	public static Class100 aClass100_121;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public static int anInt6248;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
	public static int anInt6246 = 0;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public static int anInt6247 = 1;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!nb;Lclient!dh;)V")
	public static void method5300(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class45 arg1) {
		if (!arg1.aBoolean64) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort8;
		@Pc(9) short local9 = arg1.aShort7;
		@Pc(12) byte local12 = arg1.aByte5;
		@Pc(15) byte local15 = arg1.aByte7;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class45[][] local31 = Static256.aClass45ArrayArrayArray2[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static182.aClass22Array2 == Static69.aClass22Array1) {
			local40 = Static245.anIntArrayArray46[local6][local9];
			Static140.aClass122_3.method4805(Static355.aClass22Array3[0].method4678(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static140.aClass122_3.method4744(3000.0F, local58 * 1.5F);
		@Pc(621) Class8_Sub7 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class45 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class8_Sub7 local382;
		@Pc(413) int local413;
		@Pc(416) Class5_Sub5 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean63) {
			if (Static174.aBoolean197) {
				if (local12 > 0) {
					local91 = Static256.aClass45ArrayArrayArray2[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean64) {
						return;
					}
				}
				if (local6 <= Static74.anInt1441 && local6 > Static309.anInt6136) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean64 && (local91.aBoolean63 || (arg1.aByte8 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static74.anInt1441 && local6 < Static127.anInt2725 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean64 && (local91.aBoolean63 || (arg1.aByte8 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static89.anInt6705 && local9 > Static88.anInt1752) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean64 && (local91.aBoolean63 || (arg1.aByte8 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static89.anInt6705 && local9 < Static36.anInt806 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean64 && (local91.aBoolean63 || (arg1.aByte8 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static174.aBoolean197 = true;
			}
			arg1.aBoolean63 = false;
			if (arg1.aClass45_1 != null) {
				local91 = arg1.aClass45_1;
				Static140.aClass122_3.method4744(3000.0F, (201.5F - (float) (local91.aByte7 + 1) * 50.0F) * 1.5F);
				if (!Static213.method3734(local91.aByte7, local6, local9)) {
					Static69.aClass22Array1[local91.aByte7].method4675(local6, local9);
				}
				@Pc(254) Class5_Sub5 local254 = local91.aClass5_Sub5_1;
				if (local254 != null) {
					if (Static201.aBoolean235) {
						if ((local254.anInt6285 & arg1.aShort9) == 0) {
							Static323.method5293(arg0, local12, local6, local9);
						} else {
							Static257.method4356(arg0, local254.anInt6285, local15, local6, local9);
						}
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local254.method5329(Static140.aClass122_3);
				}
				for (@Pc(291) Class160 local291 = local91.aClass160_1; local291 != null; local291 = local291.aClass160_3) {
					@Pc(295) Class5_Sub4 local295 = local291.aClass5_Sub4_1;
					if (local295 != null) {
						if (Static201.aBoolean235) {
							Static323.method5293(arg0, local12, local6, local9);
							Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
						}
						local295.method5329(Static140.aClass122_3);
					}
				}
				Static140.aClass122_3.method4744(3000.0F, local58 * 1.5F);
			}
			local335 = !Static213.method3734(local15, local6, local9);
			if (local335) {
				Static69.aClass22Array1[local15].method4675(local6, local9);
				@Pc(346) Class5_Sub3 local346 = arg1.aClass5_Sub3_1;
				if (local346 != null && local346.aBoolean341) {
					if (local346.aBoolean340) {
						Static140.aClass122_3.method4744(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local382 = local346.method5329(Static140.aClass122_3);
					if (local382 != null) {
						local382.aClass5_1 = local346;
						local382.anInt5412 = local12;
						local382.anInt5409 = local6;
						local382.anInt5411 = local9;
						Static35.aClass65_5.method1458(local382);
					}
					if (local346.aBoolean340) {
						Static140.aClass122_3.method4744(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass5_Sub5_1;
			@Pc(419) Class5_Sub1 local419 = arg1.aClass5_Sub1_1;
			if (local416 != null || local419 != null) {
				if (Static74.anInt1441 == local6) {
					local411++;
				} else if (Static74.anInt1441 < local6) {
					local411 += 2;
				}
				if (Static89.anInt6705 == local9) {
					local411 += 3;
				} else if (Static89.anInt6705 > local9) {
					local411 += 6;
				}
				local413 = Static237.anIntArray378[local411];
				arg1.aShort9 = Static21.aShortArray15[local411];
			}
			if (local416 != null) {
				if ((local416.anInt6285 & Static58.anIntArray82[local411]) == 0) {
					arg1.aByte9 = 0;
				} else if (local416.anInt6285 == 16) {
					arg1.aByte9 = 3;
					arg1.aByte10 = Static235.aByteArray77[local411];
					arg1.aByte6 = (byte) (3 - arg1.aByte10);
				} else if (local416.anInt6285 == 32) {
					arg1.aByte9 = 6;
					arg1.aByte10 = Static147.aByteArray57[local411];
					arg1.aByte6 = (byte) (6 - arg1.aByte10);
				} else if (local416.anInt6285 == 64) {
					arg1.aByte9 = 12;
					arg1.aByte10 = Static195.aByteArray67[local411];
					arg1.aByte6 = (byte) (12 - arg1.aByte10);
				} else {
					arg1.aByte9 = 9;
					arg1.aByte10 = Static152.aByteArray58[local411];
					arg1.aByte6 = (byte) (9 - arg1.aByte10);
				}
				if ((local416.anInt6285 & local413) != 0 && !Static174.method2866(local15, local6, local9, local416.anInt6285)) {
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					@Pc(568) Class8_Sub7 local568 = local416.method5329(Static140.aClass122_3);
					if (local568 != null) {
						local568.aClass5_1 = local416;
						local568.anInt5412 = local12;
						local568.anInt5409 = local6;
						local568.anInt5411 = local9;
						Static35.aClass65_5.method1458(local568);
					}
				}
				@Pc(589) Class5_Sub5 local589 = arg1.aClass5_Sub5_2;
				if (local589 != null && (local589.anInt6285 & local413) != 0 && !Static174.method2866(local15, local6, local9, local589.anInt6285)) {
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local621 = local589.method5329(Static140.aClass122_3);
					if (local621 != null) {
						local621.aClass5_1 = local589;
						local621.anInt5412 = local12;
						local621.anInt5409 = local6;
						local621.anInt5411 = local9;
						Static35.aClass65_5.method1458(local621);
					}
				}
			}
			if (local419 != null && !Static100.method1720(local15, local6, local9, local419.method2536())) {
				@Pc(652) Class5_Sub1 local652 = arg1.aClass5_Sub1_2;
				Static140.aClass122_3.method4744(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt3097 & local413) != 0) {
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local621 = local419.method5329(Static140.aClass122_3);
					if (local621 != null) {
						local621.aClass5_1 = local419;
						local621.anInt5412 = local12;
						local621.anInt5409 = local6;
						local621.anInt5411 = local9;
						Static35.aClass65_5.method1458(local621);
					}
				} else if (local419.anInt3097 == 256) {
					local711 = local419.anInt3089 - Static55.anInt5576;
					local716 = local419.anInt3103 - Static300.anInt5966;
					local719 = local419.anInt3092;
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
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					@Pc(764) Class8_Sub7 local764;
					if (local740 < local728) {
						local764 = local419.method5329(Static140.aClass122_3);
						if (local764 != null) {
							local764.aClass5_1 = local419;
							local764.anInt5412 = local12;
							local764.anInt5409 = local6;
							local764.anInt5411 = local9;
							Static35.aClass65_5.method1458(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5329(Static140.aClass122_3);
						if (local764 != null) {
							local764.aClass5_1 = local652;
							local764.anInt5412 = local12;
							local764.anInt5409 = local6;
							local764.anInt5411 = local9;
							Static35.aClass65_5.method1458(local764);
						}
					}
				}
				Static140.aClass122_3.method4744(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class5_Sub3 local819 = arg1.aClass5_Sub3_1;
				if (local819 != null && !local819.aBoolean341) {
					if (local819.aBoolean340) {
						Static140.aClass122_3.method4744(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local621 = local819.method5329(Static140.aClass122_3);
					if (local621 != null) {
						local621.aClass5_1 = local819;
						local621.anInt5412 = local12;
						local621.anInt5409 = local6;
						local621.anInt5411 = local9;
						Static35.aClass65_5.method1458(local621);
					}
					if (local819.aBoolean340) {
						Static140.aClass122_3.method4744(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class5_Sub2 local885 = arg1.aClass5_Sub2_1;
				if (local885 != null && !local885.aBoolean107) {
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					@Pc(908) Class8_Sub7 local908 = local885.method5329(Static140.aClass122_3);
					if (local908 != null) {
						local908.aClass5_1 = local885;
						local908.anInt5412 = local12;
						local908.anInt5409 = local6;
						local908.anInt5411 = local9;
						Static35.aClass65_5.method1458(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte8;
			if (local929 != 0) {
				@Pc(946) Class45 local946;
				if (local6 < Static74.anInt1441 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean64) {
						Static71.aClass103_3.method5640(local946);
					}
				}
				if (local9 < Static89.anInt6705 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean64) {
						Static71.aClass103_3.method5640(local946);
					}
				}
				if (local6 > Static74.anInt1441 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean64) {
						Static71.aClass103_3.method5640(local946);
					}
				}
				if (local9 > Static89.anInt6705 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean64) {
						Static71.aClass103_3.method5640(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class5_Sub5 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class160 local1035;
		if (arg1.aByte9 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass160_1; local1035 != null; local1035 = local1035.aClass160_3) {
				if (local1035.aClass5_Sub4_1.anInt5904 != Static287.anInt5782 && (local1035.anInt4807 & arg1.aByte9) == arg1.aByte10) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass5_Sub5_1;
				if (!Static174.method2866(local15, local6, local9, local1062.anInt6285)) {
					if (Static201.aBoolean235) {
						label687: {
							if (local1062.anInt6285 >= 16) {
								local1079 = local6 - Static74.anInt1441;
								local1083 = local9 - Static89.anInt6705;
								if (local1062.anInt6285 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static116.anInt2499) {
										Static323.method5293(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6285 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static103.anInt2156 && local9 < Static116.anInt2499) {
										Static323.method5293(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6285 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static103.anInt2156 && local9 > 0) {
										Static323.method5293(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt6285 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static323.method5293(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static323.method5293(arg0, local12, local6, local9);
						}
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					@Pc(1197) Class8_Sub7 local1197 = local1062.method5329(Static140.aClass122_3);
					if (local1197 != null) {
						local1197.aClass5_1 = local1062;
						local1197.anInt5412 = local12;
						local1197.anInt5409 = local6;
						local1197.anInt5411 = local9;
						Static35.aClass65_5.method1458(local1197);
					}
				}
				arg1.aByte9 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean65) {
			try {
				arg1.aBoolean65 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass160_1; local1035 != null; local1035 = local1035.aClass160_3) {
					@Pc(1233) Class5_Sub4 local1233 = local1035.aClass5_Sub4_1;
					if (local1233.anInt5904 != Static287.anInt5782) {
						for (local1079 = local1233.aShort86; local1079 <= local1233.aShort89; local1079++) {
							for (local1083 = local1233.aShort87; local1083 <= local1233.aShort88; local1083++) {
								@Pc(1251) Class45 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean63) {
									arg1.aBoolean65 = true;
									continue label630;
								}
								if (local1251.aByte9 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort86) {
										local711++;
									}
									if (local1079 < local1233.aShort89) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort87) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort88) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte9) == arg1.aByte6) {
										arg1.aBoolean65 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static74.anInt1441 - local1233.aShort86;
						local1314 = local1233.aShort89 - Static74.anInt1441;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static89.anInt6705 - local1233.aShort87;
						local716 = local1233.aShort88 - Static89.anInt6705;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass5_Sub4Array2[local40] = local1233;
						arg0.anIntArray5[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class5_Sub4 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass5_Sub4Array2[local1083];
						if (local1365.anInt5904 != Static287.anInt5782) {
							local711 = arg0.anIntArray5[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5901 - Static55.anInt5576;
								local719 = local1365.anInt5905 - Static300.anInt5966;
								local728 = arg0.aClass5_Sub4Array2[local1079].anInt5901 - Static55.anInt5576;
								local740 = arg0.aClass5_Sub4Array2[local1079].anInt5905 - Static300.anInt5966;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass5_Sub4Array2[local1079];
					local1365.anInt5904 = Static287.anInt5782;
					if (!Static33.method634(local15, local1365.aShort86, local1365.aShort89, local1365.aShort87, local1365.aShort88, local1365.method5039())) {
						if (Static201.aBoolean235) {
							if (local1365.aByte68 == 0) {
								Static299.method5072(arg0, local12, local1365.aShort86, local1365.aShort87, local1365.aShort89, local1365.aShort88);
							} else {
								Static323.method5293(arg0, local12, local6, local9);
								local711 = local6 - Static74.anInt1441;
								local716 = local9 - Static89.anInt6705;
								if (local1365.aByte68 == 2) {
									if (local716 > -local711) {
										Static208.method3583(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static208.method3583(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static208.method3583(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static208.method3583(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
						}
						local621 = local1365.method5329(Static140.aClass122_3);
						if (local621 != null) {
							local621.aClass5_1 = local1365;
							local621.anInt5412 = local12;
							local621.anInt5409 = local1365.aShort86;
							local621.anInt5411 = local1365.aShort87;
							Static35.aClass65_5.method1458(local621);
						}
					}
					for (local711 = local1365.aShort86; local711 <= local1365.aShort89; local711++) {
						for (local716 = local1365.aShort87; local716 <= local1365.aShort88; local716++) {
							@Pc(1590) Class45 local1590 = local31[local711][local716];
							if (local1590.aByte9 != 0) {
								Static71.aClass103_3.method5640(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean64) {
								Static71.aClass103_3.method5640(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean65) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean65 = false;
			}
		}
		if (arg1.aClass9_1 != null) {
			if (arg1.aByte11 == (byte) (Static268.anInt5408 & 0xFF)) {
				@Pc(1645) Class9 local1645 = arg1.aClass9_1;
				local411 = Static69.aClass22Array1[local12].method4672(local6, local9);
				if (local12 < 3) {
					local413 = Static69.aClass22Array1[local12].method4672(local6, local9) - Static69.aClass22Array1[local12 + 1].method4672(local6, local9);
				} else {
					local413 = 1024;
				}
				Static147.aClass56_2.method4689(local21, local411, local27, arg0.anIntArray4);
				local1079 = arg0.anIntArray4[2];
				Static147.aClass56_2.method4689(local21, local411 - local413, local27, arg0.anIntArray4);
				local1083 = arg0.anIntArray4[2];
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
				local1645.anInt250 = local1314;
				local1645.anInt246 = local711;
				local1645.aBoolean21 = true;
				Static140.aClass122_3.method4721(local1645);
			} else {
				arg1.aClass9_1 = null;
			}
		}
		if (!arg1.aBoolean64) {
			return;
		}
		if (arg1.aByte9 != 0) {
			return;
		}
		if (local6 <= Static74.anInt1441 && local6 > Static309.anInt6136) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean64) {
				return;
			}
		}
		if (local6 >= Static74.anInt1441 && local6 < Static127.anInt2725 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean64) {
				return;
			}
		}
		if (local9 <= Static89.anInt6705 && local9 > Static88.anInt1752) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean64) {
				return;
			}
		}
		if (local9 >= Static89.anInt6705 && local9 < Static36.anInt806 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean64) {
				return;
			}
		}
		arg1.aBoolean64 = false;
		Static227.anInt4637--;
		@Pc(1839) Class5_Sub2 local1839 = arg1.aClass5_Sub2_1;
		if (local1839 != null && local1839.aBoolean107) {
			if (Static201.aBoolean235) {
				Static323.method5293(arg0, local12, local6, local9);
				Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
			}
			@Pc(1862) Class8_Sub7 local1862 = local1839.method5329(Static140.aClass122_3);
			if (local1862 != null) {
				local1862.aClass5_1 = local1839;
				local1862.anInt5412 = local12;
				local1862.anInt5409 = local6;
				local1862.anInt5411 = local9;
				Static35.aClass65_5.method1458(local1862);
			}
		}
		if (arg1.aShort9 != 0) {
			@Pc(1886) Class5_Sub1 local1886 = arg1.aClass5_Sub1_1;
			if (local1886 != null && !Static100.method1720(local15, local6, local9, local1886.method2536())) {
				if ((local1886.anInt3097 & arg1.aShort9) != 0) {
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					local382 = local1886.method5329(Static140.aClass122_3);
					if (local382 != null) {
						local382.aClass5_1 = local1886;
						local382.anInt5412 = local12;
						local382.anInt5409 = local6;
						local382.anInt5411 = local9;
						Static35.aClass65_5.method1458(local382);
					}
				} else if (local1886.anInt3097 == 256) {
					local413 = local1886.anInt3089 - Static55.anInt5576;
					local1079 = local1886.anInt3103 - Static300.anInt5966;
					local1083 = local1886.anInt3092;
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
					if (Static201.aBoolean235) {
						Static323.method5293(arg0, local12, local6, local9);
						Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
					}
					@Pc(1996) Class5_Sub1 local1996 = arg1.aClass5_Sub1_2;
					@Pc(2004) Class8_Sub7 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5329(Static140.aClass122_3);
						if (local2004 != null) {
							local2004.aClass5_1 = local1886;
							local2004.anInt5412 = local12;
							local2004.anInt5409 = local6;
							local2004.anInt5411 = local9;
							Static35.aClass65_5.method1458(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5329(Static140.aClass122_3);
						if (local2004 != null) {
							local2004.aClass5_1 = local1996;
							local2004.anInt5412 = local12;
							local2004.anInt5409 = local6;
							local2004.anInt5411 = local9;
							Static35.aClass65_5.method1458(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass5_Sub5_1;
			local416 = arg1.aClass5_Sub5_2;
			@Pc(2089) Class8_Sub7 local2089;
			if (local416 != null && (local416.anInt6285 & arg1.aShort9) != 0 && !Static174.method2866(local15, local6, local9, local416.anInt6285)) {
				if (Static201.aBoolean235) {
					Static257.method4356(arg0, local416.anInt6285, local12, local6, local9);
					Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
				}
				local2089 = local416.method5329(Static140.aClass122_3);
				if (local2089 != null) {
					local2089.aClass5_1 = local416;
					local2089.anInt5412 = local12;
					local2089.anInt5409 = local6;
					local2089.anInt5411 = local9;
					Static35.aClass65_5.method1458(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt6285 & arg1.aShort9) != 0 && !Static174.method2866(local15, local6, local9, local1062.anInt6285)) {
				if (Static201.aBoolean235) {
					Static257.method4356(arg0, local1062.anInt6285, local12, local6, local9);
					Static140.aClass122_3.method4742(arg0.anInt63, arg0.aClass3_Sub13_Sub1Array2);
				}
				local2089 = local1062.method5329(Static140.aClass122_3);
				if (local2089 != null) {
					local2089.aClass5_1 = local1062;
					local2089.anInt5412 = local12;
					local2089.anInt5409 = local6;
					local2089.anInt5411 = local9;
					Static35.aClass65_5.method1458(local2089);
				}
			}
		}
		@Pc(2175) Class45 local2175;
		if (local12 < Static131.anInt2754 - 1) {
			local2175 = Static256.aClass45ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean64) {
				Static71.aClass103_3.method5632(local2175);
			}
		}
		if (local6 < Static74.anInt1441) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean64) {
				Static71.aClass103_3.method5640(local2175);
			}
		}
		if (local9 < Static89.anInt6705) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean64) {
				Static71.aClass103_3.method5640(local2175);
			}
		}
		if (local6 > Static74.anInt1441) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean64) {
				Static71.aClass103_3.method5640(local2175);
			}
		}
		if (local9 > Static89.anInt6705) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean64) {
				Static71.aClass103_3.method5640(local2175);
			}
		}
	}
}
