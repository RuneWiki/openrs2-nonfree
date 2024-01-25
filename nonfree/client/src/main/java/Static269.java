import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_149 = new Class88(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
	public static void method4556(@OriginalArg(0) int arg0) {
		if (Static445.anInt8114 == 1) {
			Static393.anInt7424 = arg0;
		} else if (Static445.anInt8114 == 2 || Static445.anInt8114 == 3) {
			Static440.anInt8079 = arg0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method4557() {
		Static203.aClass125_24.method3440();
		Static432.aClass125_59.method3440();
		Static495.aClass125_63.method3440();
		Static145.aClass125_16.method3440();
		Static394.aClass125_53.method3440();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public static void method4559(@OriginalArg(1) int arg0) {
		if (!Static208.aClass12_Sub10_Sub1_1.aBoolean172) {
			arg0 = -1;
		}
		if (Static78.anInt1824 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class284 local25 = Static317.aClass148_1.method3974(arg0);
			@Pc(29) Class40 local29 = local25.method7053();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static375.aClass71_3.method1997(local29.method902(), local29.method892(), local29.method893(), new Point(local25.anInt8585, local25.anInt8581), Static301.aCanvas11);
				Static78.anInt1824 = arg0;
			}
		}
		if (arg0 == -1 && Static78.anInt1824 != -1) {
			Static375.aClass71_3.method1997(-1, -1, null, new Point(), Static301.aCanvas11);
			Static78.anInt1824 = -1;
		}
	}
}
