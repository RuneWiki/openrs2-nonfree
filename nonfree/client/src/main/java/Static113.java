import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_6;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_398 = Static80.method1463("(Y");

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!mb;")
	public static Class49 aClass49_7 = new Class49(64);

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_399 = Static80.method1463("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "Lclient!qb;")
	public static Class61 aClass61_2 = new Class61();

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "Lclient!rd;")
	public static Class63 aClass63_400 = Static80.method1463("runes");

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "Lclient!rd;")
	private static Class63 aClass63_402 = Static80.method1463("Loaded update list");

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!rd;")
	public static Class63 aClass63_401 = aClass63_402;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array6 = new Class63[20];

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Lclient!rd;")
	public static Class63 aClass63_403 = Static80.method1463(": ");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIIIIIIII)Z")
	public static boolean method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static79.anIntArrayArray29[local3][local7] = 0;
				Static115.anIntArrayArray37[local3][local7] = 99999999;
			}
		}
		Static79.anIntArrayArray29[arg7][arg9] = 99;
		Static115.anIntArrayArray37[arg7][arg9] = 0;
		local7 = arg7;
		@Pc(53) int local53 = arg9;
		@Pc(55) byte local55 = 0;
		Static25.anIntArray75[0] = arg7;
		@Pc(61) boolean local61 = false;
		@Pc(64) int local64 = local55 + 1;
		Static71.anIntArray231[0] = arg9;
		@Pc(68) int local68 = 0;
		@Pc(71) int local71 = Static25.anIntArray75.length;
		@Pc(76) int[][] local76 = Static15.aClass30Array1[Static101.anInt2810].anIntArrayArray18;
		@Pc(194) int local194;
		while (local64 != local68) {
			local53 = Static71.anIntArray231[local68];
			local7 = Static25.anIntArray75[local68];
			local68 = (local68 + 1) % local71;
			if (arg1 == local7 && local53 == arg4) {
				local61 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static15.aClass30Array1[Static101.anInt2810].method1000(arg1, arg0, arg4, arg5 - 1, local53, local7)) {
					local61 = true;
					break;
				}
				if (arg5 < 10 && Static15.aClass30Array1[Static101.anInt2810].method985(local53, arg5 - 1, arg0, local7, arg4, arg1)) {
					local61 = true;
					break;
				}
			}
			if (arg10 != 0 && arg6 != 0 && Static15.aClass30Array1[Static101.anInt2810].method999(arg6, arg10, arg4, local7, arg1, local53, arg8)) {
				local61 = true;
				break;
			}
			local194 = Static115.anIntArrayArray37[local7][local53] + 1;
			if (local7 > 0 && Static79.anIntArrayArray29[local7 - 1][local53] == 0 && (local76[local7 - 1][local53] & 0x1280108) == 0) {
				Static25.anIntArray75[local64] = local7 - 1;
				Static71.anIntArray231[local64] = local53;
				Static79.anIntArrayArray29[local7 - 1][local53] = 2;
				Static115.anIntArrayArray37[local7 - 1][local53] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local7 < 103 && Static79.anIntArrayArray29[local7 + 1][local53] == 0 && (local76[local7 + 1][local53] & 0x1280180) == 0) {
				Static25.anIntArray75[local64] = local7 + 1;
				Static71.anIntArray231[local64] = local53;
				Static79.anIntArrayArray29[local7 + 1][local53] = 8;
				Static115.anIntArrayArray37[local7 + 1][local53] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local53 > 0 && Static79.anIntArrayArray29[local7][local53 - 1] == 0 && (local76[local7][local53 - 1] & 0x1280102) == 0) {
				Static25.anIntArray75[local64] = local7;
				Static71.anIntArray231[local64] = local53 - 1;
				local64 = (local64 + 1) % local71;
				Static79.anIntArrayArray29[local7][local53 - 1] = 1;
				Static115.anIntArrayArray37[local7][local53 - 1] = local194;
			}
			if (local53 < 103 && Static79.anIntArrayArray29[local7][local53 + 1] == 0 && (local76[local7][local53 + 1] & 0x1280120) == 0) {
				Static25.anIntArray75[local64] = local7;
				Static71.anIntArray231[local64] = local53 + 1;
				local64 = (local64 + 1) % local71;
				Static79.anIntArrayArray29[local7][local53 + 1] = 4;
				Static115.anIntArrayArray37[local7][local53 + 1] = local194;
			}
			if (local7 > 0 && local53 > 0 && Static79.anIntArrayArray29[local7 - 1][local53 - 1] == 0 && (local76[local7 - 1][local53 - 1] & 0x128010E) == 0 && (local76[local7 - 1][local53] & 0x1280108) == 0 && (local76[local7][local53 - 1] & 0x1280102) == 0) {
				Static25.anIntArray75[local64] = local7 - 1;
				Static71.anIntArray231[local64] = local53 - 1;
				Static79.anIntArrayArray29[local7 - 1][local53 - 1] = 3;
				Static115.anIntArrayArray37[local7 - 1][local53 - 1] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local7 < 103 && local53 > 0 && Static79.anIntArrayArray29[local7 + 1][local53 - 1] == 0 && (local76[local7 + 1][local53 - 1] & 0x1280183) == 0 && (local76[local7 + 1][local53] & 0x1280180) == 0 && (local76[local7][local53 - 1] & 0x1280102) == 0) {
				Static25.anIntArray75[local64] = local7 + 1;
				Static71.anIntArray231[local64] = local53 - 1;
				Static79.anIntArrayArray29[local7 + 1][local53 - 1] = 9;
				local64 = (local64 + 1) % local71;
				Static115.anIntArrayArray37[local7 + 1][local53 - 1] = local194;
			}
			if (local7 > 0 && local53 < 103 && Static79.anIntArrayArray29[local7 - 1][local53 + 1] == 0 && (local76[local7 - 1][local53 + 1] & 0x1280138) == 0 && (local76[local7 - 1][local53] & 0x1280108) == 0 && (local76[local7][local53 + 1] & 0x1280120) == 0) {
				Static25.anIntArray75[local64] = local7 - 1;
				Static71.anIntArray231[local64] = local53 + 1;
				local64 = (local64 + 1) % local71;
				Static79.anIntArrayArray29[local7 - 1][local53 + 1] = 6;
				Static115.anIntArrayArray37[local7 - 1][local53 + 1] = local194;
			}
			if (local7 < 103 && local53 < 103 && Static79.anIntArrayArray29[local7 + 1][local53 + 1] == 0 && (local76[local7 + 1][local53 + 1] & 0x12801E0) == 0 && (local76[local7 + 1][local53] & 0x1280180) == 0 && (local76[local7][local53 + 1] & 0x1280120) == 0) {
				Static25.anIntArray75[local64] = local7 + 1;
				Static71.anIntArray231[local64] = local53 + 1;
				local64 = (local64 + 1) % local71;
				Static79.anIntArrayArray29[local7 + 1][local53 + 1] = 12;
				Static115.anIntArrayArray37[local7 + 1][local53 + 1] = local194;
			}
		}
		Static59.anInt1766 = 0;
		@Pc(815) int local815;
		@Pc(824) int local824;
		@Pc(831) int local831;
		if (!local61) {
			if (!arg3) {
				return false;
			}
			local815 = 100;
			local194 = 1000;
			for (local824 = arg1 - 10; local824 <= arg1 + 10; local824++) {
				for (local831 = arg4 - 10; local831 <= arg4 + 10; local831++) {
					if (local824 >= 0 && local831 >= 0 && local824 < 104 && local831 < 104 && Static115.anIntArrayArray37[local824][local831] < 100) {
						@Pc(856) int local856 = 0;
						if (arg1 > local824) {
							local856 = arg1 - local824;
						} else if (local824 > arg1 + arg10 - 1) {
							local856 = local824 + 1 - arg10 - arg1;
						}
						@Pc(885) int local885 = 0;
						if (arg4 > local831) {
							local885 = arg4 - local831;
						} else if (local831 > arg4 + arg6 - 1) {
							local885 = local831 + 1 - arg4 - arg6;
						}
						@Pc(923) int local923 = local885 * local885 + local856 * local856;
						if (local194 > local923 || local194 == local923 && Static115.anIntArrayArray37[local824][local831] < local815) {
							local7 = local824;
							local815 = Static115.anIntArrayArray37[local824][local831];
							local53 = local831;
							local194 = local923;
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (arg7 == local7 && local53 == arg9) {
				return false;
			}
			Static59.anInt1766 = 1;
		}
		@Pc(1005) byte local1005 = 0;
		Static25.anIntArray75[0] = local7;
		local68 = local1005 + 1;
		Static71.anIntArray231[0] = local53;
		local194 = local815 = Static79.anIntArrayArray29[local7][local53];
		while (arg7 != local7 || arg9 != local53) {
			if (local194 != local815) {
				local815 = local194;
				Static25.anIntArray75[local68] = local7;
				Static71.anIntArray231[local68++] = local53;
			}
			if ((local194 & 0x1) != 0) {
				local53++;
			} else if ((local194 & 0x4) != 0) {
				local53--;
			}
			if ((local194 & 0x2) != 0) {
				local7++;
			} else if ((local194 & 0x8) != 0) {
				local7--;
			}
			local194 = Static79.anIntArrayArray29[local7][local53];
		}
		if (local68 > 0) {
			local71 = local68;
			if (local68 > 25) {
				local71 = 25;
			}
			local68--;
			@Pc(1110) int local1110 = Static25.anIntArray75[local68];
			local824 = Static71.anIntArray231[local68];
			if (arg2 == 0) {
				Static23.aClass6_Sub4_Sub1_4.method1347(73);
				Static23.aClass6_Sub4_Sub1_4.method1330(local71 + local71 + 3);
			}
			if (arg2 == 1) {
				Static23.aClass6_Sub4_Sub1_4.method1347(233);
				Static23.aClass6_Sub4_Sub1_4.method1330(local71 + local71 + 14 + 3);
			}
			if (arg2 == 2) {
				Static23.aClass6_Sub4_Sub1_4.method1347(83);
				Static23.aClass6_Sub4_Sub1_4.method1330(local71 + local71 + 3);
			}
			Static36.anInt1217 = Static25.anIntArray75[0];
			Static52.anInt1599 = Static71.anIntArray231[0];
			for (local831 = 1; local831 < local71; local831++) {
				local68--;
				Static23.aClass6_Sub4_Sub1_4.method1330(Static25.anIntArray75[local68] - local1110);
				Static23.aClass6_Sub4_Sub1_4.method1291(Static71.anIntArray231[local68] - local824);
			}
			Static23.aClass6_Sub4_Sub1_4.method1284(Static44.aBooleanArray8[82] ? 1 : 0);
			Static23.aClass6_Sub4_Sub1_4.method1314(Static91.anInt2560 + local824);
			Static23.aClass6_Sub4_Sub1_4.method1332(local1110 + Static80.anInt2169);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	public static void method496() {
		aClass63_398 = null;
		aClass49_7 = null;
		aClass63_400 = null;
		aClass63Array6 = null;
		aClass63_401 = null;
		aClass61_2 = null;
		aClass63_402 = null;
		aClass63_403 = null;
		aClass6_Sub3_Sub3_Sub3_6 = null;
		aClass63_399 = null;
		aClass7_Sub1_4 = null;
	}
}
