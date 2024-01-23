import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[J")
	public static long[] aLongArray12 = new long[200];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!qe;")
	private static Class78 aClass78_793 = Static199.method3560("yellow:");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_792 = aClass78_793;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public static int anInt4496 = 0;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_794 = Static199.method3560("www");

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt4497 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_795 = aClass78_793;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public static int anInt4499 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
	public static int method3565(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(28) int local28 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local28 == 0) {
				return 1;
			}
			if (local28 == 1) {
				return 2;
			}
			if (local28 == 2) {
				return 4;
			}
			if (local28 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local28 == 0) {
				return 16;
			}
			if (local28 == 1) {
				return 32;
			}
			if (local28 == 2) {
				return 64;
			}
			if (local28 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[BB[IIIII)V")
	public static void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(17) int local17 = ((arg6 & 0xFF00) * arg8 & 0xFF0000) + ((arg6 & 0xFF00FF) * arg8 & 0xFF00FF00) >> 8;
		@Pc(22) int local22 = 256 - arg8;
		for (@Pc(32) int local32 = -arg7; local32 < 0; local32++) {
			for (@Pc(36) int local36 = -arg0; local36 < 0; local36++) {
				if (arg4[arg3++] == 0) {
					arg2++;
				} else {
					@Pc(48) int local48 = arg5[arg2];
					arg5[arg2++] = local17 + ((local22 * (local48 & 0xFF00FF) & 0xFF00FF00) + ((local48 & 0xFF00) * local22 & 0xFF0000) >> 8);
				}
			}
			arg3 += arg9;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZII)V")
	public static void method3568(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1) {
		Static36.anInt669 = (short) arg0;
		Static130.anInt2940 = (short) arg1;
	}
}
