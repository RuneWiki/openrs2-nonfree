import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static int anInt2567;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_759 = Static81.method1507("Die Verbindung konnte");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[Lclient!fj;")
	public static final Class1_Sub7[] aClass1_Sub7Array1 = new Class1_Sub7[2048];

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
	public static final int[] anIntArray203 = new int[100];

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_760 = Static81.method1507("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_761 = Static81.method1507("::fpson");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	public static boolean method1974(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!vc;II)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4418 == 1) {
			Static104.method1811(0L, arg1.aClass24_1257, (short) 50, 0, Static85.aClass24_1000, arg1.anInt4357);
		}
		if (arg1.anInt4418 == 2 && !Static178.aBoolean185) {
			@Pc(35) Class24 local35 = Static63.method1277(arg1);
			if (local35 != null) {
				Static104.method1811(0L, local35, (short) 33, -1, Static63.method1281(new Class24[] { Static158.aClass24_1020, arg1.aClass24_1259 }), arg1.anInt4357);
			}
		}
		if (arg1.anInt4418 == 3) {
			Static104.method1811(0L, Static103.aClass24_690, (short) 1, 0, Static85.aClass24_1000, arg1.anInt4357);
		}
		if (arg1.anInt4418 == 4) {
			Static104.method1811(0L, arg1.aClass24_1257, (short) 34, 0, Static85.aClass24_1000, arg1.anInt4357);
		}
		if (arg1.anInt4418 == 5) {
			Static104.method1811(0L, arg1.aClass24_1257, (short) 57, 0, Static85.aClass24_1000, arg1.anInt4357);
		}
		if (arg1.anInt4418 == 6 && Static10.aClass98_10 == null) {
			Static104.method1811(0L, arg1.aClass24_1257, (short) 24, -1, Static85.aClass24_1000, arg1.anInt4357);
		}
		@Pc(159) int local159;
		@Pc(153) int local153;
		if (arg1.anInt4373 == 2) {
			local153 = 0;
			for (@Pc(155) int local155 = 0; local155 < arg1.anInt4417; local155++) {
				for (local159 = 0; local159 < arg1.anInt4405; local159++) {
					@Pc(169) int local169 = local159 * (arg1.anInt4410 + 32);
					@Pc(176) int local176 = (arg1.anInt4392 + 32) * local155;
					if (local153 < 20) {
						local176 += arg1.anIntArray391[local153];
						local169 += arg1.anIntArray390[local153];
					}
					if (local169 <= arg2 && local176 <= arg0 && local169 + 32 > arg2 && arg0 < local176 + 32) {
						Static35.aClass98_16 = arg1;
						Static28.anInt729 = local153;
						if (arg1.anIntArray393[local153] > 0) {
							@Pc(244) Class1_Sub2_Sub23 local244 = Static168.method2886(arg1.anIntArray393[local153] - 1);
							if (Static36.anInt973 == 1 && Static50.method912(Static105.method1831(arg1))) {
								if (Static150.anInt3363 != arg1.anInt4357 || Static115.anInt2585 != local153) {
									Static104.method1811((long) local244.anInt4234, Static163.aClass24_1053, (short) 25, local153, Static63.method1281(new Class24[] { Static129.aClass24_858, Static85.aClass24_997, local244.aClass24_1214 }), arg1.anInt4357);
								}
							} else if (!Static178.aBoolean185 || !Static50.method912(Static105.method1831(arg1))) {
								@Pc(270) Class24[] local270 = local244.aClass24Array24;
								if (Static115.aBoolean118) {
									local270 = Static21.method475(local270);
								}
								@Pc(284) int local284;
								@Pc(303) byte local303;
								if (Static50.method912(Static105.method1831(arg1))) {
									for (local284 = 4; local284 >= 3; local284--) {
										if (local270 != null && local270[local284] != null) {
											if (local284 == 3) {
												local303 = 41;
											} else {
												local303 = 49;
											}
											Static104.method1811((long) local244.anInt4234, local270[local284], local303, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
										} else if (local284 == 4) {
											Static104.method1811((long) local244.anInt4234, Static107.aClass24_723, (short) 49, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
										}
									}
								}
								if (Static48.method882(Static105.method1831(arg1))) {
									Static104.method1811((long) local244.anInt4234, Static163.aClass24_1053, (short) 12, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
								}
								if (Static50.method912(Static105.method1831(arg1)) && local270 != null) {
									for (local284 = 2; local284 >= 0; local284--) {
										if (local270[local284] != null) {
											local303 = 0;
											if (local284 == 0) {
												local303 = 42;
											}
											if (local284 == 1) {
												local303 = 40;
											}
											if (local284 == 2) {
												local303 = 15;
											}
											Static104.method1811((long) local244.anInt4234, local270[local284], local303, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
										}
									}
								}
								local270 = arg1.aClass24Array28;
								if (Static115.aBoolean118) {
									local270 = Static21.method475(local270);
								}
								if (local270 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local270[local284] != null) {
											local303 = 0;
											if (local284 == 0) {
												local303 = 6;
											}
											if (local284 == 1) {
												local303 = 21;
											}
											if (local284 == 2) {
												local303 = 35;
											}
											if (local284 == 3) {
												local303 = 47;
											}
											if (local284 == 4) {
												local303 = 8;
											}
											Static104.method1811((long) local244.anInt4234, local270[local284], local303, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
										}
									}
								}
								Static104.method1811((long) local244.anInt4234, Static38.aClass24_245, (short) 1001, local153, Static63.method1281(new Class24[] { Static71.aClass24_526, local244.aClass24_1214 }), arg1.anInt4357);
							} else if ((Static4.anInt4608 & 0x10) == 16) {
								Static104.method1811((long) local244.anInt4234, Static102.aClass24_681, (short) 39, local153, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static85.aClass24_997, local244.aClass24_1214 }), arg1.anInt4357);
							}
						}
					}
					local153++;
				}
			}
		}
		if (!arg1.aBoolean211) {
			return;
		}
		if (!Static178.aBoolean185) {
			@Pc(690) Class24 local690;
			for (local153 = 9; local153 >= 5; local153--) {
				local690 = Static81.method1509(local153, arg1);
				if (local690 != null) {
					Static104.method1811((long) (local153 + 1), local690, (short) 1004, arg1.anInt4379, arg1.aClass24_1264, arg1.anInt4357);
				}
			}
			local690 = Static63.method1277(arg1);
			if (local690 != null) {
				Static104.method1811(0L, local690, (short) 33, arg1.anInt4379, arg1.aClass24_1264, arg1.anInt4357);
			}
			for (local159 = 4; local159 >= 0; local159--) {
				@Pc(746) Class24 local746 = Static81.method1509(local159, arg1);
				if (local746 != null) {
					Static104.method1811((long) (local159 + 1), local746, (short) 32, arg1.anInt4379, arg1.aClass24_1264, arg1.anInt4357);
				}
			}
			if (Static142.method2458(Static105.method1831(arg1))) {
				Static104.method1811(0L, Static44.aClass24_279, (short) 24, arg1.anInt4379, Static85.aClass24_1000, arg1.anInt4357);
				return;
			}
			return;
		}
		if (Static176.method3551(Static105.method1831(arg1)) && (Static4.anInt4608 & 0x20) == 32) {
			Static104.method1811(0L, Static102.aClass24_681, (short) 46, arg1.anInt4379, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static170.aClass24_1091, arg1.aClass24_1264 }), arg1.anInt4357);
			return;
		}
	}
}
