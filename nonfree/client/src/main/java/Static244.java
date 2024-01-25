import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_6 = new Class216(14, 0, 4, 1);

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public static int anInt4473 = -1;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4028(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static48.anInt995; local11++) {
			if (arg0.equalsIgnoreCase(Static400.aStringArray55[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
