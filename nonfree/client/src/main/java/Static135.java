import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public static int anInt2790 = 100;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_940 = Static186.method3527("mapflag");

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "[I")
	public static int[] anIntArray296 = new int[100];

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "Lclient!hh;")
	private static Class50 aClass50_941 = Static186.method3527(" )2> ");

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "Lclient!hh;")
	public static Class50 aClass50_942 = Static186.method3527("Benutzen");

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method2280() {
		for (@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static40.aClass75_4.method2239(); local10 != null; local10 = (Class1_Sub1_Sub9) Static40.aClass75_4.method2238()) {
			@Pc(15) Class20_Sub7 local15 = local10.aClass20_Sub7_1;
			if (Static212.anInt4195 != local15.anInt4443 || local15.aBoolean216) {
				local10.method3525();
			} else if (local15.anInt4447 <= Static107.anInt2132) {
				local15.method3500(Static42.anInt921);
				if (local15.aBoolean216) {
					local10.method3525();
				} else {
					Static229.method3476(local15.anInt4443, local15.anInt4435, local15.anInt4441, local15.anInt4434, 60, local15, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILclient!qh;)V")
	public static void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class93 arg2) {
		if (arg2.anInt3621 == 1) {
			Static150.method2516(Static7.aClass50_69, 0, 0L, arg2.aClass50_1199, (short) 4, arg2.anInt3603);
		}
		if (arg2.anInt3621 == 2 && !Static234.aBoolean218) {
			@Pc(37) Class50 local37 = Static197.method3491(arg2);
			if (local37 != null) {
				Static150.method2516(Static17.method257(new Class50[] { Static104.aClass50_675, arg2.aClass50_1194 }), -1, 0L, local37, (short) 47, arg2.anInt3603);
			}
		}
		if (arg2.anInt3621 == 3) {
			Static150.method2516(Static7.aClass50_69, 0, 0L, Static133.aClass50_927, (short) 33, arg2.anInt3603);
		}
		if (arg2.anInt3621 == 4) {
			Static150.method2516(Static7.aClass50_69, 0, 0L, arg2.aClass50_1199, (short) 16, arg2.anInt3603);
		}
		if (arg2.anInt3621 == 5) {
			Static150.method2516(Static7.aClass50_69, 0, 0L, arg2.aClass50_1199, (short) 26, arg2.anInt3603);
		}
		if (arg2.anInt3621 == 6 && Static199.aClass93_112 == null) {
			Static150.method2516(Static7.aClass50_69, -1, 0L, arg2.aClass50_1199, (short) 58, arg2.anInt3603);
		}
		@Pc(159) int local159;
		@Pc(153) int local153;
		if (arg2.anInt3656 == 2) {
			local153 = 0;
			for (@Pc(155) int local155 = 0; local155 < arg2.anInt3640; local155++) {
				for (local159 = 0; local159 < arg2.anInt3669; local159++) {
					@Pc(168) int local168 = local155 * (arg2.anInt3641 + 32);
					@Pc(176) int local176 = local159 * (arg2.anInt3655 + 32);
					if (local153 < 20) {
						local168 += arg2.anIntArray395[local153];
						local176 += arg2.anIntArray389[local153];
					}
					if (local176 <= arg0 && local168 <= arg1 && arg0 < local176 + 32 && arg1 < local168 + 32) {
						Static116.anInt2294 = local153;
						Static197.aClass93_124 = arg2;
						if (arg2.anIntArray392[local153] > 0) {
							@Pc(244) Class70 local244 = Static16.method227(arg2.anIntArray392[local153] - 1);
							if (Static123.anInt1750 == 1 && Static138.method2295(Static35.method552(arg2))) {
								if (Static110.anInt2200 != arg2.anInt3603 || local153 != Static165.anInt2639) {
									Static150.method2516(Static17.method257(new Class50[] { Static234.aClass50_1437, Static159.aClass50_1342, local244.aClass50_833 }), local153, (long) local244.anInt2421, Static125.aClass50_864, (short) 7, arg2.anInt3603);
								}
							} else if (!Static234.aBoolean218 || !Static138.method2295(Static35.method552(arg2))) {
								@Pc(306) Class50[] local306 = local244.aClass50Array45;
								if (Static183.aBoolean172) {
									local306 = Static73.method2566(local306);
								}
								@Pc(321) int local321;
								@Pc(372) byte local372;
								if (Static138.method2295(Static35.method552(arg2))) {
									for (local321 = 4; local321 >= 3; local321--) {
										if (local306 != null && local306[local321] != null) {
											if (local321 == 3) {
												local372 = 12;
											} else {
												local372 = 42;
											}
											Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, local306[local321], local372, arg2.anInt3603);
										} else if (local321 == 4) {
											Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, Static19.aClass50_158, (short) 42, arg2.anInt3603);
										}
									}
								}
								if (Static185.method3082(Static35.method552(arg2))) {
									Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, Static125.aClass50_864, (short) 17, arg2.anInt3603);
								}
								if (Static138.method2295(Static35.method552(arg2)) && local306 != null) {
									for (local321 = 2; local321 >= 0; local321--) {
										if (local306[local321] != null) {
											local372 = 0;
											if (local321 == 0) {
												local372 = 36;
											}
											if (local321 == 1) {
												local372 = 30;
											}
											if (local321 == 2) {
												local372 = 9;
											}
											Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, local306[local321], local372, arg2.anInt3603);
										}
									}
								}
								local306 = arg2.aClass50Array68;
								if (Static183.aBoolean172) {
									local306 = Static73.method2566(local306);
								}
								if (local306 != null) {
									for (local321 = 4; local321 >= 0; local321--) {
										if (local306[local321] != null) {
											local372 = 0;
											if (local321 == 0) {
												local372 = 20;
											}
											if (local321 == 1) {
												local372 = 14;
											}
											if (local321 == 2) {
												local372 = 37;
											}
											if (local321 == 3) {
												local372 = 51;
											}
											if (local321 == 4) {
												local372 = 31;
											}
											Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, local306[local321], local372, arg2.anInt3603);
										}
									}
								}
								Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local244.aClass50_833 }), local153, (long) local244.anInt2421, Static211.aClass50_1330, (short) 1004, arg2.anInt3603);
							} else if ((Static58.anInt1154 & 0x10) == 16) {
								Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, Static159.aClass50_1342, local244.aClass50_833 }), local153, (long) local244.anInt2421, Static148.aClass50_1016, (short) 24, arg2.anInt3603);
							}
						}
					}
					local153++;
				}
			}
		}
		if (!arg2.aBoolean156) {
			return;
		}
		if (!Static234.aBoolean218) {
			@Pc(745) Class50 local745;
			for (local153 = 9; local153 >= 5; local153--) {
				local745 = Static218.method2871(arg2, local153);
				if (local745 != null) {
					Static150.method2516(arg2.aClass50_1197, arg2.anInt3614, (long) (local153 + 1), local745, (short) 1007, arg2.anInt3603);
				}
			}
			local745 = Static197.method3491(arg2);
			if (local745 != null) {
				Static150.method2516(arg2.aClass50_1197, arg2.anInt3614, 0L, local745, (short) 47, arg2.anInt3603);
			}
			for (local159 = 4; local159 >= 0; local159--) {
				@Pc(799) Class50 local799 = Static218.method2871(arg2, local159);
				if (local799 != null) {
					Static150.method2516(arg2.aClass50_1197, arg2.anInt3614, (long) (local159 + 1), local799, (short) 19, arg2.anInt3603);
				}
			}
			if (Static181.method2967(Static35.method552(arg2))) {
				Static150.method2516(Static7.aClass50_69, arg2.anInt3614, 0L, Static32.aClass50_229, (short) 58, arg2.anInt3603);
			}
		} else if (Static156.method2575(Static35.method552(arg2)) && (Static58.anInt1154 & 0x20) == 32) {
			Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, aClass50_941, arg2.aClass50_1197 }), arg2.anInt3614, 0L, Static148.aClass50_1016, (short) 44, arg2.anInt3603);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!pa;IB)Lclient!rh;")
	public static Class78_Sub1 method2283(@OriginalArg(1) Class86 arg0, @OriginalArg(2) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static128.method2039() : null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILclient!pa;)[Lclient!vf;")
	public static Class1_Sub1_Sub8[] method2285(@OriginalArg(0) int arg0, @OriginalArg(3) Class86 arg1) {
		return Static139.method2305(arg1, arg0) ? Static84.method1214() : null;
	}
}
