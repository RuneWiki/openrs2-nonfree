import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lq", name = "J", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array18;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_79 = new Class186(29, 15);

	@OriginalMember(owner = "client!lq", name = "F", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "[I")
	public static final int[] anIntArray402 = new int[1];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[F)[F")
	public static float[] method4837(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static555.method5092(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
