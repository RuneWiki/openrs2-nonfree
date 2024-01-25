import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!n;")
	public static Class198 aClass198_15;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!tq;")
	public static Class285 aClass285_16;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "F")
	public static float aFloat261;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	public static int[] anIntArray759;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_145 = new Class67("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int anInt9034 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FZII[FFIIFIIII)V")
	public static void method7406(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg10 - arg1;
		@Pc(9) int local9 = arg6 - arg9;
		@Pc(13) int local13 = arg8 - arg11;
		@Pc(38) float local38 = (float) local13 * arg3[0] + arg3[1] * (float) local5 + arg3[2] * (float) local9;
		@Pc(59) float local59 = (float) local9 * arg3[5] + arg3[3] * (float) local13 + (float) local5 * arg3[4];
		@Pc(80) float local80 = arg3[8] * (float) local9 + arg3[7] * (float) local5 + arg3[6] * (float) local13;
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg5 == 0) {
			local96 = local38 + arg4 + 0.5F;
			local103 = arg7 + 0.5F - local80;
		} else if (arg5 == 1) {
			local103 = arg7 + local80 + 0.5F;
			local96 = local38 + arg4 + 0.5F;
		} else if (arg5 == 2) {
			local96 = arg4 + 0.5F - local38;
			local103 = arg0 + 0.5F - local59;
		} else if (arg5 == 3) {
			local103 = arg0 + 0.5F - local59;
			local96 = local38 + arg4 + 0.5F;
		} else if (arg5 == 4) {
			local103 = arg0 + 0.5F - local59;
			local96 = local80 + arg7 + 0.5F;
		} else {
			local96 = arg7 + 0.5F - local80;
			local103 = arg0 + 0.5F - local59;
		}
		@Pc(214) float local214;
		if (arg2 == 1) {
			local214 = local96;
			local96 = -local103;
			local103 = local214;
		} else if (arg2 == 2) {
			local96 = -local96;
			local103 = -local103;
		} else if (arg2 == 3) {
			local214 = local96;
			local96 = local103;
			local103 = -local214;
		}
		Static263.aFloat167 = local103;
		Static426.aFloat235 = local96;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method7408() {
		Static485.aBoolean644 = true;
	}
}
