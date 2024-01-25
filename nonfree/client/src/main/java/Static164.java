import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt3043;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lclient!hp;")
	public static final Class1_Sub5[] aClass1_Sub5Array1 = new Class1_Sub5[2048];

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ya;B)V")
	public static void method2644(@OriginalArg(0) Class39 arg0) {
		if (Static297.aBoolean374) {
			Static135.method2323(arg0);
		} else {
			Static68.method1378(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2645(@OriginalArg(1) String arg0) {
		if (Static206.aStringArray25 == null) {
			Static262.method3880();
		}
		@Pc(18) String[] local18 = Static402.method5419('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			for (@Pc(23) int local23 = Static242.anInt4434; local23 > 0; local23--) {
				Static206.aStringArray25[local23] = Static206.aStringArray25[local23 - 1];
			}
			Static206.aStringArray25[0] = local18[local20];
			if (Static206.aStringArray25.length - 1 > Static242.anInt4434) {
				Static242.anInt4434++;
				if (Static49.anInt956 > 0) {
					Static49.anInt956++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public static void method2646(@OriginalArg(0) int arg0) {
		if (Static125.method2231(arg0)) {
			Static236.method3579(-1, Static437.aClass251ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	public static void method2647(@OriginalArg(1) int arg0) {
		Static4.anInt113 = arg0;
		Static80.aClass134_14.method3272();
	}
}
