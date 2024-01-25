import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!k", name = "T", descriptor = "[I")
	public static int[] anIntArray645;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "I")
	public static int anInt3311 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZB[Lclient!ae;)V")
	public static void method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class4[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class4 local9 = arg4[local3];
			if (local9 != null && arg2 == local9.anInt88) {
				Static186.method3210(arg1, arg0, arg3, local9);
				Static82.method1235(arg0, arg1, local9);
				if (local9.anInt53 > local9.anInt68 - local9.anInt101) {
					local9.anInt53 = local9.anInt68 - local9.anInt101;
				}
				if (local9.anInt53 < 0) {
					local9.anInt53 = 0;
				}
				if (local9.anInt78 > local9.anInt72 - local9.anInt113) {
					local9.anInt78 = local9.anInt72 - local9.anInt113;
				}
				if (local9.anInt78 < 0) {
					local9.anInt78 = 0;
				}
				if (local9.anInt125 == 0) {
					Static35.method640(local9, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method3060() {
		Static241.aClass160_37.method3595();
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I")
	public static int method3061(@OriginalArg(1) int arg0) {
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
		if (local46 < local30) {
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
				local60 = (local23 - local30) / (local46 - local32);
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
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local62 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(186) int local186 = (int) (local68 * 256.0D);
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
		return (local186 >> 1) + (local167 >> 5 << 7) + ((local162 >> 2 & 0x3F) << 10);
	}
}
