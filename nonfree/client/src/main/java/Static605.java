import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static605 {

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
	public static int anInt9557;

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
	public static int anInt9561 = 0;

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "[I")
	public static final int[] anIntArray621 = new int[8];

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
	public static final int anInt9563 = 1400;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)Z")
	public static boolean method8337(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
	public static void method8339(@OriginalArg(1) int arg0) {
		if (Static432.anInt7414 == 0) {
			Static449.aClass6_Sub17_Sub4_3.method6064(arg0);
		} else {
			Static417.anInt7212 = arg0;
		}
	}
}
