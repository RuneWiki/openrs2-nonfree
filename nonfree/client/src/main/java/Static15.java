import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt238;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt239;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public static final int anInt237 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
	public static boolean method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static175.method2898(arg1, arg0) || Static453.method6692(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static505.method7347(arg0, arg1);
		}
	}
}
