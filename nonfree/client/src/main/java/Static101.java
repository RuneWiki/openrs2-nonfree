import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt2307;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_1062 = Static134.method2017(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_1063 = Static134.method2017("compass");

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1064 = Static134.method2017("Mitglieder)2Welt");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!v;")
	private static Class76 aClass76_1065 = Static134.method2017("wishes to duel with you)3");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2302 = 0;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1066 = aClass76_1065;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public static int anInt2304 = 0;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_1067 = Static134.method2017("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1068 = Static134.method2017(": ");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method1587() {
		for (@Pc(10) Class4_Sub4_Sub3_Sub4 local10 = (Class4_Sub4_Sub3_Sub4) Static91.aClass78_9.method1916(); local10 != null; local10 = (Class4_Sub4_Sub3_Sub4) Static91.aClass78_9.method1920()) {
			if (Static124.anInt2712 != local10.anInt1753 || local10.aBoolean110) {
				local10.method2004();
			} else if (Static78.anInt1981 >= local10.anInt1762) {
				local10.method1155(Static1.anInt5);
				if (local10.aBoolean110) {
					local10.method2004();
				} else {
					Static54.aClass81_10.method1975(local10.anInt1753, local10.anInt1767, local10.anInt1760, local10.anInt1750, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
	public static int method1588(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!v;")
	public static Class76 method1589(@OriginalArg(1) int arg0) {
		@Pc(9) Class76 local9 = Static63.method1092(arg0);
		for (@Pc(15) int local15 = local9.method1851() - 3; local15 > 0; local15 -= 3) {
			local9 = Static59.method1017(new Class76[] { local9.method1876(local15, 0), Static61.aClass76_666, local9.method1874(local15) });
		}
		if (local9.method1851() > 9) {
			return Static59.method1017(new Class76[] { Static125.aClass76_1277, local9.method1876(local9.method1851() - 8, 0), Static102.aClass76_1070, Static25.aClass76_222, local9, Static8.aClass76_69 });
		} else if (local9.method1851() > 6) {
			return Static59.method1017(new Class76[] { Static127.aClass76_1287, local9.method1876(local9.method1851() - 4, 0), Static102.aClass76_1075, Static25.aClass76_222, local9, Static8.aClass76_69 });
		} else {
			return Static59.method1017(new Class76[] { Static56.aClass76_622, local9, Static10.aClass76_97 });
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1590() {
		Static7.aClass72_6.method1786();
		Static95.aClass72_24.method1786();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1591() {
		aByteArrayArray10 = null;
		aClass76_1068 = null;
		aClass76_1067 = null;
		aClass76_1065 = null;
		aClass76_1063 = null;
		aClass76_1064 = null;
		aClass76_1066 = null;
		aClass76_1062 = null;
	}
}
