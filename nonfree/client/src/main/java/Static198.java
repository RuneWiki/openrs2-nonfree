import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!ha;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	public static int anInt4264;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	public static int anInt4265;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2539 = Static118.method2249("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array62 = new Class65[500];

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2541 = Static118.method2249(" seconds)3");

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2540 = aClass65_2541;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2542 = Static118.method2249("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)Z")
	public static boolean method3218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static206.method3278(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static206.anIntArrayArrayArray10[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static1.anInt4460) {
					if (!Static9.method165(local10, local24, local14)) {
						return false;
					}
					if (!Static9.method165(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static9.method165(local10, local28, local14)) {
						return false;
					}
					if (!Static9.method165(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static9.method165(local10, local32, local14)) {
					return false;
				}
				if (!Static9.method165(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static66.anInt1691) {
					if (!Static9.method165(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static9.method165(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static9.method165(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static9.method165(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static1.anInt4460) {
					if (!Static9.method165(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static9.method165(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static9.method165(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static9.method165(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static66.anInt1691) {
					if (!Static9.method165(local10, local24, local14)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static9.method165(local10, local28, local14)) {
						return false;
					}
					if (!Static9.method165(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static9.method165(local10, local32, local14)) {
					return false;
				}
				if (!Static9.method165(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static9.method165(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static9.method165(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static9.method165(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static9.method165(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static9.method165(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)J")
	public static long method3219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_1 == null ? 0L : local7.aClass10_1.aLong20;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	public static boolean method3220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = 0; local5 < 104; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static4.anIntArrayArray1[local5][local8] = 0;
				Static132.anIntArrayArray31[local5][local8] = 99999999;
			}
		}
		Static4.anIntArrayArray1[arg10][arg8] = 99;
		@Pc(41) int local41 = arg8;
		Static132.anIntArrayArray31[arg10][arg8] = 0;
		local8 = arg10;
		@Pc(51) byte local51 = 0;
		@Pc(53) boolean local53 = false;
		Static23.anIntArray71[0] = arg10;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local51 + 1;
		Static105.anIntArray294[0] = arg8;
		@Pc(69) int[][] local69 = Static83.aClass57Array1[Static207.anInt4425].anIntArrayArray23;
		@Pc(72) int local72 = Static23.anIntArray71.length;
		while (local62 != local59) {
			local8 = Static23.anIntArray71[local59];
			local41 = Static105.anIntArray294[local59];
			local59 = (local59 + 1) % local72;
			if (local8 == arg7 && arg2 == local41) {
				local53 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static83.aClass57Array1[Static207.anInt4425].method2253(arg2, arg0 - 1, local8, arg7, local41, arg9)) {
					local53 = true;
					break;
				}
				if (arg0 < 10 && Static83.aClass57Array1[Static207.anInt4425].method2271(arg2, local41, arg7, local8, arg9, arg0 - 1)) {
					local53 = true;
					break;
				}
			}
			if (arg1 != 0 && arg4 != 0 && Static83.aClass57Array1[Static207.anInt4425].method2264(arg7, arg4, arg1, local41, arg5, arg2, local8)) {
				local53 = true;
				break;
			}
			@Pc(171) int local171 = Static132.anIntArrayArray31[local8][local41] + 1;
			if (local8 > 0 && Static4.anIntArrayArray1[local8 - 1][local41] == 0 && (local69[local8 - 1][local41] & 0x12C0108) == 0) {
				Static23.anIntArray71[local62] = local8 - 1;
				Static105.anIntArray294[local62] = local41;
				Static4.anIntArrayArray1[local8 - 1][local41] = 2;
				Static132.anIntArrayArray31[local8 - 1][local41] = local171;
				local62 = (local62 + 1) % local72;
			}
			if (local8 < 103 && Static4.anIntArrayArray1[local8 + 1][local41] == 0 && (local69[local8 + 1][local41] & 0x12C0180) == 0) {
				Static23.anIntArray71[local62] = local8 + 1;
				Static105.anIntArray294[local62] = local41;
				local62 = (local62 + 1) % local72;
				Static4.anIntArrayArray1[local8 + 1][local41] = 8;
				Static132.anIntArrayArray31[local8 + 1][local41] = local171;
			}
			if (local41 > 0 && Static4.anIntArrayArray1[local8][local41 - 1] == 0 && (local69[local8][local41 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray71[local62] = local8;
				Static105.anIntArray294[local62] = local41 - 1;
				local62 = (local62 + 1) % local72;
				Static4.anIntArrayArray1[local8][local41 - 1] = 1;
				Static132.anIntArrayArray31[local8][local41 - 1] = local171;
			}
			if (local41 < 103 && Static4.anIntArrayArray1[local8][local41 + 1] == 0 && (local69[local8][local41 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray71[local62] = local8;
				Static105.anIntArray294[local62] = local41 + 1;
				local62 = (local62 + 1) % local72;
				Static4.anIntArrayArray1[local8][local41 + 1] = 4;
				Static132.anIntArrayArray31[local8][local41 + 1] = local171;
			}
			if (local8 > 0 && local41 > 0 && Static4.anIntArrayArray1[local8 - 1][local41 - 1] == 0 && (local69[local8 - 1][local41 - 1] & 0x12C010E) == 0 && (local69[local8 - 1][local41] & 0x12C0108) == 0 && (local69[local8][local41 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray71[local62] = local8 - 1;
				Static105.anIntArray294[local62] = local41 - 1;
				Static4.anIntArrayArray1[local8 - 1][local41 - 1] = 3;
				local62 = (local62 + 1) % local72;
				Static132.anIntArrayArray31[local8 - 1][local41 - 1] = local171;
			}
			if (local8 < 103 && local41 > 0 && Static4.anIntArrayArray1[local8 + 1][local41 - 1] == 0 && (local69[local8 + 1][local41 - 1] & 0x12C0183) == 0 && (local69[local8 + 1][local41] & 0x12C0180) == 0 && (local69[local8][local41 - 1] & 0x12C0102) == 0) {
				Static23.anIntArray71[local62] = local8 + 1;
				Static105.anIntArray294[local62] = local41 - 1;
				local62 = (local62 + 1) % local72;
				Static4.anIntArrayArray1[local8 + 1][local41 - 1] = 9;
				Static132.anIntArrayArray31[local8 + 1][local41 - 1] = local171;
			}
			if (local8 > 0 && local41 < 103 && Static4.anIntArrayArray1[local8 - 1][local41 + 1] == 0 && (local69[local8 - 1][local41 + 1] & 0x12C0138) == 0 && (local69[local8 - 1][local41] & 0x12C0108) == 0 && (local69[local8][local41 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray71[local62] = local8 - 1;
				Static105.anIntArray294[local62] = local41 + 1;
				Static4.anIntArrayArray1[local8 - 1][local41 + 1] = 6;
				Static132.anIntArrayArray31[local8 - 1][local41 + 1] = local171;
				local62 = (local62 + 1) % local72;
			}
			if (local8 < 103 && local41 < 103 && Static4.anIntArrayArray1[local8 + 1][local41 + 1] == 0 && (local69[local8 + 1][local41 + 1] & 0x12C01E0) == 0 && (local69[local8 + 1][local41] & 0x12C0180) == 0 && (local69[local8][local41 + 1] & 0x12C0120) == 0) {
				Static23.anIntArray71[local62] = local8 + 1;
				Static105.anIntArray294[local62] = local41 + 1;
				local62 = (local62 + 1) % local72;
				Static4.anIntArrayArray1[local8 + 1][local41 + 1] = 12;
				Static132.anIntArrayArray31[local8 + 1][local41 + 1] = local171;
			}
		}
		Static200.anInt4298 = 0;
		@Pc(784) int local784;
		@Pc(788) int local788;
		@Pc(793) int local793;
		@Pc(799) int local799;
		if (!local53) {
			if (!arg3) {
				return false;
			}
			local784 = 1000;
			local788 = 100;
			for (local793 = arg7 - 10; local793 <= arg7 + 10; local793++) {
				for (local799 = arg2 - 10; local799 <= arg2 + 10; local799++) {
					if (local793 >= 0 && local799 >= 0 && local793 < 104 && local799 < 104 && Static132.anIntArrayArray31[local793][local799] < 100) {
						@Pc(829) int local829 = 0;
						if (local799 < arg2) {
							local829 = arg2 - local799;
						} else if (arg4 + arg2 - 1 < local799) {
							local829 = local799 + 1 - arg2 - arg4;
						}
						@Pc(858) int local858 = 0;
						if (arg7 > local793) {
							local858 = arg7 - local793;
						} else if (local793 > arg7 + arg1 - 1) {
							local858 = local793 + 1 - arg7 - arg1;
						}
						@Pc(891) int local891 = local858 * local858 + local829 * local829;
						if (local784 > local891 || local891 == local784 && local788 > Static132.anIntArrayArray31[local793][local799]) {
							local41 = local799;
							local784 = local891;
							local8 = local793;
							local788 = Static132.anIntArrayArray31[local793][local799];
						}
					}
				}
			}
			if (local784 == 1000) {
				return false;
			}
			if (local8 == arg10 && local41 == arg8) {
				return false;
			}
			Static200.anInt4298 = 1;
		}
		@Pc(963) byte local963 = 0;
		Static23.anIntArray71[0] = local8;
		local59 = local963 + 1;
		Static105.anIntArray294[0] = local41;
		local784 = local788 = Static4.anIntArrayArray1[local8][local41];
		while (arg10 != local8 || local41 != arg8) {
			if (local784 != local788) {
				local788 = local784;
				Static23.anIntArray71[local59] = local8;
				Static105.anIntArray294[local59++] = local41;
			}
			if ((local784 & 0x1) != 0) {
				local41++;
			} else if ((local784 & 0x4) != 0) {
				local41--;
			}
			if ((local784 & 0x2) != 0) {
				local8++;
			} else if ((local784 & 0x8) != 0) {
				local8--;
			}
			local784 = Static4.anIntArrayArray1[local8][local41];
		}
		if (local59 > 0) {
			local72 = local59--;
			if (local72 > 25) {
				local72 = 25;
			}
			local793 = Static105.anIntArray294[local59];
			@Pc(1062) int local1062 = Static23.anIntArray71[local59];
			if (arg6 == 0) {
				Static45.aClass1_Sub14_Sub1_8.method1761(142);
				Static45.aClass1_Sub14_Sub1_8.method1710(local72 + local72 + 3);
			}
			if (arg6 == 1) {
				Static45.aClass1_Sub14_Sub1_8.method1761(71);
				Static45.aClass1_Sub14_Sub1_8.method1710(local72 + local72 + 3 + 14);
			}
			if (arg6 == 2) {
				Static45.aClass1_Sub14_Sub1_8.method1761(89);
				Static45.aClass1_Sub14_Sub1_8.method1710(local72 + local72 + 3);
			}
			Static129.anInt3182 = Static105.anIntArray294[0];
			Static106.anInt2616 = Static23.anIntArray71[0];
			for (local799 = 1; local799 < local72; local799++) {
				local59--;
				Static45.aClass1_Sub14_Sub1_8.method1698(Static23.anIntArray71[local59] - local1062);
				Static45.aClass1_Sub14_Sub1_8.method1739(Static105.anIntArray294[local59] - local793);
			}
			Static45.aClass1_Sub14_Sub1_8.method1745(Static204.aBooleanArray19[82] ? 1 : 0);
			Static45.aClass1_Sub14_Sub1_8.method1741(Static205.anInt4337 + local1062);
			Static45.aClass1_Sub14_Sub1_8.method1748(local793 + Static58.anInt1543);
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
	public static void method3221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass10_1 = null;
		}
	}
}
