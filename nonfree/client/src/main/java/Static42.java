import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt4340;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
	public static final int[] anIntArray368 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public static void method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static320.aClass10_28 == Static423.aClass10_43) {
			if (Static346.method4766(0, 0, false, -2, 1, arg1, 1, arg0)) {
				return;
			}
			Static346.method4766(0, 0, false, -3, 1, arg1, 1, arg0);
		} else if (Static346.method4766(0, 0, false, -3, 1, arg1, 1, arg0)) {
			return;
		} else {
			Static346.method4766(0, 0, false, -2, 1, arg1, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!si;Z)Lclient!kc;")
	public static Class104_Sub2 method3515(@OriginalArg(0) Class2_Sub23 arg0) {
		return new Class104_Sub2(arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5458(), arg0.method5485(), arg0.method5495());
	}
}
