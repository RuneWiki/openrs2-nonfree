import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt203;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	private static boolean aBoolean27;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private static boolean aBoolean25 = true;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt202 = -179;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean26 = true;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt206 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt207 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt201 = 336;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "B")
	private byte aByte9 = -104;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt205;

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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BI)Z")
	public static boolean method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, true);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local9.method482();
				if (local22 == 0) {
					return local3;
				}
				local11 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local9.method482();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local9.method468() >> 2;
						@Pc(74) int local74 = local65 + arg1;
						@Pc(78) int local78 = local59 + arg0;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class9 local91 = Class9.method250(local11);
							if (local70 != 22 || !aBoolean26 || local91.aBoolean96 || local91.aBoolean103) {
								local3 &= local91.method254();
								local32 = true;
							}
						}
					}
					local37 = local9.method482();
					if (local37 == 0) {
						break;
					}
					local9.method468();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("47428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -179 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mb;Lclient!vb;Z)V")
	public static void method54(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class42_Sub1 arg1) {
		try {
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = arg0.method482();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(24) Class9 local24 = Class9.method250(local12);
				local24.method255(arg1);
				while (true) {
					@Pc(31) int local31 = arg0.method482();
					if (local31 == 0) {
						break;
					}
					arg0.method468();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("70378, " + arg0 + ", " + arg1 + ", " + false + ", " + local42.toString());
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
	public static boolean method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(2) Class9 local2 = Class9.method250(arg0);
			if (arg2 != -81) {
				throw new NullPointerException();
			}
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method253(arg1);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("37367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII[[[IILclient!ic;ILclient!s;I)V")
	public static void method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class37 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg4[arg5][arg9][arg2];
			@Pc(19) int local19 = arg4[arg5][arg9 + 1][arg2];
			@Pc(31) int local31 = arg4[arg5][arg9 + 1][arg2 + 1];
			@Pc(41) int local41 = arg4[arg5][arg9][arg2 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method250(arg0);
			@Pc(66) int local66 = arg9 + (arg2 << 7) + (arg0 << 14) + 1073741824;
			if (!local54.aBoolean96) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg7 << 6) + arg1);
			@Pc(105) Class1_Sub1_Sub1 local105;
			if (arg1 == 22) {
				if (local54.anInt519 == -1) {
					local105 = local54.method256(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local105 = new Class1_Sub1_Sub1_Sub2(22, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
				}
				arg8.method556(local105, arg9, local66, local51, arg2, arg3, local80);
				if (local54.aBoolean94 && local54.aBoolean96) {
					arg6.method372(arg9, arg2);
				}
			} else {
				@Pc(198) int local198;
				if (arg1 == 10 || arg1 == 11) {
					if (local54.anInt519 == -1) {
						local105 = local54.method256(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(10, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
					}
					if (local105 != null) {
						@Pc(185) int local185 = 0;
						if (arg1 == 11) {
							local185 += 256;
						}
						@Pc(201) int local201;
						if (arg7 == 1 || arg7 == 3) {
							local198 = local54.anInt518;
							local201 = local54.anInt517;
						} else {
							local198 = local54.anInt517;
							local201 = local54.anInt518;
						}
						arg8.method560(local51, arg9, local185, local66, local105, arg2, local201, arg3, local198, local80);
					}
					if (local54.aBoolean94) {
						arg6.method371(arg9, local54.anInt517, local54.aBoolean95, arg7, local54.anInt518, arg2);
					}
				} else if (arg1 >= 12) {
					if (local54.anInt519 == -1) {
						local105 = local54.method256(arg1, arg7, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(arg1, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
					}
					arg8.method560(local51, arg9, 0, local66, local105, arg2, 1, arg3, 1, local80);
					if (local54.aBoolean94) {
						arg6.method371(arg9, local54.anInt517, local54.aBoolean95, arg7, local54.anInt518, arg2);
					}
				} else if (arg1 == 0) {
					if (local54.anInt519 == -1) {
						local105 = local54.method256(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(0, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
					}
					arg8.method558(arg9, local105, 0, anIntArray18[arg7], local80, arg3, null, local51, local66, arg2);
					if (local54.aBoolean94) {
						arg6.method370(arg7, arg1, arg2, arg9, local54.aBoolean95);
					}
				} else if (arg1 == 1) {
					if (local54.anInt519 == -1) {
						local105 = local54.method256(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(1, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
					}
					arg8.method558(arg9, local105, 0, anIntArray19[arg7], local80, arg3, null, local51, local66, arg2);
					if (local54.aBoolean94) {
						arg6.method370(arg7, arg1, arg2, arg9, local54.aBoolean95);
					}
				} else {
					@Pc(461) Class1_Sub1_Sub1 local461;
					@Pc(435) int local435;
					if (arg1 == 2) {
						local435 = arg7 + 1 & 0x3;
						@Pc(451) Class1_Sub1_Sub1 local451;
						if (local54.anInt519 == -1) {
							local451 = local54.method256(2, arg7 + 4, local9, local19, local31, local41, -1);
							local461 = local54.method256(2, local435, local9, local19, local31, local41, -1);
						} else {
							local451 = new Class1_Sub1_Sub1_Sub2(2, arg0, local31, local54.anInt519, arg7 + 4, 0, true, local19, local41, local9);
							local461 = new Class1_Sub1_Sub1_Sub2(2, arg0, local31, local54.anInt519, local435, 0, true, local19, local41, local9);
						}
						arg8.method558(arg9, local451, anIntArray18[local435], anIntArray18[arg7], local80, arg3, local461, local51, local66, arg2);
						if (local54.aBoolean94) {
							arg6.method370(arg7, arg1, arg2, arg9, local54.aBoolean95);
						}
					} else if (arg1 == 3) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(3, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
						}
						arg8.method558(arg9, local105, 0, anIntArray19[arg7], local80, arg3, null, local51, local66, arg2);
						if (local54.aBoolean94) {
							arg6.method370(arg7, arg1, arg2, arg9, local54.aBoolean95);
						}
					} else if (arg1 == 9) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(arg1, arg7, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(arg1, arg0, local31, local54.anInt519, arg7, 0, true, local19, local41, local9);
						}
						arg8.method560(local51, arg9, 0, local66, local105, arg2, 1, arg3, 1, local80);
						if (local54.aBoolean94) {
							arg6.method371(arg9, local54.anInt517, local54.aBoolean95, arg7, local54.anInt518, arg2);
						}
					} else if (arg1 == 4) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(4, 0, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(4, arg0, local31, local54.anInt519, 0, 0, true, local19, local41, local9);
						}
						arg8.method559(arg7 * 512, anIntArray18[arg7], 0, arg2, arg9, local51, local80, local66, arg3, 0, local105);
					} else if (arg1 == 5) {
						local435 = 16;
						local198 = arg8.method576(arg3, arg9, arg2);
						if (local198 > 0) {
							local435 = Class9.method250(local198 >> 14 & 0x7FFF).anInt520;
						}
						if (local54.anInt519 == -1) {
							local461 = local54.method256(4, 0, local9, local19, local31, local41, -1);
						} else {
							local461 = new Class1_Sub1_Sub1_Sub2(4, arg0, local31, local54.anInt519, 0, 0, true, local19, local41, local9);
						}
						arg8.method559(arg7 * 512, anIntArray18[arg7], anIntArray20[arg7] * local435, arg2, arg9, local51, local80, local66, arg3, anIntArray21[arg7] * local435, local461);
					} else if (arg1 == 6) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(4, 0, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(4, arg0, local31, local54.anInt519, 0, 0, true, local19, local41, local9);
						}
						arg8.method559(arg7, 256, 0, arg2, arg9, local51, local80, local66, arg3, 0, local105);
					} else if (arg1 == 7) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(4, 0, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(4, arg0, local31, local54.anInt519, 0, 0, true, local19, local41, local9);
						}
						arg8.method559(arg7, 512, 0, arg2, arg9, local51, local80, local66, arg3, 0, local105);
					} else if (arg1 == 8) {
						if (local54.anInt519 == -1) {
							local105 = local54.method256(4, 0, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(4, arg0, local31, local54.anInt519, 0, 0, true, local19, local41, local9);
						}
						arg8.method559(arg7, 768, 0, arg2, arg9, local51, local80, local66, arg3, 0, local105);
					}
				}
			}
		} catch (@Pc(931) RuntimeException local931) {
			signlink.reporterror("22520, " + 982 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local931.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(III[[[I[[[B)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			this.anInt204 = arg2;
			this.anInt205 = arg1;
			this.anIntArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt204][this.anInt205];
			this.anIntArrayArrayArray2 = new int[4][this.anInt204 + 1][this.anInt205 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt204 + 1][this.anInt205 + 1];
			this.anIntArrayArray1 = new int[this.anInt204 + 1][this.anInt205 + 1];
			this.anIntArray13 = new int[this.anInt205];
			this.anIntArray14 = new int[this.anInt205];
			this.anIntArray15 = new int[this.anInt205];
			this.anIntArray16 = new int[this.anInt205];
			this.anIntArray17 = new int[this.anInt205];
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("62646, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method51(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		try {
			@Pc(3) byte local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < Class19.anInt692; local5++) {
				if (Class19.aClass19Array1[local5].aString27.equalsIgnoreCase("water")) {
					local3 = (byte) (local5 + 1);
					break;
				}
			}
			for (@Pc(27) int local27 = arg1; local27 < arg1 + 64; local27++) {
				for (@Pc(31) int local31 = arg0; local31 < arg0 + 64; local31++) {
					if (local31 >= 0 && local31 < this.anInt204 && local27 >= 0 && local27 < this.anInt205) {
						this.aByteArrayArrayArray3[0][local31][local27] = local3;
						for (@Pc(56) int local56 = 0; local56 < 4; local56++) {
							this.anIntArrayArrayArray1[local56][local31][local27] = 0;
							this.aByteArrayArrayArray1[local56][local31][local27] = 0;
						}
					}
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("2182, " + arg0 + ", " + 64 + ", " + 2 + ", " + 64 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIZI)V")
	public void method52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0, true);
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (@Pc(22) int local22 = 0; local22 < 64; local22++) {
						@Pc(28) int local28 = local18 + arg2;
						@Pc(32) int local32 = local22 + arg4;
						@Pc(54) int local54;
						if (local28 >= 0 && local28 < 104 && local32 >= 0 && local32 < 104) {
							this.aByteArrayArrayArray1[local14][local28][local32] = 0;
							while (true) {
								local54 = local12.method468();
								if (local54 == 0) {
									if (local14 == 0) {
										this.anIntArrayArrayArray1[0][local28][local32] = -method59(local28 + arg3 + 932731, local32 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray1[local14][local28][local32] = this.anIntArrayArrayArray1[local14 - 1][local28][local32] - 240;
									}
									break;
								}
								if (local54 == 1) {
									@Pc(110) int local110 = local12.method468();
									if (local110 == 1) {
										local110 = 0;
									}
									if (local14 == 0) {
										this.anIntArrayArrayArray1[0][local28][local32] = -local110 * 8;
									} else {
										this.anIntArrayArrayArray1[local14][local28][local32] = this.anIntArrayArrayArray1[local14 - 1][local28][local32] - local110 * 8;
									}
									break;
								}
								if (local54 <= 49) {
									this.aByteArrayArrayArray3[local14][local28][local32] = local12.method469();
									this.aByteArrayArrayArray4[local14][local28][local32] = (byte) ((local54 - 2) / 4);
									this.aByteArrayArrayArray5[local14][local28][local32] = (byte) (local54 - 2 & 0x3);
								} else if (local54 <= 81) {
									this.aByteArrayArrayArray1[local14][local28][local32] = (byte) (local54 - 49);
								} else {
									this.aByteArrayArrayArray2[local14][local28][local32] = (byte) (local54 - 81);
								}
							}
						} else {
							while (true) {
								local54 = local12.method468();
								if (local54 == 0) {
									break;
								}
								if (local54 == 1) {
									local12.method468();
									break;
								}
								if (local54 <= 49) {
									local12.method468();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("64290, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!ic;I[BILclient!s;)V")
	public void method55(@OriginalArg(0) int arg0, @OriginalArg(1) Class17[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class37 arg5) {
		try {
			if (arg2 == 0) {
				@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg3, true);
				@Pc(12) int local12 = -1;
				while (true) {
					@Pc(15) int local15 = local10.method482();
					if (local15 == 0) {
						return;
					}
					local12 += local15;
					@Pc(23) int local23 = 0;
					while (true) {
						@Pc(26) int local26 = local10.method482();
						if (local26 == 0) {
							break;
						}
						local23 += local26 - 1;
						@Pc(38) int local38 = local23 & 0x3F;
						@Pc(44) int local44 = local23 >> 6 & 0x3F;
						@Pc(48) int local48 = local23 >> 12;
						@Pc(51) int local51 = local10.method468();
						@Pc(55) int local55 = local51 >> 2;
						@Pc(59) int local59 = local51 & 0x3;
						@Pc(63) int local63 = local44 + arg4;
						@Pc(67) int local67 = local38 + arg0;
						if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
							@Pc(79) int local79 = local48;
							if ((this.aByteArrayArrayArray1[1][local63][local67] & 0x2) == 2) {
								local79 = local48 - 1;
							}
							@Pc(94) Class17 local94 = null;
							if (local79 >= 0) {
								local94 = arg1[local79];
							}
							this.method56(local12, local67, local59, arg5, local55, local48, local94, local63);
						}
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("57553, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!s;IILclient!ic;II)V")
	private void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean26) {
				if ((this.aByteArrayArrayArray1[arg5][arg7][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method58(arg1, arg7, arg5) != anInt203) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg5][arg7][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg5][arg7 + 1][arg1];
			@Pc(67) int local67 = this.anIntArrayArrayArray1[arg5][arg7 + 1][arg1 + 1];
			@Pc(78) int local78 = this.anIntArrayArrayArray1[arg5][arg7][arg1 + 1];
			@Pc(88) int local88 = local33 + local44 + local67 + local78 >> 2;
			@Pc(91) Class9 local91 = Class9.method250(arg0);
			@Pc(103) int local103 = arg7 + (arg1 << 7) + (arg0 << 14) + 1073741824;
			if (!local91.aBoolean96) {
				local103 += Integer.MIN_VALUE;
			}
			@Pc(117) byte local117 = (byte) ((arg2 << 6) + arg4);
			@Pc(143) Class1_Sub1_Sub1 local143;
			if (arg4 != 22) {
				@Pc(238) int local238;
				if (arg4 == 10 || arg4 == 11) {
					if (local91.anInt519 == -1) {
						local143 = local91.method256(10, arg2, local33, local44, local67, local78, -1);
					} else {
						local143 = new Class1_Sub1_Sub1_Sub2(10, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
					}
					if (local143 != null) {
						@Pc(225) int local225 = 0;
						if (arg4 == 11) {
							local225 += 256;
						}
						@Pc(241) int local241;
						if (arg2 == 1 || arg2 == 3) {
							local238 = local91.anInt518;
							local241 = local91.anInt517;
						} else {
							local238 = local91.anInt517;
							local241 = local91.anInt518;
						}
						if (arg3.method560(local88, arg7, local225, local103, local143, arg1, local241, arg5, local238, local117) && local91.aBoolean102) {
							@Pc(272) Class1_Sub1_Sub1_Sub5 local272;
							if (local143 instanceof Class1_Sub1_Sub1_Sub5) {
								local272 = (Class1_Sub1_Sub1_Sub5) local143;
							} else {
								local272 = local91.method256(10, arg2, local33, local44, local67, local78, -1);
							}
							if (local272 != null) {
								for (@Pc(288) int local288 = 0; local288 <= local238; local288++) {
									for (@Pc(292) int local292 = 0; local292 <= local241; local292++) {
										@Pc(299) int local299 = local272.anInt551 / 4;
										if (local299 > 30) {
											local299 = 30;
										}
										if (local299 > this.aByteArrayArrayArray6[arg5][arg7 + local288][arg1 + local292]) {
											this.aByteArrayArrayArray6[arg5][arg7 + local288][arg1 + local292] = (byte) local299;
										}
									}
								}
							}
						}
					}
					if (local91.aBoolean94 && arg6 != null) {
						arg6.method371(arg7, local91.anInt517, local91.aBoolean95, arg2, local91.anInt518, arg1);
					}
				} else if (arg4 >= 12) {
					if (local91.anInt519 == -1) {
						local143 = local91.method256(arg4, arg2, local33, local44, local67, local78, -1);
					} else {
						local143 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
					}
					arg3.method560(local88, arg7, 0, local103, local143, arg1, 1, arg5, 1, local117);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x924;
					}
					if (local91.aBoolean94 && arg6 != null) {
						arg6.method371(arg7, local91.anInt517, local91.aBoolean95, arg2, local91.anInt518, arg1);
					}
				} else if (arg4 == 0) {
					if (local91.anInt519 == -1) {
						local143 = local91.method256(0, arg2, local33, local44, local67, local78, -1);
					} else {
						local143 = new Class1_Sub1_Sub1_Sub2(0, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
					}
					arg3.method558(arg7, local143, 0, anIntArray18[arg2], local117, arg5, null, local88, local103, arg1);
					if (arg2 == 0) {
						if (local91.aBoolean102) {
							this.aByteArrayArrayArray6[arg5][arg7][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg7][arg1 + 1] = 50;
						}
						if (local91.aBoolean99) {
							this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x249;
						}
					} else if (arg2 == 1) {
						if (local91.aBoolean102) {
							this.aByteArrayArrayArray6[arg5][arg7][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1 + 1] = 50;
						}
						if (local91.aBoolean99) {
							this.anIntArrayArrayArray2[arg5][arg7][arg1 + 1] |= 0x492;
						}
					} else if (arg2 == 2) {
						if (local91.aBoolean102) {
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1 + 1] = 50;
						}
						if (local91.aBoolean99) {
							this.anIntArrayArrayArray2[arg5][arg7 + 1][arg1] |= 0x249;
						}
					} else if (arg2 == 3) {
						if (local91.aBoolean102) {
							this.aByteArrayArrayArray6[arg5][arg7][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1] = 50;
						}
						if (local91.aBoolean99) {
							this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x492;
						}
					}
					if (local91.aBoolean94 && arg6 != null) {
						arg6.method370(arg2, arg4, arg1, arg7, local91.aBoolean95);
					}
					if (local91.anInt520 != 16) {
						arg3.method566(arg5, arg1, arg7, local91.anInt520);
					}
				} else if (arg4 == 1) {
					if (local91.anInt519 == -1) {
						local143 = local91.method256(1, arg2, local33, local44, local67, local78, -1);
					} else {
						local143 = new Class1_Sub1_Sub1_Sub2(1, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
					}
					arg3.method558(arg7, local143, 0, anIntArray19[arg2], local117, arg5, null, local88, local103, arg1);
					if (local91.aBoolean102) {
						if (arg2 == 0) {
							this.aByteArrayArrayArray6[arg5][arg7][arg1 + 1] = 50;
						} else if (arg2 == 1) {
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1 + 1] = 50;
						} else if (arg2 == 2) {
							this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1] = 50;
						} else if (arg2 == 3) {
							this.aByteArrayArrayArray6[arg5][arg7][arg1] = 50;
						}
					}
					if (local91.aBoolean94 && arg6 != null) {
						arg6.method370(arg2, arg4, arg1, arg7, local91.aBoolean95);
					}
				} else {
					@Pc(866) Class1_Sub1_Sub1 local866;
					@Pc(840) int local840;
					if (arg4 == 2) {
						local840 = arg2 + 1 & 0x3;
						@Pc(856) Class1_Sub1_Sub1 local856;
						if (local91.anInt519 == -1) {
							local856 = local91.method256(2, arg2 + 4, local33, local44, local67, local78, -1);
							local866 = local91.method256(2, local840, local33, local44, local67, local78, -1);
						} else {
							local856 = new Class1_Sub1_Sub1_Sub2(2, arg0, local67, local91.anInt519, arg2 + 4, 0, true, local44, local78, local33);
							local866 = new Class1_Sub1_Sub1_Sub2(2, arg0, local67, local91.anInt519, local840, 0, true, local44, local78, local33);
						}
						arg3.method558(arg7, local856, anIntArray18[local840], anIntArray18[arg2], local117, arg5, local866, local88, local103, arg1);
						if (local91.aBoolean99) {
							if (arg2 == 0) {
								this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg7][arg1 + 1] |= 0x492;
							} else if (arg2 == 1) {
								this.anIntArrayArrayArray2[arg5][arg7][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg7 + 1][arg1] |= 0x249;
							} else if (arg2 == 2) {
								this.anIntArrayArrayArray2[arg5][arg7 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x492;
							} else if (arg2 == 3) {
								this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg7][arg1] |= 0x249;
							}
						}
						if (local91.aBoolean94 && arg6 != null) {
							arg6.method370(arg2, arg4, arg1, arg7, local91.aBoolean95);
						}
						if (local91.anInt520 != 16) {
							arg3.method566(arg5, arg1, arg7, local91.anInt520);
						}
					} else if (arg4 == 3) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(3, arg2, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(3, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
						}
						arg3.method558(arg7, local143, 0, anIntArray19[arg2], local117, arg5, null, local88, local103, arg1);
						if (local91.aBoolean102) {
							if (arg2 == 0) {
								this.aByteArrayArrayArray6[arg5][arg7][arg1 + 1] = 50;
							} else if (arg2 == 1) {
								this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1 + 1] = 50;
							} else if (arg2 == 2) {
								this.aByteArrayArrayArray6[arg5][arg7 + 1][arg1] = 50;
							} else if (arg2 == 3) {
								this.aByteArrayArrayArray6[arg5][arg7][arg1] = 50;
							}
						}
						if (local91.aBoolean94 && arg6 != null) {
							arg6.method370(arg2, arg4, arg1, arg7, local91.aBoolean95);
						}
					} else if (arg4 == 9) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(arg4, arg2, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
						}
						arg3.method560(local88, arg7, 0, local103, local143, arg1, 1, arg5, 1, local117);
						if (local91.aBoolean94 && arg6 != null) {
							arg6.method371(arg7, local91.anInt517, local91.aBoolean95, arg2, local91.anInt518, arg1);
						}
					} else if (arg4 == 4) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(4, 0, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(4, arg0, local67, local91.anInt519, 0, 0, true, local44, local78, local33);
						}
						arg3.method559(arg2 * 512, anIntArray18[arg2], 0, arg1, arg7, local88, local117, local103, arg5, 0, local143);
					} else if (arg4 == 5) {
						local840 = 16;
						local238 = arg3.method576(arg5, arg7, arg1);
						if (local238 > 0) {
							local840 = Class9.method250(local238 >> 14 & 0x7FFF).anInt520;
						}
						if (local91.anInt519 == -1) {
							local866 = local91.method256(4, 0, local33, local44, local67, local78, -1);
						} else {
							local866 = new Class1_Sub1_Sub1_Sub2(4, arg0, local67, local91.anInt519, 0, 0, true, local44, local78, local33);
						}
						arg3.method559(arg2 * 512, anIntArray18[arg2], anIntArray20[arg2] * local840, arg1, arg7, local88, local117, local103, arg5, anIntArray21[arg2] * local840, local866);
					} else if (arg4 == 6) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(4, 0, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(4, arg0, local67, local91.anInt519, 0, 0, true, local44, local78, local33);
						}
						arg3.method559(arg2, 256, 0, arg1, arg7, local88, local117, local103, arg5, 0, local143);
					} else if (arg4 == 7) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(4, 0, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(4, arg0, local67, local91.anInt519, 0, 0, true, local44, local78, local33);
						}
						arg3.method559(arg2, 512, 0, arg1, arg7, local88, local117, local103, arg5, 0, local143);
					} else if (arg4 == 8) {
						if (local91.anInt519 == -1) {
							local143 = local91.method256(4, 0, local33, local44, local67, local78, -1);
						} else {
							local143 = new Class1_Sub1_Sub1_Sub2(4, arg0, local67, local91.anInt519, 0, 0, true, local44, local78, local33);
						}
						arg3.method559(arg2, 768, 0, arg1, arg7, local88, local117, local103, arg5, 0, local143);
					}
				}
			} else if (!aBoolean26 || local91.aBoolean96 || local91.aBoolean103) {
				if (local91.anInt519 == -1) {
					local143 = local91.method256(22, arg2, local33, local44, local67, local78, -1);
				} else {
					local143 = new Class1_Sub1_Sub1_Sub2(22, arg0, local67, local91.anInt519, arg2, 0, true, local44, local78, local33);
				}
				arg3.method556(local143, arg7, local103, local88, arg1, arg5, local117);
				if (local91.aBoolean94 && local91.aBoolean96 && arg6 != null) {
					arg6.method372(arg7, arg1);
				}
			}
		} catch (@Pc(1542) RuntimeException local1542) {
			signlink.reporterror("29525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -756 + ", " + arg7 + ", " + local1542.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;[Lclient!ic;Z)V")
	public void method57(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class17[] arg1) {
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
								arg1[local27].method372(local7, local11);
							}
						}
					}
				}
			}
			if (aBoolean27) {
				anInt206 = 0;
				anInt207 = 0;
			} else {
				anInt206 += (int) (Math.random() * 5.0D) - 2;
				if (anInt206 < -8) {
					anInt206 = -8;
				}
				if (anInt206 > 8) {
					anInt206 = 8;
				}
				anInt207 += (int) (Math.random() * 5.0D) - 2;
				if (anInt207 < -16) {
					anInt207 = -16;
				}
				if (anInt207 > 16) {
					anInt207 = 16;
				}
			}
			@Pc(141) int local141;
			@Pc(147) int local147;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(177) int local177;
			@Pc(199) int local199;
			@Pc(212) int local212;
			@Pc(218) int local218;
			@Pc(222) int local222;
			@Pc(228) int local228;
			@Pc(244) int local244;
			@Pc(292) int local292;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(116) byte[][] local116 = this.aByteArrayArrayArray6[local7];
				local141 = (int) Math.sqrt((double) 5100);
				local147 = local141 * 768 >> 8;
				for (local149 = 1; local149 < this.anInt205 - 1; local149++) {
					for (local153 = 1; local153 < this.anInt204 - 1; local153++) {
						local177 = this.anIntArrayArrayArray1[local7][local153 + 1][local149] - this.anIntArrayArrayArray1[local7][local153 - 1][local149];
						local199 = this.anIntArrayArrayArray1[local7][local153][local149 + 1] - this.anIntArrayArrayArray1[local7][local153][local149 - 1];
						local212 = (int) Math.sqrt((double) (local177 * local177 + local199 * local199 + 65536));
						local218 = (local177 << 8) / local212;
						local222 = 65536 / local212;
						local228 = (local199 << 8) / local212;
						local244 = (local218 * -50 + local222 * -10 + local228 * -50) / local147 + 96;
						local292 = (local116[local153 - 1][local149] >> 2) + (local116[local153 + 1][local149] >> 3) + (local116[local153][local149 - 1] >> 2) + (local116[local153][local149 + 1] >> 3) + (local116[local153][local149] >> 1);
						this.anIntArrayArray1[local153][local149] = local244 - local292;
					}
				}
				for (local153 = 0; local153 < this.anInt205; local153++) {
					this.anIntArray13[local153] = 0;
					this.anIntArray14[local153] = 0;
					this.anIntArray15[local153] = 0;
					this.anIntArray16[local153] = 0;
					this.anIntArray17[local153] = 0;
				}
				for (local177 = -5; local177 < this.anInt204 + 5; local177++) {
					for (local199 = 0; local199 < this.anInt205; local199++) {
						local212 = local177 + 5;
						@Pc(427) int local427;
						if (local212 >= 0 && local212 < this.anInt204) {
							local218 = this.aByteArrayArrayArray2[local7][local212][local199] & 0xFF;
							if (local218 > 0) {
								@Pc(386) Class19 local386 = Class19.aClass19Array1[local218 - 1];
								this.anIntArray13[local199] += local386.anInt698;
								this.anIntArray14[local199] += local386.anInt696;
								this.anIntArray15[local199] += local386.anInt697;
								this.anIntArray16[local199] += local386.anInt699;
								local427 = this.anIntArray17[local199]++;
							}
						}
						local218 = local177 - 5;
						if (local218 >= 0 && local218 < this.anInt204) {
							local222 = this.aByteArrayArrayArray2[local7][local218][local199] & 0xFF;
							if (local222 > 0) {
								@Pc(459) Class19 local459 = Class19.aClass19Array1[local222 - 1];
								this.anIntArray13[local199] -= local459.anInt698;
								this.anIntArray14[local199] -= local459.anInt696;
								this.anIntArray15[local199] -= local459.anInt697;
								this.anIntArray16[local199] -= local459.anInt699;
								local427 = this.anIntArray17[local199]--;
							}
						}
					}
					if (local177 >= 1 && local177 < this.anInt204 - 1) {
						local212 = 0;
						local218 = 0;
						local222 = 0;
						local228 = 0;
						local244 = 0;
						for (local292 = -5; local292 < this.anInt205 + 5; local292++) {
							@Pc(535) int local535 = local292 + 5;
							if (local535 >= 0 && local535 < this.anInt205) {
								local212 += this.anIntArray13[local535];
								local218 += this.anIntArray14[local535];
								local222 += this.anIntArray15[local535];
								local228 += this.anIntArray16[local535];
								local244 += this.anIntArray17[local535];
							}
							@Pc(580) int local580 = local292 - 5;
							if (local580 >= 0 && local580 < this.anInt205) {
								local212 -= this.anIntArray13[local580];
								local218 -= this.anIntArray14[local580];
								local222 -= this.anIntArray15[local580];
								local228 -= this.anIntArray16[local580];
								local244 -= this.anIntArray17[local580];
							}
							if (local292 >= 1 && local292 < this.anInt205 - 1 && (!aBoolean26 || (this.aByteArrayArrayArray1[local7][local177][local292] & 0x10) == 0 && this.method58(local292, local177, local7) == anInt203)) {
								@Pc(663) int local663 = this.aByteArrayArrayArray2[local7][local177][local292] & 0xFF;
								@Pc(674) int local674 = this.aByteArrayArrayArray3[local7][local177][local292] & 0xFF;
								if (local663 > 0 || local674 > 0) {
									@Pc(687) int local687 = this.anIntArrayArrayArray1[local7][local177][local292];
									@Pc(698) int local698 = this.anIntArrayArrayArray1[local7][local177 + 1][local292];
									@Pc(711) int local711 = this.anIntArrayArrayArray1[local7][local177 + 1][local292 + 1];
									@Pc(722) int local722 = this.anIntArrayArrayArray1[local7][local177][local292 + 1];
									@Pc(729) int local729 = this.anIntArrayArray1[local177][local292];
									@Pc(738) int local738 = this.anIntArrayArray1[local177 + 1][local292];
									@Pc(749) int local749 = this.anIntArrayArray1[local177 + 1][local292 + 1];
									@Pc(758) int local758 = this.anIntArrayArray1[local177][local292 + 1];
									@Pc(760) int local760 = -1;
									@Pc(762) int local762 = -1;
									@Pc(770) int local770;
									@Pc(774) int local774;
									if (local663 > 0) {
										local770 = local212 * 256 / local228;
										local774 = local218 / local244;
										@Pc(778) int local778 = local222 / local244;
										local760 = this.method66(local770, local774, local778);
										@Pc(790) int local790 = local770 + anInt206 & 0xFF;
										local778 += anInt207;
										if (local778 < 0) {
											local778 = 0;
										} else if (local778 > 255) {
											local778 = 255;
										}
										local762 = this.method66(local790, local774, local778);
									}
									if (local7 > 0) {
										@Pc(815) boolean local815 = true;
										if (local663 == 0 && this.aByteArrayArrayArray4[local7][local177][local292] != 0) {
											local815 = false;
										}
										if (local674 > 0 && !Class19.aClass19Array1[local674 - 1].aBoolean144) {
											local815 = false;
										}
										if (local815 && local687 == local698 && local687 == local711 && local687 == local722) {
											this.anIntArrayArrayArray2[local7][local177][local292] |= 0x924;
										}
									}
									local770 = 0;
									if (local760 != -1) {
										local770 = Class1_Sub1_Sub2_Sub1.anIntArray178[method64(local762, 96)];
									}
									if (local674 == 0) {
										arg0.method555(local7, local177, local292, 0, 0, -1, local687, local698, local711, local722, method64(local760, local729), method64(local760, local738), method64(local760, local749), method64(local760, local758), 0, 0, 0, 0, local770, 0);
									} else {
										local774 = this.aByteArrayArrayArray4[local7][local177][local292] + 1;
										@Pc(927) byte local927 = this.aByteArrayArrayArray5[local7][local177][local292];
										@Pc(933) Class19 local933 = Class19.aClass19Array1[local674 - 1];
										@Pc(936) int local936 = local933.anInt694;
										@Pc(944) int local944;
										@Pc(942) int local942;
										if (local936 >= 0) {
											local942 = Class1_Sub1_Sub2_Sub1.method358(local936);
											local944 = -1;
										} else if (local933.anInt693 == 16711935) {
											local942 = 0;
											local944 = -2;
											local936 = -1;
										} else {
											local944 = this.method66(local933.anInt695, local933.anInt696, local933.anInt697);
											local942 = Class1_Sub1_Sub2_Sub1.anIntArray178[this.method65(local933.anInt700, 96)];
										}
										arg0.method555(local7, local177, local292, local774, local927, local936, local687, local698, local711, local722, method64(local760, local729), method64(local760, local738), method64(local760, local749), method64(local760, local758), this.method65(local944, local729), this.method65(local944, local738), this.method65(local944, local749), this.method65(local944, local758), local770, local942);
									}
								}
							}
						}
					}
				}
				for (local199 = 1; local199 < this.anInt205 - 1; local199++) {
					for (local212 = 1; local212 < this.anInt204 - 1; local212++) {
						arg0.method554(local7, local212, local199, this.method58(local199, local212, local7));
					}
				}
			}
			if (!aBoolean27) {
				arg0.method581();
			}
			for (local11 = 0; local11 < this.anInt204; local11++) {
				for (local27 = 0; local27 < this.anInt205; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method552(local27, local11);
					}
				}
			}
			if (!aBoolean27) {
				local27 = 1;
				@Pc(1129) int local1129 = 2;
				@Pc(1131) int local1131 = 4;
				for (@Pc(1133) int local1133 = 0; local1133 < 4; local1133++) {
					if (local1133 > 0) {
						local27 <<= 0x3;
						local1129 <<= 0x3;
						local1131 <<= 0x3;
					}
					for (@Pc(1151) int local1151 = 0; local1151 <= local1133; local1151++) {
						for (local141 = 0; local141 <= this.anInt205; local141++) {
							for (local147 = 0; local147 <= this.anInt204; local147++) {
								if ((this.anIntArrayArrayArray2[local1151][local147][local141] & local27) != 0) {
									local149 = local141;
									local153 = local141;
									local177 = local1151;
									local199 = local1151;
									while (local149 > 0 && (this.anIntArrayArrayArray2[local1151][local147][local149 - 1] & local27) != 0) {
										local149--;
									}
									while (local153 < this.anInt205 && (this.anIntArrayArrayArray2[local1151][local147][local153 + 1] & local27) != 0) {
										local153++;
									}
									label335: while (local177 > 0) {
										for (local212 = local149; local212 <= local153; local212++) {
											if ((this.anIntArrayArrayArray2[local177 - 1][local147][local212] & local27) == 0) {
												break label335;
											}
										}
										local177--;
									}
									label324: while (local199 < local1133) {
										for (local212 = local149; local212 <= local153; local212++) {
											if ((this.anIntArrayArrayArray2[local199 + 1][local147][local212] & local27) == 0) {
												break label324;
											}
										}
										local199++;
									}
									local212 = (local199 + 1 - local177) * (local153 + 1 - local149);
									if (local212 >= 8) {
										local222 = this.anIntArrayArrayArray1[local199][local147][local149] - 240;
										local228 = this.anIntArrayArrayArray1[local177][local147][local149];
										Class37.method553(local147 * 128, local228, local149 * 128, local153 * 128 + 128, local1133, local147 * 128, this.aByte9, 1, local222);
										for (local244 = local177; local244 <= local199; local244++) {
											for (local292 = local149; local292 <= local153; local292++) {
												this.anIntArrayArrayArray2[local244][local147][local292] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1151][local147][local141] & local1129) != 0) {
									local149 = local147;
									local153 = local147;
									local177 = local1151;
									local199 = local1151;
									while (local149 > 0 && (this.anIntArrayArrayArray2[local1151][local149 - 1][local141] & local1129) != 0) {
										local149--;
									}
									while (local153 < this.anInt204 && (this.anIntArrayArrayArray2[local1151][local153 + 1][local141] & local1129) != 0) {
										local153++;
									}
									label388: while (local177 > 0) {
										for (local212 = local149; local212 <= local153; local212++) {
											if ((this.anIntArrayArrayArray2[local177 - 1][local212][local141] & local1129) == 0) {
												break label388;
											}
										}
										local177--;
									}
									label377: while (local199 < local1133) {
										for (local212 = local149; local212 <= local153; local212++) {
											if ((this.anIntArrayArrayArray2[local199 + 1][local212][local141] & local1129) == 0) {
												break label377;
											}
										}
										local199++;
									}
									local212 = (local199 + 1 - local177) * (local153 + 1 - local149);
									if (local212 >= 8) {
										local222 = this.anIntArrayArrayArray1[local199][local149][local141] - 240;
										local228 = this.anIntArrayArrayArray1[local177][local149][local141];
										Class37.method553(local153 * 128 + 128, local228, local141 * 128, local141 * 128, local1133, local149 * 128, this.aByte9, 2, local222);
										for (local244 = local177; local244 <= local199; local244++) {
											for (local292 = local149; local292 <= local153; local292++) {
												this.anIntArrayArrayArray2[local244][local292][local141] &= ~local1129;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1151][local147][local141] & local1131) != 0) {
									local149 = local147;
									local153 = local147;
									local177 = local141;
									local199 = local141;
									while (local177 > 0 && (this.anIntArrayArrayArray2[local1151][local147][local177 - 1] & local1131) != 0) {
										local177--;
									}
									while (local199 < this.anInt205 && (this.anIntArrayArrayArray2[local1151][local147][local199 + 1] & local1131) != 0) {
										local199++;
									}
									label441: while (local149 > 0) {
										for (local212 = local177; local212 <= local199; local212++) {
											if ((this.anIntArrayArrayArray2[local1151][local149 - 1][local212] & local1131) == 0) {
												break label441;
											}
										}
										local149--;
									}
									label430: while (local153 < this.anInt204) {
										for (local212 = local177; local212 <= local199; local212++) {
											if ((this.anIntArrayArrayArray2[local1151][local153 + 1][local212] & local1131) == 0) {
												break label430;
											}
										}
										local153++;
									}
									if ((local153 + 1 - local149) * (local199 + 1 - local177) >= 4) {
										local212 = this.anIntArrayArrayArray1[local1151][local149][local177];
										Class37.method553(local153 * 128 + 128, local212, local177 * 128, local199 * 128 + 128, local1133, local149 * 128, this.aByte9, 4, local212);
										for (local218 = local149; local218 <= local153; local218++) {
											for (local222 = local177; local222 <= local199; local222++) {
												this.anIntArrayArrayArray2[local1151][local218][local222] &= ~local1131;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1769) RuntimeException local1769) {
			signlink.reporterror("49952, " + arg0 + ", " + arg1 + ", " + false + ", " + local1769.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method58(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("37590, " + 22171 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
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
