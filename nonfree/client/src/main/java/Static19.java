import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!pd;")
	public static Class20 aClass20_14;

	@OriginalMember(owner = "client!client", name = "B", descriptor = "Lclient!ja;")
	private static Class39 aClass39_300 = Static28.method504("Members object");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ja;")
	public static Class39 aClass39_301 = Static28.method504("<col=ffff00>");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ja;")
	private static Class39 aClass39_303 = Static28.method504("Please try using a different world)3");

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_302 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_304 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_305 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_306 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt518 = -1;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_307 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_309 = Static28.method504("Sorry invited players only)3");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!ja;")
	public static Class39 aClass39_308 = aClass39_309;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_310 = aClass39_300;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	public static final int anInt524 = 50;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_311 = aClass39_303;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method336(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static62.aClass66_1);
		arg0.removeMouseMotionListener(Static62.aClass66_1);
		arg0.removeFocusListener(Static62.aClass66_1);
		Static71.anInt1739 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method337() {
		aClass39_310 = null;
		aClass39_305 = null;
		aClass39_303 = null;
		aClass39_304 = null;
		aClass39_309 = null;
		aClass39_311 = null;
		aClass39_300 = null;
		aClass39_306 = null;
		aClass39_307 = null;
		aClass20_14 = null;
		aClass39_302 = null;
		aClass39_308 = null;
		aClass39_301 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!he;II)V")
	public static void method338(@OriginalArg(0) Class4_Sub5[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class4_Sub5 local17 = arg0[local11];
			if (local17 != null && local17.anInt1199 == arg1 && (!local17.aBoolean63 || !Static71.method1194(local17))) {
				if (local17.anInt1225 == 0) {
					if (!local17.aBoolean63 && Static71.method1194(local17) && local17 != Static83.aClass4_Sub5_43) {
						continue;
					}
					method338(arg0, local17.anInt1230);
					if (local17.aClass4_Sub5Array1 != null) {
						method338(local17.aClass4_Sub5Array1, local17.anInt1230);
					}
					@Pc(68) Class4_Sub10 local68 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local17.anInt1230);
					if (local68 != null) {
						Static70.method1190(local68.anInt1724);
					}
				}
				if (local17.anInt1225 == 6) {
					@Pc(98) int local98;
					if (local17.anInt1206 != -1 || local17.anInt1255 != -1) {
						@Pc(93) boolean local93 = Static59.method1047(local17);
						if (local93) {
							local98 = local17.anInt1255;
						} else {
							local98 = local17.anInt1206;
						}
						if (local98 != -1) {
							@Pc(110) Class4_Sub2_Sub2 local110 = Static116.method2017(local98);
							local17.anInt1226 += Static39.anInt952;
							while (local110.anIntArray35[local17.anInt1261] < local17.anInt1226) {
								local17.anInt1226 -= local110.anIntArray35[local17.anInt1261];
								local17.anInt1261++;
								if (local17.anInt1261 >= local110.anIntArray33.length) {
									local17.anInt1261 -= local110.anInt320;
									if (local17.anInt1261 < 0 || local17.anInt1261 >= local110.anIntArray33.length) {
										local17.anInt1261 = 0;
									}
								}
								method344(local17);
							}
						}
					}
					if (local17.anInt1234 != 0 && !local17.aBoolean63) {
						@Pc(185) int local185 = local17.anInt1234 >> 16;
						local98 = local17.anInt1234 << 16 >> 16;
						@Pc(196) int local196 = local185 * Static39.anInt952;
						local17.anInt1217 = local196 + local17.anInt1217 & 0x7FF;
						local98 *= Static39.anInt952;
						local17.anInt1227 = local98 + local17.anInt1227 & 0x7FF;
						method344(local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!qd;ZI)V")
	public static void method342(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(18) int local18;
		if ((arg0 & 0x10) != 0) {
			local9 = Static35.aClass4_Sub16_Sub1_1.method1471();
			if (local9 == 65535) {
				local9 = -1;
			}
			local18 = Static35.aClass4_Sub16_Sub1_1.method1438();
			Static33.method554(local9, arg1, local18);
		}
		if ((arg0 & 0x8) != 0) {
			local9 = Static35.aClass4_Sub16_Sub1_1.method1444();
			@Pc(41) byte[] local41 = new byte[local9];
			@Pc(46) Class4_Sub16 local46 = new Class4_Sub16(local41);
			Static35.aClass4_Sub16_Sub1_1.method1461(local41, local9);
			Static92.aClass4_Sub16Array2[arg2] = local46;
			arg1.method1794(local46);
		}
		if ((arg0 & 0x1) != 0) {
			arg1.anInt2674 = Static35.aClass4_Sub16_Sub1_1.method1490();
			if (arg1.anInt2674 == 65535) {
				arg1.anInt2674 = -1;
			}
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt2668 = Static35.aClass4_Sub16_Sub1_1.method1438();
			arg1.anInt2650 = Static35.aClass4_Sub16_Sub1_1.method1472();
			arg1.anInt2675 = Static35.aClass4_Sub16_Sub1_1.method1444();
			arg1.anInt2652 = Static35.aClass4_Sub16_Sub1_1.method1444();
			arg1.anInt2654 = Static35.aClass4_Sub16_Sub1_1.method1490() + Static71.anInt1738;
			arg1.anInt2687 = Static35.aClass4_Sub16_Sub1_1.method1453() + Static71.anInt1738;
			arg1.anInt2666 = Static35.aClass4_Sub16_Sub1_1.method1472();
			arg1.anInt2685 = 0;
			arg1.anInt2660 = 1;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt2692 = Static35.aClass4_Sub16_Sub1_1.method1453();
			local9 = Static35.aClass4_Sub16_Sub1_1.method1481();
			arg1.anInt2662 = Static71.anInt1738 + (local9 & 0xFFFF);
			arg1.anInt2693 = local9 >> 16;
			if (arg1.anInt2692 == 65535) {
				arg1.anInt2692 = -1;
			}
			arg1.anInt2695 = 0;
			arg1.anInt2684 = 0;
			if (arg1.anInt2662 > Static71.anInt1738) {
				arg1.anInt2684 = -1;
			}
		}
		if ((arg0 & 0x80) != 0) {
			local9 = Static35.aClass4_Sub16_Sub1_1.method1453();
			local18 = Static35.aClass4_Sub16_Sub1_1.method1444();
			@Pc(209) int local209 = Static35.aClass4_Sub16_Sub1_1.method1438();
			@Pc(212) int local212 = Static35.aClass4_Sub16_Sub1_1.anInt2019;
			if (arg1.aClass39_1279 != null && arg1.aClass63_2 != null) {
				@Pc(220) boolean local220 = false;
				@Pc(225) long local225 = arg1.aClass39_1279.method941();
				if (local18 <= 1) {
					for (@Pc(230) int local230 = 0; local230 < Static83.anInt2086; local230++) {
						if (Static42.aLongArray3[local230] == local225) {
							local220 = true;
							break;
						}
					}
				}
				if (!local220 && Static28.anInt759 == 0) {
					Static24.aClass4_Sub16_2.anInt2019 = 0;
					Static35.aClass4_Sub16_Sub1_1.method1440(Static24.aClass4_Sub16_2.aByteArray22, local209);
					Static24.aClass4_Sub16_2.anInt2019 = 0;
					@Pc(270) Class39 local270 = Static76.method1263(Static114.method1991(Static24.aClass4_Sub16_2).method942());
					arg1.aClass39_1411 = local270.method957();
					arg1.anInt2680 = local9 >> 8;
					arg1.anInt2672 = 150;
					arg1.anInt2696 = local9 & 0xFF;
					if (local18 == 2 || local18 == 3) {
						Static40.method672(1, local270, Static62.method1123(new Class39[] { Static14.aClass39_252, arg1.aClass39_1279 }));
					} else if (local18 == 1) {
						Static40.method672(1, local270, Static62.method1123(new Class39[] { Static38.aClass39_487, arg1.aClass39_1279 }));
					} else {
						Static40.method672(2, local270, arg1.aClass39_1279);
					}
				}
			}
			Static35.aClass4_Sub16_Sub1_1.anInt2019 = local212 + local209;
		}
		if ((arg0 & 0x2) != 0) {
			arg1.aClass39_1411 = Static35.aClass4_Sub16_Sub1_1.method1464();
			if (arg1.aClass39_1411.method939(0) == 126) {
				arg1.aClass39_1411 = arg1.aClass39_1411.method964(1);
				Static40.method672(2, arg1.aClass39_1411, arg1.aClass39_1279);
			} else if (arg1 == Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1) {
				Static40.method672(2, arg1.aClass39_1411, arg1.aClass39_1279);
			}
			arg1.anInt2672 = 150;
			arg1.anInt2696 = 0;
			arg1.anInt2680 = 0;
		}
		if ((arg0 & 0x100) != 0) {
			local9 = Static35.aClass4_Sub16_Sub1_1.method1438();
			local18 = Static35.aClass4_Sub16_Sub1_1.method1444();
			arg1.method1911(local9, Static71.anInt1738, local18);
			arg1.anInt2649 = Static71.anInt1738 + 300;
			arg1.anInt2683 = Static35.aClass4_Sub16_Sub1_1.method1438();
			arg1.anInt2664 = Static35.aClass4_Sub16_Sub1_1.method1474();
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt2686 = Static35.aClass4_Sub16_Sub1_1.method1490();
			arg1.anInt2640 = Static35.aClass4_Sub16_Sub1_1.method1453();
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		local9 = Static35.aClass4_Sub16_Sub1_1.method1474();
		local18 = Static35.aClass4_Sub16_Sub1_1.method1444();
		arg1.method1911(local9, Static71.anInt1738, local18);
		arg1.anInt2649 = Static71.anInt1738 + 300;
		arg1.anInt2683 = Static35.aClass4_Sub16_Sub1_1.method1474();
		arg1.anInt2664 = Static35.aClass4_Sub16_Sub1_1.method1474();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
	public static void method343(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg0][local7 + arg1][arg2 + local11] = 0;
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg0][arg1][local11 + arg2] = Static6.anIntArrayArrayArray1[arg0][arg1 - 1][local11 + arg2];
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static6.anIntArrayArrayArray1[arg0][arg1 + local11][arg2] = Static6.anIntArrayArrayArray1[arg0][arg1 + local11][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static6.anIntArrayArrayArray1[arg0][arg1 - 1][arg2] != 0) {
			Static6.anIntArrayArrayArray1[arg0][arg1][arg2] = Static6.anIntArrayArrayArray1[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static6.anIntArrayArrayArray1[arg0][arg1][arg2 - 1] != 0) {
			Static6.anIntArrayArrayArray1[arg0][arg1][arg2] = Static6.anIntArrayArrayArray1[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static6.anIntArrayArrayArray1[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static6.anIntArrayArrayArray1[arg0][arg1][arg2] = Static6.anIntArrayArrayArray1[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method344(@OriginalArg(0) Class4_Sub5 arg0) {
		if (arg0.anInt1250 == Static33.anInt832) {
			Static13.aBooleanArray3[arg0.anInt1218] = true;
		}
	}
}
