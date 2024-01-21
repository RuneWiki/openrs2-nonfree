import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
	public static int anInt1001;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!kd;")
	private static Class39 aClass39_464 = Static108.method1915("shake:");

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_463 = aClass39_464;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_470 = Static108.method1915("scroll:");

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_465 = aClass39_470;

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_466 = Static108.method1915("backbase2");

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_467 = aClass39_464;

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_468 = Static108.method1915("::fpson");

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_469 = aClass39_470;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][13][13];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Z")
	public static boolean method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static101.anInt2575 == arg0) {
			return true;
		} else if (arg1 == 1 && Static23.anInt813 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static114.anInt2847 == arg0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method600() {
		Static38.anInt1159++;
		Static13.method290(true);
		Static18.method355(true);
		Static13.method290(false);
		Static18.method355(false);
		Static62.method2037();
		Static74.method1284();
		@Pc(37) int local37;
		@Pc(77) int local77;
		if (!Static29.aBoolean86) {
			local37 = Static76.anInt1920;
			if (Static23.anInt810 / 256 > local37) {
				local37 = Static23.anInt810 / 256;
			}
			if (Static43.aBooleanArray6[4] && Static119.anIntArray462[4] + 128 > local37) {
				local37 = Static119.anIntArray462[4] + 128;
			}
			local77 = Static51.anInt1408 + Static103.anInt2618 & 0x7FF;
			Static122.method2062(Static45.anInt1255, local77, local37 * 3 + 600, Static53.anInt1464, Static62.method2035(Static9.anInt2983, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508) - 50, local37);
		}
		if (Static29.aBoolean86) {
			local37 = Static63.method1134();
		} else {
			local37 = Static43.method776();
		}
		local77 = Static28.anInt2564;
		@Pc(111) int local111 = Static22.anInt763;
		@Pc(113) int local113 = Static62.anInt2932;
		@Pc(115) int local115 = Static104.anInt2640;
		@Pc(117) int local117 = Static38.anInt1156;
		for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
			if (Static43.aBooleanArray6[local119]) {
				@Pc(161) int local161 = (int) ((double) -Static1.anIntArray13[local119] + (double) (Static1.anIntArray13[local119] * 2 + 1) * Math.random() + Math.sin((double) Static120.anIntArray478[local119] / 100.0D * (double) Static55.anIntArray213[local119]) * (double) Static119.anIntArray462[local119]);
				if (local119 == 3) {
					Static38.anInt1156 = Static38.anInt1156 + local161 & 0x7FF;
				}
				if (local119 == 0) {
					Static28.anInt2564 += local161;
				}
				if (local119 == 2) {
					Static62.anInt2932 += local161;
				}
				if (local119 == 4) {
					Static104.anInt2640 += local161;
					if (Static104.anInt2640 < 128) {
						Static104.anInt2640 = 128;
					}
					if (Static104.anInt2640 > 383) {
						Static104.anInt2640 = 383;
					}
				}
				if (local119 == 1) {
					Static22.anInt763 += local161;
				}
			}
		}
		Static116.method1993();
		Static80.anInt1983 = 0;
		Static80.anInt1985 = Static3.anInt150 - 4;
		Static80.aBoolean163 = true;
		Static80.anInt1986 = Static29.anInt971 - 4;
		Static81.method1387();
		Static15.method1510();
		Static81.method1387();
		Static32.aClass5_2.method120(Static28.anInt2564, Static22.anInt763, Static62.anInt2932, Static104.anInt2640, Static38.anInt1156, local37);
		Static81.method1387();
		Static32.aClass5_2.method119();
		Static31.method607();
		Static18.method353();
		((Class47) Static27.anInterface1_1).method1293(Static107.anInt2687);
		Static19.method363();
		if (Static2.aBoolean21 && Static73.method1256() == 0) {
			Static2.aBoolean21 = false;
		}
		if (Static2.aBoolean21) {
			Static116.method1993();
			Static15.method1510();
			Static9.method2066(Static117.aClass39_1399, false, null);
		}
		Static81.method1387();
		Static94.method1582();
		Static28.anInt2564 = local77;
		Static22.anInt763 = local111;
		Static62.anInt2932 = local113;
		Static38.anInt1156 = local117;
		Static104.anInt2640 = local115;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Lclient!kd;)Lclient!kd;")
	public static Class39 method601(@OriginalArg(1) Class39[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static17.method331(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public static void method602() {
		aClass39_463 = null;
		aClass39_464 = null;
		aClass39_468 = null;
		aClass39_467 = null;
		anIntArrayArrayArray5 = null;
		aClass39_469 = null;
		aClass39_465 = null;
		aClass39_466 = null;
		aClass39_470 = null;
	}
}
