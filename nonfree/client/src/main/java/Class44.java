import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YECQDWTF")
public final class Class44 {

	@OriginalMember(owner = "client!YECQDWTF", name = "x", descriptor = "I")
	public static int anInt705;

	@OriginalMember(owner = "client!YECQDWTF", name = "c", descriptor = "I")
	private static int anInt701 = 921;

	@OriginalMember(owner = "client!YECQDWTF", name = "d", descriptor = "[I")
	private static final int[] anIntArray170 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!YECQDWTF", name = "f", descriptor = "[I")
	private static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!YECQDWTF", name = "h", descriptor = "I")
	private static int anInt703 = -4713;

	@OriginalMember(owner = "client!YECQDWTF", name = "i", descriptor = "Z")
	public static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!YECQDWTF", name = "l", descriptor = "I")
	private static int anInt704 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!YECQDWTF", name = "q", descriptor = "[I")
	private static final int[] anIntArray172;

	@OriginalMember(owner = "client!YECQDWTF", name = "y", descriptor = "I")
	public static int anInt706;

	@OriginalMember(owner = "client!YECQDWTF", name = "C", descriptor = "[I")
	private static final int[] anIntArray178;

	@OriginalMember(owner = "client!YECQDWTF", name = "D", descriptor = "I")
	private static int anInt709;

	@OriginalMember(owner = "client!YECQDWTF", name = "b", descriptor = "I")
	private int anInt700 = 28730;

	@OriginalMember(owner = "client!YECQDWTF", name = "g", descriptor = "I")
	private int anInt702 = 390;

	@OriginalMember(owner = "client!YECQDWTF", name = "m", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!YECQDWTF", name = "z", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!YECQDWTF", name = "A", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!YECQDWTF", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!YECQDWTF", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!YECQDWTF", name = "B", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!YECQDWTF", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!YECQDWTF", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!YECQDWTF", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!YECQDWTF", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!YECQDWTF", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!YECQDWTF", name = "r", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!YECQDWTF", name = "s", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!YECQDWTF", name = "t", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!YECQDWTF", name = "u", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!YECQDWTF", name = "v", descriptor = "[I")
	private int[] anIntArray177;

	static {
		aBoolean187 = true;
		anIntArray172 = new int[] { 16, 32, 64, 128 };
		anInt706 = 99;
		anIntArray178 = new int[] { 1, 0, -1, 0 };
		anInt709 = (int) (Math.random() * 33.0D) - 16;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(II)I")
	private static int method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method520(arg0 - 1, arg1 - 1) + method520(arg0 + 1, arg1 - 1) + method520(arg0 - 1, arg1 + 1) + method520(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method520(arg0 - 1, arg1) + method520(arg0 + 1, arg1) + method520(arg0, arg1 - 1) + method520(arg0, arg1 + 1);
		@Pc(59) int local59 = method520(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "b", descriptor = "(II)I")
	private static int method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "d", descriptor = "(II)I")
	private static int method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "([[[IIIIIILclient!BBRQYCNY;IILclient!KFVPSSJH;I)V")
	public static void method525(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class20 arg9) {
		try {
			@Pc(9) int local9 = arg0[arg1][arg2][arg8];
			@Pc(19) int local19 = arg0[arg1][arg2 + 1][arg8];
			@Pc(31) int local31 = arg0[arg1][arg2 + 1][arg8 + 1];
			@Pc(41) int local41 = arg0[arg1][arg2][arg8 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class7 local58 = Class7.method82(arg5);
			@Pc(70) int local70 = arg2 + (arg8 << 7) + (arg5 << 14) + 1073741824;
			if (!local58.aBoolean26) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg4 << 6) + arg3);
			@Pc(104) Class4_Sub1_Sub1 local104;
			if (arg3 == 22) {
				if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
					local104 = local58.method80(22, arg4, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 22, true, local31, arg4, local9, arg5, true, local19, local41);
				}
				arg9.method229(local70, local104, arg8, arg7, local51, arg2, local84);
				if (local58.aBoolean17 && local58.aBoolean26) {
					arg6.method42(arg8, arg2);
				}
			} else {
				@Pc(200) int local200;
				if (arg3 == 10 || arg3 == 11) {
					if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
						local104 = local58.method80(10, arg4, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 10, true, local31, arg4, local9, arg5, true, local19, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg3 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg4 == 1 || arg4 == 3) {
							local200 = local58.anInt61;
							local203 = local58.anInt58;
						} else {
							local200 = local58.anInt58;
							local203 = local58.anInt61;
						}
						arg9.method233(local104, local70, local200, arg2, local84, local51, local187, arg8, arg7, local203);
					}
					if (local58.aBoolean17) {
						arg6.method41(arg2, arg8, local58.anInt58, arg4, local58.aBoolean19, local58.anInt61);
					}
				} else if (arg3 >= 12) {
					if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
						local104 = local58.method80(arg3, arg4, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, arg3, true, local31, arg4, local9, arg5, true, local19, local41);
					}
					arg9.method233(local104, local70, 1, arg2, local84, local51, 0, arg8, arg7, 1);
					if (local58.aBoolean17) {
						arg6.method41(arg2, arg8, local58.anInt58, arg4, local58.aBoolean19, local58.anInt61);
					}
				} else if (arg3 == 0) {
					if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
						local104 = local58.method80(0, arg4, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 0, true, local31, arg4, local9, arg5, true, local19, local41);
					}
					arg9.method231(anIntArray171[arg4], arg7, arg2, 0, null, (byte) 3, local51, local84, local70, arg8, local104);
					if (local58.aBoolean17) {
						arg6.method40(arg4, arg8, arg3, local58.aBoolean19, arg2);
					}
				} else if (arg3 == 1) {
					if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
						local104 = local58.method80(1, arg4, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 1, true, local31, arg4, local9, arg5, true, local19, local41);
					}
					arg9.method231(anIntArray172[arg4], arg7, arg2, 0, null, (byte) 3, local51, local84, local70, arg8, local104);
					if (local58.aBoolean17) {
						arg6.method40(arg4, arg8, arg3, local58.aBoolean19, arg2);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class4_Sub1_Sub1 local475;
					if (arg3 == 2) {
						local446 = arg4 + 1 & 0x3;
						@Pc(465) Class4_Sub1_Sub1 local465;
						if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
							local465 = local58.method80(2, arg4 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method80(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 2, true, local31, arg4 + 4, local9, arg5, true, local19, local41);
							local475 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 2, true, local31, local446, local9, arg5, true, local19, local41);
						}
						arg9.method231(anIntArray171[arg4], arg7, arg2, anIntArray171[local446], local475, (byte) 3, local51, local84, local70, arg8, local465);
						if (local58.aBoolean17) {
							arg6.method40(arg4, arg8, arg3, local58.aBoolean19, arg2);
						}
					} else if (arg3 == 3) {
						if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
							local104 = local58.method80(3, arg4, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 3, true, local31, arg4, local9, arg5, true, local19, local41);
						}
						arg9.method231(anIntArray172[arg4], arg7, arg2, 0, null, (byte) 3, local51, local84, local70, arg8, local104);
						if (local58.aBoolean17) {
							arg6.method40(arg4, arg8, arg3, local58.aBoolean19, arg2);
						}
					} else if (arg3 == 9) {
						if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
							local104 = local58.method80(arg3, arg4, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, arg3, true, local31, arg4, local9, arg5, true, local19, local41);
						}
						arg9.method233(local104, local70, 1, arg2, local84, local51, 0, arg8, arg7, 1);
						if (local58.aBoolean17) {
							arg6.method41(arg2, arg8, local58.anInt58, arg4, local58.aBoolean19, local58.anInt61);
						}
					} else {
						if (local58.aBoolean21) {
							if (arg4 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg4 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg4 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg3 == 4) {
							if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
								local104 = local58.method80(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 4, true, local31, 0, local9, arg5, true, local19, local41);
							}
							arg9.method232(arg4 * 512, local84, arg7, 0, anIntArray171[arg4], local70, 0, arg2, local104, arg8, local51);
						} else if (arg3 == 5) {
							local446 = 16;
							local200 = arg9.method249(arg7, arg2, arg8);
							if (local200 > 0) {
								local446 = Class7.method82(local200 >> 14 & 0x7FFF).anInt48;
							}
							if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
								local475 = local58.method80(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 4, true, local31, 0, local9, arg5, true, local19, local41);
							}
							arg9.method232(arg4 * 512, local84, arg7, anIntArray178[arg4] * local446, anIntArray171[arg4], local70, anIntArray170[arg4] * local446, arg2, local475, arg8, local51);
						} else if (arg3 == 6) {
							if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
								local104 = local58.method80(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 4, true, local31, 0, local9, arg5, true, local19, local41);
							}
							arg9.method232(arg4, local84, arg7, 0, 256, local70, 0, arg2, local104, arg8, local51);
						} else if (arg3 == 7) {
							if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
								local104 = local58.method80(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 4, true, local31, 0, local9, arg5, true, local19, local41);
							}
							arg9.method232(arg4, local84, arg7, 0, 512, local70, 0, arg2, local104, arg8, local51);
						} else if (arg3 == 8) {
							if (local58.anInt45 == -1 && local58.anIntArray14 == null) {
								local104 = local58.method80(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local58.anInt45, 4, true, local31, 0, local9, arg5, true, local19, local41);
							}
							arg9.method232(arg4, local84, arg7, 0, 768, local70, 0, arg2, local104, arg8, local51);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("28400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + -441 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "b", descriptor = "(III)I")
	private static int method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method519(local3, local13);
		@Pc(29) int local29 = method519(local3 + 1, local13);
		@Pc(35) int local35 = method519(local3, local13 + 1);
		@Pc(43) int local43 = method519(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method540(local23, local29, local9, arg2);
		@Pc(55) int local55 = method540(local35, local43, local9, arg2);
		return method540(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(I[BIZ)Z")
	public static boolean method534(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) boolean local7 = true;
			@Pc(13) Class4_Sub1_Sub4 local13 = new Class4_Sub1_Sub4(5, arg1);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local13.method369();
				if (local18 == 0) {
					return local7;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local13.method369();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local13.method355() >> 2;
						@Pc(70) int local70 = local61 + arg0;
						@Pc(74) int local74 = local55 + arg2;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class7 local87 = Class7.method82(local15);
							if (local66 != 22 || !aBoolean185 || local87.aBoolean26 || local87.aBoolean29) {
								local7 &= local87.method73();
								local28 = true;
							}
						}
					}
					local33 = local13.method369();
					if (local33 == 0) {
						break;
					}
					local13.method355();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("51952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "e", descriptor = "(II)I")
	private static int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method531(arg0 + 45365, arg1 + 91923, 4) + (method531(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method531(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IZI)Z")
	public static boolean method538(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class7 local2 = Class7.method82(arg2);
			if (!arg1) {
				throw new NullPointerException();
			}
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method78(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("25460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(BLclient!DGAWSPEW;Lclient!PGNBHFUF;)V")
	public static void method539(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = arg2.method369();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(28) Class7 local28 = Class7.method82(local16);
				local28.method81(arg1);
				while (true) {
					@Pc(35) int local35 = arg2.method369();
					if (local35 == 0) {
						break;
					}
					arg2.method355();
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("87358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IIII)I")
	private static int method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class4_Sub1_Sub2_Sub1.anIntArray26[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "<init>", descriptor = "(I[[[IZI[[[B)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt706 = 99;
			this.anInt707 = arg3;
			this.anInt708 = arg0;
			this.anIntArrayArrayArray6 = arg1;
			this.aByteArrayArrayArray7 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt707][this.anInt708];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt707][this.anInt708];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt707][this.anInt708];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt707][this.anInt708];
			this.anIntArrayArrayArray5 = new int[4][this.anInt707 + 1][this.anInt708 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt707 + 1][this.anInt708 + 1];
			this.anIntArrayArray19 = new int[this.anInt707 + 1][this.anInt708 + 1];
			this.anIntArray173 = new int[this.anInt708];
			this.anIntArray174 = new int[this.anInt708];
			this.anIntArray175 = new int[this.anInt708];
			this.anIntArray176 = new int[this.anInt708];
			this.anIntArray177 = new int[this.anInt708];
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("97252, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "c", descriptor = "(II)I")
	private int method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(III)I")
	private int method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IIIB)V")
	public void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				for (local11 = 0; local11 < 8; local11++) {
					this.anIntArrayArrayArray6[arg1][arg0 + local7][arg2 + local11] = 0;
				}
			}
			if (arg0 > 0) {
				for (local11 = 1; local11 < 8; local11++) {
					this.anIntArrayArrayArray6[arg1][arg0][arg2 + local11] = this.anIntArrayArrayArray6[arg1][arg0 - 1][arg2 + local11];
				}
			}
			if (arg2 > 0) {
				for (local11 = 1; local11 < 8; local11++) {
					this.anIntArrayArrayArray6[arg1][arg0 + local11][arg2] = this.anIntArrayArrayArray6[arg1][arg0 + local11][arg2 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray6[arg1][arg0][arg2] = this.anIntArrayArrayArray6[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg0][arg2] = this.anIntArrayArrayArray6[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg0][arg2] = this.anIntArrayArrayArray6[arg1][arg0 - 1][arg2 - 1];
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("85654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -21 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IIILclient!KFVPSSJH;ILclient!BBRQYCNY;III)V")
	private void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean185 && (this.aByteArrayArrayArray7[0][arg6][arg1] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray7[arg0][arg6][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method529(arg0, arg6, arg1) != anInt705) {
					return;
				}
			}
			if (arg0 < anInt706) {
				anInt706 = arg0;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray6[arg0][arg6][arg1];
			@Pc(60) int local60 = this.anIntArrayArrayArray6[arg0][arg6 + 1][arg1];
			@Pc(73) int local73 = this.anIntArrayArrayArray6[arg0][arg6 + 1][arg1 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray6[arg0][arg6][arg1 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class7 local97 = Class7.method82(arg4);
			@Pc(109) int local109 = arg6 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!local97.aBoolean26) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(134) byte local134 = (byte) ((arg7 << 6) + arg2);
			@Pc(163) Class4_Sub1_Sub1 local163;
			if (arg2 != 22) {
				@Pc(261) int local261;
				if (arg2 == 10 || arg2 == 11) {
					if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
						local163 = local97.method80(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 10, true, local73, arg7, local49, arg4, true, local60, local84);
					}
					if (local163 != null) {
						@Pc(248) int local248 = 0;
						if (arg2 == 11) {
							local248 += 256;
						}
						@Pc(264) int local264;
						if (arg7 == 1 || arg7 == 3) {
							local261 = local97.anInt61;
							local264 = local97.anInt58;
						} else {
							local261 = local97.anInt58;
							local264 = local97.anInt61;
						}
						if (arg3.method233(local163, local109, local261, arg6, local134, local94, local248, arg1, arg0, local264) && local97.aBoolean18) {
							@Pc(295) Class4_Sub1_Sub1_Sub4 local295;
							if (local163 instanceof Class4_Sub1_Sub1_Sub4) {
								local295 = (Class4_Sub1_Sub1_Sub4) local163;
							} else {
								local295 = local97.method80(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local295 != null) {
								for (@Pc(311) int local311 = 0; local311 <= local261; local311++) {
									for (@Pc(315) int local315 = 0; local315 <= local264; local315++) {
										@Pc(322) int local322 = local295.anInt527 / 4;
										if (local322 > 30) {
											local322 = 30;
										}
										if (local322 > this.aByteArrayArrayArray3[arg0][arg6 + local311][arg1 + local315]) {
											this.aByteArrayArrayArray3[arg0][arg6 + local311][arg1 + local315] = (byte) local322;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean17 && arg5 != null) {
						arg5.method41(arg6, arg1, local97.anInt58, arg7, local97.aBoolean19, local97.anInt61);
					}
				} else if (arg2 >= 12) {
					if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
						local163 = local97.method80(arg2, arg7, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, arg2, true, local73, arg7, local49, arg4, true, local60, local84);
					}
					arg3.method233(local163, local109, 1, arg6, local134, local94, 0, arg1, arg0, 1);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x924;
					}
					if (local97.aBoolean17 && arg5 != null) {
						arg5.method41(arg6, arg1, local97.anInt58, arg7, local97.aBoolean19, local97.anInt61);
					}
				} else if (arg2 == 0) {
					if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
						local163 = local97.method80(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 0, true, local73, arg7, local49, arg4, true, local60, local84);
					}
					arg3.method231(anIntArray171[arg7], arg0, arg6, 0, null, (byte) 3, local94, local134, local109, arg1, local163);
					if (arg7 == 0) {
						if (local97.aBoolean18) {
							this.aByteArrayArrayArray3[arg0][arg6][arg1] = 50;
							this.aByteArrayArrayArray3[arg0][arg6][arg1 + 1] = 50;
						}
						if (local97.aBoolean23) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local97.aBoolean18) {
							this.aByteArrayArrayArray3[arg0][arg6][arg1 + 1] = 50;
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1 + 1] = 50;
						}
						if (local97.aBoolean23) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local97.aBoolean18) {
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1] = 50;
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1 + 1] = 50;
						}
						if (local97.aBoolean23) {
							this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local97.aBoolean18) {
							this.aByteArrayArrayArray3[arg0][arg6][arg1] = 50;
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1] = 50;
						}
						if (local97.aBoolean23) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
						}
					}
					if (local97.aBoolean17 && arg5 != null) {
						arg5.method40(arg7, arg1, arg2, local97.aBoolean19, arg6);
					}
					if (local97.anInt48 != 16) {
						arg3.method239(arg1, local97.anInt48, arg0, arg6);
					}
				} else if (arg2 == 1) {
					if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
						local163 = local97.method80(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 1, true, local73, arg7, local49, arg4, true, local60, local84);
					}
					arg3.method231(anIntArray172[arg7], arg0, arg6, 0, null, (byte) 3, local94, local134, local109, arg1, local163);
					if (local97.aBoolean18) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray3[arg0][arg6][arg1 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray3[arg0][arg6][arg1] = 50;
						}
					}
					if (local97.aBoolean17 && arg5 != null) {
						arg5.method40(arg7, arg1, arg2, local97.aBoolean19, arg6);
					}
				} else {
					@Pc(872) int local872;
					@Pc(901) Class4_Sub1_Sub1 local901;
					if (arg2 == 2) {
						local872 = arg7 + 1 & 0x3;
						@Pc(891) Class4_Sub1_Sub1 local891;
						if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
							local891 = local97.method80(2, arg7 + 4, local49, local60, local73, local84, -1);
							local901 = local97.method80(2, local872, local49, local60, local73, local84, -1);
						} else {
							local891 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 2, true, local73, arg7 + 4, local49, arg4, true, local60, local84);
							local901 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 2, true, local73, local872, local49, arg4, true, local60, local84);
						}
						arg3.method231(anIntArray171[arg7], arg0, arg6, anIntArray171[local872], local901, (byte) 3, local94, local134, local109, arg1, local891);
						if (local97.aBoolean23) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
							}
						}
						if (local97.aBoolean17 && arg5 != null) {
							arg5.method40(arg7, arg1, arg2, local97.aBoolean19, arg6);
						}
						if (local97.anInt48 != 16) {
							arg3.method239(arg1, local97.anInt48, arg0, arg6);
						}
					} else if (arg2 == 3) {
						if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
							local163 = local97.method80(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 3, true, local73, arg7, local49, arg4, true, local60, local84);
						}
						arg3.method231(anIntArray172[arg7], arg0, arg6, 0, null, (byte) 3, local94, local134, local109, arg1, local163);
						if (local97.aBoolean18) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray3[arg0][arg6][arg1 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray3[arg0][arg6 + 1][arg1] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray3[arg0][arg6][arg1] = 50;
							}
						}
						if (local97.aBoolean17 && arg5 != null) {
							arg5.method40(arg7, arg1, arg2, local97.aBoolean19, arg6);
						}
					} else if (arg2 == 9) {
						if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
							local163 = local97.method80(arg2, arg7, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, arg2, true, local73, arg7, local49, arg4, true, local60, local84);
						}
						arg3.method233(local163, local109, 1, arg6, local134, local94, 0, arg1, arg0, 1);
						if (local97.aBoolean17 && arg5 != null) {
							arg5.method41(arg6, arg1, local97.anInt58, arg7, local97.aBoolean19, local97.anInt61);
						}
					} else {
						if (local97.aBoolean21) {
							if (arg7 == 1) {
								local872 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local872;
							} else if (arg7 == 2) {
								local872 = local84;
								local84 = local60;
								local60 = local872;
								local872 = local73;
								local73 = local49;
								local49 = local872;
							} else if (arg7 == 3) {
								local872 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local872;
							}
						}
						if (arg2 == 4) {
							if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
								local163 = local97.method80(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 4, true, local73, 0, local49, arg4, true, local60, local84);
							}
							arg3.method232(arg7 * 512, local134, arg0, 0, anIntArray171[arg7], local109, 0, arg6, local163, arg1, local94);
						} else if (arg2 == 5) {
							local872 = 16;
							local261 = arg3.method249(arg0, arg6, arg1);
							if (local261 > 0) {
								local872 = Class7.method82(local261 >> 14 & 0x7FFF).anInt48;
							}
							if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
								local901 = local97.method80(4, 0, local49, local60, local73, local84, -1);
							} else {
								local901 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 4, true, local73, 0, local49, arg4, true, local60, local84);
							}
							arg3.method232(arg7 * 512, local134, arg0, anIntArray178[arg7] * local872, anIntArray171[arg7], local109, anIntArray170[arg7] * local872, arg6, local901, arg1, local94);
						} else if (arg2 == 6) {
							if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
								local163 = local97.method80(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 4, true, local73, 0, local49, arg4, true, local60, local84);
							}
							arg3.method232(arg7, local134, arg0, 0, 256, local109, 0, arg6, local163, arg1, local94);
						} else if (arg2 == 7) {
							if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
								local163 = local97.method80(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 4, true, local73, 0, local49, arg4, true, local60, local84);
							}
							arg3.method232(arg7, local134, arg0, 0, 512, local109, 0, arg6, local163, arg1, local94);
						} else if (arg2 == 8) {
							if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
								local163 = local97.method80(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 4, true, local73, 0, local49, arg4, true, local60, local84);
							}
							arg3.method232(arg7, local134, arg0, 0, 768, local109, 0, arg6, local163, arg1, local94);
						}
					}
				}
			} else if (!aBoolean185 || local97.aBoolean26 || local97.aBoolean29) {
				if (local97.anInt45 == -1 && local97.anIntArray14 == null) {
					local163 = local97.method80(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local163 = new Class4_Sub1_Sub1_Sub6(local97.anInt45, 22, true, local73, arg7, local49, arg4, true, local60, local84);
				}
				arg3.method229(local109, local163, arg1, arg0, local94, arg6, local134);
				if (local97.aBoolean17 && local97.aBoolean26 && arg5 != null) {
					arg5.method42(arg1, arg6);
				}
			}
		} catch (@Pc(1646) RuntimeException local1646) {
			signlink.reporterror("18714, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 22392 + ", " + arg6 + ", " + arg7 + ", " + local1646.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "([BIII[Lclient!BBRQYCNY;Lclient!KFVPSSJH;)V")
	public void method527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(5) Class20 arg4) {
		try {
			@Pc(7) Class4_Sub1_Sub4 local7 = new Class4_Sub1_Sub4(5, arg0);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method369();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method369();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method355();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg2;
					@Pc(73) int local73 = local44 + arg1;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray7[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class2 local100 = null;
						if (local85 >= 0) {
							local100 = arg3[local85];
						}
						this.method526(local54, local73, local61, arg4, local9, local100, local69, local65);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("7646, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(BIIII[B[Lclient!BBRQYCNY;IIILclient!KFVPSSJH;)V")
	public void method528(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) Class2[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20 arg10) {
		try {
			@Pc(7) Class4_Sub1_Sub4 local7 = new Class4_Sub1_Sub4(5, arg5);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(22) int local22 = local7.method369();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method369();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method355();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg8 && local51 >= arg4 && local51 < arg4 + 8 && local45 >= arg3 && local45 < arg3 + 8) {
						@Pc(88) Class7 local88 = Class7.method82(local9);
						@Pc(105) int local105 = arg7 + Class37.method445(local51 & 0x7, local66, local88.anInt61, local45 & 0x7, local88.anInt58, arg2);
						@Pc(122) int local122 = arg9 + Class37.method446(local51 & 0x7, local66, local45 & 0x7, arg2, local88.anInt61, local88.anInt58);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg1;
							if ((this.aByteArrayArrayArray7[1][local105][local122] & 0x2) == 2) {
								local134 = arg1 - 1;
							}
							@Pc(149) Class2 local149 = null;
							if (local134 >= 0) {
								local149 = arg6[local134];
							}
							this.method526(arg1, local122, local62, arg10, local9, local149, local105, local66 + arg2 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("43320, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IZII)I")
	private int method529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray7[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22195, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(BLclient!KFVPSSJH;[Lclient!BBRQYCNY;)V")
	public void method530(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class2[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray7[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method42(local11, local7);
							}
						}
					}
				}
			}
			anInt704 += (int) (Math.random() * 5.0D) - 2;
			if (anInt704 < -8) {
				anInt704 = -8;
			}
			if (anInt704 > 8) {
				anInt704 = 8;
			}
			anInt709 += (int) (Math.random() * 5.0D) - 2;
			if (anInt709 < -16) {
				anInt709 = -16;
			}
			if (anInt709 > 16) {
				anInt709 = 16;
			}
			@Pc(133) int local133;
			@Pc(139) int local139;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(169) int local169;
			@Pc(191) int local191;
			@Pc(204) int local204;
			@Pc(210) int local210;
			@Pc(214) int local214;
			@Pc(220) int local220;
			@Pc(236) int local236;
			@Pc(284) int local284;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray3[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt708 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt707 - 1; local145++) {
						local169 = this.anIntArrayArrayArray6[local7][local145 + 1][local141] - this.anIntArrayArrayArray6[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray6[local7][local145][local141 + 1] - this.anIntArrayArrayArray6[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray19[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt708; local145++) {
					this.anIntArray173[local145] = 0;
					this.anIntArray174[local145] = 0;
					this.anIntArray175[local145] = 0;
					this.anIntArray176[local145] = 0;
					this.anIntArray177[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt707 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt708; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt707) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class38 local378 = Class38.aClass38Array1[local210 - 1];
								this.anIntArray173[local191] += local378.anInt614;
								this.anIntArray174[local191] += local378.anInt612;
								this.anIntArray175[local191] += local378.anInt613;
								this.anIntArray176[local191] += local378.anInt615;
								local419 = this.anIntArray177[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt707) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class38 local451 = Class38.aClass38Array1[local214 - 1];
								this.anIntArray173[local191] -= local451.anInt614;
								this.anIntArray174[local191] -= local451.anInt612;
								this.anIntArray175[local191] -= local451.anInt613;
								this.anIntArray176[local191] -= local451.anInt615;
								local419 = this.anIntArray177[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt707 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt708 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt708) {
								local204 += this.anIntArray173[local527];
								local210 += this.anIntArray174[local527];
								local214 += this.anIntArray175[local527];
								local220 += this.anIntArray176[local527];
								local236 += this.anIntArray177[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt708) {
								local204 -= this.anIntArray173[local572];
								local210 -= this.anIntArray174[local572];
								local214 -= this.anIntArray175[local572];
								local220 -= this.anIntArray176[local572];
								local236 -= this.anIntArray177[local572];
							}
							if (local284 >= 1 && local284 < this.anInt708 - 1 && (!aBoolean185 || (this.aByteArrayArrayArray7[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray7[local7][local169][local284] & 0x10) == 0 && this.method529(local7, local169, local284) == anInt705)) {
								if (local7 < anInt706) {
									anInt706 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray6[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray6[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray6[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray6[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray19[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray19[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray19[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray19[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method522(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt704 & 0xFF;
										local786 += anInt709;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method522(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class38.aClass38Array1[local682 - 1].aBoolean163) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray5[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class4_Sub1_Sub2_Sub1.anIntArray30[method524(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method228(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method524(local768, local737), method524(local768, local746), method524(local768, local757), method524(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(941) Class38 local941 = Class38.aClass38Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt610;
										@Pc(953) int local953;
										@Pc(951) int local951;
										if (local944 >= 0) {
											local951 = Class4_Sub1_Sub2_Sub1.method141(this.anInt702, local944);
											local953 = -1;
										} else if (local941.anInt609 == 16711935) {
											local953 = -2;
											local944 = -1;
											local951 = Class4_Sub1_Sub2_Sub1.anIntArray30[this.method521(local941.anInt616, 96)];
										} else {
											local953 = this.method522(local941.anInt611, local941.anInt612, local941.anInt613);
											local951 = Class4_Sub1_Sub2_Sub1.anIntArray30[this.method521(local941.anInt616, 96)];
										}
										arg0.method228(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method524(local768, local737), method524(local768, local746), method524(local768, local757), method524(local768, local766), this.method521(local953, local737), this.method521(local953, local746), this.method521(local953, local757), this.method521(local953, local766), local778, local951);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt708 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt707 - 1; local204++) {
						arg0.method227(local7, local204, local191, this.method529(local7, local204, local191));
					}
				}
			}
			arg0.method254(487);
			for (local11 = 0; local11 < this.anInt707; local11++) {
				for (local27 = 0; local27 < this.anInt708; local27++) {
					if ((this.aByteArrayArrayArray7[1][local11][local27] & 0x2) == 2) {
						arg0.method225(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1137) int local1137 = 2;
			@Pc(1139) int local1139 = 4;
			for (@Pc(1141) int local1141 = 0; local1141 < 4; local1141++) {
				if (local1141 > 0) {
					local27 <<= 0x3;
					local1137 <<= 0x3;
					local1139 <<= 0x3;
				}
				for (@Pc(1159) int local1159 = 0; local1159 <= local1141; local1159++) {
					for (local133 = 0; local133 <= this.anInt708; local133++) {
						for (local139 = 0; local139 <= this.anInt707; local139++) {
							if ((this.anIntArrayArrayArray5[local1159][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray5[local1159][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt708 && (this.anIntArrayArrayArray5[local1159][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray6[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray6[local169][local139][local141];
									Class20.method226(1, local214, local145 * 128 + 128, local139 * 128, local1141, local220, local141 * 128, local139 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray5[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1159][local139][local133] & local1137) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray5[local1159][local141 - 1][local133] & local1137) != 0) {
									local141--;
								}
								while (local145 < this.anInt707 && (this.anIntArrayArrayArray5[local1159][local145 + 1][local133] & local1137) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local169 - 1][local204][local133] & local1137) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local191 + 1][local204][local133] & local1137) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray6[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray6[local169][local141][local133];
									Class20.method226(2, local214, local133 * 128, local145 * 128 + 128, local1141, local220, local133 * 128, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray5[local236][local284][local133] &= ~local1137;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1159][local139][local133] & local1139) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray5[local1159][local139][local169 - 1] & local1139) != 0) {
									local169--;
								}
								while (local191 < this.anInt708 && (this.anIntArrayArrayArray5[local1159][local139][local191 + 1] & local1139) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray5[local1159][local141 - 1][local204] & local1139) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt707) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray5[local1159][local145 + 1][local204] & local1139) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray6[local1159][local141][local169];
									Class20.method226(4, local204, local191 * 128 + 128, local145 * 128 + 128, local1141, local204, local169 * 128, local141 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray5[local1159][local210][local214] &= ~local1139;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1774) RuntimeException local1774) {
			signlink.reporterror("71006, " + 95 + ", " + arg0 + ", " + arg1 + ", " + local1774.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(Lclient!PGNBHFUF;IIIIIII)V")
	private void method532(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(33) int local33;
			if (arg6 >= 0 && arg6 < 104 && arg3 >= 0 && arg3 < 104) {
				this.aByteArrayArrayArray7[arg2][arg6][arg3] = 0;
				while (true) {
					local33 = arg0.method355();
					if (local33 == 0) {
						if (arg2 == 0) {
							this.anIntArrayArrayArray6[0][arg6][arg3] = -method535(arg6 + arg5 + 932731, arg3 + 556238 + arg4) * 8;
							return;
						} else {
							this.anIntArrayArrayArray6[arg2][arg6][arg3] = this.anIntArrayArrayArray6[arg2 - 1][arg6][arg3] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg0.method355();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg2 == 0) {
							this.anIntArrayArrayArray6[0][arg6][arg3] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray6[arg2][arg6][arg3] = this.anIntArrayArrayArray6[arg2 - 1][arg6][arg3] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray6[arg2][arg6][arg3] = arg0.method356();
						this.aByteArrayArrayArray4[arg2][arg6][arg3] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray5[arg2][arg6][arg3] = (byte) (local33 + arg1 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray7[arg2][arg6][arg3] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray2[arg2][arg6][arg3] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg0.method355();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg0.method355();
						return;
					}
					if (local33 <= 49) {
						arg0.method355();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("39232, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(I[Lclient!BBRQYCNY;[BIIII)V")
	public void method533(@OriginalArg(0) int arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
							arg1[local3].anIntArrayArray1[arg3 + local7][arg5 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class4_Sub1_Sub4 local65 = new Class4_Sub1_Sub4(5, arg2);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method532(local65, 0, local11, local75 + arg5, arg4, arg0, local71 + arg3);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("83828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(III[Lclient!BBRQYCNY;III[BIB)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg1 + local3 > 0 && arg1 + local3 < 103 && arg6 + local7 > 0 && arg6 + local7 < 103) {
						arg3[arg4].anIntArrayArray1[arg1 + local3][arg6 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class4_Sub1_Sub4 local57 = new Class4_Sub1_Sub4(5, arg7);
			for (@Pc(63) int local63 = 0; local63 < 4; local63++) {
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						if (local63 == arg5 && local67 >= arg2 && local67 < arg2 + 8 && local71 >= arg8 && local71 < arg8 + 8) {
							this.method532(local57, arg0, arg4, arg6 + Class37.method444(local71 & 0x7, local67 & 0x7, arg0), 0, 0, arg1 + Class37.method443(arg0, local67 & 0x7, local71 & 0x7));
						} else {
							this.method532(local57, 0, 0, -1, 0, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("23800, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 85 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YECQDWTF", name = "a", descriptor = "(IIIII)V")
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg2; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt707 && local3 >= 0 && local3 < this.anInt708) {
						this.aByteArrayArrayArray3[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg3 && local7 < this.anInt707 - 1) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg2 && local3 < this.anInt708 - 1) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("67281, " + arg0 + ", " + arg1 + ", " + 669 + ", " + arg2 + ", " + arg3 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
