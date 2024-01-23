import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Lclient!dg;")
	public static Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	public static int anInt687 = 0;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	public static int anInt690 = 0;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public static void method655() {
		if (Static72.aClass13_Sub5_Sub1_1 != null && Static72.aClass13_Sub5_Sub1_1.anInt5334 + 64 - Static72.aClass13_Sub5_Sub1_1.method4219() * 64 >> 7 == Static11.anInt279 && Static72.aClass13_Sub5_Sub1_1.anInt5294 + 64 - Static72.aClass13_Sub5_Sub1_1.method4219() * 64 >> 7 == Static274.anInt5438) {
			Static11.anInt279 = 0;
		}
		@Pc(36) int local36;
		for (local36 = 0; local36 < 104; local36++) {
			for (@Pc(44) int local44 = 0; local44 < 104; local44++) {
				Static274.anIntArrayArray37[local36][local44] = 0;
			}
		}
		for (local36 = 0; local36 < Static85.anInt1730; local36++) {
			@Pc(76) Class13_Sub5_Sub1 local76 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local36]];
			if (local76 != null) {
				local76.aBoolean351 = false;
			}
		}
		for (local36 = 0; local36 < Static99.anInt1950; local36++) {
			@Pc(99) Class13_Sub5_Sub2 local99 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local36]];
			if (local99 != null) {
				local99.aBoolean351 = false;
			}
		}
	}
}
