import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!kl;")
	public static Class191 aClass191_12;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_5 = new Class295(5, -1);

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!em;")
	public static final Class83 aClass83_111 = new Class83(4, -1);

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	public static boolean method4604() {
		@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) Static379.aClass111_42.method2547();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt4322; local21++) {
			if (local15.aClass191Array1[local21] != null && local15.aClass191Array1[local21].anInt5014 == 0) {
				return false;
			}
			if (local15.aClass191Array2[local21] != null && local15.aClass191Array2[local21].anInt5014 == 0) {
				return false;
			}
		}
		return true;
	}
}
