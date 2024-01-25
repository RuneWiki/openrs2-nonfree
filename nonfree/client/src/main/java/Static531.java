import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static531 {

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "Lclient!jaa;")
	public static final Class173 aClass173_6 = new Class173();

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	public static void method7463() {
		Static651.method8724();
		Static493.aBoolean702 = false;
		Static356.method5358(Static477.anInt8042, Static54.anInt805, Static542.anInt6468, Static633.anInt10304);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILclient!uaa;)Ljava/lang/String;")
	public static String method7465(@OriginalArg(1) Class345 arg0) {
		if (Static84.method1822(arg0).method457() == 0) {
			return null;
		} else if (arg0.aString92 == null || arg0.aString92.trim().length() == 0) {
			return Static202.aBoolean307 ? "Hidden-use" : null;
		} else {
			return arg0.aString92;
		}
	}
}
