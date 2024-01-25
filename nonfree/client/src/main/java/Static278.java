import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_97 = new Class359(25, 4);

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
	public static boolean aBoolean461 = true;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
	public static final int[] anIntArray296 = new int[1000];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg2; local16++) {
				if (arg0 == Static89.anIntArrayArray5[local12][local16] && Static500.anIntArrayArray43[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIB)I")
	public static int method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4508(@OriginalArg(0) String arg0) {
		return Static8.method119(he.class, arg0);
	}
}
