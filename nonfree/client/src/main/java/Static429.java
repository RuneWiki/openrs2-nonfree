import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public static int anInt7139;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Lclient!lt;")
	public static Class158 aClass158_93;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
	public static final int[] anIntArray616 = new int[14];

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "[Lclient!fn;")
	public static final Class83[] aClass83Array4 = new Class83[14];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIB)V")
	public static void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static80.anInt1571 == 1) {
			Static165.aClass12Array10[Static133.anInt2347 / 100].method5665(Static257.anInt4382 - 8, Static12.anInt190 + -8);
		}
		if (Static80.anInt1571 == 2) {
			Static165.aClass12Array10[Static133.anInt2347 / 100 + 4].method5665(Static257.anInt4382 - 8, Static12.anInt190 + -8);
		}
		Static53.method970();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static367.method5802(arg3)) {
			if (Static419.aClass239ArrayArray2[arg3] == null) {
				Static72.method1403(arg5, -1, arg7, arg0, arg2, arg1, arg4, arg6, Static129.aClass239ArrayArray1[arg3]);
			} else {
				Static72.method1403(arg5, -1, arg7, arg0, arg2, arg1, arg4, arg6, Static419.aClass239ArrayArray2[arg3]);
			}
		} else if (arg7 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static194.aBooleanArray25[local15] = true;
			}
		} else {
			Static194.aBooleanArray25[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public static void method5847() {
		if (Static8.anInt159 == -1 || Static125.anInt2215 == -1) {
			return;
		}
		@Pc(22) int local22 = (Static135.anInt2408 * (Static155.anInt2773 - Static207.anInt3616) >> 16) + Static207.anInt3616;
		Static135.anInt2408 += local22;
		if (Static135.anInt2408 < 65535) {
			Static231.aBoolean259 = false;
			Static26.aBoolean176 = false;
		} else {
			if (Static231.aBoolean259) {
				Static26.aBoolean176 = false;
			} else {
				Static26.aBoolean176 = true;
			}
			Static135.anInt2408 = 65535;
			Static231.aBoolean259 = true;
		}
		@Pc(54) float local54 = (float) Static135.anInt2408 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static413.anInt6909 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static138.anIntArrayArrayArray13[Static8.anInt159][local61][local63] * 3;
			local87 = Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 1][local63] * 3;
			local120 = (Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 2][local63] + Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 2][local63] - Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 3][local63]) * 3;
			local128 = Static138.anIntArrayArrayArray13[Static8.anInt159][local61][local63];
			local133 = local87 - local75;
			local141 = local120 + local75 - local87 * 2;
			local159 = local87 + Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 2][local63] - local120 - local128;
			local57[local63] = local54 * ((float) local133 + local54 * ((float) local159 * local54 + (float) local141)) + (float) local128;
		}
		Static214.anInt3730 = (int) local57[2] - Static99.anInt1814 * 128;
		Static32.anInt521 = (int) local57[0] - Static206.anInt3592 * 128;
		Static354.anInt5973 = (int) local57[1] * -1;
		@Pc(214) float[] local214 = new float[3];
		local87 = Static419.anInt7008 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static138.anIntArrayArrayArray13[Static125.anInt2215][local87][local120] * 3;
			local133 = Static138.anIntArrayArrayArray13[Static125.anInt2215][local87 + 1][local120] * 3;
			local141 = (Static138.anIntArrayArrayArray13[Static125.anInt2215][local87 + 2][local120] + Static138.anIntArrayArrayArray13[Static125.anInt2215][local87 + 2][local120] - Static138.anIntArrayArrayArray13[Static125.anInt2215][local87 + 3][local120]) * 3;
			local159 = Static138.anIntArrayArrayArray13[Static125.anInt2215][local87][local120];
			@Pc(289) int local289 = local133 - local128;
			@Pc(297) int local297 = local141 + local128 - local133 * 2;
			@Pc(314) int local314 = local133 + Static138.anIntArrayArrayArray13[Static125.anInt2215][local87 + 2][local120] - local141 - local159;
			local214[local120] = (float) local159 + (((float) local314 * local54 + (float) local297) * local54 + (float) local289) * local54;
		}
		@Pc(349) float local349 = local214[0] - local57[0];
		@Pc(368) float local368 = -1.0F * (local214[1] - local57[1]);
		@Pc(377) float local377 = local214[2] - local57[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local349 * local349));
		Static303.anInt4990 = (int) (Math.atan2((double) local368, local387) * 2607.5945876176133D) & 0x3FFF;
		Static217.anInt3768 = (int) (-Math.atan2((double) local349, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static189.anInt6581 = (Static135.anInt2408 * (Static138.anIntArrayArrayArray13[Static8.anInt159][local61 + 2][3] - Static138.anIntArrayArrayArray13[Static8.anInt159][local61][3]) >> 16) + Static138.anIntArrayArrayArray13[Static8.anInt159][local61][3];
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILclient!hf;Ljava/awt/Component;I)Lclient!wl;")
	public static Class105 method5850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) Component arg3) {
		if (Static203.anInt3580 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class105 local33 = (Class105) Class.forName("Class105_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray542 = new int[(Static24.aBoolean29 ? 2 : 1) * 256];
			local33.anInt6192 = arg0;
			local33.method5172(arg3);
			local33.anInt6191 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt6191 > 16384) {
				local33.anInt6191 = 16384;
			}
			local33.method5169(local33.anInt6191);
			if (Static233.anInt3977 > 0 && Static19.aClass252_1 == null) {
				Static19.aClass252_1 = new Class252();
				Static19.aClass252_1.aClass103_5 = arg2;
				arg2.method2374(Static233.anInt3977, Static19.aClass252_1);
			}
			if (Static19.aClass252_1 != null) {
				if (Static19.aClass252_1.aClass105Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static19.aClass252_1.aClass105Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class105_Sub2 local112 = new Class105_Sub2(arg2, arg1);
				local112.anIntArray542 = new int[(Static24.aBoolean29 ? 2 : 1) * 256];
				local112.anInt6192 = arg0;
				local112.method5172(arg3);
				local112.anInt6191 = 16384;
				local112.method5169(local112.anInt6191);
				if (Static233.anInt3977 > 0 && Static19.aClass252_1 == null) {
					Static19.aClass252_1 = new Class252();
					Static19.aClass252_1.aClass103_5 = arg2;
					arg2.method2374(Static233.anInt3977, Static19.aClass252_1);
				}
				if (Static19.aClass252_1 != null) {
					if (Static19.aClass252_1.aClass105Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static19.aClass252_1.aClass105Array1[arg1] = local112;
				}
				return local112;
			} catch (@Pc(179) Throwable local179) {
				return new Class105();
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
	public static void method5852() {
		Static298.aClass88_39.method1887();
		for (@Pc(13) Class6_Sub33 local13 = (Class6_Sub33) Static307.aClass88_23.method1882(); local13 != null; local13 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			if (local13.anInt5954 < 1000) {
				local13.method5977();
				Static298.aClass88_39.method1878(local13);
			}
		}
		Static298.aClass88_39.method1886(Static307.aClass88_23);
		@Pc(41) int local41 = -1;
		@Pc(46) Class6_Sub7 local46 = (Class6_Sub7) Static254.aClass88_34.method1882();
		if (local46 != null) {
			local41 = local46.method1261();
		}
		if (!Static206.aBoolean239) {
			if (local41 == 0 && (Static112.anInt6364 == 1 && Static228.anInt3878 > 2 || Static208.method3243())) {
				local41 = 2;
			}
			if (local41 == 2 && Static228.anInt3878 > 0 && local46 != null) {
				if (Static332.aClass239_12 == null && Static203.anInt3586 == 0) {
					Static419.method5689(local46.method1258(), local46.method1257());
				} else {
					Static122.anInt2160 = 2;
				}
			}
			if (local41 == 0 && Static228.anInt3878 > 0) {
				Static192.method3028();
			}
			if (Static332.aClass239_12 != null || Static203.anInt3586 != 0) {
				return;
			}
			Static80.aClass6_Sub33_1 = null;
			Static122.anInt2160 = 0;
			return;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local41 == -1) {
			local67 = Static37.aClass71_26.method1618();
			local71 = Static37.aClass71_26.method1624();
			if (Static203.anInt3581 - 10 > local67 || Static203.anInt3581 + Static265.anInt4552 + 10 < local67 || Static236.anInt4059 - 10 > local71 || Static122.anInt2156 + Static236.anInt4059 + 10 < local71) {
				Static206.aBoolean239 = false;
				Static87.method1534(Static236.anInt4059, Static122.anInt2156, Static265.anInt4552, Static203.anInt3581);
			}
		}
		if (local41 != 0) {
			return;
		}
		local67 = Static203.anInt3581;
		local71 = Static236.anInt4059;
		@Pc(123) int local123 = Static265.anInt4552;
		@Pc(127) int local127 = local46.method1257();
		@Pc(131) int local131 = local46.method1258();
		@Pc(133) int local133 = -1;
		@Pc(151) int local151;
		for (@Pc(135) int local135 = 0; local135 < Static228.anInt3878; local135++) {
			if (Static312.aBoolean355) {
				local151 = (Static228.anInt3878 - local135 - 1) * 16 + local71 + 33;
				if (local67 < local127 && local123 + local67 > local127 && local151 - 13 < local131 && local151 + 4 > local131) {
					local133 = local135;
				}
			} else {
				local151 = local71 + (Static228.anInt3878 - (1 - -local135)) * 16 + 31;
				if (local67 < local127 && local127 < local123 + local67 && local151 - 13 < local131 && local131 < local151 + 3) {
					local133 = local135;
				}
			}
		}
		if (local133 != -1) {
			local151 = 0;
			@Pc(234) Class236 local234 = new Class236(Static307.aClass88_23);
			for (@Pc(239) Class6_Sub33 local239 = (Class6_Sub33) local234.method5317(); local239 != null; local239 = (Class6_Sub33) local234.method5315()) {
				if (local133 == local151) {
					Static131.method2145(local239, local131, local127);
				}
				local151++;
			}
		}
		Static206.aBoolean239 = false;
		Static87.method1534(Static236.anInt4059, Static122.anInt2156, Static265.anInt4552, Static203.anInt3581);
		return;
	}
}
