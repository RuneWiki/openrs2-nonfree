import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_14 = new Class204(11, 0, 1, 2);

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
	public static boolean aBoolean375 = true;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "[I")
	public static final int[] anIntArray446 = new int[5];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)I")
	public static int method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static2.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static2.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	public static void method4287() {
		Static314.aClass96_33.method2338();
	}
}
