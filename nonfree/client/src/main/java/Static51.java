import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!j", name = "Lb", descriptor = "I")
	public static int anInt1473;

	@OriginalMember(owner = "client!j", name = "Xb", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_356 = Static60.method1113("Schlie-8en");

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "Lclient!lf;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "[I")
	public static int[] anIntArray144 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
	public static int anInt1453 = 0;

	@OriginalMember(owner = "client!j", name = "tb", descriptor = "I")
	public static int anInt1461 = 0;

	@OriginalMember(owner = "client!j", name = "vb", descriptor = "Lclient!ja;")
	public static Class33 aClass33_19 = new Class33(64);

	@OriginalMember(owner = "client!j", name = "Qb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_358 = Static60.method1113("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!j", name = "Cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_357 = aClass22_358;

	@OriginalMember(owner = "client!j", name = "Hb", descriptor = "[I")
	public static int[] anIntArray146 = new int[2048];

	@OriginalMember(owner = "client!j", name = "Vb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_360 = Static60.method1113("wave:");

	@OriginalMember(owner = "client!j", name = "Wb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_361 = aClass22_360;

	@OriginalMember(owner = "client!j", name = "Yb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_362 = Static60.method1113("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!j", name = "Zb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_363 = Static60.method1113("level)2");

	@OriginalMember(owner = "client!j", name = "ac", descriptor = "Lclient!ec;")
	public static Class22 aClass22_364 = aClass22_363;

	@OriginalMember(owner = "client!j", name = "bc", descriptor = "[B")
	public static byte[] aByteArray13 = new byte[520];

	@OriginalMember(owner = "client!j", name = "cc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_365 = aClass22_360;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
	public static void method981(@OriginalArg(1) boolean arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static84.anInt2255; local1++) {
			@Pc(11) Class4_Sub1_Sub3_Sub2_Sub2 local11 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local1]];
			@Pc(19) int local19 = (Static13.anIntArray33[local1] << 14) + 536870912;
			if (local11 != null && local11.method1614() && arg0 == local11.aClass4_Sub1_Sub10_1.aBoolean192 && local11.aClass4_Sub1_Sub10_1.method1432()) {
				@Pc(46) int local46 = local11.anInt2500 >> 7;
				@Pc(51) int local51 = local11.anInt2462 >> 7;
				if (local46 >= 0 && local46 < 104 && local51 >= 0 && local51 < 104) {
					if (local11.anInt2473 == 1 && (local11.anInt2500 & 0x7F) == 64 && (local11.anInt2462 & 0x7F) == 64) {
						if (Static31.anIntArrayArray5[local46][local51] == Static134.anInt3157) {
							continue;
						}
						Static31.anIntArrayArray5[local46][local51] = Static134.anInt3157;
					}
					if (!local11.aClass4_Sub1_Sub10_1.aBoolean189) {
						local19 += Integer.MIN_VALUE;
					}
					Static134.aClass77_1.method1950(Static37.anInt895, local11.anInt2500, local11.anInt2462, Static69.method1173(Static37.anInt895, local11.anInt2473 * 64 + local11.anInt2500 - 64, (local11.anInt2473 - 1) * 64 + local11.anInt2462), (local11.anInt2473 - 1) * 64 + 60, local11, local11.anInt2499, local19, local11.aBoolean221);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!ec;Lclient!ea;ZLclient!ec;)[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] method987(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class22 arg2) {
		@Pc(8) int local8 = arg1.method592(arg0);
		@Pc(14) int local14 = arg1.method606(arg2, local8);
		return Static78.method1297(local14, arg1, local8);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static111.anInt2765; local15++) {
			if (Static121.anIntArray317[local15] + Static24.anIntArray62[local15] > arg0 && arg2 + arg0 > Static121.anIntArray317[local15] && Static103.anIntArray294[local15] + Static16.anIntArray42[local15] > arg1 && Static103.anIntArray294[local15] < arg1 + arg3) {
				Static122.aBooleanArray7[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)I")
	public static int method991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) long local12 = (long) ((arg1 << 16) + arg0);
		return Static126.aClass4_Sub1_Sub11_1 != null && local12 == Static126.aClass4_Sub1_Sub11_1.aLong99 ? Static88.aClass4_Sub11_2.anInt1099 * 99 / (Static88.aClass4_Sub11_2.aByteArray9.length - Static126.aClass4_Sub1_Sub11_1.aByte7) + 1 : 0;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method993() {
		aClass33_19 = null;
		aClass22_360 = null;
		aClass22_358 = null;
		aClass22_362 = null;
		aClass22_365 = null;
		aClass4_Sub1_Sub2_Sub3Array4 = null;
		aClass22_356 = null;
		aByteArray13 = null;
		aClass22_361 = null;
		aClass22_364 = null;
		aClass22_357 = null;
		aClass22_363 = null;
		anIntArray144 = null;
		anIntArray146 = null;
	}
}
