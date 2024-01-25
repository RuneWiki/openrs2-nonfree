import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Lclient!mm;")
	public static Class240 aClass240_3;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "I")
	public static int anInt4342;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!rv;)V")
	public static void method3982(@OriginalArg(1) Class5_Sub36_Sub2 arg0) {
		arg0.method7287(Static137.aClass126_79.method3070());
		arg0.method7287(Static38.aClass126_26.method3070());
		arg0.method7287(Static455.aClass126_208.method3070());
		arg0.method7287(Static264.aClass126_126.method3070());
		arg0.method7287(Static543.aClass126_247.method3070());
		arg0.method7287(Static495.aClass126_12.method3070());
		arg0.method7287(Static336.aClass126_156.method3070());
		arg0.method7287(Static570.aClass126_258.method3070());
		arg0.method7287(Static27.aClass126_18.method3070());
		arg0.method7287(Static358.aClass126_165.method3070());
		arg0.method7287(Static673.aClass126_298.method3070());
		arg0.method7287(Static446.aClass126_207.method3070());
		arg0.method7287(Static230.aClass126_115.method3070());
		arg0.method7287(Static600.aClass126_275.method3070());
		arg0.method7287(Static612.aClass126_279.method3070());
		arg0.method7287(Static535.aClass126_240.method3070());
		arg0.method7287(Static92.aClass126_274.method3070());
		arg0.method7287(Static647.aClass126_291.method3070());
		arg0.method7287(Static623.aClass126_283.method3070());
		arg0.method7287(Static554.aClass126_253.method3070());
		arg0.method7287(Static279.aClass126_136.method3070());
		arg0.method7287(Static52.aClass126_40.method3070());
		arg0.method7287(Static176.aClass126_96.method3070());
		arg0.method7287(Static460.aClass126_211.method3070());
		arg0.method7287(Static116.aClass126_248.method3070());
		arg0.method7287(Static481.aClass126_223.method3070());
		arg0.method7287(Static305.aClass126_149.method3070());
		arg0.method7287(Static35.aClass126_20.method3070());
		arg0.method7287(Static583.aClass126_265.method3070());
		arg0.method7287(Static618.aClass126_284.method3070());
		arg0.method7287(Static471.aClass126_218.method3070());
		arg0.method7287(Static63.aClass126_44.method3070());
		arg0.method7287(Static24.method380());
		arg0.method7287(Static640.method8831());
		arg0.method7287(Static609.aClass126_198.method3070());
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
	public static boolean method3983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static45.method787(arg1, arg0) || Static226.method3581(arg0, arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BB)V")
	public static void method3984(@OriginalArg(0) byte arg0) {
		if (Static524.aByteArrayArrayArray22 == null) {
			Static524.aByteArrayArrayArray22 = new byte[4][Static271.anInt4910][Static613.anInt9909];
		}
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static271.anInt4910; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static613.anInt9909; local31++) {
					Static524.aByteArrayArrayArray22[local23][local27][local31] = arg0;
				}
			}
		}
	}
}
