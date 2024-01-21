import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
	public static int[] anIntArray49;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!rd;")
	private static Class64 aClass64_248 = Static69.method1153(" million");

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_249 = Static69.method1153("");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_250 = Static69.method1153("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt332 = 0;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!rd;")
	public static Class64 aClass64_251 = aClass64_248;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIII)I")
	public static int method221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	public static boolean method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static31.anIntArrayArray6[local3][local7] = 0;
				Static100.anIntArrayArray27[local3][local7] = 99999999;
			}
		}
		Static31.anIntArrayArray6[arg2][arg1] = 99;
		local7 = arg2;
		Static100.anIntArrayArray27[arg2][arg1] = 0;
		@Pc(49) byte local49 = 0;
		Static27.anIntArray138[0] = arg2;
		@Pc(55) int local55 = arg1;
		@Pc(65) int local65 = 0;
		@Pc(68) int local68 = local49 + 1;
		Static21.anIntArray81[0] = arg1;
		@Pc(72) boolean local72 = false;
		@Pc(75) int local75 = Static27.anIntArray138.length;
		@Pc(80) int[][] local80 = Static74.aClass52Array1[Static15.anInt463].anIntArrayArray22;
		@Pc(196) int local196;
		while (local65 != local68) {
			local55 = Static21.anIntArray81[local65];
			local7 = Static27.anIntArray138[local65];
			local65 = (local65 + 1) % local75;
			if (local7 == arg0 && local55 == arg5) {
				local72 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static74.aClass52Array1[Static15.anInt463].method1195(local55, local7, arg9 - 1, arg0, arg8, arg5)) {
					local72 = true;
					break;
				}
				if (arg9 < 10 && Static74.aClass52Array1[Static15.anInt463].method1201(arg0, local55, arg5, arg8, arg9 - 1, local7)) {
					local72 = true;
					break;
				}
			}
			if (arg10 != 0 && arg6 != 0 && Static74.aClass52Array1[Static15.anInt463].method1208(arg10, arg0, arg5, local7, arg7, arg6, local55)) {
				local72 = true;
				break;
			}
			local196 = Static100.anIntArrayArray27[local7][local55] + 1;
			if (local7 > 0 && Static31.anIntArrayArray6[local7 - 1][local55] == 0 && (local80[local7 - 1][local55] & 0x1280108) == 0) {
				Static27.anIntArray138[local68] = local7 - 1;
				Static21.anIntArray81[local68] = local55;
				local68 = (local68 + 1) % local75;
				Static31.anIntArrayArray6[local7 - 1][local55] = 2;
				Static100.anIntArrayArray27[local7 - 1][local55] = local196;
			}
			if (local7 < 103 && Static31.anIntArrayArray6[local7 + 1][local55] == 0 && (local80[local7 + 1][local55] & 0x1280180) == 0) {
				Static27.anIntArray138[local68] = local7 + 1;
				Static21.anIntArray81[local68] = local55;
				Static31.anIntArrayArray6[local7 + 1][local55] = 8;
				local68 = (local68 + 1) % local75;
				Static100.anIntArrayArray27[local7 + 1][local55] = local196;
			}
			if (local55 > 0 && Static31.anIntArrayArray6[local7][local55 - 1] == 0 && (local80[local7][local55 - 1] & 0x1280102) == 0) {
				Static27.anIntArray138[local68] = local7;
				Static21.anIntArray81[local68] = local55 - 1;
				Static31.anIntArrayArray6[local7][local55 - 1] = 1;
				local68 = (local68 + 1) % local75;
				Static100.anIntArrayArray27[local7][local55 - 1] = local196;
			}
			if (local55 < 103 && Static31.anIntArrayArray6[local7][local55 + 1] == 0 && (local80[local7][local55 + 1] & 0x1280120) == 0) {
				Static27.anIntArray138[local68] = local7;
				Static21.anIntArray81[local68] = local55 + 1;
				local68 = (local68 + 1) % local75;
				Static31.anIntArrayArray6[local7][local55 + 1] = 4;
				Static100.anIntArrayArray27[local7][local55 + 1] = local196;
			}
			if (local7 > 0 && local55 > 0 && Static31.anIntArrayArray6[local7 - 1][local55 - 1] == 0 && (local80[local7 - 1][local55 - 1] & 0x128010E) == 0 && (local80[local7 - 1][local55] & 0x1280108) == 0 && (local80[local7][local55 - 1] & 0x1280102) == 0) {
				Static27.anIntArray138[local68] = local7 - 1;
				Static21.anIntArray81[local68] = local55 - 1;
				local68 = (local68 + 1) % local75;
				Static31.anIntArrayArray6[local7 - 1][local55 - 1] = 3;
				Static100.anIntArrayArray27[local7 - 1][local55 - 1] = local196;
			}
			if (local7 < 103 && local55 > 0 && Static31.anIntArrayArray6[local7 + 1][local55 - 1] == 0 && (local80[local7 + 1][local55 - 1] & 0x1280183) == 0 && (local80[local7 + 1][local55] & 0x1280180) == 0 && (local80[local7][local55 - 1] & 0x1280102) == 0) {
				Static27.anIntArray138[local68] = local7 + 1;
				Static21.anIntArray81[local68] = local55 - 1;
				Static31.anIntArrayArray6[local7 + 1][local55 - 1] = 9;
				local68 = (local68 + 1) % local75;
				Static100.anIntArrayArray27[local7 + 1][local55 - 1] = local196;
			}
			if (local7 > 0 && local55 < 103 && Static31.anIntArrayArray6[local7 - 1][local55 + 1] == 0 && (local80[local7 - 1][local55 + 1] & 0x1280138) == 0 && (local80[local7 - 1][local55] & 0x1280108) == 0 && (local80[local7][local55 + 1] & 0x1280120) == 0) {
				Static27.anIntArray138[local68] = local7 - 1;
				Static21.anIntArray81[local68] = local55 + 1;
				local68 = (local68 + 1) % local75;
				Static31.anIntArrayArray6[local7 - 1][local55 + 1] = 6;
				Static100.anIntArrayArray27[local7 - 1][local55 + 1] = local196;
			}
			if (local7 < 103 && local55 < 103 && Static31.anIntArrayArray6[local7 + 1][local55 + 1] == 0 && (local80[local7 + 1][local55 + 1] & 0x12801E0) == 0 && (local80[local7 + 1][local55] & 0x1280180) == 0 && (local80[local7][local55 + 1] & 0x1280120) == 0) {
				Static27.anIntArray138[local68] = local7 + 1;
				Static21.anIntArray81[local68] = local55 + 1;
				local68 = (local68 + 1) % local75;
				Static31.anIntArrayArray6[local7 + 1][local55 + 1] = 12;
				Static100.anIntArrayArray27[local7 + 1][local55 + 1] = local196;
			}
		}
		Static13.anInt452 = 0;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(832) int local832;
		if (!local72) {
			if (!arg4) {
				return false;
			}
			local196 = 1000;
			local821 = 100;
			for (local825 = arg0 - 10; local825 <= arg0 + 10; local825++) {
				for (local832 = arg5 - 10; local832 <= arg5 + 10; local832++) {
					if (local825 >= 0 && local832 >= 0 && local825 < 104 && local832 < 104 && Static100.anIntArrayArray27[local825][local832] < 100) {
						@Pc(858) int local858 = 0;
						if (local825 < arg0) {
							local858 = arg0 - local825;
						} else if (arg10 + arg0 - 1 < local825) {
							local858 = local825 + 1 - arg10 - arg0;
						}
						@Pc(886) int local886 = 0;
						if (arg5 > local832) {
							local886 = arg5 - local832;
						} else if (local832 > arg5 + arg6 - 1) {
							local886 = local832 + 1 - arg6 - arg5;
						}
						@Pc(925) int local925 = local858 * local858 + local886 * local886;
						if (local925 < local196 || local196 == local925 && Static100.anIntArrayArray27[local825][local832] < local821) {
							local55 = local832;
							local821 = Static100.anIntArrayArray27[local825][local832];
							local196 = local925;
							local7 = local825;
						}
					}
				}
			}
			if (local196 == 1000) {
				return false;
			}
			if (local7 == arg2 && arg1 == local55) {
				return false;
			}
			Static13.anInt452 = 1;
		}
		@Pc(1002) byte local1002 = 0;
		Static27.anIntArray138[0] = local7;
		local65 = local1002 + 1;
		Static21.anIntArray81[0] = local55;
		local196 = local821 = Static31.anIntArrayArray6[local7][local55];
		while (local7 != arg2 || local55 != arg1) {
			if (local821 != local196) {
				local821 = local196;
				Static27.anIntArray138[local65] = local7;
				Static21.anIntArray81[local65++] = local55;
			}
			if ((local196 & 0x1) != 0) {
				local55++;
			} else if ((local196 & 0x4) != 0) {
				local55--;
			}
			if ((local196 & 0x2) != 0) {
				local7++;
			} else if ((local196 & 0x8) != 0) {
				local7--;
			}
			local196 = Static31.anIntArrayArray6[local7][local55];
		}
		if (local65 > 0) {
			local75 = local65;
			if (local65 > 25) {
				local75 = 25;
			}
			local65--;
			@Pc(1095) int local1095 = Static27.anIntArray138[local65];
			local825 = Static21.anIntArray81[local65];
			if (arg3 == 0) {
				Static49.aClass1_Sub6_Sub1_1.method1877(9);
				Static49.aClass1_Sub6_Sub1_1.method1853(local75 + local75 + 3);
			}
			if (arg3 == 1) {
				Static49.aClass1_Sub6_Sub1_1.method1877(200);
				Static49.aClass1_Sub6_Sub1_1.method1853(local75 + local75 + 3 + 14);
			}
			if (arg3 == 2) {
				Static49.aClass1_Sub6_Sub1_1.method1877(239);
				Static49.aClass1_Sub6_Sub1_1.method1853(local75 + local75 + 3);
			}
			Static70.anInt1578 = Static21.anIntArray81[0];
			Static52.anInt2832 = Static27.anIntArray138[0];
			for (local832 = 1; local832 < local75; local832++) {
				local65--;
				Static49.aClass1_Sub6_Sub1_1.method1829(Static27.anIntArray138[local65] - local1095);
				Static49.aClass1_Sub6_Sub1_1.method1853(Static21.anIntArray81[local65] - local825);
			}
			Static49.aClass1_Sub6_Sub1_1.method1825(Static82.aBooleanArray9[82] ? 1 : 0);
			Static49.aClass1_Sub6_Sub1_1.method1840(local825 + Static53.anInt1236);
			Static49.aClass1_Sub6_Sub1_1.method1871(local1095 + Static60.anInt1350);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method227() {
		aClass64_248 = null;
		aClass64_250 = null;
		aClass64_249 = null;
		aClass64_251 = null;
		anIntArray49 = null;
	}
}
