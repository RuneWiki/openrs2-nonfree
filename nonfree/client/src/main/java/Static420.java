import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V")
	public static void method6569() {
		if (Static141.aClass96_23 != null) {
			Static113.aClass282_1 = new Class282();
			Static113.aClass282_1.method6819(Static17.aLong7, Static141.aClass96_23.anInt2835, Static141.aClass96_23, Static141.aClass96_23.aClass364_1.method8334(Static154.anInt3181));
			Static313.aThread4 = new Thread(Static113.aClass282_1, "");
			Static313.aThread4.start();
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(III)Z")
	public static boolean method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static92.method2101(arg0, arg1) & Static112.method2453(arg1, arg0);
	}
}
