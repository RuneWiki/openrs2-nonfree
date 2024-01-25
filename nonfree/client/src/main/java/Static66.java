import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_36 = new Class44(13, -1);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z")
	public static boolean method1324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
