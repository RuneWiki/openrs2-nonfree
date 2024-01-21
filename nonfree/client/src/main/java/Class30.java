import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QJLJTPQV")
public final class Class30 {

	@OriginalMember(owner = "client!QJLJTPQV", name = "u", descriptor = "I")
	public static int anInt433;

	@OriginalMember(owner = "client!QJLJTPQV", name = "I", descriptor = "I")
	private static int anInt439;

	@OriginalMember(owner = "client!QJLJTPQV", name = "b", descriptor = "Z")
	public static boolean aBoolean137 = true;

	@OriginalMember(owner = "client!QJLJTPQV", name = "d", descriptor = "I")
	private static int anInt428 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!QJLJTPQV", name = "k", descriptor = "[I")
	private static final int[] anIntArray89;

	@OriginalMember(owner = "client!QJLJTPQV", name = "v", descriptor = "[I")
	private static final int[] anIntArray95;

	@OriginalMember(owner = "client!QJLJTPQV", name = "A", descriptor = "[I")
	private static final int[] anIntArray96;

	@OriginalMember(owner = "client!QJLJTPQV", name = "B", descriptor = "[I")
	private static final int[] anIntArray97;

	@OriginalMember(owner = "client!QJLJTPQV", name = "D", descriptor = "I")
	private static int anInt434;

	@OriginalMember(owner = "client!QJLJTPQV", name = "E", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!QJLJTPQV", name = "c", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!QJLJTPQV", name = "h", descriptor = "I")
	private int anInt429 = -738;

	@OriginalMember(owner = "client!QJLJTPQV", name = "i", descriptor = "I")
	private int anInt430 = -738;

	@OriginalMember(owner = "client!QJLJTPQV", name = "j", descriptor = "I")
	private int anInt431 = -45738;

	@OriginalMember(owner = "client!QJLJTPQV", name = "l", descriptor = "I")
	private int anInt432 = 24940;

	@OriginalMember(owner = "client!QJLJTPQV", name = "t", descriptor = "B")
	private byte aByte11 = 64;

	@OriginalMember(owner = "client!QJLJTPQV", name = "x", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!QJLJTPQV", name = "z", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!QJLJTPQV", name = "H", descriptor = "I")
	private int anInt438 = -45738;

	@OriginalMember(owner = "client!QJLJTPQV", name = "F", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!QJLJTPQV", name = "G", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!QJLJTPQV", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!QJLJTPQV", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!QJLJTPQV", name = "J", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!QJLJTPQV", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!QJLJTPQV", name = "y", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!QJLJTPQV", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!QJLJTPQV", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!QJLJTPQV", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!QJLJTPQV", name = "o", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!QJLJTPQV", name = "p", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!QJLJTPQV", name = "q", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!QJLJTPQV", name = "r", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!QJLJTPQV", name = "s", descriptor = "[I")
	private int[] anIntArray94;

	static {
		aBoolean138 = true;
		anIntArray89 = new int[] { 1, 2, 4, 8 };
		anIntArray95 = new int[] { 16, 32, 64, 128 };
		anIntArray96 = new int[] { 0, -1, 0, 1 };
		anIntArray97 = new int[] { 1, 0, -1, 0 };
		anInt434 = (int) (Math.random() * 17.0D) - 8;
		anInt435 = 99;
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(IIII)I")
	private static int method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub1_Sub1_Sub3.anIntArray145[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "([BIII)Z")
	public static boolean method330(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class3_Sub1_Sub3 local9 = new Class3_Sub1_Sub3(0, arg0);
			@Pc(21) int local21 = -1;
			label53: while (true) {
				@Pc(24) int local24 = local9.method160();
				if (local24 == 0) {
					return local3;
				}
				local21 += local24;
				@Pc(32) int local32 = 0;
				@Pc(34) boolean local34 = false;
				while (true) {
					@Pc(39) int local39;
					while (!local34) {
						local39 = local9.method160();
						if (local39 == 0) {
							continue label53;
						}
						local32 += local39 - 1;
						@Pc(61) int local61 = local32 & 0x3F;
						@Pc(67) int local67 = local32 >> 6 & 0x3F;
						@Pc(72) int local72 = local9.method146() >> 2;
						@Pc(76) int local76 = local67 + arg1;
						@Pc(80) int local80 = local61 + arg2;
						if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
							@Pc(93) Class29 local93 = Class29.method321(local21);
							if (local72 != 22 || !aBoolean137 || local93.aBoolean132 || local93.aBoolean131) {
								local3 &= local93.method324();
								local34 = true;
							}
						}
					}
					local39 = local9.method160();
					if (local39 == 0) {
						break;
					}
					local9.method146();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("61000, " + arg0 + ", " + arg1 + ", " + -898 + ", " + arg2 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(ILclient!IMUIZRAF;Lclient!TDBJVJCU;)V")
	public static void method338(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) Class19_Sub1 arg2) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 != -23175) {
				anInt439 = -204;
			}
			while (true) {
				@Pc(11) int local11 = arg1.method160();
				if (local11 == 0) {
					return;
				}
				local3 += local11;
				@Pc(20) Class29 local20 = Class29.method321(local3);
				local20.method319(arg2);
				while (true) {
					@Pc(27) int local27 = arg1.method160();
					if (local27 == 0) {
						break;
					}
					arg1.method146();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("6965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "b", descriptor = "(II)I")
	private static int method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method344(arg0 - 1, arg1 - 1) + method344(arg0 + 1, arg1 - 1) + method344(arg0 - 1, arg1 + 1) + method344(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method344(arg0 - 1, arg1) + method344(arg0 + 1, arg1) + method344(arg0, arg1 - 1) + method344(arg0, arg1 + 1);
		@Pc(59) int local59 = method344(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(I[[[IIILclient!WWMUUFBO;IIIIILclient!LIOYHOWO;)V")
	public static void method340(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class25 arg10) {
		try {
			@Pc(9) int local9 = arg1[arg2][arg0][arg7];
			@Pc(19) int local19 = arg1[arg2][arg0 + 1][arg7];
			@Pc(23) boolean local23 = false;
			@Pc(35) int local35 = arg1[arg2][arg0 + 1][arg7 + 1];
			@Pc(45) int local45 = arg1[arg2][arg0][arg7 + 1];
			@Pc(55) int local55 = local9 + local19 + local35 + local45 >> 2;
			@Pc(58) Class29 local58 = Class29.method321(arg8);
			@Pc(70) int local70 = arg0 + (arg7 << 7) + (arg8 << 14) + 1073741824;
			if (!local58.aBoolean132) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg3 << 6) + arg5);
			@Pc(104) Class3_Sub1_Sub2 local104;
			if (arg5 == 22) {
				if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
					local104 = local58.method328(22, arg3, local9, local19, local35, local45, -1);
				} else {
					local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 22);
				}
				arg10.method241(arg0, local84, local70, arg9, arg7, local104, local55);
				if (local58.aBoolean136 && local58.aBoolean132) {
					arg4.method490(arg7, arg0);
				}
			} else {
				@Pc(200) int local200;
				if (arg5 == 10 || arg5 == 11) {
					if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
						local104 = local58.method328(10, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 10);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg5 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg3 == 1 || arg3 == 3) {
							local200 = local58.anInt411;
							local203 = local58.anInt421;
						} else {
							local200 = local58.anInt421;
							local203 = local58.anInt411;
						}
						arg10.method245(local84, local55, arg9, local104, local187, local203, arg7, local70, arg0, local200);
					}
					if (local58.aBoolean136) {
						arg4.method489(arg3, local58.anInt421, arg0, local58.anInt411, local58.aBoolean133, arg7);
					}
				} else if (arg5 >= 12) {
					if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
						local104 = local58.method328(arg5, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, arg5);
					}
					arg10.method245(local84, local55, arg9, local104, 0, 1, arg7, local70, arg0, 1);
					if (local58.aBoolean136) {
						arg4.method489(arg3, local58.anInt421, arg0, local58.anInt411, local58.aBoolean133, arg7);
					}
				} else if (arg5 == 0) {
					if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
						local104 = local58.method328(0, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 0);
					}
					arg10.method243(arg9, anIntArray89[arg3], arg7, 0, local104, arg0, local70, null, local55, local84);
					if (local58.aBoolean136) {
						arg4.method488(arg0, arg5, arg3, arg7, local58.aBoolean133);
					}
				} else if (arg5 == 1) {
					if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
						local104 = local58.method328(1, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 1);
					}
					arg10.method243(arg9, anIntArray95[arg3], arg7, 0, local104, arg0, local70, null, local55, local84);
					if (local58.aBoolean136) {
						arg4.method488(arg0, arg5, arg3, arg7, local58.aBoolean133);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class3_Sub1_Sub2 local475;
					if (arg5 == 2) {
						local446 = arg3 + 1 & 0x3;
						@Pc(465) Class3_Sub1_Sub2 local465;
						if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
							local465 = local58.method328(2, arg3 + 4, local9, local19, local35, local45, -1);
							local475 = local58.method328(2, local446, local9, local19, local35, local45, -1);
						} else {
							local465 = new Class3_Sub1_Sub2_Sub3(arg3 + 4, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 2);
							local475 = new Class3_Sub1_Sub2_Sub3(local446, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 2);
						}
						arg10.method243(arg9, anIntArray89[arg3], arg7, anIntArray89[local446], local465, arg0, local70, local475, local55, local84);
						if (local58.aBoolean136) {
							arg4.method488(arg0, arg5, arg3, arg7, local58.aBoolean133);
						}
					} else if (arg5 == 3) {
						if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
							local104 = local58.method328(3, arg3, local9, local19, local35, local45, -1);
						} else {
							local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 3);
						}
						arg10.method243(arg9, anIntArray95[arg3], arg7, 0, local104, arg0, local70, null, local55, local84);
						if (local58.aBoolean136) {
							arg4.method488(arg0, arg5, arg3, arg7, local58.aBoolean133);
						}
					} else if (arg5 == 9) {
						if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
							local104 = local58.method328(arg5, arg3, local9, local19, local35, local45, -1);
						} else {
							local104 = new Class3_Sub1_Sub2_Sub3(arg3, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, arg5);
						}
						arg10.method245(local84, local55, arg9, local104, 0, 1, arg7, local70, arg0, 1);
						if (local58.aBoolean136) {
							arg4.method489(arg3, local58.anInt421, arg0, local58.anInt411, local58.aBoolean133, arg7);
						}
					} else {
						if (local58.aBoolean128) {
							if (arg3 == 1) {
								local446 = local45;
								local45 = local35;
								local35 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg3 == 2) {
								local446 = local45;
								local45 = local19;
								local19 = local446;
								local446 = local35;
								local35 = local9;
								local9 = local446;
							} else if (arg3 == 3) {
								local446 = local45;
								local45 = local9;
								local9 = local19;
								local19 = local35;
								local35 = local446;
							}
						}
						if (arg5 == 4) {
							if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
								local104 = local58.method328(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class3_Sub1_Sub2_Sub3(0, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 4);
							}
							arg10.method244(local84, local70, arg7, anIntArray89[arg3], local55, arg3 * 512, 0, 0, arg9, local104, arg0);
						} else if (arg5 == 5) {
							local446 = 16;
							local200 = arg10.method261(arg9, arg0, arg7);
							if (local200 > 0) {
								local446 = Class29.method321(local200 >> 14 & 0x7FFF).anInt410;
							}
							if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
								local475 = local58.method328(4, 0, local9, local19, local35, local45, -1);
							} else {
								local475 = new Class3_Sub1_Sub2_Sub3(0, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 4);
							}
							arg10.method244(local84, local70, arg7, anIntArray89[arg3], local55, arg3 * 512, anIntArray96[arg3] * local446, anIntArray97[arg3] * local446, arg9, local475, arg0);
						} else if (arg5 == 6) {
							if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
								local104 = local58.method328(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class3_Sub1_Sub2_Sub3(0, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 4);
							}
							arg10.method244(local84, local70, arg7, 256, local55, arg3, 0, 0, arg9, local104, arg0);
						} else if (arg5 == 7) {
							if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
								local104 = local58.method328(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class3_Sub1_Sub2_Sub3(0, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 4);
							}
							arg10.method244(local84, local70, arg7, 512, local55, arg3, 0, 0, arg9, local104, arg0);
						} else if (arg5 == 8) {
							if (local58.anInt406 == -1 && local58.anIntArray85 == null) {
								local104 = local58.method328(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class3_Sub1_Sub2_Sub3(0, true, local19, local45, local35, local9, 0, arg8, local58.anInt406, 4);
							}
							arg10.method244(local84, local70, arg7, 768, local55, arg3, 0, 0, arg9, local104, arg0);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("84894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "c", descriptor = "(II)I")
	private static int method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method349(arg0 + 45365, arg1 + 91923, 4) + (method349(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method349(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "d", descriptor = "(II)I")
	private static int method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!QJLJTPQV", name = "e", descriptor = "(II)I")
	private static int method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "b", descriptor = "(III)Z")
	public static boolean method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class29 local2 = Class29.method321(arg1);
			if (arg2 != 26615) {
				throw new NullPointerException();
			}
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method320(arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("18666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "c", descriptor = "(III)I")
	private static int method349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method339(local3, local13);
		@Pc(29) int local29 = method339(local3 + 1, local13);
		@Pc(35) int local35 = method339(local3, local13 + 1);
		@Pc(43) int local43 = method339(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method329(local23, local29, local9, arg2);
		@Pc(55) int local55 = method329(local35, local43, local9, arg2);
		return method329(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "<init>", descriptor = "(II[[[BI[[[I)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt435 = 99;
			this.anInt436 = arg1;
			this.anInt437 = arg3;
			this.anIntArrayArrayArray5 = arg4;
			this.aByteArrayArrayArray4 = arg2;
			this.aByteArrayArrayArray7 = new byte[4][this.anInt436][this.anInt437];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt436][this.anInt437];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt436][this.anInt437];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt436][this.anInt437];
			this.anIntArrayArrayArray6 = new int[4][this.anInt436 + 1][this.anInt437 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt436 + 1][this.anInt437 + 1];
			this.anIntArrayArray9 = new int[this.anInt436 + 1][this.anInt437 + 1];
			this.anIntArray90 = new int[this.anInt437];
			this.anIntArray91 = new int[this.anInt437];
			this.anIntArray92 = new int[this.anInt437];
			this.anIntArray93 = new int[this.anInt437];
			this.anIntArray94 = new int[this.anInt437];
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("8278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "([BIII[Lclient!WWMUUFBO;II)V")
	public void method331(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44[] arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg4[local3].anIntArrayArray16[arg1 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(74) Class3_Sub1_Sub3 local74 = new Class3_Sub1_Sub3(0, arg0);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						this.method346(local74, arg3, 0, local11, this.anInt429, local80 + arg1, arg5, local84 + arg2);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("87460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -38919 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(II)I")
	private int method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!QJLJTPQV", name = "b", descriptor = "(IIII)I")
	private int method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray4[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("32733, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(III[Lclient!WWMUUFBO;IIIII[B)V")
	public void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg5 + local3 > 0 && arg5 + local3 < 103 && arg0 + local7 > 0 && arg0 + local7 < 103) {
						arg3[arg7].anIntArrayArray16[arg5 + local3][arg0 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class3_Sub1_Sub3 local57 = new Class3_Sub1_Sub3(0, arg9);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg4 && local63 >= arg6 && local63 < arg6 + 8 && local67 >= arg8 && local67 < arg8 + 8) {
							this.method346(local57, 0, arg1, arg7, this.anInt429, arg5 + Class48.method562(local67 & 0x7, arg1, local63 & 0x7), 0, arg0 + Class48.method563(local67 & 0x7, arg1, local63 & 0x7));
						} else {
							this.method346(local57, 0, 0, 0, this.anInt429, -1, 0, -1);
						}
					}
				}
			}
			@Pc(148) boolean local148 = false;
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("91037, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(IIILclient!LIOYHOWO;IIIILclient!WWMUUFBO;)V")
	private void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class44 arg8) {
		try {
			if (aBoolean137 && (this.aByteArrayArrayArray4[0][arg2][arg5] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray4[arg0][arg2][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method333(arg2, arg5, arg0) != anInt433) {
					return;
				}
			}
			if (arg0 < anInt435) {
				anInt435 = arg0;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg0][arg2][arg5];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg0][arg2 + 1][arg5];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg0][arg2 + 1][arg5 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg0][arg2][arg5 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			if (arg4 != this.anInt438) {
				this.anInt432 = -61;
			}
			@Pc(104) Class29 local104 = Class29.method321(arg1);
			@Pc(116) int local116 = arg2 + (arg5 << 7) + (arg1 << 14) + 1073741824;
			if (!local104.aBoolean132) {
				local116 += Integer.MIN_VALUE;
			}
			@Pc(130) byte local130 = (byte) ((arg7 << 6) + arg6);
			@Pc(159) Class3_Sub1_Sub2 local159;
			if (arg6 != 22) {
				@Pc(257) int local257;
				if (arg6 == 10 || arg6 == 11) {
					if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
						local159 = local104.method328(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 10);
					}
					if (local159 != null) {
						@Pc(244) int local244 = 0;
						if (arg6 == 11) {
							local244 += 256;
						}
						@Pc(260) int local260;
						if (arg7 == 1 || arg7 == 3) {
							local257 = local104.anInt411;
							local260 = local104.anInt421;
						} else {
							local257 = local104.anInt421;
							local260 = local104.anInt411;
						}
						if (arg3.method245(local130, local94, arg0, local159, local244, local260, arg5, local116, arg2, local257) && local104.aBoolean130) {
							@Pc(291) Class3_Sub1_Sub2_Sub6 local291;
							if (local159 instanceof Class3_Sub1_Sub2_Sub6) {
								local291 = (Class3_Sub1_Sub2_Sub6) local159;
							} else {
								local291 = local104.method328(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local291 != null) {
								for (@Pc(307) int local307 = 0; local307 <= local257; local307++) {
									for (@Pc(311) int local311 = 0; local311 <= local260; local311++) {
										@Pc(318) int local318 = local291.anInt745 / 4;
										if (local318 > 30) {
											local318 = 30;
										}
										if (local318 > this.aByteArrayArrayArray6[arg0][arg2 + local307][arg5 + local311]) {
											this.aByteArrayArrayArray6[arg0][arg2 + local307][arg5 + local311] = (byte) local318;
										}
									}
								}
							}
						}
					}
					if (local104.aBoolean136 && arg8 != null) {
						arg8.method489(arg7, local104.anInt421, arg2, local104.anInt411, local104.aBoolean133, arg5);
					}
				} else if (arg6 >= 12) {
					if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
						local159 = local104.method328(arg6, arg7, local49, local60, local73, local84, -1);
					} else {
						local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, arg6);
					}
					arg3.method245(local130, local94, arg0, local159, 0, 1, arg5, local116, arg2, 1);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x924;
					}
					if (local104.aBoolean136 && arg8 != null) {
						arg8.method489(arg7, local104.anInt421, arg2, local104.anInt411, local104.aBoolean133, arg5);
					}
				} else if (arg6 == 0) {
					if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
						local159 = local104.method328(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 0);
					}
					arg3.method243(arg0, anIntArray89[arg7], arg5, 0, local159, arg2, local116, null, local94, local130);
					if (arg7 == 0) {
						if (local104.aBoolean130) {
							this.aByteArrayArrayArray6[arg0][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg0][arg2][arg5 + 1] = 50;
						}
						if (local104.aBoolean134) {
							this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local104.aBoolean130) {
							this.aByteArrayArrayArray6[arg0][arg2][arg5 + 1] = 50;
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5 + 1] = 50;
						}
						if (local104.aBoolean134) {
							this.anIntArrayArrayArray6[arg0][arg2][arg5 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local104.aBoolean130) {
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5] = 50;
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5 + 1] = 50;
						}
						if (local104.aBoolean134) {
							this.anIntArrayArrayArray6[arg0][arg2 + 1][arg5] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local104.aBoolean130) {
							this.aByteArrayArrayArray6[arg0][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5] = 50;
						}
						if (local104.aBoolean134) {
							this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x492;
						}
					}
					if (local104.aBoolean136 && arg8 != null) {
						arg8.method488(arg2, arg6, arg7, arg5, local104.aBoolean133);
					}
					if (local104.anInt410 != 16) {
						arg3.method251(arg5, arg2, arg0, local104.anInt410);
					}
				} else if (arg6 == 1) {
					if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
						local159 = local104.method328(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 1);
					}
					arg3.method243(arg0, anIntArray95[arg7], arg5, 0, local159, arg2, local116, null, local94, local130);
					if (local104.aBoolean130) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray6[arg0][arg2][arg5 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray6[arg0][arg2][arg5] = 50;
						}
					}
					if (local104.aBoolean136 && arg8 != null) {
						arg8.method488(arg2, arg6, arg7, arg5, local104.aBoolean133);
					}
				} else {
					@Pc(868) int local868;
					@Pc(897) Class3_Sub1_Sub2 local897;
					if (arg6 == 2) {
						local868 = arg7 + 1 & 0x3;
						@Pc(887) Class3_Sub1_Sub2 local887;
						if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
							local887 = local104.method328(2, arg7 + 4, local49, local60, local73, local84, -1);
							local897 = local104.method328(2, local868, local49, local60, local73, local84, -1);
						} else {
							local887 = new Class3_Sub1_Sub2_Sub3(arg7 + 4, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 2);
							local897 = new Class3_Sub1_Sub2_Sub3(local868, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 2);
						}
						arg3.method243(arg0, anIntArray89[arg7], arg5, anIntArray89[local868], local887, arg2, local116, local897, local94, local130);
						if (local104.aBoolean134) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x249;
								this.anIntArrayArrayArray6[arg0][arg2][arg5 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray6[arg0][arg2][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg0][arg2 + 1][arg5] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray6[arg0][arg2 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x492;
								this.anIntArrayArrayArray6[arg0][arg2][arg5] |= 0x249;
							}
						}
						if (local104.aBoolean136 && arg8 != null) {
							arg8.method488(arg2, arg6, arg7, arg5, local104.aBoolean133);
						}
						if (local104.anInt410 != 16) {
							arg3.method251(arg5, arg2, arg0, local104.anInt410);
						}
					} else if (arg6 == 3) {
						if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
							local159 = local104.method328(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 3);
						}
						arg3.method243(arg0, anIntArray95[arg7], arg5, 0, local159, arg2, local116, null, local94, local130);
						if (local104.aBoolean130) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray6[arg0][arg2][arg5 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray6[arg0][arg2 + 1][arg5] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray6[arg0][arg2][arg5] = 50;
							}
						}
						if (local104.aBoolean136 && arg8 != null) {
							arg8.method488(arg2, arg6, arg7, arg5, local104.aBoolean133);
						}
					} else if (arg6 == 9) {
						if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
							local159 = local104.method328(arg6, arg7, local49, local60, local73, local84, -1);
						} else {
							local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, arg6);
						}
						arg3.method245(local130, local94, arg0, local159, 0, 1, arg5, local116, arg2, 1);
						if (local104.aBoolean136 && arg8 != null) {
							arg8.method489(arg7, local104.anInt421, arg2, local104.anInt411, local104.aBoolean133, arg5);
						}
					} else {
						if (local104.aBoolean128) {
							if (arg7 == 1) {
								local868 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local868;
							} else if (arg7 == 2) {
								local868 = local84;
								local84 = local60;
								local60 = local868;
								local868 = local73;
								local73 = local49;
								local49 = local868;
							} else if (arg7 == 3) {
								local868 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local868;
							}
						}
						if (arg6 == 4) {
							if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
								local159 = local104.method328(4, 0, local49, local60, local73, local84, -1);
							} else {
								local159 = new Class3_Sub1_Sub2_Sub3(0, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 4);
							}
							arg3.method244(local130, local116, arg5, anIntArray89[arg7], local94, arg7 * 512, 0, 0, arg0, local159, arg2);
						} else if (arg6 == 5) {
							local868 = 16;
							local257 = arg3.method261(arg0, arg2, arg5);
							if (local257 > 0) {
								local868 = Class29.method321(local257 >> 14 & 0x7FFF).anInt410;
							}
							if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
								local897 = local104.method328(4, 0, local49, local60, local73, local84, -1);
							} else {
								local897 = new Class3_Sub1_Sub2_Sub3(0, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 4);
							}
							arg3.method244(local130, local116, arg5, anIntArray89[arg7], local94, arg7 * 512, anIntArray96[arg7] * local868, anIntArray97[arg7] * local868, arg0, local897, arg2);
						} else if (arg6 == 6) {
							if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
								local159 = local104.method328(4, 0, local49, local60, local73, local84, -1);
							} else {
								local159 = new Class3_Sub1_Sub2_Sub3(0, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 4);
							}
							arg3.method244(local130, local116, arg5, 256, local94, arg7, 0, 0, arg0, local159, arg2);
						} else if (arg6 == 7) {
							if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
								local159 = local104.method328(4, 0, local49, local60, local73, local84, -1);
							} else {
								local159 = new Class3_Sub1_Sub2_Sub3(0, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 4);
							}
							arg3.method244(local130, local116, arg5, 512, local94, arg7, 0, 0, arg0, local159, arg2);
						} else if (arg6 == 8) {
							if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
								local159 = local104.method328(4, 0, local49, local60, local73, local84, -1);
							} else {
								local159 = new Class3_Sub1_Sub2_Sub3(0, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 4);
							}
							arg3.method244(local130, local116, arg5, 768, local94, arg7, 0, 0, arg0, local159, arg2);
						}
					}
				}
			} else if (!aBoolean137 || local104.aBoolean132 || local104.aBoolean131) {
				if (local104.anInt406 == -1 && local104.anIntArray85 == null) {
					local159 = local104.method328(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local159 = new Class3_Sub1_Sub2_Sub3(arg7, true, local60, local84, local73, local49, 0, arg1, local104.anInt406, 22);
				}
				arg3.method241(arg2, local130, local116, arg0, arg5, local159, local94);
				if (local104.aBoolean136 && local104.aBoolean132 && arg8 != null) {
					arg8.method490(arg5, arg2);
				}
			}
		} catch (@Pc(1642) RuntimeException local1642) {
			signlink.reporterror("99791, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1642.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(III)I")
	private int method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(Lclient!LIOYHOWO;I[BI[Lclient!WWMUUFBO;I)V")
	public void method337(@OriginalArg(0) Class25 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class44[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3(0, arg1);
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method160();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method160();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method146();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					@Pc(63) int local63 = local44 + arg2;
					@Pc(67) int local67 = local38 + arg4;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						@Pc(79) int local79 = local48;
						if ((this.aByteArrayArrayArray4[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						@Pc(94) Class44 local94 = null;
						if (local79 >= 0) {
							local94 = arg3[local79];
						}
						this.method335(local48, local12, local63, arg0, this.anInt431, local67, local55, local59, local94);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("483, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(I[Lclient!WWMUUFBO;IBIIILclient!LIOYHOWO;II[B)V")
	public void method343(@OriginalArg(0) int arg0, @OriginalArg(1) Class44[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class25 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3(0, arg9);
			if (this.aByte11 == 64) {
				@Pc(14) int local14 = -1;
				while (true) {
					@Pc(17) int local17 = local7.method160();
					if (local17 == 0) {
						return;
					}
					local14 += local17;
					@Pc(25) int local25 = 0;
					while (true) {
						@Pc(28) int local28 = local7.method160();
						if (local28 == 0) {
							break;
						}
						local25 += local28 - 1;
						@Pc(40) int local40 = local25 & 0x3F;
						@Pc(46) int local46 = local25 >> 6 & 0x3F;
						@Pc(50) int local50 = local25 >> 12;
						@Pc(53) int local53 = local7.method146();
						@Pc(57) int local57 = local53 >> 2;
						@Pc(61) int local61 = local53 & 0x3;
						if (local50 == arg4 && local46 >= arg2 && local46 < arg2 + 8 && local40 >= arg7 && local40 < arg7 + 8) {
							@Pc(83) Class29 local83 = Class29.method321(local14);
							@Pc(99) int local99 = arg0 + Class48.method564(local40 & 0x7, local83.anInt411, local46 & 0x7, local83.anInt421, arg3);
							@Pc(115) int local115 = arg8 + Class48.method565(local46 & 0x7, local40 & 0x7, arg3, local83.anInt421, local83.anInt411);
							if (local99 > 0 && local115 > 0 && local99 < 103 && local115 < 103) {
								@Pc(127) int local127 = arg5;
								if ((this.aByteArrayArrayArray4[1][local99][local115] & 0x2) == 2) {
									local127 = arg5 - 1;
								}
								@Pc(142) Class44 local142 = null;
								if (local127 >= 0) {
									local142 = arg1[local127];
								}
								this.method335(arg5, local14, local99, arg6, this.anInt431, local115, local57, local61 + arg3 & 0x3, local142);
							}
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("15229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 64 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(Lclient!LIOYHOWO;[Lclient!WWMUUFBO;I)V")
	public void method345(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class44[] arg1) {
		try {
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(38) int local38;
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < 104; local18++) {
					for (local22 = 0; local22 < 104; local22++) {
						if ((this.aByteArrayArrayArray4[local14][local18][local22] & 0x1) == 1) {
							local38 = local14;
							if ((this.aByteArrayArrayArray4[1][local18][local22] & 0x2) == 2) {
								local38 = local14 - 1;
							}
							if (local38 >= 0) {
								arg1[local38].method490(local22, local18);
							}
						}
					}
				}
			}
			anInt434 += (int) (Math.random() * 5.0D) - 2;
			if (anInt434 < -8) {
				anInt434 = -8;
			}
			if (anInt434 > 8) {
				anInt434 = 8;
			}
			anInt428 += (int) (Math.random() * 5.0D) - 2;
			if (anInt428 < -16) {
				anInt428 = -16;
			}
			if (anInt428 > 16) {
				anInt428 = 16;
			}
			@Pc(144) int local144;
			@Pc(150) int local150;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(180) int local180;
			@Pc(202) int local202;
			@Pc(215) int local215;
			@Pc(221) int local221;
			@Pc(225) int local225;
			@Pc(231) int local231;
			@Pc(247) int local247;
			@Pc(295) int local295;
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(119) byte[][] local119 = this.aByteArrayArrayArray6[local18];
				local144 = (int) Math.sqrt((double) 5100);
				local150 = local144 * 768 >> 8;
				for (local152 = 1; local152 < this.anInt437 - 1; local152++) {
					for (local156 = 1; local156 < this.anInt436 - 1; local156++) {
						local180 = this.anIntArrayArrayArray5[local18][local156 + 1][local152] - this.anIntArrayArrayArray5[local18][local156 - 1][local152];
						local202 = this.anIntArrayArrayArray5[local18][local156][local152 + 1] - this.anIntArrayArrayArray5[local18][local156][local152 - 1];
						local215 = (int) Math.sqrt((double) (local180 * local180 + local202 * local202 + 65536));
						local221 = (local180 << 8) / local215;
						local225 = 65536 / local215;
						local231 = (local202 << 8) / local215;
						local247 = (local221 * -50 + local225 * -10 + local231 * -50) / local150 + 96;
						local295 = (local119[local156 - 1][local152] >> 2) + (local119[local156 + 1][local152] >> 3) + (local119[local156][local152 - 1] >> 2) + (local119[local156][local152 + 1] >> 3) + (local119[local156][local152] >> 1);
						this.anIntArrayArray9[local156][local152] = local247 - local295;
					}
				}
				for (local156 = 0; local156 < this.anInt437; local156++) {
					this.anIntArray90[local156] = 0;
					this.anIntArray91[local156] = 0;
					this.anIntArray92[local156] = 0;
					this.anIntArray93[local156] = 0;
					this.anIntArray94[local156] = 0;
				}
				for (local180 = -5; local180 < this.anInt436 + 5; local180++) {
					for (local202 = 0; local202 < this.anInt437; local202++) {
						local215 = local180 + 5;
						@Pc(430) int local430;
						if (local215 >= 0 && local215 < this.anInt436) {
							local221 = this.aByteArrayArrayArray7[local18][local215][local202] & 0xFF;
							if (local221 > 0) {
								@Pc(389) Class12 local389 = Class12.aClass12Array1[local221 - 1];
								this.anIntArray90[local202] += local389.anInt220;
								this.anIntArray91[local202] += local389.anInt218;
								this.anIntArray92[local202] += local389.anInt219;
								this.anIntArray93[local202] += local389.anInt221;
								local430 = this.anIntArray94[local202]++;
							}
						}
						local221 = local180 - 5;
						if (local221 >= 0 && local221 < this.anInt436) {
							local225 = this.aByteArrayArrayArray7[local18][local221][local202] & 0xFF;
							if (local225 > 0) {
								@Pc(462) Class12 local462 = Class12.aClass12Array1[local225 - 1];
								this.anIntArray90[local202] -= local462.anInt220;
								this.anIntArray91[local202] -= local462.anInt218;
								this.anIntArray92[local202] -= local462.anInt219;
								this.anIntArray93[local202] -= local462.anInt221;
								local430 = this.anIntArray94[local202]--;
							}
						}
					}
					if (local180 >= 1 && local180 < this.anInt436 - 1) {
						local215 = 0;
						local221 = 0;
						local225 = 0;
						local231 = 0;
						local247 = 0;
						for (local295 = -5; local295 < this.anInt437 + 5; local295++) {
							@Pc(538) int local538 = local295 + 5;
							if (local538 >= 0 && local538 < this.anInt437) {
								local215 += this.anIntArray90[local538];
								local221 += this.anIntArray91[local538];
								local225 += this.anIntArray92[local538];
								local231 += this.anIntArray93[local538];
								local247 += this.anIntArray94[local538];
							}
							@Pc(583) int local583 = local295 - 5;
							if (local583 >= 0 && local583 < this.anInt437) {
								local215 -= this.anIntArray90[local583];
								local221 -= this.anIntArray91[local583];
								local225 -= this.anIntArray92[local583];
								local231 -= this.anIntArray93[local583];
								local247 -= this.anIntArray94[local583];
							}
							if (local295 >= 1 && local295 < this.anInt437 - 1 && (!aBoolean137 || (this.aByteArrayArrayArray4[0][local180][local295] & 0x2) != 0 || (this.aByteArrayArrayArray4[local18][local180][local295] & 0x10) == 0 && this.method333(local180, local295, local18) == anInt433)) {
								if (local18 < anInt435) {
									anInt435 = local18;
								}
								@Pc(682) int local682 = this.aByteArrayArrayArray7[local18][local180][local295] & 0xFF;
								@Pc(693) int local693 = this.aByteArrayArrayArray3[local18][local180][local295] & 0xFF;
								if (local682 > 0 || local693 > 0) {
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local18][local180][local295];
									@Pc(717) int local717 = this.anIntArrayArrayArray5[local18][local180 + 1][local295];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local18][local180 + 1][local295 + 1];
									@Pc(741) int local741 = this.anIntArrayArrayArray5[local18][local180][local295 + 1];
									@Pc(748) int local748 = this.anIntArrayArray9[local180][local295];
									@Pc(757) int local757 = this.anIntArrayArray9[local180 + 1][local295];
									@Pc(768) int local768 = this.anIntArrayArray9[local180 + 1][local295 + 1];
									@Pc(777) int local777 = this.anIntArrayArray9[local180][local295 + 1];
									@Pc(779) int local779 = -1;
									@Pc(781) int local781 = -1;
									@Pc(789) int local789;
									@Pc(793) int local793;
									if (local682 > 0) {
										local789 = local215 * 256 / local231;
										local793 = local221 / local247;
										@Pc(797) int local797 = local225 / local247;
										local779 = this.method336(local789, local793, local797);
										@Pc(809) int local809 = local789 + anInt434 & 0xFF;
										local797 += anInt428;
										if (local797 < 0) {
											local797 = 0;
										} else if (local797 > 255) {
											local797 = 255;
										}
										local781 = this.method336(local809, local793, local797);
									}
									if (local18 > 0) {
										@Pc(834) boolean local834 = true;
										if (local682 == 0 && this.aByteArrayArrayArray5[local18][local180][local295] != 0) {
											local834 = false;
										}
										if (local693 > 0 && !Class12.aClass12Array1[local693 - 1].aBoolean63) {
											local834 = false;
										}
										if (local834 && local706 == local717 && local706 == local730 && local706 == local741) {
											this.anIntArrayArrayArray6[local18][local180][local295] |= 0x924;
										}
									}
									local789 = 0;
									if (local779 != -1) {
										local789 = Class3_Sub1_Sub1_Sub3.anIntArray149[method342(local781, 96)];
									}
									if (local693 == 0) {
										arg0.method240(local18, local180, local295, 0, 0, -1, local706, local717, local730, local741, method342(local779, local748), method342(local779, local757), method342(local779, local768), method342(local779, local777), 0, 0, 0, 0, local789, 0);
									} else {
										local793 = this.aByteArrayArrayArray5[local18][local180][local295] + 1;
										@Pc(946) byte local946 = this.aByteArrayArrayArray2[local18][local180][local295];
										@Pc(952) Class12 local952 = Class12.aClass12Array1[local693 - 1];
										@Pc(955) int local955 = local952.anInt216;
										@Pc(964) int local964;
										@Pc(962) int local962;
										if (local955 >= 0) {
											local962 = Class3_Sub1_Sub1_Sub3.method452(this.anInt427, local955);
											local964 = -1;
										} else if (local952.anInt215 == 16711935) {
											local962 = 0;
											local964 = -2;
											local955 = -1;
										} else {
											local964 = this.method336(local952.anInt217, local952.anInt218, local952.anInt219);
											local962 = Class3_Sub1_Sub1_Sub3.anIntArray149[this.method332(local952.anInt222, 96)];
										}
										arg0.method240(local18, local180, local295, local793, local946, local955, local706, local717, local730, local741, method342(local779, local748), method342(local779, local757), method342(local779, local768), method342(local779, local777), this.method332(local964, local748), this.method332(local964, local757), this.method332(local964, local768), this.method332(local964, local777), local789, local962);
									}
								}
							}
						}
					}
				}
				for (local202 = 1; local202 < this.anInt437 - 1; local202++) {
					for (local215 = 1; local215 < this.anInt436 - 1; local215++) {
						arg0.method239(local18, local215, local202, this.method333(local215, local202, local18));
					}
				}
			}
			arg0.method266(this.aBoolean139);
			for (local22 = 0; local22 < this.anInt436; local22++) {
				for (local38 = 0; local38 < this.anInt437; local38++) {
					if ((this.aByteArrayArrayArray4[1][local22][local38] & 0x2) == 2) {
						arg0.method237(local38, local22);
					}
				}
			}
			local38 = 1;
			@Pc(1136) int local1136 = 2;
			@Pc(1138) int local1138 = 4;
			for (@Pc(1140) int local1140 = 0; local1140 < 4; local1140++) {
				if (local1140 > 0) {
					local38 <<= 0x3;
					local1136 <<= 0x3;
					local1138 <<= 0x3;
				}
				for (@Pc(1158) int local1158 = 0; local1158 <= local1140; local1158++) {
					for (local144 = 0; local144 <= this.anInt437; local144++) {
						for (local150 = 0; local150 <= this.anInt436; local150++) {
							if ((this.anIntArrayArrayArray6[local1158][local150][local144] & local38) != 0) {
								local152 = local144;
								local156 = local144;
								local180 = local1158;
								local202 = local1158;
								while (local152 > 0 && (this.anIntArrayArrayArray6[local1158][local150][local152 - 1] & local38) != 0) {
									local152--;
								}
								while (local156 < this.anInt437 && (this.anIntArrayArrayArray6[local1158][local150][local156 + 1] & local38) != 0) {
									local156++;
								}
								label328: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray6[local180 - 1][local150][local215] & local38) == 0) {
											break label328;
										}
									}
									local180--;
								}
								label317: while (local202 < local1140) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray6[local202 + 1][local150][local215] & local38) == 0) {
											break label317;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray5[local202][local150][local152] - 240;
									local231 = this.anIntArrayArrayArray5[local180][local150][local152];
									Class25.method238(local150 * 128, local150 * 128, local156 * 128 + 128, 1, local1140, local225, local152 * 128, local231);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray6[local247][local150][local295] &= ~local38;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1158][local150][local144] & local1136) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local1158;
								local202 = local1158;
								while (local152 > 0 && (this.anIntArrayArrayArray6[local1158][local152 - 1][local144] & local1136) != 0) {
									local152--;
								}
								while (local156 < this.anInt436 && (this.anIntArrayArrayArray6[local1158][local156 + 1][local144] & local1136) != 0) {
									local156++;
								}
								label381: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray6[local180 - 1][local215][local144] & local1136) == 0) {
											break label381;
										}
									}
									local180--;
								}
								label370: while (local202 < local1140) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray6[local202 + 1][local215][local144] & local1136) == 0) {
											break label370;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray5[local202][local152][local144] - 240;
									local231 = this.anIntArrayArrayArray5[local180][local152][local144];
									Class25.method238(local152 * 128, local156 * 128 + 128, local144 * 128, 2, local1140, local225, local144 * 128, local231);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray6[local247][local295][local144] &= ~local1136;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1158][local150][local144] & local1138) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local144;
								local202 = local144;
								while (local180 > 0 && (this.anIntArrayArrayArray6[local1158][local150][local180 - 1] & local1138) != 0) {
									local180--;
								}
								while (local202 < this.anInt437 && (this.anIntArrayArrayArray6[local1158][local150][local202 + 1] & local1138) != 0) {
									local202++;
								}
								label434: while (local152 > 0) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray6[local1158][local152 - 1][local215] & local1138) == 0) {
											break label434;
										}
									}
									local152--;
								}
								label423: while (local156 < this.anInt436) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray6[local1158][local156 + 1][local215] & local1138) == 0) {
											break label423;
										}
									}
									local156++;
								}
								if ((local156 + 1 - local152) * (local202 + 1 - local180) >= 4) {
									local215 = this.anIntArrayArrayArray5[local1158][local152][local180];
									Class25.method238(local152 * 128, local156 * 128 + 128, local202 * 128 + 128, 4, local1140, local215, local180 * 128, local215);
									for (local221 = local152; local221 <= local156; local221++) {
										for (local225 = local180; local225 <= local202; local225++) {
											this.anIntArrayArrayArray6[local1158][local221][local225] &= ~local1138;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1773) RuntimeException local1773) {
			signlink.reporterror("20777, " + arg0 + ", " + arg1 + ", " + -3083 + ", " + local1773.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(Lclient!IMUIZRAF;IIIIIII)V")
	private void method346(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg4 < 0) {
				@Pc(28) int local28;
				if (arg5 >= 0 && arg5 < 104 && arg7 >= 0 && arg7 < 104) {
					this.aByteArrayArrayArray4[arg3][arg5][arg7] = 0;
					while (true) {
						local28 = arg0.method146();
						if (local28 == 0) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray5[0][arg5][arg7] = -method341(arg5 + arg1 + 932731, arg7 + 556238 + arg6) * 8;
								return;
							} else {
								this.anIntArrayArrayArray5[arg3][arg5][arg7] = this.anIntArrayArrayArray5[arg3 - 1][arg5][arg7] - 240;
								return;
							}
						}
						if (local28 == 1) {
							@Pc(82) int local82 = arg0.method146();
							if (local82 == 1) {
								local82 = 0;
							}
							if (arg3 == 0) {
								this.anIntArrayArrayArray5[0][arg5][arg7] = -local82 * 8;
								return;
							}
							this.anIntArrayArrayArray5[arg3][arg5][arg7] = this.anIntArrayArrayArray5[arg3 - 1][arg5][arg7] - local82 * 8;
							return;
						}
						if (local28 <= 49) {
							this.aByteArrayArrayArray3[arg3][arg5][arg7] = arg0.method147();
							this.aByteArrayArrayArray5[arg3][arg5][arg7] = (byte) ((local28 - 2) / 4);
							this.aByteArrayArrayArray2[arg3][arg5][arg7] = (byte) (local28 + arg2 - 2 & 0x3);
						} else if (local28 <= 81) {
							this.aByteArrayArrayArray4[arg3][arg5][arg7] = (byte) (local28 - 49);
						} else {
							this.aByteArrayArrayArray7[arg3][arg5][arg7] = (byte) (local28 - 81);
						}
					}
				} else {
					while (true) {
						local28 = arg0.method146();
						if (local28 == 0) {
							return;
						}
						if (local28 == 1) {
							arg0.method146();
							return;
						}
						if (local28 <= 49) {
							arg0.method146();
						}
					}
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("16244, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJLJTPQV", name = "a", descriptor = "(IIIII)V")
	public void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg4; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg0; local7++) {
					if (local7 >= 0 && local7 < this.anInt436 && local3 >= 0 && local3 < this.anInt437) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 - 1][local3];
						}
						if (local7 == arg1 + arg0 && local7 < this.anInt436 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg4 && local3 < this.anInt437 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 + 1];
						}
					}
				}
			}
			if (arg2 == 0) {
				;
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("97483, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
