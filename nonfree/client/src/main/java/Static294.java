import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
	public static int anInt5665;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
	public static int anInt5667;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "F")
	public static float aFloat58 = 0.0F;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	public static int anInt5663 = 0;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	public static int anInt5666 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method5140(@OriginalArg(1) Class63 arg0) {
		if (Static198.aClass42_34.method1548() == 0) {
			return;
		}
		@Pc(56) Class1_Sub36 local56;
		if (Static241.anInt4925 == 0) {
			for (local56 = (Class1_Sub36) Static198.aClass42_34.method1543(); local56 != null; local56 = (Class1_Sub36) Static198.aClass42_34.method1551()) {
				Static243.aClass220_2.method5971(arg0, local56.anInt5637, local56.anInt5636, false, Static364.aClass33_4, local56.aBoolean431 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null, local56.anInt5638, arg0, false, local56.anInt5645, local56.anInt5639);
				local56.method6045();
			}
			Static113.method2415();
			return;
		}
		if (Static243.aClass63_6 == null) {
			@Pc(22) Canvas local22 = new Canvas();
			local22.setSize(36, 32);
			Static243.aClass63_6 = Static93.method4640(0, 0, Static314.anInterface3_7, Static227.aClass75_5, local22);
			Static194.aClass33_2 = Static243.aClass63_6.method4611(Static323.method4438(Static101.aClass30_30, Static144.anInt3081), Static382.method5434(Static280.aClass30_83, Static144.anInt3081));
		}
		for (local56 = (Class1_Sub36) Static198.aClass42_34.method1543(); local56 != null; local56 = (Class1_Sub36) Static198.aClass42_34.method1551()) {
			Static243.aClass220_2.method5971(arg0, local56.anInt5637, local56.anInt5636, false, Static194.aClass33_2, local56.aBoolean431 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null, local56.anInt5638, Static243.aClass63_6, false, local56.anInt5645, local56.anInt5639);
			local56.method6045();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static void method5141() {
		if (Static165.aClass76_2 != null) {
			Static165.aClass76_2.method2377();
			Static165.aClass76_2 = null;
		}
		Static96.method2069();
		Static31.method824();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static11.aClass196Array2[local21].method5327();
		}
		Static138.method2789(false);
		System.gc();
		Static238.method4404();
		Static298.aBoolean482 = false;
		Static185.anInt1932 = -1;
		Static344.method4469(true);
		Static51.aBoolean88 = false;
		Static50.anInt1271 = 0;
		Static299.anInt4036 = 0;
		Static171.anInt3574 = 0;
		Static145.anInt3091 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static60.aClass101Array1.length; local60++) {
			Static60.aClass101Array1[local60] = null;
		}
		Static235.method4350();
		for (@Pc(79) int local79 = 0; local79 < 2048; local79++) {
			Static275.aClass11_Sub2_Sub6_Sub1Array1[local79] = null;
		}
		Static277.anInt5394 = 0;
		for (@Pc(95) int local95 = 0; local95 < 32768; local95++) {
			Static231.aClass11_Sub2_Sub6_Sub2Array1[local95] = null;
		}
		Static46.aClass38_4.method1466();
		Static109.method2323();
		Static235.anInt4759 = 0;
		Static17.method2105();
		Static311.method5136();
		Static276.method4922();
		Static10.method318(true);
		try {
			Static381.method4930(Static227.aClass75_5.anApplet1, "loggedout");
		} catch (@Pc(129) Throwable local129) {
		}
		Static285.aClass1_Sub12_2 = null;
		Static153.aLong113 = 0L;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
	public static int method5142(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local31 | local31 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!kg;)V")
	public static void method5143(@OriginalArg(1) Class112 arg0) {
		if (!Static77.aBoolean119) {
			return;
		}
		Static280.method5009(Static160.aClass18_108);
		Static339.aClass1_Sub7_Sub2_4.method2115(arg0.anInt3376);
		Static339.aClass1_Sub7_Sub2_4.method2138(arg0.anInt3451);
		Static339.aClass1_Sub7_Sub2_4.method2150(Static166.anInt3467);
		Static339.aClass1_Sub7_Sub2_4.method2101(arg0.anInt3398);
		Static339.aClass1_Sub7_Sub2_4.method2144(Static9.anInt239);
		Static339.aClass1_Sub7_Sub2_4.method2144(Static325.anInt5187);
	}
}
