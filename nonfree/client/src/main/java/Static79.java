import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray59;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt2163;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt2158 = -1;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1127 = Static80.method1463("Login");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1128 = Static80.method1463("Your account is already logged in)3");

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1132 = Static80.method1463("flash1:");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1129 = aClass63_1132;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt2159 = 0;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1130 = aClass63_1132;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[104][104];

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
	public static int[] anIntArray243 = new int[500];

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1131 = aClass63_1128;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public static int anInt2162 = 0;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
	public static int[] anIntArray244 = new int[100];

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1133 = aClass63_1127;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1134 = Static80.method1463("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1451() {
		anIntArrayArray29 = null;
		aClass63_1127 = null;
		anIntArray244 = null;
		aByteArrayArrayArray59 = null;
		aClass63_1130 = null;
		aClass63_1132 = null;
		aClass63_1134 = null;
		aClass63_1128 = null;
		aClass63_1131 = null;
		aClass63_1129 = null;
		aClass63_1133 = null;
		anIntArray243 = null;
		anIntArray242 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1452() {
		Static86.aClass56_1.method2004();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static31.aLongArray1[local6] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static109.aLongArray6[local24] = 0L;
		}
		Static70.anInt2003 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!rd;B)[Lclient!rd;")
	public static Class63[] method1453(@OriginalArg(0) Class63[] arg0) {
		@Pc(8) Class63[] local8 = new Class63[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static15.method374(new Class63[] { Static118.method2114(local15), Static101.aClass63_1528 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static15.method374(new Class63[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}
}
