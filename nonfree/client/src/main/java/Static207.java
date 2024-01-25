import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "[Lclient!sa;")
	public static Class7[] aClass7Array7;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public static int anInt4085 = 0;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_30 = new Class277(4);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method3823() {
		if (Static455.aClass4_11 == null) {
			return;
		}
		Static191.aClass184_49.method5136();
		Static230.method4159();
		Static293.method7812();
		Static15.method527();
		Static465.method7074();
		Static120.method7555();
		if (Static516.aClass62_1 != null) {
			Static516.aClass62_1.method1791();
		}
		Static30.method811();
		Static519.method1985();
		Static98.method2015();
		Static518.method7916(false);
		Static539.method8205();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class20_Sub1_Sub1_Sub1 local48 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local42];
			if (local48 != null) {
				local48.aClass1_Sub27_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass97Array3.length; local55++) {
					local48.aClass97Array3[local55] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static342.anInt6322; local76++) {
			@Pc(83) Class20_Sub1_Sub1_Sub2 local83 = Static35.aClass1_Sub41Array1[local76].aClass20_Sub1_Sub1_Sub2_2;
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < local83.aClass97Array3.length; local87++) {
					local83.aClass97Array3[local87] = null;
				}
			}
		}
		Static224.aClass128_5 = null;
		Static437.aClass128_7 = null;
		Static455.aClass4_11.method7150();
		Static455.aClass4_11 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V")
	public static void method3825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class126 local9 = Static169.aClass126ArrayArray1[arg2][arg1];
		Static217.method4011(local9 == null ? Static440.aClass126_2 : local9, arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3826(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static310.method5796(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
