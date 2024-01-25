import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!iu;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "[I")
	public static final int[] anIntArray632 = new int[8];

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
	public static int anInt8126 = -1;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)Z")
	public static boolean method6714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
