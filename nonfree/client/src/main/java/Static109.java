import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lclient!b;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!sa;")
	public static Class67 aClass67_25 = new Class67(64);

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1259 = Static63.method1251("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1260 = Static63.method1251("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1261 = Static63.method1251("p12_full");

	@OriginalMember(owner = "client!ua", name = "sb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1264 = Static63.method1251("Friends");

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1262 = aClass45_1264;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1263 = Static63.method1251("Passwort: ");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
	public static void method1963() {
		aClass45_1264 = null;
		aClass7_4 = null;
		aClass45_1260 = null;
		aClass45_1263 = null;
		aClass45_1261 = null;
		aClass45_1262 = null;
		aClass45_1259 = null;
		aClass67_25 = null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(Z)V")
	public static void method1967() {
		if (Static7.aBooleanArray1[98]) {
			Static27.anInt856 += (12 - Static27.anInt856) / 2;
		} else if (Static7.aBooleanArray1[99]) {
			Static27.anInt856 += (-Static27.anInt856 - 12) / 2;
		} else {
			Static27.anInt856 /= 2;
		}
		Static102.anInt2755 += Static27.anInt856 / 2;
		@Pc(51) int local51 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 + Static91.anInt2541;
		@Pc(61) int local61 = anInt2871 + Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417;
		if (Static7.aBooleanArray1[96]) {
			Static59.anInt1770 += (-Static59.anInt1770 - 24) / 2;
		} else if (Static7.aBooleanArray1[97]) {
			Static59.anInt1770 += (24 - Static59.anInt1770) / 2;
		} else {
			Static59.anInt1770 /= 2;
		}
		if (Static34.anInt955 - local51 < -500 || Static34.anInt955 - local51 > 500 || Static50.anInt1604 - local61 < -500 || Static50.anInt1604 - local61 > 500) {
			Static34.anInt955 = local51;
			Static50.anInt1604 = local61;
		}
		if (Static50.anInt1604 != local61) {
			Static50.anInt1604 += (local61 - Static50.anInt1604) / 16;
		}
		Static112.anInt2981 = Static59.anInt1770 / 2 + Static112.anInt2981 & 0x7FF;
		if (local51 != Static34.anInt955) {
			Static34.anInt955 += (local51 - Static34.anInt955) / 16;
		}
		@Pc(165) int local165 = Static34.anInt955 >> 7;
		@Pc(169) int local169 = Static50.anInt1604 >> 7;
		if (Static102.anInt2755 < 128) {
			Static102.anInt2755 = 128;
		}
		if (Static102.anInt2755 > 383) {
			Static102.anInt2755 = 383;
		}
		@Pc(185) int local185 = 0;
		@Pc(191) int local191 = Static32.method676(Static34.anInt955, Static50.anInt1604, Static8.anInt262);
		@Pc(211) int local211;
		if (local165 > 3 && local169 > 3 && local165 < 100 && local169 < 100) {
			for (local211 = local165 - 4; local211 <= local165 + 4; local211++) {
				for (@Pc(217) int local217 = local169 - 4; local217 <= local169 + 4; local217++) {
					@Pc(221) int local221 = Static8.anInt262;
					if (local221 < 3 && (Static48.aByteArrayArrayArray3[1][local211][local217] & 0x2) == 2) {
						local221++;
					}
					@Pc(249) int local249 = local191 - Static40.anIntArrayArrayArray2[local221][local211][local217];
					if (local185 < local249) {
						local185 = local249;
					}
				}
			}
		}
		local211 = local185 * 192;
		if (local211 > 98048) {
			local211 = 98048;
		}
		if (local211 < 32768) {
			local211 = 32768;
		}
		if (Static52.anInt3138 < local211) {
			Static52.anInt3138 += (local211 - Static52.anInt3138) / 24;
		} else if (local211 < Static52.anInt3138) {
			Static52.anInt3138 += (local211 - Static52.anInt3138) / 80;
			return;
		}
	}
}
