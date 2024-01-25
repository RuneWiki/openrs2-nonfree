import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public static int anInt1985 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
	public static boolean method1774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
	public static void method1775(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static447.method6655();
		Static94.method1391();
		Static552.method7995();
		Static632.method8846(arg1, arg0, arg2);
		Static75.method1188();
		Static471.method6859(Static457.aClass57_11);
		Static320.method4881(Static457.aClass57_11);
		Static293.method4357(Static345.aClass208_78, Static457.aClass57_11);
		Static203.method2914();
		Static332.method5053(Static575.aClass134Array15);
		Static437.method6493();
		Static310.method4717();
		if (Static107.anInt1746 == 3) {
			Static21.method316(4);
		} else if (Static107.anInt1746 == 7) {
			Static21.method316(8);
		} else if (Static107.anInt1746 == 10) {
			Static21.method316(11);
		} else if (Static107.anInt1746 == 1 || Static107.anInt1746 == 2) {
			Static85.method1305();
		}
	}
}
