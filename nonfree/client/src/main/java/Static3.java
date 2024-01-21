import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_5 = null;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_41 = Static45.method1937("titlebox");

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_45 = Static45.method1937("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_42 = aClass5_45;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public static int anInt58 = 0;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!af;")
	private static Class5 aClass5_46 = Static45.method1937("Please contact customer support)3");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_43 = aClass5_46;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_44 = Static45.method1937("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!af;")
	public static Class5 aClass5_47 = aClass5_45;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public static int anInt64 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method57() {
		aClass5_41 = null;
		aClass5_45 = null;
		aClass5_47 = null;
		aShortArrayArray1 = null;
		aClass1_Sub17_5 = null;
		aClass5_43 = null;
		anIntArray14 = null;
		aClass5_44 = null;
		aClass5_46 = null;
		anIntArrayArray5 = null;
		aClass5_42 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)[B")
	public static byte[] method59(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static138.method1878(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method61() {
		for (@Pc(16) Class1_Sub16 local16 = (Class1_Sub16) Static38.aClass53_7.method1442(); local16 != null; local16 = (Class1_Sub16) Static38.aClass53_7.method1450()) {
			if (local16.aClass1_Sub3_Sub10_1 != null) {
				local16.method1491();
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method62(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method63() {
		Static44.aClass1_Sub20_Sub1_1.method2108(101);
		for (@Pc(18) Class1_Sub5 local18 = (Class1_Sub5) Static66.aClass7_14.method288(); local18 != null; local18 = (Class1_Sub5) Static66.aClass7_14.method284()) {
			if (local18.anInt863 == 0 || local18.anInt863 == 3) {
				Static87.method2231(true, local18);
			}
		}
		if (Static11.aClass1_Sub17_14 != null) {
			Static119.method2161(Static11.aClass1_Sub17_14);
			Static11.aClass1_Sub17_14 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public static void method64() {
		if (Static13.anInt348 > 0) {
			Static7.method225();
		} else {
			Static97.method1636(40);
			Static65.aClass78_3 = Static11.aClass78_2;
			Static11.aClass78_2 = null;
		}
	}
}
