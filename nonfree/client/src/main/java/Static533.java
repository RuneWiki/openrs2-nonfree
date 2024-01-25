import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Lclient!g;")
	public static final Class110 aClass110_25 = new Class110(2);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method8112(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub16 local12 = Static422.method6588(9, arg0);
		local12.method6700();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method8113(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static392.aClass45_104.method1474(Static544.anInt7853) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static151.aClass45_80.method1474(Static544.anInt7853) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z")
	public static boolean method8114() {
		return Static334.aClass139_4 != Static190.aClass139_1 || Static378.anInt6739 >= 2;
	}
}
