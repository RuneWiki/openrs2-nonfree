import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "Lclient!th;")
	public static Class168 aClass168_27;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
	private static boolean aBoolean63;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	public static int anInt849 = 0;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public static int anInt860 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([[F[[I[[I[[B[[[B[[B[[I[[F[[B[[BI[[[I[[F[[I[[II)[Lclient!ua;")
	public static Class1_Sub28[] method718(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(11) int[][][] arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int[][] arg13, @OriginalArg(15) int arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(53) byte local53;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local21 = 0;
				if (arg10 != null) {
					@Pc(36) int local36 = arg10[arg14][local11 >> 3][local16 >> 3];
					local21 = local36 >> 1 & 0x3;
				}
				if (local21 == 0) {
					local53 = arg9[local11][local16];
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16];
					}
					if (local53 == 0) {
						local53 = arg9[local11][local16 - 1];
					}
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16 - 1];
					}
				} else if (local21 == 1) {
					local53 = arg9[local11][local16 - 1];
					if (local53 == 0) {
						local53 = arg9[local11][local16];
					}
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16 - 1];
					}
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16];
					}
				} else if (local21 == 2) {
					local53 = arg9[local11 - 1][local16 - 1];
					if (local53 == 0) {
						local53 = arg9[local11][local16 - 1];
					}
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16];
					}
					if (local53 == 0) {
						local53 = arg9[local11][local16];
					}
				} else {
					local53 = arg9[local11 - 1][local16];
					if (local53 == 0) {
						local53 = arg9[local11 - 1][local16 - 1];
					}
					if (local53 == 0) {
						local53 = arg9[local11][local16];
					}
					if (local53 == 0) {
						local53 = arg9[local11][local16 - 1];
					}
				}
				if (local53 != 0) {
					@Pc(253) Class30 local253 = Static90.method1547((local53 & 0xFF) - 1);
					local9[local11][local16] = local253.anInt925 + (local253.anInt918 + 1 << 16);
				}
			}
		}
		@Pc(278) Class186 local278 = new Class186(128);
		@Pc(394) int local394;
		@Pc(346) int local346;
		@Pc(326) int local326;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg9[local16][local21] != 0) {
					@Pc(311) int[] local311;
					if (arg8[local16][local21] == 0) {
						local311 = Static162.anIntArrayArray41[0];
					} else {
						local311 = Static216.anIntArrayArray59[arg3[local16][local21]];
						if (local311.length == 0) {
							continue;
						}
					}
					local326 = 0;
					if (arg6 != null) {
						local326 = arg6[local16][local21] & 0xFFFFFF;
					}
					local346 = local9[local16 + 1][local21];
					@Pc(356) int local356 = local9[local16 + 1][local21 + 1];
					@Pc(364) int local364 = local9[local16][local21 + 1];
					@Pc(372) long local372 = (long) local326 | (long) local346 << 32;
					@Pc(380) long local380 = (long) local356 << 32 | (long) local326;
					@Pc(388) long local388 = (long) local326 | (long) local364 << 32;
					local394 = local9[local16][local21];
					@Pc(402) long local402 = (long) local326 | (long) local394 << 32;
					@Pc(407) int local407 = local311.length / 2;
					@Pc(413) Class1_Sub28 local413 = (Class1_Sub28) local278.method4570(local402);
					if (local413 == null) {
						local413 = new Class1_Sub28((local394 >> 16) - 1, (float) (local394 & 0xFFFF), false, arg2 != null, local326);
						local278.method4575(local402, local413);
					}
					local413.anInt5510++;
					local413.anInt5506 += local407;
					if (local402 != local372) {
						local413 = (Class1_Sub28) local278.method4570(local372);
						if (local413 == null) {
							local413 = new Class1_Sub28((local346 >> 16) - 1, (float) (local346 & 0xFFFF), false, arg2 != null, local326);
							local278.method4575(local372, local413);
						}
						local413.anInt5506 += local407;
						local413.anInt5510++;
					}
					if (local402 != local380 && local380 != local372) {
						local413 = (Class1_Sub28) local278.method4570(local380);
						if (local413 == null) {
							local413 = new Class1_Sub28((local356 >> 16) - 1, (float) (local356 & 0xFFFF), false, arg2 != null, local326);
							local278.method4575(local380, local413);
						}
						local413.anInt5510++;
						local413.anInt5506 += local407;
					}
					if (local402 != local388 && local388 != local372 && local380 != local388) {
						local413 = (Class1_Sub28) local278.method4570(local388);
						if (local413 == null) {
							local413 = new Class1_Sub28((local364 >> 16) - 1, (float) (local364 & 0xFFFF), false, arg2 != null, local326);
							local278.method4575(local388, local413);
						}
						local413.anInt5510++;
						local413.anInt5506 += local407;
					}
				}
			}
		}
		@Pc(653) Class1_Sub28 local653;
		for (local653 = (Class1_Sub28) local278.method4567(); local653 != null; local653 = (Class1_Sub28) local278.method4579()) {
			local653.method4168();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				local53 = arg9[local16][local21];
				if (local53 != 0) {
					if ((arg4[arg14][local16][local21] & 0x8) != 0) {
						local326 = 0;
					} else if ((arg4[1][local16][local21] & 0x2) == 2 && arg14 > 0) {
						local326 = arg14 - 1;
					} else {
						local326 = arg14;
					}
					local394 = 0;
					local346 = 128;
					if (arg6 != null) {
						local346 = arg6[local16][local21] >>> 24 << 3;
						local394 = arg6[local16][local21] & 0xFFFFFF;
					}
					@Pc(750) boolean[] local750 = null;
					@Pc(827) int local827;
					@Pc(867) int local867;
					@Pc(765) int[] local765;
					@Pc(771) byte local771;
					@Pc(806) int local806;
					@Pc(905) int local905;
					if (arg8[local16][local21] == 0) {
						local765 = Static162.anIntArrayArray41[0];
						local806 = local53 == arg9[local16 + 1][local21 - 1] ? 1 : -1;
						local827 = arg9[local16 - 1][local21 - 1] == local53 ? 1 : -1;
						if (local53 == arg9[local16][local21 - 1]) {
							local806++;
							local827++;
						} else {
							local806--;
							local827--;
						}
						local867 = local53 == arg9[local16 + 1][local21 + 1] ? 1 : -1;
						if (arg9[local16 + 1][local21] == local53) {
							local806++;
							local867++;
						} else {
							local806--;
							local867--;
						}
						local905 = local53 == arg9[local16 - 1][local21 + 1] ? 1 : -1;
						if (local53 == arg9[local16][local21 + 1]) {
							local905++;
							local867++;
						} else {
							local867--;
							local905--;
						}
						if (arg9[local16 - 1][local21] == local53) {
							local905++;
							local827++;
						} else {
							local827--;
							local905--;
						}
						@Pc(940) int local940 = local806 - local905;
						if (local940 < 0) {
							local940 = -local940;
						}
						@Pc(953) int local953 = local827 - local867;
						if (local953 < 0) {
							local953 = -local953;
						}
						local771 = (byte) (local940 > local953 ? 1 : 0);
						arg5[local16][local21] = local771;
					} else {
						local765 = Static216.anIntArrayArray59[arg3[local16][local21]];
						local771 = arg5[local16][local21];
						local750 = Static205.aBooleanArrayArray4[arg3[local16][local21]];
						if (local765.length == 0) {
							continue;
						}
					}
					local827 = local9[local16][local21];
					local867 = local9[local16 + 1][local21 + 1];
					local806 = local9[local16 + 1][local21];
					local905 = local9[local16][local21 + 1];
					@Pc(1018) long local1018 = (long) local394 | (long) local827 << 32;
					@Pc(1026) long local1026 = (long) local867 << 32 | (long) local394;
					@Pc(1034) long local1034 = (long) local905 << 32 | (long) local394;
					@Pc(1042) long local1042 = (long) local806 << 32 | (long) local394;
					@Pc(1048) int local1048 = arg12[local16][local21];
					@Pc(1058) int local1058 = arg12[local16 + 1][local21 + 1];
					@Pc(1066) int local1066 = arg12[local16 + 1][local21];
					@Pc(1072) int local1072 = arg13[local16][local21];
					@Pc(1080) int local1080 = arg13[local16 + 1][local21];
					@Pc(1088) int local1088 = arg12[local16][local21 + 1];
					@Pc(1098) int local1098 = arg13[local16 + 1][local21 + 1];
					@Pc(1106) int local1106 = arg13[local16][local21 + 1];
					@Pc(1112) int local1112 = (local827 >> 16) - 1;
					@Pc(1118) int local1118 = (local806 >> 16) - 1;
					@Pc(1124) int local1124 = (local905 >> 16) - 1;
					@Pc(1130) int local1130 = (local867 >> 16) - 1;
					@Pc(1136) Class1_Sub28 local1136 = (Class1_Sub28) local278.method4570(local1018);
					Static155.method2519(local346, local827 <= local806, arg2, arg0, arg11, arg7, local326, arg1, Static114.method1846(local1066, local1112, local1080), local827 >= local827, local21, local16, Static114.method1846(local1048, local1112, local1072), local1136, local905 >= local827, Static114.method1846(local1058, local1112, local1098), local750, local771, local765, local867 >= local827, Static114.method1846(local1088, local1112, local1106));
					if (local1018 != local1042) {
						local1136 = (Class1_Sub28) local278.method4570(local1042);
						Static155.method2519(local346, local806 >= local806, arg2, arg0, arg11, arg7, local326, arg1, Static114.method1846(local1066, local1118, local1080), local827 >= local806, local21, local16, Static114.method1846(local1048, local1118, local1072), local1136, local905 >= local806, Static114.method1846(local1058, local1118, local1098), local750, local771, local765, local867 >= local806, Static114.method1846(local1088, local1118, local1106));
					}
					if (local1026 != local1018 && local1026 != local1042) {
						local1136 = (Class1_Sub28) local278.method4570(local1026);
						Static155.method2519(local346, local867 <= local806, arg2, arg0, arg11, arg7, local326, arg1, Static114.method1846(local1066, local1130, local1080), local827 >= local867, local21, local16, Static114.method1846(local1048, local1130, local1072), local1136, local905 >= local867, Static114.method1846(local1058, local1130, local1098), local750, local771, local765, local867 <= local867, Static114.method1846(local1088, local1130, local1106));
					}
					if (local1018 != local1034 && local1042 != local1034 && local1034 != local1026) {
						local1136 = (Class1_Sub28) local278.method4570(local1034);
						Static155.method2519(local346, local806 >= local905, arg2, arg0, arg11, arg7, local326, arg1, Static114.method1846(local1066, local1124, local1080), local827 >= local905, local21, local16, Static114.method1846(local1048, local1124, local1072), local1136, local905 >= local905, Static114.method1846(local1058, local1124, local1098), local750, local771, local765, local867 >= local905, Static114.method1846(local1088, local1124, local1106));
					}
				}
			}
		}
		for (local653 = (Class1_Sub28) local278.method4567(); local653 != null; local653 = (Class1_Sub28) local278.method4579()) {
			if (local653.anInt5505 == 0) {
				local653.method4767();
			} else {
				local653.method4169();
			}
		}
		local16 = local278.method4576();
		@Pc(1502) long[] local1502 = new long[local16];
		@Pc(1505) Class1_Sub28[] local1505 = new Class1_Sub28[local16];
		local278.method4571(local1505);
		for (local326 = 0; local326 < local16; local326++) {
			local1502[local326] = local1505[local326].aLong247;
		}
		Static149.method2418(local1505, local1502);
		return local1505;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!qm;)V")
	public static void method722(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(9) int local9 = arg0.method2187();
		Static254.aClass137Array1 = new Class137[local9];
		@Pc(63) int local63;
		for (local63 = 0; local63 < local9; local63++) {
			Static254.aClass137Array1[local63] = new Class137();
			Static254.aClass137Array1[local63].anInt4703 = arg0.method2187();
			Static254.aClass137Array1[local63].aString329 = arg0.method2226();
		}
		Static8.anInt228 = arg0.method2187();
		Static145.anInt6068 = arg0.method2187();
		Static250.anInt5103 = arg0.method2187();
		Static259.aClass80_Sub1Array1 = new Class80_Sub1[Static145.anInt6068 + 1 - Static8.anInt228];
		for (local63 = 0; local63 < Static250.anInt5103; local63++) {
			@Pc(122) int local122 = arg0.method2187();
			@Pc(130) Class80_Sub1 local130 = Static259.aClass80_Sub1Array1[local122] = new Class80_Sub1();
			local130.anInt2577 = arg0.method2199();
			local130.anInt2569 = arg0.method2194();
			local130.anInt2583 = local122 + Static8.anInt228;
			local130.aString161 = arg0.method2226();
			local130.aString164 = arg0.method2226();
		}
		Static125.anInt2712 = arg0.method2194();
		Static155.aBoolean224 = true;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	public static void method728() {
		Static122.aClass191Array1 = null;
		Static251.method4180(Static38.anInt950, -1, 0, 0, 0, Static270.anInt5412, 0, Static36.anInt902);
		if (Static122.aClass191Array1 != null) {
			Static181.method2925(Static270.anInt5412, Static302.anInt5987, -1412584499, Static122.aClass191Array1, Static120.aClass191_18.anInt6133, Static38.anInt950, 0, 0, Static282.anInt5659);
			Static122.aClass191Array1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!ei;")
	public static Class44 method729(@OriginalArg(1) int arg0) {
		@Pc(10) Class44 local10 = (Class44) Static173.aClass89_25.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static50.aClass168_12.method4058(arg0, 34);
		local10 = new Class44();
		if (local27 != null) {
			local10.method1108(new Class1_Sub14(local27), arg0);
		}
		Static173.aClass89_25.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	public static void method731() {
		for (@Pc(10) Class1_Sub12 local10 = (Class1_Sub12) Static48.aClass186_5.method4567(); local10 != null; local10 = (Class1_Sub12) Static48.aClass186_5.method4579()) {
			@Pc(15) int local15 = local10.anInt2208;
			if (Static99.method1656(local15)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class191[] local26 = Static34.aClass191ArrayArray1[local15];
				@Pc(28) int local28;
				for (local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean408;
						break;
					}
				}
				if (!local22) {
					local28 = (int) local10.aLong247;
					@Pc(60) Class191 local60 = Static171.method2789(local28);
					if (local60 != null) {
						Static40.method817(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	public static void method732() {
		Static289.aClass89_47.method2265();
	}
}
