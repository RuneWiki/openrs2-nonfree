import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_4 = new Class102();

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
	public static final int[] anIntArray19 = new int[3];

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
	public static int anInt247 = 0;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!pj;I)I")
	public static int method243(@OriginalArg(0) Class278 arg0) {
		if (arg0 == Static453.aClass278_10) {
			return 5120;
		} else if (Static453.aClass278_11 == arg0) {
			return 5122;
		} else if (Static453.aClass278_12 == arg0) {
			return 5124;
		} else if (Static453.aClass278_13 == arg0) {
			return 5121;
		} else if (arg0 == Static453.aClass278_14) {
			return 5123;
		} else if (arg0 == Static453.aClass278_15) {
			return 5125;
		} else if (arg0 == Static453.aClass278_16) {
			return 5131;
		} else if (arg0 == Static453.aClass278_17) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
