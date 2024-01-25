import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	public static int anInt4409;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
	public static final int[] anIntArray373 = new int[5];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!at;I)Z")
	public static boolean method3626(@OriginalArg(0) Class16 arg0) {
		if (Static149.anInt2626 == arg0.anInt252) {
			Static345.anInt5892 = 250;
			return true;
		} else {
			return false;
		}
	}
}
