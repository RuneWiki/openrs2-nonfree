import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt167;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString7 = "slide:";

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
	public static int method121(@OriginalArg(0) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local32 + local46) / 2.0D;
		@Pc(74) double local74 = 0.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local74 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local66 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local66 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local66 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local74 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local66 /= 6.0D;
		@Pc(163) int local163 = (int) (local66 * 256.0D);
		@Pc(168) int local168 = (int) (local74 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(190) int local190 = (int) (local72 * 256.0D);
		if (local190 < 0) {
			local190 = 0;
		} else if (local190 > 255) {
			local190 = 255;
		}
		if (local190 > 243) {
			local168 >>= 0x4;
		} else if (local190 > 217) {
			local168 >>= 0x3;
		} else if (local190 > 192) {
			local168 >>= 0x2;
		} else if (local190 > 179) {
			local168 >>= 0x1;
		}
		return (local168 >> 5 << 7) + (local163 >> 2 << 10) + (local190 >> 1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V")
	public static void method122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static123.aClass48Array3[0].method3616(arg3, arg2);
		@Pc(20) int local20 = arg0 * (arg0 - 32) / arg4;
		Static123.aClass48Array3[1].method3616(arg3, arg2 + arg0 - 16);
		if (local20 < 8) {
			local20 = 8;
		}
		@Pc(54) int local54 = (arg0 - local20 - 32) * arg1 / (arg4 - arg0);
		if (!Static240.aBoolean369) {
			Static213.method3362(arg3, arg2 + 16, 16, arg0 - 32, Static79.anInt2913);
			Static213.method3362(arg3, arg2 + local54 + 16, 16, local20, Static282.anInt5852);
			Static213.method3363(arg3, local54 + arg2 + 16, local20, Static27.anInt597);
			Static213.method3363(arg3 + 1, arg2 - -16 + local54, local20, Static27.anInt597);
			Static213.method3380(arg3, arg2 + local54 + 16, 16, Static27.anInt597);
			Static213.method3380(arg3, arg2 + local54 + 17, 16, Static27.anInt597);
			Static213.method3363(arg3 + 15, local54 + arg2 - -16, local20, Static99.anInt1901);
			Static213.method3363(arg3 + 14, arg2 + 17 + local54, local20 - 1, Static99.anInt1901);
			Static213.method3380(arg3, local20 + local54 + arg2 + 15, 16, Static99.anInt1901);
			Static213.method3380(arg3 + 1, local54 + 14 + (arg2 - -local20), 15, Static99.anInt1901);
			return;
		}
		Static50.method866(arg3, arg2 + 16, 16, arg0 - 32, Static79.anInt2913);
		Static50.method866(arg3, local54 + arg2 + 16, 16, local20, Static282.anInt5852);
		Static50.method860(arg3, arg2 + local54 + 16, local20, Static27.anInt597);
		Static50.method860(arg3 + 1, local54 + (arg2 - -16), local20, Static27.anInt597);
		Static50.method857(arg3, local54 + arg2 + 16, 16, Static27.anInt597);
		Static50.method857(arg3, local54 + arg2 + 17, 16, Static27.anInt597);
		Static50.method860(arg3 + 15, local54 + (arg2 - -16), local20, Static99.anInt1901);
		Static50.method860(arg3 + 14, local54 + 17 + arg2, local20 - 1, Static99.anInt1901);
		Static50.method857(arg3, local20 + local54 + arg2 + 15, 16, Static99.anInt1901);
		Static50.method857(arg3 + 1, local20 + arg2 + 14 + local54, 15, Static99.anInt1901);
	}
}
