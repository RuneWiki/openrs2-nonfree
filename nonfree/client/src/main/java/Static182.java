import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!fka", name = "e", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(BLclient!av;)Lclient!av;")
	public static Class20 method2795(@OriginalArg(1) Class20 arg0) {
		@Pc(13) Class20 local13 = Static87.method1173(arg0);
		if (local13 == null) {
			local13 = arg0.aClass20_3;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(BLclient!av;)Ljava/lang/String;")
	public static String method2796(@OriginalArg(1) Class20 arg0) {
		if (Static87.method1164(arg0).method4617() == 0) {
			return null;
		} else if (arg0.aString9 == null || arg0.aString9.trim().length() == 0) {
			return Static632.aBoolean738 ? "Hidden-use" : null;
		} else {
			return arg0.aString9;
		}
	}
}
