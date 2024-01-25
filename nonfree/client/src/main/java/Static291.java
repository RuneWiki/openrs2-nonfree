import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "[I")
	public static final int[] anIntArray327 = new int[5];

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "Lclient!oh;")
	public static Class273 aClass273_5 = null;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZ)V")
	public static void method4103(@OriginalArg(0) boolean arg0) {
		if (Static570.aString99.length() == 0) {
			return;
		}
		Static180.method5442("--> " + Static570.aString99);
		Static118.method1733(Static570.aString99, false, arg0);
		if (!arg0) {
			Static570.aString99 = "";
			Static135.anInt2247 = 0;
		}
		Static566.anInt8894 = 0;
	}
}
