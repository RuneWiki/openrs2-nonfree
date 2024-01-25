import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
	public static int anInt8186;

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lclient!mm;")
	public static final Class240 aClass240_4 = new Class240("LIVE", 0);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)I")
	public static int method7059(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local74 < 0.5D) {
				local68 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local66 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local66 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local66 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local66 /= 6.0D;
		@Pc(168) int local168 = (int) (local66 * 256.0D);
		@Pc(173) int local173 = (int) (local68 * 256.0D);
		@Pc(178) int local178 = (int) (local74 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local178 < 0) {
			local178 = 0;
		} else if (local178 > 255) {
			local178 = 255;
		}
		if (local178 > 243) {
			local173 >>= 0x4;
		} else if (local178 > 217) {
			local173 >>= 0x3;
		} else if (local178 > 192) {
			local173 >>= 0x2;
		} else if (local178 > 179) {
			local173 >>= 0x1;
		}
		return (local178 >> 1) + ((local168 >> 2 & 0x3F) << 10) + (local173 >> 5 << 7);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	public static void method7064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static7.anInt102) {
			Static382.anIntArray368 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static382.anIntArray368[local17] = (local17 << 12) / arg1;
			}
			Static7.anInt102 = arg1;
			Static517.anInt8205 = arg1 - 1;
			Static373.anInt6285 = arg1 * 32;
		}
		if (arg0 == Static122.anInt2020) {
			return;
		}
		if (Static7.anInt102 == arg0) {
			Static458.anIntArray438 = Static382.anIntArray368;
		} else {
			Static458.anIntArray438 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static458.anIntArray438[local17] = (local17 << 12) / arg0;
			}
		}
		Static122.anInt2020 = arg0;
		Static652.anInt10663 = arg0 - 1;
	}
}
