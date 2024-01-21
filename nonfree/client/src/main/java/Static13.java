import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!ba;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!na;")
	public static Class56 aClass56_36;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Lclient!na;")
	public static Class56 aClass56_37;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!cf;")
	public static Class15 aClass15_10;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt2585 = 1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public static int anInt2586 = 0;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!be;")
	public static Class2_Sub4 aClass2_Sub4_32 = new Class2_Sub4(8);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1120 = Static119.method1462(":chalreq:");

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1121 = Static119.method1462(" is already on your friend list");

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1122 = Static119.method1462("::");

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1123 = Static119.method1462("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1124 = Static119.method1462(" x ");

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1125 = aClass65_1121;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	public static void method1862() {
		aClass65_1120 = null;
		aClass65_1121 = null;
		aClass15_10 = null;
		aClass56_36 = null;
		aClass7_3 = null;
		aClass65_1125 = null;
		aClass56_37 = null;
		aClass65_1123 = null;
		aClass65_1124 = null;
		aClass65_1122 = null;
		aClass2_Sub4_32 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Z")
	public static boolean method1864(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method1865() {
		if (Static117.anInt2578 > 0) {
			Static54.method952();
		} else {
			Static98.method1604(40);
			Static126.aClass7_4 = Static129.aClass7_6;
			Static129.aClass7_6 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!lc;B)V")
	public static void method1866(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		@Pc(3) int local3 = (int) arg1.aLong100;
		@Pc(10) int local10 = arg1.anInt1527;
		arg1.method2053();
		if (arg0) {
			Static2.method64(local10);
		}
		Static120.method1868(local10);
		@Pc(29) Class2_Sub22 local29 = Static35.method645(local3);
		if (local29 != null) {
			Static116.method1853(local29);
		}
		Static3.aBoolean5 = false;
		Static49.anInt1205 = 0;
		Static7.method151(Static15.anInt372, Static45.anInt1093, Static56.anInt1421, Static75.anInt2326);
		if (Static17.anInt384 != -1) {
			Static30.method607(1, Static17.anInt384);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!wa;II)V")
	public static void method1867(@OriginalArg(0) Class2_Sub22[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class2_Sub22 local14 = arg0[local8];
			if (local14 != null) {
				if (local14.anInt2813 == 0) {
					if (local14.aClass2_Sub22Array2 != null) {
						method1867(local14.aClass2_Sub22Array2, arg1);
					}
					@Pc(38) Class2_Sub7 local38 = (Class2_Sub7) Static112.aClass40_21.method851((long) local14.anInt2835);
					if (local38 != null) {
						Static30.method607(arg1, local38.anInt1527);
					}
				}
				@Pc(57) Class2_Sub9 local57;
				if (arg1 == 0 && local14.anObjectArray11 != null) {
					local57 = new Class2_Sub9();
					local57.anObjectArray2 = local14.anObjectArray11;
					local57.aClass2_Sub22_7 = local14;
					Static103.method1703(local57);
				}
				if (arg1 == 1 && local14.anObjectArray19 != null) {
					if (local14.anInt2814 >= 0) {
						@Pc(83) Class2_Sub22 local83 = Static35.method645(local14.anInt2835);
						if (local83 == null || local83.aClass2_Sub22Array2 == null || local14.anInt2814 >= local83.aClass2_Sub22Array2.length || local14 != local83.aClass2_Sub22Array2[local14.anInt2814]) {
							continue;
						}
					}
					local57 = new Class2_Sub9();
					local57.anObjectArray2 = local14.anObjectArray19;
					local57.aClass2_Sub22_7 = local14;
					Static103.method1703(local57);
				}
			}
		}
	}
}
