import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static632 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!uu;")
	public static Class343 aClass343_268;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public static int anInt10065;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	public static int anInt10072 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIII)I")
	public static int method8535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > arg2) {
			return arg1;
		} else if (arg2 > arg0) {
			return arg0;
		} else {
			return arg2;
		}
	}
}
