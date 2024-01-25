import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
	public static int method1858(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local30 > local51) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local32) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local51 + local32);
			}
			if (local51 == local14) {
				local65 = (local23 - local30) / (-local32 + local51);
			} else if (local23 == local51) {
				local65 = (local30 - local14) / (local51 - local32) + 2.0D;
			} else if (local30 == local51) {
				local65 = (local14 - local23) / (-local32 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / ((2.0D - local51) - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(159) int local159 = (int) (local65 * 256.0D);
		@Pc(164) int local164 = (int) (local67 * 256.0D);
		@Pc(169) int local169 = (int) (local73 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local169 > 243) {
			local164 >>= 0x4;
		} else if (local169 > 217) {
			local164 >>= 0x3;
		} else if (local169 > 192) {
			local164 >>= 0x2;
		} else if (local169 > 179) {
			local164 >>= 0x1;
		}
		return ((local159 >> 2 & 0x3F) << 10) - (-(local164 >> 5 << 7) - (local169 >> 1));
	}
}
