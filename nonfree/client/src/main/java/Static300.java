import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt4711;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!nh;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array9;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method4219() {
		if (Static238.anInterface22Array1 == null) {
			return;
		}
		@Pc(17) Interface22[] local17 = Static238.anInterface22Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface22 local25 = local17[local19];
			local25.method8781();
		}
	}
}
