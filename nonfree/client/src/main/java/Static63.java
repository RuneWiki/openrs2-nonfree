import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gh", name = "pb", descriptor = "I")
	public static int anInt1753;

	@OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_979 = Static107.method1838(" <col=00ff80>");

	@OriginalMember(owner = "client!gh", name = "mb", descriptor = "[I")
	public static int[] anIntArray145 = new int[2000];

	@OriginalMember(owner = "client!gh", name = "rb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_982 = Static107.method1838("OFF");

	@OriginalMember(owner = "client!gh", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_980 = aClass28_982;

	@OriginalMember(owner = "client!gh", name = "ob", descriptor = "I")
	public static int anInt1752 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!gh", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_981 = Static107.method1838("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method1165() {
		aClass28_980 = null;
		aClass28_979 = null;
		anIntArray145 = null;
		aClass28_981 = null;
		aClass28_982 = null;
		Class2_Sub3_Sub10.anIntArray144 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIILclient!d;IJ)Z")
	public static boolean method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub4_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static129.method2083(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1167(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	public static void method1168() {
		Static93.aClass14_120.method596();
		Static3.aClass14_124.method596();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILclient!d;IJIIII)Z")
	public static boolean method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static129.method2083(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
