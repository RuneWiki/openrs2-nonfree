import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cha", name = "t", descriptor = "[I")
	public static int[] anIntArray62;

	@OriginalMember(owner = "client!cha", name = "v", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILclient!id;)Z")
	public static boolean method1007(@OriginalArg(1) Class160 arg0) {
		return arg0 == null ? false : Static421.method6265(arg0.anInt4556 - arg0.anInt4549, -arg0.anInt4547 + arg0.anInt4550, arg0.anInt4541, arg0.anInt4547, arg0.anInt4549, arg0.anInt4546 - arg0.anInt4541);
	}
}
