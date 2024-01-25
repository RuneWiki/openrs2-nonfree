import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static372 {

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "Lclient!jo;")
	public static Class168 aClass168_126;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_115 = new Class181(38, 3);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(B)V")
	public static void method8111() {
		if (Static156.aClass280_2 == null) {
			return;
		}
		if (Static156.aClass280_2.anInt8467 == 1) {
			Static156.aClass280_2 = null;
			return;
		}
		if (Static156.aClass280_2.anInt8467 == 2) {
			Static405.method6332(2, Static489.aClass246_6, Static177.aString41);
			Static156.aClass280_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(CZ)Z")
	public static boolean method8112(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
