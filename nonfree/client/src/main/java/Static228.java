import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "[Lclient!di;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[[[Lclient!sg;")
	public static Class8_Sub27[][][] aClass8_Sub27ArrayArrayArray3;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public static int anInt4644;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "F")
	public static float aFloat48 = 0.0F;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public static int anInt4639 = 2;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt4643 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method3519() {
		@Pc(13) int[] local13 = new int[Static200.anInt4048];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static200.anInt4048; local17++) {
			@Pc(24) Class10 local24 = Static140.method2222(local17);
			if (local24.anInt143 >= 0 || local24.anInt101 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static200.anIntArray306 = new int[local15];
		for (local17 = 0; local17 < local15; local17++) {
			Static200.anIntArray306[local17] = local13[local17];
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public static void method3520() {
		for (@Pc(14) int local14 = -1; local14 < Static61.anInt1336; local14++) {
			@Pc(28) int local28;
			if (local14 == -1) {
				local28 = 2047;
			} else {
				local28 = Static85.anIntArray123[local14];
			}
			@Pc(36) Class36_Sub3_Sub1 local36 = Static230.aClass36_Sub3_Sub1Array1[local28];
			if (local36 != null) {
				Static136.method2198(local36.method3110(), local36);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([IBIJ)Ljava/lang/String;")
	public static String method3521(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Static234.anInterface1_1 != null) {
			@Pc(14) String local14 = Static234.anInterface1_1.method2410(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}
}
