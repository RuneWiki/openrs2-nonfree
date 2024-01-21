import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Lclient!he;")
	public static Class11 aClass11_63;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt2626 = 0;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_1065 = Static88.method1421("::errortest");

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[Lclient!me;")
	public static Class10_Sub1_Sub5_Sub2_Sub2[] aClass10_Sub1_Sub5_Sub2_Sub2Array1 = new Class10_Sub1_Sub5_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_1066 = Static88.method1421("::");

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	public static int anInt2641 = -1;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!va;")
	private static Class61 aClass61_1067 = Static88.method1421("Hidden");

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!va;")
	public static Class61 aClass61_1068 = aClass61_1067;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1645() {
		Static57.aClass7_1.method244();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static30.aLongArray3[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static61.aLongArray5[local22] = 0L;
		}
		Static48.anInt1335 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public static void method1646() {
		Static66.aClass29_47.method646();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!j;")
	public static Class10_Sub1_Sub8 method1647(@OriginalArg(1) int arg0) {
		@Pc(17) Class10_Sub1_Sub8 local17 = (Class10_Sub1_Sub8) Static101.aClass29_72.method644((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static56.aClass11_38.method203(3, arg0);
		local17 = new Class10_Sub1_Sub8();
		if (local27 != null) {
			local17.method709(new Class10_Sub10(local27));
		}
		Static101.aClass29_72.method649(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!d;)Z")
	public static boolean method1648(@OriginalArg(1) Class10_Sub1_Sub4 arg0) {
		@Pc(2) int local2 = arg0.anInt600;
		if (Static18.anInt611 == 2) {
			if (local2 == 201) {
				Static15.aClass61_154 = Static15.aClass61_166;
				Static15.aClass61_151 = Static66.aClass61_724;
				Static7.aBoolean1 = true;
				Static1.anInt6 = 0;
				Static10.anInt310 = 1;
				Static32.aBoolean44 = true;
			}
			if (local2 == 202) {
				Static7.aBoolean1 = true;
				Static32.aBoolean44 = true;
				Static15.aClass61_151 = Static8.aClass61_71;
				Static10.anInt310 = 2;
				Static1.anInt6 = 0;
				Static15.aClass61_154 = Static15.aClass61_166;
			}
		}
		if (local2 == 205) {
			Static34.anInt1007 = 250;
			return true;
		}
		if (local2 == 501) {
			Static32.aBoolean44 = true;
			Static7.aBoolean1 = true;
			Static10.anInt310 = 4;
			Static15.aClass61_154 = Static15.aClass61_166;
			Static1.anInt6 = 0;
			Static15.aClass61_151 = Static58.aClass61_646;
		}
		if (local2 == 502) {
			Static15.aClass61_154 = Static15.aClass61_166;
			Static1.anInt6 = 0;
			Static32.aBoolean44 = true;
			Static10.anInt310 = 5;
			Static15.aClass61_151 = Static75.aClass61_812;
			Static7.aBoolean1 = true;
		}
		@Pc(96) int local96;
		@Pc(90) int local90;
		if (local2 >= 300 && local2 <= 313) {
			local90 = local2 & 0x1;
			local96 = (local2 - 300) / 2;
			Static80.aClass44_2.method965(local96, local90 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local90 = local2 & 0x1;
			local96 = (local2 - 314) / 2;
			Static80.aClass44_2.method958(local90 == 1, local96);
		}
		if (local2 == 324) {
			Static80.aClass44_2.method964(false);
		}
		if (local2 == 325) {
			Static80.aClass44_2.method964(true);
		}
		if (local2 == 326) {
			Static50.aClass10_Sub10_Sub1_3.method1167(48);
			Static80.aClass44_2.method967(Static50.aClass10_Sub10_Sub1_3);
			return true;
		}
		if (local2 == 620) {
			Static16.aBoolean23 = !Static16.aBoolean23;
		}
		if (local2 >= 601 && local2 <= 613) {
			Static42.method1472();
			if (Static15.aClass61_144.method1596() > 0) {
				Static50.aClass10_Sub10_Sub1_3.method1167(243);
				Static50.aClass10_Sub10_Sub1_3.method1125(Static15.aClass61_144.method1586());
				Static50.aClass10_Sub10_Sub1_3.method1126(local2 - 601);
				Static50.aClass10_Sub10_Sub1_3.method1126(Static16.aBoolean23 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			if (Static39.aClass61Array2[local13] != null) {
				@Pc(23) int local23 = Static51.anIntArray154[local13];
				@Pc(35) int local35 = Static27.anInt887 + 70 + 4 - local11 * 14;
				if (local35 < -20) {
					break;
				}
				@Pc(44) Class61 local44 = Static48.aClass61Array8[local13];
				if (local23 == 0) {
					local11++;
				}
				if (local44 != null && local44.method1602(Static104.aClass61_1058)) {
					local44 = local44.method1619(5);
				}
				if (local44 != null && local44.method1602(Static44.aClass61_515)) {
					local44 = local44.method1619(5);
				}
				if ((local23 == 1 || local23 == 2) && (local23 == 1 || Static53.anInt1449 == 0 || Static53.anInt1449 == 1 && Static94.method1495(local44))) {
					local11++;
					if (arg0 > local35 - 14 && local35 >= arg0 && !local44.method1608(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699)) {
						if (Static44.anInt1242 >= 1) {
							Static107.method1502(0, 0, 44, 0, Static93.method1156(new Class61[] { Static47.aClass61_544, Static65.aClass61_722, local44 }));
						}
						Static107.method1502(0, 0, 15, 0, Static93.method1156(new Class61[] { Static27.aClass61_332, Static65.aClass61_722, local44 }));
						Static107.method1502(0, 0, 17, 0, Static93.method1156(new Class61[] { Static31.aClass61_370, Static65.aClass61_722, local44 }));
					}
				}
				if ((local23 == 3 || local23 == 7) && Static57.anInt1519 == 0 && (local23 == 7 || Static17.anInt584 == 0 || Static17.anInt584 == 1 && Static94.method1495(local44))) {
					if (arg0 > local35 - 14 && arg0 <= local35) {
						if (Static44.anInt1242 >= 1) {
							Static107.method1502(0, 0, 44, 0, Static93.method1156(new Class61[] { Static47.aClass61_544, Static65.aClass61_722, local44 }));
						}
						Static107.method1502(0, 0, 15, 0, Static93.method1156(new Class61[] { Static27.aClass61_332, Static65.aClass61_722, local44 }));
						Static107.method1502(0, 0, 17, 0, Static93.method1156(new Class61[] { Static31.aClass61_370, Static65.aClass61_722, local44 }));
					}
					local11++;
				}
				if (local23 == 4 && (Static4.anInt25 == 0 || Static4.anInt25 == 1 && Static94.method1495(local44))) {
					if (local35 - 14 < arg0 && local35 >= arg0) {
						Static107.method1502(0, 0, 24, 0, Static93.method1156(new Class61[] { Static66.aClass61_730, Static65.aClass61_722, local44 }));
					}
					local11++;
				}
				if ((local23 == 5 || local23 == 6) && Static57.anInt1519 == 0 && Static17.anInt584 < 2) {
					local11++;
				}
				if (local23 == 8 && (Static4.anInt25 == 0 || Static4.anInt25 == 1 && Static94.method1495(local44))) {
					local11++;
					if (local35 - 14 < arg0 && arg0 <= local35) {
						Static107.method1502(0, 0, 35, 0, Static93.method1156(new Class61[] { Static20.aClass61_1076, Static65.aClass61_722, local44 }));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z")
	public static boolean method1650(@OriginalArg(0) int arg0) {
		if (!Static25.method491(arg0)) {
			return false;
		}
		@Pc(20) boolean local20 = false;
		@Pc(24) Class10_Sub1_Sub4[] local24 = Static104.aClass10_Sub1_Sub4ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class10_Sub1_Sub4 local32 = local24[local26];
			if (local32 != null && local32.anInt577 == 6) {
				@Pc(60) int local60;
				if (local32.anInt578 != -1 || local32.anInt570 != -1) {
					@Pc(55) boolean local55 = Static40.method641(local32);
					if (local55) {
						local60 = local32.anInt570;
					} else {
						local60 = local32.anInt578;
					}
					if (local60 != -1) {
						@Pc(73) Class10_Sub1_Sub6 local73 = Static5.method33(local60);
						local32.anInt556 += Static106.anInt2692;
						label50: while (true) {
							do {
								do {
									if (local32.anInt556 <= local73.anIntArray109[local32.anInt571]) {
										break label50;
									}
									local32.anInt556 -= local73.anIntArray109[local32.anInt571];
									local32.anInt571++;
									local20 = true;
								} while (local32.anInt571 < local73.anIntArray106.length);
								local32.anInt571 -= local73.anInt976;
							} while (local32.anInt571 >= 0 && local73.anIntArray106.length > local32.anInt571);
							local32.anInt571 = 0;
						}
					}
				}
				if (local32.anInt602 != 0) {
					local20 = true;
					@Pc(156) int local156 = local32.anInt602 >> 16;
					local60 = local32.anInt602 << 16 >> 16;
					@Pc(167) int local167 = local156 * Static106.anInt2692;
					local32.anInt582 = local32.anInt582 + local167 & 0x7FF;
					local60 *= Static106.anInt2692;
					local32.anInt566 = local32.anInt566 + local60 & 0x7FF;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public static void method1651() {
		aClass10_Sub1_Sub5_Sub2_Sub2Array1 = null;
		anIntArray335 = null;
		Class64.anIntArray340 = null;
		aClass61_1067 = null;
		aClass61_1065 = null;
		aClass11_63 = null;
		aClass61_1068 = null;
		aClass61_1066 = null;
	}
}
