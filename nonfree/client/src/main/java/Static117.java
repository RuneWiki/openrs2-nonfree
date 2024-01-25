import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIJ)V")
	public static void method1726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static563.method7723(local17, 0, arg1, 0, 0, true, arg0, local10);
			return;
		}
		@Pc(40) Class191 local40 = Static319.aClass141_4.method2971(local24);
		@Pc(48) int local48;
		@Pc(51) int local51;
		if (local17 == 0 || local17 == 2) {
			local48 = local40.anInt4814;
			local51 = local40.anInt4817;
		} else {
			local48 = local40.anInt4817;
			local51 = local40.anInt4814;
		}
		@Pc(62) int local62 = local40.anInt4796;
		if (local17 != 0) {
			local62 = (local62 << local17 & 0xF) + (local62 >> 4 - local17);
		}
		Static563.method7723(0, local51, arg1, local48, local62, true, arg0, 0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
	public static int method1727(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(155) int local155 = (int) (local60 * 256.0D);
		@Pc(160) int local160 = (int) (local62 * 256.0D);
		if (local160 < 0) {
			local160 = 0;
		} else if (local160 > 255) {
			local160 = 255;
		}
		@Pc(179) int local179 = (int) (local68 * 256.0D);
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local160 >>= 0x4;
		} else if (local179 > 217) {
			local160 >>= 0x3;
		} else if (local179 > 192) {
			local160 >>= 0x2;
		} else if (local179 > 179) {
			local160 >>= 0x1;
		}
		return ((local155 >> 2 & 0x3F) << 10) + (local160 >> 5 << 7) + (local179 >> 1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
	public static boolean method1728() {
		return Static324.anInt5145 >= 1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FI)F")
	public static float method1729(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
