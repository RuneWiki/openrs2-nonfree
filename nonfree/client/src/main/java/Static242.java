import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
	public static int anInt4382;

	@OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
	public static int anInt4383;

	@OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
	public static int anInt4373 = -50;

	@OriginalMember(owner = "client!jga", name = "A", descriptor = "[I")
	public static final int[] anIntArray221 = new int[4096];

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_3 = new Class116(0, 2, 2, 1);

	@OriginalMember(owner = "client!jga", name = "I", descriptor = "[I")
	public static final int[] anIntArray222 = new int[1];

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)I")
	public static int method3879(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
