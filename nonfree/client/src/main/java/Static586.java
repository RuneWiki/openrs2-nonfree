import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uv", name = "Sb", descriptor = "Lclient!ni;")
	public static Class223 aClass223_52;

	@OriginalMember(owner = "client!uv", name = "db", descriptor = "(I)Z")
	public static boolean method4065() {
		@Pc(7) boolean local7 = true;
		if (Static229.aClass331_1 == null) {
			if (Static436.aClass223_98.method5951(Static490.anInt5255)) {
				Static229.aClass331_1 = Static655.method7890(Static436.aClass223_98, Static490.anInt5255);
			} else {
				local7 = false;
			}
		}
		if (Static411.aClass331_2 == null) {
			if (Static436.aClass223_98.method5951(Static525.anInt9180)) {
				Static411.aClass331_2 = Static655.method7890(Static436.aClass223_98, Static525.anInt9180);
			} else {
				local7 = false;
			}
		}
		if (Static594.aClass331_3 == null) {
			if (Static436.aClass223_98.method5951(Static633.anInt10641)) {
				Static594.aClass331_3 = Static655.method7890(Static436.aClass223_98, Static633.anInt10641);
			} else {
				local7 = false;
			}
		}
		if (Static228.aClass213_8 == null) {
			if (Static74.aClass223_31.method5951(Static459.anInt8226)) {
				Static228.aClass213_8 = Static50.method1622(Static74.aClass223_31, Static459.anInt8226);
			} else {
				local7 = false;
			}
		}
		if (Static108.aClass331Array1 == null) {
			if (Static436.aClass223_98.method5951(Static459.anInt8226)) {
				Static108.aClass331Array1 = Static655.method7891(Static436.aClass223_98, Static459.anInt8226);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
