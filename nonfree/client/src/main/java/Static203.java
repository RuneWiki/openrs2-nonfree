import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array9;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!ip;")
	public static Class3_Sub4_Sub13 aClass3_Sub4_Sub13_1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!qk;I)Ljava/lang/String;")
	public static String method3500(@OriginalArg(0) Class279 arg0) {
		if (Static76.method1833(arg0).method2322() == 0) {
			return null;
		} else if (arg0.aString94 == null || arg0.aString94.trim().length() == 0) {
			return Static351.aBoolean491 ? "Hidden-use" : null;
		} else {
			return arg0.aString94;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public static void method3501() {
		Static609.method8464();
	}
}
