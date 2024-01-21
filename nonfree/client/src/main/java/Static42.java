import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "J")
	public static long aLong35;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "Lclient!dd;")
	public static Class14 aClass14_16;

	@OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
	public static int anInt1024;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
	public static int anInt1025 = -1;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lclient!m;")
	public static Class49 aClass49_4 = new Class49();

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_545 = Static56.method816("scrollen:");

	@OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
	public static int anInt1029 = 0;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_547 = Static56.method816("headicons_hint");

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
	public static int anInt1035 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	public static void method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static88.anInt2340 == 0 && !Static32.aBoolean41) {
			Static72.method1076(0, Static36.aClass34_504, arg1 - arg0, Static56.aClass34_709, 45, arg3 - arg2);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static85.anInt2154; local31++) {
			@Pc(37) int local37 = Static85.anIntArray301[local31];
			@Pc(41) int local41 = local37 & 0x7F;
			@Pc(47) int local47 = local37 >> 29 & 0x3;
			@Pc(53) int local53 = local37 >> 7 & 0x7F;
			@Pc(59) int local59 = local37 >> 14 & 0x7FFF;
			if (local37 != local29) {
				local29 = local37;
				@Pc(148) int local148;
				if (local47 == 2 && Static3.aClass64_1.method1389(anInt1024, local41, local53, local37) >= 0) {
					@Pc(82) Class8_Sub1_Sub4 local82 = Static50.method752(local59);
					if (local82.anIntArray56 != null) {
						local82 = local82.method263();
					}
					if (local82 == null) {
						continue;
					}
					if (Static88.anInt2340 == 1) {
						Static72.method1076(local37, Static44.method669(new Class34[] { Static88.aClass34_1100, Static87.aClass34_1005, local82.aClass34_249 }), local41, Static22.aClass34_1204, 38, local53);
					} else if (!Static32.aBoolean41) {
						@Pc(138) Class34[] local138 = local82.aClass34Array7;
						if (Static59.aBoolean61) {
							local138 = Static113.method1620(local138);
						}
						if (local138 != null) {
							for (local148 = 4; local148 >= 0; local148--) {
								if (local138[local148] != null) {
									@Pc(156) short local156 = 0;
									if (local148 == 0) {
										local156 = 47;
									}
									if (local148 == 1) {
										local156 = 4;
									}
									if (local148 == 2) {
										local156 = 13;
									}
									if (local148 == 3) {
										local156 = 22;
									}
									if (local148 == 4) {
										local156 = 1003;
									}
									Static72.method1076(local37, Static44.method669(new Class34[] { Static69.aClass34_782, local82.aClass34_249 }), local41, local138[local148], local156, local53);
								}
							}
						}
						Static72.method1076(local82.anInt440 << 14, Static44.method669(new Class34[] { Static69.aClass34_782, local82.aClass34_249 }), local41, Static19.aClass34_295, 1002, local53);
					} else if ((Static120.anInt2889 & 0x4) == 4) {
						Static72.method1076(local37, Static44.method669(new Class34[] { Static120.aClass34_1321, Static87.aClass34_1005, local82.aClass34_249 }), local41, Static49.aClass34_652, 21, local53);
					}
				}
				@Pc(302) int local302;
				@Pc(310) Class8_Sub1_Sub1_Sub4_Sub2 local310;
				@Pc(359) Class8_Sub1_Sub1_Sub4_Sub1 local359;
				if (local47 == 1) {
					@Pc(279) Class8_Sub1_Sub1_Sub4_Sub2 local279 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local59];
					if (local279.aClass8_Sub1_Sub16_1.anInt2439 == 1 && (local279.anInt2043 & 0x7F) == 64 && (local279.anInt2059 & 0x7F) == 64) {
						for (local302 = 0; local302 < Static94.anInt2223; local302++) {
							local310 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local302]];
							if (local310 != null && local279 != local310 && local310.aClass8_Sub1_Sub16_1.anInt2439 == 1 && local310.anInt2043 == local279.anInt2043 && local310.anInt2059 == local279.anInt2059) {
								Static18.method311(local53, local41, Static50.anIntArray164[local302], local310.aClass8_Sub1_Sub16_1);
							}
						}
						for (local148 = 0; local148 < Static41.anInt986; local148++) {
							local359 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local148]];
							if (local359 != null && local279.anInt2043 == local359.anInt2043 && local279.anInt2059 == local359.anInt2059) {
								Static132.method1891(Static29.anIntArray109[local148], local359, local41, local53);
							}
						}
					}
					Static18.method311(local53, local41, local59, local279.aClass8_Sub1_Sub16_1);
				}
				if (local47 == 0) {
					@Pc(404) Class8_Sub1_Sub1_Sub4_Sub1 local404 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local59];
					if ((local404.anInt2043 & 0x7F) == 64 && (local404.anInt2059 & 0x7F) == 64) {
						for (local302 = 0; local302 < Static94.anInt2223; local302++) {
							local310 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local302]];
							if (local310 != null && local310.aClass8_Sub1_Sub16_1.anInt2439 == 1 && local310.anInt2043 == local404.anInt2043 && local404.anInt2059 == local310.anInt2059) {
								Static18.method311(local53, local41, Static50.anIntArray164[local302], local310.aClass8_Sub1_Sub16_1);
							}
						}
						for (local148 = 0; local148 < Static41.anInt986; local148++) {
							local359 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local148]];
							if (local359 != null && local404 != local359 && local359.anInt2043 == local404.anInt2043 && local404.anInt2059 == local359.anInt2059) {
								Static132.method1891(Static29.anIntArray109[local148], local359, local41, local53);
							}
						}
					}
					Static132.method1891(local59, local404, local41, local53);
				}
				if (local47 == 3) {
					@Pc(524) Class49 local524 = Static21.aClass49ArrayArrayArray1[anInt1024][local41][local53];
					if (local524 != null) {
						for (@Pc(531) Class8_Sub1_Sub1_Sub2 local531 = (Class8_Sub1_Sub1_Sub2) local524.method1112(); local531 != null; local531 = (Class8_Sub1_Sub1_Sub2) local524.method1113()) {
							@Pc(538) Class8_Sub1_Sub13 local538 = Static7.method49(local531.anInt349);
							if (Static88.anInt2340 == 1) {
								Static72.method1076(local531.anInt349, Static44.method669(new Class34[] { Static88.aClass34_1100, Static18.aClass34_267, local538.aClass34_812 }), local41, Static22.aClass34_1204, 17, local53);
							} else if (!Static32.aBoolean41) {
								@Pc(577) Class34[] local577 = local538.aClass34Array13;
								if (Static59.aBoolean61) {
									local577 = Static113.method1620(local577);
								}
								for (@Pc(585) int local585 = 4; local585 >= 0; local585--) {
									if (local577 != null && local577[local585] != null) {
										@Pc(629) byte local629 = 0;
										if (local585 == 0) {
											local629 = 14;
										}
										if (local585 == 1) {
											local629 = 7;
										}
										if (local585 == 2) {
											local629 = 20;
										}
										if (local585 == 3) {
											local629 = 44;
										}
										if (local585 == 4) {
											local629 = 6;
										}
										Static72.method1076(local531.anInt349, Static44.method669(new Class34[] { Static111.aClass34_1398, local538.aClass34_812 }), local41, local577[local585], local629, local53);
									} else if (local585 == 2) {
										Static72.method1076(local531.anInt349, Static44.method669(new Class34[] { Static111.aClass34_1398, local538.aClass34_812 }), local41, Static115.aClass34_1223, 20, local53);
									}
								}
								Static72.method1076(local531.anInt349, Static44.method669(new Class34[] { Static111.aClass34_1398, local538.aClass34_812 }), local41, Static19.aClass34_295, 1005, local53);
							} else if ((Static120.anInt2889 & 0x1) == 1) {
								Static72.method1076(local531.anInt349, Static44.method669(new Class34[] { Static120.aClass34_1321, Static18.aClass34_267, local538.aClass34_812 }), local41, Static49.aClass34_652, 9, local53);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!dd;ILclient!dd;Lclient!dd;)V")
	public static void method637(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class14 arg2) {
		Static27.aClass14_7 = arg2;
		Static112.aClass14_27 = arg1;
		Static39.aClass14_14 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
	public static boolean method638(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
	public static void method639() {
		aClass49_4 = null;
		aClass34_545 = null;
		anIntArray135 = null;
		aClass14_16 = null;
		aClass34_547 = null;
	}
}
