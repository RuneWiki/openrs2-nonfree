import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
	public static int anInt3030;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "[Lclient!mn;")
	public static Class195[] aClass195Array1;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
	public static int anInt3036;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "Lclient!dj;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "Z")
	public static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_44 = new Class6(42, 3);

	@OriginalMember(owner = "client!fba", name = "v", descriptor = "[I")
	public static final int[] anIntArray238 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)Z")
	public static boolean method2777() {
		try {
			return Static113.method2613();
		} catch (@Pc(12) IOException local12) {
			Static317.method5198();
			return true;
		} catch (@Pc(17) Exception local17) {
			@Pc(75) String local75 = "T2 - " + (Static304.aClass6_92 == null ? -1 : Static304.aClass6_92.method233()) + "," + (Static136.aClass6_48 == null ? -1 : Static136.aClass6_48.method233()) + "," + (Static388.aClass6_117 == null ? -1 : Static388.aClass6_117.method233()) + " - " + Static45.anInt1403 + "," + (Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] + Static324.anInt6132) + "," + (Static517.anInt8716 + Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0]) + " - ";
			for (@Pc(77) int local77 = 0; local77 < Static45.anInt1403 && local77 < 50; local77++) {
				local75 = local75 + Static255.aClass1_Sub13_Sub2_2.aByteArray45[local77] + ",";
			}
			Static41.method1359(local17, local75);
			Static140.method2961(false);
			return true;
		}
	}
}
