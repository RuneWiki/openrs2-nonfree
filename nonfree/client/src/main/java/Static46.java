import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt1323 = -1;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "[I")
	public static int[] anIntArray142 = new int[128];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	public static int method866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static94.method1612(arg1 - 1, arg0 + -1) + Static94.method1612(arg1 - 1, arg0 + 1) + Static94.method1612(arg1 - -1, arg0 + -1) + Static94.method1612(arg1 - -1, arg0 + 1);
		@Pc(68) int local68 = Static94.method1612(arg1, arg0 - 1) + Static94.method1612(arg1, arg0 + 1) + Static94.method1612(arg1 - 1, arg0) + Static94.method1612(arg1 - -1, arg0);
		@Pc(82) int local82 = Static94.method1612(arg1, arg0);
		return local82 / 4 + local37 / 16 + local68 / 8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method867() {
		anIntArray142 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method868() {
		while (true) {
			if (Static51.aClass1_Sub19_Sub1_4.method2104(Static81.anInt2134) >= 11) {
				@Pc(23) int local23 = Static51.aClass1_Sub19_Sub1_4.method2096(11);
				if (local23 != 2047) {
					@Pc(28) boolean local28 = false;
					if (Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local23] == null) {
						local28 = true;
						Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local23] = new Class1_Sub1_Sub1_Sub1_Sub1();
						if (Static93.aClass1_Sub19Array1[local23] != null) {
							Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local23].method95(Static93.aClass1_Sub19Array1[local23]);
						}
					}
					Static102.anIntArray321[Static40.anInt1154++] = local23;
					@Pc(64) Class1_Sub1_Sub1_Sub1_Sub1 local64 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local23];
					local64.anInt1435 = Static73.anInt1947;
					@Pc(72) int local72 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
					@Pc(77) int local77 = Static51.aClass1_Sub19_Sub1_4.method2096(5);
					@Pc(84) int local84 = Static44.anIntArray127[Static51.aClass1_Sub19_Sub1_4.method2096(3)];
					if (local77 > 15) {
						local77 -= 32;
					}
					if (local28) {
						local64.anInt1402 = local64.anInt1436 = local84;
					}
					@Pc(101) int local101 = Static51.aClass1_Sub19_Sub1_4.method2096(5);
					if (local101 > 15) {
						local101 -= 32;
					}
					@Pc(110) int local110 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
					if (local110 == 1) {
						Static17.anIntArray65[Static32.anInt1453++] = local23;
					}
					local64.method903(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0] + local77, local101 + Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], local72 == 1);
					continue;
				}
			}
			Static51.aClass1_Sub19_Sub1_4.method2095();
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method869() {
		if (Static114.aClass76_1 != null) {
			@Pc(12) Class76 local12 = Static114.aClass76_1;
			synchronized (Static114.aClass76_1) {
				Static114.aClass76_1 = null;
			}
		}
	}
}
