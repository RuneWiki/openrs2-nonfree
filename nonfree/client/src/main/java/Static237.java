import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!mn;")
	public static Class171 aClass171_53;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!mn;")
	public static Class171 aClass171_54;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([FII)[F")
	public static float[] method3227(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static472.method5028(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
