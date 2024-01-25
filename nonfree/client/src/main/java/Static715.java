import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static715 {

	@OriginalMember(owner = "client!wka", name = "h", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_190 = new Class397(31, -1);

	@OriginalMember(owner = "client!wka", name = "q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(CI)Z")
	public static boolean method9489(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(IIIII)V")
	public static void method9490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg2) {
			Static202.method3077(Static118.anIntArrayArray7[arg3], arg1, arg0, arg2);
		} else {
			Static202.method3077(Static118.anIntArrayArray7[arg3], arg2, arg0, arg1);
		}
	}
}
