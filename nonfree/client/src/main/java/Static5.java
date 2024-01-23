import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt224;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_94 = Static231.method3737("<)4col> x");

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_95 = Static231.method3737("Standort");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_96 = Static231.method3737("::");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
	public static void method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static14.anInt333; local12++) {
			if (Static170.anIntArray328[local12] + Static25.anIntArray45[local12] > arg1 && Static25.anIntArray45[local12] < arg1 + arg0 && Static204.anIntArray232[local12] + Static189.anIntArray347[local12] > arg2 && Static189.anIntArray347[local12] < arg3 + arg2) {
				Static39.aBooleanArray5[local12] = true;
			}
		}
	}
}
