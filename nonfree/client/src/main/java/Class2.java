import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AGPNOIRK")
public final class Class2 {

	@OriginalMember(owner = "client!AGPNOIRK", name = "f", descriptor = "I")
	public static int anInt4;

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "I")
	public static int anInt1 = 99;

	@OriginalMember(owner = "client!AGPNOIRK", name = "d", descriptor = "Z")
	private static boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AGPNOIRK", name = "e", descriptor = "[I")
	private static final int[] anIntArray1 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!AGPNOIRK", name = "k", descriptor = "[I")
	private static final int[] anIntArray2 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!AGPNOIRK", name = "m", descriptor = "Z")
	private static boolean aBoolean2 = true;

	@OriginalMember(owner = "client!AGPNOIRK", name = "n", descriptor = "I")
	private static int anInt7 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!AGPNOIRK", name = "o", descriptor = "[I")
	private static final int[] anIntArray3 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!AGPNOIRK", name = "p", descriptor = "Z")
	public static boolean aBoolean3 = true;

	@OriginalMember(owner = "client!AGPNOIRK", name = "q", descriptor = "[I")
	private static final int[] anIntArray4 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!AGPNOIRK", name = "B", descriptor = "I")
	private static int anInt8 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!AGPNOIRK", name = "j", descriptor = "I")
	private int anInt5 = 488;

	@OriginalMember(owner = "client!AGPNOIRK", name = "l", descriptor = "I")
	private int anInt6 = 33636;

	@OriginalMember(owner = "client!AGPNOIRK", name = "v", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AGPNOIRK", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!AGPNOIRK", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!AGPNOIRK", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!AGPNOIRK", name = "u", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!AGPNOIRK", name = "D", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!AGPNOIRK", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!AGPNOIRK", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!AGPNOIRK", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!AGPNOIRK", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!AGPNOIRK", name = "w", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!AGPNOIRK", name = "x", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!AGPNOIRK", name = "y", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!AGPNOIRK", name = "z", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!AGPNOIRK", name = "A", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(II)I")
	private static int method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method12(arg0 + 45365, arg1 + 91923, 4) + (method12(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method12(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIII)I")
	private static int method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class8_Sub1_Sub2_Sub1.anIntArray164[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "(II)I")
	private static int method7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "d", descriptor = "(II)I")
	private static int method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method7(arg0 - 1, arg1 - 1) + method7(arg0 + 1, arg1 - 1) + method7(arg0 - 1, arg1 + 1) + method7(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method7(arg0 - 1, arg1) + method7(arg0 + 1, arg1) + method7(arg0, arg1 - 1) + method7(arg0, arg1 + 1);
		@Pc(59) int local59 = method7(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "(III)I")
	private static int method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method11(local3, local13);
		@Pc(29) int local29 = method11(local3 + 1, local13);
		@Pc(35) int local35 = method11(local3, local13 + 1);
		@Pc(43) int local43 = method11(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method6(local23, local29, local9, arg2);
		@Pc(55) int local55 = method6(local35, local43, local9, arg2);
		return method6(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(Lclient!HJOZCGZH;Lclient!TQYMAXSO;I)V")
	public static void method14(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(11) int local11 = -1;
			while (true) {
				@Pc(14) int local14 = arg1.method420();
				if (local14 == 0) {
					return;
				}
				local11 += local14;
				@Pc(23) Class42 local23 = Class42.method512(local11);
				local23.method509(arg0);
				while (true) {
					@Pc(30) int local30 = arg1.method420();
					if (local30 == 0) {
						break;
					}
					arg1.method406();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("29947, " + arg0 + ", " + arg1 + ", " + -524 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IZI[B)Z")
	public static boolean method15(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class8_Sub1_Sub3 local9 = new Class8_Sub1_Sub3(arg2, -631);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method420();
				if (local20 == 0) {
					return local3;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method420();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method406() >> 2;
						@Pc(72) int local72 = local63 + arg0;
						@Pc(76) int local76 = local57 + arg1;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class42 local89 = Class42.method512(local17);
							if (local68 != 22 || !aBoolean3 || local89.aBoolean174 || local89.aBoolean170) {
								local3 &= local89.method511(aBoolean2);
								local30 = true;
							}
						}
					}
					local35 = local9.method420();
					if (local35 == 0) {
						break;
					}
					local9.method406();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("77718, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIILclient!UDXVXGJJ;IIILclient!MPMWDRAA;II[[[I)V")
	public static void method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class21 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][][] arg9) {
		try {
			@Pc(9) int local9 = arg9[arg5][arg0][arg6];
			@Pc(19) int local19 = arg9[arg5][arg0 + 1][arg6];
			@Pc(31) int local31 = arg9[arg5][arg0 + 1][arg6 + 1];
			@Pc(41) int local41 = arg9[arg5][arg0][arg6 + 1];
			@Pc(60) int local60 = local9 + local19 + local31 + local41 >> 2;
			@Pc(63) Class42 local63 = Class42.method512(arg2);
			@Pc(75) int local75 = arg0 + (arg6 << 7) + (arg2 << 14) + 1073741824;
			if (!local63.aBoolean174) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg4 << 6) + arg8);
			@Pc(109) Class8_Sub1_Sub1 local109;
			if (arg8 == 22) {
				if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
					local109 = local63.method513(22, arg4, local9, local19, local31, local41, -1);
				} else {
					local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, 22, local31, local63.anInt700, (byte) -108, local9);
				}
				arg7.method184(local109, arg6, arg1, local75, local60, local89, arg0);
				if (local63.aBoolean168 && local63.aBoolean174) {
					arg3.method456(arg6, arg0);
				}
			} else {
				@Pc(205) int local205;
				if (arg8 == 10 || arg8 == 11) {
					if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
						local109 = local63.method513(10, arg4, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, 10, local31, local63.anInt700, (byte) -108, local9);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg8 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg4 == 1 || arg4 == 3) {
							local205 = local63.anInt707;
							local208 = local63.anInt690;
						} else {
							local205 = local63.anInt690;
							local208 = local63.anInt707;
						}
						arg7.method188(arg6, local75, local205, local192, arg0, arg1, local89, local109, local208, local60);
					}
					if (local63.aBoolean168) {
						arg3.method455(arg6, local63.anInt707, arg4, local63.anInt690, local63.aBoolean176, arg0);
					}
				} else if (arg8 >= 12) {
					if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
						local109 = local63.method513(arg8, arg4, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, arg8, local31, local63.anInt700, (byte) -108, local9);
					}
					arg7.method188(arg6, local75, 1, 0, arg0, arg1, local89, local109, 1, local60);
					if (local63.aBoolean168) {
						arg3.method455(arg6, local63.anInt707, arg4, local63.anInt690, local63.aBoolean176, arg0);
					}
				} else if (arg8 == 0) {
					if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
						local109 = local63.method513(0, arg4, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, 0, local31, local63.anInt700, (byte) -108, local9);
					}
					arg7.method186(arg1, arg6, null, local89, anIntArray4[arg4], arg0, 0, local60, local75, local109);
					if (local63.aBoolean168) {
						arg3.method454(local63.aBoolean176, arg8, arg4, arg0, arg6);
					}
				} else if (arg8 == 1) {
					if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
						local109 = local63.method513(1, arg4, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, 1, local31, local63.anInt700, (byte) -108, local9);
					}
					arg7.method186(arg1, arg6, null, local89, anIntArray2[arg4], arg0, 0, local60, local75, local109);
					if (local63.aBoolean168) {
						arg3.method454(local63.aBoolean176, arg8, arg4, arg0, arg6);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class8_Sub1_Sub1 local480;
					if (arg8 == 2) {
						local451 = arg4 + 1 & 0x3;
						@Pc(470) Class8_Sub1_Sub1 local470;
						if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
							local470 = local63.method513(2, arg4 + 4, local9, local19, local31, local41, -1);
							local480 = local63.method513(2, local451, local9, local19, local31, local41, -1);
						} else {
							local470 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4 + 4, 2, local31, local63.anInt700, (byte) -108, local9);
							local480 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, local451, 2, local31, local63.anInt700, (byte) -108, local9);
						}
						arg7.method186(arg1, arg6, local480, local89, anIntArray4[arg4], arg0, anIntArray4[local451], local60, local75, local470);
						if (local63.aBoolean168) {
							arg3.method454(local63.aBoolean176, arg8, arg4, arg0, arg6);
						}
					} else if (arg8 == 3) {
						if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
							local109 = local63.method513(3, arg4, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, 3, local31, local63.anInt700, (byte) -108, local9);
						}
						arg7.method186(arg1, arg6, null, local89, anIntArray2[arg4], arg0, 0, local60, local75, local109);
						if (local63.aBoolean168) {
							arg3.method454(local63.aBoolean176, arg8, arg4, arg0, arg6);
						}
					} else if (arg8 == 9) {
						if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
							local109 = local63.method513(arg8, arg4, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, arg4, arg8, local31, local63.anInt700, (byte) -108, local9);
						}
						arg7.method188(arg6, local75, 1, 0, arg0, arg1, local89, local109, 1, local60);
						if (local63.aBoolean168) {
							arg3.method455(arg6, local63.anInt707, arg4, local63.anInt690, local63.aBoolean176, arg0);
						}
					} else {
						if (local63.aBoolean167) {
							if (arg4 == 1) {
								local451 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local451;
							} else if (arg4 == 2) {
								local451 = local41;
								local41 = local19;
								local19 = local451;
								local451 = local31;
								local31 = local9;
								local9 = local451;
							} else if (arg4 == 3) {
								local451 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local451;
							}
						}
						if (arg8 == 4) {
							if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
								local109 = local63.method513(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, 0, 4, local31, local63.anInt700, (byte) -108, local9);
							}
							arg7.method187(local60, local109, arg0, arg1, local89, anIntArray4[arg4], 0, local75, 0, arg4 * 512, arg6);
						} else if (arg8 == 5) {
							local451 = 16;
							local205 = arg7.method204(arg1, arg0, arg6);
							if (local205 > 0) {
								local451 = Class42.method512(local205 >> 14 & 0x7FFF).anInt691;
							}
							if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
								local480 = local63.method513(4, 0, local9, local19, local31, local41, -1);
							} else {
								local480 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, 0, 4, local31, local63.anInt700, (byte) -108, local9);
							}
							arg7.method187(local60, local480, arg0, arg1, local89, anIntArray4[arg4], anIntArray1[arg4] * local451, local75, anIntArray3[arg4] * local451, arg4 * 512, arg6);
						} else if (arg8 == 6) {
							if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
								local109 = local63.method513(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, 0, 4, local31, local63.anInt700, (byte) -108, local9);
							}
							arg7.method187(local60, local109, arg0, arg1, local89, 256, 0, local75, 0, arg4, arg6);
						} else if (arg8 == 7) {
							if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
								local109 = local63.method513(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, 0, 4, local31, local63.anInt700, (byte) -108, local9);
							}
							arg7.method187(local60, local109, arg0, arg1, local89, 512, 0, local75, 0, arg4, arg6);
						} else if (arg8 == 8) {
							if (local63.anInt700 == -1 && local63.anIntArray182 == null) {
								local109 = local63.method513(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class8_Sub1_Sub1_Sub5(local41, arg2, local19, true, 0, 4, local31, local63.anInt700, (byte) -108, local9);
							}
							arg7.method187(local60, local109, arg0, arg1, local89, 768, 0, local75, 0, arg4, arg6);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("93216, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + arg8 + ", " + arg9 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "(III)Z")
	public static boolean method18(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class42 local2 = Class42.method512(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method507(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("40592, " + arg0 + ", " + -41002 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "e", descriptor = "(II)I")
	private static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!AGPNOIRK", name = "<init>", descriptor = "([[[BI[[[IIZ)V")
	public Class2(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			anInt1 = 99;
			this.anInt2 = arg3;
			this.anInt3 = arg1;
			this.anIntArrayArrayArray2 = arg2;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt2][this.anInt3];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt2][this.anInt3];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt2][this.anInt3];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt2][this.anInt3];
			this.anIntArrayArrayArray1 = new int[4][this.anInt2 + 1][this.anInt3 + 1];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt2 + 1][this.anInt3 + 1];
			this.anIntArrayArray1 = new int[this.anInt2 + 1][this.anInt3 + 1];
			this.anIntArray5 = new int[this.anInt3];
			this.anIntArray6 = new int[this.anInt3];
			this.anIntArray7 = new int[this.anInt3];
			this.anIntArray8 = new int[this.anInt3];
			this.anIntArray9 = new int[this.anInt3];
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("77, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "(II)I")
	private int method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIZI)V")
	public void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(15) int local15;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				for (local15 = 0; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg1][arg0 + local11][arg2 + local15] = 0;
				}
			}
			if (arg0 > 0) {
				for (local15 = 1; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg1][arg0][arg2 + local15] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 + local15];
				}
			}
			if (arg2 > 0) {
				for (local15 = 1; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg1][arg0 + local15][arg2] = this.anIntArrayArrayArray2[arg1][arg0 + local15][arg2 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("10255, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(III)I")
	private int method5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIII)V")
	public void method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(14) int local14 = arg3; local14 <= arg3 + arg0; local14++) {
				for (@Pc(18) int local18 = arg2; local18 <= arg2 + arg1; local18++) {
					if (local18 >= 0 && local18 < this.anInt2 && local14 >= 0 && local14 < this.anInt3) {
						this.aByteArrayArrayArray4[0][local18][local14] = 127;
						if (local18 == arg2 && local18 > 0) {
							this.anIntArrayArrayArray2[0][local18][local14] = this.anIntArrayArrayArray2[0][local18 - 1][local14];
						}
						if (local18 == arg2 + arg1 && local18 < this.anInt2 - 1) {
							this.anIntArrayArrayArray2[0][local18][local14] = this.anIntArrayArrayArray2[0][local18 + 1][local14];
						}
						if (local14 == arg3 && local14 > 0) {
							this.anIntArrayArrayArray2[0][local18][local14] = this.anIntArrayArrayArray2[0][local18][local14 - 1];
						}
						if (local14 == arg3 + arg0 && local14 < this.anInt3 - 1) {
							this.anIntArrayArrayArray2[0][local18][local14] = this.anIntArrayArrayArray2[0][local18][local14 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("29705, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -523 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(Lclient!MPMWDRAA;[Lclient!UDXVXGJJ;I)V")
	public void method9(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class38[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method456(local11, local7);
							}
						}
					}
				}
			}
			anInt7 += (int) (Math.random() * 5.0D) - 2;
			if (arg2 < 1 || arg2 > 1) {
				this.anInt5 = 344;
			}
			if (anInt7 < -8) {
				anInt7 = -8;
			}
			if (anInt7 > 8) {
				anInt7 = 8;
			}
			anInt8 += (int) (Math.random() * 5.0D) - 2;
			if (anInt8 < -16) {
				anInt8 = -16;
			}
			if (anInt8 > 16) {
				anInt8 = 16;
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
				@Pc(117) byte[][] local117 = this.aByteArrayArrayArray4[local7];
				local142 = (int) Math.sqrt((double) 5100);
				local148 = local142 * 768 >> 8;
				for (local150 = 1; local150 < this.anInt3 - 1; local150++) {
					for (local154 = 1; local154 < this.anInt2 - 1; local154++) {
						local178 = this.anIntArrayArrayArray2[local7][local154 + 1][local150] - this.anIntArrayArrayArray2[local7][local154 - 1][local150];
						local200 = this.anIntArrayArrayArray2[local7][local154][local150 + 1] - this.anIntArrayArrayArray2[local7][local154][local150 - 1];
						local213 = (int) Math.sqrt((double) (local178 * local178 + local200 * local200 + 65536));
						local219 = (local178 << 8) / local213;
						local223 = 65536 / local213;
						local229 = (local200 << 8) / local213;
						local245 = (local219 * -50 + local223 * -10 + local229 * -50) / local148 + 96;
						local293 = (local117[local154 - 1][local150] >> 2) + (local117[local154 + 1][local150] >> 3) + (local117[local154][local150 - 1] >> 2) + (local117[local154][local150 + 1] >> 3) + (local117[local154][local150] >> 1);
						this.anIntArrayArray1[local154][local150] = local245 - local293;
					}
				}
				for (local154 = 0; local154 < this.anInt3; local154++) {
					this.anIntArray5[local154] = 0;
					this.anIntArray6[local154] = 0;
					this.anIntArray7[local154] = 0;
					this.anIntArray8[local154] = 0;
					this.anIntArray9[local154] = 0;
				}
				for (local178 = -5; local178 < this.anInt2 + 5; local178++) {
					for (local200 = 0; local200 < this.anInt3; local200++) {
						local213 = local178 + 5;
						@Pc(428) int local428;
						if (local213 >= 0 && local213 < this.anInt2) {
							local219 = this.aByteArrayArrayArray2[local7][local213][local200] & 0xFF;
							if (local219 > 0) {
								@Pc(387) Class17 local387 = Class17.aClass17Array1[local219 - 1];
								this.anIntArray5[local200] += local387.anInt276;
								this.anIntArray6[local200] += local387.anInt274;
								this.anIntArray7[local200] += local387.anInt275;
								this.anIntArray8[local200] += local387.anInt277;
								local428 = this.anIntArray9[local200]++;
							}
						}
						local219 = local178 - 5;
						if (local219 >= 0 && local219 < this.anInt2) {
							local223 = this.aByteArrayArrayArray2[local7][local219][local200] & 0xFF;
							if (local223 > 0) {
								@Pc(460) Class17 local460 = Class17.aClass17Array1[local223 - 1];
								this.anIntArray5[local200] -= local460.anInt276;
								this.anIntArray6[local200] -= local460.anInt274;
								this.anIntArray7[local200] -= local460.anInt275;
								this.anIntArray8[local200] -= local460.anInt277;
								local428 = this.anIntArray9[local200]--;
							}
						}
					}
					if (local178 >= 1 && local178 < this.anInt2 - 1) {
						local213 = 0;
						local219 = 0;
						local223 = 0;
						local229 = 0;
						local245 = 0;
						for (local293 = -5; local293 < this.anInt3 + 5; local293++) {
							@Pc(536) int local536 = local293 + 5;
							if (local536 >= 0 && local536 < this.anInt3) {
								local213 += this.anIntArray5[local536];
								local219 += this.anIntArray6[local536];
								local223 += this.anIntArray7[local536];
								local229 += this.anIntArray8[local536];
								local245 += this.anIntArray9[local536];
							}
							@Pc(581) int local581 = local293 - 5;
							if (local581 >= 0 && local581 < this.anInt3) {
								local213 -= this.anIntArray5[local581];
								local219 -= this.anIntArray6[local581];
								local223 -= this.anIntArray7[local581];
								local229 -= this.anIntArray8[local581];
								local245 -= this.anIntArray9[local581];
							}
							if (local293 >= 1 && local293 < this.anInt3 - 1 && (!aBoolean3 || (this.aByteArrayArrayArray1[0][local178][local293] & 0x2) != 0 || (this.aByteArrayArrayArray1[local7][local178][local293] & 0x10) == 0 && this.method17(local178, local7, local293) == anInt4)) {
								if (local7 < anInt1) {
									anInt1 = local7;
								}
								@Pc(680) int local680 = this.aByteArrayArrayArray2[local7][local178][local293] & 0xFF;
								@Pc(691) int local691 = this.aByteArrayArrayArray5[local7][local178][local293] & 0xFF;
								if (local680 > 0 || local691 > 0) {
									@Pc(704) int local704 = this.anIntArrayArrayArray2[local7][local178][local293];
									@Pc(715) int local715 = this.anIntArrayArrayArray2[local7][local178 + 1][local293];
									@Pc(728) int local728 = this.anIntArrayArrayArray2[local7][local178 + 1][local293 + 1];
									@Pc(739) int local739 = this.anIntArrayArrayArray2[local7][local178][local293 + 1];
									@Pc(746) int local746 = this.anIntArrayArray1[local178][local293];
									@Pc(755) int local755 = this.anIntArrayArray1[local178 + 1][local293];
									@Pc(766) int local766 = this.anIntArrayArray1[local178 + 1][local293 + 1];
									@Pc(775) int local775 = this.anIntArrayArray1[local178][local293 + 1];
									@Pc(777) int local777 = -1;
									@Pc(779) int local779 = -1;
									@Pc(787) int local787;
									@Pc(791) int local791;
									if (local680 > 0) {
										local787 = local213 * 256 / local229;
										local791 = local219 / local245;
										@Pc(795) int local795 = local223 / local245;
										local777 = this.method5(local787, local791, local795);
										@Pc(807) int local807 = local787 + anInt7 & 0xFF;
										local795 += anInt8;
										if (local795 < 0) {
											local795 = 0;
										} else if (local795 > 255) {
											local795 = 255;
										}
										local779 = this.method5(local807, local791, local795);
									}
									if (local7 > 0) {
										@Pc(832) boolean local832 = true;
										if (local680 == 0 && this.aByteArrayArrayArray6[local7][local178][local293] != 0) {
											local832 = false;
										}
										if (local691 > 0 && !Class17.aClass17Array1[local691 - 1].aBoolean61) {
											local832 = false;
										}
										if (local832 && local704 == local715 && local704 == local728 && local704 == local739) {
											this.anIntArrayArrayArray1[local7][local178][local293] |= 0x924;
										}
									}
									local787 = 0;
									if (local777 != -1) {
										local787 = Class8_Sub1_Sub2_Sub1.anIntArray168[method22(local779, 96)];
									}
									if (local691 == 0) {
										arg0.method183(local7, local178, local293, 0, 0, -1, local704, local715, local728, local739, method22(local777, local746), method22(local777, local755), method22(local777, local766), method22(local777, local775), 0, 0, 0, 0, local787, 0);
									} else {
										local791 = this.aByteArrayArrayArray6[local7][local178][local293] + 1;
										@Pc(944) byte local944 = this.aByteArrayArrayArray3[local7][local178][local293];
										@Pc(950) Class17 local950 = Class17.aClass17Array1[local691 - 1];
										@Pc(953) int local953 = local950.anInt272;
										@Pc(961) int local961;
										@Pc(959) int local959;
										if (local953 >= 0) {
											local959 = Class8_Sub1_Sub2_Sub1.method352(local953, (byte) 5);
											local961 = -1;
										} else if (local950.anInt271 == 16711935) {
											local961 = -2;
											local953 = -1;
											local959 = Class8_Sub1_Sub2_Sub1.anIntArray168[this.method3(local950.anInt278, 96)];
										} else {
											local961 = this.method5(local950.anInt273, local950.anInt274, local950.anInt275);
											local959 = Class8_Sub1_Sub2_Sub1.anIntArray168[this.method3(local950.anInt278, 96)];
										}
										arg0.method183(local7, local178, local293, local791, local944, local953, local704, local715, local728, local739, method22(local777, local746), method22(local777, local755), method22(local777, local766), method22(local777, local775), this.method3(local961, local746), this.method3(local961, local755), this.method3(local961, local766), this.method3(local961, local775), local787, local959);
									}
								}
							}
						}
					}
				}
				for (local200 = 1; local200 < this.anInt3 - 1; local200++) {
					for (local213 = 1; local213 < this.anInt2 - 1; local213++) {
						arg0.method182(local7, local213, local200, this.method17(local213, local7, local200));
					}
				}
			}
			arg0.method209(23);
			for (local11 = 0; local11 < this.anInt2; local11++) {
				for (local27 = 0; local27 < this.anInt3; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method180(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1136) int local1136 = 2;
			@Pc(1138) int local1138 = 4;
			for (@Pc(1140) int local1140 = 0; local1140 < 4; local1140++) {
				if (local1140 > 0) {
					local27 <<= 0x3;
					local1136 <<= 0x3;
					local1138 <<= 0x3;
				}
				for (@Pc(1158) int local1158 = 0; local1158 <= local1140; local1158++) {
					for (local142 = 0; local142 <= this.anInt3; local142++) {
						for (local148 = 0; local148 <= this.anInt2; local148++) {
							if ((this.anIntArrayArrayArray1[local1158][local148][local142] & local27) != 0) {
								local150 = local142;
								local154 = local142;
								local178 = local1158;
								local200 = local1158;
								while (local150 > 0 && (this.anIntArrayArrayArray1[local1158][local148][local150 - 1] & local27) != 0) {
									local150--;
								}
								while (local154 < this.anInt3 && (this.anIntArrayArrayArray1[local1158][local148][local154 + 1] & local27) != 0) {
									local154++;
								}
								label331: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local178 - 1][local148][local213] & local27) == 0) {
											break label331;
										}
									}
									local178--;
								}
								label320: while (local200 < local1140) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local200 + 1][local148][local213] & local27) == 0) {
											break label320;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray2[local200][local148][local150] - 240;
									local229 = this.anIntArrayArrayArray2[local178][local148][local150];
									Class21.method181(local150 * 128, local154 * 128 + 128, local148 * 128, 1, local229, local1140, (byte) 6, local148 * 128, local223);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray1[local245][local148][local293] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1158][local148][local142] & local1136) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local1158;
								local200 = local1158;
								while (local150 > 0 && (this.anIntArrayArrayArray1[local1158][local150 - 1][local142] & local1136) != 0) {
									local150--;
								}
								while (local154 < this.anInt2 && (this.anIntArrayArrayArray1[local1158][local154 + 1][local142] & local1136) != 0) {
									local154++;
								}
								label384: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local178 - 1][local213][local142] & local1136) == 0) {
											break label384;
										}
									}
									local178--;
								}
								label373: while (local200 < local1140) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray1[local200 + 1][local213][local142] & local1136) == 0) {
											break label373;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray2[local200][local150][local142] - 240;
									local229 = this.anIntArrayArrayArray2[local178][local150][local142];
									Class21.method181(local142 * 128, local142 * 128, local150 * 128, 2, local229, local1140, (byte) 6, local154 * 128 + 128, local223);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray1[local245][local293][local142] &= ~local1136;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1158][local148][local142] & local1138) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local142;
								local200 = local142;
								while (local178 > 0 && (this.anIntArrayArrayArray1[local1158][local148][local178 - 1] & local1138) != 0) {
									local178--;
								}
								while (local200 < this.anInt3 && (this.anIntArrayArrayArray1[local1158][local148][local200 + 1] & local1138) != 0) {
									local200++;
								}
								label437: while (local150 > 0) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray1[local1158][local150 - 1][local213] & local1138) == 0) {
											break label437;
										}
									}
									local150--;
								}
								label426: while (local154 < this.anInt2) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray1[local1158][local154 + 1][local213] & local1138) == 0) {
											break label426;
										}
									}
									local154++;
								}
								if ((local154 + 1 - local150) * (local200 + 1 - local178) >= 4) {
									local213 = this.anIntArrayArrayArray2[local1158][local150][local178];
									Class21.method181(local178 * 128, local200 * 128 + 128, local150 * 128, 4, local213, local1140, (byte) 6, local154 * 128 + 128, local213);
									for (local219 = local150; local219 <= local154; local219++) {
										for (local223 = local178; local223 <= local200; local223++) {
											this.anIntArrayArrayArray1[local1158][local219][local223] &= ~local1138;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1773) RuntimeException local1773) {
			signlink.reporterror("37390, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1773.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIIILclient!TQYMAXSO;II)V")
	private void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(26) int local26;
			if (arg6 >= 0 && arg6 < 104 && arg0 >= 0 && arg0 < 104) {
				this.aByteArrayArrayArray1[arg2][arg6][arg0] = 0;
				while (true) {
					local26 = arg4.method406();
					if (local26 == 0) {
						if (arg2 == 0) {
							this.anIntArrayArrayArray2[0][arg6][arg0] = -method2(arg6 + arg5 + 932731, arg0 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg2][arg6][arg0] = this.anIntArrayArrayArray2[arg2 - 1][arg6][arg0] - 240;
							return;
						}
					}
					if (local26 == 1) {
						@Pc(80) int local80 = arg4.method406();
						if (local80 == 1) {
							local80 = 0;
						}
						if (arg2 == 0) {
							this.anIntArrayArrayArray2[0][arg6][arg0] = -local80 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg2][arg6][arg0] = this.anIntArrayArrayArray2[arg2 - 1][arg6][arg0] - local80 * 8;
						return;
					}
					if (local26 <= 49) {
						this.aByteArrayArrayArray5[arg2][arg6][arg0] = arg4.method407();
						this.aByteArrayArrayArray6[arg2][arg6][arg0] = (byte) ((local26 - 2) / 4);
						this.aByteArrayArrayArray3[arg2][arg6][arg0] = (byte) (local26 + arg3 - 2 & 0x3);
					} else if (local26 <= 81) {
						this.aByteArrayArrayArray1[arg2][arg6][arg0] = (byte) (local26 - 49);
					} else {
						this.aByteArrayArrayArray2[arg2][arg6][arg0] = (byte) (local26 - 81);
					}
				}
			} else {
				while (true) {
					local26 = arg4.method406();
					if (local26 == 0) {
						return;
					}
					if (local26 == 1) {
						arg4.method406();
						return;
					}
					if (local26 <= 49) {
						arg4.method406();
					}
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("58096, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(III[BIIILclient!MPMWDRAA;I[Lclient!UDXVXGJJ;I)V")
	public void method13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class21 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class38[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg3, -631);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(20) int local20 = local7.method420();
				if (local20 == 0) {
					return;
				}
				local9 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method420();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method406();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					if (local53 == arg5 && local49 >= arg9 && local49 < arg9 + 8 && local43 >= arg4 && local43 < arg4 + 8) {
						@Pc(86) Class42 local86 = Class42.method512(local9);
						@Pc(103) int local103 = arg2 + Class26.method265(local49 & 0x7, local86.anInt707, local43 & 0x7, local64, arg0, local86.anInt690);
						@Pc(120) int local120 = arg7 + Class26.method266(local86.anInt707, arg0, local49 & 0x7, local86.anInt690, local64, local43 & 0x7);
						if (local103 > 0 && local120 > 0 && local103 < 103 && local120 < 103) {
							@Pc(132) int local132 = arg1;
							if ((this.aByteArrayArrayArray1[1][local103][local120] & 0x2) == 2) {
								local132 = arg1 - 1;
							}
							@Pc(147) Class38 local147 = null;
							if (local132 >= 0) {
								local147 = arg8[local132];
							}
							this.method20(local147, local103, arg1, local9, local120, arg6, local60, local64 + arg0 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("83403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIB)I")
	private int method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("77522, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 78 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "([BIZIIIII[Lclient!UDXVXGJJ;I)V")
	public void method19(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class38[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg7[arg3].anIntArrayArray20[arg4 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class8_Sub1_Sub3 local57 = new Class8_Sub1_Sub3(arg0, -631);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg5 && local63 >= arg6 && local63 < arg6 + 8 && local67 >= arg2 && local67 < arg2 + 8) {
							this.method10(arg1 + Class26.method264(local63 & 0x7, arg8, local67 & 0x7), 0, arg3, arg8, local57, 0, arg4 + Class26.method263(local63 & 0x7, 242, arg8, local67 & 0x7));
						} else {
							this.method10(-1, 0, 0, 0, local57, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("22892, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(ILclient!UDXVXGJJ;IIIILclient!MPMWDRAA;II)V")
	private void method20(@OriginalArg(1) Class38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class21 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean3 && (this.aByteArrayArrayArray1[0][arg1][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray1[arg2][arg1][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method17(arg1, arg2, arg4) != anInt4) {
					return;
				}
			}
			if (arg2 < anInt1) {
				anInt1 = arg2;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg2][arg1][arg4];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg2][arg1 + 1][arg4];
			@Pc(73) int local73 = this.anIntArrayArrayArray2[arg2][arg1 + 1][arg4 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray2[arg2][arg1][arg4 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class42 local97 = Class42.method512(arg3);
			@Pc(119) int local119 = arg1 + (arg4 << 7) + (arg3 << 14) + 1073741824;
			if (!local97.aBoolean174) {
				local119 += Integer.MIN_VALUE;
			}
			@Pc(133) byte local133 = (byte) ((arg7 << 6) + arg6);
			@Pc(162) Class8_Sub1_Sub1 local162;
			if (arg6 != 22) {
				@Pc(260) int local260;
				if (arg6 == 10 || arg6 == 11) {
					if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
						local162 = local97.method513(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, 10, local73, local97.anInt700, (byte) -108, local49);
					}
					if (local162 != null) {
						@Pc(247) int local247 = 0;
						if (arg6 == 11) {
							local247 += 256;
						}
						@Pc(263) int local263;
						if (arg7 == 1 || arg7 == 3) {
							local260 = local97.anInt707;
							local263 = local97.anInt690;
						} else {
							local260 = local97.anInt690;
							local263 = local97.anInt707;
						}
						if (arg5.method188(arg4, local119, local260, local247, arg1, arg2, local133, local162, local263, local94) && local97.aBoolean173) {
							@Pc(294) Class8_Sub1_Sub1_Sub3 local294;
							if (local162 instanceof Class8_Sub1_Sub1_Sub3) {
								local294 = (Class8_Sub1_Sub1_Sub3) local162;
							} else {
								local294 = local97.method513(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local294 != null) {
								for (@Pc(310) int local310 = 0; local310 <= local260; local310++) {
									for (@Pc(314) int local314 = 0; local314 <= local263; local314++) {
										@Pc(321) int local321 = local294.anInt292 / 4;
										if (local321 > 30) {
											local321 = 30;
										}
										if (local321 > this.aByteArrayArrayArray4[arg2][arg1 + local310][arg4 + local314]) {
											this.aByteArrayArrayArray4[arg2][arg1 + local310][arg4 + local314] = (byte) local321;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean168 && arg0 != null) {
						arg0.method455(arg4, local97.anInt707, arg7, local97.anInt690, local97.aBoolean176, arg1);
					}
				} else if (arg6 >= 12) {
					if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
						local162 = local97.method513(arg6, arg7, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, arg6, local73, local97.anInt700, (byte) -108, local49);
					}
					arg5.method188(arg4, local119, 1, 0, arg1, arg2, local133, local162, 1, local94);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x924;
					}
					if (local97.aBoolean168 && arg0 != null) {
						arg0.method455(arg4, local97.anInt707, arg7, local97.anInt690, local97.aBoolean176, arg1);
					}
				} else if (arg6 == 0) {
					if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
						local162 = local97.method513(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, 0, local73, local97.anInt700, (byte) -108, local49);
					}
					arg5.method186(arg2, arg4, null, local133, anIntArray4[arg7], arg1, 0, local94, local119, local162);
					if (arg7 == 0) {
						if (local97.aBoolean173) {
							this.aByteArrayArrayArray4[arg2][arg1][arg4] = 50;
							this.aByteArrayArrayArray4[arg2][arg1][arg4 + 1] = 50;
						}
						if (local97.aBoolean171) {
							this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local97.aBoolean173) {
							this.aByteArrayArrayArray4[arg2][arg1][arg4 + 1] = 50;
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean171) {
							this.anIntArrayArrayArray1[arg2][arg1][arg4 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local97.aBoolean173) {
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4] = 50;
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean171) {
							this.anIntArrayArrayArray1[arg2][arg1 + 1][arg4] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local97.aBoolean173) {
							this.aByteArrayArrayArray4[arg2][arg1][arg4] = 50;
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4] = 50;
						}
						if (local97.aBoolean171) {
							this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x492;
						}
					}
					if (local97.aBoolean168 && arg0 != null) {
						arg0.method454(local97.aBoolean176, arg6, arg7, arg1, arg4);
					}
					if (local97.anInt691 != 16) {
						arg5.method194(arg1, local97.anInt691, arg4, arg2);
					}
				} else if (arg6 == 1) {
					if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
						local162 = local97.method513(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, 1, local73, local97.anInt700, (byte) -108, local49);
					}
					arg5.method186(arg2, arg4, null, local133, anIntArray2[arg7], arg1, 0, local94, local119, local162);
					if (local97.aBoolean173) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray4[arg2][arg1][arg4 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray4[arg2][arg1][arg4] = 50;
						}
					}
					if (local97.aBoolean168 && arg0 != null) {
						arg0.method454(local97.aBoolean176, arg6, arg7, arg1, arg4);
					}
				} else {
					@Pc(871) int local871;
					@Pc(900) Class8_Sub1_Sub1 local900;
					if (arg6 == 2) {
						local871 = arg7 + 1 & 0x3;
						@Pc(890) Class8_Sub1_Sub1 local890;
						if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
							local890 = local97.method513(2, arg7 + 4, local49, local60, local73, local84, -1);
							local900 = local97.method513(2, local871, local49, local60, local73, local84, -1);
						} else {
							local890 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7 + 4, 2, local73, local97.anInt700, (byte) -108, local49);
							local900 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, local871, 2, local73, local97.anInt700, (byte) -108, local49);
						}
						arg5.method186(arg2, arg4, local900, local133, anIntArray4[arg7], arg1, anIntArray4[local871], local94, local119, local890);
						if (local97.aBoolean171) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x249;
								this.anIntArrayArrayArray1[arg2][arg1][arg4 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray1[arg2][arg1][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg2][arg1 + 1][arg4] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray1[arg2][arg1 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x492;
								this.anIntArrayArrayArray1[arg2][arg1][arg4] |= 0x249;
							}
						}
						if (local97.aBoolean168 && arg0 != null) {
							arg0.method454(local97.aBoolean176, arg6, arg7, arg1, arg4);
						}
						if (local97.anInt691 != 16) {
							arg5.method194(arg1, local97.anInt691, arg4, arg2);
						}
					} else if (arg6 == 3) {
						if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
							local162 = local97.method513(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, 3, local73, local97.anInt700, (byte) -108, local49);
						}
						arg5.method186(arg2, arg4, null, local133, anIntArray2[arg7], arg1, 0, local94, local119, local162);
						if (local97.aBoolean173) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray4[arg2][arg1][arg4 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray4[arg2][arg1 + 1][arg4] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray4[arg2][arg1][arg4] = 50;
							}
						}
						if (local97.aBoolean168 && arg0 != null) {
							arg0.method454(local97.aBoolean176, arg6, arg7, arg1, arg4);
						}
					} else if (arg6 == 9) {
						if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
							local162 = local97.method513(arg6, arg7, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, arg6, local73, local97.anInt700, (byte) -108, local49);
						}
						arg5.method188(arg4, local119, 1, 0, arg1, arg2, local133, local162, 1, local94);
						if (local97.aBoolean168 && arg0 != null) {
							arg0.method455(arg4, local97.anInt707, arg7, local97.anInt690, local97.aBoolean176, arg1);
						}
					} else {
						if (local97.aBoolean167) {
							if (arg7 == 1) {
								local871 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local871;
							} else if (arg7 == 2) {
								local871 = local84;
								local84 = local60;
								local60 = local871;
								local871 = local73;
								local73 = local49;
								local49 = local871;
							} else if (arg7 == 3) {
								local871 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local871;
							}
						}
						if (arg6 == 4) {
							if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
								local162 = local97.method513(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, 0, 4, local73, local97.anInt700, (byte) -108, local49);
							}
							arg5.method187(local94, local162, arg1, arg2, local133, anIntArray4[arg7], 0, local119, 0, arg7 * 512, arg4);
						} else if (arg6 == 5) {
							local871 = 16;
							local260 = arg5.method204(arg2, arg1, arg4);
							if (local260 > 0) {
								local871 = Class42.method512(local260 >> 14 & 0x7FFF).anInt691;
							}
							if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
								local900 = local97.method513(4, 0, local49, local60, local73, local84, -1);
							} else {
								local900 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, 0, 4, local73, local97.anInt700, (byte) -108, local49);
							}
							arg5.method187(local94, local900, arg1, arg2, local133, anIntArray4[arg7], anIntArray1[arg7] * local871, local119, anIntArray3[arg7] * local871, arg7 * 512, arg4);
						} else if (arg6 == 6) {
							if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
								local162 = local97.method513(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, 0, 4, local73, local97.anInt700, (byte) -108, local49);
							}
							arg5.method187(local94, local162, arg1, arg2, local133, 256, 0, local119, 0, arg7, arg4);
						} else if (arg6 == 7) {
							if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
								local162 = local97.method513(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, 0, 4, local73, local97.anInt700, (byte) -108, local49);
							}
							arg5.method187(local94, local162, arg1, arg2, local133, 512, 0, local119, 0, arg7, arg4);
						} else if (arg6 == 8) {
							if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
								local162 = local97.method513(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, 0, 4, local73, local97.anInt700, (byte) -108, local49);
							}
							arg5.method187(local94, local162, arg1, arg2, local133, 768, 0, local119, 0, arg7, arg4);
						}
					}
				}
			} else if (!aBoolean3 || local97.aBoolean174 || local97.aBoolean170) {
				if (local97.anInt700 == -1 && local97.anIntArray182 == null) {
					local162 = local97.method513(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local162 = new Class8_Sub1_Sub1_Sub5(local84, arg3, local60, true, arg7, 22, local73, local97.anInt700, (byte) -108, local49);
				}
				arg5.method184(local162, arg4, arg2, local119, local94, local133, arg1);
				if (local97.aBoolean168 && local97.aBoolean174 && arg0 != null) {
					arg0.method456(arg4, arg1);
				}
			}
		} catch (@Pc(1645) RuntimeException local1645) {
			signlink.reporterror("49056, " + 40895 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1645.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IILclient!MPMWDRAA;[Lclient!UDXVXGJJ;I[B)V")
	public void method21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class38[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg5, -631);
			@Pc(9) int local9 = -1;
			@Pc(13) boolean local13 = false;
			while (true) {
				@Pc(16) int local16 = local7.method420();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method420();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method406();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg0;
					@Pc(68) int local68 = local39 + arg4;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray1[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class38 local95 = null;
						if (local80 >= 0) {
							local95 = arg3[local80];
						}
						this.method20(local95, local64, local49, local9, local68, arg2, local56, local60);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("52856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(I[Lclient!UDXVXGJJ;I[BIII)V")
	public void method23(@OriginalArg(0) int arg0, @OriginalArg(1) Class38[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg0 + local7 > 0 && arg0 + local7 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
							arg1[local3].anIntArrayArray20[arg0 + local7][arg5 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class8_Sub1_Sub3 local65 = new Class8_Sub1_Sub3(arg3, -631);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method10(local75 + arg5, arg4, local11, 0, local65, arg2, local71 + arg0);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("74125, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 9 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}
}
