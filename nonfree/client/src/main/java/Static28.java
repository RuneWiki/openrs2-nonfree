import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!f", name = "cc", descriptor = "I")
	public static int anInt2387;

	@OriginalMember(owner = "client!f", name = "Nc", descriptor = "Lclient!g;")
	public static Class28 aClass28_6;

	@OriginalMember(owner = "client!f", name = "Qc", descriptor = "Ljava/awt/Image;")
	public static Image anImage6;

	@OriginalMember(owner = "client!f", name = "Wc", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!f", name = "wb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1527 = Static69.method1153("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!f", name = "Ab", descriptor = "I")
	public static int anInt2362 = -1;

	@OriginalMember(owner = "client!f", name = "bc", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!f", name = "Ac", descriptor = "Ljava/lang/Object;")
	public static Object anObject6 = new Object();

	@OriginalMember(owner = "client!f", name = "Jc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1529 = Static69.method1153("");

	@OriginalMember(owner = "client!f", name = "Rc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1534 = Static69.method1153("Enter your username (V password)3");

	@OriginalMember(owner = "client!f", name = "Kc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1530 = aClass64_1534;

	@OriginalMember(owner = "client!f", name = "Lc", descriptor = "[Lclient!td;")
	public static Class1_Sub1_Sub2_Sub1_Sub2[] aClass1_Sub1_Sub2_Sub1_Sub2Array3 = new Class1_Sub1_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!f", name = "Uc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1536 = Static69.method1153("K");

	@OriginalMember(owner = "client!f", name = "Mc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1531 = aClass64_1536;

	@OriginalMember(owner = "client!f", name = "Oc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1532 = Static69.method1153("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1533 = aClass64_1532;

	@OriginalMember(owner = "client!f", name = "Sc", descriptor = "Lclient!r;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!f", name = "Tc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1535 = aClass64_1536;

	@OriginalMember(owner = "client!f", name = "Vc", descriptor = "[I")
	public static int[] anIntArray356 = new int[256];

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
	public static void method1687() {
		Static110.aClass37_36.method1459();
		Static19.aClass1_Sub1_Sub5_Sub3_3.method1290(0, 0);
		Static8.anIntArray49 = Static112.method1980(Static8.anIntArray49);
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method1690() {
		anImage6 = null;
		aClass1_Sub1_Sub2_Sub1_Sub2Array3 = null;
		aClass64_1530 = null;
		aClass64_1535 = null;
		aClass64_1529 = null;
		anObject6 = null;
		aClass64_1534 = null;
		aClass64_1532 = null;
		anIntArray357 = null;
		aClass64_1531 = null;
		aClass64_1527 = null;
		aClass64_1533 = null;
		aClass64_1536 = null;
		anIntArray356 = null;
		aClass28_6 = null;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
	public static void method1691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static102.anIntArrayArrayArray5[arg1][local7 + arg2][arg0 + local11] = 0;
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static102.anIntArrayArrayArray5[arg1][arg2][local11 + arg0] = Static102.anIntArrayArrayArray5[arg1][arg2 - 1][local11 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static102.anIntArrayArrayArray5[arg1][arg2 + local11][arg0] = Static102.anIntArrayArrayArray5[arg1][arg2 + local11][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static102.anIntArrayArrayArray5[arg1][arg2 - 1][arg0] != 0) {
			Static102.anIntArrayArrayArray5[arg1][arg2][arg0] = Static102.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static102.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != 0) {
			Static102.anIntArrayArrayArray5[arg1][arg2][arg0] = Static102.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static102.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static102.anIntArrayArrayArray5[arg1][arg2][arg0] = Static102.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)I")
	public static int method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 256 - arg2;
		return (local8 * (arg1 & 0xFF00) + (arg0 & 0xFF00) * arg2 & 0xFF0000) + (local8 * (arg1 & 0xFF00FF) + (arg2 * (arg0 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}
}
