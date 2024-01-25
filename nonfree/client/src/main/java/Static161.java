import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!go", name = "D", descriptor = "Lclient!dj;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "[Lclient!mba;")
	public static Class181[] aClass181Array1;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "[Lclient!qc;")
	public static final Class235_Sub1[] aClass235_Sub1Array1 = new Class235_Sub1[32];

	@OriginalMember(owner = "client!go", name = "A", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_50 = new Class252(7, 8);

	@OriginalMember(owner = "client!go", name = "F", descriptor = "[I")
	public static final int[] anIntArray269 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!et;IIZ)V")
	public static void method2902(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static181.aBoolean310) {
			@Pc(183) Class53 local183 = Static395.anInt6942 == -1 ? null : Static440.aClass266_1.method6930(Static395.anInt6942);
			if (!Static63.method1580(arg0).method1742() || (Static59.anInt1479 & 0x20) == 0) {
				return;
			}
			if (local183 == null || arg0.method2281(Static395.anInt6942, local183.anInt1685) != local183.anInt1685) {
				Static18.method539(48, true, arg0.anInt2368, Static266.anInt5103, arg0.anInt2395, Static201.aString84 + " -> " + arg0.aString54, Static151.aString116, 0L, false, arg0.anInt2391);
			}
			return;
		}
		@Pc(21) String local21;
		for (@Pc(14) int local14 = 9; local14 >= 5; local14--) {
			local21 = Static48.method1332(arg0, local14);
			if (local21 != null) {
				Static18.method539(1009, true, arg0.anInt2368, Static99.method2034(local14, arg0), arg0.anInt2395, arg0.aString54, local21, (long) (local14 + 1), false, arg0.anInt2391);
			}
		}
		local21 = Static455.method6992(arg0);
		if (local21 != null) {
			Static18.method539(47, true, arg0.anInt2368, arg0.anInt2421, arg0.anInt2395, arg0.aString54, local21, 0L, false, arg0.anInt2391);
		}
		for (@Pc(84) int local84 = 4; local84 >= 0; local84--) {
			@Pc(91) String local91 = Static48.method1332(arg0, local84);
			if (local91 != null) {
				Static18.method539(20, true, arg0.anInt2368, Static99.method2034(local84, arg0), arg0.anInt2395, arg0.aString54, local91, (long) (local84 + 1), false, arg0.anInt2391);
			}
		}
		if (!Static63.method1580(arg0).method1749()) {
			return;
		}
		if (arg0.aString53 == null) {
			Static18.method539(30, true, arg0.anInt2368, -1, arg0.anInt2395, "", Static40.aClass45_23.method1474(Static544.anInt7853), 0L, false, arg0.anInt2391);
			return;
		}
		Static18.method539(30, true, arg0.anInt2368, -1, arg0.anInt2395, "", arg0.aString53, 0L, false, arg0.anInt2391);
		return;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIBLclient!r;I)Lclient!so;")
	public static Class271 method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class271(arg1, arg0, arg3, arg2.e(), arg2.wa(), arg2.va(), arg2.TA(), arg2.n(), arg2.Q(), arg2.U());
	}
}
