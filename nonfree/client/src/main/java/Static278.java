import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "D")
	public static double aDouble19 = -1.0D;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "J")
	public static long aLong133 = 0L;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!ha;I)Lclient!tf;")
	public static Class17 method4063(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(10) Class4_Sub34 local10 = (Class4_Sub34) Static255.aClass66_18.method1994((long) arg0);
		if (local10 != null) {
			@Pc(25) Class4_Sub6_Sub3 local25 = local10.aClass105_Sub1_1.method2523();
			local10.aBoolean432 = true;
			if (local25 != null) {
				return local25.method2861(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method4064(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local65 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local65 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(162) int local162 = (int) (local65 * 256.0D);
		@Pc(167) int local167 = (int) (local67 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(186) int local186 = (int) (local73 * 256.0D);
		if (local186 < 0) {
			local186 = 0;
		} else if (local186 > 255) {
			local186 = 255;
		}
		if (local186 > 243) {
			local167 >>= 0x4;
		} else if (local186 > 217) {
			local167 >>= 0x3;
		} else if (local186 > 192) {
			local167 >>= 0x2;
		} else if (local186 > 179) {
			local167 >>= 0x1;
		}
		return (local167 >> 5 << 7) + ((local162 >> 2 & 0x3F) << 10) + (local186 >> 1);
	}
}
