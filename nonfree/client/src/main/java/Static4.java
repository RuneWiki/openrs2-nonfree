import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Lclient!ea;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Lclient!ea;")
	public static Class20 aClass20_5;

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "kb", descriptor = "Lclient!b;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!ec;")
	private static Class22 aClass22_17 = Static60.method1113(" is already on your ignore list");

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Lclient!ec;")
	private static Class22 aClass22_18 = Static60.method1113("Please use a different world)3");

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
	public static int[] anIntArray4 = new int[128];

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_30 = Static60.method1113("Your account has been disabled)3");

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Lclient!ec;")
	public static Class22 aClass22_19 = aClass22_30;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!ec;")
	public static Class22 aClass22_20 = aClass22_17;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!ec;")
	public static Class22 aClass22_21 = aClass22_18;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Lclient!ec;")
	public static Class22 aClass22_22 = aClass22_18;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_23 = Static60.method1113("headicons_prayer");

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "Lclient!ec;")
	private static Class22 aClass22_25 = Static60.method1113("Select a world");

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_24 = aClass22_25;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	public static int anInt77 = 0;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_26 = Static60.method1113("headicons_hint");

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_27 = Static60.method1113("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	public static int anInt78 = 0;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "Lclient!ec;")
	private static Class22 aClass22_29 = Static60.method1113("New User");

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_28 = aClass22_29;

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "Lclient!ec;")
	public static Class22 aClass22_31 = Static60.method1113("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!ea;)[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		return Static24.method397(arg0, arg2, arg1) ? Static121.method1884() : null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)I")
	public static int method38(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(24) int local24 = method38(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local24 *= arg0;
			}
			return local24;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)V")
	public static void method39(@OriginalArg(0) boolean arg0) {
		Static48.aBoolean122 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(90) int local90;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(143) int local143;
		if (!Static48.aBoolean122) {
			local13 = Static133.aClass4_Sub11_Sub1_3.method716();
			local17 = Static133.aClass4_Sub11_Sub1_3.method705();
			local21 = Static133.aClass4_Sub11_Sub1_3.method718();
			local29 = (Static96.anInt2463 - Static133.aClass4_Sub11_Sub1_3.anInt1099) / 16;
			Static52.anIntArrayArray13 = new int[local29][4];
			for (local35 = 0; local35 < local29; local35++) {
				for (local39 = 0; local39 < 4; local39++) {
					Static52.anIntArrayArray13[local35][local39] = Static133.aClass4_Sub11_Sub1_3.method736();
				}
			}
			local39 = Static133.aClass4_Sub11_Sub1_3.method711();
			@Pc(65) boolean local65 = false;
			if ((local21 / 8 == 48 || local21 / 8 == 49) && (local17 / 8) == 48) {
				local65 = true;
			}
			local90 = Static133.aClass4_Sub11_Sub1_3.method718();
			Static61.anIntArray176 = new int[local29];
			Static119.aByteArrayArray8 = new byte[local29][];
			Static23.aByteArrayArray1 = new byte[local29][];
			Static34.anIntArray94 = new int[local29];
			if (local21 / 8 == 48 && local17 / 8 == 148) {
				local65 = true;
			}
			Static99.anIntArray284 = new int[local29];
			local29 = 0;
			for (local127 = (local21 - 6) / 8; local127 <= (local21 + 6) / 8; local127++) {
				for (local135 = (local17 - 6) / 8; local135 <= (local17 + 6) / 8; local135++) {
					local143 = local135 + (local127 << 8);
					if (!local65 || local135 != 49 && local135 != 149 && local135 != 147 && local127 != 50 && (local127 != 49 || local135 != 47)) {
						Static34.anIntArray94[local29] = local143;
						Static99.anIntArray284[local29] = Static112.aClass20_Sub1_70.method592(Static44.method856(new Class22[] { Static31.aClass22_202, Static134.method2042(local127), Static15.aClass22_122, Static134.method2042(local135) }));
						Static61.anIntArray176[local29] = Static112.aClass20_Sub1_70.method592(Static44.method856(new Class22[] { Static95.aClass22_541, Static134.method2042(local127), Static15.aClass22_122, Static134.method2042(local135) }));
						local29++;
					}
				}
			}
			Static101.method1699(local13, local90, local17, local21, local39);
			return;
		}
		local13 = Static133.aClass4_Sub11_Sub1_3.method718();
		local17 = Static133.aClass4_Sub11_Sub1_3.method707();
		local21 = Static133.aClass4_Sub11_Sub1_3.method718();
		local29 = Static133.aClass4_Sub11_Sub1_3.method705();
		Static133.aClass4_Sub11_Sub1_3.method747();
		@Pc(303) int local303;
		for (local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < 13; local39++) {
				for (local90 = 0; local90 < 13; local90++) {
					local303 = Static133.aClass4_Sub11_Sub1_3.method748(1);
					if (local303 == 1) {
						Static28.anIntArrayArrayArray1[local35][local39][local90] = Static133.aClass4_Sub11_Sub1_3.method748(26);
					} else {
						Static28.anIntArrayArrayArray1[local35][local39][local90] = -1;
					}
				}
			}
		}
		Static133.aClass4_Sub11_Sub1_3.method751();
		local39 = (Static96.anInt2463 - Static133.aClass4_Sub11_Sub1_3.anInt1099) / 16;
		Static52.anIntArrayArray13 = new int[local39][4];
		for (local90 = 0; local90 < local39; local90++) {
			for (local303 = 0; local303 < 4; local303++) {
				Static52.anIntArrayArray13[local90][local303] = Static133.aClass4_Sub11_Sub1_3.method696();
			}
		}
		local303 = Static133.aClass4_Sub11_Sub1_3.method711();
		Static61.anIntArray176 = new int[local39];
		Static23.aByteArrayArray1 = new byte[local39][];
		Static34.anIntArray94 = new int[local39];
		Static99.anIntArray284 = new int[local39];
		Static119.aByteArrayArray8 = new byte[local39][];
		local39 = 0;
		for (local127 = 0; local127 < 4; local127++) {
			for (local135 = 0; local135 < 13; local135++) {
				for (local143 = 0; local143 < 13; local143++) {
					@Pc(428) int local428 = Static28.anIntArrayArrayArray1[local127][local135][local143];
					if (local428 != -1) {
						@Pc(437) int local437 = local428 >> 14 & 0x3FF;
						@Pc(443) int local443 = local428 >> 3 & 0x7FF;
						@Pc(453) int local453 = local443 / 8 + (local437 / 8 << 8);
						for (@Pc(455) int local455 = 0; local455 < local39; local455++) {
							if (local453 == Static34.anIntArray94[local455]) {
								local453 = -1;
								break;
							}
						}
						if (local453 != -1) {
							Static34.anIntArray94[local39] = local453;
							@Pc(490) int local490 = local453 & 0xFF;
							@Pc(496) int local496 = local453 >> 8 & 0xFF;
							Static99.anIntArray284[local39] = Static112.aClass20_Sub1_70.method592(Static44.method856(new Class22[] { Static31.aClass22_202, Static134.method2042(local496), Static15.aClass22_122, Static134.method2042(local490) }));
							Static61.anIntArray176[local39] = Static112.aClass20_Sub1_70.method592(Static44.method856(new Class22[] { Static95.aClass22_541, Static134.method2042(local496), Static15.aClass22_122, Static134.method2042(local490) }));
							local39++;
						}
					}
				}
			}
		}
		Static101.method1699(local17, local13, local303, local21, local29);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBII)V")
	public static void method40(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static57.anInt1729 == 0 || arg2 == 0 || Static120.anInt2929 >= 50) {
			return;
		}
		Static45.anIntArray133[Static120.anInt2929] = arg0;
		Static105.anIntArray296[Static120.anInt2929] = arg2;
		Static93.anIntArray281[Static120.anInt2929] = arg1;
		Static54.aClass65Array1[Static120.anInt2929] = null;
		Static95.anIntArray198[Static120.anInt2929] = 0;
		Static120.anInt2929++;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	public static void method41() {
		aClass22_28 = null;
		aClass22_31 = null;
		aClass22_22 = null;
		aClass22_21 = null;
		aClass22_19 = null;
		aClass22_25 = null;
		aClass4_Sub1_Sub2_Sub3_1 = null;
		aClass22_27 = null;
		aClass22_20 = null;
		aClass22_24 = null;
		aClass22_23 = null;
		aClass22_26 = null;
		aClass22_18 = null;
		aClass6_1 = null;
		anIntArray4 = null;
		aClass22_17 = null;
		aClass22_29 = null;
		aClass20_5 = null;
		aClass20_4 = null;
		aClass22_30 = null;
	}
}
