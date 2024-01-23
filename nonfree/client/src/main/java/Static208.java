import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
	public static int anInt4650;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
	public static boolean method3215(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static48.aShortArray34[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1003;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
	public static int method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static102.aByteArrayArrayArray7[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static102.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)Lclient!i;")
	public static Class41 method3217(@OriginalArg(1) long arg0) {
		return Static213.method3263(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!nb;ZII)Lclient!rc;")
	public static Class2_Sub2_Sub16 method3219(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static43.method900(arg0, arg1, arg2) ? Static179.method2863() : null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
	public static int method3220(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local23;
		if (local23 < local14) {
			local37 = local14;
		}
		@Pc(45) double local45 = 0.0D;
		@Pc(47) double local47 = local23;
		if (local14 < local23) {
			local47 = local14;
		}
		if (local37 < local35) {
			local37 = local35;
		}
		if (local47 > local35) {
			local47 = local35;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local47 + local37) / 2.0D;
		if (local47 != local37) {
			if (local73 < 0.5D) {
				local45 = (local37 - local47) / (local37 + local47);
			}
			if (local23 == local37) {
				local67 = (local14 - local35) / (local37 - local47);
			} else if (local37 == local14) {
				local67 = (local35 - local23) / (local37 - local47) + 2.0D;
			} else if (local35 == local37) {
				local67 = (local23 - local14) / (-local47 + local37) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local45 = (local37 - local47) / (2.0D - local47 - local37);
			}
		}
		local67 /= 6.0D;
		@Pc(161) int local161 = (int) (local45 * 256.0D);
		@Pc(166) int local166 = (int) (local67 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(185) int local185 = (int) (local73 * 256.0D);
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
		return (local161 >> 5 << 7) + (local166 >> 2 << 10) + (local185 >> 1);
	}
}
