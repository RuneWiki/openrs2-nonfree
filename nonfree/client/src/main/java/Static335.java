import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	public static int anInt5865 = -1;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public static int anInt5866 = 0;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
	public static final int[] anIntArray379 = new int[4096];

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_132 = new Class200(91, 10);

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	public static void method5089() {
		Static148.method2627();
		Static113.method2018();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!da;)V")
	public static void method5092(@OriginalArg(0) Class37 arg0) {
		Static126.aClass37_2 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([FII)[F")
	public static float[] method5093(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static650.method2273(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
