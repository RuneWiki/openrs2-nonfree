import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "Lclient!cv;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "Lclient!vs;")
	public static final Class354 aClass354_2 = new Class354();

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
	public static int anInt912 = 0;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	public static int anInt914 = -1;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
	public static boolean method870() {
		if (Static341.aBoolean467) {
			try {
				if ((Boolean) Static597.method3394("showingVideoAd", Static195.anApplet4)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lclient!eda;")
	public static Class86_Sub1 method871(@OriginalArg(1) int arg0) {
		return Static582.aBoolean787 && Static162.anInt2511 <= arg0 && arg0 <= Static434.anInt6972 ? Static376.aClass86_Sub1Array1[arg0 - Static162.anInt2511] : null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZBII)V")
	public static void method873(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static114.aLong46 = 0L;
		@Pc(8) int local8 = Static480.method6206();
		if (arg3 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static417.aClass162_17.method6865()) {
			arg1 = true;
		}
		Static80.method1228(arg0, arg3, local8, arg2, arg1);
	}
}
