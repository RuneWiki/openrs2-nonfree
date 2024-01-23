import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static294 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!nc;")
	public static Class118 aClass118_8;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt5838 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	public static int[] anIntArray687 = new int[2048];

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
	public static boolean aBoolean443 = true;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString191 = "flash3:";

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
	public static boolean aBoolean445 = true;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public static int anInt5843 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!rf;III)V")
	public static void method4500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static250.method3901(arg2.anInt4562, arg5, arg0, arg4, arg2.anInt4569, arg1, arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!og;)I")
	public static int method4502(@OriginalArg(0) int arg0, @OriginalArg(2) Class127 arg1) {
		if (!Static43.method794(arg1).method4350(arg0) && arg1.anObjectArray26 == null) {
			return -1;
		} else if (arg1.anIntArray414 == null || arg1.anIntArray414.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray414[arg0];
		}
	}
}
