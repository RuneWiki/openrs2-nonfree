import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hr", name = "K", descriptor = "Lclient!fea;")
	public static final Class104 aClass104_7 = new Class104("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method3295(@OriginalArg(0) int arg0) {
		if (Static96.aClass6_Sub22_7.aClass29_Sub1_1.method679() == 0) {
			arg0 = -1;
		}
		if (Static390.anInt6561 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class341 local26 = Static204.aClass350_1.method8189(arg0);
			@Pc(30) Class112 local30 = local26.method8051();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static569.aClass380_6.method8818(local30.method2324(), Static140.aCanvas1, local30.method2319(), local30.method2322(), new Point(local26.anInt9560, local26.anInt9557));
				Static390.anInt6561 = arg0;
			}
		}
		if (arg0 == -1 && Static390.anInt6561 != -1) {
			Static569.aClass380_6.method8818((int[]) null, Static140.aCanvas1, -1, -1, new Point());
			Static390.anInt6561 = -1;
		}
	}
}
