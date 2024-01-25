import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tba", name = "Nb", descriptor = "I")
	public static int anInt8754;

	@OriginalMember(owner = "client!tba", name = "Pb", descriptor = "Ljava/lang/String;")
	public static String aString234;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method6836(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "(Z)V")
	public static void method6838() {
		Static269.aClass297_22.method6535();
	}
}
