import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
	public static int anInt5169;

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!aaa", name = "E", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_44 = new Class257(12, -1);

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "[I")
	public static final int[] anIntArray288 = new int[32];

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method4220(@OriginalArg(1) Class237 arg0) {
		Static286.aClass237_77 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "([FII)[F")
	public static float[] method4221(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static649.method5535(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
