import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt6841 = -1;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt6843 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
	public static void method5848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static161.anInt7734 && arg4 <= Static38.anInt823 && Static380.anInt7421 <= arg2 && arg3 <= Static237.anInt5159) {
			if (arg1 == 1) {
				Static453.method7112(arg2, arg0, arg4, arg5, arg3);
			} else {
				Static324.method5601(arg1, arg2, arg5, arg4, arg3, arg0);
			}
		} else if (arg1 == 1) {
			Static166.method3583(arg4, arg0, arg3, arg2, arg5);
		} else {
			Static267.method4912(arg5, arg3, arg1, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method5849(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2) {
		Static273.aClass20_8 = arg1;
		Static571.aClass41ArrayArray1 = new Class41[arg0][arg2];
		if (Static312.anIntArray389 != null) {
			Static534.aClass78_4 = Static518.method7860(Static312.anIntArray389[4], Static312.anIntArray389[3], Static312.anIntArray389[0], Static312.anIntArray389[5], Static312.anIntArray389[1], Static312.anIntArray389[2]);
		}
		Static588.aClass41_2 = new Class41();
		Static626.method1570();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public static void method5852() {
		@Pc(5) Class169 local5 = Static20.aClass169_4;
		synchronized (Static20.aClass169_4) {
			Static20.aClass169_4.method4997(5);
		}
		local5 = Static378.aClass169_18;
		synchronized (Static378.aClass169_18) {
			Static378.aClass169_18.method4997(5);
		}
	}
}
