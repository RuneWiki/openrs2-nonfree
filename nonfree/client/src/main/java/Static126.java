import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1744 = Static107.method1838("(U4");

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1747 = Static107.method1838("Loaded update list");

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1745 = aClass28_1747;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[I")
	public static int[] anIntArray271 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1746 = Static107.method1838("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Lclient!gg;")
	public static Class28 method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static73.aClass28_1137;
		} else if (local4 < -6) {
			return Static176.aClass28_2329;
		} else if (local4 < -3) {
			return Static96.aClass28_1418;
		} else if (local4 < 0) {
			return Static149.aClass28_1973;
		} else if (local4 > 9) {
			return Static100.aClass28_1459;
		} else if (local4 > 6) {
			return Static100.aClass28_1458;
		} else if (local4 > 3) {
			return Static121.aClass28_1705;
		} else if (local4 > 0) {
			return Static17.aClass28_426;
		} else {
			return Static137.aClass28_1831;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB[Lclient!ie;I[BIIIII)V")
	public static void method2043(@OriginalArg(0) int arg0, @OriginalArg(2) Class36[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) Class2_Sub2 local14 = new Class2_Sub2(arg3);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(22) int local22 = local14.method1679();
			if (local22 == 0) {
				return;
			}
			@Pc(29) int local29 = 0;
			local16 += local22;
			while (true) {
				@Pc(39) int local39 = local14.method1679();
				if (local39 == 0) {
					break;
				}
				local29 += local39 - 1;
				@Pc(51) int local51 = local29 & 0x3F;
				@Pc(57) int local57 = local29 >> 6 & 0x3F;
				@Pc(61) int local61 = local29 >> 12;
				@Pc(65) int local65 = local14.method1698();
				@Pc(69) int local69 = local65 & 0x3;
				@Pc(73) int local73 = local65 >> 2;
				if (local61 == arg6 && arg4 <= local57 && local57 < arg4 + 8 && arg7 <= local51 && arg7 + 8 > local51) {
					@Pc(108) Class2_Sub4_Sub6 local108 = Static151.method2339(local16);
					@Pc(125) int local125 = arg5 + Static34.method655(local69, local108.anInt1050, local51 & 0x7, local57 & 0x7, local108.anInt1037, arg8);
					@Pc(142) int local142 = arg0 + Static141.method2246(local51 & 0x7, local57 & 0x7, local108.anInt1037, local69, arg8, local108.anInt1050);
					if (local125 > 0 && local142 > 0 && local125 < 103 && local142 < 103) {
						@Pc(157) int local157 = arg2;
						if ((Static49.aByteArrayArrayArray4[1][local125][local142] & 0x2) == 2) {
							local157 = arg2 - 1;
						}
						@Pc(171) Class36 local171 = null;
						if (local157 >= 0) {
							local171 = arg1[local157];
						}
						Static170.method2899(local142, arg2, local125, arg8 + local69 & 0x3, local16, local73, local171);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!pa;)V")
	public static void method2044(@OriginalArg(1) Class60 arg0) {
		Static73.aClass60_1 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method2045() {
		aClass28_1744 = null;
		aBooleanArrayArrayArrayArray1 = null;
		anIntArray271 = null;
		aClass28_1747 = null;
		aShortArrayArray6 = null;
		aClass28_1746 = null;
		aClass28_1745 = null;
	}
}
