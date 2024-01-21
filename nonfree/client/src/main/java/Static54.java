import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 aClass3_Sub1_Sub4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public static int anInt1628 = -1;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt1629 = 2;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static volatile int anInt1633 = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1093() {
		@Pc(3) Class19 local3 = Static86.aClass19_1;
		synchronized (Static86.aClass19_1) {
			Static71.anInt2025 = Static71.anInt2026;
			@Pc(14) int local14;
			if (Static72.anInt2057 < 0) {
				for (local14 = 0; local14 < 112; local14++) {
					Static95.aBooleanArray24[local14] = false;
				}
				Static72.anInt2057 = Static81.anInt2237;
			} else {
				while (Static81.anInt2237 != Static72.anInt2057) {
					local14 = Static130.anIntArray408[Static81.anInt2237];
					Static81.anInt2237 = Static81.anInt2237 + 1 & 0x7F;
					if (local14 >= 0) {
						Static95.aBooleanArray24[local14] = true;
					} else {
						Static95.aBooleanArray24[~local14] = false;
					}
				}
			}
			Static71.anInt2026 = Static108.anInt2899;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method1095() {
		aClass3_Sub1_Sub4_Sub2_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lclient!ne;")
	public static Class3_Sub1_Sub13 method1096(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub1_Sub13 local14 = (Class3_Sub1_Sub13) Static46.aClass66_14.method1970((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static101.aClass16_126.method566(3, arg0);
		local14 = new Class3_Sub1_Sub13();
		if (local28 != null) {
			local14.method1419(new Class3_Sub11(local28));
		}
		Static46.aClass66_14.method1969((long) arg0, local14);
		return local14;
	}
}
