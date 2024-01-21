import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "Lclient!jd;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "Lclient!oc;")
	public static Class56 aClass56_11;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_190 = Static78.method1313("OFF");

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_188 = aClass25_190;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_189 = Static78.method1313("mapscene");

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
	public static int anInt333 = -1;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	public static void method283() {
		Class1_Sub2_Sub3_Sub1.anIntArray53 = null;
		aClass25_189 = null;
		aClass25_188 = null;
		aClass25_190 = null;
		aClass41_1 = null;
		aClass56_11 = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
	public static void method284() {
		if (Static11.aClass29_1 != null) {
			@Pc(3) Class29 local3 = Static11.aClass29_1;
			synchronized (Static11.aClass29_1) {
				Static11.aClass29_1 = null;
			}
		}
	}
}
