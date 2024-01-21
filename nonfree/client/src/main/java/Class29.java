import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RQCEQFSS")
public final class Class29 {

	@OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "I")
	public static int anInt605;

	@OriginalMember(owner = "client!RQCEQFSS", name = "g", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "Z")
	public static boolean aBoolean146 = true;

	@OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "[I")
	private static final int[] anIntArray100 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!RQCEQFSS", name = "f", descriptor = "[I")
	private static final int[] anIntArray101 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!RQCEQFSS", name = "h", descriptor = "[I")
	private static final int[] anIntArray102 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!RQCEQFSS", name = "j", descriptor = "I")
	private static int anInt607 = 7;

	@OriginalMember(owner = "client!RQCEQFSS", name = "k", descriptor = "I")
	private static int anInt608 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!RQCEQFSS", name = "w", descriptor = "I")
	public static int anInt609 = 99;

	@OriginalMember(owner = "client!RQCEQFSS", name = "z", descriptor = "[I")
	private static final int[] anIntArray108 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!RQCEQFSS", name = "B", descriptor = "I")
	private static int anInt612 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!RQCEQFSS", name = "e", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!RQCEQFSS", name = "i", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!RQCEQFSS", name = "D", descriptor = "I")
	private int anInt613 = 953;

	@OriginalMember(owner = "client!RQCEQFSS", name = "x", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!RQCEQFSS", name = "y", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!RQCEQFSS", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!RQCEQFSS", name = "u", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!RQCEQFSS", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!RQCEQFSS", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!RQCEQFSS", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!RQCEQFSS", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!RQCEQFSS", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!RQCEQFSS", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!RQCEQFSS", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!RQCEQFSS", name = "p", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!RQCEQFSS", name = "q", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!RQCEQFSS", name = "r", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!RQCEQFSS", name = "s", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!RQCEQFSS", name = "t", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(III)I")
	private static int method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method434(local3, local13);
		@Pc(29) int local29 = method434(local3 + 1, local13);
		@Pc(35) int local35 = method434(local3, local13 + 1);
		@Pc(43) int local43 = method434(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method433(local23, local29, local9, arg2);
		@Pc(55) int local55 = method433(local35, local43, local9, arg2);
		return method433(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(ZI[BI)Z")
	public static boolean method420(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) boolean local12 = true;
			@Pc(18) Class2_Sub1_Sub2 local18 = new Class2_Sub1_Sub2(arg1, -990);
			@Pc(20) int local20 = -1;
			label53: while (true) {
				@Pc(23) int local23 = local18.method93();
				if (local23 == 0) {
					return local12;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				@Pc(33) boolean local33 = false;
				while (true) {
					@Pc(38) int local38;
					while (!local33) {
						local38 = local18.method93();
						if (local38 == 0) {
							continue label53;
						}
						local31 += local38 - 1;
						@Pc(60) int local60 = local31 & 0x3F;
						@Pc(66) int local66 = local31 >> 6 & 0x3F;
						@Pc(71) int local71 = local18.method79() >> 2;
						@Pc(75) int local75 = local66 + arg2;
						@Pc(79) int local79 = local60 + arg0;
						if (local75 > 0 && local79 > 0 && local75 < 103 && local79 < 103) {
							@Pc(92) Class46 local92 = Class46.method546(local20);
							if (local71 != 22 || !aBoolean146 || local92.aBoolean195 || local92.aBoolean199) {
								local12 &= local92.method550();
								local33 = true;
							}
						}
					}
					local38 = local18.method93();
					if (local38 == 0) {
						break;
					}
					local18.method79();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("65098, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(II)I")
	private static int method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method419(arg0 + 45365, arg1 + 91923, 4) + (method419(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method419(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(III)Z")
	public static boolean method423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) Class46 local10 = Class46.method546(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local10.method556(arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("27145, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(II)I")
	private static int method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(BII[[[IIIIIILclient!RUPQNTVM;Lclient!PJTXDRVG;)V")
	public static void method426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class30 arg8, @OriginalArg(10) Class27 arg9) {
		try {
			@Pc(14) int local14 = arg2[arg0][arg7][arg5];
			@Pc(24) int local24 = arg2[arg0][arg7 + 1][arg5];
			@Pc(36) int local36 = arg2[arg0][arg7 + 1][arg5 + 1];
			@Pc(46) int local46 = arg2[arg0][arg7][arg5 + 1];
			@Pc(56) int local56 = local14 + local24 + local36 + local46 >> 2;
			@Pc(59) Class46 local59 = Class46.method546(arg3);
			@Pc(71) int local71 = arg7 + (arg5 << 7) + (arg3 << 14) + 1073741824;
			if (!local59.aBoolean195) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg6 << 6) + arg4);
			@Pc(105) Class2_Sub1_Sub1 local105;
			if (arg4 == 22) {
				if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
					local105 = local59.method551(22, arg6, local14, local24, local36, local46, -1);
				} else {
					local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, 22, local59.anInt799);
				}
				arg9.method303(local105, local85, local56, arg5, arg7, arg1, local71);
				if (local59.aBoolean202 && local59.aBoolean195) {
					arg8.method440(arg7, arg5);
				}
			} else {
				@Pc(201) int local201;
				if (arg4 == 10 || arg4 == 11) {
					if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
						local105 = local59.method551(10, arg6, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, 10, local59.anInt799);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg4 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg6 == 1 || arg6 == 3) {
							local201 = local59.anInt789;
							local204 = local59.anInt783;
						} else {
							local201 = local59.anInt783;
							local204 = local59.anInt789;
						}
						arg9.method307(arg7, local188, arg1, local85, local204, local201, local71, local56, arg5, local105);
					}
					if (local59.aBoolean202) {
						arg8.method439(arg7, local59.anInt783, local59.aBoolean196, arg6, local59.anInt789, arg5);
					}
				} else if (arg4 >= 12) {
					if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
						local105 = local59.method551(arg4, arg6, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, arg4, local59.anInt799);
					}
					arg9.method307(arg7, 0, arg1, local85, 1, 1, local71, local56, arg5, local105);
					if (local59.aBoolean202) {
						arg8.method439(arg7, local59.anInt783, local59.aBoolean196, arg6, local59.anInt789, arg5);
					}
				} else if (arg4 == 0) {
					if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
						local105 = local59.method551(0, arg6, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, 0, local59.anInt799);
					}
					arg9.method305(null, local71, anIntArray100[arg6], 0, local56, arg1, local105, arg7, local85, arg5);
					if (local59.aBoolean202) {
						arg8.method438(arg7, arg6, local59.aBoolean196, arg4, arg5);
					}
				} else if (arg4 == 1) {
					if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
						local105 = local59.method551(1, arg6, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, 1, local59.anInt799);
					}
					arg9.method305(null, local71, anIntArray102[arg6], 0, local56, arg1, local105, arg7, local85, arg5);
					if (local59.aBoolean202) {
						arg8.method438(arg7, arg6, local59.aBoolean196, arg4, arg5);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class2_Sub1_Sub1 local476;
					if (arg4 == 2) {
						local447 = arg6 + 1 & 0x3;
						@Pc(466) Class2_Sub1_Sub1 local466;
						if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
							local466 = local59.method551(2, arg6 + 4, local14, local24, local36, local46, -1);
							local476 = local59.method551(2, local447, local14, local24, local36, local46, -1);
						} else {
							local466 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6 + 4, local24, local36, 2, local59.anInt799);
							local476 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, local447, local24, local36, 2, local59.anInt799);
						}
						arg9.method305(local476, local71, anIntArray100[arg6], anIntArray100[local447], local56, arg1, local466, arg7, local85, arg5);
						if (local59.aBoolean202) {
							arg8.method438(arg7, arg6, local59.aBoolean196, arg4, arg5);
						}
					} else if (arg4 == 3) {
						if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
							local105 = local59.method551(3, arg6, local14, local24, local36, local46, -1);
						} else {
							local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, 3, local59.anInt799);
						}
						arg9.method305(null, local71, anIntArray102[arg6], 0, local56, arg1, local105, arg7, local85, arg5);
						if (local59.aBoolean202) {
							arg8.method438(arg7, arg6, local59.aBoolean196, arg4, arg5);
						}
					} else if (arg4 == 9) {
						if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
							local105 = local59.method551(arg4, arg6, local14, local24, local36, local46, -1);
						} else {
							local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, arg6, local24, local36, arg4, local59.anInt799);
						}
						arg9.method307(arg7, 0, arg1, local85, 1, 1, local71, local56, arg5, local105);
						if (local59.aBoolean202) {
							arg8.method439(arg7, local59.anInt783, local59.aBoolean196, arg6, local59.anInt789, arg5);
						}
					} else {
						if (local59.aBoolean193) {
							if (arg6 == 1) {
								local447 = local46;
								local46 = local36;
								local36 = local24;
								local24 = local14;
								local14 = local447;
							} else if (arg6 == 2) {
								local447 = local46;
								local46 = local24;
								local24 = local447;
								local447 = local36;
								local36 = local14;
								local14 = local447;
							} else if (arg6 == 3) {
								local447 = local46;
								local46 = local14;
								local14 = local24;
								local24 = local36;
								local36 = local447;
							}
						}
						if (arg4 == 4) {
							if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
								local105 = local59.method551(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, 0, local24, local36, 4, local59.anInt799);
							}
							arg9.method306(local56, local105, local71, arg1, local85, anIntArray100[arg6], arg5, 0, arg6 * 512, 0, arg7);
						} else if (arg4 == 5) {
							local447 = 16;
							local201 = arg9.method323(arg1, arg7, arg5);
							if (local201 > 0) {
								local447 = Class46.method546(local201 >> 14 & 0x7FFF).anInt791;
							}
							if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
								local476 = local59.method551(4, 0, local14, local24, local36, local46, -1);
							} else {
								local476 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, 0, local24, local36, 4, local59.anInt799);
							}
							arg9.method306(local56, local476, local71, arg1, local85, anIntArray100[arg6], arg5, anIntArray108[arg6] * local447, arg6 * 512, anIntArray101[arg6] * local447, arg7);
						} else if (arg4 == 6) {
							if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
								local105 = local59.method551(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, 0, local24, local36, 4, local59.anInt799);
							}
							arg9.method306(local56, local105, local71, arg1, local85, 256, arg5, 0, arg6, 0, arg7);
						} else if (arg4 == 7) {
							if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
								local105 = local59.method551(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, 0, local24, local36, 4, local59.anInt799);
							}
							arg9.method306(local56, local105, local71, arg1, local85, 512, arg5, 0, arg6, 0, arg7);
						} else if (arg4 == 8) {
							if (local59.anInt799 == -1 && local59.anIntArray203 == null) {
								local105 = local59.method551(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class2_Sub1_Sub1_Sub5(local46, arg3, anInt607, true, local14, 0, local24, local36, 4, local59.anInt799);
							}
							arg9.method306(local56, local105, local71, arg1, local85, 768, arg5, 0, arg6, 0, arg7);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("68842, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(II)I")
	private static int method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(Lclient!BPHGILGU;Lclient!BFQIDHPO;I)V")
	public static void method429(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = arg1.method93();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(24) Class46 local24 = Class46.method546(local12);
				local24.method552(arg0);
				while (true) {
					@Pc(31) int local31 = arg1.method93();
					if (local31 == 0) {
						break;
					}
					arg1.method79();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("65749, " + arg0 + ", " + arg1 + ", " + -166 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(IIII)I")
	private static int method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub3_Sub3.anIntArray88[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "e", descriptor = "(II)I")
	private static int method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method427(arg0 - 1, arg1 - 1) + method427(arg0 + 1, arg1 - 1) + method427(arg0 - 1, arg1 + 1) + method427(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method427(arg0 - 1, arg1) + method427(arg0 + 1, arg1) + method427(arg0, arg1 - 1) + method427(arg0, arg1 + 1);
		@Pc(59) int local59 = method427(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class29(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt609 = 99;
			this.anInt610 = arg4;
			this.anInt611 = arg2;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray5 = arg0;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt610][this.anInt611];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt610][this.anInt611];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt610][this.anInt611];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt610][this.anInt611];
			this.anIntArrayArrayArray4 = new int[4][this.anInt610 + 1][this.anInt611 + 1];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt610 + 1][this.anInt611 + 1];
			@Pc(81) int local81 = 5 / arg3;
			this.anIntArrayArray13 = new int[this.anInt610 + 1][this.anInt611 + 1];
			this.anIntArray103 = new int[this.anInt611];
			this.anIntArray104 = new int[this.anInt611];
			this.anIntArray105 = new int[this.anInt611];
			this.anIntArray106 = new int[this.anInt611];
			this.anIntArray107 = new int[this.anInt611];
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("41347, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIII)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg0 + local3][arg2 + local7] = 0;
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg0][arg2 + local7] = this.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 + local7];
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg0 + local7][arg2] = this.anIntArrayArrayArray3[arg1][arg0 + local7][arg2 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray3[arg1][arg0][arg2] = this.anIntArrayArrayArray3[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray3[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg0][arg2] = this.anIntArrayArrayArray3[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg0][arg2] = this.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 - 1];
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("15568, " + arg0 + ", " + arg1 + ", " + 620 + ", " + arg2 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIIIZ)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg0; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg1; local7++) {
					if (local7 >= 0 && local7 < this.anInt610 && local3 >= 0 && local3 < this.anInt611) {
						this.aByteArrayArrayArray7[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg1 && local7 < this.anInt610 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg0 && local3 < this.anInt611 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
			if (!arg4) {
				;
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("18473, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "([BII[Lclient!RUPQNTVM;III)V")
	public void method417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(20) int local20;
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
					for (local20 = 0; local20 < 64; local20++) {
						if (arg4 + local16 > 0 && arg4 + local16 < 103 && arg5 + local20 > 0 && arg5 + local20 < 103) {
							arg3[local12].anIntArrayArray14[arg4 + local16][arg5 + local20] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(74) Class2_Sub1_Sub2 local74 = new Class2_Sub1_Sub2(arg0, -990);
			for (local20 = 0; local20 < 4; local20++) {
				for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						this.method424(0, local80 + arg4, arg2, local20, local84 + arg5, arg1, local74);
					}
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("51124, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIILclient!PJTXDRVG;[B[Lclient!RUPQNTVM;)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class27 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class30[] arg4) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg3, -990);
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local7.method93();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local7.method93();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local7.method79();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg1;
					@Pc(71) int local71 = local42 + arg0;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray5[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class30 local98 = null;
						if (local83 >= 0) {
							local98 = arg4[local83];
						}
						this.method432(local52, local67, arg2, local16, local71, local63, local98, local59);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("70853, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIII[B[Lclient!RUPQNTVM;IIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class30[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg6 + local3 > 0 && arg6 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
						arg5[arg3].anIntArrayArray14[arg6 + local3][arg2 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class2_Sub1_Sub2 local57 = new Class2_Sub1_Sub2(arg4, -990);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg8 && local63 >= arg1 && local63 < arg1 + 8 && local67 >= arg7 && local67 < arg7 + 8) {
							this.method424(arg0, arg6 + Class22.method254(local63 & 0x7, local67 & 0x7, arg0), 0, arg3, arg2 + Class22.method255(local67 & 0x7, arg0, local63 & 0x7), 0, local57);
						} else {
							this.method424(0, -1, 0, 0, -1, 0, local57);
						}
					}
				}
			}
			while (arg9 >= 0) {
				this.aBoolean148 = !this.aBoolean148;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("19889, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIIIIILclient!BFQIDHPO;I)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub2 arg6) {
		try {
			@Pc(33) int local33;
			if (arg1 >= 0 && arg1 < 104 && arg4 >= 0 && arg4 < 104) {
				this.aByteArrayArrayArray5[arg3][arg1][arg4] = 0;
				while (true) {
					local33 = arg6.method79();
					if (local33 == 0) {
						if (arg3 == 0) {
							this.anIntArrayArrayArray3[0][arg1][arg4] = -method422(arg1 + arg2 + 932731, arg4 + 556238 + arg5) * 8;
							return;
						} else {
							this.anIntArrayArrayArray3[arg3][arg1][arg4] = this.anIntArrayArrayArray3[arg3 - 1][arg1][arg4] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg6.method79();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg3 == 0) {
							this.anIntArrayArrayArray3[0][arg1][arg4] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray3[arg3][arg1][arg4] = this.anIntArrayArrayArray3[arg3 - 1][arg1][arg4] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray2[arg3][arg1][arg4] = arg6.method80();
						this.aByteArrayArrayArray4[arg3][arg1][arg4] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray6[arg3][arg1][arg4] = (byte) (local33 + arg0 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray5[arg3][arg1][arg4] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray3[arg3][arg1][arg4] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg6.method79();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg6.method79();
						return;
					}
					if (local33 <= 49) {
						arg6.method79();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("45410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -15415 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(Lclient!PJTXDRVG;[Lclient!RUPQNTVM;I)V")
	public void method428(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(2) int arg2) {
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
								arg1[local27].method440(local7, local11);
							}
						}
					}
				}
			}
			anInt608 += (int) (Math.random() * 5.0D) - 2;
			if (anInt608 < -8) {
				anInt608 = -8;
			}
			if (anInt608 > 8) {
				anInt608 = 8;
			}
			anInt612 += (int) (Math.random() * 5.0D) - 2;
			if (anInt612 < -16) {
				anInt612 = -16;
			}
			if (anInt612 > 16) {
				anInt612 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray7[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt611 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt610 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray13[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt611; local145++) {
					this.anIntArray103[local145] = 0;
					this.anIntArray104[local145] = 0;
					this.anIntArray105[local145] = 0;
					this.anIntArray106[local145] = 0;
					this.anIntArray107[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt610 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt611; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt610) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class14 local378 = Class14.aClass14Array1[local210 - 1];
								this.anIntArray103[local191] += local378.anInt298;
								this.anIntArray104[local191] += local378.anInt296;
								this.anIntArray105[local191] += local378.anInt297;
								this.anIntArray106[local191] += local378.anInt299;
								local419 = this.anIntArray107[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt610) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class14 local451 = Class14.aClass14Array1[local214 - 1];
								this.anIntArray103[local191] -= local451.anInt298;
								this.anIntArray104[local191] -= local451.anInt296;
								this.anIntArray105[local191] -= local451.anInt297;
								this.anIntArray106[local191] -= local451.anInt299;
								local419 = this.anIntArray107[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt610 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt611 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt611) {
								local204 += this.anIntArray103[local527];
								local210 += this.anIntArray104[local527];
								local214 += this.anIntArray105[local527];
								local220 += this.anIntArray106[local527];
								local236 += this.anIntArray107[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt611) {
								local204 -= this.anIntArray103[local572];
								local210 -= this.anIntArray104[local572];
								local214 -= this.anIntArray105[local572];
								local220 -= this.anIntArray106[local572];
								local236 -= this.anIntArray107[local572];
							}
							if (local284 >= 1 && local284 < this.anInt611 - 1 && (!aBoolean146 || (this.aByteArrayArrayArray5[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray5[local7][local169][local284] & 0x10) == 0 && this.method435(local284, local7, local169) == anInt605)) {
								if (local7 < anInt609) {
									anInt609 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray13[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray13[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray13[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray13[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method436(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt608 & 0xFF;
										local786 += anInt612;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method436(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class14.aClass14Array1[local682 - 1].aBoolean76) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class2_Sub1_Sub3_Sub3.anIntArray92[method425(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method302(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method425(local768, local737), method425(local768, local746), method425(local768, local757), method425(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray6[local7][local169][local284];
										@Pc(941) Class14 local941 = Class14.aClass14Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt294;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class2_Sub1_Sub3_Sub3.method368(local944);
											local952 = -1;
										} else if (local941.anInt293 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class2_Sub1_Sub3_Sub3.anIntArray92[this.method431(local941.anInt300, 96)];
										} else {
											local952 = this.method436(local941.anInt295, local941.anInt296, local941.anInt297);
											local950 = Class2_Sub1_Sub3_Sub3.anIntArray92[this.method431(local941.anInt300, 96)];
										}
										arg0.method302(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method425(local768, local737), method425(local768, local746), method425(local768, local757), method425(local768, local766), this.method431(local952, local737), this.method431(local952, local746), this.method431(local952, local757), this.method431(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt611 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt610 - 1; local204++) {
						arg0.method301(local7, local204, local191, this.method435(local191, local7, local204));
					}
				}
			}
			arg0.method328();
			for (local11 = 0; local11 < this.anInt610; local11++) {
				for (local27 = 0; local27 < this.anInt611; local27++) {
					if ((this.aByteArrayArrayArray5[1][local11][local27] & 0x2) == 2) {
						arg0.method299(local27, this.anInt613, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1128) int local1128 = 2;
			@Pc(1130) int local1130 = 4;
			if (arg2 == 0) {
				for (@Pc(1135) int local1135 = 0; local1135 < 4; local1135++) {
					if (local1135 > 0) {
						local27 <<= 0x3;
						local1128 <<= 0x3;
						local1130 <<= 0x3;
					}
					for (@Pc(1153) int local1153 = 0; local1153 <= local1135; local1153++) {
						for (local133 = 0; local133 <= this.anInt611; local133++) {
							for (local139 = 0; local139 <= this.anInt610; local139++) {
								if ((this.anIntArrayArrayArray4[local1153][local139][local133] & local27) != 0) {
									local141 = local133;
									local145 = local133;
									local169 = local1153;
									local191 = local1153;
									while (local141 > 0 && (this.anIntArrayArrayArray4[local1153][local139][local141 - 1] & local27) != 0) {
										local141--;
									}
									while (local145 < this.anInt611 && (this.anIntArrayArrayArray4[local1153][local139][local145 + 1] & local27) != 0) {
										local145++;
									}
									label332: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
												break label332;
											}
										}
										local169--;
									}
									label321: while (local191 < local1135) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
												break label321;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
										local220 = this.anIntArrayArrayArray3[local169][local139][local141];
										Class27.method300(local139 * 128, local145 * 128 + 128, local141 * 128, local214, local220, local139 * 128, local1135, 1);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray4[local1153][local139][local133] & local1128) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local1153;
									local191 = local1153;
									while (local141 > 0 && (this.anIntArrayArrayArray4[local1153][local141 - 1][local133] & local1128) != 0) {
										local141--;
									}
									while (local145 < this.anInt610 && (this.anIntArrayArrayArray4[local1153][local145 + 1][local133] & local1128) != 0) {
										local145++;
									}
									label385: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1128) == 0) {
												break label385;
											}
										}
										local169--;
									}
									label374: while (local191 < local1135) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1128) == 0) {
												break label374;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
										local220 = this.anIntArrayArrayArray3[local169][local141][local133];
										Class27.method300(local141 * 128, local133 * 128, local133 * 128, local214, local220, local145 * 128 + 128, local1135, 2);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1128;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray4[local1153][local139][local133] & local1130) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local133;
									local191 = local133;
									while (local169 > 0 && (this.anIntArrayArrayArray4[local1153][local139][local169 - 1] & local1130) != 0) {
										local169--;
									}
									while (local191 < this.anInt611 && (this.anIntArrayArrayArray4[local1153][local139][local191 + 1] & local1130) != 0) {
										local191++;
									}
									label438: while (local141 > 0) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray4[local1153][local141 - 1][local204] & local1130) == 0) {
												break label438;
											}
										}
										local141--;
									}
									label427: while (local145 < this.anInt610) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray4[local1153][local145 + 1][local204] & local1130) == 0) {
												break label427;
											}
										}
										local145++;
									}
									if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
										local204 = this.anIntArrayArrayArray3[local1153][local141][local169];
										Class27.method300(local141 * 128, local191 * 128 + 128, local169 * 128, local204, local204, local145 * 128 + 128, local1135, 4);
										for (local210 = local141; local210 <= local145; local210++) {
											for (local214 = local169; local214 <= local191; local214++) {
												this.anIntArrayArrayArray4[local1153][local210][local214] &= ~local1130;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1768) RuntimeException local1768) {
			signlink.reporterror("76290, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1768.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIBLclient!PJTXDRVG;II[Lclient!RUPQNTVM;I[BII)V")
	public void method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg7, -990);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(23) int local23 = local7.method93();
				if (local23 == 0) {
					return;
				}
				local9 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local7.method93();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local7.method79();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					if (local56 == arg8 && local52 >= arg6 && local52 < arg6 + 8 && local46 >= arg0 && local46 < arg0 + 8) {
						@Pc(89) Class46 local89 = Class46.method546(local9);
						@Pc(106) int local106 = arg9 + Class22.method256(local46 & 0x7, local89.anInt783, arg3, local89.anInt789, local67, local52 & 0x7);
						@Pc(123) int local123 = arg1 + Class22.method257(local89.anInt783, local52 & 0x7, (byte) 8, arg3, local67, local46 & 0x7, local89.anInt789);
						if (local106 > 0 && local123 > 0 && local106 < 103 && local123 < 103) {
							@Pc(135) int local135 = arg4;
							if ((this.aByteArrayArrayArray5[1][local106][local123] & 0x2) == 2) {
								local135 = arg4 - 1;
							}
							@Pc(150) Class30 local150 = null;
							if (local135 >= 0) {
								local150 = arg5[local135];
							}
							this.method432(arg4, local106, arg2, local9, local123, local67 + arg3 & 0x3, local150, local63);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("28406, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "d", descriptor = "(II)I")
	private int method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(ZIILclient!PJTXDRVG;IIILclient!RUPQNTVM;I)V")
	private void method432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class30 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean146 && (this.aByteArrayArrayArray5[0][arg1][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray5[arg0][arg1][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method435(arg4, arg0, arg1) != anInt605) {
					return;
				}
			}
			if (arg0 < anInt609) {
				anInt609 = arg0;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray3[arg0][arg1][arg4];
			@Pc(60) int local60 = this.anIntArrayArrayArray3[arg0][arg1 + 1][arg4];
			@Pc(73) int local73 = this.anIntArrayArrayArray3[arg0][arg1 + 1][arg4 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray3[arg0][arg1][arg4 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class46 local97 = Class46.method546(arg3);
			@Pc(109) int local109 = arg1 + (arg4 << 7) + (arg3 << 14) + 1073741824;
			if (!local97.aBoolean195) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(126) byte local126 = (byte) ((arg5 << 6) + arg7);
			@Pc(155) Class2_Sub1_Sub1 local155;
			if (arg7 != 22) {
				@Pc(253) int local253;
				if (arg7 == 10 || arg7 == 11) {
					if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
						local155 = local97.method551(10, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, 10, local97.anInt799);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg7 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg5 == 1 || arg5 == 3) {
							local253 = local97.anInt789;
							local256 = local97.anInt783;
						} else {
							local253 = local97.anInt783;
							local256 = local97.anInt789;
						}
						if (arg2.method307(arg1, local240, arg0, local126, local256, local253, local109, local94, arg4, local155) && local97.aBoolean194) {
							@Pc(287) Class2_Sub1_Sub1_Sub6 local287;
							if (local155 instanceof Class2_Sub1_Sub1_Sub6) {
								local287 = (Class2_Sub1_Sub1_Sub6) local155;
							} else {
								local287 = local97.method551(10, arg5, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt764 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray7[arg0][arg1 + local303][arg4 + local307]) {
											this.aByteArrayArrayArray7[arg0][arg1 + local303][arg4 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean202 && arg6 != null) {
						arg6.method439(arg1, local97.anInt783, local97.aBoolean196, arg5, local97.anInt789, arg4);
					}
				} else if (arg7 >= 12) {
					if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
						local155 = local97.method551(arg7, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, arg7, local97.anInt799);
					}
					arg2.method307(arg1, 0, arg0, local126, 1, 1, local109, local94, arg4, local155);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x924;
					}
					if (local97.aBoolean202 && arg6 != null) {
						arg6.method439(arg1, local97.anInt783, local97.aBoolean196, arg5, local97.anInt789, arg4);
					}
				} else if (arg7 == 0) {
					if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
						local155 = local97.method551(0, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, 0, local97.anInt799);
					}
					arg2.method305(null, local109, anIntArray100[arg5], 0, local94, arg0, local155, arg1, local126, arg4);
					if (arg5 == 0) {
						if (local97.aBoolean194) {
							this.aByteArrayArrayArray7[arg0][arg1][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg1][arg4 + 1] = 50;
						}
						if (local97.aBoolean197) {
							this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local97.aBoolean194) {
							this.aByteArrayArrayArray7[arg0][arg1][arg4 + 1] = 50;
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean197) {
							this.anIntArrayArrayArray4[arg0][arg1][arg4 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local97.aBoolean194) {
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean197) {
							this.anIntArrayArrayArray4[arg0][arg1 + 1][arg4] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local97.aBoolean194) {
							this.aByteArrayArrayArray7[arg0][arg1][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4] = 50;
						}
						if (local97.aBoolean197) {
							this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x492;
						}
					}
					if (local97.aBoolean202 && arg6 != null) {
						arg6.method438(arg1, arg5, local97.aBoolean196, arg7, arg4);
					}
					if (local97.anInt791 != 16) {
						arg2.method313(arg0, local97.anInt791, arg1, arg4);
					}
				} else if (arg7 == 1) {
					if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
						local155 = local97.method551(1, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, 1, local97.anInt799);
					}
					arg2.method305(null, local109, anIntArray102[arg5], 0, local94, arg0, local155, arg1, local126, arg4);
					if (local97.aBoolean194) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray7[arg0][arg1][arg4 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray7[arg0][arg1][arg4] = 50;
						}
					}
					if (local97.aBoolean202 && arg6 != null) {
						arg6.method438(arg1, arg5, local97.aBoolean196, arg7, arg4);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class2_Sub1_Sub1 local893;
					if (arg7 == 2) {
						local864 = arg5 + 1 & 0x3;
						@Pc(883) Class2_Sub1_Sub1 local883;
						if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
							local883 = local97.method551(2, arg5 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method551(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5 + 4, local60, local73, 2, local97.anInt799);
							local893 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, local864, local60, local73, 2, local97.anInt799);
						}
						arg2.method305(local893, local109, anIntArray100[arg5], anIntArray100[local864], local94, arg0, local883, arg1, local126, arg4);
						if (local97.aBoolean197) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg0][arg1][arg4 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray4[arg0][arg1][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg0][arg1 + 1][arg4] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray4[arg0][arg1 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x492;
								this.anIntArrayArrayArray4[arg0][arg1][arg4] |= 0x249;
							}
						}
						if (local97.aBoolean202 && arg6 != null) {
							arg6.method438(arg1, arg5, local97.aBoolean196, arg7, arg4);
						}
						if (local97.anInt791 != 16) {
							arg2.method313(arg0, local97.anInt791, arg1, arg4);
						}
					} else if (arg7 == 3) {
						if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
							local155 = local97.method551(3, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, 3, local97.anInt799);
						}
						arg2.method305(null, local109, anIntArray102[arg5], 0, local94, arg0, local155, arg1, local126, arg4);
						if (local97.aBoolean194) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray7[arg0][arg1][arg4 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray7[arg0][arg1 + 1][arg4] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray7[arg0][arg1][arg4] = 50;
							}
						}
						if (local97.aBoolean202 && arg6 != null) {
							arg6.method438(arg1, arg5, local97.aBoolean196, arg7, arg4);
						}
					} else if (arg7 == 9) {
						if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
							local155 = local97.method551(arg7, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, arg7, local97.anInt799);
						}
						arg2.method307(arg1, 0, arg0, local126, 1, 1, local109, local94, arg4, local155);
						if (local97.aBoolean202 && arg6 != null) {
							arg6.method439(arg1, local97.anInt783, local97.aBoolean196, arg5, local97.anInt789, arg4);
						}
					} else {
						if (local97.aBoolean193) {
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
						if (arg7 == 4) {
							if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
								local155 = local97.method551(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, 0, local60, local73, 4, local97.anInt799);
							}
							arg2.method306(local94, local155, local109, arg0, local126, anIntArray100[arg5], arg4, 0, arg5 * 512, 0, arg1);
						} else if (arg7 == 5) {
							local864 = 16;
							local253 = arg2.method323(arg0, arg1, arg4);
							if (local253 > 0) {
								local864 = Class46.method546(local253 >> 14 & 0x7FFF).anInt791;
							}
							if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
								local893 = local97.method551(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, 0, local60, local73, 4, local97.anInt799);
							}
							arg2.method306(local94, local893, local109, arg0, local126, anIntArray100[arg5], arg4, anIntArray108[arg5] * local864, arg5 * 512, anIntArray101[arg5] * local864, arg1);
						} else if (arg7 == 6) {
							if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
								local155 = local97.method551(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, 0, local60, local73, 4, local97.anInt799);
							}
							arg2.method306(local94, local155, local109, arg0, local126, 256, arg4, 0, arg5, 0, arg1);
						} else if (arg7 == 7) {
							if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
								local155 = local97.method551(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, 0, local60, local73, 4, local97.anInt799);
							}
							arg2.method306(local94, local155, local109, arg0, local126, 512, arg4, 0, arg5, 0, arg1);
						} else if (arg7 == 8) {
							if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
								local155 = local97.method551(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, 0, local60, local73, 4, local97.anInt799);
							}
							arg2.method306(local94, local155, local109, arg0, local126, 768, arg4, 0, arg5, 0, arg1);
						}
					}
				}
			} else if (!aBoolean146 || local97.aBoolean195 || local97.aBoolean199) {
				if (local97.anInt799 == -1 && local97.anIntArray203 == null) {
					local155 = local97.method551(22, arg5, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class2_Sub1_Sub1_Sub5(local84, arg3, anInt607, true, local49, arg5, local60, local73, 22, local97.anInt799);
				}
				arg2.method303(local155, local126, local94, arg4, arg1, arg0, local109);
				if (local97.aBoolean202 && local97.aBoolean195 && arg6 != null) {
					arg6.method440(arg1, arg4);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("97375, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(IIII)I")
	private int method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray5[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray5[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("5956, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -42028 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(III)I")
	private int method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
