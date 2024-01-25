import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "Lclient!vl;")
	public static Class254 aClass254_3;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array16;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	public static int anInt6487;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "[S")
	public static final short[] aShortArray232 = new short[] { 58, 13, 10, 12, 5, 57, 17, 20 };

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Z")
	public static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public static void method5082() {
		Static154.aClass124_2.method3151();
		Static234.aClass192_2.method4343();
		Static420.aClass109_2.method2760();
		Static267.aClass262_2.method5557();
		Static329.aClass240_1.method5221();
		Static444.aClass206_3.method4702();
		Static182.aClass55_1.method1392();
		Static352.aClass194_2.method4419();
		Static26.aClass26_1.method649();
		Static183.aClass223_1.method5003();
		Static222.aClass249_1.method5324();
		Static76.aClass265_2.method5596();
		Static348.aClass182_4.method4132();
		Static426.aClass208_1.method4722();
		Static153.aClass180_1.method4118();
		Static296.aClass217_1.method4931();
		Static238.aClass226_1.method5022();
		Static405.aClass204_1.method4673();
		Static118.aClass172_2.method3979();
		Static280.aClass72_1.method1987();
		Static4.method4664();
		Static234.method3501();
		Static332.method4520();
		Static341.method5178();
		Static261.aClass68_27.method1791();
		Static200.aClass68_22.method1791();
		Static386.aClass68_23.method1791();
		Static105.aClass68_9.method1791();
		Static271.aClass68_29.method1791();
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
	public static void method5084() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static326.anInt5666; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static283.anInt5187; local18++) {
				if (Static306.method4135(local14, true, local18, local7, Static202.aClass164ArrayArrayArray5)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
