import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!ef;")
	public static Class8_Sub1_Sub8 aClass8_Sub1_Sub8_1;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt1589;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public static int anInt1596;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!ic;")
	private static Class34 aClass34_764 = Static56.method816("Cancel");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_759 = aClass34_764;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!ic;")
	private static Class34 aClass34_760 = Static56.method816("OFF");

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_761 = Static56.method816("nav");

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_762 = Static56.method816("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_763 = aClass34_760;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public static int anInt1590 = 2;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
	public static int[] anIntArray194 = new int[2000];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
	public static void method938(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = Static41.anInt986;
		if (Static81.anInt1951 == Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7 && Static50.anInt1321 == Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7) {
			Static81.anInt1951 = 0;
		}
		if (arg0) {
			local7 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local7; local35++) {
			@Pc(51) Class8_Sub1_Sub1_Sub4_Sub1 local51;
			@Pc(45) int local45;
			if (arg0) {
				local45 = 33538048;
				local51 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1;
			} else {
				local45 = Static29.anIntArray109[local35] << 14;
				local51 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local35]];
			}
			if (local51 != null && local51.method1221()) {
				@Pc(68) int local68 = local51.anInt2043 >> 7;
				@Pc(73) int local73 = local51.anInt2059 >> 7;
				local51.aBoolean51 = false;
				if ((Static108.aBoolean98 && Static41.anInt986 > 50 || Static41.anInt986 > 200) && !arg0 && local51.anInt2010 == local51.anInt2063) {
					local51.aBoolean51 = true;
				}
				if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
					if (local51.aClass8_Sub1_Sub1_Sub6_1 == null || Static21.anInt655 < local51.anInt1269 || local51.anInt1270 <= Static21.anInt655) {
						if ((local51.anInt2043 & 0x7F) == 64 && (local51.anInt2059 & 0x7F) == 64) {
							if (Static51.anIntArrayArray10[local68][local73] == Static48.anInt2953) {
								continue;
							}
							Static51.anIntArrayArray10[local68][local73] = Static48.anInt2953;
						}
						local51.anInt1287 = Static123.method1945(local51.anInt2059, Static42.anInt1024, local51.anInt2043);
						Static3.aClass64_1.method1419(Static42.anInt1024, local51.anInt2043, local51.anInt2059, local51.anInt1287, 60, local51, local51.anInt2038, local45, local51.aBoolean78);
					} else {
						local51.aBoolean51 = false;
						local51.anInt1287 = Static123.method1945(local51.anInt2059, Static42.anInt1024, local51.anInt2043);
						Static3.aClass64_1.method1401(Static42.anInt1024, local51.anInt2043, local51.anInt2059, local51.anInt1287, local51, local51.anInt2038, local45, local51.anInt1285, local51.anInt1273, local51.anInt1264, local51.anInt1271);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method939() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static41.anInt986; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static29.anIntArray109[local3];
			}
			@Pc(21) Class8_Sub1_Sub1_Sub4_Sub1 local21 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local13];
			if (local21 != null && local21.anInt2035 > 0) {
				local21.anInt2035--;
				if (local21.anInt2035 == 0) {
					local21.aClass34_919 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static94.anInt2223; local13++) {
			@Pc(61) int local61 = Static50.anIntArray164[local13];
			@Pc(65) Class8_Sub1_Sub1_Sub4_Sub2 local65 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local61];
			if (local65 != null && local65.anInt2035 > 0) {
				local65.anInt2035--;
				if (local65.anInt2035 == 0) {
					local65.aClass34_919 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method940() {
		anIntArray194 = null;
		aClass34_762 = null;
		aClass8_Sub1_Sub8_1 = null;
		aClass34_763 = null;
		aClass34_759 = null;
		aClass34_760 = null;
		aClass34_764 = null;
		aClass34_761 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
	public static void method941(@OriginalArg(1) boolean arg0) {
		Static47.aBoolean52 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(47) int local47;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(161) int local161;
		if (!Static47.aBoolean52) {
			local17 = Static10.aClass8_Sub20_Sub1_1.method1839();
			local21 = (Static32.anInt872 - Static10.aClass8_Sub20_Sub1_1.anInt2853) / 16;
			Static8.anIntArrayArray1 = new int[local21][4];
			for (local25 = 0; local25 < local21; local25++) {
				for (local30 = 0; local30 < 4; local30++) {
					Static8.anIntArrayArray1[local25][local30] = Static10.aClass8_Sub20_Sub1_1.method1861();
				}
			}
			local30 = Static10.aClass8_Sub20_Sub1_1.method1848();
			local34 = Static10.aClass8_Sub20_Sub1_1.method1858();
			local38 = Static10.aClass8_Sub20_Sub1_1.method1839();
			@Pc(379) boolean local379 = false;
			local47 = Static10.aClass8_Sub20_Sub1_1.method1878();
			Static75.aByteArrayArray40 = new byte[local21][];
			if ((local17 / 8 == 48 || local17 / 8 == 49) && (local47 / 8) == 48) {
				local379 = true;
			}
			Static66.anIntArray393 = new int[local21];
			Static124.anIntArray394 = new int[local21];
			Static102.aByteArrayArray71 = new byte[local21][];
			if (local17 / 8 == 48 && local47 / 8 == 148) {
				local379 = true;
			}
			Static52.anIntArray169 = new int[local21];
			local21 = 0;
			for (local153 = (local17 - 6) / 8; local153 <= (local17 + 6) / 8; local153++) {
				for (local157 = (local47 - 6) / 8; local157 <= (local47 + 6) / 8; local157++) {
					local161 = (local153 << 8) + local157;
					if (!local379 || local157 != 49 && local157 != 149 && local157 != 147 && local153 != 50 && (local153 != 49 || local157 != 47)) {
						Static124.anIntArray394[local21] = local161;
						Static66.anIntArray393[local21] = Static36.aClass14_Sub1_6.method1164(Static44.method669(new Class34[] { Static60.aClass34_754, Static44.method672(local153), Static34.aClass34_486, Static44.method672(local157) }));
						Static52.anIntArray169[local21] = Static36.aClass14_Sub1_6.method1164(Static44.method669(new Class34[] { Static106.aClass34_1141, Static44.method672(local153), Static34.aClass34_486, Static44.method672(local157) }));
						local21++;
					}
				}
			}
			Static61.method937(local34, local38, local17, local30, local47);
			return;
		}
		local17 = Static10.aClass8_Sub20_Sub1_1.method1878();
		local21 = Static10.aClass8_Sub20_Sub1_1.method1872();
		local25 = Static10.aClass8_Sub20_Sub1_1.method1858();
		Static10.aClass8_Sub20_Sub1_1.method1897();
		for (local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < 13; local34++) {
				for (local38 = 0; local38 < 13; local38++) {
					local47 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
					if (local47 == 1) {
						Static115.anIntArrayArrayArray8[local30][local34][local38] = Static10.aClass8_Sub20_Sub1_1.method1899(26);
					} else {
						Static115.anIntArrayArrayArray8[local30][local34][local38] = -1;
					}
				}
			}
		}
		Static10.aClass8_Sub20_Sub1_1.method1905();
		local34 = (Static32.anInt872 - Static10.aClass8_Sub20_Sub1_1.anInt2853) / 16;
		Static8.anIntArrayArray1 = new int[local34][4];
		for (local38 = 0; local38 < local34; local38++) {
			for (local47 = 0; local47 < 4; local47++) {
				Static8.anIntArrayArray1[local38][local47] = Static10.aClass8_Sub20_Sub1_1.method1853();
			}
		}
		local47 = Static10.aClass8_Sub20_Sub1_1.method1858();
		@Pc(134) int local134 = Static10.aClass8_Sub20_Sub1_1.method1858();
		Static75.aByteArrayArray40 = new byte[local34][];
		Static102.aByteArrayArray71 = new byte[local34][];
		Static66.anIntArray393 = new int[local34];
		Static124.anIntArray394 = new int[local34];
		Static52.anIntArray169 = new int[local34];
		local34 = 0;
		for (local153 = 0; local153 < 4; local153++) {
			for (local157 = 0; local157 < 13; local157++) {
				for (local161 = 0; local161 < 13; local161++) {
					@Pc(171) int local171 = Static115.anIntArrayArrayArray8[local153][local157][local161];
					if (local171 != -1) {
						@Pc(180) int local180 = local171 >> 3 & 0x7FF;
						@Pc(186) int local186 = local171 >> 14 & 0x3FF;
						@Pc(197) int local197 = (local186 / 8 << 8) + (local180 / 8);
						for (@Pc(199) int local199 = 0; local199 < local34; local199++) {
							if (local197 == Static124.anIntArray394[local199]) {
								local197 = -1;
								break;
							}
						}
						if (local197 != -1) {
							Static124.anIntArray394[local34] = local197;
							@Pc(228) int local228 = local197 >> 8 & 0xFF;
							@Pc(232) int local232 = local197 & 0xFF;
							Static66.anIntArray393[local34] = Static36.aClass14_Sub1_6.method1164(Static44.method669(new Class34[] { Static60.aClass34_754, Static44.method672(local228), Static34.aClass34_486, Static44.method672(local232) }));
							Static52.anIntArray169[local34] = Static36.aClass14_Sub1_6.method1164(Static44.method669(new Class34[] { Static106.aClass34_1141, Static44.method672(local228), Static34.aClass34_486, Static44.method672(local232) }));
							local34++;
						}
					}
				}
			}
		}
		Static61.method937(local134, local25, local47, local21, local17);
	}
}
