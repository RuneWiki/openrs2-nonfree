import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public static int anInt2700;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt2702;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[[[Lclient!dk;")
	public static Class4_Sub11[][][] aClass4_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
	public static int[] anIntArray244 = new int[2];

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	public static int anInt2701 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method2093() {
		aString82 = null;
		aClass4_Sub11ArrayArrayArray1 = null;
		anIntArray244 = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2094(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static268.aString183 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static240.aString182 + "</col>";
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public static void method2095(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static96.aFloat15 = 3.0F;
		} else if (arg0 == 50) {
			Static96.aFloat15 = 4.0F;
		} else if (arg0 == 75) {
			Static96.aFloat15 = 6.0F;
		} else if (arg0 == 100) {
			Static96.aFloat15 = 8.0F;
		} else if (arg0 == 200) {
			Static96.aFloat15 = 16.0F;
		}
		Static299.anInt5561 = -1;
		Static299.anInt5561 = -1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ve;IIII)V")
	public static void method2096(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static60.anInt1152 >= 400) {
			return;
		}
		if (arg0.anIntArray462 != null) {
			arg0 = arg0.method4133();
		}
		if (arg0 == null || !arg0.aBoolean345) {
			return;
		}
		@Pc(34) String local34 = arg0.aString188;
		if (arg0.anInt5208 != 0) {
			@Pc(45) String local45 = Static132.anInt2784 == 1 ? Static219.aString139 : Static129.aString85;
			local34 = local34 + Static167.method2630(Static239.aClass12_Sub3_Sub2_2.anInt4201, arg0.anInt5208) + " (" + local45 + arg0.anInt5208 + ")";
		}
		if (Static216.anInt4288 == 1) {
			Static66.method1015(arg2, (short) 4, (long) arg3, Static222.aString143 + " -> <col=ffff00>" + local34, arg1, Static70.anInt4107, Static212.aString133);
		} else if (Static26.aBoolean30) {
			@Pc(83) Class4_Sub2_Sub22 local83 = Static117.anInt2591 == -1 ? null : Static51.method855(Static117.anInt2591);
			if ((Static112.anInt2457 & 0x2) != 0 && (local83 == null || arg0.method4135(Static117.anInt2591, local83.anInt5557) != local83.anInt5557)) {
				Static66.method1015(arg2, (short) 12, (long) arg3, Static254.aString165 + " -> <col=ffff00>" + local34, arg1, Static105.anInt2258, Static235.aString155);
			}
		} else {
			@Pc(135) String[] local135 = arg0.aStringArray36;
			if (Static82.aBoolean124) {
				local135 = Static155.method2471(local135);
			}
			@Pc(147) int local147;
			if (local135 != null) {
				for (local147 = 4; local147 >= 0; local147--) {
					if (local135[local147] != null && (Static132.anInt2784 != 0 || !local135[local147].equalsIgnoreCase(Static145.aString97))) {
						@Pc(173) byte local173 = 0;
						if (local147 == 0) {
							local173 = 30;
						}
						@Pc(182) int local182 = -1;
						if (local147 == 1) {
							local173 = 46;
						}
						if (local147 == arg0.anInt5207) {
							local182 = arg0.anInt5196;
						}
						if (local147 == 2) {
							local173 = 40;
						}
						if (local147 == 3) {
							local173 = 16;
						}
						if (arg0.anInt5206 == local147) {
							local182 = arg0.anInt5188;
						}
						if (local147 == 4) {
							local173 = 24;
						}
						Static66.method1015(arg2, local173, (long) arg3, "<col=ffff00>" + local34, arg1, local182, local135[local147]);
					}
				}
			}
			if (Static132.anInt2784 == 0 && local135 != null) {
				for (local147 = 4; local147 >= 0; local147--) {
					if (local135[local147] != null && local135[local147].equalsIgnoreCase(Static145.aString97)) {
						@Pc(280) short local280 = 0;
						if (local147 == 0) {
							local280 = 30;
						}
						if (local147 == 1) {
							local280 = 46;
						}
						@Pc(296) short local296 = 0;
						if (Static239.aClass12_Sub3_Sub2_2.anInt4201 < arg0.anInt5208) {
							local296 = 2000;
						}
						if (local147 == 2) {
							local280 = 40;
						}
						if (local147 == 3) {
							local280 = 16;
						}
						if (local147 == 4) {
							local280 = 24;
						}
						if (local280 != 0) {
							local280 += local296;
						}
						Static66.method1015(arg2, local280, (long) arg3, "<col=ffff00>" + local34, arg1, arg0.anInt5216, local135[local147]);
					}
				}
			}
			Static66.method1015(arg2, (short) 1005, (long) arg3, "<col=ffff00>" + local34, arg1, Static277.anInt5176, Static51.aString29);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)V")
	public static void method2097(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static247.anInt4706 = 104;
		Static24.anInt439 = 104;
		Static225.anInt4462 = arg0;
		Static141.aClass4_Sub11ArrayArrayArray2 = new Class4_Sub11[4][Static247.anInt4706][Static24.anInt439];
		Static231.anIntArrayArrayArray12 = new int[4][Static247.anInt4706 + 1][Static24.anInt439 + 1];
		if (Static178.aBoolean216) {
			Static42.aClass4_Sub14ArrayArray1 = new Class4_Sub14[4][];
		}
		if (arg1) {
			Static271.aClass4_Sub11ArrayArrayArray3 = new Class4_Sub11[1][Static247.anInt4706][Static24.anInt439];
			Static120.anIntArrayArray23 = new int[Static247.anInt4706][Static24.anInt439];
			Static15.anIntArrayArrayArray2 = new int[1][Static247.anInt4706 + 1][Static24.anInt439 + 1];
			if (Static178.aBoolean216) {
				Static76.aClass4_Sub14ArrayArray2 = new Class4_Sub14[1][];
			}
		} else {
			Static271.aClass4_Sub11ArrayArrayArray3 = null;
			Static120.anIntArrayArray23 = null;
			Static15.anIntArrayArrayArray2 = null;
			Static76.aClass4_Sub14ArrayArray2 = null;
		}
		Static205.method3261(false);
		Static237.aClass145Array2 = new Class145[500];
		Static241.anInt4625 = 0;
		Static11.aClass145Array1 = new Class145[500];
		Static220.anInt4353 = 0;
		Static211.anIntArrayArrayArray9 = new int[4][Static247.anInt4706 + 1][Static24.anInt439 + 1];
		Static172.aClass173Array2 = new Class173[5000];
		Static94.anInt1947 = 0;
		Static290.aClass173Array3 = new Class173[100];
		Static191.aBooleanArrayArray8 = new boolean[Static225.anInt4462 + Static225.anInt4462 + 1][Static225.anInt4462 + Static225.anInt4462 + 1];
		Static40.aBooleanArrayArray2 = new boolean[Static225.anInt4462 + Static225.anInt4462 + 2][Static225.anInt4462 + Static225.anInt4462 + 2];
		Static35.aByteArrayArrayArray1 = new byte[4][Static247.anInt4706][Static24.anInt439];
	}
}
