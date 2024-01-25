import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
	public static final int[] anIntArray397 = new int[5];

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	public static int anInt6408 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public static void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
		Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_6.anInt1569);
		Static75.aClass1_Sub11_Sub1_1.method4445(arg2);
		Static75.aClass1_Sub11_Sub1_1.method4445(arg1);
		Static75.aClass1_Sub11_Sub1_1.method4448(arg3);
		Static75.aClass1_Sub11_Sub1_1.method4448(arg0);
		Static383.anInt6367 = 0;
		Static48.anInt801 = 1;
		Static428.anInt7092 = 0;
		Static52.anInt942 = -3;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIIII)V")
	public static void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static271.anInt4271 <= arg0 && Static13.anInt263 >= arg0) {
			@Pc(19) int local19 = Static63.method971(Static74.anInt1413, arg3, Static149.anInt7384);
			@Pc(25) int local25 = Static63.method971(Static74.anInt1413, arg1, Static149.anInt7384);
			Static339.method4305(local19, arg2, arg0, local25);
		}
	}
}
