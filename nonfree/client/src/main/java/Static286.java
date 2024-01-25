import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
	public static long aLong188 = 0L;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString319 = "wave:";

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public static void method4899() {
		Static250.anInt4854 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static5.anInt176; local3++) {
			@Pc(8) Class183 local8 = Static225.aClass183Array1[local3];
			@Pc(12) int local12;
			if (Static148.anIntArray203 != null) {
				for (local12 = 0; local12 < Static148.anIntArray203.length; local12++) {
					if (Static148.anIntArray203[local12] != -1000000 && (local8.anInt5551 <= Static148.anIntArray203[local12] || local8.anInt5561 <= Static148.anIntArray203[local12]) && (local8.anInt5556 <= Static334.anIntArray544[local12] || local8.anInt5564 <= Static334.anIntArray544[local12]) && (local8.anInt5556 >= Static148.anIntArray202[local12] || local8.anInt5564 >= Static148.anIntArray202[local12]) && (local8.anInt5550 <= Static345.anIntArray553[local12] || local8.anInt5553 <= Static345.anIntArray553[local12]) && (local8.anInt5550 >= Static26.anIntArray31[local12] || local8.anInt5553 >= Static26.anIntArray31[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5549 == 1) {
				local12 = local8.anInt5557 + Static98.anInt2185 - Static210.anInt5625;
				if (local12 >= 0 && local12 <= Static98.anInt2185 + Static98.anInt2185) {
					local110 = local8.anInt5548 + Static98.anInt2185 - Static103.anInt2249;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5552 + Static98.anInt2185 - Static103.anInt2249;
					if (local121 > Static98.anInt2185 + Static98.anInt2185) {
						local121 = Static98.anInt2185 + Static98.anInt2185;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static240.aBooleanArrayArray31[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static10.anInt345 - local8.anInt5556;
						if (local153 > 32) {
							local8.anInt5558 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5558 = 2;
							local153 = -local153;
						}
						local8.anInt5559 = (local8.anInt5550 - Static21.anInt6206 << 8) / local153;
						local8.anInt5554 = (local8.anInt5553 - Static21.anInt6206 << 8) / local153;
						local8.anInt5547 = (local8.anInt5551 - Static337.anInt6349 << 8) / local153;
						local8.anInt5563 = (local8.anInt5561 - Static337.anInt6349 << 8) / local153;
						Static237.aClass183Array2[Static250.anInt4854++] = local8;
					}
				}
			} else if (local8.anInt5549 == 2) {
				local12 = local8.anInt5548 + Static98.anInt2185 - Static103.anInt2249;
				if (local12 >= 0 && local12 <= Static98.anInt2185 + Static98.anInt2185) {
					local110 = local8.anInt5557 + Static98.anInt2185 - Static210.anInt5625;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5555 + Static98.anInt2185 - Static210.anInt5625;
					if (local121 > Static98.anInt2185 + Static98.anInt2185) {
						local121 = Static98.anInt2185 + Static98.anInt2185;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static240.aBooleanArrayArray31[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static21.anInt6206 - local8.anInt5550;
						if (local153 > 32) {
							local8.anInt5558 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5558 = 4;
							local153 = -local153;
						}
						local8.anInt5560 = (local8.anInt5556 - Static10.anInt345 << 8) / local153;
						local8.anInt5568 = (local8.anInt5564 - Static10.anInt345 << 8) / local153;
						local8.anInt5547 = (local8.anInt5551 - Static337.anInt6349 << 8) / local153;
						local8.anInt5563 = (local8.anInt5561 - Static337.anInt6349 << 8) / local153;
						Static237.aClass183Array2[Static250.anInt4854++] = local8;
					}
				}
			} else if (local8.anInt5549 == 4) {
				local12 = local8.anInt5551 - Static337.anInt6349;
				if (local12 > 128) {
					local110 = local8.anInt5548 + Static98.anInt2185 - Static103.anInt2249;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5552 + Static98.anInt2185 - Static103.anInt2249;
					if (local121 > Static98.anInt2185 + Static98.anInt2185) {
						local121 = Static98.anInt2185 + Static98.anInt2185;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt5557 + Static98.anInt2185 - Static210.anInt5625;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt5555 + Static98.anInt2185 - Static210.anInt5625;
						if (local153 > Static98.anInt2185 + Static98.anInt2185) {
							local153 = Static98.anInt2185 + Static98.anInt2185;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static240.aBooleanArrayArray31[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt5558 = 5;
							local8.anInt5560 = (local8.anInt5556 - Static10.anInt345 << 8) / local12;
							local8.anInt5568 = (local8.anInt5564 - Static10.anInt345 << 8) / local12;
							local8.anInt5559 = (local8.anInt5550 - Static21.anInt6206 << 8) / local12;
							local8.anInt5554 = (local8.anInt5553 - Static21.anInt6206 << 8) / local12;
							Static237.aClass183Array2[Static250.anInt4854++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method4901() {
		if (Static111.anInt2403 == -1 || Static179.anInt3574 == -1) {
			return;
		}
		@Pc(24) int local24 = Static170.anInt3482 + ((Static192.anInt3790 - Static170.anInt3482) * Static244.anInt4744 >> 16);
		Static244.anInt4744 += local24;
		if (Static244.anInt4744 < 65535) {
			Static59.aBoolean91 = false;
			Static302.aBoolean432 = false;
		} else {
			if (Static59.aBoolean91) {
				Static302.aBoolean432 = false;
			} else {
				Static302.aBoolean432 = true;
			}
			Static244.anInt4744 = 65535;
			Static59.aBoolean91 = true;
		}
		@Pc(54) float local54 = (float) Static244.anInt4744 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static106.anInt2308 * 2;
		@Pc(91) int local91;
		@Pc(124) int local124;
		@Pc(132) int local132;
		@Pc(137) int local137;
		@Pc(147) int local147;
		@Pc(164) int local164;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(79) int local79 = Static106.anIntArrayArrayArray5[Static111.anInt2403][local61][local63] * 3;
			local91 = Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 1][local63] * 3;
			local124 = (Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 2][local63] + Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 2][local63] - Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 3][local63]) * 3;
			local132 = Static106.anIntArrayArrayArray5[Static111.anInt2403][local61][local63];
			local137 = local91 - local79;
			local147 = local79 + local124 - local91 * 2;
			local164 = Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 2][local63] + local91 - local132 - local124;
			local57[local63] = (float) local132 + local54 * (local54 * ((float) local147 + local54 * (float) local164) + (float) local137);
		}
		Static347.anInt6472 = (int) local57[0] - Static263.anInt5063 * 128;
		Static339.anInt6354 = (int) local57[1] * -1;
		Static347.anInt6471 = (int) local57[2] - Static28.anInt773 * 128;
		@Pc(217) float[] local217 = new float[3];
		local91 = Static267.anInt5121 * 2;
		for (local124 = 0; local124 < 3; local124++) {
			local132 = Static106.anIntArrayArrayArray5[Static179.anInt3574][local91][local124] * 3;
			local137 = Static106.anIntArrayArrayArray5[Static179.anInt3574][local91 + 1][local124] * 3;
			local147 = (Static106.anIntArrayArrayArray5[Static179.anInt3574][local91 + 2][local124] + Static106.anIntArrayArrayArray5[Static179.anInt3574][local91 + 2][local124] - Static106.anIntArrayArrayArray5[Static179.anInt3574][local91 + 3][local124]) * 3;
			local164 = Static106.anIntArrayArrayArray5[Static179.anInt3574][local91][local124];
			@Pc(293) int local293 = local137 - local132;
			@Pc(302) int local302 = local147 + local132 - local137 * 2;
			@Pc(320) int local320 = local137 + Static106.anIntArrayArrayArray5[Static179.anInt3574][local91 + 2][local124] - local164 - local147;
			local217[local124] = (float) local164 + local54 * ((float) local293 + local54 * (local54 * (float) local320 + (float) local302));
		}
		@Pc(353) float local353 = local217[0] - local57[0];
		@Pc(364) float local364 = -1.0F * (local217[1] - local57[1]);
		@Pc(373) float local373 = local217[2] - local57[2];
		@Pc(383) double local383 = Math.sqrt((double) (local353 * local353 + local373 * local373));
		Static311.anInt6461 = (int) (Math.atan2((double) local364, local383) * 2607.5945876176133D) & 0x3FFF;
		Static199.anInt3858 = (int) (-Math.atan2((double) local353, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static160.anInt3243 = ((Static106.anIntArrayArrayArray5[Static111.anInt2403][local61 + 2][3] - Static106.anIntArrayArrayArray5[Static111.anInt2403][local61][3]) * Static244.anInt4744 >> 16) + Static106.anIntArrayArrayArray5[Static111.anInt2403][local61][3];
	}
}
