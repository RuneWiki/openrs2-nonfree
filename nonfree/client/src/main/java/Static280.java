import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!fc;")
	public static Class71 aClass71_67;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "Lclient!dr;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_133 = new Class77(83, -1);

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public static int anInt4946 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Z")
	public static boolean method4312() {
		@Pc(8) Class2_Sub7 local8 = (Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243;
		if (local8 == null || Static66.aClass210_43.aClass2_199 == local8) {
			return false;
		} else {
			if (local8.anInt541 >= 2000) {
				local8.anInt541 -= 2000;
			}
			return local8.anInt541 == 1004;
		}
	}
}
