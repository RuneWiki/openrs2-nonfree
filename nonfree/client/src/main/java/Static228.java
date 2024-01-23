import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	public static int anInt4842;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "[S")
	public static short[] aShortArray83 = new short[256];

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "[I")
	public static int[] anIntArray446 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J")
	public static long method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt45; local13++) {
			@Pc(22) Class7 local22 = local7.aClass7Array1[local13];
			if ((local22.aLong7 >> 29 & 0x3L) == 2L && local22.anInt214 == arg1 && local22.anInt220 == arg2) {
				return local22.aLong7;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V")
	public static void method3617(@OriginalArg(0) boolean arg0) {
		if (Static121.aBoolean159 != arg0) {
			Static121.aBoolean159 = arg0;
			Static124.method2038();
		}
	}
}
