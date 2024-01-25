import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!vo", name = "L", descriptor = "Lclient!ak;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
	public static int anInt6485 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!aq;ZI)Ljava/lang/String;")
	public static String method5465(@OriginalArg(0) Class12 arg0, @OriginalArg(2) int arg1) {
		if (!Static44.method1023(arg0).method5588(arg1) && arg0.anObjectArray18 == null) {
			return null;
		} else if (arg0.aStringArray3 == null || arg1 >= arg0.aStringArray3.length || arg0.aStringArray3[arg1] == null || arg0.aStringArray3[arg1].trim().length() == 0) {
			return Static185.aBoolean369 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray3[arg1];
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!uo;Lclient!wo;)V")
	public static void method5467(@OriginalArg(1) Class32 arg0, @OriginalArg(2) Class216 arg1) {
		if (Static275.aBoolean546) {
			return;
		}
		arg0.method2180(0);
		Static77.aClass5_10 = arg0.method2149(Static366.method2661(arg1, Class17_Sub1_Sub2.lb));
		Static77.aClass5_10.method3621((Static194.anInt4145 - Static77.aClass5_10.method3632()) / 2, (Static271.anInt5530 - Static77.aClass5_10.method3630()) / 2);
		Static91.aClass5_13 = arg0.method2149(Static366.method2661(arg1, Static126.anInt2821));
		Static91.aClass5_13.method3621((Static194.anInt4145 - Static91.aClass5_13.method3632()) / 2, 18);
		Static275.aBoolean546 = true;
	}
}
