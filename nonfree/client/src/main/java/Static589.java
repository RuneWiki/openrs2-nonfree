import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
	public static final int[] anIntArray598 = new int[8];

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_203 = new Class342(32);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CB)I")
	public static int method8110(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class50.anIntArray466.length ? Class50.anIntArray466[arg0] : -1;
	}
}
