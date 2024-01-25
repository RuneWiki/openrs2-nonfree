import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
	public static final int[] anIntArray651 = new int[1000];

	@OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
	public static final int[] anIntArray652 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt7267 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!cg;IIIII)V")
	public static void method5939(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5265 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub31Array3[local4] != null) {
				arg0.anInt5265++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5265; local22++) {
			@Pc(31) long local31 = Static61.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class243 local41;
			while (local31 != 0L) {
				local41 = Static124.aClass243Array5[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub31_2 == arg0.aClass1_Sub31Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static61.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static124.aClass243Array5[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub31_2 == arg0.aClass1_Sub31Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5265 - 1; local93++) {
				arg0.aClass1_Sub31Array3[local93] = arg0.aClass1_Sub31Array3[local93 + 1];
			}
			arg0.anInt5265--;
		}
	}
}
