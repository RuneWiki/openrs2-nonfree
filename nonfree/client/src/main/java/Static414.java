import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
	public static int anInt9481;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_140 = new Class349(91, -1);

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public static int anInt9485 = 0;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	public static void method8366() {
		Static489.aString91 = "";
		Static376.aString64 = "";
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(FFFIB)F")
	public static float method8373(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(15) float[] local15 = Static153.aFloatArrayArray13[arg3];
		return local15[0] * arg0 + arg2 * local15[1] + local15[2] * arg1;
	}
}
