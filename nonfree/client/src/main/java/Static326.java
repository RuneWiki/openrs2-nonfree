import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public static int anInt5607 = 0;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public static int anInt5609 = 0;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "[S")
	public static final short[] aShortArray86 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZI)V")
	public static void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		if (arg2 <= arg0) {
			for (local11 = arg2; local11 < arg0; local11++) {
				Static62.anIntArrayArray7[local11][arg1] = arg3;
			}
		} else {
			for (local11 = arg0; local11 < arg2; local11++) {
				Static62.anIntArrayArray7[local11][arg1] = arg3;
			}
		}
	}
}
