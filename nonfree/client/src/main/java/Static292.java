import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
	public static int anInt5691;

	@OriginalMember(owner = "client!sn", name = "I", descriptor = "Lclient!fm;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!sn", name = "N", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!qf;Lclient!dg;)V")
	public static void method4787(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class49 arg1) {
		if (!arg1.aBoolean116) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort35;
		@Pc(9) short local9 = arg1.aShort34;
		@Pc(12) byte local12 = arg1.aByte25;
		@Pc(15) byte local15 = arg1.aByte24;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class49[][] local31 = Static229.aClass49ArrayArrayArray6[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static251.aClass8Array6 == Static331.aClass8Array5) {
			local40 = Static20.anIntArrayArray5[local6][local9];
			Static331.aClass89_8.method5417(Static136.aClass8Array3[0].method4169(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static331.aClass89_8.method5463(3000.0F, local58 * 1.5F);
		@Pc(621) Class36_Sub1 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class49 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class36_Sub1 local382;
		@Pc(413) int local413;
		@Pc(416) Class22_Sub4 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean117) {
			if (Static85.aBoolean151) {
				if (local12 > 0) {
					local91 = Static229.aClass49ArrayArrayArray6[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean116) {
						return;
					}
				}
				if (local6 <= Static314.anInt6028 && local6 > Static350.anInt6599) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean116 && (local91.aBoolean117 || (arg1.aByte27 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static314.anInt6028 && local6 < Static63.anInt5457 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean116 && (local91.aBoolean117 || (arg1.aByte27 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static206.anInt4117 && local9 > Static220.anInt4388) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean116 && (local91.aBoolean117 || (arg1.aByte27 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static206.anInt4117 && local9 < Static35.anInt1035 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean116 && (local91.aBoolean117 || (arg1.aByte27 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static85.aBoolean151 = true;
			}
			arg1.aBoolean117 = false;
			if (arg1.aClass49_1 != null) {
				local91 = arg1.aClass49_1;
				Static331.aClass89_8.method5463(3000.0F, (201.5F - (float) (local91.aByte24 + 1) * 50.0F) * 1.5F);
				if (!Static63.method4607(local91.aByte24, local6, local9)) {
					Static331.aClass8Array5[local91.aByte24].method4168(local6, local9);
				}
				@Pc(254) Class22_Sub4 local254 = local91.aClass22_Sub4_1;
				if (local254 != null) {
					if (Static281.aBoolean379) {
						if ((local254.anInt6015 & arg1.aShort36) == 0) {
							Static138.method2797(arg0, local12, local6, local9);
						} else {
							Static318.method473(arg0, local254.anInt6015, local15, local6, local9);
						}
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local254.method5345(Static331.aClass89_8);
				}
				for (@Pc(291) Class47 local291 = local91.aClass47_3; local291 != null; local291 = local291.aClass47_2) {
					@Pc(295) Class22_Sub2 local295 = local291.aClass22_Sub2_1;
					if (local295 != null) {
						if (Static281.aBoolean379) {
							Static138.method2797(arg0, local12, local6, local9);
							Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
						}
						local295.method5345(Static331.aClass89_8);
					}
				}
				Static331.aClass89_8.method5463(3000.0F, local58 * 1.5F);
			}
			local335 = !Static63.method4607(local15, local6, local9);
			if (local335) {
				Static331.aClass8Array5[local15].method4168(local6, local9);
				@Pc(346) Class22_Sub1 local346 = arg1.aClass22_Sub1_1;
				if (local346 != null && local346.aBoolean420) {
					if (local346.aBoolean419) {
						Static331.aClass89_8.method5463(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local382 = local346.method5345(Static331.aClass89_8);
					if (local382 != null) {
						local382.aClass22_1 = local346;
						local382.anInt732 = local12;
						local382.anInt729 = local6;
						local382.anInt733 = local9;
						Static320.aClass191_7.method4872(local382);
					}
					if (local346.aBoolean419) {
						Static331.aClass89_8.method5463(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass22_Sub4_1;
			@Pc(419) Class22_Sub5 local419 = arg1.aClass22_Sub5_2;
			if (local416 != null || local419 != null) {
				if (Static314.anInt6028 == local6) {
					local411++;
				} else if (Static314.anInt6028 < local6) {
					local411 += 2;
				}
				if (Static206.anInt4117 == local9) {
					local411 += 3;
				} else if (Static206.anInt4117 > local9) {
					local411 += 6;
				}
				local413 = Static49.anIntArray202[local411];
				arg1.aShort36 = Static122.aShortArray48[local411];
			}
			if (local416 != null) {
				if ((local416.anInt6015 & Static300.anIntArray733[local411]) == 0) {
					arg1.aByte30 = 0;
				} else if (local416.anInt6015 == 16) {
					arg1.aByte30 = 3;
					arg1.aByte28 = Static51.aByteArray16[local411];
					arg1.aByte26 = (byte) (3 - arg1.aByte28);
				} else if (local416.anInt6015 == 32) {
					arg1.aByte30 = 6;
					arg1.aByte28 = Static304.aByteArray87[local411];
					arg1.aByte26 = (byte) (6 - arg1.aByte28);
				} else if (local416.anInt6015 == 64) {
					arg1.aByte30 = 12;
					arg1.aByte28 = Static176.aByteArray52[local411];
					arg1.aByte26 = (byte) (12 - arg1.aByte28);
				} else {
					arg1.aByte30 = 9;
					arg1.aByte28 = Static249.aByteArray18[local411];
					arg1.aByte26 = (byte) (9 - arg1.aByte28);
				}
				if ((local416.anInt6015 & local413) != 0 && !Static123.method5681(local15, local6, local9, local416.anInt6015)) {
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					@Pc(568) Class36_Sub1 local568 = local416.method5345(Static331.aClass89_8);
					if (local568 != null) {
						local568.aClass22_1 = local416;
						local568.anInt732 = local12;
						local568.anInt729 = local6;
						local568.anInt733 = local9;
						Static320.aClass191_7.method4872(local568);
					}
				}
				@Pc(589) Class22_Sub4 local589 = arg1.aClass22_Sub4_2;
				if (local589 != null && (local589.anInt6015 & local413) != 0 && !Static123.method5681(local15, local6, local9, local589.anInt6015)) {
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local621 = local589.method5345(Static331.aClass89_8);
					if (local621 != null) {
						local621.aClass22_1 = local589;
						local621.anInt732 = local12;
						local621.anInt729 = local6;
						local621.anInt733 = local9;
						Static320.aClass191_7.method4872(local621);
					}
				}
			}
			if (local419 != null && !Static263.method4427(local15, local6, local9, local419.method5351())) {
				@Pc(652) Class22_Sub5 local652 = arg1.aClass22_Sub5_1;
				Static331.aClass89_8.method5463(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt6346 & local413) != 0) {
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local621 = local419.method5345(Static331.aClass89_8);
					if (local621 != null) {
						local621.aClass22_1 = local419;
						local621.anInt732 = local12;
						local621.anInt729 = local6;
						local621.anInt733 = local9;
						Static320.aClass191_7.method4872(local621);
					}
				} else if (local419.anInt6346 == 256) {
					local711 = local419.anInt6344 - Static233.anInt4637;
					local716 = local419.anInt6336 - Static216.anInt4314;
					local719 = local419.anInt6342;
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
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					@Pc(764) Class36_Sub1 local764;
					if (local740 < local728) {
						local764 = local419.method5345(Static331.aClass89_8);
						if (local764 != null) {
							local764.aClass22_1 = local419;
							local764.anInt732 = local12;
							local764.anInt729 = local6;
							local764.anInt733 = local9;
							Static320.aClass191_7.method4872(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5345(Static331.aClass89_8);
						if (local764 != null) {
							local764.aClass22_1 = local652;
							local764.anInt732 = local12;
							local764.anInt729 = local6;
							local764.anInt733 = local9;
							Static320.aClass191_7.method4872(local764);
						}
					}
				}
				Static331.aClass89_8.method5463(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class22_Sub1 local819 = arg1.aClass22_Sub1_1;
				if (local819 != null && !local819.aBoolean420) {
					if (local819.aBoolean419) {
						Static331.aClass89_8.method5463(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local621 = local819.method5345(Static331.aClass89_8);
					if (local621 != null) {
						local621.aClass22_1 = local819;
						local621.anInt732 = local12;
						local621.anInt729 = local6;
						local621.anInt733 = local9;
						Static320.aClass191_7.method4872(local621);
					}
					if (local819.aBoolean419) {
						Static331.aClass89_8.method5463(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class22_Sub3 local885 = arg1.aClass22_Sub3_1;
				if (local885 != null && !local885.aBoolean86) {
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					@Pc(908) Class36_Sub1 local908 = local885.method5345(Static331.aClass89_8);
					if (local908 != null) {
						local908.aClass22_1 = local885;
						local908.anInt732 = local12;
						local908.anInt729 = local6;
						local908.anInt733 = local9;
						Static320.aClass191_7.method4872(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte27;
			if (local929 != 0) {
				@Pc(946) Class49 local946;
				if (local6 < Static314.anInt6028 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean116) {
						Static220.aClass11_1.method2937(local946);
					}
				}
				if (local9 < Static206.anInt4117 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean116) {
						Static220.aClass11_1.method2937(local946);
					}
				}
				if (local6 > Static314.anInt6028 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean116) {
						Static220.aClass11_1.method2937(local946);
					}
				}
				if (local9 > Static206.anInt4117 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean116) {
						Static220.aClass11_1.method2937(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class22_Sub4 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class47 local1035;
		if (arg1.aByte30 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass47_3; local1035 != null; local1035 = local1035.aClass47_2) {
				if (local1035.aClass22_Sub2_1.anInt5966 != Static175.anInt3624 && (local1035.anInt1398 & arg1.aByte30) == arg1.aByte28) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass22_Sub4_1;
				if (!Static123.method5681(local15, local6, local9, local1062.anInt6015)) {
					if (Static281.aBoolean379) {
						label687: {
							if (local1062.anInt6015 >= 16) {
								local1079 = local6 - Static314.anInt6028;
								local1083 = local9 - Static206.anInt4117;
								if (local1062.anInt6015 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static174.anInt3604) {
										Static138.method2797(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6015 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static346.anInt6536 && local9 < Static174.anInt3604) {
										Static138.method2797(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6015 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static346.anInt6536 && local9 > 0) {
										Static138.method2797(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt6015 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static138.method2797(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static138.method2797(arg0, local12, local6, local9);
						}
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					@Pc(1197) Class36_Sub1 local1197 = local1062.method5345(Static331.aClass89_8);
					if (local1197 != null) {
						local1197.aClass22_1 = local1062;
						local1197.anInt732 = local12;
						local1197.anInt729 = local6;
						local1197.anInt733 = local9;
						Static320.aClass191_7.method4872(local1197);
					}
				}
				arg1.aByte30 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean118) {
			try {
				arg1.aBoolean118 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass47_3; local1035 != null; local1035 = local1035.aClass47_2) {
					@Pc(1233) Class22_Sub2 local1233 = local1035.aClass22_Sub2_1;
					if (local1233.anInt5966 != Static175.anInt3624) {
						for (local1079 = local1233.aShort83; local1079 <= local1233.aShort82; local1079++) {
							for (local1083 = local1233.aShort81; local1083 <= local1233.aShort84; local1083++) {
								@Pc(1251) Class49 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean117) {
									arg1.aBoolean118 = true;
									continue label630;
								}
								if (local1251.aByte30 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort83) {
										local711++;
									}
									if (local1079 < local1233.aShort82) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort81) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort84) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte30) == arg1.aByte26) {
										arg1.aBoolean118 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static314.anInt6028 - local1233.aShort83;
						local1314 = local1233.aShort82 - Static314.anInt6028;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static206.anInt4117 - local1233.aShort81;
						local716 = local1233.aShort84 - Static206.anInt4117;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass22_Sub2Array2[local40] = local1233;
						arg0.anIntArray503[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class22_Sub2 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass22_Sub2Array2[local1083];
						if (local1365.anInt5966 != Static175.anInt3624) {
							local711 = arg0.anIntArray503[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5973 - Static233.anInt4637;
								local719 = local1365.anInt5967 - Static216.anInt4314;
								local728 = arg0.aClass22_Sub2Array2[local1079].anInt5973 - Static233.anInt4637;
								local740 = arg0.aClass22_Sub2Array2[local1079].anInt5967 - Static216.anInt4314;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass22_Sub2Array2[local1079];
					local1365.anInt5966 = Static175.anInt3624;
					if (!Static68.method1367(local15, local1365.aShort83, local1365.aShort82, local1365.aShort81, local1365.aShort84, local1365.method5057())) {
						if (Static281.aBoolean379) {
							if (local1365.aByte68 == 0) {
								Static29.method510(arg0, local12, local1365.aShort83, local1365.aShort81, local1365.aShort82, local1365.aShort84);
							} else {
								Static138.method2797(arg0, local12, local6, local9);
								local711 = local6 - Static314.anInt6028;
								local716 = local9 - Static206.anInt4117;
								if (local1365.aByte68 == 2) {
									if (local716 > -local711) {
										Static91.method5055(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static91.method5055(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static91.method5055(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static91.method5055(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
						}
						local621 = local1365.method5345(Static331.aClass89_8);
						if (local621 != null) {
							local621.aClass22_1 = local1365;
							local621.anInt732 = local12;
							local621.anInt729 = local1365.aShort83;
							local621.anInt733 = local1365.aShort81;
							Static320.aClass191_7.method4872(local621);
						}
					}
					for (local711 = local1365.aShort83; local711 <= local1365.aShort82; local711++) {
						for (local716 = local1365.aShort81; local716 <= local1365.aShort84; local716++) {
							@Pc(1590) Class49 local1590 = local31[local711][local716];
							if (local1590.aByte30 != 0) {
								Static220.aClass11_1.method2937(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean116) {
								Static220.aClass11_1.method2937(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean118) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean118 = false;
			}
		}
		if (arg1.aClass24_1 != null) {
			if (arg1.aByte29 == (byte) (Static315.anInt6044 & 0xFF)) {
				@Pc(1645) Class24 local1645 = arg1.aClass24_1;
				local411 = Static331.aClass8Array5[local12].method4173(local6, local9);
				if (local12 < 3) {
					local413 = Static331.aClass8Array5[local12].method4173(local6, local9) - Static331.aClass8Array5[local12 + 1].method4173(local6, local9);
				} else {
					local413 = 1024;
				}
				Static103.aClass70_6.method3710(local21, local411, local27, arg0.anIntArray504);
				local1079 = arg0.anIntArray504[2];
				Static103.aClass70_6.method3710(local21, local411 - local413, local27, arg0.anIntArray504);
				local1083 = arg0.anIntArray504[2];
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
				local1645.anInt479 = local1314;
				local1645.anInt477 = local711;
				local1645.aBoolean26 = true;
				Static331.aClass89_8.method5422(local1645);
			} else {
				arg1.aClass24_1 = null;
			}
		}
		if (!arg1.aBoolean116) {
			return;
		}
		if (arg1.aByte30 != 0) {
			return;
		}
		if (local6 <= Static314.anInt6028 && local6 > Static350.anInt6599) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean116) {
				return;
			}
		}
		if (local6 >= Static314.anInt6028 && local6 < Static63.anInt5457 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean116) {
				return;
			}
		}
		if (local9 <= Static206.anInt4117 && local9 > Static220.anInt4388) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean116) {
				return;
			}
		}
		if (local9 >= Static206.anInt4117 && local9 < Static35.anInt1035 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean116) {
				return;
			}
		}
		arg1.aBoolean116 = false;
		Static109.anInt63--;
		@Pc(1839) Class22_Sub3 local1839 = arg1.aClass22_Sub3_1;
		if (local1839 != null && local1839.aBoolean86) {
			if (Static281.aBoolean379) {
				Static138.method2797(arg0, local12, local6, local9);
				Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
			}
			@Pc(1862) Class36_Sub1 local1862 = local1839.method5345(Static331.aClass89_8);
			if (local1862 != null) {
				local1862.aClass22_1 = local1839;
				local1862.anInt732 = local12;
				local1862.anInt729 = local6;
				local1862.anInt733 = local9;
				Static320.aClass191_7.method4872(local1862);
			}
		}
		if (arg1.aShort36 != 0) {
			@Pc(1886) Class22_Sub5 local1886 = arg1.aClass22_Sub5_2;
			if (local1886 != null && !Static263.method4427(local15, local6, local9, local1886.method5351())) {
				if ((local1886.anInt6346 & arg1.aShort36) != 0) {
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					local382 = local1886.method5345(Static331.aClass89_8);
					if (local382 != null) {
						local382.aClass22_1 = local1886;
						local382.anInt732 = local12;
						local382.anInt729 = local6;
						local382.anInt733 = local9;
						Static320.aClass191_7.method4872(local382);
					}
				} else if (local1886.anInt6346 == 256) {
					local413 = local1886.anInt6344 - Static233.anInt4637;
					local1079 = local1886.anInt6336 - Static216.anInt4314;
					local1083 = local1886.anInt6342;
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
					if (Static281.aBoolean379) {
						Static138.method2797(arg0, local12, local6, local9);
						Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
					}
					@Pc(1996) Class22_Sub5 local1996 = arg1.aClass22_Sub5_1;
					@Pc(2004) Class36_Sub1 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5345(Static331.aClass89_8);
						if (local2004 != null) {
							local2004.aClass22_1 = local1886;
							local2004.anInt732 = local12;
							local2004.anInt729 = local6;
							local2004.anInt733 = local9;
							Static320.aClass191_7.method4872(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5345(Static331.aClass89_8);
						if (local2004 != null) {
							local2004.aClass22_1 = local1996;
							local2004.anInt732 = local12;
							local2004.anInt729 = local6;
							local2004.anInt733 = local9;
							Static320.aClass191_7.method4872(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass22_Sub4_1;
			local416 = arg1.aClass22_Sub4_2;
			@Pc(2089) Class36_Sub1 local2089;
			if (local416 != null && (local416.anInt6015 & arg1.aShort36) != 0 && !Static123.method5681(local15, local6, local9, local416.anInt6015)) {
				if (Static281.aBoolean379) {
					Static318.method473(arg0, local416.anInt6015, local12, local6, local9);
					Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
				}
				local2089 = local416.method5345(Static331.aClass89_8);
				if (local2089 != null) {
					local2089.aClass22_1 = local416;
					local2089.anInt732 = local12;
					local2089.anInt729 = local6;
					local2089.anInt733 = local9;
					Static320.aClass191_7.method4872(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt6015 & arg1.aShort36) != 0 && !Static123.method5681(local15, local6, local9, local1062.anInt6015)) {
				if (Static281.aBoolean379) {
					Static318.method473(arg0, local1062.anInt6015, local12, local6, local9);
					Static331.aClass89_8.method5470(arg0.anInt3695, arg0.aClass7_Sub16_Sub1Array3);
				}
				local2089 = local1062.method5345(Static331.aClass89_8);
				if (local2089 != null) {
					local2089.aClass22_1 = local1062;
					local2089.anInt732 = local12;
					local2089.anInt729 = local6;
					local2089.anInt733 = local9;
					Static320.aClass191_7.method4872(local2089);
				}
			}
		}
		@Pc(2175) Class49 local2175;
		if (local12 < Static41.anInt1075 - 1) {
			local2175 = Static229.aClass49ArrayArrayArray6[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean116) {
				Static220.aClass11_1.method2939(local2175);
			}
		}
		if (local6 < Static314.anInt6028) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean116) {
				Static220.aClass11_1.method2937(local2175);
			}
		}
		if (local9 < Static206.anInt4117) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean116) {
				Static220.aClass11_1.method2937(local2175);
			}
		}
		if (local6 > Static314.anInt6028) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean116) {
				Static220.aClass11_1.method2937(local2175);
			}
		}
		if (local9 > Static206.anInt4117) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean116) {
				Static220.aClass11_1.method2937(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!bi;I)V")
	public static void method4789(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte10 == 0) {
			arg1.anInt540 = arg1.anInt562;
		} else if (arg1.aByte10 == 1) {
			arg1.anInt540 = (arg2 - arg1.anInt523) / 2 + arg1.anInt562;
		} else if (arg1.aByte10 == 2) {
			arg1.anInt540 = arg2 - arg1.anInt562 - arg1.anInt523;
		} else if (arg1.aByte10 == 3) {
			arg1.anInt540 = arg2 * arg1.anInt562 >> 14;
		} else if (arg1.aByte10 == 4) {
			arg1.anInt540 = (arg2 * arg1.anInt562 >> 14) + (arg2 - arg1.anInt523) / 2;
		} else {
			arg1.anInt540 = arg2 - (arg1.anInt562 * arg2 >> 14) - arg1.anInt523;
		}
		if (arg1.aByte11 == 0) {
			arg1.anInt519 = arg1.anInt514;
		} else if (arg1.aByte11 == 1) {
			arg1.anInt519 = (arg0 - arg1.anInt515) / 2 + arg1.anInt514;
		} else if (arg1.aByte11 == 2) {
			arg1.anInt519 = arg0 - arg1.anInt515 - arg1.anInt514;
		} else if (arg1.aByte11 == 3) {
			arg1.anInt519 = arg1.anInt514 * arg0 >> 14;
		} else if (arg1.aByte11 == 4) {
			arg1.anInt519 = (arg0 - arg1.anInt515) / 2 + (arg0 * arg1.anInt514 >> 14);
		} else {
			arg1.anInt519 = arg0 - (arg1.anInt514 * arg0 >> 14) - arg1.anInt515;
		}
		if (!Static105.aBoolean439 || Static45.method1034(arg1).anInt4221 == 0 && arg1.anInt520 != 0) {
			return;
		}
		if (arg1.anInt519 < 0) {
			arg1.anInt519 = 0;
		} else if (arg0 < arg1.anInt515 + arg1.anInt519) {
			arg1.anInt519 = arg0 - arg1.anInt515;
		}
		if (arg1.anInt540 < 0) {
			arg1.anInt540 = 0;
		} else if (arg1.anInt523 + arg1.anInt540 > arg2) {
			arg1.anInt540 = arg2 - arg1.anInt523;
		}
	}
}
