import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XTTZZRNP")
public final class Class46 {

	@OriginalMember(owner = "client!XTTZZRNP", name = "i", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!XTTZZRNP", name = "d", descriptor = "I")
	private static int anInt696 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!XTTZZRNP", name = "e", descriptor = "Z")
	public static boolean aBoolean163 = true;

	@OriginalMember(owner = "client!XTTZZRNP", name = "g", descriptor = "[I")
	private static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!XTTZZRNP", name = "h", descriptor = "[I")
	private static final int[] anIntArray172 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!XTTZZRNP", name = "m", descriptor = "[I")
	private static final int[] anIntArray173 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!XTTZZRNP", name = "s", descriptor = "I")
	public static int anInt698 = 99;

	@OriginalMember(owner = "client!XTTZZRNP", name = "v", descriptor = "B")
	private static byte aByte35 = 44;

	@OriginalMember(owner = "client!XTTZZRNP", name = "w", descriptor = "[I")
	private static final int[] anIntArray179 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!XTTZZRNP", name = "y", descriptor = "I")
	private static int anInt701 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!XTTZZRNP", name = "l", descriptor = "B")
	private byte aByte34 = 82;

	@OriginalMember(owner = "client!XTTZZRNP", name = "z", descriptor = "I")
	private int anInt702 = 1;

	@OriginalMember(owner = "client!XTTZZRNP", name = "C", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!XTTZZRNP", name = "t", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!XTTZZRNP", name = "u", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!XTTZZRNP", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!XTTZZRNP", name = "B", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!XTTZZRNP", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!XTTZZRNP", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!XTTZZRNP", name = "x", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!XTTZZRNP", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!XTTZZRNP", name = "n", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!XTTZZRNP", name = "o", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!XTTZZRNP", name = "p", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!XTTZZRNP", name = "q", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!XTTZZRNP", name = "r", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIIIIILclient!EKHWFCYP;Lclient!HFSXIPFN;[[[II)V")
	public static void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10 arg6, @OriginalArg(8) Class16 arg7, @OriginalArg(9) int[][][] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg8[arg1][arg0][arg9];
			@Pc(19) int local19 = arg8[arg1][arg0 + 1][arg9];
			@Pc(36) int local36 = arg8[arg1][arg0 + 1][arg9 + 1];
			@Pc(46) int local46 = arg8[arg1][arg0][arg9 + 1];
			@Pc(56) int local56 = local9 + local19 + local36 + local46 >> 2;
			@Pc(59) Class27 local59 = Class27.method282(arg3);
			@Pc(71) int local71 = arg0 + (arg9 << 7) + (arg3 << 14) + 1073741824;
			if (!local59.aBoolean88) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg4 << 6) + arg5);
			@Pc(105) Class1_Sub2_Sub2 local105;
			if (arg5 == 22) {
				if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
					local105 = local59.method284(22, arg4, local9, local19, local36, local46, -1);
				} else {
					local105 = new Class1_Sub2_Sub2_Sub6(22, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
				}
				arg7.method133(arg0, local56, local71, arg2, local85, local105, aByte35, arg9);
				if (local59.aBoolean93 && local59.aBoolean88) {
					arg6.method106(arg9, arg0);
				}
			} else {
				@Pc(201) int local201;
				if (arg5 == 10 || arg5 == 11) {
					if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
						local105 = local59.method284(10, arg4, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub2_Sub2_Sub6(10, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg5 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg4 == 1 || arg4 == 3) {
							local201 = local59.anInt450;
							local204 = local59.anInt447;
						} else {
							local201 = local59.anInt447;
							local204 = local59.anInt450;
						}
						arg7.method137(arg9, local201, local71, arg2, local85, local204, local105, local188, arg0, local56);
					}
					if (local59.aBoolean93) {
						arg6.method105(arg0, local59.anInt447, local59.anInt450, arg9, local59.aBoolean84, arg4);
					}
				} else if (arg5 >= 12) {
					if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
						local105 = local59.method284(arg5, arg4, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub2_Sub2_Sub6(arg5, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
					}
					arg7.method137(arg9, 1, local71, arg2, local85, 1, local105, 0, arg0, local56);
					if (local59.aBoolean93) {
						arg6.method105(arg0, local59.anInt447, local59.anInt450, arg9, local59.aBoolean84, arg4);
					}
				} else if (arg5 == 0) {
					if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
						local105 = local59.method284(0, arg4, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub2_Sub2_Sub6(0, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
					}
					arg7.method135(local85, local71, local56, anIntArray171[arg4], 0, arg2, arg9, local105, arg0, null);
					if (local59.aBoolean93) {
						arg6.method104(arg0, arg5, local59.aBoolean84, arg9, arg4);
					}
				} else if (arg5 == 1) {
					if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
						local105 = local59.method284(1, arg4, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub2_Sub2_Sub6(1, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
					}
					arg7.method135(local85, local71, local56, anIntArray173[arg4], 0, arg2, arg9, local105, arg0, null);
					if (local59.aBoolean93) {
						arg6.method104(arg0, arg5, local59.aBoolean84, arg9, arg4);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class1_Sub2_Sub2 local476;
					if (arg5 == 2) {
						local447 = arg4 + 1 & 0x3;
						@Pc(466) Class1_Sub2_Sub2 local466;
						if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
							local466 = local59.method284(2, arg4 + 4, local9, local19, local36, local46, -1);
							local476 = local59.method284(2, local447, local9, local19, local36, local46, -1);
						} else {
							local466 = new Class1_Sub2_Sub2_Sub6(2, local19, local59.anInt463, arg4 + 4, (byte) 116, local9, local36, arg3, local46, true);
							local476 = new Class1_Sub2_Sub2_Sub6(2, local19, local59.anInt463, local447, (byte) 116, local9, local36, arg3, local46, true);
						}
						arg7.method135(local85, local71, local56, anIntArray171[arg4], anIntArray171[local447], arg2, arg9, local466, arg0, local476);
						if (local59.aBoolean93) {
							arg6.method104(arg0, arg5, local59.aBoolean84, arg9, arg4);
						}
					} else if (arg5 == 3) {
						if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
							local105 = local59.method284(3, arg4, local9, local19, local36, local46, -1);
						} else {
							local105 = new Class1_Sub2_Sub2_Sub6(3, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
						}
						arg7.method135(local85, local71, local56, anIntArray173[arg4], 0, arg2, arg9, local105, arg0, null);
						if (local59.aBoolean93) {
							arg6.method104(arg0, arg5, local59.aBoolean84, arg9, arg4);
						}
					} else if (arg5 == 9) {
						if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
							local105 = local59.method284(arg5, arg4, local9, local19, local36, local46, -1);
						} else {
							local105 = new Class1_Sub2_Sub2_Sub6(arg5, local19, local59.anInt463, arg4, (byte) 116, local9, local36, arg3, local46, true);
						}
						arg7.method137(arg9, 1, local71, arg2, local85, 1, local105, 0, arg0, local56);
						if (local59.aBoolean93) {
							arg6.method105(arg0, local59.anInt447, local59.anInt450, arg9, local59.aBoolean84, arg4);
						}
					} else {
						if (local59.aBoolean90) {
							if (arg4 == 1) {
								local447 = local46;
								local46 = local36;
								local36 = local19;
								local19 = local9;
								local9 = local447;
							} else if (arg4 == 2) {
								local447 = local46;
								local46 = local19;
								local19 = local447;
								local447 = local36;
								local36 = local9;
								local9 = local447;
							} else if (arg4 == 3) {
								local447 = local46;
								local46 = local9;
								local9 = local19;
								local19 = local36;
								local36 = local447;
							}
						}
						if (arg5 == 4) {
							if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
								local105 = local59.method284(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub2_Sub2_Sub6(4, local19, local59.anInt463, 0, (byte) 116, local9, local36, arg3, local46, true);
							}
							arg7.method136(arg4 * 512, local56, local71, local85, anIntArray171[arg4], arg9, arg0, arg2, 0, 0, (byte) 6, local105);
						} else if (arg5 == 5) {
							local447 = 16;
							local201 = arg7.method153(arg2, arg0, arg9);
							if (local201 > 0) {
								local447 = Class27.method282(local201 >> 14 & 0x7FFF).anInt454;
							}
							if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
								local476 = local59.method284(4, 0, local9, local19, local36, local46, -1);
							} else {
								local476 = new Class1_Sub2_Sub2_Sub6(4, local19, local59.anInt463, 0, (byte) 116, local9, local36, arg3, local46, true);
							}
							arg7.method136(arg4 * 512, local56, local71, local85, anIntArray171[arg4], arg9, arg0, arg2, anIntArray172[arg4] * local447, anIntArray179[arg4] * local447, (byte) 6, local476);
						} else if (arg5 == 6) {
							if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
								local105 = local59.method284(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub2_Sub2_Sub6(4, local19, local59.anInt463, 0, (byte) 116, local9, local36, arg3, local46, true);
							}
							arg7.method136(arg4, local56, local71, local85, 256, arg9, arg0, arg2, 0, 0, (byte) 6, local105);
						} else if (arg5 == 7) {
							if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
								local105 = local59.method284(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub2_Sub2_Sub6(4, local19, local59.anInt463, 0, (byte) 116, local9, local36, arg3, local46, true);
							}
							arg7.method136(arg4, local56, local71, local85, 512, arg9, arg0, arg2, 0, 0, (byte) 6, local105);
						} else if (arg5 == 8) {
							if (local59.anInt463 == -1 && local59.anIntArray105 == null) {
								local105 = local59.method284(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub2_Sub2_Sub6(4, local19, local59.anInt463, 0, (byte) 116, local9, local36, arg3, local46, true);
							}
							arg7.method136(arg4, local56, local71, local85, 768, arg9, arg0, arg2, 0, 0, (byte) 6, local105);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("99890, " + arg0 + ", " + arg1 + ", " + -84 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[BII)Z")
	public static boolean method514(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(17) Class1_Sub2_Sub3 local17 = new Class1_Sub2_Sub3(arg1, -670);
			@Pc(19) int local19 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local17.method321();
				if (local22 == 0) {
					return local3;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local17.method321();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local17.method307() >> 2;
						@Pc(74) int local74 = local65 + arg2;
						@Pc(78) int local78 = local59 + arg0;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class27 local91 = Class27.method282(local19);
							if (local70 != 22 || !aBoolean163 || local91.aBoolean88 || local91.aBoolean92) {
								local3 &= local91.method286(545);
								local32 = true;
							}
						}
					}
					local37 = local17.method321();
					if (local37 == 0) {
						break;
					}
					local17.method307();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("13259, " + arg0 + ", " + arg1 + ", " + -479 + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II)I")
	private static int method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(III)Z")
	public static boolean method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class27 local2 = Class27.method282(arg0);
			@Pc(6) boolean local6 = false;
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method291(arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("16154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(III)I")
	private static int method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method520(local3, local13);
		@Pc(29) int local29 = method520(local3 + 1, local13);
		@Pc(35) int local35 = method520(local3, local13 + 1);
		@Pc(43) int local43 = method520(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method522(local23, local29, local9, arg2);
		@Pc(55) int local55 = method522(local35, local43, local9, arg2);
		return method522(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "(II)I")
	private static int method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method525(arg0 - 1, arg1 - 1) + method525(arg0 + 1, arg1 - 1) + method525(arg0 - 1, arg1 + 1) + method525(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method525(arg0 - 1, arg1) + method525(arg0 + 1, arg1) + method525(arg0, arg1 - 1) + method525(arg0, arg1 + 1);
		@Pc(59) int local59 = method525(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIII)I")
	private static int method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub2_Sub1_Sub3.anIntArray146[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(Lclient!MNKDCXXG;ILclient!UWINSVPX;)V")
	public static void method523(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method321();
				if (local9 == 0) {
					return;
				}
				local3 += local9;
				@Pc(18) Class27 local18 = Class27.method282(local3);
				local18.method285(arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method321();
					if (local25 == 0) {
						break;
					}
					arg0.method307();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("67447, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "d", descriptor = "(II)I")
	private static int method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "e", descriptor = "(II)I")
	private static int method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method519(arg0 + 45365, arg1 + 91923, 4) + (method519(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method519(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "<init>", descriptor = "([[[II[[[BIZ)V")
	public Class46(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			anInt698 = 99;
			this.anInt699 = arg3;
			this.anInt700 = arg1;
			this.anIntArrayArrayArray5 = arg0;
			this.aByteArrayArrayArray4 = arg2;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt699][this.anInt700];
			this.anIntArrayArrayArray6 = new int[4][this.anInt699 + 1][this.anInt700 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt699 + 1][this.anInt700 + 1];
			this.anIntArrayArray19 = new int[this.anInt699 + 1][this.anInt700 + 1];
			this.anIntArray174 = new int[this.anInt700];
			this.anIntArray175 = new int[this.anInt700];
			this.anIntArray176 = new int[this.anInt700];
			this.anIntArray177 = new int[this.anInt700];
			this.anIntArray178 = new int[this.anInt700];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("29898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIB)I")
	private int method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray4[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("17599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIII)V")
	public void method507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg1; local3++) {
				for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt699 && local3 >= 0 && local3 < this.anInt700) {
						this.aByteArrayArrayArray5[0][local7][local3] = 127;
						if (local7 == arg2 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 - 1][local3];
						}
						if (local7 == arg2 + arg3 && local7 < this.anInt699 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 - 1];
						}
						if (local3 == arg0 + arg1 && local3 < this.anInt700 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("52738, " + arg0 + ", " + 33376 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[BZLclient!HFSXIPFN;[Lclient!EKHWFCYP;I)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class10[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) Class1_Sub2_Sub3 local17 = new Class1_Sub2_Sub3(arg1, -670);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method321();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method321();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method307();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray4[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class10 local101 = null;
						if (local86 >= 0) {
							local101 = arg3[local86];
						}
						this.method513(local19, local62, local74, local101, local70, local66, arg2, local55);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("26296, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II[B[Lclient!EKHWFCYP;III)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class10[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 < 1 || arg4 > 1) {
				this.aBoolean164 = !this.aBoolean164;
			}
			@Pc(25) int local25;
			for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
					for (local25 = 0; local25 < 64; local25++) {
						if (arg0 + local21 > 0 && arg0 + local21 < 103 && arg6 + local25 > 0 && arg6 + local25 < 103) {
							arg3[local17].anIntArrayArray3[arg0 + local21][arg6 + local25] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(79) Class1_Sub2_Sub3 local79 = new Class1_Sub2_Sub3(arg2, -670);
			for (local25 = 0; local25 < 4; local25++) {
				for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
					for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
						this.method510(local25, arg1, local89 + arg6, 0, arg5, local79, local85 + arg0);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("74534, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIZIIILclient!MNKDCXXG;I)V")
	private void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub2_Sub3 arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(33) int local33;
			if (arg6 >= 0 && arg6 < 104 && arg2 >= 0 && arg2 < 104) {
				this.aByteArrayArrayArray4[arg0][arg6][arg2] = 0;
				while (true) {
					local33 = arg5.method307();
					if (local33 == 0) {
						if (arg0 == 0) {
							this.anIntArrayArrayArray5[0][arg6][arg2] = -method527(arg6 + arg1 + 932731, arg2 + 556238 + arg4) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg0][arg6][arg2] = this.anIntArrayArrayArray5[arg0 - 1][arg6][arg2] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg5.method307();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg0 == 0) {
							this.anIntArrayArrayArray5[0][arg6][arg2] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg0][arg6][arg2] = this.anIntArrayArrayArray5[arg0 - 1][arg6][arg2] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray7[arg0][arg6][arg2] = arg5.method308();
						this.aByteArrayArrayArray2[arg0][arg6][arg2] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray6[arg0][arg6][arg2] = (byte) (local33 + arg3 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray4[arg0][arg6][arg2] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray3[arg0][arg6][arg2] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg5.method307();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg5.method307();
						return;
					}
					if (local33 <= 49) {
						arg5.method307();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("75579, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(Lclient!HFSXIPFN;I[Lclient!EKHWFCYP;)V")
	public void method511(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class10[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray4[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray4[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method106(local11, local7);
							}
						}
					}
				}
			}
			anInt696 += (int) (Math.random() * 5.0D) - 2;
			if (anInt696 < -8) {
				anInt696 = -8;
			}
			if (anInt696 > 8) {
				anInt696 = 8;
			}
			anInt701 += (int) (Math.random() * 5.0D) - 2;
			if (anInt701 < -16) {
				anInt701 = -16;
			}
			if (anInt701 > 16) {
				anInt701 = 16;
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
				for (local141 = 1; local141 < this.anInt700 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt699 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray19[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt700; local145++) {
					this.anIntArray174[local145] = 0;
					this.anIntArray175[local145] = 0;
					this.anIntArray176[local145] = 0;
					this.anIntArray177[local145] = 0;
					this.anIntArray178[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt699 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt700; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt699) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class9 local378 = Class9.aClass9Array1[local210 - 1];
								this.anIntArray174[local191] += local378.anInt210;
								this.anIntArray175[local191] += local378.anInt208;
								this.anIntArray176[local191] += local378.anInt209;
								this.anIntArray177[local191] += local378.anInt211;
								local419 = this.anIntArray178[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt699) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class9 local451 = Class9.aClass9Array1[local214 - 1];
								this.anIntArray174[local191] -= local451.anInt210;
								this.anIntArray175[local191] -= local451.anInt208;
								this.anIntArray176[local191] -= local451.anInt209;
								this.anIntArray177[local191] -= local451.anInt211;
								local419 = this.anIntArray178[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt699 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt700 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt700) {
								local204 += this.anIntArray174[local527];
								local210 += this.anIntArray175[local527];
								local214 += this.anIntArray176[local527];
								local220 += this.anIntArray177[local527];
								local236 += this.anIntArray178[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt700) {
								local204 -= this.anIntArray174[local572];
								local210 -= this.anIntArray175[local572];
								local214 -= this.anIntArray176[local572];
								local220 -= this.anIntArray177[local572];
								local236 -= this.anIntArray178[local572];
							}
							if (local284 >= 1 && local284 < this.anInt700 - 1 && (!aBoolean163 || (this.aByteArrayArrayArray4[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray4[local7][local169][local284] & 0x10) == 0 && this.method506(local169, local284, local7) == anInt697)) {
								if (local7 < anInt698) {
									anInt698 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray7[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
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
										local768 = this.method524(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt696 & 0xFF;
										local786 += anInt701;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method524(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray2[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class9.aClass9Array1[local682 - 1].aBoolean32) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class1_Sub2_Sub1_Sub3.anIntArray150[method515(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method132(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method515(local768, local737), method515(local768, local746), method515(local768, local757), method515(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray2[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray6[local7][local169][local284];
										@Pc(941) Class9 local941 = Class9.aClass9Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt206;
										@Pc(953) int local953;
										@Pc(951) int local951;
										if (local944 >= 0) {
											local951 = Class1_Sub2_Sub1_Sub3.method439(local944, this.aByte34);
											local953 = -1;
										} else if (local941.anInt205 == 16711935) {
											local953 = -2;
											local944 = -1;
											local951 = Class1_Sub2_Sub1_Sub3.anIntArray150[this.method517(local941.anInt212, 96)];
										} else {
											local953 = this.method524(local941.anInt207, local941.anInt208, local941.anInt209);
											local951 = Class1_Sub2_Sub1_Sub3.anIntArray150[this.method517(local941.anInt212, 96)];
										}
										arg0.method132(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method515(local768, local737), method515(local768, local746), method515(local768, local757), method515(local768, local766), this.method517(local953, local737), this.method517(local953, local746), this.method517(local953, local757), this.method517(local953, local766), local778, local951);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt700 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt699 - 1; local204++) {
						arg0.method131(local7, local204, local191, this.method506(local204, local191, local7));
					}
				}
			}
			arg0.method158();
			for (local11 = 0; local11 < this.anInt699; local11++) {
				for (local27 = 0; local27 < this.anInt700; local27++) {
					if ((this.aByteArrayArrayArray4[1][local11][local27] & 0x2) == 2) {
						arg0.method129(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1128) int local1128 = 2;
			@Pc(1130) int local1130 = 4;
			for (@Pc(1141) int local1141 = 0; local1141 < 4; local1141++) {
				if (local1141 > 0) {
					local27 <<= 0x3;
					local1128 <<= 0x3;
					local1130 <<= 0x3;
				}
				for (@Pc(1159) int local1159 = 0; local1159 <= local1141; local1159++) {
					for (local133 = 0; local133 <= this.anInt700; local133++) {
						for (local139 = 0; local139 <= this.anInt699; local139++) {
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1159][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt700 && (this.anIntArrayArrayArray6[local1159][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local139][local141];
									Class16.method130(1, local141 * 128, local220, local214, local145 * 128 + 128, local1141, local139 * 128, local139 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local1128) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1159][local141 - 1][local133] & local1128) != 0) {
									local141--;
								}
								while (local145 < this.anInt699 && (this.anIntArrayArrayArray6[local1159][local145 + 1][local133] & local1128) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1128) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1128) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class16.method130(2, local133 * 128, local220, local214, local133 * 128, local1141, local145 * 128 + 128, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1128;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local1130) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1159][local139][local169 - 1] & local1130) != 0) {
									local169--;
								}
								while (local191 < this.anInt700 && (this.anIntArrayArrayArray6[local1159][local139][local191 + 1] & local1130) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1159][local141 - 1][local204] & local1130) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt699) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1159][local145 + 1][local204] & local1130) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1159][local141][local169];
									Class16.method130(4, local169 * 128, local204, local204, local191 * 128 + 128, local1141, local145 * 128 + 128, local141 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1159][local210][local214] &= ~local1130;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1774) RuntimeException local1774) {
			signlink.reporterror("99262, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local1774.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIILclient!EKHWFCYP;IILclient!HFSXIPFN;I)V")
	private void method513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean163 && (this.aByteArrayArrayArray4[0][arg4][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray4[arg7][arg4][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method506(arg4, arg2, arg7) != anInt697) {
					return;
				}
			}
			if (arg7 < anInt698) {
				anInt698 = arg7;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg7][arg4][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg7][arg4 + 1][arg2];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg7][arg4 + 1][arg2 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg7][arg4][arg2 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class27 local97 = Class27.method282(arg0);
			@Pc(109) int local109 = arg4 + (arg2 << 7) + (arg0 << 14) + 1073741824;
			if (!local97.aBoolean88) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg5 << 6) + arg1);
			@Pc(155) Class1_Sub2_Sub2 local155;
			if (arg1 != 22) {
				@Pc(253) int local253;
				if (arg1 == 10 || arg1 == 11) {
					if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
						local155 = local97.method284(10, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub2_Sub2_Sub6(10, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg1 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg5 == 1 || arg5 == 3) {
							local253 = local97.anInt450;
							local256 = local97.anInt447;
						} else {
							local253 = local97.anInt447;
							local256 = local97.anInt450;
						}
						if (arg6.method137(arg2, local253, local109, arg7, local123, local256, local155, local240, arg4, local94) && local97.aBoolean87) {
							@Pc(287) Class1_Sub2_Sub2_Sub3 local287;
							if (local155 instanceof Class1_Sub2_Sub2_Sub3) {
								local287 = (Class1_Sub2_Sub2_Sub3) local155;
							} else {
								local287 = local97.method284(10, arg5, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt374 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray5[arg7][arg4 + local303][arg2 + local307]) {
											this.aByteArrayArrayArray5[arg7][arg4 + local303][arg2 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean93 && arg3 != null) {
						arg3.method105(arg4, local97.anInt447, local97.anInt450, arg2, local97.aBoolean84, arg5);
					}
				} else if (arg1 >= 12) {
					if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
						local155 = local97.method284(arg1, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub2_Sub2_Sub6(arg1, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
					}
					arg6.method137(arg2, 1, local109, arg7, local123, 1, local155, 0, arg4, local94);
					if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x924;
					}
					if (local97.aBoolean93 && arg3 != null) {
						arg3.method105(arg4, local97.anInt447, local97.anInt450, arg2, local97.aBoolean84, arg5);
					}
				} else if (arg1 == 0) {
					if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
						local155 = local97.method284(0, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub2_Sub2_Sub6(0, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
					}
					arg6.method135(local123, local109, local94, anIntArray171[arg5], 0, arg7, arg2, local155, arg4, null);
					if (arg5 == 0) {
						if (local97.aBoolean87) {
							this.aByteArrayArrayArray5[arg7][arg4][arg2] = 50;
							this.aByteArrayArrayArray5[arg7][arg4][arg2 + 1] = 50;
						}
						if (local97.aBoolean85) {
							this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local97.aBoolean87) {
							this.aByteArrayArrayArray5[arg7][arg4][arg2 + 1] = 50;
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean85) {
							this.anIntArrayArrayArray6[arg7][arg4][arg2 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local97.aBoolean87) {
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2] = 50;
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean85) {
							this.anIntArrayArrayArray6[arg7][arg4 + 1][arg2] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local97.aBoolean87) {
							this.aByteArrayArrayArray5[arg7][arg4][arg2] = 50;
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2] = 50;
						}
						if (local97.aBoolean85) {
							this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x492;
						}
					}
					if (local97.aBoolean93 && arg3 != null) {
						arg3.method104(arg4, arg1, local97.aBoolean84, arg2, arg5);
					}
					if (local97.anInt454 != 16) {
						arg6.method143(arg7, local97.anInt454, arg4, arg2);
					}
				} else if (arg1 == 1) {
					if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
						local155 = local97.method284(1, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub2_Sub2_Sub6(1, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
					}
					arg6.method135(local123, local109, local94, anIntArray173[arg5], 0, arg7, arg2, local155, arg4, null);
					if (local97.aBoolean87) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray5[arg7][arg4][arg2 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray5[arg7][arg4][arg2] = 50;
						}
					}
					if (local97.aBoolean93 && arg3 != null) {
						arg3.method104(arg4, arg1, local97.aBoolean84, arg2, arg5);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class1_Sub2_Sub2 local893;
					if (arg1 == 2) {
						local864 = arg5 + 1 & 0x3;
						@Pc(883) Class1_Sub2_Sub2 local883;
						if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
							local883 = local97.method284(2, arg5 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method284(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class1_Sub2_Sub2_Sub6(2, local60, local97.anInt463, arg5 + 4, (byte) 116, local49, local73, arg0, local84, true);
							local893 = new Class1_Sub2_Sub2_Sub6(2, local60, local97.anInt463, local864, (byte) 116, local49, local73, arg0, local84, true);
						}
						arg6.method135(local123, local109, local94, anIntArray171[arg5], anIntArray171[local864], arg7, arg2, local883, arg4, local893);
						if (local97.aBoolean85) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x249;
								this.anIntArrayArrayArray6[arg7][arg4][arg2 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray6[arg7][arg4][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg7][arg4 + 1][arg2] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray6[arg7][arg4 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x492;
								this.anIntArrayArrayArray6[arg7][arg4][arg2] |= 0x249;
							}
						}
						if (local97.aBoolean93 && arg3 != null) {
							arg3.method104(arg4, arg1, local97.aBoolean84, arg2, arg5);
						}
						if (local97.anInt454 != 16) {
							arg6.method143(arg7, local97.anInt454, arg4, arg2);
						}
					} else if (arg1 == 3) {
						if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
							local155 = local97.method284(3, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class1_Sub2_Sub2_Sub6(3, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
						}
						arg6.method135(local123, local109, local94, anIntArray173[arg5], 0, arg7, arg2, local155, arg4, null);
						if (local97.aBoolean87) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray5[arg7][arg4][arg2 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray5[arg7][arg4 + 1][arg2] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray5[arg7][arg4][arg2] = 50;
							}
						}
						if (local97.aBoolean93 && arg3 != null) {
							arg3.method104(arg4, arg1, local97.aBoolean84, arg2, arg5);
						}
					} else if (arg1 == 9) {
						if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
							local155 = local97.method284(arg1, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class1_Sub2_Sub2_Sub6(arg1, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
						}
						arg6.method137(arg2, 1, local109, arg7, local123, 1, local155, 0, arg4, local94);
						if (local97.aBoolean93 && arg3 != null) {
							arg3.method105(arg4, local97.anInt447, local97.anInt450, arg2, local97.aBoolean84, arg5);
						}
					} else {
						if (local97.aBoolean90) {
							if (arg5 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg5 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg5 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg1 == 4) {
							if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
								local155 = local97.method284(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub2_Sub2_Sub6(4, local60, local97.anInt463, 0, (byte) 116, local49, local73, arg0, local84, true);
							}
							arg6.method136(arg5 * 512, local94, local109, local123, anIntArray171[arg5], arg2, arg4, arg7, 0, 0, (byte) 6, local155);
						} else if (arg1 == 5) {
							local864 = 16;
							local253 = arg6.method153(arg7, arg4, arg2);
							if (local253 > 0) {
								local864 = Class27.method282(local253 >> 14 & 0x7FFF).anInt454;
							}
							if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
								local893 = local97.method284(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class1_Sub2_Sub2_Sub6(4, local60, local97.anInt463, 0, (byte) 116, local49, local73, arg0, local84, true);
							}
							arg6.method136(arg5 * 512, local94, local109, local123, anIntArray171[arg5], arg2, arg4, arg7, anIntArray172[arg5] * local864, anIntArray179[arg5] * local864, (byte) 6, local893);
						} else if (arg1 == 6) {
							if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
								local155 = local97.method284(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub2_Sub2_Sub6(4, local60, local97.anInt463, 0, (byte) 116, local49, local73, arg0, local84, true);
							}
							arg6.method136(arg5, local94, local109, local123, 256, arg2, arg4, arg7, 0, 0, (byte) 6, local155);
						} else if (arg1 == 7) {
							if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
								local155 = local97.method284(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub2_Sub2_Sub6(4, local60, local97.anInt463, 0, (byte) 116, local49, local73, arg0, local84, true);
							}
							arg6.method136(arg5, local94, local109, local123, 512, arg2, arg4, arg7, 0, 0, (byte) 6, local155);
						} else if (arg1 == 8) {
							if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
								local155 = local97.method284(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub2_Sub2_Sub6(4, local60, local97.anInt463, 0, (byte) 116, local49, local73, arg0, local84, true);
							}
							arg6.method136(arg5, local94, local109, local123, 768, arg2, arg4, arg7, 0, 0, (byte) 6, local155);
						}
					}
				}
			} else if (!aBoolean163 || local97.aBoolean88 || local97.aBoolean92) {
				if (local97.anInt463 == -1 && local97.anIntArray105 == null) {
					local155 = local97.method284(22, arg5, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class1_Sub2_Sub2_Sub6(22, local60, local97.anInt463, arg5, (byte) 116, local49, local73, arg0, local84, true);
				}
				arg6.method133(arg4, local94, local109, arg7, local123, local155, aByte35, arg2);
				if (local97.aBoolean93 && local97.aBoolean88 && arg3 != null) {
					arg3.method106(arg2, arg4);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("57897, " + -194 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II[Lclient!EKHWFCYP;[BIIIIII)V")
	public void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg7 + local3 > 0 && arg7 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg2[arg0].anIntArrayArray3[arg7 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub2_Sub3 local57 = new Class1_Sub2_Sub3(arg3, -670);
			for (@Pc(65) int local65 = 0; local65 < 4; local65++) {
				for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
					for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
						if (local65 == arg4 && local69 >= arg6 && local69 < arg6 + 8 && local73 >= arg5 && local73 < arg5 + 8) {
							this.method510(arg0, 0, arg1 + Class21.method228(local73 & 0x7, arg8, local69 & 0x7), arg8, 0, local57, arg7 + Class21.method227(local73 & 0x7, local69 & 0x7, arg8));
						} else {
							this.method510(0, 0, -1, 0, 0, local57, -1);
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("31564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(II)I")
	private int method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[Lclient!EKHWFCYP;IIIII[BZLclient!HFSXIPFN;I)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) Class10[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class16 arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(7) Class1_Sub2_Sub3 local7 = new Class1_Sub2_Sub3(arg7, -670);
			@Pc(11) int local11;
			if (arg8) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			local11 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method321();
				if (local21 == 0) {
					return;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method321();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method307();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					if (local54 == arg5 && local50 >= arg3 && local50 < arg3 + 8 && local44 >= arg6 && local44 < arg6 + 8) {
						@Pc(87) Class27 local87 = Class27.method282(local11);
						@Pc(104) int local104 = arg2 + Class21.method229(local65, local50 & 0x7, local87.anInt447, local44 & 0x7, arg10, local87.anInt450);
						@Pc(121) int local121 = arg0 + Class21.method230(local44 & 0x7, local65, arg10, local87.anInt450, local50 & 0x7, local87.anInt447);
						if (local104 > 0 && local121 > 0 && local104 < 103 && local121 < 103) {
							@Pc(133) int local133 = arg4;
							if ((this.aByteArrayArrayArray4[1][local104][local121] & 0x2) == 2) {
								local133 = arg4 - 1;
							}
							@Pc(148) Class10 local148 = null;
							if (local133 >= 0) {
								local148 = arg1[local133];
							}
							this.method513(local11, local61, local121, local148, local104, local65 + arg10 & 0x3, arg9, arg4);
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("90085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "(III)I")
	private int method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(IIII)V")
	public void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg0 + local3][arg2 + local7] = 0;
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg0][arg2 + local7] = this.anIntArrayArrayArray5[arg1][arg0 - 1][arg2 + local7];
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg0 + local7][arg2] = this.anIntArrayArrayArray5[arg1][arg0 + local7][arg2 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray5[arg1][arg0][arg2] = this.anIntArrayArrayArray5[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray5[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg0][arg2] = this.anIntArrayArrayArray5[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray5[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg0][arg2] = this.anIntArrayArrayArray5[arg1][arg0 - 1][arg2 - 1];
			}
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("67091, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}
}
