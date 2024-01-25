import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!la;")
	public static Class123 aClass123_5;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!qn;")
	public static Class211 aClass211_50;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_50 = new Class146(67, 2);

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!qn;B)V")
	public static void method2496(@OriginalArg(0) Class211 arg0) {
		Static433.aClass211_94 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public static void method2497(@OriginalArg(1) int arg0) {
		if (Static50.anInt812 == 1) {
			Static347.anInt5752 = arg0;
		} else if (Static50.anInt812 == 2 || Static50.anInt812 == 3) {
			Static366.anInt6050 = arg0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V")
	public static void method2498(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class20_Sub2 local6 = (Class20_Sub2) Static436.aClass248_8.method5583(); local6 != null; local6 = (Class20_Sub2) Static436.aClass248_8.method5577()) {
			if (local6.anInt2442 <= Static265.anInt4371) {
				local6.method5771();
			} else {
				Static379.method4958(arg1 >> 1, (local6.anInt2453 << 7) + 64, local6.anInt2448, arg2 >> 1, (local6.anInt2446 << 7) + 64, local6.anInt2444 * 2);
				Static49.aClass123_1.method5788(Static73.anIntArray111[1] + arg3, Static73.anIntArray111[0] + arg0, 0, local6.aString13, local6.anInt2449 | 0xFF000000);
			}
		}
	}
}
