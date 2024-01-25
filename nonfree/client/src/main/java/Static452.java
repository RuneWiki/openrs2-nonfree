import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!rca", name = "jb", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!rca", name = "V", descriptor = "Lclient!th;")
	public static final Class325 aClass325_9 = new Class325();

	@OriginalMember(owner = "client!rca", name = "ob", descriptor = "[I")
	public static final int[] anIntArray475 = new int[3];

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z")
	public static boolean method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
