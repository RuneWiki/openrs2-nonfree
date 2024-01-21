import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UZSUQFDN")
public final class Class45 {

	@OriginalMember(owner = "client!UZSUQFDN", name = "B", descriptor = "I")
	public static int anInt769;

	@OriginalMember(owner = "client!UZSUQFDN", name = "f", descriptor = "I")
	private static int anInt760 = 6;

	@OriginalMember(owner = "client!UZSUQFDN", name = "g", descriptor = "[I")
	private static final int[] anIntArray195 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!UZSUQFDN", name = "h", descriptor = "I")
	public static int anInt761 = 99;

	@OriginalMember(owner = "client!UZSUQFDN", name = "l", descriptor = "I")
	private static int anInt764 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!UZSUQFDN", name = "n", descriptor = "[I")
	private static final int[] anIntArray196 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!UZSUQFDN", name = "o", descriptor = "I")
	private static int anInt765 = -690;

	@OriginalMember(owner = "client!UZSUQFDN", name = "p", descriptor = "I")
	private static int anInt766 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!UZSUQFDN", name = "u", descriptor = "Z")
	private static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!UZSUQFDN", name = "y", descriptor = "Z")
	public static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!UZSUQFDN", name = "A", descriptor = "[I")
	private static final int[] anIntArray197 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!UZSUQFDN", name = "C", descriptor = "[I")
	private static final int[] anIntArray198 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!UZSUQFDN", name = "G", descriptor = "I")
	private static int anInt770 = 732;

	@OriginalMember(owner = "client!UZSUQFDN", name = "r", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!UZSUQFDN", name = "m", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!UZSUQFDN", name = "x", descriptor = "I")
	private int anInt768 = 489;

	@OriginalMember(owner = "client!UZSUQFDN", name = "E", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!UZSUQFDN", name = "i", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!UZSUQFDN", name = "j", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!UZSUQFDN", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!UZSUQFDN", name = "D", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!UZSUQFDN", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!UZSUQFDN", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!UZSUQFDN", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!UZSUQFDN", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!UZSUQFDN", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!UZSUQFDN", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!UZSUQFDN", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!UZSUQFDN", name = "b", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!UZSUQFDN", name = "c", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!UZSUQFDN", name = "d", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!UZSUQFDN", name = "e", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(II)I")
	private static int method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!UZSUQFDN", name = "b", descriptor = "(II)I")
	private static int method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(IIII)I")
	private static int method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub2.anIntArray17[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(II[BI)Z")
	public static boolean method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3((byte) 9, arg2);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local9.method512();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method512();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method498() >> 2;
						@Pc(73) int local73 = local64 + arg0;
						@Pc(77) int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class42 local90 = Class42.method395(local18);
							if (local69 != 22 || !aBoolean165 || local90.aBoolean137 || local90.aBoolean144) {
								local3 &= local90.method398();
								local31 = true;
							}
						}
					}
					local36 = local9.method512();
					if (local36 == 0) {
						break;
					}
					local9.method498();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("19380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 43518 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(III)Z")
	public static boolean method462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) Class42 local6 = Class42.method395(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local6.method390(arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("72452, " + -239 + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "c", descriptor = "(II)I")
	private static int method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method474(arg0 + 45365, arg1 + 91923, 4) + (method474(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method474(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(Lclient!SDLNXGIT;Lclient!XJCNBMKS;Z)V")
	public static void method468(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(3) int local3 = -1;
			if (arg2) {
				anInt765 = -70;
			}
			while (true) {
				@Pc(10) int local10 = arg1.method512();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class42 local19 = Class42.method395(local3);
				local19.method393(arg0, 746);
				while (true) {
					@Pc(26) int local26 = arg1.method512();
					if (local26 == 0) {
						break;
					}
					arg1.method498();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("8783, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "e", descriptor = "(II)I")
	private static int method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method458(arg0 - 1, arg1 - 1) + method458(arg0 + 1, arg1 - 1) + method458(arg0 - 1, arg1 + 1) + method458(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method458(arg0 - 1, arg1) + method458(arg0 + 1, arg1) + method458(arg0, arg1 - 1) + method458(arg0, arg1 + 1);
		@Pc(59) int local59 = method458(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(ZIIIILclient!KALHRUDX;Lclient!OPAHDXQS;II[[[II)V")
	public static void method472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[][][] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg8[arg6][arg3][arg0];
			@Pc(19) int local19 = arg8[arg6][arg3 + 1][arg0];
			@Pc(31) int local31 = arg8[arg6][arg3 + 1][arg0 + 1];
			@Pc(41) int local41 = arg8[arg6][arg3][arg0 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class42 local54 = Class42.method395(arg9);
			@Pc(66) int local66 = arg3 + (arg0 << 7) + (arg9 << 14) + 1073741824;
			if (!local54.aBoolean137) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg7 << 6) + arg2);
			@Pc(108) Class1_Sub1_Sub1 local108;
			if (arg2 == 22) {
				if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
					local108 = local54.method396(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, 22, local54.anInt695, arg9, local31, true, local41, anInt760);
				}
				arg4.method235(local80, local66, arg0, local108, arg1, arg3, local51);
				if (local54.aBoolean146 && local54.aBoolean137) {
					arg5.method301(arg3, arg0);
				}
			} else {
				@Pc(204) int local204;
				if (arg2 == 10 || arg2 == 11) {
					if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
						local108 = local54.method396(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, 10, local54.anInt695, arg9, local31, true, local41, anInt760);
					}
					if (local108 != null) {
						@Pc(191) int local191 = 0;
						if (arg2 == 11) {
							local191 += 256;
						}
						@Pc(207) int local207;
						if (arg7 == 1 || arg7 == 3) {
							local204 = local54.anInt692;
							local207 = local54.anInt697;
						} else {
							local204 = local54.anInt697;
							local207 = local54.anInt692;
						}
						arg4.method239(local207, local108, local204, local51, local191, arg3, local66, arg1, local80, arg0);
					}
					if (local54.aBoolean146) {
						arg5.method300(arg0, local54.aBoolean135, arg7, (byte) 8, local54.anInt692, local54.anInt697, arg3);
					}
				} else if (arg2 >= 12) {
					if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
						local108 = local54.method396(arg2, arg7, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, arg2, local54.anInt695, arg9, local31, true, local41, anInt760);
					}
					arg4.method239(1, local108, 1, local51, 0, arg3, local66, arg1, local80, arg0);
					if (local54.aBoolean146) {
						arg5.method300(arg0, local54.aBoolean135, arg7, (byte) 8, local54.anInt692, local54.anInt697, arg3);
					}
				} else if (arg2 == 0) {
					if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
						local108 = local54.method396(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, 0, local54.anInt695, arg9, local31, true, local41, anInt760);
					}
					arg4.method237(arg3, local51, local66, 0, local80, local108, anIntArray196[arg7], arg0, arg1, null);
					if (local54.aBoolean146) {
						arg5.method299(arg7, local54.aBoolean135, arg3, arg0, arg2);
					}
				} else if (arg2 == 1) {
					if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
						local108 = local54.method396(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, 1, local54.anInt695, arg9, local31, true, local41, anInt760);
					}
					arg4.method237(arg3, local51, local66, 0, local80, local108, anIntArray198[arg7], arg0, arg1, null);
					if (local54.aBoolean146) {
						arg5.method299(arg7, local54.aBoolean135, arg3, arg0, arg2);
					}
				} else {
					@Pc(450) int local450;
					@Pc(479) Class1_Sub1_Sub1 local479;
					if (arg2 == 2) {
						local450 = arg7 + 1 & 0x3;
						@Pc(469) Class1_Sub1_Sub1 local469;
						if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
							local469 = local54.method396(2, arg7 + 4, local9, local19, local31, local41, -1);
							local479 = local54.method396(2, local450, local9, local19, local31, local41, -1);
						} else {
							local469 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7 + 4, 2, local54.anInt695, arg9, local31, true, local41, anInt760);
							local479 = new Class1_Sub1_Sub1_Sub1(local9, local19, local450, 2, local54.anInt695, arg9, local31, true, local41, anInt760);
						}
						arg4.method237(arg3, local51, local66, anIntArray196[local450], local80, local469, anIntArray196[arg7], arg0, arg1, local479);
						if (local54.aBoolean146) {
							arg5.method299(arg7, local54.aBoolean135, arg3, arg0, arg2);
						}
					} else if (arg2 == 3) {
						if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
							local108 = local54.method396(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, 3, local54.anInt695, arg9, local31, true, local41, anInt760);
						}
						arg4.method237(arg3, local51, local66, 0, local80, local108, anIntArray198[arg7], arg0, arg1, null);
						if (local54.aBoolean146) {
							arg5.method299(arg7, local54.aBoolean135, arg3, arg0, arg2);
						}
					} else if (arg2 == 9) {
						if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
							local108 = local54.method396(arg2, arg7, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, arg7, arg2, local54.anInt695, arg9, local31, true, local41, anInt760);
						}
						arg4.method239(1, local108, 1, local51, 0, arg3, local66, arg1, local80, arg0);
						if (local54.aBoolean146) {
							arg5.method300(arg0, local54.aBoolean135, arg7, (byte) 8, local54.anInt692, local54.anInt697, arg3);
						}
					} else {
						if (local54.aBoolean142) {
							if (arg7 == 1) {
								local450 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local450;
							} else if (arg7 == 2) {
								local450 = local41;
								local41 = local19;
								local19 = local450;
								local450 = local31;
								local31 = local9;
								local9 = local450;
							} else if (arg7 == 3) {
								local450 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local450;
							}
						}
						if (arg2 == 4) {
							if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
								local108 = local54.method396(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, 0, 4, local54.anInt695, arg9, local31, true, local41, anInt760);
							}
							arg4.method238(0, local80, arg3, local51, arg0, arg7 * 512, local108, local66, arg1, anIntArray196[arg7], 0);
						} else if (arg2 == 5) {
							local450 = 16;
							local204 = arg4.method255(arg1, arg3, arg0);
							if (local204 > 0) {
								local450 = Class42.method395(local204 >> 14 & 0x7FFF).anInt708;
							}
							if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
								local479 = local54.method396(4, 0, local9, local19, local31, local41, -1);
							} else {
								local479 = new Class1_Sub1_Sub1_Sub1(local9, local19, 0, 4, local54.anInt695, arg9, local31, true, local41, anInt760);
							}
							arg4.method238(anIntArray197[arg7] * local450, local80, arg3, local51, arg0, arg7 * 512, local479, local66, arg1, anIntArray196[arg7], anIntArray195[arg7] * local450);
						} else if (arg2 == 6) {
							if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
								local108 = local54.method396(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, 0, 4, local54.anInt695, arg9, local31, true, local41, anInt760);
							}
							arg4.method238(0, local80, arg3, local51, arg0, arg7, local108, local66, arg1, 256, 0);
						} else if (arg2 == 7) {
							if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
								local108 = local54.method396(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, 0, 4, local54.anInt695, arg9, local31, true, local41, anInt760);
							}
							arg4.method238(0, local80, arg3, local51, arg0, arg7, local108, local66, arg1, 512, 0);
						} else if (arg2 == 8) {
							if (local54.anInt695 == -1 && local54.anIntArray178 == null) {
								local108 = local54.method396(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub1(local9, local19, 0, 4, local54.anInt695, arg9, local31, true, local41, anInt760);
							}
							arg4.method238(0, local80, arg3, local51, arg0, arg7, local108, local66, arg1, 768, 0);
						}
					}
				}
			}
		} catch (@Pc(1018) RuntimeException local1018) {
			signlink.reporterror("31873, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1018.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "c", descriptor = "(III)I")
	private static int method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method470(local3, local13);
		@Pc(29) int local29 = method470(local3 + 1, local13);
		@Pc(35) int local35 = method470(local3, local13 + 1);
		@Pc(43) int local43 = method470(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method459(local23, local29, local9, arg2);
		@Pc(55) int local55 = method459(local35, local43, local9, arg2);
		return method459(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "<init>", descriptor = "([[[BIII[[[I)V")
	public Class45(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt761 = 99;
			this.anInt762 = arg1;
			this.anInt763 = arg3;
			this.anIntArrayArrayArray5 = arg4;
			this.aByteArrayArrayArray6 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt762][this.anInt763];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt762][this.anInt763];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt762][this.anInt763];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt762][this.anInt763];
			this.anIntArrayArrayArray6 = new int[4][this.anInt762 + 1][this.anInt763 + 1];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt762 + 1][this.anInt763 + 1];
			this.anIntArrayArray21 = new int[this.anInt762 + 1][this.anInt763 + 1];
			this.anIntArray190 = new int[this.anInt763];
			this.anIntArray191 = new int[this.anInt763];
			this.anIntArray192 = new int[this.anInt763];
			this.anIntArray193 = new int[this.anInt763];
			this.anIntArray194 = new int[this.anInt763];
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("65300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(I[Lclient!OPAHDXQS;IIILclient!KALHRUDX;IIII[B)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) Class31[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 9, arg9);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method512();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method512();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method498();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					if (local54 == arg2 && local50 >= arg8 && local50 < arg8 + 8 && local44 >= arg0 && local44 < arg0 + 8) {
						@Pc(87) Class42 local87 = Class42.method395(local9);
						@Pc(103) int local103 = arg6 + Class43.method403(local87.anInt692, arg5, local50 & 0x7, local44 & 0x7, local87.anInt697);
						@Pc(119) int local119 = arg7 + Class43.method404(local44 & 0x7, arg5, local87.anInt692, local87.anInt697, local50 & 0x7);
						if (local103 > 0 && local119 > 0 && local103 < 103 && local119 < 103) {
							@Pc(131) int local131 = arg3;
							if ((this.aByteArrayArrayArray6[1][local103][local119] & 0x2) == 2) {
								local131 = arg3 - 1;
							}
							@Pc(146) Class31 local146 = null;
							if (local131 >= 0) {
								local146 = arg1[local131];
							}
							this.method455(arg3, local65 + arg5 & 0x3, arg4, local146, local119, local9, local103, 555, local61);
						}
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("36270, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(IILclient!KALHRUDX;Lclient!OPAHDXQS;IIIII)V")
	private void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean165 && (this.aByteArrayArrayArray6[0][arg6][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg0][arg6][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method464(arg0, arg4, arg6) != anInt769) {
					return;
				}
			}
			if (arg0 < anInt761) {
				anInt761 = arg0;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg0][arg6][arg4];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg0][arg6 + 1][arg4];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg0][arg6 + 1][arg4 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg0][arg6][arg4 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class42 local97 = Class42.method395(arg5);
			@Pc(109) int local109 = arg6 + (arg4 << 7) + (arg5 << 14) + 1073741824;
			@Pc(113) boolean local113 = false;
			if (!local97.aBoolean137) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(127) byte local127 = (byte) ((arg1 << 6) + arg8);
			@Pc(156) Class1_Sub1_Sub1 local156;
			if (arg8 != 22) {
				@Pc(254) int local254;
				if (arg8 == 10 || arg8 == 11) {
					if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
						local156 = local97.method396(10, arg1, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, 10, local97.anInt695, arg5, local73, true, local84, anInt760);
					}
					if (local156 != null) {
						@Pc(241) int local241 = 0;
						if (arg8 == 11) {
							local241 += 256;
						}
						@Pc(257) int local257;
						if (arg1 == 1 || arg1 == 3) {
							local254 = local97.anInt692;
							local257 = local97.anInt697;
						} else {
							local254 = local97.anInt697;
							local257 = local97.anInt692;
						}
						if (arg2.method239(local257, local156, local254, local94, local241, arg6, local109, arg0, local127, arg4) && local97.aBoolean145) {
							@Pc(288) Class1_Sub1_Sub1_Sub3 local288;
							if (local156 instanceof Class1_Sub1_Sub1_Sub3) {
								local288 = (Class1_Sub1_Sub1_Sub3) local156;
							} else {
								local288 = local97.method396(10, arg1, local49, local60, local73, local84, -1);
							}
							if (local288 != null) {
								for (@Pc(304) int local304 = 0; local304 <= local254; local304++) {
									for (@Pc(308) int local308 = 0; local308 <= local257; local308++) {
										@Pc(315) int local315 = local288.anInt308 / 4;
										if (local315 > 30) {
											local315 = 30;
										}
										if (local315 > this.aByteArrayArrayArray7[arg0][arg6 + local304][arg4 + local308]) {
											this.aByteArrayArrayArray7[arg0][arg6 + local304][arg4 + local308] = (byte) local315;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean146 && arg3 != null) {
						arg3.method300(arg4, local97.aBoolean135, arg1, (byte) 8, local97.anInt692, local97.anInt697, arg6);
					}
				} else if (arg8 >= 12) {
					if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
						local156 = local97.method396(arg8, arg1, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, arg8, local97.anInt695, arg5, local73, true, local84, anInt760);
					}
					arg2.method239(1, local156, 1, local94, 0, arg6, local109, arg0, local127, arg4);
					if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x924;
					}
					if (local97.aBoolean146 && arg3 != null) {
						arg3.method300(arg4, local97.aBoolean135, arg1, (byte) 8, local97.anInt692, local97.anInt697, arg6);
					}
				} else if (arg8 == 0) {
					if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
						local156 = local97.method396(0, arg1, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, 0, local97.anInt695, arg5, local73, true, local84, anInt760);
					}
					arg2.method237(arg6, local94, local109, 0, local127, local156, anIntArray196[arg1], arg4, arg0, null);
					if (arg1 == 0) {
						if (local97.aBoolean145) {
							this.aByteArrayArrayArray7[arg0][arg6][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg6][arg4 + 1] = 50;
						}
						if (local97.aBoolean140) {
							this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local97.aBoolean145) {
							this.aByteArrayArrayArray7[arg0][arg6][arg4 + 1] = 50;
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean140) {
							this.anIntArrayArrayArray6[arg0][arg6][arg4 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local97.aBoolean145) {
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean140) {
							this.anIntArrayArrayArray6[arg0][arg6 + 1][arg4] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local97.aBoolean145) {
							this.aByteArrayArrayArray7[arg0][arg6][arg4] = 50;
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4] = 50;
						}
						if (local97.aBoolean140) {
							this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x492;
						}
					}
					if (local97.aBoolean146 && arg3 != null) {
						arg3.method299(arg1, local97.aBoolean135, arg6, arg4, arg8);
					}
					if (local97.anInt708 != 16) {
						arg2.method245(local97.anInt708, arg4, arg6, arg0);
					}
				} else if (arg8 == 1) {
					if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
						local156 = local97.method396(1, arg1, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, 1, local97.anInt695, arg5, local73, true, local84, anInt760);
					}
					arg2.method237(arg6, local94, local109, 0, local127, local156, anIntArray198[arg1], arg4, arg0, null);
					if (local97.aBoolean145) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray7[arg0][arg6][arg4 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray7[arg0][arg6][arg4] = 50;
						}
					}
					if (local97.aBoolean146 && arg3 != null) {
						arg3.method299(arg1, local97.aBoolean135, arg6, arg4, arg8);
					}
				} else {
					@Pc(865) int local865;
					@Pc(894) Class1_Sub1_Sub1 local894;
					if (arg8 == 2) {
						local865 = arg1 + 1 & 0x3;
						@Pc(884) Class1_Sub1_Sub1 local884;
						if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
							local884 = local97.method396(2, arg1 + 4, local49, local60, local73, local84, -1);
							local894 = local97.method396(2, local865, local49, local60, local73, local84, -1);
						} else {
							local884 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1 + 4, 2, local97.anInt695, arg5, local73, true, local84, anInt760);
							local894 = new Class1_Sub1_Sub1_Sub1(local49, local60, local865, 2, local97.anInt695, arg5, local73, true, local84, anInt760);
						}
						arg2.method237(arg6, local94, local109, anIntArray196[local865], local127, local884, anIntArray196[arg1], arg4, arg0, local894);
						if (local97.aBoolean140) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x249;
								this.anIntArrayArrayArray6[arg0][arg6][arg4 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray6[arg0][arg6][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg0][arg6 + 1][arg4] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray6[arg0][arg6 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x492;
								this.anIntArrayArrayArray6[arg0][arg6][arg4] |= 0x249;
							}
						}
						if (local97.aBoolean146 && arg3 != null) {
							arg3.method299(arg1, local97.aBoolean135, arg6, arg4, arg8);
						}
						if (local97.anInt708 != 16) {
							arg2.method245(local97.anInt708, arg4, arg6, arg0);
						}
					} else if (arg8 == 3) {
						if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
							local156 = local97.method396(3, arg1, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, 3, local97.anInt695, arg5, local73, true, local84, anInt760);
						}
						arg2.method237(arg6, local94, local109, 0, local127, local156, anIntArray198[arg1], arg4, arg0, null);
						if (local97.aBoolean145) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray7[arg0][arg6][arg4 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray7[arg0][arg6 + 1][arg4] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray7[arg0][arg6][arg4] = 50;
							}
						}
						if (local97.aBoolean146 && arg3 != null) {
							arg3.method299(arg1, local97.aBoolean135, arg6, arg4, arg8);
						}
					} else if (arg8 == 9) {
						if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
							local156 = local97.method396(arg8, arg1, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, arg8, local97.anInt695, arg5, local73, true, local84, anInt760);
						}
						arg2.method239(1, local156, 1, local94, 0, arg6, local109, arg0, local127, arg4);
						if (local97.aBoolean146 && arg3 != null) {
							arg3.method300(arg4, local97.aBoolean135, arg1, (byte) 8, local97.anInt692, local97.anInt697, arg6);
						}
					} else {
						if (local97.aBoolean142) {
							if (arg1 == 1) {
								local865 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local865;
							} else if (arg1 == 2) {
								local865 = local84;
								local84 = local60;
								local60 = local865;
								local865 = local73;
								local73 = local49;
								local49 = local865;
							} else if (arg1 == 3) {
								local865 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local865;
							}
						}
						if (arg8 == 4) {
							if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
								local156 = local97.method396(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, 0, 4, local97.anInt695, arg5, local73, true, local84, anInt760);
							}
							arg2.method238(0, local127, arg6, local94, arg4, arg1 * 512, local156, local109, arg0, anIntArray196[arg1], 0);
						} else if (arg8 == 5) {
							local865 = 16;
							local254 = arg2.method255(arg0, arg6, arg4);
							if (local254 > 0) {
								local865 = Class42.method395(local254 >> 14 & 0x7FFF).anInt708;
							}
							if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
								local894 = local97.method396(4, 0, local49, local60, local73, local84, -1);
							} else {
								local894 = new Class1_Sub1_Sub1_Sub1(local49, local60, 0, 4, local97.anInt695, arg5, local73, true, local84, anInt760);
							}
							arg2.method238(anIntArray197[arg1] * local865, local127, arg6, local94, arg4, arg1 * 512, local894, local109, arg0, anIntArray196[arg1], anIntArray195[arg1] * local865);
						} else if (arg8 == 6) {
							if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
								local156 = local97.method396(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, 0, 4, local97.anInt695, arg5, local73, true, local84, anInt760);
							}
							arg2.method238(0, local127, arg6, local94, arg4, arg1, local156, local109, arg0, 256, 0);
						} else if (arg8 == 7) {
							if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
								local156 = local97.method396(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, 0, 4, local97.anInt695, arg5, local73, true, local84, anInt760);
							}
							arg2.method238(0, local127, arg6, local94, arg4, arg1, local156, local109, arg0, 512, 0);
						} else if (arg8 == 8) {
							if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
								local156 = local97.method396(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, 0, 4, local97.anInt695, arg5, local73, true, local84, anInt760);
							}
							arg2.method238(0, local127, arg6, local94, arg4, arg1, local156, local109, arg0, 768, 0);
						}
					}
				}
			} else if (!aBoolean165 || local97.aBoolean137 || local97.aBoolean144) {
				if (local97.anInt695 == -1 && local97.anIntArray178 == null) {
					local156 = local97.method396(22, arg1, local49, local60, local73, local84, -1);
				} else {
					local156 = new Class1_Sub1_Sub1_Sub1(local49, local60, arg1, 22, local97.anInt695, arg5, local73, true, local84, anInt760);
				}
				arg2.method235(local127, local109, arg4, local156, arg0, arg6, local94);
				if (local97.aBoolean146 && local97.aBoolean137 && arg3 != null) {
					arg3.method301(arg6, arg4);
				}
			}
		} catch (@Pc(1639) RuntimeException local1639) {
			signlink.reporterror("53373, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1639.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "([Lclient!OPAHDXQS;ILclient!KALHRUDX;[BII)V")
	public void method456(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 9, arg3);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method512();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method512();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method498();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg4;
					@Pc(68) int local68 = local39 + arg1;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray6[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class31 local95 = null;
						if (local80 >= 0) {
							local95 = arg0[local80];
						}
						this.method455(local49, local60, arg2, local95, local68, local9, local64, 555, local56);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("73741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(IIIII)V")
	public void method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(6) int local6 = arg2; local6 <= arg2 + arg0; local6++) {
				for (@Pc(10) int local10 = arg3; local10 <= arg3 + arg1; local10++) {
					if (local10 >= 0 && local10 < this.anInt762 && local6 >= 0 && local6 < this.anInt763) {
						this.aByteArrayArrayArray7[0][local10][local6] = 127;
						if (local10 == arg3 && local10 > 0) {
							this.anIntArrayArrayArray5[0][local10][local6] = this.anIntArrayArrayArray5[0][local10 - 1][local6];
						}
						if (local10 == arg3 + arg1 && local10 < this.anInt762 - 1) {
							this.anIntArrayArrayArray5[0][local10][local6] = this.anIntArrayArrayArray5[0][local10 + 1][local6];
						}
						if (local6 == arg2 && local6 > 0) {
							this.anIntArrayArrayArray5[0][local10][local6] = this.anIntArrayArrayArray5[0][local10][local6 - 1];
						}
						if (local6 == arg2 + arg0 && local6 < this.anInt763 - 1) {
							this.anIntArrayArrayArray5[0][local10][local6] = this.anIntArrayArrayArray5[0][local10][local6 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("31701, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "b", descriptor = "(IIII)I")
	private int method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray6[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("89080, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 489 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "([Lclient!OPAHDXQS;[BIIIIIIII)V")
	public void method465(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
					if (arg3 + local11 > 0 && arg3 + local11 < 103 && arg8 + local15 > 0 && arg8 + local15 < 103) {
						arg0[arg7].anIntArrayArray14[arg3 + local11][arg8 + local15] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3((byte) 9, arg1);
			for (@Pc(67) int local67 = 0; local67 < 4; local67++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						if (local67 == arg2 && local71 >= arg6 && local71 < arg6 + 8 && local75 >= arg5 && local75 < arg5 + 8) {
							this.method467(arg4, 0, local65, arg7, arg3 + Class43.method401(local71 & 0x7, arg4, local75 & 0x7), 0, arg8 + Class43.method402(local71 & 0x7, arg4, local75 & 0x7));
						} else {
							this.method467(0, 0, local65, 0, -1, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("55661, " + arg0 + ", " + arg1 + ", " + 129 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "d", descriptor = "(II)I")
	private int method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(IZILclient!XJCNBMKS;IIII)V")
	private void method467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(26) int local26;
			if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
				this.aByteArrayArrayArray6[arg3][arg4][arg6] = 0;
				while (true) {
					local26 = arg2.method498();
					if (local26 == 0) {
						if (arg3 == 0) {
							this.anIntArrayArrayArray5[0][arg4][arg6] = -method463(arg4 + arg5 + 932731, arg6 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg3][arg4][arg6] = this.anIntArrayArrayArray5[arg3 - 1][arg4][arg6] - 240;
							return;
						}
					}
					if (local26 == 1) {
						@Pc(80) int local80 = arg2.method498();
						if (local80 == 1) {
							local80 = 0;
						}
						if (arg3 == 0) {
							this.anIntArrayArrayArray5[0][arg4][arg6] = -local80 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg3][arg4][arg6] = this.anIntArrayArrayArray5[arg3 - 1][arg4][arg6] - local80 * 8;
						return;
					}
					if (local26 <= 49) {
						this.aByteArrayArrayArray3[arg3][arg4][arg6] = arg2.method499();
						this.aByteArrayArrayArray5[arg3][arg4][arg6] = (byte) ((local26 - 2) / 4);
						this.aByteArrayArrayArray4[arg3][arg4][arg6] = (byte) (local26 + arg0 - 2 & 0x3);
					} else if (local26 <= 81) {
						this.aByteArrayArrayArray6[arg3][arg4][arg6] = (byte) (local26 - 49);
					} else {
						this.aByteArrayArrayArray2[arg3][arg4][arg6] = (byte) (local26 - 81);
					}
				}
			} else {
				while (true) {
					local26 = arg2.method498();
					if (local26 == 0) {
						return;
					}
					if (local26 == 1) {
						arg2.method498();
						return;
					}
					if (local26 <= 49) {
						arg2.method498();
					}
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("70695, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "b", descriptor = "(III)I")
	private int method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(IIBI[Lclient!OPAHDXQS;[BI)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg2 + local7 > 0 && arg2 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg3[local3].anIntArrayArray14[arg2 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3((byte) 9, arg4);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
					for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
						this.method467(0, arg0, local65, local11, local75 + arg2, arg5, local79 + arg1);
					}
				}
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("310, " + arg0 + ", " + arg1 + ", " + 57 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZSUQFDN", name = "a", descriptor = "(Lclient!KALHRUDX;[Lclient!OPAHDXQS;I)V")
	public void method473(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class31[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray6[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method301(local7, local11);
							}
						}
					}
				}
			}
			anInt766 += (int) (Math.random() * 5.0D) - 2;
			if (anInt766 < -8) {
				anInt766 = -8;
			}
			if (anInt766 > 8) {
				anInt766 = 8;
			}
			anInt764 += (int) (Math.random() * 5.0D) - 2;
			if (anInt764 < -16) {
				anInt764 = -16;
			}
			if (anInt764 > 16) {
				anInt764 = 16;
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
				for (local141 = 1; local141 < this.anInt763 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt762 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray21[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt763; local145++) {
					this.anIntArray190[local145] = 0;
					this.anIntArray191[local145] = 0;
					this.anIntArray192[local145] = 0;
					this.anIntArray193[local145] = 0;
					this.anIntArray194[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt762 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt763; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt762) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class24 local378 = Class24.aClass24Array1[local210 - 1];
								this.anIntArray190[local191] += local378.anInt446;
								this.anIntArray191[local191] += local378.anInt444;
								this.anIntArray192[local191] += local378.anInt445;
								this.anIntArray193[local191] += local378.anInt447;
								local419 = this.anIntArray194[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt762) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class24 local451 = Class24.aClass24Array1[local214 - 1];
								this.anIntArray190[local191] -= local451.anInt446;
								this.anIntArray191[local191] -= local451.anInt444;
								this.anIntArray192[local191] -= local451.anInt445;
								this.anIntArray193[local191] -= local451.anInt447;
								local419 = this.anIntArray194[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt762 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt763 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt763) {
								local204 += this.anIntArray190[local527];
								local210 += this.anIntArray191[local527];
								local214 += this.anIntArray192[local527];
								local220 += this.anIntArray193[local527];
								local236 += this.anIntArray194[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt763) {
								local204 -= this.anIntArray190[local572];
								local210 -= this.anIntArray191[local572];
								local214 -= this.anIntArray192[local572];
								local220 -= this.anIntArray193[local572];
								local236 -= this.anIntArray194[local572];
							}
							if (local284 >= 1 && local284 < this.anInt763 - 1 && (!aBoolean165 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method464(local7, local284, local169) == anInt769)) {
								if (local7 < anInt761) {
									anInt761 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray21[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray21[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray21[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray21[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method469(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt766 & 0xFF;
										local786 += anInt764;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method469(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class24.aClass24Array1[local682 - 1].aBoolean92) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class1_Sub1_Sub2_Sub2.anIntArray21[method457(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method234(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method457(local768, local737), method457(local768, local746), method457(local768, local757), method457(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class24 local941 = Class24.aClass24Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt442;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class1_Sub1_Sub2_Sub2.method86(local944);
											local952 = -1;
										} else if (local941.anInt441 == 16711935) {
											local950 = 0;
											local952 = -2;
											local944 = -1;
										} else {
											local952 = this.method469(local941.anInt443, local941.anInt444, local941.anInt445);
											local950 = Class1_Sub1_Sub2_Sub2.anIntArray21[this.method466(local941.anInt448, 96)];
										}
										arg0.method234(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method457(local768, local737), method457(local768, local746), method457(local768, local757), method457(local768, local766), this.method466(local952, local737), this.method466(local952, local746), this.method466(local952, local757), this.method466(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt763 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt762 - 1; local204++) {
						arg0.method233(local7, local204, local191, this.method464(local7, local191, local204));
					}
				}
			}
			arg0.method260();
			for (local11 = 0; local11 < this.anInt762; local11++) {
				for (local27 = 0; local27 < this.anInt763; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg0.method231((byte) 2, local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1133) int local1133 = 2;
			@Pc(1135) int local1135 = 4;
			for (@Pc(1137) int local1137 = 0; local1137 < 4; local1137++) {
				if (local1137 > 0) {
					local27 <<= 0x3;
					local1133 <<= 0x3;
					local1135 <<= 0x3;
				}
				for (@Pc(1155) int local1155 = 0; local1155 <= local1137; local1155++) {
					for (local133 = 0; local133 <= this.anInt763; local133++) {
						for (local139 = 0; local139 <= this.anInt762; local139++) {
							if ((this.anIntArrayArrayArray6[local1155][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1155][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt763 && (this.anIntArrayArrayArray6[local1155][local139][local145 + 1] & local27) != 0) {
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
								label317: while (local191 < local1137) {
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
									Class21.method232(local139 * 128, local214, 1, local141 * 128, local139 * 128, local145 * 128 + 128, local1137, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1155][local139][local133] & local1133) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1155][local141 - 1][local133] & local1133) != 0) {
									local141--;
								}
								while (local145 < this.anInt762 && (this.anIntArrayArrayArray6[local1155][local145 + 1][local133] & local1133) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1133) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1137) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1133) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class21.method232(local141 * 128, local214, 2, local133 * 128, local145 * 128 + 128, local133 * 128, local1137, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1133;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1155][local139][local133] & local1135) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1155][local139][local169 - 1] & local1135) != 0) {
									local169--;
								}
								while (local191 < this.anInt763 && (this.anIntArrayArrayArray6[local1155][local139][local191 + 1] & local1135) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1155][local141 - 1][local204] & local1135) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt762) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1155][local145 + 1][local204] & local1135) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1155][local141][local169];
									Class21.method232(local141 * 128, local204, 4, local169 * 128, local145 * 128 + 128, local191 * 128 + 128, local1137, local204);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1155][local210][local214] &= ~local1135;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1770) RuntimeException local1770) {
			signlink.reporterror("25913, " + arg0 + ", " + arg1 + ", " + 732 + ", " + local1770.toString());
			throw new RuntimeException();
		}
	}
}
