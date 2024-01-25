import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public static int anInt2375;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_57 = new Class40(77, 2);

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
	public static void method2003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static460.anInt7814 == 1) {
			Static206.method3068(Static336.aClass6_Sub48_3, arg0, arg1);
		} else if (Static460.anInt7814 == 2) {
			Static178.method5955(arg1, arg0);
		}
		Static336.aClass6_Sub48_3 = null;
		Static460.anInt7814 = 0;
	}
}
