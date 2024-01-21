import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "rb", descriptor = "Lclient!sf;")
	public static Class5 aClass5_7;

	@OriginalMember(owner = "client!ae", name = "Bb", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!ae", name = "Gb", descriptor = "I")
	public static int anInt200;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "[I")
	public static int[] anIntArray31 = new int[25];

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_131 = Static106.method1849("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
	public static int anInt192 = 0;

	@OriginalMember(owner = "client!ae", name = "qb", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "tb", descriptor = "Lclient!ma;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ae", name = "wb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_132 = Static106.method1849("sch-Utteln:");

	@OriginalMember(owner = "client!ae", name = "Ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_133 = Static106.method1849("rect_debug=");

	@OriginalMember(owner = "client!ae", name = "Fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_134 = Static106.method1849("::fpsoff");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZII)V")
	public static void method133(@OriginalArg(1) boolean arg0) {
		Static39.anInt1014 = 22050;
		Static57.anInt1797 = 2;
		Static59.aBoolean73 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIZ)Lclient!ud;")
	public static Class1_Sub22 method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = new Class1_Sub22();
		local7.anInt2782 = arg2;
		local7.anInt2781 = arg1;
		Static52.aClass65_22.method1797(local7, (long) arg0);
		Static127.method2029(arg1);
		Static81.method1501(arg1);
		@Pc(29) Class1_Sub10 local29 = Static38.method2002(arg0);
		if (local29 != null) {
			Static70.method537(local29);
		}
		if (Static87.aClass1_Sub10_10 != null) {
			Static70.method537(Static87.aClass1_Sub10_10);
			Static87.aClass1_Sub10_10 = null;
		}
		Static5.anInt228 = 0;
		Static112.aBoolean113 = false;
		Static14.method408(Static79.anInt2166, Static124.anInt2863, Static73.anInt2120, Static80.anInt2176);
		if (Static22.anInt637 != -1) {
			Static99.method905(1, Static22.anInt637);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!he;III)V")
	public static void method139(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1393 == 1) {
			Static98.method1749(arg0.aClass66_728, 3, arg0.anInt1348, 0, 0, Static13.aClass66_284);
		}
		if (arg0.anInt1393 == 2 && !Static51.aBoolean65) {
			@Pc(35) Class66 local35 = Static25.method529(arg0);
			if (local35 != null) {
				Static98.method1749(local35, 1, arg0.anInt1348, -1, 0, Static41.method897(new Class66[] { Static83.aClass66_1183, arg0.aClass66_726 }));
			}
		}
		if (arg0.anInt1393 == 3) {
			Static98.method1749(Static3.aClass66_114, 39, arg0.anInt1348, 0, 0, Static13.aClass66_284);
		}
		if (arg0.anInt1393 == 4) {
			Static98.method1749(arg0.aClass66_728, 4, arg0.anInt1348, 0, 0, Static13.aClass66_284);
		}
		if (arg0.anInt1393 == 5) {
			Static98.method1749(arg0.aClass66_728, 6, arg0.anInt1348, 0, 0, Static13.aClass66_284);
		}
		if (arg0.anInt1393 == 6 && Static87.aClass1_Sub10_10 == null) {
			Static98.method1749(arg0.aClass66_728, 48, arg0.anInt1348, -1, 0, Static13.aClass66_284);
		}
		@Pc(155) int local155;
		@Pc(149) int local149;
		if (arg0.anInt1359 == 2) {
			local149 = 0;
			for (@Pc(151) int local151 = 0; local151 < arg0.anInt1345; local151++) {
				for (local155 = 0; local155 < arg0.anInt1367; local155++) {
					@Pc(164) int local164 = (arg0.anInt1333 + 32) * local155;
					@Pc(171) int local171 = (arg0.anInt1363 + 32) * local151;
					if (local149 < 20) {
						local171 += arg0.anIntArray199[local149];
						local164 += arg0.anIntArray203[local149];
					}
					if (local164 <= arg1 && arg2 >= local171 && local164 + 32 > arg1 && local171 + 32 > arg2) {
						Static134.anInt2954 = local149;
						Static93.aClass1_Sub10_12 = arg0;
						if (arg0.anIntArray201[local149] > 0) {
							@Pc(235) Class1_Sub1_Sub6 local235 = Static20.method496(arg0.anIntArray201[local149] - 1);
							if (Static84.anInt2224 == 1 && Static49.method1059(Static61.method1301(arg0))) {
								if (Static47.anInt1476 != arg0.anInt1348 || local149 != Static3.anInt117) {
									Static98.method1749(Static11.aClass66_241, 33, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static42.aClass66_710, Static123.aClass66_1658, local235.aClass66_847 }));
								}
							} else if (!Static51.aBoolean65 || !Static49.method1059(Static61.method1301(arg0))) {
								@Pc(300) Class66[] local300 = local235.aClass66Array9;
								if (Static89.aBoolean97) {
									local300 = Static98.method1752(local300);
								}
								@Pc(314) int local314;
								@Pc(364) byte local364;
								if (Static49.method1059(Static61.method1301(arg0))) {
									for (local314 = 4; local314 >= 3; local314--) {
										if (local300 != null && local300[local314] != null) {
											if (local314 == 3) {
												local364 = 11;
											} else {
												local364 = 28;
											}
											Static98.method1749(local300[local314], local364, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
										} else if (local314 == 4) {
											Static98.method1749(Static25.aClass66_435, 28, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
										}
									}
								}
								if (Static50.method1076(Static61.method1301(arg0))) {
									Static98.method1749(Static11.aClass66_241, 9, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
								}
								if (Static49.method1059(Static61.method1301(arg0)) && local300 != null) {
									for (local314 = 2; local314 >= 0; local314--) {
										if (local300[local314] != null) {
											local364 = 0;
											if (local314 == 0) {
												local364 = 22;
											}
											if (local314 == 1) {
												local364 = 57;
											}
											if (local314 == 2) {
												local364 = 44;
											}
											Static98.method1749(local300[local314], local364, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
										}
									}
								}
								local300 = arg0.aClass66Array5;
								if (Static89.aBoolean97) {
									local300 = Static98.method1752(local300);
								}
								if (local300 != null) {
									for (local314 = 4; local314 >= 0; local314--) {
										if (local300[local314] != null) {
											local364 = 0;
											if (local314 == 0) {
												local364 = 31;
											}
											if (local314 == 1) {
												local364 = 17;
											}
											if (local314 == 2) {
												local364 = 29;
											}
											if (local314 == 3) {
												local364 = 30;
											}
											if (local314 == 4) {
												local364 = 16;
											}
											Static98.method1749(local300[local314], local364, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
										}
									}
								}
								Static98.method1749(Static14.aClass66_304, 1002, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static68.aClass66_1060, local235.aClass66_847 }));
							} else if ((Static128.anInt2909 & 0x10) == 16) {
								Static98.method1749(Static87.aClass66_1277, 41, arg0.anInt1348, local149, local235.anInt1576, Static41.method897(new Class66[] { Static27.aClass66_445, Static123.aClass66_1658, local235.aClass66_847 }));
							}
						}
					}
					local149++;
				}
			}
		}
		if (!arg0.aBoolean54) {
			return;
		}
		if (!Static51.aBoolean65) {
			@Pc(680) Class66 local680;
			for (local149 = 9; local149 >= 5; local149--) {
				local680 = Static61.method1309(arg0, local149);
				if (local680 != null) {
					Static98.method1749(local680, 1004, arg0.anInt1348, arg0.anInt1371, local149 + 1, arg0.aClass66_731);
				}
			}
			local680 = Static25.method529(arg0);
			if (local680 != null) {
				Static98.method1749(local680, 1, arg0.anInt1348, arg0.anInt1371, 0, arg0.aClass66_731);
			}
			for (local155 = 4; local155 >= 0; local155--) {
				@Pc(735) Class66 local735 = Static61.method1309(arg0, local155);
				if (local735 != null) {
					Static98.method1749(local735, 13, arg0.anInt1348, arg0.anInt1371, local155 + 1, arg0.aClass66_731);
				}
			}
			if (Static54.method1237(Static61.method1301(arg0))) {
				Static98.method1749(Static66.aClass66_324, 48, arg0.anInt1348, arg0.anInt1371, 0, Static13.aClass66_284);
				return;
			}
			return;
		}
		if (Static92.method1706(Static61.method1301(arg0)) && (Static128.anInt2909 & 0x20) == 32) {
			Static98.method1749(Static87.aClass66_1277, 42, arg0.anInt1348, arg0.anInt1371, 0, Static41.method897(new Class66[] { Static27.aClass66_445, Static117.aClass66_1574, arg0.aClass66_731 }));
			return;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method140() {
		aClass66_133 = null;
		aClass66_132 = null;
		aClass66_134 = null;
		aClass66_131 = null;
		aClass1_Sub1_Sub2_Sub3Array1 = null;
		anIntArray31 = null;
		aClass5_7 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method142(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static123.aClass36_1);
		arg0.addMouseMotionListener(Static123.aClass36_1);
		arg0.addFocusListener(Static123.aClass36_1);
	}
}
