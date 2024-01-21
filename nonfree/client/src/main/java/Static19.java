import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "[[[Lclient!wd;")
	public static Class82[][][] aClass82ArrayArrayArray1 = new Class82[4][104][104];

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_149 = Static60.method1113("<col=ffb000>");

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_150 = Static60.method1113("(Y");

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!ec;")
	public static Class22 aClass22_151 = Static60.method1113("Hier wechseln");

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "Lclient!ec;")
	private static Class22 aClass22_154 = Static60.method1113("To create a new account you need to");

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_152 = aClass22_154;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "Lclient!ec;")
	public static Class22 aClass22_153 = Static60.method1113("mapscene");

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public static int anInt543 = 0;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void method371() {
		aCRC32_1 = null;
		aClass22_151 = null;
		aClass22_154 = null;
		aClass82ArrayArrayArray1 = null;
		aClass22_152 = null;
		aClass22_153 = null;
		aClass22_150 = null;
		aClass22_149 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IJ)V")
	public static void method372(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static88.anInt2348 >= 100) {
			Static65.method1153(Static89.aClass22_684, 0, Static64.aClass22_485);
			return;
		}
		@Pc(27) Class22 local27 = Static8.method1575(arg0).method473();
		for (@Pc(29) int local29 = 0; local29 < Static88.anInt2348; local29++) {
			if (Static85.aLongArray5[local29] == arg0) {
				Static65.method1153(Static44.method856(new Class22[] { local27, Static4.aClass22_20 }), 0, Static64.aClass22_485);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static2.anInt9; local64++) {
			if (Static29.aLongArray1[local64] == arg0) {
				Static65.method1153(Static44.method856(new Class22[] { Static5.aClass22_41, local27, Static78.aClass22_572 }), 0, Static64.aClass22_485);
				return;
			}
		}
		if (local27.method481(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444)) {
			Static65.method1153(Static37.aClass22_261, 0, Static64.aClass22_485);
			return;
		}
		Static85.aLongArray5[Static88.anInt2348] = arg0;
		Static58.aClass22Array14[Static88.anInt2348++] = Static8.method1575(arg0);
		Static2.anInt14 = Static96.anInt2513;
		Static38.aClass4_Sub11_Sub1_1.method752(38);
		Static38.aClass4_Sub11_Sub1_1.method728(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!lf;)V")
	public static void method373(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static97.aBoolean228) {
			Static99.method1671(arg0);
			return;
		}
		if (Static65.anInt1845 == 1 && Static8.anInt2382 >= 715 && Static55.anInt1118 >= 453) {
			Static26.aBoolean94 = !Static26.aBoolean94;
			if (Static26.aBoolean94) {
				Static56.method1033();
			} else {
				Static84.method1493(Static61.aClass22_474, Static103.aClass20_Sub1_66, Static60.aClass22_467);
			}
		}
		if (Static112.anInt2775 == 5) {
			return;
		}
		Static55.anInt1100++;
		if (Static112.anInt2775 != 10) {
			return;
		}
		if (Static89.anInt2372 != 2 && Static16.anInt379 == 0) {
			if (Static65.anInt1845 == 1 && Static8.anInt2382 >= 5 && Static8.anInt2382 <= 105 && Static55.anInt1118 >= 463 && Static55.anInt1118 <= 498) {
				Static69.method1172();
				return;
			}
			if (Static67.aClass9_1 != null) {
				Static69.method1172();
			}
		}
		@Pc(98) int local98 = Static65.anInt1845;
		@Pc(104) int local104 = Static55.anInt1118;
		@Pc(106) int local106 = Static8.anInt2382;
		if (Static9.anInt190 == 0) {
			if (local98 == 1 && local106 >= 227 && local106 <= 377 && local104 >= 271 && local104 <= 311) {
				Static113.anInt2785 = 0;
				Static9.anInt190 = 3;
			}
			if (local98 == 1 && local106 >= 387 && local106 <= 537 && local104 >= 271 && local104 <= 311) {
				Static61.aClass22_478 = Static111.aClass22_848;
				Static61.aClass22_471 = Static111.aClass22_833;
				Static113.anInt2785 = 0;
				Static61.aClass22_472 = Static64.aClass22_486;
				Static9.anInt190 = 2;
				return;
			}
		} else if (Static9.anInt190 == 2) {
			@Pc(245) short local245 = 231;
			@Pc(246) int local246 = local245 + 30;
			if (local98 == 1 && local104 >= 246 && local104 < 261) {
				Static113.anInt2785 = 0;
			}
			local246 += 15;
			if (local98 == 1 && local104 >= 261 && local104 < 276) {
				Static113.anInt2785 = 1;
			}
			local246 += 15;
			if (local98 == 1 && local106 >= 227 && local106 <= 377 && local104 >= 301 && local104 <= 341) {
				Static61.aClass22_476 = Static61.aClass22_476.method453().method473();
				if (Static61.aClass22_476.method449() == 0) {
					Static95.method1192(Static111.aClass22_852, Static111.aClass22_815, Static32.aClass22_216);
					return;
				}
				if (Static61.aClass22_470.method449() == 0) {
					Static95.method1192(Static111.aClass22_843, Static111.aClass22_853, Static114.aClass22_880);
					return;
				}
				Static95.method1192(Static111.aClass22_826, Static111.aClass22_840, Static87.aClass22_656);
				Static46.method888(20);
				return;
			}
			if (local98 == 1 && local106 >= 387 && local106 <= 537 && local104 >= 301 && local104 <= 341) {
				Static61.aClass22_470 = Static61.aClass22_474;
				Static9.anInt190 = 0;
				Static61.aClass22_476 = Static61.aClass22_474;
			}
			while (true) {
				while (Static122.method950()) {
					@Pc(400) boolean local400 = false;
					for (@Pc(402) int local402 = 0; Static75.aClass22_550.method449() > local402; local402++) {
						if (Static90.anInt2393 == Static75.aClass22_550.method469(local402)) {
							local400 = true;
							break;
						}
					}
					if (Static113.anInt2785 == 0) {
						if (Static11.anInt2985 == 85 && Static61.aClass22_476.method449() > 0) {
							Static61.aClass22_476 = Static61.aClass22_476.method450(0, Static61.aClass22_476.method449() - 1);
						}
						if (Static11.anInt2985 == 84 || Static11.anInt2985 == 80) {
							Static113.anInt2785 = 1;
						}
						if (local400 && Static61.aClass22_476.method449() < 12) {
							Static61.aClass22_476 = Static61.aClass22_476.method486(Static90.anInt2393);
						}
					} else if (Static113.anInt2785 == 1) {
						if (Static11.anInt2985 == 85 && Static61.aClass22_470.method449() > 0) {
							Static61.aClass22_470 = Static61.aClass22_470.method450(0, Static61.aClass22_470.method449() - 1);
						}
						if (Static11.anInt2985 == 84 || Static11.anInt2985 == 80) {
							Static113.anInt2785 = 0;
						}
						if (Static57.anInt1741 == 2 && Static11.anInt2985 == 84) {
							Static61.aClass22_476 = Static61.aClass22_476.method453().method473();
							if (Static61.aClass22_476.method449() == 0) {
								Static95.method1192(Static111.aClass22_852, Static111.aClass22_815, Static32.aClass22_216);
								return;
							}
							if (Static61.aClass22_470.method449() == 0) {
								Static95.method1192(Static111.aClass22_843, Static111.aClass22_853, Static114.aClass22_880);
								return;
							}
							Static95.method1192(Static111.aClass22_826, Static111.aClass22_840, Static87.aClass22_656);
							Static46.method888(20);
							return;
						}
						if (local400 && Static61.aClass22_470.method449() < 20) {
							Static61.aClass22_470 = Static61.aClass22_470.method486(Static90.anInt2393);
						}
					}
				}
				return;
			}
		} else if (Static9.anInt190 == 3 && local98 == 1 && local106 >= 307 && local106 <= 457 && local104 >= 301 && local104 <= 341) {
			Static9.anInt190 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z")
	public static boolean method374(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method375() {
		if (!Static114.aBoolean252) {
			return;
		}
		Static37.anIntArray105 = null;
		Static131.aClass4_Sub1_Sub2_Sub3Array10 = null;
		Static61.aClass4_Sub1_Sub2_Sub3Array5 = null;
		Static35.aClass4_Sub1_Sub2_Sub3Array2 = null;
		Static131.aClass4_Sub1_Sub2_Sub3_5 = null;
		Static39.aClass4_Sub1_Sub2_Sub2_5 = null;
		Static66.aClass4_Sub1_Sub2_Sub3_3 = null;
		Static57.aClass4_Sub1_Sub2_Sub2Array10 = null;
		Static3.anIntArray2 = null;
		Static82.aClass4_Sub1_Sub2_Sub2_6 = null;
		Static80.aClass4_Sub1_Sub2_Sub3_4 = null;
		Static4.aClass4_Sub1_Sub2_Sub3_1 = null;
		Static103.anIntArray293 = null;
		Static111.anIntArray304 = null;
		Static78.anIntArray205 = null;
		Static5.anIntArray5 = null;
		Static12.aClass4_Sub1_Sub2_Sub3Array1 = null;
		Static52.anIntArray148 = null;
		Static8.anIntArray274 = null;
		Static46.aClass4_Sub1_Sub2_Sub3Array3 = null;
		Static129.method1980();
		Static78.method1298(true);
		Static114.aBoolean252 = false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
	public static int method376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}
}
