import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "Lclient!wu;")
	public static Class384 aClass384_20;

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "Lclient!pm;")
	public static Class273 aClass273_3;

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)I")
	public static int method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static402.aShortArrayArray19 == null ? 0 : Static402.aShortArrayArray19[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)Z")
	public static boolean method723(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 15 || arg0 == 57 || arg0 == 50 || arg0 == 12) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1011;
		}
	}
}
