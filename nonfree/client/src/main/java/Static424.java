import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qda", name = "F", descriptor = "Lclient!pu;")
	public static Class270 aClass270_91;

	@OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
	public static int anInt7346;

	@OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
	public static int anInt7340 = 2;

	@OriginalMember(owner = "client!qda", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!qda", name = "O", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "(I)Lclient!vd;")
	public static Class286 method5867() {
		try {
			return (Class286) Class.forName("Class286_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class286_Sub1();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)V")
	public static void method5868(@OriginalArg(1) boolean arg0) {
		if (Static568.aClass149_2 != null) {
			Static568.aClass149_2.method3281();
			Static568.aClass149_2 = null;
		}
		Static181.anInt3169 = 0;
		Static283.method3948();
		Static145.method2157();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static478.aClass59Array2[local19].method1192();
		}
		Static507.method7074(false);
		System.gc();
		Static55.method1012();
		Static300.anInt5153 = -1;
		Static340.aBoolean451 = false;
		Static346.method4714(true);
		Static116.anInt2289 = 0;
		Static541.anInt9058 = 0;
		Static504.anInt5716 = 0;
		Static90.anInt1938 = 0;
		Static92.anInt1987 = 0;
		Static188.anInt3531 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static41.aClass154Array1.length; local58++) {
			Static41.aClass154Array1[local58] = null;
		}
		Static33.method2097();
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local73] = null;
		}
		Static39.anInt609 = 0;
		Static84.aClass187_40.method3801();
		Static35.anInt540 = 0;
		Static19.aClass187_3.method3801();
		Static426.method5891();
		Static373.anInt6266 = 0;
		Static430.aClass321_1.method7091();
		Static93.method1620();
		Static195.method2978();
		Static366.aLong200 = 0L;
		Static250.aClass1_Sub34_1 = null;
		if (arg0) {
			Static426.method5887(12);
			return;
		}
		Static426.method5887(3);
		try {
			Static602.method2417(Static590.anApplet2, "loggedout");
		} catch (@Pc(120) Throwable local120) {
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
	public static void method5869(@OriginalArg(0) int arg0) {
		Static66.anInt1327 = arg0;
		Static208.aClass222_25.method4428();
	}
}
