import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "D")
	public static double aDouble27;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_43 = new Class74(32);

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "F")
	public static float aFloat136 = 1.0F;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIBI)V")
	public static void method6281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static398.anInt6878 && arg1 <= Static8.anInt136) {
			@Pc(30) int local30 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg2);
			@Pc(38) int local38 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg0);
			Static288.method4733(arg3, local30, local38, arg1);
		}
	}
}
