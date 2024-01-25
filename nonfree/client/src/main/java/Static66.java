import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!ae;")
	public static Class4 aClass4_6;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	public static int anInt1552;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
	public static int anInt1567;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
	public static final int[] anIntArray126 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public static final int anInt1545 = anInt1552 >> 2;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public static final int anInt1546 = anInt1552;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_52 = new Class106(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method1504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg7 + arg4 && arg7 < arg2 + arg5) {
			return arg1 + arg3 > arg0 && arg0 + arg6 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method1505() {
		Static353.aClass21_174.method851();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public static int method1506(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	public static void method1509() {
		Static294.anInt5663 = 0;
		Static237.anInt2678 = -1;
		Static97.anInt2177 = -1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uk;Lclient!og;)V")
	public static void method1518(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class155 arg1) {
		if (!arg1.aBoolean338) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort63;
		@Pc(9) short local9 = arg1.aShort61;
		@Pc(12) byte local12 = arg1.aByte36;
		@Pc(15) byte local15 = arg1.aByte41;
		@Pc(21) int local21 = (local6 << Static153.anInt3177) + Static145.anInt3090;
		@Pc(27) int local27 = (local9 << Static153.anInt3177) + Static145.anInt3090;
		@Pc(31) Class155[][] local31 = Static105.aClass155ArrayArrayArray3[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static200.aClass36Array4 == Static258.aClass36Array2) {
			local40 = Static118.anIntArrayArray20[local6][local9];
			Static368.aClass63_9.method4563(Static50.aClass36Array3[0].method4433(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static368.aClass63_9.method4570(3000.0F, local58 * 1.5F);
		@Pc(621) Class32_Sub7 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class155 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class32_Sub7 local382;
		@Pc(413) int local413;
		@Pc(416) Class11_Sub5 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean339) {
			if (Static90.aBoolean145) {
				if (local12 > 0) {
					local91 = Static105.aClass155ArrayArrayArray3[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean338) {
						return;
					}
				}
				if (local6 <= Static79.anInt1760 && local6 > Static144.anInt3085) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean338 && (local91.aBoolean339 || (arg1.aByte35 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static79.anInt1760 && local6 < Static330.anInt6234 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean338 && (local91.aBoolean339 || (arg1.aByte35 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static42.anInt1018 && local9 > Static192.anInt3871) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean338 && (local91.aBoolean339 || (arg1.aByte35 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static42.anInt1018 && local9 < Static21.anInt519 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean338 && (local91.aBoolean339 || (arg1.aByte35 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static90.aBoolean145 = true;
			}
			arg1.aBoolean339 = false;
			if (arg1.aClass155_1 != null) {
				local91 = arg1.aClass155_1;
				Static368.aClass63_9.method4570(3000.0F, (201.5F - (float) (local91.aByte41 + 1) * 50.0F) * 1.5F);
				if (!Static368.method6084(local91.aByte41, local6, local9)) {
					Static258.aClass36Array2[local91.aByte41].method4441(local6, local9);
				}
				@Pc(254) Class11_Sub5 local254 = local91.aClass11_Sub5_2;
				if (local254 != null) {
					if (Static314.aBoolean451) {
						if ((local254.anInt5144 & arg1.aShort62) == 0) {
							Static148.method2877(arg0, local12, local6, local9);
						} else {
							Static1.method46(arg0, local254.anInt5144, local15, local6, local9);
						}
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local254.method5909(Static368.aClass63_9);
				}
				for (@Pc(291) Class187 local291 = local91.aClass187_2; local291 != null; local291 = local291.aClass187_3) {
					@Pc(295) Class11_Sub2 local295 = local291.aClass11_Sub2_2;
					if (local295 != null) {
						if (Static314.aBoolean451) {
							Static148.method2877(arg0, local12, local6, local9);
							Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
						}
						local295.method5909(Static368.aClass63_9);
					}
				}
				Static368.aClass63_9.method4570(3000.0F, local58 * 1.5F);
			}
			local335 = !Static368.method6084(local15, local6, local9);
			if (local335) {
				Static258.aClass36Array2[local15].method4441(local6, local9);
				@Pc(346) Class11_Sub1 local346 = arg1.aClass11_Sub1_2;
				if (local346 != null && local346.aBoolean406) {
					if (local346.aBoolean408) {
						Static368.aClass63_9.method4570(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local382 = local346.method5909(Static368.aClass63_9);
					if (local382 != null) {
						local382.aClass11_1 = local346;
						local382.anInt6246 = local12;
						local382.anInt6248 = local6;
						local382.anInt6247 = local9;
						Static40.aClass195_2.method5300(local382);
					}
					if (local346.aBoolean408) {
						Static368.aClass63_9.method4570(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass11_Sub5_2;
			@Pc(419) Class11_Sub4 local419 = arg1.aClass11_Sub4_1;
			if (local416 != null || local419 != null) {
				if (Static79.anInt1760 == local6) {
					local411++;
				} else if (Static79.anInt1760 < local6) {
					local411 += 2;
				}
				if (Static42.anInt1018 == local9) {
					local411 += 3;
				} else if (Static42.anInt1018 > local9) {
					local411 += 6;
				}
				local413 = Static297.anIntArray443[local411];
				arg1.aShort62 = Static318.aShortArray100[local411];
			}
			if (local416 != null) {
				if ((local416.anInt5144 & Static161.anIntArray241[local411]) == 0) {
					arg1.aByte38 = 0;
				} else if (local416.anInt5144 == 16) {
					arg1.aByte38 = 3;
					arg1.aByte37 = Static19.aByteArray10[local411];
					arg1.aByte39 = (byte) (3 - arg1.aByte37);
				} else if (local416.anInt5144 == 32) {
					arg1.aByte38 = 6;
					arg1.aByte37 = Static177.aByteArray70[local411];
					arg1.aByte39 = (byte) (6 - arg1.aByte37);
				} else if (local416.anInt5144 == 64) {
					arg1.aByte38 = 12;
					arg1.aByte37 = Static97.aByteArray40[local411];
					arg1.aByte39 = (byte) (12 - arg1.aByte37);
				} else {
					arg1.aByte38 = 9;
					arg1.aByte37 = Static44.aByteArray20[local411];
					arg1.aByte39 = (byte) (9 - arg1.aByte37);
				}
				if ((local416.anInt5144 & local413) != 0 && !Static29.method699(local15, local6, local9, local416.anInt5144)) {
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					@Pc(568) Class32_Sub7 local568 = local416.method5909(Static368.aClass63_9);
					if (local568 != null) {
						local568.aClass11_1 = local416;
						local568.anInt6246 = local12;
						local568.anInt6248 = local6;
						local568.anInt6247 = local9;
						Static40.aClass195_2.method5300(local568);
					}
				}
				@Pc(589) Class11_Sub5 local589 = arg1.aClass11_Sub5_1;
				if (local589 != null && (local589.anInt5144 & local413) != 0 && !Static29.method699(local15, local6, local9, local589.anInt5144)) {
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local621 = local589.method5909(Static368.aClass63_9);
					if (local621 != null) {
						local621.aClass11_1 = local589;
						local621.anInt6246 = local12;
						local621.anInt6248 = local6;
						local621.anInt6247 = local9;
						Static40.aClass195_2.method5300(local621);
					}
				}
			}
			if (local419 != null && !Static286.method5274(local15, local6, local9, local419.method5916())) {
				@Pc(652) Class11_Sub4 local652 = arg1.aClass11_Sub4_2;
				Static368.aClass63_9.method4570(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt6834 & local413) != 0) {
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local621 = local419.method5909(Static368.aClass63_9);
					if (local621 != null) {
						local621.aClass11_1 = local419;
						local621.anInt6246 = local12;
						local621.anInt6248 = local6;
						local621.anInt6247 = local9;
						Static40.aClass195_2.method5300(local621);
					}
				} else if (local419.anInt6834 == 256) {
					local711 = local419.anInt6835 - Static134.anInt2901;
					local716 = local419.anInt6832 - Static320.anInt4358;
					local719 = local419.anInt6827;
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
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					@Pc(764) Class32_Sub7 local764;
					if (local740 < local728) {
						local764 = local419.method5909(Static368.aClass63_9);
						if (local764 != null) {
							local764.aClass11_1 = local419;
							local764.anInt6246 = local12;
							local764.anInt6248 = local6;
							local764.anInt6247 = local9;
							Static40.aClass195_2.method5300(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5909(Static368.aClass63_9);
						if (local764 != null) {
							local764.aClass11_1 = local652;
							local764.anInt6246 = local12;
							local764.anInt6248 = local6;
							local764.anInt6247 = local9;
							Static40.aClass195_2.method5300(local764);
						}
					}
				}
				Static368.aClass63_9.method4570(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class11_Sub1 local819 = arg1.aClass11_Sub1_2;
				if (local819 != null && !local819.aBoolean406) {
					if (local819.aBoolean408) {
						Static368.aClass63_9.method4570(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local621 = local819.method5909(Static368.aClass63_9);
					if (local621 != null) {
						local621.aClass11_1 = local819;
						local621.anInt6246 = local12;
						local621.anInt6248 = local6;
						local621.anInt6247 = local9;
						Static40.aClass195_2.method5300(local621);
					}
					if (local819.aBoolean408) {
						Static368.aClass63_9.method4570(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class11_Sub3 local885 = arg1.aClass11_Sub3_1;
				if (local885 != null && !local885.aBoolean97) {
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					@Pc(908) Class32_Sub7 local908 = local885.method5909(Static368.aClass63_9);
					if (local908 != null) {
						local908.aClass11_1 = local885;
						local908.anInt6246 = local12;
						local908.anInt6248 = local6;
						local908.anInt6247 = local9;
						Static40.aClass195_2.method5300(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte35;
			if (local929 != 0) {
				@Pc(946) Class155 local946;
				if (local6 < Static79.anInt1760 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean338) {
						Static286.aClass118_4.method5662(local946);
					}
				}
				if (local9 < Static42.anInt1018 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean338) {
						Static286.aClass118_4.method5662(local946);
					}
				}
				if (local6 > Static79.anInt1760 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean338) {
						Static286.aClass118_4.method5662(local946);
					}
				}
				if (local9 > Static42.anInt1018 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean338) {
						Static286.aClass118_4.method5662(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class11_Sub5 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class187 local1035;
		if (arg1.aByte38 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass187_2; local1035 != null; local1035 = local1035.aClass187_3) {
				if (local1035.aClass11_Sub2_2.anInt6731 != Static339.anInt6001 && (local1035.anInt5493 & arg1.aByte38) == arg1.aByte37) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass11_Sub5_2;
				if (!Static29.method699(local15, local6, local9, local1062.anInt5144)) {
					if (Static314.aBoolean451) {
						label687: {
							if (local1062.anInt5144 >= 16) {
								local1079 = local6 - Static79.anInt1760;
								local1083 = local9 - Static42.anInt1018;
								if (local1062.anInt5144 == 16) {
									local1079 -= Static145.anInt3090;
									local1083 += Static145.anInt3090;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static354.anInt6714) {
										Static148.method2877(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5144 == 32) {
									local1079 += Static145.anInt3090;
									local1083 += Static145.anInt3090;
									if (local1083 < -local1079 && local6 < Static300.anInt5778 && local9 < Static354.anInt6714) {
										Static148.method2877(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt5144 == 64) {
									local1079 += Static145.anInt3090;
									local1083 -= Static145.anInt3090;
									if (local1083 > local1079 && local6 < Static300.anInt5778 && local9 > 0) {
										Static148.method2877(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt5144 == 128) {
									local1079 -= Static145.anInt3090;
									local1083 -= Static145.anInt3090;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static148.method2877(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static148.method2877(arg0, local12, local6, local9);
						}
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					@Pc(1221) Class32_Sub7 local1221 = local1062.method5909(Static368.aClass63_9);
					if (local1221 != null) {
						local1221.aClass11_1 = local1062;
						local1221.anInt6246 = local12;
						local1221.anInt6248 = local6;
						local1221.anInt6247 = local9;
						Static40.aClass195_2.method5300(local1221);
					}
				}
				arg1.aByte38 = 0;
			}
		}
		@Pc(1338) int local1338;
		if (arg1.aBoolean340) {
			try {
				arg1.aBoolean340 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass187_2; local1035 != null; local1035 = local1035.aClass187_3) {
					@Pc(1257) Class11_Sub2 local1257 = local1035.aClass11_Sub2_2;
					if (local1257.anInt6731 != Static339.anInt6001) {
						for (local1079 = local1257.aShort94; local1079 <= local1257.aShort92; local1079++) {
							for (local1083 = local1257.aShort93; local1083 <= local1257.aShort91; local1083++) {
								@Pc(1275) Class155 local1275 = local31[local1079][local1083];
								if (local1275.aBoolean339) {
									arg1.aBoolean340 = true;
									continue label630;
								}
								if (local1275.aByte38 != 0) {
									local711 = 0;
									if (local1079 > local1257.aShort94) {
										local711++;
									}
									if (local1079 < local1257.aShort92) {
										local711 += 4;
									}
									if (local1083 > local1257.aShort93) {
										local711 += 8;
									}
									if (local1083 < local1257.aShort91) {
										local711 += 2;
									}
									if ((local711 & local1275.aByte38) == arg1.aByte39) {
										arg1.aBoolean340 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static79.anInt1760 - local1257.aShort94;
						local1338 = local1257.aShort92 - Static79.anInt1760;
						if (local1338 > local1083) {
							local1083 = local1338;
						}
						local711 = Static42.anInt1018 - local1257.aShort93;
						local716 = local1257.aShort91 - Static42.anInt1018;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass11_Sub2Array3[local40] = local1257;
						arg0.anIntArray404[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1389) Class11_Sub2 local1389;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1389 = arg0.aClass11_Sub2Array3[local1083];
						if (local1389.anInt6731 != Static339.anInt6001) {
							local711 = arg0.anIntArray404[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1389.anInt6729 - Static134.anInt2901;
								local719 = local1389.anInt6726 - Static320.anInt4358;
								local728 = arg0.aClass11_Sub2Array3[local1079].anInt6729 - Static134.anInt2901;
								local740 = arg0.aClass11_Sub2Array3[local1079].anInt6726 - Static320.anInt4358;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1389 = arg0.aClass11_Sub2Array3[local1079];
					local1389.anInt6731 = Static339.anInt6001;
					if (!Static42.method983(local15, local1389.aShort94, local1389.aShort92, local1389.aShort93, local1389.aShort91, local1389.method5877())) {
						if (Static314.aBoolean451) {
							if (local1389.aByte78 == 0) {
								Static100.method2221(arg0, local12, local1389.aShort94, local1389.aShort93, local1389.aShort92, local1389.aShort91);
							} else {
								Static148.method2877(arg0, local12, local6, local9);
								local711 = local6 - Static79.anInt1760;
								local716 = local9 - Static42.anInt1018;
								if (local1389.aByte78 == 2) {
									if (local716 > -local711) {
										Static71.method1586(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static71.method1586(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static71.method1586(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static71.method1586(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
						}
						local621 = local1389.method5909(Static368.aClass63_9);
						if (local621 != null) {
							local621.aClass11_1 = local1389;
							local621.anInt6246 = local12;
							local621.anInt6248 = local1389.aShort94;
							local621.anInt6247 = local1389.aShort93;
							Static40.aClass195_2.method5300(local621);
						}
					}
					for (local711 = local1389.aShort94; local711 <= local1389.aShort92; local711++) {
						for (local716 = local1389.aShort93; local716 <= local1389.aShort91; local716++) {
							@Pc(1614) Class155 local1614 = local31[local711][local716];
							if (local1614.aByte38 != 0) {
								Static286.aClass118_4.method5662(local1614);
							} else if ((local711 != local6 || local716 != local9) && local1614.aBoolean338) {
								Static286.aClass118_4.method5662(local1614);
							}
						}
					}
				}
				if (arg1.aBoolean340) {
					return;
				}
			} catch (@Pc(1652) Exception local1652) {
				arg1.aBoolean340 = false;
			}
		}
		if (arg1.aClass26_2 != null) {
			if (arg1.aByte40 == (byte) (Static272.anInt5290 & 0xFF)) {
				@Pc(1669) Class26 local1669 = arg1.aClass26_2;
				local411 = Static258.aClass36Array2[local12].method4431(local6, local9);
				if (local12 < Static263.anInt5201 - 1) {
					local413 = Static258.aClass36Array2[local12].method4431(local6, local9) - Static258.aClass36Array2[local12 + 1].method4431(local6, local9);
				} else {
					local413 = 1024;
				}
				Static197.aClass129_3.method5772(local21, local411, local27, arg0.anIntArray403);
				local1079 = arg0.anIntArray403[2];
				Static197.aClass129_3.method5772(local21, local411 - local413, local27, arg0.anIntArray403);
				local1083 = arg0.anIntArray403[2];
				local1338 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1338 = local1083;
					local711 = local1079;
				}
				local1338 -= anInt1567;
				local711 += anInt1567;
				if (local1338 < local711 - 1597) {
					local1338 = local711 - 1597;
				}
				local1669.anInt983 = local1338;
				local1669.anInt982 = local711;
				local1669.aBoolean61 = true;
				Static368.aClass63_9.method4559(local1669);
			} else {
				arg1.aClass26_2 = null;
			}
		}
		if (!arg1.aBoolean338) {
			return;
		}
		if (arg1.aByte38 != 0) {
			return;
		}
		if (local6 <= Static79.anInt1760 && local6 > Static144.anInt3085) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean338) {
				return;
			}
		}
		if (local6 >= Static79.anInt1760 && local6 < Static330.anInt6234 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean338) {
				return;
			}
		}
		if (local9 <= Static42.anInt1018 && local9 > Static192.anInt3871) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean338) {
				return;
			}
		}
		if (local9 >= Static42.anInt1018 && local9 < Static21.anInt519 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean338) {
				return;
			}
		}
		arg1.aBoolean338 = false;
		Static91.anInt7043--;
		@Pc(1871) Class11_Sub3 local1871 = arg1.aClass11_Sub3_1;
		if (local1871 != null && local1871.aBoolean97) {
			if (Static314.aBoolean451) {
				Static148.method2877(arg0, local12, local6, local9);
				Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
			}
			@Pc(1894) Class32_Sub7 local1894 = local1871.method5909(Static368.aClass63_9);
			if (local1894 != null) {
				local1894.aClass11_1 = local1871;
				local1894.anInt6246 = local12;
				local1894.anInt6248 = local6;
				local1894.anInt6247 = local9;
				Static40.aClass195_2.method5300(local1894);
			}
		}
		if (arg1.aShort62 != 0) {
			@Pc(1918) Class11_Sub4 local1918 = arg1.aClass11_Sub4_1;
			if (local1918 != null && !Static286.method5274(local15, local6, local9, local1918.method5916())) {
				if ((local1918.anInt6834 & arg1.aShort62) != 0) {
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					local382 = local1918.method5909(Static368.aClass63_9);
					if (local382 != null) {
						local382.aClass11_1 = local1918;
						local382.anInt6246 = local12;
						local382.anInt6248 = local6;
						local382.anInt6247 = local9;
						Static40.aClass195_2.method5300(local382);
					}
				} else if (local1918.anInt6834 == 256) {
					local413 = local1918.anInt6835 - Static134.anInt2901;
					local1079 = local1918.anInt6832 - Static320.anInt4358;
					local1083 = local1918.anInt6827;
					if (local1083 == 1 || local1083 == 2) {
						local1338 = -local413;
					} else {
						local1338 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static314.aBoolean451) {
						Static148.method2877(arg0, local12, local6, local9);
						Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
					}
					@Pc(2028) Class11_Sub4 local2028 = arg1.aClass11_Sub4_2;
					@Pc(2036) Class32_Sub7 local2036;
					if (local711 > local1338) {
						local2036 = local1918.method5909(Static368.aClass63_9);
						if (local2036 != null) {
							local2036.aClass11_1 = local1918;
							local2036.anInt6246 = local12;
							local2036.anInt6248 = local6;
							local2036.anInt6247 = local9;
							Static40.aClass195_2.method5300(local2036);
						}
					} else if (local2028 != null) {
						local2036 = local2028.method5909(Static368.aClass63_9);
						if (local2036 != null) {
							local2036.aClass11_1 = local2028;
							local2036.anInt6246 = local12;
							local2036.anInt6248 = local6;
							local2036.anInt6247 = local9;
							Static40.aClass195_2.method5300(local2036);
						}
					}
				}
			}
			local1062 = arg1.aClass11_Sub5_2;
			local416 = arg1.aClass11_Sub5_1;
			@Pc(2121) Class32_Sub7 local2121;
			if (local416 != null && (local416.anInt5144 & arg1.aShort62) != 0 && !Static29.method699(local15, local6, local9, local416.anInt5144)) {
				if (Static314.aBoolean451) {
					Static1.method46(arg0, local416.anInt5144, local12, local6, local9);
					Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
				}
				local2121 = local416.method5909(Static368.aClass63_9);
				if (local2121 != null) {
					local2121.aClass11_1 = local416;
					local2121.anInt6246 = local12;
					local2121.anInt6248 = local6;
					local2121.anInt6247 = local9;
					Static40.aClass195_2.method5300(local2121);
				}
			}
			if (local1062 != null && (local1062.anInt5144 & arg1.aShort62) != 0 && !Static29.method699(local15, local6, local9, local1062.anInt5144)) {
				if (Static314.aBoolean451) {
					Static1.method46(arg0, local1062.anInt5144, local12, local6, local9);
					Static368.aClass63_9.method4557(arg0.anInt5183, arg0.aClass1_Sub5_Sub1Array3);
				}
				local2121 = local1062.method5909(Static368.aClass63_9);
				if (local2121 != null) {
					local2121.aClass11_1 = local1062;
					local2121.anInt6246 = local12;
					local2121.anInt6248 = local6;
					local2121.anInt6247 = local9;
					Static40.aClass195_2.method5300(local2121);
				}
			}
		}
		@Pc(2207) Class155 local2207;
		if (local12 < Static263.anInt5201 - 1) {
			local2207 = Static105.aClass155ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2207 != null && local2207.aBoolean338) {
				Static286.aClass118_4.method5666(local2207);
			}
		}
		if (local6 < Static79.anInt1760) {
			local2207 = local31[local6 + 1][local9];
			if (local2207 != null && local2207.aBoolean338) {
				Static286.aClass118_4.method5662(local2207);
			}
		}
		if (local9 < Static42.anInt1018) {
			local2207 = local31[local6][local9 + 1];
			if (local2207 != null && local2207.aBoolean338) {
				Static286.aClass118_4.method5662(local2207);
			}
		}
		if (local6 > Static79.anInt1760) {
			local2207 = local31[local6 - 1][local9];
			if (local2207 != null && local2207.aBoolean338) {
				Static286.aClass118_4.method5662(local2207);
			}
		}
		if (local9 > Static42.anInt1018) {
			local2207 = local31[local6][local9 - 1];
			if (local2207 != null && local2207.aBoolean338) {
				Static286.aClass118_4.method5662(local2207);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public static void method1519() {
		for (@Pc(1) int local1 = 0; local1 < Static92.anInt2063; local1++) {
			if (!Static181.aBooleanArray19[local1]) {
				@Pc(10) Class1_Sub5_Sub1 local10 = Static13.aClass1_Sub5_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt4976;
				@Pc(18) int local18 = local10.anInt4963 - Static145.anInt3090;
				@Pc(26) int local26 = (local18 * 2 >> Static153.anInt3177) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4966 - local18 >> Static153.anInt3177;
				@Pc(47) int local47 = local10.anInt4965 - local18 >> Static153.anInt3177;
				@Pc(54) int local54 = local10.anInt4965 + local18 >> Static153.anInt3177;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static354.anInt6714) {
					local54 = Static354.anInt6714 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray89[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static300.anInt5778) {
						local101 = Static300.anInt5778 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class11_Sub2 local134 = Static138.method2791(local13, local118, local71, bf.class);
						if (local134 != null && local134.aByte78 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte78 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray89[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray89[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray89[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray89[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static181.aBooleanArray19[local1] = true;
				Static258.aClass36Array2[local13].method4447(local10, local33);
			}
		}
	}
}
