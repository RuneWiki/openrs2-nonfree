import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString11 = null;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIILclient!at;)V")
	public static void method1753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2) {
		if (arg2.aByte9 == 0) {
			arg2.anInt495 = arg2.anInt487;
		} else if (arg2.aByte9 == 1) {
			arg2.anInt495 = (arg0 - arg2.anInt441) / 2 + arg2.anInt487;
		} else if (arg2.aByte9 == 2) {
			arg2.anInt495 = arg0 - arg2.anInt487 - arg2.anInt441;
		} else if (arg2.aByte9 == 3) {
			arg2.anInt495 = arg0 * arg2.anInt487 >> 14;
		} else if (arg2.aByte9 == 4) {
			arg2.anInt495 = (arg0 - arg2.anInt441) / 2 + (arg0 * arg2.anInt487 >> 14);
		} else {
			arg2.anInt495 = arg0 - arg2.anInt441 - (arg0 * arg2.anInt487 >> 14);
		}
		if (arg2.aByte6 == 0) {
			arg2.anInt465 = arg2.anInt461;
		} else if (arg2.aByte6 == 1) {
			arg2.anInt465 = (arg1 - arg2.anInt488) / 2 + arg2.anInt461;
		} else if (arg2.aByte6 == 2) {
			arg2.anInt465 = arg1 - arg2.anInt488 - arg2.anInt461;
		} else if (arg2.aByte6 == 3) {
			arg2.anInt465 = arg2.anInt461 * arg1 >> 14;
		} else if (arg2.aByte6 == 4) {
			arg2.anInt465 = (arg1 * arg2.anInt461 >> 14) + (arg1 - arg2.anInt488) / 2;
		} else {
			arg2.anInt465 = arg1 - (arg1 * arg2.anInt461 >> 14) - arg2.anInt488;
		}
		if (!Static591.aBoolean480 || Static76.method2235(arg2).anInt10800 == 0 && arg2.anInt480 != 0) {
			return;
		}
		if (arg2.anInt465 < 0) {
			arg2.anInt465 = 0;
		} else if (arg2.anInt488 + arg2.anInt465 > arg1) {
			arg2.anInt465 = arg1 - arg2.anInt488;
		}
		if (arg2.anInt495 < 0) {
			arg2.anInt495 = 0;
		} else if (arg0 < arg2.anInt495 + arg2.anInt441) {
			arg2.anInt495 = arg0 - arg2.anInt441;
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public static void method1755() {
		@Pc(9) int local9 = Static489.anInt9048 * 512 + 256;
		@Pc(15) int local15 = Static590.anInt10439 * 512 + 256;
		@Pc(24) int local24 = Static590.method8716(local9, Static12.anInt172, local15) - Static329.anInt6648;
		if (Static443.anInt8237 >= 100) {
			Static621.anInt10870 = Static590.anInt10439 * 512 + 256;
			Static135.anInt3347 = Static489.anInt9048 * 512 + 256;
			Static639.anInt11034 = Static590.method8716(Static135.anInt3347, Static12.anInt172, Static621.anInt10870) - Static329.anInt6648;
		} else {
			if (Static135.anInt3347 < local9) {
				Static135.anInt3347 += Static607.anInt10664 + Static443.anInt8237 * (local9 - Static135.anInt3347) / 1000;
				if (Static135.anInt3347 > local9) {
					Static135.anInt3347 = local9;
				}
			}
			if (local9 < Static135.anInt3347) {
				Static135.anInt3347 -= Static607.anInt10664 + Static443.anInt8237 * (Static135.anInt3347 - local9) / 1000;
				if (local9 > Static135.anInt3347) {
					Static135.anInt3347 = local9;
				}
			}
			if (local24 > Static639.anInt11034) {
				Static639.anInt11034 += (local24 - Static639.anInt11034) * Static443.anInt8237 / 1000 + Static607.anInt10664;
				if (local24 < Static639.anInt11034) {
					Static639.anInt11034 = local24;
				}
			}
			if (local15 > Static621.anInt10870) {
				Static621.anInt10870 += Static607.anInt10664 + (local15 - Static621.anInt10870) * Static443.anInt8237 / 1000;
				if (Static621.anInt10870 > local15) {
					Static621.anInt10870 = local15;
				}
			}
			if (Static639.anInt11034 > local24) {
				Static639.anInt11034 -= (Static639.anInt11034 - local24) * Static443.anInt8237 / 1000 + Static607.anInt10664;
				if (Static639.anInt11034 < local24) {
					Static639.anInt11034 = local24;
				}
			}
			if (Static621.anInt10870 > local15) {
				Static621.anInt10870 -= Static607.anInt10664 + (Static621.anInt10870 - local15) * Static443.anInt8237 / 1000;
				if (local15 > Static621.anInt10870) {
					Static621.anInt10870 = local15;
				}
			}
		}
		local15 = Static596.anInt10491 * 512 + 256;
		local9 = Static129.anInt3274 * 512 + 256;
		local24 = Static590.method8716(local9, Static12.anInt172, local15) - Static369.anInt7338;
		@Pc(229) int local229 = local9 - Static135.anInt3347;
		@Pc(234) int local234 = local24 - Static639.anInt11034;
		@Pc(239) int local239 = local15 - Static621.anInt10870;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local229 * local229 + local239 * local239));
		@Pc(262) int local262 = (int) (Math.atan2((double) local234, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		@Pc(283) int local283 = (int) (-2607.5945876176133D * Math.atan2((double) local229, (double) local239)) & 0x3FFF;
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (Static266.anInt5673 < local262) {
			Static266.anInt5673 += Static26.anInt546 * (local262 - Static266.anInt5673 >> 3) / 1000 + Static407.anInt7708 << 3;
			if (Static266.anInt5673 > local262) {
				Static266.anInt5673 = local262;
			}
		}
		if (local262 < Static266.anInt5673) {
			Static266.anInt5673 -= (Static266.anInt5673 - local262 >> 3) * Static26.anInt546 / 1000 + Static407.anInt7708 << 3;
			if (local262 > Static266.anInt5673) {
				Static266.anInt5673 = local262;
			}
		}
		@Pc(358) int local358 = local283 - Static189.anInt11070;
		if (local358 > 8192) {
			local358 -= 16384;
		}
		if (local358 < -8192) {
			local358 += 16384;
		}
		local358 >>= 0x3;
		if (local358 > 0) {
			Static189.anInt11070 += Static407.anInt7708 + Static26.anInt546 * local358 / 1000 << 3;
			Static189.anInt11070 &= 0x3FFF;
		}
		if (local358 < 0) {
			Static189.anInt11070 -= Static407.anInt7708 + -local358 * Static26.anInt546 / 1000 << 3;
			Static189.anInt11070 &= 0x3FFF;
		}
		@Pc(415) int local415 = local283 - Static189.anInt11070;
		if (local415 > 8192) {
			local415 -= 16384;
		}
		if (local415 < -8192) {
			local415 += 16384;
		}
		Static113.anInt3037 = 0;
		if (local415 < 0 && local358 > 0 || local415 > 0 && local358 < 0) {
			Static189.anInt11070 = local283;
		}
	}
}
