import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
	public static int anInt3007;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_883 = Static181.method2795("M");

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	public static int anInt3005 = 1;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "Lclient!qe;")
	public static Class83 aClass83_884 = aClass83_883;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_885 = Static181.method2795(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_886 = Static181.method2795("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lclient!qe;")
	public static Class83 aClass83_887 = aClass83_883;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	public static void method2296(@OriginalArg(1) int arg0) {
		if (!Static133.method2211(arg0)) {
			return;
		}
		@Pc(14) Class5[] local14 = Static175.aClass5ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class5 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt169 = 0;
				local22.anInt139 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public static void method2298() {
		Static158.aBoolean148 = false;
		Static171.aBoolean164 = false;
	}
}
