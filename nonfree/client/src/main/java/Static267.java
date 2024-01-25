import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!ni", name = "S", descriptor = "Lclient!f;")
	public static Class22 aClass22_13;

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array18;

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_164 = new Class175("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "[I")
	public static int[] anIntArray387 = new int[1];

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method4007() {
		Static19.aClass16_1.method585();
		Static155.aClass74_1.method1872();
		if (Static166.aClass72_1 != null) {
			Static166.aClass72_1.method2815(Static351.aCanvas6);
		}
		Static107.aClient1.method1140();
		Static351.aCanvas6.setBackground(Color.black);
		Static281.anInt5170 = -1;
		Static19.aClass16_1 = Static129.method2235(Static351.aCanvas6);
		Static155.aClass74_1 = Static122.method2162(Static351.aCanvas6);
		if (Static166.aClass72_1 != null) {
			Static166.aClass72_1.method2812(Static351.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
	public static void method4012() {
		if (Static266.aClass75_7.method2585()) {
			Static266.aClass75_7.method2607(Static351.aCanvas6);
			method4007();
			Static266.aClass75_7.method2621(Static351.aCanvas6);
			Static266.aClass75_7.method2638(Static351.aCanvas6);
		} else {
			Static69.method1302(Static347.anInt6318);
		}
		Static357.method5085();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!eo;)Ljava/lang/String;")
	public static String method4013(@OriginalArg(1) Class68 arg0) {
		if (Static56.method1160(arg0).method3487() == 0) {
			return null;
		} else if (arg0.aString18 == null || arg0.aString18.trim().length() == 0) {
			return Static176.aBoolean278 ? "Hidden-use" : null;
		} else {
			return arg0.aString18;
		}
	}
}
