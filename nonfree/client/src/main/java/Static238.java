import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_79 = new Class156(65, 3);

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[128][128];

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "B")
	public static byte aByte46 = -6;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!vf;III)Lclient!ub;")
	public static Class29_Sub3_Sub1 method3760(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean736 || Static197.method3300(arg3) && Static197.method3300(arg2)) {
			return new Class29_Sub3_Sub1(arg0, 3553, arg1, arg3, arg2);
		} else if (arg0.aBoolean731) {
			return new Class29_Sub3_Sub1(arg0, 34037, arg1, arg3, arg2);
		} else {
			return new Class29_Sub3_Sub1(arg0, arg1, arg3, arg2, Static146.method2737(arg3), Static146.method2737(arg2));
		}
	}
}
