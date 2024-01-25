import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
	public static int anInt10762;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "Lclient!iga;")
	public static final Class169 aClass169_10 = new Class169("game4", "Game 4", 3);

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_190 = new Class186(53, 2);

	@OriginalMember(owner = "client!vga", name = "g", descriptor = "[Lclient!oba;")
	public static final Class19_Sub1_Sub3_Sub2_Sub2[] aClass19_Sub1_Sub3_Sub2_Sub2Array1 = new Class19_Sub1_Sub3_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!oba;I)I")
	public static int method8984(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.anInt7853;
		@Pc(12) Class274 local12 = arg0.method6600();
		@Pc(17) int local17 = arg0.aClass100_8.method8976();
		if (local17 == -1 || arg0.aBoolean595) {
			local8 = arg0.anInt7848;
		} else if (local17 == local12.anInt8174 || local12.anInt8180 == local17 || local12.anInt8171 == local17 || local12.anInt8197 == local17) {
			local8 = arg0.anInt7827;
		} else if (local12.anInt8185 == local17 || local17 == local12.anInt8166 || local17 == local12.anInt8159 || local17 == local12.anInt8181) {
			local8 = arg0.anInt7826;
		}
		if (arg1 != -11542) {
			anInt10762 = -3;
		}
		return local8;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Lclient!oaa;")
	public static Class256_Sub1 method8985() {
		Static693.anInt10869 = 0;
		return Static196.method2962();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	public static void method8986() {
		@Pc(9) int local9 = Static161.anInt2963 * 512 + 256;
		@Pc(15) int local15 = Static393.anInt7056 * 512 + 256;
		@Pc(23) int local23 = Static505.method7237(Static712.anInt11117, local15, local9) - Static390.anInt7029;
		if (Static16.anInt288 < 100) {
			if (local9 > Static173.anInt3144) {
				Static173.anInt3144 += Static236.anInt4478 + (local9 - Static173.anInt3144) * Static16.anInt288 / 1000;
				if (local9 < Static173.anInt3144) {
					Static173.anInt3144 = local9;
				}
			}
			if (Static376.anInt6408 < local23) {
				Static376.anInt6408 += Static236.anInt4478 + (local23 - Static376.anInt6408) * Static16.anInt288 / 1000;
				if (local23 < Static376.anInt6408) {
					Static376.anInt6408 = local23;
				}
			}
			if (Static173.anInt3144 > local9) {
				Static173.anInt3144 -= Static16.anInt288 * (Static173.anInt3144 - local9) / 1000 + Static236.anInt4478;
				if (local9 > Static173.anInt3144) {
					Static173.anInt3144 = local9;
				}
			}
			if (Static376.anInt6408 > local23) {
				Static376.anInt6408 -= Static16.anInt288 * (Static376.anInt6408 - local23) / 1000 + Static236.anInt4478;
				if (Static376.anInt6408 < local23) {
					Static376.anInt6408 = local23;
				}
			}
			if (Static235.anInt4471 < local15) {
				Static235.anInt4471 += Static236.anInt4478 + (local15 - Static235.anInt4471) * Static16.anInt288 / 1000;
				if (Static235.anInt4471 > local15) {
					Static235.anInt4471 = local15;
				}
			}
			if (Static235.anInt4471 > local15) {
				Static235.anInt4471 -= Static236.anInt4478 + Static16.anInt288 * (Static235.anInt4471 - local15) / 1000;
				if (local15 > Static235.anInt4471) {
					Static235.anInt4471 = local15;
				}
			}
		} else {
			Static173.anInt3144 = Static161.anInt2963 * 512 + 256;
			Static235.anInt4471 = Static393.anInt7056 * 512 + 256;
			Static376.anInt6408 = Static505.method7237(Static712.anInt11117, Static235.anInt4471, Static173.anInt3144) - Static390.anInt7029;
		}
		local9 = Static624.anInt10064 * 512 + 256;
		local15 = Static71.anInt1112 * 512 + 256;
		local23 = Static505.method7237(Static712.anInt11117, local15, local9) - Static641.anInt10380;
		@Pc(259) int local259 = local9 - Static173.anInt3144;
		@Pc(263) int local263 = local23 - Static376.anInt6408;
		@Pc(273) int local273 = local15 - Static235.anInt4471;
		@Pc(284) int local284 = (int) Math.sqrt((double) (local273 * local273 + local259 * local259));
		@Pc(295) int local295 = (int) (Math.atan2((double) local263, (double) local284) * 2607.5945876176133D) & 0x3FFF;
		if (local295 < 1024) {
			local295 = 1024;
		}
		@Pc(313) int local313 = (int) (-2607.5945876176133D * Math.atan2((double) local259, (double) local273)) & 0x3FFF;
		if (local295 > 3072) {
			local295 = 3072;
		}
		if (Static228.anInt9136 < local295) {
			Static228.anInt9136 += Static647.anInt10427 + Static674.anInt10663 * (local295 - Static228.anInt9136 >> 3) / 1000 << 3;
			if (local295 < Static228.anInt9136) {
				Static228.anInt9136 = local295;
			}
		}
		if (Static228.anInt9136 > local295) {
			Static228.anInt9136 -= Static674.anInt10663 * (Static228.anInt9136 - local295 >> 3) / 1000 + Static647.anInt10427 << 3;
			if (local295 > Static228.anInt9136) {
				Static228.anInt9136 = local295;
			}
		}
		@Pc(395) int local395 = local313 - Static703.anInt10997;
		if (local395 > 8192) {
			local395 -= 16384;
		}
		if (local395 < -8192) {
			local395 += 16384;
		}
		local395 >>= 0x3;
		if (local395 > 0) {
			Static703.anInt10997 += local395 * Static674.anInt10663 / 1000 + Static647.anInt10427 << 3;
			Static703.anInt10997 &= 0x3FFF;
		}
		if (local395 < 0) {
			Static703.anInt10997 -= Static647.anInt10427 + -local395 * Static674.anInt10663 / 1000 << 3;
			Static703.anInt10997 &= 0x3FFF;
		}
		@Pc(461) int local461 = local313 - Static703.anInt10997;
		if (local461 > 8192) {
			local461 -= 16384;
		}
		if (local461 < -8192) {
			local461 += 16384;
		}
		Static212.anInt3807 = 0;
		if (local461 < 0 && local395 > 0 || local461 > 0 && local395 < 0) {
			Static703.anInt10997 = local313;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	public static void method8987(@OriginalArg(0) int arg0) {
		if (arg0 != 3) {
			method8984((Class19_Sub1_Sub3_Sub2_Sub2) null, 108);
		}
		Static650.method8735(false);
		if (Static186.anInt3292 >= 0 && Static186.anInt3292 != 0) {
			Static718.method9389(Static186.anInt3292, false);
			Static186.anInt3292 = -1;
		}
	}
}
