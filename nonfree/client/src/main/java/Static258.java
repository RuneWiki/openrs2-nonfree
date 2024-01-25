import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "Lclient!im;")
	public static final Class140 aClass140_74 = new Class140(92, 6);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!sb;I)I")
	public static int method4328(@OriginalArg(0) Class264 arg0) {
		if (Static431.aClass264_12 == arg0) {
			return 5120;
		} else if (Static431.aClass264_13 == arg0) {
			return 5122;
		} else if (Static431.aClass264_14 == arg0) {
			return 5124;
		} else if (arg0 == Static431.aClass264_15) {
			return 5121;
		} else if (arg0 == Static431.aClass264_16) {
			return 5123;
		} else if (arg0 == Static431.aClass264_17) {
			return 5125;
		} else if (arg0 == Static431.aClass264_18) {
			return 5131;
		} else if (Static431.aClass264_19 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)[Lclient!rh;")
	public static Class256[] method4332() {
		return new Class256[] { Static33.aClass256_1, Static162.aClass256_3, Static492.aClass256_4 };
	}
}
