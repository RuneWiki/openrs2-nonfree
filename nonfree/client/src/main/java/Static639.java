import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "[J")
	public static long[] aLongArray21;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
	public static int anInt10531 = -50;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "[I")
	public static final int[] anIntArray557 = new int[200];

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qba;)V")
	public static void method8630(@OriginalArg(1) Class34_Sub1_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt9685 - Static122.anInt2190;
		@Pc(23) int local23 = arg0.anInt9643 * 512 + arg0.method7866() * 256;
		@Pc(35) int local35 = arg0.anInt9656 * 512 + arg0.method7866() * 256;
		arg0.anInt9614 += (local23 - arg0.anInt9614) / local9;
		arg0.anInt9619 += (local35 - arg0.anInt9619) / local9;
		arg0.anInt9704 = 0;
		if (arg0.anInt9645 == 0) {
			arg0.method7860(8192);
		}
		if (arg0.anInt9645 == 1) {
			arg0.method7860(12288);
		}
		if (arg0.anInt9645 == 2) {
			arg0.method7860(0);
		}
		if (arg0.anInt9645 == 3) {
			arg0.method7860(4096);
		}
	}
}
