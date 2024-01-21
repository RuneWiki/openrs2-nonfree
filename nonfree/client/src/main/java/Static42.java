import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1170 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
	public static int[] anIntArray104 = new int[100];

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!h;")
	public static Class33 aClass33_3 = null;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
	public static int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public static int anInt1174 = 0;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!kb;")
	private static Class46 aClass46_372 = Static65.method1172("Loaded title screen");

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_373 = aClass46_372;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "[I")
	public static int[] anIntArray106 = new int[32768];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method850() {
		anIntArray105 = null;
		aClass46_373 = null;
		aClass44_Sub1_2 = null;
		anIntArray104 = null;
		aClass46_372 = null;
		anIntArray106 = null;
		aClass33_3 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	public static void method851(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = Static180.anInt3971;
		if (Static32.anInt911 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7 && Static18.anInt423 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7) {
			Static32.anInt911 = 0;
		}
		if (arg0) {
			local7 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local7; local35++) {
			@Pc(45) Class3_Sub2_Sub1_Sub1_Sub1 local45;
			@Pc(51) int local51;
			if (arg0) {
				local45 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1;
				local51 = 33538048;
			} else {
				local45 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local35]];
				local51 = Static127.anIntArray338[local35] << 14;
			}
			if (local45 != null && local45.method1161()) {
				@Pc(68) int local68 = local45.anInt1700 >> 7;
				@Pc(73) int local73 = local45.anInt1711 >> 7;
				local45.aBoolean29 = false;
				if ((Static71.aBoolean76 && Static180.anInt3971 > 50 || Static180.anInt3971 > 200) && !arg0 && local45.anInt1683 == local45.anInt1719) {
					local45.aBoolean29 = true;
				}
				if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
					if (local45.aClass3_Sub2_Sub1_Sub2_1 == null || Static20.anInt512 < local45.anInt903 || Static20.anInt512 >= local45.anInt904) {
						if ((local45.anInt1700 & 0x7F) == 64 && (local45.anInt1711 & 0x7F) == 64) {
							if (Static155.anIntArrayArray36[local68][local73] == anInt1175) {
								continue;
							}
							Static155.anIntArrayArray36[local68][local73] = anInt1175;
						}
						local45.anInt1696 = Static168.method2689(local45.anInt1711, local45.anInt1700, Static99.anInt2422);
						Static154.aClass62_1.method2005(Static99.anInt2422, local45.anInt1700, local45.anInt1711, local45.anInt1696, 60, local45, local45.anInt1736, local51, local45.aBoolean65);
					} else {
						local45.aBoolean29 = false;
						local45.anInt1696 = Static168.method2689(local45.anInt1711, local45.anInt1700, Static99.anInt2422);
						Static154.aClass62_1.method2001(Static99.anInt2422, local45.anInt1700, local45.anInt1711, local45.anInt1696, local45, local45.anInt1736, local51, local45.anInt899, local45.anInt898, local45.anInt897, local45.anInt900);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!h;III)V")
	public static void method852(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1487 == 1) {
			Static120.method2041(arg0.aClass46_478, 58, 0, Static38.aClass46_298, 0, arg0.anInt1434);
		}
		if (arg0.anInt1487 == 2 && !Static90.aBoolean94) {
			@Pc(35) Class46 local35 = Static26.method436(arg0);
			if (local35 != null) {
				Static120.method2041(local35, 57, -1, Static178.method2860(new Class46[] { Static48.aClass46_436, arg0.aClass46_480 }), 0, arg0.anInt1434);
			}
		}
		if (arg0.anInt1487 == 3) {
			Static120.method2041(Static147.aClass46_1170, 12, 0, Static38.aClass46_298, 0, arg0.anInt1434);
		}
		if (arg0.anInt1487 == 4) {
			Static120.method2041(arg0.aClass46_478, 30, 0, Static38.aClass46_298, 0, arg0.anInt1434);
		}
		if (arg0.anInt1487 == 5) {
			Static120.method2041(arg0.aClass46_478, 19, 0, Static38.aClass46_298, 0, arg0.anInt1434);
		}
		if (arg0.anInt1487 == 6 && Static71.aClass33_7 == null) {
			Static120.method2041(arg0.aClass46_478, 13, -1, Static38.aClass46_298, 0, arg0.anInt1434);
		}
		@Pc(158) int local158;
		@Pc(152) int local152;
		if (arg0.anInt1441 == 2) {
			local152 = 0;
			for (@Pc(154) int local154 = 0; local154 < arg0.anInt1428; local154++) {
				for (local158 = 0; local158 < arg0.anInt1424; local158++) {
					@Pc(167) int local167 = (arg0.anInt1489 + 32) * local158;
					@Pc(175) int local175 = (arg0.anInt1440 + 32) * local154;
					if (local152 < 20) {
						local175 += arg0.anIntArray145[local152];
						local167 += arg0.anIntArray141[local152];
					}
					if (arg1 >= local167 && local175 <= arg2 && arg1 < local167 + 32 && arg2 < local175 + 32) {
						Static52.anInt1392 = local152;
						Static27.aClass33_1 = arg0;
						if (arg0.anIntArray142[local152] > 0) {
							@Pc(237) Class3_Sub2_Sub14 local237 = Static146.method2432(arg0.anIntArray142[local152] - 1);
							if (Static127.anInt3014 == 1 && Static58.method1092(Static157.method2541(arg0))) {
								if (Static124.anInt2959 != arg0.anInt1434 || local152 != Static130.anInt3066) {
									Static120.method2041(Static136.aClass46_1096, 46, local152, Static178.method2860(new Class46[] { Static94.aClass46_772, Static84.aClass46_710, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
								}
							} else if (!Static90.aBoolean94 || !Static58.method1092(Static157.method2541(arg0))) {
								@Pc(345) Class46[] local345 = local237.aClass46Array20;
								if (Static128.aBoolean125) {
									local345 = Static40.method841(local345);
								}
								@Pc(361) int local361;
								@Pc(409) byte local409;
								if (Static58.method1092(Static157.method2541(arg0))) {
									for (local361 = 4; local361 >= 3; local361--) {
										if (local345 != null && local345[local361] != null) {
											if (local361 == 3) {
												local409 = 4;
											} else {
												local409 = 2;
											}
											Static120.method2041(local345[local361], local409, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
										} else if (local361 == 4) {
											Static120.method2041(Static79.aClass46_682, 2, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
										}
									}
								}
								if (Static94.method1560(Static157.method2541(arg0))) {
									Static120.method2041(Static136.aClass46_1096, 6, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
								}
								if (Static58.method1092(Static157.method2541(arg0)) && local345 != null) {
									for (local361 = 2; local361 >= 0; local361--) {
										if (local345[local361] != null) {
											local409 = 0;
											if (local361 == 0) {
												local409 = 41;
											}
											if (local361 == 1) {
												local409 = 1;
											}
											if (local361 == 2) {
												local409 = 29;
											}
											Static120.method2041(local345[local361], local409, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
										}
									}
								}
								local345 = arg0.aClass46Array9;
								if (Static128.aBoolean125) {
									local345 = Static40.method841(local345);
								}
								if (local345 != null) {
									for (local361 = 4; local361 >= 0; local361--) {
										if (local345[local361] != null) {
											local409 = 0;
											if (local361 == 0) {
												local409 = 26;
											}
											if (local361 == 1) {
												local409 = 42;
											}
											if (local361 == 2) {
												local409 = 7;
											}
											if (local361 == 3) {
												local409 = 40;
											}
											if (local361 == 4) {
												local409 = 36;
											}
											Static120.method2041(local345[local361], local409, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
										}
									}
								}
								Static120.method2041(Static60.aClass46_549, 1005, local152, Static178.method2860(new Class46[] { Static54.aClass46_475, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
							} else if ((Static64.anInt1664 & 0x10) == 16) {
								Static120.method2041(Static182.aClass46_1452, 50, local152, Static178.method2860(new Class46[] { Static106.aClass46_837, Static84.aClass46_710, local237.aClass46_1163 }), local237.anInt3334, arg0.anInt1434);
							}
						}
					}
					local152++;
				}
			}
		}
		if (!arg0.aBoolean50) {
			return;
		}
		if (Static90.aBoolean94) {
			if (Static161.method2579(Static157.method2541(arg0)) && (Static64.anInt1664 & 0x20) == 32) {
				Static120.method2041(Static182.aClass46_1452, 48, arg0.anInt1468, Static178.method2860(new Class46[] { Static106.aClass46_837, Static97.aClass46_591, arg0.aClass46_482 }), 0, arg0.anInt1434);
				return;
			}
			return;
		}
		@Pc(724) Class46 local724;
		for (local152 = 9; local152 >= 5; local152--) {
			local724 = Static65.method1173(arg0, local152);
			if (local724 != null) {
				Static120.method2041(local724, 1006, arg0.anInt1468, arg0.aClass46_482, local152 + 1, arg0.anInt1434);
			}
		}
		local724 = Static26.method436(arg0);
		if (local724 != null) {
			Static120.method2041(local724, 57, arg0.anInt1468, arg0.aClass46_482, 0, arg0.anInt1434);
		}
		for (local158 = 4; local158 >= 0; local158--) {
			@Pc(779) Class46 local779 = Static65.method1173(arg0, local158);
			if (local779 != null) {
				Static120.method2041(local779, 22, arg0.anInt1468, arg0.aClass46_482, local158 + 1, arg0.anInt1434);
			}
		}
		if (Static99.method1638(Static157.method2541(arg0))) {
			Static120.method2041(Static16.aClass46_119, 13, arg0.anInt1468, Static38.aClass46_298, 0, arg0.anInt1434);
			return;
		}
	}
}
