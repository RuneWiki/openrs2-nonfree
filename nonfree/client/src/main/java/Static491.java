import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "F")
	public static float aFloat269;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public static int anInt9416 = 0;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "[S")
	public static final short[] aShortArray198 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "J")
	public static long aLong282 = -1L;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!cm;)V")
	public static void method7788(@OriginalArg(1) Class3_Sub11 arg0) {
		if (!Static228.aBoolean342) {
			arg0.method7820();
			Static179.anInt4933--;
		}
	}

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
	public static void method7789() {
		@Pc(9) int[] local9 = new int[Static99.aClass96_7.anInt2928];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static99.aClass96_7.anInt2928; local13++) {
			@Pc(20) Class27 local20 = Static99.aClass96_7.method2508(local13);
			if (local20.anInt818 >= 0 || local20.anInt857 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static270.anIntArray474 = new int[local11];
		for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
			Static270.anIntArray474[local47] = local9[local47];
		}
	}
}
