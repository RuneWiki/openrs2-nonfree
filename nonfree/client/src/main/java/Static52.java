import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array24;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!mb;")
	public static Class42 aClass42_29;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!ne;")
	public static Class46 aClass46_3;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_493 = Static45.method753("mapedge");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_494 = Static45.method753("logo");

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)V")
	public static void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static7.aClass62Array1[local9] != null) {
				@Pc(27) int local27 = Static26.anInt807 + 70 + 4 - local7 * 14;
				@Pc(31) int local31 = Static56.anIntArray123[local9];
				if (local27 < -20) {
					break;
				}
				if (local31 == 0) {
					local7++;
				}
				@Pc(43) Class62 local43 = Static7.aClass62Array2[local9];
				if (local43 != null && local43.method1690(Static32.aClass62_433)) {
					local43 = local43.method1702(5);
				}
				if (local43 != null && local43.method1690(Static21.aClass62_305)) {
					local43 = local43.method1702(5);
				}
				if ((local31 == 1 || local31 == 2) && (local31 == 1 || Static72.anInt1948 == 0 || Static72.anInt1948 == 1 && Static64.method1085(local43))) {
					local7++;
					if (arg1 > local27 - 14 && local27 >= arg1 && !local43.method1675(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570)) {
						if (Static48.anInt1373 >= 1) {
							Static91.method1543(Static54.aClass62_1241, 0, 23, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
						}
						Static91.method1543(Static27.aClass62_342, 0, 21, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
						Static91.method1543(Static25.aClass62_329, 0, 8, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
					}
				}
				if ((local31 == 3 || local31 == 7) && Static26.anInt805 == 0 && (local31 == 7 || Static15.anInt574 == 0 || Static15.anInt574 == 1 && Static64.method1085(local43))) {
					if (local27 - 14 < arg1 && local27 >= arg1) {
						if (Static48.anInt1373 >= 1) {
							Static91.method1543(Static54.aClass62_1241, 0, 23, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
						}
						Static91.method1543(Static27.aClass62_342, 0, 21, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
						Static91.method1543(Static25.aClass62_329, 0, 8, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
					}
					local7++;
				}
				if (local31 == 4 && (Static28.anInt898 == 0 || Static28.anInt898 == 1 && Static64.method1085(local43))) {
					local7++;
					if (local27 - 14 < arg1 && arg1 <= local27) {
						Static91.method1543(Static37.aClass62_480, 0, 42, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
					}
				}
				if ((local31 == 5 || local31 == 6) && Static26.anInt805 == 0 && Static15.anInt574 < 2) {
					local7++;
				}
				if (local31 == 8 && (Static28.anInt898 == 0 || Static28.anInt898 == 1 && Static64.method1085(local43))) {
					if (arg1 > local27 - 14 && arg1 <= local27) {
						Static91.method1543(Static96.aClass62_1168, 0, 52, 0, Static49.method782(new Class62[] { Static75.aClass62_890, local43 }), 0);
					}
					local7++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method684() {
		Static48.aClass9_27.method682();
		Static105.aClass3_Sub1_Sub1_Sub1_21.method145(0, 0);
		Static98.anIntArray280 = Static66.method1120(Static98.anIntArray280);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method687() {
		aClass46_3 = null;
		aClass3_Sub1_Sub1_Sub4Array24 = null;
		aClass62_494 = null;
		aClass42_29 = null;
		aClass62_493 = null;
	}
}
