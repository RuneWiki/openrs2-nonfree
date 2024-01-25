import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt2593;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public static int anInt2599;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
	public static final int[] anIntArray231 = new int[50];

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_50 = new Class93("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!on;")
	public static Class146 aClass146_9 = null;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public static int anInt2601 = -1;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray79 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IB)[I")
	public static int[] method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(13) int[] local13 = new int[1152];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 36; local21++) {
				@Pc(27) int local27 = arg1[local15];
				if (local27 == 0) {
					if (local21 > 0 && arg1[local15 - 1] != 0) {
						local27 = arg0;
					} else if (local17 > 0 && arg1[local15 - 36] != 0) {
						local27 = arg0;
					} else if (local21 < 35 && arg1[local15 + 1] != 0) {
						local27 = arg0;
					} else if (local17 < 31 && arg1[local15 + 36] != 0) {
						local27 = arg0;
					}
				}
				local13[local15++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static127.anInt1566 / (float) Static127.anInt1564;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = arg1;
		if (local13 < 1.0F) {
			local17 = (int) (local13 * (float) arg0);
		} else {
			local15 = (int) ((float) arg1 / local13);
		}
		@Pc(44) int local44 = arg2 - (arg0 - local15) / 2;
		@Pc(53) int local53 = arg3 - (arg1 - local17) / 2;
		Static210.anInt4066 = local44 * Static127.anInt1564 / local15;
		Static2.anInt62 = -1;
		anInt2601 = -1;
		Static109.anInt2412 = Static127.anInt1566 - Static127.anInt1566 * local53 / local17;
		Static19.method675();
	}
}
