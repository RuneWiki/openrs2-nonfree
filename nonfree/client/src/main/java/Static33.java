import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Lclient!nh;")
	public static Class62 aClass62_9;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 aClass4_Sub1_Sub7_Sub1_Sub1_3;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array2;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_286 = Static177.method3050("blinken1:");

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_287 = Static177.method3050(":");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ub;Lclient!nh;ILclient!nh;Lclient!nh;)Z")
	public static boolean method567(@OriginalArg(0) Class4_Sub2_Sub4 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) Class62 arg3) {
		Static144.aClass62_37 = arg2;
		Static175.aClass4_Sub2_Sub4_2 = arg0;
		Static2.aClass62_1 = arg1;
		Static141.aClass62_36 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!a;II)V")
	public static void method568(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt26 == 1) {
			Static40.method695((short) 38, 0, 0L, Static3.aClass46_44, arg1.anInt53, arg1.aClass46_6);
		}
		if (arg1.anInt26 == 2 && !Static86.aBoolean97) {
			@Pc(35) Class46 local35 = Static187.method3167(arg1);
			if (local35 != null) {
				Static40.method695((short) 12, -1, 0L, Static69.method1482(new Class46[] { Static163.aClass46_1374, arg1.aClass46_4 }), arg1.anInt53, local35);
			}
		}
		if (arg1.anInt26 == 3) {
			Static40.method695((short) 16, 0, 0L, Static3.aClass46_44, arg1.anInt53, Static172.aClass46_1409);
		}
		if (arg1.anInt26 == 4) {
			Static40.method695((short) 3, 0, 0L, Static3.aClass46_44, arg1.anInt53, arg1.aClass46_6);
		}
		if (arg1.anInt26 == 5) {
			Static40.method695((short) 39, 0, 0L, Static3.aClass46_44, arg1.anInt53, arg1.aClass46_6);
		}
		if (arg1.anInt26 == 6 && Static84.aClass1_54 == null) {
			Static40.method695((short) 9, -1, 0L, Static3.aClass46_44, arg1.anInt53, arg1.aClass46_6);
		}
		@Pc(161) int local161;
		@Pc(155) int local155;
		if (arg1.anInt7 == 2) {
			local155 = 0;
			for (@Pc(157) int local157 = 0; local157 < arg1.anInt20; local157++) {
				for (local161 = 0; local161 < arg1.anInt50; local161++) {
					@Pc(170) int local170 = (arg1.anInt36 + 32) * local161;
					@Pc(177) int local177 = local157 * (arg1.anInt31 + 32);
					if (local155 < 20) {
						local177 += arg1.anIntArray3[local155];
						local170 += arg1.anIntArray4[local155];
					}
					if (local170 <= arg0 && local177 <= arg2 && local170 + 32 > arg0 && local177 + 32 > arg2) {
						Static158.anInt3537 = local155;
						Static143.aClass1_43 = arg1;
						if (arg1.anIntArray11[local155] > 0) {
							@Pc(232) Class4_Sub1_Sub12 local232 = Static83.method1663(arg1.anIntArray11[local155] - 1);
							if (Static53.anInt1331 == 1 && Static173.method2988(Static102.method1954(arg1))) {
								if (arg1.anInt53 != Static28.anInt745 || local155 != Static1.anInt54) {
									Static40.method695((short) 22, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static1.aClass46_1, Static109.aClass46_990, local232.aClass46_895 }), arg1.anInt53, Static21.aClass46_188);
								}
							} else if (!Static86.aBoolean97 || !Static173.method2988(Static102.method1954(arg1))) {
								@Pc(298) Class46[] local298 = local232.aClass46Array19;
								if (Static107.aBoolean115) {
									local298 = Static148.method2489(local298);
								}
								@Pc(312) int local312;
								@Pc(363) byte local363;
								if (Static173.method2988(Static102.method1954(arg1))) {
									for (local312 = 4; local312 >= 3; local312--) {
										if (local298 != null && local298[local312] != null) {
											if (local312 == 3) {
												local363 = 51;
											} else {
												local363 = 31;
											}
											Static40.method695(local363, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, local298[local312]);
										} else if (local312 == 4) {
											Static40.method695((short) 31, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, Static102.aClass46_936);
										}
									}
								}
								if (Static69.method1480(Static102.method1954(arg1))) {
									Static40.method695((short) 29, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, Static21.aClass46_188);
								}
								if (Static173.method2988(Static102.method1954(arg1)) && local298 != null) {
									for (local312 = 2; local312 >= 0; local312--) {
										if (local298[local312] != null) {
											local363 = 0;
											if (local312 == 0) {
												local363 = 57;
											}
											if (local312 == 1) {
												local363 = 14;
											}
											if (local312 == 2) {
												local363 = 37;
											}
											Static40.method695(local363, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, local298[local312]);
										}
									}
								}
								local298 = arg1.aClass46Array2;
								if (Static107.aBoolean115) {
									local298 = Static148.method2489(local298);
								}
								if (local298 != null) {
									for (local312 = 4; local312 >= 0; local312--) {
										if (local298[local312] != null) {
											local363 = 0;
											if (local312 == 0) {
												local363 = 35;
											}
											if (local312 == 1) {
												local363 = 46;
											}
											if (local312 == 2) {
												local363 = 41;
											}
											if (local312 == 3) {
												local363 = 30;
											}
											if (local312 == 4) {
												local363 = 13;
											}
											Static40.method695(local363, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, local298[local312]);
										}
									}
								}
								Static40.method695((short) 1007, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static46.aClass46_469, local232.aClass46_895 }), arg1.anInt53, Static49.aClass46_485);
							} else if ((Static38.anInt1000 & 0x10) == 16) {
								Static40.method695((short) 49, local155, (long) local232.anInt2497, Static69.method1482(new Class46[] { Static30.aClass46_250, Static109.aClass46_990, local232.aClass46_895 }), arg1.anInt53, Static111.aClass46_1005);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg1.aBoolean8) {
			return;
		}
		if (Static86.aBoolean97) {
			if (Static72.method1497(Static102.method1954(arg1)) && (Static38.anInt1000 & 0x20) == 32) {
				Static40.method695((short) 34, arg1.anInt48, 0L, Static69.method1482(new Class46[] { Static30.aClass46_250, Static64.aClass46_656, arg1.aClass46_10 }), arg1.anInt53, Static111.aClass46_1005);
				return;
			}
			return;
		}
		@Pc(735) Class46 local735;
		for (local155 = 9; local155 >= 5; local155--) {
			local735 = Static143.method2448(arg1, local155);
			if (local735 != null) {
				Static40.method695((short) 1006, arg1.anInt48, (long) (local155 + 1), arg1.aClass46_10, arg1.anInt53, local735);
			}
		}
		local735 = Static187.method3167(arg1);
		if (local735 != null) {
			Static40.method695((short) 12, arg1.anInt48, 0L, arg1.aClass46_10, arg1.anInt53, local735);
		}
		for (local161 = 4; local161 >= 0; local161--) {
			@Pc(789) Class46 local789 = Static143.method2448(arg1, local161);
			if (local789 != null) {
				Static40.method695((short) 17, arg1.anInt48, (long) (local161 + 1), arg1.aClass46_10, arg1.anInt53, local789);
			}
		}
		if (Static159.method2690(Static102.method1954(arg1))) {
			Static40.method695((short) 9, arg1.anInt48, 0L, Static3.aClass46_44, arg1.anInt53, Static160.aClass46_1324);
			return;
		}
	}
}
