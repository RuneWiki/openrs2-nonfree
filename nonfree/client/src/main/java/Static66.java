import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!m", name = "Ab", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_29;

	@OriginalMember(owner = "client!m", name = "Fb", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!m", name = "Hb", descriptor = "I")
	public static int anInt1896;

	@OriginalMember(owner = "client!m", name = "zb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_811 = Static63.method1251("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!m", name = "Db", descriptor = "Lclient!mb;")
	private static Class45 aClass45_812 = Static63.method1251("Checking for updates )2 ");

	@OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_813 = aClass45_812;

	@OriginalMember(owner = "client!m", name = "Gb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_814 = Static63.method1251("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!m", name = "Jb", descriptor = "I")
	public static int anInt1898 = 1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ia;I)Z")
	public static boolean method1288(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		@Pc(6) int local6 = arg0.anInt1267;
		if (Static62.anInt1817 == 2) {
			if (local6 == 201) {
				Static75.anInt2178 = 0;
				Static78.aClass45_925 = Static40.aClass45_530;
				Static51.aBoolean81 = true;
				Static78.aClass45_930 = Static78.aClass45_929;
				Static7.anInt191 = 1;
				Static93.aBoolean116 = true;
			}
			if (local6 == 202) {
				Static78.aClass45_930 = Static78.aClass45_929;
				Static51.aBoolean81 = true;
				Static75.anInt2178 = 0;
				Static78.aClass45_925 = Static19.aClass45_284;
				Static7.anInt191 = 2;
				Static93.aBoolean116 = true;
			}
		}
		if (local6 == 205) {
			Static78.anInt2212 = 250;
			return true;
		}
		if (local6 == 501) {
			Static93.aBoolean116 = true;
			Static7.anInt191 = 4;
			Static51.aBoolean81 = true;
			Static75.anInt2178 = 0;
			Static78.aClass45_930 = Static78.aClass45_929;
			Static78.aClass45_925 = Static21.aClass45_315;
		}
		if (local6 == 502) {
			Static78.aClass45_925 = Static67.aClass45_815;
			Static78.aClass45_930 = Static78.aClass45_929;
			Static7.anInt191 = 5;
			Static93.aBoolean116 = true;
			Static75.anInt2178 = 0;
			Static51.aBoolean81 = true;
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if (local6 >= 300 && local6 <= 313) {
			local100 = (local6 - 300) / 2;
			local104 = local6 & 0x1;
			Static34.aClass32_1.method869(local100, local104 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local100 = (local6 - 314) / 2;
			local104 = local6 & 0x1;
			Static34.aClass32_1.method876(local104 == 1, local100);
		}
		if (local6 == 324) {
			Static34.aClass32_1.method873(false);
		}
		if (local6 == 325) {
			Static34.aClass32_1.method873(true);
		}
		if (local6 == 326) {
			Static64.aClass5_Sub9_Sub1_2.method1466(66);
			Static34.aClass32_1.method870(Static64.aClass5_Sub9_Sub1_2);
			return true;
		}
		if (local6 == 620) {
			Static14.aBoolean13 = !Static14.aBoolean13;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static110.method1983();
			if (Static78.aClass45_922.method1317() > 0) {
				Static64.aClass5_Sub9_Sub1_2.method1466(243);
				Static64.aClass5_Sub9_Sub1_2.method1454(Static78.aClass45_922.method1299());
				Static64.aClass5_Sub9_Sub1_2.method1428(local6 - 601);
				Static64.aClass5_Sub9_Sub1_2.method1428(Static14.aBoolean13 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	public static void method1289() {
		aClass45_814 = null;
		anIntArray291 = null;
		aClass45_813 = null;
		aClass29_Sub1_29 = null;
		aClass45_812 = null;
		aClass45_811 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!sd;Lclient!sd;ZB)V")
	public static void method1290(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) boolean arg2) {
		Static29.aBoolean44 = arg2;
		Static102.aClass29_65 = arg0;
		Static70.aClass29_46 = arg1;
	}
}
