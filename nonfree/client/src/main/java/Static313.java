import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!q;")
	public static Class81 aClass81_5;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	public static int anInt6277 = -1;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
	public static int anInt6278 = -1;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public static void method4935(@OriginalArg(1) int arg0) {
		Static465.anInt8867 = -1;
		Static555.anInt10135 = arg0;
		Static465.anInt8867 = -1;
		Static279.method4473();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZII)Z")
	public static boolean method4936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static476.method6917(arg1, arg0) & Static405.method6140(arg1, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)I")
	public static int method4937(@OriginalArg(1) int arg0) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(160) int local160 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		@Pc(170) int local170 = (int) (local68 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + ((local160 >> 2 & 0x3F) << 10) + (local165 >> 5 << 7);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4938(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static270.anInt5671; local11++) {
			if (arg0.equalsIgnoreCase(Static94.aStringArray7[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIB)I")
	public static int method4939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 & 0x3;
		if (local15 == 0) {
			return arg1;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
