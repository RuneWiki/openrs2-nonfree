import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "Lclient!iea;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(FFIIF)F")
	public static float method2353(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static95.aFloatArrayArray1[arg2];
		return arg3 * local12[2] + local12[1] * arg0 + local12[0] * arg1;
	}
}
