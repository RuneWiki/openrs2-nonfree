import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_80 = new Class208(71, 8);

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_164 = new Class268(23, 28);

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
	public static final int[] anIntArray568 = new int[8];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I")
	public static int method7904(@OriginalArg(1) int arg0) {
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
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(161) int local161 = (int) (local60 * 256.0D);
		@Pc(166) int local166 = (int) (local62 * 256.0D);
		@Pc(171) int local171 = (int) (local68 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		if (local171 < 0) {
			local171 = 0;
		} else if (local171 > 255) {
			local171 = 255;
		}
		if (local171 > 243) {
			local166 >>= 0x4;
		} else if (local171 > 217) {
			local166 >>= 0x3;
		} else if (local171 > 192) {
			local166 >>= 0x2;
		} else if (local171 > 179) {
			local166 >>= 0x1;
		}
		return ((local161 >> 2 & 0x3F) << 10) + (local166 >> 5 << 7) + (local171 >> 1);
	}
}
