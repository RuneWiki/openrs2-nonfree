import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!ga;")
	public static Class29 aClass29_22;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1742 = Static80.method1463("Please try again)3");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1746 = Static80.method1463("Attack");

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1743 = aClass63_1746;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1744 = Static80.method1463("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1745 = Static80.method1463("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	public static int[] anIntArray359 = new int[128];

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1747 = Static80.method1463("sideicons");

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1748 = aClass63_1742;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1749 = Static80.method1463(" @whi@(X");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZII)I")
	public static int method2118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg2 & 0xFF00) * local13 + arg0 * (arg1 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local13 + ((arg1 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method2119() {
		aClass63_1749 = null;
		aClass63_1743 = null;
		aClass63_1744 = null;
		aClass29_22 = null;
		aClass63_1748 = null;
		anIntArray359 = null;
		aClass63_1742 = null;
		aClass63_1747 = null;
		aClass63_1746 = null;
		aClass63_1745 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method2120() {
		try {
			@Pc(2) Graphics local2 = Static38.aCanvas1.getGraphics();
			Static6.aClass29_2.method1428(4, 0, local2);
			Static82.aClass29_14.method1428(357, 0, local2);
			Static33.aClass29_6.method1428(4, 722, local2);
			Static5.aClass29_1.method1428(205, 743, local2);
			Static13.aClass29_4.method1428(0, 0, local2);
			Static76.aClass29_13.method1428(4, 516, local2);
			Static38.aClass29_7.method1428(205, 516, local2);
			Static58.aClass29_10.method1428(357, 496, local2);
			Static96.aClass29_20.method1428(338, 0, local2);
		} catch (@Pc(62) Exception local62) {
			Static38.aCanvas1.repaint();
		}
	}
}
