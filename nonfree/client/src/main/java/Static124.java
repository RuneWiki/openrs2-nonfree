import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!ge;")
	public static Class7 aClass7_60;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!ga;")
	public static Class29 aClass29_26;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1786 = Static80.method1463("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1779 = aClass63_1786;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
	public static int[] anIntArray372 = new int[500];

	@OriginalMember(owner = "client!we", name = "O", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1789 = Static80.method1463("Ok");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1780 = aClass63_1789;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1784 = Static80.method1463("Please reload this page)3");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1781 = aClass63_1784;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1782 = Static80.method1463("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1783 = Static80.method1463("titlebutton");

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1785 = Static80.method1463("Loading textures )2 ");

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	public static int anInt3327 = 0;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1787 = Static80.method1463("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!we", name = "L", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1788 = aClass63_1785;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public static int anInt3331 = -1;

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1790 = Static80.method1463("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!rd;ILclient!bf;)I")
	public static int method2174(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		@Pc(10) int local10 = arg1.anInt1949;
		arg1.method1313(arg0.anInt2746);
		arg1.anInt1949 += Static54.aClass11_1.method262(arg1.aByteArray27, arg0.anInt2746, arg0.aByteArray33, arg1.anInt1949, 0);
		return arg1.anInt1949 - local10;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method2175() {
		if (!Static42.aBoolean63) {
			return;
		}
		@Pc(15) Class6_Sub3_Sub17 local15 = Static72.method1384(Static42.anInt1321, Static89.anInt2478);
		if (local15 != null && local15.anObjectArray3 != null) {
			Static99.method1836(local15.anObjectArray3, local15, 0, 0, null, 0);
		}
		Static42.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!ge;I)Z")
	public static boolean method2177(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		@Pc(12) byte[] local12 = arg1.method117(arg0);
		if (local12 == null) {
			return false;
		} else {
			Static57.method1135(local12);
			return true;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class63 method2181(@OriginalArg(0) int arg0) {
		@Pc(7) Class63 local7 = Static118.method2114(arg0);
		for (@Pc(13) int local13 = local7.method1811() - 3; local13 > 0; local13 -= 3) {
			local7 = Static15.method374(new Class63[] { local7.method1820(local13, 0), Static103.aClass63_1763, local7.method1806(local13) });
		}
		if (local7.method1811() > 8) {
			local7 = Static15.method374(new Class63[] { Static111.aClass63_1658, local7.method1820(local7.method1811() - 8, 0), Static105.aClass63_1575, Static119.aClass63_1749, local7, Static113.aClass63_398 });
		} else if (local7.method1811() > 4) {
			local7 = Static15.method374(new Class63[] { Static82.aClass63_1194, local7.method1820(local7.method1811() - 4, 0), Static58.aClass63_914, Static119.aClass63_1749, local7, Static113.aClass63_398 });
		}
		return Static15.method374(new Class63[] { Static41.aClass63_700, local7 });
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
	public static void method2182() {
		Static29.aClass49_8.method1389();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BILclient!nc;I)V")
	public static void method2183(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		@Pc(7) Class6_Sub5 local7 = new Class6_Sub5();
		local7.aLong91 = arg1;
		local7.anInt846 = 0;
		local7.aClass53_3 = arg2;
		local7.aByteArray9 = arg0;
		@Pc(30) Class1 local30 = Static109.aClass1_10;
		synchronized (Static109.aClass1_10) {
			Static109.aClass1_10.method10(local7);
		}
		Static13.method346();
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
	public static void method2184() {
		aClass29_26 = null;
		aClass63_1786 = null;
		aClass63_1789 = null;
		aClass63_1788 = null;
		aClass63_1790 = null;
		aClass63_1779 = null;
		aClass63_1787 = null;
		aClass63_1780 = null;
		aClass63_1783 = null;
		aClass7_60 = null;
		aClass63_1784 = null;
		aClass63_1785 = null;
		anIntArray372 = null;
		aClass63_1782 = null;
		aClass63_1781 = null;
	}
}
