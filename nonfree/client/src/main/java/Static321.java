import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!op;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_200 = new Class221("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_18 = new Class17(0, -1);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt5637 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public static int method4947(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method4949() {
		if (Static169.aClass124_3 != null) {
			Static169.aClass124_3.method2714();
			Static169.aClass124_3 = null;
		}
		Static382.method5683();
		Static115.method2164();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static190.aClass239Array1[local17].method5561();
		}
		Static140.method5082(false);
		System.gc();
		Static90.method1536();
		Static327.aBoolean445 = false;
		Static4.anInt147 = -1;
		Static141.method2445(true);
		Static213.aBoolean293 = false;
		Static133.anInt2474 = 0;
		Static226.anInt4218 = 0;
		Static376.anInt6607 = 0;
		Static306.anInt5451 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static239.aClass97Array1.length; local62++) {
			Static239.aClass97Array1[local62] = null;
		}
		Static28.method685();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static90.aClass12_Sub1_Sub2_Sub2Array1[local81] = null;
		}
		Static199.anInt3672 = 0;
		for (@Pc(97) int local97 = 0; local97 < 32768; local97++) {
			Static107.aClass12_Sub1_Sub2_Sub1Array1[local97] = null;
		}
		Static147.aClass214_14.method5068();
		Static307.method4777();
		Static45.anInt2591 = 0;
		Static248.aClass125_1.method2741();
		Static311.method4819();
		Static274.method1028();
		Static204.method3427(true);
		try {
			Static400.method4007(Static92.aClass53_2.anApplet1, "loggedout");
		} catch (@Pc(134) Throwable local134) {
		}
		Static231.aClass2_Sub18_2 = null;
		Static92.aLong59 = 0L;
	}
}
