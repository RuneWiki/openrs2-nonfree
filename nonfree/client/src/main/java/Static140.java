import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
	public static int anInt2835;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
	public static final int[] anIntArray135 = new int[14];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IB)I")
	public static int method2607(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)[Lclient!hr;")
	public static Class146[] method2608() {
		return new Class146[] { Static305.aClass146_5, Static428.aClass146_4, Static506.aClass146_8, Static47.aClass146_1, Static447.aClass146_6, Static461.aClass146_7, Static635.aClass146_11, Static506.aClass146_9, Static612.aClass146_10, Static165.aClass146_2 };
	}
}
