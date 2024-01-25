import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dv", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!dv", name = "N", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_32 = new Class25(87, 19);

	@OriginalMember(owner = "client!dv", name = "P", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_33 = new Class25(21, -1);

	@OriginalMember(owner = "client!dv", name = "R", descriptor = "[I")
	public static final int[] anIntArray99 = new int[500];

	@OriginalMember(owner = "client!dv", name = "S", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!dv", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(III)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static175.aClass36ArrayArrayArray1[0][arg1][arg2] != null && Static175.aClass36ArrayArrayArray1[0][arg1][arg2].aClass36_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static175.aClass36ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class36 local46 = Static175.aClass36ArrayArrayArray1[local22][arg1][arg2] = new Class36(local22, arg1, arg2);
				if (local20) {
					local46.aByte2++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!gi;III)V")
	public static void method1223(@OriginalArg(0) Class93 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte40 == 0) {
			arg0.anInt2460 = arg0.anInt2444;
		} else if (arg0.aByte40 == 1) {
			arg0.anInt2460 = arg0.anInt2444 + (arg2 - arg0.anInt2436) / 2;
		} else if (arg0.aByte40 == 2) {
			arg0.anInt2460 = arg2 - arg0.anInt2436 - arg0.anInt2444;
		} else if (arg0.aByte40 == 3) {
			arg0.anInt2460 = arg2 * arg0.anInt2444 >> 14;
		} else if (arg0.aByte40 == 4) {
			arg0.anInt2460 = (arg2 * arg0.anInt2444 >> 14) + (arg2 - arg0.anInt2436) / 2;
		} else {
			arg0.anInt2460 = arg2 - (arg0.anInt2444 * arg2 >> 14) - arg0.anInt2436;
		}
		if (arg0.aByte43 == 0) {
			arg0.anInt2448 = arg0.anInt2507;
		} else if (arg0.aByte43 == 1) {
			arg0.anInt2448 = (arg1 - arg0.anInt2495) / 2 + arg0.anInt2507;
		} else if (arg0.aByte43 == 2) {
			arg0.anInt2448 = arg1 - arg0.anInt2507 - arg0.anInt2495;
		} else if (arg0.aByte43 == 3) {
			arg0.anInt2448 = arg1 * arg0.anInt2507 >> 14;
		} else if (arg0.aByte43 == 4) {
			arg0.anInt2448 = (arg1 - arg0.anInt2495) / 2 + (arg0.anInt2507 * arg1 >> 14);
		} else {
			arg0.anInt2448 = arg1 - (arg0.anInt2507 * arg1 >> 14) - arg0.anInt2495;
		}
		if (!Static464.aBoolean176 || Static53.method860(arg0).anInt7337 == 0 && arg0.anInt2494 != 0) {
			return;
		}
		if (arg0.anInt2460 < 0) {
			arg0.anInt2460 = 0;
		} else if (arg0.anInt2460 + arg0.anInt2436 > arg2) {
			arg0.anInt2460 = arg2 - arg0.anInt2436;
		}
		if (arg0.anInt2448 < 0) {
			arg0.anInt2448 = 0;
		} else if (arg1 < arg0.anInt2495 + arg0.anInt2448) {
			arg0.anInt2448 = arg1 - arg0.anInt2495;
		}
	}
}
