import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
	public static int method5908(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!lc;)I")
	public static int method5912(@OriginalArg(1) Class171 arg0) {
		if (Static268.aClass171_7 == arg0) {
			return 5120;
		} else if (arg0 == Static268.aClass171_8) {
			return 5122;
		} else if (Static268.aClass171_9 == arg0) {
			return 5124;
		} else if (Static268.aClass171_10 == arg0) {
			return 5121;
		} else if (arg0 == Static268.aClass171_11) {
			return 5123;
		} else if (Static268.aClass171_12 == arg0) {
			return 5125;
		} else if (Static268.aClass171_13 == arg0) {
			return 5131;
		} else if (arg0 == Static268.aClass171_14) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
