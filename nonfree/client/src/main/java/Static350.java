import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "[I")
	public static int[] anIntArray806;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Lclient!re;")
	public static final Class175 aClass175_8 = new Class175();

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "Lclient!je;")
	public static final Class100 aClass100_1 = new Class100();

	@OriginalMember(owner = "client!wk", name = "Z", descriptor = "J")
	public static long aLong214 = 0L;

	@OriginalMember(owner = "client!wk", name = "ab", descriptor = "I")
	public static int anInt6501 = 0;

	@OriginalMember(owner = "client!wk", name = "bb", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static183.aByteArrayArrayArray7[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static183.aByteArrayArrayArray7[arg2][arg1][arg3] & 0x10) == 0) {
			return arg0 == Static38.method3472(arg2, arg1, arg3);
		} else {
			return false;
		}
	}
}
