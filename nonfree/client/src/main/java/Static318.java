import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	public static int anInt5061;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZIII)V")
	public static void method4264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 * Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291() >> 8;
		if (local8 == 0 || arg0 == -1) {
			return;
		}
		if (!Static446.aBoolean675 && Static489.anInt1781 != -1 && Static334.method4507() && !Static167.method2472()) {
			Static78.aClass2_Sub13_Sub3_1 = Static624.method8352();
			@Pc(41) Class2_Sub13_Sub3 local41 = Static629.method8440(Static78.aClass2_Sub13_Sub3_1);
			Static338.method4548(local41);
		}
		Static565.method7740(arg0, Static428.aClass380_100, local8);
		Static65.method921(255, -1);
		Static446.aBoolean675 = true;
	}
}
