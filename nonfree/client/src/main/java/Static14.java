import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!qa;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!oa;")
	public static Class9 aClass9_7;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!lc;")
	public static Class31 aClass31_191 = Static56.method1206("*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3");

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!lc;")
	public static Class31 aClass31_192 = Static56.method1206("Importing models )2 ");

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!fe;")
	public static Class17 aClass17_23 = new Class17(64);

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt637 = 0;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_193 = Static56.method1206("(Z");

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_194 = Static56.method1206(")1");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	public static int method419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;Z)V")
	public static void method420(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub6 arg1) {
		Static77.method1426(arg0, arg1.anInt2006, arg1.anInt2011);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	public static boolean method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && arg0 == Static11.anInt524) {
			return true;
		} else if (arg1 == 1 && Static99.anInt2669 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static103.anInt2779 == arg0;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	public static void method423() {
		aClass31_192 = null;
		aClass17_23 = null;
		aClass9_7 = null;
		aByteArrayArray4 = null;
		aClass31_193 = null;
		aClass48_1 = null;
		aClass31_194 = null;
		aClass31_191 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method424() {
		Static85.anInt2509 = 0;
		Static69.anInt2217 = -1;
		Static59.anInt2044 = 0;
		Static13.anInt571 = 0;
		Static105.aBoolean154 = false;
		Static98.anInt1186 = -1;
		Static2.anInt105 = -1;
		Static76.anInt2256 = -1;
		Static87.anInt2339 = 0;
		Static8.anInt288 = 0;
		Static19.anInt851 = 0;
		Static20.aClass2_Sub6_Sub1_11.anInt952 = 0;
		Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
		Static75.method1404(30);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	public static int method426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
