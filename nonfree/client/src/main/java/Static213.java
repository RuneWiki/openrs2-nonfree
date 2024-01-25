import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!sq;")
	public static final Class314 aClass314_19 = new Class314(1);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt7857 = 0;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!wa;")
	public static final Class354 aClass354_37 = new Class354(64);

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray500 = null;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6524(@OriginalArg(0) String arg0) {
		return Static57.method1007(arg0, 10);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public static void method6528(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static411.anInt7039 = arg0;
		Static151.aClass41_Sub9Array1 = new Class41_Sub9[Static555.anIntArray579[Static411.anInt7039] + 1];
		Static302.anInt5115 = 0;
		Static265.anInt4662 = 0;
	}
}
