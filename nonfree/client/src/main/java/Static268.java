import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array7;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "[S")
	public static short[] aShortArray59 = new short[256];

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_77 = new Class274(115, 6);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(FIBFF)F")
	public static float method4323(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static316.aFloatArrayArray9[arg1];
		return arg2 * local15[0] + local15[1] * arg3 + arg0 * local15[2];
	}
}
