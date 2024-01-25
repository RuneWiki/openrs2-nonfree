import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public static int anInt5641 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method4773() {
		@Pc(9) int local9 = Static428.anInt8060 * 512 + 256;
		@Pc(15) int local15 = Static293.anInt5938 * 512 + 256;
		@Pc(23) int local23 = Static501.method5641(local9, Static13.anInt231, local15) - Static57.anInt942;
		if (Static1.anInt84 < 100) {
			if (local9 > Static24.anInt387) {
				Static24.anInt387 += (local9 - Static24.anInt387) * Static1.anInt84 / 1000 + Static95.anInt2225;
				if (Static24.anInt387 > local9) {
					Static24.anInt387 = local9;
				}
			}
			if (local9 < Static24.anInt387) {
				Static24.anInt387 -= (Static24.anInt387 - local9) * Static1.anInt84 / 1000 + Static95.anInt2225;
				if (local9 > Static24.anInt387) {
					Static24.anInt387 = local9;
				}
			}
			if (Static209.anInt3913 < local23) {
				Static209.anInt3913 += Static95.anInt2225 + (local23 - Static209.anInt3913) * Static1.anInt84 / 1000;
				if (Static209.anInt3913 > local23) {
					Static209.anInt3913 = local23;
				}
			}
			if (local23 < Static209.anInt3913) {
				Static209.anInt3913 -= Static95.anInt2225 + (Static209.anInt3913 - local23) * Static1.anInt84 / 1000;
				if (Static209.anInt3913 < local23) {
					Static209.anInt3913 = local23;
				}
			}
			if (Static110.anInt2624 < local15) {
				Static110.anInt2624 += (local15 - Static110.anInt2624) * Static1.anInt84 / 1000 + Static95.anInt2225;
				if (local15 < Static110.anInt2624) {
					Static110.anInt2624 = local15;
				}
			}
			if (Static110.anInt2624 > local15) {
				Static110.anInt2624 -= Static95.anInt2225 + (Static110.anInt2624 - local15) * Static1.anInt84 / 1000;
				if (Static110.anInt2624 < local15) {
					Static110.anInt2624 = local15;
				}
			}
		} else {
			Static24.anInt387 = Static428.anInt8060 * 512 + 256;
			Static110.anInt2624 = Static293.anInt5938 * 512 + 256;
			Static209.anInt3913 = Static501.method5641(Static24.anInt387, Static13.anInt231, Static110.anInt2624) - Static57.anInt942;
		}
		local9 = Static465.anInt8650 * 512 + 256;
		local15 = Static58.anInt969 * 512 + 256;
		local23 = Static501.method5641(local9, Static13.anInt231, local15) - Static238.anInt4330;
		@Pc(224) int local224 = local9 - Static24.anInt387;
		@Pc(229) int local229 = local23 - Static209.anInt3913;
		@Pc(234) int local234 = local15 - Static110.anInt2624;
		@Pc(245) int local245 = (int) Math.sqrt((double) (local224 * local224 + local234 * local234));
		@Pc(256) int local256 = (int) (Math.atan2((double) local229, (double) local245) * 2607.5945876176133D) & 0x3FFF;
		@Pc(267) int local267 = (int) (-2607.5945876176133D * Math.atan2((double) local224, (double) local234)) & 0x3FFF;
		if (local256 < 1024) {
			local256 = 1024;
		}
		if (local256 > 3072) {
			local256 = 3072;
		}
		if (local256 > Static232.anInt4203) {
			Static232.anInt4203 += Static233.anInt4216 * (local256 - Static232.anInt4203 >> 3) / 1000 + Static159.anInt3286 << 3;
			if (Static232.anInt4203 > local256) {
				Static232.anInt4203 = local256;
			}
		}
		if (Static232.anInt4203 > local256) {
			Static232.anInt4203 -= Static159.anInt3286 + (Static232.anInt4203 - local256 >> 3) * Static233.anInt4216 / 1000 << 3;
			if (Static232.anInt4203 < local256) {
				Static232.anInt4203 = local256;
			}
		}
		@Pc(349) int local349 = local267 - Static261.anInt5009;
		if (local349 > 8192) {
			local349 -= 16384;
		}
		if (local349 < -8192) {
			local349 += 16384;
		}
		local349 >>= 0x3;
		if (local349 > 0) {
			Static261.anInt5009 += Static233.anInt4216 * local349 / 1000 + Static159.anInt3286 << 3;
			Static261.anInt5009 &= 0x3FFF;
		}
		if (local349 < 0) {
			Static261.anInt5009 -= Static159.anInt3286 + Static233.anInt4216 * -local349 / 1000 << 3;
			Static261.anInt5009 &= 0x3FFF;
		}
		@Pc(411) int local411 = local267 - Static261.anInt5009;
		if (local411 > 8192) {
			local411 -= 16384;
		}
		if (local411 < -8192) {
			local411 += 16384;
		}
		if (local411 < 0 && local349 > 0 || local411 > 0 && local349 < 0) {
			Static261.anInt5009 = local267;
		}
		Static458.anInt8547 = 0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BZIIIII[B)V")
	public static void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(20) int local20 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg1[arg0++]);
				@Pc(44) int local44 = arg3++;
				arg7[local44] = (byte) (arg7[local44] - arg1[arg0++]);
				@Pc(57) int local57 = arg3++;
				arg7[local57] = (byte) (arg7[local57] - arg1[arg0++]);
				@Pc(70) int local70 = arg3++;
				arg7[local70] = (byte) (arg7[local70] - arg1[arg0++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg3++;
				arg7[local31] = (byte) (arg7[local31] - arg1[arg0++]);
			}
			arg0 += arg6;
			arg3 += arg4;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public static void method4776(@OriginalArg(0) int arg0) {
		Static150.anInt3142 = arg0;
		Static241.aClass223_32.method5398();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)B")
	public static byte method4777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
