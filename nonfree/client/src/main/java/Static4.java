import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ff;")
	public static Class26 aClass26_23;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_17;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt2609 = 0;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!r;")
	private static Class61 aClass61_783 = Static129.method2060("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_780 = aClass61_783;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_781 = Static129.method2060("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!i;")
	public static Class34 aClass34_2 = new Class34();

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_10 = null;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public static int anInt2613 = 0;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!r;")
	private static Class61 aClass61_782 = Static129.method2060("Loaded title screen");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!r;")
	private static Class61 aClass61_785 = Static129.method2060("You have only just left another world)3");

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_784 = aClass61_785;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_786 = aClass61_782;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static1.aClass5_Sub14_Sub1_1.method1489(81);
		Static1.aClass5_Sub14_Sub1_1.method1457(arg0);
		Static1.aClass5_Sub14_Sub1_1.method1481(arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ff;BLclient!bf;Lclient!ff;Lclient!ff;)Z")
	public static boolean method1684(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class5_Sub5_Sub1 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		Static132.aClass26_33 = arg3;
		Static83.aClass26_19 = arg2;
		Static111.aClass5_Sub5_Sub1_2 = arg1;
		Static62.aClass26_9 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method1685() {
		aClass5_Sub11_10 = null;
		aClass61_781 = null;
		aClass61_782 = null;
		aClass61_783 = null;
		aClass26_23 = null;
		aClass61_780 = null;
		aClass61_785 = null;
		aClass34_2 = null;
		aShortArrayArray4 = null;
		aClass61_784 = null;
		aClass26_Sub1_17 = null;
		aClass61_786 = null;
		aCanvas2 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method1687(@OriginalArg(1) Class5_Sub5 arg0) {
		if (arg0.aClass5_Sub21_5 != null) {
			arg0.aClass5_Sub21_5.anInt2644 = 0;
		}
		arg0.aBoolean82 = false;
		for (@Pc(18) Class5_Sub5 local18 = arg0.method1558(); local18 != null; local18 = arg0.method1560()) {
			method1687(local18);
		}
	}
}
