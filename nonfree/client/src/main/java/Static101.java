import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!mb;")
	public static Class3_Sub17 aClass3_Sub17_2;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_4;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_854 = Static120.method1824("white:");

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!rd;")
	public static Class80 aClass80_853 = aClass80_854;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	public static final int[] anIntArray289 = new int[128];

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_855 = aClass80_854;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method1498(@OriginalArg(0) int arg0) {
		if (Static49.anInt1089 == 0) {
			Static18.aClass3_Sub4_Sub1_1.method229(arg0);
		} else {
			Static25.anInt573 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method1502() {
		if (Static158.aClass77_14 != null || Static64.aClass77_2 != null) {
			return;
		}
		@Pc(17) int local17 = Static107.anInt2370;
		@Pc(24) int local24;
		@Pc(76) int local76;
		if (Static148.aBoolean134) {
			@Pc(26) int local26;
			if (local17 != 1) {
				local24 = Static3.anInt153;
				local26 = Static190.anInt4379;
				if (Static58.anInt1293 - 10 > local26 || Static46.anInt1056 + Static58.anInt1293 + 10 < local26 || local24 < Static191.anInt4389 - 10 || local24 > Static191.anInt4389 + Static27.anInt4466 + 10) {
					Static148.aBoolean134 = false;
					Static89.method1311(Static191.anInt4389, Static58.anInt1293, Static46.anInt1056, Static27.anInt4466);
				}
			}
			if (local17 == 1) {
				local26 = Static58.anInt1293;
				local24 = Static191.anInt4389;
				local76 = Static46.anInt1056;
				@Pc(78) int local78 = Static37.anInt855;
				@Pc(80) int local80 = Static20.anInt497;
				@Pc(82) int local82 = -1;
				for (@Pc(84) int local84 = 0; local84 < Static173.anInt3892; local84++) {
					@Pc(100) int local100 = local24 + (Static173.anInt3892 - local84 - 1) * 15 + 31;
					if (local78 > local26 && local76 + local26 > local78 && local80 > local100 - 13 && local100 + 3 > local80) {
						local82 = local84;
					}
				}
				if (local82 != -1) {
					Static144.method2296(local82);
				}
				Static148.aBoolean134 = false;
				Static89.method1311(Static191.anInt4389, Static58.anInt1293, Static46.anInt1056, Static27.anInt4466);
				return;
			}
			return;
		}
		if (local17 == 1 && Static173.anInt3892 > 0) {
			@Pc(166) short local166 = Static160.aShortArray46[Static173.anInt3892 - 1];
			if (local166 == 49 || local166 == 22 || local166 == 24 || local166 == 41 || local166 == 7 || local166 == 23 || local166 == 51 || local166 == 39 || local166 == 44 || local166 == 40 || local166 == 13 || local166 == 1007) {
				local24 = Static73.anIntArray200[Static173.anInt3892 - 1];
				local76 = Static19.anIntArray67[Static173.anInt3892 - 1];
				@Pc(228) Class77 local228 = Static92.method2208(local76);
				if (Static104.method1559(Static71.method1062(local228)) || Static169.method691(Static71.method1062(local228))) {
					Static183.aBoolean164 = false;
					Static159.anInt3558 = 0;
					if (Static158.aClass77_14 != null) {
						Static186.method3014(Static158.aClass77_14);
					}
					Static158.aClass77_14 = Static92.method2208(local76);
					Static153.anInt657 = local24;
					Static157.anInt3506 = Static37.anInt855;
					Static175.anInt3944 = Static20.anInt497;
					Static186.method3014(Static158.aClass77_14);
					return;
				}
			}
		}
		if (local17 == 1 && (Static44.anInt1007 == 1 && Static173.anInt3892 > 2 || Static77.method1276(Static173.anInt3892 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static173.anInt3892 > 0) {
			Static144.method2296(Static173.anInt3892 - 1);
		}
		if (local17 != 2 || Static173.anInt3892 <= 0) {
			return;
		}
		Static144.method2295();
	}
}
