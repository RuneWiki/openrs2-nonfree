import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!cga;III)V")
	public static void method1781(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static140.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt29 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub7Array2[arg0.anInt29++] = Static149.aClass178Array1[local21 - 1].aClass6_Sub7_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt29; local21 < 4; local21++) {
			arg0.aClass6_Sub7Array2[local21] = null;
		}
	}
}
