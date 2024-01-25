import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
	public static int anInt1827 = 0;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_87 = new Class137(68, 4);

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!vg;)Ljava/lang/String;")
	public static String method1480(@OriginalArg(1) Class250 arg0) {
		if (Static52.method804(arg0).method1723() == 0) {
			return null;
		} else if (arg0.aString60 == null || arg0.aString60.trim().length() == 0) {
			return Static419.aBoolean556 ? "Hidden-use" : null;
		} else {
			return arg0.aString60;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg4; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg3; local16++) {
				if (Static328.anIntArrayArray136[local12][local16] == arg0 && Static378.anIntArrayArray155[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
