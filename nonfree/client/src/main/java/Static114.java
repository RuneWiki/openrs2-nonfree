import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static114 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Lclient!jn;")
	public static Class176 aClass176_130;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
	public static int anInt9773 = -1;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public static int anInt9774 = 0;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString94 = null;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Z")
	public static boolean method7979(@OriginalArg(1) int arg0) {
		if (arg0 == 48 || arg0 == 21 || arg0 == 30 || arg0 == 8 || arg0 == 18) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1006;
		}
	}
}
