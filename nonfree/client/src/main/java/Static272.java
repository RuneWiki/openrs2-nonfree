import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_85 = new Class231("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ot;III)V")
	public static void method3911(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static254.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt164 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub4Array2[arg0.anInt164++] = Static330.aClass38Array1[local21 - 1].aClass2_Sub4_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt164; local21 < 4; local21++) {
			arg0.aClass2_Sub4Array2[local21] = null;
		}
	}
}
