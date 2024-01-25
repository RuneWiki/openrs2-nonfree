import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static444 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
	public static final int anInt8952 = 0;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
	public static int[] anIntArray555 = new int[2];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)[Lclient!he;")
	public static Class135[] method7714() {
		return new Class135[] { Static42.aClass135_2, Static252.aClass135_5, Static310.aClass135_6, Static350.aClass135_12, Static407.aClass135_14, Static531.aClass135_15 };
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ew;Z)I")
	public static int method7717(@OriginalArg(0) Class99 arg0) {
		if (Static435.aClass99_20 == arg0) {
			return 9216;
		} else if (arg0 == Static218.aClass99_15) {
			return 34065;
		} else if (Static281.aClass99_22 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
