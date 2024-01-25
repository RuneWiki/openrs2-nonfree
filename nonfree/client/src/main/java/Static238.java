import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!qs;")
	public static Class211 aClass211_60;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!qs;")
	public static Class211 aClass211_61;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_124 = new Class158("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	public static int anInt4690 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ec;IZ)V")
	public static void method3609(@OriginalArg(0) Class68 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) int local20 = arg0.anInt2130 == 0 ? arg0.anInt2107 : arg0.anInt2130;
		@Pc(32) int local32 = arg0.anInt2122 == 0 ? arg0.anInt2149 : arg0.anInt2122;
		Static54.method1008(Static293.aClass68ArrayArray4[arg0.anInt2135 >> 16], arg1, local20, arg0.anInt2135, local32);
		if (arg0.aClass68Array2 != null) {
			Static54.method1008(arg0.aClass68Array2, arg1, local20, arg0.anInt2135, local32);
		}
		@Pc(67) Class1_Sub39 local67 = (Class1_Sub39) Static177.aClass38_18.method765((long) arg0.anInt2135);
		if (local67 != null) {
			Static149.method2369(local20, arg1, local32, local67.anInt6172);
		}
	}
}
