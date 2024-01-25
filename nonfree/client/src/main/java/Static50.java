import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!cb", name = "Rc", descriptor = "I")
	public static int anInt9142;

	@OriginalMember(owner = "client!cb", name = "dd", descriptor = "[Lclient!iq;")
	public static Class138[] aClass138Array4;

	@OriginalMember(owner = "client!cb", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray777 = new int[250];

	@OriginalMember(owner = "client!cb", name = "ec", descriptor = "[I")
	public static final int[] anIntArray778 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method7746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static402.method7872(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static518.method7376(arg1, arg0) | Static496.method7130(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static422.method6288(arg1, arg0) | Static470.method5654(arg0, arg1));
		} else {
			return false;
		}
	}
}
