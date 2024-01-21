import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public static int anInt2501;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!je;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!qd;")
	public static Class65 aClass65_9 = new Class65();

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1456 = Static107.method1838(" x ");

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1457 = Static107.method1838("titlebox");

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1458 = Static107.method1838("<col=40ff00>");

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public static int anInt2509 = 0;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1459 = Static107.method1838("<col=00ff00>");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1766() {
		aClass41_3 = null;
		aClass28_1456 = null;
		aClass65_9 = null;
		aClass28_1458 = null;
		aClass28_1459 = null;
		aClass28_1457 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1767() {
		Static151.aClass2_Sub2_Sub1_3.method1714();
		@Pc(13) int local13 = Static151.aClass2_Sub2_Sub1_3.method1713(8);
		@Pc(22) int local22;
		if (local13 < Static29.anInt884) {
			for (local22 = local13; local22 < Static29.anInt884; local22++) {
				Static115.anIntArray262[Static84.anInt2126++] = Static129.anIntArray274[local22];
			}
		}
		if (Static29.anInt884 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static29.anInt884 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(56) int local56 = Static129.anIntArray274[local22];
			@Pc(60) Class2_Sub4_Sub1_Sub1_Sub1 local60 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local56];
			@Pc(65) int local65 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			if (local65 == 0) {
				Static129.anIntArray274[Static29.anInt884++] = local56;
				local60.anInt1650 = Static156.anInt3491;
			} else {
				@Pc(85) int local85 = Static151.aClass2_Sub2_Sub1_3.method1713(2);
				if (local85 == 0) {
					Static129.anIntArray274[Static29.anInt884++] = local56;
					local60.anInt1650 = Static156.anInt3491;
					Static3.anIntArray228[Static83.anInt2114++] = local56;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static129.anIntArray274[Static29.anInt884++] = local56;
						local60.anInt1650 = Static156.anInt3491;
						local132 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local60.method1094(false, local132);
						local142 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
						if (local142 == 1) {
							Static3.anIntArray228[Static83.anInt2114++] = local56;
						}
					} else if (local85 == 2) {
						Static129.anIntArray274[Static29.anInt884++] = local56;
						local60.anInt1650 = Static156.anInt3491;
						local132 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local60.method1094(true, local132);
						local142 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local60.method1094(true, local142);
						@Pc(196) int local196 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
						if (local196 == 1) {
							Static3.anIntArray228[Static83.anInt2114++] = local56;
						}
					} else if (local85 == 3) {
						Static115.anIntArray262[Static84.anInt2126++] = local56;
					}
				}
			}
		}
	}
}
