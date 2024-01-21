import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 aClass3_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt825 = 3;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!hb;")
	private static Class27 aClass27_415 = Static87.method1648("Bad session id)3");

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!hb;")
	public static Class27 aClass27_413 = aClass27_415;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_414 = Static87.method1648("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public static int anInt829 = 0;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray156 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method675() {
		anIntArray156 = null;
		anIntArray154 = null;
		aClass27_414 = null;
		aClass3_Sub3_Sub2_Sub2_4 = null;
		aClass27_413 = null;
		anIntArray155 = null;
		aClass27_415 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V")
	public static void method676(@OriginalArg(0) boolean arg0) {
		Static65.aBoolean89 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(151) int local151;
		if (!Static65.aBoolean89) {
			local21 = Static47.aClass3_Sub11_Sub1_1.method1457();
			local25 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local33 = (Static11.anInt2733 - Static47.aClass3_Sub11_Sub1_1.anInt2060) / 16;
			Static98.anIntArrayArray66 = new int[local33][4];
			for (local39 = 0; local39 < local33; local39++) {
				for (local43 = 0; local43 < 4; local43++) {
					Static98.anIntArrayArray66[local39][local43] = Static47.aClass3_Sub11_Sub1_1.method1465();
				}
			}
			local43 = Static47.aClass3_Sub11_Sub1_1.method1441();
			@Pc(69) boolean local69 = false;
			local73 = Static47.aClass3_Sub11_Sub1_1.method1419();
			local77 = Static47.aClass3_Sub11_Sub1_1.method1457();
			if ((local77 / 8 == 48 || local77 / 8 == 49) && (local21 / 8) == 48) {
				local69 = true;
			}
			Static8.anIntArray42 = new int[local33];
			if (local77 / 8 == 48 && local21 / 8 == 148) {
				local69 = true;
			}
			Static13.anIntArray147 = new int[local33];
			Static72.aByteArrayArray9 = new byte[local33][];
			Static65.aByteArrayArray7 = new byte[local33][];
			Static72.anIntArray317 = new int[local33];
			local33 = 0;
			for (local135 = (local77 - 6) / 8; local135 <= (local77 + 6) / 8; local135++) {
				for (local143 = (local21 - 6) / 8; local143 <= (local21 + 6) / 8; local143++) {
					local151 = local143 + (local135 << 8);
					if (!local69 || local143 != 49 && local143 != 149 && local143 != 147 && local135 != 50 && (local135 != 49 || local143 != 47)) {
						Static72.anIntArray317[local33] = local151;
						Static8.anIntArray42[local33] = Static68.aClass54_Sub1_31.method1620(Static98.method1779(new Class27[] { Static4.aClass27_1333, Static97.method1616(local135), Static87.aClass27_1102, Static97.method1616(local143) }));
						Static13.anIntArray147[local33] = Static68.aClass54_Sub1_31.method1620(Static98.method1779(new Class27[] { Static83.aClass27_1127, Static97.method1616(local135), Static87.aClass27_1102, Static97.method1616(local143) }));
						local33++;
					}
				}
			}
			Static102.method1832(local77, local25, local43, local21, local73);
			return;
		}
		local21 = Static47.aClass3_Sub11_Sub1_1.method1451();
		Static47.aClass3_Sub11_Sub1_1.method1475();
		for (local25 = 0; local25 < 4; local25++) {
			for (local33 = 0; local33 < 13; local33++) {
				for (local39 = 0; local39 < 13; local39++) {
					local43 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
					if (local43 == 1) {
						Static16.anIntArrayArrayArray1[local25][local33][local39] = Static47.aClass3_Sub11_Sub1_1.method1476(26);
					} else {
						Static16.anIntArrayArrayArray1[local25][local33][local39] = -1;
					}
				}
			}
		}
		Static47.aClass3_Sub11_Sub1_1.method1480();
		local33 = (Static11.anInt2733 - Static47.aClass3_Sub11_Sub1_1.anInt2060) / 16;
		Static98.anIntArrayArray66 = new int[local33][4];
		for (local39 = 0; local39 < local33; local39++) {
			for (local43 = 0; local43 < 4; local43++) {
				Static98.anIntArrayArray66[local39][local43] = Static47.aClass3_Sub11_Sub1_1.method1423();
			}
		}
		local43 = Static47.aClass3_Sub11_Sub1_1.method1451();
		local73 = Static47.aClass3_Sub11_Sub1_1.method1422();
		local77 = Static47.aClass3_Sub11_Sub1_1.method1419();
		@Pc(407) int local407 = Static47.aClass3_Sub11_Sub1_1.method1457();
		Static65.aByteArrayArray7 = new byte[local33][];
		Static72.aByteArrayArray9 = new byte[local33][];
		Static72.anIntArray317 = new int[local33];
		Static8.anIntArray42 = new int[local33];
		Static13.anIntArray147 = new int[local33];
		local33 = 0;
		for (local135 = 0; local135 < 4; local135++) {
			for (local143 = 0; local143 < 13; local143++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(444) int local444 = Static16.anIntArrayArrayArray1[local135][local143][local151];
					if (local444 != -1) {
						@Pc(453) int local453 = local444 >> 3 & 0x7FF;
						@Pc(459) int local459 = local444 >> 14 & 0x3FF;
						@Pc(469) int local469 = (local459 / 8 << 8) + local453 / 8;
						for (@Pc(471) int local471 = 0; local471 < local33; local471++) {
							if (Static72.anIntArray317[local471] == local469) {
								local469 = -1;
								break;
							}
						}
						if (local469 != -1) {
							Static72.anIntArray317[local33] = local469;
							@Pc(503) int local503 = local469 >> 8 & 0xFF;
							@Pc(507) int local507 = local469 & 0xFF;
							Static8.anIntArray42[local33] = Static68.aClass54_Sub1_31.method1620(Static98.method1779(new Class27[] { Static4.aClass27_1333, Static97.method1616(local503), Static87.aClass27_1102, Static97.method1616(local507) }));
							Static13.anIntArray147[local33] = Static68.aClass54_Sub1_31.method1620(Static98.method1779(new Class27[] { Static83.aClass27_1127, Static97.method1616(local503), Static87.aClass27_1102, Static97.method1616(local507) }));
							local33++;
						}
					}
				}
			}
		}
		Static102.method1832(local407, local73, local77, local43, local21);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method677() {
		Static15.aClass21_10.method663();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!hb;Lclient!wd;B)I")
	public static int method678(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		@Pc(14) int local14 = arg1.anInt2060;
		arg1.method1435(arg0.anInt963);
		arg1.anInt2060 += Static31.aClass41_1.method1195(0, arg1.anInt2060, arg0.anInt963, arg0.aByteArray9, arg1.aByteArray17);
		return arg1.anInt2060 - local14;
	}
}
