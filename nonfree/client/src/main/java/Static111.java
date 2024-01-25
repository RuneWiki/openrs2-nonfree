import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[[Lclient!uf;")
	public static Class357[][] aClass357ArrayArray1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static349.method6046(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(29) int local29 = -arg3;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static186.anIntArrayArray12[arg5];
		@Pc(47) int local47 = arg0 - local15;
		Static567.method8614(arg0 - arg3, local47, local42, arg2);
		@Pc(60) int local60 = local15 + arg0;
		Static567.method8614(local47, local60, local42, arg1);
		Static567.method8614(local60, arg3 + arg0, local42, arg2);
		while (local21 > local10) {
			local38 += 2;
			local36 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static149.anIntArray156[local31] = local10;
				local31--;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(132) int[] local132;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(182) int local182;
			@Pc(186) int local186;
			@Pc(190) int local190;
			if (local29 >= 0) {
				local21--;
				local29 -= local21 << 1;
				if (local15 <= local21) {
					local125 = Static186.anIntArrayArray12[local21 + arg5];
					local132 = Static186.anIntArrayArray12[arg5 - local21];
					local137 = arg0 + local10;
					local142 = arg0 - local10;
					Static567.method8614(local142, local137, local125, arg2);
					Static567.method8614(local142, local137, local132, arg2);
				} else {
					local125 = Static186.anIntArrayArray12[local21 + arg5];
					local132 = Static186.anIntArrayArray12[arg5 - local21];
					local137 = Static149.anIntArray156[local21];
					local142 = arg0 + local10;
					local182 = arg0 - local10;
					local186 = local137 + arg0;
					local190 = arg0 - local137;
					Static567.method8614(local182, local190, local125, arg2);
					Static567.method8614(local190, local186, local125, arg1);
					Static567.method8614(local186, local142, local125, arg2);
					Static567.method8614(local182, local190, local132, arg2);
					Static567.method8614(local190, local186, local132, arg1);
					Static567.method8614(local186, local142, local132, arg2);
				}
			}
			local125 = Static186.anIntArrayArray12[local10 + arg5];
			local132 = Static186.anIntArrayArray12[arg5 - local10];
			local137 = local21 + arg0;
			local142 = arg0 - local21;
			if (local15 <= local10) {
				Static567.method8614(local142, local137, local125, arg2);
				Static567.method8614(local142, local137, local132, arg2);
			} else {
				local182 = local10 > local31 ? Static149.anIntArray156[local10] : local31;
				local186 = arg0 + local182;
				local190 = arg0 - local182;
				Static567.method8614(local142, local190, local125, arg2);
				Static567.method8614(local190, local186, local125, arg1);
				Static567.method8614(local186, local137, local125, arg2);
				Static567.method8614(local142, local190, local132, arg2);
				Static567.method8614(local190, local186, local132, arg1);
				Static567.method8614(local186, local137, local132, arg2);
			}
		}
	}
}
