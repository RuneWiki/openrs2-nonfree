import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!ag;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_3 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	public static int anInt3108 = 0;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1076 = Static65.method1172("Please wait)3)3)3");

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1075 = aClass46_1076;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public static int anInt3123 = 0;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1077 = Static65.method1172("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][105][105];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!kb;")
	public static Class46 method2255(@OriginalArg(0) int arg0) {
		@Pc(14) Class46 local14 = Static57.method1068(arg0);
		for (@Pc(20) int local20 = local14.method1376() - 3; local20 > 0; local20 -= 3) {
			local14 = Static178.method2860(new Class46[] { local14.method1363(local20, 0), Static4.aClass46_1337, local14.method1380(local20) });
		}
		if (local14.method1376() > 9) {
			return Static178.method2860(new Class46[] { Static14.aClass46_99, local14.method1363(local14.method1376() - 8, 0), Static121.aClass46_988, Static157.aClass46_1271, local14, Static54.aClass46_476 });
		} else if (local14.method1376() > 6) {
			return Static178.method2860(new Class46[] { Static174.aClass46_1375, local14.method1363(local14.method1376() - 4, 0), Static41.aClass46_1318, Static157.aClass46_1271, local14, Static54.aClass46_476 });
		} else {
			return Static178.method2860(new Class46[] { Static119.aClass46_973, local14, Static105.aClass46_835 });
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method2260() {
		aClass46_1076 = null;
		aClass46_1075 = null;
		aClass46_1077 = null;
		anIntArrayArrayArray8 = null;
		aLongArray2 = null;
		aBooleanArray18 = null;
		aClass3_Sub4_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method2262() {
		if (Static135.aClass33_13 != null || Static63.aClass33_5 != null) {
			return;
		}
		@Pc(18) int local18 = Static127.anInt3013;
		@Pc(33) int local33;
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (Static105.aBoolean103) {
			if (local18 != 1) {
				local33 = Static85.anInt676;
				local87 = Static149.anInt3582;
				if (local33 < Static163.anInt3620 - 10 || local33 > Static163.anInt3620 + Static39.anInt3979 + 10 || local87 < Static56.anInt1516 - 10 || local87 > Static33.anInt924 + Static56.anInt1516 + 10) {
					Static105.aBoolean103 = false;
					Static66.method1174(Static163.anInt3620, Static56.anInt1516, Static33.anInt924, Static39.anInt3979);
				}
			}
			if (local18 != 1) {
				return;
			}
			local33 = Static163.anInt3620;
			@Pc(234) int local234 = Static48.anInt1329;
			local93 = Static39.anInt3979;
			@Pc(238) int local238 = Static77.anInt1923;
			local87 = Static56.anInt1516;
			@Pc(242) int local242 = -1;
			for (@Pc(244) int local244 = 0; local244 < Static87.anInt2129; local244++) {
				@Pc(259) int local259 = (Static87.anInt2129 - local244 - 1) * 15 + local87 + 31;
				if (local238 > local33 && local93 + local33 > local238 && local259 - 13 < local234 && local234 < local259 + 3) {
					local242 = local244;
				}
			}
			if (local242 != -1) {
				Static102.method1679(local242);
			}
			Static105.aBoolean103 = false;
			Static66.method1174(Static163.anInt3620, Static56.anInt1516, Static33.anInt924, Static39.anInt3979);
			return;
		}
		if (local18 == 1 && Static87.anInt2129 > 0) {
			local33 = Static134.anIntArray352[Static87.anInt2129 - 1];
			if (local33 == 26 || local33 == 42 || local33 == 7 || local33 == 40 || local33 == 36 || local33 == 41 || local33 == 1 || local33 == 29 || local33 == 4 || local33 == 2 || local33 == 6 || local33 == 1005) {
				local87 = Static46.anIntArray122[Static87.anInt2129 - 1];
				local93 = Static97.anIntArray164[Static87.anInt2129 - 1];
				@Pc(97) Class33 local97 = Static179.method2873(local93);
				if (Static170.method2716(Static157.method2541(local97)) || Static100.method1649(Static157.method2541(local97))) {
					Static13.aBoolean12 = false;
					Static21.anInt3035 = 0;
					if (Static135.aClass33_13 != null) {
						Static142.method2373(Static135.aClass33_13);
					}
					Static135.aClass33_13 = Static179.method2873(local93);
					Static58.anInt1579 = Static77.anInt1923;
					Static96.anInt2348 = Static48.anInt1329;
					Static53.anInt1393 = local87;
					Static142.method2373(Static135.aClass33_13);
					return;
				}
			}
		}
		if (local18 == 1 && (Static167.anInt734 == 1 && Static87.anInt2129 > 2 || Static25.method2912(Static87.anInt2129 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static87.anInt2129 > 0) {
			Static102.method1679(Static87.anInt2129 - 1);
		}
		if (local18 == 2 && Static87.anInt2129 > 0) {
			Static57.method1071();
			return;
		}
	}
}
