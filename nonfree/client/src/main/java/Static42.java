import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_26 = new Class362(77, -1);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_27 = new Class362(26, -2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([FII)[F")
	public static float[] method508(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static597.method3726(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
