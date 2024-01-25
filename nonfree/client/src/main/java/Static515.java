import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_112 = new Class173(68, 2);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
	public static boolean aBoolean641 = true;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
	public static boolean aBoolean642 = false;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_201 = new Class362(110, -2);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBIII)V")
	public static void method7517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		@Pc(31) int local31 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0 + arg2);
		@Pc(40) int local40 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0 - arg2);
		Static306.method5239(Static46.anIntArrayArray4[arg1], local31, arg3, local40);
		while (local17 > local15) {
			local22 += 2;
			local20 += local22;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(97) int local97;
			@Pc(106) int local106;
			if (local20 > 0) {
				local17--;
				local20 -= local17 << 1;
				local71 = arg1 - local17;
				local75 = local17 + arg1;
				if (local75 >= Static290.anInt5903 && local71 <= Static530.anInt9437) {
					local97 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local15 + arg0);
					local106 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0 - local15);
					if (Static530.anInt9437 >= local75) {
						Static306.method5239(Static46.anIntArrayArray4[local75], local97, arg3, local106);
					}
					if (Static290.anInt5903 <= local71) {
						Static306.method5239(Static46.anIntArrayArray4[local71], local97, arg3, local106);
					}
				}
			}
			local15++;
			local71 = arg1 - local15;
			local75 = arg1 + local15;
			if (Static290.anInt5903 <= local75 && local71 <= Static530.anInt9437) {
				local97 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local17 + arg0);
				local106 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg0 - local17);
				if (local75 <= Static530.anInt9437) {
					Static306.method5239(Static46.anIntArrayArray4[local75], local97, arg3, local106);
				}
				if (Static290.anInt5903 <= local71) {
					Static306.method5239(Static46.anIntArrayArray4[local71], local97, arg3, local106);
				}
			}
		}
	}
}
