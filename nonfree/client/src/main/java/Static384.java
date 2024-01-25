import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!qq;")
	public static Class276 aClass276_4;

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
	public static int anInt7275;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)I")
	public static int method6192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= arg2) {
			return arg2 <= arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	public static void method6193(@OriginalArg(1) int arg0) {
		if (Static348.aClass6_Sub22_19.aClass15_Sub7_1.method1752() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static495.anInt8594) {
			return;
		}
		if (arg0 != -1) {
			@Pc(27) Class351 local27 = Static131.aClass74_1.method1972(arg0);
			@Pc(31) Class98 local31 = local27.method8358();
			if (local31 == null) {
				arg0 = -1;
			} else {
				Static529.aClass112_6.method3234(Static271.aCanvas6, local31.method2406(), local31.method2398(), new Point(local27.anInt9910, local27.anInt9903), local31.method2397());
				Static495.anInt8594 = arg0;
			}
		}
		if (arg0 == -1 && Static495.anInt8594 != -1) {
			Static529.aClass112_6.method3234(Static271.aCanvas6, (int[]) null, -1, new Point(), -1);
			Static495.anInt8594 = -1;
		}
	}
}
