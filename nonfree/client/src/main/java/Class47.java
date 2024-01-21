import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YTWJKTVW")
public final class Class47 {

	@OriginalMember(owner = "client!YTWJKTVW", name = "r", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!YTWJKTVW", name = "D", descriptor = "Z")
	private static boolean aBoolean182;

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "[I")
	private static final int[] anIntArray201 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "I")
	private static int anInt780 = 302;

	@OriginalMember(owner = "client!YTWJKTVW", name = "d", descriptor = "[I")
	private static final int[] anIntArray202 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!YTWJKTVW", name = "e", descriptor = "I")
	public static int anInt781 = 99;

	@OriginalMember(owner = "client!YTWJKTVW", name = "h", descriptor = "[I")
	private static final int[] anIntArray203 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!YTWJKTVW", name = "j", descriptor = "I")
	private static int anInt785 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!YTWJKTVW", name = "l", descriptor = "I")
	private static int anInt786 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!YTWJKTVW", name = "o", descriptor = "Z")
	private static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!YTWJKTVW", name = "q", descriptor = "Z")
	public static boolean aBoolean179 = true;

	@OriginalMember(owner = "client!YTWJKTVW", name = "t", descriptor = "[I")
	private static final int[] anIntArray204 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!YTWJKTVW", name = "B", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!YTWJKTVW", name = "i", descriptor = "I")
	private int anInt784 = -706;

	@OriginalMember(owner = "client!YTWJKTVW", name = "k", descriptor = "B")
	private byte aByte36 = 6;

	@OriginalMember(owner = "client!YTWJKTVW", name = "s", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!YTWJKTVW", name = "u", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!YTWJKTVW", name = "f", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!YTWJKTVW", name = "g", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!YTWJKTVW", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!YTWJKTVW", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!YTWJKTVW", name = "G", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!YTWJKTVW", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!YTWJKTVW", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!YTWJKTVW", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!YTWJKTVW", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!YTWJKTVW", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!YTWJKTVW", name = "w", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!YTWJKTVW", name = "x", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!YTWJKTVW", name = "y", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!YTWJKTVW", name = "z", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!YTWJKTVW", name = "A", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(III)I")
	private static int method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method556(local3, local13);
		@Pc(29) int local29 = method556(local3 + 1, local13);
		@Pc(35) int local35 = method556(local3, local13 + 1);
		@Pc(43) int local43 = method556(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method562(local23, local29, local9, arg2);
		@Pc(55) int local55 = method562(local35, local43, local9, arg2);
		return method562(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "([[[IIIILclient!MCPCRICF;Lclient!FUVVWALN;IIZII)V")
	public static void method543(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) Class11 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg0[arg2][arg9][arg3];
			@Pc(19) int local19 = arg0[arg2][arg9 + 1][arg3];
			@Pc(31) int local31 = arg0[arg2][arg9 + 1][arg3 + 1];
			@Pc(41) int local41 = arg0[arg2][arg9][arg3 + 1];
			@Pc(59) int local59 = local9 + local19 + local31 + local41 >> 2;
			@Pc(62) Class8 local62 = Class8.method70(arg1);
			@Pc(74) int local74 = arg9 + (arg3 << 7) + (arg1 << 14) + 1073741824;
			if (!local62.aBoolean28) {
				local74 += Integer.MIN_VALUE;
			}
			@Pc(88) byte local88 = (byte) ((arg8 << 6) + arg6);
			@Pc(108) Class3_Sub1_Sub1 local108;
			if (arg6 == 22) {
				if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
					local108 = local62.method76(22, arg8, local9, local19, local31, local41, -1);
				} else {
					local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 22, arg8, arg1, local62.anInt101);
				}
				arg4.method254(arg7, local74, arg9, local88, arg3, local108, local59);
				if (local62.aBoolean25 && local62.aBoolean28) {
					arg5.method131(arg9, arg3);
				}
			} else {
				@Pc(204) int local204;
				if (arg6 == 10 || arg6 == 11) {
					if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
						local108 = local62.method76(10, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 10, arg8, arg1, local62.anInt101);
					}
					if (local108 != null) {
						@Pc(191) int local191 = 0;
						if (arg6 == 11) {
							local191 += 256;
						}
						@Pc(207) int local207;
						if (arg8 == 1 || arg8 == 3) {
							local204 = local62.anInt110;
							local207 = local62.anInt102;
						} else {
							local204 = local62.anInt102;
							local207 = local62.anInt110;
						}
						arg4.method258(arg3, arg7, local207, local74, local59, arg9, local88, local204, local108, local191);
					}
					if (local62.aBoolean25) {
						arg5.method130(local62.anInt110, arg8, arg9, local62.aBoolean32, local62.anInt102, arg3);
					}
				} else if (arg6 >= 12) {
					if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
						local108 = local62.method76(arg6, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, arg6, arg8, arg1, local62.anInt101);
					}
					arg4.method258(arg3, arg7, 1, local74, local59, arg9, local88, 1, local108, 0);
					if (local62.aBoolean25) {
						arg5.method130(local62.anInt110, arg8, arg9, local62.aBoolean32, local62.anInt102, arg3);
					}
				} else if (arg6 == 0) {
					if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
						local108 = local62.method76(0, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 0, arg8, arg1, local62.anInt101);
					}
					arg4.method256(0, arg3, local88, anIntArray204[arg8], null, arg9, arg7, local74, local59, local108);
					if (local62.aBoolean25) {
						arg5.method129(arg6, local62.aBoolean32, arg8, arg9, arg3);
					}
				} else if (arg6 == 1) {
					if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
						local108 = local62.method76(1, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 1, arg8, arg1, local62.anInt101);
					}
					arg4.method256(0, arg3, local88, anIntArray202[arg8], null, arg9, arg7, local74, local59, local108);
					if (local62.aBoolean25) {
						arg5.method129(arg6, local62.aBoolean32, arg8, arg9, arg3);
					}
				} else {
					@Pc(450) int local450;
					@Pc(479) Class3_Sub1_Sub1 local479;
					if (arg6 == 2) {
						local450 = arg8 + 1 & 0x3;
						@Pc(469) Class3_Sub1_Sub1 local469;
						if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
							local469 = local62.method76(2, arg8 + 4, local9, local19, local31, local41, -1);
							local479 = local62.method76(2, local450, local9, local19, local31, local41, -1);
						} else {
							local469 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 2, arg8 + 4, arg1, local62.anInt101);
							local479 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 2, local450, arg1, local62.anInt101);
						}
						arg4.method256(anIntArray204[local450], arg3, local88, anIntArray204[arg8], local479, arg9, arg7, local74, local59, local469);
						if (local62.aBoolean25) {
							arg5.method129(arg6, local62.aBoolean32, arg8, arg9, arg3);
						}
					} else if (arg6 == 3) {
						if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
							local108 = local62.method76(3, arg8, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 3, arg8, arg1, local62.anInt101);
						}
						arg4.method256(0, arg3, local88, anIntArray202[arg8], null, arg9, arg7, local74, local59, local108);
						if (local62.aBoolean25) {
							arg5.method129(arg6, local62.aBoolean32, arg8, arg9, arg3);
						}
					} else if (arg6 == 9) {
						if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
							local108 = local62.method76(arg6, arg8, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, arg6, arg8, arg1, local62.anInt101);
						}
						arg4.method258(arg3, arg7, 1, local74, local59, arg9, local88, 1, local108, 0);
						if (local62.aBoolean25) {
							arg5.method130(local62.anInt110, arg8, arg9, local62.aBoolean32, local62.anInt102, arg3);
						}
					} else {
						if (local62.aBoolean22) {
							if (arg8 == 1) {
								local450 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local450;
							} else if (arg8 == 2) {
								local450 = local41;
								local41 = local19;
								local19 = local450;
								local450 = local31;
								local31 = local9;
								local9 = local450;
							} else if (arg8 == 3) {
								local450 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local450;
							}
						}
						if (arg6 == 4) {
							if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
								local108 = local62.method76(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 4, 0, arg1, local62.anInt101);
							}
							arg4.method257(local74, local59, 0, anIntArray204[arg8], local88, local108, arg3, arg8 * 512, 0, arg9, arg7);
						} else if (arg6 == 5) {
							local450 = 16;
							local204 = arg4.method274(arg7, arg9, arg3);
							if (local204 > 0) {
								local450 = Class8.method70(local204 >> 14 & 0x7FFF).anInt103;
							}
							if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
								local479 = local62.method76(4, 0, local9, local19, local31, local41, -1);
							} else {
								local479 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 4, 0, arg1, local62.anInt101);
							}
							arg4.method257(local74, local59, anIntArray203[arg8] * local450, anIntArray204[arg8], local88, local479, arg3, arg8 * 512, anIntArray201[arg8] * local450, arg9, arg7);
						} else if (arg6 == 6) {
							if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
								local108 = local62.method76(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 4, 0, arg1, local62.anInt101);
							}
							arg4.method257(local74, local59, 0, 256, local88, local108, arg3, arg8, 0, arg9, arg7);
						} else if (arg6 == 7) {
							if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
								local108 = local62.method76(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 4, 0, arg1, local62.anInt101);
							}
							arg4.method257(local74, local59, 0, 512, local88, local108, arg3, arg8, 0, arg9, arg7);
						} else if (arg6 == 8) {
							if (local62.anInt101 == -1 && local62.anIntArray18 == null) {
								local108 = local62.method76(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class3_Sub1_Sub1_Sub2(local31, local19, local41, true, true, local9, 4, 0, arg1, local62.anInt101);
							}
							arg4.method257(local74, local59, 0, 768, local88, local108, arg3, arg8, 0, arg9, arg7);
						}
					}
				}
			}
		} catch (@Pc(1018) RuntimeException local1018) {
			signlink.reporterror("45722, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + arg9 + ", " + local1018.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(II)I")
	private static int method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ILclient!WNCFPLWV;Lclient!HKGQPBYJ;)V")
	public static void method548(@OriginalArg(1) Class3_Sub1_Sub4 arg0, @OriginalArg(2) Class16_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(18) int local18 = arg0.method472();
				if (local18 == 0) {
					return;
				}
				local3 += local18;
				@Pc(27) Class8 local27 = Class8.method70(local3);
				local27.method74(arg1);
				while (true) {
					@Pc(34) int local34 = arg0.method472();
					if (local34 == 0) {
						break;
					}
					arg0.method458();
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("93382, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "(II)I")
	private static int method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!YTWJKTVW", name = "d", descriptor = "(II)I")
	private static int method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method541(arg0 + 45365, arg1 + 91923, 4) + (method541(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method541(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(I[BII)Z")
	public static boolean method554(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class3_Sub1_Sub4 local9 = new Class3_Sub1_Sub4((byte) -58, arg1);
			@Pc(11) int local11 = -1;
			@Pc(15) boolean local15 = false;
			label53: while (true) {
				@Pc(18) int local18 = local9.method472();
				if (local18 == 0) {
					return local3;
				}
				local11 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local9.method472();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local9.method458() >> 2;
						@Pc(70) int local70 = local61 + arg0;
						@Pc(74) int local74 = local55 + arg2;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class8 local87 = Class8.method70(local11);
							if (local66 != 22 || !aBoolean179 || local87.aBoolean28 || local87.aBoolean31) {
								local3 &= local87.method72();
								local28 = true;
							}
						}
					}
					local33 = local9.method472();
					if (local33 == 0) {
						break;
					}
					local9.method458();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("75704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "e", descriptor = "(II)I")
	private static int method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method547(arg0 - 1, arg1 - 1) + method547(arg0 + 1, arg1 - 1) + method547(arg0 - 1, arg1 + 1) + method547(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method547(arg0 - 1, arg1) + method547(arg0 + 1, arg1) + method547(arg0, arg1 - 1) + method547(arg0, arg1 + 1);
		@Pc(59) int local59 = method547(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(III)Z")
	public static boolean method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class8 local2 = Class8.method70(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method71(arg1, aBoolean178);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("60206, " + 365 + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "b", descriptor = "(IIII)I")
	private static int method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub1_Sub2_Sub2.anIntArray28[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "<init>", descriptor = "(I[[[III[[[B)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt781 = 99;
			this.anInt782 = arg0;
			this.anInt783 = arg2;
			this.anIntArrayArrayArray5 = arg1;
			this.aByteArrayArrayArray5 = arg4;
			this.aByteArrayArrayArray7 = new byte[4][this.anInt782][this.anInt783];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt782][this.anInt783];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt782][this.anInt783];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt782][this.anInt783];
			this.anIntArrayArrayArray6 = new int[4][this.anInt782 + 1][this.anInt783 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt782 + 1][this.anInt783 + 1];
			this.anIntArrayArray21 = new int[this.anInt782 + 1][this.anInt783 + 1];
			this.anIntArray205 = new int[this.anInt783];
			this.anIntArray206 = new int[this.anInt783];
			this.anIntArray207 = new int[this.anInt783];
			this.anIntArray208 = new int[this.anInt783];
			this.anIntArray209 = new int[this.anInt783];
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("20234, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IBII)I")
	private int method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray5[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("88364, " + arg0 + ", " + 124 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(III[BIIILclient!MCPCRICF;II[Lclient!FUVVWALN;)V")
	public void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class25 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class11[] arg10) {
		try {
			@Pc(7) Class3_Sub1_Sub4 local7 = new Class3_Sub1_Sub4((byte) -58, arg3);
			@Pc(9) int local9 = -1;
			@Pc(13) boolean local13 = false;
			while (true) {
				@Pc(16) int local16 = local7.method472();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method472();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method458();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					if (local49 == arg8 && local45 >= arg2 && local45 < arg2 + 8 && local39 >= arg1 && local39 < arg1 + 8) {
						@Pc(82) Class8 local82 = Class8.method70(local9);
						@Pc(99) int local99 = arg0 + Class48.method565(local82.anInt102, local45 & 0x7, local39 & 0x7, arg4, local82.anInt110, local60);
						@Pc(116) int local116 = arg9 + Class48.method566(local45 & 0x7, local39 & 0x7, local82.anInt110, local82.anInt102, local60, arg4);
						if (local99 > 0 && local116 > 0 && local99 < 103 && local116 < 103) {
							@Pc(128) int local128 = arg6;
							if ((this.aByteArrayArrayArray5[1][local99][local116] & 0x2) == 2) {
								local128 = arg6 - 1;
							}
							@Pc(143) Class11 local143 = null;
							if (local128 >= 0) {
								local143 = arg10[local128];
							}
							this.method561(local9, local60 + arg4 & 0x3, local143, local99, local56, 568, arg7, arg6, local116);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("23671, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ZIIII)V")
	public void method545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg1; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt782 && local3 >= 0 && local3 < this.anInt783) {
						this.aByteArrayArrayArray3[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg3 && local7 < this.anInt782 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg1 && local3 < this.anInt783 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("94387, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(II)I")
	private int method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IIII)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg0][arg1 + local3][arg2 + local7] = 0;
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg0][arg1][arg2 + local7] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 + local7];
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg0][arg1 + local7][arg2] = this.anIntArrayArrayArray5[arg0][arg1 + local7][arg2 - 1];
				}
			}
			if (arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1];
			} else if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1];
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("39914, " + arg0 + ", " + arg1 + ", " + -130 + ", " + arg2 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ILclient!MCPCRICF;[Lclient!FUVVWALN;)V")
	public void method550(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class11[] arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray5[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg2[local27].method131(local7, local11);
							}
						}
					}
				}
			}
			if (arg0 < 0) {
				anInt785 += (int) (Math.random() * 5.0D) - 2;
				if (anInt785 < -8) {
					anInt785 = -8;
				}
				if (anInt785 > 8) {
					anInt785 = 8;
				}
				anInt786 += (int) (Math.random() * 5.0D) - 2;
				if (anInt786 < -16) {
					anInt786 = -16;
				}
				if (anInt786 > 16) {
					anInt786 = 16;
				}
				@Pc(136) int local136;
				@Pc(142) int local142;
				@Pc(144) int local144;
				@Pc(148) int local148;
				@Pc(172) int local172;
				@Pc(194) int local194;
				@Pc(207) int local207;
				@Pc(213) int local213;
				@Pc(217) int local217;
				@Pc(223) int local223;
				@Pc(239) int local239;
				@Pc(287) int local287;
				for (local7 = 0; local7 < 4; local7++) {
					@Pc(111) byte[][] local111 = this.aByteArrayArrayArray3[local7];
					local136 = (int) Math.sqrt((double) 5100);
					local142 = local136 * 768 >> 8;
					for (local144 = 1; local144 < this.anInt783 - 1; local144++) {
						for (local148 = 1; local148 < this.anInt782 - 1; local148++) {
							local172 = this.anIntArrayArrayArray5[local7][local148 + 1][local144] - this.anIntArrayArrayArray5[local7][local148 - 1][local144];
							local194 = this.anIntArrayArrayArray5[local7][local148][local144 + 1] - this.anIntArrayArrayArray5[local7][local148][local144 - 1];
							local207 = (int) Math.sqrt((double) (local172 * local172 + local194 * local194 + 65536));
							local213 = (local172 << 8) / local207;
							local217 = 65536 / local207;
							local223 = (local194 << 8) / local207;
							local239 = (local213 * -50 + local217 * -10 + local223 * -50) / local142 + 96;
							local287 = (local111[local148 - 1][local144] >> 2) + (local111[local148 + 1][local144] >> 3) + (local111[local148][local144 - 1] >> 2) + (local111[local148][local144 + 1] >> 3) + (local111[local148][local144] >> 1);
							this.anIntArrayArray21[local148][local144] = local239 - local287;
						}
					}
					for (local148 = 0; local148 < this.anInt783; local148++) {
						this.anIntArray205[local148] = 0;
						this.anIntArray206[local148] = 0;
						this.anIntArray207[local148] = 0;
						this.anIntArray208[local148] = 0;
						this.anIntArray209[local148] = 0;
					}
					for (local172 = -5; local172 < this.anInt782 + 5; local172++) {
						for (local194 = 0; local194 < this.anInt783; local194++) {
							local207 = local172 + 5;
							@Pc(422) int local422;
							if (local207 >= 0 && local207 < this.anInt782) {
								local213 = this.aByteArrayArrayArray7[local7][local207][local194] & 0xFF;
								if (local213 > 0) {
									@Pc(381) Class26 local381 = Class26.aClass26Array1[local213 - 1];
									this.anIntArray205[local194] += local381.anInt330;
									this.anIntArray206[local194] += local381.anInt328;
									this.anIntArray207[local194] += local381.anInt329;
									this.anIntArray208[local194] += local381.anInt331;
									local422 = this.anIntArray209[local194]++;
								}
							}
							local213 = local172 - 5;
							if (local213 >= 0 && local213 < this.anInt782) {
								local217 = this.aByteArrayArrayArray7[local7][local213][local194] & 0xFF;
								if (local217 > 0) {
									@Pc(454) Class26 local454 = Class26.aClass26Array1[local217 - 1];
									this.anIntArray205[local194] -= local454.anInt330;
									this.anIntArray206[local194] -= local454.anInt328;
									this.anIntArray207[local194] -= local454.anInt329;
									this.anIntArray208[local194] -= local454.anInt331;
									local422 = this.anIntArray209[local194]--;
								}
							}
						}
						if (local172 >= 1 && local172 < this.anInt782 - 1) {
							local207 = 0;
							local213 = 0;
							local217 = 0;
							local223 = 0;
							local239 = 0;
							for (local287 = -5; local287 < this.anInt783 + 5; local287++) {
								@Pc(530) int local530 = local287 + 5;
								if (local530 >= 0 && local530 < this.anInt783) {
									local207 += this.anIntArray205[local530];
									local213 += this.anIntArray206[local530];
									local217 += this.anIntArray207[local530];
									local223 += this.anIntArray208[local530];
									local239 += this.anIntArray209[local530];
								}
								@Pc(575) int local575 = local287 - 5;
								if (local575 >= 0 && local575 < this.anInt783) {
									local207 -= this.anIntArray205[local575];
									local213 -= this.anIntArray206[local575];
									local217 -= this.anIntArray207[local575];
									local223 -= this.anIntArray208[local575];
									local239 -= this.anIntArray209[local575];
								}
								if (local287 >= 1 && local287 < this.anInt783 - 1 && (!aBoolean179 || (this.aByteArrayArrayArray5[0][local172][local287] & 0x2) != 0 || (this.aByteArrayArrayArray5[local7][local172][local287] & 0x10) == 0 && this.method542(local287, local172, local7) == anInt787)) {
									if (local7 < anInt781) {
										anInt781 = local7;
									}
									@Pc(674) int local674 = this.aByteArrayArrayArray7[local7][local172][local287] & 0xFF;
									@Pc(685) int local685 = this.aByteArrayArrayArray6[local7][local172][local287] & 0xFF;
									if (local674 > 0 || local685 > 0) {
										@Pc(698) int local698 = this.anIntArrayArrayArray5[local7][local172][local287];
										@Pc(709) int local709 = this.anIntArrayArrayArray5[local7][local172 + 1][local287];
										@Pc(722) int local722 = this.anIntArrayArrayArray5[local7][local172 + 1][local287 + 1];
										@Pc(733) int local733 = this.anIntArrayArrayArray5[local7][local172][local287 + 1];
										@Pc(740) int local740 = this.anIntArrayArray21[local172][local287];
										@Pc(749) int local749 = this.anIntArrayArray21[local172 + 1][local287];
										@Pc(760) int local760 = this.anIntArrayArray21[local172 + 1][local287 + 1];
										@Pc(769) int local769 = this.anIntArrayArray21[local172][local287 + 1];
										@Pc(771) int local771 = -1;
										@Pc(773) int local773 = -1;
										@Pc(781) int local781;
										@Pc(785) int local785;
										if (local674 > 0) {
											local781 = local207 * 256 / local223;
											local785 = local213 / local239;
											@Pc(789) int local789 = local217 / local239;
											local771 = this.method560(local781, local785, local789);
											@Pc(801) int local801 = local781 + anInt785 & 0xFF;
											local789 += anInt786;
											if (local789 < 0) {
												local789 = 0;
											} else if (local789 > 255) {
												local789 = 255;
											}
											local773 = this.method560(local801, local785, local789);
										}
										if (local7 > 0) {
											@Pc(826) boolean local826 = true;
											if (local674 == 0 && this.aByteArrayArrayArray2[local7][local172][local287] != 0) {
												local826 = false;
											}
											if (local685 > 0 && !Class26.aClass26Array1[local685 - 1].aBoolean89) {
												local826 = false;
											}
											if (local826 && local698 == local709 && local698 == local722 && local698 == local733) {
												this.anIntArrayArrayArray6[local7][local172][local287] |= 0x924;
											}
										}
										local781 = 0;
										if (local771 != -1) {
											local781 = Class3_Sub1_Sub2_Sub2.anIntArray32[method551(local773, 96)];
										}
										if (local685 == 0) {
											arg1.method253(local7, local172, local287, 0, 0, -1, local698, local709, local722, local733, method551(local771, local740), method551(local771, local749), method551(local771, local760), method551(local771, local769), 0, 0, 0, 0, local781, 0);
										} else {
											local785 = this.aByteArrayArrayArray2[local7][local172][local287] + 1;
											@Pc(938) byte local938 = this.aByteArrayArrayArray4[local7][local172][local287];
											@Pc(944) Class26 local944 = Class26.aClass26Array1[local685 - 1];
											@Pc(947) int local947 = local944.anInt326;
											@Pc(955) int local955;
											@Pc(953) int local953;
											if (local947 >= 0) {
												local953 = Class3_Sub1_Sub2_Sub2.method104(local947);
												local955 = -1;
											} else if (local944.anInt325 == 16711935) {
												local955 = -2;
												local947 = -1;
												local953 = Class3_Sub1_Sub2_Sub2.anIntArray32[this.method546(local944.anInt332, 96)];
											} else {
												local955 = this.method560(local944.anInt327, local944.anInt328, local944.anInt329);
												local953 = Class3_Sub1_Sub2_Sub2.anIntArray32[this.method546(local944.anInt332, 96)];
											}
											arg1.method253(local7, local172, local287, local785, local938, local947, local698, local709, local722, local733, method551(local771, local740), method551(local771, local749), method551(local771, local760), method551(local771, local769), this.method546(local955, local740), this.method546(local955, local749), this.method546(local955, local760), this.method546(local955, local769), local781, local953);
										}
									}
								}
							}
						}
					}
					for (local194 = 1; local194 < this.anInt783 - 1; local194++) {
						for (local207 = 1; local207 < this.anInt782 - 1; local207++) {
							arg1.method252(local7, local207, local194, this.method542(local194, local207, local7));
						}
					}
				}
				arg1.method279();
				for (local11 = 0; local11 < this.anInt782; local11++) {
					for (local27 = 0; local27 < this.anInt783; local27++) {
						if ((this.aByteArrayArrayArray5[1][local11][local27] & 0x2) == 2) {
							arg1.method250(local11, local27);
						}
					}
				}
				local27 = 1;
				@Pc(1130) int local1130 = 2;
				@Pc(1132) int local1132 = 4;
				for (@Pc(1134) int local1134 = 0; local1134 < 4; local1134++) {
					if (local1134 > 0) {
						local27 <<= 0x3;
						local1130 <<= 0x3;
						local1132 <<= 0x3;
					}
					for (@Pc(1152) int local1152 = 0; local1152 <= local1134; local1152++) {
						for (local136 = 0; local136 <= this.anInt783; local136++) {
							for (local142 = 0; local142 <= this.anInt782; local142++) {
								if ((this.anIntArrayArrayArray6[local1152][local142][local136] & local27) != 0) {
									local144 = local136;
									local148 = local136;
									local172 = local1152;
									local194 = local1152;
									while (local144 > 0 && (this.anIntArrayArrayArray6[local1152][local142][local144 - 1] & local27) != 0) {
										local144--;
									}
									while (local148 < this.anInt783 && (this.anIntArrayArrayArray6[local1152][local142][local148 + 1] & local27) != 0) {
										local148++;
									}
									label332: while (local172 > 0) {
										for (local207 = local144; local207 <= local148; local207++) {
											if ((this.anIntArrayArrayArray6[local172 - 1][local142][local207] & local27) == 0) {
												break label332;
											}
										}
										local172--;
									}
									label321: while (local194 < local1134) {
										for (local207 = local144; local207 <= local148; local207++) {
											if ((this.anIntArrayArrayArray6[local194 + 1][local142][local207] & local27) == 0) {
												break label321;
											}
										}
										local194++;
									}
									local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
									if (local207 >= 8) {
										local217 = this.anIntArrayArrayArray5[local194][local142][local144] - 240;
										local223 = this.anIntArrayArrayArray5[local172][local142][local144];
										Class25.method251(1, this.aBoolean181, local1134, local142 * 128, local223, local148 * 128 + 128, local217, local144 * 128, local142 * 128);
										for (local239 = local172; local239 <= local194; local239++) {
											for (local287 = local144; local287 <= local148; local287++) {
												this.anIntArrayArrayArray6[local239][local142][local287] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray6[local1152][local142][local136] & local1130) != 0) {
									local144 = local142;
									local148 = local142;
									local172 = local1152;
									local194 = local1152;
									while (local144 > 0 && (this.anIntArrayArrayArray6[local1152][local144 - 1][local136] & local1130) != 0) {
										local144--;
									}
									while (local148 < this.anInt782 && (this.anIntArrayArrayArray6[local1152][local148 + 1][local136] & local1130) != 0) {
										local148++;
									}
									label385: while (local172 > 0) {
										for (local207 = local144; local207 <= local148; local207++) {
											if ((this.anIntArrayArrayArray6[local172 - 1][local207][local136] & local1130) == 0) {
												break label385;
											}
										}
										local172--;
									}
									label374: while (local194 < local1134) {
										for (local207 = local144; local207 <= local148; local207++) {
											if ((this.anIntArrayArrayArray6[local194 + 1][local207][local136] & local1130) == 0) {
												break label374;
											}
										}
										local194++;
									}
									local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
									if (local207 >= 8) {
										local217 = this.anIntArrayArrayArray5[local194][local144][local136] - 240;
										local223 = this.anIntArrayArrayArray5[local172][local144][local136];
										Class25.method251(2, this.aBoolean181, local1134, local148 * 128 + 128, local223, local136 * 128, local217, local136 * 128, local144 * 128);
										for (local239 = local172; local239 <= local194; local239++) {
											for (local287 = local144; local287 <= local148; local287++) {
												this.anIntArrayArrayArray6[local239][local287][local136] &= ~local1130;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray6[local1152][local142][local136] & local1132) != 0) {
									local144 = local142;
									local148 = local142;
									local172 = local136;
									local194 = local136;
									while (local172 > 0 && (this.anIntArrayArrayArray6[local1152][local142][local172 - 1] & local1132) != 0) {
										local172--;
									}
									while (local194 < this.anInt783 && (this.anIntArrayArrayArray6[local1152][local142][local194 + 1] & local1132) != 0) {
										local194++;
									}
									label438: while (local144 > 0) {
										for (local207 = local172; local207 <= local194; local207++) {
											if ((this.anIntArrayArrayArray6[local1152][local144 - 1][local207] & local1132) == 0) {
												break label438;
											}
										}
										local144--;
									}
									label427: while (local148 < this.anInt782) {
										for (local207 = local172; local207 <= local194; local207++) {
											if ((this.anIntArrayArrayArray6[local1152][local148 + 1][local207] & local1132) == 0) {
												break label427;
											}
										}
										local148++;
									}
									if ((local148 + 1 - local144) * (local194 + 1 - local172) >= 4) {
										local207 = this.anIntArrayArrayArray5[local1152][local144][local172];
										Class25.method251(4, this.aBoolean181, local1134, local148 * 128 + 128, local207, local194 * 128 + 128, local207, local172 * 128, local144 * 128);
										for (local213 = local144; local213 <= local148; local213++) {
											for (local217 = local172; local217 <= local194; local217++) {
												this.anIntArrayArrayArray6[local1152][local213][local217] &= ~local1132;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1770) RuntimeException local1770) {
			signlink.reporterror("73445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1770.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "([Lclient!FUVVWALN;[BBIILclient!MCPCRICF;)V")
	public void method553(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4) {
		try {
			@Pc(7) Class3_Sub1_Sub4 local7 = new Class3_Sub1_Sub4((byte) -58, arg1);
			@Pc(9) int local9 = -1;
			if (this.aByte36 == 6) {
				while (true) {
					@Pc(17) int local17 = local7.method472();
					if (local17 == 0) {
						return;
					}
					local9 += local17;
					@Pc(25) int local25 = 0;
					while (true) {
						@Pc(28) int local28 = local7.method472();
						if (local28 == 0) {
							break;
						}
						local25 += local28 - 1;
						@Pc(40) int local40 = local25 & 0x3F;
						@Pc(46) int local46 = local25 >> 6 & 0x3F;
						@Pc(50) int local50 = local25 >> 12;
						@Pc(53) int local53 = local7.method458();
						@Pc(57) int local57 = local53 >> 2;
						@Pc(61) int local61 = local53 & 0x3;
						@Pc(65) int local65 = local46 + arg2;
						@Pc(69) int local69 = local40 + arg3;
						if (local65 > 0 && local69 > 0 && local65 < 103 && local69 < 103) {
							@Pc(81) int local81 = local50;
							if ((this.aByteArrayArrayArray5[1][local65][local69] & 0x2) == 2) {
								local81 = local50 - 1;
							}
							@Pc(96) Class11 local96 = null;
							if (local81 >= 0) {
								local96 = arg0[local81];
							}
							this.method561(local9, local61, local96, local65, local57, 568, arg4, local50, local69);
						}
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("1151, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IIILclient!WNCFPLWV;IBII)V")
	private void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(31) int local31;
			if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
				this.aByteArrayArrayArray5[arg7][arg4][arg2] = 0;
				while (true) {
					local31 = arg3.method458();
					if (local31 == 0) {
						if (arg7 == 0) {
							this.anIntArrayArrayArray5[0][arg4][arg2] = -method552(arg4 + arg6 + 932731, arg2 + 556238 + arg0) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg7][arg4][arg2] = this.anIntArrayArrayArray5[arg7 - 1][arg4][arg2] - 240;
							return;
						}
					}
					if (local31 == 1) {
						@Pc(85) int local85 = arg3.method458();
						if (local85 == 1) {
							local85 = 0;
						}
						if (arg7 == 0) {
							this.anIntArrayArrayArray5[0][arg4][arg2] = -local85 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg7][arg4][arg2] = this.anIntArrayArrayArray5[arg7 - 1][arg4][arg2] - local85 * 8;
						return;
					}
					if (local31 <= 49) {
						this.aByteArrayArrayArray6[arg7][arg4][arg2] = arg3.method459();
						this.aByteArrayArrayArray2[arg7][arg4][arg2] = (byte) ((local31 - 2) / 4);
						this.aByteArrayArrayArray4[arg7][arg4][arg2] = (byte) (local31 + arg1 - 2 & 0x3);
					} else if (local31 <= 81) {
						this.aByteArrayArrayArray5[arg7][arg4][arg2] = (byte) (local31 - 49);
					} else {
						this.aByteArrayArrayArray7[arg7][arg4][arg2] = (byte) (local31 - 81);
					}
				}
			} else {
				while (true) {
					local31 = arg3.method458();
					if (local31 == 0) {
						return;
					}
					if (local31 == 1) {
						arg3.method458();
						return;
					}
					if (local31 <= 49) {
						arg3.method458();
					}
				}
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("31319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IBI[BII[Lclient!FUVVWALN;)V")
	public void method557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11[] arg5) {
		try {
			@Pc(21) int local21;
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						if (arg4 + local17 > 0 && arg4 + local17 < 103 && arg0 + local21 > 0 && arg0 + local21 < 103) {
							arg5[local13].anIntArrayArray4[arg4 + local17][arg0 + local21] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(75) Class3_Sub1_Sub4 local75 = new Class3_Sub1_Sub4((byte) -58, arg2);
			for (local21 = 0; local21 < 4; local21++) {
				for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
					for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
						this.method555(arg3, 0, local85 + arg0, local75, local81 + arg4, (byte) 7, arg1, local21);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("97938, " + arg0 + ", " + 54 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(ZIII[BI[Lclient!FUVVWALN;III)V")
	public void method559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg6 + local3 > 0 && arg6 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
						arg5[arg1].anIntArrayArray4[arg6 + local3][arg2 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class3_Sub1_Sub4 local57 = new Class3_Sub1_Sub4((byte) -58, arg3);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg8 && local63 >= arg4 && local63 < arg4 + 8 && local67 >= arg0 && local67 < arg0 + 8) {
							this.method555(0, arg7, arg2 + Class48.method564(arg7, local67 & 0x7, this.anInt788, local63 & 0x7), local57, arg6 + Class48.method563(local67 & 0x7, local63 & 0x7, arg7), (byte) 7, 0, arg1);
						} else {
							this.method555(0, 0, -1, local57, -1, (byte) 7, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("58618, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YTWJKTVW", name = "c", descriptor = "(III)I")
	private int method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!YTWJKTVW", name = "a", descriptor = "(IILclient!FUVVWALN;IIILclient!MCPCRICF;II)V")
	private void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(5) boolean local5 = false;
			if (aBoolean179 && (this.aByteArrayArrayArray5[0][arg3][arg8] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray5[arg7][arg3][arg8] & 0x10) != 0) {
					return;
				}
				if (this.method542(arg8, arg3, arg7) != anInt787) {
					return;
				}
			}
			if (arg7 < anInt781) {
				anInt781 = arg7;
			}
			@Pc(53) int local53 = this.anIntArrayArrayArray5[arg7][arg3][arg8];
			@Pc(64) int local64 = this.anIntArrayArrayArray5[arg7][arg3 + 1][arg8];
			@Pc(77) int local77 = this.anIntArrayArrayArray5[arg7][arg3 + 1][arg8 + 1];
			@Pc(88) int local88 = this.anIntArrayArrayArray5[arg7][arg3][arg8 + 1];
			@Pc(98) int local98 = local53 + local64 + local77 + local88 >> 2;
			@Pc(101) Class8 local101 = Class8.method70(arg0);
			@Pc(113) int local113 = arg3 + (arg8 << 7) + (arg0 << 14) + 1073741824;
			if (!local101.aBoolean28) {
				local113 += Integer.MIN_VALUE;
			}
			@Pc(127) byte local127 = (byte) ((arg1 << 6) + arg4);
			@Pc(156) Class3_Sub1_Sub1 local156;
			if (arg4 != 22) {
				@Pc(254) int local254;
				if (arg4 == 10 || arg4 == 11) {
					if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
						local156 = local101.method76(10, arg1, local53, local64, local77, local88, -1);
					} else {
						local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 10, arg1, arg0, local101.anInt101);
					}
					if (local156 != null) {
						@Pc(241) int local241 = 0;
						if (arg4 == 11) {
							local241 += 256;
						}
						@Pc(257) int local257;
						if (arg1 == 1 || arg1 == 3) {
							local254 = local101.anInt110;
							local257 = local101.anInt102;
						} else {
							local254 = local101.anInt102;
							local257 = local101.anInt110;
						}
						if (arg6.method258(arg8, arg7, local257, local113, local98, arg3, local127, local254, local156, local241) && local101.aBoolean33) {
							@Pc(288) Class3_Sub1_Sub1_Sub5 local288;
							if (local156 instanceof Class3_Sub1_Sub1_Sub5) {
								local288 = (Class3_Sub1_Sub1_Sub5) local156;
							} else {
								local288 = local101.method76(10, arg1, local53, local64, local77, local88, -1);
							}
							if (local288 != null) {
								for (@Pc(304) int local304 = 0; local304 <= local254; local304++) {
									for (@Pc(308) int local308 = 0; local308 <= local257; local308++) {
										@Pc(315) int local315 = local288.anInt627 / 4;
										if (local315 > 30) {
											local315 = 30;
										}
										if (local315 > this.aByteArrayArrayArray3[arg7][arg3 + local304][arg8 + local308]) {
											this.aByteArrayArrayArray3[arg7][arg3 + local304][arg8 + local308] = (byte) local315;
										}
									}
								}
							}
						}
					}
					if (local101.aBoolean25 && arg2 != null) {
						arg2.method130(local101.anInt110, arg1, arg3, local101.aBoolean32, local101.anInt102, arg8);
					}
				} else if (arg4 >= 12) {
					if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
						local156 = local101.method76(arg4, arg1, local53, local64, local77, local88, -1);
					} else {
						local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, arg4, arg1, arg0, local101.anInt101);
					}
					arg6.method258(arg8, arg7, 1, local113, local98, arg3, local127, 1, local156, 0);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x924;
					}
					if (local101.aBoolean25 && arg2 != null) {
						arg2.method130(local101.anInt110, arg1, arg3, local101.aBoolean32, local101.anInt102, arg8);
					}
				} else if (arg4 == 0) {
					if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
						local156 = local101.method76(0, arg1, local53, local64, local77, local88, -1);
					} else {
						local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 0, arg1, arg0, local101.anInt101);
					}
					arg6.method256(0, arg8, local127, anIntArray204[arg1], null, arg3, arg7, local113, local98, local156);
					if (arg1 == 0) {
						if (local101.aBoolean33) {
							this.aByteArrayArrayArray3[arg7][arg3][arg8] = 50;
							this.aByteArrayArrayArray3[arg7][arg3][arg8 + 1] = 50;
						}
						if (local101.aBoolean34) {
							this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local101.aBoolean33) {
							this.aByteArrayArrayArray3[arg7][arg3][arg8 + 1] = 50;
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8 + 1] = 50;
						}
						if (local101.aBoolean34) {
							this.anIntArrayArrayArray6[arg7][arg3][arg8 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local101.aBoolean33) {
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8] = 50;
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8 + 1] = 50;
						}
						if (local101.aBoolean34) {
							this.anIntArrayArrayArray6[arg7][arg3 + 1][arg8] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local101.aBoolean33) {
							this.aByteArrayArrayArray3[arg7][arg3][arg8] = 50;
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8] = 50;
						}
						if (local101.aBoolean34) {
							this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x492;
						}
					}
					if (local101.aBoolean25 && arg2 != null) {
						arg2.method129(arg4, local101.aBoolean32, arg1, arg3, arg8);
					}
					if (local101.anInt103 != 16) {
						arg6.method264(arg7, local101.anInt103, arg3, arg8);
					}
				} else if (arg4 == 1) {
					if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
						local156 = local101.method76(1, arg1, local53, local64, local77, local88, -1);
					} else {
						local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 1, arg1, arg0, local101.anInt101);
					}
					arg6.method256(0, arg8, local127, anIntArray202[arg1], null, arg3, arg7, local113, local98, local156);
					if (local101.aBoolean33) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray3[arg7][arg3][arg8 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray3[arg7][arg3][arg8] = 50;
						}
					}
					if (local101.aBoolean25 && arg2 != null) {
						arg2.method129(arg4, local101.aBoolean32, arg1, arg3, arg8);
					}
				} else {
					@Pc(865) int local865;
					@Pc(894) Class3_Sub1_Sub1 local894;
					if (arg4 == 2) {
						local865 = arg1 + 1 & 0x3;
						@Pc(884) Class3_Sub1_Sub1 local884;
						if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
							local884 = local101.method76(2, arg1 + 4, local53, local64, local77, local88, -1);
							local894 = local101.method76(2, local865, local53, local64, local77, local88, -1);
						} else {
							local884 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 2, arg1 + 4, arg0, local101.anInt101);
							local894 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 2, local865, arg0, local101.anInt101);
						}
						arg6.method256(anIntArray204[local865], arg8, local127, anIntArray204[arg1], local894, arg3, arg7, local113, local98, local884);
						if (local101.aBoolean34) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x249;
								this.anIntArrayArrayArray6[arg7][arg3][arg8 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray6[arg7][arg3][arg8 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg7][arg3 + 1][arg8] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray6[arg7][arg3 + 1][arg8] |= 0x249;
								this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x492;
								this.anIntArrayArrayArray6[arg7][arg3][arg8] |= 0x249;
							}
						}
						if (local101.aBoolean25 && arg2 != null) {
							arg2.method129(arg4, local101.aBoolean32, arg1, arg3, arg8);
						}
						if (local101.anInt103 != 16) {
							arg6.method264(arg7, local101.anInt103, arg3, arg8);
						}
					} else if (arg4 == 3) {
						if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
							local156 = local101.method76(3, arg1, local53, local64, local77, local88, -1);
						} else {
							local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 3, arg1, arg0, local101.anInt101);
						}
						arg6.method256(0, arg8, local127, anIntArray202[arg1], null, arg3, arg7, local113, local98, local156);
						if (local101.aBoolean33) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray3[arg7][arg3][arg8 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray3[arg7][arg3 + 1][arg8] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray3[arg7][arg3][arg8] = 50;
							}
						}
						if (local101.aBoolean25 && arg2 != null) {
							arg2.method129(arg4, local101.aBoolean32, arg1, arg3, arg8);
						}
					} else if (arg4 == 9) {
						if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
							local156 = local101.method76(arg4, arg1, local53, local64, local77, local88, -1);
						} else {
							local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, arg4, arg1, arg0, local101.anInt101);
						}
						arg6.method258(arg8, arg7, 1, local113, local98, arg3, local127, 1, local156, 0);
						if (local101.aBoolean25 && arg2 != null) {
							arg2.method130(local101.anInt110, arg1, arg3, local101.aBoolean32, local101.anInt102, arg8);
						}
					} else {
						if (local101.aBoolean22) {
							if (arg1 == 1) {
								local865 = local88;
								local88 = local77;
								local77 = local64;
								local64 = local53;
								local53 = local865;
							} else if (arg1 == 2) {
								local865 = local88;
								local88 = local64;
								local64 = local865;
								local865 = local77;
								local77 = local53;
								local53 = local865;
							} else if (arg1 == 3) {
								local865 = local88;
								local88 = local53;
								local53 = local64;
								local64 = local77;
								local77 = local865;
							}
						}
						if (arg4 == 4) {
							if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
								local156 = local101.method76(4, 0, local53, local64, local77, local88, -1);
							} else {
								local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 4, 0, arg0, local101.anInt101);
							}
							arg6.method257(local113, local98, 0, anIntArray204[arg1], local127, local156, arg8, arg1 * 512, 0, arg3, arg7);
						} else if (arg4 == 5) {
							local865 = 16;
							local254 = arg6.method274(arg7, arg3, arg8);
							if (local254 > 0) {
								local865 = Class8.method70(local254 >> 14 & 0x7FFF).anInt103;
							}
							if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
								local894 = local101.method76(4, 0, local53, local64, local77, local88, -1);
							} else {
								local894 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 4, 0, arg0, local101.anInt101);
							}
							arg6.method257(local113, local98, anIntArray203[arg1] * local865, anIntArray204[arg1], local127, local894, arg8, arg1 * 512, anIntArray201[arg1] * local865, arg3, arg7);
						} else if (arg4 == 6) {
							if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
								local156 = local101.method76(4, 0, local53, local64, local77, local88, -1);
							} else {
								local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 4, 0, arg0, local101.anInt101);
							}
							arg6.method257(local113, local98, 0, 256, local127, local156, arg8, arg1, 0, arg3, arg7);
						} else if (arg4 == 7) {
							if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
								local156 = local101.method76(4, 0, local53, local64, local77, local88, -1);
							} else {
								local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 4, 0, arg0, local101.anInt101);
							}
							arg6.method257(local113, local98, 0, 512, local127, local156, arg8, arg1, 0, arg3, arg7);
						} else if (arg4 == 8) {
							if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
								local156 = local101.method76(4, 0, local53, local64, local77, local88, -1);
							} else {
								local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 4, 0, arg0, local101.anInt101);
							}
							arg6.method257(local113, local98, 0, 768, local127, local156, arg8, arg1, 0, arg3, arg7);
						}
					}
				}
			} else if (!aBoolean179 || local101.aBoolean28 || local101.aBoolean31) {
				if (local101.anInt101 == -1 && local101.anIntArray18 == null) {
					local156 = local101.method76(22, arg1, local53, local64, local77, local88, -1);
				} else {
					local156 = new Class3_Sub1_Sub1_Sub2(local77, local64, local88, true, true, local53, 22, arg1, arg0, local101.anInt101);
				}
				arg6.method254(arg7, local113, arg3, local127, arg8, local156, local98);
				if (local101.aBoolean25 && local101.aBoolean28 && arg2 != null) {
					arg2.method131(arg3, arg8);
				}
			}
		} catch (@Pc(1639) RuntimeException local1639) {
			signlink.reporterror("14567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1639.toString());
			throw new RuntimeException();
		}
	}
}
