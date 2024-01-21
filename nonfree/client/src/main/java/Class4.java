import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt205;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "B")
	private static byte aByte9 = 6;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt203 = -938;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	private static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private static int anInt204 = 30492;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "B")
	private static byte aByte10 = -61;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Z")
	public static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
	private static final int[] anIntArray29 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
	private static final int[] anIntArray30 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	private static int anInt208 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	private static int anInt209 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BZI)Z")
	public static boolean method59(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(45427, arg1);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method512();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method512();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method498() >> 2;
						@Pc(72) int local72 = local63 + arg0;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method258(local11);
							if (local68 != 22 || !aBoolean34 || local89.aBoolean116 || local89.aBoolean122) {
								local3 &= local89.method262();
								local30 = true;
							}
						}
					}
					local35 = local9.method512();
					if (local35 == 0) {
						break;
					}
					local9.method498();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("3355, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vb;ILclient!mb;)V")
	public static void method60(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(8) int local8 = -1;
			while (true) {
				@Pc(11) int local11 = arg1.method512();
				if (local11 == 0) {
					return;
				}
				local8 += local11;
				@Pc(20) Class9 local20 = Class9.method258(local8);
				local20.method263(arg0, anInt204);
				while (true) {
					@Pc(27) int local27 = arg1.method512();
					if (local27 == 0) {
						break;
					}
					arg1.method498();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("26650, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method66(arg0 + 45365, arg1 + 91923, 4) + (method66(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method66(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method68(local3, local13);
		@Pc(29) int local29 = method68(local3 + 1, local13);
		@Pc(35) int local35 = method68(local3, local13 + 1);
		@Pc(43) int local43 = method68(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method67(local23, local29, local9, arg2);
		@Pc(55) int local55 = method67(local35, local43, local9, arg2);
		return method67(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray184[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method69(arg0 - 1, arg1 - 1) + method69(arg0 + 1, arg1 - 1) + method69(arg0 - 1, arg1 + 1) + method69(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method69(arg0 - 1, arg1) + method69(arg0 + 1, arg1) + method69(arg0, arg1 - 1) + method69(arg0, arg1 + 1);
		@Pc(59) int local59 = method69(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	public static boolean method73(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) Class9 local12 = Class9.method258(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local12.method261(arg1);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("69469, " + 83 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jc;Lclient!s;IZIII[[[IIII)V")
	public static void method74(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg5][arg4][arg3];
			@Pc(19) int local19 = arg6[arg5][arg4 + 1][arg3];
			@Pc(31) int local31 = arg6[arg5][arg4 + 1][arg3 + 1];
			@Pc(41) int local41 = arg6[arg5][arg4][arg3 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(63) Class9 local63 = Class9.method258(arg7);
			@Pc(75) int local75 = arg4 + (arg3 << 7) + (arg7 << 14) + 1073741824;
			if (!local63.aBoolean116) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg9 << 6) + arg8);
			@Pc(106) Class1_Sub1_Sub1 local106;
			if (arg8 == 22) {
				if (local63.anInt535 == -1) {
					local106 = local63.method264(22, arg9, local9, local19, local31, local41, -1);
				} else {
					local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, 22, true, local41, local63.anInt535);
				}
				arg1.method550(arg2, local106, local51, local75, local89, arg4, arg3);
				if (local63.aBoolean114 && local63.aBoolean116) {
					arg0.method417(arg3, arg4);
				}
			} else {
				@Pc(199) int local199;
				if (arg8 == 10 || arg8 == 11) {
					if (local63.anInt535 == -1) {
						local106 = local63.method264(10, arg9, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, 10, true, local41, local63.anInt535);
					}
					if (local106 != null) {
						@Pc(186) int local186 = 0;
						if (arg8 == 11) {
							local186 += 256;
						}
						@Pc(202) int local202;
						if (arg9 == 1 || arg9 == 3) {
							local199 = local63.anInt534;
							local202 = local63.anInt533;
						} else {
							local199 = local63.anInt533;
							local202 = local63.anInt534;
						}
						arg1.method554(arg3, arg4, arg2, local51, aBoolean31, local199, local106, local202, local186, local75, local89);
					}
					if (local63.aBoolean114) {
						arg0.method416(arg9, arg3, local63.anInt534, local63.anInt533, local63.aBoolean115, arg4);
					}
				} else if (arg8 >= 12) {
					if (local63.anInt535 == -1) {
						local106 = local63.method264(arg8, arg9, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, arg8, true, local41, local63.anInt535);
					}
					arg1.method554(arg3, arg4, arg2, local51, aBoolean31, 1, local106, 1, 0, local75, local89);
					if (local63.aBoolean114) {
						arg0.method416(arg9, arg3, local63.anInt534, local63.anInt533, local63.aBoolean115, arg4);
					}
				} else if (arg8 == 0) {
					if (local63.anInt535 == -1) {
						local106 = local63.method264(0, arg9, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, 0, true, local41, local63.anInt535);
					}
					arg1.method552(0, null, local89, local75, arg4, anIntArray27[arg9], local106, arg3, arg2, local51);
					if (local63.aBoolean114) {
						arg0.method415(arg3, local63.aBoolean115, arg8, arg4, arg9);
					}
				} else if (arg8 == 1) {
					if (local63.anInt535 == -1) {
						local106 = local63.method264(1, arg9, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, 1, true, local41, local63.anInt535);
					}
					arg1.method552(0, null, local89, local75, arg4, anIntArray28[arg9], local106, arg3, arg2, local51);
					if (local63.aBoolean114) {
						arg0.method415(arg3, local63.aBoolean115, arg8, arg4, arg9);
					}
				} else {
					@Pc(462) Class1_Sub1_Sub1 local462;
					@Pc(436) int local436;
					if (arg8 == 2) {
						local436 = arg9 + 1 & 0x3;
						@Pc(452) Class1_Sub1_Sub1 local452;
						if (local63.anInt535 == -1) {
							local452 = local63.method264(2, arg9 + 4, local9, local19, local31, local41, -1);
							local462 = local63.method264(2, local436, local9, local19, local31, local41, -1);
						} else {
							local452 = new Class1_Sub1_Sub1_Sub2(local31, arg9 + 4, arg7, aByte10, local19, local9, 2, true, local41, local63.anInt535);
							local462 = new Class1_Sub1_Sub1_Sub2(local31, local436, arg7, aByte10, local19, local9, 2, true, local41, local63.anInt535);
						}
						arg1.method552(anIntArray27[local436], local462, local89, local75, arg4, anIntArray27[arg9], local452, arg3, arg2, local51);
						if (local63.aBoolean114) {
							arg0.method415(arg3, local63.aBoolean115, arg8, arg4, arg9);
						}
					} else if (arg8 == 3) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(3, arg9, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, 3, true, local41, local63.anInt535);
						}
						arg1.method552(0, null, local89, local75, arg4, anIntArray28[arg9], local106, arg3, arg2, local51);
						if (local63.aBoolean114) {
							arg0.method415(arg3, local63.aBoolean115, arg8, arg4, arg9);
						}
					} else if (arg8 == 9) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(arg8, arg9, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, arg9, arg7, aByte10, local19, local9, arg8, true, local41, local63.anInt535);
						}
						arg1.method554(arg3, arg4, arg2, local51, aBoolean31, 1, local106, 1, 0, local75, local89);
						if (local63.aBoolean114) {
							arg0.method416(arg9, arg3, local63.anInt534, local63.anInt533, local63.aBoolean115, arg4);
						}
					} else if (arg8 == 4) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, 0, arg7, aByte10, local19, local9, 4, true, local41, local63.anInt535);
						}
						arg1.method553(0, local89, local51, local75, anIntArray27[arg9], arg2, 0, aByte9, arg3, arg9 * 512, local106, arg4);
					} else if (arg8 == 5) {
						local436 = 16;
						local199 = arg1.method570(arg2, arg4, arg3);
						if (local199 > 0) {
							local436 = Class9.method258(local199 >> 14 & 0x7FFF).anInt536;
						}
						if (local63.anInt535 == -1) {
							local462 = local63.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local462 = new Class1_Sub1_Sub1_Sub2(local31, 0, arg7, aByte10, local19, local9, 4, true, local41, local63.anInt535);
						}
						arg1.method553(anIntArray29[arg9] * local436, local89, local51, local75, anIntArray27[arg9], arg2, anIntArray30[arg9] * local436, aByte9, arg3, arg9 * 512, local462, arg4);
					} else if (arg8 == 6) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, 0, arg7, aByte10, local19, local9, 4, true, local41, local63.anInt535);
						}
						arg1.method553(0, local89, local51, local75, 256, arg2, 0, aByte9, arg3, arg9, local106, arg4);
					} else if (arg8 == 7) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, 0, arg7, aByte10, local19, local9, 4, true, local41, local63.anInt535);
						}
						arg1.method553(0, local89, local51, local75, 512, arg2, 0, aByte9, arg3, arg9, local106, arg4);
					} else if (arg8 == 8) {
						if (local63.anInt535 == -1) {
							local106 = local63.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(local31, 0, arg7, aByte10, local19, local9, 4, true, local41, local63.anInt535);
						}
						arg1.method553(0, local89, local51, local75, 768, arg2, 0, aByte9, arg3, arg9, local106, arg4);
					}
				}
			}
		} catch (@Pc(932) RuntimeException local932) {
			signlink.reporterror("78239, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local932.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[BIZI[[[I)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			this.anInt206 = arg3;
			this.anInt207 = arg1;
			this.anIntArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt206][this.anInt207];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt206][this.anInt207];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt206][this.anInt207];
			if (!arg2) {
				for (@Pc(47) int local47 = 1; local47 > 0; local47++) {
				}
			}
			this.aByteArrayArrayArray5 = new byte[4][this.anInt206][this.anInt207];
			this.anIntArrayArrayArray2 = new int[4][this.anInt206 + 1][this.anInt207 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt206 + 1][this.anInt207 + 1];
			this.anIntArrayArray1 = new int[this.anInt206 + 1][this.anInt207 + 1];
			this.anIntArray22 = new int[this.anInt207];
			this.anIntArray23 = new int[this.anInt207];
			this.anIntArray24 = new int[this.anInt207];
			this.anIntArray25 = new int[this.anInt207];
			this.anIntArray26 = new int[this.anInt207];
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("75846, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + 64; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt206 && local3 >= 0 && local3 < this.anInt207) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg1 + 64 && local7 < this.anInt206 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg0 + 64 && local3 < this.anInt207 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("27825, " + arg0 + ", " + 64 + ", " + arg1 + ", " + 64 + ", " + 762 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIIII)V")
	public void method58(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(45427, arg1);
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
					for (@Pc(20) int local20 = 0; local20 < 64; local20++) {
						@Pc(26) int local26 = local16 + arg2;
						@Pc(30) int local30 = local20 + arg0;
						@Pc(52) int local52;
						if (local26 >= 0 && local26 < 104 && local30 >= 0 && local30 < 104) {
							this.aByteArrayArrayArray1[local12][local26][local30] = 0;
							while (true) {
								local52 = local10.method498();
								if (local52 == 0) {
									if (local12 == 0) {
										this.anIntArrayArrayArray1[0][local26][local30] = -method65(local26 + arg3 + 932731, local30 + 556238 + arg4) * 8;
									} else {
										this.anIntArrayArrayArray1[local12][local26][local30] = this.anIntArrayArrayArray1[local12 - 1][local26][local30] - 240;
									}
									break;
								}
								if (local52 == 1) {
									@Pc(108) int local108 = local10.method498();
									if (local108 == 1) {
										local108 = 0;
									}
									if (local12 == 0) {
										this.anIntArrayArrayArray1[0][local26][local30] = -local108 * 8;
									} else {
										this.anIntArrayArrayArray1[local12][local26][local30] = this.anIntArrayArrayArray1[local12 - 1][local26][local30] - local108 * 8;
									}
									break;
								}
								if (local52 <= 49) {
									this.aByteArrayArrayArray3[local12][local26][local30] = local10.method499();
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
								local52 = local10.method498();
								if (local52 == 0) {
									break;
								}
								if (local52 == 1) {
									local10.method498();
									break;
								}
								if (local52 <= 49) {
									local10.method498();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("5297, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;Lclient!s;[BIII)V")
	public void method61(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(17) Class1_Sub1_Sub3 local17 = new Class1_Sub1_Sub3(45427, arg2);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method512();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method512();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method498();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg3;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg0[local86];
						}
						this.method62(local101, local66, local55, local19, local62, local70, local74, arg1);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("83316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -620 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jc;IIIIIIILclient!s;)V")
	private void method62(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class39 arg7) {
		try {
			if (aBoolean34) {
				if ((this.aByteArrayArrayArray1[arg2][arg5][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method64(arg2, arg5, arg6) != anInt205) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg2][arg5][arg6];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg2][arg5 + 1][arg6];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg2][arg5 + 1][arg6 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg2][arg5][arg6 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method258(arg3);
			@Pc(98) int local98 = arg5 + (arg6 << 7) + (arg3 << 14) + 1073741824;
			if (!local81.aBoolean116) {
				local98 += Integer.MIN_VALUE;
			}
			@Pc(112) byte local112 = (byte) ((arg1 << 6) + arg4);
			@Pc(138) Class1_Sub1_Sub1 local138;
			if (arg4 != 22) {
				@Pc(233) int local233;
				if (arg4 == 10 || arg4 == 11) {
					if (local81.anInt535 == -1) {
						local138 = local81.method264(10, arg1, local33, local44, local57, local68, -1);
					} else {
						local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, 10, true, local68, local81.anInt535);
					}
					if (local138 != null) {
						@Pc(220) int local220 = 0;
						if (arg4 == 11) {
							local220 += 256;
						}
						@Pc(236) int local236;
						if (arg1 == 1 || arg1 == 3) {
							local233 = local81.anInt534;
							local236 = local81.anInt533;
						} else {
							local233 = local81.anInt533;
							local236 = local81.anInt534;
						}
						if (arg7.method554(arg6, arg5, arg2, local78, aBoolean31, local233, local138, local236, local220, local98, local112) && local81.aBoolean121) {
							@Pc(267) Class1_Sub1_Sub1_Sub5 local267;
							if (local138 instanceof Class1_Sub1_Sub1_Sub5) {
								local267 = (Class1_Sub1_Sub1_Sub5) local138;
							} else {
								local267 = local81.method264(10, arg1, local33, local44, local57, local68, -1);
							}
							if (local267 != null) {
								for (@Pc(283) int local283 = 0; local283 <= local233; local283++) {
									for (@Pc(287) int local287 = 0; local287 <= local236; local287++) {
										@Pc(294) int local294 = local267.anInt566 / 4;
										if (local294 > 30) {
											local294 = 30;
										}
										if (local294 > this.aByteArrayArrayArray6[arg2][arg5 + local283][arg6 + local287]) {
											this.aByteArrayArrayArray6[arg2][arg5 + local283][arg6 + local287] = (byte) local294;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean114 && arg0 != null) {
						arg0.method416(arg1, arg6, local81.anInt534, local81.anInt533, local81.aBoolean115, arg5);
					}
				} else if (arg4 >= 12) {
					if (local81.anInt535 == -1) {
						local138 = local81.method264(arg4, arg1, local33, local44, local57, local68, -1);
					} else {
						local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, arg4, true, local68, local81.anInt535);
					}
					arg7.method554(arg6, arg5, arg2, local78, aBoolean31, 1, local138, 1, 0, local98, local112);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x924;
					}
					if (local81.aBoolean114 && arg0 != null) {
						arg0.method416(arg1, arg6, local81.anInt534, local81.anInt533, local81.aBoolean115, arg5);
					}
				} else if (arg4 == 0) {
					if (local81.anInt535 == -1) {
						local138 = local81.method264(0, arg1, local33, local44, local57, local68, -1);
					} else {
						local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, 0, true, local68, local81.anInt535);
					}
					arg7.method552(0, null, local112, local98, arg5, anIntArray27[arg1], local138, arg6, arg2, local78);
					if (arg1 == 0) {
						if (local81.aBoolean121) {
							this.aByteArrayArrayArray6[arg2][arg5][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg5][arg6 + 1] = 50;
						}
						if (local81.aBoolean119) {
							this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local81.aBoolean121) {
							this.aByteArrayArrayArray6[arg2][arg5][arg6 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6 + 1] = 50;
						}
						if (local81.aBoolean119) {
							this.anIntArrayArrayArray2[arg2][arg5][arg6 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local81.aBoolean121) {
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6 + 1] = 50;
						}
						if (local81.aBoolean119) {
							this.anIntArrayArrayArray2[arg2][arg5 + 1][arg6] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local81.aBoolean121) {
							this.aByteArrayArrayArray6[arg2][arg5][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6] = 50;
						}
						if (local81.aBoolean119) {
							this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x492;
						}
					}
					if (local81.aBoolean114 && arg0 != null) {
						arg0.method415(arg6, local81.aBoolean115, arg4, arg5, arg1);
					}
					if (local81.anInt536 != 16) {
						arg7.method560(arg5, local81.anInt536, arg2, arg6);
					}
				} else if (arg4 == 1) {
					if (local81.anInt535 == -1) {
						local138 = local81.method264(1, arg1, local33, local44, local57, local68, -1);
					} else {
						local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, 1, true, local68, local81.anInt535);
					}
					arg7.method552(0, null, local112, local98, arg5, anIntArray28[arg1], local138, arg6, arg2, local78);
					if (local81.aBoolean121) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray6[arg2][arg5][arg6 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray6[arg2][arg5][arg6] = 50;
						}
					}
					if (local81.aBoolean114 && arg0 != null) {
						arg0.method415(arg6, local81.aBoolean115, arg4, arg5, arg1);
					}
				} else {
					@Pc(861) Class1_Sub1_Sub1 local861;
					@Pc(835) int local835;
					if (arg4 == 2) {
						local835 = arg1 + 1 & 0x3;
						@Pc(851) Class1_Sub1_Sub1 local851;
						if (local81.anInt535 == -1) {
							local851 = local81.method264(2, arg1 + 4, local33, local44, local57, local68, -1);
							local861 = local81.method264(2, local835, local33, local44, local57, local68, -1);
						} else {
							local851 = new Class1_Sub1_Sub1_Sub2(local57, arg1 + 4, arg3, aByte10, local44, local33, 2, true, local68, local81.anInt535);
							local861 = new Class1_Sub1_Sub1_Sub2(local57, local835, arg3, aByte10, local44, local33, 2, true, local68, local81.anInt535);
						}
						arg7.method552(anIntArray27[local835], local861, local112, local98, arg5, anIntArray27[arg1], local851, arg6, arg2, local78);
						if (local81.aBoolean119) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg2][arg5][arg6 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray2[arg2][arg5][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg2][arg5 + 1][arg6] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray2[arg2][arg5 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x492;
								this.anIntArrayArrayArray2[arg2][arg5][arg6] |= 0x249;
							}
						}
						if (local81.aBoolean114 && arg0 != null) {
							arg0.method415(arg6, local81.aBoolean115, arg4, arg5, arg1);
						}
						if (local81.anInt536 != 16) {
							arg7.method560(arg5, local81.anInt536, arg2, arg6);
						}
					} else if (arg4 == 3) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(3, arg1, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, 3, true, local68, local81.anInt535);
						}
						arg7.method552(0, null, local112, local98, arg5, anIntArray28[arg1], local138, arg6, arg2, local78);
						if (local81.aBoolean121) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray6[arg2][arg5][arg6 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray6[arg2][arg5 + 1][arg6] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray6[arg2][arg5][arg6] = 50;
							}
						}
						if (local81.aBoolean114 && arg0 != null) {
							arg0.method415(arg6, local81.aBoolean115, arg4, arg5, arg1);
						}
					} else if (arg4 == 9) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(arg4, arg1, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, arg4, true, local68, local81.anInt535);
						}
						arg7.method554(arg6, arg5, arg2, local78, aBoolean31, 1, local138, 1, 0, local98, local112);
						if (local81.aBoolean114 && arg0 != null) {
							arg0.method416(arg1, arg6, local81.anInt534, local81.anInt533, local81.aBoolean115, arg5);
						}
					} else if (arg4 == 4) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, 0, arg3, aByte10, local44, local33, 4, true, local68, local81.anInt535);
						}
						arg7.method553(0, local112, local78, local98, anIntArray27[arg1], arg2, 0, aByte9, arg6, arg1 * 512, local138, arg5);
					} else if (arg4 == 5) {
						local835 = 16;
						local233 = arg7.method570(arg2, arg5, arg6);
						if (local233 > 0) {
							local835 = Class9.method258(local233 >> 14 & 0x7FFF).anInt536;
						}
						if (local81.anInt535 == -1) {
							local861 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local861 = new Class1_Sub1_Sub1_Sub2(local57, 0, arg3, aByte10, local44, local33, 4, true, local68, local81.anInt535);
						}
						arg7.method553(anIntArray29[arg1] * local835, local112, local78, local98, anIntArray27[arg1], arg2, anIntArray30[arg1] * local835, aByte9, arg6, arg1 * 512, local861, arg5);
					} else if (arg4 == 6) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, 0, arg3, aByte10, local44, local33, 4, true, local68, local81.anInt535);
						}
						arg7.method553(0, local112, local78, local98, 256, arg2, 0, aByte9, arg6, arg1, local138, arg5);
					} else if (arg4 == 7) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, 0, arg3, aByte10, local44, local33, 4, true, local68, local81.anInt535);
						}
						arg7.method553(0, local112, local78, local98, 512, arg2, 0, aByte9, arg6, arg1, local138, arg5);
					} else if (arg4 == 8) {
						if (local81.anInt535 == -1) {
							local138 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local138 = new Class1_Sub1_Sub1_Sub2(local57, 0, arg3, aByte10, local44, local33, 4, true, local68, local81.anInt535);
						}
						arg7.method553(0, local112, local78, local98, 768, arg2, 0, aByte9, arg6, arg1, local138, arg5);
					}
				}
			} else if (!aBoolean34 || local81.aBoolean116 || local81.aBoolean122) {
				if (local81.anInt535 == -1) {
					local138 = local81.method264(22, arg1, local33, local44, local57, local68, -1);
				} else {
					local138 = new Class1_Sub1_Sub1_Sub2(local57, arg1, arg3, aByte10, local44, local33, 22, true, local68, local81.anInt535);
				}
				arg7.method550(arg2, local138, local78, local98, local112, arg5, arg6);
				if (local81.aBoolean114 && local81.aBoolean116 && arg0 != null) {
					arg0.method417(arg6, arg5);
				}
			}
		} catch (@Pc(1537) RuntimeException local1537) {
			signlink.reporterror("43060, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -284 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1537.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!s;[Lclient!jc;)V")
	public void method63(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class19[] arg1) {
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
								arg1[local27].method417(local11, local7);
							}
						}
					}
				}
			}
			anInt208 += (int) (Math.random() * 5.0D) - 2;
			if (anInt208 < -8) {
				anInt208 = -8;
			}
			if (anInt208 > 8) {
				anInt208 = 8;
			}
			anInt209 += (int) (Math.random() * 5.0D) - 2;
			if (anInt209 < -16) {
				anInt209 = -16;
			}
			if (anInt209 > 16) {
				anInt209 = 16;
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
				@Pc(117) byte[][] local117 = this.aByteArrayArrayArray6[local7];
				local142 = (int) Math.sqrt((double) 5100);
				local148 = local142 * 768 >> 8;
				for (local150 = 1; local150 < this.anInt207 - 1; local150++) {
					for (local154 = 1; local154 < this.anInt206 - 1; local154++) {
						local178 = this.anIntArrayArrayArray1[local7][local154 + 1][local150] - this.anIntArrayArrayArray1[local7][local154 - 1][local150];
						local200 = this.anIntArrayArrayArray1[local7][local154][local150 + 1] - this.anIntArrayArrayArray1[local7][local154][local150 - 1];
						local213 = (int) Math.sqrt((double) (local178 * local178 + local200 * local200 + 65536));
						local219 = (local178 << 8) / local213;
						local223 = 65536 / local213;
						local229 = (local200 << 8) / local213;
						local245 = (local219 * -50 + local223 * -10 + local229 * -50) / local148 + 96;
						local293 = (local117[local154 - 1][local150] >> 2) + (local117[local154 + 1][local150] >> 3) + (local117[local154][local150 - 1] >> 2) + (local117[local154][local150 + 1] >> 3) + (local117[local154][local150] >> 1);
						this.anIntArrayArray1[local154][local150] = local245 - local293;
					}
				}
				for (local154 = 0; local154 < this.anInt207; local154++) {
					this.anIntArray22[local154] = 0;
					this.anIntArray23[local154] = 0;
					this.anIntArray24[local154] = 0;
					this.anIntArray25[local154] = 0;
					this.anIntArray26[local154] = 0;
				}
				for (local178 = -5; local178 < this.anInt206 + 5; local178++) {
					for (local200 = 0; local200 < this.anInt207; local200++) {
						local213 = local178 + 5;
						@Pc(428) int local428;
						if (local213 >= 0 && local213 < this.anInt206) {
							local219 = this.aByteArrayArrayArray2[local7][local213][local200] & 0xFF;
							if (local219 > 0) {
								@Pc(387) Class21 local387 = Class21.aClass21Array1[local219 - 1];
								this.anIntArray22[local200] += local387.anInt746;
								this.anIntArray23[local200] += local387.anInt744;
								this.anIntArray24[local200] += local387.anInt745;
								this.anIntArray25[local200] += local387.anInt747;
								local428 = this.anIntArray26[local200]++;
							}
						}
						local219 = local178 - 5;
						if (local219 >= 0 && local219 < this.anInt206) {
							local223 = this.aByteArrayArrayArray2[local7][local219][local200] & 0xFF;
							if (local223 > 0) {
								@Pc(460) Class21 local460 = Class21.aClass21Array1[local223 - 1];
								this.anIntArray22[local200] -= local460.anInt746;
								this.anIntArray23[local200] -= local460.anInt744;
								this.anIntArray24[local200] -= local460.anInt745;
								this.anIntArray25[local200] -= local460.anInt747;
								local428 = this.anIntArray26[local200]--;
							}
						}
					}
					if (local178 >= 1 && local178 < this.anInt206 - 1) {
						local213 = 0;
						local219 = 0;
						local223 = 0;
						local229 = 0;
						local245 = 0;
						for (local293 = -5; local293 < this.anInt207 + 5; local293++) {
							@Pc(536) int local536 = local293 + 5;
							if (local536 >= 0 && local536 < this.anInt207) {
								local213 += this.anIntArray22[local536];
								local219 += this.anIntArray23[local536];
								local223 += this.anIntArray24[local536];
								local229 += this.anIntArray25[local536];
								local245 += this.anIntArray26[local536];
							}
							@Pc(581) int local581 = local293 - 5;
							if (local581 >= 0 && local581 < this.anInt207) {
								local213 -= this.anIntArray22[local581];
								local219 -= this.anIntArray23[local581];
								local223 -= this.anIntArray24[local581];
								local229 -= this.anIntArray25[local581];
								local245 -= this.anIntArray26[local581];
							}
							if (local293 >= 1 && local293 < this.anInt207 - 1 && (!aBoolean34 || (this.aByteArrayArrayArray1[local7][local178][local293] & 0x10) == 0 && this.method64(local7, local178, local293) == anInt205)) {
								@Pc(664) int local664 = this.aByteArrayArrayArray2[local7][local178][local293] & 0xFF;
								@Pc(675) int local675 = this.aByteArrayArrayArray3[local7][local178][local293] & 0xFF;
								if (local664 > 0 || local675 > 0) {
									@Pc(688) int local688 = this.anIntArrayArrayArray1[local7][local178][local293];
									@Pc(699) int local699 = this.anIntArrayArrayArray1[local7][local178 + 1][local293];
									@Pc(712) int local712 = this.anIntArrayArrayArray1[local7][local178 + 1][local293 + 1];
									@Pc(723) int local723 = this.anIntArrayArrayArray1[local7][local178][local293 + 1];
									@Pc(730) int local730 = this.anIntArrayArray1[local178][local293];
									@Pc(739) int local739 = this.anIntArrayArray1[local178 + 1][local293];
									@Pc(750) int local750 = this.anIntArrayArray1[local178 + 1][local293 + 1];
									@Pc(759) int local759 = this.anIntArrayArray1[local178][local293 + 1];
									@Pc(761) int local761 = -1;
									@Pc(763) int local763 = -1;
									@Pc(771) int local771;
									@Pc(775) int local775;
									if (local664 > 0) {
										local771 = local213 * 256 / local229;
										local775 = local219 / local245;
										@Pc(779) int local779 = local223 / local245;
										local761 = this.method72(local771, local775, local779);
										@Pc(791) int local791 = local771 + anInt208 & 0xFF;
										local779 += anInt209;
										if (local779 < 0) {
											local779 = 0;
										} else if (local779 > 255) {
											local779 = 255;
										}
										local763 = this.method72(local791, local775, local779);
									}
									if (local7 > 0) {
										@Pc(816) boolean local816 = true;
										if (local664 == 0 && this.aByteArrayArrayArray4[local7][local178][local293] != 0) {
											local816 = false;
										}
										if (local675 > 0 && !Class21.aClass21Array1[local675 - 1].aBoolean170) {
											local816 = false;
										}
										if (local816 && local688 == local699 && local688 == local712 && local688 == local723) {
											this.anIntArrayArrayArray2[local7][local178][local293] |= 0x924;
										}
									}
									local771 = 0;
									if (local761 != -1) {
										local771 = Class1_Sub1_Sub2_Sub1.anIntArray188[method70(local763, 96)];
									}
									if (local675 == 0) {
										arg0.method549(local7, local178, local293, 0, 0, -1, local688, local699, local712, local723, method70(local761, local730), method70(local761, local739), method70(local761, local750), method70(local761, local759), 0, 0, 0, 0, local771, 0);
									} else {
										local775 = this.aByteArrayArrayArray4[local7][local178][local293] + 1;
										@Pc(928) byte local928 = this.aByteArrayArrayArray5[local7][local178][local293];
										@Pc(934) Class21 local934 = Class21.aClass21Array1[local675 - 1];
										@Pc(937) int local937 = local934.anInt742;
										@Pc(945) int local945;
										@Pc(943) int local943;
										if (local937 >= 0) {
											local943 = Class1_Sub1_Sub2_Sub1.method376(local937);
											local945 = -1;
										} else if (local934.anInt741 == 16711935) {
											local943 = 0;
											local945 = -2;
											local937 = -1;
										} else {
											local945 = this.method72(local934.anInt743, local934.anInt744, local934.anInt745);
											local943 = Class1_Sub1_Sub2_Sub1.anIntArray188[this.method71(local934.anInt748, 96)];
										}
										arg0.method549(local7, local178, local293, local775, local928, local937, local688, local699, local712, local723, method70(local761, local730), method70(local761, local739), method70(local761, local750), method70(local761, local759), this.method71(local945, local730), this.method71(local945, local739), this.method71(local945, local750), this.method71(local945, local759), local771, local943);
									}
								}
							}
						}
					}
				}
				for (local200 = 1; local200 < this.anInt207 - 1; local200++) {
					for (local213 = 1; local213 < this.anInt206 - 1; local213++) {
						arg0.method548(local7, local213, local200, this.method64(local7, local213, local200));
					}
				}
			}
			arg0.method575(this.aBoolean32);
			for (local11 = 0; local11 < this.anInt206; local11++) {
				for (local27 = 0; local27 < this.anInt207; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method546(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1117) int local1117 = 2;
			@Pc(1119) int local1119 = 4;
			for (@Pc(1121) int local1121 = 0; local1121 < 4; local1121++) {
				if (local1121 > 0) {
					local27 <<= 0x3;
					local1117 <<= 0x3;
					local1119 <<= 0x3;
				}
				for (@Pc(1139) int local1139 = 0; local1139 <= local1121; local1139++) {
					for (local142 = 0; local142 <= this.anInt207; local142++) {
						for (local148 = 0; local148 <= this.anInt206; local148++) {
							if ((this.anIntArrayArrayArray2[local1139][local148][local142] & local27) != 0) {
								local150 = local142;
								local154 = local142;
								local178 = local1139;
								local200 = local1139;
								while (local150 > 0 && (this.anIntArrayArrayArray2[local1139][local148][local150 - 1] & local27) != 0) {
									local150--;
								}
								while (local154 < this.anInt207 && (this.anIntArrayArrayArray2[local1139][local148][local154 + 1] & local27) != 0) {
									local154++;
								}
								label324: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray2[local178 - 1][local148][local213] & local27) == 0) {
											break label324;
										}
									}
									local178--;
								}
								label313: while (local200 < local1121) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray2[local200 + 1][local148][local213] & local27) == 0) {
											break label313;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray1[local200][local148][local150] - 240;
									local229 = this.anIntArrayArrayArray1[local178][local148][local150];
									Class39.method547(local148 * 128, local1121, local150 * 128, local229, local223, 1, local148 * 128, local154 * 128 + 128);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray2[local245][local148][local293] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1139][local148][local142] & local1117) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local1139;
								local200 = local1139;
								while (local150 > 0 && (this.anIntArrayArrayArray2[local1139][local150 - 1][local142] & local1117) != 0) {
									local150--;
								}
								while (local154 < this.anInt206 && (this.anIntArrayArrayArray2[local1139][local154 + 1][local142] & local1117) != 0) {
									local154++;
								}
								label377: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray2[local178 - 1][local213][local142] & local1117) == 0) {
											break label377;
										}
									}
									local178--;
								}
								label366: while (local200 < local1121) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray2[local200 + 1][local213][local142] & local1117) == 0) {
											break label366;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray1[local200][local150][local142] - 240;
									local229 = this.anIntArrayArrayArray1[local178][local150][local142];
									Class39.method547(local154 * 128 + 128, local1121, local142 * 128, local229, local223, 2, local150 * 128, local142 * 128);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray2[local245][local293][local142] &= ~local1117;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1139][local148][local142] & local1119) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local142;
								local200 = local142;
								while (local178 > 0 && (this.anIntArrayArrayArray2[local1139][local148][local178 - 1] & local1119) != 0) {
									local178--;
								}
								while (local200 < this.anInt207 && (this.anIntArrayArrayArray2[local1139][local148][local200 + 1] & local1119) != 0) {
									local200++;
								}
								label430: while (local150 > 0) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray2[local1139][local150 - 1][local213] & local1119) == 0) {
											break label430;
										}
									}
									local150--;
								}
								label419: while (local154 < this.anInt206) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray2[local1139][local154 + 1][local213] & local1119) == 0) {
											break label419;
										}
									}
									local154++;
								}
								if ((local154 + 1 - local150) * (local200 + 1 - local178) >= 4) {
									local213 = this.anIntArrayArrayArray1[local1139][local150][local178];
									Class39.method547(local154 * 128 + 128, local1121, local178 * 128, local213, local213, 4, local150 * 128, local200 * 128 + 128);
									for (local219 = local150; local219 <= local154; local219++) {
										for (local223 = local178; local223 <= local200; local223++) {
											this.anIntArrayArrayArray2[local1139][local219][local223] &= ~local1119;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1754) RuntimeException local1754) {
			signlink.reporterror("63647, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local1754.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method64(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("60205, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
