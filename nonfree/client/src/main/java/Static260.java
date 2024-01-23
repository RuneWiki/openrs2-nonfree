import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "[I")
	public static int[] anIntArray612;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!og;")
	public static Class127 aClass127_12;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!jj;")
	public static Class1_Sub18 aClass1_Sub18_7 = new Class1_Sub18(new byte[5000]);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = null;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Take";

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "[I")
	public static int[] anIntArray613 = new int[5];

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString177 = "glow2:";

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
	public static int anInt5248 = 0;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Loaded sprites";

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public static int method4021(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public static void method4025() {
		Static285.aClass31_44.method850();
		Static150.aClass31_24.method850();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)Z")
	public static boolean method4026(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static111.method1735();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static111.method1732();
		} else if (!Static111.method1739() || !Static111.method1737() || !Static111.method1731()) {
			arg0 = false;
		}
		Static41.aBoolean82 = arg0;
		Static147.method2287(Static13.aClass84_3);
		if (arg0 == local12) {
			return false;
		} else {
			((Class40_Sub1) Static208.anInterface4_1).method996();
			return true;
		}
	}
}
