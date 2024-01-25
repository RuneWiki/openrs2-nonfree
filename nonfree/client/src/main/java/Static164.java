import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IC)I")
	public static int method3254(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class88.anIntArray253.length ? Class88.anIntArray253[arg0] : -1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg0; local13 <= arg3; local13++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1; local16++) {
				if (Static520.anIntArrayArray94[local13][local16] == arg4 && Static443.anIntArrayArray74[local13][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3259(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static555.method5095(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
