import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray10 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt7989 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method6636() {
		Static259.anInt4761 = 0;
		Static354.anIntArrayArrayArray14 = new int[Static101.anInt2104][Static446.anInt7725 + 1][Static218.anInt4229 + 1];
		Static235.aClass50Array3 = new Class50[1000];
		Static460.aClass50Array4 = new Class50[2000];
		Static333.aBoolean432 = false;
		Static69.anInt1595 = 0;
		Static97.anInt6022 = 0;
		Static41.anInt1085 = Static47.anInt1239;
		Static17.aClass50Array1 = new Class50[500];
		Static465.anInt7900 = 0;
		Static172.aClass50Array2 = new Class50[500];
		Static324.anInt5805 = Static47.anInt1239;
		if (Static63.aClass12_5 instanceof l) {
			Static457.aBoolean566 = false;
		} else {
			Static457.aBoolean566 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
	public static void method6647() {
		@Pc(9) int local9 = Static69.anInt1590 * 512 + 256;
		@Pc(15) int local15 = Static267.anInt5015 * 512 + 256;
		@Pc(24) int local24 = Static122.method2103(Static240.anInt4595, local9, local15) - Static211.anInt4153;
		if (Static484.anInt8139 >= 100) {
			Static216.anInt4203 = Static267.anInt5015 * 512 + 256;
			Static333.anInt5940 = Static69.anInt1590 * 512 + 256;
			Static350.anInt6168 = Static122.method2103(Static240.anInt4595, Static333.anInt5940, Static216.anInt4203) - Static211.anInt4153;
		} else {
			if (Static333.anInt5940 < local9) {
				Static333.anInt5940 += Static490.anInt8280 + (local9 - Static333.anInt5940) * Static484.anInt8139 / 1000;
				if (local9 < Static333.anInt5940) {
					Static333.anInt5940 = local9;
				}
			}
			if (local24 > Static350.anInt6168) {
				Static350.anInt6168 += Static490.anInt8280 + (local24 - Static350.anInt6168) * Static484.anInt8139 / 1000;
				if (Static350.anInt6168 > local24) {
					Static350.anInt6168 = local24;
				}
			}
			if (local9 < Static333.anInt5940) {
				Static333.anInt5940 -= (Static333.anInt5940 - local9) * Static484.anInt8139 / 1000 + Static490.anInt8280;
				if (local9 > Static333.anInt5940) {
					Static333.anInt5940 = local9;
				}
			}
			if (local24 < Static350.anInt6168) {
				Static350.anInt6168 -= (Static350.anInt6168 - local24) * Static484.anInt8139 / 1000 + Static490.anInt8280;
				if (local24 > Static350.anInt6168) {
					Static350.anInt6168 = local24;
				}
			}
			if (Static216.anInt4203 < local15) {
				Static216.anInt4203 += (local15 - Static216.anInt4203) * Static484.anInt8139 / 1000 + Static490.anInt8280;
				if (local15 < Static216.anInt4203) {
					Static216.anInt4203 = local15;
				}
			}
			if (local15 < Static216.anInt4203) {
				Static216.anInt4203 -= Static490.anInt8280 + Static484.anInt8139 * (Static216.anInt4203 - local15) / 1000;
				if (Static216.anInt4203 < local15) {
					Static216.anInt4203 = local15;
				}
			}
		}
		local15 = Static316.anInt5683 * 512 + 256;
		local9 = Static274.anInt5078 * 512 + 256;
		local24 = Static122.method2103(Static240.anInt4595, local9, local15) - Static68.anInt1583;
		@Pc(236) int local236 = local9 - Static333.anInt5940;
		@Pc(249) int local249 = local24 - Static350.anInt6168;
		@Pc(254) int local254 = local15 - Static216.anInt4203;
		@Pc(265) int local265 = (int) Math.sqrt((double) (local254 * local254 + local236 * local236));
		@Pc(276) int local276 = (int) (Math.atan2((double) local249, (double) local265) * 2607.5945876176133D) & 0x3FFF;
		@Pc(287) int local287 = (int) (-2607.5945876176133D * Math.atan2((double) local236, (double) local254)) & 0x3FFF;
		if (local276 < 1024) {
			local276 = 1024;
		}
		if (local276 > 3072) {
			local276 = 3072;
		}
		if (Static124.anInt2517 < local276) {
			Static124.anInt2517 += Static335.anInt5962 + (local276 - Static124.anInt2517 >> 3) * Static142.anInt2727 / 1000 << 3;
			if (local276 < Static124.anInt2517) {
				Static124.anInt2517 = local276;
			}
		}
		if (local276 < Static124.anInt2517) {
			Static124.anInt2517 -= Static335.anInt5962 + Static142.anInt2727 * (Static124.anInt2517 - local276 >> 3) / 1000 << 3;
			if (Static124.anInt2517 < local276) {
				Static124.anInt2517 = local276;
			}
		}
		@Pc(364) int local364 = local287 - Static202.anInt4065;
		if (local364 > 8192) {
			local364 -= 16384;
		}
		if (local364 < -8192) {
			local364 += 16384;
		}
		local364 >>= 0x3;
		if (local364 > 0) {
			Static202.anInt4065 += Static335.anInt5962 + local364 * Static142.anInt2727 / 1000 << 3;
			Static202.anInt4065 &= 0x3FFF;
		}
		if (local364 < 0) {
			Static202.anInt4065 -= -local364 * Static142.anInt2727 / 1000 + Static335.anInt5962 << 3;
			Static202.anInt4065 &= 0x3FFF;
		}
		@Pc(424) int local424 = local287 - Static202.anInt4065;
		if (local424 > 8192) {
			local424 -= 16384;
		}
		if (local424 < -8192) {
			local424 += 16384;
		}
		Static427.anInt7255 = 0;
		if (local424 < 0 && local364 > 0 || local424 > 0 && local364 < 0) {
			Static202.anInt4065 = local287;
		}
	}
}
