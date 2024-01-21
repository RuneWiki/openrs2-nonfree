import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ca", name = "Bc", descriptor = "Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 aClass4_Sub4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "Cc", descriptor = "I")
	public static int anInt427;

	@OriginalMember(owner = "client!ca", name = "Hc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_146 = Static121.method2047("<col=ff3000>");

	@OriginalMember(owner = "client!ca", name = "Ic", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!ca", name = "Lc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_147 = Static121.method2047("title)3jpg");

	@OriginalMember(owner = "client!ca", name = "Nc", descriptor = "Z")
	public static boolean aBoolean14 = true;

	@OriginalMember(owner = "client!ca", name = "Oc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_148 = Static121.method2047("runes");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!q;)Z")
	public static boolean method277(@OriginalArg(1) Class4_Sub17 arg0) {
		if (Static128.aBoolean113) {
			if (Static73.method1384(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2231 == 0) {
				return false;
			}
		}
		return arg0.aBoolean96;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(JZ)V")
	public static void method278(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static31.method597(arg0 - 1L);
			Static31.method597(1L);
		} else {
			Static31.method597(arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!lc;II)Z")
	public static boolean method279(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method1110(arg2, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static127.method2106(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method280(@OriginalArg(1) Class4_Sub4_Sub1_Sub2 arg0) {
		arg0.anInt2632 = arg0.anInt2594;
		if (arg0.anInt2600 == 0) {
			arg0.anInt2587 = 0;
			return;
		}
		if (arg0.anInt2633 != -1 && arg0.anInt2645 == 0) {
			@Pc(34) Class4_Sub4_Sub14 local34 = Static127.method2102(arg0.anInt2633);
			if (arg0.anInt2599 > 0 && local34.anInt2709 == 0) {
				arg0.anInt2587++;
				return;
			}
			if (arg0.anInt2599 <= 0 && local34.anInt2722 == 0) {
				arg0.anInt2587++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt2620;
		@Pc(72) int local72 = arg0.anInt2601;
		@Pc(88) int local88 = arg0.anIntArray286[arg0.anInt2600 - 1] * 128 + arg0.anInt2612 * 64;
		@Pc(103) int local103 = arg0.anIntArray288[arg0.anInt2600 - 1] * 128 + arg0.anInt2612 * 64;
		if (local88 - local69 > 256 || local88 - local69 < -256 || local103 - local72 > 256 || local103 - local72 < -256) {
			arg0.anInt2601 = local103;
			arg0.anInt2620 = local88;
			return;
		}
		if (local69 >= local88) {
			if (local88 < local69) {
				if (local72 < local103) {
					arg0.anInt2634 = 768;
				} else if (local72 > local103) {
					arg0.anInt2634 = 256;
				} else {
					arg0.anInt2634 = 512;
				}
			} else if (local72 < local103) {
				arg0.anInt2634 = 1024;
			} else if (local103 < local72) {
				arg0.anInt2634 = 0;
			}
		} else if (local103 > local72) {
			arg0.anInt2634 = 1280;
		} else if (local72 <= local103) {
			arg0.anInt2634 = 1536;
		} else {
			arg0.anInt2634 = 1792;
		}
		@Pc(223) int local223 = arg0.anInt2634 - arg0.anInt2591 & 0x7FF;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		@Pc(235) int local235 = arg0.anInt2606;
		@Pc(237) int local237 = 4;
		if (local223 >= -256 && local223 <= 256) {
			local235 = arg0.anInt2637;
		} else if (local223 >= 256 && local223 < 768) {
			local235 = arg0.anInt2647;
		} else if (local223 >= -768 && local223 <= -256) {
			local235 = arg0.anInt2613;
		}
		@Pc(274) boolean local274 = true;
		if (local235 == -1) {
			local235 = arg0.anInt2637;
		}
		arg0.anInt2632 = local235;
		if (arg0 instanceof Class4_Sub4_Sub1_Sub2_Sub1) {
			local274 = ((Class4_Sub4_Sub1_Sub2_Sub1) arg0).aClass4_Sub4_Sub11_1.aBoolean85;
		}
		if (local274) {
			if (arg0.anInt2634 != arg0.anInt2591 && arg0.anInt2625 == -1 && arg0.anInt2628 != 0) {
				local237 = 2;
			}
			if (arg0.anInt2600 > 2) {
				local237 = 6;
			}
			if (arg0.anInt2600 > 3) {
				local237 = 8;
			}
			if (arg0.anInt2587 > 0 && arg0.anInt2600 > 1) {
				local237 = 8;
				arg0.anInt2587--;
			}
		} else {
			if (arg0.anInt2600 > 1) {
				local237 = 6;
			}
			if (arg0.anInt2600 > 2) {
				local237 = 8;
			}
			if (arg0.anInt2587 > 0 && arg0.anInt2600 > 1) {
				local237 = 8;
				arg0.anInt2587--;
			}
		}
		if (arg0.aBooleanArray17[arg0.anInt2600 - 1]) {
			local237 <<= 0x1;
		}
		if (local237 >= 8 && arg0.anInt2637 == arg0.anInt2632 && arg0.anInt2640 != -1) {
			arg0.anInt2632 = arg0.anInt2640;
		}
		if (local103 > local72) {
			arg0.anInt2601 += local237;
			if (arg0.anInt2601 > local103) {
				arg0.anInt2601 = local103;
			}
		} else if (local72 > local103) {
			arg0.anInt2601 -= local237;
			if (local103 > arg0.anInt2601) {
				arg0.anInt2601 = local103;
			}
		}
		if (local69 < local88) {
			arg0.anInt2620 += local237;
			if (local88 < arg0.anInt2620) {
				arg0.anInt2620 = local88;
			}
		} else if (local88 < local69) {
			arg0.anInt2620 -= local237;
			if (arg0.anInt2620 < local88) {
				arg0.anInt2620 = local88;
			}
		}
		if (arg0.anInt2620 != local88 || local103 != arg0.anInt2601) {
			return;
		}
		arg0.anInt2600--;
		if (arg0.anInt2599 > 0) {
			arg0.anInt2599--;
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method281() {
		aClass60_147 = null;
		aClass60_146 = null;
		aClass4_Sub4_Sub3_Sub1_1 = null;
		aClass60_148 = null;
	}
}
