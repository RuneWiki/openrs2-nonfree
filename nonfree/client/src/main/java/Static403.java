import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "[Lclient!sd;")
	public static Class219[] aClass219Array1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "J")
	public static long aLong223 = 0L;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method5514(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static264.method3657(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg1 != arg0.charAt(local30); local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)I")
	public static int method5515(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
	public static int method5516(@OriginalArg(1) int arg0) {
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
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
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
		@Pc(185) int local185 = (int) (local68 * 256.0D);
		if (local185 < 0) {
			local185 = 0;
		} else if (local185 > 255) {
			local185 = 255;
		}
		if (local185 > 243) {
			local161 >>= 0x4;
		} else if (local185 > 217) {
			local161 >>= 0x3;
		} else if (local185 > 192) {
			local161 >>= 0x2;
		} else if (local185 > 179) {
			local161 >>= 0x1;
		}
		return (local161 >> 5 << 7) + ((local156 & 0xFF) >> 2 << 10) + (local185 >> 1);
	}
}
