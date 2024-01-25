import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "I")
	public static int anInt8000;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[Lclient!nfa;")
	public static Class15_Sub3[] aClass15_Sub3Array4;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt8001 = 0;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "[I")
	public static final int[] anIntArray401 = new int[1000];

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public static int anInt8006 = 16777215;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([FII)[F")
	public static float[] method7154(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static679.method4133(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
