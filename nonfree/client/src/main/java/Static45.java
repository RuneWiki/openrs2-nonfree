import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!df", name = "O", descriptor = "Lclient!km;")
	public static Class91 aClass91_43;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "I")
	public static int anInt1101 = 0;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString63 = "Loading fonts - ";

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)I")
	public static int method910() {
		return Static219.anInt4355;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!in;I)V")
	public static void method911(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt2715 == 1) {
			Static181.method3039((short) 14, -1, arg1.aString158, arg1.anInt2655, 0L, "", 0);
		}
		@Pc(36) String local36;
		if (arg1.anInt2715 == 2 && !Static125.aBoolean209) {
			local36 = Static286.method4316(arg1);
			if (local36 != null) {
				Static181.method3039((short) 46, -1, local36, arg1.anInt2655, 0L, "<col=00ff00>" + arg1.aString153, -1);
			}
		}
		if (arg1.anInt2715 == 3) {
			Static181.method3039((short) 45, -1, Static111.aString148, arg1.anInt2655, 0L, "", 0);
		}
		if (arg1.anInt2715 == 4) {
			Static181.method3039((short) 29, -1, arg1.aString158, arg1.anInt2655, 0L, "", 0);
		}
		if (arg1.anInt2715 == 5) {
			Static181.method3039((short) 10, -1, arg1.aString158, arg1.anInt2655, 0L, "", 0);
		}
		if (arg1.anInt2715 == 6 && Static3.aClass71_1 == null) {
			Static181.method3039((short) 50, -1, arg1.aString158, arg1.anInt2655, 0L, "", -1);
		}
		@Pc(163) int local163;
		@Pc(161) int local161;
		if (arg1.anInt2712 == 2) {
			local161 = 0;
			for (local163 = 0; local163 < arg1.anInt2669; local163++) {
				for (@Pc(173) int local173 = 0; local173 < arg1.anInt2706; local173++) {
					@Pc(184) int local184 = (arg1.anInt2648 + 32) * local173;
					@Pc(191) int local191 = local163 * (arg1.anInt2679 + 32);
					if (local161 < 20) {
						local184 += arg1.anIntArray238[local161];
						local191 += arg1.anIntArray249[local161];
					}
					if (arg0 >= local184 && arg2 >= local191 && arg0 < local184 + 32 && arg2 < local191 + 32) {
						Static222.aClass71_19 = arg1;
						Static53.anInt5279 = local161;
						if (arg1.anIntArray243[local161] > 0) {
							@Pc(247) Class1_Sub15 local247 = Static36.method769(arg1);
							@Pc(256) Class42 local256 = Static112.method2060(arg1.anIntArray243[local161] - 1);
							if (Static191.anInt3934 == 1 && local247.method1374()) {
								if (arg1.anInt2655 != Static105.anInt2467 || local161 != Static91.anInt2041) {
									Static181.method3039((short) 36, -1, Static163.aString203, arg1.anInt2655, (long) local256.anInt1497, Static194.aString237 + " -> <col=ff9040>" + local256.aString87, local161);
								}
							} else if (Static125.aBoolean209 && local247.method1374()) {
								@Pc(318) Class1_Sub2_Sub12 local318 = Static13.anInt260 == -1 ? null : Static31.method645(Static13.anInt260);
								if ((Static10.anInt246 & 0x10) != 0 && (local318 == null || local256.method1254(local318.anInt2582, Static13.anInt260) != local318.anInt2582)) {
									Static181.method3039((short) 4, Static54.anInt1188, Static8.aString15, arg1.anInt2655, (long) local256.anInt1497, Static170.aString213 + " -> <col=ff9040>" + local256.aString87, local161);
								}
							} else {
								@Pc(369) String[] local369 = local256.aStringArray19;
								if (Static21.aBoolean33) {
									local369 = Static191.method3156(local369);
								}
								@Pc(385) int local385;
								@Pc(404) byte local404;
								if (local247.method1374()) {
									for (local385 = 4; local385 >= 3; local385--) {
										if (local369 != null && local369[local385] != null) {
											if (local385 == 3) {
												local404 = 25;
											} else {
												local404 = 21;
											}
											Static181.method3039(local404, -1, local369[local385], arg1.anInt2655, (long) local256.anInt1497, "<col=ff9040>" + local256.aString87, local161);
										}
									}
								}
								if (local247.method1372()) {
									Static181.method3039((short) 28, Static162.anInt3469, Static163.aString203, arg1.anInt2655, (long) local256.anInt1497, "<col=ff9040>" + local256.aString87, local161);
								}
								if (local247.method1374() && local369 != null) {
									for (local385 = 2; local385 >= 0; local385--) {
										if (local369[local385] != null) {
											local404 = 0;
											if (local385 == 0) {
												local404 = 17;
											}
											if (local385 == 1) {
												local404 = 24;
											}
											if (local385 == 2) {
												local404 = 44;
											}
											Static181.method3039(local404, -1, local369[local385], arg1.anInt2655, (long) local256.anInt1497, "<col=ff9040>" + local256.aString87, local161);
										}
									}
								}
								local369 = arg1.aStringArray34;
								if (Static21.aBoolean33) {
									local369 = Static191.method3156(local369);
								}
								if (local369 != null) {
									for (local385 = 4; local385 >= 0; local385--) {
										if (local369[local385] != null) {
											local404 = 0;
											if (local385 == 0) {
												local404 = 23;
											}
											if (local385 == 1) {
												local404 = 1;
											}
											if (local385 == 2) {
												local404 = 41;
											}
											if (local385 == 3) {
												local404 = 33;
											}
											if (local385 == 4) {
												local404 = 22;
											}
											Static181.method3039(local404, -1, local369[local385], arg1.anInt2655, (long) local256.anInt1497, "<col=ff9040>" + local256.aString87, local161);
										}
									}
								}
								Static181.method3039((short) 1003, Static151.anInt5601, Static176.aString219, arg1.anInt2655, (long) local256.anInt1497, "<col=ff9040>" + local256.aString87, local161);
							}
						}
					}
					local161++;
				}
			}
		}
		if (!arg1.aBoolean196) {
			return;
		}
		if (!Static125.aBoolean209) {
			for (local161 = 9; local161 >= 5; local161--) {
				@Pc(665) String local665 = Static160.method2781(arg1, local161);
				if (local665 != null) {
					Static181.method3039((short) 1002, Static165.method2855(local161, arg1), local665, arg1.anInt2655, (long) (local161 + 1), arg1.aString154, arg1.anInt2689);
				}
			}
			local36 = Static286.method4316(arg1);
			if (local36 != null) {
				Static181.method3039((short) 46, -1, local36, arg1.anInt2655, 0L, arg1.aString154, arg1.anInt2689);
			}
			for (local163 = 4; local163 >= 0; local163--) {
				@Pc(726) String local726 = Static160.method2781(arg1, local163);
				if (local726 != null) {
					Static181.method3039((short) 13, Static165.method2855(local163, arg1), local726, arg1.anInt2655, (long) (local163 + 1), arg1.aString154, arg1.anInt2689);
				}
			}
			if (Static36.method769(arg1).method1367()) {
				if (arg1.aString152 == null) {
					Static181.method3039((short) 50, -1, Static36.aString49, arg1.anInt2655, 0L, "", arg1.anInt2689);
				} else {
					Static181.method3039((short) 50, -1, arg1.aString152, arg1.anInt2655, 0L, "", arg1.anInt2689);
				}
			}
		} else if (Static36.method769(arg1).method1368() && (Static10.anInt246 & 0x20) != 0) {
			Static181.method3039((short) 31, Static54.anInt1188, Static8.aString15, arg1.anInt2655, 0L, Static170.aString213 + " -> " + arg1.aString154, arg1.anInt2689);
		}
	}
}
