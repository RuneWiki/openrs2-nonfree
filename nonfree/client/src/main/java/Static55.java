import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_3 = new Class77(30);

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_556 = Static187.method3089("");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method911(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static66.anIntArrayArray10[local7][local11] = 0;
				Static12.anIntArrayArray6[local7][local11] = 99999999;
			}
		}
		Static66.anIntArrayArray10[arg6][arg7] = 99;
		Static12.anIntArrayArray6[arg6][arg7] = 0;
		local11 = arg6;
		@Pc(49) int local49 = 0;
		@Pc(51) byte local51 = 0;
		Static9.anIntArray282[0] = arg6;
		@Pc(57) boolean local57 = false;
		@Pc(59) int local59 = arg7;
		@Pc(62) int local62 = local51 + 1;
		Static141.anIntArray251[0] = arg7;
		@Pc(69) int[][] local69 = Static98.aClass7Array1[Static192.anInt4180].anIntArrayArray4;
		@Pc(77) int local77 = Static9.anIntArray282.length;
		@Pc(194) int local194;
		while (local49 != local62) {
			local59 = Static141.anIntArray251[local49];
			local11 = Static9.anIntArray282[local49];
			local49 = (local49 + 1) % local77;
			if (arg10 == local11 && local59 == arg9) {
				local57 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static98.aClass7Array1[Static192.anInt4180].method141(arg10, local11, arg2 - 1, arg8, local59, arg9)) {
					local57 = true;
					break;
				}
				if (arg2 < 10 && Static98.aClass7Array1[Static192.anInt4180].method135(arg8, arg10, arg2 - 1, local59, arg9, local11)) {
					local57 = true;
					break;
				}
			}
			if (arg3 != 0 && arg4 != 0 && Static98.aClass7Array1[Static192.anInt4180].method138(arg4, local59, arg3, arg10, arg5, local11, arg9)) {
				local57 = true;
				break;
			}
			local194 = Static12.anIntArrayArray6[local11][local59] + 1;
			if (local11 > 0 && Static66.anIntArrayArray10[local11 - 1][local59] == 0 && (local69[local11 - 1][local59] & 0x12C0108) == 0) {
				Static9.anIntArray282[local62] = local11 - 1;
				Static141.anIntArray251[local62] = local59;
				Static66.anIntArrayArray10[local11 - 1][local59] = 2;
				Static12.anIntArrayArray6[local11 - 1][local59] = local194;
				local62 = (local62 + 1) % local77;
			}
			if (local11 < 103 && Static66.anIntArrayArray10[local11 + 1][local59] == 0 && (local69[local11 + 1][local59] & 0x12C0180) == 0) {
				Static9.anIntArray282[local62] = local11 + 1;
				Static141.anIntArray251[local62] = local59;
				Static66.anIntArrayArray10[local11 + 1][local59] = 8;
				Static12.anIntArrayArray6[local11 + 1][local59] = local194;
				local62 = (local62 + 1) % local77;
			}
			if (local59 > 0 && Static66.anIntArrayArray10[local11][local59 - 1] == 0 && (local69[local11][local59 - 1] & 0x12C0102) == 0) {
				Static9.anIntArray282[local62] = local11;
				Static141.anIntArray251[local62] = local59 - 1;
				Static66.anIntArrayArray10[local11][local59 - 1] = 1;
				local62 = (local62 + 1) % local77;
				Static12.anIntArrayArray6[local11][local59 - 1] = local194;
			}
			if (local59 < 103 && Static66.anIntArrayArray10[local11][local59 + 1] == 0 && (local69[local11][local59 + 1] & 0x12C0120) == 0) {
				Static9.anIntArray282[local62] = local11;
				Static141.anIntArray251[local62] = local59 + 1;
				local62 = (local62 + 1) % local77;
				Static66.anIntArrayArray10[local11][local59 + 1] = 4;
				Static12.anIntArrayArray6[local11][local59 + 1] = local194;
			}
			if (local11 > 0 && local59 > 0 && Static66.anIntArrayArray10[local11 - 1][local59 - 1] == 0 && (local69[local11 - 1][local59 - 1] & 0x12C010E) == 0 && (local69[local11 - 1][local59] & 0x12C0108) == 0 && (local69[local11][local59 - 1] & 0x12C0102) == 0) {
				Static9.anIntArray282[local62] = local11 - 1;
				Static141.anIntArray251[local62] = local59 - 1;
				local62 = (local62 + 1) % local77;
				Static66.anIntArrayArray10[local11 - 1][local59 - 1] = 3;
				Static12.anIntArrayArray6[local11 - 1][local59 - 1] = local194;
			}
			if (local11 < 103 && local59 > 0 && Static66.anIntArrayArray10[local11 + 1][local59 - 1] == 0 && (local69[local11 + 1][local59 - 1] & 0x12C0183) == 0 && (local69[local11 + 1][local59] & 0x12C0180) == 0 && (local69[local11][local59 - 1] & 0x12C0102) == 0) {
				Static9.anIntArray282[local62] = local11 + 1;
				Static141.anIntArray251[local62] = local59 - 1;
				local62 = (local62 + 1) % local77;
				Static66.anIntArrayArray10[local11 + 1][local59 - 1] = 9;
				Static12.anIntArrayArray6[local11 + 1][local59 - 1] = local194;
			}
			if (local11 > 0 && local59 < 103 && Static66.anIntArrayArray10[local11 - 1][local59 + 1] == 0 && (local69[local11 - 1][local59 + 1] & 0x12C0138) == 0 && (local69[local11 - 1][local59] & 0x12C0108) == 0 && (local69[local11][local59 + 1] & 0x12C0120) == 0) {
				Static9.anIntArray282[local62] = local11 - 1;
				Static141.anIntArray251[local62] = local59 + 1;
				Static66.anIntArrayArray10[local11 - 1][local59 + 1] = 6;
				Static12.anIntArrayArray6[local11 - 1][local59 + 1] = local194;
				local62 = (local62 + 1) % local77;
			}
			if (local11 < 103 && local59 < 103 && Static66.anIntArrayArray10[local11 + 1][local59 + 1] == 0 && (local69[local11 + 1][local59 + 1] & 0x12C01E0) == 0 && (local69[local11 + 1][local59] & 0x12C0180) == 0 && (local69[local11][local59 + 1] & 0x12C0120) == 0) {
				Static9.anIntArray282[local62] = local11 + 1;
				Static141.anIntArray251[local62] = local59 + 1;
				Static66.anIntArrayArray10[local11 + 1][local59 + 1] = 12;
				Static12.anIntArrayArray6[local11 + 1][local59 + 1] = local194;
				local62 = (local62 + 1) % local77;
			}
		}
		Static36.anInt1019 = 0;
		@Pc(809) int local809;
		@Pc(814) int local814;
		@Pc(821) int local821;
		if (!local57) {
			if (!arg0) {
				return false;
			}
			local194 = 1000;
			local809 = 100;
			for (local814 = arg10 - 10; local814 <= arg10 + 10; local814++) {
				for (local821 = arg9 - 10; local821 <= arg9 + 10; local821++) {
					if (local814 >= 0 && local821 >= 0 && local814 < 104 && local821 < 104 && Static12.anIntArrayArray6[local814][local821] < 100) {
						@Pc(846) int local846 = 0;
						@Pc(848) int local848 = 0;
						if (arg10 > local814) {
							local848 = arg10 - local814;
						} else if (local814 > arg3 + arg10 - 1) {
							local848 = local814 + 1 - arg10 - arg3;
						}
						if (arg9 > local821) {
							local846 = arg9 - local821;
						} else if (local821 > arg4 + arg9 - 1) {
							local846 = local821 + 1 - arg9 - arg4;
						}
						@Pc(919) int local919 = local846 * local846 + local848 * local848;
						if (local919 < local194 || local194 == local919 && Static12.anIntArrayArray6[local814][local821] < local809) {
							local194 = local919;
							local59 = local821;
							local11 = local814;
							local809 = Static12.anIntArrayArray6[local814][local821];
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (arg6 == local11 && arg7 == local59) {
				return false;
			}
			Static36.anInt1019 = 1;
		}
		@Pc(995) byte local995 = 0;
		Static9.anIntArray282[0] = local11;
		local49 = local995 + 1;
		Static141.anIntArray251[0] = local59;
		local194 = local809 = Static66.anIntArrayArray10[local11][local59];
		while (arg6 != local11 || local59 != arg7) {
			if (local194 != local809) {
				local809 = local194;
				Static9.anIntArray282[local49] = local11;
				Static141.anIntArray251[local49++] = local59;
			}
			if ((local194 & 0x2) != 0) {
				local11++;
			} else if ((local194 & 0x8) != 0) {
				local11--;
			}
			if ((local194 & 0x1) != 0) {
				local59++;
			} else if ((local194 & 0x4) != 0) {
				local59--;
			}
			local194 = Static66.anIntArrayArray10[local11][local59];
		}
		if (local49 > 0) {
			local77 = local49;
			if (local49 > 25) {
				local77 = 25;
			}
			local49--;
			@Pc(1093) int local1093 = Static9.anIntArray282[local49];
			local814 = Static141.anIntArray251[local49];
			if (arg1 == 0) {
				Static38.aClass1_Sub14_Sub1_3.method3067(164);
				Static38.aClass1_Sub14_Sub1_3.method3024(local77 + local77 + 3);
			}
			if (arg1 == 1) {
				Static38.aClass1_Sub14_Sub1_3.method3067(232);
				Static38.aClass1_Sub14_Sub1_3.method3024(local77 + local77 + 17);
			}
			if (arg1 == 2) {
				Static38.aClass1_Sub14_Sub1_3.method3067(19);
				Static38.aClass1_Sub14_Sub1_3.method3024(local77 + local77 + 3);
			}
			Static38.aClass1_Sub14_Sub1_3.method3020(local814 + Static138.anInt2800);
			Static189.anInt4125 = Static141.anIntArray251[0];
			Static120.anInt2555 = Static9.anIntArray282[0];
			for (local821 = 1; local821 < local77; local821++) {
				local49--;
				Static38.aClass1_Sub14_Sub1_3.method3035(Static9.anIntArray282[local49] - local1093);
				Static38.aClass1_Sub14_Sub1_3.method3024(Static141.anIntArray251[local49] - local814);
			}
			Static38.aClass1_Sub14_Sub1_3.method3035(Static5.aBooleanArray2[82] ? 1 : 0);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static100.anInt2141 + local1093);
			return true;
		} else if (arg1 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
