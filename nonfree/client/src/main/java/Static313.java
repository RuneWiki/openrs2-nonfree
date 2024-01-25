import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method4876() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static222.aBooleanArray12[local7] = false;
		}
		Static273.anInt4300 = Static116.anInt1977;
		Static199.anInt3310 = 0;
		Static294.anInt4616 = -1;
		Static457.anInt7466 = Static248.anInt3998;
		Static165.anInt2859 = Static442.anInt7328;
		Static399.anInt6507 = 0;
		Static287.anInt4470 = Static85.anInt1536;
		Static240.anInt6962 = Static393.anInt4184;
		Static310.anInt4822 = Static444.anInt7360;
		Static449.anInt7379 = 5;
		Static412.anInt6868 = -1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)I")
	public static int method4879(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I")
	public static int method4880(@OriginalArg(1) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
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
		return ((local164 >> 2 & 0x3F) << 10) + ((local169 >> 5 << 7) + (local174 >> 1));
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method4881() {
		@Pc(9) int local9 = Static278.anInt4347 * 128 + 64;
		@Pc(15) int local15 = Static299.anInt4672 * 128 + 64;
		@Pc(24) int local24 = Static192.method2572(local15, local9, Static6.anInt131) - Static378.anInt6253;
		if (Static321.anInt5003 >= 100) {
			Static393.anInt4184 = Static299.anInt4672 * 128 + 64;
			Static116.anInt1977 = Static278.anInt4347 * 128 + 64;
			Static444.anInt7360 = Static192.method2572(Static393.anInt4184, Static116.anInt1977, Static6.anInt131) - Static378.anInt6253;
		} else {
			if (local9 > Static116.anInt1977) {
				Static116.anInt1977 += Static295.anInt4630 + Static321.anInt5003 * (local9 - Static116.anInt1977) / 1000;
				if (local9 < Static116.anInt1977) {
					Static116.anInt1977 = local9;
				}
			}
			if (Static444.anInt7360 < local24) {
				Static444.anInt7360 += (local24 - Static444.anInt7360) * Static321.anInt5003 / 1000 + Static295.anInt4630;
				if (local24 < Static444.anInt7360) {
					Static444.anInt7360 = local24;
				}
			}
			if (Static116.anInt1977 > local9) {
				Static116.anInt1977 -= Static295.anInt4630 + (Static116.anInt1977 - local9) * Static321.anInt5003 / 1000;
				if (Static116.anInt1977 < local9) {
					Static116.anInt1977 = local9;
				}
			}
			if (local24 < Static444.anInt7360) {
				Static444.anInt7360 -= Static295.anInt4630 + Static321.anInt5003 * (Static444.anInt7360 - local24) / 1000;
				if (local24 > Static444.anInt7360) {
					Static444.anInt7360 = local24;
				}
			}
			if (local15 > Static393.anInt4184) {
				Static393.anInt4184 += Static295.anInt4630 + Static321.anInt5003 * (local15 - Static393.anInt4184) / 1000;
				if (Static393.anInt4184 > local15) {
					Static393.anInt4184 = local15;
				}
			}
			if (local15 < Static393.anInt4184) {
				Static393.anInt4184 -= Static295.anInt4630 + Static321.anInt5003 * (Static393.anInt4184 - local15) / 1000;
				if (local15 > Static393.anInt4184) {
					Static393.anInt4184 = local15;
				}
			}
		}
		local9 = Static6.anInt110 * 128 + 64;
		local15 = Static118.anInt2132 * 128 + 64;
		local24 = Static192.method2572(local15, local9, Static6.anInt131) - Static230.anInt7236;
		@Pc(213) int local213 = local9 - Static116.anInt1977;
		@Pc(218) int local218 = local24 - Static444.anInt7360;
		@Pc(222) int local222 = local15 - Static393.anInt4184;
		@Pc(240) int local240 = (int) Math.sqrt((double) (local222 * local222 + local213 * local213));
		@Pc(251) int local251 = (int) (Math.atan2((double) local218, (double) local240) * 2607.5945876176133D) & 0x3FFF;
		if (local251 < 1024) {
			local251 = 1024;
		}
		@Pc(269) int local269 = (int) (-2607.5945876176133D * Math.atan2((double) local213, (double) local222)) & 0x3FFF;
		if (local251 > 3072) {
			local251 = 3072;
		}
		if (local251 > Static248.anInt3998) {
			Static248.anInt3998 += Static399.anInt6507 * (local251 - Static248.anInt3998 >> 3) / 1000 + Static199.anInt3310 << 3;
			if (local251 < Static248.anInt3998) {
				Static248.anInt3998 = local251;
			}
		}
		if (Static248.anInt3998 > local251) {
			Static248.anInt3998 -= (Static248.anInt3998 - local251 >> 3) * Static399.anInt6507 / 1000 + Static199.anInt3310 << 3;
			if (local251 > Static248.anInt3998) {
				Static248.anInt3998 = local251;
			}
		}
		@Pc(334) int local334 = local269 - Static442.anInt7328;
		if (local334 > 8192) {
			local334 -= 16384;
		}
		if (local334 < -8192) {
			local334 += 16384;
		}
		local334 >>= 0x3;
		if (local334 > 0) {
			Static442.anInt7328 += Static399.anInt6507 * local334 / 1000 + Static199.anInt3310 << 3;
			Static442.anInt7328 &= 0x3FFF;
		}
		if (local334 < 0) {
			Static442.anInt7328 -= Static199.anInt3310 + -local334 * Static399.anInt6507 / 1000 << 3;
			Static442.anInt7328 &= 0x3FFF;
		}
		@Pc(397) int local397 = local269 - Static442.anInt7328;
		if (local397 > 8192) {
			local397 -= 16384;
		}
		if (local397 < -8192) {
			local397 += 16384;
		}
		if (local397 < 0 && local334 > 0 || local397 > 0 && local334 < 0) {
			Static442.anInt7328 = local269;
		}
		Static194.anInt3230 = 0;
	}
}
