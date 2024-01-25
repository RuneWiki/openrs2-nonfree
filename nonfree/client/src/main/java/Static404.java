import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
	public static int anInt6641;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_86 = new Class154(5, 4);

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "Lclient!vea;")
	public static final Class347 aClass347_9 = new Class347();

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "[I")
	public static final int[] anIntArray424 = new int[2];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ps;III)V")
	public static void method5507(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Class12_Sub2_Sub1_Sub3.lb != null || Static572.aBoolean774 || (arg0 == null || Static521.method6725(arg0) == null)) {
			return;
		}
		Class12_Sub2_Sub1_Sub3.lb = arg0;
		Static344.aClass273_8 = Static521.method6725(arg0);
		Static529.anInt8481 = arg1;
		Static385.anInt6376 = arg2;
		Static489.aBoolean658 = false;
		Static275.anInt4755 = 0;
	}
}
