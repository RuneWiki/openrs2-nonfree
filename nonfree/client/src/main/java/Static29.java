import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_6 = new Class242(48, 11);

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!qi;")
	public static final Class208 aClass208_2 = new Class208(16);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
	public static int method416(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(178) int local178 = (int) (local68 * 256.0D);
		if (local178 < 0) {
			local178 = 0;
		} else if (local178 > 255) {
			local178 = 255;
		}
		if (local178 > 243) {
			local162 >>= 0x4;
		} else if (local178 > 217) {
			local162 >>= 0x3;
		} else if (local178 > 192) {
			local162 >>= 0x2;
		} else if (local178 > 179) {
			local162 >>= 0x1;
		}
		return ((local157 >> 2 & 0x3F) << 10) - (-(local162 >> 5 << 7) - (local178 >> 1));
	}
}
