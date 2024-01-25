import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!f;")
	public static Class46 aClass46_35;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	public static int anInt9160 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)I")
	public static int method7588(@OriginalArg(1) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
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
		@Pc(163) int local163 = (int) (local60 * 256.0D);
		@Pc(168) int local168 = (int) (local62 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(184) int local184 = (int) (local68 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local184 > 243) {
			local168 >>= 0x4;
		} else if (local184 > 217) {
			local168 >>= 0x3;
		} else if (local184 > 192) {
			local168 >>= 0x2;
		} else if (local184 > 179) {
			local168 >>= 0x1;
		}
		return (local168 >> 5 << 7) + ((local163 & 0xFF) >> 2 << 10) + (local184 >> 1);
	}
}
