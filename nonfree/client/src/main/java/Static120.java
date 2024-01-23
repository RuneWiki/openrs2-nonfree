import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
	public static int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!sf;")
	public static Class157 aClass157_24 = new Class157(64);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIBZI)V")
	public static void method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static206.anInt4289 = arg3;
		Static85.anInt1998 = arg5;
		Static282.anInt5573 = arg2;
		Static69.anInt3049 = arg0;
		Static136.anInt3064 = arg1;
		if (arg4 && Static69.anInt3049 >= 100) {
			Static80.anInt1911 = Static206.anInt4289 * 128 + 64;
			Static192.anInt4017 = Static136.anInt3064 * 128 + 64;
			Static162.anInt3612 = Static234.method3798(Static192.anInt4017, Static80.anInt1911, Static32.anInt876) - Static282.anInt5573;
		}
		Static16.anInt342 = 2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method1997(@OriginalArg(0) int arg0) {
		if (Static73.anInt1821 == 0) {
			Static185.aClass2_Sub3_Sub1_7.method201(arg0);
		} else {
			Static9.anInt3025 = arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ek;Lclient!ek;B)V")
	public static void method1998(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		Static118.aClass42_31 = arg1;
		Static130.aClass42_36 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method2000() {
		if (Static225.anInt5298 == 5) {
			Static225.anInt5298 = 6;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IS)Z")
	public static boolean method2001(@OriginalArg(1) short arg0) {
		if (arg0 == 48 || arg0 == 9 || arg0 == 60 || arg0 == 8 || arg0 == 49 || arg0 == 44 || arg0 == 13 || arg0 == 22) {
			return true;
		} else if (arg0 == 41 || arg0 == 11 || arg0 == 1001 || arg0 == 1011) {
			return true;
		} else if (arg0 == 23 || arg0 == 26 || arg0 == 51 || arg0 == 29 || arg0 == 58) {
			return true;
		} else {
			return arg0 == 40 || arg0 == 20 || arg0 == 7 || arg0 == 33 || arg0 == 19 || arg0 == 12;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public static void method2007(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static199.anIntArray439[local3] = Static199.anIntArray439[local3 - 1];
			Static270.anIntArray416[local3] = Static270.anIntArray416[local3 - 1];
			Static246.aStringArray40[local3] = Static246.aStringArray40[local3 - 1];
			Static203.aStringArray30[local3] = Static203.aStringArray30[local3 - 1];
			Static70.aStringArray12[local3] = Static70.aStringArray12[local3 - 1];
			Static136.aStringArray23[local3] = Static136.aStringArray23[local3 - 1];
			Static103.anIntArray208[local3] = Static103.anIntArray208[local3 - 1];
		}
		Static95.anInt2292 = Static291.anInt5632;
		Static199.anIntArray439[0] = arg5;
		Static270.anIntArray416[0] = arg6;
		Static96.anInt2299++;
		Static103.anIntArray208[0] = arg3;
		Static246.aStringArray40[0] = arg4;
		Static203.aStringArray30[0] = arg2;
		Static70.aStringArray12[0] = arg1;
		Static136.aStringArray23[0] = arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
	public static int method2008() {
		return 14;
	}
}
