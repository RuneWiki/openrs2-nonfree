import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static524 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public static int anInt8750;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[I")
	public static final int[] anIntArray602 = new int[13];

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_15 = new Class187(4);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)Z")
	public static boolean method7326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static571.method7845(arg1, arg0) || Static395.method2908(arg0, arg1);
	}
}
