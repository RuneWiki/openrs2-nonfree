import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_20;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Lclient!oa;")
	public static Class7 aClass7_61;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_990 = Static38.method736("@lre@");

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_991 = null;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!vc;")
	private static Class71 aClass71_995 = Static38.method736("Connection timed out)3");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_992 = aClass71_995;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_993 = Static38.method736("Loaded title screen");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_994 = aClass71_993;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
	public static int[] anIntArray247 = new int[200];

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!vc;")
	public static Class71 aClass71_996 = Static38.method736("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_997 = Static38.method736("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	public static void method1345(@OriginalArg(1) int arg0) {
		Static81.method1343();
		@Pc(12) int local12 = Static56.method993(arg0).anInt1113;
		if (local12 == 0) {
			return;
		}
		@Pc(19) int local19 = Static23.anIntArray87[arg0];
		if (local12 == 1) {
			if (local19 == 1) {
				Static80.method1318(0.9D);
				((Class1) Static80.anInterface3_1).method15(0.9D);
			}
			if (local19 == 2) {
				Static80.method1318(0.8D);
				((Class1) Static80.anInterface3_1).method15(0.8D);
			}
			if (local19 == 3) {
				Static80.method1318(0.7D);
				((Class1) Static80.anInterface3_1).method15(0.7D);
			}
			if (local19 == 4) {
				Static80.method1318(0.6D);
				((Class1) Static80.anInterface3_1).method15(0.6D);
			}
			Static56.method990();
			Static73.aBoolean87 = true;
		}
		if (local12 == 3) {
			@Pc(75) short local75 = 0;
			if (local19 == 0) {
				local75 = 255;
			}
			if (local19 == 1) {
				local75 = 192;
			}
			if (local19 == 2) {
				local75 = 128;
			}
			if (local19 == 3) {
				local75 = 64;
			}
			if (local19 == 4) {
				local75 = 0;
			}
			if (local75 != Static7.anInt273) {
				if (Static7.anInt273 == 0 && Static97.anInt2322 != -1) {
					Static10.method211(local75, Static19.aClass24_Sub1_6, Static97.anInt2322, 0);
					Static76.anInt1881 = 0;
				} else if (local75 == 0) {
					Static10.method207();
					Static76.anInt1881 = 0;
				} else {
					Static97.method1605(local75);
				}
				Static7.anInt273 = local75;
			}
		}
		if (local12 == 5) {
			Static17.anInt618 = local19;
		}
		if (local12 == 10) {
			if (local19 == 0) {
				Static36.anInt991 = 127;
			}
			if (local19 == 1) {
				Static36.anInt991 = 96;
			}
			if (local19 == 2) {
				Static36.anInt991 = 64;
			}
			if (local19 == 3) {
				Static36.anInt991 = 32;
			}
			if (local19 == 4) {
				Static36.anInt991 = 0;
			}
		}
		if (local12 == 8) {
			Static5.anInt204 = local19;
			Static68.aBoolean72 = true;
		}
		if (local12 == 9) {
			Static89.anInt2075 = local19;
		}
		if (local12 == 6) {
			Static119.anInt2943 = local19;
		}
		if (local12 != 4) {
			return;
		}
		if (local19 == 0) {
			Static9.anInt303 = 127;
		}
		if (local19 == 1) {
			Static9.anInt303 = 96;
		}
		if (local19 == 2) {
			Static9.anInt303 = 64;
		}
		if (local19 == 3) {
			Static9.anInt303 = 32;
		}
		if (local19 == 4) {
			Static9.anInt303 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class5_Sub6 local15 = (Class5_Sub6) Static2.aClass52_10.method1358();
		@Pc(17) Class5_Sub6 local17 = null;
		while (local15 != null) {
			if (arg7 == local15.anInt1578 && local15.anInt1580 == arg1 && local15.anInt1587 == arg4 && local15.anInt1579 == arg3) {
				local17 = local15;
				break;
			}
			local15 = (Class5_Sub6) Static2.aClass52_10.method1363();
		}
		if (local17 == null) {
			local17 = new Class5_Sub6();
			local17.anInt1587 = arg4;
			local17.anInt1578 = arg7;
			local17.anInt1579 = arg3;
			local17.anInt1580 = arg1;
			Static103.method1650(local17);
			Static2.aClass52_10.method1362(local17);
		}
		local17.anInt1582 = arg5;
		local17.anInt1585 = arg6;
		local17.anInt1586 = arg0;
		local17.anInt1581 = arg2;
		local17.anInt1575 = arg8;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!me;BI)Lclient!vc;")
	public static Class71 method1349(@OriginalArg(0) Class5_Sub1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (!Static18.method487(Static23.method545(arg0), arg1)) {
			return null;
		} else if (arg0.aClass71Array10 == null || arg1 >= arg0.aClass71Array10.length || arg0.aClass71Array10[arg1] == null || arg0.aClass71Array10[arg1].method1821().method1784() == 0) {
			return Static3.aBoolean3 ? Static74.method677(new Class71[] { Static37.aClass71_337, Static51.method962(arg1) }) : null;
		} else {
			return arg0.aClass71Array10[arg1];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!nb;Lclient!vc;Lclient!vc;I)Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 method1350(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		@Pc(4) int local4 = arg0.method650(arg1);
		@Pc(10) int local10 = arg0.method664(arg2, local4);
		return Static94.method1571(local4, local10, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1351() {
		aClass71_992 = null;
		aClass7_61 = null;
		aClass71_994 = null;
		aClass71_991 = null;
		aClass71_997 = null;
		aClass71_996 = null;
		aClass71_990 = null;
		anIntArray247 = null;
		aClass71_993 = null;
		aClass71_995 = null;
		aClass5_Sub1_Sub10_Sub1_20 = null;
	}
}
