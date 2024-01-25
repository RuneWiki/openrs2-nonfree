import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	public static int anInt5571;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
	public static int anInt5573;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
	public static int anInt5575;

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "[I")
	public static final int[] anIntArray378 = new int[1000];

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
	public static int anInt5574 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method4659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = arg1; local5 <= arg2; local5++) {
			for (@Pc(8) int local8 = arg0; local8 <= arg3; local8++) {
				if (Static39.anIntArrayArray93[local5][local8] == arg4 && Static277.anIntArrayArray47[local5][local8] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg5 > arg4 && arg3 + arg4 > arg5) {
			return arg2 < arg1 + arg7 && arg7 < arg6 + arg2;
		} else {
			return false;
		}
	}
}
