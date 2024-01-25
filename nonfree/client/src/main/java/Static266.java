import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
	public static int anInt5404;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
	public static int anInt5405;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "Lclient!lf;")
	public static final Class123 aClass123_1 = new Class123();

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
	public static int anInt5402 = -1;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "Lclient!eo;")
	public static final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_151 = new Class34("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_152 = new Class34("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4683(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static191.anInt4095; local11++) {
			if (arg0.equalsIgnoreCase(Static235.aStringArray49[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method4685(@OriginalArg(1) Class216 arg0) {
		Static68.aClass216_22 = arg0;
		Static68.aClass216_22.method5675(35);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
	public static void method4686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static326.anInt2469 < arg4 || arg3 < Static197.anInt4211) {
			return;
		}
		@Pc(34) boolean local34;
		if (Static268.anInt5477 > arg0) {
			arg0 = Static268.anInt5477;
			local34 = false;
		} else if (arg0 <= Static342.anInt3000) {
			local34 = true;
		} else {
			local34 = false;
			arg0 = Static342.anInt3000;
		}
		@Pc(61) boolean local61;
		if (arg1 < Static268.anInt5477) {
			arg1 = Static268.anInt5477;
			local61 = false;
		} else if (Static342.anInt3000 < arg1) {
			arg1 = Static342.anInt3000;
			local61 = false;
		} else {
			local61 = true;
		}
		if (arg4 >= Static197.anInt4211) {
			Static39.method919(arg2, Static344.anIntArrayArray65[arg4++], arg1, arg0);
		} else {
			arg4 = Static197.anInt4211;
		}
		if (Static326.anInt2469 < arg3) {
			arg3 = Static326.anInt2469;
		} else {
			Static39.method919(arg2, Static344.anIntArrayArray65[arg3--], arg1, arg0);
		}
		@Pc(115) int local115;
		if (local34 && local61) {
			for (local115 = arg4; local115 <= arg3; local115++) {
				@Pc(157) int[] local157 = Static344.anIntArrayArray65[local115];
				local157[arg0] = local157[arg1] = arg2;
			}
			return;
		}
		if (local34) {
			for (local115 = arg4; local115 <= arg3; local115++) {
				Static344.anIntArrayArray65[local115][arg0] = arg2;
			}
			return;
		}
		if (local61) {
			for (local115 = arg4; local115 <= arg3; local115++) {
				Static344.anIntArrayArray65[local115][arg1] = arg2;
			}
			return;
		}
	}
}
