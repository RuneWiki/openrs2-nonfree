import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "J")
	public static long aLong26;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!fn;IIZIIB)V")
	public static void method731(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static117.anInt2050 >= 50 || (arg0 == null || arg0.anIntArrayArray22 == null || arg2 >= arg0.anIntArrayArray22.length || arg0.anIntArrayArray22[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray22[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(54) int local54 = local36 & 0x1F;
		@Pc(71) int local71;
		if (arg0.anIntArrayArray22[arg2].length > 1) {
			local71 = (int) ((double) arg0.anIntArrayArray22[arg2].length * Math.random());
			if (local71 > 0) {
				local40 = arg0.anIntArrayArray22[arg2][local71];
			}
		}
		if (local54 == 0) {
			if (arg3) {
				Static350.method4969(local40, 0, 255, local46);
			}
		} else if (Static8.aClass173_Sub1_1.anInt4411 != 0) {
			local71 = arg4 - 64 >> 7;
			@Pc(110) int local110 = arg5 - 64 >> 7;
			Static127.aClass197Array1[Static117.anInt2050++] = new Class197((byte) 1, local40, local46, 0, 255, local54 + (local110 << 8) + (local71 << 16) + (arg1 << 24));
		}
	}
}
