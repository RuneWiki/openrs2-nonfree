import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_103 = new Class256("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
	public static void method4105(@OriginalArg(1) int arg0) {
		if (!Static399.aClass167_Sub1_1.aBoolean490) {
			arg0 = -1;
		}
		if (arg0 == Static111.anInt2289) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class92 local25 = Static164.aClass246_2.method5504(arg0);
			@Pc(29) Class89 local29 = local25.method1851();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static303.aClass131_4.method3062(Static118.aCanvas3, new Point(local25.anInt2511, local25.anInt2509), local29.method1771(), local29.method1763(), local29.method1767());
				Static111.anInt2289 = arg0;
			}
		}
		if (arg0 == -1 && Static111.anInt2289 != -1) {
			Static303.aClass131_4.method3062(Static118.aCanvas3, new Point(), null, -1, -1);
			Static111.anInt2289 = -1;
		}
	}
}
