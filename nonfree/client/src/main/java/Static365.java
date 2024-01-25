import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_74 = new Class94(74, -1);

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt7300 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public static void method6195(@OriginalArg(1) int arg0) {
		if (Static559.anIntArray650 == null || Static559.anIntArray650.length < arg0) {
			Static559.anIntArray650 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!in;B)V")
	public static void method6197(@OriginalArg(0) Class157 arg0) {
		Static26.aClass157_19 = arg0;
	}
}
