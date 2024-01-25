import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "I")
	public static int anInt641;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!tv;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!go;")
	public static Class95 aClass95_1 = null;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_4 = new Class126(5);

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public static int anInt647 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V")
	public static void method513(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static108.anInt2206 = arg0;
	}
}
