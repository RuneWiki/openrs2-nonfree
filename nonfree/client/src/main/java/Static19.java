import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Lclient!da;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "Lclient!lf;")
	public static Class49 aClass49_254 = Static32.method683("Schlie-8en");

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Lclient!lf;")
	private static Class49 aClass49_255 = Static32.method683(" is already on your friend list)3");

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "[I")
	public static int[] anIntArray34 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!bi", name = "rb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_262 = Static32.method683("This computers address has been blocked");

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_256 = aClass49_262;

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_257 = Static32.method683("welle2:");

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_258 = Static32.method683("(Y<)4col>");

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_259 = aClass49_255;

	@OriginalMember(owner = "client!bi", name = "gb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_260 = Static32.method683("mapfunction");

	@OriginalMember(owner = "client!bi", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_261 = Static32.method683("titlebutton");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method358(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static33.aBooleanArray4[arg0]) {
			return;
		}
		Static51.aClass11_47.method2068(arg0);
		if (Static149.aClass85ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static149.aClass85ArrayArray1[arg0].length; local27++) {
			if (Static149.aClass85ArrayArray1[arg0][local27] != null) {
				if (Static149.aClass85ArrayArray1[arg0][local27].anInt3855 == 2) {
					local25 = false;
				} else {
					Static149.aClass85ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static149.aClass85ArrayArray1[arg0] = null;
		}
		Static33.aBooleanArray4[arg0] = false;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public static void method359() {
		aClass16_1 = null;
		aClass49_261 = null;
		aClass49_255 = null;
		aClass49_258 = null;
		aClass49_260 = null;
		aClass49_262 = null;
		aClass49_257 = null;
		aClass49_254 = null;
		aClass49_259 = null;
		aClass49_256 = null;
		anIntArray34 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!uc;)V")
	public static void method365(@OriginalArg(1) Class2_Sub2_Sub3_Sub7 arg0) {
		if (arg0.anInt3545 == 0) {
			return;
		}
		@Pc(42) int local42;
		@Pc(35) int local35;
		if (arg0.anInt3556 != -1 && arg0.anInt3556 < 32768) {
			@Pc(26) Class2_Sub2_Sub3_Sub7_Sub1 local26 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[arg0.anInt3556];
			if (local26 != null) {
				local35 = arg0.anInt3578 - local26.anInt3578;
				local42 = arg0.anInt3529 - local26.anInt3529;
				if (local42 != 0 || local35 != 0) {
					arg0.anInt3571 = (int) (Math.atan2((double) local42, (double) local35) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt3556 >= 32768) {
			local67 = arg0.anInt3556 - 32768;
			if (Static54.anInt1191 == local67) {
				local67 = 2047;
			}
			@Pc(76) Class2_Sub2_Sub3_Sub7_Sub2 local76 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local67];
			if (local76 != null) {
				local35 = arg0.anInt3529 - local76.anInt3529;
				@Pc(91) int local91 = arg0.anInt3578 - local76.anInt3578;
				if (local35 != 0 || local91 != 0) {
					arg0.anInt3571 = (int) (Math.atan2((double) local35, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3567 != 0 || arg0.anInt3561 != 0) && (arg0.anInt3543 == 0 || arg0.anInt3530 > 0)) {
			local42 = arg0.anInt3578 - (arg0.anInt3561 - Static38.anInt944 - Static38.anInt944) * 64;
			local67 = arg0.anInt3529 - (arg0.anInt3567 - Static49.anInt1133 - Static49.anInt1133) * 64;
			if (local67 != 0 || local42 != 0) {
				arg0.anInt3571 = (int) (Math.atan2((double) local67, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt3567 = 0;
			arg0.anInt3561 = 0;
		}
		local67 = arg0.anInt3571 - arg0.anInt3536 & 0x7FF;
		if (local67 == 0) {
			arg0.anInt3562 = 0;
			return;
		}
		arg0.anInt3562++;
		@Pc(218) boolean local218;
		if (local67 > 1024) {
			arg0.anInt3536 -= arg0.anInt3545;
			local218 = true;
			if (arg0.anInt3545 > local67 || 2048 - arg0.anInt3545 < local67) {
				local218 = false;
				arg0.anInt3536 = arg0.anInt3571;
			}
			if (arg0.anInt3554 == arg0.anInt3525 && (arg0.anInt3562 > 25 || local218)) {
				if (arg0.anInt3528 == -1) {
					arg0.anInt3554 = arg0.anInt3585;
				} else {
					arg0.anInt3554 = arg0.anInt3528;
				}
			}
		} else {
			arg0.anInt3536 += arg0.anInt3545;
			local218 = true;
			if (local67 < arg0.anInt3545 || 2048 - arg0.anInt3545 < local67) {
				arg0.anInt3536 = arg0.anInt3571;
				local218 = false;
			}
			if (arg0.anInt3554 == arg0.anInt3525 && (arg0.anInt3562 > 25 || local218)) {
				if (arg0.anInt3551 == -1) {
					arg0.anInt3554 = arg0.anInt3585;
				} else {
					arg0.anInt3554 = arg0.anInt3551;
				}
			}
		}
		arg0.anInt3536 &= 0x7FF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	public static void method368(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static61.method1068(Static13.aClass49_140, Static125.aClass49_1241, Static83.aClass49_883);
		} else if (arg0 == -2) {
			Static61.method1068(Static13.aClass49_127, Static22.aClass49_277, Static13.aClass49_152);
		} else if (arg0 == -1) {
			Static61.method1068(Static13.aClass49_137, Static125.aClass49_1240, Static164.aClass49_1629);
		} else if (arg0 == 3) {
			Static61.method1068(Static13.aClass49_150, Static53.aClass49_598, Static13.aClass49_138);
		} else if (arg0 == 4) {
			Static61.method1068(Static13.aClass49_134, Static131.aClass49_1673, Static122.aClass49_1183);
		} else if (arg0 == 5) {
			Static61.method1068(Static13.aClass49_153, Static77.aClass49_835, Static145.aClass49_1400);
		} else if (arg0 == 6) {
			Static61.method1068(Static13.aClass49_142, Static12.aClass49_113, Static81.aClass49_868);
		} else if (arg0 == 7) {
			Static61.method1068(Static13.aClass49_151, Static124.aClass49_1238, Static152.aClass49_1480);
		} else if (arg0 == 8) {
			Static61.method1068(Static13.aClass49_135, Static112.aClass49_1077, Static131.aClass49_1667);
		} else if (arg0 == 9) {
			Static61.method1068(Static13.aClass49_155, Static93.aClass49_950, Static144.aClass49_1387);
		} else if (arg0 == 10) {
			Static61.method1068(Static13.aClass49_136, Static34.aClass49_463, Static131.aClass49_1671);
		} else if (arg0 == 11) {
			Static61.method1068(Static13.aClass49_130, Static125.aClass49_1247, Static156.aClass49_1525);
		} else if (arg0 == 12) {
			Static61.method1068(Static13.aClass49_124, Static120.aClass49_1162, Static124.aClass49_1237);
		} else if (arg0 == 13) {
			Static61.method1068(Static13.aClass49_159, Static125.aClass49_1239, Static123.aClass49_1228);
		} else if (arg0 == 14) {
			Static61.method1068(Static13.aClass49_126, Static4.aClass49_55, Static129.aClass49_1266);
		} else if (arg0 == 16) {
			Static61.method1068(Static13.aClass49_148, Static30.aClass49_377, Static17.aClass49_1174);
		} else if (arg0 == 17) {
			Static61.method1068(Static13.aClass49_146, Static27.aClass49_337, Static167.aClass49_1631);
		} else if (arg0 == 18) {
			Static61.method1068(Static13.aClass49_145, Static86.aClass49_1600, Static144.aClass49_1388);
		} else if (arg0 == 19) {
			Static61.method1068(Static124.aClass49_1233, Static111.aClass49_1069, Static78.aClass49_841);
		} else if (arg0 == 20) {
			Static61.method1068(Static13.aClass49_129, Static125.aClass49_1248, Static171.aClass49_1682);
		} else if (arg0 == 22) {
			Static61.method1068(Static13.aClass49_143, Static181.aClass49_1742, Static93.aClass49_952);
		} else if (arg0 == 23) {
			Static61.method1068(Static13.aClass49_123, Static4.aClass49_51, Static4.aClass49_53);
		} else if (arg0 == 24) {
			Static61.method1068(Static13.aClass49_158, Static100.aClass49_1016, Static33.aClass49_446);
		} else if (arg0 == 25) {
			Static61.method1068(Static13.aClass49_120, Static125.aClass49_1242, Static87.aClass49_1326);
		} else if (arg0 == 26) {
			Static61.method1068(Static13.aClass49_149, Static22.aClass49_282, aClass49_256);
		} else if (arg0 == 27) {
			Static61.method1068(Static13.aClass49_156, Static142.aClass49_1363, Static13.aClass49_121);
		} else {
			Static61.method1068(Static13.aClass49_139, Static125.aClass49_1246, Static35.aClass49_469);
		}
		Static33.method691(10);
	}
}
