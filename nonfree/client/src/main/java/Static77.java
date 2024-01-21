import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1120 = Static80.method1463("Service unavailable)3");

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt2143 = 0;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static int anInt2144 = 0;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1121 = Static80.method1463("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1122 = aClass63_1120;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1441() {
		for (@Pc(7) int local7 = -1; local7 < Static81.anInt2219; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static114.anIntArray356[local7];
			}
			@Pc(24) Class6_Sub3_Sub1_Sub2_Sub2 local24 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local16];
			if (local24 != null) {
				Static20.method509(1, local24);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1444() {
		aClass63_1122 = null;
		aClass63_1121 = null;
		aClass63_1120 = null;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1445() {
		Static100.aClass49_26.method1389();
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)V")
	public static void method1446(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static36.method866(arg0)) {
			return;
		}
		@Pc(18) Class6_Sub3_Sub17[] local18 = Static68.aClass6_Sub3_Sub17ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local18.length; local24++) {
			@Pc(30) Class6_Sub3_Sub17 local30 = local18[local24];
			if (local30.anObjectArray19 != null) {
				Static99.method1836(local30.anObjectArray19, local30, 0, 0, null, 0);
			}
		}
	}
}
