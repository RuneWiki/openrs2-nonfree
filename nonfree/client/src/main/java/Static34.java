import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "T", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!bca", name = "R", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_24 = new Class200(110, -1);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	public static void method758() {
		Static556.anInt9201 = 0;
		Static194.anInt3866 = 0;
		Static452.anInt7377 = 0;
		Static196.anInt3909 = 0;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
	public static void method761(@OriginalArg(1) int arg0) {
		Static286.anInt5207 = arg0;
		Static14.anInt274 = 100;
		Static50.anInt1296 = -1;
		Static648.anInt10477 = 3;
	}

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "(B)V")
	public static void method762() {
		Static114.aClass303Array1 = null;
		if (Static148.aBoolean241 && Static402.method6006() != 1) {
			Static6.method97(Static454.anInt7416 == 3 || Static454.anInt7416 == 7, 0, Static197.method3392(), 0, Static75.method7256());
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (Static148.aBoolean241) {
			local41 = Static100.method1939();
			local43 = Static260.method4303();
		}
		Static452.method6429(local41, Static592.anInt9857, Static71.anInt1925 + local43, local41, local43, local43, local41 + Class16_Sub1_Sub5_Sub1.lb, -1);
		if (Static114.aClass303Array1 != null) {
			Static439.method6317(Static198.anInt3923, Class16_Sub1_Sub5_Sub1.lb + local41, Static71.anInt1925 + local43, local41, Static439.anInt7222, -1412584499, Static373.aClass303_14.anInt7944, local43, Static114.aClass303Array1, true);
			Static114.aClass303Array1 = null;
		}
	}
}
