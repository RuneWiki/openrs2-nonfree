import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public static void method2199() {
		Static46.method608();
		Static398.aClass3_6 = null;
		Static172.aClass135_4 = null;
		Static67.aClass206ArrayArray1 = null;
		Static341.aClass3_4 = null;
		Static374.aClass3_5 = null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ob;I)Ljava/lang/String;")
	public static String method2205(@OriginalArg(0) Class4_Sub30 arg0) {
		return arg0.aString39 == null || arg0.aString39.length() <= 0 ? arg0.aString40 : arg0.aString40 + Static210.aClass15_57.method180(Static429.anInt6999) + arg0.aString39;
	}
}
