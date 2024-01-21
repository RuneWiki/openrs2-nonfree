import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt2440;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[Lclient!rd;")
	public static Class80[] aClass80Array16;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public static int anInt2443;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_957 = Static120.method1824("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt2438 = -1;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_958 = Static120.method1824("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_959 = Static120.method1824("gleiten:");

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt2441 = 0;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_960 = Static120.method1824("sch-Utteln:");

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_961 = Static120.method1824("Loaded input handler");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!rd;")
	public static Class80 aClass80_962 = aClass80_958;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public static int anInt2442 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!rd;")
	public static Class80 aClass80_963 = aClass80_961;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!qf;)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class77 arg2) {
		if (arg2.anInt3196 == 1) {
			Static16.method273((short) 47, 0L, arg2.aClass80_1257, 0, Static185.aClass80_1637, arg2.anInt3237);
		}
		if (arg2.anInt3196 == 2 && !Static162.aBoolean147) {
			@Pc(35) Class80 local35 = Static4.method128(arg2);
			if (local35 != null) {
				Static16.method273((short) 6, 0L, local35, -1, Static154.method2467(new Class80[] { Static129.aClass80_1102, arg2.aClass80_1256 }), arg2.anInt3237);
			}
		}
		if (arg2.anInt3196 == 3) {
			Static16.method273((short) 16, 0L, Static42.aClass80_355, 0, Static185.aClass80_1637, arg2.anInt3237);
		}
		if (arg2.anInt3196 == 4) {
			Static16.method273((short) 32, 0L, arg2.aClass80_1257, 0, Static185.aClass80_1637, arg2.anInt3237);
		}
		if (arg2.anInt3196 == 5) {
			Static16.method273((short) 3, 0L, arg2.aClass80_1257, 0, Static185.aClass80_1637, arg2.anInt3237);
		}
		if (arg2.anInt3196 == 6 && Static83.aClass77_4 == null) {
			Static16.method273((short) 10, 0L, arg2.aClass80_1257, -1, Static185.aClass80_1637, arg2.anInt3237);
		}
		@Pc(157) int local157;
		@Pc(151) int local151;
		if (arg2.anInt3206 == 2) {
			local151 = 0;
			for (@Pc(153) int local153 = 0; local153 < arg2.anInt3221; local153++) {
				for (local157 = 0; local157 < arg2.anInt3251; local157++) {
					@Pc(167) int local167 = (arg2.anInt3263 + 32) * local157;
					@Pc(174) int local174 = local153 * (arg2.anInt3264 + 32);
					if (local151 < 20) {
						local174 += arg2.anIntArray419[local151];
						local167 += arg2.anIntArray420[local151];
					}
					if (arg0 >= local167 && local174 <= arg1 && local167 + 32 > arg0 && local174 + 32 > arg1) {
						Static27.anInt4463 = local151;
						Static94.aClass77_9 = arg2;
						if (arg2.anIntArray418[local151] > 0) {
							@Pc(225) Class3_Sub1_Sub2 local225 = Static173.method2793(arg2.anIntArray418[local151] - 1);
							if (Static7.anInt221 == 1 && Static31.method495(Static71.method1062(arg2))) {
								if (arg2.anInt3237 != Static129.anInt2788 || Static18.anInt461 != local151) {
									Static16.method273((short) 31, (long) local225.anInt351, Static17.aClass80_131, local151, Static154.method2467(new Class80[] { Static134.aClass80_1289, Static95.aClass80_1416, local225.aClass80_116 }), arg2.anInt3237);
								}
							} else if (!Static162.aBoolean147 || !Static31.method495(Static71.method1062(arg2))) {
								@Pc(287) Class80[] local287 = local225.aClass80Array3;
								if (Static157.aBoolean144) {
									local287 = Static105.method1564(local287);
								}
								@Pc(301) int local301;
								@Pc(350) byte local350;
								if (Static31.method495(Static71.method1062(arg2))) {
									for (local301 = 4; local301 >= 3; local301--) {
										if (local287 != null && local287[local301] != null) {
											if (local301 == 3) {
												local350 = 44;
											} else {
												local350 = 40;
											}
											Static16.method273(local350, (long) local225.anInt351, local287[local301], local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
										} else if (local301 == 4) {
											Static16.method273((short) 40, (long) local225.anInt351, Static188.aClass80_1690, local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
										}
									}
								}
								if (Static136.method2061(Static71.method1062(arg2))) {
									Static16.method273((short) 13, (long) local225.anInt351, Static17.aClass80_131, local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
								}
								if (Static31.method495(Static71.method1062(arg2)) && local287 != null) {
									for (local301 = 2; local301 >= 0; local301--) {
										if (local287[local301] != null) {
											local350 = 0;
											if (local301 == 0) {
												local350 = 23;
											}
											if (local301 == 1) {
												local350 = 51;
											}
											if (local301 == 2) {
												local350 = 39;
											}
											Static16.method273(local350, (long) local225.anInt351, local287[local301], local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
										}
									}
								}
								local287 = arg2.aClass80Array23;
								if (Static157.aBoolean144) {
									local287 = Static105.method1564(local287);
								}
								if (local287 != null) {
									for (local301 = 4; local301 >= 0; local301--) {
										if (local287[local301] != null) {
											local350 = 0;
											if (local301 == 0) {
												local350 = 49;
											}
											if (local301 == 1) {
												local350 = 22;
											}
											if (local301 == 2) {
												local350 = 24;
											}
											if (local301 == 3) {
												local350 = 41;
											}
											if (local301 == 4) {
												local350 = 7;
											}
											Static16.method273(local350, (long) local225.anInt351, local287[local301], local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
										}
									}
								}
								Static16.method273((short) 1007, (long) local225.anInt351, Static148.aClass80_1303, local151, Static154.method2467(new Class80[] { Static190.aClass80_1700, local225.aClass80_116 }), arg2.anInt3237);
							} else if ((Static33.anInt778 & 0x10) == 16) {
								Static16.method273((short) 5, (long) local225.anInt351, Static44.aClass80_376, local151, Static154.method2467(new Class80[] { Static38.aClass80_309, Static95.aClass80_1416, local225.aClass80_116 }), arg2.anInt3237);
							}
						}
					}
					local151++;
				}
			}
		}
		if (!arg2.aBoolean127) {
			return;
		}
		if (Static162.aBoolean147) {
			if (Static194.method3140(Static71.method1062(arg2)) && (Static33.anInt778 & 0x20) == 32) {
				Static16.method273((short) 33, 0L, Static44.aClass80_376, arg2.anInt3258, Static154.method2467(new Class80[] { Static38.aClass80_309, Static162.aClass80_1402, arg2.aClass80_1259 }), arg2.anInt3237);
				return;
			}
			return;
		}
		@Pc(727) Class80 local727;
		for (local151 = 9; local151 >= 5; local151--) {
			local727 = Static73.method1104(local151, arg2);
			if (local727 != null) {
				Static16.method273((short) 1001, (long) (local151 + 1), local727, arg2.anInt3258, arg2.aClass80_1259, arg2.anInt3237);
			}
		}
		local727 = Static4.method128(arg2);
		if (local727 != null) {
			Static16.method273((short) 6, 0L, local727, arg2.anInt3258, arg2.aClass80_1259, arg2.anInt3237);
		}
		for (local157 = 4; local157 >= 0; local157--) {
			@Pc(781) Class80 local781 = Static73.method1104(local157, arg2);
			if (local781 != null) {
				Static16.method273((short) 18, (long) (local157 + 1), local781, arg2.anInt3258, arg2.aClass80_1259, arg2.anInt3237);
			}
		}
		if (Static116.method3161(Static71.method1062(arg2))) {
			Static16.method273((short) 10, 0L, Static120.aClass80_1048, arg2.anInt3258, Static185.aClass80_1637, arg2.anInt3237);
			return;
		}
	}
}
