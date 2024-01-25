import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_66 = new Class57("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_67 = new Class57("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static248.method4058(arg0);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg0 - arg3;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg0;
		@Pc(29) int local29 = -arg0;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static325.anIntArrayArray50[arg4];
		@Pc(47) int local47 = arg2 - local17;
		Static349.method5265(arg2 - arg0, local47, arg5, local42);
		@Pc(60) int local60 = local17 + arg2;
		Static349.method5265(local47, local60, arg1, local42);
		Static349.method5265(local60, arg2 + arg0, arg5, local42);
		while (local26 > local12) {
			local36 += 2;
			local38 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				Static318.anIntArray214[local31] = local12;
				local31--;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(183) int local183;
			@Pc(187) int local187;
			@Pc(191) int local191;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local17 <= local26) {
					local128 = Static325.anIntArrayArray50[arg4 + local26];
					local135 = Static325.anIntArrayArray50[arg4 - local26];
					local139 = arg2 + local12;
					local144 = arg2 - local12;
					Static349.method5265(local144, local139, arg5, local128);
					Static349.method5265(local144, local139, arg5, local135);
				} else {
					local128 = Static325.anIntArrayArray50[local26 + arg4];
					local135 = Static325.anIntArrayArray50[arg4 - local26];
					local139 = Static318.anIntArray214[local26];
					local144 = local12 + arg2;
					local183 = arg2 - local12;
					local187 = arg2 + local139;
					local191 = arg2 - local139;
					Static349.method5265(local183, local191, arg5, local128);
					Static349.method5265(local191, local187, arg1, local128);
					Static349.method5265(local187, local144, arg5, local128);
					Static349.method5265(local183, local191, arg5, local135);
					Static349.method5265(local191, local187, arg1, local135);
					Static349.method5265(local187, local144, arg5, local135);
				}
			}
			local128 = Static325.anIntArrayArray50[arg4 + local12];
			local135 = Static325.anIntArrayArray50[arg4 - local12];
			local139 = arg2 + local26;
			local144 = arg2 - local26;
			if (local17 > local12) {
				local183 = local12 > local31 ? Static318.anIntArray214[local12] : local31;
				local187 = arg2 + local183;
				local191 = arg2 - local183;
				Static349.method5265(local144, local191, arg5, local128);
				Static349.method5265(local191, local187, arg1, local128);
				Static349.method5265(local187, local139, arg5, local128);
				Static349.method5265(local144, local191, arg5, local135);
				Static349.method5265(local191, local187, arg1, local135);
				Static349.method5265(local187, local139, arg5, local135);
			} else {
				Static349.method5265(local144, local139, arg5, local128);
				Static349.method5265(local144, local139, arg5, local135);
			}
		}
	}
}
