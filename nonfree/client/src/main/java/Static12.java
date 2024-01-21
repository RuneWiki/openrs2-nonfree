import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] aClass1_Sub1_Sub6_Sub3Array9;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!rb;")
	public static Class55 aClass55_38;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Lclient!rb;")
	public static Class55 aClass55_39;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1372 = Static15.method178("Close");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1369 = aClass23_1372;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt2429 = 0;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1371 = Static15.method178("Loading ignore list");

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1370 = aClass23_1371;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1373 = Static15.method178("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public static volatile int anInt2438 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static synchronized void method1542() {
		if (Static49.aClass1_Sub4_3 != null) {
			Static49.aClass1_Sub4_3.method930(256);
		}
		Static25.method413(256);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method1543() {
		aClass23_1372 = null;
		aClass23_1371 = null;
		aClass23_1373 = null;
		aClass55_39 = null;
		anIntArray328 = null;
		aClass23_1370 = null;
		aClass23_1369 = null;
		aClass55_38 = null;
		aClass1_Sub1_Sub6_Sub3Array9 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!fc;B)V")
	public static synchronized void method1544(@OriginalArg(0) Class1_Sub4 arg0) {
		Static49.aClass1_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public static void method1545(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static20.anInt691; local12++) {
			@Pc(20) Class1_Sub1_Sub2_Sub1_Sub1 local20 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static98.anIntArray346[local12]];
			@Pc(29) int local29 = (Static98.anIntArray346[local12] << 14) + 536870912;
			if (local20 != null && local20.method1387() && arg0 == local20.aClass1_Sub1_Sub16_1.aBoolean128 && local20.aClass1_Sub1_Sub16_1.method1823()) {
				@Pc(58) int local58 = local20.anInt2232 >> 7;
				@Pc(63) int local63 = local20.anInt2196 >> 7;
				if (local63 >= 0 && local63 < 104 && local58 >= 0 && local58 < 104) {
					if (local20.anInt2197 == 1 && (local20.anInt2196 & 0x7F) == 64 && (local20.anInt2232 & 0x7F) == 64) {
						if (Static92.anIntArrayArray74[local63][local58] == Static3.anInt131) {
							continue;
						}
						Static92.anIntArrayArray74[local63][local58] = Static3.anInt131;
					}
					if (!local20.aClass1_Sub1_Sub16_1.aBoolean126) {
						local29 += Integer.MIN_VALUE;
					}
					Static19.aClass65_1.method1759(Static79.anInt2137, local20.anInt2196, local20.anInt2232, Static48.method987(local20.anInt2232 + (local20.anInt2197 - 1) * 64, local20.anInt2197 * 64 + -64 + local20.anInt2196, Static79.anInt2137), local20.anInt2197 * 64 + 60 - 64, local20, local20.anInt2223, local29, local20.aBoolean104);
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([II)V")
	public static synchronized void method1546(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static49.aClass1_Sub4_3 != null) {
			Static49.aClass1_Sub4_3.method929(arg0, 0, local2);
		}
		Static25.method413(local2);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZILclient!ee;)I")
	public static int method1547(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub7 arg1) {
		if (arg1.anIntArrayArray18 == null || arg1.anIntArrayArray18.length <= arg0) {
			return -2;
		}
		try {
			@Pc(22) int[] local22 = arg1.anIntArrayArray18[arg0];
			@Pc(24) int local24 = 0;
			@Pc(34) int local34 = 0;
			@Pc(36) byte local36 = 0;
			while (true) {
				@Pc(41) int local41 = local22[local24++];
				@Pc(43) int local43 = 0;
				@Pc(45) byte local45 = 0;
				if (local41 == 0) {
					return local34;
				}
				if (local41 == 15) {
					local45 = 1;
				}
				if (local41 == 16) {
					local45 = 2;
				}
				if (local41 == 17) {
					local45 = 3;
				}
				if (local41 == 1) {
					local43 = Static109.anIntArray395[local22[local24++]];
				}
				if (local41 == 2) {
					local43 = Static63.anIntArray225[local22[local24++]];
				}
				if (local41 == 3) {
					local43 = Static20.anIntArray92[local22[local24++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class1_Sub1_Sub7 local117;
				@Pc(122) int local122;
				@Pc(135) int local135;
				if (local41 == 4) {
					local106 = local22[local24++] << 16;
					@Pc(113) int local113 = local106 + local22[local24++];
					local117 = Static15.method174(local113);
					local122 = local22[local24++];
					if (local122 != -1 && (!Static111.method1907(local122).aBoolean1 || Static37.aBoolean68)) {
						for (local135 = 0; local135 < local117.anIntArray118.length; local135++) {
							if (local122 + 1 == local117.anIntArray118[local135]) {
								local43 += local117.anIntArray117[local135];
							}
						}
					}
				}
				if (local41 == 5) {
					local43 = Static40.anIntArray164[local22[local24++]];
				}
				if (local41 == 6) {
					local43 = client.anIntArray63[Static63.anIntArray225[local22[local24++]] - 1];
				}
				if (local41 == 7) {
					local43 = Static40.anIntArray164[local22[local24++]] * 100 / 46875;
				}
				if (local41 == 8) {
					local43 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2242;
				}
				if (local41 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static48.aBooleanArray5[local106]) {
							local43 += Static63.anIntArray225[local106];
						}
					}
				}
				if (local41 == 10) {
					local106 = local22[local24++] << 16;
					local106 += local22[local24++];
					local117 = Static15.method174(local106);
					local122 = local22[local24++];
					if (local122 != -1 && (!Static111.method1907(local122).aBoolean1 || Static37.aBoolean68)) {
						for (local135 = 0; local135 < local117.anIntArray118.length; local135++) {
							if (local117.anIntArray118[local135] == local122 + 1) {
								local43 = 999999999;
								break;
							}
						}
					}
				}
				if (local41 == 11) {
					local43 = Static18.anInt458;
				}
				if (local41 == 12) {
					local43 = Static35.anInt1121;
				}
				if (local41 == 13) {
					local106 = Static40.anIntArray164[local22[local24++]];
					@Pc(323) int local323 = local22[local24++];
					local43 = (local106 & 0x1 << local323) == 0 ? 0 : 1;
				}
				if (local41 == 14) {
					local106 = local22[local24++];
					local43 = Static1.method44(local106);
				}
				if (local41 == 18) {
					local43 = (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196 >> 7) + Static104.anInt2684;
				}
				if (local41 == 19) {
					local43 = (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 >> 7) + Static107.anInt2745;
				}
				if (local41 == 20) {
					local43 = local22[local24++];
				}
				if (local45 == 0) {
					if (local36 == 0) {
						local34 += local43;
					}
					if (local36 == 1) {
						local34 -= local43;
					}
					if (local36 == 2 && local43 != 0) {
						local34 /= local43;
					}
					if (local36 == 3) {
						local34 *= local43;
					}
					local36 = 0;
				} else {
					local36 = local45;
				}
			}
		} catch (@Pc(435) Exception local435) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method1548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static20.anInt690) {
			return true;
		} else if (arg1 == 1 && Static39.anInt1381 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static29.anInt882;
		}
	}
}
