import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_18 = new Class187(32, 7);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z")
	public static boolean method840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
