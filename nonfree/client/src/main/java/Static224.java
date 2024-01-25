import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!fg;")
	public static Class108 aClass108_4;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method3106(@OriginalArg(1) int arg0) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub14_1.method4184() == 0) {
			arg0 = -1;
		}
		if (Static40.anInt800 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class234 local26 = Static537.aClass308_2.method6908(arg0);
			@Pc(30) Class329 local30 = local26.method5056();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static452.aClass226_6.method4851(new Point(local26.anInt5899, local26.anInt5898), local30.method7418(), local30.method7419(), local30.method7416(), Static504.aCanvas11);
				Static40.anInt800 = arg0;
			}
		}
		if (arg0 == -1 && Static40.anInt800 != -1) {
			Static452.aClass226_6.method4851(new Point(), null, -1, -1, Static504.aCanvas11);
			Static40.anInt800 = -1;
		}
	}
}
