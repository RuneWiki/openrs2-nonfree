import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_28 = new Class230(24, 2);

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
	public static int anInt2893 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIII)V")
	public static void method2513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > arg1) {
			Static426.method6794(arg2, Static333.anIntArrayArray56[arg3], arg1, arg0);
		} else {
			Static426.method6794(arg1, Static333.anIntArrayArray56[arg3], arg2, arg0);
		}
	}
}
