import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "Lclient!hh;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lclient!ob;")
	public static Class60 aClass60_14;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1419 = Static169.method2903("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1416 = aClass23_1419;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1417 = Static169.method2903("Texturen geladen)3");

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "[I")
	public static int[] anIntArray491 = new int[128];

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	public static int anInt3735 = 0;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1418 = Static169.method2903(":duelstake:");

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	public static int anInt3741 = 0;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Lclient!ma;")
	public static Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1420 = Static169.method2903(" ");

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1421 = Static169.method2903("::gc");

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1422 = Static169.method2903("Schlie-8en");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
	public static int method2567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub21 local20 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg0);
		if (local20 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local20.anIntArray515.length; local34++) {
				if (local20.anIntArray513[local34] == arg1) {
					local32 += local20.anIntArray515[local34];
				}
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public static void method2568(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static76.method1369(Static33.aClass23_356, Static106.aClass23_1057, Static99.aClass23_977);
		} else if (arg0 == -2) {
			Static76.method1369(Static33.aClass23_345, Static33.aClass23_366, Static13.aClass23_164);
		} else if (arg0 == -1) {
			Static76.method1369(Static33.aClass23_332, Static46.aClass23_1651, Static99.aClass23_974);
		} else if (arg0 == 3) {
			Static76.method1369(Static33.aClass23_335, Static33.aClass23_344, Static101.aClass23_999);
		} else if (arg0 == 4) {
			Static76.method1369(Static33.aClass23_369, Static44.aClass23_460, Static54.aClass23_547);
		} else if (arg0 == 5) {
			Static76.method1369(Static33.aClass23_348, Static30.aClass23_1077, Static31.aClass23_315);
		} else if (arg0 == 6) {
			Static76.method1369(Static33.aClass23_329, Static80.aClass23_793, Static68.aClass23_658);
		} else if (arg0 == 7) {
			Static76.method1369(Static33.aClass23_361, Static41.aClass23_433, Static171.aClass23_1586);
		} else if (arg0 == 8) {
			Static76.method1369(Static33.aClass23_365, Static171.aClass23_1583, Static40.aClass23_415);
		} else if (arg0 == 9) {
			Static76.method1369(Static33.aClass23_338, Static40.aClass23_411, Static54.aClass23_548);
		} else if (arg0 == 10) {
			Static76.method1369(Static33.aClass23_352, Static171.aClass23_1584, Static128.aClass23_1261);
		} else if (arg0 == 11) {
			Static76.method1369(Static33.aClass23_360, Static142.aClass23_1363, Static64.aClass23_621);
		} else if (arg0 == 12) {
			Static76.method1369(Static33.aClass23_333, Static43.aClass23_441, Static152.aClass23_1327);
		} else if (arg0 == 13) {
			Static76.method1369(Static33.aClass23_362, Static44.aClass23_464, Static99.aClass23_970);
		} else if (arg0 == 14) {
			Static76.method1369(Static33.aClass23_339, Static10.aClass23_134, Static167.aClass23_1568);
		} else if (arg0 == 16) {
			Static76.method1369(Static33.aClass23_343, Static25.aClass23_280, Static57.aClass23_597);
		} else if (arg0 == 17) {
			Static76.method1369(Static33.aClass23_351, Static112.aClass23_1104, Static81.aClass23_509);
		} else if (arg0 == 18) {
			Static76.method1369(Static33.aClass23_363, Static65.aClass23_1385, Static29.aClass23_305);
		} else if (arg0 == 19) {
			Static76.method1369(Static171.aClass23_1582, Static157.aClass23_1474, Static182.aClass23_1676);
		} else if (arg0 == 20) {
			Static76.method1369(Static33.aClass23_354, Static123.aClass23_1193, Static99.aClass23_972);
		} else if (arg0 == 22) {
			Static76.method1369(Static33.aClass23_346, Static61.aClass23_603, Static36.aClass23_383);
		} else if (arg0 == 23) {
			Static76.method1369(Static33.aClass23_336, Static10.aClass23_136, Static167.aClass23_1569);
		} else if (arg0 == 24) {
			Static76.method1369(Static33.aClass23_331, Static22.aClass23_250, Static130.aClass23_1272);
		} else if (arg0 == 25) {
			Static76.method1369(Static33.aClass23_355, Static140.aClass23_1359, Static99.aClass23_975);
		} else if (arg0 == 26) {
			Static76.method1369(Static33.aClass23_347, Static139.aClass23_1335, Static139.aClass23_1341);
		} else if (arg0 == 27) {
			Static76.method1369(Static33.aClass23_341, Static33.aClass23_367, Static97.aClass23_960);
		} else {
			Static76.method1369(Static33.aClass23_334, Static29.aClass23_303, Static99.aClass23_973);
		}
		Static32.method567(10);
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method2570() {
		anIntArray491 = null;
		aClass23_1422 = null;
		aClass60_14 = null;
		aClass23_1419 = null;
		aClass40_2 = null;
		aClass53_1 = null;
		aClass23_1416 = null;
		aClass23_1418 = null;
		aClass23_1421 = null;
		aClass23_1420 = null;
		aClass23_1417 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([Lclient!ed;Z)Lclient!ed;")
	public static Class23 method2571(@OriginalArg(0) Class23[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static72.method1310(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I")
	public static int method2572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 2 << 10) + (arg1 >> 5 << 7) + (arg0 >> 1);
	}
}
