import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!md", name = "T", descriptor = "I")
	public static volatile int anInt1983 = 0;

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "Lclient!mb;")
	private static Class45 aClass45_844 = Static63.method1251("This computers address has been blocked");

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
	public static int anInt1993 = 0;

	@OriginalMember(owner = "client!md", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_845 = Static63.method1251("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!md", name = "ob", descriptor = "Lclient!mb;")
	private static Class45 aClass45_846 = Static63.method1251("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!md", name = "pb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_847 = aClass45_846;

	@OriginalMember(owner = "client!md", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_848 = aClass45_844;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!sd;Lclient!sd;Lclient!sd;)V")
	public static void method1346(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class29 arg2) {
		Static108.aClass29_71 = arg0;
		Static54.aClass29_36 = arg2;
		Static49.aClass29_35 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Lclient!mb;")
	public static Class45 method1347(@OriginalArg(1) int arg0) {
		return Static39.method1443(new Class45[] { Static76.method1476(arg0 >> 24 & 0xFF), Static64.aClass45_788, Static76.method1476(arg0 >> 16 & 0xFF), Static64.aClass45_788, Static76.method1476(arg0 >> 8 & 0xFF), Static64.aClass45_788, Static76.method1476(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(Z)V")
	public static void method1349() {
		Static121.aClass67_19.method1819();
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(Z)V")
	public static void method1351() {
		aClass45_847 = null;
		aClass45_846 = null;
		aClass45_848 = null;
		aClass45_844 = null;
		aClass45_845 = null;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)V")
	public static void method1352(@OriginalArg(1) int arg0) {
		Static23.method545();
		@Pc(19) int local19 = Static34.method688(arg0).anInt170;
		if (local19 == 0) {
			return;
		}
		@Pc(26) int local26 = Static117.anIntArray483[arg0];
		if (local19 == 1) {
			if (local26 == 1) {
				Static86.method1667(0.9D);
				((Class57) Static86.anInterface2_1).method1681(0.9D);
			}
			if (local26 == 2) {
				Static86.method1667(0.8D);
				((Class57) Static86.anInterface2_1).method1681(0.8D);
			}
			if (local26 == 3) {
				Static86.method1667(0.7D);
				((Class57) Static86.anInterface2_1).method1681(0.7D);
			}
			if (local26 == 4) {
				Static86.method1667(0.6D);
				((Class57) Static86.anInterface2_1).method1681(0.6D);
			}
			Static120.method2145();
			Static19.aBoolean26 = true;
		}
		if (local19 == 3) {
			@Pc(84) short local84 = 0;
			if (local26 == 0) {
				local84 = 255;
			}
			if (local26 == 1) {
				local84 = 192;
			}
			if (local26 == 2) {
				local84 = 128;
			}
			if (local26 == 3) {
				local84 = 64;
			}
			if (local26 == 4) {
				local84 = 0;
			}
			if (Static107.anInt2807 != local84) {
				if (Static107.anInt2807 == 0 && Static73.anInt2169 != -1) {
					Static61.method1224(Static21.aClass29_Sub1_11, Static73.anInt2169, local84, 0);
					Static61.aBoolean88 = false;
				} else if (local84 == 0) {
					Static77.method1482();
					Static61.aBoolean88 = false;
				} else {
					Static122.method2158(local84);
				}
				Static107.anInt2807 = local84;
			}
		}
		if (local19 == 5) {
			Static75.anInt2180 = local26;
		}
		if (local19 == 8) {
			Static98.anInt2653 = local26;
			Static51.aBoolean81 = true;
		}
		if (local19 == 4) {
			if (local26 == 0) {
				Static37.anInt1080 = 127;
			}
			if (local26 == 1) {
				Static37.anInt1080 = 96;
			}
			if (local26 == 2) {
				Static37.anInt1080 = 64;
			}
			if (local26 == 3) {
				Static37.anInt1080 = 32;
			}
			if (local26 == 4) {
				Static37.anInt1080 = 0;
			}
		}
		if (local19 == 9) {
			Static54.anInt1636 = local26;
		}
		if (local19 == 6) {
			Static106.anInt2791 = local26;
		}
		if (local19 != 10) {
			return;
		}
		if (local26 == 0) {
			Static116.anInt3035 = 127;
		}
		if (local26 == 1) {
			Static116.anInt3035 = 96;
		}
		if (local26 == 2) {
			Static116.anInt3035 = 64;
		}
		if (local26 == 3) {
			Static116.anInt3035 = 32;
		}
		if (local26 == 4) {
			Static116.anInt3035 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBLclient!r;)V")
	public static void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub6_Sub3 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static112.anInt2981 + Static100.anInt2699 & 0x7FF;
		@Pc(20) int local20 = arg1 * arg1 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(32) int local32 = Class5_Sub2_Sub6_Sub2.anIntArray360[local12];
		@Pc(36) int local36 = Class5_Sub2_Sub6_Sub2.anIntArray362[local12];
		@Pc(44) int local44 = local36 * 256 / (Static4.anInt98 + 256);
		@Pc(52) int local52 = local32 * 256 / (Static4.anInt98 + 256);
		@Pc(62) int local62 = arg0 * local44 + arg1 * local52 >> 16;
		@Pc(73) int local73 = arg1 * local44 - local52 * arg0 >> 16;
		if (local20 <= 2500) {
			arg2.method1781(local62 + 94 + 4 - arg2.anInt2601 / 2, -local73 + 83 + (-(arg2.anInt2600 / 2) - 4));
		} else {
			arg2.method1778(Static117.aClass5_Sub2_Sub6_Sub4_49, local62 + 94 + 4 - arg2.anInt2601 / 2, -local73 + -4 + 83 + -(arg2.anInt2600 / 2));
		}
	}
}
