import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!wh;")
	public static Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt2722;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString101 = " ";

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!tj;Lclient!ir;BLclient!ir;)V")
	public static void method2205(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class100 arg2) {
		Static82.aClass209_1 = Static76.method1152(Static205.anInt65, arg1);
		Static232.aClass120_5 = arg0.method4727(Static82.aClass209_1, Static366.method3882(arg2, Static205.anInt65));
		Static303.aClass209_9 = Static76.method1152(Static79.anInt5522, arg1);
		Static83.aClass120_1 = arg0.method4727(Static303.aClass209_9, Static366.method3882(arg2, Static79.anInt5522));
		Static191.aClass209_6 = Static76.method1152(Static344.anInt6697, arg1);
		Static243.aClass120_6 = arg0.method4727(Static191.aClass209_6, Static366.method3882(arg2, Static344.anInt6697));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
	public static int method2206(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static253.method4243(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method2208() {
		@Pc(5) byte local5 = 0;
		if (Static118.aBoolean141) {
			local5 = 55;
		}
		Static340.method5563(local5);
		Static224.method3902(local5);
		Static295.method5007(local5);
		Static232.method3993(local5);
		Static310.method5211(local5);
		Static122.method2155(local5);
		Static36.method666(local5);
		Static122.method2150(local5);
		Static76.method1156(local5);
		if (Static266.anInt5370 == 10) {
			Static353.method5714(28);
		} else if (Static266.anInt5370 == 30) {
			Static353.method5714(25);
		}
	}
}
