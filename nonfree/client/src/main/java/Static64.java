import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "Lclient!gca;")
	public static Class111 aClass111_5 = new Class111();

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)Z")
	public static boolean method1033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
