import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!pe;")
	private static Class65 aClass65_559 = Static119.method1462("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_554 = aClass65_559;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_555 = Static119.method1462("k");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!pe;")
	private static Class65 aClass65_557 = Static119.method1462("Free world");

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_556 = aClass65_557;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!pe;")
	private static Class65 aClass65_562 = Static119.method1462("skill)2");

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_558 = aClass65_562;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!pe;")
	private static Class65 aClass65_560 = Static119.method1462("Loading)3)3)3");

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_561 = aClass65_560;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BJ)V")
	public static void method883(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < Static49.anInt1201; local24++) {
			if (arg0 == Static30.aLongArray1[local24]) {
				Static49.anInt1201--;
				for (@Pc(38) int local38 = local24; local38 < Static49.anInt1201; local38++) {
					Static30.aLongArray1[local38] = Static30.aLongArray1[local38 + 1];
					Static120.aClass65Array69[local38] = Static120.aClass65Array69[local38 + 1];
				}
				Static59.anInt1470 = Static8.anInt228;
				Static49.aClass2_Sub4_Sub1_1.method962(239);
				Static49.aClass2_Sub4_Sub1_1.method948(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method884() {
		Static68.aClass8_64.method171();
		Static120.aClass8_58.method171();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method885() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub5 local10 = (Class2_Sub1_Sub1_Sub5) Static124.aClass13_18.method270(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub5) Static124.aClass13_18.method273()) {
			if (Static59.anInt1479 != local10.anInt2209 || Static10.anInt2951 > local10.anInt2206) {
				local10.method2053();
			} else if (Static10.anInt2951 >= local10.anInt2208) {
				if (local10.anInt2195 > 0) {
					@Pc(47) Class2_Sub1_Sub1_Sub4_Sub2 local47 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local10.anInt2195 - 1];
					if (local47 != null && local47.anInt1948 >= 0 && local47.anInt1948 < 13312 && local47.anInt1958 >= 0 && local47.anInt1958 < 13312) {
						local10.method1591(Static10.anInt2951, local47.anInt1958, Static106.method1718(local47.anInt1958, local47.anInt1948, local10.anInt2209) - local10.anInt2198, local47.anInt1948);
					}
				}
				if (local10.anInt2195 < 0) {
					@Pc(101) int local101 = -local10.anInt2195 - 1;
					@Pc(108) Class2_Sub1_Sub1_Sub4_Sub1 local108;
					if (Static93.anInt2098 == local101) {
						local108 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1;
					} else {
						local108 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local101];
					}
					if (local108 != null && local108.anInt1948 >= 0 && local108.anInt1948 < 13312 && local108.anInt1958 >= 0 && local108.anInt1958 < 13312) {
						local10.method1591(Static10.anInt2951, local108.anInt1958, Static106.method1718(local108.anInt1958, local108.anInt1948, local10.anInt2209) - local10.anInt2198, local108.anInt1948);
					}
				}
				local10.method1592(Static117.anInt2579);
				Static124.aClass49_1.method1158(Static59.anInt1479, (int) local10.aDouble7, (int) local10.aDouble9, (int) local10.aDouble6, 60, local10, local10.anInt2187, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method886() {
		Static98.anInt2238 = 0;
		@Pc(17) int local17 = (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7) + Static34.anInt791;
		@Pc(25) int local25 = (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7) + Static66.anInt1577;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static98.anInt2238 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static98.anInt2238 = 1;
		}
		if (Static98.anInt2238 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static98.anInt2238 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public static void method887() {
		aClass65_561 = null;
		aClass65_558 = null;
		aClass65_560 = null;
		aClass65_556 = null;
		aClass65_559 = null;
		aByteArrayArrayArray1 = null;
		anIntArray160 = null;
		aClass65_562 = null;
		aClass65_555 = null;
		aClass65_557 = null;
		aClass65_554 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZZIZ)Lclient!re;")
	public static Class56_Sub1 method888(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class24 local5 = null;
		if (Static47.aClass70_3 != null) {
			local5 = new Class24(arg2, Static47.aClass70_3, Static75.aClass70Array2[arg2], 1000000);
		}
		return new Class56_Sub1(local5, Static124.aClass24_4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
	public static void method889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub22 local8 = Static84.method1365(arg2, arg0);
		if (local8 != null && local8.anObjectArray26 != null) {
			@Pc(17) Class2_Sub9 local17 = new Class2_Sub9();
			local17.anObjectArray2 = local8.anObjectArray26;
			local17.aClass2_Sub22_7 = local8;
			Static103.method1703(local17);
		}
		Static117.aBoolean103 = true;
		Static117.anInt2577 = arg2;
		Static113.anInt2532 = arg0;
		Static16.anInt2217 = arg1;
		Static116.method1853(local8);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!wa;I)I")
	public static int method890(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg1.anIntArrayArray25 == null || arg1.anIntArrayArray25.length <= arg0) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = arg1.anIntArrayArray25[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(28) int local28 = 0;
				@Pc(33) int local33 = local22[local24++];
				@Pc(35) byte local35 = 0;
				if (local33 == 0) {
					return local17;
				}
				if (local33 == 15) {
					local35 = 1;
				}
				if (local33 == 16) {
					local35 = 2;
				}
				if (local33 == 17) {
					local35 = 3;
				}
				if (local33 == 1) {
					local28 = Static60.anIntArray39[local22[local24++]];
				}
				if (local33 == 2) {
					local28 = Static12.anIntArray33[local22[local24++]];
				}
				if (local33 == 3) {
					local28 = Static76.anIntArray222[local22[local24++]];
				}
				@Pc(102) int local102;
				@Pc(113) Class2_Sub22 local113;
				@Pc(118) int local118;
				@Pc(130) int local130;
				if (local33 == 4) {
					local102 = local22[local24++] << 16;
					@Pc(109) int local109 = local102 + local22[local24++];
					local113 = Static35.method645(local109);
					local118 = local22[local24++];
					if (local118 != -1 && (!Static4.method872(local118).aBoolean80 || Static49.aBoolean48)) {
						for (local130 = 0; local130 < local113.anIntArray374.length; local130++) {
							if (local118 + 1 == local113.anIntArray374[local130]) {
								local28 += local113.anIntArray370[local130];
							}
						}
					}
				}
				if (local33 == 5) {
					local28 = Static129.anIntArray363[local22[local24++]];
				}
				if (local33 == 6) {
					local28 = Class70.anIntArray289[Static12.anIntArray33[local22[local24++]] - 1];
				}
				if (local33 == 7) {
					local28 = Static129.anIntArray363[local22[local24++]] * 100 / 46875;
				}
				if (local33 == 8) {
					local28 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1024;
				}
				if (local33 == 9) {
					for (local102 = 0; local102 < 25; local102++) {
						if (Static78.aBooleanArray12[local102]) {
							local28 += Static12.anIntArray33[local102];
						}
					}
				}
				if (local33 == 10) {
					local102 = local22[local24++] << 16;
					local102 += local22[local24++];
					local113 = Static35.method645(local102);
					local118 = local22[local24++];
					if (local118 != -1 && (!Static4.method872(local118).aBoolean80 || Static49.aBoolean48)) {
						for (local130 = 0; local130 < local113.anIntArray374.length; local130++) {
							if (local118 + 1 == local113.anIntArray374[local130]) {
								local28 = 999999999;
								break;
							}
						}
					}
				}
				if (local33 == 11) {
					local28 = Static84.anInt1817;
				}
				if (local33 == 12) {
					local28 = Static100.anInt2280;
				}
				if (local33 == 13) {
					local102 = Static129.anIntArray363[local22[local24++]];
					@Pc(322) int local322 = local22[local24++];
					local28 = (local102 & 0x1 << local322) == 0 ? 0 : 1;
				}
				if (local33 == 14) {
					local102 = local22[local24++];
					local28 = Static100.method1644(local102);
				}
				if (local33 == 18) {
					local28 = (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7) + Static34.anInt791;
				}
				if (local33 == 19) {
					local28 = Static66.anInt1577 + (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7);
				}
				if (local33 == 20) {
					local28 = local22[local24++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local17 += local28;
					}
					if (local26 == 1) {
						local17 -= local28;
					}
					if (local26 == 2 && local28 != 0) {
						local17 /= local28;
					}
					if (local26 == 3) {
						local17 *= local28;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(421) Exception local421) {
			return -1;
		}
	}
}
