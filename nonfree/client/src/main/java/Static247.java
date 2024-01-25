import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "[S")
	public static short[] aShortArray50;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_125 = new Class150(70, -2);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!oh;B)Ljava/lang/String;")
	public static String method4238(@OriginalArg(0) Class220 arg0) {
		if (Static68.method1303(arg0).method1953() == 0) {
			return null;
		} else if (arg0.aString62 == null || arg0.aString62.trim().length() == 0) {
			return Static525.aBoolean645 ? "Hidden-use" : null;
		} else {
			return arg0.aString62;
		}
	}
}
