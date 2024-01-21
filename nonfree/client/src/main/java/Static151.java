import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	public static int anInt3420;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!vb;")
	public static Class82 aClass82_63;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "Lclient!k;")
	public static Class47 aClass47_7;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	public static int anInt3418 = -1;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[104][104];

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
	public static int anInt3425 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!rh;)Z")
	public static boolean method2628(@OriginalArg(1) Class77 arg0) {
		if (Static74.aBoolean69) {
			if (Static165.method2894(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3226 == 0) {
				return false;
			}
		}
		return arg0.aBoolean134;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public static void method2631() {
		aClass47_7 = null;
		anIntArrayArray27 = null;
		aClass82_63 = null;
	}
}
