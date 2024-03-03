import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBIII)V", line = 3)
	public static void method2793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Class25_Sub1.anInt675 <= arg3 && arg3 <= Class61.anInt1835) {
			@Pc(19) int local19 = Static24.method861(Class2_Sub40.anInt6819, arg1, Class2_Sub20.anInt2951);
			@Pc(25) int local25 = Static24.method861(Class2_Sub40.anInt6819, arg0, Class2_Sub20.anInt2951);
			Static338.method6091(local25, local19, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!hc;III)V", line = 122)
	public static void method2798(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static48.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7100 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub26_Sub1Array3[arg0.anInt7100++] = Static283.aClass2_Sub26_Sub1Array2[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt7100; local21 < 4; local21++) {
			arg0.aClass2_Sub26_Sub1Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V", line = 203)
	public static void method2800() {
		@Pc(9) int[] local9 = new int[Static290.aClass107_2.anInt2776];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static290.aClass107_2.anInt2776; local13++) {
			@Pc(20) Class188 local20 = Static290.aClass107_2.method2761(local13);
			if (local20.anInt5195 >= 0 || local20.anInt5239 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static12.anIntArray15 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static12.anIntArray15[local52] = local9[local52];
		}
	}
}
