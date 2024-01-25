import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[Lclient!hw;")
	public static final Class2_Sub17[] aClass2_Sub17Array1 = new Class2_Sub17[2048];

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	public static void method2576(@OriginalArg(0) int arg0) {
		if (!Static434.aClass165_Sub1_1.aBoolean304) {
			arg0 = -1;
		}
		if (arg0 == Static63.anInt6767) {
			return;
		}
		if (arg0 != -1) {
			@Pc(32) Class53 local32 = Static39.aClass73_1.method1450(arg0);
			@Pc(36) Class190 local36 = local32.method1105();
			if (local36 == null) {
				arg0 = -1;
			} else {
				Static138.aClass194_2.method4419(local36.method4240(), Static291.aCanvas6, local36.method4232(), local36.method4234(), new Point(local32.anInt1202, local32.anInt1199));
				Static63.anInt6767 = arg0;
			}
		}
		if (arg0 == -1 && Static63.anInt6767 != -1) {
			Static138.aClass194_2.method4419(-1, Static291.aCanvas6, -1, null, new Point());
			Static63.anInt6767 = -1;
		}
	}
}
