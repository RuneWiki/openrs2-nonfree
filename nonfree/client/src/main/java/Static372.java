import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "Lclient!jq;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
	public static int anInt6489 = 64;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt6490 = -1;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	public static int anInt6492 = 0;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public static int anInt6493 = 0;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!qg;I)V")
	public static void method5237(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1) {
		if (Static345.anInt6219 >= 50 || (arg1 == null || arg1.anIntArrayArray81 == null || arg1.anIntArrayArray81.length <= arg0 || arg1.anIntArrayArray81[arg0] == null)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArrayArray81[arg0][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(44) int local44 = local30 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg1.anIntArrayArray81[arg0].length > 1) {
			local61 = (int) ((double) arg1.anIntArrayArray81[arg0].length * Math.random());
			if (local61 > 0) {
				local34 = arg1.anIntArrayArray81[arg0][local61];
			}
		}
		local61 = 256;
		if (arg1.anIntArray442 != null && arg1.anIntArray440 != null) {
			local61 = Static470.method6421(arg1.anIntArray442[arg0], arg1.anIntArray440[arg0]);
		}
		if (arg1.aBoolean532) {
			Static205.method3538(255, local61, 0, local34, local44, false);
		} else {
			Static15.method151(local34, local61, 0, local44, 255);
		}
	}
}
