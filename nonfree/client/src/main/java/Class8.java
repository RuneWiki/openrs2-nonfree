import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GSYZIGPZ")
public final class Class8 {

	@OriginalMember(owner = "client!GSYZIGPZ", name = "m", descriptor = "I")
	private static int anInt176;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "q", descriptor = "I")
	public static int anInt178;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "C", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "d", descriptor = "Z")
	public static boolean aBoolean51 = true;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "i", descriptor = "[I")
	private static final int[] anIntArray63 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!GSYZIGPZ", name = "j", descriptor = "I")
	private static int anInt174 = -48601;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "o", descriptor = "I")
	private static int anInt177 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "p", descriptor = "[I")
	private static final int[] anIntArray64 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!GSYZIGPZ", name = "s", descriptor = "[I")
	private static final int[] anIntArray65 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!GSYZIGPZ", name = "t", descriptor = "I")
	private static int anInt179 = -15455;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "u", descriptor = "I")
	private static int anInt180 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "v", descriptor = "[I")
	private static final int[] anIntArray66 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!GSYZIGPZ", name = "D", descriptor = "I")
	public static int anInt181 = 99;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "f", descriptor = "I")
	private int anInt173 = -184;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "g", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "l", descriptor = "I")
	private int anInt175 = -79;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "E", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "F", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "x", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "y", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "z", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "A", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "B", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(II)I")
	private static int method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method154(arg0 - 1, arg1 - 1) + method154(arg0 + 1, arg1 - 1) + method154(arg0 - 1, arg1 + 1) + method154(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method154(arg0 - 1, arg1) + method154(arg0 + 1, arg1) + method154(arg0, arg1 - 1) + method154(arg0, arg1 + 1);
		@Pc(59) int local59 = method154(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(III)I")
	private static int method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method135(local3, local13);
		@Pc(29) int local29 = method135(local3 + 1, local13);
		@Pc(35) int local35 = method135(local3, local13 + 1);
		@Pc(43) int local43 = method135(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method149(local23, local29, local9, arg2);
		@Pc(55) int local55 = method149(local35, local43, local9, arg2);
		return method149(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "b", descriptor = "(II)I")
	private static int method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method139(arg0 + 45365, arg1 + 91923, 4) + (method139(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method139(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(II[BI)Z")
	public static boolean method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(11) boolean local11 = true;
			@Pc(17) Class3_Sub1_Sub3 local17 = new Class3_Sub1_Sub3((byte) -103, arg2);
			@Pc(19) int local19 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local17.method288();
				if (local22 == 0) {
					return local11;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local17.method288();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local17.method274() >> 2;
						@Pc(74) int local74 = local65 + arg1;
						@Pc(78) int local78 = local59 + arg0;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class26 local91 = Class26.method313(local19);
							if (local70 != 22 || !aBoolean51 || local91.aBoolean123 || local91.aBoolean115) {
								local11 &= local91.method318();
								local32 = true;
							}
						}
					}
					local37 = local17.method288();
					if (local37 == 0) {
						break;
					}
					local17.method274();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("55559, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "c", descriptor = "(II)I")
	private static int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!GSYZIGPZ", name = "b", descriptor = "(III)Z")
	public static boolean method146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != anInt179) {
				anInt176 = 418;
			}
			@Pc(7) Class26 local7 = Class26.method313(arg2);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local7.method314(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("55777, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(Lclient!NHEPCMLW;Lclient!VNVHYJAS;I)V")
	public static void method147(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(10) int local10 = arg0.method288();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class26 local19 = Class26.method313(local3);
				local19.method320(arg1);
				while (true) {
					@Pc(26) int local26 = arg0.method288();
					if (local26 == 0) {
						break;
					}
					arg0.method274();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("29182, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(IIII)I")
	private static int method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub1_Sub2_Sub3.anIntArray198[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(I[[[IIIIILclient!TEXKPKZX;ILclient!EAREBDMK;II)V")
	public static void method152(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class36 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg5][arg9][arg3];
			@Pc(19) int local19 = arg1[arg5][arg9 + 1][arg3];
			@Pc(31) int local31 = arg1[arg5][arg9 + 1][arg3 + 1];
			@Pc(41) int local41 = arg1[arg5][arg9][arg3 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class26 local54 = Class26.method313(arg2);
			@Pc(69) int local69 = arg9 + (arg3 << 7) + (arg2 << 14) + 1073741824;
			if (!local54.aBoolean123) {
				local69 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg7 << 6) + arg4);
			@Pc(103) Class3_Sub1_Sub1 local103;
			if (arg4 == 22) {
				if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
					local103 = local54.method321(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, 22, true, local19, arg2);
				}
				arg6.method386(arg0, local83, local69, arg9, arg3, local103, local51);
				if (local54.aBoolean119 && local54.aBoolean123) {
					arg8.method67(arg9, arg3);
				}
			} else {
				@Pc(199) int local199;
				if (arg4 == 10 || arg4 == 11) {
					if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
						local103 = local54.method321(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, 10, true, local19, arg2);
					}
					if (local103 != null) {
						@Pc(186) int local186 = 0;
						if (arg4 == 11) {
							local186 += 256;
						}
						@Pc(202) int local202;
						if (arg7 == 1 || arg7 == 3) {
							local199 = local54.anInt458;
							local202 = local54.anInt446;
						} else {
							local199 = local54.anInt446;
							local202 = local54.anInt458;
						}
						arg6.method390(local83, local51, local103, local69, arg9, local202, local186, arg0, local199, arg3);
					}
					if (local54.aBoolean119) {
						arg8.method66(arg3, local54.anInt446, arg7, local54.anInt458, arg9, local54.aBoolean127);
					}
				} else if (arg4 >= 12) {
					if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
						local103 = local54.method321(arg4, arg7, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, arg4, true, local19, arg2);
					}
					arg6.method390(local83, local51, local103, local69, arg9, 1, 0, arg0, 1, arg3);
					if (local54.aBoolean119) {
						arg8.method66(arg3, local54.anInt446, arg7, local54.anInt458, arg9, local54.aBoolean127);
					}
				} else if (arg4 == 0) {
					if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
						local103 = local54.method321(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, 0, true, local19, arg2);
					}
					arg6.method388((Class3_Sub1_Sub1) null, 0, local83, anIntArray63[arg7], arg3, local103, arg9, local69, local51, arg0);
					if (local54.aBoolean119) {
						arg8.method65(arg7, arg3, arg9, local54.aBoolean127, arg4);
					}
				} else if (arg4 == 1) {
					if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
						local103 = local54.method321(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, 1, true, local19, arg2);
					}
					arg6.method388((Class3_Sub1_Sub1) null, 0, local83, anIntArray66[arg7], arg3, local103, arg9, local69, local51, arg0);
					if (local54.aBoolean119) {
						arg8.method65(arg7, arg3, arg9, local54.aBoolean127, arg4);
					}
				} else {
					@Pc(445) int local445;
					@Pc(474) Class3_Sub1_Sub1 local474;
					if (arg4 == 2) {
						local445 = arg7 + 1 & 0x3;
						@Pc(464) Class3_Sub1_Sub1 local464;
						if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
							local464 = local54.method321(2, arg7 + 4, local9, local19, local31, local41, -1);
							local474 = local54.method321(2, local445, local9, local19, local31, local41, -1);
						} else {
							local464 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7 + 4, 2, true, local19, arg2);
							local474 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, local445, 2, true, local19, arg2);
						}
						arg6.method388(local474, anIntArray63[local445], local83, anIntArray63[arg7], arg3, local464, arg9, local69, local51, arg0);
						if (local54.aBoolean119) {
							arg8.method65(arg7, arg3, arg9, local54.aBoolean127, arg4);
						}
					} else if (arg4 == 3) {
						if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
							local103 = local54.method321(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, 3, true, local19, arg2);
						}
						arg6.method388((Class3_Sub1_Sub1) null, 0, local83, anIntArray66[arg7], arg3, local103, arg9, local69, local51, arg0);
						if (local54.aBoolean119) {
							arg8.method65(arg7, arg3, arg9, local54.aBoolean127, arg4);
						}
					} else if (arg4 == 9) {
						if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
							local103 = local54.method321(arg4, arg7, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, arg7, arg4, true, local19, arg2);
						}
						arg6.method390(local83, local51, local103, local69, arg9, 1, 0, arg0, 1, arg3);
						if (local54.aBoolean119) {
							arg8.method66(arg3, local54.anInt446, arg7, local54.anInt458, arg9, local54.aBoolean127);
						}
					} else {
						if (local54.aBoolean125) {
							if (arg7 == 1) {
								local445 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local445;
							} else if (arg7 == 2) {
								local445 = local41;
								local41 = local19;
								local19 = local445;
								local445 = local31;
								local31 = local9;
								local9 = local445;
							} else if (arg7 == 3) {
								local445 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local445;
							}
						}
						if (arg4 == 4) {
							if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
								local103 = local54.method321(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, 0, 4, true, local19, arg2);
							}
							arg6.method389(local83, local69, arg0, 0, 0, local103, arg7 * 512, anIntArray63[arg7], anInt174, arg3, local51, arg9);
						} else if (arg4 == 5) {
							local445 = 16;
							local199 = arg6.method406(arg0, arg9, arg3);
							if (local199 > 0) {
								local445 = Class26.method313(local199 >> 14 & 0x7FFF).anInt448;
							}
							if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
								local474 = local54.method321(4, 0, local9, local19, local31, local41, -1);
							} else {
								local474 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, 0, 4, true, local19, arg2);
							}
							arg6.method389(local83, local69, arg0, anIntArray65[arg7] * local445, anIntArray64[arg7] * local445, local474, arg7 * 512, anIntArray63[arg7], anInt174, arg3, local51, arg9);
						} else if (arg4 == 6) {
							if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
								local103 = local54.method321(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, 0, 4, true, local19, arg2);
							}
							arg6.method389(local83, local69, arg0, 0, 0, local103, arg7, 256, anInt174, arg3, local51, arg9);
						} else if (arg4 == 7) {
							if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
								local103 = local54.method321(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, 0, 4, true, local19, arg2);
							}
							arg6.method389(local83, local69, arg0, 0, 0, local103, arg7, 512, anInt174, arg3, local51, arg9);
						} else if (arg4 == 8) {
							if (local54.anInt455 == -1 && local54.anIntArray119 == null) {
								local103 = local54.method321(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class3_Sub1_Sub1_Sub2(local9, local54.anInt455, true, local41, local31, 0, 4, true, local19, arg2);
							}
							arg6.method389(local83, local69, arg0, 0, 0, local103, arg7, 768, anInt174, arg3, local51, arg9);
						}
					}
				}
			}
		} catch (@Pc(1013) RuntimeException local1013) {
			signlink.reporterror("69549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -714 + ", " + arg9 + ", " + local1013.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "e", descriptor = "(II)I")
	private static int method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "<init>", descriptor = "(II[[[II[[[B)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt181 = 99;
			this.anInt182 = arg3;
			this.anInt183 = arg1;
			this.anIntArrayArrayArray2 = arg2;
			this.aByteArrayArrayArray3 = arg4;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt182][this.anInt183];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt182][this.anInt183];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt182][this.anInt183];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt182][this.anInt183];
			this.anIntArrayArrayArray1 = new int[4][this.anInt182 + 1][this.anInt183 + 1];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt182 + 1][this.anInt183 + 1];
			this.anIntArrayArray6 = new int[this.anInt182 + 1][this.anInt183 + 1];
			this.anIntArray67 = new int[this.anInt183];
			this.anIntArray68 = new int[this.anInt183];
			this.anIntArray69 = new int[this.anInt183];
			this.anIntArray70 = new int[this.anInt183];
			this.anIntArray71 = new int[this.anInt183];
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("45029, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(IBIII[Lclient!EAREBDMK;[B)V")
	public void method136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5[] arg4, @OriginalArg(6) byte[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg3 + local11 > 0 && arg3 + local11 < 103) {
							arg4[local3].anIntArrayArray5[arg1 + local7][arg3 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class3_Sub1_Sub3 local65 = new Class3_Sub1_Sub3((byte) -103, arg5);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
					for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
						this.method145(local11, local79 + arg3, arg2, local65, arg0, 0, local75 + arg1);
					}
				}
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("73318, " + arg0 + ", " + 110 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(II[B[Lclient!EAREBDMK;IIZIII)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class5[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg3[arg6].anIntArrayArray5[arg4 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class3_Sub1_Sub3 local57 = new Class3_Sub1_Sub3((byte) -103, arg2);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg5 && local63 >= arg0 && local63 < arg0 + 8 && local67 >= arg7 && local67 < arg7 + 8) {
							this.method145(arg6, arg1 + Class37.method432(arg8, local67 & 0x7, local63 & 0x7), 0, local57, 0, arg8, arg4 + Class37.method431(local67 & 0x7, arg8, local63 & 0x7));
						} else {
							this.method145(0, -1, 0, local57, 0, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("99394, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(IZIII)V")
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg0; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt182 && local3 >= 0 && local3 < this.anInt183) {
						this.aByteArrayArrayArray1[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 - 1][local3];
						}
						if (local7 == arg1 + arg2 && local7 < this.anInt182 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg0 && local3 < this.anInt183 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("95748, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(IIBI)I")
	private int method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46819, " + arg0 + ", " + arg1 + ", " + -81 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(Lclient!EAREBDMK;Lclient!TEXKPKZX;IIIIIIB)V")
	private void method144(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		try {
			if (aBoolean51 && (this.aByteArrayArrayArray3[0][arg2][arg7] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg3][arg2][arg7] & 0x10) != 0) {
					return;
				}
				if (this.method143(arg7, arg2, arg3) != anInt178) {
					return;
				}
			}
			if (arg3 < anInt181) {
				anInt181 = arg3;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg3][arg2][arg7];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg3][arg2 + 1][arg7];
			@Pc(73) int local73 = this.anIntArrayArrayArray2[arg3][arg2 + 1][arg7 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray2[arg3][arg2][arg7 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class26 local97 = Class26.method313(arg6);
			@Pc(102) boolean local102 = false;
			@Pc(124) int local124 = arg2 + (arg7 << 7) + (arg6 << 14) + 1073741824;
			if (!local97.aBoolean123) {
				local124 += Integer.MIN_VALUE;
			}
			@Pc(138) byte local138 = (byte) ((arg4 << 6) + arg5);
			@Pc(167) Class3_Sub1_Sub1 local167;
			if (arg5 != 22) {
				@Pc(265) int local265;
				if (arg5 == 10 || arg5 == 11) {
					if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
						local167 = local97.method321(10, arg4, local49, local60, local73, local84, -1);
					} else {
						local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, 10, true, local60, arg6);
					}
					if (local167 != null) {
						@Pc(252) int local252 = 0;
						if (arg5 == 11) {
							local252 += 256;
						}
						@Pc(268) int local268;
						if (arg4 == 1 || arg4 == 3) {
							local265 = local97.anInt458;
							local268 = local97.anInt446;
						} else {
							local265 = local97.anInt446;
							local268 = local97.anInt458;
						}
						if (arg1.method390(local138, local94, local167, local124, arg2, local268, local252, arg3, local265, arg7) && local97.aBoolean116) {
							@Pc(299) Class3_Sub1_Sub1_Sub1 local299;
							if (local167 instanceof Class3_Sub1_Sub1_Sub1) {
								local299 = (Class3_Sub1_Sub1_Sub1) local167;
							} else {
								local299 = local97.method321(10, arg4, local49, local60, local73, local84, -1);
							}
							if (local299 != null) {
								for (@Pc(315) int local315 = 0; local315 <= local265; local315++) {
									for (@Pc(319) int local319 = 0; local319 <= local268; local319++) {
										@Pc(326) int local326 = local299.anInt66 / 4;
										if (local326 > 30) {
											local326 = 30;
										}
										if (local326 > this.aByteArrayArrayArray1[arg3][arg2 + local315][arg7 + local319]) {
											this.aByteArrayArrayArray1[arg3][arg2 + local315][arg7 + local319] = (byte) local326;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean119 && arg0 != null) {
						arg0.method66(arg7, local97.anInt446, arg4, local97.anInt458, arg2, local97.aBoolean127);
					}
				} else if (arg5 >= 12) {
					if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
						local167 = local97.method321(arg5, arg4, local49, local60, local73, local84, -1);
					} else {
						local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, arg5, true, local60, arg6);
					}
					arg1.method390(local138, local94, local167, local124, arg2, 1, 0, arg3, 1, arg7);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x924;
					}
					if (local97.aBoolean119 && arg0 != null) {
						arg0.method66(arg7, local97.anInt446, arg4, local97.anInt458, arg2, local97.aBoolean127);
					}
				} else if (arg5 == 0) {
					if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
						local167 = local97.method321(0, arg4, local49, local60, local73, local84, -1);
					} else {
						local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, 0, true, local60, arg6);
					}
					arg1.method388((Class3_Sub1_Sub1) null, 0, local138, anIntArray63[arg4], arg7, local167, arg2, local124, local94, arg3);
					if (arg4 == 0) {
						if (local97.aBoolean116) {
							this.aByteArrayArrayArray1[arg3][arg2][arg7] = 50;
							this.aByteArrayArrayArray1[arg3][arg2][arg7 + 1] = 50;
						}
						if (local97.aBoolean120) {
							this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x249;
						}
					} else if (arg4 == 1) {
						if (local97.aBoolean116) {
							this.aByteArrayArrayArray1[arg3][arg2][arg7 + 1] = 50;
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7 + 1] = 50;
						}
						if (local97.aBoolean120) {
							this.anIntArrayArrayArray1[arg3][arg2][arg7 + 1] |= 0x492;
						}
					} else if (arg4 == 2) {
						if (local97.aBoolean116) {
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7] = 50;
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7 + 1] = 50;
						}
						if (local97.aBoolean120) {
							this.anIntArrayArrayArray1[arg3][arg2 + 1][arg7] |= 0x249;
						}
					} else if (arg4 == 3) {
						if (local97.aBoolean116) {
							this.aByteArrayArrayArray1[arg3][arg2][arg7] = 50;
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7] = 50;
						}
						if (local97.aBoolean120) {
							this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x492;
						}
					}
					if (local97.aBoolean119 && arg0 != null) {
						arg0.method65(arg4, arg7, arg2, local97.aBoolean127, arg5);
					}
					if (local97.anInt448 != 16) {
						arg1.method396(local97.anInt448, arg7, arg3, arg2);
					}
				} else if (arg5 == 1) {
					if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
						local167 = local97.method321(1, arg4, local49, local60, local73, local84, -1);
					} else {
						local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, 1, true, local60, arg6);
					}
					arg1.method388((Class3_Sub1_Sub1) null, 0, local138, anIntArray66[arg4], arg7, local167, arg2, local124, local94, arg3);
					if (local97.aBoolean116) {
						if (arg4 == 0) {
							this.aByteArrayArrayArray1[arg3][arg2][arg7 + 1] = 50;
						} else if (arg4 == 1) {
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7 + 1] = 50;
						} else if (arg4 == 2) {
							this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7] = 50;
						} else if (arg4 == 3) {
							this.aByteArrayArrayArray1[arg3][arg2][arg7] = 50;
						}
					}
					if (local97.aBoolean119 && arg0 != null) {
						arg0.method65(arg4, arg7, arg2, local97.aBoolean127, arg5);
					}
				} else {
					@Pc(876) int local876;
					@Pc(905) Class3_Sub1_Sub1 local905;
					if (arg5 == 2) {
						local876 = arg4 + 1 & 0x3;
						@Pc(895) Class3_Sub1_Sub1 local895;
						if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
							local895 = local97.method321(2, arg4 + 4, local49, local60, local73, local84, -1);
							local905 = local97.method321(2, local876, local49, local60, local73, local84, -1);
						} else {
							local895 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4 + 4, 2, true, local60, arg6);
							local905 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, local876, 2, true, local60, arg6);
						}
						arg1.method388(local905, anIntArray63[local876], local138, anIntArray63[arg4], arg7, local895, arg2, local124, local94, arg3);
						if (local97.aBoolean120) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x249;
								this.anIntArrayArrayArray1[arg3][arg2][arg7 + 1] |= 0x492;
							} else if (arg4 == 1) {
								this.anIntArrayArrayArray1[arg3][arg2][arg7 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg3][arg2 + 1][arg7] |= 0x249;
							} else if (arg4 == 2) {
								this.anIntArrayArrayArray1[arg3][arg2 + 1][arg7] |= 0x249;
								this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x492;
							} else if (arg4 == 3) {
								this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x492;
								this.anIntArrayArrayArray1[arg3][arg2][arg7] |= 0x249;
							}
						}
						if (local97.aBoolean119 && arg0 != null) {
							arg0.method65(arg4, arg7, arg2, local97.aBoolean127, arg5);
						}
						if (local97.anInt448 != 16) {
							arg1.method396(local97.anInt448, arg7, arg3, arg2);
						}
					} else if (arg5 == 3) {
						if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
							local167 = local97.method321(3, arg4, local49, local60, local73, local84, -1);
						} else {
							local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, 3, true, local60, arg6);
						}
						arg1.method388((Class3_Sub1_Sub1) null, 0, local138, anIntArray66[arg4], arg7, local167, arg2, local124, local94, arg3);
						if (local97.aBoolean116) {
							if (arg4 == 0) {
								this.aByteArrayArrayArray1[arg3][arg2][arg7 + 1] = 50;
							} else if (arg4 == 1) {
								this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7 + 1] = 50;
							} else if (arg4 == 2) {
								this.aByteArrayArrayArray1[arg3][arg2 + 1][arg7] = 50;
							} else if (arg4 == 3) {
								this.aByteArrayArrayArray1[arg3][arg2][arg7] = 50;
							}
						}
						if (local97.aBoolean119 && arg0 != null) {
							arg0.method65(arg4, arg7, arg2, local97.aBoolean127, arg5);
						}
					} else if (arg5 == 9) {
						if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
							local167 = local97.method321(arg5, arg4, local49, local60, local73, local84, -1);
						} else {
							local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, arg5, true, local60, arg6);
						}
						arg1.method390(local138, local94, local167, local124, arg2, 1, 0, arg3, 1, arg7);
						if (local97.aBoolean119 && arg0 != null) {
							arg0.method66(arg7, local97.anInt446, arg4, local97.anInt458, arg2, local97.aBoolean127);
						}
					} else {
						if (local97.aBoolean125) {
							if (arg4 == 1) {
								local876 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local876;
							} else if (arg4 == 2) {
								local876 = local84;
								local84 = local60;
								local60 = local876;
								local876 = local73;
								local73 = local49;
								local49 = local876;
							} else if (arg4 == 3) {
								local876 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local876;
							}
						}
						if (arg5 == 4) {
							if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
								local167 = local97.method321(4, 0, local49, local60, local73, local84, -1);
							} else {
								local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, 0, 4, true, local60, arg6);
							}
							arg1.method389(local138, local124, arg3, 0, 0, local167, arg4 * 512, anIntArray63[arg4], anInt174, arg7, local94, arg2);
						} else if (arg5 == 5) {
							local876 = 16;
							local265 = arg1.method406(arg3, arg2, arg7);
							if (local265 > 0) {
								local876 = Class26.method313(local265 >> 14 & 0x7FFF).anInt448;
							}
							if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
								local905 = local97.method321(4, 0, local49, local60, local73, local84, -1);
							} else {
								local905 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, 0, 4, true, local60, arg6);
							}
							arg1.method389(local138, local124, arg3, anIntArray65[arg4] * local876, anIntArray64[arg4] * local876, local905, arg4 * 512, anIntArray63[arg4], anInt174, arg7, local94, arg2);
						} else if (arg5 == 6) {
							if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
								local167 = local97.method321(4, 0, local49, local60, local73, local84, -1);
							} else {
								local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, 0, 4, true, local60, arg6);
							}
							arg1.method389(local138, local124, arg3, 0, 0, local167, arg4, 256, anInt174, arg7, local94, arg2);
						} else if (arg5 == 7) {
							if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
								local167 = local97.method321(4, 0, local49, local60, local73, local84, -1);
							} else {
								local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, 0, 4, true, local60, arg6);
							}
							arg1.method389(local138, local124, arg3, 0, 0, local167, arg4, 512, anInt174, arg7, local94, arg2);
						} else if (arg5 == 8) {
							if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
								local167 = local97.method321(4, 0, local49, local60, local73, local84, -1);
							} else {
								local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, 0, 4, true, local60, arg6);
							}
							arg1.method389(local138, local124, arg3, 0, 0, local167, arg4, 768, anInt174, arg7, local94, arg2);
						}
					}
				}
			} else if (!aBoolean51 || local97.aBoolean123 || local97.aBoolean115) {
				if (local97.anInt455 == -1 && local97.anIntArray119 == null) {
					local167 = local97.method321(22, arg4, local49, local60, local73, local84, -1);
				} else {
					local167 = new Class3_Sub1_Sub1_Sub2(local49, local97.anInt455, true, local84, local73, arg4, 22, true, local60, arg6);
				}
				arg1.method386(arg3, local138, local124, arg2, arg7, local167, local94);
				if (local97.aBoolean119 && local97.aBoolean123 && arg0 != null) {
					arg0.method67(arg2, arg7);
				}
			}
		} catch (@Pc(1650) RuntimeException local1650) {
			signlink.reporterror("30151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1650.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(IIIILclient!NHEPCMLW;III)V")
	private void method145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(33) int local33;
			if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
				this.aByteArrayArrayArray3[arg0][arg6][arg1] = 0;
				while (true) {
					local33 = arg3.method274();
					if (local33 == 0) {
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg6][arg1] = -method140(arg6 + arg2 + 932731, 556238 + arg1 + arg4) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg0][arg6][arg1] = this.anIntArrayArrayArray2[arg0 - 1][arg6][arg1] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg3.method274();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg6][arg1] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg0][arg6][arg1] = this.anIntArrayArrayArray2[arg0 - 1][arg6][arg1] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray6[arg0][arg6][arg1] = arg3.method275();
						this.aByteArrayArrayArray4[arg0][arg6][arg1] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray2[arg0][arg6][arg1] = (byte) (local33 + arg5 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray3[arg0][arg6][arg1] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray5[arg0][arg6][arg1] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg3.method274();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg3.method274();
						return;
					}
					if (local33 <= 49) {
						arg3.method274();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("13695, " + -927 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "c", descriptor = "(III)I")
	private int method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "([Lclient!EAREBDMK;I[BIILclient!TEXKPKZX;)V")
	public void method150(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class36 arg4) {
		try {
			@Pc(11) Class3_Sub1_Sub3 local11 = new Class3_Sub1_Sub3((byte) -103, arg2);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local11.method288();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local11.method288();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local11.method274();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg1;
					@Pc(68) int local68 = local39 + arg3;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray3[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class5 local95 = null;
						if (local80 >= 0) {
							local95 = arg0[local80];
						}
						this.method144(local95, arg4, local64, local49, local60, local56, local13, local68, (byte) 8);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("77160, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -79 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "d", descriptor = "(II)I")
	private int method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(ILclient!TEXKPKZX;I[BIIII[Lclient!EAREBDMK;II)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3((byte) -103, arg3);
			@Pc(9) int local9 = -1;
			if (arg10 != -32879) {
				aBoolean53 = !aBoolean53;
			}
			while (true) {
				@Pc(21) int local21 = local7.method288();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method288();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method274();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					if (local54 == arg2 && local50 >= arg5 && local50 < arg5 + 8 && local44 >= arg0 && local44 < arg0 + 8) {
						@Pc(87) Class26 local87 = Class26.method313(local9);
						@Pc(104) int local104 = arg6 + Class37.method433(local65, local87.anInt446, arg4, local44 & 0x7, local87.anInt458, local50 & 0x7);
						@Pc(122) int local122 = arg7 + Class37.method434(arg4, local65, local50 & 0x7, this.anInt173, local87.anInt446, local87.anInt458, local44 & 0x7);
						if (local104 > 0 && local122 > 0 && local104 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg9;
							if ((this.aByteArrayArrayArray3[1][local104][local122] & 0x2) == 2) {
								local134 = arg9 - 1;
							}
							@Pc(149) Class5 local149 = null;
							if (local134 >= 0) {
								local149 = arg8[local134];
							}
							this.method144(local149, arg1, local104, arg9, local65 + arg4 & 0x3, local61, local9, local122, (byte) 8);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("37323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSYZIGPZ", name = "a", descriptor = "(Z[Lclient!EAREBDMK;Lclient!TEXKPKZX;)V")
	public void method155(@OriginalArg(1) Class5[] arg0, @OriginalArg(2) Class36 arg1) {
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
								arg0[local27].method67(local7, local11);
							}
						}
					}
				}
			}
			anInt180 += (int) (Math.random() * 5.0D) - 2;
			if (anInt180 < -8) {
				anInt180 = -8;
			}
			if (anInt180 > 8) {
				anInt180 = 8;
			}
			anInt177 += (int) (Math.random() * 5.0D) - 2;
			if (anInt177 < -16) {
				anInt177 = -16;
			}
			if (anInt177 > 16) {
				anInt177 = 16;
			}
			@Pc(142) int local142;
			@Pc(148) int local148;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(178) int local178;
			@Pc(200) int local200;
			@Pc(213) int local213;
			@Pc(219) int local219;
			@Pc(223) int local223;
			@Pc(229) int local229;
			@Pc(245) int local245;
			@Pc(293) int local293;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(117) byte[][] local117 = this.aByteArrayArrayArray1[local7];
				local142 = (int) Math.sqrt((double) 5100);
				local148 = 768 * local142 >> 8;
				for (local150 = 1; local150 < this.anInt183 - 1; local150++) {
					for (local154 = 1; local154 < this.anInt182 - 1; local154++) {
						local178 = this.anIntArrayArrayArray2[local7][local154 + 1][local150] - this.anIntArrayArrayArray2[local7][local154 - 1][local150];
						local200 = this.anIntArrayArrayArray2[local7][local154][local150 + 1] - this.anIntArrayArrayArray2[local7][local154][local150 - 1];
						local213 = (int) Math.sqrt((double) (local178 * local178 + local200 * local200 + 65536));
						local219 = (local178 << 8) / local213;
						local223 = 65536 / local213;
						local229 = (local200 << 8) / local213;
						local245 = (-50 * local219 + -10 * local223 + -50 * local229) / local148 + 96;
						local293 = (local117[local154 - 1][local150] >> 2) + (local117[local154 + 1][local150] >> 3) + (local117[local154][local150 - 1] >> 2) + (local117[local154][local150 + 1] >> 3) + (local117[local154][local150] >> 1);
						this.anIntArrayArray6[local154][local150] = local245 - local293;
					}
				}
				for (local154 = 0; local154 < this.anInt183; local154++) {
					this.anIntArray67[local154] = 0;
					this.anIntArray68[local154] = 0;
					this.anIntArray69[local154] = 0;
					this.anIntArray70[local154] = 0;
					this.anIntArray71[local154] = 0;
				}
				for (local178 = -5; local178 < this.anInt182 + 5; local178++) {
					for (local200 = 0; local200 < this.anInt183; local200++) {
						local213 = local178 + 5;
						@Pc(428) int local428;
						if (local213 >= 0 && local213 < this.anInt182) {
							local219 = this.aByteArrayArrayArray5[local7][local213][local200] & 0xFF;
							if (local219 > 0) {
								@Pc(387) Class39 local387 = Class39.aClass39Array1[local219 - 1];
								this.anIntArray67[local200] += local387.anInt619;
								this.anIntArray68[local200] += local387.anInt617;
								this.anIntArray69[local200] += local387.anInt618;
								this.anIntArray70[local200] += local387.anInt620;
								local428 = this.anIntArray71[local200]++;
							}
						}
						local219 = local178 - 5;
						if (local219 >= 0 && local219 < this.anInt182) {
							local223 = this.aByteArrayArrayArray5[local7][local219][local200] & 0xFF;
							if (local223 > 0) {
								@Pc(460) Class39 local460 = Class39.aClass39Array1[local223 - 1];
								this.anIntArray67[local200] -= local460.anInt619;
								this.anIntArray68[local200] -= local460.anInt617;
								this.anIntArray69[local200] -= local460.anInt618;
								this.anIntArray70[local200] -= local460.anInt620;
								local428 = this.anIntArray71[local200]--;
							}
						}
					}
					if (local178 >= 1 && local178 < this.anInt182 - 1) {
						local213 = 0;
						local219 = 0;
						local223 = 0;
						local229 = 0;
						local245 = 0;
						for (local293 = -5; local293 < this.anInt183 + 5; local293++) {
							@Pc(536) int local536 = local293 + 5;
							if (local536 >= 0 && local536 < this.anInt183) {
								local213 += this.anIntArray67[local536];
								local219 += this.anIntArray68[local536];
								local223 += this.anIntArray69[local536];
								local229 += this.anIntArray70[local536];
								local245 += this.anIntArray71[local536];
							}
							@Pc(581) int local581 = local293 - 5;
							if (local581 >= 0 && local581 < this.anInt183) {
								local213 -= this.anIntArray67[local581];
								local219 -= this.anIntArray68[local581];
								local223 -= this.anIntArray69[local581];
								local229 -= this.anIntArray70[local581];
								local245 -= this.anIntArray71[local581];
							}
							if (local293 >= 1 && local293 < this.anInt183 - 1 && (!aBoolean51 || (this.aByteArrayArrayArray3[0][local178][local293] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local178][local293] & 0x10) == 0 && this.method143(local293, local178, local7) == anInt178)) {
								if (local7 < anInt181) {
									anInt181 = local7;
								}
								@Pc(680) int local680 = this.aByteArrayArrayArray5[local7][local178][local293] & 0xFF;
								@Pc(691) int local691 = this.aByteArrayArrayArray6[local7][local178][local293] & 0xFF;
								if (local680 > 0 || local691 > 0) {
									@Pc(704) int local704 = this.anIntArrayArrayArray2[local7][local178][local293];
									@Pc(715) int local715 = this.anIntArrayArrayArray2[local7][local178 + 1][local293];
									@Pc(728) int local728 = this.anIntArrayArrayArray2[local7][local178 + 1][local293 + 1];
									@Pc(739) int local739 = this.anIntArrayArrayArray2[local7][local178][local293 + 1];
									@Pc(746) int local746 = this.anIntArrayArray6[local178][local293];
									@Pc(755) int local755 = this.anIntArrayArray6[local178 + 1][local293];
									@Pc(766) int local766 = this.anIntArrayArray6[local178 + 1][local293 + 1];
									@Pc(775) int local775 = this.anIntArrayArray6[local178][local293 + 1];
									@Pc(777) int local777 = -1;
									@Pc(779) int local779 = -1;
									@Pc(787) int local787;
									@Pc(791) int local791;
									if (local680 > 0) {
										local787 = local213 * 256 / local229;
										local791 = local219 / local245;
										@Pc(795) int local795 = local223 / local245;
										local777 = this.method148(local787, local791, local795);
										@Pc(807) int local807 = local787 + anInt180 & 0xFF;
										local795 += anInt177;
										if (local795 < 0) {
											local795 = 0;
										} else if (local795 > 255) {
											local795 = 255;
										}
										local779 = this.method148(local807, local791, local795);
									}
									if (local7 > 0) {
										@Pc(832) boolean local832 = true;
										if (local680 == 0 && this.aByteArrayArrayArray4[local7][local178][local293] != 0) {
											local832 = false;
										}
										if (local691 > 0 && !Class39.aClass39Array1[local691 - 1].aBoolean155) {
											local832 = false;
										}
										if (local832 && local704 == local715 && local704 == local728 && local704 == local739) {
											this.anIntArrayArrayArray1[local7][local178][local293] |= 0x924;
										}
									}
									local787 = 0;
									if (local777 != -1) {
										local787 = Class3_Sub1_Sub2_Sub3.anIntArray202[method142(local779, 96)];
									}
									if (local691 == 0) {
										arg1.method385(local7, local178, local293, 0, 0, -1, local704, local715, local728, local739, method142(local777, local746), method142(local777, local755), method142(local777, local766), method142(local777, local775), 0, 0, 0, 0, local787, 0);
									} else {
										local791 = this.aByteArrayArrayArray4[local7][local178][local293] + 1;
										@Pc(944) byte local944 = this.aByteArrayArrayArray2[local7][local178][local293];
										@Pc(950) Class39 local950 = Class39.aClass39Array1[local691 - 1];
										@Pc(953) int local953 = local950.anInt615;
										@Pc(961) int local961;
										@Pc(959) int local959;
										if (local953 >= 0) {
											local959 = Class3_Sub1_Sub2_Sub3.method505(local953);
											local961 = -1;
										} else if (local950.anInt614 == 16711935) {
											local959 = 0;
											local961 = -2;
											local953 = -1;
										} else {
											local961 = this.method148(local950.anInt616, local950.anInt617, local950.anInt618);
											local959 = Class3_Sub1_Sub2_Sub3.anIntArray202[this.method151(local950.anInt621, 96)];
										}
										arg1.method385(local7, local178, local293, local791, local944, local953, local704, local715, local728, local739, method142(local777, local746), method142(local777, local755), method142(local777, local766), method142(local777, local775), this.method151(local961, local746), this.method151(local961, local755), this.method151(local961, local766), this.method151(local961, local775), local787, local959);
									}
								}
							}
						}
					}
				}
				for (local200 = 1; local200 < this.anInt183 - 1; local200++) {
					for (local213 = 1; local213 < this.anInt182 - 1; local213++) {
						arg1.method384(local7, local213, local200, this.method143(local200, local213, local7));
					}
				}
			}
			arg1.method411();
			for (local11 = 0; local11 < this.anInt182; local11++) {
				for (local27 = 0; local27 < this.anInt183; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg1.method382(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1132) int local1132 = 2;
			@Pc(1134) int local1134 = 4;
			for (@Pc(1136) int local1136 = 0; local1136 < 4; local1136++) {
				if (local1136 > 0) {
					local27 <<= 0x3;
					local1132 <<= 0x3;
					local1134 <<= 0x3;
				}
				for (@Pc(1154) int local1154 = 0; local1154 <= local1136; local1154++) {
					for (local142 = 0; local142 <= this.anInt183; local142++) {
						for (local148 = 0; local148 <= this.anInt182; local148++) {
							if ((this.anIntArrayArrayArray1[local1154][local148][local142] & local27) != 0) {
								local150 = local142;
								local154 = local142;
								local178 = local1154;
								local200 = local1154;
								while (local150 > 0 && (this.anIntArrayArrayArray1[local1154][local148][local150 - 1] & local27) != 0) {
									local150--;
								}
								while (local154 < this.anInt183 && (this.anIntArrayArrayArray1[local1154][local148][local154 + 1] & local27) != 0) {
									local154++;
								}
								label328: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local178 - 1][local148][local213] & local27) == 0) {
											break label328;
										}
									}
									local178--;
								}
								label317: while (local200 < local1136) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local200 + 1][local148][local213] & local27) == 0) {
											break label317;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray2[local200][local148][local150] - 240;
									local229 = this.anIntArrayArrayArray2[local178][local148][local150];
									Class36.method383(local148 * 128, local223, 1, local154 * 128 + 128, local148 * 128, local229, local1136, local150 * 128);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray1[local245][local148][local293] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local148][local142] & local1132) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local1154;
								local200 = local1154;
								while (local150 > 0 && (this.anIntArrayArrayArray1[local1154][local150 - 1][local142] & local1132) != 0) {
									local150--;
								}
								while (local154 < this.anInt182 && (this.anIntArrayArrayArray1[local1154][local154 + 1][local142] & local1132) != 0) {
									local154++;
								}
								label381: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local178 - 1][local213][local142] & local1132) == 0) {
											break label381;
										}
									}
									local178--;
								}
								label370: while (local200 < local1136) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local200 + 1][local213][local142] & local1132) == 0) {
											break label370;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray2[local200][local150][local142] - 240;
									local229 = this.anIntArrayArrayArray2[local178][local150][local142];
									Class36.method383(local150 * 128, local223, 2, local142 * 128, local154 * 128 + 128, local229, local1136, local142 * 128);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray1[local245][local293][local142] &= ~local1132;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local148][local142] & local1134) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local142;
								local200 = local142;
								while (local178 > 0 && (this.anIntArrayArrayArray1[local1154][local148][local178 - 1] & local1134) != 0) {
									local178--;
								}
								while (local200 < this.anInt183 && (this.anIntArrayArrayArray1[local1154][local148][local200 + 1] & local1134) != 0) {
									local200++;
								}
								label434: while (local150 > 0) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray1[local1154][local150 - 1][local213] & local1134) == 0) {
											break label434;
										}
									}
									local150--;
								}
								label423: while (local154 < this.anInt182) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray1[local1154][local154 + 1][local213] & local1134) == 0) {
											break label423;
										}
									}
									local154++;
								}
								if ((local154 + 1 - local150) * (local200 + 1 - local178) >= 4) {
									local213 = this.anIntArrayArrayArray2[local1154][local150][local178];
									Class36.method383(local150 * 128, local213, 4, local200 * 128 + 128, local154 * 128 + 128, local213, local1136, local178 * 128);
									for (local219 = local150; local219 <= local154; local219++) {
										for (local223 = local178; local223 <= local200; local223++) {
											this.anIntArrayArrayArray1[local1154][local219][local223] &= ~local1134;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1769) RuntimeException local1769) {
			signlink.reporterror("20065, " + false + ", " + arg0 + ", " + arg1 + ", " + local1769.toString());
			throw new RuntimeException();
		}
	}
}
