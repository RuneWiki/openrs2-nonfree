import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt61;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean14 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray9 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray10 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray11 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray12 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt59 = 8;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt60 = -836;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "B")
	private byte aByte3 = 2;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt62;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method42(arg0 + 45365, arg1 + 91923, 4) + (method42(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method42(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method44(local3, local13);
		@Pc(29) int local29 = method44(local3 + 1, local13);
		@Pc(35) int local35 = method44(local3, local13 + 1);
		@Pc(43) int local43 = method44(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method43(local23, local29, local9, arg2);
		@Pc(55) int local55 = method43(local35, local43, local9, arg2);
		return method43(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private static int method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub3_Sub2_Sub1.anIntArray119[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method45(arg0 - 1, arg1 - 1) + method45(arg0 + 1, arg1 - 1) + method45(arg0 - 1, arg1 + 1) + method45(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method45(arg0 - 1, arg1) + method45(arg0 + 1, arg1) + method45(arg0, arg1 - 1) + method45(arg0, arg1 + 1);
		@Pc(59) int local59 = method45(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!nb;IIILclient!ac;[[[IILclient!q;III)V")
	public static void method49(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(6) int[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class28 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg6[arg0][arg9][arg2];
		@Pc(17) int local17 = arg6[arg0][arg9 + 1][arg2];
		@Pc(29) int local29 = arg6[arg0][arg9 + 1][arg2 + 1];
		@Pc(39) int local39 = arg6[arg0][arg9][arg2 + 1];
		@Pc(49) int local49 = local7 + local17 + local29 + local39 >> 2;
		@Pc(52) Class37 local52 = Class37.method445(arg7);
		@Pc(64) int local64 = arg9 + (arg2 << 7) + (arg7 << 14) + 1073741824;
		if (!local52.aBoolean117) {
			local64 += Integer.MIN_VALUE;
		}
		@Pc(82) byte local82 = (byte) ((arg4 << 6) + arg10);
		@Pc(95) Class1_Sub3_Sub1 local95;
		if (arg10 == 22) {
			local95 = local52.method448(22, arg4, local7, local17, local29, local39, -1);
			arg8.method369(local95, arg9, local82, local49, arg3, arg2, local64);
			if (local52.aBoolean115 && local52.aBoolean117) {
				arg5.method23(arg2, arg9);
			}
			return;
		}
		@Pc(150) int local150;
		if (arg10 == 10 || arg10 == 11) {
			local95 = local52.method448(10, arg4, local7, local17, local29, local39, -1);
			if (local95 != null) {
				@Pc(137) int local137 = 0;
				if (arg10 == 11) {
					local137 += 256;
				}
				@Pc(153) int local153;
				if (arg4 == 1 || arg4 == 3) {
					local150 = local52.anInt625;
					local153 = local52.anInt624;
				} else {
					local150 = local52.anInt624;
					local153 = local52.anInt625;
				}
				arg8.method373(local64, arg2, local95, local153, local137, arg3, arg9, local49, local82, null, local150);
			}
			if (local52.aBoolean115) {
				arg5.method22(local52.anInt624, arg9, arg2, local52.aBoolean116, arg4, local52.anInt625);
			}
			if (local52.anInt626 != -1) {
				arg1.method350(new Class1_Sub6(2, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
			}
		} else if (arg10 >= 12) {
			local95 = local52.method448(arg10, arg4, local7, local17, local29, local39, -1);
			arg8.method373(local64, arg2, local95, 1, 0, arg3, arg9, local49, local82, null, 1);
			if (local52.aBoolean115) {
				arg5.method22(local52.anInt624, arg9, arg2, local52.aBoolean116, arg4, local52.anInt625);
			}
			if (local52.anInt626 != -1) {
				arg1.method350(new Class1_Sub6(2, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
			}
		} else if (arg10 == 0) {
			local95 = local52.method448(0, arg4, local7, local17, local29, local39, -1);
			arg8.method371(local49, anIntArray9[arg4], local82, 0, local64, arg2, arg9, null, arg3, local95);
			if (local52.aBoolean115) {
				arg5.method21(arg9, local52.aBoolean116, arg10, arg2, arg4);
			}
		} else if (arg10 == 1) {
			local95 = local52.method448(1, arg4, local7, local17, local29, local39, -1);
			arg8.method371(local49, anIntArray10[arg4], local82, 0, local64, arg2, arg9, null, arg3, local95);
			if (local52.aBoolean115) {
				arg5.method21(arg9, local52.aBoolean116, arg10, arg2, arg4);
			}
		} else {
			@Pc(364) int local364;
			@Pc(386) Class1_Sub3_Sub1 local386;
			if (arg10 == 2) {
				local364 = arg4 + 1 & 0x3;
				@Pc(376) Class1_Sub3_Sub1 local376 = local52.method448(2, arg4 + 4, local7, local17, local29, local39, -1);
				local386 = local52.method448(2, local364, local7, local17, local29, local39, -1);
				arg8.method371(local49, anIntArray9[arg4], local82, anIntArray9[local364], local64, arg2, arg9, local386, arg3, local376);
				if (local52.aBoolean115) {
					arg5.method21(arg9, local52.aBoolean116, arg10, arg2, arg4);
				}
			} else if (arg10 == 3) {
				local95 = local52.method448(3, arg4, local7, local17, local29, local39, -1);
				arg8.method371(local49, anIntArray10[arg4], local82, 0, local64, arg2, arg9, null, arg3, local95);
				if (local52.aBoolean115) {
					arg5.method21(arg9, local52.aBoolean116, arg10, arg2, arg4);
				}
			} else if (arg10 == 9) {
				local95 = local52.method448(arg10, arg4, local7, local17, local29, local39, -1);
				arg8.method373(local64, arg2, local95, 1, 0, arg3, arg9, local49, local82, null, 1);
				if (local52.aBoolean115) {
					arg5.method22(local52.anInt624, arg9, arg2, local52.aBoolean116, arg4, local52.anInt625);
				}
			} else if (arg10 == 4) {
				local95 = local52.method448(4, 0, local7, local17, local29, local39, -1);
				arg8.method372(local82, local64, local95, 0, arg9, anIntArray9[arg4], arg3, local49, arg2, arg4 * 512, 0);
				if (local52.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(1, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
				}
			} else if (arg10 == 5) {
				local364 = 16;
				local150 = arg8.method386(arg3, arg9, arg2);
				if (local150 > 0) {
					local364 = Class37.method445(local150 >> 14 & 0x7FFF).anInt627;
				}
				local386 = local52.method448(4, 0, local7, local17, local29, local39, -1);
				arg8.method372(local82, local64, local386, anIntArray12[arg4] * local364, arg9, anIntArray9[arg4], arg3, local49, arg2, arg4 * 512, anIntArray11[arg4] * local364);
				if (local52.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(1, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
				}
			} else if (arg10 == 6) {
				local95 = local52.method448(4, 0, local7, local17, local29, local39, -1);
				arg8.method372(local82, local64, local95, 0, arg9, 256, arg3, local49, arg2, arg4, 0);
				if (local52.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(1, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
				}
			} else if (arg10 == 7) {
				local95 = local52.method448(4, 0, local7, local17, local29, local39, -1);
				arg8.method372(local82, local64, local95, 0, arg9, 512, arg3, local49, arg2, arg4, 0);
				if (local52.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(1, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
				}
			} else if (arg10 == 8) {
				local95 = local52.method448(4, 0, local7, local17, local29, local39, -1);
				arg8.method372(local82, local64, local95, 0, arg9, 768, arg3, local49, arg2, arg4, 0);
				if (local52.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(1, arg3, arg7, 5858, Class11.aClass11Array1[local52.anInt626], arg9, arg2));
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt62 = arg2;
		this.anInt63 = arg3;
		this.anIntArrayArrayArray1 = arg1;
		this.aByteArrayArrayArray1 = arg0;
		this.aByteArrayArrayArray2 = new byte[4][this.anInt62][this.anInt63];
		this.aByteArrayArrayArray3 = new byte[4][this.anInt62][this.anInt63];
		this.aByteArrayArrayArray4 = new byte[4][this.anInt62][this.anInt63];
		this.aByteArrayArrayArray5 = new byte[4][this.anInt62][this.anInt63];
		if (arg4 != this.anInt59) {
			this.anInt60 = 395;
		}
		this.anIntArrayArrayArray2 = new int[4][this.anInt62 + 1][this.anInt63 + 1];
		this.aByteArrayArrayArray6 = new byte[4][this.anInt62 + 1][this.anInt63 + 1];
		this.anIntArrayArray2 = new int[this.anInt62 + 1][this.anInt63 + 1];
		this.anIntArray4 = new int[this.anInt63];
		this.anIntArray5 = new int[this.anInt63];
		this.anIntArray6 = new int[this.anInt63];
		this.anIntArray7 = new int[this.anInt63];
		this.anIntArray8 = new int[this.anInt63];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIB)V")
	public void method36(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) byte local3 = 0;
		for (@Pc(16) int local16 = 0; local16 < Class3.anInt51; local16++) {
			if (Class3.aClass3Array1[local16].aString1.equalsIgnoreCase("water")) {
				local3 = (byte) (local16 + 1);
				break;
			}
		}
		for (@Pc(38) int local38 = arg0; local38 < arg0 + 64; local38++) {
			for (@Pc(42) int local42 = arg1; local42 < arg1 + 64; local42++) {
				if (local42 >= 0 && local42 < this.anInt62 && local38 >= 0 && local38 < this.anInt63) {
					this.aByteArrayArrayArray3[0][local42][local38] = local3;
					for (@Pc(67) int local67 = 0; local67 < 4; local67++) {
						this.anIntArrayArrayArray1[local67][local42][local38] = 0;
						this.aByteArrayArrayArray1[local67][local42][local38] = 0;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIIII)V")
	public void method37(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0, (byte) 63);
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
					@Pc(27) int local27 = local17 + arg3;
					@Pc(31) int local31 = local21 + arg2;
					@Pc(53) int local53;
					if (local27 >= 0 && local27 < 104 && local31 >= 0 && local31 < 104) {
						this.aByteArrayArrayArray1[local13][local27][local31] = 0;
						while (true) {
							local53 = local11.method331();
							if (local53 == 0) {
								if (local13 == 0) {
									this.anIntArrayArrayArray1[0][local27][local31] = -method41(local27 + arg1 + 932731, local31 + 556238 + arg4) * 8;
								} else {
									this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - 240;
								}
								break;
							}
							if (local53 == 1) {
								@Pc(109) int local109 = local11.method331();
								if (local109 == 1) {
									local109 = 0;
								}
								if (local13 == 0) {
									this.anIntArrayArrayArray1[0][local27][local31] = -local109 * 8;
								} else {
									this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - local109 * 8;
								}
								break;
							}
							if (local53 <= 49) {
								this.aByteArrayArrayArray3[local13][local27][local31] = local11.method332();
								this.aByteArrayArrayArray4[local13][local27][local31] = (byte) ((local53 - 2) / 4);
								this.aByteArrayArrayArray5[local13][local27][local31] = (byte) (local53 - 2 & 0x3);
							} else if (local53 <= 81) {
								this.aByteArrayArrayArray1[local13][local27][local31] = (byte) (local53 - 49);
							} else {
								this.aByteArrayArrayArray2[local13][local27][local31] = (byte) (local53 - 81);
							}
						}
					} else {
						while (true) {
							local53 = local11.method331();
							if (local53 == 0) {
								break;
							}
							if (local53 == 1) {
								local11.method331();
								break;
							}
							if (local53 <= 49) {
								local11.method331();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BLclient!nb;[Lclient!ac;Lclient!q;III)V")
	public void method38(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class2[] arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg0, (byte) 63);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(23) int local23 = local7.method345();
			if (local23 == 0) {
				return;
			}
			local20 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(34) int local34 = local7.method345();
				if (local34 == 0) {
					break;
				}
				local31 += local34 - 1;
				@Pc(46) int local46 = local31 & 0x3F;
				@Pc(52) int local52 = local31 >> 6 & 0x3F;
				@Pc(56) int local56 = local31 >> 12;
				@Pc(59) int local59 = local7.method331();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = local52 + arg5;
				@Pc(75) int local75 = local46 + arg4;
				if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
					this.method39(arg3, arg1, local20, local56, local63, local67, local75, arg2[local56], local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!q;Lclient!nb;IIIIIILclient!ac;I)V")
	private void method39(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2 arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5;
		if (aBoolean14) {
			local5 = arg3;
			if (arg3 > 0 && (this.aByteArrayArrayArray1[1][arg8][arg6] & 0x2) != 0) {
				local5 = arg3 - 1;
			}
			if ((this.aByteArrayArrayArray1[arg3][arg8][arg6] & 0x8) != 0) {
				local5 = 0;
			}
			if (local5 != anInt61) {
				return;
			}
			if ((this.aByteArrayArrayArray1[arg3][arg8][arg6] & 0x10) != 0) {
				return;
			}
		}
		local5 = this.anIntArrayArrayArray1[arg3][arg8][arg6];
		@Pc(68) int local68 = this.anIntArrayArrayArray1[arg3][arg8 + 1][arg6];
		@Pc(81) int local81 = this.anIntArrayArrayArray1[arg3][arg8 + 1][arg6 + 1];
		@Pc(92) int local92 = this.anIntArrayArrayArray1[arg3][arg8][arg6 + 1];
		@Pc(107) int local107 = local5 + local68 + local81 + local92 >> 2;
		@Pc(110) Class37 local110 = Class37.method445(arg2);
		@Pc(122) int local122 = arg8 + (arg6 << 7) + (arg2 << 14) + 1073741824;
		if (!local110.aBoolean117) {
			local122 += Integer.MIN_VALUE;
		}
		@Pc(136) byte local136 = (byte) ((arg5 << 6) + arg4);
		@Pc(155) Class1_Sub3_Sub1 local155;
		if (arg4 != 22) {
			@Pc(210) int local210;
			if (arg4 == 10 || arg4 == 11) {
				local155 = local110.method448(10, arg5, local5, local68, local81, local92, -1);
				if (local155 != null) {
					@Pc(197) int local197 = 0;
					if (arg4 == 11) {
						local197 += 256;
					}
					@Pc(213) int local213;
					if (arg5 == 1 || arg5 == 3) {
						local210 = local110.anInt625;
						local213 = local110.anInt624;
					} else {
						local210 = local110.anInt624;
						local213 = local110.anInt625;
					}
					if (arg0.method373(local122, arg6, local155, local213, local197, arg3, arg8, local107, local136, null, local210) && local110.aBoolean123) {
						for (@Pc(241) int local241 = 0; local241 <= local210; local241++) {
							for (@Pc(245) int local245 = 0; local245 <= local213; local245++) {
								@Pc(252) int local252 = local155.anInt219 / 4;
								if (local252 > 30) {
									local252 = 30;
								}
								if (local252 > this.aByteArrayArrayArray6[arg3][arg8 + local241][arg6 + local245]) {
									this.aByteArrayArrayArray6[arg3][arg8 + local241][arg6 + local245] = (byte) local252;
								}
							}
						}
					}
				}
				if (local110.aBoolean115) {
					arg7.method22(local110.anInt624, arg8, arg6, local110.aBoolean116, arg5, local110.anInt625);
				}
				if (local110.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(2, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
				}
			} else if (arg4 >= 12) {
				local155 = local110.method448(arg4, arg5, local5, local68, local81, local92, -1);
				arg0.method373(local122, arg6, local155, 1, 0, arg3, arg8, local107, local136, null, 1);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
					this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x924;
				}
				if (local110.aBoolean115) {
					arg7.method22(local110.anInt624, arg8, arg6, local110.aBoolean116, arg5, local110.anInt625);
				}
				if (local110.anInt626 != -1) {
					arg1.method350(new Class1_Sub6(2, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
				}
			} else if (arg4 == 0) {
				local155 = local110.method448(0, arg5, local5, local68, local81, local92, -1);
				arg0.method371(local107, anIntArray9[arg5], local136, 0, local122, arg6, arg8, null, arg3, local155);
				if (arg5 == 0) {
					if (local110.aBoolean123) {
						this.aByteArrayArrayArray6[arg3][arg8][arg6] = 50;
						this.aByteArrayArrayArray6[arg3][arg8][arg6 + 1] = 50;
					}
					if (local110.aBoolean120) {
						this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local110.aBoolean123) {
						this.aByteArrayArrayArray6[arg3][arg8][arg6 + 1] = 50;
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6 + 1] = 50;
					}
					if (local110.aBoolean120) {
						this.anIntArrayArrayArray2[arg3][arg8][arg6 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local110.aBoolean123) {
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6] = 50;
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6 + 1] = 50;
					}
					if (local110.aBoolean120) {
						this.anIntArrayArrayArray2[arg3][arg8 + 1][arg6] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local110.aBoolean123) {
						this.aByteArrayArrayArray6[arg3][arg8][arg6] = 50;
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6] = 50;
					}
					if (local110.aBoolean120) {
						this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x492;
					}
				}
				if (local110.aBoolean115) {
					arg7.method21(arg8, local110.aBoolean116, arg4, arg6, arg5);
				}
			} else if (arg4 == 1) {
				local155 = local110.method448(1, arg5, local5, local68, local81, local92, -1);
				arg0.method371(local107, anIntArray10[arg5], local136, 0, local122, arg6, arg8, null, arg3, local155);
				if (local110.aBoolean123) {
					if (arg5 == 0) {
						this.aByteArrayArrayArray6[arg3][arg8][arg6 + 1] = 50;
					} else if (arg5 == 1) {
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6 + 1] = 50;
					} else if (arg5 == 2) {
						this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6] = 50;
					} else if (arg5 == 3) {
						this.aByteArrayArrayArray6[arg3][arg8][arg6] = 50;
					}
				}
				if (local110.aBoolean115) {
					arg7.method21(arg8, local110.aBoolean116, arg4, arg6, arg5);
				}
			} else {
				@Pc(749) int local749;
				@Pc(771) Class1_Sub3_Sub1 local771;
				if (arg4 == 2) {
					local749 = arg5 + 1 & 0x3;
					@Pc(761) Class1_Sub3_Sub1 local761 = local110.method448(2, arg5 + 4, local5, local68, local81, local92, -1);
					local771 = local110.method448(2, local749, local5, local68, local81, local92, -1);
					arg0.method371(local107, anIntArray9[arg5], local136, anIntArray9[local749], local122, arg6, arg8, local771, arg3, local761);
					if (local110.aBoolean120) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x249;
							this.anIntArrayArrayArray2[arg3][arg8][arg6 + 1] |= 0x492;
						} else if (arg5 == 1) {
							this.anIntArrayArrayArray2[arg3][arg8][arg6 + 1] |= 0x492;
							this.anIntArrayArrayArray2[arg3][arg8 + 1][arg6] |= 0x249;
						} else if (arg5 == 2) {
							this.anIntArrayArrayArray2[arg3][arg8 + 1][arg6] |= 0x249;
							this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x492;
						} else if (arg5 == 3) {
							this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x492;
							this.anIntArrayArrayArray2[arg3][arg8][arg6] |= 0x249;
						}
					}
					if (local110.aBoolean115) {
						arg7.method21(arg8, local110.aBoolean116, arg4, arg6, arg5);
					}
				} else if (arg4 == 3) {
					local155 = local110.method448(3, arg5, local5, local68, local81, local92, -1);
					arg0.method371(local107, anIntArray10[arg5], local136, 0, local122, arg6, arg8, null, arg3, local155);
					if (local110.aBoolean123) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray6[arg3][arg8][arg6 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray6[arg3][arg8 + 1][arg6] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray6[arg3][arg8][arg6] = 50;
						}
					}
					if (local110.aBoolean115) {
						arg7.method21(arg8, local110.aBoolean116, arg4, arg6, arg5);
					}
				} else if (arg4 == 9) {
					local155 = local110.method448(arg4, arg5, local5, local68, local81, local92, -1);
					arg0.method373(local122, arg6, local155, 1, 0, arg3, arg8, local107, local136, null, 1);
					if (local110.aBoolean115) {
						arg7.method22(local110.anInt624, arg8, arg6, local110.aBoolean116, arg5, local110.anInt625);
					}
				} else if (arg4 == 4) {
					local155 = local110.method448(4, 0, local5, local68, local81, local92, -1);
					arg0.method372(local136, local122, local155, 0, arg8, anIntArray9[arg5], arg3, local107, arg6, arg5 * 512, 0);
					if (local110.anInt626 != -1) {
						arg1.method350(new Class1_Sub6(1, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
					}
				} else if (arg4 == 5) {
					local749 = 16;
					local210 = arg0.method386(arg3, arg8, arg6);
					if (local210 > 0) {
						local749 = Class37.method445(local210 >> 14 & 0x7FFF).anInt627;
					}
					local771 = local110.method448(4, 0, local5, local68, local81, local92, -1);
					arg0.method372(local136, local122, local771, anIntArray12[arg5] * local749, arg8, anIntArray9[arg5], arg3, local107, arg6, arg5 * 512, anIntArray11[arg5] * local749);
					if (local110.anInt626 != -1) {
						arg1.method350(new Class1_Sub6(1, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
					}
				} else if (arg4 == 6) {
					local155 = local110.method448(4, 0, local5, local68, local81, local92, -1);
					arg0.method372(local136, local122, local155, 0, arg8, 256, arg3, local107, arg6, arg5, 0);
					if (local110.anInt626 != -1) {
						arg1.method350(new Class1_Sub6(1, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
					}
				} else if (arg4 == 7) {
					local155 = local110.method448(4, 0, local5, local68, local81, local92, -1);
					arg0.method372(local136, local122, local155, 0, arg8, 512, arg3, local107, arg6, arg5, 0);
					if (local110.anInt626 != -1) {
						arg1.method350(new Class1_Sub6(1, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
					}
				} else if (arg4 == 8) {
					local155 = local110.method448(4, 0, local5, local68, local81, local92, -1);
					arg0.method372(local136, local122, local155, 0, arg8, 768, arg3, local107, arg6, arg5, 0);
					if (local110.anInt626 != -1) {
						arg1.method350(new Class1_Sub6(1, arg3, arg2, 5858, Class11.aClass11Array1[local110.anInt626], arg8, arg6));
					}
				}
			}
		} else if (!aBoolean14 || local110.aBoolean117) {
			local155 = local110.method448(22, arg5, local5, local68, local81, local92, -1);
			arg0.method369(local155, arg8, local136, local107, arg3, arg6, local122);
			if (local110.aBoolean115 && local110.aBoolean117) {
				arg7.method23(arg6, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ac;Lclient!q;I)V")
	public void method40(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class28 arg1) {
		@Pc(3) Class2 local3 = null;
		@Pc(12) int local12;
		@Pc(16) int local16;
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			@Pc(10) Class2 local10 = arg0[local5];
			for (local12 = 0; local12 < 104; local12++) {
				for (local16 = 0; local16 < 104; local16++) {
					if ((this.aByteArrayArrayArray1[local5][local12][local16] & 0x1) == 1) {
						local10.method23(local16, local12);
					}
					if (local5 > 0 && (this.aByteArrayArrayArray1[1][local12][local16] & 0x2) == 2) {
						local3.anIntArrayArray1[local12][local16] = local10.anIntArrayArray1[local12][local16];
					}
				}
			}
			local3 = local10;
		}
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(145) int local145;
		@Pc(167) int local167;
		@Pc(180) int local180;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(212) int local212;
		@Pc(260) int local260;
		for (@Pc(77) int local77 = 0; local77 < 4; local77++) {
			@Pc(84) byte[][] local84 = this.aByteArrayArrayArray6[local77];
			local109 = (int) Math.sqrt((double) 5100);
			local115 = local109 * 768 >> 8;
			for (local117 = 1; local117 < this.anInt63 - 1; local117++) {
				for (local121 = 1; local121 < this.anInt62 - 1; local121++) {
					local145 = this.anIntArrayArrayArray1[local77][local121 + 1][local117] - this.anIntArrayArrayArray1[local77][local121 - 1][local117];
					local167 = this.anIntArrayArrayArray1[local77][local121][local117 + 1] - this.anIntArrayArrayArray1[local77][local121][local117 - 1];
					local180 = (int) Math.sqrt((double) (local145 * local145 + local167 * local167 + 65536));
					local186 = (local145 << 8) / local180;
					local190 = 65536 / local180;
					local196 = (local167 << 8) / local180;
					local212 = (local186 * -50 + local190 * -10 + local196 * -50) / local115 + 96;
					local260 = (local84[local121 - 1][local117] >> 2) + (local84[local121 + 1][local117] >> 3) + (local84[local121][local117 - 1] >> 2) + (local84[local121][local117 + 1] >> 3) + (local84[local121][local117] >> 1);
					this.anIntArrayArray2[local121][local117] = local212 - local260;
				}
			}
			for (local121 = 0; local121 < this.anInt63; local121++) {
				this.anIntArray4[local121] = 0;
				this.anIntArray5[local121] = 0;
				this.anIntArray6[local121] = 0;
				this.anIntArray7[local121] = 0;
				this.anIntArray8[local121] = 0;
			}
			for (local145 = -5; local145 < this.anInt62 + 5; local145++) {
				for (local167 = 0; local167 < this.anInt63; local167++) {
					local180 = local145 + 5;
					@Pc(395) int local395;
					if (local180 >= 0 && local180 < this.anInt62) {
						local186 = this.aByteArrayArrayArray2[local77][local180][local167] & 0xFF;
						if (local186 > 0) {
							@Pc(354) Class3 local354 = Class3.aClass3Array1[local186 - 1];
							this.anIntArray4[local167] += local354.anInt57;
							this.anIntArray5[local167] += local354.anInt55;
							this.anIntArray6[local167] += local354.anInt56;
							this.anIntArray7[local167] += local354.anInt58;
							local395 = this.anIntArray8[local167]++;
						}
					}
					local186 = local145 - 5;
					if (local186 >= 0 && local186 < this.anInt62) {
						local190 = this.aByteArrayArrayArray2[local77][local186][local167] & 0xFF;
						if (local190 > 0) {
							@Pc(427) Class3 local427 = Class3.aClass3Array1[local190 - 1];
							this.anIntArray4[local167] -= local427.anInt57;
							this.anIntArray5[local167] -= local427.anInt55;
							this.anIntArray6[local167] -= local427.anInt56;
							this.anIntArray7[local167] -= local427.anInt58;
							local395 = this.anIntArray8[local167]--;
						}
					}
				}
				if (local145 >= 1 && local145 < this.anInt62 - 1) {
					local180 = 0;
					local186 = 0;
					local190 = 0;
					local196 = 0;
					local212 = 0;
					for (local260 = -5; local260 < this.anInt63 + 5; local260++) {
						@Pc(503) int local503 = local260 + 5;
						if (local503 >= 0 && local503 < this.anInt63) {
							local180 += this.anIntArray4[local503];
							local186 += this.anIntArray5[local503];
							local190 += this.anIntArray6[local503];
							local196 += this.anIntArray7[local503];
							local212 += this.anIntArray8[local503];
						}
						@Pc(548) int local548 = local260 - 5;
						if (local548 >= 0 && local548 < this.anInt63) {
							local180 -= this.anIntArray4[local548];
							local186 -= this.anIntArray5[local548];
							local190 -= this.anIntArray6[local548];
							local196 -= this.anIntArray7[local548];
							local212 -= this.anIntArray8[local548];
						}
						if (local260 >= 1 && local260 < this.anInt63 - 1) {
							@Pc(602) int local602;
							if (aBoolean14) {
								local602 = local77;
								if (local77 > 0 && (this.aByteArrayArrayArray1[1][local145][local260] & 0x2) != 0) {
									local602 = local77 - 1;
								}
								if ((this.aByteArrayArrayArray1[local77][local145][local260] & 0x8) != 0) {
									local602 = 0;
								}
								if (local602 != anInt61 || (this.aByteArrayArrayArray1[local77][local145][local260] & 0x10) != 0) {
									continue;
								}
							}
							local602 = this.aByteArrayArrayArray2[local77][local145][local260] & 0xFF;
							@Pc(666) int local666 = this.aByteArrayArrayArray3[local77][local145][local260] & 0xFF;
							if (local602 > 0 || local666 > 0) {
								@Pc(679) int local679 = this.anIntArrayArrayArray1[local77][local145][local260];
								@Pc(690) int local690 = this.anIntArrayArrayArray1[local77][local145 + 1][local260];
								@Pc(703) int local703 = this.anIntArrayArrayArray1[local77][local145 + 1][local260 + 1];
								@Pc(714) int local714 = this.anIntArrayArrayArray1[local77][local145][local260 + 1];
								@Pc(721) int local721 = this.anIntArrayArray2[local145][local260];
								@Pc(730) int local730 = this.anIntArrayArray2[local145 + 1][local260];
								@Pc(741) int local741 = this.anIntArrayArray2[local145 + 1][local260 + 1];
								@Pc(750) int local750 = this.anIntArrayArray2[local145][local260 + 1];
								@Pc(752) int local752 = -1;
								if (local602 > 0) {
									local752 = this.method48(local180 * 256 / local196, local186 / local212, local190 / local212);
								}
								if (local77 > 0 && !aBoolean14) {
									@Pc(774) boolean local774 = true;
									if (local602 == 0 && this.aByteArrayArrayArray4[local77][local145][local260] != 0) {
										local774 = false;
									}
									if (local666 > 0 && !Class3.aClass3Array1[local666 - 1].aBoolean12) {
										local774 = false;
									}
									if (local774 && local679 == local690 && local679 == local703 && local679 == local714) {
										this.anIntArrayArrayArray2[local77][local145][local260] |= 0x924;
									}
								}
								@Pc(823) int local823 = 0;
								if (local752 != -1) {
									local823 = Class1_Sub3_Sub2_Sub1.anIntArray123[method46(local752, 96)];
								}
								if (local666 == 0) {
									arg1.method368(local77, local145, local260, 0, 0, -1, local679, local690, local703, local714, method46(local752, local721), method46(local752, local730), method46(local752, local741), method46(local752, local750), 0, 0, 0, 0, local823, 0);
								} else {
									@Pc(877) int local877 = this.aByteArrayArrayArray4[local77][local145][local260] + 1;
									@Pc(886) byte local886 = this.aByteArrayArrayArray5[local77][local145][local260];
									@Pc(892) Class3 local892 = Class3.aClass3Array1[local666 - 1];
									@Pc(895) int local895 = local892.anInt53;
									@Pc(903) int local903;
									@Pc(901) int local901;
									if (local895 >= 0) {
										local901 = Class1_Sub3_Sub2_Sub1.method210(local895);
										local903 = -1;
									} else if (local892.anInt52 == 16711935) {
										local901 = 0;
										local903 = -2;
										local895 = -1;
									} else {
										local903 = this.method48(local892.anInt54, local892.anInt55, local892.anInt56);
										local901 = Class1_Sub3_Sub2_Sub1.anIntArray123[this.method47(local903, 96)];
									}
									arg1.method368(local77, local145, local260, local877, local886, local895, local679, local690, local703, local714, method46(local752, local721), method46(local752, local730), method46(local752, local741), method46(local752, local750), this.method47(local903, local721), this.method47(local903, local730), this.method47(local903, local741), this.method47(local903, local750), local823, local901);
								}
							}
						}
					}
				}
			}
			for (local167 = 1; local167 < this.anInt63 - 1; local167++) {
				for (local180 = 1; local180 < this.anInt62 - 1; local180++) {
					local186 = local77;
					if (local77 > 0 && (this.aByteArrayArrayArray1[1][local180][local167] & 0x2) != 0) {
						local186 = local77 - 1;
					}
					if ((this.aByteArrayArrayArray1[local77][local180][local167] & 0x8) != 0) {
						local186 = 0;
					}
					arg1.method367(local77, local180, local167, local186);
				}
			}
		}
		arg1.method391(this.aByte3);
		for (local12 = 0; local12 < this.anInt62; local12++) {
			for (local16 = 0; local16 < this.anInt63; local16++) {
				if ((this.aByteArrayArrayArray1[1][local12][local16] & 0x2) == 2) {
					arg1.method365(local12, local16);
				}
			}
		}
		local16 = 1;
		@Pc(1098) int local1098 = 2;
		@Pc(1100) int local1100 = 4;
		for (@Pc(1102) int local1102 = 0; local1102 < 4; local1102++) {
			if (local1102 > 0) {
				local16 <<= 0x3;
				local1098 <<= 0x3;
				local1100 <<= 0x3;
			}
			for (@Pc(1120) int local1120 = 0; local1120 <= local1102; local1120++) {
				for (local109 = 0; local109 <= this.anInt63; local109++) {
					for (local115 = 0; local115 <= this.anInt62; local115++) {
						if ((this.anIntArrayArrayArray2[local1120][local115][local109] & local16) != 0) {
							local117 = local109;
							local121 = local109;
							local145 = local1120;
							local167 = local1120;
							while (local117 > 0 && (this.anIntArrayArrayArray2[local1120][local115][local117 - 1] & local16) != 0) {
								local117--;
							}
							while (local121 < this.anInt63 && (this.anIntArrayArrayArray2[local1120][local115][local121 + 1] & local16) != 0) {
								local121++;
							}
							label318: while (local145 > 0) {
								for (local180 = local117; local180 <= local121; local180++) {
									if ((this.anIntArrayArrayArray2[local145 - 1][local115][local180] & local16) == 0) {
										break label318;
									}
								}
								local145--;
							}
							label307: while (local167 < local1102) {
								for (local180 = local117; local180 <= local121; local180++) {
									if ((this.anIntArrayArrayArray2[local167 + 1][local115][local180] & local16) == 0) {
										break label307;
									}
								}
								local167++;
							}
							local180 = (local167 + 1 - local145) * (local121 + 1 - local117);
							if (local180 >= 8) {
								local190 = this.anIntArrayArrayArray1[local167][local115][local117] - 240;
								local196 = this.anIntArrayArrayArray1[local145][local115][local117];
								Class28.method366(local115 * 128, local121 * 128 + 128, local190, local117 * 128, 1, local115 * 128, local196, local1102);
								for (local212 = local145; local212 <= local167; local212++) {
									for (local260 = local117; local260 <= local121; local260++) {
										this.anIntArrayArrayArray2[local212][local115][local260] &= ~local16;
									}
								}
							}
						}
						if ((this.anIntArrayArrayArray2[local1120][local115][local109] & local1098) != 0) {
							local117 = local115;
							local121 = local115;
							local145 = local1120;
							local167 = local1120;
							while (local117 > 0 && (this.anIntArrayArrayArray2[local1120][local117 - 1][local109] & local1098) != 0) {
								local117--;
							}
							while (local121 < this.anInt62 && (this.anIntArrayArrayArray2[local1120][local121 + 1][local109] & local1098) != 0) {
								local121++;
							}
							label371: while (local145 > 0) {
								for (local180 = local117; local180 <= local121; local180++) {
									if ((this.anIntArrayArrayArray2[local145 - 1][local180][local109] & local1098) == 0) {
										break label371;
									}
								}
								local145--;
							}
							label360: while (local167 < local1102) {
								for (local180 = local117; local180 <= local121; local180++) {
									if ((this.anIntArrayArrayArray2[local167 + 1][local180][local109] & local1098) == 0) {
										break label360;
									}
								}
								local167++;
							}
							local180 = (local167 + 1 - local145) * (local121 + 1 - local117);
							if (local180 >= 8) {
								local190 = this.anIntArrayArrayArray1[local167][local117][local109] - 240;
								local196 = this.anIntArrayArrayArray1[local145][local117][local109];
								Class28.method366(local117 * 128, local109 * 128, local190, local109 * 128, 2, local121 * 128 + 128, local196, local1102);
								for (local212 = local145; local212 <= local167; local212++) {
									for (local260 = local117; local260 <= local121; local260++) {
										this.anIntArrayArrayArray2[local212][local260][local109] &= ~local1098;
									}
								}
							}
						}
						if (!aBoolean14 && (this.anIntArrayArrayArray2[local1120][local115][local109] & local1100) != 0) {
							local117 = local115;
							local121 = local115;
							local145 = local109;
							local167 = local109;
							while (local145 > 0 && (this.anIntArrayArrayArray2[local1120][local115][local145 - 1] & local1100) != 0) {
								local145--;
							}
							while (local167 < this.anInt63 && (this.anIntArrayArrayArray2[local1120][local115][local167 + 1] & local1100) != 0) {
								local167++;
							}
							label426: while (local117 > 0) {
								for (local180 = local145; local180 <= local167; local180++) {
									if ((this.anIntArrayArrayArray2[local1120][local117 - 1][local180] & local1100) == 0) {
										break label426;
									}
								}
								local117--;
							}
							label415: while (local121 < this.anInt62) {
								for (local180 = local145; local180 <= local167; local180++) {
									if ((this.anIntArrayArrayArray2[local1120][local121 + 1][local180] & local1100) == 0) {
										break label415;
									}
								}
								local121++;
							}
							if ((local121 + 1 - local117) * (local167 + 1 - local145) >= 4) {
								local180 = this.anIntArrayArrayArray1[local1120][local117][local145];
								Class28.method366(local117 * 128, local167 * 128 + 128, local180, local145 * 128, 4, local121 * 128 + 128, local180, local1102);
								for (local186 = local117; local186 <= local121; local186++) {
									for (local190 = local145; local190 <= local167; local190++) {
										this.anIntArrayArrayArray2[local1120][local186][local190] &= ~local1100;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
