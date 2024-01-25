import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_45 = new Class306("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method3559() {
		for (@Pc(14) Class1_Sub1_Sub15 local14 = (Class1_Sub1_Sub15) Static522.aClass37_104.method977(); local14 != null; local14 = (Class1_Sub1_Sub15) Static522.aClass37_104.method971()) {
			@Pc(19) Class49_Sub2_Sub1 local19 = local14.aClass49_Sub2_Sub1_1;
			if (local19.anInt1461 < Static436.anInt6850) {
				local14.method7525();
				local19.method1375();
			} else if (Static436.anInt6850 >= local19.anInt1439) {
				if (local19.anInt1450 > 0) {
					@Pc(51) Class1_Sub17 local51 = (Class1_Sub17) Static380.aClass17_29.method738((long) (local19.anInt1450 - 1));
					if (local51 != null) {
						@Pc(56) Class49_Sub2_Sub2_Sub2 local56 = local51.aClass49_Sub2_Sub2_Sub2_2;
						if (local56.anInt7137 >= 0 && Static459.anInt7799 * 512 > local56.anInt7137 && local56.anInt7141 >= 0 && local56.anInt7141 < Static482.anInt7990 * 512) {
							local19.method1373(Static38.method884(local19.aByte98, local56.anInt7137, local56.anInt7141) - local19.anInt1465, local56.anInt7137, Static436.anInt6850, local56.anInt7141);
						}
					}
				}
				if (local19.anInt1450 < 0) {
					@Pc(106) int local106 = -local19.anInt1450 - 1;
					@Pc(115) Class49_Sub2_Sub2_Sub1 local115;
					if (local106 == Static198.anInt3873) {
						local115 = Static63.aClass49_Sub2_Sub2_Sub1_1;
					} else {
						local115 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local106];
					}
					if (local115 != null && local115.anInt7137 >= 0 && Static459.anInt7799 * 512 > local115.anInt7137 && local115.anInt7141 >= 0 && local115.anInt7141 < Static482.anInt7990 * 512) {
						local19.method1373(Static38.method884(local19.aByte98, local115.anInt7137, local115.anInt7141) - local19.anInt1465, local115.anInt7137, Static436.anInt6850, local115.anInt7141);
					}
				}
				local19.method1379(Static152.anInt2791);
				Static468.method6558(local19, true);
			}
		}
	}
}
