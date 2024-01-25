import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!lla", name = "d", descriptor = "Lclient!nca;")
	public static Class254 aClass254_78;

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "Lclient!pga;")
	public static Class289 aClass289_6;

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "[I")
	public static final int[] anIntArray281 = new int[3];

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "(II)I")
	public static int method3238(@OriginalArg(1) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(61) double local61 = (double) 0;
		@Pc(63) double local63 = 0.0D;
		@Pc(69) double local69 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local69 < 0.5D) {
				local63 = (local46 - local32) / (local32 + local46);
			}
			if (local69 >= 0.5D) {
				local63 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local46 == local14) {
				local61 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local61 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local61 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local61 /= 6.0D;
		@Pc(161) int local161 = (int) (local61 * 256.0D);
		@Pc(166) int local166 = (int) (local63 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(186) int local186 = (int) (local69 * 256.0D);
		if (local186 < 0) {
			local186 = 0;
		} else if (local186 > 255) {
			local186 = 255;
		}
		if (local186 > 243) {
			local166 >>= 0x4;
		} else if (local186 > 217) {
			local166 >>= 0x3;
		} else if (local186 > 192) {
			local166 >>= 0x2;
		} else if (local186 > 179) {
			local166 >>= 0x1;
		}
		return (local186 >> 1) + ((local161 & 0xFF) >> 2 << 10) + (local166 >> 5 << 7);
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Lclient!jb;I)Ljava/lang/String;")
	public static String method3242(@OriginalArg(0) Class2_Sub6_Sub7 arg0) {
		return arg0.aString51 + " <col=ffffff>>";
	}
}
