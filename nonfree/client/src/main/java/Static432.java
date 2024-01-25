import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
	public static int anInt7587;

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
	public static int anInt7595 = 0;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "[I")
	public static final int[] anIntArray576 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Z")
	public static boolean method6167(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
