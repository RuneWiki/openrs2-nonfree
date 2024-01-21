import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IJMWYKME")
public final class Class15 {

	@OriginalMember(owner = "client!IJMWYKME", name = "I", descriptor = "I")
	public static int anInt191;

	@OriginalMember(owner = "client!IJMWYKME", name = "f", descriptor = "I")
	public static int anInt180 = 99;

	@OriginalMember(owner = "client!IJMWYKME", name = "j", descriptor = "[I")
	private static final int[] anIntArray47 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!IJMWYKME", name = "n", descriptor = "[I")
	private static final int[] anIntArray48 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!IJMWYKME", name = "o", descriptor = "I")
	private static int anInt184 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!IJMWYKME", name = "p", descriptor = "I")
	private static int anInt185 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!IJMWYKME", name = "q", descriptor = "Z")
	public static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!IJMWYKME", name = "u", descriptor = "I")
	private static int anInt187 = 205;

	@OriginalMember(owner = "client!IJMWYKME", name = "v", descriptor = "[I")
	private static final int[] anIntArray49 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!IJMWYKME", name = "D", descriptor = "[I")
	private static final int[] anIntArray55 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!IJMWYKME", name = "E", descriptor = "I")
	private static int anInt189 = 7;

	@OriginalMember(owner = "client!IJMWYKME", name = "H", descriptor = "I")
	private static int anInt190 = 7;

	@OriginalMember(owner = "client!IJMWYKME", name = "d", descriptor = "I")
	private int anInt179 = 7;

	@OriginalMember(owner = "client!IJMWYKME", name = "i", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!IJMWYKME", name = "l", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!IJMWYKME", name = "m", descriptor = "I")
	private int anInt183 = -833;

	@OriginalMember(owner = "client!IJMWYKME", name = "r", descriptor = "I")
	private int anInt186 = -27691;

	@OriginalMember(owner = "client!IJMWYKME", name = "w", descriptor = "I")
	private int anInt188 = 3;

	@OriginalMember(owner = "client!IJMWYKME", name = "F", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!IJMWYKME", name = "g", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!IJMWYKME", name = "h", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!IJMWYKME", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!IJMWYKME", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!IJMWYKME", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!IJMWYKME", name = "G", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!IJMWYKME", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!IJMWYKME", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!IJMWYKME", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!IJMWYKME", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!IJMWYKME", name = "x", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!IJMWYKME", name = "y", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!IJMWYKME", name = "z", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!IJMWYKME", name = "A", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!IJMWYKME", name = "B", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(II)I")
	private static int method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIZ)Z")
	public static boolean method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2 local8 = Class2.method24(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local8.method19((byte) 6, arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("66857, " + arg0 + ", " + arg1 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "b", descriptor = "(II)I")
	private static int method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method176(arg0 - 1, arg1 - 1) + method176(arg0 + 1, arg1 - 1) + method176(arg0 - 1, arg1 + 1) + method176(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method176(arg0 - 1, arg1) + method176(arg0 + 1, arg1) + method176(arg0, arg1 - 1) + method176(arg0, arg1 + 1);
		@Pc(59) int local59 = method176(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(Lclient!ELICEBAH;ILclient!UAWAYCTK;)V")
	public static void method184(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(15) int local15 = arg1.method416();
				if (local15 == 0) {
					return;
				}
				local3 += local15;
				@Pc(24) Class2 local24 = Class2.method24(local3);
				local24.method22(arg0, (byte) 5);
				while (true) {
					@Pc(31) int local31 = arg1.method416();
					if (local31 == 0) {
						break;
					}
					arg1.method402();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("89167, " + arg0 + ", " + 796 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIII)I")
	private static int method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class6_Sub2_Sub2_Sub3.anIntArray77[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "d", descriptor = "(II)I")
	private static int method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IB[BI)Z")
	public static boolean method189(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(16) Class6_Sub2_Sub3 local16 = new Class6_Sub2_Sub3(741, arg1);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local16.method416();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local16.method416();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local16.method402() >> 2;
						@Pc(73) int local73 = local64 + arg0;
						@Pc(77) int local77 = local58 + arg2;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class2 local90 = Class2.method24(local18);
							if (local69 != 22 || !aBoolean72 || local90.aBoolean6 || local90.aBoolean8) {
								local3 &= local90.method16(anInt187);
								local31 = true;
							}
						}
					}
					local36 = local16.method416();
					if (local36 == 0) {
						break;
					}
					local16.method402();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("72814, " + arg0 + ", " + -32 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "e", descriptor = "(II)I")
	private static int method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method194(arg0 + 45365, arg1 + 91923, 4) + (method194(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method194(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIIIILclient!OBOSMEDX;ILclient!CGGBZSOS;I[[[II)V")
	public static void method193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[][][] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg8[arg5][arg1][arg9];
			@Pc(19) int local19 = arg8[arg5][arg1 + 1][arg9];
			@Pc(31) int local31 = arg8[arg5][arg1 + 1][arg9 + 1];
			@Pc(41) int local41 = arg8[arg5][arg1][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(57) Class2 local57 = Class2.method24(arg0);
			@Pc(69) int local69 = arg1 + (arg9 << 7) + (arg0 << 14) + 1073741824;
			if (!local57.aBoolean6) {
				local69 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg2 << 6) + arg3);
			@Pc(103) Class6_Sub2_Sub1 local103;
			if (arg3 == 22) {
				if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
					local103 = local57.method20(22, arg2, local9, local19, local31, local41, -1);
				} else {
					local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 22, arg2, local9, true, true);
				}
				arg4.method306(arg9, local103, local69, local83, local51, arg7, arg1);
				if (local57.aBoolean14 && local57.aBoolean6) {
					arg6.method28(arg1, arg9);
				}
			} else {
				@Pc(199) int local199;
				if (arg3 == 10 || arg3 == 11) {
					if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
						local103 = local57.method20(10, arg2, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 10, arg2, local9, true, true);
					}
					if (local103 != null) {
						@Pc(186) int local186 = 0;
						if (arg3 == 11) {
							local186 += 256;
						}
						@Pc(202) int local202;
						if (arg2 == 1 || arg2 == 3) {
							local199 = local57.anInt29;
							local202 = local57.anInt36;
						} else {
							local199 = local57.anInt36;
							local202 = local57.anInt29;
						}
						arg4.method310(local103, local69, local83, local186, arg1, arg7, local199, arg9, anInt190, local202, local51);
					}
					if (local57.aBoolean14) {
						arg6.method27(arg9, arg2, local57.anInt29, local57.aBoolean9, local57.anInt36, arg1);
					}
				} else if (arg3 >= 12) {
					if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
						local103 = local57.method20(arg3, arg2, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, arg3, arg2, local9, true, true);
					}
					arg4.method310(local103, local69, local83, 0, arg1, arg7, 1, arg9, anInt190, 1, local51);
					if (local57.aBoolean14) {
						arg6.method27(arg9, arg2, local57.anInt29, local57.aBoolean9, local57.anInt36, arg1);
					}
				} else if (arg3 == 0) {
					if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
						local103 = local57.method20(0, arg2, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 0, arg2, local9, true, true);
					}
					arg4.method308(local83, local103, local51, arg7, arg9, null, arg1, 0, local69, anIntArray49[arg2]);
					if (local57.aBoolean14) {
						arg6.method26(arg9, arg3, local57.aBoolean9, arg1, arg2);
					}
				} else if (arg3 == 1) {
					if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
						local103 = local57.method20(1, arg2, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 1, arg2, local9, true, true);
					}
					arg4.method308(local83, local103, local51, arg7, arg9, null, arg1, 0, local69, anIntArray48[arg2]);
					if (local57.aBoolean14) {
						arg6.method26(arg9, arg3, local57.aBoolean9, arg1, arg2);
					}
				} else {
					@Pc(445) int local445;
					@Pc(474) Class6_Sub2_Sub1 local474;
					if (arg3 == 2) {
						local445 = arg2 + 1 & 0x3;
						@Pc(464) Class6_Sub2_Sub1 local464;
						if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
							local464 = local57.method20(2, arg2 + 4, local9, local19, local31, local41, -1);
							local474 = local57.method20(2, local445, local9, local19, local31, local41, -1);
						} else {
							local464 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 2, arg2 + 4, local9, true, true);
							local474 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 2, local445, local9, true, true);
						}
						arg4.method308(local83, local464, local51, arg7, arg9, local474, arg1, anIntArray49[local445], local69, anIntArray49[arg2]);
						if (local57.aBoolean14) {
							arg6.method26(arg9, arg3, local57.aBoolean9, arg1, arg2);
						}
					} else if (arg3 == 3) {
						if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
							local103 = local57.method20(3, arg2, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 3, arg2, local9, true, true);
						}
						arg4.method308(local83, local103, local51, arg7, arg9, null, arg1, 0, local69, anIntArray48[arg2]);
						if (local57.aBoolean14) {
							arg6.method26(arg9, arg3, local57.aBoolean9, arg1, arg2);
						}
					} else if (arg3 == 9) {
						if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
							local103 = local57.method20(arg3, arg2, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, arg3, arg2, local9, true, true);
						}
						arg4.method310(local103, local69, local83, 0, arg1, arg7, 1, arg9, anInt190, 1, local51);
						if (local57.aBoolean14) {
							arg6.method27(arg9, arg2, local57.anInt29, local57.aBoolean9, local57.anInt36, arg1);
						}
					} else {
						if (local57.aBoolean7) {
							if (arg2 == 1) {
								local445 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local445;
							} else if (arg2 == 2) {
								local445 = local41;
								local41 = local19;
								local19 = local445;
								local445 = local31;
								local31 = local9;
								local9 = local445;
							} else if (arg2 == 3) {
								local445 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local445;
							}
						}
						if (arg3 == 4) {
							if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
								local103 = local57.method20(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 4, 0, local9, true, true);
							}
							arg4.method309(0, arg2 * 512, local103, anInt189, local51, 0, anIntArray49[arg2], arg9, arg1, arg7, local83, local69);
						} else if (arg3 == 5) {
							local445 = 16;
							local199 = arg4.method326(arg7, arg1, arg9);
							if (local199 > 0) {
								local445 = Class2.method24(local199 >> 14 & 0x7FFF).anInt38;
							}
							if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
								local474 = local57.method20(4, 0, local9, local19, local31, local41, -1);
							} else {
								local474 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 4, 0, local9, true, true);
							}
							arg4.method309(anIntArray55[arg2] * local445, arg2 * 512, local474, anInt189, local51, anIntArray47[arg2] * local445, anIntArray49[arg2], arg9, arg1, arg7, local83, local69);
						} else if (arg3 == 6) {
							if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
								local103 = local57.method20(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 4, 0, local9, true, true);
							}
							arg4.method309(0, arg2, local103, anInt189, local51, 0, 256, arg9, arg1, arg7, local83, local69);
						} else if (arg3 == 7) {
							if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
								local103 = local57.method20(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 4, 0, local9, true, true);
							}
							arg4.method309(0, arg2, local103, anInt189, local51, 0, 512, arg9, arg1, arg7, local83, local69);
						} else if (arg3 == 8) {
							if (local57.anInt30 == -1 && local57.anIntArray3 == null) {
								local103 = local57.method20(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class6_Sub2_Sub1_Sub2(local19, local57.anInt30, local41, arg0, local31, 4, 0, local9, true, true);
							}
							arg4.method309(0, arg2, local103, anInt189, local51, 0, 768, arg9, arg1, arg7, local83, local69);
						}
					}
				}
			}
		} catch (@Pc(1013) RuntimeException local1013) {
			signlink.reporterror("34054, " + arg0 + ", " + 24 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1013.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "b", descriptor = "(III)I")
	private static int method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method180(local3, local13);
		@Pc(29) int local29 = method180(local3 + 1, local13);
		@Pc(35) int local35 = method180(local3, local13 + 1);
		@Pc(43) int local43 = method180(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method186(local23, local29, local9, arg2);
		@Pc(55) int local55 = method186(local35, local43, local9, arg2);
		return method186(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "<init>", descriptor = "(II[[[IB[[[B)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt180 = 99;
			this.anInt181 = arg1;
			this.anInt182 = arg0;
			this.anIntArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray3 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt181][this.anInt182];
			this.anIntArrayArrayArray2 = new int[4][this.anInt181 + 1][this.anInt182 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt181 + 1][this.anInt182 + 1];
			this.anIntArrayArray6 = new int[this.anInt181 + 1][this.anInt182 + 1];
			this.anIntArray50 = new int[this.anInt182];
			this.anIntArray51 = new int[this.anInt182];
			this.anIntArray52 = new int[this.anInt182];
			this.anIntArray53 = new int[this.anInt182];
			this.anIntArray54 = new int[this.anInt182];
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("43178, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(BIIII)V")
	public void method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg1; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt181 && local3 >= 0 && local3 < this.anInt182) {
						this.aByteArrayArrayArray5[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg3 && local7 < this.anInt181 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg1 && local3 < this.anInt182 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("51505, " + -11 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(II[B[Lclient!CGGBZSOS;IIIIII)V")
	public void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class3[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg3[arg8].anIntArrayArray1[arg4 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(60) Class6_Sub2_Sub3 local60 = new Class6_Sub2_Sub3(741, arg2);
			for (@Pc(62) int local62 = 0; local62 < 4; local62++) {
				for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						if (local62 == arg5 && local66 >= arg7 && local66 < arg7 + 8 && local70 >= arg6 && local70 < arg6 + 8) {
							this.method187(arg4 + Class11.method80(local70 & 0x7, arg0, local66 & 0x7), arg0, 0, 0, arg1 + Class11.method81(local70 & 0x7, local66 & 0x7, arg0), local60, arg8);
						} else {
							this.method187(-1, 0, 0, 0, -1, local60, 0);
						}
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("66620, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 383 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(I[Lclient!CGGBZSOS;Lclient!OBOSMEDX;)V")
	public void method179(@OriginalArg(1) Class3[] arg0, @OriginalArg(2) Class25 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray3[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method28(local7, local11);
							}
						}
					}
				}
			}
			anInt185 += (int) (Math.random() * 5.0D) - 2;
			if (anInt185 < -8) {
				anInt185 = -8;
			}
			if (anInt185 > 8) {
				anInt185 = 8;
			}
			anInt184 += (int) (Math.random() * 5.0D) - 2;
			if (anInt184 < -16) {
				anInt184 = -16;
			}
			if (anInt184 > 16) {
				anInt184 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray5[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt182 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt181 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray6[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt182; local145++) {
					this.anIntArray50[local145] = 0;
					this.anIntArray51[local145] = 0;
					this.anIntArray52[local145] = 0;
					this.anIntArray53[local145] = 0;
					this.anIntArray54[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt181 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt182; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt181) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class8 local378 = Class8.aClass8Array1[local210 - 1];
								this.anIntArray50[local191] += local378.anInt80;
								this.anIntArray51[local191] += local378.anInt78;
								this.anIntArray52[local191] += local378.anInt79;
								this.anIntArray53[local191] += local378.anInt81;
								local419 = this.anIntArray54[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt181) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class8 local451 = Class8.aClass8Array1[local214 - 1];
								this.anIntArray50[local191] -= local451.anInt80;
								this.anIntArray51[local191] -= local451.anInt78;
								this.anIntArray52[local191] -= local451.anInt79;
								this.anIntArray53[local191] -= local451.anInt81;
								local419 = this.anIntArray54[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt181 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt182 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt182) {
								local204 += this.anIntArray50[local527];
								local210 += this.anIntArray51[local527];
								local214 += this.anIntArray52[local527];
								local220 += this.anIntArray53[local527];
								local236 += this.anIntArray54[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt182) {
								local204 -= this.anIntArray50[local572];
								local210 -= this.anIntArray51[local572];
								local214 -= this.anIntArray52[local572];
								local220 -= this.anIntArray53[local572];
								local236 -= this.anIntArray54[local572];
							}
							if (local284 >= 1 && local284 < this.anInt182 - 1 && (!aBoolean72 || (this.aByteArrayArrayArray3[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local169][local284] & 0x10) == 0 && this.method191(local284, local7, local169) == anInt191)) {
								if (local7 < anInt180) {
									anInt180 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray6[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray6[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray6[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray6[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method185(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt185 & 0xFF;
										local786 += anInt184;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method185(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class8.aClass8Array1[local682 - 1].aBoolean30) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class6_Sub2_Sub2_Sub3.anIntArray81[method188(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method305(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method188(local768, local737), method188(local768, local746), method188(local768, local757), method188(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray1[local7][local169][local284];
										@Pc(941) Class8 local941 = Class8.aClass8Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt76;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class6_Sub2_Sub2_Sub3.method248(local944);
											local952 = -1;
										} else if (local941.anInt75 == 16711935) {
											local950 = 0;
											local952 = -2;
											local944 = -1;
										} else {
											local952 = this.method185(local941.anInt77, local941.anInt78, local941.anInt79);
											local950 = Class6_Sub2_Sub2_Sub3.anIntArray81[this.method181(local941.anInt82, 96)];
										}
										arg1.method305(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method188(local768, local737), method188(local768, local746), method188(local768, local757), method188(local768, local766), this.method181(local952, local737), this.method181(local952, local746), this.method181(local952, local757), this.method181(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt182 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt181 - 1; local204++) {
						arg1.method304(local7, local204, local191, this.method191(local191, local7, local204));
					}
				}
			}
			arg1.method331();
			for (local11 = 0; local11 < this.anInt181; local11++) {
				for (local27 = 0; local27 < this.anInt182; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg1.method302(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1133) int local1133 = 2;
			@Pc(1135) int local1135 = 4;
			for (@Pc(1137) int local1137 = 0; local1137 < 4; local1137++) {
				if (local1137 > 0) {
					local27 <<= 0x3;
					local1133 <<= 0x3;
					local1135 <<= 0x3;
				}
				for (@Pc(1155) int local1155 = 0; local1155 <= local1137; local1155++) {
					for (local133 = 0; local133 <= this.anInt182; local133++) {
						for (local139 = 0; local139 <= this.anInt181; local139++) {
							if ((this.anIntArrayArrayArray2[local1155][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1155][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt182 && (this.anIntArrayArrayArray2[local1155][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1137) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class25.method303(local1137, local145 * 128 + 128, local139 * 128, local214, local141 * 128, this.aBoolean70, local220, local139 * 128, 1);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1155][local139][local133] & local1133) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1155][local141 - 1][local133] & local1133) != 0) {
									local141--;
								}
								while (local145 < this.anInt181 && (this.anIntArrayArrayArray2[local1155][local145 + 1][local133] & local1133) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1133) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1137) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1133) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class25.method303(local1137, local133 * 128, local145 * 128 + 128, local214, local133 * 128, this.aBoolean70, local220, local141 * 128, 2);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1133;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1155][local139][local133] & local1135) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1155][local139][local169 - 1] & local1135) != 0) {
									local169--;
								}
								while (local191 < this.anInt182 && (this.anIntArrayArrayArray2[local1155][local139][local191 + 1] & local1135) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1155][local141 - 1][local204] & local1135) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt181) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1155][local145 + 1][local204] & local1135) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1155][local141][local169];
									Class25.method303(local1137, local191 * 128 + 128, local145 * 128 + 128, local204, local169 * 128, this.aBoolean70, local204, local141 * 128, 4);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1155][local210][local214] &= ~local1135;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1773) RuntimeException local1773) {
			signlink.reporterror("62861, " + 430 + ", " + arg0 + ", " + arg1 + ", " + local1773.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "c", descriptor = "(II)I")
	private int method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIILclient!CGGBZSOS;ILclient!OBOSMEDX;III)V")
	private void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean72 && (this.aByteArrayArrayArray3[0][arg1][arg7] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg8][arg1][arg7] & 0x10) != 0) {
					return;
				}
				if (this.method191(arg7, arg8, arg1) != anInt191) {
					return;
				}
			}
			if (arg8 < anInt180) {
				anInt180 = arg8;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg8][arg1][arg7];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg8][arg1 + 1][arg7];
			@Pc(68) int local68;
			if (arg0 < 7 || arg0 > 7) {
				for (local68 = 1; local68 > 0; local68++) {
				}
			}
			local68 = this.anIntArrayArrayArray1[arg8][arg1 + 1][arg7 + 1];
			@Pc(97) int local97 = this.anIntArrayArrayArray1[arg8][arg1][arg7 + 1];
			@Pc(107) int local107 = local49 + local60 + local68 + local97 >> 2;
			@Pc(110) Class2 local110 = Class2.method24(arg4);
			@Pc(122) int local122 = arg1 + (arg7 << 7) + (arg4 << 14) + 1073741824;
			if (!local110.aBoolean6) {
				local122 += Integer.MIN_VALUE;
			}
			@Pc(136) byte local136 = (byte) ((arg6 << 6) + arg2);
			@Pc(165) Class6_Sub2_Sub1 local165;
			if (arg2 != 22) {
				@Pc(263) int local263;
				if (arg2 == 10 || arg2 == 11) {
					if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
						local165 = local110.method20(10, arg6, local49, local60, local68, local97, -1);
					} else {
						local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 10, arg6, local49, true, true);
					}
					if (local165 != null) {
						@Pc(250) int local250 = 0;
						if (arg2 == 11) {
							local250 += 256;
						}
						@Pc(266) int local266;
						if (arg6 == 1 || arg6 == 3) {
							local263 = local110.anInt29;
							local266 = local110.anInt36;
						} else {
							local263 = local110.anInt36;
							local266 = local110.anInt29;
						}
						if (arg5.method310(local165, local122, local136, local250, arg1, arg8, local263, arg7, anInt190, local266, local107) && local110.aBoolean17) {
							@Pc(297) Class6_Sub2_Sub1_Sub6 local297;
							if (local165 instanceof Class6_Sub2_Sub1_Sub6) {
								local297 = (Class6_Sub2_Sub1_Sub6) local165;
							} else {
								local297 = local110.method20(10, arg6, local49, local60, local68, local97, -1);
							}
							if (local297 != null) {
								for (@Pc(313) int local313 = 0; local313 <= local263; local313++) {
									for (@Pc(317) int local317 = 0; local317 <= local266; local317++) {
										@Pc(324) int local324 = local297.anInt727 / 4;
										if (local324 > 30) {
											local324 = 30;
										}
										if (local324 > this.aByteArrayArrayArray5[arg8][arg1 + local313][arg7 + local317]) {
											this.aByteArrayArrayArray5[arg8][arg1 + local313][arg7 + local317] = (byte) local324;
										}
									}
								}
							}
						}
					}
					if (local110.aBoolean14 && arg3 != null) {
						arg3.method27(arg7, arg6, local110.anInt29, local110.aBoolean9, local110.anInt36, arg1);
					}
				} else if (arg2 >= 12) {
					if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
						local165 = local110.method20(arg2, arg6, local49, local60, local68, local97, -1);
					} else {
						local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, arg2, arg6, local49, true, true);
					}
					arg5.method310(local165, local122, local136, 0, arg1, arg8, 1, arg7, anInt190, 1, local107);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
						this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x924;
					}
					if (local110.aBoolean14 && arg3 != null) {
						arg3.method27(arg7, arg6, local110.anInt29, local110.aBoolean9, local110.anInt36, arg1);
					}
				} else if (arg2 == 0) {
					if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
						local165 = local110.method20(0, arg6, local49, local60, local68, local97, -1);
					} else {
						local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 0, arg6, local49, true, true);
					}
					arg5.method308(local136, local165, local107, arg8, arg7, null, arg1, 0, local122, anIntArray49[arg6]);
					if (arg6 == 0) {
						if (local110.aBoolean17) {
							this.aByteArrayArrayArray5[arg8][arg1][arg7] = 50;
							this.aByteArrayArrayArray5[arg8][arg1][arg7 + 1] = 50;
						}
						if (local110.aBoolean5) {
							this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local110.aBoolean17) {
							this.aByteArrayArrayArray5[arg8][arg1][arg7 + 1] = 50;
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7 + 1] = 50;
						}
						if (local110.aBoolean5) {
							this.anIntArrayArrayArray2[arg8][arg1][arg7 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local110.aBoolean17) {
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7] = 50;
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7 + 1] = 50;
						}
						if (local110.aBoolean5) {
							this.anIntArrayArrayArray2[arg8][arg1 + 1][arg7] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local110.aBoolean17) {
							this.aByteArrayArrayArray5[arg8][arg1][arg7] = 50;
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7] = 50;
						}
						if (local110.aBoolean5) {
							this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x492;
						}
					}
					if (local110.aBoolean14 && arg3 != null) {
						arg3.method26(arg7, arg2, local110.aBoolean9, arg1, arg6);
					}
					if (local110.anInt38 != 16) {
						arg5.method316(arg7, arg8, arg1, local110.anInt38);
					}
				} else if (arg2 == 1) {
					if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
						local165 = local110.method20(1, arg6, local49, local60, local68, local97, -1);
					} else {
						local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 1, arg6, local49, true, true);
					}
					arg5.method308(local136, local165, local107, arg8, arg7, null, arg1, 0, local122, anIntArray48[arg6]);
					if (local110.aBoolean17) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray5[arg8][arg1][arg7 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray5[arg8][arg1][arg7] = 50;
						}
					}
					if (local110.aBoolean14 && arg3 != null) {
						arg3.method26(arg7, arg2, local110.aBoolean9, arg1, arg6);
					}
				} else {
					@Pc(874) int local874;
					@Pc(903) Class6_Sub2_Sub1 local903;
					if (arg2 == 2) {
						local874 = arg6 + 1 & 0x3;
						@Pc(893) Class6_Sub2_Sub1 local893;
						if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
							local893 = local110.method20(2, arg6 + 4, local49, local60, local68, local97, -1);
							local903 = local110.method20(2, local874, local49, local60, local68, local97, -1);
						} else {
							local893 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 2, arg6 + 4, local49, true, true);
							local903 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 2, local874, local49, true, true);
						}
						arg5.method308(local136, local893, local107, arg8, arg7, local903, arg1, anIntArray49[local874], local122, anIntArray49[arg6]);
						if (local110.aBoolean5) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x249;
								this.anIntArrayArrayArray2[arg8][arg1][arg7 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray2[arg8][arg1][arg7 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg8][arg1 + 1][arg7] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray2[arg8][arg1 + 1][arg7] |= 0x249;
								this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x492;
								this.anIntArrayArrayArray2[arg8][arg1][arg7] |= 0x249;
							}
						}
						if (local110.aBoolean14 && arg3 != null) {
							arg3.method26(arg7, arg2, local110.aBoolean9, arg1, arg6);
						}
						if (local110.anInt38 != 16) {
							arg5.method316(arg7, arg8, arg1, local110.anInt38);
						}
					} else if (arg2 == 3) {
						if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
							local165 = local110.method20(3, arg6, local49, local60, local68, local97, -1);
						} else {
							local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 3, arg6, local49, true, true);
						}
						arg5.method308(local136, local165, local107, arg8, arg7, null, arg1, 0, local122, anIntArray48[arg6]);
						if (local110.aBoolean17) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray5[arg8][arg1][arg7 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray5[arg8][arg1 + 1][arg7] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray5[arg8][arg1][arg7] = 50;
							}
						}
						if (local110.aBoolean14 && arg3 != null) {
							arg3.method26(arg7, arg2, local110.aBoolean9, arg1, arg6);
						}
					} else if (arg2 == 9) {
						if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
							local165 = local110.method20(arg2, arg6, local49, local60, local68, local97, -1);
						} else {
							local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, arg2, arg6, local49, true, true);
						}
						arg5.method310(local165, local122, local136, 0, arg1, arg8, 1, arg7, anInt190, 1, local107);
						if (local110.aBoolean14 && arg3 != null) {
							arg3.method27(arg7, arg6, local110.anInt29, local110.aBoolean9, local110.anInt36, arg1);
						}
					} else {
						if (local110.aBoolean7) {
							if (arg6 == 1) {
								local874 = local97;
								local97 = local68;
								local68 = local60;
								local60 = local49;
								local49 = local874;
							} else if (arg6 == 2) {
								local874 = local97;
								local97 = local60;
								local60 = local874;
								local874 = local68;
								local68 = local49;
								local49 = local874;
							} else if (arg6 == 3) {
								local874 = local97;
								local97 = local49;
								local49 = local60;
								local60 = local68;
								local68 = local874;
							}
						}
						if (arg2 == 4) {
							if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
								local165 = local110.method20(4, 0, local49, local60, local68, local97, -1);
							} else {
								local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 4, 0, local49, true, true);
							}
							arg5.method309(0, arg6 * 512, local165, anInt189, local107, 0, anIntArray49[arg6], arg7, arg1, arg8, local136, local122);
						} else if (arg2 == 5) {
							local874 = 16;
							local263 = arg5.method326(arg8, arg1, arg7);
							if (local263 > 0) {
								local874 = Class2.method24(local263 >> 14 & 0x7FFF).anInt38;
							}
							if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
								local903 = local110.method20(4, 0, local49, local60, local68, local97, -1);
							} else {
								local903 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 4, 0, local49, true, true);
							}
							arg5.method309(anIntArray55[arg6] * local874, arg6 * 512, local903, anInt189, local107, anIntArray47[arg6] * local874, anIntArray49[arg6], arg7, arg1, arg8, local136, local122);
						} else if (arg2 == 6) {
							if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
								local165 = local110.method20(4, 0, local49, local60, local68, local97, -1);
							} else {
								local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 4, 0, local49, true, true);
							}
							arg5.method309(0, arg6, local165, anInt189, local107, 0, 256, arg7, arg1, arg8, local136, local122);
						} else if (arg2 == 7) {
							if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
								local165 = local110.method20(4, 0, local49, local60, local68, local97, -1);
							} else {
								local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 4, 0, local49, true, true);
							}
							arg5.method309(0, arg6, local165, anInt189, local107, 0, 512, arg7, arg1, arg8, local136, local122);
						} else if (arg2 == 8) {
							if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
								local165 = local110.method20(4, 0, local49, local60, local68, local97, -1);
							} else {
								local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 4, 0, local49, true, true);
							}
							arg5.method309(0, arg6, local165, anInt189, local107, 0, 768, arg7, arg1, arg8, local136, local122);
						}
					}
				}
			} else if (!aBoolean72 || local110.aBoolean6 || local110.aBoolean8) {
				if (local110.anInt30 == -1 && local110.anIntArray3 == null) {
					local165 = local110.method20(22, arg6, local49, local60, local68, local97, -1);
				} else {
					local165 = new Class6_Sub2_Sub1_Sub2(local60, local110.anInt30, local97, arg4, local68, 22, arg6, local49, true, true);
				}
				arg5.method306(arg7, local165, local122, local136, local107, arg8, arg1);
				if (local110.aBoolean14 && local110.aBoolean6 && arg3 != null) {
					arg3.method28(arg1, arg7);
				}
			}
		} catch (@Pc(1648) RuntimeException local1648) {
			signlink.reporterror("26040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1648.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(ZI[B[Lclient!CGGBZSOS;Lclient!OBOSMEDX;I)V")
	public void method183(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class3[] arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) Class6_Sub2_Sub3 local17 = new Class6_Sub2_Sub3(741, arg1);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method416();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method416();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method402();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray3[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class3 local101 = null;
						if (local86 >= 0) {
							local101 = arg2[local86];
						}
						this.method182(this.anInt179, local70, local62, local101, local19, arg3, local66, local74, local55);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("77502, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(III)I")
	private int method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIIIIILclient!UAWAYCTK;I)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub2_Sub3 arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(29) int local29;
			if (arg0 >= 0 && arg0 < 104 && arg4 >= 0 && arg4 < 104) {
				this.aByteArrayArrayArray3[arg6][arg0][arg4] = 0;
				while (true) {
					local29 = arg5.method402();
					if (local29 == 0) {
						if (arg6 == 0) {
							this.anIntArrayArrayArray1[0][arg0][arg4] = -method190(arg0 + arg2 + 932731, arg4 + 556238 + arg3) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg6][arg0][arg4] = this.anIntArrayArrayArray1[arg6 - 1][arg0][arg4] - 240;
							return;
						}
					}
					if (local29 == 1) {
						@Pc(83) int local83 = arg5.method402();
						if (local83 == 1) {
							local83 = 0;
						}
						if (arg6 == 0) {
							this.anIntArrayArrayArray1[0][arg0][arg4] = -local83 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg6][arg0][arg4] = this.anIntArrayArrayArray1[arg6 - 1][arg0][arg4] - local83 * 8;
						return;
					}
					if (local29 <= 49) {
						this.aByteArrayArrayArray6[arg6][arg0][arg4] = arg5.method403();
						this.aByteArrayArrayArray4[arg6][arg0][arg4] = (byte) ((local29 - 2) / 4);
						this.aByteArrayArrayArray1[arg6][arg0][arg4] = (byte) (local29 + arg1 - 2 & 0x3);
					} else if (local29 <= 81) {
						this.aByteArrayArrayArray3[arg6][arg0][arg4] = (byte) (local29 - 49);
					} else {
						this.aByteArrayArrayArray2[arg6][arg0][arg4] = (byte) (local29 - 81);
					}
				}
			} else {
				while (true) {
					local29 = arg5.method402();
					if (local29 == 0) {
						return;
					}
					if (local29 == 1) {
						arg5.method402();
						return;
					}
					if (local29 <= 49) {
						arg5.method402();
					}
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("88913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "b", descriptor = "(IIII)I")
	private int method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("56211, " + arg0 + ", " + arg1 + ", " + 966 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(III[BIILclient!OBOSMEDX;IBI[Lclient!CGGBZSOS;)V")
	public void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3[] arg9) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(741, arg3);
			@Pc(15) int local15 = -1;
			while (true) {
				@Pc(18) int local18 = local7.method416();
				if (local18 == 0) {
					return;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				while (true) {
					@Pc(29) int local29 = local7.method416();
					if (local29 == 0) {
						break;
					}
					local26 += local29 - 1;
					@Pc(41) int local41 = local26 & 0x3F;
					@Pc(47) int local47 = local26 >> 6 & 0x3F;
					@Pc(51) int local51 = local26 >> 12;
					@Pc(54) int local54 = local7.method402();
					@Pc(58) int local58 = local54 >> 2;
					@Pc(62) int local62 = local54 & 0x3;
					if (local51 == arg8 && local47 >= arg0 && local47 < arg0 + 8 && local41 >= arg7 && local41 < arg7 + 8) {
						@Pc(84) Class2 local84 = Class2.method24(local15);
						@Pc(102) int local102 = arg1 + Class11.method82(local84.anInt36, local62, local84.anInt29, arg4, local47 & 0x7, this.anInt188, local41 & 0x7);
						@Pc(119) int local119 = arg2 + Class11.method83(local62, local84.anInt29, arg4, local47 & 0x7, local41 & 0x7, local84.anInt36);
						if (local102 > 0 && local119 > 0 && local102 < 103 && local119 < 103) {
							@Pc(131) int local131 = arg5;
							if ((this.aByteArrayArrayArray3[1][local102][local119] & 0x2) == 2) {
								local131 = arg5 - 1;
							}
							@Pc(146) Class3 local146 = null;
							if (local131 >= 0) {
								local146 = arg9[local131];
							}
							this.method182(this.anInt179, local102, local58, local146, local15, arg6, local62 + arg4 & 0x3, local119, arg5);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("5111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 2 + ", " + arg8 + ", " + arg9 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJMWYKME", name = "a", descriptor = "(IIII[Lclient!CGGBZSOS;[BI)V")
	public void method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg0 + local7 > 0 && arg0 + local7 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
							arg3[local3].anIntArrayArray1[arg0 + local7][arg5 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class6_Sub2_Sub3 local65 = new Class6_Sub2_Sub3(741, arg4);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
					for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
						this.method187(local84 + arg0, 0, arg2, arg1, local88 + arg5, local65, local11);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("50200, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
