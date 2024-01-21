import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!jd;")
	public static Class36 aClass36_44;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!pa;")
	public static Class51 aClass51_40;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt1900 = -1;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_837 = Static2.method66("Fallen lassen");

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!ke;")
	private static Class39 aClass39_838 = Static2.method66("Invalid username or password)3");

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_839 = Static2.method66("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public static int anInt1902 = 0;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_840 = aClass39_838;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!qd;")
	public static Class54 aClass54_21 = new Class54(100);

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_841 = Static2.method66("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public static void method1360(@OriginalArg(1) boolean arg0) {
		Static67.aBoolean95 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(41) int local41;
		@Pc(136) int local136;
		@Pc(161) int local161;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (!Static67.aBoolean95) {
			local17 = Static51.aClass2_Sub5_Sub1_4.method1261();
			local21 = Static51.aClass2_Sub5_Sub1_4.method1273();
			local26 = (Static48.anInt1342 - Static51.aClass2_Sub5_Sub1_4.anInt1772) / 16;
			Static54.anIntArrayArray15 = new int[local26][4];
			for (local30 = 0; local30 < local26; local30++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static54.anIntArrayArray15[local30][local34] = Static51.aClass2_Sub5_Sub1_4.method1294();
				}
			}
			local34 = Static51.aClass2_Sub5_Sub1_4.method1261();
			@Pc(387) boolean local387 = false;
			local41 = Static51.aClass2_Sub5_Sub1_4.method1281();
			local136 = Static51.aClass2_Sub5_Sub1_4.method1247();
			Static10.aByteArrayArray2 = new byte[local26][];
			if ((local136 / 8 == 48 || local136 / 8 == 49) && local34 / 8 == 48) {
				local387 = true;
			}
			aByteArrayArray8 = new byte[local26][];
			if (local136 / 8 == 48 && local34 / 8 == 148) {
				local387 = true;
			}
			Static39.anIntArray165 = new int[local26];
			Static37.anIntArray164 = new int[local26];
			Static63.anIntArray237 = new int[local26];
			local26 = 0;
			for (local161 = (local136 - 6) / 8; local161 <= (local136 + 6) / 8; local161++) {
				for (local165 = (local34 - 6) / 8; local165 <= (local34 + 6) / 8; local165++) {
					local169 = (local161 << 8) + local165;
					if (!local387 || local165 != 49 && local165 != 149 && local165 != 147 && local161 != 50 && (local161 != 49 || local165 != 47)) {
						Static37.anIntArray164[local26] = local169;
						Static63.anIntArray237[local26] = Static19.aClass36_Sub1_5.method1774(Static20.method431(new Class39[] { Static4.aClass39_45, Static31.method1267(local161), Static79.aClass39_1264, Static31.method1267(local165) }));
						Static39.anIntArray165[local26] = Static19.aClass36_Sub1_5.method1774(Static20.method431(new Class39[] { Static92.aClass39_1101, Static31.method1267(local161), Static79.aClass39_1264, Static31.method1267(local165) }));
						local26++;
					}
				}
			}
			Static67.method1403(local21, local34, local136, local17, local41);
			return;
		}
		local17 = Static51.aClass2_Sub5_Sub1_4.method1261();
		local21 = Static51.aClass2_Sub5_Sub1_4.method1261();
		Static51.aClass2_Sub5_Sub1_4.method1299();
		for (local26 = 0; local26 < 4; local26++) {
			for (local30 = 0; local30 < 13; local30++) {
				for (local34 = 0; local34 < 13; local34++) {
					local41 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
					if (local41 == 1) {
						Static57.anIntArrayArrayArray4[local26][local30][local34] = Static51.aClass2_Sub5_Sub1_4.method1309(26);
					} else {
						Static57.anIntArrayArrayArray4[local26][local30][local34] = -1;
					}
				}
			}
		}
		Static51.aClass2_Sub5_Sub1_4.method1303();
		local30 = (Static48.anInt1342 - Static51.aClass2_Sub5_Sub1_4.anInt1772) / 16;
		Static54.anIntArrayArray15 = new int[local30][4];
		for (local34 = 0; local34 < local30; local34++) {
			for (local41 = 0; local41 < 4; local41++) {
				Static54.anIntArrayArray15[local34][local41] = Static51.aClass2_Sub5_Sub1_4.method1253();
			}
		}
		local41 = Static51.aClass2_Sub5_Sub1_4.method1261();
		local136 = Static51.aClass2_Sub5_Sub1_4.method1271();
		@Pc(142) int local142 = Static51.aClass2_Sub5_Sub1_4.method1264();
		Static39.anIntArray165 = new int[local30];
		Static37.anIntArray164 = new int[local30];
		aByteArrayArray8 = new byte[local30][];
		Static10.aByteArrayArray2 = new byte[local30][];
		Static63.anIntArray237 = new int[local30];
		local30 = 0;
		for (local161 = 0; local161 < 4; local161++) {
			for (local165 = 0; local165 < 13; local165++) {
				for (local169 = 0; local169 < 13; local169++) {
					@Pc(179) int local179 = Static57.anIntArrayArrayArray4[local161][local165][local169];
					if (local179 != -1) {
						@Pc(188) int local188 = local179 >> 14 & 0x3FF;
						@Pc(194) int local194 = local179 >> 3 & 0x7FF;
						@Pc(204) int local204 = local194 / 8 + (local188 / 8 << 8);
						for (@Pc(206) int local206 = 0; local206 < local30; local206++) {
							if (local204 == Static37.anIntArray164[local206]) {
								local204 = -1;
								break;
							}
						}
						if (local204 != -1) {
							Static37.anIntArray164[local30] = local204;
							@Pc(237) int local237 = local204 & 0xFF;
							@Pc(243) int local243 = local204 >> 8 & 0xFF;
							Static63.anIntArray237[local30] = Static19.aClass36_Sub1_5.method1774(Static20.method431(new Class39[] { Static4.aClass39_45, Static31.method1267(local243), Static79.aClass39_1264, Static31.method1267(local237) }));
							Static39.anIntArray165[local30] = Static19.aClass36_Sub1_5.method1774(Static20.method431(new Class39[] { Static92.aClass39_1101, Static31.method1267(local243), Static79.aClass39_1264, Static31.method1267(local237) }));
							local30++;
						}
					}
				}
			}
		}
		Static67.method1403(local17, local136, local21, local41, local142);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1361() {
		aClass39_840 = null;
		aClass36_44 = null;
		aByteArrayArray8 = null;
		aClass39_837 = null;
		aClass39_841 = null;
		aClass39_839 = null;
		aClass54_21 = null;
		aClass39_838 = null;
		aClass51_40 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!jd;Lclient!jd;BLclient!jd;)V")
	public static void method1362(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(3) Class36 arg2) {
		Static8.aClass36_7 = arg1;
		Static37.aClass36_29 = arg0;
		Static15.aClass36_74 = arg2;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1363(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static104.anInt2784 > 0) {
			local16 = Static29.aByteArrayArray4[--Static104.anInt2784];
			Static29.aByteArrayArray4[Static104.anInt2784] = null;
			return local16;
		} else if (arg0 == 5000 && Static16.anInt474 > 0) {
			local16 = Static86.aByteArrayArray9[--Static16.anInt474];
			Static86.aByteArrayArray9[Static16.anInt474] = null;
			return local16;
		} else if (arg0 == 30000 && Static7.anInt158 > 0) {
			local16 = Static42.aByteArrayArray5[--Static7.anInt158];
			Static42.aByteArrayArray5[Static7.anInt158] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
