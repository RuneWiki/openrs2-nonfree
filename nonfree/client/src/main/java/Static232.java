import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_114 = new Class363(76, -2);

	@OriginalMember(owner = "client!is", name = "n", descriptor = "I")
	public static int anInt4325 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI[F)[F")
	public static float[] method3614(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static598.method1133(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
