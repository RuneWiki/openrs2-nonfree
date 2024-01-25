import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wk", name = "Hb", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet4;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public static void method6312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class125 local28 = Static580.aClass125ArrayArrayArray3[local9][arg0][arg1] = Static580.aClass125ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte34--;
				for (@Pc(40) Class302 local40 = local28.aClass302_1; local40 != null; local40 = local40.aClass302_2) {
					@Pc(44) Class2_Sub2 local44 = local40.aClass2_Sub2_1;
					if (local44.aShort120 == arg0 && local44.aShort122 == arg1) {
						local44.aByte103--;
					}
				}
			}
		}
		if (Static580.aClass125ArrayArrayArray3[0][arg0][arg1] == null) {
			Static580.aClass125ArrayArrayArray3[0][arg0][arg1] = new Class125(0, arg0, arg1);
			Static580.aClass125ArrayArrayArray3[0][arg0][arg1].aByte36 = 1;
		}
		Static580.aClass125ArrayArrayArray3[0][arg0][arg1].aClass125_1 = local7;
		Static580.aClass125ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
