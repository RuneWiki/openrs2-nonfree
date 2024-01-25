import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!di;")
	public static final Class54 aClass54_101 = new Class54(70, -1);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIFFF)F")
	public static float method5557(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static205.aFloatArrayArray4[arg0];
		return local12[2] * arg2 + local12[1] * arg1 + local12[0] * arg3;
	}
}
