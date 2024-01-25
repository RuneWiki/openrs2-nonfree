import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!le;")
	public static final Class122 aClass122_1 = new Class122(128);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIIIIII)V")
	public static void method71(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(14) int local14 = arg0 - arg1;
		for (@Pc(16) int local16 = arg4; local16 < local9; local16++) {
			Static160.method2840(arg5, arg2, arg3, Static129.anIntArrayArray46[local16]);
		}
		for (@Pc(41) int local41 = arg0; local41 > local14; local41--) {
			Static160.method2840(arg5, arg2, arg3, Static129.anIntArrayArray46[local41]);
		}
		@Pc(59) int local59 = arg1 + arg3;
		@Pc(64) int local64 = arg2 - arg1;
		for (@Pc(66) int local66 = local9; local66 <= local14; local66++) {
			@Pc(72) int[] local72 = Static129.anIntArrayArray46[local66];
			Static160.method2840(arg5, local59, arg3, local72);
			Static160.method2840(arg6, local64, local59, local72);
			Static160.method2840(arg5, arg2, local64, local72);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gg;Lclient!r;)V")
	public static void method72(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class174 arg1) {
		if (!arg1.aBoolean439) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort72;
		@Pc(9) short local9 = arg1.aShort71;
		@Pc(12) byte local12 = arg1.aByte48;
		@Pc(15) byte local15 = arg1.aByte44;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class174[][] local31 = Static178.aClass174ArrayArrayArray3[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static219.aClass51Array3 == Static8.aClass51Array1) {
			local40 = Static127.anIntArrayArray45[local6][local9];
			Static42.aClass55_3.method5163(Static56.aClass51Array2[0].method1844(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static42.aClass55_3.method5156(3000.0F, local58 * 1.5F);
		@Pc(621) Class32_Sub4 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class174 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class32_Sub4 local382;
		@Pc(413) int local413;
		@Pc(416) Class4_Sub3 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean438) {
			if (Static88.aBoolean116) {
				if (local12 > 0) {
					local91 = Static178.aClass174ArrayArrayArray3[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean439) {
						return;
					}
				}
				if (local6 <= Static66.anInt5817 && local6 > Static329.anInt6378) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean439 && (local91.aBoolean438 || (arg1.aByte45 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static66.anInt5817 && local6 < Static325.anInt6299 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean439 && (local91.aBoolean438 || (arg1.aByte45 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static150.anInt2937 && local9 > Static12.anInt3796) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean439 && (local91.aBoolean438 || (arg1.aByte45 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static150.anInt2937 && local9 < Static142.anInt2744 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean439 && (local91.aBoolean438 || (arg1.aByte45 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static88.aBoolean116 = true;
			}
			arg1.aBoolean438 = false;
			if (arg1.aClass174_1 != null) {
				local91 = arg1.aClass174_1;
				Static42.aClass55_3.method5156(3000.0F, (201.5F - (float) (local91.aByte44 + 1) * 50.0F) * 1.5F);
				if (!Static14.method278(local91.aByte44, local6, local9)) {
					Static8.aClass51Array1[local91.aByte44].method1843(local6, local9);
				}
				@Pc(254) Class4_Sub3 local254 = local91.aClass4_Sub3_2;
				if (local254 != null) {
					if (Static115.aBoolean163) {
						if ((local254.anInt5786 & arg1.aShort73) == 0) {
							Static111.method1963(arg0, local12, local6, local9);
						} else {
							Static172.method4061(arg0, local254.anInt5786, local15, local6, local9);
						}
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local254.method5898(Static42.aClass55_3);
				}
				for (@Pc(291) Class84 local291 = local91.aClass84_3; local291 != null; local291 = local291.aClass84_2) {
					@Pc(295) Class4_Sub5 local295 = local291.aClass4_Sub5_1;
					if (local295 != null) {
						if (Static115.aBoolean163) {
							Static111.method1963(arg0, local12, local6, local9);
							Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
						}
						local295.method5898(Static42.aClass55_3);
					}
				}
				Static42.aClass55_3.method5156(3000.0F, local58 * 1.5F);
			}
			local335 = !Static14.method278(local15, local6, local9);
			if (local335) {
				Static8.aClass51Array1[local15].method1843(local6, local9);
				@Pc(346) Class4_Sub4 local346 = arg1.aClass4_Sub4_1;
				if (local346 != null && local346.aBoolean224) {
					if (local346.aBoolean223) {
						Static42.aClass55_3.method5156(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local382 = local346.method5898(Static42.aClass55_3);
					if (local382 != null) {
						local382.aClass4_1 = local346;
						local382.anInt4089 = local12;
						local382.anInt4088 = local6;
						local382.anInt4091 = local9;
						Static70.aClass39_1.method809(local382);
					}
					if (local346.aBoolean223) {
						Static42.aClass55_3.method5156(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass4_Sub3_2;
			@Pc(419) Class4_Sub1 local419 = arg1.aClass4_Sub1_2;
			if (local416 != null || local419 != null) {
				if (Static66.anInt5817 == local6) {
					local411++;
				} else if (Static66.anInt5817 < local6) {
					local411 += 2;
				}
				if (Static150.anInt2937 == local9) {
					local411 += 3;
				} else if (Static150.anInt2937 > local9) {
					local411 += 6;
				}
				local413 = Static193.anIntArray369[local411];
				arg1.aShort73 = Static277.aShortArray93[local411];
			}
			if (local416 != null) {
				if ((local416.anInt5786 & Static37.anIntArray74[local411]) == 0) {
					arg1.aByte47 = 0;
				} else if (local416.anInt5786 == 16) {
					arg1.aByte47 = 3;
					arg1.aByte50 = Static48.aByteArray7[local411];
					arg1.aByte46 = (byte) (3 - arg1.aByte50);
				} else if (local416.anInt5786 == 32) {
					arg1.aByte47 = 6;
					arg1.aByte50 = Static286.aByteArray88[local411];
					arg1.aByte46 = (byte) (6 - arg1.aByte50);
				} else if (local416.anInt5786 == 64) {
					arg1.aByte47 = 12;
					arg1.aByte50 = Static134.aByteArray20[local411];
					arg1.aByte46 = (byte) (12 - arg1.aByte50);
				} else {
					arg1.aByte47 = 9;
					arg1.aByte50 = Static32.aByteArray5[local411];
					arg1.aByte46 = (byte) (9 - arg1.aByte50);
				}
				if ((local416.anInt5786 & local413) != 0 && !Static78.method1416(local15, local6, local9, local416.anInt5786)) {
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					@Pc(568) Class32_Sub4 local568 = local416.method5898(Static42.aClass55_3);
					if (local568 != null) {
						local568.aClass4_1 = local416;
						local568.anInt4089 = local12;
						local568.anInt4088 = local6;
						local568.anInt4091 = local9;
						Static70.aClass39_1.method809(local568);
					}
				}
				@Pc(589) Class4_Sub3 local589 = arg1.aClass4_Sub3_1;
				if (local589 != null && (local589.anInt5786 & local413) != 0 && !Static78.method1416(local15, local6, local9, local589.anInt5786)) {
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local621 = local589.method5898(Static42.aClass55_3);
					if (local621 != null) {
						local621.aClass4_1 = local589;
						local621.anInt4089 = local12;
						local621.anInt4088 = local6;
						local621.anInt4091 = local9;
						Static70.aClass39_1.method809(local621);
					}
				}
			}
			if (local419 != null && !Static110.method1955(local15, local6, local9, local419.method3426())) {
				@Pc(652) Class4_Sub1 local652 = arg1.aClass4_Sub1_1;
				Static42.aClass55_3.method5156(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt3790 & local413) != 0) {
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local621 = local419.method5898(Static42.aClass55_3);
					if (local621 != null) {
						local621.aClass4_1 = local419;
						local621.anInt4089 = local12;
						local621.anInt4088 = local6;
						local621.anInt4091 = local9;
						Static70.aClass39_1.method809(local621);
					}
				} else if (local419.anInt3790 == 256) {
					local711 = local419.anInt3787 - Static300.anInt5860;
					local716 = local419.anInt3789 - Static168.anInt3377;
					local719 = local419.anInt3793;
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
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					@Pc(764) Class32_Sub4 local764;
					if (local740 < local728) {
						local764 = local419.method5898(Static42.aClass55_3);
						if (local764 != null) {
							local764.aClass4_1 = local419;
							local764.anInt4089 = local12;
							local764.anInt4088 = local6;
							local764.anInt4091 = local9;
							Static70.aClass39_1.method809(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5898(Static42.aClass55_3);
						if (local764 != null) {
							local764.aClass4_1 = local652;
							local764.anInt4089 = local12;
							local764.anInt4088 = local6;
							local764.anInt4091 = local9;
							Static70.aClass39_1.method809(local764);
						}
					}
				}
				Static42.aClass55_3.method5156(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class4_Sub4 local819 = arg1.aClass4_Sub4_1;
				if (local819 != null && !local819.aBoolean224) {
					if (local819.aBoolean223) {
						Static42.aClass55_3.method5156(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local621 = local819.method5898(Static42.aClass55_3);
					if (local621 != null) {
						local621.aClass4_1 = local819;
						local621.anInt4089 = local12;
						local621.anInt4088 = local6;
						local621.anInt4091 = local9;
						Static70.aClass39_1.method809(local621);
					}
					if (local819.aBoolean223) {
						Static42.aClass55_3.method5156(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class4_Sub2 local885 = arg1.aClass4_Sub2_1;
				if (local885 != null && !local885.aBoolean139) {
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					@Pc(908) Class32_Sub4 local908 = local885.method5898(Static42.aClass55_3);
					if (local908 != null) {
						local908.aClass4_1 = local885;
						local908.anInt4089 = local12;
						local908.anInt4088 = local6;
						local908.anInt4091 = local9;
						Static70.aClass39_1.method809(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte45;
			if (local929 != 0) {
				@Pc(946) Class174 local946;
				if (local6 < Static66.anInt5817 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean439) {
						Static136.aClass91_1.method3911(local946);
					}
				}
				if (local9 < Static150.anInt2937 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean439) {
						Static136.aClass91_1.method3911(local946);
					}
				}
				if (local6 > Static66.anInt5817 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean439) {
						Static136.aClass91_1.method3911(local946);
					}
				}
				if (local9 > Static150.anInt2937 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean439) {
						Static136.aClass91_1.method3911(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class4_Sub3 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class84 local1035;
		if (arg1.aByte47 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass84_3; local1035 != null; local1035 = local1035.aClass84_2) {
				if (local1035.aClass4_Sub5_1.anInt6636 != Static197.anInt3912 && (local1035.anInt2103 & arg1.aByte47) == arg1.aByte50) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass4_Sub3_2;
				if (!Static78.method1416(local15, local6, local9, local1062.anInt5786)) {
					if (Static115.aBoolean163) {
						label687: {
							if (local1062.anInt5786 >= 16) {
								local1079 = local6 - Static66.anInt5817;
								local1083 = local9 - Static150.anInt2937;
								if (local1062.anInt5786 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static236.anInt4222) {
										Static111.method1963(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5786 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static350.anInt6715 && local9 < Static236.anInt4222) {
										Static111.method1963(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5786 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static350.anInt6715 && local9 > 0) {
										Static111.method1963(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt5786 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static111.method1963(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static111.method1963(arg0, local12, local6, local9);
						}
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					@Pc(1197) Class32_Sub4 local1197 = local1062.method5898(Static42.aClass55_3);
					if (local1197 != null) {
						local1197.aClass4_1 = local1062;
						local1197.anInt4089 = local12;
						local1197.anInt4088 = local6;
						local1197.anInt4091 = local9;
						Static70.aClass39_1.method809(local1197);
					}
				}
				arg1.aByte47 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean440) {
			try {
				arg1.aBoolean440 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass84_3; local1035 != null; local1035 = local1035.aClass84_2) {
					@Pc(1233) Class4_Sub5 local1233 = local1035.aClass4_Sub5_1;
					if (local1233.anInt6636 != Static197.anInt3912) {
						for (local1079 = local1233.aShort92; local1079 <= local1233.aShort91; local1079++) {
							for (local1083 = local1233.aShort93; local1083 <= local1233.aShort90; local1083++) {
								@Pc(1251) Class174 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean438) {
									arg1.aBoolean440 = true;
									continue label630;
								}
								if (local1251.aByte47 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort92) {
										local711++;
									}
									if (local1079 < local1233.aShort91) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort93) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort90) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte47) == arg1.aByte46) {
										arg1.aBoolean440 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static66.anInt5817 - local1233.aShort92;
						local1314 = local1233.aShort91 - Static66.anInt5817;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static150.anInt2937 - local1233.aShort93;
						local716 = local1233.aShort90 - Static150.anInt2937;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass4_Sub5Array3[local40] = local1233;
						arg0.anIntArray525[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class4_Sub5 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass4_Sub5Array3[local1083];
						if (local1365.anInt6636 != Static197.anInt3912) {
							local711 = arg0.anIntArray525[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6631 - Static300.anInt5860;
								local719 = local1365.anInt6632 - Static168.anInt3377;
								local728 = arg0.aClass4_Sub5Array3[local1079].anInt6631 - Static300.anInt5860;
								local740 = arg0.aClass4_Sub5Array3[local1079].anInt6632 - Static168.anInt3377;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass4_Sub5Array3[local1079];
					local1365.anInt6636 = Static197.anInt3912;
					if (!Static187.method3356(local15, local1365.aShort92, local1365.aShort91, local1365.aShort93, local1365.aShort90, local1365.method5902())) {
						if (Static115.aBoolean163) {
							if (local1365.aByte76 == 0) {
								Static142.method2513(arg0, local12, local1365.aShort92, local1365.aShort93, local1365.aShort91, local1365.aShort90);
							} else {
								Static111.method1963(arg0, local12, local6, local9);
								local711 = local6 - Static66.anInt5817;
								local716 = local9 - Static150.anInt2937;
								if (local1365.aByte76 == 2) {
									if (local716 > -local711) {
										Static334.method5778(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static334.method5778(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static334.method5778(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static334.method5778(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
						}
						local621 = local1365.method5898(Static42.aClass55_3);
						if (local621 != null) {
							local621.aClass4_1 = local1365;
							local621.anInt4089 = local12;
							local621.anInt4088 = local1365.aShort92;
							local621.anInt4091 = local1365.aShort93;
							Static70.aClass39_1.method809(local621);
						}
					}
					for (local711 = local1365.aShort92; local711 <= local1365.aShort91; local711++) {
						for (local716 = local1365.aShort93; local716 <= local1365.aShort90; local716++) {
							@Pc(1590) Class174 local1590 = local31[local711][local716];
							if (local1590.aByte47 != 0) {
								Static136.aClass91_1.method3911(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean439) {
								Static136.aClass91_1.method3911(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean440) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean440 = false;
			}
		}
		if (arg1.aClass146_1 != null) {
			if (arg1.aByte49 == (byte) (Static176.anInt3503 & 0xFF)) {
				@Pc(1645) Class146 local1645 = arg1.aClass146_1;
				local411 = Static8.aClass51Array1[local12].method1856(local6, local9);
				if (local12 < 3) {
					local413 = Static8.aClass51Array1[local12].method1856(local6, local9) - Static8.aClass51Array1[local12 + 1].method1856(local6, local9);
				} else {
					local413 = 1024;
				}
				Static24.aClass66_6.method5816(local21, local411, local27, arg0.anIntArray526);
				local1079 = arg0.anIntArray526[2];
				Static24.aClass66_6.method5816(local21, local411 - local413, local27, arg0.anIntArray526);
				local1083 = arg0.anIntArray526[2];
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
				local1645.anInt4361 = local1314;
				local1645.anInt4362 = local711;
				local1645.aBoolean355 = true;
				Static42.aClass55_3.method5189(local1645);
			} else {
				arg1.aClass146_1 = null;
			}
		}
		if (!arg1.aBoolean439) {
			return;
		}
		if (arg1.aByte47 != 0) {
			return;
		}
		if (local6 <= Static66.anInt5817 && local6 > Static329.anInt6378) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean439) {
				return;
			}
		}
		if (local6 >= Static66.anInt5817 && local6 < Static325.anInt6299 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean439) {
				return;
			}
		}
		if (local9 <= Static150.anInt2937 && local9 > Static12.anInt3796) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean439) {
				return;
			}
		}
		if (local9 >= Static150.anInt2937 && local9 < Static142.anInt2744 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean439) {
				return;
			}
		}
		arg1.aBoolean439 = false;
		Static263.anInt5206--;
		@Pc(1839) Class4_Sub2 local1839 = arg1.aClass4_Sub2_1;
		if (local1839 != null && local1839.aBoolean139) {
			if (Static115.aBoolean163) {
				Static111.method1963(arg0, local12, local6, local9);
				Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
			}
			@Pc(1862) Class32_Sub4 local1862 = local1839.method5898(Static42.aClass55_3);
			if (local1862 != null) {
				local1862.aClass4_1 = local1839;
				local1862.anInt4089 = local12;
				local1862.anInt4088 = local6;
				local1862.anInt4091 = local9;
				Static70.aClass39_1.method809(local1862);
			}
		}
		if (arg1.aShort73 != 0) {
			@Pc(1886) Class4_Sub1 local1886 = arg1.aClass4_Sub1_2;
			if (local1886 != null && !Static110.method1955(local15, local6, local9, local1886.method3426())) {
				if ((local1886.anInt3790 & arg1.aShort73) != 0) {
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					local382 = local1886.method5898(Static42.aClass55_3);
					if (local382 != null) {
						local382.aClass4_1 = local1886;
						local382.anInt4089 = local12;
						local382.anInt4088 = local6;
						local382.anInt4091 = local9;
						Static70.aClass39_1.method809(local382);
					}
				} else if (local1886.anInt3790 == 256) {
					local413 = local1886.anInt3787 - Static300.anInt5860;
					local1079 = local1886.anInt3789 - Static168.anInt3377;
					local1083 = local1886.anInt3793;
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
					if (Static115.aBoolean163) {
						Static111.method1963(arg0, local12, local6, local9);
						Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
					}
					@Pc(1996) Class4_Sub1 local1996 = arg1.aClass4_Sub1_1;
					@Pc(2004) Class32_Sub4 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5898(Static42.aClass55_3);
						if (local2004 != null) {
							local2004.aClass4_1 = local1886;
							local2004.anInt4089 = local12;
							local2004.anInt4088 = local6;
							local2004.anInt4091 = local9;
							Static70.aClass39_1.method809(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5898(Static42.aClass55_3);
						if (local2004 != null) {
							local2004.aClass4_1 = local1996;
							local2004.anInt4089 = local12;
							local2004.anInt4088 = local6;
							local2004.anInt4091 = local9;
							Static70.aClass39_1.method809(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass4_Sub3_2;
			local416 = arg1.aClass4_Sub3_1;
			@Pc(2089) Class32_Sub4 local2089;
			if (local416 != null && (local416.anInt5786 & arg1.aShort73) != 0 && !Static78.method1416(local15, local6, local9, local416.anInt5786)) {
				if (Static115.aBoolean163) {
					Static172.method4061(arg0, local416.anInt5786, local12, local6, local9);
					Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
				}
				local2089 = local416.method5898(Static42.aClass55_3);
				if (local2089 != null) {
					local2089.aClass4_1 = local416;
					local2089.anInt4089 = local12;
					local2089.anInt4088 = local6;
					local2089.anInt4091 = local9;
					Static70.aClass39_1.method809(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt5786 & arg1.aShort73) != 0 && !Static78.method1416(local15, local6, local9, local1062.anInt5786)) {
				if (Static115.aBoolean163) {
					Static172.method4061(arg0, local1062.anInt5786, local12, local6, local9);
					Static42.aClass55_3.method5172(arg0.anInt5456, arg0.aClass5_Sub9_Sub1Array3);
				}
				local2089 = local1062.method5898(Static42.aClass55_3);
				if (local2089 != null) {
					local2089.aClass4_1 = local1062;
					local2089.anInt4089 = local12;
					local2089.anInt4088 = local6;
					local2089.anInt4091 = local9;
					Static70.aClass39_1.method809(local2089);
				}
			}
		}
		@Pc(2175) Class174 local2175;
		if (local12 < Static345.anInt6647 - 1) {
			local2175 = Static178.aClass174ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean439) {
				Static136.aClass91_1.method3915(local2175);
			}
		}
		if (local6 < Static66.anInt5817) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean439) {
				Static136.aClass91_1.method3911(local2175);
			}
		}
		if (local9 < Static150.anInt2937) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean439) {
				Static136.aClass91_1.method3911(local2175);
			}
		}
		if (local6 > Static66.anInt5817) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean439) {
				Static136.aClass91_1.method3911(local2175);
			}
		}
		if (local9 > Static150.anInt2937) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean439) {
				Static136.aClass91_1.method3911(local2175);
			}
		}
	}
}
