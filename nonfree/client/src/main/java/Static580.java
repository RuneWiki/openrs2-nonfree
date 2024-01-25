import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!oga;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public static void method7844() {
		Static42.aClass313_10.method6977();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBLclient!kp;I)V")
	public static void method7845(@OriginalArg(0) int arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) int arg2) {
		if (Static288.aClass196_3 != null || Static167.aBoolean291 || (arg1 == null || Static114.method1700(arg1) == null)) {
			return;
		}
		Static288.aClass196_3 = arg1;
		Static453.aClass196_8 = Static114.method1700(arg1);
		Static403.anInt7032 = arg0;
		Static339.anInt2916 = arg2;
		Static146.aBoolean241 = false;
		Static7.anInt333 = 0;
	}
}
