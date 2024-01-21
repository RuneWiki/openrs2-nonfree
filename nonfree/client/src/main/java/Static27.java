import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!wc;")
	public static Class81 aClass81_3 = new Class81(4096);

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_180 = Static60.method1113("hitmarks");

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "J")
	public static volatile long aLong26 = 0L;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_181 = Static60.method1113("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "[I")
	public static int[] anIntArray74 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	public static int anInt620 = 0;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_182 = Static60.method1113("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public static int method432() {
		return Static116.anInt2871++;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method434() {
		anIntArray75 = null;
		anIntArray74 = null;
		aClass22_180 = null;
		Class21.anIntArray73 = null;
		aClass22_182 = null;
		aClass81_3 = null;
		anIntArrayArray3 = null;
		aClass22_181 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		@Pc(25) Class4_Sub1_Sub11 local25 = (Class4_Sub1_Sub11) Static110.aClass81_14.method2010(local11);
		if (local25 != null) {
			Static105.aClass78_2.method1972(local25);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILclient!qd;)V")
	public static void method436(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3_Sub2 arg1) {
		if (arg1.anInt2488 > Static117.anInt2877) {
			Static74.method1212(arg1);
		} else if (arg1.anInt2482 >= Static117.anInt2877) {
			Static13.method217(arg1);
		} else {
			Static122.method946(arg1);
		}
		if (arg1.anInt2500 < 128 || arg1.anInt2462 < 128 || arg1.anInt2500 >= 13184 || arg1.anInt2462 >= 13184) {
			arg1.anInt2500 = arg1.anIntArray280[0] * 128 + arg1.anInt2473 * 64;
			arg1.anInt2462 = arg1.anInt2473 * 64 + arg1.anIntArray277[0] * 128;
			arg1.anInt2474 = -1;
			arg1.anInt2482 = 0;
			arg1.anInt2489 = -1;
			arg1.anInt2488 = 0;
			arg1.method1613();
		}
		if (arg1 == Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1 && (arg1.anInt2500 < 1536 || arg1.anInt2462 < 1536 || arg1.anInt2500 >= 11776 || arg1.anInt2462 >= 11776)) {
			arg1.anInt2482 = 0;
			arg1.anInt2500 = arg1.anIntArray280[0] * 128 + arg1.anInt2473 * 64;
			arg1.anInt2489 = -1;
			arg1.anInt2488 = 0;
			arg1.anInt2462 = arg1.anInt2473 * 64 + arg1.anIntArray277[0] * 128;
			arg1.anInt2474 = -1;
			arg1.method1613();
		}
		Static49.method916(arg1);
		Static121.method1882(arg1);
	}
}
