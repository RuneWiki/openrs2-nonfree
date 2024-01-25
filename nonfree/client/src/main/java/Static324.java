import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
	public static int anInt10471;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "Lclient!qv;")
	public static final Class5_Sub45 aClass5_Sub45_4 = new Class5_Sub45(0, -1);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	public static void method8982() {
		@Pc(9) int local9 = Static576.anInt9663 * 512 + 256;
		@Pc(15) int local15 = Static650.anInt2304 * 512 + 256;
		@Pc(23) int local23 = Static380.method5559(local9, Static240.anInt3974, local15, 0) - Static70.anInt1127;
		if (Static612.anInt10117 >= 100) {
			Static489.anInt8202 = Static650.anInt2304 * 512 + 256;
			Static532.anInt9189 = Static576.anInt9663 * 512 + 256;
			Static132.anInt2186 = Static380.method5559(Static532.anInt9189, Static240.anInt3974, Static489.anInt8202, 0) - Static70.anInt1127;
		} else {
			if (local9 > Static532.anInt9189) {
				Static532.anInt9189 += Static487.anInt8166 + (local9 - Static532.anInt9189) * Static612.anInt10117 / 1000;
				if (local9 < Static532.anInt9189) {
					Static532.anInt9189 = local9;
				}
			}
			if (local9 < Static532.anInt9189) {
				Static532.anInt9189 -= Static487.anInt8166 + Static612.anInt10117 * (Static532.anInt9189 - local9) / 1000;
				if (local9 > Static532.anInt9189) {
					Static532.anInt9189 = local9;
				}
			}
			if (local23 > Static132.anInt2186) {
				Static132.anInt2186 += (local23 - Static132.anInt2186) * Static612.anInt10117 / 1000 + Static487.anInt8166;
				if (local23 < Static132.anInt2186) {
					Static132.anInt2186 = local23;
				}
			}
			if (local23 < Static132.anInt2186) {
				Static132.anInt2186 -= Static612.anInt10117 * (Static132.anInt2186 - local23) / 1000 + Static487.anInt8166;
				if (local23 > Static132.anInt2186) {
					Static132.anInt2186 = local23;
				}
			}
			if (Static489.anInt8202 < local15) {
				Static489.anInt8202 += Static487.anInt8166 + (local15 - Static489.anInt8202) * Static612.anInt10117 / 1000;
				if (local15 < Static489.anInt8202) {
					Static489.anInt8202 = local15;
				}
			}
			if (local15 < Static489.anInt8202) {
				Static489.anInt8202 -= (Static489.anInt8202 - local15) * Static612.anInt10117 / 1000 + Static487.anInt8166;
				if (local15 > Static489.anInt8202) {
					Static489.anInt8202 = local15;
				}
			}
		}
		local9 = Static569.anInt9543 * 512 + 256;
		local15 = Static218.anInt3558 * 512 + 256;
		local23 = Static380.method5559(local9, Static240.anInt3974, local15, 0) - Static521.anInt8819;
		@Pc(252) int local252 = local9 - Static532.anInt9189;
		@Pc(262) int local262 = local23 - Static132.anInt2186;
		@Pc(267) int local267 = local15 - Static489.anInt8202;
		@Pc(278) int local278 = (int) Math.sqrt((double) (local267 * local267 + local252 * local252));
		@Pc(289) int local289 = (int) (Math.atan2((double) local262, (double) local278) * 2607.5945876176133D) & 0x3FFF;
		if (local289 < 1024) {
			local289 = 1024;
		}
		@Pc(307) int local307 = (int) (Math.atan2((double) local252, (double) local267) * -2607.5945876176133D) & 0x3FFF;
		if (local289 > 3072) {
			local289 = 3072;
		}
		if (Static649.anInt5976 < local289) {
			Static649.anInt5976 += Static635.anInt10332 * (local289 - Static649.anInt5976 >> 3) / 1000 + Static393.anInt7347 << 3;
			if (local289 < Static649.anInt5976) {
				Static649.anInt5976 = local289;
			}
		}
		if (Static649.anInt5976 > local289) {
			Static649.anInt5976 -= Static393.anInt7347 + (Static649.anInt5976 - local289 >> 3) * Static635.anInt10332 / 1000 << 3;
			if (Static649.anInt5976 < local289) {
				Static649.anInt5976 = local289;
			}
		}
		@Pc(385) int local385 = local307 - Static159.anInt2475;
		if (local385 > 8192) {
			local385 -= 16384;
		}
		if (local385 < -8192) {
			local385 += 16384;
		}
		local385 >>= 0x3;
		if (local385 > 0) {
			Static159.anInt2475 += Static393.anInt7347 + local385 * Static635.anInt10332 / 1000 << 3;
			Static159.anInt2475 &= 0x3FFF;
		}
		if (local385 < 0) {
			Static159.anInt2475 -= Static393.anInt7347 + Static635.anInt10332 * -local385 / 1000 << 3;
			Static159.anInt2475 &= 0x3FFF;
		}
		@Pc(456) int local456 = local307 - Static159.anInt2475;
		if (local456 > 8192) {
			local456 -= 16384;
		}
		if (local456 < -8192) {
			local456 += 16384;
		}
		if (local456 < 0 && local385 > 0 || local456 > 0 && local385 < 0) {
			Static159.anInt2475 = local307;
		}
		Static313.anInt5549 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	public static void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class5_Sub5_Sub6 local21 = Static478.method6972((long) arg0 | (long) arg1 << 32, 18);
		local21.method2686();
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(III)B")
	public static byte method8984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
