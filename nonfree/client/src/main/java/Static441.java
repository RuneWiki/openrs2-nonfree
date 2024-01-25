import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!kr;")
	public static Class171 aClass171_137;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_111 = new Class306("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_325 = new Class296(4, 4);

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	public static final int[] anIntArray719 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I")
	public static int method6334(@OriginalArg(0) int arg0) {
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
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(161) int local161 = (int) (local62 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(184) int local184 = (int) (local68 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local184 > 243) {
			local161 >>= 0x4;
		} else if (local184 > 217) {
			local161 >>= 0x3;
		} else if (local184 > 192) {
			local161 >>= 0x2;
		} else if (local184 > 179) {
			local161 >>= 0x1;
		}
		return (local184 >> 1) + ((local156 >> 2 & 0x3F) << 10) + (local161 >> 5 << 7);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method6336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
