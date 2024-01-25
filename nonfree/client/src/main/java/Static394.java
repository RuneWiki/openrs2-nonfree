import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "Lclient!oa;")
	public static Class14 aClass14_11;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
	public static int anInt6906;

	@OriginalMember(owner = "client!pg", name = "Bb", descriptor = "I")
	public static int anInt6930;

	@OriginalMember(owner = "client!pg", name = "eb", descriptor = "S")
	public static short aShort88 = 256;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!rr;I)Ljava/lang/String;")
	public static String method5797(@OriginalArg(0) Class292 arg0) {
		if (Static67.method1354(arg0).method245() == 0) {
			return null;
		} else if (arg0.aString78 == null || arg0.aString78.trim().length() == 0) {
			return Static226.aBoolean321 ? "Hidden-use" : null;
		} else {
			return arg0.aString78;
		}
	}
}
