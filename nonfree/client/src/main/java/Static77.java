import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public static int anInt2100;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Lclient!oc;")
	public static Class34 aClass34_58;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
	public static int[] anIntArray241 = new int[128];

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1223 = Static15.method178("Classic");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1221 = aClass23_1223;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt2096 = -1;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1222 = Static15.method178("Classic");

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array7 = new Class1_Sub1_Sub6_Sub1[1000];

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public static int anInt2104 = 0;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public static int anInt2108 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1339() {
		if (!Static67.aBoolean99) {
			return;
		}
		Static108.aClass34_80 = null;
		Static100.aClass1_Sub1_Sub6_Sub3_21 = null;
		Static67.aClass1_Sub1_Sub6_Sub3_18 = null;
		Static55.aClass34_45 = null;
		Static83.aClass34_64 = null;
		Static96.aClass1_Sub1_Sub6_Sub3_17 = null;
		Static69.aClass1_Sub1_Sub6_Sub3_19 = null;
		Static12.anIntArray328 = null;
		Static33.aClass1_Sub1_Sub6_Sub3_8 = null;
		Static49.aClass1_Sub1_Sub6_Sub3_14 = null;
		Static37.aClass1_Sub1_Sub6_Sub3_12 = null;
		Static92.aClass34_84 = null;
		Static9.aClass1_Sub1_Sub6_Sub3_1 = null;
		Static84.aClass34_66 = null;
		Static110.aClass34_83 = null;
		Static71.anIntArray236 = null;
		Static79.aClass34_59 = null;
		Static16.aClass34_11 = null;
		Static75.aClass34_56 = null;
		Static33.aClass1_Sub1_Sub6_Sub3_9 = null;
		Static108.aClass1_Sub1_Sub6_Sub3_23 = null;
		Static15.aClass1_Sub1_Sub6_Sub3_4 = null;
		Static36.aClass1_Sub1_Sub6_Sub3_11 = null;
		Static60.aClass34_48 = null;
		Static34.aClass1_Sub1_Sub6_Sub3_10 = null;
		Static67.aBoolean99 = false;
		Static70.aClass34_50 = null;
		Static88.aClass34_32 = null;
		Static102.aClass1_Sub1_Sub6_Sub3_22 = null;
		Static41.aClass1_Sub1_Sub6_Sub3_13 = null;
		Static34.anIntArray145 = null;
		Static114.aClass34_85 = null;
		Static7.aClass34_8 = null;
		Static75.aClass1_Sub1_Sub6_Sub3_20 = null;
		Static44.anIntArray175 = null;
		Static54.anIntArray194 = null;
		Static55.aClass1_Sub1_Sub6_Sub3Array6 = null;
		Static7.aClass34_9 = null;
		Static28.anIntArray263 = null;
		Static107.aClass34_78 = null;
		Static58.anIntArray393 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!rb;BLclient!rb;)V")
	public static void method1340(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1) {
		Static84.aClass55_37 = arg0;
		Static11.aClass55_4 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method1341() {
		for (@Pc(7) int local7 = -1; local7 < Static2.anInt2290; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static63.anIntArray226[local7];
			}
			@Pc(25) Class1_Sub1_Sub2_Sub1_Sub2 local25 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local17];
			if (local25 != null) {
				Static67.method1264(1, local25);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public static synchronized void method1342() {
		if (Static113.method1921()) {
			Static90.method1541();
			Static79.aClass55_33 = null;
			Static109.aBoolean130 = false;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1343() {
		aClass23_1222 = null;
		aClass23_1221 = null;
		aClass1_Sub1_Sub6_Sub1Array7 = null;
		aClass23_1223 = null;
		aClass34_58 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!rb;IIIZII)V")
	public static synchronized void method1344(@OriginalArg(1) Class55 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		if (!Static113.method1921()) {
			return;
		}
		Static40.anInt1398 = 10;
		Static15.aBoolean16 = false;
		Static63.anInt1923 = -1;
		Static79.aClass55_33 = arg0;
		Static88.anInt1265 = arg1;
		Static44.anInt1489 = arg3;
		Static109.aBoolean130 = true;
		Static47.anInt1602 = 0;
		Static73.anInt2051 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public static synchronized void method1345() {
		if (Static113.method1921()) {
			Static69.method1283();
			Static109.aBoolean130 = false;
			Static79.aClass55_33 = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z")
	public static boolean method1346(@OriginalArg(0) int arg0) {
		if (Static26.aBooleanArray4[arg0]) {
			return true;
		} else if (Static12.aClass55_38.method1868(arg0)) {
			@Pc(21) int local21 = Static12.aClass55_38.method1865(arg0);
			if (local21 == 0) {
				Static26.aBooleanArray4[arg0] = true;
				return true;
			}
			if (Static105.aClass1_Sub1_Sub7ArrayArray1[arg0] == null) {
				Static105.aClass1_Sub1_Sub7ArrayArray1[arg0] = new Class1_Sub1_Sub7[local21];
			}
			for (@Pc(41) int local41 = 0; local41 < local21; local41++) {
				if (Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local41] == null) {
					@Pc(54) byte[] local54 = Static12.aClass55_38.method1867(local41, arg0);
					if (local54 != null) {
						Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local41] = new Class1_Sub1_Sub7();
						Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local41].anInt826 = (arg0 << 16) + local41;
						if (local54[0] == -1) {
							Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local41].method430(new Class1_Sub5(local54));
						} else {
							Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local41].method436(new Class1_Sub5(local54));
						}
					}
				}
			}
			Static26.aBooleanArray4[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public static synchronized void method1347() {
		if (!Static113.method1921()) {
			return;
		}
		if (Static109.aBoolean130) {
			@Pc(30) byte[] local30 = Static76.method1335(Static44.anInt1489, Static79.aClass55_33, Static88.anInt1265, Static47.anInt1602);
			if (local30 != null) {
				if (Static40.anInt1398 >= 0) {
					Static11.method114(Static15.aBoolean16, Static40.anInt1398, Static73.anInt2051, local30);
				} else if (Static63.anInt1923 < 0) {
					Static41.method891(local30, Static15.aBoolean16, Static73.anInt2051);
				} else {
					Static41.method887(Static73.anInt2051, Static63.anInt1923, Static15.aBoolean16, local30);
				}
				Static109.aBoolean130 = false;
				Static79.aClass55_33 = null;
			}
		}
		Static84.method1467();
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public static synchronized void method1348() {
		Static28.method1393();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZILclient!gd;Lclient!rb;Lclient!gd;)V")
	public static synchronized void method1349(@OriginalArg(2) int arg0, @OriginalArg(5) Class23 arg1, @OriginalArg(6) Class55 arg2, @OriginalArg(7) Class23 arg3) {
		if (Static113.method1921()) {
			@Pc(12) int local12 = arg2.method1885(arg3);
			@Pc(18) int local18 = arg2.method1876(local12, arg1);
			method1344(arg2, local12, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBIIIILclient!rb;)V")
	public static synchronized void method1350(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class55 arg3) {
		if (!Static113.method1921()) {
			return;
		}
		Static47.anInt1602 = arg2;
		Static79.aClass55_33 = arg3;
		Static15.aBoolean16 = false;
		Static73.anInt2051 = arg0;
		Static63.anInt1923 = -1;
		Static88.anInt1265 = arg1;
		Static44.anInt1489 = 0;
		Static109.aBoolean130 = true;
		Static40.anInt1398 = -1;
	}
}
