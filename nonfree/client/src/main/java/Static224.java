import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
	public static int anInt4040;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	public static int anInt4042;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
	public static int anInt4039 = 0;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	public static int anInt4041 = 0;

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "[I")
	public static final int[] anIntArray408 = new int[1000];

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	public static int anInt4044 = -1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Z")
	public static boolean method3540(@OriginalArg(0) int arg0) {
		if (arg0 == 59 || arg0 == 6 || arg0 == 44 || arg0 == 12 || arg0 == 16) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 1011;
		}
	}
}
