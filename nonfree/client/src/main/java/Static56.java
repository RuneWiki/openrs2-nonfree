import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!tj;")
	public static Class193 aClass193_15;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	public static int anInt1503 = 0;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
	public static final int[] anIntArray91 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
	public static int method1200(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
