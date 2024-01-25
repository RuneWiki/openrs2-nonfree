import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_199 = new Class40(102, -1);

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public static int anInt9593 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I")
	public static int method7826(@OriginalArg(1) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local65 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local65 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(159) int local159 = (int) (local65 * 256.0D);
		@Pc(164) int local164 = (int) (local67 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(185) int local185 = (int) (local73 * 256.0D);
		if (local185 < 0) {
			local185 = 0;
		} else if (local185 > 255) {
			local185 = 255;
		}
		if (local185 > 243) {
			local164 >>= 0x4;
		} else if (local185 > 217) {
			local164 >>= 0x3;
		} else if (local185 > 192) {
			local164 >>= 0x2;
		} else if (local185 > 179) {
			local164 >>= 0x1;
		}
		return (local185 >> 1) + ((local159 & 0xFF) >> 2 << 10) + (local164 >> 5 << 7);
	}
}
