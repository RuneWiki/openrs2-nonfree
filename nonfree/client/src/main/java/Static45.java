import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!ac;")
	public static Class3 aClass3_11;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_611 = Static14.method2017("Aus");

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_612 = Static14.method2017("Hidden)2use");

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!bb;")
	public static Class8 aClass8_3 = new Class8();

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array22 = new Class36[5];

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array16 = new Class2_Sub1_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!oc;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_2 = new Class2_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	public static int anInt1225 = 0;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_613 = Static14.method2017("System)2Update in: ");

	@OriginalMember(owner = "client!j", name = "C", descriptor = "Lclient!kc;")
	private static Class36 aClass36_619 = Static14.method2017("glow3:");

	@OriginalMember(owner = "client!j", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_614 = aClass36_619;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	public static final int anInt1226 = 7759444;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	public static int anInt1227 = 0;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_615 = Static14.method2017("mapdots");

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!kc;")
	private static Class36 aClass36_616 = Static14.method2017("Service unavailable)3");

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_617 = Static14.method2017("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!j", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_618 = aClass36_616;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method897() {
		aClass36_617 = null;
		aClass36_618 = null;
		aClass36_619 = null;
		aClass3_11 = null;
		aClass2_Sub1_Sub1_Sub3Array16 = null;
		aClass36_612 = null;
		aClass36_614 = null;
		aClass36_611 = null;
		aClass8_3 = null;
		aClass2_Sub12_Sub1_2 = null;
		aClass36_616 = null;
		aClass36Array22 = null;
		aClass36_615 = null;
		aClass36_613 = null;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void method900() {
		if (Static24.aClass2_Sub1_Sub6_1 == null) {
			return;
		}
		@Pc(13) Class2_Sub1_Sub6 local13 = Static24.aClass2_Sub1_Sub6_1;
		@Pc(17) Class2_Sub1_Sub6 local17 = Static9.method205(local13);
		if (local17 == null) {
			Static24.aClass2_Sub1_Sub6_1 = null;
			return;
		}
		Static49.anInt1311++;
		@Pc(30) int[] local30 = Static29.method625(local17);
		@Pc(34) int[] local34 = Static29.method625(local13);
		@Pc(39) int local39 = Static115.anInt1789 - Static107.anInt2749;
		@Pc(44) int local44 = Static64.anInt1640 - Static60.anInt1600;
		if (local13.anInt709 >= local39 && -local13.anInt709 <= local39 && local44 <= local13.anInt709 && local44 >= -local13.anInt709 && !Static71.aBoolean79) {
			local44 = 0;
			local39 = 0;
		} else if (Static49.anInt1311 > local13.anInt707 || Static71.aBoolean79) {
			Static71.aBoolean79 = true;
		} else {
			local44 = 0;
			local39 = 0;
		}
		@Pc(102) int local102 = local44 + local34[1] - local30[1];
		@Pc(112) int local112 = local39 + local34[0] - local30[0];
		if (local102 < 0) {
			local102 = 0;
		}
		if (local112 < 0) {
			local112 = 0;
		}
		if (local13.anInt660 + local102 > local17.anInt660) {
			local102 = local17.anInt660 - local13.anInt660;
		}
		if (local13.anInt677 + local112 > local17.anInt677) {
			local112 = local17.anInt677 - local13.anInt677;
		}
		if (Static24.aClass2_Sub1_Sub6_1.anObjectArray12 != null && Static71.aBoolean79) {
			Static92.method1684(local13, local13.anObjectArray12, local112, 0, local102, null);
		}
		if (Static73.anInt1843 != 0) {
			return;
		}
		if (Static71.aBoolean79) {
			@Pc(178) int local178 = Static115.anInt1789 - local30[0];
			if (local178 < 0) {
				local178 = 0;
			}
			@Pc(191) int local191 = Static64.anInt1640 - local30[1];
			if (local178 > local17.anInt677 - 1) {
				local178 = local17.anInt677 - 1;
			}
			if (local191 < 0) {
				local191 = 0;
			}
			if (local17.anInt660 - 1 < local191) {
				local191 = local17.anInt660 - 1;
			}
			@Pc(224) Class2_Sub1_Sub6 local224 = Static61.method1112(local13, local191, local17, local178);
			if (Static24.aClass2_Sub1_Sub6_1.anObjectArray18 != null) {
				Static92.method1684(local13, local13.anObjectArray18, local112, 0, local102, local224);
			}
			if (local224 != null && Static18.method343(local13) != null) {
				Static42.aClass2_Sub12_Sub1_1.method1422(182);
				Static42.aClass2_Sub12_Sub1_1.method1394(local13.anInt680);
				Static42.aClass2_Sub12_Sub1_1.method1380(local224.anInt680);
				Static42.aClass2_Sub12_Sub1_1.method1373(local13.anInt710);
				Static42.aClass2_Sub12_Sub1_1.method1379(local224.anInt710);
			}
		} else {
			if (Static24.aClass2_Sub1_Sub6_1.anObjectArray2 != null) {
				Static92.method1684(local13, local13.anObjectArray2, local112, 0, local102, null);
			}
			if ((Static100.anInt2614 == 1 || Static52.method1001(Static43.anInt1141 - 1)) && Static43.anInt1141 > 2) {
				Static113.method2045();
			} else if (Static43.anInt1141 > 0) {
				Static55.method1925(Static43.anInt1141 - 1);
			}
		}
		Static24.aClass2_Sub1_Sub6_1 = null;
		return;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)I")
	public static int method901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(24) int local24 = arg0 - 1 & arg1;
		@Pc(28) int local28 = arg1 / arg0;
		@Pc(33) int local33 = Static59.method1102(local28, local3);
		@Pc(40) int local40 = Static59.method1102(local28, local3 + 1);
		@Pc(47) int local47 = Static59.method1102(local28 + 1, local3);
		@Pc(56) int local56 = Static59.method1102(local28 + 1, local3 - -1);
		@Pc(63) int local63 = Static89.method1644(local33, arg0, local13, local40);
		@Pc(70) int local70 = Static89.method1644(local47, arg0, local13, local56);
		return Static89.method1644(local63, arg0, local24, local70);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z")
	public static boolean method902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static16.anInt351 == arg0) {
			return true;
		} else if (arg1 == 1 && Static4.anInt128 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static34.anInt914;
		}
	}
}
