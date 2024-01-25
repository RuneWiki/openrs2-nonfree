import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static590 {

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "Lclient!sa;")
	public static final Class321 aClass321_1 = new Class321(true);

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "[I")
	public static final int[] anIntArray533 = new int[6];

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIZII)V")
	public static void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg0) {
			Static161.method2977(arg0, arg3, arg1, Static120.anIntArrayArray18[arg2], -116);
		} else {
			Static161.method2977(arg1, arg3, arg0, Static120.anIntArrayArray18[arg2], -124);
		}
	}
}
