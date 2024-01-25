import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
	public static int anInt1545;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!cr", name = "cb", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "(I)V")
	public static void method1405() {
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) Static536.aClass71_67.method2089(); local15 != null; local15 = (Class3_Sub8) Static536.aClass71_67.method2086()) {
			if (local15.anInt801 > 0) {
				local15.anInt801--;
			}
			if (local15.anInt801 != 0) {
				if (local15.anInt798 > 0) {
					local15.anInt798--;
				}
				if (local15.anInt798 == 0 && local15.anInt789 >= 1 && local15.anInt791 >= 1 && local15.anInt789 <= Static118.anInt2527 - 2 && local15.anInt791 <= Static549.anInt9482 - 2 && (local15.anInt792 < 0 || Static245.method4227(local15.anInt800, local15.anInt792))) {
					Static185.method3504(local15.anInt792, local15.anInt791, local15.anInt796, local15.anInt799, local15.anInt795, local15.anInt789, local15.anInt800, -1);
					local15.anInt798 = -1;
					if (local15.anInt792 == local15.anInt790 && local15.anInt790 == -1) {
						local15.method7820();
					} else if (local15.anInt790 == local15.anInt792 && local15.anInt799 == local15.anInt787 && local15.anInt793 == local15.anInt800) {
						local15.method7820();
					}
				}
			} else if (local15.anInt790 < 0 || Static245.method4227(local15.anInt793, local15.anInt790)) {
				Static185.method3504(local15.anInt790, local15.anInt791, local15.anInt796, local15.anInt787, local15.anInt795, local15.anInt789, local15.anInt793, -1);
				local15.method7820();
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(Z)V")
	public static void method1406() {
		Static364.aClass101_1.method2590();
		Static35.aClass54_1.method4065();
		Static317.aClient1.method1264();
		Static549.aCanvas15.setBackground(Color.black);
		Static435.anInt7970 = -1;
		Static364.aClass101_1 = Static87.method1777(Static549.aCanvas15);
		Static35.aClass54_1 = Static270.method4699(Static549.aCanvas15);
	}
}
