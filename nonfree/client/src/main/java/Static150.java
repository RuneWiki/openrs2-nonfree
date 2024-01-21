import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array20;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1548 = Static51.method932("(U0a )2 via: ");

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1549 = Static51.method932("<col=ff9040>");

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1550 = Static51.method932("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "[I")
	public static int[] anIntArray380 = new int[2000];

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)I")
	public static int method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static50.aByteArrayArrayArray3[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static50.aByteArrayArrayArray3[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method2545() {
		aClass10_1550 = null;
		anIntArray380 = null;
		aClass2_Sub1_Sub4_Sub3Array20 = null;
		aClass10_1549 = null;
		anIntArray379 = null;
		aClass10_1548 = null;
	}
}
