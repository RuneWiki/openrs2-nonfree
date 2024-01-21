import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_9;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array3;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 aClass4_Sub4_Sub5_Sub4_4;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public static int anInt1164;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt1166;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[112];

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_497 = Static134.method2017("<br>(X");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_498 = Static134.method2017("::noclip");

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!gf;")
	public static Class28 aClass28_3 = new Class28(8);

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static volatile int anInt1165 = 0;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt1167 = -1;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_499 = Static134.method2017("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method792() {
		aClass76_497 = null;
		aClass4_Sub4_Sub5_Sub4_4 = null;
		aBooleanArray7 = null;
		aClass76_499 = null;
		aClass76_498 = null;
		aClass28_3 = null;
		aClass4_Sub8_9 = null;
		aClass4_Sub4_Sub5_Sub4Array3 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)J")
	public static synchronized long method793() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static23.aLong23 > local10) {
			Static5.aLong10 += Static23.aLong23 - local10;
		}
		Static23.aLong23 = local10;
		return local10 + Static5.aLong10;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method794() {
		for (@Pc(7) int local7 = 0; local7 < Static64.anInt1644; local7++) {
			@Pc(13) int local13 = Static65.anIntArray62[local7]--;
			if (Static65.anIntArray62[local7] >= -10) {
				@Pc(80) Class65 local80 = Static68.aClass65Array1[local7];
				if (local80 == null) {
					local80 = Static140.method1622(Static12.aClass17_Sub1_4, Static68.anIntArray236[local7], 0);
					if (local80 == null) {
						continue;
					}
					Static65.anIntArray62[local7] += local80.method1625();
					Static68.aClass65Array1[local7] = local80;
				}
				if (Static65.anIntArray62[local7] < 0) {
					@Pc(200) int local200;
					if (Static50.anIntArray162[local7] == 0) {
						local200 = Static45.anInt1205;
					} else {
						@Pc(123) int local123 = (Static50.anIntArray162[local7] & 0xFF) * 128;
						@Pc(131) int local131 = Static50.anIntArray162[local7] >> 16 & 0xFF;
						@Pc(139) int local139 = Static50.anIntArray162[local7] >> 8 & 0xFF;
						@Pc(149) int local149 = local139 * 128 + 64 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416;
						if (local149 < 0) {
							local149 = -local149;
						}
						@Pc(167) int local167 = local131 * 128 + 64 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393;
						if (local167 < 0) {
							local167 = -local167;
						}
						@Pc(178) int local178 = local167 + local149 - 128;
						if (local178 > local123) {
							Static65.anIntArray62[local7] = -100;
							continue;
						}
						if (local178 < 0) {
							local178 = 0;
						}
						local200 = (local123 - local178) * Static36.anInt1021 / local123;
					}
					if (local200 > 0) {
						@Pc(214) Class4_Sub6_Sub1 local214 = local80.method1623().method1489(Static47.aClass77_1);
						@Pc(219) Class4_Sub12_Sub3 local219 = Static139.method1215(local214, local200);
						local219.method1197(Static82.anIntArray280[local7] - 1);
						Static14.aClass4_Sub12_Sub4_1.method1700(local219);
					}
					Static65.anIntArray62[local7] = -100;
				}
			} else {
				Static64.anInt1644--;
				for (@Pc(27) int local27 = local7; local27 < Static64.anInt1644; local27++) {
					Static68.anIntArray236[local27] = Static68.anIntArray236[local27 + 1];
					Static68.aClass65Array1[local27] = Static68.aClass65Array1[local27 + 1];
					Static82.anIntArray280[local27] = Static82.anIntArray280[local27 + 1];
					Static65.anIntArray62[local27] = Static65.anIntArray62[local27 + 1];
					Static50.anIntArray162[local27] = Static50.anIntArray162[local27 + 1];
				}
				local7--;
			}
		}
		if (Static18.aBoolean22 && !Static72.method1355()) {
			if (Static32.anInt808 != 0 && Static118.anInt2556 != -1) {
				Static99.method1943(Static118.anInt2556, Static32.anInt808, 0, Static50.aClass17_Sub1_12);
			}
			Static18.aBoolean22 = false;
		}
	}
}
