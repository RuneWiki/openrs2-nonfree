import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Lclient!gw;")
	public static Class1_Sub4_Sub2 aClass1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
	public static final int[] anIntArray748 = new int[14];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!lp;III)V")
	public static void method7398(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static8.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt2977 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub5Array3[arg0.anInt2977++] = Static102.aClass108Array1[local21 - 1].aClass1_Sub5_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt2977; local21 < 4; local21++) {
			arg0.aClass1_Sub5Array3[local21] = null;
		}
	}
}
