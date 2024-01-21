import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!kj;")
	public static Class58 aClass58_103;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "J")
	public static long aLong252;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1[] aClass5_Sub2_Sub10_Sub1Array103;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1560 = Static161.method2452("Unable to connect)3");

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1558 = aClass20_1560;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1559 = Static161.method2452("null");

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt4217 = 0;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1561 = aClass20_1560;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method3209() {
		@Pc(7) Class37 local7 = Static82.aClass37_1;
		synchronized (Static82.aClass37_1) {
			Static153.anInt3126++;
			Static208.anInt4081 = Static38.anInt823;
			@Pc(23) int local23;
			if (Static36.anInt784 >= 0) {
				while (Static36.anInt784 != Static67.anInt3977) {
					local23 = Static11.anIntArray18[Static67.anInt3977];
					Static67.anInt3977 = Static67.anInt3977 + 1 & 0x7F;
					if (local23 >= 0) {
						Static201.aBooleanArray22[local23] = true;
					} else {
						Static201.aBooleanArray22[~local23] = false;
					}
				}
			} else {
				for (local23 = 0; local23 < 112; local23++) {
					Static201.aBooleanArray22[local23] = false;
				}
				Static36.anInt784 = Static67.anInt3977;
			}
			Static38.anInt823 = Static129.anInt2700;
		}
	}
}
