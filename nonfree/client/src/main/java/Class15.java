import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQBPDNOP")
public final class Class15 {

	@OriginalMember(owner = "client!GQBPDNOP", name = "x", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!GQBPDNOP", name = "z", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "I")
	private static int anInt242 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!GQBPDNOP", name = "b", descriptor = "Z")
	public static boolean aBoolean62 = true;

	@OriginalMember(owner = "client!GQBPDNOP", name = "c", descriptor = "I")
	private static int anInt243 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!GQBPDNOP", name = "e", descriptor = "[I")
	private static final int[] anIntArray69 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!GQBPDNOP", name = "h", descriptor = "[I")
	private static final int[] anIntArray70 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!GQBPDNOP", name = "o", descriptor = "[I")
	private static final int[] anIntArray76 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!GQBPDNOP", name = "p", descriptor = "[I")
	private static final int[] anIntArray77 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!GQBPDNOP", name = "q", descriptor = "B")
	private static byte aByte12 = 13;

	@OriginalMember(owner = "client!GQBPDNOP", name = "u", descriptor = "I")
	public static int anInt244 = 99;

	@OriginalMember(owner = "client!GQBPDNOP", name = "F", descriptor = "I")
	private static int anInt250 = -558;

	@OriginalMember(owner = "client!GQBPDNOP", name = "d", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!GQBPDNOP", name = "g", descriptor = "B")
	private byte aByte11 = -81;

	@OriginalMember(owner = "client!GQBPDNOP", name = "A", descriptor = "B")
	private byte aByte13 = 8;

	@OriginalMember(owner = "client!GQBPDNOP", name = "D", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!GQBPDNOP", name = "E", descriptor = "I")
	private int anInt249 = 8;

	@OriginalMember(owner = "client!GQBPDNOP", name = "G", descriptor = "B")
	private byte aByte14 = 9;

	@OriginalMember(owner = "client!GQBPDNOP", name = "v", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!GQBPDNOP", name = "w", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!GQBPDNOP", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!GQBPDNOP", name = "H", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!GQBPDNOP", name = "B", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!GQBPDNOP", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!GQBPDNOP", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!GQBPDNOP", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!GQBPDNOP", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!GQBPDNOP", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!GQBPDNOP", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!GQBPDNOP", name = "i", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!GQBPDNOP", name = "j", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!GQBPDNOP", name = "k", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!GQBPDNOP", name = "l", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!GQBPDNOP", name = "m", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(Lclient!WBEWPIXO;Lclient!IBVXWOKK;I)V")
	public static void method128(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) Class6_Sub1 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != 9784) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			local6 = -1;
			while (true) {
				@Pc(16) int local16 = arg0.method482();
				if (local16 == 0) {
					return;
				}
				local6 += local16;
				@Pc(25) Class13 local25 = Class13.method127(local6);
				local25.method122(arg1);
				while (true) {
					@Pc(32) int local32 = arg0.method482();
					if (local32 == 0) {
						break;
					}
					arg0.method468();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("12303, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIII)I")
	private static int method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub3_Sub3_Sub3.anIntArray144[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(II)I")
	private static int method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(I[BII)Z")
	public static boolean method133(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) boolean local7 = true;
			@Pc(13) Class3_Sub3_Sub4 local13 = new Class3_Sub3_Sub4((byte) -115, arg0);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local13.method482();
				if (local18 == 0) {
					return local7;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local13.method482();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local13.method468() >> 2;
						@Pc(70) int local70 = local61 + arg2;
						@Pc(74) int local74 = local55 + arg1;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class13 local87 = Class13.method127(local15);
							if (local66 != 22 || !aBoolean62 || local87.aBoolean59 || local87.aBoolean50) {
								local7 &= local87.method126();
								local28 = true;
							}
						}
					}
					local33 = local13.method482();
					if (local33 == 0) {
						break;
					}
					local13.method468();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("21521, " + -586 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIB)Z")
	public static boolean method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class13 local7 = Class13.method127(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local7.method124(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("40134, " + arg0 + ", " + arg1 + ", " + 44 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "b", descriptor = "(II)I")
	private static int method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method143(arg0 + 45365, arg1 + 91923, 4) + (method143(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method143(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(BIIIILclient!BBOYCGQQ;IIILclient!QPWZYOZR;[[[I)V")
	public static void method138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class31 arg8, @OriginalArg(10) int[][][] arg9) {
		try {
			@Pc(9) int local9 = arg9[arg0][arg6][arg2];
			@Pc(19) int local19 = arg9[arg0][arg6 + 1][arg2];
			@Pc(31) int local31 = arg9[arg0][arg6 + 1][arg2 + 1];
			@Pc(41) int local41 = arg9[arg0][arg6][arg2 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class13 local54 = Class13.method127(arg3);
			@Pc(66) int local66 = arg6 + (arg2 << 7) + (arg3 << 14) + 1073741824;
			if (aByte12 != 13) {
				for (@Pc(71) int local71 = 1; local71 > 0; local71++) {
				}
			}
			if (!local54.aBoolean59) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(90) byte local90 = (byte) ((arg7 << 6) + arg1);
			@Pc(110) Class3_Sub3_Sub2 local110;
			if (arg1 == 22) {
				if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
					local110 = local54.method125(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, 22);
				}
				arg8.method343(arg6, arg5, local66, local110, arg2, local51, local90);
				if (local54.aBoolean54 && local54.aBoolean59) {
					arg4.method32(arg2, arg6);
				}
			} else {
				@Pc(206) int local206;
				if (arg1 == 10 || arg1 == 11) {
					if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
						local110 = local54.method125(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, 10);
					}
					if (local110 != null) {
						@Pc(193) int local193 = 0;
						if (arg1 == 11) {
							local193 += 256;
						}
						@Pc(209) int local209;
						if (arg7 == 1 || arg7 == 3) {
							local206 = local54.anInt233;
							local209 = local54.anInt237;
						} else {
							local206 = local54.anInt237;
							local209 = local54.anInt233;
						}
						arg8.method347(local51, arg5, arg2, local66, local209, local110, local90, local206, arg6, local193);
					}
					if (local54.aBoolean54) {
						arg4.method31(arg2, arg6, local54.anInt233, local54.anInt237, local54.aBoolean53, arg7);
					}
				} else if (arg1 >= 12) {
					if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
						local110 = local54.method125(arg1, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, arg1);
					}
					arg8.method347(local51, arg5, arg2, local66, 1, local110, local90, 1, arg6, 0);
					if (local54.aBoolean54) {
						arg4.method31(arg2, arg6, local54.anInt233, local54.anInt237, local54.aBoolean53, arg7);
					}
				} else if (arg1 == 0) {
					if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
						local110 = local54.method125(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, 0);
					}
					arg8.method345(0, local90, local51, anIntArray76[arg7], null, local110, arg6, arg5, local66, arg2);
					if (local54.aBoolean54) {
						arg4.method30(arg2, arg1, arg7, local54.aBoolean53, arg6);
					}
				} else if (arg1 == 1) {
					if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
						local110 = local54.method125(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, 1);
					}
					arg8.method345(0, local90, local51, anIntArray77[arg7], null, local110, arg6, arg5, local66, arg2);
					if (local54.aBoolean54) {
						arg4.method30(arg2, arg1, arg7, local54.aBoolean53, arg6);
					}
				} else {
					@Pc(452) int local452;
					@Pc(481) Class3_Sub3_Sub2 local481;
					if (arg1 == 2) {
						local452 = arg7 + 1 & 0x3;
						@Pc(471) Class3_Sub3_Sub2 local471;
						if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
							local471 = local54.method125(2, arg7 + 4, local9, local19, local31, local41, -1);
							local481 = local54.method125(2, local452, local9, local19, local31, local41, -1);
						} else {
							local471 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7 + 4, local31, 2);
							local481 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, local452, local31, 2);
						}
						arg8.method345(anIntArray76[local452], local90, local51, anIntArray76[arg7], local481, local471, arg6, arg5, local66, arg2);
						if (local54.aBoolean54) {
							arg4.method30(arg2, arg1, arg7, local54.aBoolean53, arg6);
						}
					} else if (arg1 == 3) {
						if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
							local110 = local54.method125(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, 3);
						}
						arg8.method345(0, local90, local51, anIntArray77[arg7], null, local110, arg6, arg5, local66, arg2);
						if (local54.aBoolean54) {
							arg4.method30(arg2, arg1, arg7, local54.aBoolean53, arg6);
						}
					} else if (arg1 == 9) {
						if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
							local110 = local54.method125(arg1, arg7, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, arg7, local31, arg1);
						}
						arg8.method347(local51, arg5, arg2, local66, 1, local110, local90, 1, arg6, 0);
						if (local54.aBoolean54) {
							arg4.method31(arg2, arg6, local54.anInt233, local54.anInt237, local54.aBoolean53, arg7);
						}
					} else {
						if (local54.aBoolean61) {
							if (arg7 == 1) {
								local452 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local452;
							} else if (arg7 == 2) {
								local452 = local41;
								local41 = local19;
								local19 = local452;
								local452 = local31;
								local31 = local9;
								local9 = local452;
							} else if (arg7 == 3) {
								local452 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local452;
							}
						}
						if (arg1 == 4) {
							if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
								local110 = local54.method125(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, 0, local31, 4);
							}
							arg8.method346(arg7 * 512, local110, 0, 0, local51, arg2, local90, arg5, anIntArray76[arg7], arg6, local66);
						} else if (arg1 == 5) {
							local452 = 16;
							local206 = arg8.method363(arg5, arg6, arg2);
							if (local206 > 0) {
								local452 = Class13.method127(local206 >> 14 & 0x7FFF).anInt221;
							}
							if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
								local481 = local54.method125(4, 0, local9, local19, local31, local41, -1);
							} else {
								local481 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, 0, local31, 4);
							}
							arg8.method346(arg7 * 512, local481, anIntArray70[arg7] * local452, anIntArray69[arg7] * local452, local51, arg2, local90, arg5, anIntArray76[arg7], arg6, local66);
						} else if (arg1 == 6) {
							if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
								local110 = local54.method125(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, 0, local31, 4);
							}
							arg8.method346(arg7, local110, 0, 0, local51, arg2, local90, arg5, 256, arg6, local66);
						} else if (arg1 == 7) {
							if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
								local110 = local54.method125(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, 0, local31, 4);
							}
							arg8.method346(arg7, local110, 0, 0, local51, arg2, local90, arg5, 512, arg6, local66);
						} else if (arg1 == 8) {
							if (local54.anInt222 == -1 && local54.anIntArray63 == null) {
								local110 = local54.method125(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class3_Sub3_Sub2_Sub6(local19, true, arg3, (byte) 8, local54.anInt222, local41, local9, 0, local31, 4);
							}
							arg8.method346(arg7, local110, 0, 0, local51, arg2, local90, arg5, 768, arg6, local66);
						}
					}
				}
			}
		} catch (@Pc(1020) RuntimeException local1020) {
			signlink.reporterror("21840, " + 13 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1020.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "c", descriptor = "(II)I")
	private static int method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method142(arg0 - 1, arg1 - 1) + method142(arg0 + 1, arg1 - 1) + method142(arg0 - 1, arg1 + 1) + method142(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method142(arg0 - 1, arg1) + method142(arg0 + 1, arg1) + method142(arg0, arg1 - 1) + method142(arg0, arg1 + 1);
		@Pc(59) int local59 = method142(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "e", descriptor = "(II)I")
	private static int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "b", descriptor = "(III)I")
	private static int method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method139(local3, local13);
		@Pc(29) int local29 = method139(local3 + 1, local13);
		@Pc(35) int local35 = method139(local3, local13 + 1);
		@Pc(43) int local43 = method139(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method131(local23, local29, local9, arg2);
		@Pc(55) int local55 = method131(local35, local43, local9, arg2);
		return method131(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "<init>", descriptor = "(I[[[BII[[[I)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt244 = 99;
			this.anInt245 = arg0;
			this.anInt246 = arg3;
			this.anIntArrayArrayArray2 = arg4;
			this.aByteArrayArrayArray6 = arg1;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt245][this.anInt246];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt245][this.anInt246];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt245][this.anInt246];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt245][this.anInt246];
			this.anIntArrayArrayArray1 = new int[4][this.anInt245 + 1][this.anInt246 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt245 + 1][this.anInt246 + 1];
			this.anIntArrayArray6 = new int[this.anInt245 + 1][this.anInt246 + 1];
			this.anIntArray71 = new int[this.anInt246];
			this.anIntArray72 = new int[this.anInt246];
			this.anIntArray73 = new int[this.anInt246];
			this.anIntArray74 = new int[this.anInt246];
			this.anIntArray75 = new int[this.anInt246];
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("40950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIII[Lclient!BBOYCGQQ;BII[BILclient!QPWZYOZR;)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4[] arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class31 arg10) {
		try {
			@Pc(7) Class3_Sub3_Sub4 local7 = new Class3_Sub3_Sub4((byte) -115, arg8);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(26) int local26 = local7.method482();
				if (local26 == 0) {
					return;
				}
				local9 += local26;
				@Pc(34) int local34 = 0;
				while (true) {
					@Pc(37) int local37 = local7.method482();
					if (local37 == 0) {
						break;
					}
					local34 += local37 - 1;
					@Pc(49) int local49 = local34 & 0x3F;
					@Pc(55) int local55 = local34 >> 6 & 0x3F;
					@Pc(59) int local59 = local34 >> 12;
					@Pc(62) int local62 = local7.method468();
					@Pc(66) int local66 = local62 >> 2;
					@Pc(70) int local70 = local62 & 0x3;
					if (local59 == arg9 && local55 >= arg1 && local55 < arg1 + 8 && local49 >= arg7 && local49 < arg7 + 8) {
						@Pc(92) Class13 local92 = Class13.method127(local9);
						@Pc(109) int local109 = arg6 + Class49.method543(local55 & 0x7, local92.anInt237, arg0, local92.anInt233, local70, local49 & 0x7);
						@Pc(127) int local127 = arg2 + Class49.method544(this.aBoolean64, arg0, local49 & 0x7, local70, local92.anInt237, local55 & 0x7, local92.anInt233);
						if (local109 > 0 && local127 > 0 && local109 < 103 && local127 < 103) {
							@Pc(139) int local139 = arg3;
							if ((this.aByteArrayArrayArray6[1][local109][local127] & 0x2) == 2) {
								local139 = arg3 - 1;
							}
							@Pc(154) Class4 local154 = null;
							if (local139 >= 0) {
								local154 = arg4[local139];
							}
							this.method141(local66, arg3, local109, local154, local9, local127, arg10, local70 + arg0 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("15838, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IBII)I")
	private int method130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray6[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("37084, " + arg0 + ", " + -46 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(III)I")
	private int method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIIIIILclient!WBEWPIXO;I)V")
	private void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub3_Sub4 arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(27) int local27;
			if (arg3 >= 0 && arg3 < 104 && arg2 >= 0 && arg2 < 104) {
				this.aByteArrayArrayArray6[arg5][arg3][arg2] = 0;
				while (true) {
					local27 = arg6.method468();
					if (local27 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray2[0][arg3][arg2] = -method137(arg3 + arg0 + 932731, arg2 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg5][arg3][arg2] = this.anIntArrayArrayArray2[arg5 - 1][arg3][arg2] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg6.method468();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray2[0][arg3][arg2] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg5][arg3][arg2] = this.anIntArrayArrayArray2[arg5 - 1][arg3][arg2] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray4[arg5][arg3][arg2] = arg6.method469();
						this.aByteArrayArrayArray1[arg5][arg3][arg2] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray2[arg5][arg3][arg2] = (byte) (local27 + arg4 - 2 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray6[arg5][arg3][arg2] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray5[arg5][arg3][arg2] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg6.method468();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg6.method468();
						return;
					}
					if (local27 <= 49) {
						arg6.method468();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("96973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "d", descriptor = "(II)I")
	private int method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIILclient!BBOYCGQQ;IIILclient!QPWZYOZR;I)V")
	private void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class31 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean62 && (this.aByteArrayArrayArray6[0][arg2][arg5] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg1][arg2][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method130(arg1, arg2, arg5) != anInt248) {
					return;
				}
			}
			if (arg1 < anInt244) {
				anInt244 = arg1;
			}
			@Pc(54) int local54 = this.anIntArrayArrayArray2[arg1][arg2][arg5];
			@Pc(65) int local65 = this.anIntArrayArrayArray2[arg1][arg2 + 1][arg5];
			@Pc(78) int local78 = this.anIntArrayArrayArray2[arg1][arg2 + 1][arg5 + 1];
			@Pc(89) int local89 = this.anIntArrayArrayArray2[arg1][arg2][arg5 + 1];
			@Pc(99) int local99 = local54 + local65 + local78 + local89 >> 2;
			@Pc(102) Class13 local102 = Class13.method127(arg4);
			@Pc(114) int local114 = arg2 + (arg5 << 7) + (arg4 << 14) + 1073741824;
			if (!local102.aBoolean59) {
				local114 += Integer.MIN_VALUE;
			}
			@Pc(128) byte local128 = (byte) ((arg7 << 6) + arg0);
			@Pc(157) Class3_Sub3_Sub2 local157;
			if (arg0 != 22) {
				@Pc(255) int local255;
				if (arg0 == 10 || arg0 == 11) {
					if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
						local157 = local102.method125(10, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, 10);
					}
					if (local157 != null) {
						@Pc(242) int local242 = 0;
						if (arg0 == 11) {
							local242 += 256;
						}
						@Pc(258) int local258;
						if (arg7 == 1 || arg7 == 3) {
							local255 = local102.anInt233;
							local258 = local102.anInt237;
						} else {
							local255 = local102.anInt237;
							local258 = local102.anInt233;
						}
						if (arg6.method347(local99, arg1, arg5, local114, local258, local157, local128, local255, arg2, local242) && local102.aBoolean51) {
							@Pc(289) Class3_Sub3_Sub2_Sub3 local289;
							if (local157 instanceof Class3_Sub3_Sub2_Sub3) {
								local289 = (Class3_Sub3_Sub2_Sub3) local157;
							} else {
								local289 = local102.method125(10, arg7, local54, local65, local78, local89, -1);
							}
							if (local289 != null) {
								for (@Pc(305) int local305 = 0; local305 <= local255; local305++) {
									for (@Pc(309) int local309 = 0; local309 <= local258; local309++) {
										@Pc(316) int local316 = local289.anInt202 / 4;
										if (local316 > 30) {
											local316 = 30;
										}
										if (local316 > this.aByteArrayArrayArray3[arg1][arg2 + local305][arg5 + local309]) {
											this.aByteArrayArrayArray3[arg1][arg2 + local305][arg5 + local309] = (byte) local316;
										}
									}
								}
							}
						}
					}
					if (local102.aBoolean54 && arg3 != null) {
						arg3.method31(arg5, arg2, local102.anInt233, local102.anInt237, local102.aBoolean53, arg7);
					}
				} else if (arg0 >= 12) {
					if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
						local157 = local102.method125(arg0, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, arg0);
					}
					arg6.method347(local99, arg1, arg5, local114, 1, local157, local128, 1, arg2, 0);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x924;
					}
					if (local102.aBoolean54 && arg3 != null) {
						arg3.method31(arg5, arg2, local102.anInt233, local102.anInt237, local102.aBoolean53, arg7);
					}
				} else if (arg0 == 0) {
					if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
						local157 = local102.method125(0, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, 0);
					}
					arg6.method345(0, local128, local99, anIntArray76[arg7], null, local157, arg2, arg1, local114, arg5);
					if (arg7 == 0) {
						if (local102.aBoolean51) {
							this.aByteArrayArrayArray3[arg1][arg2][arg5] = 50;
							this.aByteArrayArrayArray3[arg1][arg2][arg5 + 1] = 50;
						}
						if (local102.aBoolean55) {
							this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local102.aBoolean51) {
							this.aByteArrayArrayArray3[arg1][arg2][arg5 + 1] = 50;
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5 + 1] = 50;
						}
						if (local102.aBoolean55) {
							this.anIntArrayArrayArray1[arg1][arg2][arg5 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local102.aBoolean51) {
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5] = 50;
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5 + 1] = 50;
						}
						if (local102.aBoolean55) {
							this.anIntArrayArrayArray1[arg1][arg2 + 1][arg5] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local102.aBoolean51) {
							this.aByteArrayArrayArray3[arg1][arg2][arg5] = 50;
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5] = 50;
						}
						if (local102.aBoolean55) {
							this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x492;
						}
					}
					if (local102.aBoolean54 && arg3 != null) {
						arg3.method30(arg5, arg0, arg7, local102.aBoolean53, arg2);
					}
					if (local102.anInt221 != 16) {
						arg6.method353(arg1, local102.anInt221, arg5, arg2);
					}
				} else if (arg0 == 1) {
					if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
						local157 = local102.method125(1, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, 1);
					}
					arg6.method345(0, local128, local99, anIntArray77[arg7], null, local157, arg2, arg1, local114, arg5);
					if (local102.aBoolean51) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray3[arg1][arg2][arg5 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray3[arg1][arg2][arg5] = 50;
						}
					}
					if (local102.aBoolean54 && arg3 != null) {
						arg3.method30(arg5, arg0, arg7, local102.aBoolean53, arg2);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class3_Sub3_Sub2 local895;
					if (arg0 == 2) {
						local866 = arg7 + 1 & 0x3;
						@Pc(885) Class3_Sub3_Sub2 local885;
						if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
							local885 = local102.method125(2, arg7 + 4, local54, local65, local78, local89, -1);
							local895 = local102.method125(2, local866, local54, local65, local78, local89, -1);
						} else {
							local885 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7 + 4, local78, 2);
							local895 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, local866, local78, 2);
						}
						arg6.method345(anIntArray76[local866], local128, local99, anIntArray76[arg7], local895, local885, arg2, arg1, local114, arg5);
						if (local102.aBoolean55) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x249;
								this.anIntArrayArrayArray1[arg1][arg2][arg5 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray1[arg1][arg2][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg1][arg2 + 1][arg5] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray1[arg1][arg2 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x492;
								this.anIntArrayArrayArray1[arg1][arg2][arg5] |= 0x249;
							}
						}
						if (local102.aBoolean54 && arg3 != null) {
							arg3.method30(arg5, arg0, arg7, local102.aBoolean53, arg2);
						}
						if (local102.anInt221 != 16) {
							arg6.method353(arg1, local102.anInt221, arg5, arg2);
						}
					} else if (arg0 == 3) {
						if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
							local157 = local102.method125(3, arg7, local54, local65, local78, local89, -1);
						} else {
							local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, 3);
						}
						arg6.method345(0, local128, local99, anIntArray77[arg7], null, local157, arg2, arg1, local114, arg5);
						if (local102.aBoolean51) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray3[arg1][arg2][arg5 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray3[arg1][arg2 + 1][arg5] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray3[arg1][arg2][arg5] = 50;
							}
						}
						if (local102.aBoolean54 && arg3 != null) {
							arg3.method30(arg5, arg0, arg7, local102.aBoolean53, arg2);
						}
					} else if (arg0 == 9) {
						if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
							local157 = local102.method125(arg0, arg7, local54, local65, local78, local89, -1);
						} else {
							local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, arg0);
						}
						arg6.method347(local99, arg1, arg5, local114, 1, local157, local128, 1, arg2, 0);
						if (local102.aBoolean54 && arg3 != null) {
							arg3.method31(arg5, arg2, local102.anInt233, local102.anInt237, local102.aBoolean53, arg7);
						}
					} else {
						if (local102.aBoolean61) {
							if (arg7 == 1) {
								local866 = local89;
								local89 = local78;
								local78 = local65;
								local65 = local54;
								local54 = local866;
							} else if (arg7 == 2) {
								local866 = local89;
								local89 = local65;
								local65 = local866;
								local866 = local78;
								local78 = local54;
								local54 = local866;
							} else if (arg7 == 3) {
								local866 = local89;
								local89 = local54;
								local54 = local65;
								local65 = local78;
								local78 = local866;
							}
						}
						if (arg0 == 4) {
							if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
								local157 = local102.method125(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, 0, local78, 4);
							}
							arg6.method346(arg7 * 512, local157, 0, 0, local99, arg5, local128, arg1, anIntArray76[arg7], arg2, local114);
						} else if (arg0 == 5) {
							local866 = 16;
							local255 = arg6.method363(arg1, arg2, arg5);
							if (local255 > 0) {
								local866 = Class13.method127(local255 >> 14 & 0x7FFF).anInt221;
							}
							if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
								local895 = local102.method125(4, 0, local54, local65, local78, local89, -1);
							} else {
								local895 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, 0, local78, 4);
							}
							arg6.method346(arg7 * 512, local895, anIntArray70[arg7] * local866, anIntArray69[arg7] * local866, local99, arg5, local128, arg1, anIntArray76[arg7], arg2, local114);
						} else if (arg0 == 6) {
							if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
								local157 = local102.method125(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, 0, local78, 4);
							}
							arg6.method346(arg7, local157, 0, 0, local99, arg5, local128, arg1, 256, arg2, local114);
						} else if (arg0 == 7) {
							if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
								local157 = local102.method125(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, 0, local78, 4);
							}
							arg6.method346(arg7, local157, 0, 0, local99, arg5, local128, arg1, 512, arg2, local114);
						} else if (arg0 == 8) {
							if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
								local157 = local102.method125(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, 0, local78, 4);
							}
							arg6.method346(arg7, local157, 0, 0, local99, arg5, local128, arg1, 768, arg2, local114);
						}
					}
				}
			} else if (!aBoolean62 || local102.aBoolean59 || local102.aBoolean50) {
				if (local102.anInt222 == -1 && local102.anIntArray63 == null) {
					local157 = local102.method125(22, arg7, local54, local65, local78, local89, -1);
				} else {
					local157 = new Class3_Sub3_Sub2_Sub6(local65, true, arg4, (byte) 8, local102.anInt222, local89, local54, arg7, local78, 22);
				}
				arg6.method343(arg2, arg1, local114, local157, arg5, local99, local128);
				if (local102.aBoolean54 && local102.aBoolean59 && arg3 != null) {
					arg3.method32(arg5, arg2);
				}
			}
		} catch (@Pc(1640) RuntimeException local1640) {
			signlink.reporterror("73311, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1253 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1640.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "([Lclient!BBOYCGQQ;Lclient!QPWZYOZR;I)V")
	public void method144(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) Class31 arg1) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(34) int local34;
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < 104; local14++) {
					for (local18 = 0; local18 < 104; local18++) {
						if ((this.aByteArrayArrayArray6[local10][local14][local18] & 0x1) == 1) {
							local34 = local10;
							if ((this.aByteArrayArrayArray6[1][local14][local18] & 0x2) == 2) {
								local34 = local10 - 1;
							}
							if (local34 >= 0) {
								arg0[local34].method32(local18, local14);
							}
						}
					}
				}
			}
			anInt242 += (int) (Math.random() * 5.0D) - 2;
			if (anInt242 < -8) {
				anInt242 = -8;
			}
			if (anInt242 > 8) {
				anInt242 = 8;
			}
			anInt243 += (int) (Math.random() * 5.0D) - 2;
			if (anInt243 < -16) {
				anInt243 = -16;
			}
			if (anInt243 > 16) {
				anInt243 = 16;
			}
			@Pc(140) int local140;
			@Pc(146) int local146;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(176) int local176;
			@Pc(198) int local198;
			@Pc(211) int local211;
			@Pc(217) int local217;
			@Pc(221) int local221;
			@Pc(227) int local227;
			@Pc(243) int local243;
			@Pc(291) int local291;
			for (local14 = 0; local14 < 4; local14++) {
				@Pc(115) byte[][] local115 = this.aByteArrayArrayArray3[local14];
				local140 = (int) Math.sqrt((double) 5100);
				local146 = local140 * 768 >> 8;
				for (local148 = 1; local148 < this.anInt246 - 1; local148++) {
					for (local152 = 1; local152 < this.anInt245 - 1; local152++) {
						local176 = this.anIntArrayArrayArray2[local14][local152 + 1][local148] - this.anIntArrayArrayArray2[local14][local152 - 1][local148];
						local198 = this.anIntArrayArrayArray2[local14][local152][local148 + 1] - this.anIntArrayArrayArray2[local14][local152][local148 - 1];
						local211 = (int) Math.sqrt((double) (local176 * local176 + local198 * local198 + 65536));
						local217 = (local176 << 8) / local211;
						local221 = 65536 / local211;
						local227 = (local198 << 8) / local211;
						local243 = (local217 * -50 + local221 * -10 + local227 * -50) / local146 + 96;
						local291 = (local115[local152 - 1][local148] >> 2) + (local115[local152 + 1][local148] >> 3) + (local115[local152][local148 - 1] >> 2) + (local115[local152][local148 + 1] >> 3) + (local115[local152][local148] >> 1);
						this.anIntArrayArray6[local152][local148] = local243 - local291;
					}
				}
				for (local152 = 0; local152 < this.anInt246; local152++) {
					this.anIntArray71[local152] = 0;
					this.anIntArray72[local152] = 0;
					this.anIntArray73[local152] = 0;
					this.anIntArray74[local152] = 0;
					this.anIntArray75[local152] = 0;
				}
				for (local176 = -5; local176 < this.anInt245 + 5; local176++) {
					for (local198 = 0; local198 < this.anInt246; local198++) {
						local211 = local176 + 5;
						@Pc(426) int local426;
						if (local211 >= 0 && local211 < this.anInt245) {
							local217 = this.aByteArrayArrayArray5[local14][local211][local198] & 0xFF;
							if (local217 > 0) {
								@Pc(385) Class32 local385 = Class32.aClass32Array1[local217 - 1];
								this.anIntArray71[local198] += local385.anInt613;
								this.anIntArray72[local198] += local385.anInt611;
								this.anIntArray73[local198] += local385.anInt612;
								this.anIntArray74[local198] += local385.anInt614;
								local426 = this.anIntArray75[local198]++;
							}
						}
						local217 = local176 - 5;
						if (local217 >= 0 && local217 < this.anInt245) {
							local221 = this.aByteArrayArrayArray5[local14][local217][local198] & 0xFF;
							if (local221 > 0) {
								@Pc(458) Class32 local458 = Class32.aClass32Array1[local221 - 1];
								this.anIntArray71[local198] -= local458.anInt613;
								this.anIntArray72[local198] -= local458.anInt611;
								this.anIntArray73[local198] -= local458.anInt612;
								this.anIntArray74[local198] -= local458.anInt614;
								local426 = this.anIntArray75[local198]--;
							}
						}
					}
					if (local176 >= 1 && local176 < this.anInt245 - 1) {
						local211 = 0;
						local217 = 0;
						local221 = 0;
						local227 = 0;
						local243 = 0;
						for (local291 = -5; local291 < this.anInt246 + 5; local291++) {
							@Pc(534) int local534 = local291 + 5;
							if (local534 >= 0 && local534 < this.anInt246) {
								local211 += this.anIntArray71[local534];
								local217 += this.anIntArray72[local534];
								local221 += this.anIntArray73[local534];
								local227 += this.anIntArray74[local534];
								local243 += this.anIntArray75[local534];
							}
							@Pc(579) int local579 = local291 - 5;
							if (local579 >= 0 && local579 < this.anInt246) {
								local211 -= this.anIntArray71[local579];
								local217 -= this.anIntArray72[local579];
								local221 -= this.anIntArray73[local579];
								local227 -= this.anIntArray74[local579];
								local243 -= this.anIntArray75[local579];
							}
							if (local291 >= 1 && local291 < this.anInt246 - 1 && (!aBoolean62 || (this.aByteArrayArrayArray6[0][local176][local291] & 0x2) != 0 || (this.aByteArrayArrayArray6[local14][local176][local291] & 0x10) == 0 && this.method130(local14, local176, local291) == anInt248)) {
								if (local14 < anInt244) {
									anInt244 = local14;
								}
								@Pc(678) int local678 = this.aByteArrayArrayArray5[local14][local176][local291] & 0xFF;
								@Pc(689) int local689 = this.aByteArrayArrayArray4[local14][local176][local291] & 0xFF;
								if (local678 > 0 || local689 > 0) {
									@Pc(702) int local702 = this.anIntArrayArrayArray2[local14][local176][local291];
									@Pc(713) int local713 = this.anIntArrayArrayArray2[local14][local176 + 1][local291];
									@Pc(726) int local726 = this.anIntArrayArrayArray2[local14][local176 + 1][local291 + 1];
									@Pc(737) int local737 = this.anIntArrayArrayArray2[local14][local176][local291 + 1];
									@Pc(744) int local744 = this.anIntArrayArray6[local176][local291];
									@Pc(753) int local753 = this.anIntArrayArray6[local176 + 1][local291];
									@Pc(764) int local764 = this.anIntArrayArray6[local176 + 1][local291 + 1];
									@Pc(773) int local773 = this.anIntArrayArray6[local176][local291 + 1];
									@Pc(775) int local775 = -1;
									@Pc(777) int local777 = -1;
									@Pc(785) int local785;
									@Pc(789) int local789;
									if (local678 > 0) {
										local785 = local211 * 256 / local227;
										local789 = local217 / local243;
										@Pc(793) int local793 = local221 / local243;
										local775 = this.method134(local785, local789, local793);
										@Pc(805) int local805 = local785 + anInt242 & 0xFF;
										local793 += anInt243;
										if (local793 < 0) {
											local793 = 0;
										} else if (local793 > 255) {
											local793 = 255;
										}
										local777 = this.method134(local805, local789, local793);
									}
									if (local14 > 0) {
										@Pc(830) boolean local830 = true;
										if (local678 == 0 && this.aByteArrayArrayArray1[local14][local176][local291] != 0) {
											local830 = false;
										}
										if (local689 > 0 && !Class32.aClass32Array1[local689 - 1].aBoolean145) {
											local830 = false;
										}
										if (local830 && local702 == local713 && local702 == local726 && local702 == local737) {
											this.anIntArrayArrayArray1[local14][local176][local291] |= 0x924;
										}
									}
									local785 = 0;
									if (local775 != -1) {
										local785 = Class3_Sub3_Sub3_Sub3.anIntArray148[method132(local777, 96)];
									}
									if (local689 == 0) {
										arg1.method342(local14, local176, local291, 0, 0, -1, local702, local713, local726, local737, method132(local775, local744), method132(local775, local753), method132(local775, local764), method132(local775, local773), 0, 0, 0, 0, local785, 0);
									} else {
										local789 = this.aByteArrayArrayArray1[local14][local176][local291] + 1;
										@Pc(942) byte local942 = this.aByteArrayArrayArray2[local14][local176][local291];
										@Pc(948) Class32 local948 = Class32.aClass32Array1[local689 - 1];
										@Pc(951) int local951 = local948.anInt609;
										@Pc(959) int local959;
										@Pc(957) int local957;
										if (local951 >= 0) {
											local957 = Class3_Sub3_Sub3_Sub3.method307(local951);
											local959 = -1;
										} else if (local948.anInt608 == 16711935) {
											local959 = -2;
											local951 = -1;
											local957 = Class3_Sub3_Sub3_Sub3.anIntArray148[this.method140(local948.anInt615, 96)];
										} else {
											local959 = this.method134(local948.anInt610, local948.anInt611, local948.anInt612);
											local957 = Class3_Sub3_Sub3_Sub3.anIntArray148[this.method140(local948.anInt615, 96)];
										}
										arg1.method342(local14, local176, local291, local789, local942, local951, local702, local713, local726, local737, method132(local775, local744), method132(local775, local753), method132(local775, local764), method132(local775, local773), this.method140(local959, local744), this.method140(local959, local753), this.method140(local959, local764), this.method140(local959, local773), local785, local957);
									}
								}
							}
						}
					}
				}
				for (local198 = 1; local198 < this.anInt246 - 1; local198++) {
					for (local211 = 1; local211 < this.anInt245 - 1; local211++) {
						arg1.method341(local14, local211, local198, this.method130(local14, local211, local198));
					}
				}
			}
			arg1.method368();
			for (local18 = 0; local18 < this.anInt245; local18++) {
				for (local34 = 0; local34 < this.anInt246; local34++) {
					if ((this.aByteArrayArrayArray6[1][local18][local34] & 0x2) == 2) {
						arg1.method339(local34, 41, local18);
					}
				}
			}
			local34 = 1;
			@Pc(1134) int local1134 = 2;
			@Pc(1136) int local1136 = 4;
			for (@Pc(1138) int local1138 = 0; local1138 < 4; local1138++) {
				if (local1138 > 0) {
					local34 <<= 0x3;
					local1134 <<= 0x3;
					local1136 <<= 0x3;
				}
				for (@Pc(1156) int local1156 = 0; local1156 <= local1138; local1156++) {
					for (local140 = 0; local140 <= this.anInt246; local140++) {
						for (local146 = 0; local146 <= this.anInt245; local146++) {
							if ((this.anIntArrayArrayArray1[local1156][local146][local140] & local34) != 0) {
								local148 = local140;
								local152 = local140;
								local176 = local1156;
								local198 = local1156;
								while (local148 > 0 && (this.anIntArrayArrayArray1[local1156][local146][local148 - 1] & local34) != 0) {
									local148--;
								}
								while (local152 < this.anInt246 && (this.anIntArrayArrayArray1[local1156][local146][local152 + 1] & local34) != 0) {
									local152++;
								}
								label328: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray1[local176 - 1][local146][local211] & local34) == 0) {
											break label328;
										}
									}
									local176--;
								}
								label317: while (local198 < local1138) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray1[local198 + 1][local146][local211] & local34) == 0) {
											break label317;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray2[local198][local146][local148] - 240;
									local227 = this.anIntArrayArrayArray2[local176][local146][local148];
									Class31.method340(local221, local152 * 128 + 128, local146 * 128, local227, local146 * 128, local1138, 1, local148 * 128);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray1[local243][local146][local291] &= ~local34;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1156][local146][local140] & local1134) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local1156;
								local198 = local1156;
								while (local148 > 0 && (this.anIntArrayArrayArray1[local1156][local148 - 1][local140] & local1134) != 0) {
									local148--;
								}
								while (local152 < this.anInt245 && (this.anIntArrayArrayArray1[local1156][local152 + 1][local140] & local1134) != 0) {
									local152++;
								}
								label381: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray1[local176 - 1][local211][local140] & local1134) == 0) {
											break label381;
										}
									}
									local176--;
								}
								label370: while (local198 < local1138) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray1[local198 + 1][local211][local140] & local1134) == 0) {
											break label370;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray2[local198][local148][local140] - 240;
									local227 = this.anIntArrayArrayArray2[local176][local148][local140];
									Class31.method340(local221, local140 * 128, local152 * 128 + 128, local227, local148 * 128, local1138, 2, local140 * 128);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray1[local243][local291][local140] &= ~local1134;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1156][local146][local140] & local1136) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local140;
								local198 = local140;
								while (local176 > 0 && (this.anIntArrayArrayArray1[local1156][local146][local176 - 1] & local1136) != 0) {
									local176--;
								}
								while (local198 < this.anInt246 && (this.anIntArrayArrayArray1[local1156][local146][local198 + 1] & local1136) != 0) {
									local198++;
								}
								label434: while (local148 > 0) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray1[local1156][local148 - 1][local211] & local1136) == 0) {
											break label434;
										}
									}
									local148--;
								}
								label423: while (local152 < this.anInt245) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray1[local1156][local152 + 1][local211] & local1136) == 0) {
											break label423;
										}
									}
									local152++;
								}
								if ((local152 + 1 - local148) * (local198 + 1 - local176) >= 4) {
									local211 = this.anIntArrayArrayArray2[local1156][local148][local176];
									Class31.method340(local211, local198 * 128 + 128, local152 * 128 + 128, local211, local148 * 128, local1138, 4, local176 * 128);
									for (local217 = local148; local217 <= local152; local217++) {
										for (local221 = local176; local221 <= local198; local221++) {
											this.anIntArrayArrayArray1[local1156][local217][local221] &= ~local1136;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("67196, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(IIIIB)V")
	public void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg0; local3++) {
				for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt245 && local3 >= 0 && local3 < this.anInt246) {
						this.aByteArrayArrayArray3[0][local7][local3] = 127;
						if (local7 == arg2 && local7 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 - 1][local3];
						}
						if (local7 == arg2 + arg3 && local7 < this.anInt245 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg0 && local3 < this.anInt246 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("14844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 51 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(BIII)V")
	public void method146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte13 == 8) {
				@Pc(12) int local12;
				for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
					for (local12 = 0; local12 < 8; local12++) {
						this.anIntArrayArrayArray2[arg2][arg1 + local8][arg0 + local12] = 0;
					}
				}
				if (arg1 > 0) {
					for (local12 = 1; local12 < 8; local12++) {
						this.anIntArrayArrayArray2[arg2][arg1][arg0 + local12] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 + local12];
					}
				}
				if (arg0 > 0) {
					for (local12 = 1; local12 < 8; local12++) {
						this.anIntArrayArrayArray2[arg2][arg1 + local12][arg0] = this.anIntArrayArrayArray2[arg2][arg1 + local12][arg0 - 1];
					}
				}
				if (arg1 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0] != 0) {
					this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0];
				} else if (arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1] != 0) {
					this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1][arg0 - 1];
				} else if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1] != 0) {
					this.anIntArrayArrayArray2[arg2][arg1][arg0] = this.anIntArrayArrayArray2[arg2][arg1 - 1][arg0 - 1];
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("79358, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(III[Lclient!BBOYCGQQ;[BZI)V")
	public void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(14) int local14;
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < 64; local10++) {
					for (local14 = 0; local14 < 64; local14++) {
						if (arg2 + local10 > 0 && arg2 + local10 < 103 && arg0 + local14 > 0 && arg0 + local14 < 103) {
							arg3[local6].anIntArrayArray1[arg2 + local10][arg0 + local14] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class3_Sub3_Sub4 local68 = new Class3_Sub3_Sub4((byte) -115, arg4);
			for (local14 = 0; local14 < 4; local14++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method136(arg5, arg1, local78 + arg0, local74 + arg2, 0, local14, local68, 345);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("69314, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(Lclient!QPWZYOZR;II[Lclient!BBOYCGQQ;I[B)V")
	public void method148(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class3_Sub3_Sub4 local7 = new Class3_Sub3_Sub4((byte) -115, arg4);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(23) int local23 = local7.method482();
				if (local23 == 0) {
					return;
				}
				local9 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local7.method482();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local7.method468();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					@Pc(71) int local71 = local52 + arg3;
					@Pc(75) int local75 = local46 + arg1;
					if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
						@Pc(87) int local87 = local56;
						if ((this.aByteArrayArrayArray6[1][local71][local75] & 0x2) == 2) {
							local87 = local56 - 1;
						}
						@Pc(102) Class4 local102 = null;
						if (local87 >= 0) {
							local102 = arg2[local87];
						}
						this.method141(local63, local56, local71, local102, local9, local75, arg0, local67);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("79665, " + arg0 + ", " + arg1 + ", " + -21446 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQBPDNOP", name = "a", descriptor = "(BIIIIII[BI[Lclient!BBOYCGQQ;)V")
	public void method149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4[] arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg7 + local7 > 0 && arg7 + local7 < 103) {
						arg8[arg3].anIntArrayArray1[arg4 + local3][arg7 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class3_Sub3_Sub4 local57 = new Class3_Sub3_Sub4((byte) -115, arg6);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg0 && local63 >= arg2 && local63 < arg2 + 8 && local67 >= arg1 && local67 < arg1 + 8) {
							this.method136(0, 0, arg7 + Class49.method542(arg5, local63 & 0x7, local67 & 0x7, anInt250), arg4 + Class49.method541(local67 & 0x7, arg5, local63 & 0x7), arg5, arg3, local57, 345);
						} else {
							this.method136(0, 0, -1, -1, 0, 0, local57, 345);
						}
					}
				}
			}
			if (this.aByte11 == -81) {
				;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("45224, " + -81 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
