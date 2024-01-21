import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt161;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "B")
	private static byte aByte4;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private static boolean aBoolean41;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "B")
	private static byte aByte5;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean42;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray27;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt164;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt165;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt160 = 143;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray23;

	static {
		aBoolean40 = true;
		aByte4 = 79;
		aBoolean41 = true;
		aByte5 = 3;
		aBoolean42 = true;
		anIntArray24 = new int[] { 1, 2, 4, 8 };
		anIntArray25 = new int[] { 16, 32, 64, 128 };
		anIntArray26 = new int[] { 1, 0, -1, 0 };
		anIntArray27 = new int[] { 0, -1, 0, 1 };
		anInt164 = (int) (Math.random() * 17.0D) - 8;
		anInt165 = (int) (Math.random() * 33.0D) - 16;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BII)Z")
	public static boolean method57(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3((byte) 3, arg1);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(23) int local23 = local9.method486();
				if (local23 == 0) {
					return local3;
				}
				local11 += local23;
				@Pc(31) int local31 = 0;
				@Pc(33) boolean local33 = false;
				while (true) {
					@Pc(38) int local38;
					while (!local33) {
						local38 = local9.method486();
						if (local38 == 0) {
							continue label53;
						}
						local31 += local38 - 1;
						@Pc(60) int local60 = local31 & 0x3F;
						@Pc(66) int local66 = local31 >> 6 & 0x3F;
						@Pc(71) int local71 = local9.method472() >> 2;
						@Pc(75) int local75 = local66 + arg2;
						@Pc(79) int local79 = local60 + arg0;
						if (local75 > 0 && local79 > 0 && local75 < 103 && local79 < 103) {
							@Pc(92) Class9 local92 = Class9.method286(local11);
							if (local71 != 22 || !aBoolean42 || local92.aBoolean133 || local92.aBoolean139) {
								local3 &= local92.method290();
								local33 = true;
							}
						}
					}
					local38 = local9.method486();
					if (local38 == 0) {
						break;
					}
					local9.method472();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("88676, " + arg0 + ", " + arg1 + ", " + -972 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;Lclient!ub;Z)V")
	public static void method58(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(14) int local14 = arg0.method486();
				if (local14 == 0) {
					return;
				}
				local3 += local14;
				@Pc(23) Class9 local23 = Class9.method286(local3);
				local23.method291(arg1);
				while (true) {
					@Pc(30) int local30 = arg0.method486();
					if (local30 == 0) {
						break;
					}
					arg0.method472();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("84807, " + arg0 + ", " + arg1 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method64(arg0 + 45365, arg1 + 91923, 4) + (method64(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method64(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method66(local3, local13);
		@Pc(29) int local29 = method66(local3 + 1, local13);
		@Pc(35) int local35 = method66(local3, local13 + 1);
		@Pc(43) int local43 = method66(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method65(local23, local29, local9, arg2);
		@Pc(55) int local55 = method65(local35, local43, local9, arg2);
		return method65(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray176[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method67(arg0 - 1, arg1 - 1) + method67(arg0 + 1, arg1 - 1) + method67(arg0 - 1, arg1 + 1) + method67(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method67(arg0 - 1, arg1) + method67(arg0 + 1, arg1) + method67(arg0, arg1 - 1) + method67(arg0, arg1 + 1);
		@Pc(59) int local59 = method67(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
	public static boolean method71(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(15) Class9 local15 = Class9.method286(arg2);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local15.method289(aByte5, arg1);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("50091, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!r;Lclient!jc;III[[[IB)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[][][] arg9) {
		try {
			@Pc(13) int local13 = arg9[arg6][arg1][arg8];
			@Pc(23) int local23 = arg9[arg6][arg1 + 1][arg8];
			@Pc(35) int local35 = arg9[arg6][arg1 + 1][arg8 + 1];
			@Pc(45) int local45 = arg9[arg6][arg1][arg8 + 1];
			@Pc(55) int local55 = local13 + local23 + local35 + local45 >> 2;
			@Pc(58) Class9 local58 = Class9.method286(arg2);
			@Pc(70) int local70 = arg1 + (arg8 << 7) + (arg2 << 14) + 1073741824;
			if (!local58.aBoolean133) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg7 << 6) + arg3);
			@Pc(101) Class1_Sub1_Sub1 local101;
			if (arg3 == 22) {
				if (local58.anInt491 == -1) {
					local101 = local58.method292(22, arg7, local13, local23, local35, local45, -1);
				} else {
					local101 = new Class1_Sub1_Sub1_Sub2(arg2, 22, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
				}
				arg4.method528(local70, arg1, arg8, arg0, local101, local55, local84);
				if (local58.aBoolean131 && local58.aBoolean133) {
					arg5.method419(arg1, aByte4, arg8);
				}
			} else {
				@Pc(194) int local194;
				if (arg3 == 10 || arg3 == 11) {
					if (local58.anInt491 == -1) {
						local101 = local58.method292(10, arg7, local13, local23, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(arg2, 10, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
					}
					if (local101 != null) {
						@Pc(181) int local181 = 0;
						if (arg3 == 11) {
							local181 += 256;
						}
						@Pc(197) int local197;
						if (arg7 == 1 || arg7 == 3) {
							local194 = local58.anInt490;
							local197 = local58.anInt489;
						} else {
							local194 = local58.anInt489;
							local197 = local58.anInt490;
						}
						arg4.method532(local194, local197, local55, arg1, local70, local101, local84, arg0, arg8, local181);
					}
					if (local58.aBoolean131) {
						arg5.method418(arg1, arg8, local58.aBoolean132, local58.anInt489, arg7, local58.anInt490);
					}
				} else if (arg3 >= 12) {
					if (local58.anInt491 == -1) {
						local101 = local58.method292(arg3, arg7, local13, local23, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(arg2, arg3, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
					}
					arg4.method532(1, 1, local55, arg1, local70, local101, local84, arg0, arg8, 0);
					if (local58.aBoolean131) {
						arg5.method418(arg1, arg8, local58.aBoolean132, local58.anInt489, arg7, local58.anInt490);
					}
				} else if (arg3 == 0) {
					if (local58.anInt491 == -1) {
						local101 = local58.method292(0, arg7, local13, local23, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(arg2, 0, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
					}
					arg4.method530(local70, local55, arg0, (byte) 4, null, arg8, anIntArray24[arg7], arg1, local84, local101, 0);
					if (local58.aBoolean131) {
						arg5.method417(arg3, arg7, local58.aBoolean132, arg8, arg1);
					}
				} else if (arg3 == 1) {
					if (local58.anInt491 == -1) {
						local101 = local58.method292(1, arg7, local13, local23, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(arg2, 1, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
					}
					arg4.method530(local70, local55, arg0, (byte) 4, null, arg8, anIntArray25[arg7], arg1, local84, local101, 0);
					if (local58.aBoolean131) {
						arg5.method417(arg3, arg7, local58.aBoolean132, arg8, arg1);
					}
				} else {
					@Pc(431) int local431;
					@Pc(457) Class1_Sub1_Sub1 local457;
					if (arg3 == 2) {
						local431 = arg7 + 1 & 0x3;
						@Pc(447) Class1_Sub1_Sub1 local447;
						if (local58.anInt491 == -1) {
							local447 = local58.method292(2, arg7 + 4, local13, local23, local35, local45, -1);
							local457 = local58.method292(2, local431, local13, local23, local35, local45, -1);
						} else {
							local447 = new Class1_Sub1_Sub1_Sub2(arg2, 2, local23, (byte) 3, local58.anInt491, local13, true, arg7 + 4, local45, local35);
							local457 = new Class1_Sub1_Sub1_Sub2(arg2, 2, local23, (byte) 3, local58.anInt491, local13, true, local431, local45, local35);
						}
						arg4.method530(local70, local55, arg0, (byte) 4, local457, arg8, anIntArray24[arg7], arg1, local84, local447, anIntArray24[local431]);
						if (local58.aBoolean131) {
							arg5.method417(arg3, arg7, local58.aBoolean132, arg8, arg1);
						}
					} else if (arg3 == 3) {
						if (local58.anInt491 == -1) {
							local101 = local58.method292(3, arg7, local13, local23, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(arg2, 3, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
						}
						arg4.method530(local70, local55, arg0, (byte) 4, null, arg8, anIntArray25[arg7], arg1, local84, local101, 0);
						if (local58.aBoolean131) {
							arg5.method417(arg3, arg7, local58.aBoolean132, arg8, arg1);
						}
					} else if (arg3 == 9) {
						if (local58.anInt491 == -1) {
							local101 = local58.method292(arg3, arg7, local13, local23, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(arg2, arg3, local23, (byte) 3, local58.anInt491, local13, true, arg7, local45, local35);
						}
						arg4.method532(1, 1, local55, arg1, local70, local101, local84, arg0, arg8, 0);
						if (local58.aBoolean131) {
							arg5.method418(arg1, arg8, local58.aBoolean132, local58.anInt489, arg7, local58.anInt490);
						}
					} else {
						if (local58.aBoolean134) {
							if (arg7 == 1) {
								local431 = local45;
								local45 = local35;
								local35 = local23;
								local23 = local13;
								local13 = local431;
							} else if (arg7 == 2) {
								local431 = local45;
								local45 = local23;
								local23 = local431;
								local431 = local35;
								local35 = local13;
								local13 = local431;
							} else if (arg7 == 3) {
								local431 = local45;
								local45 = local13;
								local13 = local23;
								local23 = local35;
								local35 = local431;
							}
						}
						if (arg3 == 4) {
							if (local58.anInt491 == -1) {
								local101 = local58.method292(4, 0, local13, local23, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg2, 4, local23, (byte) 3, local58.anInt491, local13, true, 0, local45, local35);
							}
							arg4.method531(arg1, arg7 * 512, local70, local55, local101, local84, 0, arg8, 0, arg0, anIntArray24[arg7]);
						} else if (arg3 == 5) {
							local431 = 16;
							local194 = arg4.method548(arg0, arg1, arg8);
							if (local194 > 0) {
								local431 = Class9.method286(local194 >> 14 & 0x7FFF).anInt492;
							}
							if (local58.anInt491 == -1) {
								local457 = local58.method292(4, 0, local13, local23, local35, local45, -1);
							} else {
								local457 = new Class1_Sub1_Sub1_Sub2(arg2, 4, local23, (byte) 3, local58.anInt491, local13, true, 0, local45, local35);
							}
							arg4.method531(arg1, arg7 * 512, local70, local55, local457, local84, anIntArray27[arg7] * local431, arg8, anIntArray26[arg7] * local431, arg0, anIntArray24[arg7]);
						} else if (arg3 == 6) {
							if (local58.anInt491 == -1) {
								local101 = local58.method292(4, 0, local13, local23, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg2, 4, local23, (byte) 3, local58.anInt491, local13, true, 0, local45, local35);
							}
							arg4.method531(arg1, arg7, local70, local55, local101, local84, 0, arg8, 0, arg0, 256);
						} else if (arg3 == 7) {
							if (local58.anInt491 == -1) {
								local101 = local58.method292(4, 0, local13, local23, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg2, 4, local23, (byte) 3, local58.anInt491, local13, true, 0, local45, local35);
							}
							arg4.method531(arg1, arg7, local70, local55, local101, local84, 0, arg8, 0, arg0, 512);
						} else if (arg3 == 8) {
							if (local58.anInt491 == -1) {
								local101 = local58.method292(4, 0, local13, local23, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg2, 4, local23, (byte) 3, local58.anInt491, local13, true, 0, local45, local35);
							}
							arg4.method531(arg1, arg7, local70, local55, local101, local84, 0, arg8, 0, arg0, 768);
						}
					}
				}
			}
		} catch (@Pc(975) RuntimeException local975) {
			signlink.reporterror("33380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + -6 + ", " + local975.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(BI[[[B[[[II)V")
	public Class4(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt162 = arg1;
			this.anInt163 = arg4;
			this.anIntArrayArrayArray3 = arg3;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt162][this.anInt163];
			this.anIntArrayArrayArray4 = new int[4][this.anInt162 + 1][this.anInt163 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt162 + 1][this.anInt163 + 1];
			this.anIntArrayArray2 = new int[this.anInt162 + 1][this.anInt163 + 1];
			this.anIntArray19 = new int[this.anInt163];
			this.anIntArray20 = new int[this.anInt163];
			this.anIntArray21 = new int[this.anInt163];
			this.anIntArray22 = new int[this.anInt163];
			this.anIntArray23 = new int[this.anInt163];
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("34751, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIII)V")
	public void method55(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		try {
			for (@Pc(7) int local7 = arg1; local7 <= arg1 + 64; local7++) {
				for (@Pc(11) int local11 = arg0; local11 <= arg0 + 64; local11++) {
					if (local11 >= 0 && local11 < this.anInt162 && local7 >= 0 && local7 < this.anInt163) {
						this.aByteArrayArrayArray6[0][local11][local7] = 127;
						if (local11 == arg0 && local11 > 0) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11 - 1][local7];
						}
						if (local11 == arg0 + 64 && local11 < this.anInt162 - 1) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11 + 1][local7];
						}
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11][local7 - 1];
						}
						if (local7 == arg1 + 64 && local7 < this.anInt163 - 1) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11][local7 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("59478, " + 64 + ", " + -117 + ", " + 64 + ", " + arg0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIII[BI)V")
	public void method56(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0) {
				@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3((byte) 3, arg4);
				for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
					for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
						for (@Pc(20) int local20 = 0; local20 < 64; local20++) {
							@Pc(26) int local26 = local16 + arg1;
							@Pc(30) int local30 = local20 + arg5;
							@Pc(52) int local52;
							if (local26 >= 0 && local26 < 104 && local30 >= 0 && local30 < 104) {
								this.aByteArrayArrayArray1[local12][local26][local30] = 0;
								while (true) {
									local52 = local10.method472();
									if (local52 == 0) {
										if (local12 == 0) {
											this.anIntArrayArrayArray3[0][local26][local30] = -method63(local26 + arg2 + 932731, local30 + 556238 + arg3) * 8;
										} else {
											this.anIntArrayArrayArray3[local12][local26][local30] = this.anIntArrayArrayArray3[local12 - 1][local26][local30] - 240;
										}
										break;
									}
									if (local52 == 1) {
										@Pc(108) int local108 = local10.method472();
										if (local108 == 1) {
											local108 = 0;
										}
										if (local12 == 0) {
											this.anIntArrayArrayArray3[0][local26][local30] = -local108 * 8;
										} else {
											this.anIntArrayArrayArray3[local12][local26][local30] = this.anIntArrayArrayArray3[local12 - 1][local26][local30] - local108 * 8;
										}
										break;
									}
									if (local52 <= 49) {
										this.aByteArrayArrayArray3[local12][local26][local30] = local10.method473();
										this.aByteArrayArrayArray4[local12][local26][local30] = (byte) ((local52 - 2) / 4);
										this.aByteArrayArrayArray5[local12][local26][local30] = (byte) (local52 - 2 & 0x3);
									} else if (local52 <= 81) {
										this.aByteArrayArrayArray1[local12][local26][local30] = (byte) (local52 - 49);
									} else {
										this.aByteArrayArrayArray2[local12][local26][local30] = (byte) (local52 - 81);
									}
								}
							} else {
								while (true) {
									local52 = local10.method472();
									if (local52 == 0) {
										break;
									}
									if (local52 == 1) {
										local10.method472();
										break;
									}
									if (local52 <= 49) {
										local10.method472();
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("1988, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!r;B[Lclient!jc;[BI)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class19[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 3, arg4);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(20) int local20 = local7.method486();
				if (local20 == 0) {
					return;
				}
				local9 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method486();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method472();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					@Pc(68) int local68 = local49 + arg0;
					@Pc(72) int local72 = local43 + arg5;
					if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
						@Pc(84) int local84 = local53;
						if ((this.aByteArrayArrayArray1[1][local68][local72] & 0x2) == 2) {
							local84 = local53 - 1;
						}
						@Pc(99) Class19 local99 = null;
						if (local84 >= 0) {
							local99 = arg3[local84];
						}
						this.method60(local60, local72, local53, local99, local9, local64, local68, arg1);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("87139, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!jc;IIILclient!r;I)V")
	private void method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class37 arg7) {
		try {
			if (aBoolean42) {
				if ((this.aByteArrayArrayArray1[arg2][arg6][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method62(arg1, arg2, arg6) != anInt161) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg2][arg6][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg1];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg1 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg2][arg6][arg1 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(84) Class9 local84 = Class9.method286(arg4);
			@Pc(96) int local96 = arg6 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!local84.aBoolean133) {
				local96 += Integer.MIN_VALUE;
			}
			@Pc(110) byte local110 = (byte) ((arg5 << 6) + arg0);
			@Pc(136) Class1_Sub1_Sub1 local136;
			if (arg0 != 22) {
				@Pc(231) int local231;
				if (arg0 == 10 || arg0 == 11) {
					if (local84.anInt491 == -1) {
						local136 = local84.method292(10, arg5, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(arg4, 10, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
					}
					if (local136 != null) {
						@Pc(218) int local218 = 0;
						if (arg0 == 11) {
							local218 += 256;
						}
						@Pc(234) int local234;
						if (arg5 == 1 || arg5 == 3) {
							local231 = local84.anInt490;
							local234 = local84.anInt489;
						} else {
							local231 = local84.anInt489;
							local234 = local84.anInt490;
						}
						if (arg7.method532(local231, local234, local78, arg6, local96, local136, local110, arg2, arg1, local218) && local84.aBoolean138) {
							@Pc(265) Class1_Sub1_Sub1_Sub5 local265;
							if (local136 instanceof Class1_Sub1_Sub1_Sub5) {
								local265 = (Class1_Sub1_Sub1_Sub5) local136;
							} else {
								local265 = local84.method292(10, arg5, local33, local44, local57, local68, -1);
							}
							if (local265 != null) {
								for (@Pc(281) int local281 = 0; local281 <= local231; local281++) {
									for (@Pc(285) int local285 = 0; local285 <= local234; local285++) {
										@Pc(292) int local292 = local265.anInt473 / 4;
										if (local292 > 30) {
											local292 = 30;
										}
										if (local292 > this.aByteArrayArrayArray6[arg2][arg6 + local281][arg1 + local285]) {
											this.aByteArrayArrayArray6[arg2][arg6 + local281][arg1 + local285] = (byte) local292;
										}
									}
								}
							}
						}
					}
					if (local84.aBoolean131 && arg3 != null) {
						arg3.method418(arg6, arg1, local84.aBoolean132, local84.anInt489, arg5, local84.anInt490);
					}
				} else if (arg0 >= 12) {
					if (local84.anInt491 == -1) {
						local136 = local84.method292(arg0, arg5, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
					}
					arg7.method532(1, 1, local78, arg6, local96, local136, local110, arg2, arg1, 0);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x924;
					}
					if (local84.aBoolean131 && arg3 != null) {
						arg3.method418(arg6, arg1, local84.aBoolean132, local84.anInt489, arg5, local84.anInt490);
					}
				} else if (arg0 == 0) {
					if (local84.anInt491 == -1) {
						local136 = local84.method292(0, arg5, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(arg4, 0, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
					}
					arg7.method530(local96, local78, arg2, (byte) 4, null, arg1, anIntArray24[arg5], arg6, local110, local136, 0);
					if (arg5 == 0) {
						if (local84.aBoolean138) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
						}
						if (local84.aBoolean136) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local84.aBoolean138) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						}
						if (local84.aBoolean136) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local84.aBoolean138) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						}
						if (local84.aBoolean136) {
							this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local84.aBoolean138) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
						}
						if (local84.aBoolean136) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
						}
					}
					if (local84.aBoolean131 && arg3 != null) {
						arg3.method417(arg0, arg5, local84.aBoolean132, arg1, arg6);
					}
					if (local84.anInt492 != 16) {
						arg7.method538(arg2, arg1, arg6, local84.anInt492);
					}
				} else if (arg0 == 1) {
					if (local84.anInt491 == -1) {
						local136 = local84.method292(1, arg5, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(arg4, 1, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
					}
					arg7.method530(local96, local78, arg2, (byte) 4, null, arg1, anIntArray25[arg5], arg6, local110, local136, 0);
					if (local84.aBoolean138) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
						}
					}
					if (local84.aBoolean131 && arg3 != null) {
						arg3.method417(arg0, arg5, local84.aBoolean132, arg1, arg6);
					}
				} else {
					@Pc(833) int local833;
					@Pc(859) Class1_Sub1_Sub1 local859;
					if (arg0 == 2) {
						local833 = arg5 + 1 & 0x3;
						@Pc(849) Class1_Sub1_Sub1 local849;
						if (local84.anInt491 == -1) {
							local849 = local84.method292(2, arg5 + 4, local33, local44, local57, local68, -1);
							local859 = local84.method292(2, local833, local33, local44, local57, local68, -1);
						} else {
							local849 = new Class1_Sub1_Sub1_Sub2(arg4, 2, local44, (byte) 3, local84.anInt491, local33, true, arg5 + 4, local68, local57);
							local859 = new Class1_Sub1_Sub1_Sub2(arg4, 2, local44, (byte) 3, local84.anInt491, local33, true, local833, local68, local57);
						}
						arg7.method530(local96, local78, arg2, (byte) 4, local859, arg1, anIntArray24[arg5], arg6, local110, local849, anIntArray24[local833]);
						if (local84.aBoolean136) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
							}
						}
						if (local84.aBoolean131 && arg3 != null) {
							arg3.method417(arg0, arg5, local84.aBoolean132, arg1, arg6);
						}
						if (local84.anInt492 != 16) {
							arg7.method538(arg2, arg1, arg6, local84.anInt492);
						}
					} else if (arg0 == 3) {
						if (local84.anInt491 == -1) {
							local136 = local84.method292(3, arg5, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(arg4, 3, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
						}
						arg7.method530(local96, local78, arg2, (byte) 4, null, arg1, anIntArray25[arg5], arg6, local110, local136, 0);
						if (local84.aBoolean138) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							}
						}
						if (local84.aBoolean131 && arg3 != null) {
							arg3.method417(arg0, arg5, local84.aBoolean132, arg1, arg6);
						}
					} else if (arg0 == 9) {
						if (local84.anInt491 == -1) {
							local136 = local84.method292(arg0, arg5, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
						}
						arg7.method532(1, 1, local78, arg6, local96, local136, local110, arg2, arg1, 0);
						if (local84.aBoolean131 && arg3 != null) {
							arg3.method418(arg6, arg1, local84.aBoolean132, local84.anInt489, arg5, local84.anInt490);
						}
					} else {
						if (local84.aBoolean134) {
							if (arg5 == 1) {
								local833 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local833;
							} else if (arg5 == 2) {
								local833 = local68;
								local68 = local44;
								local44 = local833;
								local833 = local57;
								local57 = local33;
								local33 = local833;
							} else if (arg5 == 3) {
								local833 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local833;
							}
						}
						if (arg0 == 4) {
							if (local84.anInt491 == -1) {
								local136 = local84.method292(4, 0, local33, local44, local57, local68, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local44, (byte) 3, local84.anInt491, local33, true, 0, local68, local57);
							}
							arg7.method531(arg6, arg5 * 512, local96, local78, local136, local110, 0, arg1, 0, arg2, anIntArray24[arg5]);
						} else if (arg0 == 5) {
							local833 = 16;
							local231 = arg7.method548(arg2, arg6, arg1);
							if (local231 > 0) {
								local833 = Class9.method286(local231 >> 14 & 0x7FFF).anInt492;
							}
							if (local84.anInt491 == -1) {
								local859 = local84.method292(4, 0, local33, local44, local57, local68, -1);
							} else {
								local859 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local44, (byte) 3, local84.anInt491, local33, true, 0, local68, local57);
							}
							arg7.method531(arg6, arg5 * 512, local96, local78, local859, local110, anIntArray27[arg5] * local833, arg1, anIntArray26[arg5] * local833, arg2, anIntArray24[arg5]);
						} else if (arg0 == 6) {
							if (local84.anInt491 == -1) {
								local136 = local84.method292(4, 0, local33, local44, local57, local68, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local44, (byte) 3, local84.anInt491, local33, true, 0, local68, local57);
							}
							arg7.method531(arg6, arg5, local96, local78, local136, local110, 0, arg1, 0, arg2, 256);
						} else if (arg0 == 7) {
							if (local84.anInt491 == -1) {
								local136 = local84.method292(4, 0, local33, local44, local57, local68, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local44, (byte) 3, local84.anInt491, local33, true, 0, local68, local57);
							}
							arg7.method531(arg6, arg5, local96, local78, local136, local110, 0, arg1, 0, arg2, 512);
						} else if (arg0 == 8) {
							if (local84.anInt491 == -1) {
								local136 = local84.method292(4, 0, local33, local44, local57, local68, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local44, (byte) 3, local84.anInt491, local33, true, 0, local68, local57);
							}
							arg7.method531(arg6, arg5, local96, local78, local136, local110, 0, arg1, 0, arg2, 768);
						}
					}
				}
			} else if (!aBoolean42 || local84.aBoolean133 || local84.aBoolean139) {
				if (local84.anInt491 == -1) {
					local136 = local84.method292(22, arg5, local33, local44, local57, local68, -1);
				} else {
					local136 = new Class1_Sub1_Sub1_Sub2(arg4, 22, local44, (byte) 3, local84.anInt491, local33, true, arg5, local68, local57);
				}
				arg7.method528(local96, arg6, arg1, arg2, local136, local78, local110);
				if (local84.aBoolean131 && local84.aBoolean133 && arg3 != null) {
					arg3.method419(arg6, aByte4, arg1);
				}
			}
		} catch (@Pc(1583) RuntimeException local1583) {
			signlink.reporterror("66836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + local1583.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!r;[Lclient!jc;)V")
	public void method61(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Class19[] arg1) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(34) int local34;
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < 104; local14++) {
					for (local18 = 0; local18 < 104; local18++) {
						if ((this.aByteArrayArrayArray1[local10][local14][local18] & 0x1) == 1) {
							local34 = local10;
							if ((this.aByteArrayArrayArray1[1][local14][local18] & 0x2) == 2) {
								local34 = local10 - 1;
							}
							if (local34 >= 0) {
								arg1[local34].method419(local14, aByte4, local18);
							}
						}
					}
				}
			}
			anInt164 += (int) (Math.random() * 5.0D) - 2;
			if (anInt164 < -8) {
				anInt164 = -8;
			}
			if (anInt164 > 8) {
				anInt164 = 8;
			}
			anInt165 += (int) (Math.random() * 5.0D) - 2;
			if (anInt165 < -16) {
				anInt165 = -16;
			}
			if (anInt165 > 16) {
				anInt165 = 16;
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
				@Pc(115) byte[][] local115 = this.aByteArrayArrayArray6[local14];
				local140 = (int) Math.sqrt((double) 5100);
				local146 = local140 * 768 >> 8;
				for (local148 = 1; local148 < this.anInt163 - 1; local148++) {
					for (local152 = 1; local152 < this.anInt162 - 1; local152++) {
						local176 = this.anIntArrayArrayArray3[local14][local152 + 1][local148] - this.anIntArrayArrayArray3[local14][local152 - 1][local148];
						local198 = this.anIntArrayArrayArray3[local14][local152][local148 + 1] - this.anIntArrayArrayArray3[local14][local152][local148 - 1];
						local211 = (int) Math.sqrt((double) (local176 * local176 + local198 * local198 + 65536));
						local217 = (local176 << 8) / local211;
						local221 = 65536 / local211;
						local227 = (local198 << 8) / local211;
						local243 = (local217 * -50 + local221 * -10 + local227 * -50) / local146 + 96;
						local291 = (local115[local152 - 1][local148] >> 2) + (local115[local152 + 1][local148] >> 3) + (local115[local152][local148 - 1] >> 2) + (local115[local152][local148 + 1] >> 3) + (local115[local152][local148] >> 1);
						this.anIntArrayArray2[local152][local148] = local243 - local291;
					}
				}
				for (local152 = 0; local152 < this.anInt163; local152++) {
					this.anIntArray19[local152] = 0;
					this.anIntArray20[local152] = 0;
					this.anIntArray21[local152] = 0;
					this.anIntArray22[local152] = 0;
					this.anIntArray23[local152] = 0;
				}
				for (local176 = -5; local176 < this.anInt162 + 5; local176++) {
					for (local198 = 0; local198 < this.anInt163; local198++) {
						local211 = local176 + 5;
						@Pc(426) int local426;
						if (local211 >= 0 && local211 < this.anInt162) {
							local217 = this.aByteArrayArrayArray2[local14][local211][local198] & 0xFF;
							if (local217 > 0) {
								@Pc(385) Class21 local385 = Class21.aClass21Array1[local217 - 1];
								this.anIntArray19[local198] += local385.anInt689;
								this.anIntArray20[local198] += local385.anInt687;
								this.anIntArray21[local198] += local385.anInt688;
								this.anIntArray22[local198] += local385.anInt690;
								local426 = this.anIntArray23[local198]++;
							}
						}
						local217 = local176 - 5;
						if (local217 >= 0 && local217 < this.anInt162) {
							local221 = this.aByteArrayArrayArray2[local14][local217][local198] & 0xFF;
							if (local221 > 0) {
								@Pc(458) Class21 local458 = Class21.aClass21Array1[local221 - 1];
								this.anIntArray19[local198] -= local458.anInt689;
								this.anIntArray20[local198] -= local458.anInt687;
								this.anIntArray21[local198] -= local458.anInt688;
								this.anIntArray22[local198] -= local458.anInt690;
								local426 = this.anIntArray23[local198]--;
							}
						}
					}
					if (local176 >= 1 && local176 < this.anInt162 - 1) {
						local211 = 0;
						local217 = 0;
						local221 = 0;
						local227 = 0;
						local243 = 0;
						for (local291 = -5; local291 < this.anInt163 + 5; local291++) {
							@Pc(534) int local534 = local291 + 5;
							if (local534 >= 0 && local534 < this.anInt163) {
								local211 += this.anIntArray19[local534];
								local217 += this.anIntArray20[local534];
								local221 += this.anIntArray21[local534];
								local227 += this.anIntArray22[local534];
								local243 += this.anIntArray23[local534];
							}
							@Pc(579) int local579 = local291 - 5;
							if (local579 >= 0 && local579 < this.anInt163) {
								local211 -= this.anIntArray19[local579];
								local217 -= this.anIntArray20[local579];
								local221 -= this.anIntArray21[local579];
								local227 -= this.anIntArray22[local579];
								local243 -= this.anIntArray23[local579];
							}
							if (local291 >= 1 && local291 < this.anInt163 - 1 && (!aBoolean42 || (this.aByteArrayArrayArray1[local14][local176][local291] & 0x10) == 0 && this.method62(local291, local14, local176) == anInt161)) {
								@Pc(662) int local662 = this.aByteArrayArrayArray2[local14][local176][local291] & 0xFF;
								@Pc(673) int local673 = this.aByteArrayArrayArray3[local14][local176][local291] & 0xFF;
								if (local662 > 0 || local673 > 0) {
									@Pc(686) int local686 = this.anIntArrayArrayArray3[local14][local176][local291];
									@Pc(697) int local697 = this.anIntArrayArrayArray3[local14][local176 + 1][local291];
									@Pc(710) int local710 = this.anIntArrayArrayArray3[local14][local176 + 1][local291 + 1];
									@Pc(721) int local721 = this.anIntArrayArrayArray3[local14][local176][local291 + 1];
									@Pc(728) int local728 = this.anIntArrayArray2[local176][local291];
									@Pc(737) int local737 = this.anIntArrayArray2[local176 + 1][local291];
									@Pc(748) int local748 = this.anIntArrayArray2[local176 + 1][local291 + 1];
									@Pc(757) int local757 = this.anIntArrayArray2[local176][local291 + 1];
									@Pc(759) int local759 = -1;
									@Pc(761) int local761 = -1;
									@Pc(769) int local769;
									@Pc(773) int local773;
									if (local662 > 0) {
										local769 = local211 * 256 / local227;
										local773 = local217 / local243;
										@Pc(777) int local777 = local221 / local243;
										local759 = this.method70(local769, local773, local777);
										@Pc(789) int local789 = local769 + anInt164 & 0xFF;
										local777 += anInt165;
										if (local777 < 0) {
											local777 = 0;
										} else if (local777 > 255) {
											local777 = 255;
										}
										local761 = this.method70(local789, local773, local777);
									}
									if (local14 > 0) {
										@Pc(814) boolean local814 = true;
										if (local662 == 0 && this.aByteArrayArrayArray4[local14][local176][local291] != 0) {
											local814 = false;
										}
										if (local673 > 0 && !Class21.aClass21Array1[local673 - 1].aBoolean197) {
											local814 = false;
										}
										if (local814 && local686 == local697 && local686 == local710 && local686 == local721) {
											this.anIntArrayArrayArray4[local14][local176][local291] |= 0x924;
										}
									}
									local769 = 0;
									if (local759 != -1) {
										local769 = Class1_Sub1_Sub2_Sub1.anIntArray180[method68(local761, 96)];
									}
									if (local673 == 0) {
										arg0.method527(local14, local176, local291, 0, 0, -1, local686, local697, local710, local721, method68(local759, local728), method68(local759, local737), method68(local759, local748), method68(local759, local757), 0, 0, 0, 0, local769, 0);
									} else {
										local773 = this.aByteArrayArrayArray4[local14][local176][local291] + 1;
										@Pc(926) byte local926 = this.aByteArrayArrayArray5[local14][local176][local291];
										@Pc(932) Class21 local932 = Class21.aClass21Array1[local673 - 1];
										@Pc(935) int local935 = local932.anInt685;
										@Pc(944) int local944;
										@Pc(942) int local942;
										if (local935 >= 0) {
											local942 = Class1_Sub1_Sub2_Sub1.method344(local935, this.anInt160);
											local944 = -1;
										} else if (local932.anInt684 == 16711935) {
											local942 = 0;
											local944 = -2;
											local935 = -1;
										} else {
											local944 = this.method70(local932.anInt686, local932.anInt687, local932.anInt688);
											local942 = Class1_Sub1_Sub2_Sub1.anIntArray180[this.method69(local932.anInt691, 96)];
										}
										arg0.method527(local14, local176, local291, local773, local926, local935, local686, local697, local710, local721, method68(local759, local728), method68(local759, local737), method68(local759, local748), method68(local759, local757), this.method69(local944, local728), this.method69(local944, local737), this.method69(local944, local748), this.method69(local944, local757), local769, local942);
									}
								}
							}
						}
					}
				}
				for (local198 = 1; local198 < this.anInt163 - 1; local198++) {
					for (local211 = 1; local211 < this.anInt162 - 1; local211++) {
						arg0.method526(local14, local211, local198, this.method62(local198, local14, local211));
					}
				}
			}
			arg0.method553(aBoolean40);
			for (local18 = 0; local18 < this.anInt162; local18++) {
				for (local34 = 0; local34 < this.anInt163; local34++) {
					if ((this.aByteArrayArrayArray1[1][local18][local34] & 0x2) == 2) {
						arg0.method524(local18, local34);
					}
				}
			}
			local34 = 1;
			@Pc(1115) int local1115 = 2;
			@Pc(1117) int local1117 = 4;
			for (@Pc(1119) int local1119 = 0; local1119 < 4; local1119++) {
				if (local1119 > 0) {
					local34 <<= 0x3;
					local1115 <<= 0x3;
					local1117 <<= 0x3;
				}
				for (@Pc(1137) int local1137 = 0; local1137 <= local1119; local1137++) {
					for (local140 = 0; local140 <= this.anInt163; local140++) {
						for (local146 = 0; local146 <= this.anInt162; local146++) {
							if ((this.anIntArrayArrayArray4[local1137][local146][local140] & local34) != 0) {
								local148 = local140;
								local152 = local140;
								local176 = local1137;
								local198 = local1137;
								while (local148 > 0 && (this.anIntArrayArrayArray4[local1137][local146][local148 - 1] & local34) != 0) {
									local148--;
								}
								while (local152 < this.anInt163 && (this.anIntArrayArrayArray4[local1137][local146][local152 + 1] & local34) != 0) {
									local152++;
								}
								label324: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray4[local176 - 1][local146][local211] & local34) == 0) {
											break label324;
										}
									}
									local176--;
								}
								label313: while (local198 < local1119) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray4[local198 + 1][local146][local211] & local34) == 0) {
											break label313;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray3[local198][local146][local148] - 240;
									local227 = this.anIntArrayArrayArray3[local176][local146][local148];
									Class37.method525(local146 * 128, local221, local146 * 128, local152 * 128 + 128, local148 * 128, local227, local1119, 1);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray4[local243][local146][local291] &= ~local34;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1137][local146][local140] & local1115) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local1137;
								local198 = local1137;
								while (local148 > 0 && (this.anIntArrayArrayArray4[local1137][local148 - 1][local140] & local1115) != 0) {
									local148--;
								}
								while (local152 < this.anInt162 && (this.anIntArrayArrayArray4[local1137][local152 + 1][local140] & local1115) != 0) {
									local152++;
								}
								label377: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray4[local176 - 1][local211][local140] & local1115) == 0) {
											break label377;
										}
									}
									local176--;
								}
								label366: while (local198 < local1119) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray4[local198 + 1][local211][local140] & local1115) == 0) {
											break label366;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray3[local198][local148][local140] - 240;
									local227 = this.anIntArrayArrayArray3[local176][local148][local140];
									Class37.method525(local152 * 128 + 128, local221, local148 * 128, local140 * 128, local140 * 128, local227, local1119, 2);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray4[local243][local291][local140] &= ~local1115;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1137][local146][local140] & local1117) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local140;
								local198 = local140;
								while (local176 > 0 && (this.anIntArrayArrayArray4[local1137][local146][local176 - 1] & local1117) != 0) {
									local176--;
								}
								while (local198 < this.anInt163 && (this.anIntArrayArrayArray4[local1137][local146][local198 + 1] & local1117) != 0) {
									local198++;
								}
								label430: while (local148 > 0) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray4[local1137][local148 - 1][local211] & local1117) == 0) {
											break label430;
										}
									}
									local148--;
								}
								label419: while (local152 < this.anInt162) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray4[local1137][local152 + 1][local211] & local1117) == 0) {
											break label419;
										}
									}
									local152++;
								}
								if ((local152 + 1 - local148) * (local198 + 1 - local176) >= 4) {
									local211 = this.anIntArrayArrayArray3[local1137][local148][local176];
									Class37.method525(local152 * 128 + 128, local211, local148 * 128, local198 * 128 + 128, local176 * 128, local211, local1119, 4);
									for (local217 = local148; local217 <= local152; local217++) {
										for (local221 = local176; local221 <= local198; local221++) {
											this.anIntArrayArrayArray4[local1137][local217][local221] &= ~local1117;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1752) RuntimeException local1752) {
			signlink.reporterror("24060, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local1752.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method62(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("61011, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
