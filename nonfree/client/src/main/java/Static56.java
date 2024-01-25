import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_18 = new Class180(12, 6);

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_1 = new Class147("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "[I")
	public static final int[] anIntArray99 = new int[4096];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)I")
	public static int method1213(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
