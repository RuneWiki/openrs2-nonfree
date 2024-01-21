import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Lclient!na;")
	private static Class53 aClass53_704 = Static109.method1737("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_705 = Static109.method1737("::fpsoff");

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!na;")
	public static Class53 aClass53_707 = aClass53_704;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "Lclient!na;")
	public static Class53 aClass53_708 = Static109.method1737(": ");

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!na;")
	public static Class53 aClass53_709 = Static109.method1737("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lclient!na;")
	public static Class53 aClass53_710 = Static109.method1737("mod_icons");

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "Lclient!na;")
	public static Class53 aClass53_711 = Static109.method1737("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "I")
	public static int anInt1615 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "Lclient!na;")
	public static Class53 aClass53_712 = Static109.method1737("backtop1");

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "Lclient!na;")
	public static Class53 aClass53_713 = Static109.method1737("@or3@");

	@OriginalMember(owner = "client!kd", name = "Ub", descriptor = "Lclient!na;")
	public static Class53 aClass53_714 = Static109.method1737("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public static void method1094(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static23.anInt737 >= 100) {
			Static73.method1234(0, Static35.aClass53_476, Static52.aClass53_632);
			return;
		}
		@Pc(25) Class53 local25 = Static106.method1712(arg0).method1263();
		for (@Pc(27) int local27 = 0; local27 < Static23.anInt737; local27++) {
			if (arg0 == Static39.aLongArray4[local27]) {
				Static73.method1234(0, Static35.aClass53_476, Static103.method1689(new Class53[] { local25, Static108.aClass53_1245 }));
				return;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static68.anInt1724; local67++) {
			if (arg0 == Static2.aLongArray1[local67]) {
				Static73.method1234(0, Static35.aClass53_476, Static103.method1689(new Class53[] { Static118.aClass53_1378, local25, Static111.aClass53_1293 }));
				return;
			}
		}
		if (!local25.method1282(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass53_668)) {
			Static39.aLongArray4[Static23.anInt737++] = arg0;
			Static36.aBoolean40 = true;
			Static115.aClass3_Sub7_Sub1_3.method662(167);
			Static115.aClass3_Sub7_Sub1_3.method633(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	public static void method1099() {
		aClass53_710 = null;
		aClass53_712 = null;
		aClass53_709 = null;
		aClass53_707 = null;
		aClass53_711 = null;
		aClass53_704 = null;
		aClass53_714 = null;
		aClass53_708 = null;
		aClass53_713 = null;
		aClass53_705 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!vb;I)Z")
	public static boolean method1104(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		if (arg0.anIntArray385 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray385.length; local17++) {
			@Pc(24) int local24 = Static97.method1632(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray380[local17];
			if (arg0.anIntArray385[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray385[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray385[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
