import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString110 = "scroll:";

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[I")
	public static int[] anIntArray296 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
	public static int method2664() {
		return Static82.anInt1579;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([[I[[F[[B[[I[[I[[F[[B[[B[[B[[I[[II[[[II[[F[[[B)[Lclient!gj;")
	public static Class4_Sub14[] method2665(@OriginalArg(0) int[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(10) int[][] arg10, @OriginalArg(12) int[][][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) byte[][][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(55) byte local55;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local21 = 0;
				if (arg11 != null) {
					@Pc(36) int local36 = arg11[arg12][local11 >> 3][local16 >> 3];
					local21 = local36 >> 1 & 0x3;
				}
				if (local21 == 0) {
					local55 = arg8[local11][local16];
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16];
					}
					if (local55 == 0) {
						local55 = arg8[local11][local16 - 1];
					}
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16 - 1];
					}
				} else if (local21 == 1) {
					local55 = arg8[local11][local16 - 1];
					if (local55 == 0) {
						local55 = arg8[local11][local16];
					}
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16 - 1];
					}
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16];
					}
				} else if (local21 == 2) {
					local55 = arg8[local11 - 1][local16 - 1];
					if (local55 == 0) {
						local55 = arg8[local11][local16 - 1];
					}
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16];
					}
					if (local55 == 0) {
						local55 = arg8[local11][local16];
					}
				} else {
					local55 = arg8[local11 - 1][local16];
					if (local55 == 0) {
						local55 = arg8[local11 - 1][local16 - 1];
					}
					if (local55 == 0) {
						local55 = arg8[local11][local16];
					}
					if (local55 == 0) {
						local55 = arg8[local11][local16 - 1];
					}
				}
				if (local55 != 0) {
					@Pc(255) Class142 local255 = Static263.method722((local55 & 0xFF) - 1);
					local9[local11][local16] = local255.anInt4371 + (local255.anInt4374 + 1 << 16);
				}
			}
		}
		@Pc(280) Class97 local280 = new Class97(128);
		@Pc(351) int local351;
		@Pc(359) int local359;
		@Pc(327) int local327;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg8[local16][local21] != 0) {
					@Pc(307) int[] local307;
					if (arg6[local16][local21] == 0) {
						local307 = Static270.anIntArrayArray42[0];
					} else {
						local307 = Static281.anIntArrayArray46[arg2[local16][local21]];
						if (local307.length == 0) {
							continue;
						}
					}
					local327 = 0;
					if (arg9 != null) {
						local327 = arg9[local16][local21] & 0xFFFFFF;
					}
					@Pc(345) int local345 = local9[local16][local21 + 1];
					local351 = local9[local16][local21];
					local359 = local9[local16 + 1][local21];
					@Pc(367) long local367 = (long) local327 | (long) local351 << 32;
					@Pc(375) long local375 = (long) local359 << 32 | (long) local327;
					@Pc(385) int local385 = local9[local16 + 1][local21 + 1];
					@Pc(393) long local393 = (long) local385 << 32 | (long) local327;
					@Pc(401) long local401 = (long) local327 | (long) local345 << 32;
					@Pc(406) int local406 = local307.length / 2;
					@Pc(412) Class4_Sub14 local412 = (Class4_Sub14) local280.method2360(local367);
					if (local412 == null) {
						local412 = new Class4_Sub14((local351 >> 16) - 1, (float) (local351 & 0xFFFF), false, arg10 != null, local327);
						local280.method2364(local412, local367);
					}
					local412.anInt1877 += local406;
					local412.anInt1880++;
					if (local367 != local375) {
						local412 = (Class4_Sub14) local280.method2360(local375);
						if (local412 == null) {
							local412 = new Class4_Sub14((local359 >> 16) - 1, (float) (local359 & 0xFFFF), false, arg10 != null, local327);
							local280.method2364(local412, local375);
						}
						local412.anInt1877 += local406;
						local412.anInt1880++;
					}
					if (local367 != local393 && local393 != local375) {
						local412 = (Class4_Sub14) local280.method2360(local393);
						if (local412 == null) {
							local412 = new Class4_Sub14((local385 >> 16) - 1, (float) (local385 & 0xFFFF), false, arg10 != null, local327);
							local280.method2364(local412, local393);
						}
						local412.anInt1877 += local406;
						local412.anInt1880++;
					}
					if (local367 != local401 && local401 != local375 && local393 != local401) {
						local412 = (Class4_Sub14) local280.method2360(local401);
						if (local412 == null) {
							local412 = new Class4_Sub14((local345 >> 16) - 1, (float) (local345 & 0xFFFF), false, arg10 != null, local327);
							local280.method2364(local412, local401);
						}
						local412.anInt1880++;
						local412.anInt1877 += local406;
					}
				}
			}
		}
		@Pc(648) Class4_Sub14 local648;
		for (local648 = (Class4_Sub14) local280.method2363(); local648 != null; local648 = (Class4_Sub14) local280.method2367()) {
			local648.method1456();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				local55 = arg8[local16][local21];
				if (local55 != 0) {
					if ((arg14[arg12][local16][local21] & 0x8) != 0) {
						local327 = 0;
					} else if ((arg14[1][local16][local21] & 0x2) == 2 && arg12 > 0) {
						local327 = arg12 - 1;
					} else {
						local327 = arg12;
					}
					local351 = 0;
					@Pc(726) boolean[] local726 = null;
					local359 = 128;
					if (arg9 != null) {
						local359 = arg9[local16][local21] >>> 24 << 3;
						local351 = arg9[local16][local21] & 0xFFFFFF;
					}
					@Pc(847) int local847;
					@Pc(811) int local811;
					@Pc(779) int[] local779;
					@Pc(763) byte local763;
					@Pc(828) int local828;
					@Pc(904) int local904;
					if (arg6[local16][local21] == 0) {
						local779 = Static270.anIntArrayArray42[0];
						local811 = local55 == arg8[local16 + 1][local21 + 1] ? 1 : -1;
						local828 = arg8[local16 + 1][local21 - 1] == local55 ? 1 : -1;
						local847 = local55 == arg8[local16 - 1][local21 - 1] ? 1 : -1;
						if (arg8[local16][local21 - 1] == local55) {
							local828++;
							local847++;
						} else {
							local847--;
							local828--;
						}
						if (local55 == arg8[local16 + 1][local21]) {
							local828++;
							local811++;
						} else {
							local811--;
							local828--;
						}
						local904 = local55 == arg8[local16 - 1][local21 + 1] ? 1 : -1;
						if (arg8[local16][local21 + 1] == local55) {
							local811++;
							local904++;
						} else {
							local904--;
							local811--;
						}
						if (arg8[local16 - 1][local21] == local55) {
							local904++;
							local847++;
						} else {
							local847--;
							local904--;
						}
						@Pc(943) int local943 = local828 - local904;
						if (local943 < 0) {
							local943 = -local943;
						}
						@Pc(953) int local953 = local847 - local811;
						if (local953 < 0) {
							local953 = -local953;
						}
						local763 = (byte) (local953 < local943 ? 1 : 0);
						arg7[local16][local21] = local763;
					} else {
						local763 = arg7[local16][local21];
						local726 = Static93.aBooleanArrayArray3[arg2[local16][local21]];
						local779 = Static281.anIntArrayArray46[arg2[local16][local21]];
						if (local779.length == 0) {
							continue;
						}
					}
					local811 = local9[local16 + 1][local21 + 1];
					local828 = local9[local16 + 1][local21];
					local847 = local9[local16][local21];
					@Pc(1007) long local1007 = (long) local847 << 32 | (long) local351;
					@Pc(1015) long local1015 = (long) local351 | (long) local828 << 32;
					@Pc(1023) long local1023 = (long) local351 | (long) local811 << 32;
					@Pc(1031) int local1031 = arg0[local16 + 1][local21];
					@Pc(1041) int local1041 = arg0[local16 + 1][local21 + 1];
					@Pc(1047) int local1047 = arg0[local16][local21];
					@Pc(1055) int local1055 = arg0[local16][local21 + 1];
					@Pc(1063) int local1063 = arg4[local16 + 1][local21];
					@Pc(1073) int local1073 = arg4[local16 + 1][local21 + 1];
					local904 = local9[local16][local21 + 1];
					@Pc(1087) int local1087 = arg4[local16][local21];
					@Pc(1095) int local1095 = arg4[local16][local21 + 1];
					@Pc(1101) int local1101 = (local828 >> 16) - 1;
					@Pc(1109) long local1109 = (long) local904 << 32 | (long) local351;
					@Pc(1115) int local1115 = (local847 >> 16) - 1;
					@Pc(1121) int local1121 = (local811 >> 16) - 1;
					@Pc(1127) int local1127 = (local904 >> 16) - 1;
					@Pc(1133) Class4_Sub14 local1133 = (Class4_Sub14) local280.method2360(local1007);
					Static70.method3354(local847 >= local847, local16, local847 <= local904, local359, Static153.method2442(local1055, local1115, local1095), local811 >= local847, Static153.method2442(local1047, local1115, local1087), Static153.method2442(local1031, local1115, local1063), arg5, arg13, local1133, arg3, arg10, local21, local726, arg1, local779, local763, local828 >= local847, local327, Static153.method2442(local1041, local1115, local1073));
					if (local1015 != local1007) {
						local1133 = (Class4_Sub14) local280.method2360(local1015);
						Static70.method3354(local847 >= local828, local16, local904 >= local828, local359, Static153.method2442(local1055, local1101, local1095), local811 >= local828, Static153.method2442(local1047, local1101, local1087), Static153.method2442(local1031, local1101, local1063), arg5, arg13, local1133, arg3, arg10, local21, local726, arg1, local779, local763, local828 >= local828, local327, Static153.method2442(local1041, local1101, local1073));
					}
					if (local1007 != local1023 && local1015 != local1023) {
						local1133 = (Class4_Sub14) local280.method2360(local1023);
						Static70.method3354(local847 >= local811, local16, local904 >= local811, local359, Static153.method2442(local1055, local1121, local1095), local811 <= local811, Static153.method2442(local1047, local1121, local1087), Static153.method2442(local1031, local1121, local1063), arg5, arg13, local1133, arg3, arg10, local21, local726, arg1, local779, local763, local828 >= local811, local327, Static153.method2442(local1041, local1121, local1073));
					}
					if (local1007 != local1109 && local1015 != local1109 && local1023 != local1109) {
						local1133 = (Class4_Sub14) local280.method2360(local1109);
						Static70.method3354(local904 <= local847, local16, local904 <= local904, local359, Static153.method2442(local1055, local1127, local1095), local811 >= local904, Static153.method2442(local1047, local1127, local1087), Static153.method2442(local1031, local1127, local1063), arg5, arg13, local1133, arg3, arg10, local21, local726, arg1, local779, local763, local904 <= local828, local327, Static153.method2442(local1041, local1127, local1073));
					}
				}
			}
		}
		for (local648 = (Class4_Sub14) local280.method2363(); local648 != null; local648 = (Class4_Sub14) local280.method2367()) {
			if (local648.anInt1873 == 0) {
				local648.method4391();
			} else {
				local648.method1452();
			}
		}
		local16 = local280.method2362();
		@Pc(1527) long[] local1527 = new long[local16];
		@Pc(1530) Class4_Sub14[] local1530 = new Class4_Sub14[local16];
		local280.method2359(local1530);
		for (local327 = 0; local327 < local16; local327++) {
			local1527[local327] = local1530[local327].aLong200;
		}
		Static65.method1010(local1530, local1527);
		return local1530;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2666(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = Static286.method4297(arg0);
		if (local13 != -1) {
			@Pc(45) int[] local45 = Static23.aClass4_Sub2_Sub9_1.method1414(Static192.aClass9_2.anIntArray22[local13] >> 28 & 0x3, Static192.aClass9_2.anIntArray22[local13] & 0x3FFF, Static192.aClass9_2.anIntArray22[local13] >> 14 & 0x3FFF);
			Static237.method3672(local45[1], local45[2]);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(CZ)C")
	public static char method2667(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static void method2668() {
		anIntArray296 = null;
		aString110 = null;
		aStringArray27 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
	public static int method2669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}
}
