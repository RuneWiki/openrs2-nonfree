import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "Lclient!km;")
	public static final Class166 aClass166_1 = new Class166();

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
	public static void method799(@OriginalArg(0) int arg0) {
		if (Static429.anInt7900 == 0) {
			Static345.aClass3_Sub9_Sub1_2.method1209(arg0);
		} else {
			Static282.anInt5792 = arg0;
		}
	}
}
