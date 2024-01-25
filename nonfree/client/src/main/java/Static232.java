import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "J")
	public static long aLong131;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "[S")
	public static final short[] aShortArray48 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!il", name = "m", descriptor = "[S")
	private static final short[] aShortArray49 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!il", name = "o", descriptor = "[S")
	private static final short[] aShortArray50 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!il", name = "p", descriptor = "[S")
	private static final short[] aShortArray51 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!il", name = "n", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { aShortArray50, aShortArray48, aShortArray51, aShortArray49 };

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
	public static int[] anIntArray311 = null;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZB)V")
	public static void method4294(@OriginalArg(0) boolean arg0) {
		if (Static319.aClass240_2 != null) {
			Static319.aClass240_2.method6372();
			Static319.aClass240_2 = null;
		}
		Static453.anInt8320 = 0;
		Static593.method8194();
		Static465.method6989();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static204.aClass48Array1[local19].method1636();
		}
		Static590.method8160(false);
		System.gc();
		Static383.method6155();
		Static424.aBoolean575 = false;
		Static505.anInt8909 = -1;
		Static117.method2615();
		Static291.method4858(true);
		Static19.anInt3646 = 0;
		Static325.anInt6515 = 0;
		Static336.anInt6621 = 0;
		Static148.anInt6592 = 0;
		Static628.anInt10493 = 0;
		Static594.anInt10160 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static447.aClass319Array3.length; local60++) {
			Static447.aClass319Array3[local60] = null;
		}
		Static388.method6211();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local75] = null;
		}
		Static59.anInt1906 = 0;
		Static278.aClass253_20.method6598();
		Static438.anInt8226 = 0;
		Static567.aClass253_38.method6598();
		Static254.method3442();
		Static48.anInt4222 = 0;
		Static420.aClass77_1.method2396();
		Static400.method6362();
		Static120.method2704();
		Static18.aLong10 = 0L;
		Static246.aClass8_Sub48_2 = null;
		if (arg0) {
			Static63.method1687(12);
			return;
		}
		Static63.method1687(3);
		try {
			Static646.method1435("loggedout", Static152.anApplet1);
		} catch (@Pc(130) Throwable local130) {
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method4295(@OriginalArg(0) int arg0) {
		Static600.anInt10225 = arg0;
		Static60.aClass236_11.method6253();
	}
}
