import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt2443;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public static int anInt2445;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	public static int anInt2447;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
	public static int anInt2452;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method1948(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(9) int local9 = arg0.method5033();
		Static357.aClass13Array1 = new Class13[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static357.aClass13Array1[local14] = new Class13();
			Static357.aClass13Array1[local14].anInt196 = arg0.method5033();
			Static357.aClass13Array1[local14].aString3 = arg0.method5015();
		}
		Static137.anInt2495 = arg0.method5033();
		Static338.anInt5506 = arg0.method5033();
		Static275.anInt4587 = arg0.method5033();
		Static12.aClass176_Sub1Array1 = new Class176_Sub1[Static338.anInt5506 + 1 - Static137.anInt2495];
		for (@Pc(74) int local74 = 0; local74 < Static275.anInt4587; local74++) {
			@Pc(80) int local80 = arg0.method5033();
			@Pc(88) Class176_Sub1 local88 = Static12.aClass176_Sub1Array1[local80] = new Class176_Sub1();
			local88.anInt4257 = arg0.method5007();
			local88.anInt4258 = arg0.method4997();
			local88.anInt4262 = local80 + Static137.anInt2495;
			local88.aString35 = arg0.method5015();
			local88.aString34 = arg0.method5015();
		}
		anInt2443 = arg0.method4997();
		Static327.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)Z")
	public static boolean method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static337.method4459(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static145.anInt2581;
		@Pc(14) int local14 = arg2 << Static145.anInt2581;
		@Pc(23) int local23 = Static278.aClass41Array3[arg0].l(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static145.anInt2581 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static145.anInt2581 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static145.anInt2581 - 7);
		if (arg3 == 1) {
			if (local10 > Static35.anInt570) {
				if (!Static183.method2543(local10, local23, local14)) {
					return false;
				}
				if (!Static183.method2543(local10, local23, local14 + Static390.anInt7654)) {
					return false;
				}
				if (!Static183.method2543(local10, local23, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static183.method2543(local10, local31, local14)) {
					return false;
				}
				if (!Static183.method2543(local10, local31, local14 + Static390.anInt7654)) {
					return false;
				}
				if (!Static183.method2543(local10, local31, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (!Static183.method2543(local10, local39, local14)) {
				return false;
			} else if (Static183.method2543(local10, local39, local14 + Static390.anInt7654)) {
				return Static183.method2543(local10, local39, local14 + Static416.anInt7020);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static70.anInt1418) {
				if (!Static183.method2543(local10, local23, local14 + Static416.anInt7020)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static390.anInt7654, local23, local14 + Static416.anInt7020)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local23, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static183.method2543(local10, local31, local14 + Static416.anInt7020)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static390.anInt7654, local31, local14 + Static416.anInt7020)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local31, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (!Static183.method2543(local10, local39, local14 + Static416.anInt7020)) {
				return false;
			} else if (Static183.method2543(local10 + Static390.anInt7654, local39, local14 + Static416.anInt7020)) {
				return Static183.method2543(local10 + Static416.anInt7020, local39, local14 + Static416.anInt7020);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static35.anInt570) {
				if (!Static183.method2543(local10 + Static416.anInt7020, local23, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local23, local14 + Static390.anInt7654)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local23, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static183.method2543(local10 + Static416.anInt7020, local31, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local31, local14 + Static390.anInt7654)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local31, local14 + Static416.anInt7020)) {
					return false;
				}
			}
			if (!Static183.method2543(local10 + Static416.anInt7020, local39, local14)) {
				return false;
			} else if (Static183.method2543(local10 + Static416.anInt7020, local39, local14 + Static390.anInt7654)) {
				return Static183.method2543(local10 + Static416.anInt7020, local39, local14 + Static416.anInt7020);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static70.anInt1418) {
				if (!Static183.method2543(local10, local23, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static390.anInt7654, local23, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static183.method2543(local10, local31, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static390.anInt7654, local31, local14)) {
					return false;
				}
				if (!Static183.method2543(local10 + Static416.anInt7020, local31, local14)) {
					return false;
				}
			}
			if (!Static183.method2543(local10, local39, local14)) {
				return false;
			} else if (Static183.method2543(local10 + Static390.anInt7654, local39, local14)) {
				return Static183.method2543(local10 + Static416.anInt7020, local39, local14);
			} else {
				return false;
			}
		} else if (!Static183.method2543(local10 + Static390.anInt7654, local47, local14 + Static390.anInt7654)) {
			return false;
		} else if (arg3 == 16) {
			return Static183.method2543(local10, local39, local14 + Static416.anInt7020);
		} else if (arg3 == 32) {
			return Static183.method2543(local10 + Static416.anInt7020, local39, local14 + Static416.anInt7020);
		} else if (arg3 == 64) {
			return Static183.method2543(local10 + Static416.anInt7020, local39, local14);
		} else if (arg3 == 128) {
			return Static183.method2543(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)I")
	public static int method1950(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
