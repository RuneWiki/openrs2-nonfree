import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!le", name = "ub", descriptor = "Lclient!qf;")
	private static Class60 aClass60_920 = Static59.method1195("green:");

	@OriginalMember(owner = "client!le", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_919 = aClass60_920;

	@OriginalMember(owner = "client!le", name = "wb", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!le", name = "zb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_921 = Static59.method1195("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!le", name = "Db", descriptor = "I")
	public static int anInt2121 = 0;

	@OriginalMember(owner = "client!le", name = "Eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_922 = aClass60_920;

	@OriginalMember(owner = "client!le", name = "Gb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_923 = Static59.method1195("jolt");

	@OriginalMember(owner = "client!le", name = "Hb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_924 = Static59.method1195("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!le", name = "Kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_925 = Static59.method1195("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!le", name = "Lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_926 = Static59.method1195("mapmarker");

	@OriginalMember(owner = "client!le", name = "Ob", descriptor = "Lclient!qf;")
	private static Class60 aClass60_928 = Static59.method1195("flash2:");

	@OriginalMember(owner = "client!le", name = "Mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_927 = aClass60_928;

	@OriginalMember(owner = "client!le", name = "Pb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_929 = aClass60_921;

	@OriginalMember(owner = "client!le", name = "Qb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!le", name = "Tb", descriptor = "I")
	public static final int anInt2126 = 5063219;

	@OriginalMember(owner = "client!le", name = "Ub", descriptor = "Lclient!qf;")
	public static Class60 aClass60_930 = aClass60_928;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIBIIIIIIII)Z")
	public static boolean method1378(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static101.anIntArrayArray72[local3][local7] = 0;
				Static36.anIntArrayArray34[local3][local7] = 99999999;
			}
		}
		Static101.anIntArrayArray72[arg9][arg10] = 99;
		Static36.anIntArrayArray34[arg9][arg10] = 0;
		local7 = arg9;
		@Pc(54) int local54 = arg10;
		@Pc(56) byte local56 = 0;
		Static108.anIntArray326[0] = arg9;
		@Pc(62) int local62 = 0;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = local56 + 1;
		Static66.anIntArray216[0] = arg10;
		@Pc(72) int local72 = Static108.anIntArray326.length;
		@Pc(77) int[][] local77 = Static89.aClass72Array1[Static119.anInt3243].anIntArrayArray78;
		@Pc(193) int local193;
		while (local67 != local62) {
			local54 = Static66.anIntArray216[local62];
			local7 = Static108.anIntArray326[local62];
			local62 = (local62 + 1) % local72;
			if (arg0 == local7 && arg8 == local54) {
				local64 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static89.aClass72Array1[Static119.anInt3243].method2108(arg0, local7, arg8, local54, arg2 - 1, arg6)) {
					local64 = true;
					break;
				}
				if (arg2 < 10 && Static89.aClass72Array1[Static119.anInt3243].method2103(arg8, arg6, local54, local7, arg0, arg2 - 1)) {
					local64 = true;
					break;
				}
			}
			if (arg5 != 0 && arg3 != 0 && Static89.aClass72Array1[Static119.anInt3243].method2105(arg7, arg5, local7, arg3, local54, arg0, arg8)) {
				local64 = true;
				break;
			}
			local193 = Static36.anIntArrayArray34[local7][local54] + 1;
			if (local7 > 0 && Static101.anIntArrayArray72[local7 - 1][local54] == 0 && (local77[local7 - 1][local54] & 0x12C0108) == 0) {
				Static108.anIntArray326[local67] = local7 - 1;
				Static66.anIntArray216[local67] = local54;
				local67 = (local67 + 1) % local72;
				Static101.anIntArrayArray72[local7 - 1][local54] = 2;
				Static36.anIntArrayArray34[local7 - 1][local54] = local193;
			}
			if (local7 < 103 && Static101.anIntArrayArray72[local7 + 1][local54] == 0 && (local77[local7 + 1][local54] & 0x12C0180) == 0) {
				Static108.anIntArray326[local67] = local7 + 1;
				Static66.anIntArray216[local67] = local54;
				Static101.anIntArrayArray72[local7 + 1][local54] = 8;
				local67 = (local67 + 1) % local72;
				Static36.anIntArrayArray34[local7 + 1][local54] = local193;
			}
			if (local54 > 0 && Static101.anIntArrayArray72[local7][local54 - 1] == 0 && (local77[local7][local54 - 1] & 0x12C0102) == 0) {
				Static108.anIntArray326[local67] = local7;
				Static66.anIntArray216[local67] = local54 - 1;
				local67 = (local67 + 1) % local72;
				Static101.anIntArrayArray72[local7][local54 - 1] = 1;
				Static36.anIntArrayArray34[local7][local54 - 1] = local193;
			}
			if (local54 < 103 && Static101.anIntArrayArray72[local7][local54 + 1] == 0 && (local77[local7][local54 + 1] & 0x12C0120) == 0) {
				Static108.anIntArray326[local67] = local7;
				Static66.anIntArray216[local67] = local54 + 1;
				local67 = (local67 + 1) % local72;
				Static101.anIntArrayArray72[local7][local54 + 1] = 4;
				Static36.anIntArrayArray34[local7][local54 + 1] = local193;
			}
			if (local7 > 0 && local54 > 0 && Static101.anIntArrayArray72[local7 - 1][local54 - 1] == 0 && (local77[local7 - 1][local54 - 1] & 0x12C010E) == 0 && (local77[local7 - 1][local54] & 0x12C0108) == 0 && (local77[local7][local54 - 1] & 0x12C0102) == 0) {
				Static108.anIntArray326[local67] = local7 - 1;
				Static66.anIntArray216[local67] = local54 - 1;
				local67 = (local67 + 1) % local72;
				Static101.anIntArrayArray72[local7 - 1][local54 - 1] = 3;
				Static36.anIntArrayArray34[local7 - 1][local54 - 1] = local193;
			}
			if (local7 < 103 && local54 > 0 && Static101.anIntArrayArray72[local7 + 1][local54 - 1] == 0 && (local77[local7 + 1][local54 - 1] & 0x12C0183) == 0 && (local77[local7 + 1][local54] & 0x12C0180) == 0 && (local77[local7][local54 - 1] & 0x12C0102) == 0) {
				Static108.anIntArray326[local67] = local7 + 1;
				Static66.anIntArray216[local67] = local54 - 1;
				local67 = (local67 + 1) % local72;
				Static101.anIntArrayArray72[local7 + 1][local54 - 1] = 9;
				Static36.anIntArrayArray34[local7 + 1][local54 - 1] = local193;
			}
			if (local7 > 0 && local54 < 103 && Static101.anIntArrayArray72[local7 - 1][local54 + 1] == 0 && (local77[local7 - 1][local54 + 1] & 0x12C0138) == 0 && (local77[local7 - 1][local54] & 0x12C0108) == 0 && (local77[local7][local54 + 1] & 0x12C0120) == 0) {
				Static108.anIntArray326[local67] = local7 - 1;
				Static66.anIntArray216[local67] = local54 + 1;
				Static101.anIntArrayArray72[local7 - 1][local54 + 1] = 6;
				Static36.anIntArrayArray34[local7 - 1][local54 + 1] = local193;
				local67 = (local67 + 1) % local72;
			}
			if (local7 < 103 && local54 < 103 && Static101.anIntArrayArray72[local7 + 1][local54 + 1] == 0 && (local77[local7 + 1][local54 + 1] & 0x12C01E0) == 0 && (local77[local7 + 1][local54] & 0x12C0180) == 0 && (local77[local7][local54 + 1] & 0x12C0120) == 0) {
				Static108.anIntArray326[local67] = local7 + 1;
				Static66.anIntArray216[local67] = local54 + 1;
				Static101.anIntArrayArray72[local7 + 1][local54 + 1] = 12;
				Static36.anIntArrayArray34[local7 + 1][local54 + 1] = local193;
				local67 = (local67 + 1) % local72;
			}
		}
		Static100.anInt2951 = 0;
		@Pc(793) int local793;
		@Pc(798) int local798;
		@Pc(805) int local805;
		if (!local64) {
			if (!arg1) {
				return false;
			}
			local193 = 1000;
			local793 = 100;
			for (local798 = arg0 - 10; local798 <= arg0 + 10; local798++) {
				for (local805 = arg8 - 10; local805 <= arg8 + 10; local805++) {
					if (local798 >= 0 && local805 >= 0 && local798 < 104 && local805 < 104 && Static36.anIntArrayArray34[local798][local805] < 100) {
						@Pc(830) int local830 = 0;
						if (local798 < arg0) {
							local830 = arg0 - local798;
						} else if (local798 > arg0 + arg5 - 1) {
							local830 = local798 + 1 - arg0 - arg5;
						}
						@Pc(861) int local861 = 0;
						if (local805 < arg8) {
							local861 = arg8 - local805;
						} else if (local805 > arg8 + arg3 - 1) {
							local861 = local805 + 1 - arg8 - arg3;
						}
						@Pc(894) int local894 = local861 * local861 + local830 * local830;
						if (local193 > local894 || local193 == local894 && local793 > Static36.anIntArrayArray34[local798][local805]) {
							local7 = local798;
							local793 = Static36.anIntArrayArray34[local798][local805];
							local54 = local805;
							local193 = local894;
						}
					}
				}
			}
			if (local193 == 1000) {
				return false;
			}
			if (arg9 == local7 && local54 == arg10) {
				return false;
			}
			Static100.anInt2951 = 1;
		}
		@Pc(970) byte local970 = 0;
		Static108.anIntArray326[0] = local7;
		local62 = local970 + 1;
		Static66.anIntArray216[0] = local54;
		local193 = local793 = Static101.anIntArrayArray72[local7][local54];
		while (local7 != arg9 || arg10 != local54) {
			if (local793 != local193) {
				Static108.anIntArray326[local62] = local7;
				local793 = local193;
				Static66.anIntArray216[local62++] = local54;
			}
			if ((local193 & 0x1) != 0) {
				local54++;
			} else if ((local193 & 0x4) != 0) {
				local54--;
			}
			if ((local193 & 0x2) != 0) {
				local7++;
			} else if ((local193 & 0x8) != 0) {
				local7--;
			}
			local193 = Static101.anIntArrayArray72[local7][local54];
		}
		if (local62 > 0) {
			local72 = local62;
			if (local62 > 25) {
				local72 = 25;
			}
			local62--;
			@Pc(1068) int local1068 = Static108.anIntArray326[local62];
			local798 = Static66.anIntArray216[local62];
			if (arg4 == 0) {
				Static81.aClass3_Sub12_Sub1_2.method1980(25);
				Static81.aClass3_Sub12_Sub1_2.method1937(local72 + local72 + 3);
			}
			if (arg4 == 1) {
				Static81.aClass3_Sub12_Sub1_2.method1980(191);
				Static81.aClass3_Sub12_Sub1_2.method1937(local72 + local72 + 3 + 14);
			}
			if (arg4 == 2) {
				Static81.aClass3_Sub12_Sub1_2.method1980(186);
				Static81.aClass3_Sub12_Sub1_2.method1937(local72 + local72 + 3);
			}
			Static81.aClass3_Sub12_Sub1_2.method1967(local1068 + Static112.anInt3118);
			Static81.aClass3_Sub12_Sub1_2.method1937(Static109.aBooleanArray65[82] ? 1 : 0);
			Static77.anInt2428 = Static108.anIntArray326[0];
			Static31.anInt1107 = Static66.anIntArray216[0];
			for (local805 = 1; local805 < local72; local805++) {
				local62--;
				Static81.aClass3_Sub12_Sub1_2.method1949(Static108.anIntArray326[local62] - local1068);
				Static81.aClass3_Sub12_Sub1_2.method1919(Static66.anIntArray216[local62] - local798);
			}
			Static81.aClass3_Sub12_Sub1_2.method1922(local798 + Static13.anInt410);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIBILclient!ha;I)V")
	public static void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) Class25_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg0 + (arg5 << 16));
		@Pc(16) Class3_Sub1_Sub4 local16 = (Class3_Sub1_Sub4) Static58.aClass82_6.method2305(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub4) Static39.aClass82_4.method2305(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub4) Static64.aClass82_7.method2305(local10);
		if (local16 == null) {
			if (!arg1) {
				local16 = (Class3_Sub1_Sub4) Static29.aClass82_3.method2305(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub4();
			local16.anInt864 = arg2;
			local16.aByte6 = arg3;
			local16.aClass25_Sub1_2 = arg4;
			if (arg1) {
				Static58.aClass82_6.method2303(local16, local10);
				Static30.anInt1030++;
			} else {
				Static128.aClass43_2.method1392(local16);
				Static64.aClass82_7.method2303(local16, local10);
				Static48.anInt1544++;
			}
		} else if (arg1) {
			local16.method2270();
			Static58.aClass82_6.method2303(local16, local10);
			Static30.anInt1030++;
			Static48.anInt1544--;
		}
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "(I)V")
	public static void method1380() {
		aClass60_928 = null;
		aClass60_921 = null;
		aClass60_919 = null;
		aClass60_924 = null;
		aClass60_925 = null;
		aLongArray2 = null;
		aClass60_920 = null;
		aClass60_926 = null;
		aClass60_929 = null;
		aClass60_923 = null;
		aClass60_927 = null;
		aClass60_922 = null;
		aClass60_930 = null;
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "(I)V")
	public static void method1381() {
		Static77.aClass17_38.method646();
		Static48.aClass17_25.method646();
		Static35.aClass17_19.method646();
		Static33.aClass17_17.method646();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!jb;Lclient!jb;)I")
	public static int method1382(@OriginalArg(1) Class25 arg0, @OriginalArg(2) Class25 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method925(Static105.aClass60_1279, Static81.aClass60_1086)) {
			local1++;
		}
		if (arg1.method925(Static105.aClass60_1279, Static32.aClass60_430)) {
			local1++;
		}
		if (arg1.method925(Static105.aClass60_1279, Static32.aClass60_427)) {
			local1++;
		}
		if (arg1.method925(Static105.aClass60_1279, Static14.aClass60_189)) {
			local1++;
		}
		if (arg1.method925(Static105.aClass60_1279, Static62.aClass60_860)) {
			local1++;
		}
		if (arg1.method925(Static105.aClass60_1279, Static30.aClass60_397)) {
			local1++;
		}
		arg1.method925(Static105.aClass60_1279, Static46.aClass60_634);
		arg1.method925(Static105.aClass60_1279, Static10.aClass60_137);
		arg1.method925(Static105.aClass60_1279, Static122.aClass60_257);
		arg1.method925(Static105.aClass60_1279, Static45.aClass60_628);
		arg1.method925(Static105.aClass60_1279, Static58.aClass60_802);
		return local1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBII)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = arg3; local8 <= arg2 + arg3; local8++) {
			for (@Pc(12) int local12 = arg0; local12 <= arg1 + arg0; local12++) {
				if (local12 >= 0 && local12 < 104 && local8 >= 0 && local8 < 104) {
					Static11.aByteArrayArrayArray1[0][local12][local8] = 127;
					if (local12 == arg0 && local12 > 0) {
						Static51.anIntArrayArrayArray3[0][local12][local8] = Static51.anIntArrayArrayArray3[0][local12 - 1][local8];
					}
					if (local12 == arg1 + arg0 && local12 < 103) {
						Static51.anIntArrayArrayArray3[0][local12][local8] = Static51.anIntArrayArrayArray3[0][local12 + 1][local8];
					}
					if (local8 == arg3 && local8 > 0) {
						Static51.anIntArrayArrayArray3[0][local12][local8] = Static51.anIntArrayArrayArray3[0][local12][local8 - 1];
					}
					if (local8 == arg3 + arg2 && local8 < 103) {
						Static51.anIntArrayArrayArray3[0][local12][local8] = Static51.anIntArrayArrayArray3[0][local12][local8 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!qf;)Z")
	public static boolean method1384(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(28) int local28 = 0; local28 < Static61.anInt1946; local28++) {
			if (arg0.method1860(Static54.aClass60Array6[local28])) {
				return true;
			}
		}
		return arg0.method1860(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245);
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "(I)V")
	public static void method1385() {
		Static14.aBoolean15 = false;
		Static94.aBoolean99 = false;
	}
}
