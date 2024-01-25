import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public static int anInt2276;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_39 = new Class180(56, -2);

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_3 = new Class94();

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "Lclient!dha;")
	public static final Class74 aClass74_3 = new Class74();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	public static boolean method2091(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static247.aClass291_1.aBoolean619) {
			Static541.aClass342_3 = new Class342();
			Static541.aClass342_3.aString113 = arg0;
			Static541.aClass342_3.anInt9498 = arg1;
			if (Static202.aClass147_5 != Static487.aClass147_8) {
				Static541.aClass342_3.anInt9494 = Static541.aClass342_3.anInt9498 + 50000;
				Static541.aClass342_3.anInt9493 = Static541.aClass342_3.anInt9498 + 40000;
			}
			for (@Pc(36) int local36 = 0; local36 < Static665.aClass98_Sub1Array3.length; local36++) {
				if (Static665.aClass98_Sub1Array3[local36].anInt5514 == arg1) {
					Static593.anInt9532 = Static665.aClass98_Sub1Array3[local36].anInt5501;
				}
			}
			return true;
		}
		@Pc(66) String local66 = "";
		if (Static202.aClass147_5 != Static487.aClass147_8) {
			local66 = ":" + (arg1 + 7000);
		}
		@Pc(81) String local81 = "";
		if (Static303.aString49 != null) {
			local81 = "/p=" + Static303.aString49;
		}
		@Pc(134) String local134 = "http://" + arg0 + local66 + "/l=" + Static609.anInt9834 + "/a=" + Static362.anInt5843 + local81 + "/j" + (Static663.aBoolean803 ? "1" : "0") + ",o" + (Static603.aBoolean744 ? "1" : "0") + ",a2";
		try {
			Static200.aClient1.getAppletContext().showDocument(new URL(local134), "_self");
			return true;
		} catch (@Pc(144) Exception local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method2092() {
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub22_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.lb);
		Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub25_1);
		Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub25_2);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub4_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub9_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub23_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub13_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub19_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub15_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub3_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub12_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub29_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub5_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub17_2);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub17_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub26_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub8_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub10_1);
		Static128.method2422();
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub24_1);
		Static24.aClass3_Sub22_4.method2840(3, Static24.aClass3_Sub22_4.aClass6_Sub27_1);
		Static313.method4793();
		Static225.method3837();
		Static156.aBoolean235 = true;
	}
}
