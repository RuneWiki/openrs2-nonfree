import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!te", name = "X", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!te", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1413 = Static49.method1293("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!te", name = "W", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1414 = Static49.method1293("<br>(X");

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1415 = Static49.method1293("OFF");

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1418 = Static49.method1293("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1416 = aClass70_1418;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
	public static int anInt4192 = 0;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1417 = Static49.method1293("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1419 = aClass70_1417;

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1420 = Static49.method1293("Loading config )2 ");

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1421 = Static49.method1293("<img=0>");

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1422 = Static49.method1293(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1423 = aClass70_1420;

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1424 = aClass70_1415;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ei;III)V")
	public static void method3207(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub17 local12;
		@Pc(27) Class1_Sub1_Sub4_Sub3 local27;
		if (arg2 < Static73.anInt2250) {
			local12 = Static90.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass7_1 != null && local12.aClass7_1.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub3) {
				local27 = (Class1_Sub1_Sub4_Sub3) local12.aClass7_1.aClass1_Sub1_Sub4_1;
				Static46.method1142(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static73.anInt2250) {
			local12 = Static90.aClass1_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass7_1 != null && local12.aClass7_1.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub3) {
				local27 = (Class1_Sub1_Sub4_Sub3) local12.aClass7_1.aClass1_Sub1_Sub4_1;
				Static46.method1142(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static73.anInt2250 && arg3 < Static85.anInt2550) {
			local12 = Static90.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass7_1 != null && local12.aClass7_1.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub3) {
				local27 = (Class1_Sub1_Sub4_Sub3) local12.aClass7_1.aClass1_Sub1_Sub4_1;
				Static46.method1142(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static73.anInt2250 || arg3 <= 0) {
			return;
		}
		local12 = Static90.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass7_1 != null && local12.aClass7_1.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub3) {
			local27 = (Class1_Sub1_Sub4_Sub3) local12.aClass7_1.aClass1_Sub1_Sub4_1;
			Static46.method1142(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!de;B)V")
	public static void method3208(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0) {
		arg0.aBoolean72 = false;
		@Pc(22) Class1_Sub1_Sub17 local22;
		if (arg0.anInt2020 != -1) {
			local22 = Static90.method1962(arg0.anInt2020);
			if (local22 == null || local22.anIntArray365 == null) {
				arg0.anInt2020 = -1;
			} else {
				arg0.anInt2007++;
				if (arg0.anInt2009 < local22.anIntArray365.length && local22.anIntArray370[arg0.anInt2009] < arg0.anInt2007) {
					arg0.anInt2007 = 1;
					arg0.anInt2009++;
					Static68.method1569(arg0.anInt2001, arg0.anInt2009, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 == arg0, arg0.anInt2030, local22);
				}
				if (arg0.anInt2009 >= local22.anIntArray365.length) {
					arg0.anInt2009 = 0;
					arg0.anInt2007 = 0;
					Static68.method1569(arg0.anInt2001, arg0.anInt2009, arg0 == Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1, arg0.anInt2030, local22);
				}
			}
		}
		if (arg0.anInt2051 != -1 && Static47.anInt1654 >= arg0.anInt2036) {
			if (arg0.anInt2018 < 0) {
				arg0.anInt2018 = 0;
			}
			@Pc(139) int local139 = Static86.method1911(arg0.anInt2051).anInt4556;
			if (local139 == -1) {
				arg0.anInt2051 = -1;
			} else {
				@Pc(151) Class1_Sub1_Sub17 local151 = Static90.method1962(local139);
				if (local151 == null || local151.anIntArray365 == null) {
					arg0.anInt2051 = -1;
				} else {
					arg0.anInt2033++;
					if (local151.anIntArray365.length > arg0.anInt2018 && arg0.anInt2033 > local151.anIntArray370[arg0.anInt2018]) {
						arg0.anInt2018++;
						arg0.anInt2033 = 1;
						Static68.method1569(arg0.anInt2001, arg0.anInt2018, arg0 == Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1, arg0.anInt2030, local151);
					}
					if (local151.anIntArray365.length <= arg0.anInt2018) {
						arg0.anInt2051 = -1;
					}
				}
			}
		}
		if (arg0.anInt2041 != -1 && arg0.anInt2029 <= 1) {
			local22 = Static90.method1962(arg0.anInt2041);
			if (local22.anInt3876 == 1 && arg0.anInt2037 > 0 && Static47.anInt1654 >= arg0.anInt1996 && arg0.anInt2048 < Static47.anInt1654) {
				arg0.anInt2029 = 1;
				return;
			}
		}
		if (arg0.anInt2041 != -1 && arg0.anInt2029 == 0) {
			local22 = Static90.method1962(arg0.anInt2041);
			if (local22 == null || local22.anIntArray365 == null) {
				arg0.anInt2041 = -1;
			} else {
				arg0.anInt2010++;
				if (local22.anIntArray365.length > arg0.anInt1999 && local22.anIntArray370[arg0.anInt1999] < arg0.anInt2010) {
					arg0.anInt1999++;
					arg0.anInt2010 = 1;
					Static68.method1569(arg0.anInt2001, arg0.anInt1999, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 == arg0, arg0.anInt2030, local22);
				}
				if (arg0.anInt1999 >= local22.anIntArray365.length) {
					arg0.anInt2044++;
					arg0.anInt1999 -= local22.anInt3869;
					if (arg0.anInt2044 >= local22.anInt3864) {
						arg0.anInt2041 = -1;
					} else if (arg0.anInt1999 >= 0 && arg0.anInt1999 < local22.anIntArray365.length) {
						Static68.method1569(arg0.anInt2001, arg0.anInt1999, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 == arg0, arg0.anInt2030, local22);
					} else {
						arg0.anInt2041 = -1;
					}
				}
				arg0.aBoolean72 = local22.aBoolean144;
			}
		}
		if (arg0.anInt2029 > 0) {
			arg0.anInt2029--;
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	public static void method3209() {
		aClass70_1423 = null;
		aClass70_1418 = null;
		aClass70_1424 = null;
		aClass70_1422 = null;
		aClass70_1420 = null;
		aClass70_1421 = null;
		anIntArray399 = null;
		aClass70_1416 = null;
		aClass70_1419 = null;
		aClass70_1417 = null;
		aClass70_1413 = null;
		aClass70_1415 = null;
		aClass70_1414 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([Lclient!rf;Z)Lclient!rf;")
	public static Class70 method3210(@OriginalArg(0) Class70[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static53.method1335(arg0, arg0.length, 0);
	}
}
