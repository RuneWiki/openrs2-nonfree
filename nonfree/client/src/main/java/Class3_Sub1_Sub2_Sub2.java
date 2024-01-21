import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EHATXTET")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!EHATXTET", name = "C", descriptor = "Z")
	public static boolean aBoolean41;

	@OriginalMember(owner = "client!EHATXTET", name = "D", descriptor = "Z")
	private static boolean aBoolean42;

	@OriginalMember(owner = "client!EHATXTET", name = "F", descriptor = "I")
	public static int anInt131;

	@OriginalMember(owner = "client!EHATXTET", name = "G", descriptor = "I")
	public static int anInt132;

	@OriginalMember(owner = "client!EHATXTET", name = "H", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!EHATXTET", name = "M", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!EHATXTET", name = "N", descriptor = "I")
	private static int anInt134;

	@OriginalMember(owner = "client!EHATXTET", name = "R", descriptor = "I")
	private static int anInt135;

	@OriginalMember(owner = "client!EHATXTET", name = "S", descriptor = "[[I")
	private static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!EHATXTET", name = "V", descriptor = "I")
	public static int anInt136;

	@OriginalMember(owner = "client!EHATXTET", name = "z", descriptor = "Z")
	private static boolean aBoolean39 = true;

	@OriginalMember(owner = "client!EHATXTET", name = "A", descriptor = "I")
	private static int anInt130 = -420;

	@OriginalMember(owner = "client!EHATXTET", name = "B", descriptor = "Z")
	public static boolean aBoolean40 = true;

	@OriginalMember(owner = "client!EHATXTET", name = "E", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!EHATXTET", name = "I", descriptor = "[I")
	private static int[] anIntArray25 = new int[512];

	@OriginalMember(owner = "client!EHATXTET", name = "J", descriptor = "[I")
	public static int[] anIntArray26 = new int[2048];

	@OriginalMember(owner = "client!EHATXTET", name = "K", descriptor = "[I")
	public static int[] anIntArray27 = new int[2048];

	@OriginalMember(owner = "client!EHATXTET", name = "L", descriptor = "[I")
	public static int[] anIntArray28 = new int[2048];

	@OriginalMember(owner = "client!EHATXTET", name = "O", descriptor = "[Lclient!SSCICQYX;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!EHATXTET", name = "P", descriptor = "[Z")
	private static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!EHATXTET", name = "Q", descriptor = "[I")
	private static int[] anIntArray30;

	@OriginalMember(owner = "client!EHATXTET", name = "T", descriptor = "[[I")
	private static int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!EHATXTET", name = "U", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!EHATXTET", name = "W", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!EHATXTET", name = "X", descriptor = "[[I")
	private static int[][] anIntArrayArray3;

	static {
		for (@Pc(21) int local21 = 1; local21 < 512; local21++) {
			anIntArray25[local21] = 32768 / local21;
		}
		for (@Pc(34) int local34 = 1; local34 < 2048; local34++) {
			anIntArray26[local34] = 65536 / local34;
		}
		for (@Pc(47) int local47 = 0; local47 < 2048; local47++) {
			anIntArray27[local47] = (int) (Math.sin((double) local47 * 0.0030679615D) * 65536.0D);
			anIntArray28[local47] = (int) (Math.cos((double) local47 * 0.0030679615D) * 65536.0D);
		}
		aClass3_Sub1_Sub2_Sub3Array1 = new Class3_Sub1_Sub2_Sub3[50];
		aBooleanArray2 = new boolean[50];
		anIntArray30 = new int[50];
		anIntArrayArray2 = new int[50][];
		anIntArray31 = new int[50];
		anIntArray32 = new int[65536];
		anIntArrayArray3 = new int[50][];
	}

	@OriginalMember(owner = "client!EHATXTET", name = "c", descriptor = "(I)V")
	public static void method98() {
		try {
			anIntArray25 = null;
			anIntArray25 = null;
			anIntArray27 = null;
			anIntArray28 = null;
			anIntArray29 = null;
			aClass3_Sub1_Sub2_Sub3Array1 = null;
			aBooleanArray2 = null;
			anIntArray30 = null;
			anIntArrayArray1 = null;
			anIntArrayArray2 = null;
			anIntArray31 = null;
			anIntArray32 = null;
			anIntArrayArray3 = null;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("52237, " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "d", descriptor = "(I)V")
	public static void method99() {
		try {
			anIntArray29 = new int[Class3_Sub1_Sub2.anInt759];
			for (@Pc(7) int local7 = 0; local7 < Class3_Sub1_Sub2.anInt759; local7++) {
				anIntArray29[local7] = Class3_Sub1_Sub2.anInt758 * local7;
			}
			anInt132 = Class3_Sub1_Sub2.anInt758 / 2;
			anInt133 = Class3_Sub1_Sub2.anInt759 / 2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("88168, " + -897 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(III)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray29 = new int[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				anIntArray29[local16] = arg1 * local16;
			}
			anInt132 = arg1 / 2;
			anInt133 = arg0 / 2;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("58770, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "e", descriptor = "(I)V")
	public static void method101() {
		try {
			anIntArrayArray1 = null;
			for (@Pc(7) int local7 = 0; local7 < 50; local7++) {
				anIntArrayArray2[local7] = null;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("2836, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(IB)V")
	public static void method102() {
		try {
			if (anIntArrayArray1 == null) {
				anInt135 = 20;
				if (aBoolean40) {
					anIntArrayArray1 = new int[anInt135][16384];
				} else {
					anIntArrayArray1 = new int[anInt135][65536];
				}
				for (@Pc(28) int local28 = 0; local28 < 50; local28++) {
					anIntArrayArray2[local28] = null;
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("46724, " + 20 + ", " + 6 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(Lclient!RPFMUSNN;B)V")
	public static void method103(@OriginalArg(0) Class35 arg0) {
		try {
			anInt134 = 0;
			for (@Pc(9) int local9 = 0; local9 < 50; local9++) {
				try {
					aClass3_Sub1_Sub2_Sub3Array1[local9] = new Class3_Sub1_Sub2_Sub3(arg0, String.valueOf(local9), 0);
					if (aBoolean40 && aClass3_Sub1_Sub2_Sub3Array1[local9].anInt551 == 128) {
						aClass3_Sub1_Sub2_Sub3Array1[local9].method364();
					} else {
						aClass3_Sub1_Sub2_Sub3Array1[local9].method365();
					}
					anInt134++;
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("65812, " + arg0 + ", " + -102 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(IZ)I")
	public static int method104(@OriginalArg(0) int arg0) {
		try {
			if (anIntArray30[arg0] != 0) {
				return anIntArray30[arg0];
			}
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = anIntArrayArray3[arg0].length;
			for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
				local9 += anIntArrayArray3[arg0][local20] >> 16 & 0xFF;
				local11 += anIntArrayArray3[arg0][local20] >> 8 & 0xFF;
				local13 += anIntArrayArray3[arg0][local20] & 0xFF;
			}
			@Pc(76) int local76 = (local9 / local18 << 16) + (local11 / local18 << 8) + local13 / local18;
			local76 = method108(local76, 1.4D);
			if (local76 == 0) {
				local76 = 1;
			}
			anIntArray30[arg0] = local76;
			return local76;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("19665, " + arg0 + ", " + true + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(II)V")
	public static void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (anIntArrayArray2[arg0] != null) {
				anIntArrayArray1[anInt135++] = anIntArrayArray2[arg0];
				@Pc(18) boolean local18 = false;
				anIntArrayArray2[arg0] = null;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("30108, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "f", descriptor = "(I)[I")
	private static int[] method106(@OriginalArg(0) int arg0) {
		anIntArray31[arg0] = anInt136++;
		if (anIntArrayArray2[arg0] != null) {
			return anIntArrayArray2[arg0];
		}
		@Pc(27) int[] local27;
		@Pc(39) int local39;
		if (anInt135 > 0) {
			local27 = anIntArrayArray1[--anInt135];
			anIntArrayArray1[anInt135] = null;
		} else {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			for (local39 = 0; local39 < anInt134; local39++) {
				if (anIntArrayArray2[local39] != null && (anIntArray31[local39] < local35 || local37 == -1)) {
					local35 = anIntArray31[local39];
					local37 = local39;
				}
			}
			local27 = anIntArrayArray2[local37];
			anIntArrayArray2[local37] = null;
		}
		anIntArrayArray2[arg0] = local27;
		@Pc(79) Class3_Sub1_Sub2_Sub3 local79 = aClass3_Sub1_Sub2_Sub3Array1[arg0];
		@Pc(83) int[] local83 = anIntArrayArray3[arg0];
		@Pc(106) int local106;
		if (aBoolean40) {
			aBooleanArray2[arg0] = false;
			for (local39 = 0; local39 < 4096; local39++) {
				local106 = local27[local39] = local83[local79.aByteArray16[local39]] & 0xF8F8FF;
				if (local106 == 0) {
					aBooleanArray2[arg0] = true;
				}
				local27[local39 + 4096] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 8192] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 12288] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		} else {
			if (local79.anInt547 == 64) {
				for (local39 = 0; local39 < 128; local39++) {
					for (local106 = 0; local106 < 128; local106++) {
						local27[local106 + (local39 << 7)] = local83[local79.aByteArray16[(local106 >> 1) + (local39 >> 1 << 6)]];
					}
				}
			} else {
				for (local39 = 0; local39 < 16384; local39++) {
					local27[local39] = local83[local79.aByteArray16[local39]];
				}
			}
			aBooleanArray2[arg0] = false;
			for (local39 = 0; local39 < 16384; local39++) {
				local27[local39] &= 0xF8F8FF;
				local106 = local27[local39];
				if (local106 == 0) {
					aBooleanArray2[arg0] = true;
				}
				local27[local39 + 16384] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 32768] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 49152] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(DB)V")
	public static void method107(@OriginalArg(0) double arg0) {
		try {
			@Pc(9) double local9 = arg0 + Math.random() * 0.03D - 0.015D;
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < 512; local22++) {
				@Pc(33) double local33 = (double) (local22 / 8) / 64.0D + 0.0078125D;
				@Pc(42) double local42 = (double) (local22 & 0x7) / 8.0D + 0.0625D;
				for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
					@Pc(51) double local51 = (double) local44 / 128.0D;
					@Pc(53) double local53 = local51;
					@Pc(55) double local55 = local51;
					@Pc(57) double local57 = local51;
					if (local42 != 0.0D) {
						@Pc(71) double local71;
						if (local51 < 0.5D) {
							local71 = local51 * (local42 + 1.0D);
						} else {
							local71 = local51 + local42 - local51 * local42;
						}
						@Pc(87) double local87 = local51 * 2.0D - local71;
						@Pc(91) double local91 = local33 + 0.3333333333333333D;
						if (local91 > 1.0D) {
							local91--;
						}
						@Pc(105) double local105 = local33 - 0.3333333333333333D;
						if (local105 < 0.0D) {
							local105++;
						}
						if (local91 * 6.0D < 1.0D) {
							local53 = local87 + (local71 - local87) * 6.0D * local91;
						} else if (local91 * 2.0D < 1.0D) {
							local53 = local71;
						} else if (local91 * 3.0D < 2.0D) {
							local53 = local87 + (local71 - local87) * (0.6666666666666666D - local91) * 6.0D;
						} else {
							local53 = local87;
						}
						if (local33 * 6.0D < 1.0D) {
							local55 = local87 + (local71 - local87) * 6.0D * local33;
						} else if (local33 * 2.0D < 1.0D) {
							local55 = local71;
						} else if (local33 * 3.0D < 2.0D) {
							local55 = local87 + (local71 - local87) * (0.6666666666666666D - local33) * 6.0D;
						} else {
							local55 = local87;
						}
						if (local105 * 6.0D < 1.0D) {
							local57 = local87 + (local71 - local87) * 6.0D * local105;
						} else if (local105 * 2.0D < 1.0D) {
							local57 = local71;
						} else if (local105 * 3.0D < 2.0D) {
							local57 = local87 + (local71 - local87) * (0.6666666666666666D - local105) * 6.0D;
						} else {
							local57 = local87;
						}
					}
					@Pc(268) int local268 = (int) (local53 * 256.0D);
					@Pc(273) int local273 = (int) (local55 * 256.0D);
					@Pc(278) int local278 = (int) (local57 * 256.0D);
					@Pc(288) int local288 = (local268 << 16) + (local273 << 8) + local278;
					local288 = method108(local288, local9);
					if (local288 == 0) {
						local288 = 1;
					}
					anIntArray32[local20++] = local288;
				}
			}
			for (@Pc(311) int local311 = 0; local311 < 50; local311++) {
				if (aClass3_Sub1_Sub2_Sub3Array1[local311] != null) {
					@Pc(322) int[] local322 = aClass3_Sub1_Sub2_Sub3Array1[local311].anIntArray121;
					anIntArrayArray3[local311] = new int[local322.length];
					for (@Pc(330) int local330 = 0; local330 < local322.length; local330++) {
						anIntArrayArray3[local311][local330] = method108(local322[local330], local9);
						if ((anIntArrayArray3[local311][local330] & 0xF8F8FF) == 0 && local330 != 0) {
							anIntArrayArray3[local311][local330] = 1;
						}
					}
				}
			}
			for (@Pc(369) int local369 = 0; local369 < 50; local369++) {
				method105(local369, 59);
			}
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("80206, " + arg0 + ", " + -117 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(ID)I")
	private static int method108(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(6) double local6 = (double) (arg0 >> 16) / 256.0D;
		@Pc(15) double local15 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(22) double local22 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = Math.pow(local6, arg1);
		@Pc(30) double local30 = Math.pow(local15, arg1);
		@Pc(34) double local34 = Math.pow(local22, arg1);
		@Pc(39) int local39 = (int) (local26 * 256.0D);
		@Pc(44) int local44 = (int) (local30 * 256.0D);
		@Pc(49) int local49 = (int) (local34 * 256.0D);
		return (local39 << 16) + (local44 << 8) + local49;
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		if (arg1 != arg0) {
			local3 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local5 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		if (arg2 != arg1) {
			local30 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local32 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		if (arg2 != arg0) {
			local57 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local59 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class3_Sub1_Sub2.anInt761) {
				if (arg1 > Class3_Sub1_Sub2.anInt761) {
					arg1 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg5 -= local57 * arg0;
						arg3 -= local3 * arg0;
						arg8 -= local59 * arg0;
						arg6 -= local5 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0xF;
					if (arg1 < 0) {
						arg4 -= local30 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local57 < local3 || arg0 == arg1 && local57 > local30) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg4 -= local57 * arg0;
						arg3 -= local3 * arg0;
						arg7 -= local59 * arg0;
						arg6 -= local5 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local30 * arg2;
						arg8 -= local32 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local57 < local3 || arg0 == arg2 && local30 > local3) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class3_Sub1_Sub2.anInt761) {
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg0 > Class3_Sub1_Sub2.anInt761) {
					arg0 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg3 -= local3 * arg1;
						arg4 -= local30 * arg1;
						arg6 -= local5 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local57 * arg2;
						arg8 -= local59 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local3 < local30 || arg1 == arg2 && local3 > local57) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg5 -= local3 * arg1;
						arg4 -= local30 * arg1;
						arg8 -= local5 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0xF;
					if (arg0 < 0) {
						arg3 -= local57 * arg0;
						arg6 -= local59 * arg0;
						arg0 = 0;
					}
					if (local3 < local30) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method110(Class3_Sub1_Sub2.anIntArray181, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					}
				}
			}
		} else if (arg2 < Class3_Sub1_Sub2.anInt761) {
			if (arg0 > Class3_Sub1_Sub2.anInt761) {
				arg0 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg1 > Class3_Sub1_Sub2.anInt761) {
				arg1 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg4 -= local30 * arg2;
					arg5 -= local57 * arg2;
					arg7 -= local32 * arg2;
					arg8 -= local59 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0xF;
				if (arg0 < 0) {
					arg3 -= local3 * arg0;
					arg6 -= local5 * arg0;
					arg0 = 0;
				}
				if (local30 < local57) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg3 -= local30 * arg2;
					arg5 -= local57 * arg2;
					arg6 -= local32 * arg2;
					arg8 -= local59 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0xF;
				if (arg1 < 0) {
					arg4 -= local3 * arg1;
					arg7 -= local5 * arg1;
					arg1 = 0;
				}
				if (local30 < local57) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method110(Class3_Sub1_Sub2.anIntArray181, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "([IIIIIIII)V")
	private static void method110(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(18) int local18;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(51) int local51;
		@Pc(97) int local97;
		if (aBoolean43) {
			if (aBoolean41) {
				if (arg3 - arg2 > 3) {
					local18 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local18 = 0;
				}
				if (arg3 > Class3_Sub1_Sub2.anInt764) {
					arg3 = Class3_Sub1_Sub2.anInt764;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
				arg1 += arg2;
				local51 = arg3 - arg2 >> 2;
				local18 <<= 0x2;
			} else if (arg2 < arg3) {
				arg1 += arg2;
				local51 = arg3 - arg2 >> 2;
				if (local51 > 0) {
					local18 = (arg5 - arg4) * anIntArray25[local51] >> 15;
				} else {
					local18 = 0;
				}
			} else {
				return;
			}
			@Pc(104) int local104;
			if (anInt131 == 0) {
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray32[arg4 >> 8];
							do {
								arg0[arg1++] = local97;
								local51--;
							} while (local51 > 0);
							return;
						}
						break;
					}
					local97 = anIntArray32[arg4 >> 8];
					arg4 += local18;
					local104 = arg1 + 1;
					arg0[arg1] = local97;
					@Pc(109) int local109 = local104 + 1;
					arg0[local104] = local97;
					@Pc(114) int local114 = local109 + 1;
					arg0[local109] = local97;
					arg1 = local114 + 1;
					arg0[local114] = local97;
				}
			} else {
				local149 = anInt131;
				local153 = 256 - anInt131;
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray32[arg4 >> 8];
							local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
								local51--;
							} while (local51 > 0);
						}
						break;
					}
					local97 = anIntArray32[arg4 >> 8];
					arg4 += local18;
					local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					local104 = arg1 + 1;
					arg0[arg1] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg0[local104++] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg0[local104++] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg1 = local104 + 1;
					arg0[local104] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
				}
			}
		} else if (arg2 < arg3) {
			local18 = (arg5 - arg4) / (arg3 - arg2);
			if (aBoolean41) {
				if (arg3 > Class3_Sub1_Sub2.anInt764) {
					arg3 = Class3_Sub1_Sub2.anInt764;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
			}
			@Pc(408) int local408 = arg1 + arg2;
			local51 = arg3 - arg2;
			if (anInt131 == 0) {
				do {
					arg0[local408++] = anIntArray32[arg4 >> 8];
					arg4 += local18;
					local51--;
				} while (local51 > 0);
			} else {
				local149 = anInt131;
				local153 = 256 - anInt131;
				do {
					local97 = anIntArray32[arg4 >> 8];
					arg4 += local18;
					@Pc(467) int local467 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					arg0[local408++] = local467 + ((arg0[local408] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local408] & 0xFF00) * local149 >> 8 & 0xFF00);
					local51--;
				} while (local51 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "c", descriptor = "(IIIIIII)V")
	public static void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = 0;
		if (arg1 != arg0) {
			local3 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(18) int local18 = 0;
		if (arg2 != arg1) {
			local18 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(33) int local33 = 0;
		if (arg2 != arg0) {
			local33 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class3_Sub1_Sub2.anInt761) {
				if (arg1 > Class3_Sub1_Sub2.anInt761) {
					arg1 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local33 * arg0;
						arg3 -= local3 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local33 < local3 || arg0 == arg1 && local33 > local18) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local33 * arg0;
						arg3 -= local3 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local18 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local33 < local3 || arg0 == arg2 && local18 > local3) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class3_Sub1_Sub2.anInt758;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class3_Sub1_Sub2.anInt761) {
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg0 > Class3_Sub1_Sub2.anInt761) {
					arg0 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local3 * arg1;
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local33 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local3 < local18 || arg1 == arg2 && local3 > local33) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local3 * arg1;
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local33 * arg0;
						arg0 = 0;
					}
					if (local3 < local18) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class3_Sub1_Sub2.anInt758;
								}
							}
							method112(Class3_Sub1_Sub2.anIntArray181, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class3_Sub1_Sub2.anInt758;
						}
					}
				}
			}
		} else if (arg2 < Class3_Sub1_Sub2.anInt761) {
			if (arg0 > Class3_Sub1_Sub2.anInt761) {
				arg0 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg1 > Class3_Sub1_Sub2.anInt761) {
				arg1 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local18 * arg2;
					arg5 -= local33 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local3 * arg0;
					arg0 = 0;
				}
				if (local18 < local33) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local18 * arg2;
					arg5 -= local33 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local3 * arg1;
					arg1 = 0;
				}
				if (local18 < local33) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class3_Sub1_Sub2.anInt758;
							}
						}
						method112(Class3_Sub1_Sub2.anIntArray181, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class3_Sub1_Sub2.anInt758;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "([IIIIII)V")
	private static void method112(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean41) {
			if (arg4 > Class3_Sub1_Sub2.anInt764) {
				arg4 = Class3_Sub1_Sub2.anInt764;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(26) int local26 = arg4 - arg3 >> 2;
		@Pc(33) int local33;
		if (anInt131 == 0) {
			while (true) {
				local26--;
				if (local26 < 0) {
					local26 = arg4 - arg3 & 0x3;
					while (true) {
						local26--;
						if (local26 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local33 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local33++] = arg2;
				arg0[local33++] = arg2;
				arg1 = local33 + 1;
				arg0[local33] = arg2;
			}
			return;
		}
		@Pc(72) int local72 = anInt131;
		@Pc(76) int local76 = 256 - anInt131;
		@Pc(96) int local96 = ((arg2 & 0xFF00FF) * local76 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local76 >> 8 & 0xFF00);
		while (true) {
			local26--;
			if (local26 < 0) {
				local26 = arg4 - arg3 & 0x3;
				while (true) {
					local26--;
					if (local26 < 0) {
						return;
					}
					arg0[arg1++] = local96 + ((arg0[arg1] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local72 >> 8 & 0xFF00);
				}
			}
			local33 = arg1 + 1;
			arg0[arg1] = local96 + ((arg0[local33] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local33] & 0xFF00) * local72 >> 8 & 0xFF00);
			@Pc(130) int local130 = local33 + 1;
			arg0[local33] = local96 + ((arg0[local130] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local130] & 0xFF00) * local72 >> 8 & 0xFF00);
			@Pc(159) int local159 = local130 + 1;
			arg0[local130] = local96 + ((arg0[local159] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local159] & 0xFF00) * local72 >> 8 & 0xFF00);
			arg1 = local159 + 1;
			arg0[local159] = local96 + ((arg0[arg1] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local72 >> 8 & 0xFF00);
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = method106(arg18);
		aBoolean42 = !aBooleanArray2[arg18];
		@Pc(16) int local16 = arg9 - arg10;
		@Pc(20) int local20 = arg12 - arg13;
		@Pc(24) int local24 = arg15 - arg16;
		@Pc(28) int local28 = arg11 - arg9;
		@Pc(32) int local32 = arg14 - arg12;
		@Pc(36) int local36 = arg17 - arg15;
		@Pc(46) int local46 = local28 * arg12 - local32 * arg9 << 14;
		@Pc(56) int local56 = local32 * arg15 - local36 * arg12 << 8;
		@Pc(66) int local66 = local36 * arg9 - local28 * arg15 << 5;
		@Pc(76) int local76 = local16 * arg12 - local20 * arg9 << 14;
		@Pc(86) int local86 = local20 * arg15 - local24 * arg12 << 8;
		@Pc(96) int local96 = local24 * arg9 - local16 * arg15 << 5;
		@Pc(106) int local106 = local20 * local28 - local16 * local32 << 14;
		@Pc(116) int local116 = local24 * local32 - local20 * local36 << 8;
		@Pc(126) int local126 = local16 * local36 - local24 * local28 << 5;
		@Pc(128) int local128 = 0;
		@Pc(130) int local130 = 0;
		if (arg1 != arg0) {
			local128 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local130 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		@Pc(155) int local155 = 0;
		@Pc(157) int local157 = 0;
		if (arg2 != arg1) {
			local155 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local157 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		if (arg2 != arg0) {
			local182 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local184 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		@Pc(298) int local298;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class3_Sub1_Sub2.anInt761) {
				if (arg1 > Class3_Sub1_Sub2.anInt761) {
					arg1 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local182 * arg0;
						arg3 -= local128 * arg0;
						arg8 -= local184 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local155 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					local298 = arg0 - anInt133;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg0 != arg1 && local182 < local128 || arg0 == arg1 && local182 > local155) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local182 * arg0;
						arg3 -= local128 * arg0;
						arg7 -= local184 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local155 * arg2;
						arg8 -= local157 * arg2;
						arg2 = 0;
					}
					local298 = arg0 - anInt133;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if ((arg0 == arg2 || local182 >= local128) && (arg0 != arg2 || local155 <= local128)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray29[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class3_Sub1_Sub2.anInt761) {
				if (arg2 > Class3_Sub1_Sub2.anInt761) {
					arg2 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg0 > Class3_Sub1_Sub2.anInt761) {
					arg0 = Class3_Sub1_Sub2.anInt761;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local128 * arg1;
						arg4 -= local155 * arg1;
						arg6 -= local130 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local182 * arg2;
						arg8 -= local184 * arg2;
						arg2 = 0;
					}
					local298 = arg1 - anInt133;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg1 != arg2 && local128 < local155 || arg1 == arg2 && local128 > local182) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local128 * arg1;
						arg4 -= local155 * arg1;
						arg8 -= local130 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local182 * arg0;
						arg6 -= local184 * arg0;
						arg0 = 0;
					}
					local298 = arg1 - anInt133;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (local128 < local155) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray29[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class3_Sub1_Sub2.anInt758;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class3_Sub1_Sub2.anInt758;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg2 < Class3_Sub1_Sub2.anInt761) {
			if (arg0 > Class3_Sub1_Sub2.anInt761) {
				arg0 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg1 > Class3_Sub1_Sub2.anInt761) {
				arg1 = Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local155 * arg2;
					arg5 -= local182 * arg2;
					arg7 -= local157 * arg2;
					arg8 -= local184 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local128 * arg0;
					arg6 -= local130 * arg0;
					arg0 = 0;
				}
				local298 = arg2 - anInt133;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class3_Sub1_Sub2.anInt758;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class3_Sub1_Sub2.anInt758;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class3_Sub1_Sub2.anInt758;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class3_Sub1_Sub2.anInt758;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local155 * arg2;
					arg5 -= local182 * arg2;
					arg6 -= local157 * arg2;
					arg8 -= local184 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local128 * arg1;
					arg7 -= local130 * arg1;
					arg1 = 0;
				}
				local298 = arg2 - anInt133;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class3_Sub1_Sub2.anInt758;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class3_Sub1_Sub2.anInt758;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray29[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class3_Sub1_Sub2.anInt758;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method114(Class3_Sub1_Sub2.anIntArray181, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class3_Sub1_Sub2.anInt758;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!EHATXTET", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method114(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(15) int local15;
		@Pc(40) int local40;
		if (aBoolean41) {
			local15 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > Class3_Sub1_Sub2.anInt764) {
				arg6 = Class3_Sub1_Sub2.anInt764;
			}
			if (arg5 < 0) {
				arg7 -= arg5 * local15;
				arg5 = 0;
			}
			if (arg5 >= arg6) {
				return;
			}
			local40 = arg6 - arg5 >> 3;
			local15 <<= 0xC;
			arg7 <<= 0x9;
		} else {
			if (arg6 - arg5 > 7) {
				local40 = arg6 - arg5 >> 3;
				local15 = (arg8 - arg7) * anIntArray25[local40] >> 6;
			} else {
				local40 = 0;
				local15 = 0;
			}
			arg7 <<= 0x9;
		}
		arg4 += arg5;
		@Pc(89) int local89;
		@Pc(91) int local91;
		@Pc(123) int local123;
		@Pc(95) int local95;
		@Pc(188) int local188;
		@Pc(194) int local194;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (aBoolean40) {
			local89 = 0;
			local91 = 0;
			local95 = arg5 - anInt132;
			local103 = arg9 + (arg12 >> 3) * local95;
			local111 = arg10 + (arg13 >> 3) * local95;
			local119 = arg11 + (arg14 >> 3) * local95;
			local123 = local119 >> 12;
			if (local123 != 0) {
				arg2 = local103 / local123;
				arg3 = local111 / local123;
				if (arg2 < 0) {
					arg2 = 0;
				} else if (arg2 > 4032) {
					arg2 = 4032;
				}
			}
			arg9 = local103 + arg12;
			arg10 = local111 + arg13;
			arg11 = local119 + arg14;
			local123 = arg11 >> 12;
			if (local123 != 0) {
				local89 = arg9 / local123;
				local91 = arg10 / local123;
				if (local89 < 7) {
					local89 = 7;
				} else if (local89 > 4032) {
					local89 = 4032;
				}
			}
			local188 = local89 - arg2 >> 3;
			local194 = local91 - arg3 >> 3;
			arg2 += arg7 >> 3 & 0xC0000;
			local206 = arg7 >> 23;
			if (aBoolean42) {
				while (local40-- > 0) {
					local213 = arg4 + 1;
					arg0[arg4] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg4 = local213 + 1;
					arg0[local213] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 = local89;
					arg3 = local91;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local123 = arg11 >> 12;
					if (local123 != 0) {
						local89 = arg9 / local123;
						local91 = arg10 / local123;
						if (local89 < 7) {
							local89 = 7;
						} else if (local89 > 4032) {
							local89 = 4032;
						}
					}
					local188 = local89 - arg2 >> 3;
					local194 = local91 - arg3 >> 3;
					arg7 += local15;
					arg2 += arg7 >> 3 & 0xC0000;
					local206 = arg7 >> 23;
				}
				local40 = arg6 - arg5 & 0x7;
				while (local40-- > 0) {
					arg0[arg4++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
				}
			} else {
				while (local40-- > 0) {
					@Pc(507) int local507;
					if ((local507 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[arg4] = local507;
					}
					local213 = arg4 + 1;
					arg2 += local188;
					arg3 += local194;
					@Pc(534) int local534;
					if ((local534 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local534;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(561) int local561;
					if ((local561 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local561;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(588) int local588;
					if ((local588 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local588;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(615) int local615;
					if ((local615 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local615;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(642) int local642;
					if ((local642 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local642;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(669) int local669;
					if ((local669 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local669;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(696) int local696;
					if ((local696 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local696;
					}
					arg4 = local213 + 1;
					arg2 = local89;
					arg3 = local91;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local123 = arg11 >> 12;
					if (local123 != 0) {
						local89 = arg9 / local123;
						local91 = arg10 / local123;
						if (local89 < 7) {
							local89 = 7;
						} else if (local89 > 4032) {
							local89 = 4032;
						}
					}
					local188 = local89 - arg2 >> 3;
					local194 = local91 - arg3 >> 3;
					arg7 += local15;
					arg2 += arg7 >> 3 & 0xC0000;
					local206 = arg7 >> 23;
				}
				local40 = arg6 - arg5 & 0x7;
				while (local40-- > 0) {
					@Pc(796) int local796;
					if ((local796 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[arg4] = local796;
					}
					arg4++;
					arg2 += local188;
					arg3 += local194;
				}
			}
			return;
		}
		local89 = 0;
		local91 = 0;
		local95 = arg5 - anInt132;
		local103 = arg9 + (arg12 >> 3) * local95;
		local111 = arg10 + (arg13 >> 3) * local95;
		local119 = arg11 + (arg14 >> 3) * local95;
		local123 = local119 >> 14;
		if (local123 != 0) {
			arg2 = local103 / local123;
			arg3 = local111 / local123;
			if (arg2 < 0) {
				arg2 = 0;
			} else if (arg2 > 16256) {
				arg2 = 16256;
			}
		}
		arg9 = local103 + arg12;
		arg10 = local111 + arg13;
		arg11 = local119 + arg14;
		local123 = arg11 >> 14;
		if (local123 != 0) {
			local89 = arg9 / local123;
			local91 = arg10 / local123;
			if (local89 < 7) {
				local89 = 7;
			} else if (local89 > 16256) {
				local89 = 16256;
			}
		}
		local188 = local89 - arg2 >> 3;
		local194 = local91 - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		local206 = arg7 >> 23;
		if (aBoolean42) {
			while (local40-- > 0) {
				local213 = arg4 + 1;
				arg0[arg4] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(961) int local961 = local213 + 1;
				arg0[local213] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(984) int local984 = local961 + 1;
				arg0[local961] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1007) int local1007 = local984 + 1;
				arg0[local984] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1030) int local1030 = local1007 + 1;
				arg0[local1007] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1053) int local1053 = local1030 + 1;
				arg0[local1030] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1076) int local1076 = local1053 + 1;
				arg0[local1053] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				arg4 = local1076 + 1;
				arg0[local1076] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 = local89;
				arg3 = local91;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				local123 = arg11 >> 14;
				if (local123 != 0) {
					local89 = arg9 / local123;
					local91 = arg10 / local123;
					if (local89 < 7) {
						local89 = 7;
					} else if (local89 > 16256) {
						local89 = 16256;
					}
				}
				local188 = local89 - arg2 >> 3;
				local194 = local91 - arg3 >> 3;
				arg7 += local15;
				arg2 += arg7 & 0x600000;
				local206 = arg7 >> 23;
			}
			local40 = arg6 - arg5 & 0x7;
			while (local40-- > 0) {
				arg0[arg4++] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
			}
			return;
		}
		while (local40-- > 0) {
			@Pc(1230) int local1230;
			if ((local1230 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[arg4] = local1230;
			}
			local213 = arg4 + 1;
			arg2 += local188;
			arg3 += local194;
			@Pc(1257) int local1257;
			if ((local1257 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1257;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1284) int local1284;
			if ((local1284 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1284;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1311) int local1311;
			if ((local1311 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1311;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1338) int local1338;
			if ((local1338 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1338;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1365) int local1365;
			if ((local1365 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1365;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1392) int local1392;
			if ((local1392 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1392;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1419) int local1419;
			if ((local1419 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1419;
			}
			arg4 = local213 + 1;
			arg2 = local89;
			arg3 = local91;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			local123 = arg11 >> 14;
			if (local123 != 0) {
				local89 = arg9 / local123;
				local91 = arg10 / local123;
				if (local89 < 7) {
					local89 = 7;
				} else if (local89 > 16256) {
					local89 = 16256;
				}
			}
			local188 = local89 - arg2 >> 3;
			local194 = local91 - arg3 >> 3;
			arg7 += local15;
			arg2 += arg7 & 0x600000;
			local206 = arg7 >> 23;
		}
		local40 = arg6 - arg5 & 0x7;
		while (local40-- > 0) {
			@Pc(1517) int local1517;
			if ((local1517 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[arg4] = local1517;
			}
			arg4++;
			arg2 += local188;
			arg3 += local194;
		}
	}
}
