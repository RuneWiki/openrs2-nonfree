import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "[I")
	public static final int[] anIntArray65 = new int[32];

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_18 = new Class57("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "Lclient!us;")
	public static final Class234 aClass234_20 = new Class234(79, 0);

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
	public static int anInt702 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg3 && arg1 == arg6 && arg4 == arg2 && arg5 == arg8) {
			Static214.method3325(arg2, arg7, arg6, arg8, arg0);
			return;
		}
		@Pc(38) int local38 = arg0;
		@Pc(40) int local40 = arg6;
		@Pc(44) int local44 = arg0 * 3;
		@Pc(48) int local48 = arg6 * 3;
		@Pc(52) int local52 = arg3 * 3;
		@Pc(56) int local56 = arg1 * 3;
		@Pc(60) int local60 = arg4 * 3;
		@Pc(64) int local64 = arg5 * 3;
		@Pc(74) int local74 = arg2 + local52 - local60 - arg0;
		@Pc(83) int local83 = local56 + arg8 - arg6 - local64;
		@Pc(92) int local92 = local60 + local44 - local52 - local52;
		@Pc(102) int local102 = local64 + local48 - local56 - local56;
		@Pc(107) int local107 = local52 - local44;
		@Pc(112) int local112 = local56 - local48;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local114 * local122 >> 12;
			@Pc(132) int local132 = local74 * local128;
			@Pc(136) int local136 = local83 * local128;
			@Pc(140) int local140 = local92 * local122;
			@Pc(144) int local144 = local102 * local122;
			@Pc(148) int local148 = local107 * local114;
			@Pc(152) int local152 = local112 * local114;
			@Pc(162) int local162 = (local148 + local140 + local132 >> 12) + arg0;
			@Pc(173) int local173 = (local144 + local136 + local152 >> 12) + arg6;
			Static214.method3325(local162, arg7, local40, local173, local38);
			local38 = local162;
			local40 = local173;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method622(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static158.method2450(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!wp;Lclient!b;)V")
	public static void method623(@OriginalArg(1) Interface10 arg0, @OriginalArg(2) Class20 arg1) {
		Static313.anInterface10_8 = arg0;
		Static74.aClass20_18 = arg1;
	}
}
