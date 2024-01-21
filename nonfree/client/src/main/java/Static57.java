import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array8;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!he;")
	private static Class26 aClass26_862 = Static6.method100("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_863 = aClass26_862;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_864 = Static6.method100("Sorry invited players only)3");

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_865 = Static6.method100("null");

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!he;")
	public static Class26 aClass26_866 = Static6.method100("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "Lclient!he;")
	public static Class26 aClass26_867 = aClass26_864;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static29.anInt1009 == 0 || arg2 == 0 || Static8.anInt195 >= 50) {
			return;
		}
		Static32.anIntArray106[Static8.anInt195] = arg1;
		Static18.anIntArray54[Static8.anInt195] = arg2;
		Static40.anIntArray136[Static8.anInt195] = arg0;
		Static76.aClass36Array1[Static8.anInt195] = null;
		Static1.anIntArray1[Static8.anInt195] = 0;
		Static8.anInt195++;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!nc;I)Z")
	public static boolean method1143(@OriginalArg(0) Class3_Sub14 arg0) {
		if (arg0.anIntArray211 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray211.length; local18++) {
			@Pc(25) int local25 = Static81.method1418(local18, arg0);
			@Pc(30) int local30 = arg0.anIntArray212[local18];
			if (arg0.anIntArray211[local18] == 2) {
				if (local25 >= local30) {
					return false;
				}
			} else if (arg0.anIntArray211[local18] == 3) {
				if (local25 <= local30) {
					return false;
				}
			} else if (arg0.anIntArray211[local18] == 4) {
				if (local30 == local25) {
					return false;
				}
			} else if (local30 != local25) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method1148() {
		aClass26_866 = null;
		aClass26_864 = null;
		aClass26_862 = null;
		anIntArray169 = null;
		aClass3_Sub1_Sub4_Sub3Array8 = null;
		aClass26_867 = null;
		aClass26_865 = null;
		aClass26_863 = null;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] method1150() {
		@Pc(4) Class3_Sub1_Sub4_Sub3[] local4 = new Class3_Sub1_Sub4_Sub3[Static78.anInt2101];
		for (@Pc(10) int local10 = 0; local10 < Static78.anInt2101; local10++) {
			@Pc(20) Class3_Sub1_Sub4_Sub3 local20 = local4[local10] = new Class3_Sub1_Sub4_Sub3();
			local20.anInt2584 = Static88.anInt2448;
			local20.anInt2582 = Static53.anInt1619;
			local20.anInt2583 = anIntArray169[local10];
			local20.anInt2586 = Static58.anIntArray173[local10];
			local20.anInt2585 = Static51.anIntArray157[local10];
			local20.anInt2581 = Static46.anIntArray148[local10];
			@Pc(52) int local52 = local20.anInt2581 * local20.anInt2585;
			@Pc(56) byte[] local56 = Static117.aByteArrayArray19[local10];
			local20.anIntArray308 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray308[local62] = Static110.anIntArray351[local56[local62] & 0xFF];
			}
		}
		Static67.method1913();
		return local4;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method1152(@OriginalArg(1) int arg0) {
		if (Static70.anInt1540 == 0) {
			Static1.aClass3_Sub3_Sub1_1.method232(arg0);
		} else {
			Static63.anInt1933 = arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lclient!he;")
	public static Class26 method1153(@OriginalArg(1) int arg0) {
		@Pc(14) Class26 local14 = Static122.method2170(arg0);
		for (@Pc(20) int local20 = local14.method839() - 3; local20 > 0; local20 -= 3) {
			local14 = Static119.method2136(new Class26[] { local14.method843(0, local20), Static58.aClass26_887, local14.method819(local20) });
		}
		if (local14.method839() > 9) {
			return Static119.method2136(new Class26[] { Static48.aClass26_784, local14.method843(0, local14.method839() - 8), Static52.aClass26_815, Static35.aClass26_583, local14, Static11.aClass26_168 });
		} else if (local14.method839() > 6) {
			return Static119.method2136(new Class26[] { Static65.aClass26_967, local14.method843(0, local14.method839() - 4), Static121.aClass26_1727, Static35.aClass26_583, local14, Static11.aClass26_168 });
		} else {
			return Static119.method2136(new Class26[] { Static69.aClass26_1336, local14, Static12.aClass26_170 });
		}
	}
}
