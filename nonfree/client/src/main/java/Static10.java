import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
	public static int anInt306 = 0;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "Lclient!he;")
	public static Class44 aClass44_5 = new Class44();

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "Lclient!qe;")
	public static Class78 aClass78_37 = Static199.method3560("");

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "Lclient!fb;")
	public static Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Lclient!qe;")
	public static Class78 aClass78_38 = Static199.method3560(": ");

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_39 = Static199.method3560("Welt");

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!qe;")
	public static Class78 aClass78_40 = Static199.method3560("::tele 0)1");

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method219() {
		Static210.aClass110_23.method3889();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)I")
	public static int method220(@OriginalArg(0) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!mj;I)V")
	public static void method221(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3006 == 1) {
			Static188.method3487(0, 0L, (short) 49, arg1.anInt3044, Static73.aClass78_352, arg1.aClass78_592);
		}
		if (arg1.anInt3006 == 2 && !Static125.aBoolean60) {
			@Pc(31) Class78 local31 = Static126.method2302(arg1);
			if (local31 != null) {
				Static188.method3487(-1, 0L, (short) 57, arg1.anInt3044, Static94.method1640(new Class78[] { Static174.aClass78_700, arg1.aClass78_594 }), local31);
			}
		}
		if (arg1.anInt3006 == 3) {
			Static188.method3487(0, 0L, (short) 17, arg1.anInt3044, Static73.aClass78_352, Static138.aClass78_605);
		}
		if (arg1.anInt3006 == 4) {
			Static188.method3487(0, 0L, (short) 20, arg1.anInt3044, Static73.aClass78_352, arg1.aClass78_592);
		}
		if (arg1.anInt3006 == 5) {
			Static188.method3487(0, 0L, (short) 10, arg1.anInt3044, Static73.aClass78_352, arg1.aClass78_592);
		}
		if (arg1.anInt3006 == 6 && Static119.aClass64_9 == null) {
			Static188.method3487(-1, 0L, (short) 11, arg1.anInt3044, Static73.aClass78_352, arg1.aClass78_592);
		}
		@Pc(149) int local149;
		@Pc(143) int local143;
		if (arg1.anInt3051 == 2) {
			local143 = 0;
			for (@Pc(145) int local145 = 0; local145 < arg1.anInt3064; local145++) {
				for (local149 = 0; local149 < arg1.anInt3018; local149++) {
					@Pc(158) int local158 = (arg1.anInt3035 + 32) * local145;
					@Pc(165) int local165 = local149 * (arg1.anInt3023 + 32);
					if (local143 < 20) {
						local158 += arg1.anIntArray498[local143];
						local165 += arg1.anIntArray502[local143];
					}
					if (arg0 >= local165 && local158 <= arg2 && arg0 < local165 + 32 && arg2 < local158 + 32) {
						Static132.anInt3079 = local143;
						Static68.aClass64_6 = arg1;
						if (arg1.anIntArray493[local143] > 0) {
							@Pc(231) Class2_Sub3_Sub23 local231 = Static32.method3209(arg1.anIntArray493[local143] - 1);
							if (Static121.anInt4906 == 1 && Static140.method2507(Static36.method473(arg1))) {
								if (Static73.anInt1574 != arg1.anInt3044 || local143 != Static213.anInt2031) {
									Static188.method3487(local143, (long) local231.anInt3509, (short) 8, arg1.anInt3044, Static94.method1640(new Class78[] { Static203.aClass78_808, Static152.aClass78_637, local231.aClass78_640 }), Static173.aClass78_690);
								}
							} else if (!Static125.aBoolean60 || !Static140.method2507(Static36.method473(arg1))) {
								@Pc(333) Class78[] local333 = local231.aClass78Array24;
								if (Static101.aBoolean85) {
									local333 = Static129.method2339(local333);
								}
								@Pc(346) int local346;
								@Pc(397) byte local397;
								if (Static140.method2507(Static36.method473(arg1))) {
									for (local346 = 4; local346 >= 3; local346--) {
										if (local333 != null && local333[local346] != null) {
											if (local346 == 3) {
												local397 = 39;
											} else {
												local397 = 19;
											}
											Static188.method3487(local143, (long) local231.anInt3509, local397, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), local333[local346]);
										} else if (local346 == 4) {
											Static188.method3487(local143, (long) local231.anInt3509, (short) 19, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), Static143.aClass78_613);
										}
									}
								}
								if (Static20.method289(Static36.method473(arg1))) {
									Static188.method3487(local143, (long) local231.anInt3509, (short) 46, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), Static173.aClass78_690);
								}
								if (Static140.method2507(Static36.method473(arg1)) && local333 != null) {
									for (local346 = 2; local346 >= 0; local346--) {
										if (local333[local346] != null) {
											local397 = 0;
											if (local346 == 0) {
												local397 = 24;
											}
											if (local346 == 1) {
												local397 = 28;
											}
											if (local346 == 2) {
												local397 = 1;
											}
											Static188.method3487(local143, (long) local231.anInt3509, local397, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), local333[local346]);
										}
									}
								}
								local333 = arg1.aClass78Array22;
								if (Static101.aBoolean85) {
									local333 = Static129.method2339(local333);
								}
								if (local333 != null) {
									for (local346 = 4; local346 >= 0; local346--) {
										if (local333[local346] != null) {
											local397 = 0;
											if (local346 == 0) {
												local397 = 42;
											}
											if (local346 == 1) {
												local397 = 18;
											}
											if (local346 == 2) {
												local397 = 50;
											}
											if (local346 == 3) {
												local397 = 45;
											}
											if (local346 == 4) {
												local397 = 43;
											}
											Static188.method3487(local143, (long) local231.anInt3509, local397, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), local333[local346]);
										}
									}
								}
								Static188.method3487(local143, (long) local231.anInt3509, (short) 1003, arg1.anInt3044, Static94.method1640(new Class78[] { Static113.aClass78_532, local231.aClass78_640 }), Static2.aClass78_5);
							} else if ((Static29.anInt530 & 0x10) == 16) {
								Static188.method3487(local143, (long) local231.anInt3509, (short) 23, arg1.anInt3044, Static94.method1640(new Class78[] { Static19.aClass78_60, Static152.aClass78_637, local231.aClass78_640 }), Static69.aClass78_317);
							}
						}
					}
					local143++;
				}
			}
		}
		if (!arg1.aBoolean132) {
			return;
		}
		if (!Static125.aBoolean60) {
			@Pc(671) Class78 local671;
			for (local143 = 9; local143 >= 5; local143--) {
				local671 = Static60.method771(arg1, local143);
				if (local671 != null) {
					Static188.method3487(arg1.anInt2993, (long) (local143 + 1), (short) 1007, arg1.anInt3044, arg1.aClass78_587, local671);
				}
			}
			local671 = Static126.method2302(arg1);
			if (local671 != null) {
				Static188.method3487(arg1.anInt2993, 0L, (short) 57, arg1.anInt3044, arg1.aClass78_587, local671);
			}
			for (local149 = 4; local149 >= 0; local149--) {
				@Pc(727) Class78 local727 = Static60.method771(arg1, local149);
				if (local727 != null) {
					Static188.method3487(arg1.anInt2993, (long) (local149 + 1), (short) 7, arg1.anInt3044, arg1.aClass78_587, local727);
				}
			}
			if (Static41.method569(Static36.method473(arg1))) {
				Static188.method3487(arg1.anInt2993, 0L, (short) 11, arg1.anInt3044, Static73.aClass78_352, Static74.aClass78_358);
			}
		} else if (Static168.method3774(Static36.method473(arg1)) && (Static29.anInt530 & 0x20) == 32) {
			Static188.method3487(arg1.anInt2993, 0L, (short) 58, arg1.anInt3044, Static94.method1640(new Class78[] { Static19.aClass78_60, Static225.aClass78_866, arg1.aClass78_587 }), Static69.aClass78_317);
		}
	}
}
