import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray4;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_14 = new Class310(8, 1);

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_13 = new Class276("", 14);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)Z")
	public static boolean method7442(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public static void method7443() {
		if (Static246.aClass137_25 != null) {
			Static246.aClass137_25.method7935();
			Static531.aClass38_11 = null;
			Static246.aClass137_25 = null;
		}
	}
}
