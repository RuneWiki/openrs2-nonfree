import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static488 {

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "[J")
	public static long[] aLongArray22;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_121 = new Class316(21, -1);

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "F")
	public static float aFloat210 = 0.25F;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "[I")
	public static final int[] anIntArray725 = new int[1];

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_122 = new Class316(66, 3);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
	public static boolean method7871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static224.method3525(arg0, arg1) | (arg1 & 0x800) != 0 || Static369.method5433(arg0, arg1);
	}
}
