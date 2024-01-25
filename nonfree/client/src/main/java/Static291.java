import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[Lclient!ln;")
	public static Class197[] aClass197Array2;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
	public static int anInt5446 = 0;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "[I")
	public static final int[] anIntArray405 = new int[1024];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!pfa;IIIIIZ)V")
	public static void method4686(@OriginalArg(0) Class251 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static259.aBoolean354 = false;
		Static377.aClass251_90 = arg0;
		Static171.anInt3648 = 1;
		Static300.anInt5541 = arg2;
		Static394.anInt6906 = 0;
		Static430.anInt7500 = arg1;
		Static213.anInt8692 = Static587.aClass6_Sub18_Sub2_3.method3319() / arg3;
		if (Static213.anInt8692 < 1) {
			Static213.anInt8692 = 1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIB)V")
	public static void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static583.anInt9478 <= arg3 && arg3 <= Static415.anInt9494) {
			@Pc(19) int local19 = Static201.method3634(arg2, Static461.anInt7899, Static13.anInt7634);
			@Pc(25) int local25 = Static201.method3634(arg0, Static461.anInt7899, Static13.anInt7634);
			Static589.method7802(arg3, arg1, local25, local19);
		}
	}
}
