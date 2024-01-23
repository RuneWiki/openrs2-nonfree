import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!hi;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!hi;")
	public static Class66 aClass66_5 = null;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
	public static int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "J")
	public static long aLong10 = 0L;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Lclient!cf;")
	public static Class23 method113() {
		@Pc(27) Class23 local27;
		if (Static156.aBoolean211) {
			local27 = new Class23_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], Static69.aByteArrayArray15[0], Static83.anIntArray144);
		} else {
			local27 = new Class23_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], Static69.aByteArrayArray15[0], Static83.anIntArray144);
		}
		Static117.method2101();
		return local27;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z")
	public static boolean method114(@OriginalArg(0) int arg0) {
		Static301.aBoolean361 = true;
		Static57.anInt1083 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
