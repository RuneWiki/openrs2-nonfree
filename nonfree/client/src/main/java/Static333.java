import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public static int anInt5793;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public static int anInt5795;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "S")
	public static short aShort68 = 205;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!pp;IIIII)V")
	public static void method4650(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2244 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub5Array2[local4] != null) {
				arg0.anInt2244++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt2244; local22++) {
			@Pc(31) long local31 = Static242.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class124 local41;
			while (local31 != 0L) {
				local41 = Static110.aClass124Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub5_1 == arg0.aClass1_Sub5Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static242.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static110.aClass124Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub5_1 == arg0.aClass1_Sub5Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt2244 - 1; local93++) {
				arg0.aClass1_Sub5Array2[local93] = arg0.aClass1_Sub5Array2[local93 + 1];
			}
			arg0.anInt2244--;
		}
	}
}
