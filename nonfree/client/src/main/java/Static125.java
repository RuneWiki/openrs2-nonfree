import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array10;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
	public static int anInt2954;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
	public static int anInt2948 = -1;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1732 = Static107.method1838("au");

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1733 = Static107.method1838("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1737 = Static107.method1838("Loading interfaces )2 ");

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1734 = aClass28_1737;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
	public static int[] anIntArray270 = new int[32];

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1735 = Static107.method1838("(Y");

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1736 = aClass28_1733;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt2950 = 0;

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1738 = Static107.method1838(")3");

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1739 = Static107.method1838("mn");

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1740 = Static107.method1838("Einloggen");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!fb;")
	public static Class2_Sub4_Sub9 method2032(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub9 local10 = (Class2_Sub4_Sub9) Static146.aClass14_165.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static180.aClass40_42.method1771(4, arg0);
		local10 = new Class2_Sub4_Sub9();
		if (local22 != null) {
			local10.method942(arg0, new Class2_Sub2(local22));
		}
		Static146.aClass14_165.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBII)I")
	public static int method2033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return (local13 * (arg2 & 0xFF00FF) + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + (local13 * (arg2 & 0xFF00) + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method2035() {
		aByteArrayArray6 = null;
		aClass28_1737 = null;
		aClass28_1732 = null;
		aClass28_1736 = null;
		aClass28_1734 = null;
		aClass2_Sub4_Sub3_Sub4Array10 = null;
		aClass28_1735 = null;
		anIntArray270 = null;
		aClass28_1739 = null;
		aClass28_1733 = null;
		aClass28_1738 = null;
		aClass28_1740 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	public static void method2036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg3 * (arg3 - 32) / arg2;
		if (local7 < 8) {
			local7 = 8;
		}
		Static174.aClass2_Sub4_Sub3_Sub3Array11[0].method2242(arg4, arg1);
		@Pc(36) int local36 = (arg3 - local7 - 32) * arg0 / (arg2 - arg3);
		Static174.aClass2_Sub4_Sub3_Sub3Array11[1].method2242(arg4, arg3 + arg1 - 16);
		Static161.method2809(arg4, arg1 + 16, 16, arg3 - 32, Static38.anInt1026);
		Static161.method2809(arg4, local36 + arg1 + 16, 16, local7, Static114.anInt2753);
		Static161.method2793(arg4, arg1 + local36 + 16, local7, Static13.anInt593);
		Static161.method2793(arg4 + 1, arg1 - (-16 - local36), local7, Static13.anInt593);
		Static161.method2797(arg4, arg1 + local36 + 16, 16, Static13.anInt593);
		Static161.method2797(arg4, arg1 + local36 + 17, 16, Static13.anInt593);
		Static161.method2793(arg4 + 15, arg1 + 16 + local36, local7, Static105.anInt2600);
		Static161.method2793(arg4 + 14, local36 + 17 + arg1, local7 - 1, Static105.anInt2600);
		Static161.method2797(arg4, local7 + local36 + arg1 + 15, 16, Static105.anInt2600);
		Static161.method2797(arg4 + 1, arg1 + 14 + local36 + local7, 15, Static105.anInt2600);
	}
}
