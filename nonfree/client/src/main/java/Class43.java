import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WYBZGYVK")
public final class Class43 {

	@OriginalMember(owner = "client!WYBZGYVK", name = "i", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "[I")
	private static final int[] anIntArray176 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!WYBZGYVK", name = "j", descriptor = "I")
	private static int anInt771 = 504;

	@OriginalMember(owner = "client!WYBZGYVK", name = "k", descriptor = "Z")
	public static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!WYBZGYVK", name = "l", descriptor = "[I")
	private static final int[] anIntArray182 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!WYBZGYVK", name = "m", descriptor = "I")
	private static int anInt772 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!WYBZGYVK", name = "n", descriptor = "[I")
	private static final int[] anIntArray183 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!WYBZGYVK", name = "r", descriptor = "I")
	private static int anInt773 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!WYBZGYVK", name = "w", descriptor = "[I")
	private static final int[] anIntArray184 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!WYBZGYVK", name = "B", descriptor = "B")
	private static byte aByte35 = 7;

	@OriginalMember(owner = "client!WYBZGYVK", name = "b", descriptor = "B")
	private byte aByte34 = 57;

	@OriginalMember(owner = "client!WYBZGYVK", name = "q", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!WYBZGYVK", name = "x", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!WYBZGYVK", name = "y", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!WYBZGYVK", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!WYBZGYVK", name = "u", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!WYBZGYVK", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!WYBZGYVK", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!WYBZGYVK", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!WYBZGYVK", name = "v", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!WYBZGYVK", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!WYBZGYVK", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!WYBZGYVK", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!WYBZGYVK", name = "d", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!WYBZGYVK", name = "e", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!WYBZGYVK", name = "f", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!WYBZGYVK", name = "g", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!WYBZGYVK", name = "h", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(II)I")
	private static int method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method538(arg0 + 45365, arg1 + 91923, 4) + (method538(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method538(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "b", descriptor = "(II)I")
	private static int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "c", descriptor = "(II)I")
	private static int method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method532(arg0 - 1, arg1 - 1) + method532(arg0 + 1, arg1 - 1) + method532(arg0 - 1, arg1 + 1) + method532(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method532(arg0 - 1, arg1) + method532(arg0 + 1, arg1) + method532(arg0, arg1 - 1) + method532(arg0, arg1 + 1);
		@Pc(59) int local59 = method532(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(Lclient!LNOSHUMO;ILclient!GLMIQHJI;)V")
	public static void method536(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			@Pc(5) int local5 = 98 / arg1;
			@Pc(7) int local7 = -1;
			while (true) {
				@Pc(10) int local10 = arg2.method179();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				@Pc(19) Class33 local19 = Class33.method443(local7);
				local19.method435(arg0, aByte35);
				while (true) {
					@Pc(26) int local26 = arg2.method179();
					if (local26 == 0) {
						break;
					}
					arg2.method165();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("76458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "b", descriptor = "(III)I")
	private static int method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method534(local3, local13);
		@Pc(29) int local29 = method534(local3 + 1, local13);
		@Pc(35) int local35 = method534(local3, local13 + 1);
		@Pc(43) int local43 = method534(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method544(local23, local29, local9, arg2);
		@Pc(55) int local55 = method544(local35, local43, local9, arg2);
		return method544(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(II[[[IIILclient!QLFNWQSF;IIILclient!EMCOJCFH;I)V")
	public static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class32 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class11 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg2[arg5][arg6][arg9];
			@Pc(19) int local19 = arg2[arg5][arg6 + 1][arg9];
			@Pc(31) int local31 = arg2[arg5][arg6 + 1][arg9 + 1];
			@Pc(41) int local41 = arg2[arg5][arg6][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class33 local58 = Class33.method443(arg3);
			@Pc(70) int local70 = arg6 + (arg9 << 7) + (arg3 << 14) + 1073741824;
			if (!local58.aBoolean132) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg7);
			@Pc(104) Class8_Sub1_Sub2 local104;
			if (arg7 == 22) {
				if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
					local104 = local58.method433(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class8_Sub1_Sub2_Sub6(22, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
				}
				arg4.method388(arg6, local51, local84, local70, arg9, local104, arg1);
				if (local58.aBoolean137 && local58.aBoolean132) {
					arg8.method120(arg9, arg6);
				}
			} else {
				@Pc(200) int local200;
				if (arg7 == 10 || arg7 == 11) {
					if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
						local104 = local58.method433(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class8_Sub1_Sub2_Sub6(10, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg7 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg0 == 1 || arg0 == 3) {
							local200 = local58.anInt638;
							local203 = local58.anInt647;
						} else {
							local200 = local58.anInt647;
							local203 = local58.anInt638;
						}
						arg4.method392(local200, arg1, local187, local51, local84, local203, local70, arg6, arg9, local104);
					}
					if (local58.aBoolean137) {
						arg8.method119(local58.anInt638, local58.anInt647, arg9, local58.aBoolean139, arg0, arg6);
					}
				} else if (arg7 >= 12) {
					if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
						local104 = local58.method433(arg7, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class8_Sub1_Sub2_Sub6(arg7, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
					}
					arg4.method392(1, arg1, 0, local51, local84, 1, local70, arg6, arg9, local104);
					if (local58.aBoolean137) {
						arg8.method119(local58.anInt638, local58.anInt647, arg9, local58.aBoolean139, arg0, arg6);
					}
				} else if (arg7 == 0) {
					if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
						local104 = local58.method433(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class8_Sub1_Sub2_Sub6(0, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
					}
					arg4.method390(local84, 0, local70, arg1, null, local104, arg9, arg6, local51, anIntArray182[arg0]);
					if (local58.aBoolean137) {
						arg8.method118(arg7, arg9, arg6, local58.aBoolean139, arg0, 545);
					}
				} else if (arg7 == 1) {
					if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
						local104 = local58.method433(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class8_Sub1_Sub2_Sub6(1, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
					}
					arg4.method390(local84, 0, local70, arg1, null, local104, arg9, arg6, local51, anIntArray176[arg0]);
					if (local58.aBoolean137) {
						arg8.method118(arg7, arg9, arg6, local58.aBoolean139, arg0, 545);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class8_Sub1_Sub2 local475;
					if (arg7 == 2) {
						local446 = arg0 + 1 & 0x3;
						@Pc(465) Class8_Sub1_Sub2 local465;
						if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
							local465 = local58.method433(2, arg0 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method433(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class8_Sub1_Sub2_Sub6(2, local19, local9, local31, 154, true, local58.anInt628, arg0 + 4, local41, arg3);
							local475 = new Class8_Sub1_Sub2_Sub6(2, local19, local9, local31, 154, true, local58.anInt628, local446, local41, arg3);
						}
						arg4.method390(local84, anIntArray182[local446], local70, arg1, local475, local465, arg9, arg6, local51, anIntArray182[arg0]);
						if (local58.aBoolean137) {
							arg8.method118(arg7, arg9, arg6, local58.aBoolean139, arg0, 545);
						}
					} else if (arg7 == 3) {
						if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
							local104 = local58.method433(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class8_Sub1_Sub2_Sub6(3, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
						}
						arg4.method390(local84, 0, local70, arg1, null, local104, arg9, arg6, local51, anIntArray176[arg0]);
						if (local58.aBoolean137) {
							arg8.method118(arg7, arg9, arg6, local58.aBoolean139, arg0, 545);
						}
					} else if (arg7 == 9) {
						if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
							local104 = local58.method433(arg7, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class8_Sub1_Sub2_Sub6(arg7, local19, local9, local31, 154, true, local58.anInt628, arg0, local41, arg3);
						}
						arg4.method392(1, arg1, 0, local51, local84, 1, local70, arg6, arg9, local104);
						if (local58.aBoolean137) {
							arg8.method119(local58.anInt638, local58.anInt647, arg9, local58.aBoolean139, arg0, arg6);
						}
					} else {
						if (local58.aBoolean144) {
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
						if (arg7 == 4) {
							if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
								local104 = local58.method433(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class8_Sub1_Sub2_Sub6(4, local19, local9, local31, 154, true, local58.anInt628, 0, local41, arg3);
							}
							arg4.method391(local51, arg6, anIntArray182[arg0], local84, local104, local70, arg1, arg0 * 512, arg9, 0, 0);
						} else if (arg7 == 5) {
							local446 = 16;
							local200 = arg4.method408(arg1, arg6, arg9);
							if (local200 > 0) {
								local446 = Class33.method443(local200 >> 14 & 0x7FFF).anInt639;
							}
							if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
								local475 = local58.method433(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class8_Sub1_Sub2_Sub6(4, local19, local9, local31, 154, true, local58.anInt628, 0, local41, arg3);
							}
							arg4.method391(local51, arg6, anIntArray182[arg0], local84, local475, local70, arg1, arg0 * 512, arg9, anIntArray183[arg0] * local446, anIntArray184[arg0] * local446);
						} else if (arg7 == 6) {
							if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
								local104 = local58.method433(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class8_Sub1_Sub2_Sub6(4, local19, local9, local31, 154, true, local58.anInt628, 0, local41, arg3);
							}
							arg4.method391(local51, arg6, 256, local84, local104, local70, arg1, arg0, arg9, 0, 0);
						} else if (arg7 == 7) {
							if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
								local104 = local58.method433(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class8_Sub1_Sub2_Sub6(4, local19, local9, local31, 154, true, local58.anInt628, 0, local41, arg3);
							}
							arg4.method391(local51, arg6, 512, local84, local104, local70, arg1, arg0, arg9, 0, 0);
						} else if (arg7 == 8) {
							if (local58.anInt628 == -1 && local58.anIntArray97 == null) {
								local104 = local58.method433(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class8_Sub1_Sub2_Sub6(4, local19, local9, local31, 154, true, local58.anInt628, 0, local41, arg3);
							}
							arg4.method391(local51, arg6, 768, local84, local104, local70, arg1, arg0, arg9, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("35749, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "e", descriptor = "(II)I")
	private static int method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!WYBZGYVK", name = "b", descriptor = "(IIII)I")
	private static int method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class8_Sub1_Sub1_Sub1.anIntArray24[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "([BIBI)Z")
	public static boolean method546(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(16) Class8_Sub1_Sub3 local16 = new Class8_Sub1_Sub3(arg0, -49015);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local16.method179();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local16.method179();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local16.method165() >> 2;
						@Pc(73) int local73 = local64 + arg1;
						@Pc(77) int local77 = local58 + arg2;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class33 local90 = Class33.method443(local18);
							if (local69 != 22 || !aBoolean175 || local90.aBoolean132 || local90.aBoolean143) {
								local3 &= local90.method436();
								local31 = true;
							}
						}
					}
					local36 = local16.method179();
					if (local36 == 0) {
						break;
					}
					local16.method165();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("69808, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IBI)Z")
	public static boolean method548(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class33 local2 = Class33.method443(arg0);
			if (arg1 != -13) {
				throw new NullPointerException();
			}
			if (arg2 == 11) {
				arg2 = 10;
			}
			if (arg2 >= 5 && arg2 <= 8) {
				arg2 = 4;
			}
			return local2.method441(arg2);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("28316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "<init>", descriptor = "(I[[[III[[[B)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			this.anInt774 = arg3;
			this.anInt775 = arg2;
			this.anIntArrayArrayArray5 = arg1;
			this.aByteArrayArrayArray4 = arg4;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt774][this.anInt775];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt774][this.anInt775];
			@Pc(39) int local39 = 45 / arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt774][this.anInt775];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt774][this.anInt775];
			this.anIntArrayArrayArray6 = new int[4][this.anInt774 + 1][this.anInt775 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt774 + 1][this.anInt775 + 1];
			this.anIntArrayArray19 = new int[this.anInt774 + 1][this.anInt775 + 1];
			this.anIntArray177 = new int[this.anInt775];
			this.anIntArray178 = new int[this.anInt775];
			this.anIntArray179 = new int[this.anInt775];
			this.anIntArray180 = new int[this.anInt775];
			this.anIntArray181 = new int[this.anInt775];
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("55443, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(III)I")
	private int method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "([Lclient!EMCOJCFH;Lclient!QLFNWQSF;I)V")
	public void method530(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) Class32 arg1) {
		try {
			@Pc(11) int local11;
			@Pc(15) int local15;
			@Pc(31) int local31;
			for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					for (local15 = 0; local15 < 104; local15++) {
						if ((this.aByteArrayArrayArray4[local7][local11][local15] & 0x1) == 1) {
							local31 = local7;
							if ((this.aByteArrayArrayArray4[1][local11][local15] & 0x2) == 2) {
								local31 = local7 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method120(local15, local11);
							}
						}
					}
				}
			}
			anInt772 += (int) (Math.random() * 5.0D) - 2;
			if (anInt772 < -8) {
				anInt772 = -8;
			}
			if (anInt772 > 8) {
				anInt772 = 8;
			}
			anInt773 += (int) (Math.random() * 5.0D) - 2;
			if (anInt773 < -16) {
				anInt773 = -16;
			}
			if (anInt773 > 16) {
				anInt773 = 16;
			}
			@Pc(137) int local137;
			@Pc(143) int local143;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(173) int local173;
			@Pc(195) int local195;
			@Pc(208) int local208;
			@Pc(214) int local214;
			@Pc(218) int local218;
			@Pc(224) int local224;
			@Pc(240) int local240;
			@Pc(288) int local288;
			for (local11 = 0; local11 < 4; local11++) {
				@Pc(112) byte[][] local112 = this.aByteArrayArrayArray3[local11];
				local137 = (int) Math.sqrt((double) 5100);
				local143 = local137 * 768 >> 8;
				for (local145 = 1; local145 < this.anInt775 - 1; local145++) {
					for (local149 = 1; local149 < this.anInt774 - 1; local149++) {
						local173 = this.anIntArrayArrayArray5[local11][local149 + 1][local145] - this.anIntArrayArrayArray5[local11][local149 - 1][local145];
						local195 = this.anIntArrayArrayArray5[local11][local149][local145 + 1] - this.anIntArrayArrayArray5[local11][local149][local145 - 1];
						local208 = (int) Math.sqrt((double) (local173 * local173 + local195 * local195 + 65536));
						local214 = (local173 << 8) / local208;
						local218 = 65536 / local208;
						local224 = (local195 << 8) / local208;
						local240 = (local214 * -50 + local218 * -10 + local224 * -50) / local143 + 96;
						local288 = (local112[local149 - 1][local145] >> 2) + (local112[local149 + 1][local145] >> 3) + (local112[local149][local145 - 1] >> 2) + (local112[local149][local145 + 1] >> 3) + (local112[local149][local145] >> 1);
						this.anIntArrayArray19[local149][local145] = local240 - local288;
					}
				}
				for (local149 = 0; local149 < this.anInt775; local149++) {
					this.anIntArray177[local149] = 0;
					this.anIntArray178[local149] = 0;
					this.anIntArray179[local149] = 0;
					this.anIntArray180[local149] = 0;
					this.anIntArray181[local149] = 0;
				}
				for (local173 = -5; local173 < this.anInt774 + 5; local173++) {
					for (local195 = 0; local195 < this.anInt775; local195++) {
						local208 = local173 + 5;
						@Pc(423) int local423;
						if (local208 >= 0 && local208 < this.anInt774) {
							local214 = this.aByteArrayArrayArray6[local11][local208][local195] & 0xFF;
							if (local214 > 0) {
								@Pc(382) Class28 local382 = Class28.aClass28Array1[local214 - 1];
								this.anIntArray177[local195] += local382.anInt409;
								this.anIntArray178[local195] += local382.anInt407;
								this.anIntArray179[local195] += local382.anInt408;
								this.anIntArray180[local195] += local382.anInt410;
								local423 = this.anIntArray181[local195]++;
							}
						}
						local214 = local173 - 5;
						if (local214 >= 0 && local214 < this.anInt774) {
							local218 = this.aByteArrayArrayArray6[local11][local214][local195] & 0xFF;
							if (local218 > 0) {
								@Pc(455) Class28 local455 = Class28.aClass28Array1[local218 - 1];
								this.anIntArray177[local195] -= local455.anInt409;
								this.anIntArray178[local195] -= local455.anInt407;
								this.anIntArray179[local195] -= local455.anInt408;
								this.anIntArray180[local195] -= local455.anInt410;
								local423 = this.anIntArray181[local195]--;
							}
						}
					}
					if (local173 >= 1 && local173 < this.anInt774 - 1) {
						local208 = 0;
						local214 = 0;
						local218 = 0;
						local224 = 0;
						local240 = 0;
						for (local288 = -5; local288 < this.anInt775 + 5; local288++) {
							@Pc(531) int local531 = local288 + 5;
							if (local531 >= 0 && local531 < this.anInt775) {
								local208 += this.anIntArray177[local531];
								local214 += this.anIntArray178[local531];
								local218 += this.anIntArray179[local531];
								local224 += this.anIntArray180[local531];
								local240 += this.anIntArray181[local531];
							}
							@Pc(576) int local576 = local288 - 5;
							if (local576 >= 0 && local576 < this.anInt775) {
								local208 -= this.anIntArray177[local576];
								local214 -= this.anIntArray178[local576];
								local218 -= this.anIntArray179[local576];
								local224 -= this.anIntArray180[local576];
								local240 -= this.anIntArray181[local576];
							}
							if (local288 >= 1 && local288 < this.anInt775 - 1 && (!aBoolean175 || (this.aByteArrayArrayArray4[local11][local173][local288] & 0x10) == 0 && this.method541(local11, local173, local288) == anInt770)) {
								@Pc(659) int local659 = this.aByteArrayArrayArray6[local11][local173][local288] & 0xFF;
								@Pc(670) int local670 = this.aByteArrayArrayArray7[local11][local173][local288] & 0xFF;
								if (local659 > 0 || local670 > 0) {
									@Pc(683) int local683 = this.anIntArrayArrayArray5[local11][local173][local288];
									@Pc(694) int local694 = this.anIntArrayArrayArray5[local11][local173 + 1][local288];
									@Pc(707) int local707 = this.anIntArrayArrayArray5[local11][local173 + 1][local288 + 1];
									@Pc(718) int local718 = this.anIntArrayArrayArray5[local11][local173][local288 + 1];
									@Pc(725) int local725 = this.anIntArrayArray19[local173][local288];
									@Pc(734) int local734 = this.anIntArrayArray19[local173 + 1][local288];
									@Pc(745) int local745 = this.anIntArrayArray19[local173 + 1][local288 + 1];
									@Pc(754) int local754 = this.anIntArrayArray19[local173][local288 + 1];
									@Pc(756) int local756 = -1;
									@Pc(758) int local758 = -1;
									@Pc(766) int local766;
									@Pc(770) int local770;
									if (local659 > 0) {
										local766 = local208 * 256 / local224;
										local770 = local214 / local240;
										@Pc(774) int local774 = local218 / local240;
										local756 = this.method528(local766, local770, local774);
										@Pc(786) int local786 = local766 + anInt772 & 0xFF;
										local774 += anInt773;
										if (local774 < 0) {
											local774 = 0;
										} else if (local774 > 255) {
											local774 = 255;
										}
										local758 = this.method528(local786, local770, local774);
									}
									if (local11 > 0) {
										@Pc(811) boolean local811 = true;
										if (local659 == 0 && this.aByteArrayArrayArray2[local11][local173][local288] != 0) {
											local811 = false;
										}
										if (local670 > 0 && !Class28.aClass28Array1[local670 - 1].aBoolean111) {
											local811 = false;
										}
										if (local811 && local683 == local694 && local683 == local707 && local683 == local718) {
											this.anIntArrayArrayArray6[local11][local173][local288] |= 0x924;
										}
									}
									local766 = 0;
									if (local756 != -1) {
										local766 = Class8_Sub1_Sub1_Sub1.anIntArray28[method542(local758, 96)];
									}
									if (local670 == 0) {
										arg1.method387(local11, local173, local288, 0, 0, -1, local683, local694, local707, local718, method542(local756, local725), method542(local756, local734), method542(local756, local745), method542(local756, local754), 0, 0, 0, 0, local766, 0);
									} else {
										local770 = this.aByteArrayArrayArray2[local11][local173][local288] + 1;
										@Pc(923) byte local923 = this.aByteArrayArrayArray5[local11][local173][local288];
										@Pc(929) Class28 local929 = Class28.aClass28Array1[local670 - 1];
										@Pc(932) int local932 = local929.anInt405;
										@Pc(940) int local940;
										@Pc(938) int local938;
										if (local932 >= 0) {
											local938 = Class8_Sub1_Sub1_Sub1.method75(local932);
											local940 = -1;
										} else if (local929.anInt404 == 16711935) {
											local938 = 0;
											local940 = -2;
											local932 = -1;
										} else {
											local940 = this.method528(local929.anInt406, local929.anInt407, local929.anInt408);
											local938 = Class8_Sub1_Sub1_Sub1.anIntArray28[this.method535(local929.anInt411, 96)];
										}
										arg1.method387(local11, local173, local288, local770, local923, local932, local683, local694, local707, local718, method542(local756, local725), method542(local756, local734), method542(local756, local745), method542(local756, local754), this.method535(local940, local725), this.method535(local940, local734), this.method535(local940, local745), this.method535(local940, local754), local766, local938);
									}
								}
							}
						}
					}
				}
				for (local195 = 1; local195 < this.anInt775 - 1; local195++) {
					for (local208 = 1; local208 < this.anInt774 - 1; local208++) {
						arg1.method386(local11, local208, local195, this.method541(local11, local208, local195));
					}
				}
			}
			arg1.method413();
			for (local15 = 0; local15 < this.anInt774; local15++) {
				for (local31 = 0; local31 < this.anInt775; local31++) {
					if ((this.aByteArrayArrayArray4[1][local15][local31] & 0x2) == 2) {
						arg1.method384(local31, local15);
					}
				}
			}
			local31 = 1;
			@Pc(1111) int local1111 = 2;
			@Pc(1113) int local1113 = 4;
			for (@Pc(1115) int local1115 = 0; local1115 < 4; local1115++) {
				if (local1115 > 0) {
					local31 <<= 0x3;
					local1111 <<= 0x3;
					local1113 <<= 0x3;
				}
				for (@Pc(1133) int local1133 = 0; local1133 <= local1115; local1133++) {
					for (local137 = 0; local137 <= this.anInt775; local137++) {
						for (local143 = 0; local143 <= this.anInt774; local143++) {
							if ((this.anIntArrayArrayArray6[local1133][local143][local137] & local31) != 0) {
								local145 = local137;
								local149 = local137;
								local173 = local1133;
								local195 = local1133;
								while (local145 > 0 && (this.anIntArrayArrayArray6[local1133][local143][local145 - 1] & local31) != 0) {
									local145--;
								}
								while (local149 < this.anInt775 && (this.anIntArrayArrayArray6[local1133][local143][local149 + 1] & local31) != 0) {
									local149++;
								}
								label324: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local173 - 1][local143][local208] & local31) == 0) {
											break label324;
										}
									}
									local173--;
								}
								label313: while (local195 < local1115) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local195 + 1][local143][local208] & local31) == 0) {
											break label313;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray5[local195][local143][local145] - 240;
									local224 = this.anIntArrayArrayArray5[local173][local143][local145];
									Class32.method385(local143 * 128, local143 * 128, local1115, local149 * 128 + 128, local145 * 128, local218, this.aByte34, local224, 1);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray6[local240][local143][local288] &= ~local31;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1133][local143][local137] & local1111) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local1133;
								local195 = local1133;
								while (local145 > 0 && (this.anIntArrayArrayArray6[local1133][local145 - 1][local137] & local1111) != 0) {
									local145--;
								}
								while (local149 < this.anInt774 && (this.anIntArrayArrayArray6[local1133][local149 + 1][local137] & local1111) != 0) {
									local149++;
								}
								label377: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local173 - 1][local208][local137] & local1111) == 0) {
											break label377;
										}
									}
									local173--;
								}
								label366: while (local195 < local1115) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local195 + 1][local208][local137] & local1111) == 0) {
											break label366;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray5[local195][local145][local137] - 240;
									local224 = this.anIntArrayArrayArray5[local173][local145][local137];
									Class32.method385(local149 * 128 + 128, local145 * 128, local1115, local137 * 128, local137 * 128, local218, this.aByte34, local224, 2);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray6[local240][local288][local137] &= ~local1111;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1133][local143][local137] & local1113) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local137;
								local195 = local137;
								while (local173 > 0 && (this.anIntArrayArrayArray6[local1133][local143][local173 - 1] & local1113) != 0) {
									local173--;
								}
								while (local195 < this.anInt775 && (this.anIntArrayArrayArray6[local1133][local143][local195 + 1] & local1113) != 0) {
									local195++;
								}
								label430: while (local145 > 0) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray6[local1133][local145 - 1][local208] & local1113) == 0) {
											break label430;
										}
									}
									local145--;
								}
								label419: while (local149 < this.anInt774) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray6[local1133][local149 + 1][local208] & local1113) == 0) {
											break label419;
										}
									}
									local149++;
								}
								if ((local149 + 1 - local145) * (local195 + 1 - local173) >= 4) {
									local208 = this.anIntArrayArrayArray5[local1133][local145][local173];
									Class32.method385(local149 * 128 + 128, local145 * 128, local1115, local195 * 128 + 128, local173 * 128, local208, this.aByte34, local208, 4);
									for (local214 = local145; local214 <= local149; local214++) {
										for (local218 = local173; local218 <= local195; local218++) {
											this.anIntArrayArrayArray6[local1133][local214][local218] &= ~local1113;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1751) RuntimeException local1751) {
			signlink.reporterror("34016, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local1751.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIII[BIII[Lclient!EMCOJCFH;Lclient!QLFNWQSF;I)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class11[] arg8, @OriginalArg(9) Class32 arg9) {
		try {
			@Pc(18) Class8_Sub1_Sub3 local18 = new Class8_Sub1_Sub3(arg4, -49015);
			@Pc(20) int local20 = -1;
			while (true) {
				@Pc(23) int local23 = local18.method179();
				if (local23 == 0) {
					return;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local18.method179();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local18.method165();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					if (local56 == arg6 && local52 >= arg5 && local52 < arg5 + 8 && local46 >= arg7 && local46 < arg7 + 8) {
						@Pc(89) Class33 local89 = Class33.method443(local20);
						@Pc(105) int local105 = arg2 + Class17.method204(arg1, local89.anInt638, local46 & 0x7, local89.anInt647, local52 & 0x7);
						@Pc(121) int local121 = arg0 + Class17.method205(local52 & 0x7, local89.anInt638, local89.anInt647, local46 & 0x7, arg1);
						if (local105 > 0 && local121 > 0 && local105 < 103 && local121 < 103) {
							@Pc(133) int local133 = local56;
							if ((this.aByteArrayArrayArray4[1][local105][local121] & 0x2) == 2) {
								local133 = local56 - 1;
							}
							@Pc(148) Class11 local148 = null;
							if (local133 >= 0) {
								local148 = arg8[local133];
							}
							this.method540(local105, local56, local20, local121, 227, local63, local148, arg9, local67 + arg1 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("75256, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + -14 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(II[Lclient!EMCOJCFH;Lclient!QLFNWQSF;[BI)V")
	public void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11[] arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg4, -49015);
			@Pc(9) int local9 = -1;
			if (arg0 >= 1 && arg0 <= 1) {
				while (true) {
					@Pc(19) int local19 = local7.method179();
					if (local19 == 0) {
						return;
					}
					local9 += local19;
					@Pc(27) int local27 = 0;
					while (true) {
						@Pc(30) int local30 = local7.method179();
						if (local30 == 0) {
							break;
						}
						local27 += local30 - 1;
						@Pc(42) int local42 = local27 & 0x3F;
						@Pc(48) int local48 = local27 >> 6 & 0x3F;
						@Pc(52) int local52 = local27 >> 12;
						@Pc(55) int local55 = local7.method165();
						@Pc(59) int local59 = local55 >> 2;
						@Pc(63) int local63 = local55 & 0x3;
						@Pc(67) int local67 = local48 + arg1;
						@Pc(71) int local71 = local42 + arg5;
						if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
							@Pc(83) int local83 = local52;
							if ((this.aByteArrayArrayArray4[1][local67][local71] & 0x2) == 2) {
								local83 = local52 - 1;
							}
							@Pc(98) Class11 local98 = null;
							if (local83 >= 0) {
								local98 = arg2[local83];
							}
							this.method540(local67, local52, local9, local71, 227, local59, local98, arg3, local63);
						}
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("30507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "d", descriptor = "(II)I")
	private int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIZII)V")
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(13) int local13 = arg1; local13 <= arg1 + arg2; local13++) {
				for (@Pc(17) int local17 = arg3; local17 <= arg3 + arg0; local17++) {
					if (local17 >= 0 && local17 < this.anInt774 && local13 >= 0 && local13 < this.anInt775) {
						this.aByteArrayArrayArray3[0][local17][local13] = 127;
						if (local17 == arg3 && local17 > 0) {
							this.anIntArrayArrayArray5[0][local17][local13] = this.anIntArrayArrayArray5[0][local17 - 1][local13];
						}
						if (local17 == arg3 + arg0 && local17 < this.anInt774 - 1) {
							this.anIntArrayArrayArray5[0][local17][local13] = this.anIntArrayArrayArray5[0][local17 + 1][local13];
						}
						if (local13 == arg1 && local13 > 0) {
							this.anIntArrayArrayArray5[0][local17][local13] = this.anIntArrayArrayArray5[0][local17][local13 - 1];
						}
						if (local13 == arg1 + arg2 && local13 < this.anInt775 - 1) {
							this.anIntArrayArrayArray5[0][local17][local13] = this.anIntArrayArrayArray5[0][local17][local13 + 1];
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("7100, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIIIIILclient!EMCOJCFH;Lclient!QLFNWQSF;I)V")
	private void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11 arg6, @OriginalArg(7) Class32 arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean175) {
				if ((this.aByteArrayArrayArray4[arg1][arg0][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method541(arg1, arg0, arg3) != anInt770) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray5[arg1][arg0][arg3];
			@Pc(44) int local44 = this.anIntArrayArrayArray5[arg1][arg0 + 1][arg3];
			@Pc(57) int local57 = this.anIntArrayArrayArray5[arg1][arg0 + 1][arg3 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray5[arg1][arg0][arg3 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class33 local81 = Class33.method443(arg2);
			@Pc(93) int local93 = arg0 + (arg3 << 7) + (arg2 << 14) + 1073741824;
			@Pc(97) boolean local97 = false;
			if (!local81.aBoolean132) {
				local93 += Integer.MIN_VALUE;
			}
			@Pc(111) byte local111 = (byte) ((arg8 << 6) + arg5);
			@Pc(140) Class8_Sub1_Sub2 local140;
			if (arg5 != 22) {
				@Pc(238) int local238;
				if (arg5 == 10 || arg5 == 11) {
					if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
						local140 = local81.method433(10, arg8, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class8_Sub1_Sub2_Sub6(10, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
					}
					if (local140 != null) {
						@Pc(225) int local225 = 0;
						if (arg5 == 11) {
							local225 += 256;
						}
						@Pc(241) int local241;
						if (arg8 == 1 || arg8 == 3) {
							local238 = local81.anInt638;
							local241 = local81.anInt647;
						} else {
							local238 = local81.anInt647;
							local241 = local81.anInt638;
						}
						if (arg7.method392(local238, arg1, local225, local78, local111, local241, local93, arg0, arg3, local140) && local81.aBoolean142) {
							@Pc(272) Class8_Sub1_Sub2_Sub5 local272;
							if (local140 instanceof Class8_Sub1_Sub2_Sub5) {
								local272 = (Class8_Sub1_Sub2_Sub5) local140;
							} else {
								local272 = local81.method433(10, arg8, local33, local44, local57, local68, -1);
							}
							if (local272 != null) {
								for (@Pc(288) int local288 = 0; local288 <= local238; local288++) {
									for (@Pc(292) int local292 = 0; local292 <= local241; local292++) {
										@Pc(299) int local299 = local272.anInt703 / 4;
										if (local299 > 30) {
											local299 = 30;
										}
										if (local299 > this.aByteArrayArrayArray3[arg1][arg0 + local288][arg3 + local292]) {
											this.aByteArrayArrayArray3[arg1][arg0 + local288][arg3 + local292] = (byte) local299;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean137 && arg6 != null) {
						arg6.method119(local81.anInt638, local81.anInt647, arg3, local81.aBoolean139, arg8, arg0);
					}
				} else if (arg5 >= 12) {
					if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
						local140 = local81.method433(arg5, arg8, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class8_Sub1_Sub2_Sub6(arg5, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
					}
					arg7.method392(1, arg1, 0, local78, local111, 1, local93, arg0, arg3, local140);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x924;
					}
					if (local81.aBoolean137 && arg6 != null) {
						arg6.method119(local81.anInt638, local81.anInt647, arg3, local81.aBoolean139, arg8, arg0);
					}
				} else if (arg5 == 0) {
					if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
						local140 = local81.method433(0, arg8, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class8_Sub1_Sub2_Sub6(0, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
					}
					arg7.method390(local111, 0, local93, arg1, null, local140, arg3, arg0, local78, anIntArray182[arg8]);
					if (arg8 == 0) {
						if (local81.aBoolean142) {
							this.aByteArrayArrayArray3[arg1][arg0][arg3] = 50;
							this.aByteArrayArrayArray3[arg1][arg0][arg3 + 1] = 50;
						}
						if (local81.aBoolean141) {
							this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x249;
						}
					} else if (arg8 == 1) {
						if (local81.aBoolean142) {
							this.aByteArrayArrayArray3[arg1][arg0][arg3 + 1] = 50;
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3 + 1] = 50;
						}
						if (local81.aBoolean141) {
							this.anIntArrayArrayArray6[arg1][arg0][arg3 + 1] |= 0x492;
						}
					} else if (arg8 == 2) {
						if (local81.aBoolean142) {
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3] = 50;
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3 + 1] = 50;
						}
						if (local81.aBoolean141) {
							this.anIntArrayArrayArray6[arg1][arg0 + 1][arg3] |= 0x249;
						}
					} else if (arg8 == 3) {
						if (local81.aBoolean142) {
							this.aByteArrayArrayArray3[arg1][arg0][arg3] = 50;
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3] = 50;
						}
						if (local81.aBoolean141) {
							this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x492;
						}
					}
					if (local81.aBoolean137 && arg6 != null) {
						arg6.method118(arg5, arg3, arg0, local81.aBoolean139, arg8, 545);
					}
					if (local81.anInt639 != 16) {
						arg7.method398(arg1, local81.anInt639, arg0, arg3);
					}
				} else if (arg5 == 1) {
					if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
						local140 = local81.method433(1, arg8, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class8_Sub1_Sub2_Sub6(1, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
					}
					arg7.method390(local111, 0, local93, arg1, null, local140, arg3, arg0, local78, anIntArray176[arg8]);
					if (local81.aBoolean142) {
						if (arg8 == 0) {
							this.aByteArrayArrayArray3[arg1][arg0][arg3 + 1] = 50;
						} else if (arg8 == 1) {
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3 + 1] = 50;
						} else if (arg8 == 2) {
							this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3] = 50;
						} else if (arg8 == 3) {
							this.aByteArrayArrayArray3[arg1][arg0][arg3] = 50;
						}
					}
					if (local81.aBoolean137 && arg6 != null) {
						arg6.method118(arg5, arg3, arg0, local81.aBoolean139, arg8, 545);
					}
				} else {
					@Pc(849) int local849;
					@Pc(878) Class8_Sub1_Sub2 local878;
					if (arg5 == 2) {
						local849 = arg8 + 1 & 0x3;
						@Pc(868) Class8_Sub1_Sub2 local868;
						if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
							local868 = local81.method433(2, arg8 + 4, local33, local44, local57, local68, -1);
							local878 = local81.method433(2, local849, local33, local44, local57, local68, -1);
						} else {
							local868 = new Class8_Sub1_Sub2_Sub6(2, local44, local33, local57, 154, true, local81.anInt628, arg8 + 4, local68, arg2);
							local878 = new Class8_Sub1_Sub2_Sub6(2, local44, local33, local57, 154, true, local81.anInt628, local849, local68, arg2);
						}
						arg7.method390(local111, anIntArray182[local849], local93, arg1, local878, local868, arg3, arg0, local78, anIntArray182[arg8]);
						if (local81.aBoolean141) {
							if (arg8 == 0) {
								this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg0][arg3 + 1] |= 0x492;
							} else if (arg8 == 1) {
								this.anIntArrayArrayArray6[arg1][arg0][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg0 + 1][arg3] |= 0x249;
							} else if (arg8 == 2) {
								this.anIntArrayArrayArray6[arg1][arg0 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x492;
							} else if (arg8 == 3) {
								this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg0][arg3] |= 0x249;
							}
						}
						if (local81.aBoolean137 && arg6 != null) {
							arg6.method118(arg5, arg3, arg0, local81.aBoolean139, arg8, 545);
						}
						if (local81.anInt639 != 16) {
							arg7.method398(arg1, local81.anInt639, arg0, arg3);
						}
					} else if (arg5 == 3) {
						if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
							local140 = local81.method433(3, arg8, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class8_Sub1_Sub2_Sub6(3, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
						}
						arg7.method390(local111, 0, local93, arg1, null, local140, arg3, arg0, local78, anIntArray176[arg8]);
						if (local81.aBoolean142) {
							if (arg8 == 0) {
								this.aByteArrayArrayArray3[arg1][arg0][arg3 + 1] = 50;
							} else if (arg8 == 1) {
								this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3 + 1] = 50;
							} else if (arg8 == 2) {
								this.aByteArrayArrayArray3[arg1][arg0 + 1][arg3] = 50;
							} else if (arg8 == 3) {
								this.aByteArrayArrayArray3[arg1][arg0][arg3] = 50;
							}
						}
						if (local81.aBoolean137 && arg6 != null) {
							arg6.method118(arg5, arg3, arg0, local81.aBoolean139, arg8, 545);
						}
					} else if (arg5 == 9) {
						if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
							local140 = local81.method433(arg5, arg8, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class8_Sub1_Sub2_Sub6(arg5, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
						}
						arg7.method392(1, arg1, 0, local78, local111, 1, local93, arg0, arg3, local140);
						if (local81.aBoolean137 && arg6 != null) {
							arg6.method119(local81.anInt638, local81.anInt647, arg3, local81.aBoolean139, arg8, arg0);
						}
					} else {
						if (local81.aBoolean144) {
							if (arg8 == 1) {
								local849 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local849;
							} else if (arg8 == 2) {
								local849 = local68;
								local68 = local44;
								local44 = local849;
								local849 = local57;
								local57 = local33;
								local33 = local849;
							} else if (arg8 == 3) {
								local849 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local849;
							}
						}
						if (arg5 == 4) {
							if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
								local140 = local81.method433(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class8_Sub1_Sub2_Sub6(4, local44, local33, local57, 154, true, local81.anInt628, 0, local68, arg2);
							}
							arg7.method391(local78, arg0, anIntArray182[arg8], local111, local140, local93, arg1, arg8 * 512, arg3, 0, 0);
						} else if (arg5 == 5) {
							local849 = 16;
							local238 = arg7.method408(arg1, arg0, arg3);
							if (local238 > 0) {
								local849 = Class33.method443(local238 >> 14 & 0x7FFF).anInt639;
							}
							if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
								local878 = local81.method433(4, 0, local33, local44, local57, local68, -1);
							} else {
								local878 = new Class8_Sub1_Sub2_Sub6(4, local44, local33, local57, 154, true, local81.anInt628, 0, local68, arg2);
							}
							arg7.method391(local78, arg0, anIntArray182[arg8], local111, local878, local93, arg1, arg8 * 512, arg3, anIntArray183[arg8] * local849, anIntArray184[arg8] * local849);
						} else if (arg5 == 6) {
							if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
								local140 = local81.method433(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class8_Sub1_Sub2_Sub6(4, local44, local33, local57, 154, true, local81.anInt628, 0, local68, arg2);
							}
							arg7.method391(local78, arg0, 256, local111, local140, local93, arg1, arg8, arg3, 0, 0);
						} else if (arg5 == 7) {
							if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
								local140 = local81.method433(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class8_Sub1_Sub2_Sub6(4, local44, local33, local57, 154, true, local81.anInt628, 0, local68, arg2);
							}
							arg7.method391(local78, arg0, 512, local111, local140, local93, arg1, arg8, arg3, 0, 0);
						} else if (arg5 == 8) {
							if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
								local140 = local81.method433(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class8_Sub1_Sub2_Sub6(4, local44, local33, local57, 154, true, local81.anInt628, 0, local68, arg2);
							}
							arg7.method391(local78, arg0, 768, local111, local140, local93, arg1, arg8, arg3, 0, 0);
						}
					}
				}
			} else if (!aBoolean175 || local81.aBoolean132 || local81.aBoolean143) {
				if (local81.anInt628 == -1 && local81.anIntArray97 == null) {
					local140 = local81.method433(22, arg8, local33, local44, local57, local68, -1);
				} else {
					local140 = new Class8_Sub1_Sub2_Sub6(22, local44, local33, local57, 154, true, local81.anInt628, arg8, local68, arg2);
				}
				arg7.method388(arg0, local78, local111, local93, arg3, local140, arg1);
				if (local81.aBoolean137 && local81.aBoolean132 && arg6 != null) {
					arg6.method120(arg3, arg0);
				}
			}
		} catch (@Pc(1623) RuntimeException local1623) {
			signlink.reporterror("36496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1623.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIII)I")
	private int method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray4[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray4[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("53669, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIIIIIILclient!GLMIQHJI;)V")
	private void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class8_Sub1_Sub3 arg6) {
		try {
			@Pc(26) int local26;
			if (arg2 >= 0 && arg2 < 104 && arg5 >= 0 && arg5 < 104) {
				this.aByteArrayArrayArray4[arg4][arg2][arg5] = 0;
				while (true) {
					local26 = arg6.method165();
					if (local26 == 0) {
						if (arg4 == 0) {
							this.anIntArrayArrayArray5[0][arg2][arg5] = -method529(arg2 + arg3 + 932731, arg5 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg4][arg2][arg5] = this.anIntArrayArrayArray5[arg4 - 1][arg2][arg5] - 240;
							return;
						}
					}
					if (local26 == 1) {
						@Pc(80) int local80 = arg6.method165();
						if (local80 == 1) {
							local80 = 0;
						}
						if (arg4 == 0) {
							this.anIntArrayArrayArray5[0][arg2][arg5] = -local80 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg4][arg2][arg5] = this.anIntArrayArrayArray5[arg4 - 1][arg2][arg5] - local80 * 8;
						return;
					}
					if (local26 <= 49) {
						this.aByteArrayArrayArray7[arg4][arg2][arg5] = arg6.method166();
						this.aByteArrayArrayArray2[arg4][arg2][arg5] = (byte) ((local26 - 2) / 4);
						this.aByteArrayArrayArray5[arg4][arg2][arg5] = (byte) (local26 + arg0 - 2 & 0x3);
					} else if (local26 <= 81) {
						this.aByteArrayArrayArray4[arg4][arg2][arg5] = (byte) (local26 - 49);
					} else {
						this.aByteArrayArrayArray6[arg4][arg2][arg5] = (byte) (local26 - 81);
					}
				}
			} else {
				while (true) {
					local26 = arg6.method165();
					if (local26 == 0) {
						return;
					}
					if (local26 == 1) {
						arg6.method165();
						return;
					}
					if (local26 <= 49) {
						arg6.method165();
					}
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("5932, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "([Lclient!EMCOJCFH;III[BII)V")
	public void method545(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg0[local3].anIntArrayArray8[arg3 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class8_Sub1_Sub3 local65 = new Class8_Sub1_Sub3(arg4, -49015);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						this.method543(0, arg1, local80 + arg3, arg5, local11, local84 + arg2, local65);
					}
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("78289, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -27 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYBZGYVK", name = "a", descriptor = "(IIIBIII[Lclient!EMCOJCFH;I[B)V")
	public void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class11[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg6 + local3 > 0 && arg6 + local3 < 103 && arg0 + local7 > 0 && arg0 + local7 < 103) {
						arg7[arg1].anIntArrayArray8[arg6 + local3][arg0 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class8_Sub1_Sub3 local57 = new Class8_Sub1_Sub3(arg9, -49015);
			@Pc(62) boolean local62 = false;
			for (@Pc(73) int local73 = 0; local73 < 4; local73++) {
				for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
					for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
						if (local73 == arg2 && local77 >= arg8 && local77 < arg8 + 8 && local81 >= arg4 && local81 < arg4 + 8) {
							this.method543(arg5, 0, arg6 + Class17.method202(arg5, local81 & 0x7, local77 & 0x7), 0, arg1, arg0 + Class17.method203(arg5, local77 & 0x7, local81 & 0x7), local57);
						} else {
							this.method543(0, 0, -1, 0, 0, -1, local57);
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("4837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}
}
