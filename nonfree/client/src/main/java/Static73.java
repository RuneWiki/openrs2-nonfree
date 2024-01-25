import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Lclient!ct;")
	public static Class30 aClass30_18;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)I")
	public static int method1611(@OriginalArg(0) int arg0) {
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
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(158) int local158 = (int) (local60 * 256.0D);
		@Pc(163) int local163 = (int) (local62 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(182) int local182 = (int) (local68 * 256.0D);
		if (local182 < 0) {
			local182 = 0;
		} else if (local182 > 255) {
			local182 = 255;
		}
		if (local182 > 243) {
			local163 >>= 0x4;
		} else if (local182 > 217) {
			local163 >>= 0x3;
		} else if (local182 > 192) {
			local163 >>= 0x2;
		} else if (local182 > 179) {
			local163 >>= 0x1;
		}
		return (local182 >> 1) + (local163 >> 5 << 7) + ((local158 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIII)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static272.method4850(arg2)) {
			Static279.method4981(Static341.aClass112ArrayArray1[arg2], -1, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I")
	public static int method1617(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
