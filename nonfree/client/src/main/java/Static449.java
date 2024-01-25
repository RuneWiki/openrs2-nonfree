import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "Lclient!am;")
	public static final Class14 aClass14_51 = new Class14();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIB)V")
	public static void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= Static281.anInt4757 && Static457.anInt7264 >= arg1 && Static142.anInt2163 <= arg0 && Static182.anInt3402 >= arg2) {
			Static49.method656(arg2, arg3, arg4, arg0, arg1);
		} else {
			Static380.method4904(arg3, arg1, arg0, arg4, arg2);
		}
	}
}
