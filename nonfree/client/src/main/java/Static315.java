import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	public static int anInt5144;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_78 = new Class21("K", "T", "K", "K");

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public static void method4354() {
		Static153.aClass96_20.method2799();
		Static138.aClass96_16.method2799();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lclient!oo;")
	public static Class188 method4356(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static17.aClass188Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4358(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static163.method6311(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static163.method6311(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static22.method358(local72)) {
				@Pc(80) char local80 = Static69.method1527(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
