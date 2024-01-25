import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	public static boolean method2610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)V")
	public static void method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static300.method7412();
		Static75.aLong49 = 0L;
		@Pc(17) int local17 = Static368.method5566();
		if (arg2 == 3 || local17 == 3) {
			arg3 = true;
		}
		if (!Static202.aClass75_5.method6704()) {
			arg3 = true;
		}
		Static7.method92(local17, arg3, arg0, arg1, arg2);
	}
}
