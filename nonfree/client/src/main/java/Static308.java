import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Z")
	public static boolean aBoolean416 = true;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JB)V")
	public static void method5022(@OriginalArg(0) long arg0) {
		@Pc(17) int local17 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 + Static378.anInt4759;
		@Pc(22) int local22 = Static312.anInt5705 + Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798;
		if (Static74.anInt1635 - local17 < -500 || Static74.anInt1635 - local17 > 500 || Static211.anInt4264 - local22 < -500 || Static211.anInt4264 - local22 > 500) {
			Static211.anInt4264 = local22;
			Static74.anInt1635 = local17;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (local17 != Static74.anInt1635) {
			local60 = local17 - Static74.anInt1635;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local68 < local60) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local68 > local60) {
				local68 = local60;
			}
			Static74.anInt1635 += local68;
		}
		if (!Static260.aBoolean369) {
			Static323.aFloat71 += Static106.aFloat8 * (float) arg0 / 6.0F;
			Static350.aFloat74 += (float) arg0 * Static335.aFloat72 / 6.0F;
		}
		if (local22 != Static211.anInt4264) {
			local60 = local22 - Static211.anInt4264;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 > 0) {
				if (local68 == 0) {
					local68 = 1;
				} else if (local60 < local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = -1;
			} else if (local60 > local68) {
				local68 = local60;
			}
			Static211.anInt4264 += local68;
		}
		Static238.method4241();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BIIIII)V")
	public static void method5023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg0; local3 <= arg4; local3++) {
			Static307.method5019(Static152.anIntArrayArray30[local3], arg1, arg2, arg3);
		}
	}
}
