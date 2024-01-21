import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	private static boolean aBoolean21;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private static int anInt206 = -139;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt208 = -369;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt212 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt213 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt207 = -25580;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BII)Z")
	public static boolean method53(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) boolean local10 = true;
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(699, arg0);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local16.method481();
				if (local21 == 0) {
					return local10;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local16.method481();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local16.method467() >> 2;
						@Pc(73) int local73 = local64 + arg1;
						@Pc(77) int local77 = local58 + arg2;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method249(local18);
							if (local69 != 22 || !aBoolean20 || local90.aBoolean90 || local90.aBoolean97) {
								local10 &= local90.method253();
								local31 = true;
							}
						}
					}
					local36 = local16.method481();
					if (local36 == 0) {
						break;
					}
					local16.method467();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("90091, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mb;Lclient!vb;I)V")
	public static void method54(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class42_Sub1 arg1) {
		try {
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = arg0.method481();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(25) Class9 local25 = Class9.method249(local13);
				local25.method254(arg1);
				while (true) {
					@Pc(32) int local32 = arg0.method481();
					if (local32 == 0) {
						break;
					}
					arg0.method467();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("87469, " + arg0 + ", " + arg1 + ", " + -444 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method60(arg0 + 45365, arg1 + 91923, 4) + (method60(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method60(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method62(local3, local13);
		@Pc(29) int local29 = method62(local3 + 1, local13);
		@Pc(35) int local35 = method62(local3, local13 + 1);
		@Pc(43) int local43 = method62(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method61(local23, local29, local9, arg2);
		@Pc(55) int local55 = method61(local35, local43, local9, arg2);
		return method61(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray174[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method63(arg0 - 1, arg1 - 1) + method63(arg0 + 1, arg1 - 1) + method63(arg0 - 1, arg1 + 1) + method63(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method63(arg0 - 1, arg1) + method63(arg0 + 1, arg1) + method63(arg0, arg1 - 1) + method63(arg0, arg1 + 1);
		@Pc(59) int local59 = method63(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)Z")
	public static boolean method67(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method249(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method252(arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("94867, " + arg0 + ", " + false + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ic;II[[[IIILclient!s;BIII)V")
	public static void method68(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class37 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg3[arg4][arg9][arg1];
			@Pc(19) int local19 = arg3[arg4][arg9 + 1][arg1];
			@Pc(31) int local31 = arg3[arg4][arg9 + 1][arg1 + 1];
			@Pc(41) int local41 = arg3[arg4][arg9][arg1 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method249(arg2);
			@Pc(71) int local71 = arg9 + (arg1 << 7) + (arg2 << 14) + 1073741824;
			if (!local54.aBoolean90) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg5 << 6) + arg8);
			@Pc(102) Class1_Sub1_Sub1 local102;
			if (arg8 == 22) {
				if (local54.anInt522 == -1) {
					local102 = local54.method255(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, 22, local41);
				}
				arg6.method555(local51, arg7, arg1, (byte) 5, local102, local85, arg9, local71);
				if (local54.aBoolean88 && local54.aBoolean90) {
					arg0.method371(arg1, arg9);
				}
			} else {
				@Pc(195) int local195;
				if (arg8 == 10 || arg8 == 11) {
					if (local54.anInt522 == -1) {
						local102 = local54.method255(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, 10, local41);
					}
					if (local102 != null) {
						@Pc(182) int local182 = 0;
						if (arg8 == 11) {
							local182 += 256;
						}
						@Pc(198) int local198;
						if (arg5 == 1 || arg5 == 3) {
							local195 = local54.anInt521;
							local198 = local54.anInt520;
						} else {
							local195 = local54.anInt520;
							local198 = local54.anInt521;
						}
						arg6.method559(local71, local195, arg9, arg1, arg7, local182, local51, local102, local198, local85);
					}
					if (local54.aBoolean88) {
						arg0.method370(local54.aBoolean89, local54.anInt521, arg1, arg5, arg9, local54.anInt520);
					}
				} else if (arg8 >= 12) {
					if (local54.anInt522 == -1) {
						local102 = local54.method255(arg8, arg5, local9, local19, local31, local41, -1);
					} else {
						local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, arg8, local41);
					}
					arg6.method559(local71, 1, arg9, arg1, arg7, 0, local51, local102, 1, local85);
					if (local54.aBoolean88) {
						arg0.method370(local54.aBoolean89, local54.anInt521, arg1, arg5, arg9, local54.anInt520);
					}
				} else if (arg8 == 0) {
					if (local54.anInt522 == -1) {
						local102 = local54.method255(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, 0, local41);
					}
					arg6.method557(local71, arg9, local85, anIntArray18[arg5], 0, arg1, null, arg7, local51, local102);
					if (local54.aBoolean88) {
						arg0.method369(arg5, local54.aBoolean89, arg1, arg8, arg9);
					}
				} else if (arg8 == 1) {
					if (local54.anInt522 == -1) {
						local102 = local54.method255(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, 1, local41);
					}
					arg6.method557(local71, arg9, local85, anIntArray19[arg5], 0, arg1, null, arg7, local51, local102);
					if (local54.aBoolean88) {
						arg0.method369(arg5, local54.aBoolean89, arg1, arg8, arg9);
					}
				} else {
					@Pc(458) Class1_Sub1_Sub1 local458;
					@Pc(432) int local432;
					if (arg8 == 2) {
						local432 = arg5 + 1 & 0x3;
						@Pc(448) Class1_Sub1_Sub1 local448;
						if (local54.anInt522 == -1) {
							local448 = local54.method255(2, arg5 + 4, local9, local19, local31, local41, -1);
							local458 = local54.method255(2, local432, local9, local19, local31, local41, -1);
						} else {
							local448 = new Class1_Sub1_Sub1_Sub2(local9, arg5 + 4, 214, local19, arg2, local31, local54.anInt522, true, 2, local41);
							local458 = new Class1_Sub1_Sub1_Sub2(local9, local432, 214, local19, arg2, local31, local54.anInt522, true, 2, local41);
						}
						arg6.method557(local71, arg9, local85, anIntArray18[arg5], anIntArray18[local432], arg1, local458, arg7, local51, local448);
						if (local54.aBoolean88) {
							arg0.method369(arg5, local54.aBoolean89, arg1, arg8, arg9);
						}
					} else if (arg8 == 3) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, 3, local41);
						}
						arg6.method557(local71, arg9, local85, anIntArray19[arg5], 0, arg1, null, arg7, local51, local102);
						if (local54.aBoolean88) {
							arg0.method369(arg5, local54.aBoolean89, arg1, arg8, arg9);
						}
					} else if (arg8 == 9) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(arg8, arg5, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, arg5, 214, local19, arg2, local31, local54.anInt522, true, arg8, local41);
						}
						arg6.method559(local71, 1, arg9, arg1, arg7, 0, local51, local102, 1, local85);
						if (local54.aBoolean88) {
							arg0.method370(local54.aBoolean89, local54.anInt521, arg1, arg5, arg9, local54.anInt520);
						}
					} else if (arg8 == 4) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(4, 0, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, 0, 214, local19, arg2, local31, local54.anInt522, true, 4, local41);
						}
						arg6.method558(arg7, 0, arg9, local85, arg1, anIntArray18[arg5], arg5 * 512, local102, 0, local51, local71);
					} else if (arg8 == 5) {
						local432 = 16;
						local195 = arg6.method575(arg7, arg9, arg1);
						if (local195 > 0) {
							local432 = Class9.method249(local195 >> 14 & 0x7FFF).anInt523;
						}
						if (local54.anInt522 == -1) {
							local458 = local54.method255(4, 0, local9, local19, local31, local41, -1);
						} else {
							local458 = new Class1_Sub1_Sub1_Sub2(local9, 0, 214, local19, arg2, local31, local54.anInt522, true, 4, local41);
						}
						arg6.method558(arg7, anIntArray21[arg5] * local432, arg9, local85, arg1, anIntArray18[arg5], arg5 * 512, local458, anIntArray20[arg5] * local432, local51, local71);
					} else if (arg8 == 6) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(4, 0, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, 0, 214, local19, arg2, local31, local54.anInt522, true, 4, local41);
						}
						arg6.method558(arg7, 0, arg9, local85, arg1, 256, arg5, local102, 0, local51, local71);
					} else if (arg8 == 7) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(4, 0, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, 0, 214, local19, arg2, local31, local54.anInt522, true, 4, local41);
						}
						arg6.method558(arg7, 0, arg9, local85, arg1, 512, arg5, local102, 0, local51, local71);
					} else if (arg8 == 8) {
						if (local54.anInt522 == -1) {
							local102 = local54.method255(4, 0, local9, local19, local31, local41, -1);
						} else {
							local102 = new Class1_Sub1_Sub1_Sub2(local9, 0, 214, local19, arg2, local31, local54.anInt522, true, 4, local41);
						}
						arg6.method558(arg7, 0, arg9, local85, arg1, 768, arg5, local102, 0, local51, local71);
					}
				}
			}
		} catch (@Pc(928) RuntimeException local928) {
			signlink.reporterror("6012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 9 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local928.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[I[[[BII)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt210 = arg4;
			this.anInt211 = arg0;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt210][this.anInt211];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt210][this.anInt211];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt210][this.anInt211];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt210][this.anInt211];
			this.anIntArrayArrayArray2 = new int[4][this.anInt210 + 1][this.anInt211 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt210 + 1][this.anInt211 + 1];
			this.anIntArrayArray1 = new int[this.anInt210 + 1][this.anInt211 + 1];
			this.anIntArray13 = new int[this.anInt211];
			this.anIntArray14 = new int[this.anInt211];
			this.anIntArray15 = new int[this.anInt211];
			this.anIntArray16 = new int[this.anInt211];
			this.anIntArray17 = new int[this.anInt211];
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("46189, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBII)V")
	public void method51(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) byte local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < Class19.anInt690; local19++) {
				if (Class19.aClass19Array1[local19].aString26.equalsIgnoreCase("water")) {
					local17 = (byte) (local19 + 1);
					break;
				}
			}
			for (@Pc(41) int local41 = arg0; local41 < arg0 + 64; local41++) {
				for (@Pc(45) int local45 = arg2; local45 < arg2 + 64; local45++) {
					if (local45 >= 0 && local45 < this.anInt210 && local41 >= 0 && local41 < this.anInt211) {
						this.aByteArrayArrayArray3[0][local45][local41] = local17;
						for (@Pc(70) int local70 = 0; local70 < 4; local70++) {
							this.anIntArrayArrayArray1[local70][local45][local41] = 0;
							this.aByteArrayArrayArray1[local70][local45][local41] = 0;
						}
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("98113, " + 64 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 64 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIII)V")
	public void method52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(699, arg0);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg3;
						@Pc(27) int local27 = local17 + arg2;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method467();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -method59(local23 + arg4 + 932731, local27 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method467();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method468();
									this.aByteArrayArrayArray4[local9][local23][local27] = (byte) ((local49 - 2) / 4);
									this.aByteArrayArrayArray5[local9][local23][local27] = (byte) (local49 - 2 & 0x3);
								} else if (local49 <= 81) {
									this.aByteArrayArrayArray1[local9][local23][local27] = (byte) (local49 - 49);
								} else {
									this.aByteArrayArrayArray2[local9][local23][local27] = (byte) (local49 - 81);
								}
							}
						} else {
							while (true) {
								local49 = local7.method467();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method467();
									break;
								}
								if (local49 <= 49) {
									local7.method467();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("78786, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ic;Lclient!s;III[B)V")
	public void method55(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(699, arg4);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method481();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method481();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method467();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg3;
					@Pc(74) int local74 = local45 + arg2;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class17 local101 = null;
						if (local86 >= 0) {
							local101 = arg0[local86];
						}
						this.method56(local62, local9, local101, local55, local70, arg1, local66, local74);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("77776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -369 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!ic;IILclient!s;II)V")
	private void method56(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean20) {
				if ((this.aByteArrayArrayArray1[arg3][arg4][arg7] & 0x10) != 0) {
					return;
				}
				if (this.method58(arg7, arg3, arg4) != anInt209) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg3][arg4][arg7];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg7];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg7 + 1];
			@Pc(71) int local71 = this.anIntArrayArrayArray1[arg3][arg4][arg7 + 1];
			@Pc(81) int local81 = local33 + local44 + local60 + local71 >> 2;
			@Pc(84) Class9 local84 = Class9.method249(arg1);
			@Pc(96) int local96 = arg4 + (arg7 << 7) + (arg1 << 14) + 1073741824;
			if (!local84.aBoolean90) {
				local96 += Integer.MIN_VALUE;
			}
			@Pc(110) byte local110 = (byte) ((arg6 << 6) + arg0);
			@Pc(136) Class1_Sub1_Sub1 local136;
			if (arg0 != 22) {
				@Pc(231) int local231;
				if (arg0 == 10 || arg0 == 11) {
					if (local84.anInt522 == -1) {
						local136 = local84.method255(10, arg6, local33, local44, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, 10, local71);
					}
					if (local136 != null) {
						@Pc(218) int local218 = 0;
						if (arg0 == 11) {
							local218 += 256;
						}
						@Pc(234) int local234;
						if (arg6 == 1 || arg6 == 3) {
							local231 = local84.anInt521;
							local234 = local84.anInt520;
						} else {
							local231 = local84.anInt520;
							local234 = local84.anInt521;
						}
						if (arg5.method559(local96, local231, arg4, arg7, arg3, local218, local81, local136, local234, local110) && local84.aBoolean96) {
							@Pc(265) Class1_Sub1_Sub1_Sub5 local265;
							if (local136 instanceof Class1_Sub1_Sub1_Sub5) {
								local265 = (Class1_Sub1_Sub1_Sub5) local136;
							} else {
								local265 = local84.method255(10, arg6, local33, local44, local60, local71, -1);
							}
							if (local265 != null) {
								for (@Pc(281) int local281 = 0; local281 <= local231; local281++) {
									for (@Pc(285) int local285 = 0; local285 <= local234; local285++) {
										@Pc(292) int local292 = local265.anInt552 / 4;
										if (local292 > 30) {
											local292 = 30;
										}
										if (local292 > this.aByteArrayArrayArray6[arg3][arg4 + local281][arg7 + local285]) {
											this.aByteArrayArrayArray6[arg3][arg4 + local281][arg7 + local285] = (byte) local292;
										}
									}
								}
							}
						}
					}
					if (local84.aBoolean88 && arg2 != null) {
						arg2.method370(local84.aBoolean89, local84.anInt521, arg7, arg6, arg4, local84.anInt520);
					}
				} else if (arg0 >= 12) {
					if (local84.anInt522 == -1) {
						local136 = local84.method255(arg0, arg6, local33, local44, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, arg0, local71);
					}
					arg5.method559(local96, 1, arg4, arg7, arg3, 0, local81, local136, 1, local110);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x924;
					}
					if (local84.aBoolean88 && arg2 != null) {
						arg2.method370(local84.aBoolean89, local84.anInt521, arg7, arg6, arg4, local84.anInt520);
					}
				} else if (arg0 == 0) {
					if (local84.anInt522 == -1) {
						local136 = local84.method255(0, arg6, local33, local44, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, 0, local71);
					}
					arg5.method557(local96, arg4, local110, anIntArray18[arg6], 0, arg7, null, arg3, local81, local136);
					if (arg6 == 0) {
						if (local84.aBoolean96) {
							this.aByteArrayArrayArray6[arg3][arg4][arg7] = 50;
							this.aByteArrayArrayArray6[arg3][arg4][arg7 + 1] = 50;
						}
						if (local84.aBoolean93) {
							this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local84.aBoolean96) {
							this.aByteArrayArrayArray6[arg3][arg4][arg7 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7 + 1] = 50;
						}
						if (local84.aBoolean93) {
							this.anIntArrayArrayArray2[arg3][arg4][arg7 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local84.aBoolean96) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7 + 1] = 50;
						}
						if (local84.aBoolean93) {
							this.anIntArrayArrayArray2[arg3][arg4 + 1][arg7] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local84.aBoolean96) {
							this.aByteArrayArrayArray6[arg3][arg4][arg7] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7] = 50;
						}
						if (local84.aBoolean93) {
							this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x492;
						}
					}
					if (local84.aBoolean88 && arg2 != null) {
						arg2.method369(arg6, local84.aBoolean89, arg7, arg0, arg4);
					}
					if (local84.anInt523 != 16) {
						arg5.method565(arg7, arg3, arg4, local84.anInt523);
					}
				} else if (arg0 == 1) {
					if (local84.anInt522 == -1) {
						local136 = local84.method255(1, arg6, local33, local44, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, 1, local71);
					}
					arg5.method557(local96, arg4, local110, anIntArray19[arg6], 0, arg7, null, arg3, local81, local136);
					if (local84.aBoolean96) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray6[arg3][arg4][arg7 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray6[arg3][arg4][arg7] = 50;
						}
					}
					if (local84.aBoolean88 && arg2 != null) {
						arg2.method369(arg6, local84.aBoolean89, arg7, arg0, arg4);
					}
				} else {
					@Pc(859) Class1_Sub1_Sub1 local859;
					@Pc(833) int local833;
					if (arg0 == 2) {
						local833 = arg6 + 1 & 0x3;
						@Pc(849) Class1_Sub1_Sub1 local849;
						if (local84.anInt522 == -1) {
							local849 = local84.method255(2, arg6 + 4, local33, local44, local60, local71, -1);
							local859 = local84.method255(2, local833, local33, local44, local60, local71, -1);
						} else {
							local849 = new Class1_Sub1_Sub1_Sub2(local33, arg6 + 4, 214, local44, arg1, local60, local84.anInt522, true, 2, local71);
							local859 = new Class1_Sub1_Sub1_Sub2(local33, local833, 214, local44, arg1, local60, local84.anInt522, true, 2, local71);
						}
						arg5.method557(local96, arg4, local110, anIntArray18[arg6], anIntArray18[local833], arg7, local859, arg3, local81, local849);
						if (local84.aBoolean93) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg7 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray2[arg3][arg4][arg7 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg7] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg7] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4][arg7] |= 0x249;
							}
						}
						if (local84.aBoolean88 && arg2 != null) {
							arg2.method369(arg6, local84.aBoolean89, arg7, arg0, arg4);
						}
						if (local84.anInt523 != 16) {
							arg5.method565(arg7, arg3, arg4, local84.anInt523);
						}
					} else if (arg0 == 3) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(3, arg6, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, 3, local71);
						}
						arg5.method557(local96, arg4, local110, anIntArray19[arg6], 0, arg7, null, arg3, local81, local136);
						if (local84.aBoolean96) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray6[arg3][arg4][arg7 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg7] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray6[arg3][arg4][arg7] = 50;
							}
						}
						if (local84.aBoolean88 && arg2 != null) {
							arg2.method369(arg6, local84.aBoolean89, arg7, arg0, arg4);
						}
					} else if (arg0 == 9) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(arg0, arg6, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, arg0, local71);
						}
						arg5.method559(local96, 1, arg4, arg7, arg3, 0, local81, local136, 1, local110);
						if (local84.aBoolean88 && arg2 != null) {
							arg2.method370(local84.aBoolean89, local84.anInt521, arg7, arg6, arg4, local84.anInt520);
						}
					} else if (arg0 == 4) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(4, 0, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, 0, 214, local44, arg1, local60, local84.anInt522, true, 4, local71);
						}
						arg5.method558(arg3, 0, arg4, local110, arg7, anIntArray18[arg6], arg6 * 512, local136, 0, local81, local96);
					} else if (arg0 == 5) {
						local833 = 16;
						local231 = arg5.method575(arg3, arg4, arg7);
						if (local231 > 0) {
							local833 = Class9.method249(local231 >> 14 & 0x7FFF).anInt523;
						}
						if (local84.anInt522 == -1) {
							local859 = local84.method255(4, 0, local33, local44, local60, local71, -1);
						} else {
							local859 = new Class1_Sub1_Sub1_Sub2(local33, 0, 214, local44, arg1, local60, local84.anInt522, true, 4, local71);
						}
						arg5.method558(arg3, anIntArray21[arg6] * local833, arg4, local110, arg7, anIntArray18[arg6], arg6 * 512, local859, anIntArray20[arg6] * local833, local81, local96);
					} else if (arg0 == 6) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(4, 0, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, 0, 214, local44, arg1, local60, local84.anInt522, true, 4, local71);
						}
						arg5.method558(arg3, 0, arg4, local110, arg7, 256, arg6, local136, 0, local81, local96);
					} else if (arg0 == 7) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(4, 0, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, 0, 214, local44, arg1, local60, local84.anInt522, true, 4, local71);
						}
						arg5.method558(arg3, 0, arg4, local110, arg7, 512, arg6, local136, 0, local81, local96);
					} else if (arg0 == 8) {
						if (local84.anInt522 == -1) {
							local136 = local84.method255(4, 0, local33, local44, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, 0, 214, local44, arg1, local60, local84.anInt522, true, 4, local71);
						}
						arg5.method558(arg3, 0, arg4, local110, arg7, 768, arg6, local136, 0, local81, local96);
					}
				}
			} else if (!aBoolean20 || local84.aBoolean90 || local84.aBoolean97) {
				if (local84.anInt522 == -1) {
					local136 = local84.method255(22, arg6, local33, local44, local60, local71, -1);
				} else {
					local136 = new Class1_Sub1_Sub1_Sub2(local33, arg6, 214, local44, arg1, local60, local84.anInt522, true, 22, local71);
				}
				arg5.method555(local81, arg3, arg7, (byte) 5, local136, local110, arg4, local96);
				if (local84.aBoolean88 && local84.aBoolean90 && arg2 != null) {
					arg2.method371(arg7, arg4);
				}
			}
		} catch (@Pc(1535) RuntimeException local1535) {
			signlink.reporterror("76277, " + arg0 + ", " + -936 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1535.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;I[Lclient!ic;)V")
	public void method57(@OriginalArg(0) Class37 arg0, @OriginalArg(2) Class17[] arg1) {
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
								arg1[local27].method371(local11, local7);
							}
						}
					}
				}
			}
			if (aBoolean21) {
				anInt212 = 0;
				anInt213 = 0;
			} else {
				anInt212 += (int) (Math.random() * 5.0D) - 2;
				if (anInt212 < -8) {
					anInt212 = -8;
				}
				if (anInt212 > 8) {
					anInt212 = 8;
				}
				anInt213 += (int) (Math.random() * 5.0D) - 2;
				if (anInt213 < -16) {
					anInt213 = -16;
				}
				if (anInt213 > 16) {
					anInt213 = 16;
				}
			}
			@Pc(146) int local146;
			@Pc(152) int local152;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(182) int local182;
			@Pc(204) int local204;
			@Pc(217) int local217;
			@Pc(223) int local223;
			@Pc(227) int local227;
			@Pc(233) int local233;
			@Pc(249) int local249;
			@Pc(297) int local297;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(121) byte[][] local121 = this.aByteArrayArrayArray6[local7];
				local146 = (int) Math.sqrt((double) 5100);
				local152 = local146 * 768 >> 8;
				for (local154 = 1; local154 < this.anInt211 - 1; local154++) {
					for (local158 = 1; local158 < this.anInt210 - 1; local158++) {
						local182 = this.anIntArrayArrayArray1[local7][local158 + 1][local154] - this.anIntArrayArrayArray1[local7][local158 - 1][local154];
						local204 = this.anIntArrayArrayArray1[local7][local158][local154 + 1] - this.anIntArrayArrayArray1[local7][local158][local154 - 1];
						local217 = (int) Math.sqrt((double) (local182 * local182 + local204 * local204 + 65536));
						local223 = (local182 << 8) / local217;
						local227 = 65536 / local217;
						local233 = (local204 << 8) / local217;
						local249 = (local223 * -50 + local227 * -10 + local233 * -50) / local152 + 96;
						local297 = (local121[local158 - 1][local154] >> 2) + (local121[local158 + 1][local154] >> 3) + (local121[local158][local154 - 1] >> 2) + (local121[local158][local154 + 1] >> 3) + (local121[local158][local154] >> 1);
						this.anIntArrayArray1[local158][local154] = local249 - local297;
					}
				}
				for (local158 = 0; local158 < this.anInt211; local158++) {
					this.anIntArray13[local158] = 0;
					this.anIntArray14[local158] = 0;
					this.anIntArray15[local158] = 0;
					this.anIntArray16[local158] = 0;
					this.anIntArray17[local158] = 0;
				}
				for (local182 = -5; local182 < this.anInt210 + 5; local182++) {
					for (local204 = 0; local204 < this.anInt211; local204++) {
						local217 = local182 + 5;
						@Pc(432) int local432;
						if (local217 >= 0 && local217 < this.anInt210) {
							local223 = this.aByteArrayArrayArray2[local7][local217][local204] & 0xFF;
							if (local223 > 0) {
								@Pc(391) Class19 local391 = Class19.aClass19Array1[local223 - 1];
								this.anIntArray13[local204] += local391.anInt696;
								this.anIntArray14[local204] += local391.anInt694;
								this.anIntArray15[local204] += local391.anInt695;
								this.anIntArray16[local204] += local391.anInt697;
								local432 = this.anIntArray17[local204]++;
							}
						}
						local223 = local182 - 5;
						if (local223 >= 0 && local223 < this.anInt210) {
							local227 = this.aByteArrayArrayArray2[local7][local223][local204] & 0xFF;
							if (local227 > 0) {
								@Pc(464) Class19 local464 = Class19.aClass19Array1[local227 - 1];
								this.anIntArray13[local204] -= local464.anInt696;
								this.anIntArray14[local204] -= local464.anInt694;
								this.anIntArray15[local204] -= local464.anInt695;
								this.anIntArray16[local204] -= local464.anInt697;
								local432 = this.anIntArray17[local204]--;
							}
						}
					}
					if (local182 >= 1 && local182 < this.anInt210 - 1) {
						local217 = 0;
						local223 = 0;
						local227 = 0;
						local233 = 0;
						local249 = 0;
						for (local297 = -5; local297 < this.anInt211 + 5; local297++) {
							@Pc(540) int local540 = local297 + 5;
							if (local540 >= 0 && local540 < this.anInt211) {
								local217 += this.anIntArray13[local540];
								local223 += this.anIntArray14[local540];
								local227 += this.anIntArray15[local540];
								local233 += this.anIntArray16[local540];
								local249 += this.anIntArray17[local540];
							}
							@Pc(585) int local585 = local297 - 5;
							if (local585 >= 0 && local585 < this.anInt211) {
								local217 -= this.anIntArray13[local585];
								local223 -= this.anIntArray14[local585];
								local227 -= this.anIntArray15[local585];
								local233 -= this.anIntArray16[local585];
								local249 -= this.anIntArray17[local585];
							}
							if (local297 >= 1 && local297 < this.anInt211 - 1 && (!aBoolean20 || (this.aByteArrayArrayArray1[local7][local182][local297] & 0x10) == 0 && this.method58(local297, local7, local182) == anInt209)) {
								@Pc(668) int local668 = this.aByteArrayArrayArray2[local7][local182][local297] & 0xFF;
								@Pc(679) int local679 = this.aByteArrayArrayArray3[local7][local182][local297] & 0xFF;
								if (local668 > 0 || local679 > 0) {
									@Pc(692) int local692 = this.anIntArrayArrayArray1[local7][local182][local297];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local182 + 1][local297];
									@Pc(716) int local716 = this.anIntArrayArrayArray1[local7][local182 + 1][local297 + 1];
									@Pc(727) int local727 = this.anIntArrayArrayArray1[local7][local182][local297 + 1];
									@Pc(734) int local734 = this.anIntArrayArray1[local182][local297];
									@Pc(743) int local743 = this.anIntArrayArray1[local182 + 1][local297];
									@Pc(754) int local754 = this.anIntArrayArray1[local182 + 1][local297 + 1];
									@Pc(763) int local763 = this.anIntArrayArray1[local182][local297 + 1];
									@Pc(765) int local765 = -1;
									@Pc(767) int local767 = -1;
									@Pc(775) int local775;
									@Pc(779) int local779;
									if (local668 > 0) {
										local775 = local217 * 256 / local233;
										local779 = local223 / local249;
										@Pc(783) int local783 = local227 / local249;
										local765 = this.method66(local775, local779, local783);
										@Pc(795) int local795 = local775 + anInt212 & 0xFF;
										local783 += anInt213;
										if (local783 < 0) {
											local783 = 0;
										} else if (local783 > 255) {
											local783 = 255;
										}
										local767 = this.method66(local795, local779, local783);
									}
									if (local7 > 0) {
										@Pc(820) boolean local820 = true;
										if (local668 == 0 && this.aByteArrayArrayArray4[local7][local182][local297] != 0) {
											local820 = false;
										}
										if (local679 > 0 && !Class19.aClass19Array1[local679 - 1].aBoolean139) {
											local820 = false;
										}
										if (local820 && local692 == local703 && local692 == local716 && local692 == local727) {
											this.anIntArrayArrayArray2[local7][local182][local297] |= 0x924;
										}
									}
									local775 = 0;
									if (local765 != -1) {
										local775 = Class1_Sub1_Sub2_Sub1.anIntArray178[method64(local767, 96)];
									}
									if (local679 == 0) {
										arg0.method554(local7, local182, local297, 0, 0, -1, local692, local703, local716, local727, method64(local765, local734), method64(local765, local743), method64(local765, local754), method64(local765, local763), 0, 0, 0, 0, local775, 0);
									} else {
										local779 = this.aByteArrayArrayArray4[local7][local182][local297] + 1;
										@Pc(932) byte local932 = this.aByteArrayArrayArray5[local7][local182][local297];
										@Pc(938) Class19 local938 = Class19.aClass19Array1[local679 - 1];
										@Pc(941) int local941 = local938.anInt692;
										@Pc(949) int local949;
										@Pc(947) int local947;
										if (local941 >= 0) {
											local947 = Class1_Sub1_Sub2_Sub1.method357(local941);
											local949 = -1;
										} else if (local938.anInt691 == 16711935) {
											local947 = 0;
											local949 = -2;
											local941 = -1;
										} else {
											local949 = this.method66(local938.anInt693, local938.anInt694, local938.anInt695);
											local947 = Class1_Sub1_Sub2_Sub1.anIntArray178[this.method65(local938.anInt698, 96)];
										}
										arg0.method554(local7, local182, local297, local779, local932, local941, local692, local703, local716, local727, method64(local765, local734), method64(local765, local743), method64(local765, local754), method64(local765, local763), this.method65(local949, local734), this.method65(local949, local743), this.method65(local949, local754), this.method65(local949, local763), local775, local947);
									}
								}
							}
						}
					}
				}
				for (local204 = 1; local204 < this.anInt211 - 1; local204++) {
					for (local217 = 1; local217 < this.anInt210 - 1; local217++) {
						arg0.method553(local7, local217, local204, this.method58(local204, local7, local217));
					}
				}
			}
			if (!aBoolean21) {
				arg0.method580();
			}
			for (local11 = 0; local11 < this.anInt210; local11++) {
				for (local27 = 0; local27 < this.anInt211; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method551(local11, local27, (byte) 4);
					}
				}
			}
			if (!aBoolean21) {
				local27 = 1;
				@Pc(1125) int local1125 = 2;
				@Pc(1127) int local1127 = 4;
				for (@Pc(1129) int local1129 = 0; local1129 < 4; local1129++) {
					if (local1129 > 0) {
						local27 <<= 0x3;
						local1125 <<= 0x3;
						local1127 <<= 0x3;
					}
					for (@Pc(1147) int local1147 = 0; local1147 <= local1129; local1147++) {
						for (local146 = 0; local146 <= this.anInt211; local146++) {
							for (local152 = 0; local152 <= this.anInt210; local152++) {
								if ((this.anIntArrayArrayArray2[local1147][local152][local146] & local27) != 0) {
									local154 = local146;
									local158 = local146;
									local182 = local1147;
									local204 = local1147;
									while (local154 > 0 && (this.anIntArrayArrayArray2[local1147][local152][local154 - 1] & local27) != 0) {
										local154--;
									}
									while (local158 < this.anInt211 && (this.anIntArrayArrayArray2[local1147][local152][local158 + 1] & local27) != 0) {
										local158++;
									}
									label335: while (local182 > 0) {
										for (local217 = local154; local217 <= local158; local217++) {
											if ((this.anIntArrayArrayArray2[local182 - 1][local152][local217] & local27) == 0) {
												break label335;
											}
										}
										local182--;
									}
									label324: while (local204 < local1129) {
										for (local217 = local154; local217 <= local158; local217++) {
											if ((this.anIntArrayArrayArray2[local204 + 1][local152][local217] & local27) == 0) {
												break label324;
											}
										}
										local204++;
									}
									local217 = (local204 + 1 - local182) * (local158 + 1 - local154);
									if (local217 >= 8) {
										local227 = this.anIntArrayArrayArray1[local204][local152][local154] - 240;
										local233 = this.anIntArrayArrayArray1[local182][local152][local154];
										Class37.method552(1, local158 * 128 + 128, local152 * 128, local227, local233, local1129, local154 * 128, local152 * 128);
										for (local249 = local182; local249 <= local204; local249++) {
											for (local297 = local154; local297 <= local158; local297++) {
												this.anIntArrayArrayArray2[local249][local152][local297] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1147][local152][local146] & local1125) != 0) {
									local154 = local152;
									local158 = local152;
									local182 = local1147;
									local204 = local1147;
									while (local154 > 0 && (this.anIntArrayArrayArray2[local1147][local154 - 1][local146] & local1125) != 0) {
										local154--;
									}
									while (local158 < this.anInt210 && (this.anIntArrayArrayArray2[local1147][local158 + 1][local146] & local1125) != 0) {
										local158++;
									}
									label388: while (local182 > 0) {
										for (local217 = local154; local217 <= local158; local217++) {
											if ((this.anIntArrayArrayArray2[local182 - 1][local217][local146] & local1125) == 0) {
												break label388;
											}
										}
										local182--;
									}
									label377: while (local204 < local1129) {
										for (local217 = local154; local217 <= local158; local217++) {
											if ((this.anIntArrayArrayArray2[local204 + 1][local217][local146] & local1125) == 0) {
												break label377;
											}
										}
										local204++;
									}
									local217 = (local204 + 1 - local182) * (local158 + 1 - local154);
									if (local217 >= 8) {
										local227 = this.anIntArrayArrayArray1[local204][local154][local146] - 240;
										local233 = this.anIntArrayArrayArray1[local182][local154][local146];
										Class37.method552(2, local146 * 128, local154 * 128, local227, local233, local1129, local146 * 128, local158 * 128 + 128);
										for (local249 = local182; local249 <= local204; local249++) {
											for (local297 = local154; local297 <= local158; local297++) {
												this.anIntArrayArrayArray2[local249][local297][local146] &= ~local1125;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1147][local152][local146] & local1127) != 0) {
									local154 = local152;
									local158 = local152;
									local182 = local146;
									local204 = local146;
									while (local182 > 0 && (this.anIntArrayArrayArray2[local1147][local152][local182 - 1] & local1127) != 0) {
										local182--;
									}
									while (local204 < this.anInt211 && (this.anIntArrayArrayArray2[local1147][local152][local204 + 1] & local1127) != 0) {
										local204++;
									}
									label441: while (local154 > 0) {
										for (local217 = local182; local217 <= local204; local217++) {
											if ((this.anIntArrayArrayArray2[local1147][local154 - 1][local217] & local1127) == 0) {
												break label441;
											}
										}
										local154--;
									}
									label430: while (local158 < this.anInt210) {
										for (local217 = local182; local217 <= local204; local217++) {
											if ((this.anIntArrayArrayArray2[local1147][local158 + 1][local217] & local1127) == 0) {
												break label430;
											}
										}
										local158++;
									}
									if ((local158 + 1 - local154) * (local204 + 1 - local182) >= 4) {
										local217 = this.anIntArrayArrayArray1[local1147][local154][local182];
										Class37.method552(4, local204 * 128 + 128, local154 * 128, local217, local217, local1129, local182 * 128, local158 * 128 + 128);
										for (local223 = local154; local223 <= local158; local223++) {
											for (local227 = local182; local227 <= local204; local227++) {
												this.anIntArrayArrayArray2[local1147][local223][local227] &= ~local1127;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1762) RuntimeException local1762) {
			signlink.reporterror("85767, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local1762.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("84326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)I")
	private int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
}
