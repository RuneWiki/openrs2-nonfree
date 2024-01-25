import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "Lclient!gu;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "S")
	public static short aShort85 = 32767;

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "Lclient!tca;")
	public static final Class322 aClass322_8 = new Class322();

	@OriginalMember(owner = "client!ow", name = "y", descriptor = "Lclient!wu;")
	public static final Class366 aClass366_10 = new Class366(1);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([FII)[F")
	public static float[] method5464(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static598.method4263(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
