import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "Lclient!wa;")
	public static Class87 aClass87_5;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!ai;")
	public static Class6 aClass6_494 = Static38.method685("Spieler");

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "[I")
	public static int[] anIntArray110 = new int[200];

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "Lclient!ai;")
	public static Class6 aClass6_495 = Static38.method685("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public static int anInt1691 = 0;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_496 = Static38.method685("::noclip");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!wa;I)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) int arg2) {
		if (Static88.aClass87_6 != null || Static160.aBoolean24 || (arg1 == null || Static104.method1727(arg1) == null)) {
			return;
		}
		Static88.aClass87_6 = arg1;
		Static10.aClass87_3 = Static104.method1727(arg1);
		Static140.anInt3275 = 0;
		Static163.aBoolean152 = false;
		Static97.anInt2406 = arg2;
		Static96.anInt2395 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method1077() {
		anIntArray110 = null;
		aClass6_494 = null;
		aClass6_496 = null;
		aClass87_5 = null;
		aClass6_495 = null;
		anIntArray114 = null;
	}
}
