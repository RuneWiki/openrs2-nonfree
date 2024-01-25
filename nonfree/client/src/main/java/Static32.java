import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public static int anInt510;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!g;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFIBF)F")
	public static float method458(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static584.aFloatArrayArray16[arg2];
		return local12[2] * arg1 + local12[0] * arg3 + arg0 * local12[1];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)I")
	public static int method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class200.anIntArray338[arg1 * 8192 / arg0] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (local21 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method462() {
		if (!Static64.aBoolean74) {
			Static601.aFloat206 += (12.0F - Static601.aFloat206) / 2.0F;
			Static64.aBoolean74 = true;
			Static260.aBoolean411 = true;
		}
	}
}
