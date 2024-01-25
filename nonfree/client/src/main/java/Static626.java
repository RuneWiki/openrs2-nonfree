import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static626 {

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!pda;")
	public static Class51 aClass51_11;

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
	public static int anInt10188 = 2;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "F")
	public static float aFloat206 = 1.0F;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_219 = new Class200(71, -2);

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	public static int anInt10190 = 0;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!et;I)I")
	public static int method8676(@OriginalArg(0) Class104 arg0) {
		if (arg0 == Static509.aClass104_14) {
			return 6407;
		} else if (arg0 == Static78.aClass104_3) {
			return 6408;
		} else if (Static210.aClass104_18 == arg0) {
			return 6406;
		} else if (Static133.aClass104_4 == arg0) {
			return 6409;
		} else if (arg0 == Static219.aClass104_7) {
			return 6410;
		} else if (Static433.aClass104_12 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
