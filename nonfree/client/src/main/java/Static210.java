import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
	public static final int[] anIntArray244 = new int[2048];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!at;BI)V")
	public static void method4125(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg1.method611(Static186.aClass20_4);
		if (local8 == null) {
			return;
		}
		Static186.aClass20_4.KA(arg2, arg0, arg1.anInt441 + arg2, arg0 - -arg1.anInt488);
		if (Static566.anInt10156 >= 3) {
			Static186.aClass20_4.A(-16777216, local8, arg2, arg0);
		} else {
			Static30.aClass46_2.method6215((float) arg1.anInt441 / 2.0F + (float) arg2, (float) arg0 + (float) arg1.anInt488 / 2.0F, ((int) -Static72.aFloat68 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method4127(@OriginalArg(0) Class24 arg0) {
		if (arg0.anInt480 == 5 && arg0.anInt501 != -1) {
			Static170.method8607(Static186.aClass20_4, arg0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ha;IBIIII)V")
	public static void method4136(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		Static214.aClass20_7 = arg0;
		Static251.aClass30_9 = Static214.aClass20_7.method7257();
		Static244.aClass30_8 = Static214.aClass20_7.method7257();
		Static475.aClass30_12 = Static214.aClass20_7.method7257();
		Static298.anInt6265 = 2;
		Static90.anInt2649 = 0;
		Static11.anInt6559 = arg2;
		Static605.anInt10972 = 0;
		Static267.anInt5684 = arg3;
		Static208.anInterface14_1 = null;
		Static66.anInt10075 = 1;
		Static26.anInt540 = 2;
		Static317.method5512(arg4, arg1);
	}
}
