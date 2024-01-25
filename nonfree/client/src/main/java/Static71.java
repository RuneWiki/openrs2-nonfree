import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!tu;")
	public static Class326 aClass326_1;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public static int anInt1939;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_47 = new Class272(4, -2);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public static int anInt1937 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZI)V")
	public static void method1656(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub48 local10 = Static144.method2729(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray674.length; local15++) {
				local10.anIntArray674[local15] = -1;
				local10.anIntArray675[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Z")
	public static boolean method1657() {
		return Static557.method7419("jaclib") ? Static557.method7419("hw3d") : false;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	public static void method1658() {
		Static125.method2539();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static221.aClass95Array2[local8].method2739();
		}
		Static79.method1727();
		Static65.method1513();
		System.gc();
		Static4.aClass43_1.ya();
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)V")
	public static void method1659() {
		for (@Pc(7) int local7 = 0; local7 < Static407.anInt6912; local7++) {
			@Pc(13) Class232 local13 = Static567.aClass232Array1[local7];
			if (local13.aByte83 == 3) {
				if (local13.aClass3_Sub6_Sub2_4 == null) {
					local13.anInt6298 = Integer.MIN_VALUE;
				} else {
					Static164.aClass3_Sub6_Sub1_1.method291(local13.aClass3_Sub6_Sub2_4);
				}
			}
		}
	}
}
