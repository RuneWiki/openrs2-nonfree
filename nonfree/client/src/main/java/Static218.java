import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "Lclient!pu;")
	public static Class270 aClass270_46;

	@OriginalMember(owner = "client!ii", name = "vb", descriptor = "[Lclient!ht;")
	public static Class144[] aClass144Array1;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_26 = new Class222(32);

	@OriginalMember(owner = "client!ii", name = "rb", descriptor = "I")
	public static int anInt4197 = -2;

	@OriginalMember(owner = "client!ii", name = "Eb", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_7 = new Class101(14, 0, 4, 1);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method3381() {
		if (!Static459.method6335()) {
			return;
		}
		if (Static514.aStringArray35 == null) {
			Static121.method1904();
		}
		Static299.anInt5150 = 0;
		Static577.aBoolean745 = true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
	public static boolean method3385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
