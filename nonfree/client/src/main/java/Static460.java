import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	public static int anInt7980;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "[I")
	public static final int[] anIntArray599 = new int[14];

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_229 = new Class88("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public static void method6599() {
		Static9.method278(10);
		Static263.method7118();
		System.gc();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(FIFFB)F")
	public static float method6601(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(15) float[] local15 = Static48.aFloatArrayArray1[arg1];
		return local15[2] * arg2 + arg3 * local15[1] + local15[0] * arg0;
	}
}
