import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	public static final int[] anIntArray9 = new int[2048];

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt79 = 0;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_1 = new Class244(0, 7);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIB)V")
	public static void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static221.anInt3917 <= arg2 - arg1 && arg1 + arg2 <= Static365.anInt6140 && arg0 - arg1 >= Static26.anInt345 && arg0 + arg1 <= Static272.anInt4750) {
			Static141.method2248(arg3, arg1, arg0, arg2);
		} else {
			Static146.method2295(arg1, arg2, arg0, arg3);
		}
	}
}
