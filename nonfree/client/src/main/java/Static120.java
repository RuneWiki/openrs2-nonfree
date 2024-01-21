import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!ge;")
	public static Class29 aClass29_26 = new Class29(64);

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_948 = Static129.method2060("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_949 = Static129.method2060("<img=0>");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!r;")
	private static Class61 aClass61_952 = Static129.method2060(" from your friend list first)3");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_950 = aClass61_952;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_951 = Static129.method2060("Untersuchen");

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	public static int anInt3035 = 1;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_953 = Static129.method2060("Titelbild geladen)3");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method1902() {
		aClass29_26 = null;
		aClass61_949 = null;
		aClass61_951 = null;
		aClass61_952 = null;
		aClass61_948 = null;
		aClass61_950 = null;
		aClass61_953 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;Lclient!ff;ZZILclient!r;)V")
	public static void method1903(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(5) Class61 arg2) {
		@Pc(8) int local8 = arg1.method1044(arg0);
		@Pc(14) int local14 = arg1.method1039(arg2, local8);
		Static89.method1571(local14, 255, arg1, local8);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method1904() {
		for (@Pc(11) int local11 = 0; local11 < Static83.anInt2281; local11++) {
			@Pc(17) int local17 = Static132.anIntArray445[local11];
			@Pc(21) Class5_Sub2_Sub2_Sub3_Sub2 local21 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local17];
			@Pc(25) int local25 = Static47.aClass5_Sub14_Sub1_2.method1471();
			if ((local25 & 0x4) != 0) {
				local25 += Static47.aClass5_Sub14_Sub1_2.method1471() << 8;
			}
			Static115.method1880(local17, local21, local25);
		}
	}
}
