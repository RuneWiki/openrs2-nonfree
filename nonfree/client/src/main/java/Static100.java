import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_21;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1458 = Static15.method178("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!ba;")
	public static Class5 aClass5_56 = new Class5(64);

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1459 = Static15.method178("This world is full)3");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1460 = aClass23_1459;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1461 = Static15.method178("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public static int anInt2590 = 0;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1465 = Static15.method178("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1462 = aClass23_1465;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1466 = Static15.method178("Choose Option");

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1463 = aClass23_1466;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1469 = Static15.method178("Unable to connect)3");

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1464 = aClass23_1469;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	public static int anInt2593 = 0;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1467 = aClass23_1469;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1468 = aClass23_1465;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method1671() {
		Static11.aClass5_8.method99();
		Static11.aClass5_9.method99();
		Static1.aClass5_3.method99();
		Static42.aClass5_36.method99();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1672() {
		for (@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) Static109.aClass45_9.method1299(); local10 != null; local10 = (Class1_Sub11) Static109.aClass45_9.method1288()) {
			if (local10.anInt2038 > 0) {
				local10.anInt2038--;
			}
			if (local10.anInt2038 != 0) {
				if (local10.anInt2049 > 0) {
					local10.anInt2049--;
				}
				if (local10.anInt2049 == 0 && local10.anInt2039 >= 1 && local10.anInt2041 >= 1 && local10.anInt2039 <= 102 && local10.anInt2041 <= 102 && (local10.anInt2035 < 0 || Static37.method744(local10.anInt2035, local10.anInt2043))) {
					Static71.method1285(local10.anInt2039, local10.anInt2037, local10.anInt2046, local10.anInt2041, local10.anInt2035, local10.anInt2048, local10.anInt2043);
					local10.anInt2049 = -1;
					if (local10.anInt2044 == local10.anInt2035 && local10.anInt2044 == -1) {
						local10.method1913();
					} else if (local10.anInt2035 == local10.anInt2044 && local10.anInt2050 == local10.anInt2048 && local10.anInt2036 == local10.anInt2043) {
						local10.method1913();
					}
				}
			} else if (local10.anInt2044 < 0 || Static37.method744(local10.anInt2044, local10.anInt2036)) {
				Static71.method1285(local10.anInt2039, local10.anInt2037, local10.anInt2046, local10.anInt2041, local10.anInt2044, local10.anInt2050, local10.anInt2036);
				local10.method1913();
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method1673() {
		aClass23_1459 = null;
		aClass23_1464 = null;
		aClass23_1460 = null;
		aClass23_1458 = null;
		aClass5_56 = null;
		anIntArray348 = null;
		aClass23_1469 = null;
		aClass23_1461 = null;
		aClass23_1468 = null;
		aClass1_Sub1_Sub6_Sub3_21 = null;
		aClass23_1463 = null;
		aClass23_1466 = null;
		aClass23_1465 = null;
		aClass23_1462 = null;
		aClass23_1467 = null;
		anIntArrayArray58 = null;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method1674() {
		Static9.aBoolean7 = true;
		Static103.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!rb;IZLclient!rb;)V")
	public static void method1675(@OriginalArg(0) Class55 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class55 arg2) {
		Static36.aBoolean67 = arg1;
		Static98.aClass55_40 = arg0;
		Static37.aClass55_19 = arg2;
	}
}
