import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt2346;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!bc;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!go;")
	public static final Class97 aClass97_4 = new Class97(4, 1, 1, 1);

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!cv;")
	public static final Class44 aClass44_1 = new Class44("RC", 1);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZZ)V")
	public static void method1854(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static149.anInt7382++;
			Static303.method3969();
		}
		if (arg1) {
			Static182.anInt2949++;
			Static401.method2973();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I")
	public static int method1855(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
