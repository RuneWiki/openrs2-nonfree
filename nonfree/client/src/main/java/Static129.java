import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "[I")
	public static final int[] anIntArray213 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	public static int anInt2810 = -1;

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)I")
	public static int method2253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(III)I")
	public static int method2254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static46.anIntArray458[arg0 & 0x3] : 256;
	}
}
