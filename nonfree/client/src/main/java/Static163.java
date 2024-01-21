import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Lclient!nh;")
	public static Class62 aClass62_43;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public static int anInt3720;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_46 = new Class66(30);

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1373 = Static177.method3050("Loaded config");

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1374 = Static177.method3050("<col=00ff00>");

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	public static int anInt3721 = 1;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1375 = aClass46_1373;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1376 = Static177.method3050("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_47 = new Class66(64);

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "[I")
	public static final int[] anIntArray370 = new int[500];

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1377 = Static177.method3050("; Expires=");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBIIIZIIIII)Z")
	public static boolean method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static155.anIntArrayArray27[local3][local7] = 0;
				Static132.anIntArrayArray24[local3][local7] = 99999999;
			}
		}
		Static155.anIntArrayArray27[arg0][arg2] = 99;
		Static132.anIntArrayArray24[arg0][arg2] = 0;
		@Pc(49) int local49 = arg2;
		@Pc(51) byte local51 = 0;
		Static159.anIntArray341[0] = arg0;
		@Pc(58) int local58 = local51 + 1;
		Static88.anIntArray211[0] = arg2;
		local7 = arg0;
		@Pc(64) int local64 = 0;
		@Pc(67) int local67 = Static159.anIntArray341.length;
		@Pc(69) boolean local69 = false;
		@Pc(74) int[][] local74 = Static29.aClass58Array1[Static73.anInt1873].anIntArrayArray20;
		@Pc(192) int local192;
		while (local58 != local64) {
			local7 = Static159.anIntArray341[local64];
			local49 = Static88.anIntArray211[local64];
			local64 = (local64 + 1) % local67;
			if (arg3 == local7 && arg9 == local49) {
				local69 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static29.aClass58Array1[Static73.anInt1873].method1996(arg8 - 1, arg9, local7, arg1, arg3, local49)) {
					local69 = true;
					break;
				}
				if (arg8 < 10 && Static29.aClass58Array1[Static73.anInt1873].method1997(arg3, arg8 - 1, local7, local49, arg9, arg1)) {
					local69 = true;
					break;
				}
			}
			if (arg6 != 0 && arg4 != 0 && Static29.aClass58Array1[Static73.anInt1873].method1987(arg3, arg9, local7, arg7, arg6, arg4, local49)) {
				local69 = true;
				break;
			}
			local192 = Static132.anIntArrayArray24[local7][local49] + 1;
			if (local7 > 0 && Static155.anIntArrayArray27[local7 - 1][local49] == 0 && (local74[local7 - 1][local49] & 0x12C0108) == 0) {
				Static159.anIntArray341[local58] = local7 - 1;
				Static88.anIntArray211[local58] = local49;
				Static155.anIntArrayArray27[local7 - 1][local49] = 2;
				local58 = (local58 + 1) % local67;
				Static132.anIntArrayArray24[local7 - 1][local49] = local192;
			}
			if (local7 < 103 && Static155.anIntArrayArray27[local7 + 1][local49] == 0 && (local74[local7 + 1][local49] & 0x12C0180) == 0) {
				Static159.anIntArray341[local58] = local7 + 1;
				Static88.anIntArray211[local58] = local49;
				local58 = (local58 + 1) % local67;
				Static155.anIntArrayArray27[local7 + 1][local49] = 8;
				Static132.anIntArrayArray24[local7 + 1][local49] = local192;
			}
			if (local49 > 0 && Static155.anIntArrayArray27[local7][local49 - 1] == 0 && (local74[local7][local49 - 1] & 0x12C0102) == 0) {
				Static159.anIntArray341[local58] = local7;
				Static88.anIntArray211[local58] = local49 - 1;
				local58 = (local58 + 1) % local67;
				Static155.anIntArrayArray27[local7][local49 - 1] = 1;
				Static132.anIntArrayArray24[local7][local49 - 1] = local192;
			}
			if (local49 < 103 && Static155.anIntArrayArray27[local7][local49 + 1] == 0 && (local74[local7][local49 + 1] & 0x12C0120) == 0) {
				Static159.anIntArray341[local58] = local7;
				Static88.anIntArray211[local58] = local49 + 1;
				local58 = (local58 + 1) % local67;
				Static155.anIntArrayArray27[local7][local49 + 1] = 4;
				Static132.anIntArrayArray24[local7][local49 + 1] = local192;
			}
			if (local7 > 0 && local49 > 0 && Static155.anIntArrayArray27[local7 - 1][local49 - 1] == 0 && (local74[local7 - 1][local49 - 1] & 0x12C010E) == 0 && (local74[local7 - 1][local49] & 0x12C0108) == 0 && (local74[local7][local49 - 1] & 0x12C0102) == 0) {
				Static159.anIntArray341[local58] = local7 - 1;
				Static88.anIntArray211[local58] = local49 - 1;
				Static155.anIntArrayArray27[local7 - 1][local49 - 1] = 3;
				local58 = (local58 + 1) % local67;
				Static132.anIntArrayArray24[local7 - 1][local49 - 1] = local192;
			}
			if (local7 < 103 && local49 > 0 && Static155.anIntArrayArray27[local7 + 1][local49 - 1] == 0 && (local74[local7 + 1][local49 - 1] & 0x12C0183) == 0 && (local74[local7 + 1][local49] & 0x12C0180) == 0 && (local74[local7][local49 - 1] & 0x12C0102) == 0) {
				Static159.anIntArray341[local58] = local7 + 1;
				Static88.anIntArray211[local58] = local49 - 1;
				Static155.anIntArrayArray27[local7 + 1][local49 - 1] = 9;
				Static132.anIntArrayArray24[local7 + 1][local49 - 1] = local192;
				local58 = (local58 + 1) % local67;
			}
			if (local7 > 0 && local49 < 103 && Static155.anIntArrayArray27[local7 - 1][local49 + 1] == 0 && (local74[local7 - 1][local49 + 1] & 0x12C0138) == 0 && (local74[local7 - 1][local49] & 0x12C0108) == 0 && (local74[local7][local49 + 1] & 0x12C0120) == 0) {
				Static159.anIntArray341[local58] = local7 - 1;
				Static88.anIntArray211[local58] = local49 + 1;
				local58 = (local58 + 1) % local67;
				Static155.anIntArrayArray27[local7 - 1][local49 + 1] = 6;
				Static132.anIntArrayArray24[local7 - 1][local49 + 1] = local192;
			}
			if (local7 < 103 && local49 < 103 && Static155.anIntArrayArray27[local7 + 1][local49 + 1] == 0 && (local74[local7 + 1][local49 + 1] & 0x12C01E0) == 0 && (local74[local7 + 1][local49] & 0x12C0180) == 0 && (local74[local7][local49 + 1] & 0x12C0120) == 0) {
				Static159.anIntArray341[local58] = local7 + 1;
				Static88.anIntArray211[local58] = local49 + 1;
				local58 = (local58 + 1) % local67;
				Static155.anIntArrayArray27[local7 + 1][local49 + 1] = 12;
				Static132.anIntArrayArray24[local7 + 1][local49 + 1] = local192;
			}
		}
		Static100.anInt2544 = 0;
		@Pc(814) int local814;
		@Pc(821) int local821;
		@Pc(827) int local827;
		@Pc(853) int local853;
		if (!local69) {
			if (!arg5) {
				return false;
			}
			local192 = 1000;
			local814 = 100;
			for (local821 = arg3 - 10; local821 <= arg3 + 10; local821++) {
				for (local827 = arg9 - 10; local827 <= arg9 + 10; local827++) {
					if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && Static132.anIntArrayArray24[local821][local827] < 100) {
						local853 = 0;
						@Pc(855) int local855 = 0;
						if (local827 < arg9) {
							local855 = arg9 - local827;
						} else if (arg4 + arg9 - 1 < local827) {
							local855 = local827 + 1 - arg4 - arg9;
						}
						if (arg3 > local821) {
							local853 = arg3 - local821;
						} else if (local821 > arg6 + arg3 - 1) {
							local853 = local821 + 1 - arg6 - arg3;
						}
						@Pc(928) int local928 = local855 * local855 + local853 * local853;
						if (local928 < local192 || local192 == local928 && Static132.anIntArrayArray24[local821][local827] < local814) {
							local192 = local928;
							local814 = Static132.anIntArrayArray24[local821][local827];
							local7 = local821;
							local49 = local827;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (local7 == arg0 && local49 == arg2) {
				return false;
			}
			Static100.anInt2544 = 1;
		}
		@Pc(1005) byte local1005 = 0;
		Static159.anIntArray341[0] = local7;
		local64 = local1005 + 1;
		Static88.anIntArray211[0] = local49;
		local192 = local814 = Static155.anIntArrayArray27[local7][local49];
		while (arg0 != local7 || local49 != arg2) {
			if (local192 != local814) {
				Static159.anIntArray341[local64] = local7;
				local814 = local192;
				Static88.anIntArray211[local64++] = local49;
			}
			if ((local192 & 0x2) != 0) {
				local7++;
			} else if ((local192 & 0x8) != 0) {
				local7--;
			}
			if ((local192 & 0x1) != 0) {
				local49++;
			} else if ((local192 & 0x4) != 0) {
				local49--;
			}
			local192 = Static155.anIntArrayArray27[local7][local49];
		}
		if (local64 > 0) {
			local67 = local64;
			if (local64 > 25) {
				local67 = 25;
			}
			local64--;
			local827 = Static88.anIntArray211[local64];
			local821 = Static159.anIntArray341[local64];
			if (arg10 == 0) {
				Static90.aClass4_Sub11_Sub1_1.method1285(183);
				Static90.aClass4_Sub11_Sub1_1.method1238(local67 + local67 + 3);
			}
			if (arg10 == 1) {
				Static90.aClass4_Sub11_Sub1_1.method1285(126);
				Static90.aClass4_Sub11_Sub1_1.method1238(local67 + local67 + 17);
			}
			if (arg10 == 2) {
				Static90.aClass4_Sub11_Sub1_1.method1285(39);
				Static90.aClass4_Sub11_Sub1_1.method1238(local67 + local67 + 3);
			}
			Static90.aClass4_Sub11_Sub1_1.method1260(local827 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1222(Static14.aBooleanArray2[82] ? 1 : 0);
			Static4.anInt2846 = Static159.anIntArray341[0];
			Static170.anInt3809 = Static88.anIntArray211[0];
			for (local853 = 1; local853 < local67; local853++) {
				local64--;
				Static90.aClass4_Sub11_Sub1_1.method1237(Static159.anIntArray341[local64] - local821);
				Static90.aClass4_Sub11_Sub1_1.method1237(Static88.anIntArray211[local64] - local827);
			}
			Static90.aClass4_Sub11_Sub1_1.method1274(Static103.anInt2610 + local821);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
