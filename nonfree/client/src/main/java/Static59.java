import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!c", name = "W", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	public static int anInt1420 = -1;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_33 = new Class44(25, -2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mea;I)Ljava/lang/String;")
	public static String method1225(@OriginalArg(0) Class230 arg0) {
		if (Static78.method1481(arg0).method5402() == 0) {
			return null;
		} else if (arg0.aString74 == null || arg0.aString74.trim().length() == 0) {
			return Static28.aBoolean59 ? "Hidden-use" : null;
		} else {
			return arg0.aString74;
		}
	}
}
