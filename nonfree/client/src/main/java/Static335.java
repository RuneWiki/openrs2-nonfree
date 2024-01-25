import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!mo;")
	public static Class143 aClass143_112;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lclient!om;")
	public static final Class14_Sub2_Sub15[] aClass14_Sub2_Sub15Array5 = new Class14_Sub2_Sub15[14];

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray74 = new String[5];

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
	public static boolean aBoolean434 = true;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!kk;Lclient!we;)V")
	public static void method5775(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class213 arg1) {
		if (!arg1.aBoolean438) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort90;
		@Pc(9) short local9 = arg1.aShort91;
		@Pc(12) byte local12 = arg1.aByte70;
		@Pc(15) byte local15 = arg1.aByte73;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class213[][] local31 = Static98.aClass213ArrayArrayArray2[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static341.aClass114Array3 == Static158.aClass114Array2) {
			local40 = Static238.anIntArrayArray77[local6][local9];
			Static160.aClass46_4.method5186(Static18.aClass114Array1[0].method3607(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static160.aClass46_4.method5161(3000.0F, local58 * 1.5F);
		@Pc(621) Class1_Sub8 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class213 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class1_Sub8 local382;
		@Pc(413) int local413;
		@Pc(416) Class10_Sub2 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean440) {
			if (Static323.aBoolean51) {
				if (local12 > 0) {
					local91 = Static98.aClass213ArrayArrayArray2[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean438) {
						return;
					}
				}
				if (local6 <= Static93.anInt2184 && local6 > Static239.anInt6274) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean438 && (local91.aBoolean440 || (arg1.aByte72 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static93.anInt2184 && local6 < Static86.anInt2090 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean438 && (local91.aBoolean440 || (arg1.aByte72 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static18.anInt373 && local9 > Static38.anInt906) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean438 && (local91.aBoolean440 || (arg1.aByte72 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static18.anInt373 && local9 < Static54.anInt1340 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean438 && (local91.aBoolean440 || (arg1.aByte72 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static323.aBoolean51 = true;
			}
			arg1.aBoolean440 = false;
			if (arg1.aClass213_1 != null) {
				local91 = arg1.aClass213_1;
				Static160.aClass46_4.method5161(3000.0F, (201.5F - (float) (local91.aByte73 + 1) * 50.0F) * 1.5F);
				if (!Static124.method2601(local91.aByte73, local6, local9)) {
					Static158.aClass114Array2[local91.aByte73].method3606(local6, local9);
				}
				@Pc(254) Class10_Sub2 local254 = local91.aClass10_Sub2_2;
				if (local254 != null) {
					if (Static347.aBoolean442) {
						if ((local254.anInt2445 & arg1.aShort92) == 0) {
							Static324.method5564(arg0, local12, local6, local9);
						} else {
							Static216.method3898(arg0, local254.anInt2445, local15, local6, local9);
						}
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local254.method5337(Static160.aClass46_4);
				}
				for (@Pc(291) Class81 local291 = local91.aClass81_4; local291 != null; local291 = local291.aClass81_3) {
					@Pc(295) Class10_Sub3 local295 = local291.aClass10_Sub3_1;
					if (local295 != null) {
						if (Static347.aBoolean442) {
							Static324.method5564(arg0, local12, local6, local9);
							Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
						}
						local295.method5337(Static160.aClass46_4);
					}
				}
				Static160.aClass46_4.method5161(3000.0F, local58 * 1.5F);
			}
			local335 = !Static124.method2601(local15, local6, local9);
			if (local335) {
				Static158.aClass114Array2[local15].method3606(local6, local9);
				@Pc(346) Class10_Sub5 local346 = arg1.aClass10_Sub5_1;
				if (local346 != null && local346.aBoolean299) {
					if (local346.aBoolean297) {
						Static160.aClass46_4.method5161(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local382 = local346.method5337(Static160.aClass46_4);
					if (local382 != null) {
						local382.aClass10_1 = local346;
						local382.anInt6227 = local12;
						local382.anInt6233 = local6;
						local382.anInt6231 = local9;
						Static184.aClass126_4.method3401(local382);
					}
					if (local346.aBoolean297) {
						Static160.aClass46_4.method5161(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass10_Sub2_2;
			@Pc(419) Class10_Sub4 local419 = arg1.aClass10_Sub4_1;
			if (local416 != null || local419 != null) {
				if (Static93.anInt2184 == local6) {
					local411++;
				} else if (Static93.anInt2184 < local6) {
					local411 += 2;
				}
				if (Static18.anInt373 == local9) {
					local411 += 3;
				} else if (Static18.anInt373 > local9) {
					local411 += 6;
				}
				local413 = Static92.anIntArray197[local411];
				arg1.aShort92 = Static167.aShortArray109[local411];
			}
			if (local416 != null) {
				if ((local416.anInt2445 & Static42.anIntArray63[local411]) == 0) {
					arg1.aByte69 = 0;
				} else if (local416.anInt2445 == 16) {
					arg1.aByte69 = 3;
					arg1.aByte74 = Static128.aByteArray118[local411];
					arg1.aByte75 = (byte) (3 - arg1.aByte74);
				} else if (local416.anInt2445 == 32) {
					arg1.aByte69 = 6;
					arg1.aByte74 = Static329.aByteArray199[local411];
					arg1.aByte75 = (byte) (6 - arg1.aByte74);
				} else if (local416.anInt2445 == 64) {
					arg1.aByte69 = 12;
					arg1.aByte74 = Static303.aByteArray217[local411];
					arg1.aByte75 = (byte) (12 - arg1.aByte74);
				} else {
					arg1.aByte69 = 9;
					arg1.aByte74 = Static147.aByteArray73[local411];
					arg1.aByte75 = (byte) (9 - arg1.aByte74);
				}
				if ((local416.anInt2445 & local413) != 0 && !Static144.method2890(local15, local6, local9, local416.anInt2445)) {
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					@Pc(568) Class1_Sub8 local568 = local416.method5337(Static160.aClass46_4);
					if (local568 != null) {
						local568.aClass10_1 = local416;
						local568.anInt6227 = local12;
						local568.anInt6233 = local6;
						local568.anInt6231 = local9;
						Static184.aClass126_4.method3401(local568);
					}
				}
				@Pc(589) Class10_Sub2 local589 = arg1.aClass10_Sub2_1;
				if (local589 != null && (local589.anInt2445 & local413) != 0 && !Static144.method2890(local15, local6, local9, local589.anInt2445)) {
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local621 = local589.method5337(Static160.aClass46_4);
					if (local621 != null) {
						local621.aClass10_1 = local589;
						local621.anInt6227 = local12;
						local621.anInt6233 = local6;
						local621.anInt6231 = local9;
						Static184.aClass126_4.method3401(local621);
					}
				}
			}
			if (local419 != null && !Static144.method2893(local15, local6, local9, local419.method3921())) {
				@Pc(652) Class10_Sub4 local652 = arg1.aClass10_Sub4_2;
				Static160.aClass46_4.method5161(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt4375 & local413) != 0) {
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local621 = local419.method5337(Static160.aClass46_4);
					if (local621 != null) {
						local621.aClass10_1 = local419;
						local621.anInt6227 = local12;
						local621.anInt6233 = local6;
						local621.anInt6231 = local9;
						Static184.aClass126_4.method3401(local621);
					}
				} else if (local419.anInt4375 == 256) {
					local711 = local419.anInt4365 - Static269.anInt5123;
					local716 = local419.anInt4364 - Static103.anInt2312;
					local719 = local419.anInt4370;
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
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					@Pc(764) Class1_Sub8 local764;
					if (local740 < local728) {
						local764 = local419.method5337(Static160.aClass46_4);
						if (local764 != null) {
							local764.aClass10_1 = local419;
							local764.anInt6227 = local12;
							local764.anInt6233 = local6;
							local764.anInt6231 = local9;
							Static184.aClass126_4.method3401(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5337(Static160.aClass46_4);
						if (local764 != null) {
							local764.aClass10_1 = local652;
							local764.anInt6227 = local12;
							local764.anInt6233 = local6;
							local764.anInt6231 = local9;
							Static184.aClass126_4.method3401(local764);
						}
					}
				}
				Static160.aClass46_4.method5161(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class10_Sub5 local819 = arg1.aClass10_Sub5_1;
				if (local819 != null && !local819.aBoolean299) {
					if (local819.aBoolean297) {
						Static160.aClass46_4.method5161(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local621 = local819.method5337(Static160.aClass46_4);
					if (local621 != null) {
						local621.aClass10_1 = local819;
						local621.anInt6227 = local12;
						local621.anInt6233 = local6;
						local621.anInt6231 = local9;
						Static184.aClass126_4.method3401(local621);
					}
					if (local819.aBoolean297) {
						Static160.aClass46_4.method5161(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class10_Sub1 local885 = arg1.aClass10_Sub1_1;
				if (local885 != null && !local885.aBoolean7) {
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					@Pc(908) Class1_Sub8 local908 = local885.method5337(Static160.aClass46_4);
					if (local908 != null) {
						local908.aClass10_1 = local885;
						local908.anInt6227 = local12;
						local908.anInt6233 = local6;
						local908.anInt6231 = local9;
						Static184.aClass126_4.method3401(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte72;
			if (local929 != 0) {
				@Pc(946) Class213 local946;
				if (local6 < Static93.anInt2184 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean438) {
						Static295.aClass57_1.method2405(local946);
					}
				}
				if (local9 < Static18.anInt373 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean438) {
						Static295.aClass57_1.method2405(local946);
					}
				}
				if (local6 > Static93.anInt2184 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean438) {
						Static295.aClass57_1.method2405(local946);
					}
				}
				if (local9 > Static18.anInt373 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean438) {
						Static295.aClass57_1.method2405(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class10_Sub2 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class81 local1035;
		if (arg1.aByte69 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass81_4; local1035 != null; local1035 = local1035.aClass81_3) {
				if (local1035.aClass10_Sub3_1.anInt5909 != Static238.anInt4659 && (local1035.anInt2432 & arg1.aByte69) == arg1.aByte74) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass10_Sub2_2;
				if (!Static144.method2890(local15, local6, local9, local1062.anInt2445)) {
					if (Static347.aBoolean442) {
						label687: {
							if (local1062.anInt2445 >= 16) {
								local1079 = local6 - Static93.anInt2184;
								local1083 = local9 - Static18.anInt373;
								if (local1062.anInt2445 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static180.anInt3712) {
										Static324.method5564(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt2445 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static233.anInt4556 && local9 < Static180.anInt3712) {
										Static324.method5564(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt2445 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static233.anInt4556 && local9 > 0) {
										Static324.method5564(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt2445 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static324.method5564(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static324.method5564(arg0, local12, local6, local9);
						}
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					@Pc(1197) Class1_Sub8 local1197 = local1062.method5337(Static160.aClass46_4);
					if (local1197 != null) {
						local1197.aClass10_1 = local1062;
						local1197.anInt6227 = local12;
						local1197.anInt6233 = local6;
						local1197.anInt6231 = local9;
						Static184.aClass126_4.method3401(local1197);
					}
				}
				arg1.aByte69 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean439) {
			try {
				arg1.aBoolean439 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass81_4; local1035 != null; local1035 = local1035.aClass81_3) {
					@Pc(1233) Class10_Sub3 local1233 = local1035.aClass10_Sub3_1;
					if (local1233.anInt5909 != Static238.anInt4659) {
						for (local1079 = local1233.aShort83; local1079 <= local1233.aShort80; local1079++) {
							for (local1083 = local1233.aShort82; local1083 <= local1233.aShort81; local1083++) {
								@Pc(1251) Class213 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean440) {
									arg1.aBoolean439 = true;
									continue label630;
								}
								if (local1251.aByte69 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort83) {
										local711++;
									}
									if (local1079 < local1233.aShort80) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort82) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort81) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte69) == arg1.aByte75) {
										arg1.aBoolean439 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static93.anInt2184 - local1233.aShort83;
						local1314 = local1233.aShort80 - Static93.anInt2184;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static18.anInt373 - local1233.aShort82;
						local716 = local1233.aShort81 - Static18.anInt373;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass10_Sub3Array2[local40] = local1233;
						arg0.anIntArray484[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class10_Sub3 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass10_Sub3Array2[local1083];
						if (local1365.anInt5909 != Static238.anInt4659) {
							local711 = arg0.anIntArray484[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5910 - Static269.anInt5123;
								local719 = local1365.anInt5908 - Static103.anInt2312;
								local728 = arg0.aClass10_Sub3Array2[local1079].anInt5910 - Static269.anInt5123;
								local740 = arg0.aClass10_Sub3Array2[local1079].anInt5908 - Static103.anInt2312;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass10_Sub3Array2[local1079];
					local1365.anInt5909 = Static238.anInt4659;
					if (!Static214.method3857(local15, local1365.aShort83, local1365.aShort80, local1365.aShort82, local1365.aShort81, local1365.method5345())) {
						if (Static347.aBoolean442) {
							if (local1365.aByte63 == 0) {
								Static192.method3654(arg0, local12, local1365.aShort83, local1365.aShort82, local1365.aShort80, local1365.aShort81);
							} else {
								Static324.method5564(arg0, local12, local6, local9);
								local711 = local6 - Static93.anInt2184;
								local716 = local9 - Static18.anInt373;
								if (local1365.aByte63 == 2) {
									if (local716 > -local711) {
										Static289.method4965(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static289.method4965(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static289.method4965(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static289.method4965(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
						}
						local621 = local1365.method5337(Static160.aClass46_4);
						if (local621 != null) {
							local621.aClass10_1 = local1365;
							local621.anInt6227 = local12;
							local621.anInt6233 = local1365.aShort83;
							local621.anInt6231 = local1365.aShort82;
							Static184.aClass126_4.method3401(local621);
						}
					}
					for (local711 = local1365.aShort83; local711 <= local1365.aShort80; local711++) {
						for (local716 = local1365.aShort82; local716 <= local1365.aShort81; local716++) {
							@Pc(1590) Class213 local1590 = local31[local711][local716];
							if (local1590.aByte69 != 0) {
								Static295.aClass57_1.method2405(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean438) {
								Static295.aClass57_1.method2405(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean439) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean439 = false;
			}
		}
		if (arg1.aClass109_2 != null) {
			if (arg1.aByte71 == (byte) (Static178.anInt3664 & 0xFF)) {
				@Pc(1645) Class109 local1645 = arg1.aClass109_2;
				local411 = Static158.aClass114Array2[local12].method3610(local6, local9);
				if (local12 < 3) {
					local413 = Static158.aClass114Array2[local12].method3610(local6, local9) - Static158.aClass114Array2[local12 + 1].method3610(local6, local9);
				} else {
					local413 = 1024;
				}
				Static336.aClass51_6.method3551(local21, local411, local27, arg0.anIntArray486);
				local1079 = arg0.anIntArray486[2];
				Static336.aClass51_6.method3551(local21, local411 - local413, local27, arg0.anIntArray486);
				local1083 = arg0.anIntArray486[2];
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
				local1645.anInt3272 = local1314;
				local1645.anInt3273 = local711;
				local1645.aBoolean214 = true;
				Static160.aClass46_4.method5122(local1645);
			} else {
				arg1.aClass109_2 = null;
			}
		}
		if (!arg1.aBoolean438) {
			return;
		}
		if (arg1.aByte69 != 0) {
			return;
		}
		if (local6 <= Static93.anInt2184 && local6 > Static239.anInt6274) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean438) {
				return;
			}
		}
		if (local6 >= Static93.anInt2184 && local6 < Static86.anInt2090 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean438) {
				return;
			}
		}
		if (local9 <= Static18.anInt373 && local9 > Static38.anInt906) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean438) {
				return;
			}
		}
		if (local9 >= Static18.anInt373 && local9 < Static54.anInt1340 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean438) {
				return;
			}
		}
		arg1.aBoolean438 = false;
		Static83.anInt6472--;
		@Pc(1839) Class10_Sub1 local1839 = arg1.aClass10_Sub1_1;
		if (local1839 != null && local1839.aBoolean7) {
			if (Static347.aBoolean442) {
				Static324.method5564(arg0, local12, local6, local9);
				Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
			}
			@Pc(1862) Class1_Sub8 local1862 = local1839.method5337(Static160.aClass46_4);
			if (local1862 != null) {
				local1862.aClass10_1 = local1839;
				local1862.anInt6227 = local12;
				local1862.anInt6233 = local6;
				local1862.anInt6231 = local9;
				Static184.aClass126_4.method3401(local1862);
			}
		}
		if (arg1.aShort92 != 0) {
			@Pc(1886) Class10_Sub4 local1886 = arg1.aClass10_Sub4_1;
			if (local1886 != null && !Static144.method2893(local15, local6, local9, local1886.method3921())) {
				if ((local1886.anInt4375 & arg1.aShort92) != 0) {
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					local382 = local1886.method5337(Static160.aClass46_4);
					if (local382 != null) {
						local382.aClass10_1 = local1886;
						local382.anInt6227 = local12;
						local382.anInt6233 = local6;
						local382.anInt6231 = local9;
						Static184.aClass126_4.method3401(local382);
					}
				} else if (local1886.anInt4375 == 256) {
					local413 = local1886.anInt4365 - Static269.anInt5123;
					local1079 = local1886.anInt4364 - Static103.anInt2312;
					local1083 = local1886.anInt4370;
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
					if (Static347.aBoolean442) {
						Static324.method5564(arg0, local12, local6, local9);
						Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
					}
					@Pc(1996) Class10_Sub4 local1996 = arg1.aClass10_Sub4_2;
					@Pc(2004) Class1_Sub8 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5337(Static160.aClass46_4);
						if (local2004 != null) {
							local2004.aClass10_1 = local1886;
							local2004.anInt6227 = local12;
							local2004.anInt6233 = local6;
							local2004.anInt6231 = local9;
							Static184.aClass126_4.method3401(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5337(Static160.aClass46_4);
						if (local2004 != null) {
							local2004.aClass10_1 = local1996;
							local2004.anInt6227 = local12;
							local2004.anInt6233 = local6;
							local2004.anInt6231 = local9;
							Static184.aClass126_4.method3401(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass10_Sub2_2;
			local416 = arg1.aClass10_Sub2_1;
			@Pc(2089) Class1_Sub8 local2089;
			if (local416 != null && (local416.anInt2445 & arg1.aShort92) != 0 && !Static144.method2890(local15, local6, local9, local416.anInt2445)) {
				if (Static347.aBoolean442) {
					Static216.method3898(arg0, local416.anInt2445, local12, local6, local9);
					Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
				}
				local2089 = local416.method5337(Static160.aClass46_4);
				if (local2089 != null) {
					local2089.aClass10_1 = local416;
					local2089.anInt6227 = local12;
					local2089.anInt6233 = local6;
					local2089.anInt6231 = local9;
					Static184.aClass126_4.method3401(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt2445 & arg1.aShort92) != 0 && !Static144.method2890(local15, local6, local9, local1062.anInt2445)) {
				if (Static347.aBoolean442) {
					Static216.method3898(arg0, local1062.anInt2445, local12, local6, local9);
					Static160.aClass46_4.method5124(arg0.anInt5367, arg0.aClass14_Sub13_Sub1Array3);
				}
				local2089 = local1062.method5337(Static160.aClass46_4);
				if (local2089 != null) {
					local2089.aClass10_1 = local1062;
					local2089.anInt6227 = local12;
					local2089.anInt6233 = local6;
					local2089.anInt6231 = local9;
					Static184.aClass126_4.method3401(local2089);
				}
			}
		}
		@Pc(2175) Class213 local2175;
		if (local12 < Static125.anInt2719 - 1) {
			local2175 = Static98.aClass213ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean438) {
				Static295.aClass57_1.method2409(local2175);
			}
		}
		if (local6 < Static93.anInt2184) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean438) {
				Static295.aClass57_1.method2405(local2175);
			}
		}
		if (local9 < Static18.anInt373) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean438) {
				Static295.aClass57_1.method2405(local2175);
			}
		}
		if (local6 > Static93.anInt2184) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean438) {
				Static295.aClass57_1.method2405(local2175);
			}
		}
		if (local9 > Static18.anInt373) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean438) {
				Static295.aClass57_1.method2405(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5776(@OriginalArg(1) String arg0) {
		return Static284.method4795(arg0);
	}
}
