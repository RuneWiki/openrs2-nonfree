import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private static boolean aBoolean40;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt160 = 3;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt161 = 650;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean41 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt165 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt166 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt159 = 8;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

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
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[B)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, (byte) -93);
			@Pc(19) int local19 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local9.method494();
				if (local22 == 0) {
					return local3;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local9.method494();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local9.method480() >> 2;
						@Pc(74) int local74 = local65 + arg0;
						@Pc(78) int local78 = local59 + arg1;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class9 local91 = Class9.method288(local19);
							if (local70 != 22 || !aBoolean41 || local91.aBoolean127 || local91.aBoolean133) {
								local3 &= local91.method292();
								local32 = true;
							}
						}
					}
					local37 = local9.method494();
					if (local37 == 0) {
						break;
					}
					local9.method480();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("7859, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ub;ILclient!lb;)V")
	public static void method59(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(3) int local3 = -1;
			@Pc(7) boolean local7 = false;
			while (true) {
				@Pc(10) int local10 = arg2.method494();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class9 local19 = Class9.method288(local3);
				local19.method293(arg0, (byte) 9);
				while (true) {
					@Pc(26) int local26 = arg2.method494();
					if (local26 == 0) {
						break;
					}
					arg2.method480();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("57359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method65(arg0 + 45365, arg1 + 91923, 4) + (method65(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method65(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method67(local3, local13);
		@Pc(29) int local29 = method67(local3 + 1, local13);
		@Pc(35) int local35 = method67(local3, local13 + 1);
		@Pc(43) int local43 = method67(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method66(local23, local29, local9, arg2);
		@Pc(55) int local55 = method66(local35, local43, local9, arg2);
		return method66(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray179[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method68(arg0 - 1, arg1 - 1) + method68(arg0 + 1, arg1 - 1) + method68(arg0 - 1, arg1 + 1) + method68(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method68(arg0 - 1, arg1) + method68(arg0 + 1, arg1) + method68(arg0, arg1 - 1) + method68(arg0, arg1 + 1);
		@Pc(59) int local59 = method68(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class9 local7 = Class9.method288(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local7.method291(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("96789, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZILclient!r;ILclient!jc;I[[[IIII)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg8][arg7][arg3];
			@Pc(19) int local19 = arg6[arg8][arg7 + 1][arg3];
			@Pc(31) int local31 = arg6[arg8][arg7 + 1][arg3 + 1];
			@Pc(41) int local41 = arg6[arg8][arg7][arg3 + 1];
			@Pc(55) int local55 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class9 local58 = Class9.method288(arg9);
			@Pc(70) int local70 = arg7 + (arg3 << 7) + (arg9 << 14) + 1073741824;
			if (!local58.aBoolean127) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg5);
			@Pc(104) Class1_Sub1_Sub1 local104;
			if (arg5 == 22) {
				if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
					local104 = local58.method294(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 22, arg0, local19, (byte) 86, arg9, local31, local9, local41);
				}
				arg2.method536(local55, arg1, arg3, local84, arg7, local104, local70);
				if (local58.aBoolean125 && local58.aBoolean127) {
					arg4.method423(arg7, arg3);
				}
			} else {
				@Pc(200) int local200;
				if (arg5 == 10 || arg5 == 11) {
					if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
						local104 = local58.method294(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 10, arg0, local19, (byte) 86, arg9, local31, local9, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg5 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg0 == 1 || arg0 == 3) {
							local200 = local58.anInt482;
							local203 = local58.anInt481;
						} else {
							local200 = local58.anInt481;
							local203 = local58.anInt482;
						}
						arg2.method540(local70, arg7, arg3, local200, local104, arg1, local187, local203, local55, local84);
					}
					if (local58.aBoolean125) {
						arg4.method422(local58.anInt481, arg3, local58.anInt482, local58.aBoolean126, arg0, arg7);
					}
				} else if (arg5 >= 12) {
					if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
						local104 = local58.method294(arg5, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, arg5, arg0, local19, (byte) 86, arg9, local31, local9, local41);
					}
					arg2.method540(local70, arg7, arg3, 1, local104, arg1, 0, 1, local55, local84);
					if (local58.aBoolean125) {
						arg4.method422(local58.anInt481, arg3, local58.anInt482, local58.aBoolean126, arg0, arg7);
					}
				} else if (arg5 == 0) {
					if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
						local104 = local58.method294(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 0, arg0, local19, (byte) 86, arg9, local31, local9, local41);
					}
					arg2.method538(local84, arg3, local104, local55, 0, arg7, null, local70, anIntArray25[arg0], arg1);
					if (local58.aBoolean125) {
						arg4.method421(arg5, arg3, arg7, arg0, (byte) 1, local58.aBoolean126);
					}
				} else if (arg5 == 1) {
					if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
						local104 = local58.method294(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 1, arg0, local19, (byte) 86, arg9, local31, local9, local41);
					}
					arg2.method538(local84, arg3, local104, local55, 0, arg7, null, local70, anIntArray26[arg0], arg1);
					if (local58.aBoolean125) {
						arg4.method421(arg5, arg3, arg7, arg0, (byte) 1, local58.aBoolean126);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class1_Sub1_Sub1 local475;
					if (arg5 == 2) {
						local446 = arg0 + 1 & 0x3;
						@Pc(465) Class1_Sub1_Sub1 local465;
						if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
							local465 = local58.method294(2, arg0 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method294(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 2, arg0 + 4, local19, (byte) 86, arg9, local31, local9, local41);
							local475 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 2, local446, local19, (byte) 86, arg9, local31, local9, local41);
						}
						arg2.method538(local84, arg3, local465, local55, anIntArray25[local446], arg7, local475, local70, anIntArray25[arg0], arg1);
						if (local58.aBoolean125) {
							arg4.method421(arg5, arg3, arg7, arg0, (byte) 1, local58.aBoolean126);
						}
					} else if (arg5 == 3) {
						if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
							local104 = local58.method294(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 3, arg0, local19, (byte) 86, arg9, local31, local9, local41);
						}
						arg2.method538(local84, arg3, local104, local55, 0, arg7, null, local70, anIntArray26[arg0], arg1);
						if (local58.aBoolean125) {
							arg4.method421(arg5, arg3, arg7, arg0, (byte) 1, local58.aBoolean126);
						}
					} else if (arg5 == 9) {
						if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
							local104 = local58.method294(arg5, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, arg5, arg0, local19, (byte) 86, arg9, local31, local9, local41);
						}
						arg2.method540(local70, arg7, arg3, 1, local104, arg1, 0, 1, local55, local84);
						if (local58.aBoolean125) {
							arg4.method422(local58.anInt481, arg3, local58.anInt482, local58.aBoolean126, arg0, arg7);
						}
					} else {
						if (local58.aBoolean128) {
							if (arg0 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg0 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg0 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg5 == 4) {
							if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
								local104 = local58.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 4, 0, local19, (byte) 86, arg9, local31, local9, local41);
							}
							arg2.method539(arg7, 0, arg1, local70, 0, arg3, local55, local104, local84, anIntArray25[arg0], arg0 * 512);
						} else if (arg5 == 5) {
							local446 = 16;
							local200 = arg2.method556(arg1, arg7, arg3);
							if (local200 > 0) {
								local446 = Class9.method288(local200 >> 14 & 0x7FFF).anInt484;
							}
							if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
								local475 = local58.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 4, 0, local19, (byte) 86, arg9, local31, local9, local41);
							}
							arg2.method539(arg7, anIntArray28[arg0] * local446, arg1, local70, anIntArray27[arg0] * local446, arg3, local55, local475, local84, anIntArray25[arg0], arg0 * 512);
						} else if (arg5 == 6) {
							if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
								local104 = local58.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 4, 0, local19, (byte) 86, arg9, local31, local9, local41);
							}
							arg2.method539(arg7, 0, arg1, local70, 0, arg3, local55, local104, local84, 256, arg0);
						} else if (arg5 == 7) {
							if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
								local104 = local58.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 4, 0, local19, (byte) 86, arg9, local31, local9, local41);
							}
							arg2.method539(arg7, 0, arg1, local70, 0, arg3, local55, local104, local84, 512, arg0);
						} else if (arg5 == 8) {
							if (local58.anInt483 == -1 && local58.anIntArray160 == null) {
								local104 = local58.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local58.anInt483, true, 4, 0, local19, (byte) 86, arg9, local31, local9, local41);
							}
							arg2.method539(arg7, 0, arg1, local70, 0, arg3, local55, local104, local84, 768, arg0);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("62628, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[II[[[BI)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt163 = arg0;
			this.anInt164 = arg2;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt163][this.anInt164];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt163][this.anInt164];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt163][this.anInt164];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt163][this.anInt164];
			this.anIntArrayArrayArray4 = new int[4][this.anInt163 + 1][this.anInt164 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt163 + 1][this.anInt164 + 1];
			this.anIntArrayArray2 = new int[this.anInt163 + 1][this.anInt164 + 1];
			this.anIntArray20 = new int[this.anInt164];
			this.anIntArray21 = new int[this.anInt164];
			this.anIntArray22 = new int[this.anInt164];
			this.anIntArray23 = new int[this.anInt164];
			this.anIntArray24 = new int[this.anInt164];
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("59444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt163 && local3 >= 0 && local3 < this.anInt164) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt163 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt164 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("73041, " + arg0 + ", " + 64 + ", " + 64 + ", " + arg1 + ", " + 551 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[BI)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, (byte) -93);
			@Pc(11) boolean local11 = false;
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
					for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
						@Pc(27) int local27 = local17 + arg5;
						@Pc(31) int local31 = local21 + arg0;
						@Pc(53) int local53;
						if (local27 >= 0 && local27 < 104 && local31 >= 0 && local31 < 104) {
							this.aByteArrayArrayArray1[local13][local27][local31] = 0;
							while (true) {
								local53 = local7.method480();
								if (local53 == 0) {
									if (local13 == 0) {
										this.anIntArrayArrayArray3[0][local27][local31] = -method64(local27 + arg2 + 932731, local31 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray3[local13][local27][local31] = this.anIntArrayArrayArray3[local13 - 1][local27][local31] - 240;
									}
									break;
								}
								if (local53 == 1) {
									@Pc(109) int local109 = local7.method480();
									if (local109 == 1) {
										local109 = 0;
									}
									if (local13 == 0) {
										this.anIntArrayArrayArray3[0][local27][local31] = -local109 * 8;
									} else {
										this.anIntArrayArrayArray3[local13][local27][local31] = this.anIntArrayArrayArray3[local13 - 1][local27][local31] - local109 * 8;
									}
									break;
								}
								if (local53 <= 49) {
									this.aByteArrayArrayArray3[local13][local27][local31] = local7.method481();
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
								local53 = local7.method480();
								if (local53 == 0) {
									break;
								}
								if (local53 == 1) {
									local7.method480();
									break;
								}
								if (local53 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("79810, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;[BBILclient!r;I)V")
	public void method60(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) Class1_Sub1_Sub3 local17 = new Class1_Sub1_Sub3(arg1, (byte) -93);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method494();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method494();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method480();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg2;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg0[local86];
						}
						this.method61(local19, local62, local70, local66, 936, local74, local55, local101, arg3);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("44073, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIILclient!jc;Lclient!r;)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) Class37 arg8) {
		try {
			if (aBoolean41) {
				if ((this.aByteArrayArrayArray1[arg6][arg2][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method63(856, arg5, arg2, arg6) != anInt162) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg6][arg2][arg5];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg6][arg2 + 1][arg5];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg6][arg2 + 1][arg5 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg6][arg2][arg5 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(82) boolean local82 = false;
			@Pc(85) Class9 local85 = Class9.method288(arg0);
			@Pc(97) int local97 = arg2 + (arg5 << 7) + (arg0 << 14) + 1073741824;
			if (!local85.aBoolean127) {
				local97 += Integer.MIN_VALUE;
			}
			@Pc(111) byte local111 = (byte) ((arg3 << 6) + arg1);
			@Pc(140) Class1_Sub1_Sub1 local140;
			if (arg1 != 22) {
				@Pc(238) int local238;
				if (arg1 == 10 || arg1 == 11) {
					if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
						local140 = local85.method294(10, arg3, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 10, arg3, local44, (byte) 86, arg0, local57, local33, local68);
					}
					if (local140 != null) {
						@Pc(225) int local225 = 0;
						if (arg1 == 11) {
							local225 += 256;
						}
						@Pc(241) int local241;
						if (arg3 == 1 || arg3 == 3) {
							local238 = local85.anInt482;
							local241 = local85.anInt481;
						} else {
							local238 = local85.anInt481;
							local241 = local85.anInt482;
						}
						if (arg8.method540(local97, arg2, arg5, local238, local140, arg6, local225, local241, local78, local111) && local85.aBoolean132) {
							@Pc(272) Class1_Sub1_Sub1_Sub5 local272;
							if (local140 instanceof Class1_Sub1_Sub1_Sub5) {
								local272 = (Class1_Sub1_Sub1_Sub5) local140;
							} else {
								local272 = local85.method294(10, arg3, local33, local44, local57, local68, -1);
							}
							if (local272 != null) {
								for (@Pc(288) int local288 = 0; local288 <= local238; local288++) {
									for (@Pc(292) int local292 = 0; local292 <= local241; local292++) {
										@Pc(299) int local299 = local272.anInt467 / 4;
										if (local299 > 30) {
											local299 = 30;
										}
										if (local299 > this.aByteArrayArrayArray6[arg6][arg2 + local288][arg5 + local292]) {
											this.aByteArrayArrayArray6[arg6][arg2 + local288][arg5 + local292] = (byte) local299;
										}
									}
								}
							}
						}
					}
					if (local85.aBoolean125 && arg7 != null) {
						arg7.method422(local85.anInt481, arg5, local85.anInt482, local85.aBoolean126, arg3, arg2);
					}
				} else if (arg1 >= 12) {
					if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
						local140 = local85.method294(arg1, arg3, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, arg1, arg3, local44, (byte) 86, arg0, local57, local33, local68);
					}
					arg8.method540(local97, arg2, arg5, 1, local140, arg6, 0, 1, local78, local111);
					if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg6 > 0) {
						this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x924;
					}
					if (local85.aBoolean125 && arg7 != null) {
						arg7.method422(local85.anInt481, arg5, local85.anInt482, local85.aBoolean126, arg3, arg2);
					}
				} else if (arg1 == 0) {
					if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
						local140 = local85.method294(0, arg3, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 0, arg3, local44, (byte) 86, arg0, local57, local33, local68);
					}
					arg8.method538(local111, arg5, local140, local78, 0, arg2, null, local97, anIntArray25[arg3], arg6);
					if (arg3 == 0) {
						if (local85.aBoolean132) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
						}
						if (local85.aBoolean130) {
							this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local85.aBoolean132) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						}
						if (local85.aBoolean130) {
							this.anIntArrayArrayArray4[arg6][arg2][arg5 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local85.aBoolean132) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						}
						if (local85.aBoolean130) {
							this.anIntArrayArrayArray4[arg6][arg2 + 1][arg5] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local85.aBoolean132) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
						}
						if (local85.aBoolean130) {
							this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x492;
						}
					}
					if (local85.aBoolean125 && arg7 != null) {
						arg7.method421(arg1, arg5, arg2, arg3, (byte) 1, local85.aBoolean126);
					}
					if (local85.anInt484 != 16) {
						arg8.method546(arg5, local85.anInt484, arg6, arg2);
					}
				} else if (arg1 == 1) {
					if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
						local140 = local85.method294(1, arg3, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 1, arg3, local44, (byte) 86, arg0, local57, local33, local68);
					}
					arg8.method538(local111, arg5, local140, local78, 0, arg2, null, local97, anIntArray26[arg3], arg6);
					if (local85.aBoolean132) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
						}
					}
					if (local85.aBoolean125 && arg7 != null) {
						arg7.method421(arg1, arg5, arg2, arg3, (byte) 1, local85.aBoolean126);
					}
				} else {
					@Pc(849) int local849;
					@Pc(878) Class1_Sub1_Sub1 local878;
					if (arg1 == 2) {
						local849 = arg3 + 1 & 0x3;
						@Pc(868) Class1_Sub1_Sub1 local868;
						if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
							local868 = local85.method294(2, arg3 + 4, local33, local44, local57, local68, -1);
							local878 = local85.method294(2, local849, local33, local44, local57, local68, -1);
						} else {
							local868 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 2, arg3 + 4, local44, (byte) 86, arg0, local57, local33, local68);
							local878 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 2, local849, local44, (byte) 86, arg0, local57, local33, local68);
						}
						arg8.method538(local111, arg5, local868, local78, anIntArray25[local849], arg2, local878, local97, anIntArray25[arg3], arg6);
						if (local85.aBoolean130) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x249;
								this.anIntArrayArrayArray4[arg6][arg2][arg5 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray4[arg6][arg2][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg6][arg2 + 1][arg5] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray4[arg6][arg2 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x492;
								this.anIntArrayArrayArray4[arg6][arg2][arg5] |= 0x249;
							}
						}
						if (local85.aBoolean125 && arg7 != null) {
							arg7.method421(arg1, arg5, arg2, arg3, (byte) 1, local85.aBoolean126);
						}
						if (local85.anInt484 != 16) {
							arg8.method546(arg5, local85.anInt484, arg6, arg2);
						}
					} else if (arg1 == 3) {
						if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
							local140 = local85.method294(3, arg3, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 3, arg3, local44, (byte) 86, arg0, local57, local33, local68);
						}
						arg8.method538(local111, arg5, local140, local78, 0, arg2, null, local97, anIntArray26[arg3], arg6);
						if (local85.aBoolean132) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							}
						}
						if (local85.aBoolean125 && arg7 != null) {
							arg7.method421(arg1, arg5, arg2, arg3, (byte) 1, local85.aBoolean126);
						}
					} else if (arg1 == 9) {
						if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
							local140 = local85.method294(arg1, arg3, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, arg1, arg3, local44, (byte) 86, arg0, local57, local33, local68);
						}
						arg8.method540(local97, arg2, arg5, 1, local140, arg6, 0, 1, local78, local111);
						if (local85.aBoolean125 && arg7 != null) {
							arg7.method422(local85.anInt481, arg5, local85.anInt482, local85.aBoolean126, arg3, arg2);
						}
					} else {
						if (local85.aBoolean128) {
							if (arg3 == 1) {
								local849 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local849;
							} else if (arg3 == 2) {
								local849 = local68;
								local68 = local44;
								local44 = local849;
								local849 = local57;
								local57 = local33;
								local33 = local849;
							} else if (arg3 == 3) {
								local849 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local849;
							}
						}
						if (arg1 == 4) {
							if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
								local140 = local85.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 4, 0, local44, (byte) 86, arg0, local57, local33, local68);
							}
							arg8.method539(arg2, 0, arg6, local97, 0, arg5, local78, local140, local111, anIntArray25[arg3], arg3 * 512);
						} else if (arg1 == 5) {
							local849 = 16;
							local238 = arg8.method556(arg6, arg2, arg5);
							if (local238 > 0) {
								local849 = Class9.method288(local238 >> 14 & 0x7FFF).anInt484;
							}
							if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
								local878 = local85.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local878 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 4, 0, local44, (byte) 86, arg0, local57, local33, local68);
							}
							arg8.method539(arg2, anIntArray28[arg3] * local849, arg6, local97, anIntArray27[arg3] * local849, arg5, local78, local878, local111, anIntArray25[arg3], arg3 * 512);
						} else if (arg1 == 6) {
							if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
								local140 = local85.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 4, 0, local44, (byte) 86, arg0, local57, local33, local68);
							}
							arg8.method539(arg2, 0, arg6, local97, 0, arg5, local78, local140, local111, 256, arg3);
						} else if (arg1 == 7) {
							if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
								local140 = local85.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 4, 0, local44, (byte) 86, arg0, local57, local33, local68);
							}
							arg8.method539(arg2, 0, arg6, local97, 0, arg5, local78, local140, local111, 512, arg3);
						} else if (arg1 == 8) {
							if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
								local140 = local85.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 4, 0, local44, (byte) 86, arg0, local57, local33, local68);
							}
							arg8.method539(arg2, 0, arg6, local97, 0, arg5, local78, local140, local111, 768, arg3);
						}
					}
				}
			} else if (!aBoolean41 || local85.aBoolean127 || local85.aBoolean133) {
				if (local85.anInt483 == -1 && local85.anIntArray160 == null) {
					local140 = local85.method294(22, arg3, local33, local44, local57, local68, -1);
				} else {
					local140 = new Class1_Sub1_Sub1_Sub2(local85.anInt483, true, 22, arg3, local44, (byte) 86, arg0, local57, local33, local68);
				}
				arg8.method536(local78, arg6, arg5, local111, arg2, local140, local97);
				if (local85.aBoolean125 && local85.aBoolean127 && arg7 != null) {
					arg7.method423(arg2, arg5);
				}
			}
		} catch (@Pc(1623) RuntimeException local1623) {
			signlink.reporterror("6503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1623.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;[Lclient!jc;I)V")
	public void method62(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class19[] arg1) {
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
								arg1[local27].method423(local7, local11);
							}
						}
					}
				}
			}
			anInt165 += (int) (Math.random() * 5.0D) - 2;
			if (anInt165 < -8) {
				anInt165 = -8;
			}
			if (anInt165 > 8) {
				anInt165 = 8;
			}
			anInt166 += (int) (Math.random() * 5.0D) - 2;
			if (anInt166 < -16) {
				anInt166 = -16;
			}
			if (anInt166 > 16) {
				anInt166 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray6[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt164 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt163 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray2[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt164; local145++) {
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt163 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt164; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt163) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray20[local191] += local378.anInt695;
								this.anIntArray21[local191] += local378.anInt693;
								this.anIntArray22[local191] += local378.anInt694;
								this.anIntArray23[local191] += local378.anInt696;
								local419 = this.anIntArray24[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt163) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray20[local191] -= local451.anInt695;
								this.anIntArray21[local191] -= local451.anInt693;
								this.anIntArray22[local191] -= local451.anInt694;
								this.anIntArray23[local191] -= local451.anInt696;
								local419 = this.anIntArray24[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt163 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt164 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt164) {
								local204 += this.anIntArray20[local527];
								local210 += this.anIntArray21[local527];
								local214 += this.anIntArray22[local527];
								local220 += this.anIntArray23[local527];
								local236 += this.anIntArray24[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt164) {
								local204 -= this.anIntArray20[local572];
								local210 -= this.anIntArray21[local572];
								local214 -= this.anIntArray22[local572];
								local220 -= this.anIntArray23[local572];
								local236 -= this.anIntArray24[local572];
							}
							if (local284 >= 1 && local284 < this.anInt164 - 1 && (!aBoolean41 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method63(856, local284, local169, local7) == anInt162)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray2[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray2[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray2[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray2[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method71(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt165 & 0xFF;
										local770 += anInt166;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method71(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean194) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local754, 96)];
									}
									if (local666 == 0) {
										arg0.method535(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt691;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method348(local928);
											local936 = -1;
										} else if (local925.anInt690 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method71(local925.anInt692, local925.anInt693, local925.anInt694);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local925.anInt697, 96)];
										}
										arg0.method535(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), this.method70(local936, local721), this.method70(local936, local730), this.method70(local936, local741), this.method70(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt164 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt163 - 1; local204++) {
						arg0.method534(local7, local204, local191, this.method63(856, local191, local204, local7));
					}
				}
			}
			arg0.method561();
			for (local11 = 0; local11 < this.anInt163; local11++) {
				for (local27 = 0; local27 < this.anInt164; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method532(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1107) int local1107 = 2;
			@Pc(1109) int local1109 = 4;
			for (@Pc(1118) int local1118 = 0; local1118 < 4; local1118++) {
				if (local1118 > 0) {
					local27 <<= 0x3;
					local1107 <<= 0x3;
					local1109 <<= 0x3;
				}
				for (@Pc(1136) int local1136 = 0; local1136 <= local1118; local1136++) {
					for (local133 = 0; local133 <= this.anInt164; local133++) {
						for (local139 = 0; local139 <= this.anInt163; local139++) {
							if ((this.anIntArrayArrayArray4[local1136][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1136;
								local191 = local1136;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1136][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt164 && (this.anIntArrayArrayArray4[local1136][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label324: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label324;
										}
									}
									local169--;
								}
								label313: while (local191 < local1118) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label313;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class37.method533(local145 * 128 + 128, local1118, local141 * 128, local139 * 128, local220, local214, local139 * 128, 183, 1);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1136][local139][local133] & local1107) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1136;
								local191 = local1136;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1136][local141 - 1][local133] & local1107) != 0) {
									local141--;
								}
								while (local145 < this.anInt163 && (this.anIntArrayArrayArray4[local1136][local145 + 1][local133] & local1107) != 0) {
									local145++;
								}
								label377: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1107) == 0) {
											break label377;
										}
									}
									local169--;
								}
								label366: while (local191 < local1118) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1107) == 0) {
											break label366;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class37.method533(local133 * 128, local1118, local133 * 128, local145 * 128 + 128, local220, local214, local141 * 128, 183, 2);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1107;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1136][local139][local133] & local1109) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1136][local139][local169 - 1] & local1109) != 0) {
									local169--;
								}
								while (local191 < this.anInt164 && (this.anIntArrayArrayArray4[local1136][local139][local191 + 1] & local1109) != 0) {
									local191++;
								}
								label430: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1136][local141 - 1][local204] & local1109) == 0) {
											break label430;
										}
									}
									local141--;
								}
								label419: while (local145 < this.anInt163) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1136][local145 + 1][local204] & local1109) == 0) {
											break label419;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1136][local141][local169];
									Class37.method533(local191 * 128 + 128, local1118, local169 * 128, local145 * 128 + 128, local204, local204, local141 * 128, 183, 4);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1136][local210][local214] &= ~local1109;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1751) RuntimeException local1751) {
			signlink.reporterror("88242, " + arg0 + ", " + arg1 + ", " + -808 + ", " + local1751.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if ((this.aByteArrayArrayArray1[arg3][arg2][arg1] & 0x8) == 0) {
				return arg3 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("76451, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
