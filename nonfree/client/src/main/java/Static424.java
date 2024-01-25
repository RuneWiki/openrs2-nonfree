import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qca", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
	public static int anInt7197 = -1;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IC)Z")
	public static boolean method5937(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static355.aCharArray6;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIZI)I")
	public static int method5938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class151.anIntArray245[arg1 * 8192 / arg0] >> 1;
		return (local24 * arg3 >> 16) + (arg2 * (65536 - local24) >> 16);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIBI)V")
	public static void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static487.anInt8210 = 0;
		Static494.anInt8295 = arg1;
		Static126.anInt6658 = 0;
		Static278.anInt5111 = arg0;
	}
}
