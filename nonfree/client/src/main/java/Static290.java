import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_91 = new Class70(64);

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public static final int anInt5449 = -14475237;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method4947(@OriginalArg(2) String arg0) {
		return Static23.method352(16, arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4949(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static225.method3955(Static217.method3880(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!dp;Lclient!dp;)V")
	public static void method4950(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		Static28.aClass53_25 = arg1;
		Static250.aClass53_23 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public static void method4952(@OriginalArg(1) int arg0) {
		if (arg0 == Static129.anInt2374) {
			return;
		}
		if (Static129.anInt2374 == 0) {
			Static194.method3612();
		}
		if (arg0 == 40) {
			Static75.method1311();
		}
		if (arg0 != 40 && Static278.aClass11_6 != null) {
			Static278.aClass11_6.method159();
			Static278.aClass11_6 = null;
		}
		if (Static129.anInt2374 == 25 || Static129.anInt2374 == 28) {
			Static114.aClass53_62.anInt1133 = 2;
			Static284.aClass53_131.anInt1133 = 2;
			Static282.aClass53_130.anInt1133 = 2;
			Static128.aClass53_74.anInt1133 = 2;
			Static110.aClass53_57.anInt1133 = 2;
			Static111.aClass53_59.anInt1133 = 2;
			Static291.aClass53_133.anInt1133 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static27.anInt535 = 1;
			Static67.anInt1246 = 0;
			Static15.anInt290 = 0;
			Static145.anInt2603 = 1;
			Static22.anInt360 = 0;
			Static31.method487(true);
			Static114.aClass53_62.anInt1133 = 1;
			Static284.aClass53_131.anInt1133 = 1;
			Static282.aClass53_130.anInt1133 = 1;
			Static128.aClass53_74.anInt1133 = 1;
			Static110.aClass53_57.anInt1133 = 1;
			Static111.aClass53_59.anInt1133 = 1;
			Static291.aClass53_133.anInt1133 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static213.method3830();
		}
		if (arg0 == 5) {
			Static230.method4092(Static269.aClass53_124, Static289.aClass81_7);
		} else {
			Static20.method303();
		}
		@Pc(145) boolean local145 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(160) boolean local160 = Static129.anInt2374 == 5 || Static129.anInt2374 == 10 || Static129.anInt2374 == 28;
		if (local160 != local145) {
			if (local145) {
				Static253.anInt4718 = Static132.anInt2415;
				if (Static62.anInt1130 == 0) {
					Static300.method5157();
				} else {
					Static18.method290(Static132.anInt2415, 255, Static244.aClass53_116);
				}
				Static124.aClass113_1.method3137(false);
			} else {
				Static300.method5157();
				Static124.aClass113_1.method3137(true);
				if (Static287.aClass101_1 != null) {
					Static287.aClass101_1.method2599();
					Static287.aClass101_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static289.aClass81_7.method3003();
		}
		Static129.anInt2374 = arg0;
	}
}
