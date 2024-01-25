import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static233 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!ge;")
	public static Class5_Sub1_Sub6 aClass5_Sub1_Sub6_3;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!ij;")
	public static Class93 aClass93_88;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!cp;")
	public static Class39 aClass39_5;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public static int anInt4655;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_26 = new Class190(16);

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	public static void method4155() {
		Static322.aClass109_8.method2850();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!wk;)Z")
	public static boolean method4156(@OriginalArg(1) Class215 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean590) {
			return false;
		} else if (!arg0.method5994()) {
			return false;
		} else if (Static212.aClass190_23.method5466((long) arg0.anInt6765) == null) {
			return Static252.aClass190_28.method5466((long) arg0.anInt6774) == null;
		} else {
			return false;
		}
	}
}
