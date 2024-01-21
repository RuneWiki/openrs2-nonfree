import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_13;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_971 = Static119.method1462("mapmarker");

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!bc;")
	public static Class8 aClass8_51 = new Class8(64);

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_972 = Static119.method1462("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!pe;")
	private static Class65 aClass65_973 = Static119.method1462("Please enter your username)3");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!pe;")
	private static Class65 aClass65_974 = Static119.method1462("Loaded input handler");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_975 = aClass65_974;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_976 = aClass65_973;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1660() {
		Static36.aClass8_21.method171();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1661() {
		aClass2_Sub22_13 = null;
		aClass65_973 = null;
		aClass65_971 = null;
		aClass65_974 = null;
		aClass65_975 = null;
		aClass8_51 = null;
		aClass65_972 = null;
		aClass65_976 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BZ)V")
	public static void method1662(@OriginalArg(1) boolean arg0) {
		if (Static13.aClass7_3 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub4 local11 = new Class2_Sub4(4);
			local11.method926(arg0 ? 2 : 3);
			local11.method941(0);
			Static13.aClass7_3.method161(local11.aByteArray20, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static13.aClass7_3.method157();
			} catch (@Pc(37) Exception local37) {
			}
			Static13.aClass7_3 = null;
			Static76.anInt1705++;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!pe;IBII)V")
	public static void method1663(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub22 local8 = Static84.method1365(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray22 != null) {
			@Pc(18) Class2_Sub9 local18 = new Class2_Sub9();
			local18.anObjectArray2 = local8.anObjectArray22;
			local18.aClass2_Sub22_7 = local8;
			local18.aClass65_744 = arg0;
			local18.anInt1717 = arg2;
			Static103.method1703(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt2801 > 0) {
			local36 = Static21.method347(local8);
		}
		if (!local36 || !Static63.method1134(arg2 - 1, Static114.method1834(local8))) {
			return;
		}
		if (arg2 == 1) {
			Static49.aClass2_Sub4_Sub1_1.method962(203);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 2) {
			Static49.aClass2_Sub4_Sub1_1.method962(230);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 3) {
			Static49.aClass2_Sub4_Sub1_1.method962(78);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 4) {
			Static49.aClass2_Sub4_Sub1_1.method962(127);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 5) {
			Static49.aClass2_Sub4_Sub1_1.method962(88);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 6) {
			Static49.aClass2_Sub4_Sub1_1.method962(5);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 7) {
			Static49.aClass2_Sub4_Sub1_1.method962(118);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 8) {
			Static49.aClass2_Sub4_Sub1_1.method962(206);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 9) {
			Static49.aClass2_Sub4_Sub1_1.method962(12);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
		if (arg2 == 10) {
			Static49.aClass2_Sub4_Sub1_1.method962(42);
			Static49.aClass2_Sub4_Sub1_1.method914(arg1);
			Static49.aClass2_Sub4_Sub1_1.method925(arg3);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method1664(@OriginalArg(0) int arg0) {
		Static10.anInt2956 = arg0;
	}
}
