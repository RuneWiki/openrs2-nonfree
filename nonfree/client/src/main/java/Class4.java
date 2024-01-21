import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt183;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt182 = -108;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt186 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt187 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt180 = -31767;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt181 = 1;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt185;

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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BBI)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(-49365, arg1);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local9.method494();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method494();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method480() >> 2;
						@Pc(73) int local73 = local64 + arg2;
						@Pc(77) int local77 = local58 + arg0;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method288(local18);
							if (local69 != 22 || !aBoolean36 || local90.aBoolean129 || local90.aBoolean135) {
								local3 &= local90.method292();
								local31 = true;
							}
						}
					}
					local36 = local9.method494();
					if (local36 == 0) {
						break;
					}
					local9.method480();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("45530, " + arg0 + ", " + arg1 + ", " + 40 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;Lclient!ub;I)V")
	public static void method59(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(15) int local15 = arg0.method494();
				if (local15 == 0) {
					return;
				}
				local3 += local15;
				@Pc(24) Class9 local24 = Class9.method288(local3);
				local24.method293(arg1);
				while (true) {
					@Pc(31) int local31 = arg0.method494();
					if (local31 == 0) {
						break;
					}
					arg0.method480();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("60146, " + arg0 + ", " + arg1 + ", " + -108 + ", " + local42.toString());
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
	public static boolean method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method288(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method291(arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("4105, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!jc;II[[[ILclient!r;II)V")
	public static void method73(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][][] arg6, @OriginalArg(8) Class37 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg1][arg4][arg0];
			@Pc(19) int local19 = arg6[arg1][arg4 + 1][arg0];
			@Pc(36) int local36 = arg6[arg1][arg4 + 1][arg0 + 1];
			@Pc(46) int local46 = arg6[arg1][arg4][arg0 + 1];
			@Pc(56) int local56 = local9 + local19 + local36 + local46 >> 2;
			@Pc(59) Class9 local59 = Class9.method288(arg9);
			@Pc(71) int local71 = arg4 + (arg0 << 7) + (arg9 << 14) + 1073741824;
			if (!local59.aBoolean129) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg2 << 6) + arg8);
			@Pc(105) Class1_Sub1_Sub1 local105;
			if (arg8 == 22) {
				if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
					local105 = local59.method294(22, arg2, local9, local19, local36, local46, -1);
				} else {
					local105 = new Class1_Sub1_Sub1_Sub2(22, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
				}
				arg7.method536(arg4, arg5, local71, local105, local56, arg0, local85);
				if (local59.aBoolean127 && local59.aBoolean129) {
					arg3.method423(arg4, arg0);
				}
			} else {
				@Pc(201) int local201;
				if (arg8 == 10 || arg8 == 11) {
					if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
						local105 = local59.method294(10, arg2, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(10, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg8 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg2 == 1 || arg2 == 3) {
							local201 = local59.anInt520;
							local204 = local59.anInt519;
						} else {
							local201 = local59.anInt519;
							local204 = local59.anInt520;
						}
						arg7.method540(local188, local56, local201, arg0, local71, arg5, local204, arg4, local105, local85);
					}
					if (local59.aBoolean127) {
						arg3.method422(local59.aBoolean128, arg0, arg4, local59.anInt520, local59.anInt519, arg2);
					}
				} else if (arg8 >= 12) {
					if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
						local105 = local59.method294(arg8, arg2, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(arg8, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
					}
					arg7.method540(0, local56, 1, arg0, local71, arg5, 1, arg4, local105, local85);
					if (local59.aBoolean127) {
						arg3.method422(local59.aBoolean128, arg0, arg4, local59.anInt520, local59.anInt519, arg2);
					}
				} else if (arg8 == 0) {
					if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
						local105 = local59.method294(0, arg2, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(0, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
					}
					arg7.method538(arg0, 0, local105, local71, local56, arg4, anIntArray25[arg2], local85, arg5, null);
					if (local59.aBoolean127) {
						arg3.method421(local59.aBoolean128, arg4, arg2, arg8, arg0);
					}
				} else if (arg8 == 1) {
					if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
						local105 = local59.method294(1, arg2, local9, local19, local36, local46, -1);
					} else {
						local105 = new Class1_Sub1_Sub1_Sub2(1, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
					}
					arg7.method538(arg0, 0, local105, local71, local56, arg4, anIntArray26[arg2], local85, arg5, null);
					if (local59.aBoolean127) {
						arg3.method421(local59.aBoolean128, arg4, arg2, arg8, arg0);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class1_Sub1_Sub1 local476;
					if (arg8 == 2) {
						local447 = arg2 + 1 & 0x3;
						@Pc(466) Class1_Sub1_Sub1 local466;
						if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
							local466 = local59.method294(2, arg2 + 4, local9, local19, local36, local46, -1);
							local476 = local59.method294(2, local447, local9, local19, local36, local46, -1);
						} else {
							local466 = new Class1_Sub1_Sub1_Sub2(2, arg9, local9, local46, arg2 + 4, local59.anInt521, true, local19, local36, (byte) 87);
							local476 = new Class1_Sub1_Sub1_Sub2(2, arg9, local9, local46, local447, local59.anInt521, true, local19, local36, (byte) 87);
						}
						arg7.method538(arg0, anIntArray25[local447], local466, local71, local56, arg4, anIntArray25[arg2], local85, arg5, local476);
						if (local59.aBoolean127) {
							arg3.method421(local59.aBoolean128, arg4, arg2, arg8, arg0);
						}
					} else if (arg8 == 3) {
						if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
							local105 = local59.method294(3, arg2, local9, local19, local36, local46, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(3, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
						}
						arg7.method538(arg0, 0, local105, local71, local56, arg4, anIntArray26[arg2], local85, arg5, null);
						if (local59.aBoolean127) {
							arg3.method421(local59.aBoolean128, arg4, arg2, arg8, arg0);
						}
					} else if (arg8 == 9) {
						if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
							local105 = local59.method294(arg8, arg2, local9, local19, local36, local46, -1);
						} else {
							local105 = new Class1_Sub1_Sub1_Sub2(arg8, arg9, local9, local46, arg2, local59.anInt521, true, local19, local36, (byte) 87);
						}
						arg7.method540(0, local56, 1, arg0, local71, arg5, 1, arg4, local105, local85);
						if (local59.aBoolean127) {
							arg3.method422(local59.aBoolean128, arg0, arg4, local59.anInt520, local59.anInt519, arg2);
						}
					} else {
						if (local59.aBoolean130) {
							if (arg2 == 1) {
								local447 = local46;
								local46 = local36;
								local36 = local19;
								local19 = local9;
								local9 = local447;
							} else if (arg2 == 2) {
								local447 = local46;
								local46 = local19;
								local19 = local447;
								local447 = local36;
								local36 = local9;
								local9 = local447;
							} else if (arg2 == 3) {
								local447 = local46;
								local46 = local9;
								local9 = local19;
								local19 = local36;
								local36 = local447;
							}
						}
						if (arg8 == 4) {
							if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
								local105 = local59.method294(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub1_Sub1_Sub2(4, arg9, local9, local46, 0, local59.anInt521, true, local19, local36, (byte) 87);
							}
							arg7.method539(arg5, local71, arg0, 0, anIntArray25[arg2], arg4, local105, local56, arg2 * 512, local85, 0);
						} else if (arg8 == 5) {
							local447 = 16;
							local201 = arg7.method556(arg5, arg4, arg0);
							if (local201 > 0) {
								local447 = Class9.method288(local201 >> 14 & 0x7FFF).anInt522;
							}
							if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
								local476 = local59.method294(4, 0, local9, local19, local36, local46, -1);
							} else {
								local476 = new Class1_Sub1_Sub1_Sub2(4, arg9, local9, local46, 0, local59.anInt521, true, local19, local36, (byte) 87);
							}
							arg7.method539(arg5, local71, arg0, anIntArray27[arg2] * local447, anIntArray25[arg2], arg4, local476, local56, arg2 * 512, local85, anIntArray28[arg2] * local447);
						} else if (arg8 == 6) {
							if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
								local105 = local59.method294(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub1_Sub1_Sub2(4, arg9, local9, local46, 0, local59.anInt521, true, local19, local36, (byte) 87);
							}
							arg7.method539(arg5, local71, arg0, 0, 256, arg4, local105, local56, arg2, local85, 0);
						} else if (arg8 == 7) {
							if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
								local105 = local59.method294(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub1_Sub1_Sub2(4, arg9, local9, local46, 0, local59.anInt521, true, local19, local36, (byte) 87);
							}
							arg7.method539(arg5, local71, arg0, 0, 512, arg4, local105, local56, arg2, local85, 0);
						} else if (arg8 == 8) {
							if (local59.anInt521 == -1 && local59.anIntArray160 == null) {
								local105 = local59.method294(4, 0, local9, local19, local36, local46, -1);
							} else {
								local105 = new Class1_Sub1_Sub1_Sub2(4, arg9, local9, local46, 0, local59.anInt521, true, local19, local36, (byte) 87);
							}
							arg7.method539(arg5, local71, arg0, 0, 768, arg4, local105, local56, arg2, local85, 0);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("69291, " + -389 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[II[[[BZ)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.anInt184 = arg2;
			this.anInt185 = arg0;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt184][this.anInt185];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt184][this.anInt185];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt184][this.anInt185];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt184][this.anInt185];
			this.anIntArrayArrayArray4 = new int[4][this.anInt184 + 1][this.anInt185 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt184 + 1][this.anInt185 + 1];
			this.anIntArrayArray2 = new int[this.anInt184 + 1][this.anInt185 + 1];
			this.anIntArray20 = new int[this.anInt185];
			if (arg4) {
				for (@Pc(98) int local98 = 1; local98 > 0; local98++) {
				}
			}
			this.anIntArray21 = new int[this.anInt185];
			this.anIntArray22 = new int[this.anInt185];
			this.anIntArray23 = new int[this.anInt185];
			this.anIntArray24 = new int[this.anInt185];
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("83579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt184 && local3 >= 0 && local3 < this.anInt185) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt184 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt185 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
			if (this.anInt181 > 1 || this.anInt181 < 1) {
				;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("52190, " + arg0 + ", " + 64 + ", " + arg1 + ", " + 64 + ", " + 1 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZI[BI)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(-49365, arg3);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg2;
						@Pc(27) int local27 = local17 + arg4;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method480();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -method64(local23 + arg0 + 932731, local27 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method480();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method481();
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
								local49 = local7.method480();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method480();
									break;
								}
								if (local49 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("97418, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!r;I[B[Lclient!jc;I)V")
	public void method60(@OriginalArg(1) Class37 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class19[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(-49365, arg2);
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = local10.method494();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local10.method494();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local10.method480();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					@Pc(63) int local63 = local44 + arg4;
					@Pc(67) int local67 = local38 + arg1;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						@Pc(79) int local79 = local48;
						if ((this.aByteArrayArrayArray1[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						@Pc(94) Class19 local94 = null;
						if (local79 >= 0) {
							local94 = arg3[local79];
						}
						this.method61(local12, local63, local48, local59, arg0, local94, local67, local55);
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("46235, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!r;Lclient!jc;III)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean36) {
				if ((this.aByteArrayArrayArray1[arg2][arg1][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg1, arg2, arg6) != anInt183) {
					return;
				}
			}
			@Pc(42) int local42 = this.anIntArrayArrayArray3[arg2][arg1][arg6];
			@Pc(53) int local53 = this.anIntArrayArrayArray3[arg2][arg1 + 1][arg6];
			@Pc(66) int local66 = this.anIntArrayArrayArray3[arg2][arg1 + 1][arg6 + 1];
			@Pc(77) int local77 = this.anIntArrayArrayArray3[arg2][arg1][arg6 + 1];
			@Pc(87) int local87 = local42 + local53 + local66 + local77 >> 2;
			@Pc(90) Class9 local90 = Class9.method288(arg0);
			@Pc(102) int local102 = arg1 + (arg6 << 7) + (arg0 << 14) + 1073741824;
			if (!local90.aBoolean129) {
				local102 += Integer.MIN_VALUE;
			}
			@Pc(116) byte local116 = (byte) ((arg3 << 6) + arg7);
			@Pc(145) Class1_Sub1_Sub1 local145;
			if (arg7 != 22) {
				@Pc(243) int local243;
				if (arg7 == 10 || arg7 == 11) {
					if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(10, arg3, local42, local53, local66, local77, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(10, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
					}
					if (local145 != null) {
						@Pc(230) int local230 = 0;
						if (arg7 == 11) {
							local230 += 256;
						}
						@Pc(246) int local246;
						if (arg3 == 1 || arg3 == 3) {
							local243 = local90.anInt520;
							local246 = local90.anInt519;
						} else {
							local243 = local90.anInt519;
							local246 = local90.anInt520;
						}
						if (arg4.method540(local230, local87, local243, arg6, local102, arg2, local246, arg1, local145, local116) && local90.aBoolean134) {
							@Pc(277) Class1_Sub1_Sub1_Sub5 local277;
							if (local145 instanceof Class1_Sub1_Sub1_Sub5) {
								local277 = (Class1_Sub1_Sub1_Sub5) local145;
							} else {
								local277 = local90.method294(10, arg3, local42, local53, local66, local77, -1);
							}
							if (local277 != null) {
								for (@Pc(293) int local293 = 0; local293 <= local243; local293++) {
									for (@Pc(297) int local297 = 0; local297 <= local246; local297++) {
										@Pc(304) int local304 = local277.anInt503 / 4;
										if (local304 > 30) {
											local304 = 30;
										}
										if (local304 > this.aByteArrayArrayArray6[arg2][arg1 + local293][arg6 + local297]) {
											this.aByteArrayArrayArray6[arg2][arg1 + local293][arg6 + local297] = (byte) local304;
										}
									}
								}
							}
						}
					}
					if (local90.aBoolean127 && arg5 != null) {
						arg5.method422(local90.aBoolean128, arg6, arg1, local90.anInt520, local90.anInt519, arg3);
					}
				} else if (arg7 >= 12) {
					if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(arg7, arg3, local42, local53, local66, local77, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(arg7, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
					}
					arg4.method540(0, local87, 1, arg6, local102, arg2, 1, arg1, local145, local116);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x924;
					}
					if (local90.aBoolean127 && arg5 != null) {
						arg5.method422(local90.aBoolean128, arg6, arg1, local90.anInt520, local90.anInt519, arg3);
					}
				} else if (arg7 == 0) {
					if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(0, arg3, local42, local53, local66, local77, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(0, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
					}
					arg4.method538(arg6, 0, local145, local102, local87, arg1, anIntArray25[arg3], local116, arg2, null);
					if (arg3 == 0) {
						if (local90.aBoolean134) {
							this.aByteArrayArrayArray6[arg2][arg1][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg1][arg6 + 1] = 50;
						}
						if (local90.aBoolean132) {
							this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local90.aBoolean134) {
							this.aByteArrayArrayArray6[arg2][arg1][arg6 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6 + 1] = 50;
						}
						if (local90.aBoolean132) {
							this.anIntArrayArrayArray4[arg2][arg1][arg6 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local90.aBoolean134) {
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6 + 1] = 50;
						}
						if (local90.aBoolean132) {
							this.anIntArrayArrayArray4[arg2][arg1 + 1][arg6] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local90.aBoolean134) {
							this.aByteArrayArrayArray6[arg2][arg1][arg6] = 50;
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6] = 50;
						}
						if (local90.aBoolean132) {
							this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x492;
						}
					}
					if (local90.aBoolean127 && arg5 != null) {
						arg5.method421(local90.aBoolean128, arg1, arg3, arg7, arg6);
					}
					if (local90.anInt522 != 16) {
						arg4.method546(local90.anInt522, arg6, arg1, arg2);
					}
				} else if (arg7 == 1) {
					if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(1, arg3, local42, local53, local66, local77, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(1, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
					}
					arg4.method538(arg6, 0, local145, local102, local87, arg1, anIntArray26[arg3], local116, arg2, null);
					if (local90.aBoolean134) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray6[arg2][arg1][arg6 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray6[arg2][arg1][arg6] = 50;
						}
					}
					if (local90.aBoolean127 && arg5 != null) {
						arg5.method421(local90.aBoolean128, arg1, arg3, arg7, arg6);
					}
				} else {
					@Pc(854) int local854;
					@Pc(883) Class1_Sub1_Sub1 local883;
					if (arg7 == 2) {
						local854 = arg3 + 1 & 0x3;
						@Pc(873) Class1_Sub1_Sub1 local873;
						if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
							local873 = local90.method294(2, arg3 + 4, local42, local53, local66, local77, -1);
							local883 = local90.method294(2, local854, local42, local53, local66, local77, -1);
						} else {
							local873 = new Class1_Sub1_Sub1_Sub2(2, arg0, local42, local77, arg3 + 4, local90.anInt521, true, local53, local66, (byte) 87);
							local883 = new Class1_Sub1_Sub1_Sub2(2, arg0, local42, local77, local854, local90.anInt521, true, local53, local66, (byte) 87);
						}
						arg4.method538(arg6, anIntArray25[local854], local873, local102, local87, arg1, anIntArray25[arg3], local116, arg2, local883);
						if (local90.aBoolean132) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg1][arg6 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray4[arg2][arg1][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg1 + 1][arg6] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray4[arg2][arg1 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg1][arg6] |= 0x249;
							}
						}
						if (local90.aBoolean127 && arg5 != null) {
							arg5.method421(local90.aBoolean128, arg1, arg3, arg7, arg6);
						}
						if (local90.anInt522 != 16) {
							arg4.method546(local90.anInt522, arg6, arg1, arg2);
						}
					} else if (arg7 == 3) {
						if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
							local145 = local90.method294(3, arg3, local42, local53, local66, local77, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(3, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
						}
						arg4.method538(arg6, 0, local145, local102, local87, arg1, anIntArray26[arg3], local116, arg2, null);
						if (local90.aBoolean134) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray6[arg2][arg1][arg6 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray6[arg2][arg1 + 1][arg6] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray6[arg2][arg1][arg6] = 50;
							}
						}
						if (local90.aBoolean127 && arg5 != null) {
							arg5.method421(local90.aBoolean128, arg1, arg3, arg7, arg6);
						}
					} else if (arg7 == 9) {
						if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
							local145 = local90.method294(arg7, arg3, local42, local53, local66, local77, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(arg7, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
						}
						arg4.method540(0, local87, 1, arg6, local102, arg2, 1, arg1, local145, local116);
						if (local90.aBoolean127 && arg5 != null) {
							arg5.method422(local90.aBoolean128, arg6, arg1, local90.anInt520, local90.anInt519, arg3);
						}
					} else {
						if (local90.aBoolean130) {
							if (arg3 == 1) {
								local854 = local77;
								local77 = local66;
								local66 = local53;
								local53 = local42;
								local42 = local854;
							} else if (arg3 == 2) {
								local854 = local77;
								local77 = local53;
								local53 = local854;
								local854 = local66;
								local66 = local42;
								local42 = local854;
							} else if (arg3 == 3) {
								local854 = local77;
								local77 = local42;
								local42 = local53;
								local53 = local66;
								local66 = local854;
							}
						}
						if (arg7 == 4) {
							if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local42, local53, local66, local77, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(4, arg0, local42, local77, 0, local90.anInt521, true, local53, local66, (byte) 87);
							}
							arg4.method539(arg2, local102, arg6, 0, anIntArray25[arg3], arg1, local145, local87, arg3 * 512, local116, 0);
						} else if (arg7 == 5) {
							local854 = 16;
							local243 = arg4.method556(arg2, arg1, arg6);
							if (local243 > 0) {
								local854 = Class9.method288(local243 >> 14 & 0x7FFF).anInt522;
							}
							if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
								local883 = local90.method294(4, 0, local42, local53, local66, local77, -1);
							} else {
								local883 = new Class1_Sub1_Sub1_Sub2(4, arg0, local42, local77, 0, local90.anInt521, true, local53, local66, (byte) 87);
							}
							arg4.method539(arg2, local102, arg6, anIntArray27[arg3] * local854, anIntArray25[arg3], arg1, local883, local87, arg3 * 512, local116, anIntArray28[arg3] * local854);
						} else if (arg7 == 6) {
							if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local42, local53, local66, local77, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(4, arg0, local42, local77, 0, local90.anInt521, true, local53, local66, (byte) 87);
							}
							arg4.method539(arg2, local102, arg6, 0, 256, arg1, local145, local87, arg3, local116, 0);
						} else if (arg7 == 7) {
							if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local42, local53, local66, local77, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(4, arg0, local42, local77, 0, local90.anInt521, true, local53, local66, (byte) 87);
							}
							arg4.method539(arg2, local102, arg6, 0, 512, arg1, local145, local87, arg3, local116, 0);
						} else if (arg7 == 8) {
							if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local42, local53, local66, local77, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(4, arg0, local42, local77, 0, local90.anInt521, true, local53, local66, (byte) 87);
							}
							arg4.method539(arg2, local102, arg6, 0, 768, arg1, local145, local87, arg3, local116, 0);
						}
					}
				}
			} else if (!aBoolean36 || local90.aBoolean129 || local90.aBoolean135) {
				if (local90.anInt521 == -1 && local90.anIntArray160 == null) {
					local145 = local90.method294(22, arg3, local42, local53, local66, local77, -1);
				} else {
					local145 = new Class1_Sub1_Sub1_Sub2(22, arg0, local42, local77, arg3, local90.anInt521, true, local53, local66, (byte) 87);
				}
				arg4.method536(arg1, arg2, local102, local145, local87, arg6, local116);
				if (local90.aBoolean127 && local90.aBoolean129 && arg5 != null) {
					arg5.method423(arg1, arg6);
				}
			}
		} catch (@Pc(1628) RuntimeException local1628) {
			signlink.reporterror("66000, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 188 + ", " + arg6 + ", " + arg7 + ", " + local1628.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[Lclient!jc;Lclient!r;)V")
	public void method62(@OriginalArg(1) Class19[] arg0, @OriginalArg(2) Class37 arg1) {
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
								arg0[local27].method423(local7, local11);
							}
						}
					}
				}
			}
			anInt186 += (int) (Math.random() * 5.0D) - 2;
			if (anInt186 < -8) {
				anInt186 = -8;
			}
			if (anInt186 > 8) {
				anInt186 = 8;
			}
			anInt187 += (int) (Math.random() * 5.0D) - 2;
			if (anInt187 < -16) {
				anInt187 = -16;
			}
			if (anInt187 > 16) {
				anInt187 = 16;
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
				for (local141 = 1; local141 < this.anInt185 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt184 - 1; local145++) {
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
				for (local145 = 0; local145 < this.anInt185; local145++) {
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt184 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt185; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt184) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray20[local191] += local378.anInt739;
								this.anIntArray21[local191] += local378.anInt737;
								this.anIntArray22[local191] += local378.anInt738;
								this.anIntArray23[local191] += local378.anInt740;
								local419 = this.anIntArray24[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt184) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray20[local191] -= local451.anInt739;
								this.anIntArray21[local191] -= local451.anInt737;
								this.anIntArray22[local191] -= local451.anInt738;
								this.anIntArray23[local191] -= local451.anInt740;
								local419 = this.anIntArray24[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt184 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt185 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt185) {
								local204 += this.anIntArray20[local527];
								local210 += this.anIntArray21[local527];
								local214 += this.anIntArray22[local527];
								local220 += this.anIntArray23[local527];
								local236 += this.anIntArray24[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt185) {
								local204 -= this.anIntArray20[local572];
								local210 -= this.anIntArray21[local572];
								local214 -= this.anIntArray22[local572];
								local220 -= this.anIntArray23[local572];
								local236 -= this.anIntArray24[local572];
							}
							if (local284 >= 1 && local284 < this.anInt185 - 1 && (!aBoolean36 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method63(local169, local7, local284) == anInt183)) {
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
										@Pc(782) int local782 = local762 + anInt186 & 0xFF;
										local770 += anInt187;
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
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean191) {
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
										arg1.method535(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt735;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method348(local928);
											local936 = -1;
										} else if (local925.anInt734 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method71(local925.anInt736, local925.anInt737, local925.anInt738);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local925.anInt741, 96)];
										}
										arg1.method535(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), this.method70(local936, local721), this.method70(local936, local730), this.method70(local936, local741), this.method70(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt185 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt184 - 1; local204++) {
						arg1.method534(local7, local204, local191, this.method63(local204, local7, local191));
					}
				}
			}
			arg1.method561();
			for (local11 = 0; local11 < this.anInt184; local11++) {
				for (local27 = 0; local27 < this.anInt185; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method532(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1107) int local1107 = 2;
			@Pc(1109) int local1109 = 4;
			for (@Pc(1111) int local1111 = 0; local1111 < 4; local1111++) {
				if (local1111 > 0) {
					local27 <<= 0x3;
					local1107 <<= 0x3;
					local1109 <<= 0x3;
				}
				for (@Pc(1129) int local1129 = 0; local1129 <= local1111; local1129++) {
					for (local133 = 0; local133 <= this.anInt185; local133++) {
						for (local139 = 0; local139 <= this.anInt184; local139++) {
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1129][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt185 && (this.anIntArrayArrayArray4[local1129][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label325: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label325;
										}
									}
									local169--;
								}
								label314: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label314;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class37.method533(local214, local220, local145 * 128 + 128, local141 * 128, local139 * 128, 1, local1111, local139 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local1107) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1129][local141 - 1][local133] & local1107) != 0) {
									local141--;
								}
								while (local145 < this.anInt184 && (this.anIntArrayArrayArray4[local1129][local145 + 1][local133] & local1107) != 0) {
									local145++;
								}
								label378: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1107) == 0) {
											break label378;
										}
									}
									local169--;
								}
								label367: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1107) == 0) {
											break label367;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class37.method533(local214, local220, local133 * 128, local133 * 128, local141 * 128, 2, local1111, local145 * 128 + 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1107;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local1109) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1129][local139][local169 - 1] & local1109) != 0) {
									local169--;
								}
								while (local191 < this.anInt185 && (this.anIntArrayArrayArray4[local1129][local139][local191 + 1] & local1109) != 0) {
									local191++;
								}
								label431: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1129][local141 - 1][local204] & local1109) == 0) {
											break label431;
										}
									}
									local141--;
								}
								label420: while (local145 < this.anInt184) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1129][local145 + 1][local204] & local1109) == 0) {
											break label420;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1129][local141][local169];
									Class37.method533(local204, local204, local191 * 128 + 128, local169 * 128, local141 * 128, 4, local1111, local145 * 128 + 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1129][local210][local214] &= ~local1109;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1754) RuntimeException local1754) {
			signlink.reporterror("32855, " + true + ", " + arg0 + ", " + arg1 + ", " + local1754.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIII)I")
	private int method63(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("81231, " + 115 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
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
