import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public static int anInt7273 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
	public static void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static490.anInt1922 / (float) Static490.anInt1919;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg0 - local11) / 2;
		@Pc(49) int local49 = arg1 - (arg3 - local13) / 2;
		Static26.anInt444 = -1;
		Static441.anInt3925 = local40 * Static490.anInt1919 / local11;
		Static30.anInt535 = Static490.anInt1922 - local49 * Static490.anInt1922 / local13;
		Static175.anInt3184 = -1;
		Static563.method7799();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIBI)I")
	public static int method5813(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg2; local9++) {
			local7 = local7 >>> 8 ^ Class101_Sub2_Sub1.anIntArray500[(local7 ^ arg0[local9]) & 0xFF];
		}
		return ~local7;
	}
}
