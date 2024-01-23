import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!kl", name = "yc", descriptor = "Lclient!nm;")
	public static Class119 aClass119_58;

	@OriginalMember(owner = "client!kl", name = "Nc", descriptor = "I")
	public static int anInt3019;

	@OriginalMember(owner = "client!kl", name = "Tc", descriptor = "I")
	public static int anInt3023;

	@OriginalMember(owner = "client!kl", name = "Uc", descriptor = "I")
	public static int anInt3024;

	@OriginalMember(owner = "client!kl", name = "nc", descriptor = "[I")
	public static int[] anIntArray257 = new int[1000];

	@OriginalMember(owner = "client!kl", name = "oc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19 = new String[500];

	@OriginalMember(owner = "client!kl", name = "Bc", descriptor = "Lclient!ui;")
	public static Class175 aClass175_26 = new Class175(64);

	@OriginalMember(owner = "client!kl", name = "Ec", descriptor = "I")
	public static int anInt3010 = 0;

	@OriginalMember(owner = "client!kl", name = "Vc", descriptor = "Ljava/lang/String;")
	public static String aString100 = "Loaded sprites";

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(BI)V")
	public static void method2580(@OriginalArg(1) int arg0) {
		Static241.anInt4470--;
		if (arg0 == Static241.anInt4470) {
			return;
		}
		Static317.method1048(aStringArray19, arg0 + 1, aStringArray19, arg0, Static241.anInt4470 - arg0);
		Static317.method1048(Static246.aStringArray28, arg0 + 1, Static246.aStringArray28, arg0, Static241.anInt4470 - arg0);
		Static317.method1046(Static4.anIntArray16, arg0 + 1, Static4.anIntArray16, arg0, Static241.anInt4470 - arg0);
		Static317.method1045(Static94.aShortArray46, arg0 + 1, Static94.aShortArray46, arg0, Static241.anInt4470 - arg0);
		Static317.method1050(Static66.aLongArray5, arg0 + 1, Static66.aLongArray5, arg0, Static241.anInt4470 - arg0);
		Static317.method1046(Static266.anIntArray551, arg0 + 1, Static266.anIntArray551, arg0, Static241.anInt4470 - arg0);
		Static317.method1046(Static195.anIntArray409, arg0 + 1, Static195.anIntArray409, arg0, Static241.anInt4470 - arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBII)V")
	public static void method2585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static116.aClass1_Sub13_Sub1_48.method1887(1);
			Static116.aClass1_Sub13_Sub1_48.method1822(5);
		}
		if (arg2 == 1) {
			Static116.aClass1_Sub13_Sub1_48.method1887(105);
			Static116.aClass1_Sub13_Sub1_48.method1822(19);
		}
		Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
		Static116.aClass1_Sub13_Sub1_48.method1818(Static38.anInt714 + arg0);
		Static116.aClass1_Sub13_Sub1_48.method1835(arg1 + Static135.anInt2659);
		Static24.anInt490 = arg0;
		Static261.anInt4835 = arg1;
	}
}
