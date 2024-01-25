import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
	public static int anInt10583;

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
	public static int anInt10591;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "[I")
	public static final int[] anIntArray594 = new int[5];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
	public static boolean method8850(@OriginalArg(1) int arg0) {
		if (arg0 == 6 || arg0 == 44 || arg0 == 59 || arg0 == 48 || arg0 == 1006 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	public static int method8857() {
		@Pc(21) byte local21;
		if (Static719.anInt11246 < 96) {
			local21 = 1;
			Static209.method3106();
		} else {
			@Pc(29) int local29 = Static209.method3109(91);
			if (local29 <= 100) {
				Static6.method104();
				local21 = 4;
			} else if (local29 <= 500) {
				local21 = 3;
				Static67.method820();
			} else if (local29 > 1000) {
				local21 = 1;
				Static209.method3106();
			} else {
				local21 = 2;
				Static413.method6147();
			}
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 0) {
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 0);
			Static718.method9389(0, false);
		}
		Static328.method4885();
		return local21;
	}
}
