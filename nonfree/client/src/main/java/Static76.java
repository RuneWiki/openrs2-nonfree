import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!wp;")
	public static final Class269 aClass269_1 = new Class269();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method1407(@OriginalArg(0) int arg0) {
		if (arg0 == Static229.anInt4545) {
			return;
		}
		Static209.anInt4283 = Static211.anInt4295 = Static129.anIntArray302[arg0];
		Static318.method4535();
		Static65.anIntArrayArray18 = new int[Static209.anInt4283][Static211.anInt4295];
		Static334.anIntArrayArrayArray14 = new int[4][Static209.anInt4283 >> 3][Static211.anInt4295 >> 3];
		Static163.anIntArrayArray33 = new int[Static209.anInt4283][Static211.anInt4295];
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			Static19.aClass120Array1[local34] = Static368.method5121(Static209.anInt4283, Static211.anInt4295);
		}
		Static237.aByteArrayArrayArray15 = new byte[4][Static209.anInt4283][Static211.anInt4295];
		Static54.method1009(Static211.anInt4295, Static209.anInt4283);
		Static128.method2104(Static209.anInt4283 >> 3, Static30.aClass106_3, Static211.anInt4295 >> 3);
		Static229.anInt4545 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I")
	public static int method1408(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
