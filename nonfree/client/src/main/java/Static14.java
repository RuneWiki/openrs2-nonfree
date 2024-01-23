import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public static int anInt345 = 0;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
	public static int[] anIntArray21 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString21 = "Loaded config";

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	public static int anInt348 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BIIII)V")
	public static void method305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static290.anInt6021 = arg0;
		Static43.anInt1054 = arg1;
		Static127.anInt2664 = 0;
		Static68.anInt1509 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	public static String method308(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static121.anInterface3_1 != null) {
			@Pc(17) String local17 = Static121.anInterface3_1.method4659(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLclient!mn;II)V")
	public static void method309(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class115 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1.anInt3555;
		if (arg1.aByte16 == 0) {
			arg1.anInt3555 = arg1.anInt3530;
		} else if (arg1.aByte16 == 1) {
			arg1.anInt3555 = arg3 - arg1.anInt3530;
		} else if (arg1.aByte16 == 2) {
			arg1.anInt3555 = arg3 * arg1.anInt3530 >> 14;
		} else if (arg1.aByte16 == 3) {
			if (arg1.anInt3538 == 2) {
				arg1.anInt3555 = arg1.anInt3530 * 32 + arg1.anInt3489 * (arg1.anInt3530 - 1);
			} else if (arg1.anInt3538 == 7) {
				arg1.anInt3555 = (arg1.anInt3530 - 1) * arg1.anInt3489 + arg1.anInt3530 * 115;
			}
		}
		@Pc(100) int local100 = arg1.anInt3487;
		if (arg1.aByte17 == 0) {
			arg1.anInt3487 = arg1.anInt3475;
		} else if (arg1.aByte17 == 1) {
			arg1.anInt3487 = arg2 - arg1.anInt3475;
		} else if (arg1.aByte17 == 2) {
			arg1.anInt3487 = arg1.anInt3475 * arg2 >> 14;
		} else if (arg1.aByte17 == 3) {
			if (arg1.anInt3538 == 2) {
				arg1.anInt3487 = arg1.anInt3492 * (arg1.anInt3475 - 1) + arg1.anInt3475 * 32;
			} else if (arg1.anInt3538 == 7) {
				arg1.anInt3487 = (arg1.anInt3475 - 1) * arg1.anInt3492 + arg1.anInt3475 * 12;
			}
		}
		if (arg1.aByte16 == 4) {
			arg1.anInt3555 = arg1.anInt3497 * arg1.anInt3487 / arg1.anInt3535;
		}
		if (arg1.aByte17 == 4) {
			arg1.anInt3487 = arg1.anInt3535 * arg1.anInt3555 / arg1.anInt3497;
		}
		if (Static202.aBoolean348 && (Static35.method708(arg1).anInt1534 != 0 || arg1.anInt3538 == 0)) {
			if (arg1.anInt3487 < 5 && arg1.anInt3555 < 5) {
				arg1.anInt3555 = 5;
				arg1.anInt3487 = 5;
			} else {
				if (arg1.anInt3555 <= 0) {
					arg1.anInt3555 = 5;
				}
				if (arg1.anInt3487 <= 0) {
					arg1.anInt3487 = 5;
				}
			}
		}
		if (arg1.anInt3544 == 1337) {
			Static74.aClass115_8 = arg1;
		}
		if (arg0 && arg1.anObjectArray6 != null && (arg1.anInt3555 != local12 || arg1.anInt3487 != local100)) {
			@Pc(297) Class2_Sub6 local297 = new Class2_Sub6();
			local297.anObjectArray1 = arg1.anObjectArray6;
			local297.aClass115_4 = arg1;
			Static225.aClass1_20.method11(local297);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([[[B[[F[[I[[F[[I[[B[[B[[II[[IB[[[I[[B[[I[[F[[B)[Lclient!fn;")
	public static Class2_Sub12[] method313(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(11) int[][][] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) byte[][] arg14) {
		@Pc(5) int[][] local5 = new int[105][105];
		@Pc(14) int local14;
		@Pc(21) int local21;
		@Pc(36) int local36;
		for (@Pc(7) int local7 = 1; local7 <= 103; local7++) {
			for (local14 = 1; local14 <= 103; local14++) {
				local21 = 0;
				if (arg10 != null) {
					local36 = arg10[arg8][local7 >> 3][local14 >> 3];
					local21 = local36 >> 1 & 0x3;
				}
				@Pc(69) byte local69;
				if (local21 == 0) {
					local69 = arg14[local7][local14];
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14];
					}
					if (local69 == 0) {
						local69 = arg14[local7][local14 - 1];
					}
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14 - 1];
					}
				} else if (local21 == 1) {
					local69 = arg14[local7][local14 - 1];
					if (local69 == 0) {
						local69 = arg14[local7][local14];
					}
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14 - 1];
					}
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14];
					}
				} else if (local21 == 2) {
					local69 = arg14[local7 - 1][local14 - 1];
					if (local69 == 0) {
						local69 = arg14[local7][local14 - 1];
					}
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14];
					}
					if (local69 == 0) {
						local69 = arg14[local7][local14];
					}
				} else {
					local69 = arg14[local7 - 1][local14];
					if (local69 == 0) {
						local69 = arg14[local7 - 1][local14 - 1];
					}
					if (local69 == 0) {
						local69 = arg14[local7][local14];
					}
					if (local69 == 0) {
						local69 = arg14[local7][local14 - 1];
					}
				}
				if (local69 != 0) {
					@Pc(262) Class87 local262 = Static110.method2045((local69 & 0xFF) - 1);
					local5[local7][local14] = local262.anInt2593 + (local262.anInt2586 + 1 << 16);
				}
			}
		}
		@Pc(291) Class79 local291 = new Class79(128);
		@Pc(343) int local343;
		@Pc(351) int local351;
		@Pc(361) int local361;
		@Pc(412) long local412;
		@Pc(337) int local337;
		for (local14 = 1; local14 <= 102; local14++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg14[local14][local21] != 0) {
					@Pc(326) int[] local326;
					if (arg5[local14][local21] == 0) {
						local326 = Static96.anIntArrayArray21[0];
					} else {
						local326 = Static79.anIntArrayArray18[arg6[local14][local21]];
						if (local326.length == 0) {
							continue;
						}
					}
					local337 = 0;
					local343 = local5[local14][local21];
					local351 = local5[local14 + 1][local21];
					local361 = local5[local14 + 1][local21 + 1];
					@Pc(369) int local369 = local5[local14][local21 + 1];
					if (arg2 != null) {
						local337 = arg2[local14][local21] & 0xFFFFFF;
					}
					@Pc(388) long local388 = (long) local343 << 32 | (long) local337;
					@Pc(396) long local396 = (long) local351 << 32 | (long) local337;
					@Pc(404) long local404 = (long) local361 << 32 | (long) local337;
					local412 = (long) local337 | (long) local369 << 32;
					@Pc(417) int local417 = local326.length / 2;
					@Pc(423) Class2_Sub12 local423 = (Class2_Sub12) local291.method2002(local388);
					if (local423 == null) {
						local423 = new Class2_Sub12((local343 >> 16) - 1, (float) (local343 & 0xFFFF), false, arg4 != null, local337);
						local291.method1994(local388, local423);
					}
					local423.anInt1669 += local417;
					local423.anInt1664++;
					if (local388 != local396) {
						local423 = (Class2_Sub12) local291.method2002(local396);
						if (local423 == null) {
							local423 = new Class2_Sub12((local351 >> 16) - 1, (float) (local351 & 0xFFFF), false, arg4 != null, local337);
							local291.method1994(local396, local423);
						}
						local423.anInt1669 += local417;
						local423.anInt1664++;
					}
					if (local404 != local388 && local396 != local404) {
						local423 = (Class2_Sub12) local291.method2002(local404);
						if (local423 == null) {
							local423 = new Class2_Sub12((local361 >> 16) - 1, (float) (local361 & 0xFFFF), false, arg4 != null, local337);
							local291.method1994(local404, local423);
						}
						local423.anInt1669 += local417;
						local423.anInt1664++;
					}
					if (local412 != local388 && local412 != local396 && local404 != local412) {
						local423 = (Class2_Sub12) local291.method2002(local412);
						if (local423 == null) {
							local423 = new Class2_Sub12((local369 >> 16) - 1, (float) (local369 & 0xFFFF), false, arg4 != null, local337);
							local291.method1994(local412, local423);
						}
						local423.anInt1669 += local417;
						local423.anInt1664++;
					}
				}
			}
		}
		@Pc(660) Class2_Sub12 local660;
		for (local660 = (Class2_Sub12) local291.method1992(); local660 != null; local660 = (Class2_Sub12) local291.method1991()) {
			local660.method1396();
		}
		for (local14 = 1; local14 <= 102; local14++) {
			for (local36 = 1; local36 <= 102; local36++) {
				@Pc(698) byte local698 = arg14[local14][local36];
				if (local698 != 0) {
					local351 = 0;
					if ((arg0[arg8][local14][local36] & 0x8) != 0) {
						local343 = 0;
					} else if ((arg0[1][local14][local36] & 0x2) == 2 && arg8 > 0) {
						local343 = arg8 - 1;
					} else {
						local343 = arg8;
					}
					local361 = 128;
					if (arg2 != null) {
						local361 = arg2[local14][local36] >>> 24 << 3;
						local351 = arg2[local14][local36] & 0xFFFFFF;
					}
					@Pc(769) boolean[] local769 = null;
					@Pc(849) int local849;
					@Pc(921) int local921;
					@Pc(800) int[] local800;
					@Pc(784) byte local784;
					@Pc(830) int local830;
					@Pc(885) int local885;
					if (arg5[local14][local36] == 0) {
						local800 = Static96.anIntArrayArray21[0];
						local830 = local698 == arg14[local14 - 1][local36 - 1] ? 1 : -1;
						local849 = local698 == arg14[local14 + 1][local36 - 1] ? 1 : -1;
						if (arg14[local14][local36 - 1] == local698) {
							local849++;
							local830++;
						} else {
							local849--;
							local830--;
						}
						local885 = local698 == arg14[local14 + 1][local36 + 1] ? 1 : -1;
						if (local698 == arg14[local14 + 1][local36]) {
							local885++;
							local849++;
						} else {
							local885--;
							local849--;
						}
						local921 = arg14[local14 - 1][local36 + 1] == local698 ? 1 : -1;
						if (arg14[local14][local36 + 1] == local698) {
							local921++;
							local885++;
						} else {
							local921--;
							local885--;
						}
						if (local698 == arg14[local14 - 1][local36]) {
							local830++;
							local921++;
						} else {
							local830--;
							local921--;
						}
						@Pc(960) int local960 = local830 - local885;
						@Pc(965) int local965 = local849 - local921;
						if (local960 < 0) {
							local960 = -local960;
						}
						if (local965 < 0) {
							local965 = -local965;
						}
						local784 = (byte) (local960 < local965 ? 1 : 0);
						arg11[local14][local36] = local784;
					} else {
						local784 = arg11[local14][local36];
						local769 = Static54.aBooleanArrayArray2[arg6[local14][local36]];
						local800 = Static79.anIntArrayArray18[arg6[local14][local36]];
						if (local800.length == 0) {
							continue;
						}
					}
					local830 = local5[local14][local36];
					local849 = local5[local14 + 1][local36];
					local885 = local5[local14 + 1][local36 + 1];
					local921 = local5[local14][local36 + 1];
					local412 = (long) local351 | (long) local830 << 32;
					@Pc(1044) long local1044 = (long) local351 | (long) local849 << 32;
					@Pc(1052) long local1052 = (long) local351 | (long) local885 << 32;
					@Pc(1060) long local1060 = (long) local351 | (long) local921 << 32;
					@Pc(1066) int local1066 = arg7[local14][local36];
					@Pc(1074) int local1074 = arg7[local14 + 1][local36];
					@Pc(1082) int local1082 = arg7[local14][local36 + 1];
					@Pc(1092) int local1092 = arg7[local14 + 1][local36 + 1];
					@Pc(1098) int local1098 = arg9[local14][local36];
					@Pc(1108) int local1108 = arg9[local14 + 1][local36 + 1];
					@Pc(1116) int local1116 = arg9[local14 + 1][local36];
					@Pc(1122) int local1122 = (local830 >> 16) - 1;
					@Pc(1130) int local1130 = arg9[local14][local36 + 1];
					@Pc(1136) int local1136 = (local885 >> 16) - 1;
					@Pc(1142) int local1142 = (local849 >> 16) - 1;
					@Pc(1148) int local1148 = (local921 >> 16) - 1;
					@Pc(1154) Class2_Sub12 local1154 = (Class2_Sub12) local291.method2002(local412);
					Static262.method4943(arg4, local14, local36, local849 >= local830, local769, local830 <= local885, arg12, local800, local921 >= local830, Static25.method4638(local1092, local1108, local1122), local361, arg13, Static25.method4638(local1074, local1116, local1122), arg1, local343, local1154, Static25.method4638(local1066, local1098, local1122), arg3, local830 <= local830, Static25.method4638(local1082, local1130, local1122), local784);
					if (local1044 != local412) {
						local1154 = (Class2_Sub12) local291.method2002(local1044);
						Static262.method4943(arg4, local14, local36, local849 <= local849, local769, local849 <= local885, arg12, local800, local921 >= local849, Static25.method4638(local1092, local1108, local1142), local361, arg13, Static25.method4638(local1074, local1116, local1142), arg1, local343, local1154, Static25.method4638(local1066, local1098, local1142), arg3, local849 <= local830, Static25.method4638(local1082, local1130, local1142), local784);
					}
					if (local1052 != local412 && local1052 != local1044) {
						local1154 = (Class2_Sub12) local291.method2002(local1052);
						Static262.method4943(arg4, local14, local36, local885 <= local849, local769, local885 <= local885, arg12, local800, local921 >= local885, Static25.method4638(local1092, local1108, local1136), local361, arg13, Static25.method4638(local1074, local1116, local1136), arg1, local343, local1154, Static25.method4638(local1066, local1098, local1136), arg3, local885 <= local830, Static25.method4638(local1082, local1130, local1136), local784);
					}
					if (local412 != local1060 && local1044 != local1060 && local1060 != local1052) {
						local1154 = (Class2_Sub12) local291.method2002(local1060);
						Static262.method4943(arg4, local14, local36, local849 >= local921, local769, local921 <= local885, arg12, local800, local921 <= local921, Static25.method4638(local1092, local1108, local1148), local361, arg13, Static25.method4638(local1074, local1116, local1148), arg1, local343, local1154, Static25.method4638(local1066, local1098, local1148), arg3, local830 >= local921, Static25.method4638(local1082, local1130, local1148), local784);
					}
				}
			}
		}
		for (local660 = (Class2_Sub12) local291.method1992(); local660 != null; local660 = (Class2_Sub12) local291.method1991()) {
			if (local660.anInt1663 == 0) {
				local660.method4926();
			} else {
				local660.method1397();
			}
		}
		local14 = local291.method1996();
		@Pc(1506) Class2_Sub12[] local1506 = new Class2_Sub12[local14];
		local291.method1997(local1506);
		@Pc(1514) long[] local1514 = new long[local14];
		for (local337 = 0; local337 < local14; local337++) {
			local1514[local337] = local1506[local337].aLong315;
		}
		Static38.method731(local1514, local1506);
		return local1506;
	}
}
