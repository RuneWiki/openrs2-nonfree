import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[Lclient!d;")
	public static Class59[] aClass59Array3;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
	public static int anInt2978 = 0;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public static int anInt2980 = 0;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIIBI)V")
	public static void method2600(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static560.anInt9242 == 0) {
			Static441.method6276(false);
		} else {
			Static378.anInt6664 = Static560.anInt9242;
			Static293.method4707(0);
		}
		Static240.aBoolean341 = arg0;
		Static456.anInt7860 = arg2;
		Static580.anInt9453 = arg3;
		Static217.method3362(arg1);
	}
}
