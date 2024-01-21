import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "Lclient!d;")
	public static Class16 aClass16_1 = new Class16(4096);

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_105 = Static122.method531("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_106 = Static122.method531("cyan:");

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_107 = Static122.method531("welle:");

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_108 = Static122.method531("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_109 = aClass73_106;

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_110 = aClass73_106;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!sd;Lclient!sd;Lclient!f;I)Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 method101(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(13) int local13 = arg2.method359(arg0);
		@Pc(19) int local19 = arg2.method358(local13, arg1);
		return Static100.method1731(local13, arg2, local19);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIBIZIIIII)Z")
	public static boolean method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static109.anIntArrayArray29[local7][local11] = 0;
				Static166.anIntArrayArray37[local7][local11] = 99999999;
			}
		}
		Static109.anIntArrayArray29[arg9][arg0] = 99;
		local11 = arg9;
		@Pc(45) int local45 = arg0;
		Static166.anIntArrayArray37[arg9][arg0] = 0;
		@Pc(53) byte local53 = 0;
		Static166.anIntArray383[0] = arg9;
		@Pc(60) int local60 = local53 + 1;
		Static71.anIntArray175[0] = arg0;
		@Pc(65) int local65 = Static166.anIntArray383.length;
		@Pc(67) boolean local67 = false;
		@Pc(69) int local69 = 0;
		@Pc(82) int[][] local82 = Static41.aClass60Array1[Static147.anInt3309].anIntArrayArray34;
		@Pc(200) int local200;
		while (local69 != local60) {
			local45 = Static71.anIntArray175[local69];
			local11 = Static166.anIntArray383[local69];
			local69 = (local69 + 1) % local65;
			if (arg6 == local11 && arg4 == local45) {
				local67 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static41.aClass60Array1[Static147.anInt3309].method2151(arg1 - 1, arg10, arg6, arg4, local45, local11)) {
					local67 = true;
					break;
				}
				if (arg1 < 10 && Static41.aClass60Array1[Static147.anInt3309].method2159(local11, arg6, local45, arg10, arg1 - 1, arg4)) {
					local67 = true;
					break;
				}
			}
			if (arg3 != 0 && arg2 != 0 && Static41.aClass60Array1[Static147.anInt3309].method2155(arg7, arg4, arg2, local45, local11, arg3, arg6)) {
				local67 = true;
				break;
			}
			local200 = Static166.anIntArrayArray37[local11][local45] + 1;
			if (local11 > 0 && Static109.anIntArrayArray29[local11 - 1][local45] == 0 && (local82[local11 - 1][local45] & 0x12C0108) == 0) {
				Static166.anIntArray383[local60] = local11 - 1;
				Static71.anIntArray175[local60] = local45;
				local60 = (local60 + 1) % local65;
				Static109.anIntArrayArray29[local11 - 1][local45] = 2;
				Static166.anIntArrayArray37[local11 - 1][local45] = local200;
			}
			if (local11 < 103 && Static109.anIntArrayArray29[local11 + 1][local45] == 0 && (local82[local11 + 1][local45] & 0x12C0180) == 0) {
				Static166.anIntArray383[local60] = local11 + 1;
				Static71.anIntArray175[local60] = local45;
				Static109.anIntArrayArray29[local11 + 1][local45] = 8;
				Static166.anIntArrayArray37[local11 + 1][local45] = local200;
				local60 = (local60 + 1) % local65;
			}
			if (local45 > 0 && Static109.anIntArrayArray29[local11][local45 - 1] == 0 && (local82[local11][local45 - 1] & 0x12C0102) == 0) {
				Static166.anIntArray383[local60] = local11;
				Static71.anIntArray175[local60] = local45 - 1;
				local60 = (local60 + 1) % local65;
				Static109.anIntArrayArray29[local11][local45 - 1] = 1;
				Static166.anIntArrayArray37[local11][local45 - 1] = local200;
			}
			if (local45 < 103 && Static109.anIntArrayArray29[local11][local45 + 1] == 0 && (local82[local11][local45 + 1] & 0x12C0120) == 0) {
				Static166.anIntArray383[local60] = local11;
				Static71.anIntArray175[local60] = local45 + 1;
				Static109.anIntArrayArray29[local11][local45 + 1] = 4;
				local60 = (local60 + 1) % local65;
				Static166.anIntArrayArray37[local11][local45 + 1] = local200;
			}
			if (local11 > 0 && local45 > 0 && Static109.anIntArrayArray29[local11 - 1][local45 - 1] == 0 && (local82[local11 - 1][local45 - 1] & 0x12C010E) == 0 && (local82[local11 - 1][local45] & 0x12C0108) == 0 && (local82[local11][local45 - 1] & 0x12C0102) == 0) {
				Static166.anIntArray383[local60] = local11 - 1;
				Static71.anIntArray175[local60] = local45 - 1;
				Static109.anIntArrayArray29[local11 - 1][local45 - 1] = 3;
				local60 = (local60 + 1) % local65;
				Static166.anIntArrayArray37[local11 - 1][local45 - 1] = local200;
			}
			if (local11 < 103 && local45 > 0 && Static109.anIntArrayArray29[local11 + 1][local45 - 1] == 0 && (local82[local11 + 1][local45 - 1] & 0x12C0183) == 0 && (local82[local11 + 1][local45] & 0x12C0180) == 0 && (local82[local11][local45 - 1] & 0x12C0102) == 0) {
				Static166.anIntArray383[local60] = local11 + 1;
				Static71.anIntArray175[local60] = local45 - 1;
				local60 = (local60 + 1) % local65;
				Static109.anIntArrayArray29[local11 + 1][local45 - 1] = 9;
				Static166.anIntArrayArray37[local11 + 1][local45 - 1] = local200;
			}
			if (local11 > 0 && local45 < 103 && Static109.anIntArrayArray29[local11 - 1][local45 + 1] == 0 && (local82[local11 - 1][local45 + 1] & 0x12C0138) == 0 && (local82[local11 - 1][local45] & 0x12C0108) == 0 && (local82[local11][local45 + 1] & 0x12C0120) == 0) {
				Static166.anIntArray383[local60] = local11 - 1;
				Static71.anIntArray175[local60] = local45 + 1;
				Static109.anIntArrayArray29[local11 - 1][local45 + 1] = 6;
				Static166.anIntArrayArray37[local11 - 1][local45 + 1] = local200;
				local60 = (local60 + 1) % local65;
			}
			if (local11 < 103 && local45 < 103 && Static109.anIntArrayArray29[local11 + 1][local45 + 1] == 0 && (local82[local11 + 1][local45 + 1] & 0x12C01E0) == 0 && (local82[local11 + 1][local45] & 0x12C0180) == 0 && (local82[local11][local45 + 1] & 0x12C0120) == 0) {
				Static166.anIntArray383[local60] = local11 + 1;
				Static71.anIntArray175[local60] = local45 + 1;
				local60 = (local60 + 1) % local65;
				Static109.anIntArrayArray29[local11 + 1][local45 + 1] = 12;
				Static166.anIntArrayArray37[local11 + 1][local45 + 1] = local200;
			}
		}
		Static179.anInt3897 = 0;
		@Pc(828) int local828;
		@Pc(833) int local833;
		@Pc(839) int local839;
		if (!local67) {
			if (!arg5) {
				return false;
			}
			local200 = 1000;
			local828 = 100;
			for (local833 = arg6 - 10; local833 <= arg6 + 10; local833++) {
				for (local839 = arg4 - 10; local839 <= arg4 + 10; local839++) {
					if (local833 >= 0 && local839 >= 0 && local833 < 104 && local839 < 104 && Static166.anIntArrayArray37[local833][local839] < 100) {
						@Pc(862) int local862 = 0;
						@Pc(864) int local864 = 0;
						if (arg4 > local839) {
							local864 = arg4 - local839;
						} else if (arg4 + arg2 - 1 < local839) {
							local864 = local839 + 1 - arg2 - arg4;
						}
						if (arg6 > local833) {
							local862 = arg6 - local833;
						} else if (local833 > arg3 + arg6 - 1) {
							local862 = local833 + 1 - arg3 - arg6;
						}
						@Pc(942) int local942 = local864 * local864 + local862 * local862;
						if (local200 > local942 || local942 == local200 && Static166.anIntArrayArray37[local833][local839] < local828) {
							local200 = local942;
							local11 = local833;
							local45 = local839;
							local828 = Static166.anIntArrayArray37[local833][local839];
						}
					}
				}
			}
			if (local200 == 1000) {
				return false;
			}
			if (local11 == arg9 && arg0 == local45) {
				return false;
			}
			Static179.anInt3897 = 1;
		}
		@Pc(1013) byte local1013 = 0;
		Static166.anIntArray383[0] = local11;
		local69 = local1013 + 1;
		Static71.anIntArray175[0] = local45;
		local200 = local828 = Static109.anIntArrayArray29[local11][local45];
		while (arg9 != local11 || local45 != arg0) {
			if (local828 != local200) {
				local828 = local200;
				Static166.anIntArray383[local69] = local11;
				Static71.anIntArray175[local69++] = local45;
			}
			if ((local200 & 0x2) != 0) {
				local11++;
			} else if ((local200 & 0x8) != 0) {
				local11--;
			}
			if ((local200 & 0x1) != 0) {
				local45++;
			} else if ((local200 & 0x4) != 0) {
				local45--;
			}
			local200 = Static109.anIntArrayArray29[local11][local45];
		}
		if (local69 > 0) {
			local65 = local69--;
			local833 = Static71.anIntArray175[local69];
			if (local65 > 25) {
				local65 = 25;
			}
			@Pc(1116) int local1116 = Static166.anIntArray383[local69];
			if (arg8 == 0) {
				Static139.aClass3_Sub12_Sub1_3.method1400(193);
				Static139.aClass3_Sub12_Sub1_3.method1383(local65 + local65 + 3);
			}
			if (arg8 == 1) {
				Static139.aClass3_Sub12_Sub1_3.method1400(136);
				Static139.aClass3_Sub12_Sub1_3.method1383(local65 + local65 + 14 + 3);
			}
			if (arg8 == 2) {
				Static139.aClass3_Sub12_Sub1_3.method1400(133);
				Static139.aClass3_Sub12_Sub1_3.method1383(local65 + local65 + 3);
			}
			Static139.aClass3_Sub12_Sub1_3.method1363(Static151.anInt3389 + local1116);
			Static139.aClass3_Sub12_Sub1_3.method1358(Static172.aBooleanArray17[82] ? 1 : 0);
			Static139.aClass3_Sub12_Sub1_3.method1361(local833 + Static134.anInt3066);
			Static14.anInt354 = Static166.anIntArray383[0];
			Static29.anInt764 = Static71.anIntArray175[0];
			for (local839 = 1; local839 < local65; local839++) {
				local69--;
				Static139.aClass3_Sub12_Sub1_3.method1371(Static166.anIntArray383[local69] - local1116);
				Static139.aClass3_Sub12_Sub1_3.method1383(Static71.anIntArray175[local69] - local833);
			}
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
	public static boolean method103(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
	public static void method105() {
		aClass16_1 = null;
		aByteArrayArray1 = null;
		aClass73_108 = null;
		aClass73_109 = null;
		aClass73_107 = null;
		aClass73_106 = null;
		aClass73_105 = null;
		aClass73_110 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!cb;BLclient!je;)V")
	public static void method106(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class72 local9 = Static124.aClass72_39;
		synchronized (Static124.aClass72_39) {
			for (@Pc(16) Class3_Sub19 local16 = (Class3_Sub19) Static124.aClass72_39.method2401(); local16 != null; local16 = (Class3_Sub19) Static124.aClass72_39.method2407()) {
				if (local16.aLong183 == (long) arg0 && arg2 == local16.aClass43_4 && local16.anInt3102 == 0) {
					local7 = local16.aByteArray35;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg2.method1298(arg0);
			arg1.method373(true, arg2, local71, arg0);
		} else {
			arg1.method373(true, arg2, local7, arg0);
		}
	}
}
