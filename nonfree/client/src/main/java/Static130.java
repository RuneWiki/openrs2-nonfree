import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eda", name = "v", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "Lclient!si;")
	public static final Class250 aClass250_1 = Static477.method6965();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V")
	public static void method1894() {
		if (Static307.anInt5461 < 0) {
			return;
		}
		@Pc(11) long local11 = Static515.method7499(77);
		Static307.anInt5461 = (int) ((long) Static307.anInt5461 + Static140.aLong64 - local11);
		if (Static307.anInt5461 <= 0) {
			Static656.aFloat207 = Static169.aClass120_2.aFloat30;
			Static141.anInt4797 = Static169.aClass120_2.anInt2502;
			Static677.aFloat208 = Static169.aClass120_2.aFloat31;
			Static246.aClass29_3 = Static169.aClass120_2.aClass29_1;
			Static307.anInt5461 = -1;
			Static432.anInt7421 = Static169.aClass120_2.anInt2508;
			Static484.aFloat142 = Static169.aClass120_2.aFloat29;
			Static420.anInt7261 = Static169.aClass120_2.anInt2506;
			Static521.aFloat163 = Static169.aClass120_2.aFloat27;
			Static18.aFloat5 = Static169.aClass120_2.aFloat28;
			Static5.aFloat183 = Static169.aClass120_2.aFloat26;
		} else {
			@Pc(67) int local67 = (Static307.anInt5461 << 8) / Static377.anInt6462;
			@Pc(72) int local72 = 255 - local67;
			@Pc(77) float local77 = (float) local67 / 255.0F;
			@Pc(81) float local81 = 1.0F - local77;
			Static420.anInt7261 = (local72 * (Static169.aClass120_2.anInt2506 & 0xFF00) + local67 * (Static170.anInt2901 & 0xFF00) & 0xFF0000) + (local67 * (Static170.anInt2901 & 0xFF00FF) + (Static169.aClass120_2.anInt2506 & 0xFF00FF) * local72 & 0xFF00FF00) >>> 8;
			Static141.anInt4797 = (local72 * (Static169.aClass120_2.anInt2502 & 0xFF00) + local67 * (Static294.anInt5121 & 0xFF00) & 0xFF0000) + ((Static169.aClass120_2.anInt2502 & 0xFF00FF) * local72 + local67 * (Static294.anInt5121 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static18.aFloat5 = local81 * (Static169.aClass120_2.aFloat28 - Static236.aFloat55) + Static236.aFloat55;
			Static432.anInt7421 = Static169.aClass120_2.anInt2508 * local72 + Static200.anInt3242 * local67 >> 8;
			Static5.aFloat183 = Static16.aFloat4 + (Static169.aClass120_2.aFloat26 - Static16.aFloat4) * local81;
			Static521.aFloat163 = (Static169.aClass120_2.aFloat27 - Static80.aFloat10) * local81 + Static80.aFloat10;
			Static484.aFloat142 = local81 * (Static169.aClass120_2.aFloat29 - Static503.aFloat161) + Static503.aFloat161;
			Static677.aFloat208 = Static588.aFloat204 + (Static169.aClass120_2.aFloat31 - Static588.aFloat204) * local81;
			Static656.aFloat207 = (Static169.aClass120_2.aFloat30 - Static468.aFloat138) * local81 + Static468.aFloat138;
			if (Static169.aClass120_2.aClass29_1 != Static178.aClass29_2) {
				Static246.aClass29_3 = Static60.aClass57_1.method7652(Static178.aClass29_2, Static169.aClass120_2.aClass29_1, local81, Static246.aClass29_3);
			}
		}
		Static140.aLong64 = local11;
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	public static void method1895() {
		if (Static294.aClass230_3.aBoolean472) {
			Static329.anInt5875 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = (aClass7 == null ? (aClass7 = Class99_Sub1.a("java.lang.Runtime")) : aClass7).getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static329.anInt5875 = (int) (local34 / 1048576L) + 1;
				} catch (@Pc(44) Throwable local44) {
				}
			}
		} catch (@Pc(46) Exception local46) {
		}
	}
}
