import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public static int anInt6065 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!kg;III)V")
	public static void method5137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static245.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt2369 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub2Array2[arg0.anInt2369++] = Static447.aClass62Array1[local21 - 1].aClass1_Sub2_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt2369; local21 < 4; local21++) {
			arg0.aClass1_Sub2Array2[local21] = null;
		}
	}
}
