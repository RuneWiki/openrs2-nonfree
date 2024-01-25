import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static337 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_35 = new Class243();

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(Z)V")
	public static void method4503() {
		if (Static392.aString57.length() == 0) {
			return;
		}
		Static231.method3481("--> " + Static392.aString57);
		Static392.method5076(Static392.aString57, false);
		Static73.anInt1828 = 0;
		Static98.anInt2238 = 0;
		Static392.aString57 = "";
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!mq;)Ljava/lang/String;")
	public static String method4505(@OriginalArg(1) Class156 arg0) {
		if (Static53.method1118(arg0).method5980() == 0) {
			return null;
		} else if (arg0.aString40 == null || arg0.aString40.trim().length() == 0) {
			return Static63.aBoolean138 ? "Hidden-use" : null;
		} else {
			return arg0.aString40;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!cu;)Ljava/lang/String;")
	public static String method4506(@OriginalArg(1) Class3_Sub7 arg0) {
		return Static116.method4223(arg0);
	}
}
