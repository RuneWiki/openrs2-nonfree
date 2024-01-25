import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method4477() {
		if (Static274.aClass47_9.method2754()) {
			Static140.method2945();
			Static274.aClass47_9.method2726(Static300.aCanvas5);
			Static12.method242();
		} else {
			Static106.method2349(Static225.anInt4568);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4482(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static202.anInt4162; local18++) {
			if (arg0.equalsIgnoreCase(Static73.aStringArray21[local18])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!tj;B)V")
	public static void method4487(@OriginalArg(0) Class193 arg0) {
		Static3.aClass193_3 = arg0;
	}
}
