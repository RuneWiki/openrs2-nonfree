import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_61 = new Class194(31, -1);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method1391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
