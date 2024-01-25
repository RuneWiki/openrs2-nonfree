import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_84 = new Class40(38, 0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3128(@OriginalArg(1) String arg0) {
		if (Static296.aClass153Array3 != null) {
			Static136.method2051(Static318.aClass160_75);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0));
			Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lclient!ji;")
	public static Class154 method3130() {
		try {
			return (Class154) Class.forName("Class154_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method3131(@OriginalArg(1) int arg0) {
		Static492.anInt8232 = arg0;
		Static104.anInt1939 = 100;
		Static102.anInt1883 = 3;
		Static20.anInt364 = -1;
	}
}
