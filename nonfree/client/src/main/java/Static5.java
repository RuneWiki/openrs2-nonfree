import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_87 = Static107.method1838("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ad", name = "wb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_88 = Static107.method1838("Loaded fonts");

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_89 = Static107.method1838("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ad", name = "yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_90 = aClass28_88;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLclient!ff;)I")
	public static int method154(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1.anIntArrayArray6 == null || arg1.anIntArrayArray6.length <= arg0) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray6[arg0];
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(35) int local35 = local24[local30++];
				@Pc(37) int local37 = 0;
				@Pc(39) byte local39 = 0;
				if (local35 == 0) {
					return local26;
				}
				if (local35 == 15) {
					local39 = 1;
				}
				if (local35 == 16) {
					local39 = 2;
				}
				if (local35 == 1) {
					local37 = Static176.anIntArray361[local24[local30++]];
				}
				if (local35 == 2) {
					local37 = Static105.anIntArray239[local24[local30++]];
				}
				if (local35 == 17) {
					local39 = 3;
				}
				if (local35 == 3) {
					local37 = Static61.anIntArray143[local24[local30++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class24 local117;
				@Pc(122) int local122;
				@Pc(135) int local135;
				if (local35 == 4) {
					local106 = local24[local30++] << 16;
					@Pc(113) int local113 = local106 + local24[local30++];
					local117 = Static58.method1035(local113);
					local122 = local24[local30++];
					if (local122 != -1 && (!Static58.method1034(local122).aBoolean110 || Static51.aBoolean96)) {
						for (local135 = 0; local135 < local117.anIntArray120.length; local135++) {
							if (local122 + 1 == local117.anIntArray120[local135]) {
								local37 += local117.anIntArray119[local135];
							}
						}
					}
				}
				if (local35 == 5) {
					local37 = Static24.anIntArray52[local24[local30++]];
				}
				if (local35 == 6) {
					local37 = Class2_Sub3_Sub10.anIntArray144[Static105.anIntArray239[local24[local30++]] - 1];
				}
				if (local35 == 7) {
					local37 = Static24.anIntArray52[local24[local30++]] * 100 / 46875;
				}
				if (local35 == 8) {
					local37 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669;
				}
				if (local35 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static85.aBooleanArray15[local106]) {
							local37 += Static105.anIntArray239[local106];
						}
					}
				}
				if (local35 == 10) {
					local106 = local24[local30++] << 16;
					local106 += local24[local30++];
					local117 = Static58.method1035(local106);
					local122 = local24[local30++];
					if (local122 != -1 && (!Static58.method1034(local122).aBoolean110 || Static51.aBoolean96)) {
						for (local135 = 0; local135 < local117.anIntArray120.length; local135++) {
							if (local122 + 1 == local117.anIntArray120[local135]) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local35 == 11) {
					local37 = Static120.anInt2869;
				}
				if (local35 == 12) {
					local37 = Static45.anInt1212;
				}
				if (local35 == 13) {
					local106 = Static24.anIntArray52[local24[local30++]];
					@Pc(332) int local332 = local24[local30++];
					local37 = (local106 & 0x1 << local332) == 0 ? 0 : 1;
				}
				if (local35 == 14) {
					local106 = local24[local30++];
					local37 = Static27.method1953(local106);
				}
				if (local35 == 18) {
					local37 = Static3.anInt2434 + (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7);
				}
				if (local35 == 19) {
					local37 = Static39.anInt1055 + (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7);
				}
				if (local35 == 20) {
					local37 = local24[local30++];
				}
				if (local39 == 0) {
					if (local28 == 0) {
						local26 += local37;
					}
					if (local28 == 1) {
						local26 -= local37;
					}
					if (local28 == 2 && local37 != 0) {
						local26 /= local37;
					}
					if (local28 == 3) {
						local26 *= local37;
					}
					local28 = 0;
				} else {
					local28 = local39;
				}
			}
		} catch (@Pc(441) Exception local441) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method155() {
		aClass40_1 = null;
		aClass28_87 = null;
		aClass28_90 = null;
		aClass28_88 = null;
		aClass28_89 = null;
		Class2_Sub3_Sub2.aLongArray1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILclient!ff;Lclient!wb;II)V")
	public static void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) Class2_Sub4_Sub3_Sub4 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Math.min(arg3.anInt1357 / 2, arg3.anInt1427 / 2) - 20;
		@Pc(25) int local25 = arg5 * arg5 + arg1 * arg1;
		if (local11 * local11 >= local25 || local25 >= 90000) {
			Static6.method227(arg1, arg2, arg3, arg5, arg0, arg4);
			return;
		}
		@Pc(43) int local43 = Static110.anInt2692 + Static66.anInt1789 & 0x7FF;
		@Pc(47) int local47 = Class2_Sub4_Sub3_Sub1.anIntArray58[local43];
		@Pc(51) int local51 = Class2_Sub4_Sub3_Sub1.anIntArray60[local43];
		@Pc(59) int local59 = local51 * 256 / (Static178.anInt3957 + 256);
		@Pc(67) int local67 = local47 * 256 / (Static178.anInt3957 + 256);
		@Pc(77) int local77 = arg5 * local59 + arg1 * local67 >> 16;
		@Pc(88) int local88 = arg1 * local59 - arg5 * local67 >> 16;
		@Pc(94) double local94 = Math.atan2((double) local77, (double) local88);
		@Pc(101) int local101 = (int) (Math.sin(local94) * (double) local11);
		@Pc(108) int local108 = (int) (Math.cos(local94) * (double) local11);
		Static56.aClass2_Sub4_Sub3_Sub4_1.method2831(arg2 + arg3.anInt1357 / 2 + local101 + 4 - 10, -local108 + -20 + arg0 - -(arg3.anInt1427 / 2), local94);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z")
	public static boolean method157(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
