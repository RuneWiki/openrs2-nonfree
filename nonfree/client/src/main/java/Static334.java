import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[Lclient!rl;")
	public static final Class291[] aClass291Array20 = new Class291[4];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!wga;)I")
	public static int method8571(@OriginalArg(1) Class371 arg0) {
		if (arg0 == Static419.aClass371_4) {
			return 5890;
		} else if (arg0 == Static133.aClass371_2) {
			return 34167;
		} else if (Static25.aClass371_1 == arg0) {
			return 34168;
		} else if (arg0 == Static139.aClass371_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
