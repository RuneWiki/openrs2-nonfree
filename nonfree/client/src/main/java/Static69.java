import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_12;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!lb;")
	public static Class45 aClass45_13 = new Class45();

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt1721 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_10 = null;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt1722 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1099() {
		aClass10_Sub1_12 = null;
		aByteArrayArrayArray5 = null;
		aClass4_Sub14_10 = null;
		aClass45_13 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method1100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub17 local10 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray322.length) {
			return local10.anIntArray322[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII[B[Lclient!ge;)V")
	public static void method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class28[] arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg3 > 0 && arg3 + local7 < 103 && arg1 + local11 > 0 && local11 + arg1 < 103) {
						arg5[local3].anIntArrayArray28[local7 + arg3][local11 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class4_Sub9 local90 = new Class4_Sub9(arg4);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static43.method619(local101 + arg3, local90, arg0, arg1 + local105, local11, arg2, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public static void method1102(@OriginalArg(1) int arg0) {
		if (Static9.anInt112 == 0) {
			Static30.aClass4_Sub1_Sub1_1.method121(arg0);
		} else {
			Static118.anInt2733 = arg0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)V")
	public static void method1103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static16.anIntArrayArrayArray1[arg1][arg2 + local3][local7 + arg0] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static16.anIntArrayArrayArray1[arg1][arg2][local7 + arg0] = Static16.anIntArrayArrayArray1[arg1][arg2 - 1][arg0 + local7];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static16.anIntArrayArrayArray1[arg1][arg2 + local7][arg0] = Static16.anIntArrayArrayArray1[arg1][local7 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static16.anIntArrayArrayArray1[arg1][arg2 - 1][arg0] != 0) {
			Static16.anIntArrayArrayArray1[arg1][arg2][arg0] = Static16.anIntArrayArrayArray1[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static16.anIntArrayArrayArray1[arg1][arg2][arg0 - 1] != 0) {
			Static16.anIntArrayArrayArray1[arg1][arg2][arg0] = Static16.anIntArrayArrayArray1[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static16.anIntArrayArrayArray1[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static16.anIntArrayArrayArray1[arg1][arg2][arg0] = Static16.anIntArrayArrayArray1[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ge;IIIIILclient!le;II)V")
	public static void method1104(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class48 arg6, @OriginalArg(8) int arg7) {
		if (Static8.aBoolean3 && (aByteArrayArrayArray5[0][arg5][arg4] & 0x2) == 0) {
			if ((aByteArrayArrayArray5[arg1][arg5][arg4] & 0x10) != 0) {
				return;
			}
			if (Static63.method998(arg1, arg5, arg4) != Static91.anInt2145) {
				return;
			}
		}
		if (arg1 < Static31.anInt909) {
			Static31.anInt909 = arg1;
		}
		@Pc(57) Class4_Sub3_Sub3 local57 = Static76.method1244(arg3);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (arg2 == 1 || arg2 == 3) {
			local69 = local57.anInt760;
			local66 = local57.anInt750;
		} else {
			local66 = local57.anInt760;
			local69 = local57.anInt750;
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (local66 + arg5 > 104) {
			local86 = arg5 + 1;
			local88 = arg5;
		} else {
			local88 = (local66 >> 1) + arg5;
			local86 = arg5 + (local66 + 1 >> 1);
		}
		@Pc(124) int local124;
		@Pc(118) int local118;
		if (local69 + arg4 <= 104) {
			local118 = arg4 + (local69 + 1 >> 1);
			local124 = (local69 >> 1) + arg4;
		} else {
			local118 = arg4 + 1;
			local124 = arg4;
		}
		@Pc(136) int[][] local136 = Static16.anIntArrayArrayArray1[arg1];
		@Pc(165) int local165 = local136[local88][local124] + local136[local86][local124] + local136[local88][local118] + local136[local86][local118] >> 2;
		@Pc(173) int local173 = (local69 << 6) + (arg4 << 7);
		@Pc(181) int local181 = (local66 << 6) + (arg5 << 7);
		@Pc(193) int local193 = arg5 + (arg4 << 7) + (arg3 << 14) + 1073741824;
		@Pc(200) int local200 = (arg2 << 6) + arg7;
		if (local57.anInt738 == 0) {
			local193 += Integer.MIN_VALUE;
		}
		if (local57.anInt745 == 1) {
			local200 += 256;
		}
		if (local57.method407()) {
			Static77.method1264(arg5, arg4, arg1, local57, arg2);
		}
		@Pc(266) Class4_Sub3_Sub1 local266;
		if (arg7 != 22) {
			@Pc(373) int local373;
			if (arg7 == 10 || arg7 == 11) {
				if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
					local266 = local57.method399(arg2, local165, local181, local136, local173, 10);
				} else {
					local266 = new Class4_Sub3_Sub1_Sub6(arg3, 10, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
				}
				if (local266 != null && arg6.method1006(arg1, arg5, arg4, local165, local66, local69, local266, arg7 == 11 ? 256 : 0, local193, local200) && local57.aBoolean30) {
					local373 = 15;
					if (local266 instanceof Class4_Sub3_Sub1_Sub7) {
						local373 = ((Class4_Sub3_Sub1_Sub7) local266).method1494() / 4;
						if (local373 > 30) {
							local373 = 30;
						}
					}
					for (@Pc(389) int local389 = 0; local389 <= local66; local389++) {
						for (@Pc(393) int local393 = 0; local393 <= local69; local393++) {
							if (Static66.aByteArrayArrayArray4[arg1][local389 + arg5][arg4 + local393] < local373) {
								Static66.aByteArrayArrayArray4[arg1][arg5 + local389][arg4 + local393] = (byte) local373;
							}
						}
					}
				}
				if (local57.anInt732 != 0 && arg0 != null) {
					arg0.method609(arg4, local69, arg5, local66, local57.aBoolean28);
				}
			} else if (arg7 >= 12) {
				if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
					local266 = local57.method399(arg2, local165, local181, local136, local173, arg7);
				} else {
					local266 = new Class4_Sub3_Sub1_Sub6(arg3, arg7, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
				}
				arg6.method1006(arg1, arg5, arg4, local165, 1, 1, local266, 0, local193, local200);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0) {
					Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x924;
				}
				if (local57.anInt732 != 0 && arg0 != null) {
					arg0.method609(arg4, local69, arg5, local66, local57.aBoolean28);
				}
			} else if (arg7 == 0) {
				if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
					local266 = local57.method399(arg2, local165, local181, local136, local173, 0);
				} else {
					local266 = new Class4_Sub3_Sub1_Sub6(arg3, 0, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
				}
				arg6.method1012(arg1, arg5, arg4, local165, local266, null, Static80.anIntArray220[arg2], 0, local193, local200);
				if (arg2 == 0) {
					if (local57.aBoolean30) {
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4] = 50;
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4 + 1] = 50;
					}
					if (local57.aBoolean27) {
						Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local57.aBoolean30) {
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4 + 1] = 50;
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4 + 1] = 50;
					}
					if (local57.aBoolean27) {
						Static113.anIntArrayArrayArray3[arg1][arg5][arg4 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local57.aBoolean30) {
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4] = 50;
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4 + 1] = 50;
					}
					if (local57.aBoolean27) {
						Static113.anIntArrayArrayArray3[arg1][arg5 + 1][arg4] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local57.aBoolean30) {
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4] = 50;
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4] = 50;
					}
					if (local57.aBoolean27) {
						Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x492;
					}
				}
				if (local57.anInt732 != 0 && arg0 != null) {
					arg0.method613(local57.aBoolean28, arg2, arg7, arg5, arg4);
				}
				if (local57.anInt764 != 16) {
					arg6.method1022(arg1, arg5, arg4, local57.anInt764);
				}
			} else if (arg7 == 1) {
				if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
					local266 = local57.method399(arg2, local165, local181, local136, local173, 1);
				} else {
					local266 = new Class4_Sub3_Sub1_Sub6(arg3, 1, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
				}
				arg6.method1012(arg1, arg5, arg4, local165, local266, null, Static119.anIntArray338[arg2], 0, local193, local200);
				if (local57.aBoolean30) {
					if (arg2 == 0) {
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4 + 1] = 50;
					} else if (arg2 == 1) {
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4 + 1] = 50;
					} else if (arg2 == 2) {
						Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4] = 50;
					} else if (arg2 == 3) {
						Static66.aByteArrayArrayArray4[arg1][arg5][arg4] = 50;
					}
				}
				if (local57.anInt732 != 0 && arg0 != null) {
					arg0.method613(local57.aBoolean28, arg2, arg7, arg5, arg4);
				}
			} else {
				@Pc(974) int local974;
				@Pc(1004) Class4_Sub3_Sub1 local1004;
				if (arg7 == 2) {
					local974 = arg2 + 1 & 0x3;
					@Pc(994) Class4_Sub3_Sub1 local994;
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local994 = local57.method399(arg2 + 4, local165, local181, local136, local173, 2);
						local1004 = local57.method399(local974, local165, local181, local136, local173, 2);
					} else {
						local994 = new Class4_Sub3_Sub1_Sub6(arg3, 2, arg2 + 4, arg1, arg5, arg4, local57.anInt753, true, null);
						local1004 = new Class4_Sub3_Sub1_Sub6(arg3, 2, local974, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1012(arg1, arg5, arg4, local165, local994, local1004, Static80.anIntArray220[arg2], Static80.anIntArray220[local974], local193, local200);
					if (local57.aBoolean27) {
						if (arg2 == 0) {
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x249;
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4 + 1] |= 0x492;
							Static113.anIntArrayArrayArray3[arg1][arg5 + 1][arg4] |= 0x249;
						} else if (arg2 == 2) {
							Static113.anIntArrayArrayArray3[arg1][arg5 + 1][arg4] |= 0x249;
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x492;
						} else if (arg2 == 3) {
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x492;
							Static113.anIntArrayArrayArray3[arg1][arg5][arg4] |= 0x249;
						}
					}
					if (local57.anInt732 != 0 && arg0 != null) {
						arg0.method613(local57.aBoolean28, arg2, arg7, arg5, arg4);
					}
					if (local57.anInt764 != 16) {
						arg6.method1022(arg1, arg5, arg4, local57.anInt764);
					}
				} else if (arg7 == 3) {
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local266 = local57.method399(arg2, local165, local181, local136, local173, 3);
					} else {
						local266 = new Class4_Sub3_Sub1_Sub6(arg3, 3, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1012(arg1, arg5, arg4, local165, local266, null, Static119.anIntArray338[arg2], 0, local193, local200);
					if (local57.aBoolean30) {
						if (arg2 == 0) {
							Static66.aByteArrayArrayArray4[arg1][arg5][arg4 + 1] = 50;
						} else if (arg2 == 1) {
							Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4 + 1] = 50;
						} else if (arg2 == 2) {
							Static66.aByteArrayArrayArray4[arg1][arg5 + 1][arg4] = 50;
						} else if (arg2 == 3) {
							Static66.aByteArrayArrayArray4[arg1][arg5][arg4] = 50;
						}
					}
					if (local57.anInt732 != 0 && arg0 != null) {
						arg0.method613(local57.aBoolean28, arg2, arg7, arg5, arg4);
					}
				} else if (arg7 == 9) {
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local266 = local57.method399(arg2, local165, local181, local136, local173, arg7);
					} else {
						local266 = new Class4_Sub3_Sub1_Sub6(arg3, arg7, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1006(arg1, arg5, arg4, local165, 1, 1, local266, 0, local193, local200);
					if (local57.anInt732 != 0 && arg0 != null) {
						arg0.method609(arg4, local69, arg5, local66, local57.aBoolean28);
					}
					if (local57.anInt764 != 16) {
						arg6.method1022(arg1, arg5, arg4, local57.anInt764);
					}
				} else if (arg7 == 4) {
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local266 = local57.method399(arg2, local165, local181, local136, local173, 4);
					} else {
						local266 = new Class4_Sub3_Sub1_Sub6(arg3, 4, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1035(arg1, arg5, arg4, local165, local266, null, Static80.anIntArray220[arg2], 0, 0, 0, local193, local200);
				} else if (arg7 == 5) {
					local974 = 16;
					local373 = arg6.method1015(arg1, arg5, arg4);
					if (local373 != 0) {
						local974 = Static76.method1244(local373 >> 14 & 0x7FFF).anInt764;
					}
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local1004 = local57.method399(arg2, local165, local181, local136, local173, 4);
					} else {
						local1004 = new Class4_Sub3_Sub1_Sub6(arg3, 4, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1035(arg1, arg5, arg4, local165, local1004, null, Static80.anIntArray220[arg2], 0, local974 * Static19.anIntArray77[arg2], local974 * Static70.anIntArray195[arg2], local193, local200);
				} else if (arg7 == 6) {
					local974 = 8;
					local373 = arg6.method1015(arg1, arg5, arg4);
					if (local373 != 0) {
						local974 = Static76.method1244(local373 >> 14 & 0x7FFF).anInt764 / 2;
					}
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local1004 = local57.method399(arg2 + 4, local165, local181, local136, local173, 4);
					} else {
						local1004 = new Class4_Sub3_Sub1_Sub6(arg3, 4, arg2 + 4, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1035(arg1, arg5, arg4, local165, local1004, null, 256, arg2, local974 * Static59.anIntArray172[arg2], Static77.anIntArray217[arg2] * local974, local193, local200);
				} else if (arg7 == 7) {
					local373 = arg2 + 2 & 0x3;
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local266 = local57.method399(local373 + 4, local165, local181, local136, local173, 4);
					} else {
						local266 = new Class4_Sub3_Sub1_Sub6(arg3, 4, local373 + 4, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1035(arg1, arg5, arg4, local165, local266, null, 256, local373, 0, 0, local193, local200);
				} else if (arg7 == 8) {
					local974 = 8;
					local373 = arg6.method1015(arg1, arg5, arg4);
					if (local373 != 0) {
						local974 = Static76.method1244(local373 >> 14 & 0x7FFF).anInt764 / 2;
					}
					@Pc(1783) int local1783 = arg2 + 2 & 0x3;
					@Pc(1815) Class4_Sub3_Sub1 local1815;
					if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
						local1004 = local57.method399(arg2 + 4, local165, local181, local136, local173, 4);
						local1815 = local57.method399(local1783 + 4, local165, local181, local136, local173, 4);
					} else {
						local1004 = new Class4_Sub3_Sub1_Sub6(arg3, 4, arg2 + 4, arg1, arg5, arg4, local57.anInt753, true, null);
						local1815 = new Class4_Sub3_Sub1_Sub6(arg3, 4, local1783 + 4, arg1, arg5, arg4, local57.anInt753, true, null);
					}
					arg6.method1035(arg1, arg5, arg4, local165, local1004, local1815, 256, arg2, Static59.anIntArray172[arg2] * local974, Static77.anIntArray217[arg2] * local974, local193, local200);
				}
			}
		} else if (!Static8.aBoolean3 || local57.anInt738 != 0 || local57.anInt732 == 1 || local57.aBoolean31) {
			if (local57.anInt753 == -1 && local57.anIntArray81 == null) {
				local266 = local57.method399(arg2, local165, local181, local136, local173, 22);
			} else {
				local266 = new Class4_Sub3_Sub1_Sub6(arg3, 22, arg2, arg1, arg5, arg4, local57.anInt753, true, null);
			}
			arg6.method1011(arg1, arg5, arg4, local165, local266, local193, local200);
			if (local57.anInt732 == 1 && arg0 != null) {
				arg0.method605(arg4, arg5);
			}
		}
	}
}
