import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
	public static int anInt5214;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "S")
	public static short aShort79 = 1;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "[I")
	public static final int[] anIntArray452 = new int[500];

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "[Lclient!ae;")
	public static Class7_Sub1[] aClass7_Sub1Array4 = new Class7_Sub1[0];

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IFFF)I")
	public static int method4418(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local21 > local12 && local21 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local35 > local21) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
