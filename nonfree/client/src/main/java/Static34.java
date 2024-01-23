import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Lclient!cn;")
	public static Class30 aClass30_2 = new Class30(512);

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString23 = "Discard";

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
	public static int method526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class134 local3 = new Class134();
		local3.anInt4130 = arg1 / 128;
		local3.anInt4129 = arg2 / 128;
		local3.anInt4131 = arg3 / 128;
		local3.anInt4119 = arg4 / 128;
		local3.anInt4114 = arg0;
		local3.anInt4116 = arg1;
		local3.anInt4115 = arg2;
		local3.anInt4122 = arg3;
		local3.anInt4120 = arg4;
		local3.anInt4117 = arg5;
		local3.anInt4125 = arg6;
		Static19.aClass134Array1[Static197.anInt5226++] = local3;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(III)Lclient!e;")
	public static Class3_Sub4_Sub7 method528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3_Sub4_Sub7 local11 = (Class3_Sub4_Sub7) Static263.aClass30_28.method663((long) arg1 << 32 | (long) arg0);
		if (local11 == null) {
			local11 = new Class3_Sub4_Sub7(arg1, arg0);
			Static263.aClass30_28.method668(local11, local11.aLong243);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!bg;IIIZILclient!hm;IIIZIII)Lclient!hm;")
	public static Class10_Sub4 method529(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class10_Sub4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) long local26 = (long) ((arg4 << 24) + (arg6 << 16) + arg3) + ((long) arg2 << 32) + ((long) arg10 << 48);
		@Pc(32) Class10_Sub4 local32 = (Class10_Sub4) Static123.aClass98_15.method2570(local26);
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(150) int local150;
		if (local32 == null) {
			@Pc(51) byte local51;
			if (arg3 == 1) {
				local51 = 9;
			} else if (arg3 == 2) {
				local51 = 12;
			} else if (arg3 == 3) {
				local51 = 15;
			} else if (arg3 == 4) {
				local51 = 18;
			} else {
				local51 = 21;
			}
			@Pc(84) int[] local84 = new int[] { 64, 96, 128 };
			@Pc(102) Class10_Sub3 local102 = new Class10_Sub3(local51 * 3 + 1, -local51 + local51 * 6, 0);
			@Pc(106) int[][] local106 = new int[3][local51];
			local112 = local102.method716(0, 0);
			for (local114 = 0; local114 < 3; local114++) {
				local121 = local84[local114];
				local125 = local84[local114];
				for (@Pc(127) int local127 = 0; local127 < local51; local127++) {
					@Pc(140) int local140 = (local127 << 11) / local51;
					local150 = local121 * Class11.anIntArray26[local140] + arg8 >> 16;
					@Pc(160) int local160 = Class11.anIntArray27[local140] * local125 + arg7 >> 16;
					local106[local114][local127] = local102.method716(local150, local160);
				}
			}
			for (local114 = 0; local114 < 3; local114++) {
				local121 = (local114 * 256 + 128) / 3;
				local125 = 256 - local121;
				@Pc(205) byte local205 = (byte) (arg4 * local121 + arg6 * local125 >> 8);
				@Pc(250) short local250 = (short) ((local121 * (arg10 & 0x7F) + local125 * (arg2 & 0x7F) & 0x7F00) + (local125 * (arg2 & 0xFC00) + (arg10 & 0xFC00) * local121 & 0xFC0000) + ((arg10 & 0x380) * local121 + (arg2 & 0x380) * local125 & 0x38000) >> 8);
				for (local150 = 0; local150 < local51; local150++) {
					if (local114 == 0) {
						local102.method705(local112, local106[0][(local150 + 1) % local51], local106[0][local150], local250, local205);
					} else {
						local102.method705(local106[local114 - 1][local150], local106[local114 - 1][(local150 + 1) % local51], local106[local114][(local150 + 1) % local51], local250, local205);
						local102.method705(local106[local114 - 1][local150], local106[local114][(local150 + 1) % local51], local106[local114][local150], local250, local205);
					}
				}
			}
			local32 = local102.method717(64, 768, -50, -10, -50);
			Static123.aClass98_15.method2568(local32, local26);
		}
		@Pc(372) int local372 = arg3 * 64 - 1;
		@Pc(375) int local375 = -local372;
		@Pc(378) int local378 = -local372;
		local112 = local372;
		@Pc(382) int local382 = local372;
		if (arg9) {
			if (arg12 > 1664 || arg12 < 384) {
				local378 -= 128;
			}
			if (arg12 > 640 && arg12 < 1408) {
				local112 = local372 + 128;
			}
			if (arg12 > 128 && arg12 < 896) {
				local375 -= 128;
			}
			if (arg12 > 1152 && arg12 < 1920) {
				local382 = local372 + 128;
			}
		}
		@Pc(421) int local421 = arg5.method1937();
		if (local375 > local421) {
			local421 = local375;
		}
		local114 = arg5.method1951();
		if (local382 < local114) {
			local114 = local382;
		}
		local121 = arg5.method1938();
		@Pc(444) Class3_Sub4_Sub11 local444 = null;
		local125 = arg5.method1952();
		if (local112 < local125) {
			local125 = local112;
		}
		if (local121 < local378) {
			local121 = local378;
		}
		if (arg0 != null) {
			@Pc(474) int local474 = arg0.anIntArray35[arg11];
			local444 = Static288.method4748(local474 >> 16);
			arg11 = local474 & 0xFFFF;
		}
		if (local444 == null) {
			local32 = local32.method1962(true, true, true);
			local32.method1960((local114 - local421) / 2, 128, (local125 - local121) / 2);
			local32.method1964((local114 + local421) / 2, 0, (local121 + local125) / 2);
		} else {
			local32 = local32.method1962(!local444.method1716(arg11), !local444.method1715(arg11), true);
			local32.method1960((local114 - local421) / 2, 128, (local125 - local121) / 2);
			local32.method1964((local114 + local421) / 2, 0, (local125 + local121) / 2);
			local32.method1959(local444, arg11);
		}
		if (arg12 != 0) {
			local32.method1940(arg12);
		}
		if (Static283.aBoolean393) {
			@Pc(660) Class10_Sub4_Sub1 local660 = (Class10_Sub4_Sub1) local32;
			if (Static122.method2036(local121 + arg7, local421 + arg8, Static99.anInt1826) != arg1 || Static122.method2036(arg7 + local125, local114 + arg8, Static99.anInt1826) != arg1) {
				for (local150 = 0; local150 < local660.anInt1798; local150++) {
					local660.anIntArray177[local150] += Static122.method2036(arg7 + local660.anIntArray173[local150], arg8 + local660.anIntArray174[local150], Static99.anInt1826) - arg1;
				}
				local660.aClass75_1.aBoolean161 = false;
				local660.aClass180_2.aBoolean409 = false;
			}
		} else {
			@Pc(588) Class10_Sub4_Sub2 local588 = (Class10_Sub4_Sub2) local32;
			if (arg1 != Static122.method2036(local121 + arg7, arg8 + local421, Static99.anInt1826) || Static122.method2036(arg7 + local125, local114 + arg8, Static99.anInt1826) != arg1) {
				for (local150 = 0; local150 < local588.anInt2224; local150++) {
					local588.anIntArray233[local150] += Static122.method2036(arg7 + local588.anIntArray245[local150], local588.anIntArray239[local150] + arg8, Static99.anInt1826) - arg1;
				}
				local588.aBoolean172 = false;
			}
		}
		return local32;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method531() {
		try {
			if (Static94.anInt1711 == 1) {
				@Pc(12) int local12 = Static204.aClass3_Sub15_Sub4_3.method4593();
				if (local12 > 0 && Static204.aClass3_Sub15_Sub4_3.method4577()) {
					local12 -= Static44.anInt828;
					if (local12 < 0) {
						local12 = 0;
					}
					Static204.aClass3_Sub15_Sub4_3.method4597(local12);
					return;
				}
				Static204.aClass3_Sub15_Sub4_3.method4592();
				Static204.aClass3_Sub15_Sub4_3.method4587();
				Static165.aClass3_Sub23_1 = null;
				Static2.aClass92_1 = null;
				if (Static310.aClass155_122 == null) {
					Static94.anInt1711 = 0;
				} else {
					Static94.anInt1711 = 2;
				}
			}
		} catch (@Pc(74) Exception local74) {
			local74.printStackTrace();
			Static204.aClass3_Sub15_Sub4_3.method4592();
			Static2.aClass92_1 = null;
			Static94.anInt1711 = 0;
			Static165.aClass3_Sub23_1 = null;
			Static310.aClass155_122 = null;
		}
	}
}
