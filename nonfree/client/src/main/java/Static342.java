import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_113 = new Class126(40, 4);

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt6166 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBII)V")
	public static void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static255.anInt4818 && arg1 <= Static658.anInt10079) {
			@Pc(20) int local20 = Static400.method5735(Static303.anInt9951, arg0, Static408.anInt6951);
			@Pc(26) int local26 = Static400.method5735(Static303.anInt9951, arg3, Static408.anInt6951);
			Static567.method7679(arg2, local20, arg1, local26);
		}
	}
}
