import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!mo;")
	public static Class143 aClass143_102;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!o;")
	public static Class14_Sub2_Sub14 aClass14_Sub2_Sub14_3;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!pe;")
	public static Class163 aClass163_3;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public static int anInt5675;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public static int anInt5676;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static int anInt5677;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt5678;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt5679;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "[B")
	private static byte[] aByteArray181;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	public static int anInt5680;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "[B")
	private static byte[] aByteArray182;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	public static int anInt5681;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public static int anInt5682;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "[B")
	private static byte[] aByteArray183;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "[S")
	private static short[] aShortArray115;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public static int anInt5685;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "[[[Lclient!lc;")
	private static Class126[][][] aClass126ArrayArrayArray2;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "[I")
	private static int[] anIntArray519;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!bn;")
	private static Class25 aClass25_31;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "[S")
	private static short[] aShortArray116;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	public static int anInt5687;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "[B")
	private static byte[] aByteArray184;

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "[B")
	private static byte[] aByteArray185;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!bn;")
	private static final Class25 aClass25_30 = new Class25(16);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_35 = new Class18();

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[S")
	private static final short[] aShortArray114 = new short[1];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[B")
	private static final byte[] aByteArray180 = new byte[1];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public static int anInt5673 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public static int anInt5674 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	public static void method5040() {
		aByteArray181 = new byte[anInt5687 * anInt5680];
		aByteArray182 = new byte[anInt5687 * anInt5680];
		aByteArray185 = new byte[anInt5687 * anInt5680];
		aShortArray116 = new short[anInt5687 * anInt5680];
		aByteArray183 = new byte[anInt5687 * anInt5680];
		aClass25_31 = new Class25(1024);
		aClass126ArrayArrayArray2 = new Class126[3][anInt5687 >> 6][anInt5680 >> 6];
		anIntArray519 = new int[Static223.anInt5822 + 1];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method5041(@OriginalArg(0) int arg0) {
		aClass14_Sub2_Sub14_3 = (Class14_Sub2_Sub14) aClass25_30.method691((long) arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ah;II)V")
	public static void method5042(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static223.anInt5822; local1++) {
			anIntArray519[local1 + 1] = method5053(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;IIII[S[B)V")
	private static void method5043(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class59 local13 = Static232.method2200(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt1949;
			if (local16 != -1) {
				@Pc(23) Class184 local23 = Static100.method2240(local16);
				@Pc(47) Class2 local47 = local23.method4964(local13.aBoolean136 ? local13.aBoolean137 : false, local13.aBoolean131 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method2630() >> 2;
					@Pc(63) int local63 = arg4 * local47.method2627() >> 2;
					if (local23.aBoolean369) {
						@Pc(69) int local69 = local13.anInt1950;
						@Pc(72) int local72 = local13.anInt1912;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt5587 == 0) {
							local47.method2632(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method2637(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt5587 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;Lclient!jg;IIII[I[I)V")
	private static void method5044(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class14_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method2548();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method2548();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray181[arg4 + arg5 * anInt5687] = (byte) local21;
					aByteArray182[arg4 + arg5 * anInt5687] = 0;
				} else {
					aByteArray182[arg4 + arg5 * anInt5687] = (byte) local21;
					aByteArray185[arg4 + arg5 * anInt5687] = 0;
					aByteArray181[arg4 + arg5 * anInt5687] = arg1.method2553();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method2548();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method2548();
				local127 = arg1.method2548();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method2548();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray181[arg4 + arg5 * anInt5687] = (byte) local123;
				aByteArray182[arg4 + arg5 * anInt5687] = (byte) local125;
				aByteArray185[arg4 + arg5 * anInt5687] = (byte) local127;
				if (local139 == 1) {
					aShortArray116[arg4 + arg5 * anInt5687] = (short) (arg1.method2498() + 1);
					aByteArray183[arg4 + arg5 * anInt5687] = arg1.method2553();
				} else if (local139 > 1) {
					aShortArray116[arg4 + arg5 * anInt5687] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2498();
						local218[local220] = arg1.method2553();
					}
					aClass25_31.method687((long) (arg4 << 16 | arg5), new Class14_Sub12(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2498();
						local218[local220] = arg1.method2553();
					}
				}
				if (aClass126ArrayArrayArray2[local118 - 1][arg2 - (anInt5683 >> 6)][arg3 - (anInt5684 >> 6)] == null) {
					aClass126ArrayArrayArray2[local118 - 1][arg2 - (anInt5683 >> 6)][arg3 - (anInt5684 >> 6)] = new Class126();
				}
				@Pc(338) Class1_Sub5 local338 = new Class1_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass126ArrayArrayArray2[local118 - 1][arg2 - (anInt5683 >> 6)][arg3 - (anInt5684 >> 6)].method3401(local338);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
	public static void method5045() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass163_3.anInt4750; local4++) {
			@Pc(32) boolean local32 = aClass14_Sub2_Sub14_3.method3990(aClass163_3.anIntArray429[local4] >> 28 & 0x3, aClass163_3.anIntArray429[local4] >> 14 & 0x3FFF, aClass163_3.anIntArray429[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class14_Sub5 local42 = new Class14_Sub5(aClass163_3.anIntArray428[local4]);
				local42.anInt736 = local2[1] - anInt5683;
				local42.anInt729 = local2[2] - anInt5684;
				aClass18_35.method451(local42);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()V")
	public static void method5046() {
		aByteArray181 = null;
		aByteArray184 = null;
		aShortArray115 = null;
		aByteArray182 = null;
		aByteArray185 = null;
		aShortArray116 = null;
		aByteArray183 = null;
		aClass25_31 = null;
		aClass126ArrayArrayArray2 = null;
		anIntArray519 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;Lclient!br;IIII)V")
	private static void method5047(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class14_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt731 = anInt5679 + (arg2 * (arg1.anInt736 - anInt5677) >> 16);
		arg1.anInt726 = anInt5685 - (arg3 * (arg1.anInt729 - anInt5676) >> 16);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;IIIIIII[S[BZ)V")
	private static void method5048(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method5110(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray519[arg6];
					if (arg10 || local32 != 0) {
						arg0.method5110(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static263.method4517(arg3, local32, arg2, arg5, arg4, anIntArray519[arg6], anInt5675, arg1, arg0, local20, aByteArrayArrayArray13, arg7 >> 6 & 0x3);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(126) Class59 local126 = Static232.method2200(arg8[local100] & 0xFFFF);
				if (local126.anInt1949 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt1955 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method5091(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method5147(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method5091(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method5147(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method5091(arg1, arg2, arg4, -1, 0);
							arg0.method5147(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method5091(local20, arg2, arg4, -1, 0);
							arg0.method5147(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method5091(local20, arg2, arg4, -1, 0);
							arg0.method5147(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method5091(arg1, arg2, arg4, -1, 0);
							arg0.method5147(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method5147(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method5147(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method5147(local20, local32, 1, local132, 0);
						} else {
							arg0.method5147(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method5147(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method5147(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!er;")
	public static Class56 method5049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class56 local3 = new Class56();
		for (@Pc(8) Class14_Sub2_Sub14 local8 = (Class14_Sub2_Sub14) aClass25_30.method697(); local8 != null; local8 = (Class14_Sub2_Sub14) aClass25_30.method694()) {
			if (local8.aBoolean295 && local8.method3995(arg1, arg0)) {
				local3.method1922(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;)V")
	public static void method5050(@OriginalArg(0) Class46 arg0) {
		@Pc(3) int local3 = anInt5686 - anInt5677;
		@Pc(7) int local7 = anInt5681 - anInt5676;
		@Pc(15) int local15 = (anInt5682 - anInt5679 << 16) / local3;
		@Pc(23) int local23 = (anInt5685 - anInt5678 << 16) / local7;
		method5052(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!mo;)V")
	public static void method5051(@OriginalArg(0) Class143 arg0) {
		aClass143_102 = arg0;
		aClass25_30.method685();
		@Pc(9) int local9 = aClass143_102.method3765("details");
		@Pc(14) int[] local14 = aClass143_102.method3738(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class14_Sub2_Sub14 local25 = Static255.method4391(aClass143_102, local14[local16], local9);
			aClass25_30.method687((long) local25.anInt4460, local25);
		}
		Static78.method1946(false);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;IIII)V")
	private static void method5052(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt5686 - anInt5677;
		@Pc(7) int local7 = anInt5681 - anInt5676;
		if (anInt5686 < anInt5687) {
			local3++;
		}
		if (anInt5681 < anInt5680) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(178) int local178;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt5679;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt5679;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt5677 + local17;
				if (local50 >= 0 && local50 < anInt5687) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5685 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5685 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt5676;
							local172 = local50 + local93 * anInt5687;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt5680) {
								local174 = (aByteArray184[local172] & 0xFF) << 16 | aShortArray115[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray182[local172] & 0xFF;
								local178 = aShortArray116[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass14_Sub2_Sub14_3.anInt4452 != -1) {
									local174 = aClass14_Sub2_Sub14_3.anInt4452 | 0xFF000000;
								} else if ((local17 + anInt5677 & 0x4) == (local57 + anInt5681 & 0x4)) {
									local174 = anIntArray519[Static193.anInt3950 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method5110(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method5048(arg0, local28, local70, local44, local84, local174, local176, aByteArray185[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class14_Sub12 local280 = (Class14_Sub12) aClass25_31.method691((long) (local50 << 16 | local93));
								if (local280 != null) {
									method5048(arg0, local28, local70, local44, local84, local174, local176, aByteArray185[local172], local280.aShortArray24, local280.aByteArray37, true);
								}
							} else {
								aShortArray114[0] = (short) (local178 - 1);
								aByteArray180[0] = aByteArray183[local172];
								method5048(arg0, local28, local70, local44, local84, local174, local176, aByteArray185[local172], aShortArray114, aByteArray180, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5685 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5685 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass14_Sub2_Sub14_3.anInt4452 != -1) {
							local93 = aClass14_Sub2_Sub14_3.anInt4452 | 0xFF000000;
						} else if ((local17 + anInt5677 & 0x4) == (local57 + anInt5681 & 0x4)) {
							local93 = anIntArray519[Static193.anInt3950 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method5110(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt5679;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt5679;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt5677;
				if (local57 >= 0 && local57 < anInt5687) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt5685 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt5685 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt5676;
							if (local172 >= 0 && local172 < anInt5680) {
								local174 = aShortArray116[local57 + local172 * anInt5687] & 0xFFFF;
								if (local174 <= 0) {
									method5043(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class14_Sub12 local457 = (Class14_Sub12) aClass25_31.method691((long) (local57 << 16 | local172));
									if (local457 != null) {
										method5043(arg0, local40, local80, local50, local93, local457.aShortArray24, local457.aByteArray37);
									}
								} else {
									aShortArray114[0] = (short) (local174 - 1);
									aByteArray180[0] = aByteArray183[local57 + local172 * anInt5687];
									method5043(arg0, local40, local80, local50, local93, aShortArray114, aByteArray180);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt5677 >> 6;
		local44 = anInt5676 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt5686 >> 6;
		local57 = anInt5681 >> 6;
		if (local50 >= aClass126ArrayArrayArray2[0].length) {
			local50 = aClass126ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass126ArrayArrayArray2[0][0].length) {
			local57 = aClass126ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class126 local587 = aClass126ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt5683 >> 6)) * 64;
						local174 = (local84 + (anInt5684 >> 6)) * 64;
						for (@Pc(610) Class1_Sub5 local610 = (Class1_Sub5) local587.method3389(); local610 != null; local610 = (Class1_Sub5) local587.method3394()) {
							local178 = local172 + local610.aByte33 - anInt5683 - anInt5677;
							local629 = local174 + local610.aByte32 - anInt5684 - anInt5676;
							local639 = (arg1 * local178 >> 16) + anInt5679;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt5679;
							local663 = anInt5685 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt5685 - (arg2 * local629 >> 16);
							method5048(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt3790, local610.aByte34 & 0xFF, local610.aByte31, local610.aShortArray88, local610.aByteArray106, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class126 local725 = aClass126ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt5683 >> 6)) * 64;
						local176 = (local93 + (anInt5684 >> 6)) * 64;
						for (@Pc(748) Class1_Sub5 local748 = (Class1_Sub5) local725.method3389(); local748 != null; local748 = (Class1_Sub5) local725.method3394()) {
							local629 = local174 + local748.aByte33 - anInt5683 - anInt5677;
							local639 = local176 + local748.aByte32 - anInt5684 - anInt5676;
							local651 = (arg1 * local629 >> 16) + anInt5679;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt5679;
							local673 = anInt5685 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt5685 - (arg2 * local639 >> 16);
							method5043(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray88, local748.aByteArray106);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ah;III)I")
	private static int method5053(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class69 local3 = Static327.method5626(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt2172;
		if (local10 >= 0 && arg0.method116(local10).aBoolean285) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt2179 >= 0) {
			local26 = local3.anInt2179;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static71.anIntArray514[Static32.method786(Static89.method2125(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static71.anIntArray514[Static32.method786(Static89.method2125(arg0.method116(local10).aShort64)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt2182 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt2182;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static71.anIntArray514[Static32.method786(Static89.method2125(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!e;IIII)Lclient!bd;")
	private static Class18 method5054(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class14_Sub5 local4 = (Class14_Sub5) aClass18_35.method459(); local4 != null; local4 = (Class14_Sub5) aClass18_35.method453()) {
			method5047(arg0, local4, arg1, arg2);
		}
		return aClass18_35;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!e;)Lclient!bd;")
	public static Class18 method5055(@OriginalArg(0) Class46 arg0) {
		@Pc(3) int local3 = anInt5686 - anInt5677;
		@Pc(7) int local7 = anInt5681 - anInt5676;
		@Pc(15) int local15 = (anInt5682 - anInt5679 << 16) / local3;
		@Pc(23) int local23 = (anInt5685 - anInt5678 << 16) / local7;
		return method5054(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!e;II)V")
	public static void method5056(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class14_Sub4 local9 = new Class14_Sub4(aClass143_102.method3746(aClass14_Sub2_Sub14_3.aString160, "area"));
		@Pc(13) int local13 = local9.method2548();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method2548();
		}
		@Pc(33) int local33 = local9.method2548();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method2548();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt2637 < local9.aByteArray74.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method2548() == 0) {
					local58 = local9.method2548();
					local62 = local9.method2548();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt5683;
							local84 = local62 * 64 + local67 - anInt5684;
							method5044(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method2548();
					local62 = local9.method2548();
					local64 = local9.method2548();
					local67 = local9.method2548();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt5683;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt5684;
							method5044(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray184 = new byte[anInt5687 * anInt5680];
			aShortArray115 = new short[anInt5687 * anInt5680];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt5687 * anInt5680];
				for (local64 = 0; local64 < aClass126ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass126ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class126 local205 = aClass126ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class1_Sub5 local212 = (Class1_Sub5) local205.method3389(); local212 != null; local212 = (Class1_Sub5) local205.method3394()) {
								local191[local64 * 64 + local212.aByte33 + (local67 * 64 + local212.aByte32) * anInt5687] = (byte) local212.anInt3790;
							}
						}
					}
				}
				method5059(local191, aByteArray184, aShortArray115, arg1, arg2);
				for (local67 = 0; local67 < aClass126ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass126ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class126 local276 = aClass126ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class1_Sub5 local283 = (Class1_Sub5) local276.method3389(); local283 != null; local283 = (Class1_Sub5) local276.method3394()) {
								local148 = local67 * 64 + local283.aByte33 + (local76 * 64 + local283.aByte32) * anInt5687;
								local283.anInt3790 = (aByteArray184[local148] & 0xFF) << 16 | aShortArray115[local148] & 0xFFFF;
								if (local283.anInt3790 != 0) {
									local283.anInt3790 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method5059(aByteArray181, aByteArray184, aShortArray115, arg1, arg2);
			aByteArray181 = null;
			method5060();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lclient!o;")
	public static Class14_Sub2_Sub14 method5058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class14_Sub2_Sub14 local4 = (Class14_Sub2_Sub14) aClass25_30.method697(); local4 != null; local4 = (Class14_Sub2_Sub14) aClass25_30.method694()) {
			if (local4.aBoolean295 && local4.method3995(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[B[SII)V")
	private static void method5059(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt5680];
		@Pc(5) int[] local5 = new int[anInt5680];
		@Pc(8) int[] local8 = new int[anInt5680];
		@Pc(11) int[] local11 = new int[anInt5680];
		@Pc(14) int[] local14 = new int[anInt5680];
		for (@Pc(16) int local16 = -5; local16 < anInt5687; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt5680; local27++) {
				@Pc(49) Class48 local49;
				@Pc(85) int local85;
				if (local21 < anInt5687) {
					local41 = arg0[local21 + local27 * anInt5687] & 0xFF;
					if (local41 > 0) {
						local49 = Static354.method5983(local41 - 1);
						local2[local27] += local49.anInt1632;
						local5[local27] += local49.anInt1639;
						local8[local27] += local49.anInt1637;
						local11[local27] += local49.anInt1625;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt5687] & 0xFF;
					if (local41 > 0) {
						local49 = Static354.method5983(local41 - 1);
						local2[local27] -= local49.anInt1632;
						local5[local27] -= local49.anInt1639;
						local8[local27] -= local49.anInt1637;
						local11[local27] -= local49.anInt1625;
						local85 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(157) int local157 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				for (@Pc(165) int local165 = -5; local165 < anInt5680; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt5680) {
						local41 += local2[local170];
						local157 += local5[local170];
						local159 += local8[local170];
						local161 += local11[local170];
						local163 += local14[local170];
					}
					@Pc(207) int local207 = local165 - 5;
					if (local207 >= 0) {
						local41 -= local2[local207];
						local157 -= local5[local207];
						local159 -= local8[local207];
						local161 -= local11[local207];
						local163 -= local14[local207];
					}
					if (local165 >= 0 && local163 > 0) {
						@Pc(259) int local259;
						if ((arg0[local16 + local165 * anInt5687] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt5687;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static322.method5557(local41 * 256 / local161, local159 / local163, local157 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt5687;
							@Pc(331) int local331 = Static71.anIntArray514[Static32.method786(Static127.method2656(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()V")
	private static void method5060() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt5687; local1++) {
			for (local4 = 0; local4 < anInt5680; local4++) {
				local15 = aShortArray116[local1 + local4 * anInt5687] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class14_Sub12 local31 = (Class14_Sub12) aClass25_31.method691((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray24.length; local35++) {
								@Pc(45) Class59 local45 = Static232.method2200(local31.aShortArray24[local35] & 0xFFFF);
								local48 = local45.anInt1944;
								if (local45.anIntArray176 != null) {
									local45 = local45.method1977();
									if (local45 != null) {
										local48 = local45.anInt1944;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class14_Sub5 local68 = new Class14_Sub5(local48);
									local68.anInt736 = local1;
									local68.anInt729 = local4;
									aClass18_35.method451(local68);
								}
							}
						}
					} else {
						@Pc(91) Class59 local91 = Static232.method2200(local15 - 1);
						local35 = local91.anInt1944;
						if (local91.anIntArray176 != null) {
							local91 = local91.method1977();
							if (local91 != null) {
								local35 = local91.anInt1944;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class14_Sub5 local114 = new Class14_Sub5(local35);
							local114.anInt736 = local1;
							local114.anInt729 = local4;
							aClass18_35.method451(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass126ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass126ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class126 local149 = aClass126ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class1_Sub5 local156 = (Class1_Sub5) local149.method3389(); local156 != null; local156 = (Class1_Sub5) local149.method3394()) {
							if (local156.aShortArray88 != null) {
								for (local48 = 0; local48 < local156.aShortArray88.length; local48++) {
									@Pc(172) Class59 local172 = Static232.method2200(local156.aShortArray88[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt1944;
									if (local172.anIntArray176 != null) {
										local172 = local172.method1977();
										if (local172 != null) {
											local175 = local172.anInt1944;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class14_Sub5 local195 = new Class14_Sub5(local175);
										local195.anInt736 = (local15 + (anInt5683 >> 6)) * 64 + local156.aByte33 - anInt5683;
										local195.anInt729 = (local140 + (anInt5684 >> 6)) * 64 + local156.aByte32 - anInt5684;
										aClass18_35.method451(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lclient!o;")
	public static Class14_Sub2_Sub14 method5061(@OriginalArg(0) int arg0) {
		return (Class14_Sub2_Sub14) aClass25_30.method691((long) arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt5677 = arg0 - anInt5683;
		anInt5681 = arg1 - anInt5684;
		anInt5686 = arg2 - anInt5683;
		anInt5676 = arg3 - anInt5684;
		anInt5679 = arg4;
		anInt5678 = arg5;
		anInt5682 = arg6;
		anInt5685 = arg7;
	}
}
