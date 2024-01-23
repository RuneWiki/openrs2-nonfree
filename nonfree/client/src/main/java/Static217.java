import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public static int anInt4472;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!pk;Lclient!f;Lclient!pk;B)V")
	public static void method3400(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class132 arg2) {
		Static4.aClass132_3 = arg2;
		Static234.anInterface1_1 = arg1;
		Static76.aClass132_28 = arg0;
		if (Static4.aClass132_3 != null) {
			Static12.anInt286 = Static4.aClass132_3.method3189(1);
		}
		if (Static76.aClass132_28 != null) {
			Static227.anInt4630 = Static76.aClass132_28.method3189(1);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V")
	public static void method3401(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static92.method1483(arg0)) {
			return;
		}
		@Pc(19) Class159[] local19 = Static210.aClass159ArrayArray6[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(29) Class159 local29 = local19[local21];
			if (local29.anObjectArray26 != null) {
				@Pc(37) Class8_Sub14 local37 = new Class8_Sub14();
				local37.aClass159_10 = local29;
				local37.anObjectArray1 = local29.anObjectArray26;
				Static183.method2797(2000000, local37);
			}
		}
	}
}
