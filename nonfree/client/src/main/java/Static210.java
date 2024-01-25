import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[S")
	public static short[] aShortArray70;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "[I")
	public static final int[] anIntArray326 = new int[200];

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!vp;")
	public static Class309 method3818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class309 local12 = Static80.method2005(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.lb == null || arg1 >= local12.lb.length) {
			return null;
		} else {
			return local12.lb[arg1];
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)I")
	public static int method3821(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public static void method3823() {
		@Pc(9) int local9 = Static404.anInt9256 * 128 + 64;
		@Pc(15) int local15 = Static413.anInt7200 * 128 + 64;
		@Pc(23) int local23 = Static74.method1954(Static245.anInt4747, local15, local9) - Static56.anInt1561;
		if (Static19.anInt866 < 100) {
			if (Static308.anInt5918 < local9) {
				Static308.anInt5918 += Static4.anInt95 + (local9 - Static308.anInt5918) * Static19.anInt866 / 1000;
				if (Static308.anInt5918 > local9) {
					Static308.anInt5918 = local9;
				}
			}
			if (local9 < Static308.anInt5918) {
				Static308.anInt5918 -= Static4.anInt95 + Static19.anInt866 * (Static308.anInt5918 - local9) / 1000;
				if (Static308.anInt5918 < local9) {
					Static308.anInt5918 = local9;
				}
			}
			if (Static520.anInt8842 < local23) {
				Static520.anInt8842 += Static19.anInt866 * (local23 - Static520.anInt8842) / 1000 + Static4.anInt95;
				if (Static520.anInt8842 > local23) {
					Static520.anInt8842 = local23;
				}
			}
			if (Static520.anInt8842 > local23) {
				Static520.anInt8842 -= Static19.anInt866 * (Static520.anInt8842 - local23) / 1000 + Static4.anInt95;
				if (local23 > Static520.anInt8842) {
					Static520.anInt8842 = local23;
				}
			}
			if (Static347.anInt6404 < local15) {
				Static347.anInt6404 += (local15 - Static347.anInt6404) * Static19.anInt866 / 1000 + Static4.anInt95;
				if (Static347.anInt6404 > local15) {
					Static347.anInt6404 = local15;
				}
			}
			if (local15 < Static347.anInt6404) {
				Static347.anInt6404 -= Static4.anInt95 + (Static347.anInt6404 - local15) * Static19.anInt866 / 1000;
				if (Static347.anInt6404 < local15) {
					Static347.anInt6404 = local15;
				}
			}
		} else {
			Static347.anInt6404 = Static413.anInt7200 * 128 + 64;
			Static308.anInt5918 = Static404.anInt9256 * 128 + 64;
			Static520.anInt8842 = Static74.method1954(Static245.anInt4747, Static347.anInt6404, Static308.anInt5918) - Static56.anInt1561;
		}
		local15 = Static382.anInt6686 * 128 + 64;
		local9 = Static110.anInt2572 * 128 + 64;
		local23 = Static74.method1954(Static245.anInt4747, local15, local9) - Static217.anInt4444;
		@Pc(215) int local215 = local9 - Static308.anInt5918;
		@Pc(219) int local219 = local23 - Static520.anInt8842;
		@Pc(224) int local224 = local15 - Static347.anInt6404;
		@Pc(235) int local235 = (int) Math.sqrt((double) (local224 * local224 + local215 * local215));
		@Pc(246) int local246 = (int) (Math.atan2((double) local219, (double) local235) * 2607.5945876176133D) & 0x3FFF;
		if (local246 < 1024) {
			local246 = 1024;
		}
		@Pc(264) int local264 = (int) (-2607.5945876176133D * Math.atan2((double) local215, (double) local224)) & 0x3FFF;
		if (local246 > 3072) {
			local246 = 3072;
		}
		if (Static411.anInt7178 < local246) {
			Static411.anInt7178 += Static97.anInt6559 * (local246 - Static411.anInt7178 >> 3) / 1000 + Static501.anInt8508 << 3;
			if (local246 < Static411.anInt7178) {
				Static411.anInt7178 = local246;
			}
		}
		if (Static411.anInt7178 > local246) {
			Static411.anInt7178 -= Static501.anInt8508 + (Static411.anInt7178 - local246 >> 3) * Static97.anInt6559 / 1000 << 3;
			if (local246 > Static411.anInt7178) {
				Static411.anInt7178 = local246;
			}
		}
		@Pc(334) int local334 = local264 - Static339.anInt6337;
		if (local334 > 8192) {
			local334 -= 16384;
		}
		if (local334 < -8192) {
			local334 += 16384;
		}
		local334 >>= 0x3;
		if (local334 > 0) {
			Static339.anInt6337 += Static501.anInt8508 + Static97.anInt6559 * local334 / 1000 << 3;
			Static339.anInt6337 &= 0x3FFF;
		}
		if (local334 < 0) {
			Static339.anInt6337 -= Static501.anInt8508 + Static97.anInt6559 * -local334 / 1000 << 3;
			Static339.anInt6337 &= 0x3FFF;
		}
		@Pc(392) int local392 = local264 - Static339.anInt6337;
		if (local392 > 8192) {
			local392 -= 16384;
		}
		if (local392 < -8192) {
			local392 += 16384;
		}
		if (local392 < 0 && local334 > 0 || local392 > 0 && local334 < 0) {
			Static339.anInt6337 = local264;
		}
		Static304.anInt5875 = 0;
	}
}
