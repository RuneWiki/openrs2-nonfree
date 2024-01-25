import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "[J")
	public static long[] aLongArray17;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	public static int anInt7323;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
	public static final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method6389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
