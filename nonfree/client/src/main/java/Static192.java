import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!s;")
	public static final Class217 aClass217_86 = new Class217(47, 8);

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[S")
	public static short[] aShortArray56 = new short[256];

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public static int anInt3853 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
	public static int method3058(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
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
		@Pc(155) int local155 = (int) (local60 * 256.0D);
		@Pc(160) int local160 = (int) (local62 * 256.0D);
		@Pc(165) int local165 = (int) (local68 * 256.0D);
		if (local160 < 0) {
			local160 = 0;
		} else if (local160 > 255) {
			local160 = 255;
		}
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local165 > 243) {
			local160 >>= 0x4;
		} else if (local165 > 217) {
			local160 >>= 0x3;
		} else if (local165 > 192) {
			local160 >>= 0x2;
		} else if (local165 > 179) {
			local160 >>= 0x1;
		}
		return (local160 >> 5 << 7) + (((local155 >> 2 & 0x3F) << 10) + (local165 >> 1));
	}
}
