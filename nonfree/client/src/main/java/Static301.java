import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_73 = new Class218(53, 7);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!or;B)Ljava/lang/String;")
	public static String method4631(@OriginalArg(0) Class260 arg0) {
		if (Static79.method1526(arg0).method7067() == 0) {
			return null;
		} else if (arg0.aString72 == null || arg0.aString72.trim().length() == 0) {
			return Static561.aBoolean714 ? "Hidden-use" : null;
		} else {
			return arg0.aString72;
		}
	}
}
