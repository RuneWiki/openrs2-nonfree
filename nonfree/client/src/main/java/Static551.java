import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static final int anInt9229 = Static700.method9156(1600);

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)I")
	public static int method7772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & 0x3;
		if (local9 == 0) {
			return arg1;
		} else if (local9 == 1) {
			return 4095 - arg2;
		} else if (local9 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(FIFF)I")
	public static int method7774(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(40) float local40 = arg2 < 0.0F ? -arg2 : arg2;
		if (local20 < local30 && local30 > local40) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local40 > local20 && local40 > local30) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
