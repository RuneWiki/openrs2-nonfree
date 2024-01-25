import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!id", name = "L", descriptor = "Lclient!vv;")
	public static final Class376 aClass376_4 = new Class376();

	@OriginalMember(owner = "client!id", name = "M", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_81 = new Class44(63, -1);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3588(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static641.anInt10703; local19++) {
			if (arg0.equalsIgnoreCase(Static411.aStringArray27[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static228.aStringArray11[local19])) {
				return true;
			}
		}
		return false;
	}
}
