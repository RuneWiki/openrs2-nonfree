import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_7;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public static int anInt490;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!pc;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt487 = 127;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
	public static int[] anIntArray20 = new int[5];

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public static final int anInt496 = 4;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[[Lclient!uh;")
	public static Class85[][] aClass85ArrayArray1 = new Class85[anInt496][500];

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_161 = Static120.method2057("hint_mapmarkers");

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_162 = Static120.method2057(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_163 = Static120.method2057("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "[I")
	public static int[] anIntArray21 = new int[anInt496];

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "[I")
	public static int[] anIntArray22 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
	public static int method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + (arg2 >> 5 << 7) + (arg1 >> 2 << 10);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method395() {
		Static157.aClass5_11 = new Class5(32);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public static void method396() {
		aClass81_162 = null;
		anIntArray22 = null;
		aClass67_1 = null;
		anIntArrayArrayArray1 = null;
		aClass85ArrayArray1 = null;
		aClass81_161 = null;
		anIntArray20 = null;
		aClass82_Sub1_7 = null;
		anIntArray21 = null;
		aClass81_163 = null;
	}
}
