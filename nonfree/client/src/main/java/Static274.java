import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
	public static int anInt10336;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_201 = new Class136(87, -1);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_12 = new Class228(2, 2);

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_22 = new Class281(1);

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray60 = new boolean[5];

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)I")
	public static int method8783(@OriginalArg(0) int arg0) {
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
}
