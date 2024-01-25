import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method7358() {
		Static106.aClass62_11.method1683();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
	public static int method7359(@OriginalArg(1) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local65 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local65 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(160) int local160 = (int) (local65 * 256.0D);
		@Pc(165) int local165 = (int) (local67 * 256.0D);
		@Pc(170) int local170 = (int) (local73 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + ((local160 & 0xFF) >> 2 << 10) + (local165 >> 5 << 7);
	}
}
