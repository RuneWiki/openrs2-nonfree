import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt66 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([B[I[[B[[BIII[I)I")
	public static int method67(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg1[arg5];
		@Pc(13) int local13 = local7 + arg6[arg5];
		@Pc(17) int local17 = arg1[arg4];
		@Pc(24) int local24 = local17 + arg6[arg4];
		@Pc(26) int local26 = local7;
		if (local17 > local7) {
			local26 = local17;
		}
		@Pc(37) int local37 = local13;
		if (local24 < local13) {
			local37 = local24;
		}
		@Pc(52) int local52 = arg0[arg5] & 0xFF;
		if (local52 > (arg0[arg4] & 0xFF)) {
			local52 = arg0[arg4] & 0xFF;
		}
		@Pc(69) byte[] local69 = arg2[arg5];
		@Pc(73) byte[] local73 = arg3[arg4];
		@Pc(78) int local78 = local26 - local7;
		@Pc(83) int local83 = local26 - local17;
		for (@Pc(85) int local85 = local26; local85 < local37; local85++) {
			@Pc(96) int local96 = local73[local83++] + local69[local78++];
			if (local96 < local52) {
				local52 = local96;
			}
		}
		return -local52;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method68() {
		@Pc(9) int local9 = Static184.anInt3595 * 512 + 256;
		@Pc(15) int local15 = Static680.anInt10895 * 512 + 256;
		@Pc(24) int local24 = Static441.method6444(Static481.anInt8082, local9, local15) - Static274.anInt5033;
		if (Static228.anInt4189 >= 100) {
			Static332.anInt6132 = Static184.anInt3595 * 512 + 256;
			Static407.anInt7215 = Static680.anInt10895 * 512 + 256;
			Static200.anInt3808 = Static441.method6444(Static481.anInt8082, Static332.anInt6132, Static407.anInt7215) - Static274.anInt5033;
		} else {
			if (Static332.anInt6132 < local9) {
				Static332.anInt6132 += Static228.anInt4189 * (local9 - Static332.anInt6132) / 1000 + Static267.anInt4950;
				if (local9 < Static332.anInt6132) {
					Static332.anInt6132 = local9;
				}
			}
			if (Static200.anInt3808 < local24) {
				Static200.anInt3808 += Static228.anInt4189 * (local24 - Static200.anInt3808) / 1000 + Static267.anInt4950;
				if (Static200.anInt3808 > local24) {
					Static200.anInt3808 = local24;
				}
			}
			if (Static332.anInt6132 > local9) {
				Static332.anInt6132 -= Static228.anInt4189 * (Static332.anInt6132 - local9) / 1000 + Static267.anInt4950;
				if (Static332.anInt6132 < local9) {
					Static332.anInt6132 = local9;
				}
			}
			if (Static200.anInt3808 > local24) {
				Static200.anInt3808 -= Static228.anInt4189 * (Static200.anInt3808 - local24) / 1000 + Static267.anInt4950;
				if (local24 > Static200.anInt3808) {
					Static200.anInt3808 = local24;
				}
			}
			if (Static407.anInt7215 < local15) {
				Static407.anInt7215 += Static267.anInt4950 + (local15 - Static407.anInt7215) * Static228.anInt4189 / 1000;
				if (Static407.anInt7215 > local15) {
					Static407.anInt7215 = local15;
				}
			}
			if (Static407.anInt7215 > local15) {
				Static407.anInt7215 -= Static267.anInt4950 + Static228.anInt4189 * (Static407.anInt7215 - local15) / 1000;
				if (Static407.anInt7215 < local15) {
					Static407.anInt7215 = local15;
				}
			}
		}
		local9 = Static392.anInt6960 * 512 + 256;
		local15 = Static260.anInt4823 * 512 + 256;
		local24 = Static441.method6444(Static481.anInt8082, local9, local15) - Static201.anInt3831;
		@Pc(213) int local213 = local9 - Static332.anInt6132;
		@Pc(218) int local218 = local24 - Static200.anInt3808;
		@Pc(222) int local222 = local15 - Static407.anInt7215;
		@Pc(233) int local233 = (int) Math.sqrt((double) (local213 * local213 + local222 * local222));
		@Pc(244) int local244 = (int) (Math.atan2((double) local218, (double) local233) * 2607.5945876176133D) & 0x3FFF;
		if (local244 < 1024) {
			local244 = 1024;
		}
		@Pc(262) int local262 = (int) (Math.atan2((double) local213, (double) local222) * -2607.5945876176133D) & 0x3FFF;
		if (local244 > 3072) {
			local244 = 3072;
		}
		if (local244 > Static79.anInt1141) {
			Static79.anInt1141 += Static556.anInt9087 + (local244 - Static79.anInt1141 >> 3) * Static672.anInt10801 / 1000 << 3;
			if (Static79.anInt1141 > local244) {
				Static79.anInt1141 = local244;
			}
		}
		if (Static79.anInt1141 > local244) {
			Static79.anInt1141 -= Static672.anInt10801 * (Static79.anInt1141 - local244 >> 3) / 1000 + Static556.anInt9087 << 3;
			if (Static79.anInt1141 < local244) {
				Static79.anInt1141 = local244;
			}
		}
		@Pc(335) int local335 = local262 - Static207.anInt3885;
		if (local335 > 8192) {
			local335 -= 16384;
		}
		if (local335 < -8192) {
			local335 += 16384;
		}
		local335 >>= 0x3;
		if (local335 > 0) {
			Static207.anInt3885 += Static672.anInt10801 * local335 / 1000 + Static556.anInt9087 << 3;
			Static207.anInt3885 &= 0x3FFF;
		}
		if (local335 < 0) {
			Static207.anInt3885 -= Static556.anInt9087 + -local335 * Static672.anInt10801 / 1000 << 3;
			Static207.anInt3885 &= 0x3FFF;
		}
		@Pc(393) int local393 = local262 - Static207.anInt3885;
		if (local393 > 8192) {
			local393 -= 16384;
		}
		if (local393 < -8192) {
			local393 += 16384;
		}
		if (local393 < 0 && local335 > 0 || local393 > 0 && local335 < 0) {
			Static207.anInt3885 = local262;
		}
		Static388.anInt6926 = 0;
	}
}
