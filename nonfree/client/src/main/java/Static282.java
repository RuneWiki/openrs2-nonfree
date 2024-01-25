import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!mi;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
	public static final int[] anIntArray337 = new int[13];

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public static int method4272(@OriginalArg(0) int arg0) {
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
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(164) int local164 = (int) (local60 * 256.0D);
		@Pc(169) int local169 = (int) (local62 * 256.0D);
		@Pc(174) int local174 = (int) (local68 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local174 < 0) {
			local174 = 0;
		} else if (local174 > 255) {
			local174 = 255;
		}
		if (local174 > 243) {
			local169 >>= 0x4;
		} else if (local174 > 217) {
			local169 >>= 0x3;
		} else if (local174 > 192) {
			local169 >>= 0x2;
		} else if (local174 > 179) {
			local169 >>= 0x1;
		}
		return ((local164 >> 2 & 0x3F) << 10) - (-(local169 >> 5 << 7) - (local174 >> 1));
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IF[BFFIFIIIILclient!dd;F)V")
	public static void method4273(@OriginalArg(1) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(9) int arg5, @OriginalArg(11) Class45 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static150.method2599(arg6, arg7, local7, arg4, arg5, arg0, arg1, arg2, arg3);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ru;III)V")
	public static void method4274(@OriginalArg(0) Class219 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static418.aClass219ArrayArray1[arg1][arg2] = arg0;
	}
}
