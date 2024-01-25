import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	public static int anInt9242 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ha;IIIBI)V")
	public static void method7864(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg1.method8164(-10660793, arg2, arg3, arg0, arg4);
		arg1.method8164(-16777216, 16, arg3 + 1, arg0 + -2, arg4 + 1);
		arg1.method8155(arg2 - 19, arg0 + -2, arg3 + 1, arg4 + 18, -16777216);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	public static void method7865(@OriginalArg(0) boolean arg0) {
		if (Static143.aString27.length() == 0) {
			return;
		}
		Static575.method7997("--> " + Static143.aString27);
		Static443.method6362(Static143.aString27, false, arg0);
		Static545.anInt8786 = 0;
		Static230.anInt4239 = 0;
		Static143.aString27 = "";
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V")
	public static void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class299 local9 = Static403.aClass299ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static606.anInt10276 = local9.anInt7882;
			Static519.anInt8384 = local9.anInt7883;
			Static95.anInt2274 = local9.anInt7877;
		}
		Static83.method1791();
	}
}
