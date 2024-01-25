import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "[I")
	public static final int[] anIntArray78 = new int[25];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method1389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static649.method8957(arg1, arg0) || Static328.method4972(arg1, arg0);
	}
}
