import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt2671 = 0;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public static int anInt2672 = 0;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public static int anInt2674 = -1;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
	public static boolean method1844(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
