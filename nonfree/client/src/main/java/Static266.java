import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	public static final int anInt4982 = 1406;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[I")
	public static final int[] anIntArray319 = new int[4];

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_61 = new Class215(30, 3);

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_62 = new Class215(42, -1);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
	public static int method3825(@OriginalArg(1) int arg0) {
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
		@Pc(63) double local63 = (double) 0;
		@Pc(69) double local69 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local69 < 0.5D) {
				local63 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local69 >= 0.5D) {
				local63 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local63 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(180) int local180 = (int) (local69 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local162 >>= 0x4;
		} else if (local180 > 217) {
			local162 >>= 0x3;
		} else if (local180 > 192) {
			local162 >>= 0x2;
		} else if (local180 > 179) {
			local162 >>= 0x1;
		}
		return (local162 >> 5 << 7) + ((local157 & 0xFF) >> 2 << 10) + (local180 >> 1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static354.anInt6186 && Static208.anInt2656 >= arg2 && arg0 >= Static376.anInt6287 && arg5 <= Static168.anInt3256) {
			Static12.method130(arg0, arg2, arg6, arg3, arg1, arg5, arg4);
		} else {
			Static386.method3236(arg3, arg1, arg4, arg0, arg6, arg2, arg5);
		}
	}
}
