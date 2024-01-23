import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!ie;")
	public static Class53 aClass53_8 = new Class53(50);

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	public static int anInt889 = 0;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public static int anInt895 = -1;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "S")
	public static short aShort5 = 32767;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	public static int anInt896 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
	public static boolean method651(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!me;I)I")
	public static int method652(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray16 == null || arg1 >= arg0.anIntArrayArray16.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray16[arg1];
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
				if (local35 == 1) {
					local37 = Static44.anIntArray63[local24[local30++]];
				}
				if (local35 == 2) {
					local37 = Static218.anIntArray139[local24[local30++]];
				}
				if (local35 == 15) {
					local39 = 1;
				}
				if (local35 == 16) {
					local39 = 2;
				}
				if (local35 == 17) {
					local39 = 3;
				}
				if (local35 == 3) {
					local37 = Static207.anIntArray330[local24[local30++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class71 local117;
				@Pc(122) int local122;
				@Pc(135) int local135;
				if (local35 == 4) {
					local106 = local24[local30++] << 16;
					@Pc(113) int local113 = local106 + local24[local30++];
					local117 = Static7.method102(local113);
					local122 = local24[local30++];
					if (local122 != -1 && (!Static36.method637(local122).aBoolean170 || Static206.aBoolean199)) {
						for (local135 = 0; local135 < local117.anIntArray177.length; local135++) {
							if (local122 + 1 == local117.anIntArray177[local135]) {
								local37 += local117.anIntArray184[local135];
							}
						}
					}
				}
				if (local35 == 5) {
					local37 = Static86.anIntArray125[local24[local30++]];
				}
				if (local35 == 6) {
					local37 = Class70.anIntArray336[Static218.anIntArray139[local24[local30++]] - 1];
				}
				if (local35 == 7) {
					local37 = Static86.anIntArray125[local24[local30++]] * 100 / 46875;
				}
				if (local35 == 8) {
					local37 = Static73.aClass5_Sub1_Sub1_1.anInt1941;
				}
				if (local35 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static111.aBooleanArray14[local106]) {
							local37 += Static218.anIntArray139[local106];
						}
					}
				}
				if (local35 == 10) {
					local106 = local24[local30++] << 16;
					local106 += local24[local30++];
					local117 = Static7.method102(local106);
					local122 = local24[local30++];
					if (local122 != -1 && (!Static36.method637(local122).aBoolean170 || Static206.aBoolean199)) {
						for (local135 = 0; local135 < local117.anIntArray177.length; local135++) {
							if (local117.anIntArray177[local135] == local122 + 1) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local35 == 11) {
					local37 = Static186.anInt4029;
				}
				if (local35 == 12) {
					local37 = Static122.anInt2705;
				}
				if (local35 == 13) {
					local106 = Static86.anIntArray125[local24[local30++]];
					@Pc(317) int local317 = local24[local30++];
					local37 = (0x1 << local317 & local106) == 0 ? 0 : 1;
				}
				if (local35 == 14) {
					local106 = local24[local30++];
					local37 = Static182.method3078(local106);
				}
				if (local35 == 18) {
					local37 = Static198.anInt4217 + (Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7);
				}
				if (local35 == 19) {
					local37 = (Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7) + Static118.anInt2541;
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
		} catch (@Pc(420) Exception local420) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIII)V")
	public static void method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg1 + 1;
		Static71.method1261(Static113.anIntArrayArray10[arg1], arg2, arg4, arg3);
		@Pc(22) int local22 = arg0 - 1;
		Static71.method1261(Static113.anIntArrayArray10[arg0], arg2, arg4, arg3);
		for (@Pc(30) int local30 = local13; local30 <= local22; local30++) {
			@Pc(36) int[] local36 = Static113.anIntArrayArray10[local30];
			local36[arg2] = local36[arg3] = arg4;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBIII)V")
	public static void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static160.anInt3454 <= arg5 - arg0 && arg5 + arg0 <= Static149.anInt3252 && Static225.anInt4729 <= arg2 - arg0 && arg0 + arg2 <= Static122.anInt2710) {
			Static193.method3239(arg5, arg4, arg1, arg3, arg0, arg2);
		} else {
			Static51.method924(arg1, arg0, arg4, arg3, arg2, arg5);
		}
	}
}
