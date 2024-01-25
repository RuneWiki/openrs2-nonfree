import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
	public static int anInt2402;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt2406;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)Z")
	public static boolean method2084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)V")
	public static void method2085(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static413.aClass167_11 = Static331.method6026(Static32.aClass51_1, Static39.aClass79_Sub1_1.anInt2145 * 2, Static151.aCanvas2, Static203.anInterface7_5, arg1);
		} else {
			if (arg0) {
				Static413.aClass167_11 = Static331.method6026(Static32.aClass51_1, 0, Static151.aCanvas2, Static203.anInterface7_5, 0);
				Static413.aClass167_11.l(0);
				@Pc(28) Class124 local28 = Static398.method5469(Static351.aClass250_88, Static110.anInt1951);
				@Pc(37) Class18 local37 = Static413.aClass167_11.method5995(local28, Static467.method3627(Static8.aClass250_2, Static110.anInt1951));
				Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192), true, local37);
				Static413.aClass167_11.method5994();
				Static277.method4114();
				Static413.aClass167_11.method5958();
			}
			try {
				Static413.aClass167_11 = Static331.method6026(Static32.aClass51_1, Static39.aClass79_Sub1_1.anInt2145 * 2, Static151.aCanvas2, Static203.anInterface7_5, arg1);
				if (Static413.aClass167_11.method5963()) {
					@Pc(68) boolean local68 = true;
					try {
						local68 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(78) Throwable local78) {
					}
					@Pc(84) Class3_Sub26 local84;
					if (local68) {
						local84 = Static413.aClass167_11.method6004(146800640);
					} else {
						local84 = Static413.aClass167_11.method6004(104857600);
					}
					Static413.aClass167_11.method5965(local84);
				}
			} catch (@Pc(95) Throwable local95) {
				Static413.aClass167_11 = Static331.method6026(Static32.aClass51_1, 0, Static151.aCanvas2, Static203.anInterface7_5, 0);
				arg1 = 0;
			}
		}
		Static402.anInt6656 = arg1;
		Static298.method4262();
		if (!Static413.aClass167_11.method5949()) {
			Static326.anInt5454 = 1;
		}
		Static413.aClass167_11.method6022(Static326.anInt5454);
		Static413.aClass167_11.method6000(0);
		Static413.aClass167_11.K(8);
		Static359.aClass11_5 = Static413.aClass167_11.method5975();
		Static103.aClass11_3 = Static413.aClass167_11.method5975();
		Static11.method195();
		Static413.aClass167_11.method5955(!Static39.aClass79_Sub1_1.aBoolean155);
		if (Static413.aClass167_11.method5992()) {
			Static340.method4761(Static39.aClass79_Sub1_1.aBoolean148);
		}
		Static288.method4162(Static373.anInt6324 >> 3, Static413.aClass167_11, Static291.anInt5062 >> 3);
		Static106.method4449();
		Static171.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public static void method2086(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(6, arg0);
		local13.method1006();
	}
}
