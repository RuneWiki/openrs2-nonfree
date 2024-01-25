import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!gm;")
	public static final Class91 aClass91_1 = Static414.method5818();

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	public static int anInt4370 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method3671(@OriginalArg(1) int arg0) {
		if (!Static291.aClass28_Sub1_1.aBoolean81) {
			arg0 = -1;
		}
		if (arg0 == Static403.anInt7240) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class126 local20 = Static71.aClass83_1.method2097(arg0);
			@Pc(26) Class194 local26 = local20.method2980();
			if (local26 == null) {
				arg0 = -1;
			} else {
				Static45.aClass209_127.method4684(local26.method4489(), local26.method4490(), Static280.aCanvas3, local26.method4497(), new Point(local20.anInt3607, local20.anInt3605));
				Static403.anInt7240 = arg0;
			}
		}
		if (arg0 == -1 && Static403.anInt7240 != -1) {
			Static45.aClass209_127.method4684(-1, null, Static280.aCanvas3, -1, new Point());
			Static403.anInt7240 = -1;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
	public static int method3676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static133.anIntArray473[arg0 & 0x3] : Static54.anIntArray89[arg0 & 0x3];
	}
}
